package org.raninline;

import java.util.Optional;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.EnumDeclaration;
import com.github.javaparser.ast.body.Parameter;
import com.github.javaparser.ast.comments.Comment;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.LambdaExpr;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.expr.ObjectCreationExpr;
import com.github.javaparser.ast.expr.VariableDeclarationExpr;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.ast.stmt.ExpressionStmt;
import com.github.javaparser.ast.stmt.ForEachStmt;
import com.github.javaparser.ast.stmt.ForStmt;
import com.github.javaparser.ast.stmt.IfStmt;
import com.github.javaparser.ast.stmt.Statement;
import com.github.javaparser.ast.stmt.WhileStmt;
import com.github.javaparser.ast.type.ClassOrInterfaceType;
import com.github.javaparser.ast.visitor.ModifierVisitor;
import com.github.javaparser.ast.visitor.Visitable;

public class LogLocalVariable extends ModifierVisitor<Context> {
    @Override
    public Visitable visit(final ClassOrInterfaceDeclaration n, final Context ctx) {
        String oldClassName = ctx.className;
        ctx.className = n.getNameAsString();
        Visitable ret = super.visit(n, ctx);
        ctx.className = oldClassName;
        return ret;
    }

    @Override
    public Visitable visit(final EnumDeclaration n, final Context ctx) {
        String oldClassName = ctx.className;
        ctx.className = n.getNameAsString();
        Visitable ret = super.visit(n, ctx);
        ctx.className = oldClassName;
        return ret;
    }

    @Override
    public Visitable visit(final IfStmt n, final Context ctx) {
        Expression condition = (Expression) n.getCondition().accept(this, ctx);

        // if the then statement is not a block statement, wrap it with a block
        // statement
        if (!(n.getThenStmt() instanceof BlockStmt)) {
            Statement thenStmt = (Statement) n.getThenStmt();
            BlockStmt blockStmt = new BlockStmt();
            n.setThenStmt(blockStmt);
            blockStmt.addStatement(thenStmt);
        }
        Statement thenStmt = (Statement) n.getThenStmt().accept(this, ctx);

        if (n.getElseStmt().isPresent() && !(n.getElseStmt().get() instanceof BlockStmt)) {
            Statement elseStmt = (Statement) n.getElseStmt().get();
            BlockStmt blockStmt = new BlockStmt();
            n.setElseStmt(blockStmt);
            blockStmt.addStatement(elseStmt);
        }
        Statement elseStmt = n.getElseStmt().map(s -> (Statement) s.accept(this, ctx)).orElse(null);
        if (elseStmt == null) {
            elseStmt = new BlockStmt();
            n.setElseStmt(elseStmt);
        }

        Comment comment = n.getComment().map(s -> (Comment) s.accept(this, ctx)).orElse(null);
        if (condition == null || thenStmt == null)
            return null;

        ctx.isCondition = true;
        if (Utils.isTargetStmt(n.getCondition(), ctx)) {
            findVariables(n.getCondition(), ctx);
            Statement logIfStmt = buildPromptStatement(Constant.TARGET_STMT_IF_START, ctx);
            Utils.insertStatementBefore(logIfStmt, n);

            for (String variable : ctx.logVariablesBefore) {
                Statement logStmt = buildLogStatement(Constant.TARGET_STMT_BEFORE, variable, ctx);
                Utils.insertStatementBefore(logStmt, n);
            }

            for (String variable : ctx.logMethodsBefore) {
                Statement logStmt = buildLogStatement(Constant.TARGET_METHOD_BEFORE, variable, ctx);
                Utils.insertStatementBefore(logStmt, n);
            }

            // log executed statement at the beginning of the if block
            Statement logExecutedStmt = buildPromptStatement(Constant.TARGET_STMT_EXECUTED, ctx);
            n.getThenStmt().asBlockStmt().getStatements().addFirst(logExecutedStmt);
            // log not executed statement at the beginning of the else block
            if (n.getElseStmt().isPresent()) {
                Statement logNotExecutedStmt = buildPromptStatement(Constant.TARGET_STMT_NOT_EXECUTED, ctx);
                n.getElseStmt().get().asBlockStmt().getStatements().addFirst(logNotExecutedStmt);
            }

            Statement logCoverageStmt = buildPromptStatement(Constant.CHECK_COVERAGE, ctx);
            Utils.insertCoverageStatement(n, logCoverageStmt);

            // clear the log variables
            ctx.logVariablesBefore.clear();
            ctx.logMethodsBefore.clear();
            ctx.logVariablesAfter.clear();
        }
        ctx.isCondition = false;

        n.setCondition(condition);
        n.setElseStmt(elseStmt);
        n.setThenStmt(thenStmt);
        n.setComment(comment);
        return n;
    }

    @Override
    public Visitable visit(final ExpressionStmt stmt, final Context ctx) {
        Expression expression = (Expression) stmt.getExpression().accept(this, ctx);
        Comment comment = stmt.getComment().map(s -> (Comment) s.accept(this, ctx)).orElse(null);
        if (expression == null)
            return null;
        stmt.setExpression(expression);
        stmt.setComment(comment);

        if (Utils.isTargetStmt(stmt, ctx)) {
            // Target statement is this statement
            findVariables(stmt, ctx);

            Statement startLogStmt = buildPromptStatement(Constant.TARGET_STMT_START, ctx);
            Utils.insertStatementBefore(startLogStmt, stmt);

            for (String variable : ctx.logVariablesBefore) {
                Statement logStmt = buildLogStatement(Constant.TARGET_STMT_BEFORE, variable, ctx);
                Utils.insertStatementBefore(logStmt, stmt);
            }

            for (String variable : ctx.logMethodsBefore) {
                Statement logStmt = buildLogStatement(Constant.TARGET_METHOD_BEFORE, variable, ctx);
                Utils.insertStatementBefore(logStmt, stmt);
            }

            Statement endLogStmt = buildPromptStatement(Constant.TARGET_STMT_END, ctx);
            Utils.insertStatementAfter(endLogStmt, stmt);

            for (String variable : ctx.logVariablesAfter) {
                Statement logStmt = buildLogStatement(Constant.TARGET_STMT_AFTER, variable, ctx);
                Utils.insertStatementAfter(logStmt, stmt);
            }

            Statement logCoverageStmt = buildPromptStatement(Constant.CHECK_COVERAGE, ctx);
            Utils.insertCoverageStatement(stmt, logCoverageStmt);

            // clear the log variables
            ctx.logVariablesBefore.clear();
            ctx.logMethodsBefore.clear();
            ctx.logVariablesAfter.clear();

            // wrap str.replace() with new org.raninline.IT_String(str).replace()
            for (MethodCallExpr methodCallExpr : stmt.findAll(MethodCallExpr.class)) {
                if (methodCallExpr.getNameAsString().equals("replace") && methodCallExpr.getScope().isPresent()
                        && Character.isLowerCase(methodCallExpr.getScope().get().toString().charAt(0))) {
                    Expression scope = methodCallExpr.getScope().get();
                    Expression newScope = new ObjectCreationExpr(null,
                            new ClassOrInterfaceType(null, "org.raninline.IT_String"), NodeList.nodeList(scope));
                    methodCallExpr.setScope(newScope);
                }
            }
        }
        return stmt;
    }

    @Override
    public Visitable visit(final ForStmt n, final Context arg) {
        Expression compare = n.getCompare().map(s -> (Expression) s.accept(this, arg)).orElse(null);
        NodeList<Expression> initialization = modifyList(n.getInitialization(), arg);
        NodeList<Expression> update = modifyList(n.getUpdate(), arg);
        // add block statement
        if (n.getBody() != null && !(n.getBody() instanceof BlockStmt)) {
            Statement body = n.getBody();
            BlockStmt blockStmt = new BlockStmt();
            n.setBody(blockStmt);
            blockStmt.addStatement(body);
        }
        Statement body = (Statement) n.getBody().accept(this, arg);
        Comment comment = n.getComment().map(s -> (Comment) s.accept(this, arg)).orElse(null);
        if (body == null)
            return null;
        n.setBody(body);
        n.setCompare(compare);
        n.setInitialization(initialization);
        n.setUpdate(update);
        n.setComment(comment);
        return n;
    }

    @Override
    public Visitable visit(final ForEachStmt n, final Context arg) {
        Expression iterable = (Expression) n.getIterable().accept(this, arg);
        VariableDeclarationExpr variable = (VariableDeclarationExpr) n.getVariable().accept(this, arg);
        // add block statement
        if (n.getBody() != null && !(n.getBody() instanceof BlockStmt)) {
            Statement body = n.getBody();
            BlockStmt blockStmt = new BlockStmt();
            n.setBody(blockStmt);
            blockStmt.addStatement(body);
        }
        Statement body = (Statement) n.getBody().accept(this, arg);
        Comment comment = n.getComment().map(s -> (Comment) s.accept(this, arg)).orElse(null);
        if (body == null || iterable == null || variable == null)
            return null;
        n.setBody(body);
        n.setIterable(iterable);
        n.setVariable(variable);
        n.setComment(comment);
        return n;
    }

    @Override
    public Visitable visit(final WhileStmt n, final Context ctx) {
        // add block statement
        if (n.getBody() != null && !(n.getBody() instanceof BlockStmt)) {
            Statement body = n.getBody();
            BlockStmt blockStmt = new BlockStmt();
            n.setBody(blockStmt);
            blockStmt.addStatement(body);
        }
        Statement body = (Statement) n.getBody().accept(this, ctx);
        Expression condition = (Expression) n.getCondition().accept(this, ctx);
        Comment comment = n.getComment().map(s -> (Comment) s.accept(this, ctx)).orElse(null);
        if (body == null || condition == null)
            return null;
        n.setBody(body);
        n.setCondition(condition);
        n.setComment(comment);
        return n;
    }

    @Override
    public Visitable visit(final LambdaExpr n, final Context ctx) {
        Statement body = (Statement) n.getBody().accept(this, ctx);
        NodeList<Parameter> parameters = modifyList(n.getParameters(), ctx);
        Comment comment = n.getComment().map(s -> (Comment) s.accept(this, ctx)).orElse(null);
        if (body == null)
            return null;
        n.setBody(body);
        n.setParameters(parameters);
        n.setComment(comment);
        return n;
    }

    private void findVariables(Node n, Context ctx) {
        FindVariable visitor = new FindVariable();
        n.accept(visitor, ctx);
    }

    private <N extends Node> NodeList<N> modifyList(NodeList<N> list, Context arg) {
        return (NodeList<N>) list.accept(this, arg);
    }

    private <N extends Node> NodeList<N> modifyList(Optional<NodeList<N>> list, Context arg) {
        return list.map(ns -> modifyList(ns, arg)).orElse(null);
    }

    private static Statement buildLogStatement(String prompt, String variable, Context ctx) {
        String logStmtStr = Constant.LOG_CLASS_NAME + ".logVariableAndGenerateTest("
                + "\"" + prompt + "\""
                + ", " + "\"" + ctx.logPath + "\""
                + ", " + "\"" + ctx.inlineTestPath + "\""
                + ", " + "\"" + ctx.srcPath + "\""
                + ", " + (ctx.lineNumber)
                + ", " + variable
                + ", " + "\"" + Utils.escapeString(variable) + "\""
                + ", " + ctx.className + ".class"
                + ", " + "\"" + ctx.classesDirectory + "\""
                + ");";
        return StaticJavaParser.parseStatement(logStmtStr);
    }

    private static Statement buildPromptStatement(String prompt, Context ctx) {
        String logStmtStr = Constant.LOG_CLASS_NAME + ".logVariableAndGenerateTest("
                + "\"" + prompt + "\""
                + ", " + "\"" + ctx.logPath + "\""
                + ", " + "\"" + ctx.inlineTestPath + "\""
                + ", " + "\"" + ctx.srcPath + "\""
                + ", " + (ctx.lineNumber)
                + ", " + "null"
                + ", " + "null"
                + ", " + ctx.className + ".class"
                + ", " + "\"" + ctx.classesDirectory + "\""
                + ");";
        return StaticJavaParser.parseStatement(logStmtStr);
    }
}