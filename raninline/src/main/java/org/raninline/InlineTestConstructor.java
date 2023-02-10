package org.raninline;

import java.util.HashSet;
import java.util.Set;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.comments.Comment;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.ast.stmt.ExpressionStmt;
import com.github.javaparser.ast.stmt.IfStmt;
import com.github.javaparser.ast.visitor.ModifierVisitor;
import com.github.javaparser.ast.visitor.Visitable;
import com.github.javaparser.ast.stmt.Statement;

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
                if (stmt.getParentNode().get().getRange().get().begin.line == stmt.getRange().get().begin.line) {
                    continue;
                }
                visitedLines.add(lineNumber);
                Set<String> inlineTestStrs = ctx.inlineTests.get(lineNumber);
                // find the target statement
                Node parent = stmt.getParentNode().get();
                for (String inlineTestStr : inlineTestStrs) {
                    try{
                        Statement inlineTest = StaticJavaParser.parseStatement(inlineTestStr);
                        // insert the inline test after the target statement
                        if (parent instanceof BlockStmt) {
                            ((BlockStmt) parent).getStatements().addAfter(inlineTest, stmt);
                        }
                    }catch(Exception e){
                        // when the inline test is not well-formed, skip it
                        continue;
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
                    try{
                        Statement inlineTest = StaticJavaParser.parseStatement(inlineTestStr);
                        thenStmt.asBlockStmt().getStatements().addFirst(inlineTest);
                    }catch(Exception e){
                        // when the inline test is not well-formed, skip it
                        continue;
                    }
                }
            }
        }

        return n;
    }
}
