package org.raninline;

import java.util.HashSet;
import java.util.Set;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.comments.Comment;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.VariableDeclarationExpr;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.ast.stmt.ExpressionStmt;
import com.github.javaparser.ast.stmt.ForEachStmt;
import com.github.javaparser.ast.stmt.ForStmt;
import com.github.javaparser.ast.stmt.IfStmt;
import com.github.javaparser.ast.visitor.ModifierVisitor;
import com.github.javaparser.ast.visitor.Visitable;
import com.github.javaparser.ast.stmt.Statement;
import com.github.javaparser.ast.stmt.SwitchEntry;
import com.github.javaparser.ast.stmt.WhileStmt;

public class InlineTestConstructor extends ModifierVisitor<Context> {
    Set<Integer> visitedLines;

    public InlineTestConstructor() {
        visitedLines = new HashSet<>();
    }

    @Override
    public Visitable visit(final ExpressionStmt stmt, final Context ctx) {
        Visitable v = super.visit(stmt, ctx);
        for (int lineNumber : ctx.inlineTests.keySet()) {
            if (visitedLines.contains(lineNumber)) {
                continue;
            }
            if (stmt.getRange().get().begin.line <= lineNumber && lineNumber <= stmt.getRange().get().end.line) {
                // check if parent statement is in the same line
                if (stmt.getParentNode().get().getRange().isPresent()
                        && stmt.getParentNode().get().getRange().get().begin.line == stmt.getRange().get().begin.line) {
                    continue;
                }
                visitedLines.add(lineNumber);
                Set<String> inlineTestStrs = ctx.inlineTests.get(lineNumber);
                // find the target statement
                Node parent = stmt.getParentNode().get();
                for (String inlineTestStr : inlineTestStrs) {
                    try {
                        Statement inlineTest = StaticJavaParser.parseStatement(inlineTestStr);
                        // insert the inline test after the target statement
                        if (parent instanceof BlockStmt) {
                            ((BlockStmt) parent).getStatements().addAfter(inlineTest, stmt);
                        } else if (parent instanceof SwitchEntry) {
                            ((SwitchEntry) parent).getStatements().addAfter(inlineTest, stmt);
                        }
                    } catch (Exception e) {
                        // when the inline test is not well-formed, skip it
                        if (ctx.throwExceptionForMalformedInlineTest)
                            throw new RuntimeException(
                                    e.toString() + "\n" + "Error when parsing inline test: " + inlineTestStr);
                        else {
                            continue;
                        }
                    }
                }
            }
        }
        return v;
    }

    @Override
    public Visitable visit(final IfStmt n, final Context ctx) {
        Expression condition = (Expression) n.getCondition();
        Statement elseStmt = n.getElseStmt().map(s -> (Statement) s.accept(this, ctx)).orElse(null);
        Statement thenStmt = (Statement) n.getThenStmt();
        if (thenStmt != null && !(thenStmt instanceof BlockStmt)) {
            thenStmt = new BlockStmt().addStatement(thenStmt);
        }
        thenStmt = (Statement) thenStmt.accept(this, ctx);
        Comment comment = n.getComment().map(s -> (Comment) s.accept(this, ctx)).orElse(null);
        if (condition == null || thenStmt == null)
            return null;
        n.setCondition(condition);
        n.setElseStmt(elseStmt);
        n.setThenStmt(thenStmt);
        n.setComment(comment);

        for (int lineNumber : ctx.inlineTests.keySet()) {
            if (visitedLines.contains(lineNumber)) {
                continue;
            }
            if (condition.getBegin().get().line <= lineNumber && lineNumber <= condition.getEnd().get().line) {
                visitedLines.add(lineNumber);
                Set<String> inlineTestStrs = ctx.inlineTests.get(lineNumber);
                // log executed statement at the beginning of the if block
                for (String inlineTestStr : inlineTestStrs) {
                    try {
                        Statement inlineTest = StaticJavaParser.parseStatement(inlineTestStr);
                        thenStmt.asBlockStmt().getStatements().addFirst(inlineTest);
                    } catch (Exception e) {
                        // when the inline test is not well-formed, skip it
                        continue;
                    }
                }
            }
        }

        return n;
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

    private <N extends Node> NodeList<N> modifyList(NodeList<N> list, Context arg) {
        return (NodeList<N>) list.accept(this, arg);
    }

}
