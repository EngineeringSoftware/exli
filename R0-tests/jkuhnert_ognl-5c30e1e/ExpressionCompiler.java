package ognl.enhance;

import javassist.*;
import ognl.*;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.*;
import org.inlinetest.Here;
import static org.inlinetest.Here.group;

/**
 * Responsible for managing/providing functionality related to compiling generated java source
 * expressions via bytecode enhancements for a given ognl expression.
 */
public class ExpressionCompiler implements OgnlExpressionCompiler {

    /**
     * Key used to store any java source string casting statements in the {@link OgnlContext} during
     * class compilation.
     */
    public static final String PRE_CAST = "_preCast";

    /**
     * {@link ClassLoader} instances.
     */
    protected Map _loaders = new HashMap();

    /**
     * Javassist class definition poool.
     */
    protected ClassPool _pool;

    protected int _classCounter = 0;

    /**
     * Default constructor, does nothing.
     */
    public ExpressionCompiler() {
    }

    /**
     * Used by {@link #castExpression(ognl.OgnlContext, ognl.Node, String)} to store the cast java
     * source string in to the current {@link OgnlContext}. This will either add to the existing
     * string present if it already exists or create a new instance and store it using the static key
     * of {@link #PRE_CAST}.
     *
     * @param context
     *          The current execution context.
     * @param cast
     *          The java source string to store in to the context.
     */
    public static void addCastString(OgnlContext context, String cast) {
        String value = (String) context.get(PRE_CAST);
        if (value != null) {
            value = cast + value;
        } else
            value = cast;
        context.put(PRE_CAST, value);
    }

    /**
     * Returns the appropriate casting expression (minus parens) for the specified class type.
     *
     * <p>
     * For instance, if given an {@link Integer} object the string <code>"java.lang.Integer"</code>
     * would be returned. For an array of primitive ints <code>"int[]"</code> and so on..
     * </p>
     *
     * @param type The class to cast a string expression for.
     * @return The converted raw string version of the class name.
     */
    public static String getCastString(Class type) {
        if (type == null) {
            return null;
        }
        return type.isArray() ? type.getComponentType().getName() + "[]" : type.getName();
    }

    /**
     * Convenience method called by many different property/method resolving AST types to get a root expression
     * resolving string for the given node.  The callers are mostly ignorant and rely on this method to properly
     * determine if the expression should be cast at all and take the appropriate actions if it should.
     *
     * @param expression
     *          The node to check and generate a root expression to if necessary.
     * @param root
     *          The root object for this execution.
     * @param context
     *          The current execution context.
     * @return Either an empty string or a root path java source string compatible with javassist compilations
     *          from the root object up to the specified {@link Node}.
     */
    public static String getRootExpression(Node expression, Object root, OgnlContext context) {
        String rootExpr = "";
        if (!shouldCast(expression)) {
            return rootExpr;
        }
        if ((!ASTList.class.isInstance(expression) && !ASTVarRef.class.isInstance(expression) && !ASTStaticMethod.class.isInstance(expression) && !ASTStaticField.class.isInstance(expression) && !ASTConst.class.isInstance(expression) && !ExpressionNode.class.isInstance(expression) && !ASTCtor.class.isInstance(expression) && !ASTStaticMethod.class.isInstance(expression) && root != null) || (root != null && ASTRootVarRef.class.isInstance(expression))) {
            Class castClass = OgnlRuntime.getCompiler().getRootExpressionClass(expression, context);
            if (castClass.isArray() || ASTRootVarRef.class.isInstance(expression) || ASTThisVarRef.class.isInstance(expression)) {
                rootExpr = "((" + getCastString(castClass) + ")$2)";
                if (ASTProperty.class.isInstance(expression) && !((ASTProperty) expression).isIndexedAccess()) {
                    rootExpr += ".";
                }
            } else if ((ASTProperty.class.isInstance(expression) && ((ASTProperty) expression).isIndexedAccess()) || ASTChain.class.isInstance(expression)) {
                rootExpr = "((" + getCastString(castClass) + ")$2)";
            } else {
                rootExpr = "((" + getCastString(castClass) + ")$2).";
            }
        }
        return rootExpr;
    }

    /**
     * Used by {@link #getRootExpression(ognl.Node, Object, ognl.OgnlContext)} to determine if the expression
     * needs to be cast at all.
     *
     * @param expression
     *          The node to check against.
     * @return Yes if the node type should be cast - false otherwise.
     */
    public static boolean shouldCast(Node expression) {
        if (ASTChain.class.isInstance(expression)) {
            Node child = expression.jjtGetChild(0);
            if (ASTConst.class.isInstance(child) || ASTStaticMethod.class.isInstance(child) || ASTStaticField.class.isInstance(child) || (ASTVarRef.class.isInstance(child) && !ASTRootVarRef.class.isInstance(child))) {
                return false;
            }
        }
        return !ASTConst.class.isInstance(expression);
    }

    public String castExpression(OgnlContext context, Node expression, String body) {
        // ok - so this looks really f-ed up ...and it is ..eh if you can do it better I'm all for it :)
        if (context.getCurrentAccessor() == null || context.getPreviousType() == null || context.getCurrentAccessor().isAssignableFrom(context.getPreviousType()) || (context.getCurrentType() != null && context.getCurrentObject() != null && context.getCurrentType().isAssignableFrom(context.getCurrentObject().getClass()) && context.getCurrentAccessor().isAssignableFrom(context.getPreviousType())) || body == null || body.trim().length() < 1 || (context.getCurrentType() != null && context.getCurrentType().isArray() && (context.getPreviousType() == null || context.getPreviousType() != Object.class)) || ASTOr.class.isInstance(expression) || ASTAnd.class.isInstance(expression) || ASTRootVarRef.class.isInstance(expression) || context.getCurrentAccessor() == Class.class || (context.get(ExpressionCompiler.PRE_CAST) != null && ((String) context.get(ExpressionCompiler.PRE_CAST)).startsWith("new")) || ASTStaticField.class.isInstance(expression) || ASTStaticMethod.class.isInstance(expression) || (OrderedReturn.class.isInstance(expression) && ((OrderedReturn) expression).getLastExpression() != null)) {
            return body;
        }
        /*         System.out.println("castExpression() with expression " + expression + " expr class: " + expression.getClass() + " currentType is: " + context.getCurrentType()
                      + " previousType: " + context.getPreviousType()
                      + "\n current Accessor: " + context.getCurrentAccessor()
                      + " previous Accessor: " + context.getPreviousAccessor()
                      + " current object " + context.getCurrentObject());*/
        ExpressionCompiler.addCastString(context, "((" + ExpressionCompiler.getCastString(context.getCurrentAccessor()) + ")");
        return ")" + body;
    }

    public String getClassName(Class clazz) {
        if (clazz.getName().equals("java.util.AbstractList$Itr")) {
            return Iterator.class.getName();
        }
        if (Modifier.isPublic(clazz.getModifiers()) && clazz.isInterface()) {
            return clazz.getName();
        }
        return _getClassName(clazz, clazz.getInterfaces());
    }

    private String _getClassName(Class clazz, Class[] intf) {
        for (int i = 0; i < intf.length; i++) {
            if (intf[i].getName().indexOf("util.List") > 0) {
                return intf[i].getName();
            } else if (intf[i].getName().indexOf("Iterator") > 0) {
                return intf[i].getName();
            }
        }
        final Class superclazz = clazz.getSuperclass();
        if (superclazz != null) {
            final Class[] superclazzIntf = superclazz.getInterfaces();
            if (superclazzIntf.length > 0) {
                return _getClassName(superclazz, superclazzIntf);
            }
        }
        return clazz.getName();
    }

    public Class getSuperOrInterfaceClass(Method m, Class clazz) {
        Class[] intfs = clazz.getInterfaces();
        if (intfs != null && intfs.length > 0) {
            Class intClass;
            for (int i = 0; i < intfs.length; i++) {
                intClass = getSuperOrInterfaceClass(m, intfs[i]);
                if (intClass != null) {
                    return intClass;
                }
                if (Modifier.isPublic(intfs[i].getModifiers()) && containsMethod(m, intfs[i])) {
                    return intfs[i];
                }
            }
        }
        if (clazz.getSuperclass() != null) {
            Class superClass = getSuperOrInterfaceClass(m, clazz.getSuperclass());
            if (superClass != null) {
                return superClass;
            }
        }
        if (Modifier.isPublic(clazz.getModifiers()) && containsMethod(m, clazz)) {
            return clazz;
        }
        return null;
    }

    /**
     * Helper utility method used by compiler to help resolve class-&gt;method mappings
     * during method calls to {@link OgnlExpressionCompiler#getSuperOrInterfaceClass(java.lang.reflect.Method, Class)}.
     *
     * @param m
     *          The method to check for existance of.
     * @param clazz
     *          The class to check for the existance of a matching method definition to the method passed in.
     * @return True if the class contains the specified method, false otherwise.
     */
    public boolean containsMethod(Method m, Class clazz) {
        Method[] methods = clazz.getMethods();
        if (methods == null) {
            return false;
        }
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals(m.getName()) && methods[i].getReturnType() == m.getReturnType()) {
                Class[] parms = m.getParameterTypes();
                if (parms == null) {
                    continue;
                }
                Class[] mparms = methods[i].getParameterTypes();
                if (mparms == null || mparms.length != parms.length) {
                    continue;
                }
                boolean parmsMatch = true;
                for (int p = 0; p < parms.length; p++) {
                    if (parms[p] != mparms[p]) {
                        parmsMatch = false;
                        break;
                    }
                }
                if (!parmsMatch) {
                    continue;
                }
                Class[] exceptions = m.getExceptionTypes();
                if (exceptions == null) {
                    continue;
                }
                Class[] mexceptions = methods[i].getExceptionTypes();
                if (mexceptions == null || mexceptions.length != exceptions.length) {
                    continue;
                }
                boolean exceptionsMatch = true;
                for (int e = 0; e < exceptions.length; e++) {
                    if (exceptions[e] != mexceptions[e]) {
                        exceptionsMatch = false;
                        break;
                    }
                }
                if (!exceptionsMatch) {
                    continue;
                }
                return true;
            }
        }
        return false;
    }

    public Class getInterfaceClass(Class clazz) {
        if (clazz.getName().equals("java.util.AbstractList$Itr")) {
            return Iterator.class;
        }
        if (Modifier.isPublic(clazz.getModifiers()) && clazz.isInterface() || clazz.isPrimitive()) {
            return clazz;
        }
        return _getInterfaceClass(clazz, clazz.getInterfaces());
    }

    private Class _getInterfaceClass(Class clazz, Class[] intf) {
        for (int i = 0; i < intf.length; i++) {
            if (List.class.isAssignableFrom(intf[i])) {
                return List.class;
            } else if (Iterator.class.isAssignableFrom(intf[i])) {
                return Iterator.class;
            } else if (Map.class.isAssignableFrom(intf[i])) {
                return Map.class;
            } else if (Set.class.isAssignableFrom(intf[i])) {
                return Set.class;
            } else if (Collection.class.isAssignableFrom(intf[i])) {
                return Collection.class;
            }
        }
        final Class superclazz = clazz.getSuperclass();
        if (superclazz != null) {
            final Class[] superclazzIntf = superclazz.getInterfaces();
            if (superclazzIntf.length > 0) {
                return _getInterfaceClass(superclazz, superclazzIntf);
            }
        }
        return clazz;
    }

    public Class getRootExpressionClass(Node rootNode, OgnlContext context) {
        if (context.getRoot() == null) {
            return null;
        }
        Class ret = context.getRoot().getClass();
        if (context.getFirstAccessor() != null && context.getFirstAccessor().isInstance(context.getRoot())) {
            ret = context.getFirstAccessor();
        }
        return ret;
    }

    /* (non-Javadoc)
     * @see ognl.enhance.OgnlExpressionCompiler#compileExpression(ognl.OgnlContext, ognl.Node, java.lang.Object)
     */
    public void compileExpression(OgnlContext context, Node expression, Object root) throws Exception {
        // System.out.println("Compiling expr class " + expression.getClass().getName() + " and root " + root);
        if (expression.getAccessor() != null) {
            return;
        }
        String getBody, setBody;
        EnhancedClassLoader loader = getClassLoader(context);
        ClassPool pool = getClassPool(context, loader);
        CtClass newClass = pool.makeClass(expression.getClass().getName() + expression.hashCode() + _classCounter++ + "Accessor");
        newClass.addInterface(getCtClass(ExpressionAccessor.class));
        CtClass ognlClass = getCtClass(OgnlContext.class);
        CtClass objClass = getCtClass(Object.class);
        CtMethod valueGetter = new CtMethod(objClass, "get", new CtClass[] { ognlClass, objClass }, newClass);
        CtMethod valueSetter = new CtMethod(CtClass.voidType, "set", new CtClass[] { ognlClass, objClass, objClass }, newClass);
        // will only be set if uncompilable exception is thrown
        CtField nodeMember = null;
        CtClass nodeClass = getCtClass(Node.class);
        CtMethod setExpression = null;
        try {
            getBody = generateGetter(context, newClass, objClass, pool, valueGetter, expression, root);
        } catch (UnsupportedCompilationException uc) {
            // uc.printStackTrace();
            nodeMember = new CtField(nodeClass, "_node", newClass);
            newClass.addField(nodeMember);
            getBody = generateOgnlGetter(newClass, valueGetter, nodeMember);
            if (setExpression == null) {
                setExpression = CtNewMethod.setter("setExpression", nodeMember);
                newClass.addMethod(setExpression);
            }
        }
        try {
            setBody = generateSetter(context, newClass, objClass, pool, valueSetter, expression, root);
        } catch (UnsupportedCompilationException uc) {
            // uc.printStackTrace();
            if (nodeMember == null) {
                nodeMember = new CtField(nodeClass, "_node", newClass);
                newClass.addField(nodeMember);
            }
            setBody = generateOgnlSetter(newClass, valueSetter, nodeMember);
            if (setExpression == null) {
                setExpression = CtNewMethod.setter("setExpression", nodeMember);
                newClass.addMethod(setExpression);
            }
        }
        try {
            newClass.addConstructor(CtNewConstructor.defaultConstructor(newClass));
            Class clazz = pool.toClass(newClass);
            newClass.detach();
            expression.setAccessor((ExpressionAccessor) clazz.newInstance());
            // need to set expression on node if the field was just defined.
            if (nodeMember != null) {
                expression.getAccessor().setExpression(expression);
            }
        } catch (Throwable t) {
            // t.printStackTrace();
            throw new RuntimeException("Error compiling expression on object " + root + " with expression node " + expression + " getter body: " + getBody + " setter body: " + setBody, t);
        }
    }

    protected String generateGetter(OgnlContext context, CtClass newClass, CtClass objClass, ClassPool pool, CtMethod valueGetter, Node expression, Object root) throws Exception {
        String pre = "";
        String post = "";
        String body;
        context.setRoot(root);
        // the ExpressionAccessor API has to reference the generic Object class for get/set operations, so this sets up that known
        // type beforehand
        context.remove(PRE_CAST);
        // Recursively generate the java source code representation of the top level expression
        String getterCode = expression.toGetSourceString(context, root);
        if (getterCode == null || getterCode.trim().length() <= 0 && !ASTVarRef.class.isAssignableFrom(expression.getClass())) {
            getterCode = "null";
        }
        String castExpression = (String) context.get(PRE_CAST);
        if (context.getCurrentType() == null || context.getCurrentType().isPrimitive() || Character.class.isAssignableFrom(context.getCurrentType()) || Object.class == context.getCurrentType()) {
            pre = pre + " ($w) (";
            post = post + ")";
        }
        String rootExpr = !getterCode.equals("null") ? getRootExpression(expression, root, context) : "";
        String noRoot = (String) context.remove("_noRoot");
        if (noRoot != null) {
            rootExpr = "";
        }
        createLocalReferences(context, pool, newClass, objClass, valueGetter.getParameterTypes());
        if (OrderedReturn.class.isInstance(expression) && ((OrderedReturn) expression).getLastExpression() != null) {
            body = "{ " + (ASTMethod.class.isInstance(expression) || ASTChain.class.isInstance(expression) ? rootExpr : "") + (castExpression != null ? castExpression : "") + ((OrderedReturn) expression).getCoreExpression() + " return " + pre + ((OrderedReturn) expression).getLastExpression() + post + ";}";
        } else {
            body = "{  return " + pre + (castExpression != null ? castExpression : "") + rootExpr + getterCode + post + ";}";
        }
        if (body.indexOf("..") >= 0) {
            new Here("Unit", 549).given(body, "{  return  ($w) (((org.ognl.test.objects.Bean3)((org.ognl.test.objects.Bean1)$2).getBean2().getBean3()).getIndexedValue(25));}").checkFalse(group());
            new Here("Unit", 549).given(body, "{  return  ($w) (((org.ognl.test.objects.Indexed)$2).getSource().getTotal());}").checkFalse(group());
            new Here("Unit", 549).given(body, "{  return  ($w) ((ognl.OgnlOps.greater( ($w) (((java.util.Map)((org.ognl.test.objects.Root)$2).getIndexedProperty(\"nested\")).size() - 1 ), ($w)  ((org.ognl.test.objects.Root)$2)..getGenericIndex())));}").checkTrue(group());
            new Here("Unit", 549).given(body, "{  return  ($w) (((java.lang.Object)$2)..hashCode());}").checkTrue(group());
            new Here("Unit", 549).given(body, "{  return  ($w) ((!ognl.OgnlOps.less( ($w) (((java.util.Map)((org.ognl.test.objects.Root)$2).getIndexedProperty(\"nested\")).size() + 1 ), ($w)  ((org.ognl.test.objects.Root)$2)..getGenericIndex())));}").checkTrue(group());
            new Here("Unit", 549).given(body, "{  return  ($w) (((java.util.Map)$2)..get(\"list\"));}").checkTrue(group());
            new Here("Unit", 549).given(body, "{  return ((org.ognl.test.objects.BaseBean)((org.ognl.test.objects.Root)$2).getMap().get(\"bean\")).getName();}").checkFalse(group());
            new Here("Unit", 549).given(body, "{  return  ($w) ((ognl.OgnlOps.equal( ($w) (((java.lang.Integer)((org.ognl.test.objects.Root)$2)..getGenericIndex()).intValue() % ((org.ognl.test.objects.Root)$2)..getTheInt() ), ($w)  ((org.ognl.test.objects.Bean2)((org.ognl.test.objects.Root)$2).getProperty()).getBean3().getValue())));}").checkTrue(group());
            new Here("Unit", 549).given(body, "{  return  ($w) ((((org.ognl.test.objects.Bean1)$2).getBean2().getBean3().getValue() <= 24));}").checkFalse(group());
            new Here("Unit", 549).given(body, "{  return  ($w) ((ognl.OgnlOps.equal( ($w) (java.lang.Long#valueOf(\"100\") ), ($w)  java.lang.Long#valueOf(\"100\"))));}").checkFalse(group());
            new Here("Unit", 549).given(body, "{  return new org.ognl.test.objects.Simple[] {  ($w) (new org.ognl.test.objects.Simple()),  ($w) (new org.ognl.test.objects.Simple(\"foo\", 1.0f, 2))};}").checkFalse(group());
            new Here("Unit", 549).given(body, "{  return  ($w) (false);}").checkFalse(group());
            new Here("Unit", 549).given(body, "{  return new Object[4];}").checkFalse(group());
            new Here("Unit", 549).given(body, "{  return  ($w) (((org.ognl.test.objects.Root)$2).getMap().get(\"size\"));}").checkFalse(group());
            new Here("Unit", 549).given(body, "{  return  ($w) (((org.ognl.test.objects.Simple)$2)..getIsTruck());}").checkTrue(group());
            new Here("Unit", 549).given(body, "{  return ((java.lang.String[])$2)[0];}").checkFalse(group());
            new Here("Unit", 549).given(body, "{  return ((org.ognl.test.objects.Messages)((org.ognl.test.objects.Simple)$2).getMessages()).format(\"Testing\",  ($w) ((org.ognl.test.objects.Simple)$2)..getOne(),  ($w) ((org.ognl.test.objects.Simple)$2)..getTwo(),  ($w) ((org.ognl.test.objects.Simple)$2)..getThree());}").checkTrue(group());
            new Here("Unit", 549).given(body, "{  return ((java.lang.String[])((org.ognl.test.objects.Indexed)$2).getValues())[0];}").checkFalse(group());
            new Here("Unit", 549).given(body, "{  return  ($w) (((org.ognl.test.objects.Simple)$2)..getFloatValue());}").checkTrue(group());
            new Here("Unit", 549).given(body, "{  return ((org.ognl.test.objects.Simple)$2)..getStringValue();}").checkTrue(group());
            new Here("Unit", 549).given(body, "{  return ((org.ognl.test.objects.IndexedMapObject)((org.ognl.test.enhance.TestExpressionCompiler)$2).getObject()).getProperty();}").checkFalse(group());
            new Here("Unit", 549).given(body, "{  return ((org.ognl.test.objects.Indexed)$2)..getTitle(((java.util.List)((org.ognl.test.objects.Indexed)$2).getList()).size());}").checkTrue(group());
            new Here("Unit", 549).given(body, "{  return  ($w) (((org.ognl.test.objects.Root)$2)..getTheInt() / 100.0);}").checkTrue(group());
            new Here("Unit", 549).given(body, "{  return ((org.ognl.test.objects.Inherited)$2)..getMyString();}").checkTrue(group());
            new Here("Unit", 549).given(body, "{  return java.util.Arrays.asList( new Object[] {  ($w) (((org.ognl.test.objects.Root)$2)..getIndex() + 1)});}").checkTrue(group());
            new Here("Unit", 549).given(body, "{  return ognl.OgnlOps.booleanValue(((org.ognl.test.objects.Simple)$2)..getBooleanValue()) ? (java.lang.String) ref1($$) : (java.lang.String) ref2($$);}").checkTrue(group());
            new Here("Unit", 549).given(body, "{  return  ($w) (((java.util.Map)((org.ognl.test.objects.Root)$2).getMap()).get(org.ognl.test.objects.Root.SIZE_STRING));}").checkFalse(group());
            new Here("Unit", 549).given(body, "{  return new org.ognl.test.objects.Simple( ($w) new String[5]);}").checkFalse(group());
            new Here("Unit", 549).given(body, "{  return  ($w) ((ognl.OgnlOps.equal( ($w) (((org.ognl.test.objects.Root)$2)..getProperty() ), ($w)  ((org.ognl.test.objects.Root)$2)..getProperty())));}").checkTrue(group());
            new Here("Unit", 549).given(body, "{  return  ($w) ((ognl.OgnlOps.booleanValue((java.lang.Object) ref2($$)) ?  ($w) (((java.lang.Number)$1.get(\"x\")).doubleValue()) :  ($w) ((java.lang.Object) ref2($$))));}").checkFalse(group());
            new Here("Unit", 549).given(body, "{ ((org.ognl.test.objects.Indexed)$2)..setValues(ref1($$), \"xxxx\"); return  ($w) (null);}").checkTrue(group());
            new Here("Unit", 549).given(body, "{  return  ($w) (((java.lang.Integer)((org.ognl.test.objects.Root)$2)..getGenericIndex()).intValue() - 1);}").checkTrue(group());
            new Here("Unit", 549).given(body, "{  return new Integer[] { (java.lang.Integer) ref1($$), (java.lang.Integer) ref2($$), (java.lang.Integer) ref3($$)};}").checkFalse(group());
            new Here("Unit", 549).given(body, "{  return  ($w) ((((org.ognl.test.objects.Bean2)((org.ognl.test.objects.Root)$2).getProperty()).getBean3().getValue() % 2 == 0));}").checkFalse(group());
            new Here("Unit", 549).given(body, "{  return  ($w) (((org.ognl.test.objects.Simple)$2)..isEditorDisabled());}").checkTrue(group());
            new Here("Unit", 549).given(body, "{  return  ($w) (((java.lang.Number)((java.util.List)((org.ognl.test.objects.Indexed)$2).getList()).get(2)).longValue());}").checkFalse(group());
            new Here("Unit", 549).given(body, "{  return  ($w) (((java.util.Map)((org.ognl.test.objects.Root)$2).getMap()).size() * ((java.lang.Integer)((org.ognl.test.objects.Root)$2)..getGenericIndex()).intValue());}").checkTrue(group());
            new Here("Unit", 549).given(body, "{  return ((org.ognl.test.objects.Indexed)$2)..getValues();}").checkTrue(group());
            new Here("Unit", 549).given(body, "{  return  ($w) ((((org.ognl.test.objects.Bean2)((org.ognl.test.objects.Root)$2).getProperty()).getBean3().getValue() >= 24));}").checkFalse(group());
            new Here("Unit", 549).given(body, "{  return  ($w) (((org.ognl.test.objects.BaseIndexed)((org.ognl.test.objects.Root)$2).getIndexer()).getLine(((org.ognl.test.objects.Root)$2)..getIndex()));}").checkTrue(group());
            new Here("Unit", 549).given(body, "{  return ((org.ognl.test.objects.Messages)((org.ognl.test.objects.Simple)$2).getMessages()).format(\"ShowAllCount\",  ($w) ((org.ognl.test.objects.Simple)$2)..getOne());}").checkTrue(group());
            new Here("Unit", 549).given(body, "{  return ognl.OgnlOps.booleanValue((java.lang.Integer) ref1($$)) ? (org.ognl.test.objects.Entry[]) ref2($$) : (org.ognl.test.objects.Entry[]) ref3($$);}").checkFalse(group());
            new Here("Unit", 549).given(body, "{  return java.util.Arrays.asList( new Object[] {  ($w) (((org.ognl.test.objects.Root)$2)..getTheInt() + 1)});}").checkTrue(group());
            new Here("Unit", 549).given(body, "{  return new String[] { (java.lang.String) ref1($$), (java.lang.String) ref2($$)};}").checkFalse(group());
            new Here("Unit", 549).given(body, "{  return  ($w) ((ognl.OgnlOps.equal( ($w) (((java.util.Map)((org.ognl.test.objects.Root)$2).getIndexedProperty(\"nested\")).size() + 1 ), ($w)  ((org.ognl.test.objects.Root)$2)..getGenericIndex())));}").checkTrue(group());
            new Here("Unit", 549).given(body, "{  return  ($w) (((org.ognl.test.objects.Root)$2).getList().size());}").checkFalse(group());
            new Here("Unit", 549).given(body, "{  return  ($w) (((org.ognl.test.objects.MethodTestMethods)((org.ognl.test.objects.Simple)$2).getTestMethods()).avg((java.lang.Iterable) ref1($$)));}").checkFalse(group());
            new Here("Unit", 549).given(body, "{  return  ($w) (((ognl.OgnlOps.booleanValue(((org.ognl.test.objects.Root)$2)..getRenderNavigation()) ? 0 : 1) + ((java.util.Map)((org.ognl.test.objects.Root)$2).getMap()).size()) * ((org.ognl.test.objects.Root)$2)..getTheInt());}").checkTrue(group());
            new Here("Unit", 549).given(body, "{  return ((org.ognl.test.objects.MethodTestMethods)((org.ognl.test.objects.Simple)$2).getTestMethods()).showList(((org.ognl.test.objects.Simple)$2).getTestMethods().getStringArray());}").checkFalse(group());
            new Here("Unit", 549).given(body, "{  return  ($w) ((! ognl.OgnlOps.booleanValue((ognl.OgnlOps.booleanValue(ref1($$)) ?  ($w) ref1($$) :  ($w) (java.lang.Boolean) ref2($$))) ));}").checkFalse(group());
            new Here("Unit", 549).given(body, "{  return new String[10];}").checkFalse(group());
            new Here("Unit", 549).given(body, "{  return  ($w) (((org.ognl.test.objects.Root)$2).getMap().get(\"s\" + \"i\" + \"ze\"));}").checkFalse(group());
            new Here("Unit", 549).given(body, "{  return ((org.ognl.test.objects.Simple)$2);}").checkFalse(group());
            new Here("Unit", 549).given(body, "{  return  ($w) (((org.ognl.test.objects.Simple)$2)..getIntValue());}").checkTrue(group());
            new Here("Unit", 549).given(body, "{  return  ($w) (((org.ognl.test.objects.Simple)$2)..isDisabled());}").checkTrue(group());
            new Here("Unit", 549).given(body, "{  return  ($w) (org.ognl.test.MethodTest#getA().isProperty());}").checkFalse(group());
            new Here("Unit", 549).given(body, "{  return  ($w) ((ognl.OgnlOps.greater( ($w) (((org.ognl.test.objects.Root)$2)..getObjectIndex() ), ($w)  0)));}").checkTrue(group());
            new Here("Unit", 549).given(body, "{  return new org.ognl.test.objects.Simple[5];}").checkFalse(group());
            new Here("Unit", 549).given(body, "{  return  ($w) (((org.ognl.test.objects.Simple)$2)..getValueIsTrue(((org.ognl.test.objects.Simple)$2)..getRootValue()));}").checkTrue(group());
            new Here("Unit", 549).given(body, "{  return  ($w) (((int[])((org.ognl.test.objects.Root)$2).getMap().get(\"array\"))[0]);}").checkFalse(group());
            new Here("Unit", 549).given(body, "{  return java.util.Arrays.asList( new Object[] {  ($w) (new org.ognl.test.objects.MenuItem(\"Home\", \"Main\", java.util.Arrays.asList( new Object[] {  ($w) (new org.ognl.test.objects.MenuItem(\"Help\", \"Help\")),  ($w) (new org.ognl.test.objects.MenuItem(\"Contact\", \"Contact\"))}))),  ($w) (new org.ognl.test.objects.MenuItem(\"UserList\", ((org.ognl.test.objects.Root)$2).getMessages().getMessage(\"menu.members\"))),  ($w) (new org.ognl.test.objects.MenuItem(\"account/BetSlipList\", ((org.ognl.test.objects.Root)$2).getMessages().getMessage(\"menu.account\"), java.util.Arrays.asList( new Object[] {  ($w) (new org.ognl.test.objects.MenuItem(\"account/BetSlipList\", \"My Bets\")),  ($w) (new org.ognl.test.objects.MenuItem(\"account/TransactionList\", \"My Transactions\"))}))),  ($w) (new org.ognl.test.objects.MenuItem(\"About\", \"About\")),  ($w) (new org.ognl.test.objects.MenuItem(\"admin/Admin\", ((org.ognl.test.objects.Root)$2).getMessages().getMessage(\"menu.admin\"), java.util.Arrays.asList( new Object[] {  ($w) (new org.ognl.test.objects.MenuItem(\"admin/AddEvent\", \"Add event\")),  ($w) (new org.ognl.test.objects.MenuItem(\"admin/AddResult\", \"Add result\"))})))});}").checkFalse(group());
            new Here("Unit", 549).given(body, "{  return  ($w) (((org.ognl.test.objects.Simple)$2)..getTestValue(org.ognl.test.objects.SimpleEnum.ONE.getValue()));}").checkTrue(group());
            new Here("Unit", 549).given(body, "{  return  ($w) (((java.util.List)((org.ognl.test.objects.Root)$2).getList()).get(0));}").checkFalse(group());
            new Here("Unit", 549).given(body, "{  return ognl.OgnlOps.booleanValue(((org.ognl.test.objects.Simple)$2)..getValueIsTrue( ($w) (! ognl.OgnlOps.booleanValue(false) ))) ? (java.lang.String) ref1($$) : (java.lang.String) ref2($$);}").checkTrue(group());
            new Here("Unit", 549).given(body, "{  return  ($w) ((ognl.OgnlOps.booleanValue((!ognl.OgnlOps.equal( ($w) (((org.ognl.test.objects.Root)$2)..getIndexedStringValue() ), ($w)  null))) ?  ($w) ((((org.ognl.test.objects.Root)$2).getIndexedStringValue().length() > 0)) :  ($w) ((!ognl.OgnlOps.equal( ($w) (((org.ognl.test.objects.Root)$2)..getIndexedStringValue() ), ($w)  null)))));}").checkTrue(group());
            new Here("Unit", 549).given(body, "{  return  ($w) (((org.ognl.test.objects.Root)$2).getMap().get(\"te\" + \"st\"));}").checkFalse(group());
            new Here("Unit", 549).given(body, "{  return  ($w) ((ognl.OgnlOps.booleanValue(ref1($$)) ? ref1($$) : true));}").checkFalse(group());
            new Here("Unit", 549).given(body, "{  return  ($w) ((ognl.OgnlOps.booleanValue(ref1($$)) ? ref1($$) : ref2($$)));}").checkFalse(group());
            new Here("Unit", 549).given(body, "{  return ((org.ognl.test.enhance.TestExpressionCompiler)$2)..getKey();}").checkTrue(group());
            new Here("Unit", 549).given(body, "{  return ((org.ognl.test.objects.Messages)((org.ognl.test.objects.Simple)$2).getMessages()).format(\"ShowAllCount\", (java.lang.Object[]) ref1($$));}").checkFalse(group());
            new Here("Unit", 549).given(body, "{  return ((org.ognl.test.objects.BaseGeneric)$2)..getIds();}").checkTrue(group());
            new Here("Unit", 549).given(body, "{  return  ($w) (((org.ognl.test.objects.ListSourceImpl)$2)..addValue(((org.ognl.test.objects.ListSourceImpl)$2)..getName()));}").checkTrue(group());
            new Here("Unit", 549).given(body, "{  return ((org.ognl.test.objects.MethodTestMethods)((org.ognl.test.objects.Simple)$2).getTestMethods()).argsTest1((java.lang.Object[]) ref1($$));}").checkFalse(group());
            new Here("Unit", 549).given(body, "{  return  ($w) (((org.ognl.test.objects.Simple)$2)..getBooleanValue());}").checkTrue(group());
            new Here("Unit", 549).given(body, "{  return ((org.ognl.test.objects.MethodTestMethods)((org.ognl.test.objects.Simple)$2).getTestMethods()).argsTest2((java.util.List) ref1($$));}").checkFalse(group());
            new Here("Unit", 549).given(body, "{  return  ($w) ((ognl.OgnlOps.less( ($w) (((java.util.Map)((org.ognl.test.objects.Root)$2).getIndexedProperty(\"nested\")).size() + 1 ), ($w)  ((org.ognl.test.objects.Root)$2)..getGenericIndex())));}").checkTrue(group());
            new Here("Unit", 549).given(body, "{  return ((org.ognl.test.objects.Simple)$2).getTestMethods().testProperty();}").checkFalse(group());
            new Here("Unit", 549).given(body, "{  return new org.ognl.test.objects.Simple(new Object[5]);}").checkFalse(group());
            new Here("Unit", 549).given(body, "{  return ((org.ognl.test.objects.GenericRoot)$2).getCracker().getParam();}").checkFalse(group());
            new Here("Unit", 549).given(body, "{  return  ($w) ((ognl.OgnlOps.booleanValue((!ognl.OgnlOps.equal( ($w) (((org.ognl.test.objects.Root)$2)..getTestString() ), ($w)  null))) ?  ($w) ((! ognl.OgnlOps.booleanValue(false) )) :  ($w) ((!ognl.OgnlOps.equal( ($w) (((org.ognl.test.objects.Root)$2)..getTestString() ), ($w)  null)))));}").checkTrue(group());
            new Here("Unit", 549).given(body, "{  return ((org.ognl.test.objects.Root)$2)..getMap();}").checkTrue(group());
            new Here("Unit", 549).given(body, "{  return ((org.ognl.test.objects.MethodTestMethods)((org.ognl.test.objects.Simple)$2).getTestMethods()).argsTest3((java.util.List) ref1($$));}").checkFalse(group());
            new Here("Unit", 549).given(body, "{  return ((org.ognl.test.objects.Bean2)((org.ognl.test.objects.Root)$2).getMap().get(\"value\")).getId();}").checkFalse(group());
            new Here("Unit", 549).given(body, "{  return  ($w) (((org.ognl.test.objects.Simple)$2).getTestMethods().getBean(\"TestBean\"));}").checkFalse(group());
            new Here("Unit", 549).given(body, "{  return  ($w) (((java.util.Map)((org.ognl.test.objects.Bean1)$2).getBean2().getBean3().getMap()).get(((java.lang.String)$1.get(\"key\"))));}").checkFalse(group());
            new Here("Unit", 549).given(body, "{  return  ($w) (((org.ognl.test.objects.Indexed)((org.ognl.test.objects.Indexed)$2)).getProperty(\"hoodak\"));}").checkFalse(group());
            new Here("Unit", 549).given(body, "{  return ((org.ognl.test.objects.Messages)((org.ognl.test.objects.Simple)$2).getMessages()).format(\"ShowAllCount\",  ($w) ((org.ognl.test.objects.Simple)$2)..getOne(),  ($w) ((org.ognl.test.objects.Simple)$2)..getTwo());}").checkTrue(group());
            new Here("Unit", 549).given(body, "{  return ((org.ognl.test.objects.MethodTestMethods)((org.ognl.test.objects.Simple)$2).getTestMethods()).showStringList((java.lang.String[]) ref3($$));}").checkFalse(group());
            new Here("Unit", 549).given(body, "{  return  ($w) ((ognl.OgnlOps.equal( ($w) (((org.ognl.test.objects.SimpleNumeric)$2)..getBudget() % Double.parseDouble(((org.ognl.test.objects.SimpleNumeric)$2)..getTableSize()) ), ($w)  0)));}").checkTrue(group());
            new Here("Unit", 549).given(body, "{  return  ($w) (((org.ognl.test.objects.Root)$2).getMap().get(\"test\"));}").checkFalse(group());
            new Here("Unit", 549).given(body, "{  return ((org.ognl.test.objects.Indexed)$2).getValues();}").checkFalse(group());
            new Here("Unit", 549).given(body, "{  return java.util.Arrays.asList( new Object[0]);}").checkFalse(group());
            new Here("Unit", 549).given(body, "{  return ((org.ognl.test.objects.MethodTestMethods)((org.ognl.test.objects.Simple)$2).getTestMethods()).showList((java.lang.Object[]) ref1($$));}").checkFalse(group());
            new Here("Unit", 549).given(body, "{  return  ($w) (((org.ognl.test.objects.SimpleNumeric)$2)..getBudget() - ((org.ognl.test.objects.SimpleNumeric)$2)..getTimeBilled());}").checkTrue(group());
            new Here("Unit", 549).given(body, "{  return  ($w) ((((java.lang.Integer)((org.ognl.test.objects.Root)$2)..getGenericIndex()).intValue() % 3 == 0));}").checkTrue(group());
            new Here("Unit", 549).given(body, "{  return ((org.ognl.test.objects.Bean1)$2)..getBean2();}").checkTrue(group());
            new Here("Unit", 549).given(body, "{  return ((org.ognl.test.objects.Simple)$2)..getDisplayValue(((org.ognl.test.objects.Simple)$2).getMethodsTest().getAllowDisplay());}").checkTrue(group());
            new Here("Unit", 549).given(body, "{  return  ($w) ((! ognl.OgnlOps.booleanValue(((org.ognl.test.objects.Root)$2).getBean2().isPageBreakAfter()) ));}").checkFalse(group());
            body = body.replaceAll("\\.\\.", ".");
        }
        // System.out.println("Getter Body: ===================================\n" + body);
        valueGetter.setBody(body);
        newClass.addMethod(valueGetter);
        return body;
    }

    public String createLocalReference(OgnlContext context, String expression, Class type) {
        String referenceName = "ref" + context.incrementLocalReferenceCounter();
        context.addLocalReference(referenceName, new LocalReferenceImpl(referenceName, expression, type));
        String castString = "";
        if (!type.isPrimitive()) {
            castString = "(" + ExpressionCompiler.getCastString(type) + ") ";
        }
        return castString + referenceName + "($$)";
    }

    void createLocalReferences(OgnlContext context, ClassPool pool, CtClass clazz, CtClass objClass, CtClass[] params) throws CannotCompileException, NotFoundException {
        Map referenceMap = context.getLocalReferences();
        if (referenceMap == null || referenceMap.size() < 1) {
            return;
        }
        Iterator it = referenceMap.values().iterator();
        while (it.hasNext()) {
            LocalReference ref = (LocalReference) it.next();
            String widener = ref.getType().isPrimitive() ? " " : " ($w) ";
            String body = "{";
            body += " return  " + widener + ref.getExpression() + ";";
            body += "}";
            if (body.indexOf("..") >= 0) {
                new Here("Unit", 590).given(body, "{ return   ($w) \"No\";}").checkFalse(group());
                new Here("Unit", 590).given(body, "{ return   ($w) ((org.ognl.test.objects.Root)$2)..getWidth();}").checkTrue(group());
                new Here("Unit", 590).given(body, "{ return   ($w) (java.lang.String)ognl.OgnlOps.convertValue(\"two\",java.lang.String.class);}").checkFalse(group());
                new Here("Unit", 590).given(body, "{ return   ((java.lang.Float)ognl.OgnlOps#convertValue(\"10.56\",java.lang.Float.class, true)).floatValue();}").checkFalse(group());
                new Here("Unit", 590).given(body, "{ return   ((java.lang.Integer)ognl.OgnlOps#convertValue(null,java.lang.Integer.class, true)).intValue();}").checkFalse(group());
                new Here("Unit", 590).given(body, "{ return   ($w) (java.lang.String)ognl.OgnlOps.convertValue(2,java.lang.String.class);}").checkFalse(group());
                new Here("Unit", 590).given(body, "{ return   ($w) ognl.OgnlOps.returnValue(($w)$1.put(\"x\",new java.lang.Integer(99)), ($w)((java.lang.Number)$1.get(\"x\")));}").checkFalse(group());
                new Here("Unit", 590).given(body, "{ return   ($w) (java.lang.Object[])ognl.OgnlOps#toArray(new String[0], java.lang.Object.class, true);}").checkFalse(group());
                new Here("Unit", 590).given(body, "{ return   ($w) ((org.ognl.test.objects.Root)$2)..getMap().put(\"newValue\", $3);}").checkTrue(group());
                new Here("Unit", 590).given(body, "{ return   ((java.lang.Integer)ognl.OgnlOps.convertValue(3,java.lang.Integer.class, true)).intValue();}").checkFalse(group());
                new Here("Unit", 590).given(body, "{ return   ($w) Boolean.FALSE;}").checkFalse(group());
                new Here("Unit", 590).given(body, "{ return   ($w) (java.util.List)ognl.OgnlOps#convertValue(java.util.Arrays.asList( new Object[] {  ($w) (((org.ognl.test.objects.Simple)$2)..getOne())}),java.util.List.class);}").checkTrue(group());
                new Here("Unit", 590).given(body, "{ return   ($w) \"currentSortNone\";}").checkFalse(group());
                new Here("Unit", 590).given(body, "{ return   ($w) \"INA\";}").checkFalse(group());
                new Here("Unit", 590).given(body, "{ return   ($w) (java.math.BigDecimal)ognl.OgnlOps#convertValue($3,java.math.BigDecimal.class);}").checkFalse(group());
                new Here("Unit", 590).given(body, "{ return   ($w) \"currentSortDesc\";}").checkFalse(group());
                new Here("Unit", 590).given(body, "{ return   ($w) \"toggle\";}").checkFalse(group());
                new Here("Unit", 590).given(body, "{ return   ($w) (int[])ognl.OgnlOps#toArray($3,int.class);}").checkFalse(group());
                new Here("Unit", 590).given(body, "{ return   ($w) \"othernot\";}").checkFalse(group());
                new Here("Unit", 590).given(body, "{ return   ($w) (java.lang.Object[])ognl.OgnlOps#toArray(java.util.Arrays.asList( new Object[] {  ($w) (((org.ognl.test.objects.Simple)$2)..getOne())}), java.lang.Object.class, true);}").checkTrue(group());
                new Here("Unit", 590).given(body, "{ return   ($w) (java.lang.Object[])ognl.OgnlOps#toArray(((org.ognl.test.objects.Simple)$2).getTestMethods().getStringList(), java.lang.Object.class, true);}").checkFalse(group());
                new Here("Unit", 590).given(body, "{ return   ($w) '-';}").checkFalse(group());
                new Here("Unit", 590).given(body, "{ return   ((org.ognl.test.objects.Root)$2)..isDisabled();}").checkTrue(group());
                new Here("Unit", 590).given(body, "{ return   ((java.lang.Integer)ognl.OgnlOps.convertValue(4,java.lang.Integer.class, true)).intValue();}").checkFalse(group());
                new Here("Unit", 590).given(body, "{ return   ($w) new org.ognl.test.objects.Entry[] {  ($w) (new org.ognl.test.objects.Entry()),  ($w) (new org.ognl.test.objects.Entry())};}").checkFalse(group());
                new Here("Unit", 590).given(body, "{ return   ((java.lang.Boolean)ognl.OgnlOps#convertValue($3,java.lang.Boolean.class, true)).booleanValue();}").checkFalse(group());
                new Here("Unit", 590).given(body, "{ return   ($w) \"tabHeader\";}").checkFalse(group());
                new Here("Unit", 590).given(body, "{ return   ($w) (java.lang.String)ognl.OgnlOps#convertValue('a',java.lang.String.class);}").checkFalse(group());
                new Here("Unit", 590).given(body, "{ return   ((java.lang.Float)ognl.OgnlOps#convertValue($3,java.lang.Float.class, true)).floatValue();}").checkFalse(group());
                new Here("Unit", 590).given(body, "{ return   ($w) (java.lang.String)ognl.OgnlOps#convertValue($3,java.lang.String.class);}").checkFalse(group());
                new Here("Unit", 590).given(body, "{ return   ($w) (java.lang.String)ognl.OgnlOps#convertValue(((org.ognl.test.objects.Bean2)((org.ognl.test.objects.Root)$2).getProperty()).getBean3().getMap().get(\"bar\"),java.lang.String.class);}").checkFalse(group());
                new Here("Unit", 590).given(body, "{ return   ($w) (java.lang.String)ognl.OgnlOps.convertValue(\"one\",java.lang.String.class);}").checkFalse(group());
                new Here("Unit", 590).given(body, "{ return   (! ognl.OgnlOps.booleanValue(false) );}").checkFalse(group());
                new Here("Unit", 590).given(body, "{ return   ($w) (java.io.Serializable[])ognl.OgnlOps#toArray($3,java.io.Serializable.class);}").checkFalse(group());
                new Here("Unit", 590).given(body, "{ return   ($w) ((org.ognl.test.objects.Root)$2)..getMap().get(\"someMissingKey\");}").checkTrue(group());
                new Here("Unit", 590).given(body, "{ return   ($w) ((java.util.Map)$2)..get(\"someMissingKey\");}").checkTrue(group());
                new Here("Unit", 590).given(body, "{ return   ($w) (java.lang.Object) ref1($$);}").checkFalse(group());
                new Here("Unit", 590).given(body, "{ return   ($w) (java.lang.Object[])ognl.OgnlOps#toArray(((org.ognl.test.objects.Simple)$2).getTestMethods().getObjectList(), java.lang.Object.class, true);}").checkFalse(group());
                new Here("Unit", 590).given(body, "{ return   ($w) ((org.ognl.test.objects.Root)$2)..getReadonly();}").checkTrue(group());
                new Here("Unit", 590).given(body, "{ return   ($w) (java.lang.Integer)ognl.OgnlOps.convertValue(2,java.lang.Integer.class);}").checkFalse(group());
                new Here("Unit", 590).given(body, "{ return   ($w) (java.lang.String)ognl.OgnlOps.convertValue(1,java.lang.String.class);}").checkFalse(group());
                new Here("Unit", 590).given(body, "{ return   ($w) ((java.util.Map)$2)..get(\"newValue\");}").checkTrue(group());
                new Here("Unit", 590).given(body, "{ return   (! ognl.OgnlOps.booleanValue((((org.ognl.test.objects.Root)$2)..getReadonly())) );}").checkTrue(group());
                new Here("Unit", 590).given(body, "{ return   ($w) ((org.ognl.test.objects.Root)$2)..getObjectIndex();}").checkTrue(group());
                new Here("Unit", 590).given(body, "{ return   ($w) \"second\";}").checkFalse(group());
                new Here("Unit", 590).given(body, "{ return   ($w) (java.lang.String)ognl.OgnlOps#convertValue(((org.ognl.test.objects.Root)$2)..getGenericIndex(),java.lang.String.class);}").checkTrue(group());
                new Here("Unit", 590).given(body, "{ return   ($w) (java.lang.String[])ognl.OgnlOps#toArray(((org.ognl.test.objects.Simple)$2).getTestMethods().getStringList().toArray((java.lang.Object[]) ref2($$)), java.lang.String.class, true);}").checkFalse(group());
                new Here("Unit", 590).given(body, "{ return   2;}").checkFalse(group());
                new Here("Unit", 590).given(body, "{ return   ($w) (java.lang.String)ognl.OgnlOps#convertValue(null,java.lang.String.class);}").checkFalse(group());
                new Here("Unit", 590).given(body, "{ return   ($w) (java.lang.Iterable)ognl.OgnlOps#convertValue(java.util.Arrays.asList( new Object[] {  ($w) (5),  ($w) (5)}),java.lang.Iterable.class);}").checkFalse(group());
                new Here("Unit", 590).given(body, "{ return   ((java.lang.Integer)ognl.OgnlOps#convertValue(55,java.lang.Integer.class, true)).intValue();}").checkFalse(group());
                new Here("Unit", 590).given(body, "{ return   ($w) ((org.ognl.test.objects.Root)$2)..getNullObject();}").checkTrue(group());
                new Here("Unit", 590).given(body, "{ return   ($w) ((java.util.Map)$2)..get(\"newValue2\");}").checkTrue(group());
                new Here("Unit", 590).given(body, "{ return   ($w) (ognl.OgnlOps.booleanValue((!ognl.OgnlOps.equal( ($w) (((org.ognl.test.objects.Root)$2)..getSelected() ), ($w)  null))) ?  ($w) ((ognl.OgnlOps.equal( ($w) (((org.ognl.test.objects.Root)$2).getCurrLocale().toString() ), ($w)  ((org.ognl.test.objects.Root)$2).getSelected().toString()))) :  ($w) ((!ognl.OgnlOps.equal( ($w) (((org.ognl.test.objects.Root)$2)..getSelected() ), ($w)  null))));}").checkTrue(group());
                new Here("Unit", 590).given(body, "{ return   ($w) (java.lang.String)ognl.OgnlOps#convertValue('x',java.lang.String.class);}").checkFalse(group());
                new Here("Unit", 590).given(body, "{ return   ($w) ((org.ognl.test.objects.Root)$2)..getMap().get(\"newValue\");}").checkTrue(group());
                new Here("Unit", 590).given(body, "{ return   ($w) \"currentSortAsc\";}").checkFalse(group());
                new Here("Unit", 590).given(body, "{ return   ((java.lang.Integer)ognl.OgnlOps#convertValue(((org.ognl.test.objects.Root$A)((org.ognl.test.objects.Root)$2).getA()).methodOfA(((org.ognl.test.objects.Root)$2)..getB()) - 1,java.lang.Integer.class, true)).intValue();}").checkTrue(group());
                new Here("Unit", 590).given(body, "{ return   ($w) ((java.util.Map)$2)..put(\"newValue2\",  ($w) 987);}").checkTrue(group());
                new Here("Unit", 590).given(body, "{ return   ($w) (java.lang.String)ognl.OgnlOps#convertValue('=',java.lang.String.class);}").checkFalse(group());
                new Here("Unit", 590).given(body, "{ return   0;}").checkFalse(group());
                new Here("Unit", 590).given(body, "{ return   ($w) \"Yes\";}").checkFalse(group());
                new Here("Unit", 590).given(body, "{ return   ($w) (java.lang.Object[])ognl.OgnlOps#toArray(java.util.Arrays.asList( new Object[] {  ($w) (((org.ognl.test.objects.Simple)$2)..getOne()),  ($w) (((org.ognl.test.objects.Simple)$2)..getTwo())}), java.lang.Object.class, true);}").checkTrue(group());
                new Here("Unit", 590).given(body, "{ return   ($w) \"toggle toggleSelected\";}").checkFalse(group());
                new Here("Unit", 590).given(body, "{ return   ((java.lang.Integer)ognl.OgnlOps#convertValue(2,java.lang.Integer.class, true)).intValue();}").checkFalse(group());
                new Here("Unit", 590).given(body, "{ return   ((org.ognl.test.objects.Root)$2)..isPrintDelivery();}").checkTrue(group());
                new Here("Unit", 590).given(body, "{ return   99;}").checkFalse(group());
                new Here("Unit", 590).given(body, "{ return   ($w) \"noborder\";}").checkFalse(group());
                new Here("Unit", 590).given(body, "{ return   ((java.lang.Integer)ognl.OgnlOps#convertValue($3,java.lang.Integer.class, true)).intValue();}").checkFalse(group());
                new Here("Unit", 590).given(body, "{ return   ($w) (java.math.BigInteger)ognl.OgnlOps#convertValue($3,java.math.BigInteger.class);}").checkFalse(group());
                new Here("Unit", 590).given(body, "{ return   ($w) \"ACT\";}").checkFalse(group());
                new Here("Unit", 590).given(body, "{ return   ($w) \"first\";}").checkFalse(group());
                new Here("Unit", 590).given(body, "{ return   101;}").checkFalse(group());
                new Here("Unit", 590).given(body, "{ return   ($w) (java.lang.String)ognl.OgnlOps#convertValue((ognl.OgnlOps.booleanValue((java.lang.String) ref10($$)) ? (java.lang.String) ref11($$) : (java.lang.String) ref12($$)) + \"Icon\",java.lang.String.class);}").checkFalse(group());
                new Here("Unit", 590).given(body, "{ return   ($w) (java.lang.Integer)ognl.OgnlOps.convertValue(\"1\",java.lang.Integer.class);}").checkFalse(group());
                new Here("Unit", 590).given(body, "{ return   ($w) (java.lang.Integer)ognl.OgnlOps.convertValue(\"3\",java.lang.Integer.class);}").checkFalse(group());
                new Here("Unit", 590).given(body, "{ return   ($w) ((java.text.DateFormat)org.ognl.test.PropertyTest.DATETIME_FORMAT).format(((org.ognl.test.objects.Root)$2)..getTestDate());}").checkTrue(group());
                new Here("Unit", 590).given(body, "{ return   ($w) \"disabled\";}").checkFalse(group());
                new Here("Unit", 590).given(body, "{ return   ($w) \"here\";}").checkFalse(group());
                new Here("Unit", 590).given(body, "{ return   ($w) \"\";}").checkFalse(group());
                body = body.replaceAll("\\.\\.", ".");
            }
            // System.out.println("adding method " + ref.getName() + " with body:\n" + body + " and return type: " + ref.getType());
            CtMethod method = new CtMethod(pool.get(getCastString(ref.getType())), ref.getName(), params, clazz);
            method.setBody(body);
            clazz.addMethod(method);
            it.remove();
        }
    }

    protected String generateSetter(OgnlContext context, CtClass newClass, CtClass objClass, ClassPool pool, CtMethod valueSetter, Node expression, Object root) throws Exception {
        if (ExpressionNode.class.isInstance(expression) || ASTConst.class.isInstance(expression)) {
            throw new UnsupportedCompilationException("Can't compile expression/constant setters.");
        }
        context.setRoot(root);
        context.remove(PRE_CAST);
        String body;
        String setterCode = expression.toSetSourceString(context, root);
        String castExpression = (String) context.get(PRE_CAST);
        if (setterCode == null || setterCode.trim().length() < 1) {
            throw new UnsupportedCompilationException("Can't compile null setter body.");
        }
        if (root == null) {
            throw new UnsupportedCompilationException("Can't compile setters with a null root object.");
        }
        String pre = getRootExpression(expression, root, context);
        String noRoot = (String) context.remove("_noRoot");
        if (noRoot != null) {
            pre = "";
        }
        createLocalReferences(context, pool, newClass, objClass, valueSetter.getParameterTypes());
        body = "{" + (castExpression != null ? castExpression : "") + pre + setterCode + ";}";
        if (body.indexOf("..") >= 0) {
            new Here("Unit", 639).given(body, "{((java.util.Map)$2)..put(\"newValue\", $3);}").checkTrue(group());
            new Here("Unit", 639).given(body, "{java.lang.Math#max(ref3($$), ref4($$));}").checkFalse(group());
            new Here("Unit", 639).given(body, "{((java.util.Map)((java.util.Map)((java.util.Map)$2).get(\"nested\")).get(\"deep\")).put(\"last\", $3);}").checkFalse(group());
            new Here("Unit", 639).given(body, "{((int[])((org.ognl.test.objects.Root)$2).getArray())[((org.ognl.test.objects.Root)$2)..getObjectIndex().intValue()]=((java.lang.Integer)ognl.OgnlOps.convertValue($3,java.lang.Integer.class, true)).intValue();}").checkTrue(group());
            new Here("Unit", 639).given(body, "{((org.ognl.test.objects.IndexedSetObject$Container)((org.ognl.test.objects.IndexedSetObject)((org.ognl.test.objects.IndexedSetObject)$2)).getThing(\"x\")).setVal(ref1($$));}").checkFalse(group());
            new Here("Unit", 639).given(body, "{((java.util.List)((java.util.List)((org.ognl.test.objects.Root)$2).getBooleanValues()).get(((org.ognl.test.objects.Root)$2)..getIndex1())).set(((org.ognl.test.objects.Root)$2)..getIndex2(), $3);}").checkTrue(group());
            new Here("Unit", 639).given(body, "{((org.ognl.test.objects.ListSourceImpl)$2)..addValue(((org.ognl.test.objects.ListSourceImpl)$2)..getName());}").checkTrue(group());
            new Here("Unit", 639).given(body, "{((org.ognl.test.objects.TestImpl)((org.ognl.test.objects.Root)$2).getMyTest()).getTheMap().put(\"key\", $3);}").checkFalse(group());
            new Here("Unit", 639).given(body, "{((org.ognl.test.objects.Simple)$2)..setValues((java.lang.String) ref1($$), ref2($$), ref3($$));}").checkTrue(group());
            new Here("Unit", 639).given(body, "{((org.ognl.test.objects.Root)$2)..format(\"key\",  ($w) ((org.ognl.test.objects.Root)$2)..getIntValue());}").checkTrue(group());
            new Here("Unit", 639).given(body, "{new java.lang.Boolean(((org.ognl.test.objects.Root)$2)..isOk(org.ognl.test.objects.SimpleEnum.ONE, (java.lang.String) ref2($$)));}").checkTrue(group());
            new Here("Unit", 639).given(body, "{((int[])((int[])$2))[1]=((java.lang.Integer)ognl.OgnlOps.convertValue($3,java.lang.Integer.class, true)).intValue();}").checkFalse(group());
            new Here("Unit", 639).given(body, "{((org.ognl.test.objects.Simple)$2)..setIntValue(ref1($$));}").checkTrue(group());
            new Here("Unit", 639).given(body, "{((org.ognl.test.objects.Indexed)((org.ognl.test.objects.Indexed)$2)).setProperty(\"hoodak\", $3);}").checkFalse(group());
            new Here("Unit", 639).given(body, "{new java.lang.Boolean(((org.ognl.test.objects.Simple)$2)..isDisabled());}").checkTrue(group());
            new Here("Unit", 639).given(body, "{((java.util.List)((java.util.List)((org.ognl.test.objects.Root)$2).getTab().getSearchCriteriaSelections()).get(((org.ognl.test.objects.Root)$2)..getIndex1())).set(((org.ognl.test.objects.Root)$2)..getIndex2(), $3);}").checkTrue(group());
            new Here("Unit", 639).given(body, "{((java.util.Map)$2)..put(\"list\", $3);}").checkTrue(group());
            new Here("Unit", 639).given(body, "{((org.ognl.test.objects.Bean3)((org.ognl.test.objects.Root)$2).getMap().get(\"bar\")).setValue(ref1($$));}").checkFalse(group());
            new Here("Unit", 639).given(body, "{((java.util.List)((org.ognl.test.objects.Root)$2).getList()).set(0, $3);}").checkFalse(group());
            new Here("Unit", 639).given(body, "{((java.util.List)((org.ognl.test.objects.Root)$2).getMyMap().get(\"list\")).set(1, $3);}").checkFalse(group());
            new Here("Unit", 639).given(body, "{org.ognl.test.objects.Root#getStaticInt();}").checkFalse(group());
            new Here("Unit", 639).given(body, "{java.lang.Integer.MAX_VALUE;}").checkFalse(group());
            new Here("Unit", 639).given(body, "{((org.ognl.test.PropertySetterTest$TestObject)((org.ognl.test.PropertySetterTest)$2).getInterfaceObject()).setProperty((java.lang.String) ref1($$));}").checkFalse(group());
            new Here("Unit", 639).given(body, "{((org.ognl.test.objects.BaseObjectIndexed)((org.ognl.test.objects.BaseObjectIndexed)$2)).setAttribute(\"foo\", $3);}").checkFalse(group());
            new Here("Unit", 639).given(body, "{((org.ognl.test.objects.Root)$2)..setStringValue((java.lang.String) ref1($$));}").checkTrue(group());
            new Here("Unit", 639).given(body, "{((org.ognl.test.objects.BaseGeneric)$2)..setIds((java.io.Serializable[]) ref1($$));}").checkTrue(group());
            new Here("Unit", 639).given(body, "{((java.util.List)((org.ognl.test.objects.Root)$2).getSettableList()).set(0, $3);}").checkFalse(group());
            new Here("Unit", 639).given(body, "{((org.ognl.test.objects.Simple)$2)..setStringValue((java.lang.String) ref1($$));}").checkTrue(group());
            new Here("Unit", 639).given(body, "{((org.ognl.test.objects.Root)$2).getMap().put(\"te\" + \"st\", $3);}").checkFalse(group());
            new Here("Unit", 639).given(body, "{((org.ognl.test.objects.BaseObjectIndexed)((org.ognl.test.objects.BaseObjectIndexed)((org.ognl.test.objects.BaseObjectIndexed)$2)).getAttribute(\"other\")).getAttributes().put(\"bar\", $3);}").checkFalse(group());
            new Here("Unit", 639).given(body, "{((int[])((org.ognl.test.objects.Root)$2).getMyMap().get(\"array\"))[0]=((java.lang.Integer)ognl.OgnlOps.convertValue($3,java.lang.Integer.class, true)).intValue();}").checkFalse(group());
            new Here("Unit", 639).given(body, "{((org.ognl.test.objects.Root)$2).getMap().put(\"test\", $3);}").checkFalse(group());
            new Here("Unit", 639).given(body, "{if(ognl.OgnlOps.booleanValue(((org.ognl.test.objects.Root)$2)..getMap().get(\"newValue\"))){((org.ognl.test.objects.Root)$2)..getMap().put(\"aKey\", $3); } ;}").checkTrue(group());
            new Here("Unit", 639).given(body, "{((org.ognl.test.objects.Root)$2)..setArray((int[]) ref1($$));}").checkTrue(group());
            new Here("Unit", 639).given(body, "{((org.ognl.test.objects.BaseObjectIndexed)((org.ognl.test.objects.BaseObjectIndexed)$2)).setAttribute(\"bar\", $3);}").checkFalse(group());
            new Here("Unit", 639).given(body, "{((org.ognl.test.objects.Root)$2).getMap().put(\"newValue\", $3);}").checkFalse(group());
            new Here("Unit", 639).given(body, "{((org.ognl.test.objects.Bean3)((org.ognl.test.objects.Bean1)$2).getBean2().getBean3()).setIndexedValue(25, $3);}").checkFalse(group());
            new Here("Unit", 639).given(body, "{((java.util.List)((org.ognl.test.objects.Root)$2).getSettableList()).set(2, $3);}").checkFalse(group());
            new Here("Unit", 639).given(body, "{new java.lang.Integer(((org.ognl.test.objects.Root)$2).getList().size());}").checkFalse(group());
            new Here("Unit", 639).given(body, "{((boolean[])((org.ognl.test.objects.Root)$2).getBooleanArray())[((org.ognl.test.objects.Root)$2)..getObjectIndex().intValue()]=((java.lang.Boolean)ognl.OgnlOps.convertValue($3,java.lang.Boolean.class, true)).booleanValue();}").checkTrue(group());
            new Here("Unit", 639).given(body, "{((org.ognl.test.objects.Root)$2).getMyMap().put(\"test\", $3);}").checkFalse(group());
            new Here("Unit", 639).given(body, "{((org.ognl.test.objects.BaseObjectIndexed)$2).getAttributes().put(\"bar\", $3);}").checkFalse(group());
            new Here("Unit", 639).given(body, "{((java.util.List)((org.ognl.test.objects.Root)$2).getMap().get(\"list\")).set(1, $3);}").checkFalse(group());
            new Here("Unit", 639).given(body, "{((java.util.List)((org.ognl.test.objects.Root)$2).getList()).set(((org.ognl.test.objects.Root)$2)..getIndex(), $3);}").checkTrue(group());
            new Here("Unit", 639).given(body, "{org.ognl.test.objects.Root.class;}").checkFalse(group());
            new Here("Unit", 639).given(body, "{((org.ognl.test.objects.PropertyHolder)$2)..setValue((java.lang.String) ref1($$));}").checkTrue(group());
            new Here("Unit", 639).given(body, "{((org.ognl.test.objects.Root)$2).getMap().put(\"s\" + \"i\" + \"ze\", $3);}").checkFalse(group());
            new Here("Unit", 639).given(body, "{((org.ognl.test.objects.Root)$2).getMap();}").checkFalse(group());
            new Here("Unit", 639).given(body, "{((org.ognl.test.objects.Simple)$2)..setBigDecValue((java.math.BigDecimal) ref1($$));}").checkTrue(group());
            new Here("Unit", 639).given(body, "{((java.util.List)((org.ognl.test.objects.Root)$2).getList()).set(((org.ognl.test.objects.Root)$2)..getObjectIndex().intValue(), $3);}").checkTrue(group());
            new Here("Unit", 639).given(body, "{((org.ognl.test.objects.Component)$2).getToDisplay().setPictureUrl((java.lang.String) ref1($$));}").checkFalse(group());
            new Here("Unit", 639).given(body, "{((boolean[])((org.ognl.test.objects.Root)$2).getBooleanArray())[((org.ognl.test.objects.Root)((org.ognl.test.objects.Root)$2).getSelf()).getObjectIndex().intValue()]=((java.lang.Boolean)ognl.OgnlOps.convertValue($3,java.lang.Boolean.class, true)).booleanValue();}").checkFalse(group());
            new Here("Unit", 639).given(body, "{new java.lang.Boolean(((org.ognl.test.objects.FirstBean)$2)..hasChildren(\"aaa\"));}").checkTrue(group());
            new Here("Unit", 639).given(body, "{((org.ognl.test.PropertySetterTest$TestObject)$2)..setProperty((java.lang.String) ref1($$));}").checkTrue(group());
            new Here("Unit", 639).given(body, "{new java.lang.Boolean(((org.ognl.test.objects.BaseBean)$2).getTwo().hasChildren(\"aa\"));}").checkFalse(group());
            new Here("Unit", 639).given(body, "{new java.lang.Integer(((java.lang.Object)$2)..hashCode());}").checkTrue(group());
            new Here("Unit", 639).given(body, "{System#getProperty(\"java.specification.version\");}").checkFalse(group());
            new Here("Unit", 639).given(body, "{new java.lang.Boolean(((org.ognl.test.objects.BaseBean)$2).getTwo().hasChildren((java.lang.String) ref2($$)));}").checkFalse(group());
            new Here("Unit", 639).given(body, "{((java.util.Map)((org.ognl.test.objects.Bean1)$2).getBean2().getBean3().getMap()).put(((java.lang.String)$1.get(\"key\")), $3);}").checkFalse(group());
            new Here("Unit", 639).given(body, "{((org.ognl.test.objects.Simple)$2)..setBooleanValue(ref1($$));}").checkTrue(group());
            new Here("Unit", 639).given(body, "{((int[])((org.ognl.test.objects.Root)$2).getMap().get(\"array\"))[0]=((java.lang.Integer)ognl.OgnlOps.convertValue($3,java.lang.Integer.class, true)).intValue();}").checkFalse(group());
            new Here("Unit", 639).given(body, "{((java.util.Map)((org.ognl.test.objects.Root)$2).getMap()).put(org.ognl.test.objects.Root.SIZE_STRING, $3);}").checkFalse(group());
            new Here("Unit", 639).given(body, "{((org.ognl.test.objects.BaseObjectIndexed)((org.ognl.test.objects.BaseObjectIndexed)((org.ognl.test.objects.BaseObjectIndexed)$2)).getAttribute(\"other\")).setAttribute(\"bar\", $3);}").checkFalse(group());
            new Here("Unit", 639).given(body, "{((org.ognl.test.objects.Root)$2)..format(\"key\",  ($w) ((org.ognl.test.objects.Root)$2).getMap());}").checkTrue(group());
            new Here("Unit", 639).given(body, "{((org.ognl.test.objects.Indexed)$2)..setValues(ref2($$), \"xxxx\");}").checkTrue(group());
            new Here("Unit", 639).given(body, "{((int[])((org.ognl.test.objects.Root)$2).getArray())[ognl.OgnlOps#getIntValue(((org.ognl.test.objects.Root)$2)..getGenericIndex().toString())]=((java.lang.Integer)ognl.OgnlOps.convertValue($3,java.lang.Integer.class, true)).intValue();}").checkTrue(group());
            new Here("Unit", 639).given(body, "{((org.ognl.test.objects.Root)$2)..setDisabled(ref1($$));}").checkTrue(group());
            new Here("Unit", 639).given(body, "{((org.ognl.test.objects.Root)$2)..format(\"key\", ((org.ognl.test.objects.Root)$2)..getArray());}").checkTrue(group());
            new Here("Unit", 639).given(body, "{((org.ognl.test.objects.Root)$2)..setBooleanValue(ref1($$));}").checkTrue(group());
            new Here("Unit", 639).given(body, "{java.lang.Class#forName(\"java.lang.Object\");}").checkFalse(group());
            new Here("Unit", 639).given(body, "{((java.lang.String[])((java.lang.String[])$2))[1]=ognl.OgnlOps.convertValue($3,java.lang.String.class);}").checkFalse(group());
            new Here("Unit", 639).given(body, "{((org.ognl.test.objects.Simple)$2)..setFloatValue(ref1($$));}").checkTrue(group());
            new Here("Unit", 639).given(body, "{ognl.OgnlOps.booleanValue((java.lang.Object) ref3($$)) ? (java.lang.Object) ref3($$) : (java.lang.Object) ref4($$);}").checkFalse(group());
            new Here("Unit", 639).given(body, "{new java.lang.Boolean(org.ognl.test.MethodTest#getA().isProperty());}").checkFalse(group());
            new Here("Unit", 639).given(body, "{((org.ognl.test.objects.Root)$2)..setSelectedList((java.util.List) ref1($$));}").checkTrue(group());
            new Here("Unit", 639).given(body, "{((org.ognl.test.objects.Root)$2)..getObjectIndex() instanceof java.lang.Object;}").checkTrue(group());
            new Here("Unit", 639).given(body, "{((org.ognl.test.objects.Root)$2)..setIntValue(ref1($$));}").checkTrue(group());
            new Here("Unit", 639).given(body, "{((org.ognl.test.objects.Simple)$2)..setBigIntValue((java.math.BigInteger) ref1($$));}").checkTrue(group());
            new Here("Unit", 639).given(body, "{((org.ognl.test.objects.Root)$2).getMyMap();}").checkFalse(group());
            new Here("Unit", 639).given(body, "{((org.ognl.test.objects.Root)$2)..setOpenTransitionWin(ref1($$));}").checkTrue(group());
            new Here("Unit", 639).given(body, "{new java.lang.Boolean(((org.ognl.test.objects.Simple)$2)..isEditorDisabled());}").checkTrue(group());
            new Here("Unit", 639).given(body, "{((org.ognl.test.objects.IFormComponent)((org.ognl.test.objects.Root)$2).getMap().get(\"comp\")).getForm().setClientId((java.lang.String) ref1($$));}").checkFalse(group());
            new Here("Unit", 639).given(body, "{((java.lang.String[])$2)[0]=ognl.OgnlOps.convertValue($3,java.lang.String.class);}").checkFalse(group());
            body = body.replaceAll("\\.\\.", ".");
        }
        // System.out.println("Setter Body: ===================================\n" + body);
        valueSetter.setBody(body);
        newClass.addMethod(valueSetter);
        return body;
    }

    /**
     * Fail safe getter creation when normal compilation fails.
     *
     * @param clazz
     *          The javassist class the new method should be attached to.
     * @param valueGetter
     *          The method definition the generated code will be contained within.
     * @param node
     *          The root expression node.
     * @return The generated source string for this method, the method will still be
     *          added via the javassist API either way so this is really a convenience
     *          for exception reporting / debugging.
     * @throws Exception
     *          If a javassist error occurs.
     */
    protected String generateOgnlGetter(CtClass clazz, CtMethod valueGetter, CtField node) throws Exception {
        String body = "return " + node.getName() + ".getValue($1, $2);";
        valueGetter.setBody(body);
        clazz.addMethod(valueGetter);
        return body;
    }

    /**
     * Fail safe setter creation when normal compilation fails.
     *
     * @param clazz
     *          The javassist class the new method should be attached to.
     * @param valueSetter
     *          The method definition the generated code will be contained within.
     * @param node
     *          The root expression node.
     * @return The generated source string for this method, the method will still be
     *          added via the javassist API either way so this is really a convenience
     *          for exception reporting / debugging.
     * @throws Exception
     *          If a javassist error occurs.
     */
    protected String generateOgnlSetter(CtClass clazz, CtMethod valueSetter, CtField node) throws Exception {
        String body = node.getName() + ".setValue($1, $2, $3);";
        valueSetter.setBody(body);
        clazz.addMethod(valueSetter);
        return body;
    }

    /**
     * Creates a {@link ClassLoader} instance compatible with the javassist classloader and normal
     * OGNL class resolving semantics.
     *
     * @param context
     *          The current execution context.
     *
     * @return The created {@link ClassLoader} instance.
     */
    protected EnhancedClassLoader getClassLoader(OgnlContext context) {
        EnhancedClassLoader ret = (EnhancedClassLoader) _loaders.get(context.getClassResolver());
        if (ret != null) {
            return ret;
        }
        ClassLoader classLoader = new ContextClassLoader(OgnlContext.class.getClassLoader(), context);
        ret = new EnhancedClassLoader(classLoader);
        _loaders.put(context.getClassResolver(), ret);
        return ret;
    }

    /**
     * Loads a new class definition via javassist for the specified class.
     *
     * @param searchClass
     *          The class to load.
     * @return The javassist class equivalent.
     *
     * @throws NotFoundException When the class definition can't be found.
     */
    protected CtClass getCtClass(Class searchClass) throws NotFoundException {
        return _pool.get(searchClass.getName());
    }

    /**
     * Gets either a new or existing {@link ClassPool} for use in compiling javassist
     * classes.  A new class path object is inserted in to the returned {@link ClassPool} using
     * the passed in <code>loader</code> instance if a new pool needs to be created.
     *
     * @param context
     *          The current execution context.
     * @param loader
     *          The {@link ClassLoader} instance to use - as returned by {@link #getClassLoader(ognl.OgnlContext)}.
     * @return The existing or new {@link ClassPool} instance.
     */
    protected ClassPool getClassPool(OgnlContext context, EnhancedClassLoader loader) {
        if (_pool != null) {
            return _pool;
        }
        _pool = ClassPool.getDefault();
        _pool.insertClassPath(new LoaderClassPath(loader.getParent()));
        return _pool;
    }
}
