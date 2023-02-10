package org.raninline;

import com.github.javaparser.ast.expr.AssignExpr;
import com.github.javaparser.ast.expr.BinaryExpr;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.expr.ObjectCreationExpr;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

public class IsTargetStmt extends VoidVisitorAdapter<Context> {

    public void visit(final BinaryExpr binaryExpr, final Context ctx) {
        // bit manipulation
        if (binaryExpr.getOperator().equals(BinaryExpr.Operator.BINARY_AND) ||
                binaryExpr.getOperator().equals(BinaryExpr.Operator.BINARY_OR) ||
                binaryExpr.getOperator().equals(BinaryExpr.Operator.XOR) ||
                binaryExpr.getOperator().equals(BinaryExpr.Operator.LEFT_SHIFT) ||
                binaryExpr.getOperator().equals(BinaryExpr.Operator.SIGNED_RIGHT_SHIFT) ||
                binaryExpr.getOperator().equals(BinaryExpr.Operator.UNSIGNED_RIGHT_SHIFT)) {
            InstrumentHelper.logVariable("target stmt bit", ctx.logPath, ctx.srcPath, ctx.lineNumber, null, "");
            ctx.isTargetStmt = true;
            return;
        }
        super.visit(binaryExpr, ctx);
    }

    public void visit(final AssignExpr assignExpr, final Context ctx) {
        if (assignExpr.getOperator().equals(AssignExpr.Operator.BINARY_AND) ||
                assignExpr.getOperator().equals(AssignExpr.Operator.BINARY_OR) ||
                assignExpr.getOperator().equals(AssignExpr.Operator.XOR) ||
                assignExpr.getOperator().equals(AssignExpr.Operator.LEFT_SHIFT) ||
                assignExpr.getOperator().equals(AssignExpr.Operator.SIGNED_RIGHT_SHIFT) ||
                assignExpr.getOperator().equals(AssignExpr.Operator.UNSIGNED_RIGHT_SHIFT)) {
            InstrumentHelper.logVariable("target stmt bit", ctx.logPath, ctx.srcPath, ctx.lineNumber, null, "");
            ctx.isTargetStmt = true;
            return;
        }
        super.visit(assignExpr, ctx);
    }

    public void visit(final MethodCallExpr methodCallExpr, final Context ctx) {
        if (methodCallExpr.getScope().isPresent()) {
            // regex
            String scope = methodCallExpr.getScope().get().toString();
            if (Constant.REGEX.contains(methodCallExpr.getNameAsString())) {
                InstrumentHelper.logVariable("target stmt regex", ctx.logPath, ctx.srcPath, ctx.lineNumber, null, "");
                ctx.isTargetStmt = true;
                return;
            }

            // string manipulation
            if ("String".equals(scope)
                    || Constant.STRING_MANIPULATION.contains(methodCallExpr.getNameAsString())) {
                InstrumentHelper.logVariable("target stmt string", ctx.logPath, ctx.srcPath, ctx.lineNumber, null, "");
                ctx.isTargetStmt = true;
                return;
            }

            // stream
            if (scope.equals("Stream")
                    && methodCallExpr.getNameAsString().equals("of")) {
                InstrumentHelper.logVariable("target stmt stream", ctx.logPath, ctx.srcPath, ctx.lineNumber, null, "");
                ctx.isTargetStmt = true;
                return;
            }
        }
        // stream
        if (Constant.STREAM.contains(methodCallExpr.getNameAsString())) {
            InstrumentHelper.logVariable("target stmt stream", ctx.logPath, ctx.srcPath, ctx.lineNumber, null, "");
            ctx.isTargetStmt = true;
            return;
        }
        super.visit(methodCallExpr, ctx);
    }

    public void visit(ObjectCreationExpr ObjectCreationExpr, Context ctx) {
        // skip anonymous class
        if (ObjectCreationExpr.getAnonymousClassBody().isPresent()) {
            return;
        }
        super.visit(ObjectCreationExpr, ctx);
    }
}
