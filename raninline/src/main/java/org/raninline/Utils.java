package org.raninline;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.commons.text.StringEscapeUtils;

import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.expr.AssignExpr;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.LambdaExpr;
import com.github.javaparser.ast.expr.VariableDeclarationExpr;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.ast.stmt.BreakStmt;
import com.github.javaparser.ast.stmt.ContinueStmt;
import com.github.javaparser.ast.stmt.ExplicitConstructorInvocationStmt;
import com.github.javaparser.ast.stmt.ExpressionStmt;
import com.github.javaparser.ast.stmt.IfStmt;
import com.github.javaparser.ast.stmt.ReturnStmt;
import com.github.javaparser.ast.stmt.Statement;
import com.github.javaparser.ast.stmt.SwitchEntry;
import com.github.javaparser.ast.stmt.ThrowStmt;
import com.github.javaparser.ast.stmt.TryStmt;

public class Utils {
    /**
     * Parse line number from command line argument
     * 
     * @param s
     * @return
     */
    protected static int parseLineNumber(String s) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return -1;
        } catch (NullPointerException e) {
            return -1;
        }
    }

    protected static boolean isTargetStmt(Node n, Context ctx) {
        if (!n.getRange().isPresent()) {
            return false;
        }
        if (n.getParentNode().isPresent() && n.getParentNode().get() instanceof LambdaExpr
                && !(n instanceof BlockStmt)) {
            return false;
        }
        if (ctx.lineNumberKnown) {
            return n.getBegin().get().line <= ctx.lineNumber && ctx.lineNumber <= n.getEnd().get().line;
        } else {
            // check if the node contains assignment operator
            if (n instanceof ExpressionStmt) {
                ExpressionStmt exprStmt = (ExpressionStmt) n;
                Expression expr = exprStmt.getExpression();
                if (!(expr instanceof AssignExpr) && !(expr instanceof VariableDeclarationExpr)) {
                    return false;
                }
            }
            IsTargetStmt visitor = new IsTargetStmt();
            ctx.isTargetStmt = false;
            ctx.lineNumber = n.getBegin().get().line;
            n.accept(visitor, ctx);
            if (ctx.isTargetStmt) {
                return true;
            }
        }
        return false;
    }

    public static String escapeString(String str) {
        return StringEscapeUtils.escapeJava(str);
    }

    public static void insertStatementBefore(Statement newStmt, Statement targetStmt) {
        Node parent = targetStmt.getParentNode().get();
        if (parent instanceof Statement) {
            if (!(parent instanceof BlockStmt)) {
                parent = new BlockStmt().addStatement((Statement) parent);
                targetStmt.setParentNode(parent);
            }
            ((BlockStmt) parent).getStatements().addBefore(newStmt, targetStmt);
        } else if (parent instanceof SwitchEntry) {
            ((SwitchEntry) parent).getStatements().addBefore(newStmt, targetStmt);
        }
    }

    public static void insertStatementAfter(Statement newStmt, Statement targetStmt) {
        Node parent = targetStmt.getParentNode().get();
        if (parent instanceof Statement) {
            if (!(parent instanceof BlockStmt)) {
                parent = new BlockStmt().addStatement((Statement) parent);
                targetStmt.setParentNode(parent);
            }
            ((BlockStmt) parent).getStatements().addAfter(newStmt, targetStmt);
        } else if (parent instanceof SwitchEntry) {
            ((SwitchEntry) parent).getStatements().addAfter(newStmt, targetStmt);
        }
    }

    public static boolean isJumpStmt(Statement stmt) {
        return stmt instanceof ReturnStmt || stmt instanceof ThrowStmt || stmt instanceof BreakStmt
                || stmt instanceof ContinueStmt;
    }

    public static boolean containJumpStmt(BlockStmt blockStmt) {
        if (blockStmt.getStatements().isEmpty()) {
            return false;
        } else if (blockStmt.getStatements().getLast().isPresent()
                && isJumpStmt(blockStmt.getStatements().getLast().get())) {
            return true;
        } else {
            for (IfStmt innerIfStmt : blockStmt.findAll(IfStmt.class)) {
                if (innerIfStmt.getThenStmt().isBlockStmt() && containJumpStmt(innerIfStmt.getThenStmt().asBlockStmt())
                        && innerIfStmt.getElseStmt().isPresent() && innerIfStmt.getElseStmt().get().isBlockStmt()
                        && containJumpStmt(innerIfStmt.getElseStmt().get().asBlockStmt())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void insertCoverageStatement(Node n, Statement logCoverageStmt) {
        Node parent = n.getParentNode().get();

        NodeList<Statement> stmts = null;
        if (parent instanceof BlockStmt) {
            stmts = ((BlockStmt) parent).getStatements();
        } else if (parent instanceof SwitchEntry) {
            stmts = ((SwitchEntry) parent).getStatements();
        }
        if (stmts == null) {
            throw new RuntimeException("parent node is not block statement or switch entry");
        }

        // surround with try catch block
        TryStmt tryStmt = new TryStmt();
        BlockStmt tryBlock = new BlockStmt();

        // special handling for super constructor invocation because
        // first statement in constructor must be super constructor
        // invocation (super() or this())
        ExplicitConstructorInvocationStmt superStmt = null;
        // move statements to try block
        while (!stmts.isEmpty()) {
            Statement stmt = stmts.remove(0);
            if (stmt instanceof ExplicitConstructorInvocationStmt) {
                superStmt = (ExplicitConstructorInvocationStmt) stmt;
            } else {
                tryBlock.addStatement(stmt);
            }
        }
        tryStmt.setTryBlock(tryBlock);
        // insert log coverage statement in finally block
        BlockStmt finallyBlock = new BlockStmt();
        finallyBlock.addStatement(logCoverageStmt);
        tryStmt.setFinallyBlock(finallyBlock);

        // replace original statements with try catch block
        if (superStmt != null) {
            stmts.add(superStmt);
        }
        stmts.add(tryStmt);
    }

    public static String createDir(String dirName) {
        String currentDir = System.getProperty("user.dir");
        String dir = currentDir + "/" + dirName;
        // create directory for inline tests if not exist
        try {
            Files.createDirectories(Paths.get(dir));
            return dir;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean isConstant(String name) {
        return name.toUpperCase().equals(name);
    }
}
