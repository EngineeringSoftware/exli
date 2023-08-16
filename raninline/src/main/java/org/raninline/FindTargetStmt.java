package org.raninline;

import com.github.javaparser.ast.stmt.ExpressionStmt;
import com.github.javaparser.ast.stmt.IfStmt;
import com.github.javaparser.ast.visitor.ModifierVisitor;
import com.github.javaparser.ast.visitor.Visitable;

public class FindTargetStmt extends ModifierVisitor<Context> {

    @Override
    public Visitable visit(final IfStmt n, final Context ctx) {
        ctx.isCondition = true;
        Utils.isTargetStmt(n.getCondition(), ctx);
        ctx.isCondition = false;
        return super.visit(n, ctx);
    }

    @Override
    public Visitable visit(final ExpressionStmt stmt, final Context ctx) {
        Utils.isTargetStmt(stmt, ctx);
        return super.visit(stmt, ctx);
    }
}