package org.raninline;

import com.github.javaparser.ast.Modifier;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.visitor.ModifierVisitor;
import com.github.javaparser.ast.visitor.Visitable;

public class ChangeModifier extends ModifierVisitor<Context>{
    @Override
    public Visitable visit(final MethodDeclaration n, final Context ctx) {
        MethodDeclaration returnMD = (MethodDeclaration) super.visit(n, ctx);
        returnMD.setModifier(Modifier.Keyword.PUBLIC, true);
        returnMD.setModifier(Modifier.Keyword.PRIVATE, false);
        returnMD.setModifier(Modifier.Keyword.PROTECTED, false);
        return returnMD;
    }
}
