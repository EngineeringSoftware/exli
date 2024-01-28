package org.raninline;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.VariableDeclarator;
import com.github.javaparser.ast.expr.ArrayAccessExpr;
import com.github.javaparser.ast.expr.AssignExpr;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.FieldAccessExpr;
import com.github.javaparser.ast.expr.LambdaExpr;
import com.github.javaparser.ast.expr.NameExpr;
import com.github.javaparser.ast.expr.UnaryExpr;
import com.github.javaparser.ast.expr.VariableDeclarationExpr;
import com.github.javaparser.ast.stmt.ForEachStmt;
import com.github.javaparser.ast.stmt.ForStmt;
import com.github.javaparser.ast.stmt.SynchronizedStmt;
import com.github.javaparser.ast.stmt.TryStmt;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

public class FindVariable extends VoidVisitorAdapter<Context> {

    @Override
    public void visit(final AssignExpr n, final Context ctx) {
        // a += b, log a
        if (Constant.COMPOUND_ASSIGN_OPERATORS.contains(((AssignExpr) n).getOperator())) {
            ctx.logVariablesBefore.add(((AssignExpr) n).getTarget().toString());
        }
        Expression target = n.getTarget();
        if (!isLocalVariable(target.toString(), ctx)) {
            // a[n] = b, log a
            if (target instanceof ArrayAccessExpr) {
                ArrayAccessExpr arrayAccessExpr = (ArrayAccessExpr) target;
                if (arrayAccessExpr.getIndex() instanceof UnaryExpr) {
                    UnaryExpr index = (UnaryExpr) arrayAccessExpr.getIndex();
                    if (index.getOperator() == UnaryExpr.Operator.POSTFIX_INCREMENT) {
                        ctx.logVariablesAfter.add(arrayAccessExpr.getName().toString() + "["
                                + index.getExpression().toString() + " - 1]");
                    } else if (index.getOperator() == UnaryExpr.Operator.POSTFIX_DECREMENT) {
                        ctx.logVariablesAfter.add(arrayAccessExpr.getName().toString() + "["
                                + index.getExpression().toString() + " + 1]");
                    } else if (index.getOperator() == UnaryExpr.Operator.PREFIX_INCREMENT
                            || index.getOperator() == UnaryExpr.Operator.PREFIX_DECREMENT) {
                        ctx.logVariablesBefore.add(arrayAccessExpr.getName().toString() + "["
                                + index.getExpression().toString() + "]");
                    } else {
                        ctx.logVariablesAfter.add(target.toString());
                    }
                } else {
                    ctx.logVariablesAfter.add(target.toString());
                }
            } else {
                ctx.logVariablesAfter.add(target.toString());
            }
        }
        // skip: n.getTarget().accept(this, ctx);
        n.getValue().accept(this, ctx);
    }

    @Override
    public void visit(final VariableDeclarator n, final Context ctx) {
        if (ctx.locals.size() > 0) {
            ctx.locals.peek().add(n.getNameAsString());
        }
        n.getInitializer().ifPresent(l -> {
            if (!isLocalVariable(n.getNameAsString(), ctx)) {
                ctx.logVariablesAfter.add(n.getNameAsString());
            }
            l.accept(this, ctx);
        });
        // skip: n.getName().accept(this, ctx);
        // skip: n.getType().accept(this, ctx);
    }

    public boolean containLocalVariable(Node n, Context ctx) {
        if (ctx.locals.size() == 0) {
            return false;
        }
        if (n instanceof NameExpr) {
            return isLocalVariable(((NameExpr) n).getNameAsString(), ctx);
        }
        boolean res = false;
        for (Node child : n.getChildNodes()) {
            res = res || containLocalVariable(child, ctx);
        }
        return res;
    }

    @Override
    public void visit(final FieldAccessExpr n, final Context ctx) {
        // skip: n.getName().accept(this, ctx);
        // skip: n.getScope().accept(this, ctx);
        // skip: n.getTypeArguments().ifPresent(l -> l.forEach(v -> v.accept(this,
        // ctx)));
        if (!containLocalVariable(n, ctx) && Character.isLowerCase(n.getNameAsString().charAt(0))) {
            ctx.logVariablesBefore.add(n.toString());
        }
    }

    @Override
    public void visit(final LambdaExpr n, final Context ctx) {
        ctx.locals.push(
                ((LambdaExpr) n).getParameters().stream().map(p -> p.getNameAsString())
                        .collect(Collectors.toSet()));
        n.getBody().accept(this, ctx);
        ctx.locals.pop();
        // skip: n.getParameters().forEach(p -> p.accept(this, ctx));
    }

    @Override
    public void visit(final NameExpr n, final Context ctx) {
        String name = n.getNameAsString();
        if (!isLocalVariable(name, ctx) && (Character.isLowerCase(name.charAt(0))
                || (Utils.isConstant(name) && name.length() >= 2))) {
            ctx.logVariablesBefore.add(name);
        }
        n.getName().accept(this, ctx);
    }

    private boolean isLocalVariable(String name, Context ctx) {
        boolean isLocalVariableRes = false;
        for (Set<String> locals : ctx.locals) {
            if (locals.contains(name)) {
                isLocalVariableRes = true;
                break;
            }
        }
        return isLocalVariableRes;
    }

    @Override
    public void visit(final TryStmt n, final Context ctx) {
        Set<String> variableSet = new HashSet<>();
        NodeList<Expression> expressionList = n.getResources();
        for (Expression expression : expressionList) {
            if (expression instanceof VariableDeclarationExpr) {
                for (VariableDeclarator variableDeclarator : ((VariableDeclarationExpr) expression).getVariables()) {
                    variableSet.add(variableDeclarator.getNameAsString());
                }
            }
        }
        ctx.locals.push(variableSet);
        // skip: n.getCatchClauses().forEach(p -> p.accept(this, ctx));
        n.getFinallyBlock().ifPresent(l -> l.accept(this, ctx));
        n.getResources().forEach(p -> p.accept(this, ctx));
        n.getTryBlock().accept(this, ctx);
        ctx.locals.pop();
    }

    @Override
    public void visit(final ForEachStmt n, final Context ctx) {
        Set<String> variableSet = new HashSet<>();
        VariableDeclarationExpr variableDeclarationExpr = n.getVariable();
        for (VariableDeclarator variableDeclarator : variableDeclarationExpr.getVariables()) {
            variableSet.add(variableDeclarator.getNameAsString());
        }
        ctx.locals.push(variableSet);
        n.getBody().accept(this, ctx);
        n.getIterable().accept(this, ctx);
        n.getVariable().accept(this, ctx);
        ctx.locals.pop();
    }

    @Override
    public void visit(final ForStmt n, final Context ctx) {
        Set<String> variableSet = new HashSet<>();
        NodeList<Expression> expressionList = n.getInitialization();
        for (Expression expression : expressionList) {
            if (expression instanceof VariableDeclarationExpr) {
                for (VariableDeclarator variableDeclarator : ((VariableDeclarationExpr) expression).getVariables()) {
                    variableSet.add(variableDeclarator.getNameAsString());
                }
            }
        }
        ctx.locals.push(variableSet);
        n.getBody().accept(this, ctx);
        n.getCompare().ifPresent(l -> l.accept(this, ctx));
        n.getInitialization().forEach(p -> p.accept(this, ctx));
        n.getUpdate().forEach(p -> p.accept(this, ctx));
        ctx.locals.pop();
    }

    @Override
    public void visit(final SynchronizedStmt n, final Context ctx) {
        Set<String> variableSet = new HashSet<>();
        Expression expression = n.getExpression();
        if (expression instanceof VariableDeclarationExpr) {
            for (VariableDeclarator variableDeclarator : ((VariableDeclarationExpr) expression).getVariables()) {
                variableSet.add(variableDeclarator.getNameAsString());
            }
        }
        ctx.locals.push(variableSet);
        n.getBody().accept(this, ctx);
        n.getExpression().accept(this, ctx);
        ctx.locals.pop();
    }
}
