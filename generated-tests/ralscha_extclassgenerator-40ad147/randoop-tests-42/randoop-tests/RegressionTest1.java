import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test00501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00501");
        ch.rasc.extclassgenerator.validation.PresenceValidation presenceValidation1 = new ch.rasc.extclassgenerator.validation.PresenceValidation("digits");
    }

    @Test
    public void test00502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00502");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.data.Model");
        modelFieldBean2.setAllowNull((java.lang.Boolean) false);
        java.lang.String str5 = modelFieldBean2.getName();
        modelFieldBean2.setDateFormat("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        modelFieldBean2.setUnique((java.lang.Boolean) false);
        java.lang.Boolean boolean10 = modelFieldBean2.getPersist();
        modelFieldBean2.setConvert("digits");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(boolean10);
    }

    @Test
    public void test00503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00503");
        ch.rasc.extclassgenerator.validation.EmailValidation emailValidation1 = new ch.rasc.extclassgenerator.validation.EmailValidation("/hi!/");
    }

    @Test
    public void test00504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00504");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        java.lang.String str6 = modelFieldBean2.getMapping();
        modelFieldBean2.setCritical((java.lang.Boolean) true);
        java.lang.String str9 = modelFieldBean2.getCalculate();
        java.lang.Boolean boolean10 = modelFieldBean2.getCritical();
        ch.rasc.extclassgenerator.validation.PresenceValidation presenceValidation12 = new ch.rasc.extclassgenerator.validation.PresenceValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
        modelFieldBean2.setDefaultValue((java.lang.Object) presenceValidation12);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test00505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00505");
        ch.rasc.extclassgenerator.ModelAnnotationProcessor modelAnnotationProcessor0 = new ch.rasc.extclassgenerator.ModelAnnotationProcessor();
        java.util.Set<java.lang.String> strSet1 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        javax.lang.model.SourceVersion sourceVersion2 = modelAnnotationProcessor0.getSupportedSourceVersion();
        javax.lang.model.SourceVersion sourceVersion3 = modelAnnotationProcessor0.getSupportedSourceVersion();
        java.util.Set<java.lang.String> strSet4 = modelAnnotationProcessor0.getSupportedOptions();
        javax.lang.model.element.Element element5 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror6 = null;
        javax.lang.model.element.ExecutableElement executableElement7 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable9 = modelAnnotationProcessor0.getCompletions(element5, annotationMirror6, executableElement7, "Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
        javax.lang.model.SourceVersion sourceVersion10 = modelAnnotationProcessor0.getSupportedSourceVersion();
        javax.annotation.processing.ProcessingEnvironment processingEnvironment11 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelAnnotationProcessor0.init(processingEnvironment11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Tool provided null ProcessingEnvironment");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertTrue("'" + sourceVersion2 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion2.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertTrue("'" + sourceVersion3 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion3.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(wildcardIterable9);
        org.junit.Assert.assertTrue("'" + sourceVersion10 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion10.equals(javax.lang.model.SourceVersion.RELEASE_6));
    }

    @Test
    public void test00506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00506");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.read;
        apiObject0.destroy = "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});/";
        apiObject0.read = "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});";
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00507");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("hi!");
        java.lang.String str2 = hasManyAssociation1.getAssociationKey();
        hasManyAssociation1.setAssociationKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        hasManyAssociation1.setAssociationKey("");
        hasManyAssociation1.setAssociationKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        hasManyAssociation1.setName("Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[],proxy:{type:\"direct\",directFn:hi!}});");
        java.lang.Boolean boolean11 = hasManyAssociation1.getAutoLoad();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(boolean11);
    }

    @Test
    public void test00508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00508");
        ch.rasc.extclassgenerator.validation.DigitsValidation digitsValidation3 = new ch.rasc.extclassgenerator.validation.DigitsValidation("digits", (int) (byte) 0, 32);
        int int4 = digitsValidation3.getFraction();
        int int5 = digitsValidation3.getInteger();
        int int6 = digitsValidation3.getInteger();
        int int7 = digitsValidation3.getInteger();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test00509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00509");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("digits", (java.lang.Long) 32L, (java.lang.Long) 10L);
    }

    @Test
    public void test00510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00510");
        ch.rasc.extclassgenerator.validation.FormatValidation formatValidation2 = new ch.rasc.extclassgenerator.validation.FormatValidation("Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});", "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]}});");
    }

    @Test
    public void test00511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00511");
        ch.rasc.extclassgenerator.validation.DigitsValidation digitsValidation3 = new ch.rasc.extclassgenerator.validation.DigitsValidation("creditCardNumber", 35, (int) (byte) 1);
    }

    @Test
    public void test00512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00512");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        java.lang.String str2 = hasOneAssociation1.getName();
        java.lang.String str3 = hasOneAssociation1.getGetterName();
        hasOneAssociation1.setPrimaryKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str6 = hasOneAssociation1.getName();
        hasOneAssociation1.setSetterName("json");
        java.lang.String str9 = hasOneAssociation1.getAssociationKey();
        hasOneAssociation1.setName("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]}});");
        java.lang.String str12 = hasOneAssociation1.getModel();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test00513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00513");
        ch.rasc.extclassgenerator.validation.InclusionValidation inclusionValidation2 = new ch.rasc.extclassgenerator.validation.InclusionValidation("hasOne", "ch.rasc.extclassgenerator.ModelAnnotationProcessor");
        java.lang.String str3 = inclusionValidation2.getList();
        java.lang.String str4 = inclusionValidation2.getList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ch.rasc.extclassgenerator.ModelAnnotationProcessor" + "'", str3, "ch.rasc.extclassgenerator.ModelAnnotationProcessor");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ch.rasc.extclassgenerator.ModelAnnotationProcessor" + "'", str4, "ch.rasc.extclassgenerator.ModelAnnotationProcessor");
    }

    @Test
    public void test00514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00514");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        referenceBean0.setRole("Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
        referenceBean0.setParent("/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/");
        java.lang.Class<?> wildcardClass10 = referenceBean0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00515");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        java.lang.String str6 = modelFieldBean2.getMapping();
        java.lang.String str7 = modelFieldBean2.getName();
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray14 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList12);
        modelFieldBean2.setDepends((java.util.List<java.lang.String>) strList12);
        java.lang.Object obj16 = modelFieldBean2.getDefaultValue();
        java.lang.String str17 = modelFieldBean2.getCalculate();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test00516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00516");
        ch.rasc.extclassgenerator.ModelType modelType1 = null;
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("ch.rasc.extclassgenerator.ModelAnnotationProcessor", modelType1);
    }

    @Test
    public void test00517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00517");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getChild();
        java.lang.String str2 = referenceBean0.getChild();
        referenceBean0.setAssociation("creditCardNumber");
        referenceBean0.setType("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        java.lang.String str7 = referenceBean0.getParent();
        boolean boolean8 = referenceBean0.typeOnly();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00518");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("");
        java.lang.String str2 = hasOneAssociation1.getPrimaryKey();
        java.lang.String str3 = hasOneAssociation1.getType();
        java.lang.String str4 = hasOneAssociation1.getName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hasOne" + "'", str3, "hasOne");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00519");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getRole();
        referenceBean0.setChild("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        referenceBean0.setAssociation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        referenceBean0.setRole("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        java.lang.String str9 = referenceBean0.getAssociation();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});" + "'", str9, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
    }

    @Test
    public void test00520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00520");
        ch.rasc.extclassgenerator.ModelValidation modelValidation1 = null;
        ch.rasc.extclassgenerator.IncludeValidation includeValidation2 = ch.rasc.extclassgenerator.IncludeValidation.NONE;
        // The following exception was thrown during execution in test generation
        try {
            ch.rasc.extclassgenerator.validation.AbstractValidation abstractValidation3 = ch.rasc.extclassgenerator.validation.AbstractValidation.createValidation("json", modelValidation1, includeValidation2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + includeValidation2 + "' != '" + ch.rasc.extclassgenerator.IncludeValidation.NONE + "'", includeValidation2.equals(ch.rasc.extclassgenerator.IncludeValidation.NONE));
    }

    @Test
    public void test00521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00521");
        ch.rasc.extclassgenerator.validation.EmailValidation emailValidation1 = new ch.rasc.extclassgenerator.validation.EmailValidation("");
    }

    @Test
    public void test00522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00522");
        ch.rasc.extclassgenerator.validation.InclusionValidation inclusionValidation2 = new ch.rasc.extclassgenerator.validation.InclusionValidation("Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});", "hasMany");
    }

    @Test
    public void test00523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00523");
        ch.rasc.extclassgenerator.validation.ExclusionValidation exclusionValidation2 = new ch.rasc.extclassgenerator.validation.ExclusionValidation("Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[],proxy:{type:\"direct\",directFn:hi!}});", "Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
    }

    @Test
    public void test00524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00524");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        java.lang.String str6 = modelFieldBean2.getMapping();
        java.lang.String str7 = modelFieldBean2.getName();
        java.lang.Boolean boolean8 = modelFieldBean2.getUnique();
        java.lang.Boolean boolean9 = modelFieldBean2.getPersist();
        java.lang.String str10 = modelFieldBean2.getType();
        ch.rasc.extclassgenerator.PartialDataOptionsBean partialDataOptionsBean11 = new ch.rasc.extclassgenerator.PartialDataOptionsBean();
        java.lang.Boolean boolean12 = partialDataOptionsBean11.getAssociated();
        java.lang.Boolean boolean13 = partialDataOptionsBean11.getChanges();
        modelFieldBean2.setReference((java.lang.Object) partialDataOptionsBean11);
        modelFieldBean2.setCritical((java.lang.Boolean) true);
        java.lang.Boolean boolean17 = modelFieldBean2.getAllowBlank();
        modelFieldBean2.setAllowBlank((java.lang.Boolean) false);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str10, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertNull(boolean17);
    }

    @Test
    public void test00525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00525");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("/\\/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});\\//", (java.lang.Integer) 32, (java.lang.Integer) 100);
    }

    @Test
    public void test00526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00526");
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation4 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal5 = rangeValidation4.getMin();
        java.math.BigDecimal bigDecimal6 = rangeValidation4.getMax();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation13 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal14 = rangeValidation13.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation18 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal19 = rangeValidation18.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation20 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal14, bigDecimal19);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation26 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal27 = rangeValidation26.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation31 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal32 = rangeValidation31.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation33 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal27, bigDecimal32);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation38 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal39 = rangeValidation38.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation43 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal44 = rangeValidation43.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation45 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal39, bigDecimal44);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation46 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal32, bigDecimal39);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation47 = new ch.rasc.extclassgenerator.validation.RangeValidation("digits", bigDecimal14, bigDecimal32);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation54 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal55 = rangeValidation54.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation59 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal60 = rangeValidation59.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation61 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal55, bigDecimal60);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation67 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal68 = rangeValidation67.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation72 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal73 = rangeValidation72.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation74 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal68, bigDecimal73);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation79 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal80 = rangeValidation79.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation84 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal85 = rangeValidation84.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation86 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal80, bigDecimal85);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation87 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal73, bigDecimal80);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation88 = new ch.rasc.extclassgenerator.validation.RangeValidation("digits", bigDecimal55, bigDecimal73);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation92 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal93 = rangeValidation92.getMin();
        java.math.BigDecimal bigDecimal94 = rangeValidation92.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation95 = new ch.rasc.extclassgenerator.validation.RangeValidation("length", bigDecimal55, bigDecimal94);
        java.math.BigDecimal bigDecimal96 = rangeValidation95.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation97 = new ch.rasc.extclassgenerator.validation.RangeValidation("belongsTo", bigDecimal32, bigDecimal96);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation98 = new ch.rasc.extclassgenerator.validation.RangeValidation("hasOne", bigDecimal6, bigDecimal96);
        java.math.BigDecimal bigDecimal99 = rangeValidation98.getMin();
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(bigDecimal44);
        org.junit.Assert.assertNotNull(bigDecimal55);
        org.junit.Assert.assertNotNull(bigDecimal60);
        org.junit.Assert.assertNotNull(bigDecimal68);
        org.junit.Assert.assertNotNull(bigDecimal73);
        org.junit.Assert.assertNotNull(bigDecimal80);
        org.junit.Assert.assertNotNull(bigDecimal85);
        org.junit.Assert.assertNotNull(bigDecimal93);
        org.junit.Assert.assertNotNull(bigDecimal94);
        org.junit.Assert.assertNotNull(bigDecimal96);
        org.junit.Assert.assertNotNull(bigDecimal99);
    }

    @Test
    public void test00527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00527");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        boolean boolean4 = allDataOptionsBean0.hasAnyProperties();
        allDataOptionsBean0.setCritical((java.lang.Boolean) true);
        boolean boolean7 = allDataOptionsBean0.hasAnyProperties();
        allDataOptionsBean0.setChanges((java.lang.Boolean) false);
        allDataOptionsBean0.setCritical((java.lang.Boolean) true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00528");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.read = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.destroy = "hi!";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
    }

    @Test
    public void test00529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00529");
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation4 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});", (java.lang.Long) 100L, (java.lang.Long) 100L);
        java.math.BigDecimal bigDecimal5 = rangeValidation4.getMax();
        java.math.BigDecimal bigDecimal6 = rangeValidation4.getMax();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation13 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal14 = rangeValidation13.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation18 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal19 = rangeValidation18.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation20 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal14, bigDecimal19);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation26 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal27 = rangeValidation26.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation31 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal32 = rangeValidation31.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation33 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal27, bigDecimal32);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation38 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal39 = rangeValidation38.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation43 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal44 = rangeValidation43.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation45 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal39, bigDecimal44);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation46 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal32, bigDecimal39);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation47 = new ch.rasc.extclassgenerator.validation.RangeValidation("digits", bigDecimal14, bigDecimal32);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation54 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal55 = rangeValidation54.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation59 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal60 = rangeValidation59.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation61 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal55, bigDecimal60);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation67 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal68 = rangeValidation67.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation72 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal73 = rangeValidation72.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation74 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal68, bigDecimal73);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation79 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal80 = rangeValidation79.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation84 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal85 = rangeValidation84.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation86 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal80, bigDecimal85);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation87 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal73, bigDecimal80);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation88 = new ch.rasc.extclassgenerator.validation.RangeValidation("digits", bigDecimal55, bigDecimal73);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation92 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal93 = rangeValidation92.getMin();
        java.math.BigDecimal bigDecimal94 = rangeValidation92.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation95 = new ch.rasc.extclassgenerator.validation.RangeValidation("length", bigDecimal55, bigDecimal94);
        java.math.BigDecimal bigDecimal96 = rangeValidation95.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation97 = new ch.rasc.extclassgenerator.validation.RangeValidation("belongsTo", bigDecimal32, bigDecimal96);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation98 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[],proxy:{type:\"direct\",directFn:hi!,writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",config:{fields:[]}});\"}}}});", bigDecimal6, bigDecimal96);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(bigDecimal44);
        org.junit.Assert.assertNotNull(bigDecimal55);
        org.junit.Assert.assertNotNull(bigDecimal60);
        org.junit.Assert.assertNotNull(bigDecimal68);
        org.junit.Assert.assertNotNull(bigDecimal73);
        org.junit.Assert.assertNotNull(bigDecimal80);
        org.junit.Assert.assertNotNull(bigDecimal85);
        org.junit.Assert.assertNotNull(bigDecimal93);
        org.junit.Assert.assertNotNull(bigDecimal94);
        org.junit.Assert.assertNotNull(bigDecimal96);
    }

    @Test
    public void test00530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00530");
        ch.rasc.extclassgenerator.validation.FutureValidation futureValidation1 = new ch.rasc.extclassgenerator.validation.FutureValidation("Ext.define(\"ch.rasc.extclassgenerator.validation.PresenceValidation\",{extend:\"Ext.data.Model\",fields:[{name:\"type\",type:\"string\"},{name:\"field\",type:\"string\"}]});");
    }

    @Test
    public void test00531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00531");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        referenceBean0.setType("");
        referenceBean0.setChild("");
        java.lang.String str5 = referenceBean0.getParent();
        java.lang.String str6 = referenceBean0.getRole();
        java.lang.String str7 = referenceBean0.getChild();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test00532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00532");
        ch.rasc.extclassgenerator.validation.FormatValidation formatValidation2 = new ch.rasc.extclassgenerator.validation.FormatValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});", "Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
        java.lang.String str3 = formatValidation2.getField();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});");
    }

    @Test
    public void test00533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00533");
        ch.rasc.extclassgenerator.validation.InclusionValidation inclusionValidation2 = new ch.rasc.extclassgenerator.validation.InclusionValidation("/\\/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});\\//", "Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"debug\",\n    type : \"boolean\"\n  }, {\n    name : \"useSingleQuotes\",\n    type : \"boolean\"\n  }, {\n    name : \"surroundApiWithQuotes\",\n    type : \"boolean\"\n  } ]\n});");
    }

    @Test
    public void test00534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00534");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("range", (java.lang.Long) 100L, (java.lang.Long) 35L);
    }

    @Test
    public void test00535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00535");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean4 = allDataOptionsBean0.getPersist();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        allDataOptionsBean0.setChanges((java.lang.Boolean) false);
        java.lang.Boolean boolean9 = allDataOptionsBean0.getAssociated();
        boolean boolean10 = allDataOptionsBean0.hasAnyProperties();
        boolean boolean11 = allDataOptionsBean0.hasAnyProperties();
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + false + "'", boolean9, false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test00536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00536");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean4 = allDataOptionsBean0.getPersist();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        allDataOptionsBean0.setPersist((java.lang.Boolean) false);
        java.lang.Boolean boolean9 = allDataOptionsBean0.getAssociated();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) true);
        java.lang.Boolean boolean12 = allDataOptionsBean0.getPersist();
        boolean boolean13 = allDataOptionsBean0.hasAnyProperties();
        java.lang.Boolean boolean14 = allDataOptionsBean0.getAssociated();
        boolean boolean15 = allDataOptionsBean0.hasAnyProperties();
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + false + "'", boolean9, false);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + false + "'", boolean12, false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + boolean14 + "' != '" + true + "'", boolean14, true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test00537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00537");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getRole();
        referenceBean0.setInverse("");
        referenceBean0.setChild("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});");
        java.lang.String str7 = referenceBean0.getAssociation();
        java.lang.String str8 = referenceBean0.getInverse();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test00538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00538");
        ch.rasc.extclassgenerator.ModelAnnotationProcessor modelAnnotationProcessor0 = new ch.rasc.extclassgenerator.ModelAnnotationProcessor();
        java.util.Set<java.lang.String> strSet1 = modelAnnotationProcessor0.getSupportedOptions();
        java.util.Set<java.lang.String> strSet2 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        java.util.Set<java.lang.String> strSet3 = modelAnnotationProcessor0.getSupportedOptions();
        java.util.Set<java.lang.String> strSet4 = modelAnnotationProcessor0.getSupportedOptions();
        javax.annotation.processing.ProcessingEnvironment processingEnvironment5 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelAnnotationProcessor0.init(processingEnvironment5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Tool provided null ProcessingEnvironment");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test00539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00539");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("/Ext.data.Model/", (java.lang.Long) 10L, (java.lang.Long) 10L);
    }

    @Test
    public void test00540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00540");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        modelFieldBean2.setDateFormat("hi!");
        java.lang.Boolean boolean8 = modelFieldBean2.getCritical();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean8);
    }

    @Test
    public void test00541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00541");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        java.lang.String str6 = modelFieldBean2.getMapping();
        modelFieldBean2.setConvert("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation10 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        hasOneAssociation10.setInstanceName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setDefaultValue((java.lang.Object) hasOneAssociation10);
        ch.rasc.extclassgenerator.ModelType modelType14 = modelFieldBean2.getModelType();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(modelType14);
    }

    @Test
    public void test00542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00542");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});", "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        java.lang.Boolean boolean3 = modelFieldBean2.getUseNull();
        java.lang.String str4 = modelFieldBean2.getName();
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});" + "'", str4, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
    }

    @Test
    public void test00543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00543");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.read;
        apiObject0.update = "hi!";
        apiObject0.create = "creditCardNumber";
        java.lang.String str8 = apiObject0.destroy;
        java.lang.String str9 = apiObject0.read;
        java.lang.String str10 = apiObject0.update;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test00544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00544");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        java.lang.String str2 = hasOneAssociation1.getName();
        hasOneAssociation1.setInstanceName("");
        java.lang.String str5 = hasOneAssociation1.getSetterName();
        java.lang.String str6 = hasOneAssociation1.getType();
        java.lang.String str7 = hasOneAssociation1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hasOne" + "'", str6, "hasOne");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hasOne" + "'", str7, "hasOne");
    }

    @Test
    public void test00545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00545");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getRole();
        referenceBean0.setChild("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        referenceBean0.setRole("json");
        boolean boolean7 = referenceBean0.typeOnly();
        referenceBean0.setRole("Ext.data.Model");
        referenceBean0.setRole("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});");
        referenceBean0.setAssociation("Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00546");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("");
        java.lang.String str2 = belongsToAssociation1.getInstanceName();
        java.lang.String str3 = belongsToAssociation1.getSetterName();
        java.lang.String str4 = belongsToAssociation1.getGetterName();
        java.lang.String str5 = belongsToAssociation1.getGetterName();
        belongsToAssociation1.setSetterName("ch.rasc.extclassgenerator.PartialDataOptionsBean");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00547");
        ch.rasc.extclassgenerator.validation.CreditCardNumberValidation creditCardNumberValidation1 = new ch.rasc.extclassgenerator.validation.CreditCardNumberValidation("ch.rasc.extclassgenerator.PartialDataOptionsBean");
    }

    @Test
    public void test00548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00548");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        java.lang.String str6 = modelFieldBean2.getMapping();
        java.lang.String str7 = modelFieldBean2.getName();
        modelFieldBean2.setCritical((java.lang.Boolean) true);
        modelFieldBean2.setUseNull((java.lang.Boolean) false);
        modelFieldBean2.setUseNull((java.lang.Boolean) false);
        modelFieldBean2.setName("ch.rasc.extclassgenerator.ModelBean");
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test00549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00549");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("/ch.rasc.extclassgenerator.ModelAnnotationProcessor/", "Ext.data.Model");
        java.util.List<ch.rasc.extclassgenerator.validation.AbstractValidation> abstractValidationList3 = modelFieldBean2.getValidators();
        org.junit.Assert.assertNull(abstractValidationList3);
    }

    @Test
    public void test00550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00550");
        ch.rasc.extclassgenerator.ModelAnnotationProcessor modelAnnotationProcessor0 = new ch.rasc.extclassgenerator.ModelAnnotationProcessor();
        java.util.Set<java.lang.String> strSet1 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        java.util.Set<java.lang.String> strSet2 = modelAnnotationProcessor0.getSupportedOptions();
        javax.lang.model.element.Element element3 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror4 = null;
        javax.lang.model.element.ExecutableElement executableElement5 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable7 = modelAnnotationProcessor0.getCompletions(element3, annotationMirror4, executableElement5, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.util.Set<java.lang.String> strSet8 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        javax.annotation.processing.ProcessingEnvironment processingEnvironment9 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelAnnotationProcessor0.init(processingEnvironment9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Tool provided null ProcessingEnvironment");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(wildcardIterable7);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test00551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00551");
        ch.rasc.extclassgenerator.validation.PastValidation pastValidation1 = new ch.rasc.extclassgenerator.validation.PastValidation("/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/");
        java.lang.String str2 = pastValidation1.getField();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/" + "'", str2, "/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/");
    }

    @Test
    public void test00552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00552");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        allDataOptionsBean0.setChanges((java.lang.Boolean) false);
        allDataOptionsBean0.setPersist((java.lang.Boolean) true);
    }

    @Test
    public void test00553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00553");
        ch.rasc.extclassgenerator.validation.InclusionValidation inclusionValidation2 = new ch.rasc.extclassgenerator.validation.InclusionValidation("", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str3 = inclusionValidation2.getList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
    }

    @Test
    public void test00554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00554");
        ch.rasc.extclassgenerator.validation.FormatValidation formatValidation2 = new ch.rasc.extclassgenerator.validation.FormatValidation("/hasMany/", "Ext.define(\"null\",{extend:\"Ext.data.Model\",idProperty:\"hi!\",fields:[],proxy:{type:\"direct\",idParam:\"hi!\"}});");
    }

    @Test
    public void test00555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00555");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/", (java.lang.Integer) 100, (java.lang.Integer) 0);
    }

    @Test
    public void test00556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00556");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("/\\/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});\\//");
    }

    @Test
    public void test00557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00557");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        modelFieldBean2.setMapping("hi!");
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        modelFieldBean2.setAllowBlank((java.lang.Boolean) false);
        modelFieldBean2.setConvert("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        java.lang.Object obj13 = modelFieldBean2.getDefaultValue();
        java.lang.Boolean boolean14 = modelFieldBean2.getPersist();
        java.lang.String str15 = modelFieldBean2.getMapping();
        modelFieldBean2.setPersist((java.lang.Boolean) false);
        modelFieldBean2.setCritical((java.lang.Boolean) false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test00558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00558");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("hi!");
        java.lang.String str2 = hasManyAssociation1.getAssociationKey();
        hasManyAssociation1.setAssociationKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.Boolean boolean5 = hasManyAssociation1.getAutoLoad();
        java.lang.String str6 = hasManyAssociation1.getPrimaryKey();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00559");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});", "hi!");
        java.lang.String str3 = modelFieldBean2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
    }

    @Test
    public void test00560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00560");
        ch.rasc.extclassgenerator.ModelAnnotationProcessor modelAnnotationProcessor0 = new ch.rasc.extclassgenerator.ModelAnnotationProcessor();
        java.util.Set<java.lang.String> strSet1 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        java.util.Set<java.lang.String> strSet2 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        javax.lang.model.SourceVersion sourceVersion3 = modelAnnotationProcessor0.getSupportedSourceVersion();
        javax.annotation.processing.ProcessingEnvironment processingEnvironment4 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelAnnotationProcessor0.init(processingEnvironment4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Tool provided null ProcessingEnvironment");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + sourceVersion3 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion3.equals(javax.lang.model.SourceVersion.RELEASE_6));
    }

    @Test
    public void test00561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00561");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        referenceBean0.setType("");
        referenceBean0.setChild("");
        referenceBean0.setParent("");
        referenceBean0.setChild("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
        java.lang.String str9 = referenceBean0.getType();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test00562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00562");
        ch.rasc.extclassgenerator.validation.NotBlankValidation notBlankValidation1 = new ch.rasc.extclassgenerator.validation.NotBlankValidation("hi!");
    }

    @Test
    public void test00563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00563");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        ch.rasc.extclassgenerator.validation.GenericValidation genericValidation3 = new ch.rasc.extclassgenerator.validation.GenericValidation("", "json", strMap2);
    }

    @Test
    public void test00564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00564");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("");
        java.lang.String str2 = hasOneAssociation1.getPrimaryKey();
        java.lang.String str3 = hasOneAssociation1.getName();
        java.lang.String str4 = hasOneAssociation1.getSetterName();
        hasOneAssociation1.setAssociationKey("Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00565");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean8 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean8.setConvert("hi!");
        java.lang.Boolean boolean11 = modelFieldBean8.getPersist();
        java.lang.String str12 = modelFieldBean8.getMapping();
        java.lang.String str13 = modelFieldBean8.getName();
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray20 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList18);
        modelFieldBean8.setDepends((java.util.List<java.lang.String>) strList18);
        modelFieldBean2.setDepends((java.util.List<java.lang.String>) strList18);
        modelFieldBean2.setUseNull((java.lang.Boolean) false);
        java.lang.String[] strArray27 = new java.lang.String[] { "", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        modelFieldBean2.setDepends((java.util.List<java.lang.String>) strList28);
        modelFieldBean2.setAllowBlank((java.lang.Boolean) false);
        java.lang.String str33 = modelFieldBean2.getMapping();
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList39 = new java.util.ArrayList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray41 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList39);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray42 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("digits", (java.util.List<java.lang.String>) strList39);
        java.util.List<java.lang.String> strList43 = inclusionValidationArray42.getList();
        modelFieldBean2.setDefaultValue((java.lang.Object) strList43);
        modelFieldBean2.setUnique((java.lang.Boolean) true);
        modelFieldBean2.setName("Ext.data.Model");
        modelFieldBean2.setPersist((java.lang.Boolean) false);
        java.util.List<java.lang.String> strList51 = modelFieldBean2.getDepends();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertNotNull(strList51);
    }

    @Test
    public void test00566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00566");
        ch.rasc.extclassgenerator.ModelValidation modelValidation1 = null;
        ch.rasc.extclassgenerator.IncludeValidation includeValidation2 = null;
        // The following exception was thrown during execution in test generation
        try {
            ch.rasc.extclassgenerator.validation.AbstractValidation abstractValidation3 = ch.rasc.extclassgenerator.validation.AbstractValidation.createValidation("Ext.define(\"null\",{extend:\"Ext.data.Model\",idProperty:\"hi!\",fields:[],proxy:{type:\"direct\",idParam:\"hi!\"}});", modelValidation1, includeValidation2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00567");
        ch.rasc.extclassgenerator.validation.CreditCardNumberValidation creditCardNumberValidation1 = new ch.rasc.extclassgenerator.validation.CreditCardNumberValidation("Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[],proxy:{type:\"direct\",directFn:hi!,writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",config:{fields:[]}});\"}}}});");
    }

    @Test
    public void test00568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00568");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        modelBean0.setIdProperty("");
        modelBean0.setReadMethod("hi!");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation8 = new ch.rasc.extclassgenerator.association.HasManyAssociation("hi!");
        java.lang.String str9 = hasManyAssociation8.getAssociationKey();
        hasManyAssociation8.setAssociationKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        hasManyAssociation8.setAssociationKey("");
        hasManyAssociation8.setAssociationKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelBean0.addAssociation((ch.rasc.extclassgenerator.association.AbstractAssociation) hasManyAssociation8);
        modelBean0.setAutodetectTypes(true);
        boolean boolean19 = modelBean0.isDisablePagingParameters();
        modelBean0.setTotalProperty("Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean22 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelBean0.addField(modelFieldBean22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ModelFieldBean must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00569");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        hasOneAssociation1.setInstanceName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str4 = hasOneAssociation1.getSetterName();
        java.lang.String str5 = hasOneAssociation1.getGetterName();
        java.lang.String str6 = hasOneAssociation1.getName();
        hasOneAssociation1.setSetterName("/\\/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});\\//");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00570");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        modelFieldBean2.setMapping("hi!");
        java.lang.String str7 = modelFieldBean2.getMapping();
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray15 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList13);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray16 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("", (java.util.List<java.lang.String>) strList13);
        modelFieldBean2.setDepends((java.util.List<java.lang.String>) strList13);
        ch.rasc.extclassgenerator.OutputConfig outputConfig18 = new ch.rasc.extclassgenerator.OutputConfig();
        boolean boolean19 = outputConfig18.isDebug();
        ch.rasc.extclassgenerator.OutputFormat outputFormat20 = outputConfig18.getOutputFormat();
        boolean boolean21 = outputConfig18.isDebug();
        outputConfig18.setDebug(false);
        boolean boolean24 = modelFieldBean2.hasOnlyName(outputConfig18);
        modelFieldBean2.setName("length");
        java.lang.Class<?> wildcardClass27 = modelFieldBean2.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(outputFormat20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00571");
        ch.rasc.extclassgenerator.validation.EmailValidation emailValidation1 = new ch.rasc.extclassgenerator.validation.EmailValidation("Ext.define(\"null\",{extend:\"Ext.data.Model\",idProperty:\"hi!\",fields:[],proxy:{type:\"direct\",idParam:\"hi!\"}});");
    }

    @Test
    public void test00572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00572");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        java.lang.String str2 = hasOneAssociation1.getName();
        hasOneAssociation1.setInstanceName("");
        java.lang.String str5 = hasOneAssociation1.getForeignKey();
        java.lang.String str6 = hasOneAssociation1.getGetterName();
        hasOneAssociation1.setAssociationKey("Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});");
        hasOneAssociation1.setGetterName("Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
        java.lang.String str11 = hasOneAssociation1.getName();
        hasOneAssociation1.setName("range");
        java.lang.String str14 = hasOneAssociation1.getSetterName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test00573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00573");
        ch.rasc.extclassgenerator.validation.EmailValidation emailValidation1 = new ch.rasc.extclassgenerator.validation.EmailValidation("ch.rasc.extclassgenerator.ModelBean");
    }

    @Test
    public void test00574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00574");
        ch.rasc.extclassgenerator.validation.NotBlankValidation notBlankValidation1 = new ch.rasc.extclassgenerator.validation.NotBlankValidation("/Ext.data.Model/");
    }

    @Test
    public void test00575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00575");
        ch.rasc.extclassgenerator.validation.EmailValidation emailValidation1 = new ch.rasc.extclassgenerator.validation.EmailValidation("range");
    }

    @Test
    public void test00576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00576");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean8 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean8.setConvert("hi!");
        java.lang.Boolean boolean11 = modelFieldBean8.getPersist();
        java.lang.String str12 = modelFieldBean8.getMapping();
        java.lang.String str13 = modelFieldBean8.getName();
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray20 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList18);
        modelFieldBean8.setDepends((java.util.List<java.lang.String>) strList18);
        modelFieldBean2.setDepends((java.util.List<java.lang.String>) strList18);
        modelFieldBean2.setUseNull((java.lang.Boolean) false);
        java.lang.String[] strArray27 = new java.lang.String[] { "", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        modelFieldBean2.setDepends((java.util.List<java.lang.String>) strList28);
        modelFieldBean2.setAllowNull((java.lang.Boolean) false);
        modelFieldBean2.setName("");
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test00577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00577");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        boolean boolean4 = allDataOptionsBean0.hasAnyProperties();
        allDataOptionsBean0.setCritical((java.lang.Boolean) true);
        boolean boolean7 = allDataOptionsBean0.hasAnyProperties();
        allDataOptionsBean0.setChanges((java.lang.Boolean) false);
        java.lang.Boolean boolean10 = allDataOptionsBean0.getCritical();
        allDataOptionsBean0.setChanges((java.lang.Boolean) true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test00578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00578");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.update = "exclusion";
        java.lang.String str8 = apiObject0.read;
        java.lang.Class<?> wildcardClass9 = apiObject0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00579");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});", (java.lang.Long) 32L, (java.lang.Long) 32L);
    }

    @Test
    public void test00580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00580");
        ch.rasc.extclassgenerator.ModelType modelType1 = null;
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});", modelType1);
        modelFieldBean2.setDateFormat("Ext.define(\"null\",{extend:\"\",config:{fields:[]}});");
    }

    @Test
    public void test00581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00581");
        ch.rasc.extclassgenerator.ModelType modelType1 = null;
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});", modelType1);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray10 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList8);
        java.util.List<java.lang.String> strList11 = inclusionValidationArray10.getList();
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray12 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", strList11);
        modelFieldBean2.setDepends(strList11);
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test00582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00582");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getRole();
        referenceBean0.setChild("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        referenceBean0.setRole("json");
        boolean boolean7 = referenceBean0.typeOnly();
        referenceBean0.setRole("Ext.data.Model");
        referenceBean0.setType("Ext.define(\"null\",{extend:\"\",config:{fields:[]}});");
        java.lang.String str12 = referenceBean0.getType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Ext.define(\"null\",{extend:\"\",config:{fields:[]}});" + "'", str12, "Ext.define(\"null\",{extend:\"\",config:{fields:[]}});");
    }

    @Test
    public void test00583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00583");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Object obj5 = modelFieldBean2.getReference();
        modelFieldBean2.setPersist((java.lang.Boolean) false);
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        ch.rasc.extclassgenerator.ModelType modelType10 = modelFieldBean2.getModelType();
        modelFieldBean2.setCalculate("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});");
        java.lang.Boolean boolean13 = modelFieldBean2.getAllowNull();
        ch.rasc.extclassgenerator.ModelType modelType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelFieldBean2.setModelType(modelType14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(modelType10);
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + true + "'", boolean13, true);
    }

    @Test
    public void test00584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00584");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        modelFieldBean2.setMapping("hi!");
        java.lang.String str7 = modelFieldBean2.getMapping();
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray15 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList13);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray16 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("", (java.util.List<java.lang.String>) strList13);
        modelFieldBean2.setDepends((java.util.List<java.lang.String>) strList13);
        ch.rasc.extclassgenerator.OutputConfig outputConfig18 = new ch.rasc.extclassgenerator.OutputConfig();
        boolean boolean19 = outputConfig18.isDebug();
        ch.rasc.extclassgenerator.OutputFormat outputFormat20 = outputConfig18.getOutputFormat();
        boolean boolean21 = outputConfig18.isDebug();
        outputConfig18.setDebug(false);
        boolean boolean24 = modelFieldBean2.hasOnlyName(outputConfig18);
        modelFieldBean2.setName("length");
        java.util.List<ch.rasc.extclassgenerator.validation.AbstractValidation> abstractValidationList27 = modelFieldBean2.getValidators();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(outputFormat20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(abstractValidationList27);
    }

    @Test
    public void test00585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00585");
        ch.rasc.extclassgenerator.OutputConfig outputConfig0 = new ch.rasc.extclassgenerator.OutputConfig();
        boolean boolean1 = outputConfig0.isSurroundApiWithQuotes();
        boolean boolean2 = outputConfig0.isDebug();
        ch.rasc.extclassgenerator.ModelAnnotationProcessor modelAnnotationProcessor3 = new ch.rasc.extclassgenerator.ModelAnnotationProcessor();
        java.util.Set<java.lang.String> strSet4 = modelAnnotationProcessor3.getSupportedAnnotationTypes();
        boolean boolean5 = outputConfig0.equals((java.lang.Object) strSet4);
        boolean boolean6 = outputConfig0.isSurroundApiWithQuotes();
        ch.rasc.extclassgenerator.LineEnding lineEnding7 = outputConfig0.getLineEnding();
        ch.rasc.extclassgenerator.OutputFormat outputFormat8 = outputConfig0.getOutputFormat();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(lineEnding7);
        org.junit.Assert.assertNull(outputFormat8);
    }

    @Test
    public void test00586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00586");
        ch.rasc.extclassgenerator.validation.PresenceValidation presenceValidation1 = new ch.rasc.extclassgenerator.validation.PresenceValidation("creditCardNumber");
    }

    @Test
    public void test00587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00587");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Object obj5 = modelFieldBean2.getReference();
        modelFieldBean2.setPersist((java.lang.Boolean) false);
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        modelFieldBean2.setAllowBlank((java.lang.Boolean) false);
        modelFieldBean2.setUnique((java.lang.Boolean) true);
        java.lang.String str14 = modelFieldBean2.getType();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str14, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
    }

    @Test
    public void test00588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00588");
        ch.rasc.extclassgenerator.OutputConfig outputConfig0 = new ch.rasc.extclassgenerator.OutputConfig();
        boolean boolean1 = outputConfig0.isSurroundApiWithQuotes();
        boolean boolean2 = outputConfig0.isDebug();
        ch.rasc.extclassgenerator.LineEnding lineEnding3 = outputConfig0.getLineEnding();
        ch.rasc.extclassgenerator.OutputFormat outputFormat4 = outputConfig0.getOutputFormat();
        ch.rasc.extclassgenerator.LineEnding lineEnding5 = outputConfig0.getLineEnding();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(lineEnding3);
        org.junit.Assert.assertNull(outputFormat4);
        org.junit.Assert.assertNull(lineEnding5);
    }

    @Test
    public void test00589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00589");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[],proxy:{type:\"direct\",directFn:hi!}});");
        ch.rasc.extclassgenerator.ModelType modelType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelFieldBean2.setModelType(modelType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00590");
        ch.rasc.extclassgenerator.OutputConfig outputConfig0 = new ch.rasc.extclassgenerator.OutputConfig();
        ch.rasc.extclassgenerator.LineEnding lineEnding1 = outputConfig0.getLineEnding();
        ch.rasc.extclassgenerator.OutputFormat outputFormat2 = outputConfig0.getOutputFormat();
        ch.rasc.extclassgenerator.OutputFormat outputFormat3 = outputConfig0.getOutputFormat();
        outputConfig0.setDebug(false);
        ch.rasc.extclassgenerator.IncludeValidation includeValidation6 = outputConfig0.getIncludeValidation();
        org.junit.Assert.assertNull(lineEnding1);
        org.junit.Assert.assertNull(outputFormat2);
        org.junit.Assert.assertNull(outputFormat3);
        org.junit.Assert.assertNull(includeValidation6);
    }

    @Test
    public void test00591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00591");
        ch.rasc.extclassgenerator.ModelAnnotationProcessor modelAnnotationProcessor0 = new ch.rasc.extclassgenerator.ModelAnnotationProcessor();
        java.util.Set<java.lang.String> strSet1 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        javax.lang.model.SourceVersion sourceVersion2 = modelAnnotationProcessor0.getSupportedSourceVersion();
        javax.lang.model.SourceVersion sourceVersion3 = modelAnnotationProcessor0.getSupportedSourceVersion();
        java.util.Set<java.lang.String> strSet4 = modelAnnotationProcessor0.getSupportedOptions();
        javax.lang.model.element.Element element5 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror6 = null;
        javax.lang.model.element.ExecutableElement executableElement7 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable9 = modelAnnotationProcessor0.getCompletions(element5, annotationMirror6, executableElement7, "Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
        javax.lang.model.element.Element element10 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror11 = null;
        javax.lang.model.element.ExecutableElement executableElement12 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable14 = modelAnnotationProcessor0.getCompletions(element10, annotationMirror11, executableElement12, "digits");
        javax.lang.model.SourceVersion sourceVersion15 = modelAnnotationProcessor0.getSupportedSourceVersion();
        javax.annotation.processing.ProcessingEnvironment processingEnvironment16 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelAnnotationProcessor0.init(processingEnvironment16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Tool provided null ProcessingEnvironment");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertTrue("'" + sourceVersion2 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion2.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertTrue("'" + sourceVersion3 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion3.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(wildcardIterable9);
        org.junit.Assert.assertNotNull(wildcardIterable14);
        org.junit.Assert.assertTrue("'" + sourceVersion15 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion15.equals(javax.lang.model.SourceVersion.RELEASE_6));
    }

    @Test
    public void test00592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00592");
        ch.rasc.extclassgenerator.ModelAnnotationProcessor modelAnnotationProcessor0 = new ch.rasc.extclassgenerator.ModelAnnotationProcessor();
        java.util.Set<java.lang.String> strSet1 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        java.util.Set<java.lang.String> strSet2 = modelAnnotationProcessor0.getSupportedOptions();
        javax.lang.model.element.Element element3 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror4 = null;
        javax.lang.model.element.ExecutableElement executableElement5 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable7 = modelAnnotationProcessor0.getCompletions(element3, annotationMirror4, executableElement5, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        javax.lang.model.element.Element element8 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror9 = null;
        javax.lang.model.element.ExecutableElement executableElement10 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable12 = modelAnnotationProcessor0.getCompletions(element8, annotationMirror9, executableElement10, "json");
        javax.lang.model.element.Element element13 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror14 = null;
        javax.lang.model.element.ExecutableElement executableElement15 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable17 = modelAnnotationProcessor0.getCompletions(element13, annotationMirror14, executableElement15, "");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(wildcardIterable7);
        org.junit.Assert.assertNotNull(wildcardIterable12);
        org.junit.Assert.assertNotNull(wildcardIterable17);
    }

    @Test
    public void test00593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00593");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        java.lang.String str6 = modelFieldBean2.getMapping();
        java.lang.String str7 = modelFieldBean2.getName();
        java.lang.String str8 = modelFieldBean2.getConvert();
        ch.rasc.extclassgenerator.ModelType modelType9 = modelFieldBean2.getModelType();
        modelFieldBean2.setPersist((java.lang.Boolean) false);
        java.util.List<ch.rasc.extclassgenerator.validation.AbstractValidation> abstractValidationList12 = modelFieldBean2.getValidators();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(modelType9);
        org.junit.Assert.assertNull(abstractValidationList12);
    }

    @Test
    public void test00594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00594");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getChild();
        java.lang.String str2 = referenceBean0.getChild();
        referenceBean0.setAssociation("creditCardNumber");
        referenceBean0.setType("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        java.lang.String str7 = referenceBean0.getType();
        boolean boolean8 = referenceBean0.typeOnly();
        java.lang.String str9 = referenceBean0.getRole();
        java.lang.String str10 = referenceBean0.getChild();
        boolean boolean11 = referenceBean0.typeOnly();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});" + "'", str7, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00595");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("hi!");
        hasManyAssociation1.setForeignKey("");
        java.lang.String str4 = hasManyAssociation1.getForeignKey();
        hasManyAssociation1.setAutoLoad((java.lang.Boolean) true);
        java.lang.String str7 = hasManyAssociation1.getModel();
        java.lang.Boolean boolean8 = hasManyAssociation1.getAutoLoad();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test00596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00596");
        ch.rasc.extclassgenerator.validation.CreditCardNumberValidation creditCardNumberValidation1 = new ch.rasc.extclassgenerator.validation.CreditCardNumberValidation("belongsTo");
    }

    @Test
    public void test00597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00597");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("Ext.define(\"null\",{extend:\"\",fields:[]});", (java.lang.Long) 10L, (java.lang.Long) 35L);
    }

    @Test
    public void test00598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00598");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("");
        java.lang.String str2 = belongsToAssociation1.getInstanceName();
        belongsToAssociation1.setGetterName("json");
        java.lang.String str5 = belongsToAssociation1.getSetterName();
        belongsToAssociation1.setForeignKey("Ext.data.Model");
        java.lang.String str8 = belongsToAssociation1.getSetterName();
        java.lang.String str9 = belongsToAssociation1.getGetterName();
        belongsToAssociation1.setAssociationKey("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});/");
        java.lang.String str12 = belongsToAssociation1.getPrimaryKey();
        belongsToAssociation1.setPrimaryKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
        java.lang.String str15 = belongsToAssociation1.getGetterName();
        belongsToAssociation1.setGetterName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "json" + "'", str9, "json");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "json" + "'", str15, "json");
    }

    @Test
    public void test00599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00599");
        ch.rasc.extclassgenerator.validation.CreditCardNumberValidation creditCardNumberValidation1 = new ch.rasc.extclassgenerator.validation.CreditCardNumberValidation("/Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});/");
    }

    @Test
    public void test00600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00600");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        modelBean0.setIdProperty("");
        boolean boolean5 = modelBean0.isDisablePagingParameters();
        modelBean0.setReader("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        java.lang.String[] strArray8 = modelBean0.getHasMany();
        java.lang.String str9 = modelBean0.getUpdateMethod();
        modelBean0.setWriteAllFields((java.lang.Boolean) true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00601");
        ch.rasc.extclassgenerator.validation.DigitsValidation digitsValidation3 = new ch.rasc.extclassgenerator.validation.DigitsValidation("length", (int) (short) -1, 0);
    }

    @Test
    public void test00602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00602");
        ch.rasc.extclassgenerator.validation.NotBlankValidation notBlankValidation1 = new ch.rasc.extclassgenerator.validation.NotBlankValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
    }

    @Test
    public void test00603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00603");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        modelFieldBean2.setMapping("hi!");
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        modelFieldBean2.setAllowBlank((java.lang.Boolean) false);
        java.util.List<ch.rasc.extclassgenerator.validation.AbstractValidation> abstractValidationList11 = modelFieldBean2.getValidators();
        java.lang.String str12 = modelFieldBean2.getConvert();
        modelFieldBean2.setCritical((java.lang.Boolean) true);
        org.junit.Assert.assertNull(abstractValidationList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test00604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00604");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("", (java.lang.Long) 0L, (java.lang.Long) 100L);
    }

    @Test
    public void test00605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00605");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});";
        java.lang.String str6 = apiObject0.destroy;
        apiObject0.create = "/Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});/";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00606");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        boolean boolean2 = referenceBean0.hasAnyProperties();
        referenceBean0.setAssociation("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        java.lang.String str5 = referenceBean0.getInverse();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00607");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        ch.rasc.extclassgenerator.validation.CreditCardNumberValidation creditCardNumberValidation6 = new ch.rasc.extclassgenerator.validation.CreditCardNumberValidation("");
        ch.rasc.extclassgenerator.validation.FormatValidation formatValidation9 = new ch.rasc.extclassgenerator.validation.FormatValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        ch.rasc.extclassgenerator.validation.FutureValidation futureValidation11 = new ch.rasc.extclassgenerator.validation.FutureValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        ch.rasc.extclassgenerator.validation.FormatValidation formatValidation14 = new ch.rasc.extclassgenerator.validation.FormatValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        ch.rasc.extclassgenerator.validation.AbstractValidation[] abstractValidationArray15 = new ch.rasc.extclassgenerator.validation.AbstractValidation[] { creditCardNumberValidation6, formatValidation9, futureValidation11, formatValidation14 };
        java.util.ArrayList<ch.rasc.extclassgenerator.validation.AbstractValidation> abstractValidationList16 = new java.util.ArrayList<ch.rasc.extclassgenerator.validation.AbstractValidation>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<ch.rasc.extclassgenerator.validation.AbstractValidation>) abstractValidationList16, abstractValidationArray15);
        modelFieldBean2.setValidators((java.util.List<ch.rasc.extclassgenerator.validation.AbstractValidation>) abstractValidationList16);
        modelFieldBean2.setAllowBlank((java.lang.Boolean) true);
        modelFieldBean2.setAllowNull((java.lang.Boolean) true);
        java.lang.String str23 = modelFieldBean2.getMapping();
        ch.rasc.extclassgenerator.ModelType modelType24 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelFieldBean2.setModelType(modelType24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(abstractValidationArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test00608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00608");
        ch.rasc.extclassgenerator.ModelAnnotationProcessor modelAnnotationProcessor0 = new ch.rasc.extclassgenerator.ModelAnnotationProcessor();
        java.util.Set<java.lang.String> strSet1 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        javax.lang.model.SourceVersion sourceVersion2 = modelAnnotationProcessor0.getSupportedSourceVersion();
        javax.lang.model.SourceVersion sourceVersion3 = modelAnnotationProcessor0.getSupportedSourceVersion();
        javax.lang.model.element.Element element4 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror5 = null;
        javax.lang.model.element.ExecutableElement executableElement6 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable8 = modelAnnotationProcessor0.getCompletions(element4, annotationMirror5, executableElement6, "json");
        java.util.Set<java.lang.String> strSet9 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        javax.lang.model.element.Element element10 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror11 = null;
        javax.lang.model.element.ExecutableElement executableElement12 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable14 = modelAnnotationProcessor0.getCompletions(element10, annotationMirror11, executableElement12, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        javax.annotation.processing.ProcessingEnvironment processingEnvironment15 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelAnnotationProcessor0.init(processingEnvironment15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Tool provided null ProcessingEnvironment");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertTrue("'" + sourceVersion2 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion2.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertTrue("'" + sourceVersion3 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion3.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(wildcardIterable8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(wildcardIterable14);
    }

    @Test
    public void test00609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00609");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean8 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean8.setConvert("hi!");
        java.lang.Boolean boolean11 = modelFieldBean8.getPersist();
        java.lang.String str12 = modelFieldBean8.getMapping();
        java.lang.String str13 = modelFieldBean8.getName();
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray20 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList18);
        modelFieldBean8.setDepends((java.util.List<java.lang.String>) strList18);
        modelFieldBean2.setDepends((java.util.List<java.lang.String>) strList18);
        modelFieldBean2.setUseNull((java.lang.Boolean) false);
        java.lang.String[] strArray27 = new java.lang.String[] { "", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        modelFieldBean2.setDepends((java.util.List<java.lang.String>) strList28);
        java.lang.Boolean boolean31 = modelFieldBean2.getCritical();
        java.lang.Object obj32 = modelFieldBean2.getReference();
        modelFieldBean2.setAllowBlank((java.lang.Boolean) false);
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation36 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        java.lang.String str37 = hasOneAssociation36.getName();
        hasOneAssociation36.setInstanceName("");
        hasOneAssociation36.setName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setReference((java.lang.Object) "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        ch.rasc.extclassgenerator.ModelType modelType43 = modelFieldBean2.getModelType();
        java.lang.Boolean boolean44 = modelFieldBean2.getUnique();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(boolean31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(modelType43);
        org.junit.Assert.assertNull(boolean44);
    }

    @Test
    public void test00610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00610");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Object obj5 = modelFieldBean2.getReference();
        modelFieldBean2.setPersist((java.lang.Boolean) false);
        modelFieldBean2.setConvert("Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});");
        modelFieldBean2.setUnique((java.lang.Boolean) true);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test00611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00611");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        java.lang.String str6 = modelFieldBean2.getMapping();
        java.lang.String str7 = modelFieldBean2.getName();
        java.lang.Boolean boolean8 = modelFieldBean2.getUnique();
        java.lang.Boolean boolean9 = modelFieldBean2.getPersist();
        java.lang.Object obj10 = modelFieldBean2.getDefaultValue();
        ch.rasc.extclassgenerator.ModelType modelType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelFieldBean2.setModelType(modelType11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test00612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00612");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        modelFieldBean2.setUseNull((java.lang.Boolean) false);
        modelFieldBean2.setPersist((java.lang.Boolean) false);
    }

    @Test
    public void test00613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00613");
        ch.rasc.extclassgenerator.validation.PresenceValidation presenceValidation1 = new ch.rasc.extclassgenerator.validation.PresenceValidation("/hi!/");
    }

    @Test
    public void test00614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00614");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        java.lang.String str6 = modelFieldBean2.getMapping();
        modelFieldBean2.setCritical((java.lang.Boolean) true);
        java.lang.String str9 = modelFieldBean2.getName();
        java.lang.Object obj10 = modelFieldBean2.getReference();
        modelFieldBean2.setConvert("range");
        java.util.List<java.lang.String> strList13 = modelFieldBean2.getDepends();
        java.lang.String str14 = modelFieldBean2.getType();
        modelFieldBean2.setUnique((java.lang.Boolean) true);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(strList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str14, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
    }

    @Test
    public void test00615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00615");
        ch.rasc.extclassgenerator.validation.NotBlankValidation notBlankValidation1 = new ch.rasc.extclassgenerator.validation.NotBlankValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
    }

    @Test
    public void test00616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00616");
        ch.rasc.extclassgenerator.validation.EmailValidation emailValidation1 = new ch.rasc.extclassgenerator.validation.EmailValidation("belongsTo");
    }

    @Test
    public void test00617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00617");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        ch.rasc.extclassgenerator.validation.CreditCardNumberValidation creditCardNumberValidation6 = new ch.rasc.extclassgenerator.validation.CreditCardNumberValidation("");
        ch.rasc.extclassgenerator.validation.FormatValidation formatValidation9 = new ch.rasc.extclassgenerator.validation.FormatValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        ch.rasc.extclassgenerator.validation.FutureValidation futureValidation11 = new ch.rasc.extclassgenerator.validation.FutureValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        ch.rasc.extclassgenerator.validation.FormatValidation formatValidation14 = new ch.rasc.extclassgenerator.validation.FormatValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        ch.rasc.extclassgenerator.validation.AbstractValidation[] abstractValidationArray15 = new ch.rasc.extclassgenerator.validation.AbstractValidation[] { creditCardNumberValidation6, formatValidation9, futureValidation11, formatValidation14 };
        java.util.ArrayList<ch.rasc.extclassgenerator.validation.AbstractValidation> abstractValidationList16 = new java.util.ArrayList<ch.rasc.extclassgenerator.validation.AbstractValidation>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<ch.rasc.extclassgenerator.validation.AbstractValidation>) abstractValidationList16, abstractValidationArray15);
        modelFieldBean2.setValidators((java.util.List<ch.rasc.extclassgenerator.validation.AbstractValidation>) abstractValidationList16);
        java.util.List<java.lang.String> strList19 = modelFieldBean2.getDepends();
        ch.rasc.extclassgenerator.ModelType modelType20 = modelFieldBean2.getModelType();
        modelFieldBean2.setAllowNull((java.lang.Boolean) true);
        java.lang.String str23 = modelFieldBean2.getMapping();
        java.lang.Object obj24 = modelFieldBean2.getDefaultValue();
        java.lang.Boolean boolean25 = modelFieldBean2.getUseNull();
        org.junit.Assert.assertNotNull(abstractValidationArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(strList19);
        org.junit.Assert.assertNull(modelType20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertEquals("'" + boolean25 + "' != '" + true + "'", boolean25, true);
    }

    @Test
    public void test00618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00618");
        ch.rasc.extclassgenerator.validation.NotBlankValidation notBlankValidation1 = new ch.rasc.extclassgenerator.validation.NotBlankValidation("Ext.define('Ext.define('ch.rasc.extclassgenerator.association.HasManyAssociation',\n{\n  extend : 'Ext.data.Model',\n  fields : [ {\n    name : 'autoLoad',\n    type : 'boolean'\n  }, {\n    name : 'name',\n    type : 'string'\n  }, {\n    name : 'type',\n    type : 'string'\n  }, {\n    name : 'model',\n    type : 'string'\n  }, {\n    name : 'associationKey',\n    type : 'string'\n  }, {\n    name : 'foreignKey',\n    type : 'string'\n  }, {\n    name : 'primaryKey',\n    type : 'string'\n  }, {\n    name : 'instanceName',\n    type : 'string'\n  } ]\n});',{extend:'',uses:['hi!'],fields:[],associations:[{type:'hasMany',model:'hi!'},{type:'hasMany',model:'hi!',associationKey:'Ext.define(\\'ch.rasc.extclassgenerator.ModelAnnotationProcessor\\',{extend:\\'Ext.data.Model\\',fields:[]});'},{type:'hasMany',model:'hi!',associationKey:'Ext.define(\\'ch.rasc.extclassgenerator.ModelAnnotationProcessor\\',{extend:\\'Ext.data.Model\\',fields:[]});'},{type:'hasMany',model:'hi!',foreignKey:''}]});");
    }

    @Test
    public void test00619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00619");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getChild();
        java.lang.String str2 = referenceBean0.getChild();
        referenceBean0.setRole("json");
        referenceBean0.setChild("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        referenceBean0.setInverse("Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[],proxy:{type:\"direct\",directFn:hi!}});");
        referenceBean0.setAssociation("Ext.define(\"null\",{extend:\"\",config:{fields:[]}});");
        referenceBean0.setParent("Ext.define(\"null\",{extend:\"\",config:{fields:[]}});");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00620");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        java.lang.String str6 = modelFieldBean2.getMapping();
        java.lang.String str7 = modelFieldBean2.getName();
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray14 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList12);
        modelFieldBean2.setDepends((java.util.List<java.lang.String>) strList12);
        java.lang.Boolean boolean16 = modelFieldBean2.getPersist();
        java.lang.Boolean boolean17 = modelFieldBean2.getCritical();
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        java.lang.String str20 = modelFieldBean2.getName();
        java.lang.Boolean boolean21 = modelFieldBean2.getPersist();
        java.lang.Boolean boolean22 = modelFieldBean2.getPersist();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertNull(boolean17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(boolean21);
        org.junit.Assert.assertNull(boolean22);
    }

    @Test
    public void test00621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00621");
        ch.rasc.extclassgenerator.validation.PresenceValidation presenceValidation1 = new ch.rasc.extclassgenerator.validation.PresenceValidation("length");
        java.lang.String str2 = presenceValidation1.getType();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "presence" + "'", str2, "presence");
    }

    @Test
    public void test00622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00622");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.data.Model");
        modelFieldBean2.setAllowNull((java.lang.Boolean) false);
        java.lang.String str5 = modelFieldBean2.getName();
        modelFieldBean2.setMapping("hi!");
        java.util.List<java.lang.String> strList8 = modelFieldBean2.getDepends();
        ch.rasc.extclassgenerator.ModelType modelType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelFieldBean2.setModelType(modelType9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(strList8);
    }

    @Test
    public void test00623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00623");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        java.lang.String str6 = referenceBean0.getType();
        boolean boolean7 = referenceBean0.typeOnly();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00624");
        ch.rasc.extclassgenerator.ModelAnnotationProcessor modelAnnotationProcessor0 = new ch.rasc.extclassgenerator.ModelAnnotationProcessor();
        java.util.Set<java.lang.String> strSet1 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        java.util.Set<java.lang.String> strSet2 = modelAnnotationProcessor0.getSupportedOptions();
        javax.lang.model.element.Element element3 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror4 = null;
        javax.lang.model.element.ExecutableElement executableElement5 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable7 = modelAnnotationProcessor0.getCompletions(element3, annotationMirror4, executableElement5, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.util.Set<java.lang.String> strSet8 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        java.util.Set<java.lang.String> strSet9 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        javax.lang.model.element.Element element10 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror11 = null;
        javax.lang.model.element.ExecutableElement executableElement12 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable14 = modelAnnotationProcessor0.getCompletions(element10, annotationMirror11, executableElement12, "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});");
        javax.annotation.processing.ProcessingEnvironment processingEnvironment15 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelAnnotationProcessor0.init(processingEnvironment15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Tool provided null ProcessingEnvironment");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(wildcardIterable7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(wildcardIterable14);
    }

    @Test
    public void test00625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00625");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        modelBean0.setIdProperty("");
        boolean boolean5 = modelBean0.isDisablePagingParameters();
        modelBean0.setReader("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        java.lang.String[] strArray8 = modelBean0.getHasMany();
        java.lang.String str9 = modelBean0.getTotalProperty();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00626");
        ch.rasc.extclassgenerator.validation.InclusionValidation inclusionValidation2 = new ch.rasc.extclassgenerator.validation.InclusionValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});", "Ext.data.Model");
        java.lang.String str3 = inclusionValidation2.getList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.data.Model" + "'", str3, "Ext.data.Model");
    }

    @Test
    public void test00627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00627");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});");
        java.lang.String str3 = modelFieldBean2.getConvert();
        java.lang.String str4 = modelFieldBean2.getMapping();
        modelFieldBean2.setCalculate("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00628");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.String str5 = modelFieldBean2.getMapping();
        modelFieldBean2.setAllowNull((java.lang.Boolean) true);
        java.lang.String str8 = modelFieldBean2.getName();
        java.lang.Boolean boolean9 = modelFieldBean2.getUseNull();
        java.lang.String str10 = modelFieldBean2.getCalculate();
        java.lang.Boolean boolean11 = modelFieldBean2.getUnique();
        java.util.List<java.lang.String> strList12 = modelFieldBean2.getDepends();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(strList12);
    }

    @Test
    public void test00629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00629");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("exclusion", (java.lang.Long) 1L, (java.lang.Long) 1L);
    }

    @Test
    public void test00630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00630");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        java.lang.String str2 = hasOneAssociation1.getName();
        hasOneAssociation1.setInstanceName("");
        hasOneAssociation1.setName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        hasOneAssociation1.setGetterName("belongsTo");
        hasOneAssociation1.setGetterName("/\\/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});\\//");
        java.lang.String str11 = hasOneAssociation1.getAssociationKey();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00631");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        ch.rasc.extclassgenerator.validation.CreditCardNumberValidation creditCardNumberValidation6 = new ch.rasc.extclassgenerator.validation.CreditCardNumberValidation("");
        ch.rasc.extclassgenerator.validation.FormatValidation formatValidation9 = new ch.rasc.extclassgenerator.validation.FormatValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        ch.rasc.extclassgenerator.validation.FutureValidation futureValidation11 = new ch.rasc.extclassgenerator.validation.FutureValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        ch.rasc.extclassgenerator.validation.FormatValidation formatValidation14 = new ch.rasc.extclassgenerator.validation.FormatValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        ch.rasc.extclassgenerator.validation.AbstractValidation[] abstractValidationArray15 = new ch.rasc.extclassgenerator.validation.AbstractValidation[] { creditCardNumberValidation6, formatValidation9, futureValidation11, formatValidation14 };
        java.util.ArrayList<ch.rasc.extclassgenerator.validation.AbstractValidation> abstractValidationList16 = new java.util.ArrayList<ch.rasc.extclassgenerator.validation.AbstractValidation>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<ch.rasc.extclassgenerator.validation.AbstractValidation>) abstractValidationList16, abstractValidationArray15);
        modelFieldBean2.setValidators((java.util.List<ch.rasc.extclassgenerator.validation.AbstractValidation>) abstractValidationList16);
        java.util.List<java.lang.String> strList19 = modelFieldBean2.getDepends();
        java.lang.String str20 = modelFieldBean2.getCalculate();
        modelFieldBean2.setPersist((java.lang.Boolean) false);
        java.lang.Boolean boolean23 = modelFieldBean2.getUnique();
        java.lang.Class<?> wildcardClass24 = modelFieldBean2.getClass();
        org.junit.Assert.assertNotNull(abstractValidationArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(strList19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(boolean23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00632");
        ch.rasc.extclassgenerator.validation.NotBlankValidation notBlankValidation1 = new ch.rasc.extclassgenerator.validation.NotBlankValidation("Ext.define(\"null\",\r\n{\n  extend : \"\",\n  fields : [ ],\n  hasMany : [ \"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\", \"json\", \"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\", \"\" ]\n});");
    }

    @Test
    public void test00633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00633");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});", (java.lang.Long) 10L, (java.lang.Long) 32L);
    }

    @Test
    public void test00634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00634");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        modelFieldBean2.setCritical((java.lang.Boolean) false);
    }

    @Test
    public void test00635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00635");
        ch.rasc.extclassgenerator.validation.FormatValidation formatValidation2 = new ch.rasc.extclassgenerator.validation.FormatValidation("Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});", "ch.rasc.extclassgenerator.PartialDataOptionsBean");
        java.lang.String str3 = formatValidation2.getMatcher();
        java.lang.String str4 = formatValidation2.getMatcher();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/ch.rasc.extclassgenerator.PartialDataOptionsBean/" + "'", str3, "/ch.rasc.extclassgenerator.PartialDataOptionsBean/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "/ch.rasc.extclassgenerator.PartialDataOptionsBean/" + "'", str4, "/ch.rasc.extclassgenerator.PartialDataOptionsBean/");
    }

    @Test
    public void test00636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00636");
        ch.rasc.extclassgenerator.validation.DigitsValidation digitsValidation3 = new ch.rasc.extclassgenerator.validation.DigitsValidation("Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[],proxy:{type:\"direct\",directFn:hi!}});", (int) (short) 1, (-1));
        int int4 = digitsValidation3.getInteger();
        int int5 = digitsValidation3.getInteger();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test00637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00637");
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation3 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.lang.String str4 = rangeValidation3.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "range" + "'", str4, "range");
    }

    @Test
    public void test00638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00638");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean4 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean4.setConvert("hi!");
        java.lang.Boolean boolean7 = modelFieldBean4.getPersist();
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean10 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean10.setConvert("hi!");
        java.lang.Boolean boolean13 = modelFieldBean10.getPersist();
        java.lang.String str14 = modelFieldBean10.getMapping();
        java.lang.String str15 = modelFieldBean10.getName();
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray22 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList20);
        modelFieldBean10.setDepends((java.util.List<java.lang.String>) strList20);
        modelFieldBean4.setDepends((java.util.List<java.lang.String>) strList20);
        modelFieldBean4.setUseNull((java.lang.Boolean) false);
        java.lang.String[] strArray29 = new java.lang.String[] { "", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        modelFieldBean4.setDepends((java.util.List<java.lang.String>) strList30);
        modelFieldBean4.setReference((java.lang.Object) 0L);
        java.util.List<java.lang.String> strList35 = modelFieldBean4.getDepends();
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray36 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("creditCardNumber", strList35);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray37 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("/Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});/", strList35);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(strList35);
    }

    @Test
    public void test00639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00639");
        ch.rasc.extclassgenerator.PartialDataOptionsBean partialDataOptionsBean0 = new ch.rasc.extclassgenerator.PartialDataOptionsBean();
        java.lang.Boolean boolean1 = partialDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean2 = partialDataOptionsBean0.getChanges();
        java.lang.Boolean boolean3 = partialDataOptionsBean0.getChanges();
        partialDataOptionsBean0.setCritical((java.lang.Boolean) false);
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNull(boolean3);
    }

    @Test
    public void test00640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00640");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean8 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean8.setConvert("hi!");
        java.lang.Boolean boolean11 = modelFieldBean8.getPersist();
        java.lang.String str12 = modelFieldBean8.getMapping();
        java.lang.String str13 = modelFieldBean8.getName();
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray20 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList18);
        modelFieldBean8.setDepends((java.util.List<java.lang.String>) strList18);
        modelFieldBean2.setDepends((java.util.List<java.lang.String>) strList18);
        modelFieldBean2.setUseNull((java.lang.Boolean) false);
        java.lang.String[] strArray27 = new java.lang.String[] { "", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        modelFieldBean2.setDepends((java.util.List<java.lang.String>) strList28);
        java.lang.Boolean boolean31 = modelFieldBean2.getCritical();
        java.lang.Object obj32 = modelFieldBean2.getReference();
        modelFieldBean2.setAllowBlank((java.lang.Boolean) false);
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation36 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        java.lang.String str37 = hasOneAssociation36.getName();
        hasOneAssociation36.setInstanceName("");
        hasOneAssociation36.setName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setReference((java.lang.Object) "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        ch.rasc.extclassgenerator.ModelType modelType43 = modelFieldBean2.getModelType();
        ch.rasc.extclassgenerator.OutputConfig outputConfig44 = new ch.rasc.extclassgenerator.OutputConfig();
        boolean boolean45 = outputConfig44.isDebug();
        ch.rasc.extclassgenerator.OutputFormat outputFormat46 = outputConfig44.getOutputFormat();
        java.lang.Object obj47 = null;
        boolean boolean48 = outputConfig44.equals(obj47);
        ch.rasc.extclassgenerator.LineEnding lineEnding49 = outputConfig44.getLineEnding();
        boolean boolean50 = modelFieldBean2.hasOnlyName(outputConfig44);
        java.lang.Boolean boolean51 = modelFieldBean2.getUseNull();
        java.lang.Object obj52 = modelFieldBean2.getReference();
        java.lang.String str53 = modelFieldBean2.getType();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(boolean31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(modelType43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(outputFormat46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(lineEnding49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + boolean51 + "' != '" + false + "'", boolean51, false);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", obj52, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str53, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
    }

    @Test
    public void test00641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00641");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("hi!");
        java.lang.String str2 = hasManyAssociation1.getAssociationKey();
        hasManyAssociation1.setAssociationKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        hasManyAssociation1.setAssociationKey("");
        java.lang.Boolean boolean7 = hasManyAssociation1.getAutoLoad();
        java.lang.String str8 = hasManyAssociation1.getAssociationKey();
        java.lang.String str9 = hasManyAssociation1.getName();
        java.lang.String str10 = hasManyAssociation1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hasMany" + "'", str10, "hasMany");
    }

    @Test
    public void test00642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00642");
        ch.rasc.extclassgenerator.ModelAnnotationProcessor modelAnnotationProcessor0 = new ch.rasc.extclassgenerator.ModelAnnotationProcessor();
        java.util.Set<java.lang.String> strSet1 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        javax.lang.model.SourceVersion sourceVersion2 = modelAnnotationProcessor0.getSupportedSourceVersion();
        javax.lang.model.SourceVersion sourceVersion3 = modelAnnotationProcessor0.getSupportedSourceVersion();
        java.util.Set<java.lang.String> strSet4 = modelAnnotationProcessor0.getSupportedOptions();
        javax.annotation.processing.ProcessingEnvironment processingEnvironment5 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelAnnotationProcessor0.init(processingEnvironment5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Tool provided null ProcessingEnvironment");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertTrue("'" + sourceVersion2 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion2.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertTrue("'" + sourceVersion3 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion3.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test00643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00643");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("future", (java.lang.Integer) 0, (java.lang.Integer) 97);
    }

    @Test
    public void test00644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00644");
        ch.rasc.extclassgenerator.validation.PastValidation pastValidation1 = new ch.rasc.extclassgenerator.validation.PastValidation("/range/");
    }

    @Test
    public void test00645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00645");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        ch.rasc.extclassgenerator.validation.CreditCardNumberValidation creditCardNumberValidation6 = new ch.rasc.extclassgenerator.validation.CreditCardNumberValidation("");
        ch.rasc.extclassgenerator.validation.FormatValidation formatValidation9 = new ch.rasc.extclassgenerator.validation.FormatValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        ch.rasc.extclassgenerator.validation.FutureValidation futureValidation11 = new ch.rasc.extclassgenerator.validation.FutureValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        ch.rasc.extclassgenerator.validation.FormatValidation formatValidation14 = new ch.rasc.extclassgenerator.validation.FormatValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        ch.rasc.extclassgenerator.validation.AbstractValidation[] abstractValidationArray15 = new ch.rasc.extclassgenerator.validation.AbstractValidation[] { creditCardNumberValidation6, formatValidation9, futureValidation11, formatValidation14 };
        java.util.ArrayList<ch.rasc.extclassgenerator.validation.AbstractValidation> abstractValidationList16 = new java.util.ArrayList<ch.rasc.extclassgenerator.validation.AbstractValidation>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<ch.rasc.extclassgenerator.validation.AbstractValidation>) abstractValidationList16, abstractValidationArray15);
        modelFieldBean2.setValidators((java.util.List<ch.rasc.extclassgenerator.validation.AbstractValidation>) abstractValidationList16);
        modelFieldBean2.setName("Ext.data.Model");
        java.lang.String str21 = modelFieldBean2.getDateFormat();
        java.lang.Boolean boolean22 = modelFieldBean2.getUnique();
        ch.rasc.extclassgenerator.ModelAnnotationProcessor modelAnnotationProcessor23 = new ch.rasc.extclassgenerator.ModelAnnotationProcessor();
        java.util.Set<java.lang.String> strSet24 = modelAnnotationProcessor23.getSupportedAnnotationTypes();
        java.util.Set<java.lang.String> strSet25 = modelAnnotationProcessor23.getSupportedOptions();
        javax.lang.model.element.Element element26 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror27 = null;
        javax.lang.model.element.ExecutableElement executableElement28 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable30 = modelAnnotationProcessor23.getCompletions(element26, annotationMirror27, executableElement28, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.util.Set<java.lang.String> strSet31 = modelAnnotationProcessor23.getSupportedAnnotationTypes();
        java.util.Set<java.lang.String> strSet32 = modelAnnotationProcessor23.getSupportedAnnotationTypes();
        modelFieldBean2.setDefaultValue((java.lang.Object) modelAnnotationProcessor23);
        javax.annotation.processing.ProcessingEnvironment processingEnvironment34 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelAnnotationProcessor23.init(processingEnvironment34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Tool provided null ProcessingEnvironment");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(abstractValidationArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(boolean22);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(wildcardIterable30);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNotNull(strSet32);
    }

    @Test
    public void test00646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00646");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        java.lang.Boolean boolean1 = allDataOptionsBean0.getPersist();
        java.lang.Boolean boolean2 = allDataOptionsBean0.getPersist();
        boolean boolean3 = allDataOptionsBean0.hasAnyProperties();
        java.lang.Boolean boolean4 = allDataOptionsBean0.getPersist();
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test00647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00647");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        modelFieldBean2.setMapping("hi!");
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        modelFieldBean2.setAllowBlank((java.lang.Boolean) false);
        ch.rasc.extclassgenerator.ModelType modelType11 = modelFieldBean2.getModelType();
        ch.rasc.extclassgenerator.ModelType modelType12 = modelFieldBean2.getModelType();
        org.junit.Assert.assertNull(modelType11);
        org.junit.Assert.assertNull(modelType12);
    }

    @Test
    public void test00648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00648");
        ch.rasc.extclassgenerator.validation.FormatValidation formatValidation2 = new ch.rasc.extclassgenerator.validation.FormatValidation("Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});", "hasMany");
        java.lang.String str3 = formatValidation2.getMatcher();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/hasMany/" + "'", str3, "/hasMany/");
    }

    @Test
    public void test00649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00649");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        hasOneAssociation1.setInstanceName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str4 = hasOneAssociation1.getSetterName();
        java.lang.String str5 = hasOneAssociation1.getGetterName();
        hasOneAssociation1.setName("Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00650");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hasOne", "hi!");
        java.lang.Boolean boolean3 = modelFieldBean2.getPersist();
        java.util.List<java.lang.String> strList4 = modelFieldBean2.getDepends();
        java.lang.String str5 = modelFieldBean2.getName();
        modelFieldBean2.setName("/\\/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});\\//");
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNull(strList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hasOne" + "'", str5, "hasOne");
    }

    @Test
    public void test00651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00651");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
    }

    @Test
    public void test00652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00652");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        referenceBean0.setAssociation("belongsTo");
        java.lang.String str12 = referenceBean0.getAssociation();
        java.lang.String str13 = referenceBean0.getAssociation();
        java.lang.String str14 = referenceBean0.getParent();
        java.lang.String str15 = referenceBean0.getInverse();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "belongsTo" + "'", str12, "belongsTo");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "belongsTo" + "'", str13, "belongsTo");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test00653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00653");
        ch.rasc.extclassgenerator.PartialDataOptionsBean partialDataOptionsBean0 = new ch.rasc.extclassgenerator.PartialDataOptionsBean();
        boolean boolean1 = partialDataOptionsBean0.hasAnyProperties();
        partialDataOptionsBean0.setChanges((java.lang.Boolean) true);
        partialDataOptionsBean0.setPersist((java.lang.Boolean) true);
        boolean boolean6 = partialDataOptionsBean0.hasAnyProperties();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00654");
        ch.rasc.extclassgenerator.OutputConfig outputConfig0 = new ch.rasc.extclassgenerator.OutputConfig();
        boolean boolean1 = outputConfig0.isDebug();
        ch.rasc.extclassgenerator.OutputFormat outputFormat2 = outputConfig0.getOutputFormat();
        boolean boolean3 = outputConfig0.isDebug();
        ch.rasc.extclassgenerator.IncludeValidation includeValidation4 = outputConfig0.getIncludeValidation();
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean5 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean5.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean8 = allDataOptionsBean5.getAssociated();
        java.lang.Boolean boolean9 = allDataOptionsBean5.getPersist();
        allDataOptionsBean5.setAssociated((java.lang.Boolean) false);
        allDataOptionsBean5.setPersist((java.lang.Boolean) false);
        java.lang.Boolean boolean14 = allDataOptionsBean5.getAssociated();
        allDataOptionsBean5.setAssociated((java.lang.Boolean) true);
        boolean boolean17 = outputConfig0.equals((java.lang.Object) true);
        boolean boolean18 = outputConfig0.isSurroundApiWithQuotes();
        ch.rasc.extclassgenerator.LineEnding lineEnding19 = outputConfig0.getLineEnding();
        ch.rasc.extclassgenerator.OutputFormat outputFormat20 = outputConfig0.getOutputFormat();
        boolean boolean21 = outputConfig0.isSurroundApiWithQuotes();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(outputFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(includeValidation4);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + false + "'", boolean8, false);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertEquals("'" + boolean14 + "' != '" + false + "'", boolean14, false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(lineEnding19);
        org.junit.Assert.assertNull(outputFormat20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test00655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00655");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        modelBean0.setIdProperty("");
        boolean boolean5 = modelBean0.isDisablePagingParameters();
        modelBean0.setExtend("");
        ch.rasc.extclassgenerator.PartialDataOptionsBean partialDataOptionsBean8 = modelBean0.getPartialDataOptions();
        modelBean0.setMessageProperty("hi!");
        modelBean0.setWriteAllFields((java.lang.Boolean) false);
        java.lang.String str13 = modelBean0.getName();
        modelBean0.setRootProperty("/\\/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});\\//");
        java.lang.String str16 = modelBean0.getExtend();
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean19 = new ch.rasc.extclassgenerator.ModelFieldBean("ch.rasc.extclassgenerator.PartialDataOptionsBean", "Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});");
        java.lang.annotation.Annotation annotation20 = null;
        ch.rasc.extclassgenerator.OutputConfig outputConfig21 = new ch.rasc.extclassgenerator.OutputConfig();
        boolean boolean22 = outputConfig21.isDebug();
        ch.rasc.extclassgenerator.OutputFormat outputFormat23 = outputConfig21.getOutputFormat();
        boolean boolean24 = outputConfig21.isDebug();
        ch.rasc.extclassgenerator.OutputFormat outputFormat25 = outputConfig21.getOutputFormat();
        // The following exception was thrown during execution in test generation
        try {
            ch.rasc.extclassgenerator.validation.AbstractValidation.addValidationToModel(modelBean0, modelFieldBean19, annotation20, outputConfig21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(partialDataOptionsBean8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(outputFormat23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(outputFormat25);
    }

    @Test
    public void test00656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00656");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        modelBean0.setIdProperty("");
        java.lang.String str5 = modelBean0.getIdentifier();
        modelBean0.setDisablePagingParameters(true);
        java.lang.String str8 = modelBean0.getRootProperty();
        modelBean0.setName("Ext.define(\"null\",{extend:\"Ext.data.Model\",idProperty:\"hi!\",fields:[],proxy:{type:\"direct\",idParam:\"hi!\"}});");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00657");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str2 = belongsToAssociation1.getSetterName();
        belongsToAssociation1.setAssociationKey("belongsTo");
        belongsToAssociation1.setGetterName("Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
        java.lang.String str7 = belongsToAssociation1.getGetterName();
        java.lang.String str8 = belongsToAssociation1.getSetterName();
        java.lang.String str9 = belongsToAssociation1.getGetterName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});" + "'", str7, "Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});" + "'", str9, "Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
    }

    @Test
    public void test00658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00658");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.destroy = "";
        apiObject0.destroy = "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/";
        java.lang.String str5 = apiObject0.read;
        apiObject0.update = "exclusion";
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00659");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        modelFieldBean2.setCalculate("json");
        modelFieldBean2.setCritical((java.lang.Boolean) true);
        org.junit.Assert.assertNull(boolean5);
    }

    @Test
    public void test00660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00660");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        ch.rasc.extclassgenerator.validation.GenericValidation genericValidation3 = new ch.rasc.extclassgenerator.validation.GenericValidation("creditCardNumber", "length", strMap2);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = genericValidation3.getOptions();
        org.junit.Assert.assertNull(strMap4);
    }

    @Test
    public void test00661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00661");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        java.lang.String str6 = modelFieldBean2.getMapping();
        java.lang.Object obj7 = modelFieldBean2.getReference();
        modelFieldBean2.setCalculate("exclusion");
        java.lang.Boolean boolean10 = modelFieldBean2.getUnique();
        java.lang.String str11 = modelFieldBean2.getConvert();
        java.lang.Boolean boolean12 = modelFieldBean2.getUnique();
        java.lang.Boolean boolean13 = modelFieldBean2.getUseNull();
        ch.rasc.extclassgenerator.ModelType modelType14 = modelFieldBean2.getModelType();
        java.lang.String str15 = modelFieldBean2.getMapping();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertNull(modelType14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test00662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00662");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});";
        apiObject0.destroy = "belongsTo";
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});";
        java.lang.String str10 = apiObject0.update;
        java.lang.String str11 = apiObject0.destroy;
        apiObject0.read = "Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});" + "'", str10, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "belongsTo" + "'", str11, "belongsTo");
    }

    @Test
    public void test00663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00663");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("hi!", (java.lang.Integer) 100, (java.lang.Integer) 1);
    }

    @Test
    public void test00664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00664");
        ch.rasc.extclassgenerator.validation.InclusionValidation inclusionValidation2 = new ch.rasc.extclassgenerator.validation.InclusionValidation("/Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});/", "hasOne");
    }

    @Test
    public void test00665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00665");
        ch.rasc.extclassgenerator.validation.PresenceValidation presenceValidation1 = new ch.rasc.extclassgenerator.validation.PresenceValidation("Ext.define(\"ch.rasc.extclassgenerator.LineEnding\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
    }

    @Test
    public void test00666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00666");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("hi!");
        hasManyAssociation1.setAssociationKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str4 = hasManyAssociation1.getInstanceName();
        hasManyAssociation1.setName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        hasManyAssociation1.setPrimaryKey("");
        java.lang.Boolean boolean9 = hasManyAssociation1.getAutoLoad();
        hasManyAssociation1.setPrimaryKey("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        java.lang.Boolean boolean12 = hasManyAssociation1.getAutoLoad();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNull(boolean12);
    }

    @Test
    public void test00667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00667");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getChild();
        java.lang.String str3 = referenceBean0.getAssociation();
        java.lang.String str4 = referenceBean0.getType();
        java.lang.String str5 = referenceBean0.getChild();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00668");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        java.lang.String str6 = modelFieldBean2.getMapping();
        java.lang.String str7 = modelFieldBean2.getName();
        java.lang.Boolean boolean8 = modelFieldBean2.getUnique();
        java.lang.Boolean boolean9 = modelFieldBean2.getPersist();
        java.lang.String str10 = modelFieldBean2.getType();
        modelFieldBean2.setDateFormat("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str10, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
    }

    @Test
    public void test00669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00669");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("range");
        java.lang.String str2 = belongsToAssociation1.getGetterName();
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00670");
        ch.rasc.extclassgenerator.validation.CreditCardNumberValidation creditCardNumberValidation1 = new ch.rasc.extclassgenerator.validation.CreditCardNumberValidation("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]}});");
    }

    @Test
    public void test00671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00671");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("");
        java.lang.String str2 = belongsToAssociation1.getGetterName();
        belongsToAssociation1.setAssociationKey("belongsTo");
        belongsToAssociation1.setGetterName("Ext.define(\"null\",{extend:\"\",fields:[]});");
        java.lang.Class<?> wildcardClass7 = belongsToAssociation1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00672");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("/\\/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});\\//", (java.lang.Integer) 52, (java.lang.Integer) 1);
    }

    @Test
    public void test00673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00673");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        java.lang.String str6 = modelFieldBean2.getMapping();
        modelFieldBean2.setConvert("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation10 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        hasOneAssociation10.setInstanceName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setDefaultValue((java.lang.Object) hasOneAssociation10);
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation15 = new ch.rasc.extclassgenerator.association.HasOneAssociation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setReference((java.lang.Object) "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str17 = modelFieldBean2.getType();
        modelFieldBean2.setMapping("Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});");
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str17, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
    }

    @Test
    public void test00674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00674");
        ch.rasc.extclassgenerator.validation.CreditCardNumberValidation creditCardNumberValidation1 = new ch.rasc.extclassgenerator.validation.CreditCardNumberValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});/");
    }

    @Test
    public void test00675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00675");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        modelFieldBean2.setMapping("hi!");
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        modelFieldBean2.setAllowBlank((java.lang.Boolean) false);
        ch.rasc.extclassgenerator.OutputConfig outputConfig11 = new ch.rasc.extclassgenerator.OutputConfig();
        outputConfig11.setUseSingleQuotes(false);
        boolean boolean14 = modelFieldBean2.hasOnlyName(outputConfig11);
        ch.rasc.extclassgenerator.ModelAnnotationProcessor modelAnnotationProcessor15 = new ch.rasc.extclassgenerator.ModelAnnotationProcessor();
        java.util.Set<java.lang.String> strSet16 = modelAnnotationProcessor15.getSupportedAnnotationTypes();
        java.util.Set<java.lang.String> strSet17 = modelAnnotationProcessor15.getSupportedOptions();
        javax.lang.model.element.Element element18 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror19 = null;
        javax.lang.model.element.ExecutableElement executableElement20 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable22 = modelAnnotationProcessor15.getCompletions(element18, annotationMirror19, executableElement20, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.util.Set<java.lang.String> strSet23 = modelAnnotationProcessor15.getSupportedAnnotationTypes();
        java.util.Set<java.lang.String> strSet24 = modelAnnotationProcessor15.getSupportedAnnotationTypes();
        javax.lang.model.element.Element element25 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror26 = null;
        javax.lang.model.element.ExecutableElement executableElement27 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable29 = modelAnnotationProcessor15.getCompletions(element25, annotationMirror26, executableElement27, "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});");
        modelFieldBean2.setReference((java.lang.Object) element25);
        java.lang.Boolean boolean31 = modelFieldBean2.getAllowNull();
        java.lang.Object obj32 = modelFieldBean2.getReference();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(wildcardIterable22);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(wildcardIterable29);
        org.junit.Assert.assertEquals("'" + boolean31 + "' != '" + true + "'", boolean31, true);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test00676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00676");
        ch.rasc.extclassgenerator.validation.NotBlankValidation notBlankValidation1 = new ch.rasc.extclassgenerator.validation.NotBlankValidation("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]}});");
    }

    @Test
    public void test00677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00677");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        modelFieldBean2.setCritical((java.lang.Boolean) false);
        java.lang.Boolean boolean7 = modelFieldBean2.getAllowNull();
        modelFieldBean2.setCalculate("/Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});/");
        org.junit.Assert.assertNull(boolean7);
    }

    @Test
    public void test00678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00678");
        ch.rasc.extclassgenerator.validation.NotBlankValidation notBlankValidation1 = new ch.rasc.extclassgenerator.validation.NotBlankValidation("Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[],proxy:{type:\"direct\",directFn:hi!}});");
        java.lang.String str2 = notBlankValidation1.getField();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[],proxy:{type:\"direct\",directFn:hi!}});" + "'", str2, "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[],proxy:{type:\"direct\",directFn:hi!}});");
    }

    @Test
    public void test00679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00679");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        ch.rasc.extclassgenerator.validation.GenericValidation genericValidation3 = new ch.rasc.extclassgenerator.validation.GenericValidation("Ext.define(\"null\",{extend:\"\",fields:[]});", "future", strMap2);
    }

    @Test
    public void test00680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00680");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("/ch.rasc.extclassgenerator.ModelAnnotationProcessor/", (java.lang.Integer) 97, (java.lang.Integer) 35);
    }

    @Test
    public void test00681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00681");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("hi!");
        hasManyAssociation1.setAssociationKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        hasManyAssociation1.setName("belongsTo");
        hasManyAssociation1.setPrimaryKey("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        hasManyAssociation1.setAutoLoad((java.lang.Boolean) true);
        java.lang.String str10 = hasManyAssociation1.getPrimaryKey();
        hasManyAssociation1.setName("range");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});" + "'", str10, "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
    }

    @Test
    public void test00682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00682");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        java.lang.String str2 = hasOneAssociation1.getName();
        hasOneAssociation1.setInstanceName("");
        java.lang.String str5 = hasOneAssociation1.getSetterName();
        hasOneAssociation1.setGetterName("exclusion");
        hasOneAssociation1.setPrimaryKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        hasOneAssociation1.setInstanceName("ch.rasc.extclassgenerator.ModelAnnotationProcessor");
        hasOneAssociation1.setSetterName("hasMany");
        hasOneAssociation1.setName("belongsTo");
        hasOneAssociation1.setSetterName("Ext.define(\"null\",\r\n{\n  extend : \"\",\n  fields : [ ],\n  hasMany : [ \"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\", \"json\", \"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\", \"\" ]\n});");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00683");
        ch.rasc.extclassgenerator.ModelAnnotationProcessor modelAnnotationProcessor0 = new ch.rasc.extclassgenerator.ModelAnnotationProcessor();
        java.util.Set<java.lang.String> strSet1 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        javax.lang.model.SourceVersion sourceVersion2 = modelAnnotationProcessor0.getSupportedSourceVersion();
        javax.lang.model.SourceVersion sourceVersion3 = modelAnnotationProcessor0.getSupportedSourceVersion();
        java.util.Set<java.lang.String> strSet4 = modelAnnotationProcessor0.getSupportedOptions();
        javax.lang.model.element.Element element5 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror6 = null;
        javax.lang.model.element.ExecutableElement executableElement7 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable9 = modelAnnotationProcessor0.getCompletions(element5, annotationMirror6, executableElement7, "/\\/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});\\//");
        javax.lang.model.SourceVersion sourceVersion10 = modelAnnotationProcessor0.getSupportedSourceVersion();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertTrue("'" + sourceVersion2 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion2.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertTrue("'" + sourceVersion3 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion3.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(wildcardIterable9);
        org.junit.Assert.assertTrue("'" + sourceVersion10 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion10.equals(javax.lang.model.SourceVersion.RELEASE_6));
    }

    @Test
    public void test00684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00684");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        hasOneAssociation1.setGetterName("hi!");
        hasOneAssociation1.setSetterName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        hasOneAssociation1.setName("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});");
        java.lang.String str8 = hasOneAssociation1.getGetterName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test00685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00685");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("/ch.rasc.extclassgenerator.PartialDataOptionsBean/");
    }

    @Test
    public void test00686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00686");
        ch.rasc.extclassgenerator.validation.PresenceValidation presenceValidation1 = new ch.rasc.extclassgenerator.validation.PresenceValidation("/\\/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});\\//");
    }

    @Test
    public void test00687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00687");
        ch.rasc.extclassgenerator.validation.DigitsValidation digitsValidation3 = new ch.rasc.extclassgenerator.validation.DigitsValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});/", (int) (byte) 1, 97);
    }

    @Test
    public void test00688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00688");
        ch.rasc.extclassgenerator.ModelAnnotationProcessor modelAnnotationProcessor0 = new ch.rasc.extclassgenerator.ModelAnnotationProcessor();
        java.util.Set<java.lang.String> strSet1 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        javax.lang.model.SourceVersion sourceVersion2 = modelAnnotationProcessor0.getSupportedSourceVersion();
        javax.lang.model.SourceVersion sourceVersion3 = modelAnnotationProcessor0.getSupportedSourceVersion();
        javax.lang.model.SourceVersion sourceVersion4 = modelAnnotationProcessor0.getSupportedSourceVersion();
        javax.lang.model.element.Element element5 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror6 = null;
        javax.lang.model.element.ExecutableElement executableElement7 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable9 = modelAnnotationProcessor0.getCompletions(element5, annotationMirror6, executableElement7, "hi!");
        javax.lang.model.SourceVersion sourceVersion10 = modelAnnotationProcessor0.getSupportedSourceVersion();
        javax.lang.model.SourceVersion sourceVersion11 = modelAnnotationProcessor0.getSupportedSourceVersion();
        javax.annotation.processing.ProcessingEnvironment processingEnvironment12 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelAnnotationProcessor0.init(processingEnvironment12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Tool provided null ProcessingEnvironment");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertTrue("'" + sourceVersion2 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion2.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertTrue("'" + sourceVersion3 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion3.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertTrue("'" + sourceVersion4 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion4.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(wildcardIterable9);
        org.junit.Assert.assertTrue("'" + sourceVersion10 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion10.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertTrue("'" + sourceVersion11 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion11.equals(javax.lang.model.SourceVersion.RELEASE_6));
    }

    @Test
    public void test00689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00689");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getChild();
        java.lang.String str2 = referenceBean0.getInverse();
        java.lang.String str3 = referenceBean0.getType();
        referenceBean0.setType("/Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});/");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00690");
        ch.rasc.extclassgenerator.validation.EmailValidation emailValidation1 = new ch.rasc.extclassgenerator.validation.EmailValidation("Ext.define(\"null\",\r\n{\n  extend : \"\",\n  fields : [ ],\n  hasMany : [ \"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\", \"json\", \"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\", \"\" ]\n});");
    }

    @Test
    public void test00691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00691");
        ch.rasc.extclassgenerator.validation.PastValidation pastValidation1 = new ch.rasc.extclassgenerator.validation.PastValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});");
    }

    @Test
    public void test00692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00692");
        ch.rasc.extclassgenerator.ModelAnnotationProcessor modelAnnotationProcessor0 = new ch.rasc.extclassgenerator.ModelAnnotationProcessor();
        java.util.Set<java.lang.String> strSet1 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        javax.lang.model.SourceVersion sourceVersion2 = modelAnnotationProcessor0.getSupportedSourceVersion();
        javax.lang.model.SourceVersion sourceVersion3 = modelAnnotationProcessor0.getSupportedSourceVersion();
        javax.lang.model.SourceVersion sourceVersion4 = modelAnnotationProcessor0.getSupportedSourceVersion();
        javax.lang.model.element.Element element5 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror6 = null;
        javax.lang.model.element.ExecutableElement executableElement7 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable9 = modelAnnotationProcessor0.getCompletions(element5, annotationMirror6, executableElement7, "digits");
        javax.lang.model.element.Element element10 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror11 = null;
        javax.lang.model.element.ExecutableElement executableElement12 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable14 = modelAnnotationProcessor0.getCompletions(element10, annotationMirror11, executableElement12, "Ext.define(\"null\",\r\n{\n  extend : \"\",\n  fields : [ ],\n  hasMany : [ \"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\", \"json\", \"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\", \"\" ]\n});");
        javax.lang.model.SourceVersion sourceVersion15 = modelAnnotationProcessor0.getSupportedSourceVersion();
        java.util.Set<java.lang.String> strSet16 = modelAnnotationProcessor0.getSupportedOptions();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertTrue("'" + sourceVersion2 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion2.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertTrue("'" + sourceVersion3 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion3.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertTrue("'" + sourceVersion4 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion4.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(wildcardIterable9);
        org.junit.Assert.assertNotNull(wildcardIterable14);
        org.junit.Assert.assertTrue("'" + sourceVersion15 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion15.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test00693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00693");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
    }

    @Test
    public void test00694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00694");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        java.lang.String str2 = hasOneAssociation1.getName();
        hasOneAssociation1.setInstanceName("");
        java.lang.String str5 = hasOneAssociation1.getForeignKey();
        java.lang.String str6 = hasOneAssociation1.getGetterName();
        hasOneAssociation1.setAssociationKey("Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});");
        hasOneAssociation1.setGetterName("Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
        java.lang.String str11 = hasOneAssociation1.getName();
        hasOneAssociation1.setInstanceName("hi!");
        java.lang.String str14 = hasOneAssociation1.getName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test00695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00695");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        java.lang.String str6 = referenceBean0.getInverse();
        java.lang.String str7 = referenceBean0.getParent();
        referenceBean0.setParent("ch.rasc.extclassgenerator.ModelBean");
        java.lang.String str10 = referenceBean0.getRole();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00696");
        ch.rasc.extclassgenerator.OutputConfig outputConfig0 = new ch.rasc.extclassgenerator.OutputConfig();
        boolean boolean1 = outputConfig0.isSurroundApiWithQuotes();
        boolean boolean2 = outputConfig0.isDebug();
        ch.rasc.extclassgenerator.LineEnding lineEnding3 = outputConfig0.getLineEnding();
        ch.rasc.extclassgenerator.LineEnding lineEnding4 = outputConfig0.getLineEnding();
        boolean boolean5 = outputConfig0.isUseSingleQuotes();
        boolean boolean6 = outputConfig0.isUseSingleQuotes();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(lineEnding3);
        org.junit.Assert.assertNull(lineEnding4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00697");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("/hasMany/");
    }

    @Test
    public void test00698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00698");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getChild();
        boolean boolean2 = referenceBean0.typeOnly();
        java.lang.String str3 = referenceBean0.getAssociation();
        referenceBean0.setParent("hasOne");
        java.lang.String str6 = referenceBean0.getInverse();
        java.lang.String str7 = referenceBean0.getType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00699");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("creditCardNumber");
        belongsToAssociation1.setGetterName("Ext.define(\"null\",{extend:\"Ext.data.Model\",idProperty:\"hi!\",fields:[],proxy:{type:\"direct\",idParam:\"hi!\"}});");
        belongsToAssociation1.setSetterName("future");
    }

    @Test
    public void test00700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00700");
        ch.rasc.extclassgenerator.OutputConfig outputConfig0 = new ch.rasc.extclassgenerator.OutputConfig();
        boolean boolean1 = outputConfig0.isSurroundApiWithQuotes();
        boolean boolean2 = outputConfig0.isDebug();
        boolean boolean3 = outputConfig0.isSurroundApiWithQuotes();
        boolean boolean4 = outputConfig0.isSurroundApiWithQuotes();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00701");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});";
        apiObject0.update = "json";
        apiObject0.destroy = "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/";
        java.lang.String str10 = apiObject0.update;
        java.lang.String str11 = apiObject0.read;
        java.lang.String str12 = apiObject0.destroy;
        apiObject0.destroy = "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});";
        java.lang.String str15 = apiObject0.destroy;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "json" + "'", str10, "json");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/" + "'", str12, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});" + "'", str15, "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
    }

    @Test
    public void test00702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00702");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        java.lang.String str6 = modelFieldBean2.getMapping();
        java.lang.String str7 = modelFieldBean2.getName();
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray14 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList12);
        modelFieldBean2.setDepends((java.util.List<java.lang.String>) strList12);
        java.lang.Boolean boolean16 = modelFieldBean2.getUseNull();
        java.lang.String str17 = modelFieldBean2.getConvert();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test00703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00703");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("hi!");
        hasManyAssociation1.setAssociationKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        hasManyAssociation1.setName("Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});");
    }

    @Test
    public void test00704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00704");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("hi!");
        java.lang.String str2 = hasManyAssociation1.getAssociationKey();
        hasManyAssociation1.setAssociationKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        hasManyAssociation1.setAssociationKey("");
        java.lang.Boolean boolean7 = hasManyAssociation1.getAutoLoad();
        java.lang.String str8 = hasManyAssociation1.getForeignKey();
        java.lang.String str9 = hasManyAssociation1.getInstanceName();
        java.lang.String str10 = hasManyAssociation1.getAssociationKey();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test00705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00705");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("hasOne");
        belongsToAssociation1.setGetterName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
        java.lang.String str4 = belongsToAssociation1.getInstanceName();
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00706");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        java.lang.String str1 = apiObject0.update;
        apiObject0.update = "";
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]}});";
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test00707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00707");
        ch.rasc.extclassgenerator.validation.PresenceValidation presenceValidation1 = new ch.rasc.extclassgenerator.validation.PresenceValidation("Ext.define(\"ch.rasc.extclassgenerator.association.HasOneAssociation\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"setterName\",type:\"string\"},{name:\"getterName\",type:\"string\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]}});");
    }

    @Test
    public void test00708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00708");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean4 = allDataOptionsBean0.getPersist();
        java.lang.Boolean boolean5 = allDataOptionsBean0.getCritical();
        boolean boolean6 = allDataOptionsBean0.hasAnyProperties();
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00709");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getParent();
        referenceBean0.setInverse("hi!");
        referenceBean0.setParent("exclusion");
        referenceBean0.setChild("/Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00710");
        ch.rasc.extclassgenerator.validation.DigitsValidation digitsValidation3 = new ch.rasc.extclassgenerator.validation.DigitsValidation("", (int) (short) -1, 0);
        int int4 = digitsValidation3.getFraction();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00711");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        modelBean0.setIdProperty("");
        boolean boolean5 = modelBean0.isDisablePagingParameters();
        modelBean0.setExtend("");
        ch.rasc.extclassgenerator.PartialDataOptionsBean partialDataOptionsBean8 = modelBean0.getPartialDataOptions();
        modelBean0.setMessageProperty("hi!");
        modelBean0.setWriteAllFields((java.lang.Boolean) false);
        java.lang.String str13 = modelBean0.getName();
        modelBean0.setIdentifier("Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
        modelBean0.setIdProperty("");
        boolean boolean18 = modelBean0.isClientIdPropertyAddToWriter();
        java.lang.String str19 = modelBean0.getVersionProperty();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(partialDataOptionsBean8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test00712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00712");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.Object obj3 = modelFieldBean2.getDefaultValue();
        java.lang.Boolean boolean4 = modelFieldBean2.getPersist();
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray15 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList13);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray16 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("", (java.util.List<java.lang.String>) strList13);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray17 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("json", (java.util.List<java.lang.String>) strList13);
        java.util.List<java.lang.String> strList18 = exclusionValidationArray17.getList();
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray19 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("exclusion", strList18);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray20 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", strList18);
        modelFieldBean2.setDefaultValue((java.lang.Object) "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        modelFieldBean2.setMapping("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        modelFieldBean2.setUseNull((java.lang.Boolean) false);
        ch.rasc.extclassgenerator.ModelType modelType26 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelFieldBean2.setModelType(modelType26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test00713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00713");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        ch.rasc.extclassgenerator.validation.GenericValidation genericValidation3 = new ch.rasc.extclassgenerator.validation.GenericValidation("Ext.data.Model", "Ext.define(\"null\",{extend:\"\",config:{fields:[]}});", strMap2);
    }

    @Test
    public void test00714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00714");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("hasOne");
        java.lang.String str2 = belongsToAssociation1.getSetterName();
        belongsToAssociation1.setGetterName("length");
        java.lang.String str5 = belongsToAssociation1.getModel();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hasOne" + "'", str5, "hasOne");
    }

    @Test
    public void test00715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00715");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        java.lang.String str3 = modelBean0.getIdProperty();
        java.lang.String[] strArray4 = modelBean0.getHasMany();
        modelBean0.setExtend("/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/");
        modelBean0.setAutodetectTypes(false);
        ch.rasc.extclassgenerator.OutputConfig outputConfig9 = new ch.rasc.extclassgenerator.OutputConfig();
        boolean boolean10 = outputConfig9.isDebug();
        boolean boolean11 = outputConfig9.isSurroundApiWithQuotes();
        ch.rasc.extclassgenerator.OutputFormat outputFormat12 = ch.rasc.extclassgenerator.OutputFormat.EXTJS5;
        outputConfig9.setOutputFormat(outputFormat12);
        java.lang.String str15 = ch.rasc.extclassgenerator.ModelGenerator.generateJavascript(modelBean0, outputFormat12, false);
        java.lang.String str16 = modelBean0.getTotalProperty();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + outputFormat12 + "' != '" + ch.rasc.extclassgenerator.OutputFormat.EXTJS5 + "'", outputFormat12.equals(ch.rasc.extclassgenerator.OutputFormat.EXTJS5));
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str15, "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test00716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00716");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("belongsTo", (java.lang.Long) 32L, (java.lang.Long) 1L);
    }

    @Test
    public void test00717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00717");
        ch.rasc.extclassgenerator.validation.DigitsValidation digitsValidation3 = new ch.rasc.extclassgenerator.validation.DigitsValidation("ch.rasc.extclassgenerator.ModelAnnotationProcessor", (int) (byte) 10, (int) (byte) 0);
        java.lang.String str4 = digitsValidation3.getField();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ch.rasc.extclassgenerator.ModelAnnotationProcessor" + "'", str4, "ch.rasc.extclassgenerator.ModelAnnotationProcessor");
    }

    @Test
    public void test00718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00718");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        boolean boolean4 = allDataOptionsBean0.hasAnyProperties();
        allDataOptionsBean0.setCritical((java.lang.Boolean) true);
        allDataOptionsBean0.setChanges((java.lang.Boolean) false);
        allDataOptionsBean0.setChanges((java.lang.Boolean) true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00719");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean3 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean3.setConvert("hi!");
        modelFieldBean3.setMapping("hi!");
        modelFieldBean3.setUseNull((java.lang.Boolean) true);
        modelFieldBean3.setAllowBlank((java.lang.Boolean) false);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray19 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList17);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray20 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("", (java.util.List<java.lang.String>) strList17);
        java.util.List<java.lang.String> strList21 = exclusionValidationArray20.getList();
        modelFieldBean3.setDepends(strList21);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray23 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});", strList21);
        java.lang.String str24 = exclusionValidationArray23.getField();
        java.lang.String str25 = exclusionValidationArray23.getType();
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});" + "'", str24, "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "exclusion" + "'", str25, "exclusion");
    }

    @Test
    public void test00720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00720");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getChild();
        java.lang.String str2 = referenceBean0.getChild();
        java.lang.String str3 = referenceBean0.getType();
        boolean boolean4 = referenceBean0.hasAnyProperties();
        referenceBean0.setType("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});");
        java.lang.Class<?> wildcardClass7 = referenceBean0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00721");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("");
        java.lang.String str2 = hasOneAssociation1.getPrimaryKey();
        java.lang.String str3 = hasOneAssociation1.getGetterName();
        java.lang.String str4 = hasOneAssociation1.getSetterName();
        hasOneAssociation1.setName("json");
        java.lang.String str7 = hasOneAssociation1.getModel();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test00722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00722");
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation3 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});", (java.lang.Long) 32L, (java.lang.Long) 1L);
    }

    @Test
    public void test00723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00723");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("Ext.define(\"ch.rasc.extclassgenerator.LineEnding\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
        java.lang.String str2 = hasManyAssociation1.getName();
        java.lang.String str3 = hasManyAssociation1.getModel();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.LineEnding\",{extend:\"Ext.data.Model\",config:{fields:[]}});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.LineEnding\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
    }

    @Test
    public void test00724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00724");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("Ext.define('Ext.define('ch.rasc.extclassgenerator.association.HasManyAssociation',\n{\n  extend : 'Ext.data.Model',\n  fields : [ {\n    name : 'autoLoad',\n    type : 'boolean'\n  }, {\n    name : 'name',\n    type : 'string'\n  }, {\n    name : 'type',\n    type : 'string'\n  }, {\n    name : 'model',\n    type : 'string'\n  }, {\n    name : 'associationKey',\n    type : 'string'\n  }, {\n    name : 'foreignKey',\n    type : 'string'\n  }, {\n    name : 'primaryKey',\n    type : 'string'\n  }, {\n    name : 'instanceName',\n    type : 'string'\n  } ]\n});',{extend:'',uses:['hi!'],fields:[],associations:[{type:'hasMany',model:'hi!'},{type:'hasMany',model:'hi!',associationKey:'Ext.define(\\'ch.rasc.extclassgenerator.ModelAnnotationProcessor\\',{extend:\\'Ext.data.Model\\',fields:[]});'},{type:'hasMany',model:'hi!',associationKey:'Ext.define(\\'ch.rasc.extclassgenerator.ModelAnnotationProcessor\\',{extend:\\'Ext.data.Model\\',fields:[]});'},{type:'hasMany',model:'hi!',foreignKey:''}]});", (java.lang.Integer) 100, (java.lang.Integer) (-1));
    }

    @Test
    public void test00725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00725");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        modelFieldBean2.setDateFormat("hi!");
        java.lang.Boolean boolean8 = modelFieldBean2.getUseNull();
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        modelFieldBean2.setPersist((java.lang.Boolean) false);
        modelFieldBean2.setDateFormat("creditCardNumber");
        java.lang.String str15 = modelFieldBean2.getMapping();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test00726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00726");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.update = "exclusion";
        java.lang.String str8 = apiObject0.create;
        java.lang.String str9 = apiObject0.create;
        java.lang.String str10 = apiObject0.read;
        java.lang.String str11 = apiObject0.create;
        apiObject0.create = "ch.rasc.extclassgenerator.ModelAnnotationProcessor";
        java.lang.String str14 = apiObject0.read;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str8, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str9, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str11, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test00727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00727");
        ch.rasc.extclassgenerator.ModelAnnotationProcessor modelAnnotationProcessor0 = new ch.rasc.extclassgenerator.ModelAnnotationProcessor();
        java.util.Set<java.lang.String> strSet1 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        javax.lang.model.SourceVersion sourceVersion2 = modelAnnotationProcessor0.getSupportedSourceVersion();
        javax.lang.model.SourceVersion sourceVersion3 = modelAnnotationProcessor0.getSupportedSourceVersion();
        javax.lang.model.element.Element element4 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror5 = null;
        javax.lang.model.element.ExecutableElement executableElement6 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable8 = modelAnnotationProcessor0.getCompletions(element4, annotationMirror5, executableElement6, "json");
        java.util.Set<java.lang.String> strSet9 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        javax.lang.model.element.Element element10 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror11 = null;
        javax.lang.model.element.ExecutableElement executableElement12 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable14 = modelAnnotationProcessor0.getCompletions(element10, annotationMirror11, executableElement12, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        javax.lang.model.SourceVersion sourceVersion15 = modelAnnotationProcessor0.getSupportedSourceVersion();
        java.util.Set<java.lang.String> strSet16 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        javax.annotation.processing.ProcessingEnvironment processingEnvironment17 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelAnnotationProcessor0.init(processingEnvironment17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Tool provided null ProcessingEnvironment");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertTrue("'" + sourceVersion2 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion2.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertTrue("'" + sourceVersion3 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion3.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(wildcardIterable8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(wildcardIterable14);
        org.junit.Assert.assertTrue("'" + sourceVersion15 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion15.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test00728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00728");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean8 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean8.setConvert("hi!");
        java.lang.Boolean boolean11 = modelFieldBean8.getPersist();
        java.lang.String str12 = modelFieldBean8.getMapping();
        java.lang.String str13 = modelFieldBean8.getName();
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray20 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList18);
        modelFieldBean8.setDepends((java.util.List<java.lang.String>) strList18);
        modelFieldBean2.setDepends((java.util.List<java.lang.String>) strList18);
        modelFieldBean2.setUseNull((java.lang.Boolean) false);
        java.lang.String[] strArray27 = new java.lang.String[] { "", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        modelFieldBean2.setDepends((java.util.List<java.lang.String>) strList28);
        modelFieldBean2.setAllowBlank((java.lang.Boolean) false);
        java.lang.String str33 = modelFieldBean2.getMapping();
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList39 = new java.util.ArrayList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray41 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList39);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray42 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("digits", (java.util.List<java.lang.String>) strList39);
        java.util.List<java.lang.String> strList43 = inclusionValidationArray42.getList();
        modelFieldBean2.setDefaultValue((java.lang.Object) strList43);
        modelFieldBean2.setUnique((java.lang.Boolean) true);
        modelFieldBean2.setCalculate("creditCardNumber");
        java.lang.Boolean boolean49 = modelFieldBean2.getPersist();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertNull(boolean49);
    }

    @Test
    public void test00729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00729");
        ch.rasc.extclassgenerator.validation.InclusionValidation inclusionValidation2 = new ch.rasc.extclassgenerator.validation.InclusionValidation("Ext.define(\"null\",{extend:\"\",config:{fields:[]}});", "");
        java.lang.String str3 = inclusionValidation2.getList();
        java.lang.String str4 = inclusionValidation2.getList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test00730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00730");
        ch.rasc.extclassgenerator.validation.InclusionValidation inclusionValidation2 = new ch.rasc.extclassgenerator.validation.InclusionValidation("range", "exclusion");
    }

    @Test
    public void test00731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00731");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("", (java.lang.Long) 0L, (java.lang.Long) 32L);
    }

    @Test
    public void test00732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00732");
        ch.rasc.extclassgenerator.validation.ExclusionValidation exclusionValidation2 = new ch.rasc.extclassgenerator.validation.ExclusionValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});", "Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});");
        java.lang.String str3 = exclusionValidation2.getList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});");
    }

    @Test
    public void test00733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00733");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        modelBean0.setIdProperty("");
        modelBean0.setReadMethod("hi!");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation8 = new ch.rasc.extclassgenerator.association.HasManyAssociation("hi!");
        java.lang.String str9 = hasManyAssociation8.getAssociationKey();
        hasManyAssociation8.setAssociationKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        hasManyAssociation8.setAssociationKey("");
        hasManyAssociation8.setAssociationKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelBean0.addAssociation((ch.rasc.extclassgenerator.association.AbstractAssociation) hasManyAssociation8);
        modelBean0.setAutodetectTypes(true);
        modelBean0.setUpdateMethod("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});");
        java.lang.Class<?> wildcardClass21 = modelBean0.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00734");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("/hi!/");
    }

    @Test
    public void test00735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00735");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        ch.rasc.extclassgenerator.validation.GenericValidation genericValidation3 = new ch.rasc.extclassgenerator.validation.GenericValidation("belongsTo", "Ext.define(\"null\",\r\n{\n  extend : \"\",\n  fields : [ ],\n  hasMany : [ \"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\", \"json\", \"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\", \"\" ]\n});", strMap2);
    }

    @Test
    public void test00736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00736");
        ch.rasc.extclassgenerator.validation.PresenceValidation presenceValidation1 = new ch.rasc.extclassgenerator.validation.PresenceValidation("/ch.rasc.extclassgenerator.ModelAnnotationProcessor/");
    }

    @Test
    public void test00737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00737");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("length", (java.lang.Integer) 32, (java.lang.Integer) 0);
        java.lang.String str4 = lengthValidation3.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "length" + "'", str4, "length");
    }

    @Test
    public void test00738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00738");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});", (java.lang.Long) 1L, (java.lang.Long) 100L);
    }

    @Test
    public void test00739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00739");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getParent();
        referenceBean0.setInverse("hi!");
        referenceBean0.setParent("exclusion");
        java.lang.String str7 = referenceBean0.getInverse();
        boolean boolean8 = referenceBean0.typeOnly();
        java.lang.String str9 = referenceBean0.getInverse();
        java.lang.String str10 = referenceBean0.getAssociation();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00740");
        ch.rasc.extclassgenerator.validation.CreditCardNumberValidation creditCardNumberValidation1 = new ch.rasc.extclassgenerator.validation.CreditCardNumberValidation("Ext.define(\"null\",{extend:\"\",fields:[]});");
    }

    @Test
    public void test00741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00741");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        modelBean0.setIdProperty("");
        boolean boolean5 = modelBean0.isDisablePagingParameters();
        modelBean0.setReadMethod("");
        boolean boolean8 = modelBean0.isDisablePagingParameters();
        java.lang.String str9 = modelBean0.getWriter();
        java.lang.String str10 = modelBean0.getVersionProperty();
        modelBean0.setDestroyMethod("Ext.data.Model");
        ch.rasc.extclassgenerator.ModelBean modelBean13 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean13.setDisablePagingParameters(false);
        modelBean13.setIdProperty("");
        boolean boolean18 = modelBean13.isDisablePagingParameters();
        modelBean13.setExtend("");
        java.lang.String str21 = modelBean13.getSuccessProperty();
        java.util.Map<java.lang.String, ch.rasc.extclassgenerator.ModelFieldBean> strMap22 = modelBean13.getFields();
        modelBean0.setFields(strMap22);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "json" + "'", str9, "json");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(strMap22);
    }

    @Test
    public void test00742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00742");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});", (java.lang.Integer) 0, (java.lang.Integer) 52);
    }

    @Test
    public void test00743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00743");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getChild();
        java.lang.String str2 = referenceBean0.getChild();
        referenceBean0.setAssociation("creditCardNumber");
        referenceBean0.setType("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        java.lang.String str7 = referenceBean0.getType();
        boolean boolean8 = referenceBean0.typeOnly();
        java.lang.String str9 = referenceBean0.getRole();
        java.lang.String str10 = referenceBean0.getChild();
        referenceBean0.setChild("");
        referenceBean0.setType("ch.rasc.extclassgenerator.ModelAnnotationProcessor");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});" + "'", str7, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00744");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
        hasOneAssociation1.setPrimaryKey("creditCardNumber");
        java.lang.String str4 = hasOneAssociation1.getName();
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00745");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        modelFieldBean2.setCritical((java.lang.Boolean) false);
        java.lang.Boolean boolean7 = modelFieldBean2.getUnique();
        java.lang.Boolean boolean8 = modelFieldBean2.getAllowNull();
        java.util.List<ch.rasc.extclassgenerator.validation.AbstractValidation> abstractValidationList9 = modelFieldBean2.getValidators();
        modelFieldBean2.setAllowBlank((java.lang.Boolean) false);
        java.lang.String str12 = modelFieldBean2.getCalculate();
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertNull(abstractValidationList9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00746");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        java.lang.String str6 = modelFieldBean2.getMapping();
        java.lang.String str7 = modelFieldBean2.getName();
        java.lang.String str8 = modelFieldBean2.getConvert();
        java.lang.String str9 = modelFieldBean2.getCalculate();
        java.util.List<java.lang.String> strList10 = modelFieldBean2.getDepends();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strList10);
    }

    @Test
    public void test00747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00747");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("Ext.data.Model", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
        modelFieldBean2.setPersist((java.lang.Boolean) false);
        java.lang.Class<?> wildcardClass5 = modelFieldBean2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00748");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        java.lang.String str1 = apiObject0.update;
        apiObject0.update = "";
        apiObject0.read = "";
        java.lang.String str6 = apiObject0.destroy;
        java.lang.String str7 = apiObject0.create;
        apiObject0.create = "hasOne";
        apiObject0.destroy = "Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00749");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        java.lang.String str2 = hasOneAssociation1.getPrimaryKey();
        java.lang.String str3 = hasOneAssociation1.getSetterName();
        java.lang.String str4 = hasOneAssociation1.getSetterName();
        hasOneAssociation1.setSetterName("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00750");
        ch.rasc.extclassgenerator.validation.DigitsValidation digitsValidation3 = new ch.rasc.extclassgenerator.validation.DigitsValidation("Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});", (int) (short) 100, (int) (byte) 100);
    }

    @Test
    public void test00751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00751");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});";
        apiObject0.update = "json";
        apiObject0.destroy = "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/";
        java.lang.String str10 = apiObject0.update;
        java.lang.String str11 = apiObject0.read;
        java.lang.String str12 = apiObject0.destroy;
        apiObject0.destroy = "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});";
        apiObject0.create = "/\\/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});\\//";
        apiObject0.read = "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[],proxy:{type:\"direct\",directFn:hi!}});";
        apiObject0.destroy = "";
        apiObject0.update = "/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/";
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.LineEnding\",{extend:\"Ext.data.Model\",config:{fields:[]}});";
        java.lang.String str25 = apiObject0.read;
        apiObject0.read = "inclusion";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "json" + "'", str10, "json");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/" + "'", str12, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[],proxy:{type:\"direct\",directFn:hi!}});" + "'", str25, "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[],proxy:{type:\"direct\",directFn:hi!}});");
    }

    @Test
    public void test00752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00752");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});";
        apiObject0.update = "json";
        apiObject0.destroy = "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/";
        java.lang.String str10 = apiObject0.update;
        java.lang.String str11 = apiObject0.destroy;
        apiObject0.create = "belongsTo";
        apiObject0.destroy = "hasOne";
        apiObject0.destroy = "Ext.data.Model";
        apiObject0.destroy = "belongsTo";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "json" + "'", str10, "json");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/" + "'", str11, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
    }

    @Test
    public void test00753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00753");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        java.lang.String str6 = referenceBean0.getParent();
        boolean boolean7 = referenceBean0.hasAnyProperties();
        java.lang.String str8 = referenceBean0.getType();
        java.lang.String str9 = referenceBean0.getRole();
        referenceBean0.setParent("hi!");
        referenceBean0.setParent("/\\/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});\\//");
        referenceBean0.setChild("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00754");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.update = "exclusion";
        java.lang.String str8 = apiObject0.update;
        java.lang.String str9 = apiObject0.read;
        apiObject0.create = "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});/";
        java.lang.String str12 = apiObject0.destroy;
        java.lang.Class<?> wildcardClass13 = apiObject0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "exclusion" + "'", str8, "exclusion");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00755");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        java.lang.String str6 = referenceBean0.getAssociation();
        referenceBean0.setInverse("");
        java.lang.String str9 = referenceBean0.getParent();
        java.lang.String str10 = referenceBean0.getRole();
        boolean boolean11 = referenceBean0.typeOnly();
        referenceBean0.setAssociation("exclusion");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00756");
        ch.rasc.extclassgenerator.ModelAnnotationProcessor modelAnnotationProcessor0 = new ch.rasc.extclassgenerator.ModelAnnotationProcessor();
        java.util.Set<java.lang.String> strSet1 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        javax.lang.model.SourceVersion sourceVersion2 = modelAnnotationProcessor0.getSupportedSourceVersion();
        java.util.Set<java.lang.String> strSet3 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        java.util.Set<java.lang.String> strSet4 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertTrue("'" + sourceVersion2 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion2.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test00757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00757");
        ch.rasc.extclassgenerator.validation.FutureValidation futureValidation1 = new ch.rasc.extclassgenerator.validation.FutureValidation("/range/");
        java.lang.String str2 = futureValidation1.getField();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/range/" + "'", str2, "/range/");
    }

    @Test
    public void test00758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00758");
        ch.rasc.extclassgenerator.ModelAnnotationProcessor modelAnnotationProcessor0 = new ch.rasc.extclassgenerator.ModelAnnotationProcessor();
        java.util.Set<java.lang.String> strSet1 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        java.util.Set<java.lang.String> strSet2 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        javax.lang.model.SourceVersion sourceVersion3 = modelAnnotationProcessor0.getSupportedSourceVersion();
        java.util.Set<java.lang.String> strSet4 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        java.util.Set<java.lang.String> strSet5 = modelAnnotationProcessor0.getSupportedOptions();
        javax.annotation.processing.ProcessingEnvironment processingEnvironment6 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelAnnotationProcessor0.init(processingEnvironment6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Tool provided null ProcessingEnvironment");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + sourceVersion3 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion3.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test00759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00759");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.read;
        apiObject0.update = "hi!";
        apiObject0.update = "ch.rasc.extclassgenerator.ModelAnnotationProcessor";
        apiObject0.destroy = "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});/";
        java.lang.String str10 = apiObject0.create;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00760");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Object obj5 = modelFieldBean2.getReference();
        java.lang.String str6 = modelFieldBean2.getName();
        ch.rasc.extclassgenerator.OutputConfig outputConfig7 = new ch.rasc.extclassgenerator.OutputConfig();
        boolean boolean8 = outputConfig7.isSurroundApiWithQuotes();
        boolean boolean9 = outputConfig7.isSurroundApiWithQuotes();
        boolean boolean10 = modelFieldBean2.hasOnlyName(outputConfig7);
        java.lang.String str11 = modelFieldBean2.getDateFormat();
        modelFieldBean2.setUnique((java.lang.Boolean) true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00761");
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation3 = new ch.rasc.extclassgenerator.validation.RangeValidation("/range/", (java.lang.Long) 1L, (java.lang.Long) 97L);
    }

    @Test
    public void test00762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00762");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
        java.lang.String str2 = hasOneAssociation1.getSetterName();
        hasOneAssociation1.setName("length");
        hasOneAssociation1.setAssociationKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00763");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        java.lang.String str6 = modelFieldBean2.getMapping();
        java.lang.String str7 = modelFieldBean2.getName();
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray14 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList12);
        modelFieldBean2.setDepends((java.util.List<java.lang.String>) strList12);
        java.lang.Boolean boolean16 = modelFieldBean2.getPersist();
        java.lang.Boolean boolean17 = modelFieldBean2.getCritical();
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        java.lang.String str20 = modelFieldBean2.getName();
        modelFieldBean2.setConvert("/Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});/");
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertNull(boolean17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test00764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00764");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean4 = allDataOptionsBean0.getPersist();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        allDataOptionsBean0.setPersist((java.lang.Boolean) false);
        boolean boolean9 = allDataOptionsBean0.hasAnyProperties();
        allDataOptionsBean0.setChanges((java.lang.Boolean) false);
        java.lang.Boolean boolean12 = allDataOptionsBean0.getChanges();
        java.lang.Boolean boolean13 = allDataOptionsBean0.getChanges();
        java.lang.Boolean boolean14 = allDataOptionsBean0.getCritical();
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + false + "'", boolean12, false);
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + false + "'", boolean13, false);
        org.junit.Assert.assertNull(boolean14);
    }

    @Test
    public void test00765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00765");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("/hasMany/", (java.lang.Long) 100L, (java.lang.Long) 32L);
    }

    @Test
    public void test00766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00766");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        modelBean0.setIdProperty("");
        boolean boolean5 = modelBean0.isDisablePagingParameters();
        modelBean0.setExtend("");
        ch.rasc.extclassgenerator.PartialDataOptionsBean partialDataOptionsBean8 = modelBean0.getPartialDataOptions();
        modelBean0.setMessageProperty("hi!");
        modelBean0.setWriteAllFields((java.lang.Boolean) false);
        java.lang.String str13 = modelBean0.getName();
        modelBean0.setIdentifier("Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
        modelBean0.setRootProperty("Ext.define(\"null\",{extend:\"Ext.data.Model\",idProperty:\"hi!\",fields:[],proxy:{type:\"direct\",idParam:\"hi!\"}});");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(partialDataOptionsBean8);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test00767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00767");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        java.lang.Boolean boolean3 = modelFieldBean2.getCritical();
        java.util.List<ch.rasc.extclassgenerator.validation.AbstractValidation> abstractValidationList4 = modelFieldBean2.getValidators();
        java.lang.String str5 = modelFieldBean2.getType();
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNull(abstractValidationList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});" + "'", str5, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
    }

    @Test
    public void test00768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00768");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.update = "exclusion";
        java.lang.String str8 = apiObject0.update;
        java.lang.String str9 = apiObject0.read;
        apiObject0.create = "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});/";
        java.lang.String str12 = apiObject0.destroy;
        apiObject0.read = "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "exclusion" + "'", str8, "exclusion");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00769");
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation4 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal5 = rangeValidation4.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation11 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal12 = rangeValidation11.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation16 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal17 = rangeValidation16.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation18 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal12, bigDecimal17);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation23 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal24 = rangeValidation23.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation28 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal29 = rangeValidation28.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation30 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal24, bigDecimal29);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation31 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal17, bigDecimal24);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation32 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/", bigDecimal5, bigDecimal17);
        java.lang.String str33 = rangeValidation32.getField();
        java.lang.String str34 = rangeValidation32.getField();
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/" + "'", str33, "/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/" + "'", str34, "/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/");
    }

    @Test
    public void test00770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00770");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getRole();
        referenceBean0.setChild("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        referenceBean0.setAssociation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        referenceBean0.setRole("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        referenceBean0.setChild("hi!");
        referenceBean0.setRole("json");
        java.lang.String str13 = referenceBean0.getType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test00771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00771");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean4 = allDataOptionsBean0.getCritical();
        allDataOptionsBean0.setCritical((java.lang.Boolean) true);
        boolean boolean7 = allDataOptionsBean0.hasAnyProperties();
        allDataOptionsBean0.setPersist((java.lang.Boolean) true);
        allDataOptionsBean0.setPersist((java.lang.Boolean) false);
        java.lang.Boolean boolean12 = allDataOptionsBean0.getPersist();
        java.lang.Boolean boolean13 = allDataOptionsBean0.getCritical();
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + false + "'", boolean12, false);
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + true + "'", boolean13, true);
    }

    @Test
    public void test00772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00772");
        ch.rasc.extclassgenerator.validation.PastValidation pastValidation1 = new ch.rasc.extclassgenerator.validation.PastValidation("Ext.define(\"ch.rasc.extclassgenerator.validation.PresenceValidation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"field\",\n    type : \"string\"\n  } ]\n});");
    }

    @Test
    public void test00773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00773");
        ch.rasc.extclassgenerator.ModelType modelType1 = null;
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("", modelType1);
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean5 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean5.setConvert("hi!");
        java.lang.Boolean boolean8 = modelFieldBean5.getPersist();
        java.lang.String str9 = modelFieldBean5.getMapping();
        java.lang.String str10 = modelFieldBean5.getName();
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray17 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList15);
        modelFieldBean5.setDepends((java.util.List<java.lang.String>) strList15);
        modelFieldBean5.setCalculate("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean24 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean24.setConvert("hi!");
        java.lang.Boolean boolean27 = modelFieldBean24.getPersist();
        java.lang.String str28 = modelFieldBean24.getMapping();
        java.lang.String str29 = modelFieldBean24.getName();
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray36 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList34);
        modelFieldBean24.setDepends((java.util.List<java.lang.String>) strList34);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray38 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});", (java.util.List<java.lang.String>) strList34);
        modelFieldBean5.setDepends((java.util.List<java.lang.String>) strList34);
        modelFieldBean2.setDepends((java.util.List<java.lang.String>) strList34);
        java.lang.Class<?> wildcardClass41 = modelFieldBean2.getClass();
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(boolean27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test00774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00774");
        ch.rasc.extclassgenerator.validation.NotBlankValidation notBlankValidation1 = new ch.rasc.extclassgenerator.validation.NotBlankValidation("Ext.define(\"ch.rasc.extclassgenerator.validation.PresenceValidation\",{extend:\"Ext.data.Model\",fields:[{name:\"type\",type:\"string\"},{name:\"field\",type:\"string\"}]});");
    }

    @Test
    public void test00775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00775");
        ch.rasc.extclassgenerator.ModelType modelType1 = null;
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});", modelType1);
        modelFieldBean2.setMapping("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
    }

    @Test
    public void test00776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00776");
        ch.rasc.extclassgenerator.validation.ExclusionValidation exclusionValidation2 = new ch.rasc.extclassgenerator.validation.ExclusionValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});", "hasMany");
        java.lang.String str3 = exclusionValidation2.getList();
        java.lang.String str4 = exclusionValidation2.getList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hasMany" + "'", str3, "hasMany");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hasMany" + "'", str4, "hasMany");
    }

    @Test
    public void test00777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00777");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        java.lang.String str6 = modelFieldBean2.getMapping();
        java.lang.String str7 = modelFieldBean2.getName();
        java.lang.Boolean boolean8 = modelFieldBean2.getUnique();
        java.lang.Boolean boolean9 = modelFieldBean2.getPersist();
        java.lang.String str10 = modelFieldBean2.getType();
        ch.rasc.extclassgenerator.PartialDataOptionsBean partialDataOptionsBean11 = new ch.rasc.extclassgenerator.PartialDataOptionsBean();
        java.lang.Boolean boolean12 = partialDataOptionsBean11.getAssociated();
        java.lang.Boolean boolean13 = partialDataOptionsBean11.getChanges();
        modelFieldBean2.setReference((java.lang.Object) partialDataOptionsBean11);
        java.lang.Boolean boolean15 = modelFieldBean2.getAllowBlank();
        java.lang.Boolean boolean16 = modelFieldBean2.getUseNull();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str10, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertNull(boolean15);
        org.junit.Assert.assertNull(boolean16);
    }

    @Test
    public void test00778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00778");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        java.lang.String str6 = modelFieldBean2.getMapping();
        java.lang.String str7 = modelFieldBean2.getName();
        java.lang.String str8 = modelFieldBean2.getConvert();
        ch.rasc.extclassgenerator.ModelType modelType9 = modelFieldBean2.getModelType();
        java.lang.String str10 = modelFieldBean2.getType();
        modelFieldBean2.setCalculate("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        java.lang.Boolean boolean13 = modelFieldBean2.getPersist();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(modelType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str10, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(boolean13);
    }

    @Test
    public void test00779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00779");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/");
        java.lang.String str2 = belongsToAssociation1.getModel();
        belongsToAssociation1.setForeignKey("Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
        belongsToAssociation1.setGetterName("Ext.data.Model");
        belongsToAssociation1.setPrimaryKey("/\\/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});\\//");
        belongsToAssociation1.setGetterName("Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
        belongsToAssociation1.setGetterName("Ext.define(\"ch.rasc.extclassgenerator.validation.PresenceValidation\",{extend:\"Ext.data.Model\",fields:[{name:\"type\",type:\"string\"},{name:\"field\",type:\"string\"}]});");
        java.lang.String str13 = belongsToAssociation1.getForeignKey();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/" + "'", str2, "/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});" + "'", str13, "Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
    }

    @Test
    public void test00780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00780");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getRole();
        referenceBean0.setInverse("");
        referenceBean0.setChild("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});");
        referenceBean0.setChild("/range/");
        referenceBean0.setType("ch.rasc.extclassgenerator.ModelBean");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00781");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("Ext.define(\"ch.rasc.extclassgenerator.LineEnding\",{extend:\"Ext.data.Model\",config:{fields:[]}});", (java.lang.Long) 0L, (java.lang.Long) 10L);
    }

    @Test
    public void test00782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00782");
        ch.rasc.extclassgenerator.validation.DigitsValidation digitsValidation3 = new ch.rasc.extclassgenerator.validation.DigitsValidation("", (int) ' ', (int) (byte) 1);
        int int4 = digitsValidation3.getInteger();
        int int5 = digitsValidation3.getInteger();
        java.lang.String str6 = digitsValidation3.getType();
        java.lang.String str7 = digitsValidation3.getType();
        int int8 = digitsValidation3.getFraction();
        int int9 = digitsValidation3.getInteger();
        int int10 = digitsValidation3.getFraction();
        int int11 = digitsValidation3.getInteger();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "digits" + "'", str6, "digits");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "digits" + "'", str7, "digits");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
    }

    @Test
    public void test00783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00783");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getType();
        referenceBean0.setRole("hi!");
        java.lang.String str4 = referenceBean0.getChild();
        java.lang.String str5 = referenceBean0.getInverse();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00784");
        ch.rasc.extclassgenerator.validation.CreditCardNumberValidation creditCardNumberValidation1 = new ch.rasc.extclassgenerator.validation.CreditCardNumberValidation("/hasMany/");
    }

    @Test
    public void test00785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00785");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        java.lang.String str2 = hasOneAssociation1.getName();
        java.lang.String str3 = hasOneAssociation1.getSetterName();
        java.lang.String str4 = hasOneAssociation1.getPrimaryKey();
        java.lang.String str5 = hasOneAssociation1.getGetterName();
        java.lang.String str6 = hasOneAssociation1.getForeignKey();
        hasOneAssociation1.setName("/ch.rasc.extclassgenerator.ModelAnnotationProcessor/");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00786");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        modelFieldBean2.setMapping("hi!");
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        modelFieldBean2.setAllowBlank((java.lang.Boolean) false);
        java.util.List<ch.rasc.extclassgenerator.validation.AbstractValidation> abstractValidationList11 = modelFieldBean2.getValidators();
        modelFieldBean2.setUseNull((java.lang.Boolean) false);
        java.lang.Boolean boolean14 = modelFieldBean2.getCritical();
        org.junit.Assert.assertNull(abstractValidationList11);
        org.junit.Assert.assertNull(boolean14);
    }

    @Test
    public void test00787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00787");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        java.lang.String str2 = hasOneAssociation1.getName();
        hasOneAssociation1.setInstanceName("");
        java.lang.String str5 = hasOneAssociation1.getSetterName();
        hasOneAssociation1.setGetterName("exclusion");
        hasOneAssociation1.setPrimaryKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        java.lang.String str10 = hasOneAssociation1.getType();
        java.lang.String str11 = hasOneAssociation1.getSetterName();
        hasOneAssociation1.setGetterName("hasMany");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hasOne" + "'", str10, "hasOne");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00788");
        ch.rasc.extclassgenerator.PartialDataOptionsBean partialDataOptionsBean0 = new ch.rasc.extclassgenerator.PartialDataOptionsBean();
        boolean boolean1 = partialDataOptionsBean0.hasAnyProperties();
        partialDataOptionsBean0.setPersist((java.lang.Boolean) false);
        java.lang.Boolean boolean4 = partialDataOptionsBean0.getCritical();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test00789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00789");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        referenceBean0.setType("");
        java.lang.String str3 = referenceBean0.getAssociation();
        referenceBean0.setInverse("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        java.lang.String str6 = referenceBean0.getType();
        java.lang.String str7 = referenceBean0.getChild();
        referenceBean0.setType("Ext.define(\"null\",{extend:\"Ext.data.Model\",idProperty:\"hi!\",fields:[],proxy:{type:\"direct\",idParam:\"hi!\"}});");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00790");
        ch.rasc.extclassgenerator.OutputConfig outputConfig0 = new ch.rasc.extclassgenerator.OutputConfig();
        boolean boolean1 = outputConfig0.isDebug();
        boolean boolean2 = outputConfig0.isSurroundApiWithQuotes();
        ch.rasc.extclassgenerator.OutputFormat outputFormat3 = ch.rasc.extclassgenerator.OutputFormat.EXTJS5;
        outputConfig0.setOutputFormat(outputFormat3);
        ch.rasc.extclassgenerator.OutputFormat outputFormat5 = outputConfig0.getOutputFormat();
        ch.rasc.extclassgenerator.LineEnding lineEnding6 = outputConfig0.getLineEnding();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + outputFormat3 + "' != '" + ch.rasc.extclassgenerator.OutputFormat.EXTJS5 + "'", outputFormat3.equals(ch.rasc.extclassgenerator.OutputFormat.EXTJS5));
        org.junit.Assert.assertTrue("'" + outputFormat5 + "' != '" + ch.rasc.extclassgenerator.OutputFormat.EXTJS5 + "'", outputFormat5.equals(ch.rasc.extclassgenerator.OutputFormat.EXTJS5));
        org.junit.Assert.assertNull(lineEnding6);
    }

    @Test
    public void test00791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00791");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        referenceBean0.setRole("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
        java.lang.String str12 = referenceBean0.getRole();
        boolean boolean13 = referenceBean0.hasAnyProperties();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});" + "'", str12, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test00792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00792");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getParent();
        java.lang.String str3 = referenceBean0.getAssociation();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00793");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getChild();
        java.lang.String str2 = referenceBean0.getChild();
        referenceBean0.setAssociation("creditCardNumber");
        referenceBean0.setType("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        referenceBean0.setChild("length");
        referenceBean0.setParent("json");
        boolean boolean11 = referenceBean0.typeOnly();
        referenceBean0.setRole("/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/");
        java.lang.String str14 = referenceBean0.getChild();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "length" + "'", str14, "length");
    }

    @Test
    public void test00794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00794");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("exclusion");
        belongsToAssociation1.setGetterName("creditCardNumber");
    }

    @Test
    public void test00795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00795");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        modelBean0.setIdProperty("");
        boolean boolean5 = modelBean0.isDisablePagingParameters();
        modelBean0.setReadMethod("");
        boolean boolean8 = modelBean0.isDisablePagingParameters();
        java.lang.String str9 = modelBean0.getWriter();
        java.lang.String str10 = modelBean0.getClientIdProperty();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "json" + "'", str9, "json");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00796");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        hasOneAssociation1.setInstanceName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        hasOneAssociation1.setName("creditCardNumber");
        java.lang.String str6 = hasOneAssociation1.getGetterName();
        hasOneAssociation1.setForeignKey("Ext.data.Model");
        java.lang.String str9 = hasOneAssociation1.getName();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "creditCardNumber" + "'", str9, "creditCardNumber");
    }

    @Test
    public void test00797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00797");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        modelBean0.setIdProperty("");
        modelBean0.setExtend("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean9 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean9.setConvert("hi!");
        modelFieldBean9.setMapping("hi!");
        modelFieldBean9.setUseNull((java.lang.Boolean) true);
        modelFieldBean9.setAllowBlank((java.lang.Boolean) false);
        modelBean0.addField(modelFieldBean9);
        modelBean0.setExtend("Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});");
    }

    @Test
    public void test00798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00798");
        ch.rasc.extclassgenerator.validation.DigitsValidation digitsValidation3 = new ch.rasc.extclassgenerator.validation.DigitsValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});", (-1), 0);
        int int4 = digitsValidation3.getFraction();
        int int5 = digitsValidation3.getFraction();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test00799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00799");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        hasOneAssociation1.setInstanceName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        hasOneAssociation1.setName("creditCardNumber");
        java.lang.String str6 = hasOneAssociation1.getGetterName();
        hasOneAssociation1.setForeignKey("Ext.data.Model");
        hasOneAssociation1.setSetterName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
        java.lang.String str11 = hasOneAssociation1.getInstanceName();
        java.lang.String str12 = hasOneAssociation1.getName();
        java.lang.String str13 = hasOneAssociation1.getName();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str11, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "creditCardNumber" + "'", str12, "creditCardNumber");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "creditCardNumber" + "'", str13, "creditCardNumber");
    }

    @Test
    public void test00800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00800");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        referenceBean0.setType("");
        java.lang.String str3 = referenceBean0.getAssociation();
        referenceBean0.setInverse("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        java.lang.String str6 = referenceBean0.getInverse();
        java.lang.String str7 = referenceBean0.getParent();
        referenceBean0.setChild("ch.rasc.extclassgenerator.ModelAnnotationProcessor");
        boolean boolean10 = referenceBean0.typeOnly();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});" + "'", str6, "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00801");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.read = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str8 = apiObject0.update;
        java.lang.String str9 = apiObject0.destroy;
        apiObject0.destroy = "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.update = "/Ext.data.Model/";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str8, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00802");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        modelFieldBean2.setMapping("hi!");
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        modelFieldBean2.setAllowBlank((java.lang.Boolean) false);
        modelFieldBean2.setConvert("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        java.lang.Object obj13 = modelFieldBean2.getDefaultValue();
        java.lang.Boolean boolean14 = modelFieldBean2.getPersist();
        java.lang.Boolean boolean15 = modelFieldBean2.getPersist();
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertNull(boolean15);
    }

    @Test
    public void test00803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00803");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
    }

    @Test
    public void test00804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00804");
        ch.rasc.extclassgenerator.validation.ExclusionValidation exclusionValidation2 = new ch.rasc.extclassgenerator.validation.ExclusionValidation("Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});", "digits");
    }

    @Test
    public void test00805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00805");
        ch.rasc.extclassgenerator.ModelType modelType1 = null;
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("", modelType1);
        java.lang.Boolean boolean3 = modelFieldBean2.getUseNull();
        modelFieldBean2.setMapping("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        java.lang.String str6 = modelFieldBean2.getMapping();
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});" + "'", str6, "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
    }

    @Test
    public void test00806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00806");
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation3 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"null\",{extend:\"Ext.data.Model\",idProperty:\"hi!\",fields:[],proxy:{type:\"direct\",idParam:\"hi!\"}});", (java.lang.Long) (-1L), (java.lang.Long) 0L);
    }

    @Test
    public void test00807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00807");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.data.Model");
        java.lang.String str3 = modelFieldBean2.getCalculate();
        java.lang.Boolean boolean4 = modelFieldBean2.getCritical();
        java.lang.Boolean boolean5 = modelFieldBean2.getAllowNull();
        modelFieldBean2.setPersist((java.lang.Boolean) false);
        modelFieldBean2.setUnique((java.lang.Boolean) true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNull(boolean5);
    }

    @Test
    public void test00808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00808");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/", (java.lang.Integer) (-1), (java.lang.Integer) 1);
    }

    @Test
    public void test00809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00809");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});";
        apiObject0.update = "json";
        apiObject0.destroy = "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/";
        java.lang.String str10 = apiObject0.update;
        java.lang.String str11 = apiObject0.read;
        java.lang.String str12 = apiObject0.destroy;
        apiObject0.destroy = "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});";
        apiObject0.read = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});";
        java.lang.String str17 = apiObject0.create;
        java.lang.String str18 = apiObject0.update;
        java.lang.String str19 = apiObject0.destroy;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "json" + "'", str10, "json");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/" + "'", str12, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});" + "'", str17, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "json" + "'", str18, "json");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});" + "'", str19, "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
    }

    @Test
    public void test00810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00810");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        java.lang.String str6 = modelFieldBean2.getMapping();
        java.lang.String str7 = modelFieldBean2.getName();
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray14 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList12);
        modelFieldBean2.setDepends((java.util.List<java.lang.String>) strList12);
        modelFieldBean2.setCalculate("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean21 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean21.setConvert("hi!");
        java.lang.Boolean boolean24 = modelFieldBean21.getPersist();
        java.lang.String str25 = modelFieldBean21.getMapping();
        java.lang.String str26 = modelFieldBean21.getName();
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray33 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList31);
        modelFieldBean21.setDepends((java.util.List<java.lang.String>) strList31);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray35 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});", (java.util.List<java.lang.String>) strList31);
        modelFieldBean2.setDepends((java.util.List<java.lang.String>) strList31);
        java.lang.Object obj37 = null;
        modelFieldBean2.setReference(obj37);
        modelFieldBean2.setCritical((java.lang.Boolean) false);
        java.lang.String str41 = modelFieldBean2.getCalculate();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(boolean24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});" + "'", str41, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
    }

    @Test
    public void test00811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00811");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.read = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});";
        apiObject0.read = "json";
        apiObject0.read = "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
    }

    @Test
    public void test00812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00812");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        ch.rasc.extclassgenerator.validation.GenericValidation genericValidation3 = new ch.rasc.extclassgenerator.validation.GenericValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", strMap2);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = genericValidation3.getOptions();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = genericValidation3.getOptions();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = genericValidation3.getOptions();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = genericValidation3.getOptions();
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap7);
    }

    @Test
    public void test00813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00813");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hasMany", "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});/");
        modelFieldBean2.setDateFormat("");
        java.lang.Boolean boolean5 = modelFieldBean2.getAllowBlank();
        org.junit.Assert.assertNull(boolean5);
    }

    @Test
    public void test00814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00814");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("hi!");
        hasManyAssociation1.setForeignKey("");
        java.lang.Boolean boolean4 = hasManyAssociation1.getAutoLoad();
        java.lang.String str5 = hasManyAssociation1.getName();
        hasManyAssociation1.setAutoLoad((java.lang.Boolean) false);
        java.lang.String str8 = hasManyAssociation1.getName();
        java.lang.Boolean boolean9 = hasManyAssociation1.getAutoLoad();
        java.lang.Boolean boolean10 = hasManyAssociation1.getAutoLoad();
        hasManyAssociation1.setAutoLoad((java.lang.Boolean) true);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + false + "'", boolean9, false);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + false + "'", boolean10, false);
    }

    @Test
    public void test00815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00815");
        ch.rasc.extclassgenerator.validation.FutureValidation futureValidation1 = new ch.rasc.extclassgenerator.validation.FutureValidation("/Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});/");
    }

    @Test
    public void test00816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00816");
        ch.rasc.extclassgenerator.validation.PresenceValidation presenceValidation1 = new ch.rasc.extclassgenerator.validation.PresenceValidation("ch.rasc.extclassgenerator.ModelBean");
    }

    @Test
    public void test00817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00817");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        java.lang.String str3 = modelBean0.getIdProperty();
        modelBean0.setTotalProperty("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str6 = modelBean0.getCreateMethod();
        java.lang.String[] strArray7 = modelBean0.getHasMany();
        modelBean0.setWriter("/Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});/");
        java.lang.String str10 = modelBean0.getReadMethod();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00818");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        ch.rasc.extclassgenerator.validation.GenericValidation genericValidation3 = new ch.rasc.extclassgenerator.validation.GenericValidation("Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});", "hi!", strMap2);
    }

    @Test
    public void test00819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00819");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        java.lang.String str6 = modelFieldBean2.getMapping();
        java.lang.Object obj7 = modelFieldBean2.getReference();
        modelFieldBean2.setCalculate("exclusion");
        modelFieldBean2.setMapping("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]}});");
        ch.rasc.extclassgenerator.ModelType modelType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelFieldBean2.setModelType(modelType12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test00820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00820");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.destroy = "";
        apiObject0.destroy = "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/";
        java.lang.String str5 = apiObject0.read;
        java.lang.String str6 = apiObject0.destroy;
        java.lang.String str7 = apiObject0.create;
        java.lang.String str8 = apiObject0.read;
        apiObject0.create = "ch.rasc.extclassgenerator.PartialDataOptionsBean";
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/" + "'", str6, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00821");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        modelFieldBean2.setMapping("hi!");
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        modelFieldBean2.setAllowBlank((java.lang.Boolean) false);
        ch.rasc.extclassgenerator.OutputConfig outputConfig11 = new ch.rasc.extclassgenerator.OutputConfig();
        outputConfig11.setUseSingleQuotes(false);
        boolean boolean14 = modelFieldBean2.hasOnlyName(outputConfig11);
        modelFieldBean2.setAllowBlank((java.lang.Boolean) false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00822");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        modelFieldBean2.setMapping("hi!");
        java.lang.String str7 = modelFieldBean2.getMapping();
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray15 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList13);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray16 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("", (java.util.List<java.lang.String>) strList13);
        modelFieldBean2.setDepends((java.util.List<java.lang.String>) strList13);
        ch.rasc.extclassgenerator.OutputConfig outputConfig18 = new ch.rasc.extclassgenerator.OutputConfig();
        boolean boolean19 = outputConfig18.isDebug();
        ch.rasc.extclassgenerator.OutputFormat outputFormat20 = outputConfig18.getOutputFormat();
        boolean boolean21 = outputConfig18.isDebug();
        outputConfig18.setDebug(false);
        boolean boolean24 = modelFieldBean2.hasOnlyName(outputConfig18);
        modelFieldBean2.setName("length");
        java.lang.String str27 = modelFieldBean2.getType();
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean30 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean30.setConvert("hi!");
        java.lang.Object obj33 = modelFieldBean30.getReference();
        java.lang.String str34 = modelFieldBean30.getName();
        ch.rasc.extclassgenerator.OutputConfig outputConfig35 = new ch.rasc.extclassgenerator.OutputConfig();
        boolean boolean36 = outputConfig35.isSurroundApiWithQuotes();
        boolean boolean37 = outputConfig35.isSurroundApiWithQuotes();
        boolean boolean38 = modelFieldBean30.hasOnlyName(outputConfig35);
        java.lang.String str39 = modelFieldBean30.getDateFormat();
        java.lang.Boolean boolean40 = modelFieldBean30.getAllowNull();
        modelFieldBean2.setReference((java.lang.Object) modelFieldBean30);
        java.lang.String str42 = modelFieldBean2.getMapping();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(outputFormat20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str27, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(boolean40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
    }

    @Test
    public void test00823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00823");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        ch.rasc.extclassgenerator.validation.GenericValidation genericValidation3 = new ch.rasc.extclassgenerator.validation.GenericValidation("digits", "future", strMap2);
        java.lang.String str4 = genericValidation3.getField();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "future" + "'", str4, "future");
    }

    @Test
    public void test00824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00824");
        ch.rasc.extclassgenerator.ModelAnnotationProcessor modelAnnotationProcessor0 = new ch.rasc.extclassgenerator.ModelAnnotationProcessor();
        java.util.Set<java.lang.String> strSet1 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        java.util.Set<java.lang.String> strSet2 = modelAnnotationProcessor0.getSupportedOptions();
        javax.lang.model.element.Element element3 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror4 = null;
        javax.lang.model.element.ExecutableElement executableElement5 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable7 = modelAnnotationProcessor0.getCompletions(element3, annotationMirror4, executableElement5, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.util.Set<java.lang.String> strSet8 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        javax.lang.model.element.Element element9 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror10 = null;
        javax.lang.model.element.ExecutableElement executableElement11 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable13 = modelAnnotationProcessor0.getCompletions(element9, annotationMirror10, executableElement11, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
        java.util.Set<java.lang.String> strSet14 = modelAnnotationProcessor0.getSupportedOptions();
        javax.annotation.processing.ProcessingEnvironment processingEnvironment15 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelAnnotationProcessor0.init(processingEnvironment15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Tool provided null ProcessingEnvironment");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(wildcardIterable7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(wildcardIterable13);
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test00825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00825");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("");
        java.lang.String str2 = belongsToAssociation1.getInstanceName();
        belongsToAssociation1.setGetterName("json");
        java.lang.String str5 = belongsToAssociation1.getSetterName();
        belongsToAssociation1.setForeignKey("Ext.data.Model");
        java.lang.String str8 = belongsToAssociation1.getSetterName();
        java.lang.String str9 = belongsToAssociation1.getGetterName();
        java.lang.String str10 = belongsToAssociation1.getSetterName();
        belongsToAssociation1.setGetterName("ch.rasc.extclassgenerator.ModelAnnotationProcessor");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "json" + "'", str9, "json");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00826");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("ch.rasc.extclassgenerator.ModelBean", (java.lang.Integer) 0, (java.lang.Integer) 100);
    }

    @Test
    public void test00827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00827");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        java.lang.String str6 = modelFieldBean2.getMapping();
        java.lang.String str7 = modelFieldBean2.getName();
        java.lang.String str8 = modelFieldBean2.getConvert();
        ch.rasc.extclassgenerator.ModelType modelType9 = modelFieldBean2.getModelType();
        ch.rasc.extclassgenerator.ModelType modelType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelFieldBean2.setModelType(modelType10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(modelType9);
    }

    @Test
    public void test00828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00828");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        java.lang.String str3 = modelBean0.getIdProperty();
        modelBean0.setTotalProperty("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelBean0.setIdProperty("Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});");
        java.lang.String str8 = modelBean0.getCreateMethod();
        boolean boolean9 = modelBean0.isClientIdPropertyAddToWriter();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00829");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("hi!");
        hasManyAssociation1.setAssociationKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str4 = hasManyAssociation1.getInstanceName();
        hasManyAssociation1.setPrimaryKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str7 = hasManyAssociation1.getForeignKey();
        java.lang.Boolean boolean8 = hasManyAssociation1.getAutoLoad();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(boolean8);
    }

    @Test
    public void test00830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00830");
        ch.rasc.extclassgenerator.OutputConfig outputConfig0 = new ch.rasc.extclassgenerator.OutputConfig();
        boolean boolean1 = outputConfig0.isDebug();
        ch.rasc.extclassgenerator.OutputFormat outputFormat2 = outputConfig0.getOutputFormat();
        boolean boolean3 = outputConfig0.isDebug();
        ch.rasc.extclassgenerator.IncludeValidation includeValidation4 = outputConfig0.getIncludeValidation();
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean5 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean5.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean8 = allDataOptionsBean5.getAssociated();
        java.lang.Boolean boolean9 = allDataOptionsBean5.getPersist();
        allDataOptionsBean5.setAssociated((java.lang.Boolean) false);
        allDataOptionsBean5.setPersist((java.lang.Boolean) false);
        java.lang.Boolean boolean14 = allDataOptionsBean5.getAssociated();
        allDataOptionsBean5.setAssociated((java.lang.Boolean) true);
        boolean boolean17 = outputConfig0.equals((java.lang.Object) true);
        boolean boolean18 = outputConfig0.isUseSingleQuotes();
        ch.rasc.extclassgenerator.LineEnding lineEnding19 = outputConfig0.getLineEnding();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(outputFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(includeValidation4);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + false + "'", boolean8, false);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertEquals("'" + boolean14 + "' != '" + false + "'", boolean14, false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(lineEnding19);
    }

    @Test
    public void test00831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00831");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("/Ext.data.Model/", "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});");
        ch.rasc.extclassgenerator.ModelType modelType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelFieldBean2.setModelType(modelType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00832");
        ch.rasc.extclassgenerator.validation.EmailValidation emailValidation1 = new ch.rasc.extclassgenerator.validation.EmailValidation("Ext.define(\"null\",{extend:\"\",config:{fields:[]}});");
    }

    @Test
    public void test00833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00833");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean4 = allDataOptionsBean0.getPersist();
        java.lang.Boolean boolean5 = allDataOptionsBean0.getPersist();
        java.lang.Boolean boolean6 = allDataOptionsBean0.getPersist();
        allDataOptionsBean0.setPersist((java.lang.Boolean) true);
        allDataOptionsBean0.setPersist((java.lang.Boolean) false);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean6);
    }

    @Test
    public void test00834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00834");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        java.lang.String str6 = modelFieldBean2.getMapping();
        modelFieldBean2.setConvert("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation10 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        hasOneAssociation10.setInstanceName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setDefaultValue((java.lang.Object) hasOneAssociation10);
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation15 = new ch.rasc.extclassgenerator.association.HasOneAssociation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setReference((java.lang.Object) "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        ch.rasc.extclassgenerator.ModelType modelType17 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelFieldBean2.setModelType(modelType17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00835");
        ch.rasc.extclassgenerator.ModelAnnotationProcessor modelAnnotationProcessor0 = new ch.rasc.extclassgenerator.ModelAnnotationProcessor();
        java.util.Set<java.lang.String> strSet1 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        java.util.Set<java.lang.String> strSet2 = modelAnnotationProcessor0.getSupportedOptions();
        javax.lang.model.element.Element element3 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror4 = null;
        javax.lang.model.element.ExecutableElement executableElement5 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable7 = modelAnnotationProcessor0.getCompletions(element3, annotationMirror4, executableElement5, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.util.Set<java.lang.String> strSet8 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        javax.lang.model.element.Element element9 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror10 = null;
        javax.lang.model.element.ExecutableElement executableElement11 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable13 = modelAnnotationProcessor0.getCompletions(element9, annotationMirror10, executableElement11, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
        java.util.Set<java.lang.String> strSet14 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        javax.annotation.processing.ProcessingEnvironment processingEnvironment15 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelAnnotationProcessor0.init(processingEnvironment15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Tool provided null ProcessingEnvironment");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(wildcardIterable7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(wildcardIterable13);
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test00836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00836");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("Ext.define(\"ch.rasc.extclassgenerator.validation.PresenceValidation\",{extend:\"Ext.data.Model\",fields:[{name:\"type\",type:\"string\"},{name:\"field\",type:\"string\"}]});");
        hasManyAssociation1.setAutoLoad((java.lang.Boolean) false);
    }

    @Test
    public void test00837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00837");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("");
        java.lang.String str2 = belongsToAssociation1.getInstanceName();
        belongsToAssociation1.setGetterName("json");
        java.lang.String str5 = belongsToAssociation1.getSetterName();
        belongsToAssociation1.setForeignKey("Ext.data.Model");
        java.lang.String str8 = belongsToAssociation1.getSetterName();
        java.lang.String str9 = belongsToAssociation1.getGetterName();
        java.lang.String str10 = belongsToAssociation1.getSetterName();
        java.lang.String str11 = belongsToAssociation1.getPrimaryKey();
        java.lang.String str12 = belongsToAssociation1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "json" + "'", str9, "json");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "belongsTo" + "'", str12, "belongsTo");
    }

    @Test
    public void test00838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00838");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str3 = modelFieldBean2.getConvert();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00839");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        java.lang.String str2 = hasOneAssociation1.getName();
        hasOneAssociation1.setInstanceName("");
        java.lang.String str5 = hasOneAssociation1.getSetterName();
        hasOneAssociation1.setGetterName("exclusion");
        hasOneAssociation1.setPrimaryKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        hasOneAssociation1.setInstanceName("ch.rasc.extclassgenerator.ModelAnnotationProcessor");
        java.lang.String str12 = hasOneAssociation1.getName();
        hasOneAssociation1.setSetterName("ch.rasc.extclassgenerator.ModelAnnotationProcessor");
        hasOneAssociation1.setName("inclusion");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00840");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("");
        java.lang.String str2 = belongsToAssociation1.getInstanceName();
        belongsToAssociation1.setGetterName("json");
        java.lang.String str5 = belongsToAssociation1.getSetterName();
        belongsToAssociation1.setForeignKey("Ext.data.Model");
        java.lang.String str8 = belongsToAssociation1.getSetterName();
        java.lang.String str9 = belongsToAssociation1.getGetterName();
        belongsToAssociation1.setAssociationKey("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});/");
        java.lang.String str12 = belongsToAssociation1.getModel();
        belongsToAssociation1.setGetterName("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "json" + "'", str9, "json");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test00841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00841");
        javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse1 = null;
        ch.rasc.extclassgenerator.ModelBean modelBean2 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean2.setDisablePagingParameters(false);
        ch.rasc.extclassgenerator.OutputFormat outputFormat5 = ch.rasc.extclassgenerator.OutputFormat.TOUCH2;
        // The following exception was thrown during execution in test generation
        try {
            ch.rasc.extclassgenerator.ModelGenerator.writeModel(httpServletRequest0, httpServletResponse1, modelBean2, outputFormat5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + outputFormat5 + "' != '" + ch.rasc.extclassgenerator.OutputFormat.TOUCH2 + "'", outputFormat5.equals(ch.rasc.extclassgenerator.OutputFormat.TOUCH2));
    }

    @Test
    public void test00842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00842");
        ch.rasc.extclassgenerator.validation.FormatValidation formatValidation2 = new ch.rasc.extclassgenerator.validation.FormatValidation("Ext.data.Model", "/Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});/");
    }

    @Test
    public void test00843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00843");
        ch.rasc.extclassgenerator.validation.FormatValidation formatValidation2 = new ch.rasc.extclassgenerator.validation.FormatValidation("Ext.define(\"ch.rasc.extclassgenerator.validation.PresenceValidation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"field\",\n    type : \"string\"\n  } ]\n});", "creditCardNumber");
    }

    @Test
    public void test00844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00844");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("ch.rasc.extclassgenerator.PartialDataOptionsBean");
        belongsToAssociation1.setSetterName("format");
    }

    @Test
    public void test00845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00845");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        java.lang.String str6 = modelFieldBean2.getMapping();
        modelFieldBean2.setCritical((java.lang.Boolean) true);
        java.lang.String str9 = modelFieldBean2.getName();
        java.lang.Object obj10 = modelFieldBean2.getReference();
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation12 = new ch.rasc.extclassgenerator.association.HasManyAssociation("hi!");
        hasManyAssociation12.setPrimaryKey("creditCardNumber");
        hasManyAssociation12.setPrimaryKey("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});");
        modelFieldBean2.setDefaultValue((java.lang.Object) hasManyAssociation12);
        java.lang.String str18 = modelFieldBean2.getType();
        java.lang.String str19 = modelFieldBean2.getCalculate();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str18, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test00846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00846");
        ch.rasc.extclassgenerator.validation.DigitsValidation digitsValidation3 = new ch.rasc.extclassgenerator.validation.DigitsValidation("", (int) ' ', (int) (byte) 1);
        int int4 = digitsValidation3.getInteger();
        int int5 = digitsValidation3.getInteger();
        java.lang.String str6 = digitsValidation3.getType();
        java.lang.String str7 = digitsValidation3.getType();
        int int8 = digitsValidation3.getFraction();
        int int9 = digitsValidation3.getInteger();
        int int10 = digitsValidation3.getInteger();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "digits" + "'", str6, "digits");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "digits" + "'", str7, "digits");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test00847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00847");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("Ext.define(\"null\",{extend:\"\",fields:[]});");
    }

    @Test
    public void test00848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00848");
        ch.rasc.extclassgenerator.validation.EmailValidation emailValidation1 = new ch.rasc.extclassgenerator.validation.EmailValidation("/ch.rasc.extclassgenerator.ModelAnnotationProcessor/");
    }

    @Test
    public void test00849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00849");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("/hi!/", (java.lang.Long) 97L, (java.lang.Long) 35L);
    }

    @Test
    public void test00850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00850");
        ch.rasc.extclassgenerator.OutputConfig outputConfig0 = new ch.rasc.extclassgenerator.OutputConfig();
        boolean boolean1 = outputConfig0.isSurroundApiWithQuotes();
        boolean boolean2 = outputConfig0.isDebug();
        boolean boolean3 = outputConfig0.isSurroundApiWithQuotes();
        outputConfig0.setSurroundApiWithQuotes(false);
        boolean boolean6 = outputConfig0.isDebug();
        ch.rasc.extclassgenerator.LineEnding lineEnding7 = outputConfig0.getLineEnding();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(lineEnding7);
    }

    @Test
    public void test00851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00851");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("/Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});/", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
    }

    @Test
    public void test00852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00852");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        ch.rasc.extclassgenerator.validation.GenericValidation genericValidation3 = new ch.rasc.extclassgenerator.validation.GenericValidation("", "format", strMap2);
    }

    @Test
    public void test00853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00853");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        ch.rasc.extclassgenerator.validation.CreditCardNumberValidation creditCardNumberValidation6 = new ch.rasc.extclassgenerator.validation.CreditCardNumberValidation("");
        ch.rasc.extclassgenerator.validation.FormatValidation formatValidation9 = new ch.rasc.extclassgenerator.validation.FormatValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        ch.rasc.extclassgenerator.validation.FutureValidation futureValidation11 = new ch.rasc.extclassgenerator.validation.FutureValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        ch.rasc.extclassgenerator.validation.FormatValidation formatValidation14 = new ch.rasc.extclassgenerator.validation.FormatValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        ch.rasc.extclassgenerator.validation.AbstractValidation[] abstractValidationArray15 = new ch.rasc.extclassgenerator.validation.AbstractValidation[] { creditCardNumberValidation6, formatValidation9, futureValidation11, formatValidation14 };
        java.util.ArrayList<ch.rasc.extclassgenerator.validation.AbstractValidation> abstractValidationList16 = new java.util.ArrayList<ch.rasc.extclassgenerator.validation.AbstractValidation>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<ch.rasc.extclassgenerator.validation.AbstractValidation>) abstractValidationList16, abstractValidationArray15);
        modelFieldBean2.setValidators((java.util.List<ch.rasc.extclassgenerator.validation.AbstractValidation>) abstractValidationList16);
        modelFieldBean2.setAllowBlank((java.lang.Boolean) true);
        java.lang.Boolean boolean21 = modelFieldBean2.getUnique();
        org.junit.Assert.assertNotNull(abstractValidationArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(boolean21);
    }

    @Test
    public void test00854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00854");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.data.Model");
        modelFieldBean2.setConvert("hasOne");
        java.lang.Object obj5 = modelFieldBean2.getReference();
        modelFieldBean2.setDateFormat("");
        java.lang.Boolean boolean8 = modelFieldBean2.getPersist();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(boolean8);
    }

    @Test
    public void test00855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00855");
        ch.rasc.extclassgenerator.validation.EmailValidation emailValidation1 = new ch.rasc.extclassgenerator.validation.EmailValidation("creditCardNumber");
        java.lang.String str2 = emailValidation1.getType();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "email" + "'", str2, "email");
    }

    @Test
    public void test00856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00856");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        java.lang.String str3 = modelBean0.getReadMethod();
        java.lang.String str4 = modelBean0.getCreateMethod();
        java.lang.String str5 = modelBean0.getVersionProperty();
        modelBean0.setUpdateMethod("/Ext.data.Model/");
        java.lang.String str8 = modelBean0.getCreateMethod();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00857");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray6 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList4);
        java.util.List<java.lang.String> strList7 = inclusionValidationArray6.getList();
        java.lang.String str8 = inclusionValidationArray6.getField();
        java.util.List<java.lang.String> strList9 = inclusionValidationArray6.getList();
        java.util.List<java.lang.String> strList10 = inclusionValidationArray6.getList();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test00858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00858");
        ch.rasc.extclassgenerator.ModelAnnotationProcessor modelAnnotationProcessor0 = new ch.rasc.extclassgenerator.ModelAnnotationProcessor();
        java.util.Set<java.lang.String> strSet1 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        java.util.Set<java.lang.String> strSet2 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        java.util.Set<java.lang.String> strSet3 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        java.util.Set<java.lang.String> strSet4 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        javax.lang.model.SourceVersion sourceVersion5 = modelAnnotationProcessor0.getSupportedSourceVersion();
        java.util.Set<java.lang.String> strSet6 = modelAnnotationProcessor0.getSupportedOptions();
        javax.annotation.processing.ProcessingEnvironment processingEnvironment7 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelAnnotationProcessor0.init(processingEnvironment7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Tool provided null ProcessingEnvironment");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + sourceVersion5 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion5.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test00859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00859");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Object obj5 = modelFieldBean2.getReference();
        modelFieldBean2.setPersist((java.lang.Boolean) false);
        modelFieldBean2.setDateFormat("Ext.data.Model");
        java.lang.Boolean boolean10 = modelFieldBean2.getUnique();
        modelFieldBean2.setAllowBlank((java.lang.Boolean) true);
        java.lang.Object obj13 = modelFieldBean2.getReference();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test00860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00860");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getChild();
        java.lang.String str2 = referenceBean0.getRole();
        referenceBean0.setAssociation("");
        referenceBean0.setChild("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
        boolean boolean7 = referenceBean0.hasAnyProperties();
        referenceBean0.setType("Ext.define(\"ch.rasc.extclassgenerator.validation.PresenceValidation\",{extend:\"Ext.data.Model\",fields:[{name:\"type\",type:\"string\"},{name:\"field\",type:\"string\"}]});");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00861");
        ch.rasc.extclassgenerator.validation.PastValidation pastValidation1 = new ch.rasc.extclassgenerator.validation.PastValidation("Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[],proxy:{type:\"direct\",directFn:hi!,writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",config:{fields:[]}});\"}}}});");
    }

    @Test
    public void test00862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00862");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("presence", (java.lang.Integer) 97, (java.lang.Integer) 100);
    }

    @Test
    public void test00863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00863");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getParent();
        referenceBean0.setType("");
        referenceBean0.setRole("json");
        boolean boolean7 = referenceBean0.typeOnly();
        referenceBean0.setType("Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
        referenceBean0.setInverse("Ext.define(\"null\",{extend:\"\",config:{fields:[]}});");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00864");
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation3 = new ch.rasc.extclassgenerator.validation.RangeValidation("/\\/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});\\//", (java.lang.Long) 32L, (java.lang.Long) (-1L));
    }

    @Test
    public void test00865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00865");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        java.lang.String str3 = modelBean0.getIdProperty();
        modelBean0.setTotalProperty("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelBean0.setCreateMethod("creditCardNumber");
        modelBean0.setUpdateMethod("/ch.rasc.extclassgenerator.ModelAnnotationProcessor/");
        boolean boolean10 = modelBean0.isAutodetectTypes();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00866");
        ch.rasc.extclassgenerator.ModelAnnotationProcessor modelAnnotationProcessor0 = new ch.rasc.extclassgenerator.ModelAnnotationProcessor();
        java.util.Set<java.lang.String> strSet1 = modelAnnotationProcessor0.getSupportedOptions();
        javax.lang.model.SourceVersion sourceVersion2 = modelAnnotationProcessor0.getSupportedSourceVersion();
        java.util.Set<java.lang.String> strSet3 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        javax.lang.model.element.Element element4 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror5 = null;
        javax.lang.model.element.ExecutableElement executableElement6 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable8 = modelAnnotationProcessor0.getCompletions(element4, annotationMirror5, executableElement6, "digits");
        java.util.Set<java.lang.String> strSet9 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertTrue("'" + sourceVersion2 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion2.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(wildcardIterable8);
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test00867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00867");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});", (java.lang.Integer) 52, (java.lang.Integer) 97);
    }

    @Test
    public void test00868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00868");
        ch.rasc.extclassgenerator.validation.EmailValidation emailValidation1 = new ch.rasc.extclassgenerator.validation.EmailValidation("length");
    }

    @Test
    public void test00869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00869");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});", (java.lang.Long) 32L, (java.lang.Long) 97L);
    }

    @Test
    public void test00870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00870");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.update = "exclusion";
        apiObject0.read = "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});";
        java.lang.String str10 = apiObject0.update;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "exclusion" + "'", str10, "exclusion");
    }

    @Test
    public void test00871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00871");
        ch.rasc.extclassgenerator.validation.FutureValidation futureValidation1 = new ch.rasc.extclassgenerator.validation.FutureValidation("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
    }

    @Test
    public void test00872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00872");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        java.lang.String str6 = modelFieldBean2.getMapping();
        java.lang.String str7 = modelFieldBean2.getName();
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray14 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList12);
        modelFieldBean2.setDepends((java.util.List<java.lang.String>) strList12);
        java.lang.Boolean boolean16 = modelFieldBean2.getPersist();
        java.lang.Boolean boolean17 = modelFieldBean2.getCritical();
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        java.lang.Boolean boolean20 = modelFieldBean2.getAllowNull();
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertNull(boolean17);
        org.junit.Assert.assertEquals("'" + boolean20 + "' != '" + true + "'", boolean20, true);
    }

    @Test
    public void test00873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00873");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("hi!");
        hasManyAssociation1.setAssociationKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str4 = hasManyAssociation1.getInstanceName();
        hasManyAssociation1.setPrimaryKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str7 = hasManyAssociation1.getForeignKey();
        hasManyAssociation1.setInstanceName("hi!");
        hasManyAssociation1.setAutoLoad((java.lang.Boolean) false);
        java.lang.String str12 = hasManyAssociation1.getType();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hasMany" + "'", str12, "hasMany");
    }

    @Test
    public void test00874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00874");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("hasOne");
    }

    @Test
    public void test00875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00875");
        ch.rasc.extclassgenerator.ModelValidation modelValidation1 = null;
        ch.rasc.extclassgenerator.IncludeValidation includeValidation2 = ch.rasc.extclassgenerator.IncludeValidation.NONE;
        // The following exception was thrown during execution in test generation
        try {
            ch.rasc.extclassgenerator.validation.AbstractValidation abstractValidation3 = ch.rasc.extclassgenerator.validation.AbstractValidation.createValidation("/Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});/", modelValidation1, includeValidation2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + includeValidation2 + "' != '" + ch.rasc.extclassgenerator.IncludeValidation.NONE + "'", includeValidation2.equals(ch.rasc.extclassgenerator.IncludeValidation.NONE));
    }

    @Test
    public void test00876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00876");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean4 = allDataOptionsBean0.getCritical();
        java.lang.Boolean boolean5 = allDataOptionsBean0.getPersist();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        allDataOptionsBean0.setPersist((java.lang.Boolean) false);
        allDataOptionsBean0.setChanges((java.lang.Boolean) false);
        allDataOptionsBean0.setChanges((java.lang.Boolean) false);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNull(boolean5);
    }

    @Test
    public void test00877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00877");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("Ext.define(\"ch.rasc.extclassgenerator.validation.PresenceValidation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"field\",\n    type : \"string\"\n  } ]\n});", "/ch.rasc.extclassgenerator.ModelAnnotationProcessor/");
    }

    @Test
    public void test00878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00878");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        java.lang.String str2 = hasOneAssociation1.getGetterName();
        hasOneAssociation1.setGetterName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        java.lang.String str5 = hasOneAssociation1.getForeignKey();
        hasOneAssociation1.setAssociationKey("/Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});/");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00879");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("/ch.rasc.extclassgenerator.ModelAnnotationProcessor/", (java.lang.Integer) 10, (java.lang.Integer) 52);
    }

    @Test
    public void test00880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00880");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getChild();
        java.lang.String str3 = referenceBean0.getAssociation();
        java.lang.String str4 = referenceBean0.getType();
        referenceBean0.setType("inclusion");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00881");
        ch.rasc.extclassgenerator.PartialDataOptionsBean partialDataOptionsBean0 = new ch.rasc.extclassgenerator.PartialDataOptionsBean();
        boolean boolean1 = partialDataOptionsBean0.hasAnyProperties();
        boolean boolean2 = partialDataOptionsBean0.hasAnyProperties();
        partialDataOptionsBean0.setPersist((java.lang.Boolean) false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00882");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});", (java.lang.Integer) 35, (java.lang.Integer) (-1));
    }

    @Test
    public void test00883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00883");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        modelFieldBean2.setMapping("hi!");
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        modelFieldBean2.setAllowBlank((java.lang.Boolean) false);
        java.util.List<ch.rasc.extclassgenerator.validation.AbstractValidation> abstractValidationList11 = modelFieldBean2.getValidators();
        java.lang.String str12 = modelFieldBean2.getConvert();
        java.lang.Boolean boolean13 = modelFieldBean2.getPersist();
        java.lang.Boolean boolean14 = modelFieldBean2.getUnique();
        java.lang.Boolean boolean15 = modelFieldBean2.getCritical();
        org.junit.Assert.assertNull(abstractValidationList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertNull(boolean15);
    }

    @Test
    public void test00884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00884");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        ch.rasc.extclassgenerator.validation.GenericValidation genericValidation3 = new ch.rasc.extclassgenerator.validation.GenericValidation("/\\/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});\\//", "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});", strMap2);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = genericValidation3.getOptions();
        org.junit.Assert.assertNull(strMap4);
    }

    @Test
    public void test00885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00885");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.update = "exclusion";
        java.lang.String str8 = apiObject0.create;
        java.lang.String str9 = apiObject0.create;
        java.lang.String str10 = apiObject0.read;
        java.lang.String str11 = apiObject0.create;
        java.lang.String str12 = apiObject0.update;
        apiObject0.read = "/hi!/";
        java.lang.String str15 = apiObject0.update;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str8, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str9, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str11, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "exclusion" + "'", str12, "exclusion");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "exclusion" + "'", str15, "exclusion");
    }

    @Test
    public void test00886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00886");
        ch.rasc.extclassgenerator.validation.InclusionValidation inclusionValidation2 = new ch.rasc.extclassgenerator.validation.InclusionValidation("future", "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});");
        java.lang.String str3 = inclusionValidation2.getList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});");
    }

    @Test
    public void test00887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00887");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        ch.rasc.extclassgenerator.ModelType modelType7 = modelFieldBean2.getModelType();
        java.lang.String str8 = modelFieldBean2.getConvert();
        java.lang.Boolean boolean9 = modelFieldBean2.getUnique();
        org.junit.Assert.assertNull(modelType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void test00888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00888");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        hasOneAssociation1.setGetterName("hi!");
        hasOneAssociation1.setSetterName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str6 = hasOneAssociation1.getName();
        java.lang.String str7 = hasOneAssociation1.getType();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hasOne" + "'", str7, "hasOne");
    }

    @Test
    public void test00889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00889");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        java.lang.String str6 = modelFieldBean2.getMapping();
        java.lang.String str7 = modelFieldBean2.getName();
        java.lang.Boolean boolean8 = modelFieldBean2.getUnique();
        java.lang.Boolean boolean9 = modelFieldBean2.getPersist();
        java.lang.String str10 = modelFieldBean2.getType();
        ch.rasc.extclassgenerator.PartialDataOptionsBean partialDataOptionsBean11 = new ch.rasc.extclassgenerator.PartialDataOptionsBean();
        java.lang.Boolean boolean12 = partialDataOptionsBean11.getAssociated();
        java.lang.Boolean boolean13 = partialDataOptionsBean11.getChanges();
        modelFieldBean2.setReference((java.lang.Object) partialDataOptionsBean11);
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray21 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList19);
        java.util.List<java.lang.String> strList22 = inclusionValidationArray21.getList();
        java.util.List<java.lang.String> strList23 = inclusionValidationArray21.getList();
        java.util.List<java.lang.String> strList24 = inclusionValidationArray21.getList();
        modelFieldBean2.setDepends(strList24);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str10, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(strList24);
    }

    @Test
    public void test00890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00890");
        ch.rasc.extclassgenerator.validation.NotBlankValidation notBlankValidation1 = new ch.rasc.extclassgenerator.validation.NotBlankValidation("hasOne");
        java.lang.String str2 = notBlankValidation1.getField();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hasOne" + "'", str2, "hasOne");
    }

    @Test
    public void test00891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00891");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        ch.rasc.extclassgenerator.validation.GenericValidation genericValidation3 = new ch.rasc.extclassgenerator.validation.GenericValidation("/\\/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});\\//", "belongsTo", strMap2);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = genericValidation3.getOptions();
        java.lang.String str5 = genericValidation3.getType();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = genericValidation3.getOptions();
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/\\/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});\\//" + "'", str5, "/\\/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});\\//");
        org.junit.Assert.assertNull(strMap6);
    }

    @Test
    public void test00892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00892");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});", "Ext.data.Model");
        java.lang.String str3 = modelFieldBean2.getMapping();
        java.lang.Object obj4 = modelFieldBean2.getReference();
        modelFieldBean2.setDateFormat("hasMany");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test00893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00893");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.read;
        apiObject0.update = "hi!";
        apiObject0.update = "ch.rasc.extclassgenerator.ModelAnnotationProcessor";
        apiObject0.read = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});";
        apiObject0.destroy = "/Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});/";
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00894");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        modelBean0.setIdProperty("");
        modelBean0.setAutodetectTypes(false);
        modelBean0.setWriteAllFields((java.lang.Boolean) false);
    }

    @Test
    public void test00895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00895");
        ch.rasc.extclassgenerator.validation.DigitsValidation digitsValidation3 = new ch.rasc.extclassgenerator.validation.DigitsValidation("length", (int) (short) 10, (int) (byte) 1);
    }

    @Test
    public void test00896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00896");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        ch.rasc.extclassgenerator.validation.CreditCardNumberValidation creditCardNumberValidation6 = new ch.rasc.extclassgenerator.validation.CreditCardNumberValidation("");
        ch.rasc.extclassgenerator.validation.FormatValidation formatValidation9 = new ch.rasc.extclassgenerator.validation.FormatValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        ch.rasc.extclassgenerator.validation.FutureValidation futureValidation11 = new ch.rasc.extclassgenerator.validation.FutureValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        ch.rasc.extclassgenerator.validation.FormatValidation formatValidation14 = new ch.rasc.extclassgenerator.validation.FormatValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        ch.rasc.extclassgenerator.validation.AbstractValidation[] abstractValidationArray15 = new ch.rasc.extclassgenerator.validation.AbstractValidation[] { creditCardNumberValidation6, formatValidation9, futureValidation11, formatValidation14 };
        java.util.ArrayList<ch.rasc.extclassgenerator.validation.AbstractValidation> abstractValidationList16 = new java.util.ArrayList<ch.rasc.extclassgenerator.validation.AbstractValidation>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<ch.rasc.extclassgenerator.validation.AbstractValidation>) abstractValidationList16, abstractValidationArray15);
        modelFieldBean2.setValidators((java.util.List<ch.rasc.extclassgenerator.validation.AbstractValidation>) abstractValidationList16);
        java.util.List<java.lang.String> strList19 = modelFieldBean2.getDepends();
        ch.rasc.extclassgenerator.ModelType modelType20 = modelFieldBean2.getModelType();
        modelFieldBean2.setAllowNull((java.lang.Boolean) true);
        java.lang.String str23 = modelFieldBean2.getMapping();
        java.lang.Boolean boolean24 = modelFieldBean2.getCritical();
        modelFieldBean2.setPersist((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(abstractValidationArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(strList19);
        org.junit.Assert.assertNull(modelType20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(boolean24);
    }

    @Test
    public void test00897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00897");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        modelFieldBean2.setCritical((java.lang.Boolean) false);
        java.lang.String str7 = modelFieldBean2.getDateFormat();
        java.lang.String str8 = modelFieldBean2.getConvert();
        ch.rasc.extclassgenerator.ModelType modelType9 = modelFieldBean2.getModelType();
        ch.rasc.extclassgenerator.ModelType modelType10 = modelFieldBean2.getModelType();
        modelFieldBean2.setMapping("hasOne");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(modelType9);
        org.junit.Assert.assertNull(modelType10);
    }

    @Test
    public void test00898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00898");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.read = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.update = "";
        apiObject0.read = "json";
        java.lang.String str12 = apiObject0.create;
        apiObject0.destroy = "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});/";
        java.lang.String str15 = apiObject0.read;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str12, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "json" + "'", str15, "json");
    }

    @Test
    public void test00899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00899");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});", "ch.rasc.extclassgenerator.ModelAnnotationProcessor");
        modelFieldBean2.setAllowNull((java.lang.Boolean) true);
        java.lang.Boolean boolean5 = modelFieldBean2.getUseNull();
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
    }

    @Test
    public void test00900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00900");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        modelBean0.setIdProperty("");
        boolean boolean5 = modelBean0.isDisablePagingParameters();
        modelBean0.setExtend("");
        modelBean0.setVersionProperty("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        modelBean0.setAutodetectTypes(true);
        modelBean0.setName("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        modelBean0.setIdentifier("/Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});/");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00901");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"debug\",\n    type : \"boolean\"\n  }, {\n    name : \"useSingleQuotes\",\n    type : \"boolean\"\n  }, {\n    name : \"surroundApiWithQuotes\",\n    type : \"boolean\"\n  } ]\n});", (java.lang.Integer) 10, (java.lang.Integer) 35);
    }

    @Test
    public void test00902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00902");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        modelFieldBean2.setMapping("hi!");
        java.lang.Object obj7 = modelFieldBean2.getDefaultValue();
        modelFieldBean2.setConvert("Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
        java.lang.String str10 = modelFieldBean2.getConvert();
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});" + "'", str10, "Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
    }

    @Test
    public void test00903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00903");
        ch.rasc.extclassgenerator.validation.PresenceValidation presenceValidation1 = new ch.rasc.extclassgenerator.validation.PresenceValidation("ch.rasc.extclassgenerator.PartialDataOptionsBean");
    }

    @Test
    public void test00904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00904");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("hi!");
        hasManyAssociation1.setPrimaryKey("creditCardNumber");
        hasManyAssociation1.setPrimaryKey("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});");
        java.lang.String str6 = hasManyAssociation1.getName();
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00905");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        java.lang.String str2 = hasOneAssociation1.getName();
        hasOneAssociation1.setInstanceName("");
        java.lang.String str5 = hasOneAssociation1.getForeignKey();
        java.lang.String str6 = hasOneAssociation1.getGetterName();
        hasOneAssociation1.setAssociationKey("Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str9 = hasOneAssociation1.getGetterName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00906");
        ch.rasc.extclassgenerator.validation.EmailValidation emailValidation1 = new ch.rasc.extclassgenerator.validation.EmailValidation("Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});");
    }

    @Test
    public void test00907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00907");
        ch.rasc.extclassgenerator.validation.ExclusionValidation exclusionValidation2 = new ch.rasc.extclassgenerator.validation.ExclusionValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});", "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
    }

    @Test
    public void test00908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00908");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        modelFieldBean2.setMapping("hi!");
        java.lang.String str7 = modelFieldBean2.getMapping();
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray15 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList13);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray16 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("", (java.util.List<java.lang.String>) strList13);
        modelFieldBean2.setDepends((java.util.List<java.lang.String>) strList13);
        ch.rasc.extclassgenerator.OutputConfig outputConfig18 = new ch.rasc.extclassgenerator.OutputConfig();
        boolean boolean19 = outputConfig18.isDebug();
        ch.rasc.extclassgenerator.OutputFormat outputFormat20 = outputConfig18.getOutputFormat();
        boolean boolean21 = outputConfig18.isDebug();
        outputConfig18.setDebug(false);
        boolean boolean24 = modelFieldBean2.hasOnlyName(outputConfig18);
        modelFieldBean2.setName("length");
        modelFieldBean2.setDateFormat("presence");
        ch.rasc.extclassgenerator.ModelType modelType29 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelFieldBean2.setModelType(modelType29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(outputFormat20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test00909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00909");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});", (java.lang.Long) 35L, (java.lang.Long) (-1L));
    }

    @Test
    public void test00910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00910");
        ch.rasc.extclassgenerator.OutputConfig outputConfig0 = new ch.rasc.extclassgenerator.OutputConfig();
        boolean boolean1 = outputConfig0.isSurroundApiWithQuotes();
        boolean boolean2 = outputConfig0.isDebug();
        outputConfig0.setDebug(false);
        outputConfig0.setUseSingleQuotes(false);
        ch.rasc.extclassgenerator.ReferenceBean referenceBean7 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean8 = referenceBean7.typeOnly();
        java.lang.String str9 = referenceBean7.getRole();
        referenceBean7.setChild("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        referenceBean7.setAssociation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        referenceBean7.setRole("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        java.lang.String str16 = referenceBean7.getParent();
        boolean boolean17 = outputConfig0.equals((java.lang.Object) str16);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00911");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        java.lang.String str2 = hasOneAssociation1.getPrimaryKey();
        java.lang.String str3 = hasOneAssociation1.getName();
        java.lang.String str4 = hasOneAssociation1.getSetterName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00912");
        ch.rasc.extclassgenerator.ModelType modelType1 = null;
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("/\\/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});\\//", modelType1);
    }

    @Test
    public void test00913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00913");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("Ext.define(\"ch.rasc.extclassgenerator.validation.PresenceValidation\",{extend:\"Ext.data.Model\",fields:[{name:\"type\",type:\"string\"},{name:\"field\",type:\"string\"}]});", "hasMany");
        java.util.List<java.lang.String> strList3 = modelFieldBean2.getDepends();
        java.lang.Boolean boolean4 = modelFieldBean2.getCritical();
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test00914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00914");
        ch.rasc.extclassgenerator.validation.FormatValidation formatValidation2 = new ch.rasc.extclassgenerator.validation.FormatValidation("belongsTo", "Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});");
        java.lang.String str3 = formatValidation2.getMatcher();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});/" + "'", str3, "/Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});/");
    }

    @Test
    public void test00915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00915");
        ch.rasc.extclassgenerator.validation.FutureValidation futureValidation1 = new ch.rasc.extclassgenerator.validation.FutureValidation("length");
    }

    @Test
    public void test00916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00916");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});";
        apiObject0.update = "json";
        apiObject0.destroy = "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/";
        java.lang.String str10 = apiObject0.update;
        java.lang.String str11 = apiObject0.read;
        java.lang.String str12 = apiObject0.destroy;
        apiObject0.destroy = "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});";
        apiObject0.create = "/\\/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});\\//";
        apiObject0.read = "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[],proxy:{type:\"direct\",directFn:hi!}});";
        java.lang.String str19 = apiObject0.update;
        java.lang.String str20 = apiObject0.destroy;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "json" + "'", str10, "json");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/" + "'", str12, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "json" + "'", str19, "json");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});" + "'", str20, "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
    }

    @Test
    public void test00917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00917");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        ch.rasc.extclassgenerator.validation.CreditCardNumberValidation creditCardNumberValidation6 = new ch.rasc.extclassgenerator.validation.CreditCardNumberValidation("");
        ch.rasc.extclassgenerator.validation.FormatValidation formatValidation9 = new ch.rasc.extclassgenerator.validation.FormatValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        ch.rasc.extclassgenerator.validation.FutureValidation futureValidation11 = new ch.rasc.extclassgenerator.validation.FutureValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        ch.rasc.extclassgenerator.validation.FormatValidation formatValidation14 = new ch.rasc.extclassgenerator.validation.FormatValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        ch.rasc.extclassgenerator.validation.AbstractValidation[] abstractValidationArray15 = new ch.rasc.extclassgenerator.validation.AbstractValidation[] { creditCardNumberValidation6, formatValidation9, futureValidation11, formatValidation14 };
        java.util.ArrayList<ch.rasc.extclassgenerator.validation.AbstractValidation> abstractValidationList16 = new java.util.ArrayList<ch.rasc.extclassgenerator.validation.AbstractValidation>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<ch.rasc.extclassgenerator.validation.AbstractValidation>) abstractValidationList16, abstractValidationArray15);
        modelFieldBean2.setValidators((java.util.List<ch.rasc.extclassgenerator.validation.AbstractValidation>) abstractValidationList16);
        modelFieldBean2.setName("Ext.data.Model");
        java.lang.Boolean boolean21 = modelFieldBean2.getAllowBlank();
        org.junit.Assert.assertNotNull(abstractValidationArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(boolean21);
    }

    @Test
    public void test00918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00918");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]}});");
        hasManyAssociation1.setName("");
    }

    @Test
    public void test00919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00919");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        java.lang.String str6 = modelFieldBean2.getMapping();
        java.lang.String str7 = modelFieldBean2.getName();
        java.lang.String str8 = modelFieldBean2.getConvert();
        ch.rasc.extclassgenerator.ModelType modelType9 = modelFieldBean2.getModelType();
        java.lang.String str10 = modelFieldBean2.getType();
        modelFieldBean2.setCalculate("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        modelFieldBean2.setPersist((java.lang.Boolean) true);
        modelFieldBean2.setConvert("Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str17 = modelFieldBean2.getMapping();
        java.lang.String str18 = modelFieldBean2.getType();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(modelType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str10, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str18, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
    }

    @Test
    public void test00920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00920");
        ch.rasc.extclassgenerator.validation.CreditCardNumberValidation creditCardNumberValidation1 = new ch.rasc.extclassgenerator.validation.CreditCardNumberValidation("/Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});/");
    }

    @Test
    public void test00921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00921");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("digits");
        java.lang.String str2 = hasManyAssociation1.getType();
        hasManyAssociation1.setInstanceName("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hasMany" + "'", str2, "hasMany");
    }

    @Test
    public void test00922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00922");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        referenceBean0.setType("");
        java.lang.String str3 = referenceBean0.getAssociation();
        referenceBean0.setInverse("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        java.lang.String str6 = referenceBean0.getType();
        java.lang.String str7 = referenceBean0.getParent();
        referenceBean0.setChild("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        referenceBean0.setRole("/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/");
        boolean boolean12 = referenceBean0.hasAnyProperties();
        referenceBean0.setParent("Ext.define(\"ch.rasc.extclassgenerator.validation.PresenceValidation\",{extend:\"Ext.data.Model\",fields:[{name:\"type\",type:\"string\"},{name:\"field\",type:\"string\"}]});");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test00923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00923");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("");
        java.lang.String str2 = belongsToAssociation1.getInstanceName();
        belongsToAssociation1.setGetterName("json");
        java.lang.String str5 = belongsToAssociation1.getSetterName();
        belongsToAssociation1.setForeignKey("Ext.data.Model");
        java.lang.String str8 = belongsToAssociation1.getSetterName();
        java.lang.String str9 = belongsToAssociation1.getGetterName();
        belongsToAssociation1.setAssociationKey("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});/");
        java.lang.String str12 = belongsToAssociation1.getModel();
        java.lang.String str13 = belongsToAssociation1.getInstanceName();
        java.lang.String str14 = belongsToAssociation1.getGetterName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "json" + "'", str9, "json");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "json" + "'", str14, "json");
    }

    @Test
    public void test00924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00924");
        ch.rasc.extclassgenerator.ModelAnnotationProcessor modelAnnotationProcessor0 = new ch.rasc.extclassgenerator.ModelAnnotationProcessor();
        java.util.Set<java.lang.String> strSet1 = modelAnnotationProcessor0.getSupportedOptions();
        javax.lang.model.SourceVersion sourceVersion2 = modelAnnotationProcessor0.getSupportedSourceVersion();
        java.util.Set<java.lang.String> strSet3 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        javax.lang.model.element.Element element4 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror5 = null;
        javax.lang.model.element.ExecutableElement executableElement6 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable8 = modelAnnotationProcessor0.getCompletions(element4, annotationMirror5, executableElement6, "hasMany");
        javax.lang.model.element.Element element9 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror10 = null;
        javax.lang.model.element.ExecutableElement executableElement11 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable13 = modelAnnotationProcessor0.getCompletions(element9, annotationMirror10, executableElement11, "digits");
        javax.lang.model.element.Element element14 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror15 = null;
        javax.lang.model.element.ExecutableElement executableElement16 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable18 = modelAnnotationProcessor0.getCompletions(element14, annotationMirror15, executableElement16, "Ext.define(\"ch.rasc.extclassgenerator.validation.PresenceValidation\",{extend:\"Ext.data.Model\",fields:[{name:\"type\",type:\"string\"},{name:\"field\",type:\"string\"}]});");
        java.util.Set<java.lang.String> strSet19 = modelAnnotationProcessor0.getSupportedOptions();
        java.util.Set<java.lang.String> strSet20 = modelAnnotationProcessor0.getSupportedOptions();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertTrue("'" + sourceVersion2 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion2.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(wildcardIterable8);
        org.junit.Assert.assertNotNull(wildcardIterable13);
        org.junit.Assert.assertNotNull(wildcardIterable18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(strSet20);
    }

    @Test
    public void test00925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00925");
        ch.rasc.extclassgenerator.validation.FutureValidation futureValidation1 = new ch.rasc.extclassgenerator.validation.FutureValidation("Ext.define(\"ch.rasc.extclassgenerator.association.HasOneAssociation\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"setterName\",type:\"string\"},{name:\"getterName\",type:\"string\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]}});");
    }

    @Test
    public void test00926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00926");
        ch.rasc.extclassgenerator.validation.ExclusionValidation exclusionValidation2 = new ch.rasc.extclassgenerator.validation.ExclusionValidation("future", "Ext.define(\"ch.rasc.extclassgenerator.association.HasOneAssociation\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"setterName\",type:\"string\"},{name:\"getterName\",type:\"string\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]}});");
        java.lang.String str3 = exclusionValidation2.getList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.association.HasOneAssociation\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"setterName\",type:\"string\"},{name:\"getterName\",type:\"string\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]}});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.association.HasOneAssociation\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"setterName\",type:\"string\"},{name:\"getterName\",type:\"string\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]}});");
    }

    @Test
    public void test00927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00927");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        boolean boolean1 = allDataOptionsBean0.hasAnyProperties();
        allDataOptionsBean0.setPersist((java.lang.Boolean) true);
        allDataOptionsBean0.setCritical((java.lang.Boolean) false);
        allDataOptionsBean0.setPersist((java.lang.Boolean) false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00928");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getChild();
        java.lang.String str2 = referenceBean0.getRole();
        referenceBean0.setAssociation("");
        java.lang.String str5 = referenceBean0.getParent();
        referenceBean0.setParent("/\\/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});\\//");
        referenceBean0.setInverse("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00929");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});", (java.lang.Integer) 1, (java.lang.Integer) 35);
    }

    @Test
    public void test00930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00930");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        ch.rasc.extclassgenerator.validation.GenericValidation genericValidation3 = new ch.rasc.extclassgenerator.validation.GenericValidation("Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"associated\",\n    type : \"boolean\"\n  }, {\n    name : \"changes\",\n    type : \"boolean\"\n  }, {\n    name : \"critical\",\n    type : \"boolean\"\n  }, {\n    name : \"persist\",\n    type : \"boolean\"\n  } ]\n});", "/ch.rasc.extclassgenerator.ModelAnnotationProcessor/", strMap2);
    }

    @Test
    public void test00931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00931");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        java.lang.String str6 = modelFieldBean2.getMapping();
        java.lang.Object obj7 = modelFieldBean2.getReference();
        modelFieldBean2.setCalculate("exclusion");
        java.lang.Boolean boolean10 = modelFieldBean2.getUnique();
        java.lang.String str11 = modelFieldBean2.getConvert();
        java.lang.Object obj12 = modelFieldBean2.getDefaultValue();
        java.lang.Boolean boolean13 = modelFieldBean2.getAllowBlank();
        java.lang.Boolean boolean14 = modelFieldBean2.getUnique();
        java.lang.Boolean boolean15 = modelFieldBean2.getUnique();
        modelFieldBean2.setAllowNull((java.lang.Boolean) true);
        modelFieldBean2.setMapping("hasMany");
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertNull(boolean15);
    }

    @Test
    public void test00932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00932");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("");
        java.lang.String str2 = hasOneAssociation1.getPrimaryKey();
        hasOneAssociation1.setGetterName("belongsTo");
        java.lang.String str5 = hasOneAssociation1.getInstanceName();
        java.lang.String str6 = hasOneAssociation1.getSetterName();
        java.lang.String str7 = hasOneAssociation1.getGetterName();
        java.lang.String str8 = hasOneAssociation1.getGetterName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "belongsTo" + "'", str7, "belongsTo");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "belongsTo" + "'", str8, "belongsTo");
    }

    @Test
    public void test00933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00933");
        ch.rasc.extclassgenerator.validation.DigitsValidation digitsValidation3 = new ch.rasc.extclassgenerator.validation.DigitsValidation("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});", 32, 10);
        int int4 = digitsValidation3.getInteger();
        int int5 = digitsValidation3.getFraction();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test00934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00934");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        referenceBean0.setType("");
        java.lang.String str3 = referenceBean0.getAssociation();
        referenceBean0.setInverse("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        referenceBean0.setInverse("ch.rasc.extclassgenerator.ModelBean");
        boolean boolean8 = referenceBean0.typeOnly();
        referenceBean0.setRole("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});/");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00935");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        java.lang.String str2 = hasOneAssociation1.getName();
        hasOneAssociation1.setInstanceName("");
        java.lang.String str5 = hasOneAssociation1.getSetterName();
        hasOneAssociation1.setGetterName("exclusion");
        hasOneAssociation1.setPrimaryKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        hasOneAssociation1.setInstanceName("ch.rasc.extclassgenerator.ModelAnnotationProcessor");
        hasOneAssociation1.setAssociationKey("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});");
        hasOneAssociation1.setForeignKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00936");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        boolean boolean1 = allDataOptionsBean0.hasAnyProperties();
        allDataOptionsBean0.setChanges((java.lang.Boolean) true);
        java.lang.Boolean boolean4 = allDataOptionsBean0.getPersist();
        allDataOptionsBean0.setPersist((java.lang.Boolean) false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test00937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00937");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        modelFieldBean2.setMapping("hi!");
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        modelFieldBean2.setAllowBlank((java.lang.Boolean) false);
        modelFieldBean2.setConvert("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        java.lang.String str13 = modelFieldBean2.getDateFormat();
        java.lang.String str14 = modelFieldBean2.getCalculate();
        modelFieldBean2.setAllowNull((java.lang.Boolean) false);
        modelFieldBean2.setCalculate("");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test00938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00938");
        ch.rasc.extclassgenerator.ModelType modelType1 = null;
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", modelType1);
        java.lang.Boolean boolean3 = modelFieldBean2.getCritical();
        java.lang.Boolean boolean4 = modelFieldBean2.getAllowNull();
        java.lang.Boolean boolean5 = modelFieldBean2.getAllowBlank();
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNull(boolean5);
    }

    @Test
    public void test00939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00939");
        ch.rasc.extclassgenerator.ModelAnnotationProcessor modelAnnotationProcessor0 = new ch.rasc.extclassgenerator.ModelAnnotationProcessor();
        java.util.Set<java.lang.String> strSet1 = modelAnnotationProcessor0.getSupportedOptions();
        java.util.Set<java.lang.String> strSet2 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        java.util.Set<java.lang.String> strSet3 = modelAnnotationProcessor0.getSupportedOptions();
        java.util.Set<java.lang.String> strSet4 = modelAnnotationProcessor0.getSupportedOptions();
        java.util.Set<java.lang.String> strSet5 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        java.util.Set<java.lang.String> strSet6 = modelAnnotationProcessor0.getSupportedOptions();
        javax.lang.model.element.Element element7 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror8 = null;
        javax.lang.model.element.ExecutableElement executableElement9 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable11 = modelAnnotationProcessor0.getCompletions(element7, annotationMirror8, executableElement9, "Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(wildcardIterable11);
    }

    @Test
    public void test00940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00940");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getRole();
        referenceBean0.setChild("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        referenceBean0.setRole("json");
        boolean boolean7 = referenceBean0.typeOnly();
        referenceBean0.setAssociation("Ext.define(\"ch.rasc.extclassgenerator.validation.PresenceValidation\",{extend:\"Ext.data.Model\",fields:[{name:\"type\",type:\"string\"},{name:\"field\",type:\"string\"}]});");
        referenceBean0.setRole("presence");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00941");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean4 = allDataOptionsBean0.getPersist();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        allDataOptionsBean0.setPersist((java.lang.Boolean) false);
        boolean boolean9 = allDataOptionsBean0.hasAnyProperties();
        allDataOptionsBean0.setChanges((java.lang.Boolean) false);
        java.lang.Boolean boolean12 = allDataOptionsBean0.getChanges();
        java.lang.Boolean boolean13 = allDataOptionsBean0.getPersist();
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + false + "'", boolean12, false);
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + false + "'", boolean13, false);
    }

    @Test
    public void test00942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00942");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        modelBean0.setIdProperty("");
        boolean boolean5 = modelBean0.isDisablePagingParameters();
        modelBean0.setExtend("");
        java.lang.String str8 = modelBean0.getSuccessProperty();
        java.lang.String str9 = modelBean0.getName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00943");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        java.lang.String str3 = modelBean0.getIdProperty();
        java.lang.String[] strArray4 = modelBean0.getHasMany();
        modelBean0.setExtend("/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/");
        modelBean0.setAutodetectTypes(false);
        ch.rasc.extclassgenerator.OutputConfig outputConfig9 = new ch.rasc.extclassgenerator.OutputConfig();
        boolean boolean10 = outputConfig9.isDebug();
        boolean boolean11 = outputConfig9.isSurroundApiWithQuotes();
        ch.rasc.extclassgenerator.OutputFormat outputFormat12 = ch.rasc.extclassgenerator.OutputFormat.EXTJS5;
        outputConfig9.setOutputFormat(outputFormat12);
        java.lang.String str15 = ch.rasc.extclassgenerator.ModelGenerator.generateJavascript(modelBean0, outputFormat12, false);
        java.lang.String str16 = modelBean0.getExtend();
        modelBean0.setClientIdProperty("ch.rasc.extclassgenerator.ModelAnnotationProcessor");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + outputFormat12 + "' != '" + ch.rasc.extclassgenerator.OutputFormat.EXTJS5 + "'", outputFormat12.equals(ch.rasc.extclassgenerator.OutputFormat.EXTJS5));
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str15, "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/" + "'", str16, "/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/");
    }

    @Test
    public void test00944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00944");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        java.lang.String str6 = modelFieldBean2.getMapping();
        modelFieldBean2.setCritical((java.lang.Boolean) true);
        java.lang.String str9 = modelFieldBean2.getName();
        java.lang.Object obj10 = modelFieldBean2.getReference();
        java.lang.String str11 = modelFieldBean2.getDateFormat();
        modelFieldBean2.setName("hi!");
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00945");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.destroy = "length";
        java.lang.String str3 = apiObject0.read;
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00946");
        ch.rasc.extclassgenerator.ModelAnnotationProcessor modelAnnotationProcessor0 = new ch.rasc.extclassgenerator.ModelAnnotationProcessor();
        java.util.Set<java.lang.String> strSet1 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        java.util.Set<java.lang.String> strSet2 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        java.util.Set<java.lang.String> strSet3 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        java.util.Set<java.lang.String> strSet4 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        javax.lang.model.SourceVersion sourceVersion5 = modelAnnotationProcessor0.getSupportedSourceVersion();
        javax.lang.model.element.Element element6 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror7 = null;
        javax.lang.model.element.ExecutableElement executableElement8 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable10 = modelAnnotationProcessor0.getCompletions(element6, annotationMirror7, executableElement8, "hasMany");
        java.util.Set<java.lang.String> strSet11 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        javax.annotation.processing.ProcessingEnvironment processingEnvironment12 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelAnnotationProcessor0.init(processingEnvironment12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Tool provided null ProcessingEnvironment");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + sourceVersion5 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion5.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(wildcardIterable10);
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test00947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00947");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        java.lang.String str1 = apiObject0.update;
        apiObject0.destroy = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});";
        java.lang.String str4 = apiObject0.read;
        apiObject0.update = "Ext.define('Ext.define('ch.rasc.extclassgenerator.association.HasManyAssociation',\n{\n  extend : 'Ext.data.Model',\n  fields : [ {\n    name : 'autoLoad',\n    type : 'boolean'\n  }, {\n    name : 'name',\n    type : 'string'\n  }, {\n    name : 'type',\n    type : 'string'\n  }, {\n    name : 'model',\n    type : 'string'\n  }, {\n    name : 'associationKey',\n    type : 'string'\n  }, {\n    name : 'foreignKey',\n    type : 'string'\n  }, {\n    name : 'primaryKey',\n    type : 'string'\n  }, {\n    name : 'instanceName',\n    type : 'string'\n  } ]\n});',{extend:'',uses:['hi!'],fields:[],associations:[{type:'hasMany',model:'hi!'},{type:'hasMany',model:'hi!',associationKey:'Ext.define(\\'ch.rasc.extclassgenerator.ModelAnnotationProcessor\\',{extend:\\'Ext.data.Model\\',fields:[]});'},{type:'hasMany',model:'hi!',associationKey:'Ext.define(\\'ch.rasc.extclassgenerator.ModelAnnotationProcessor\\',{extend:\\'Ext.data.Model\\',fields:[]});'},{type:'hasMany',model:'hi!',foreignKey:''}]});";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00948");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("hi!");
        java.lang.String str2 = hasManyAssociation1.getAssociationKey();
        hasManyAssociation1.setAssociationKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        hasManyAssociation1.setAssociationKey("");
        hasManyAssociation1.setName("digits");
        java.lang.String str9 = hasManyAssociation1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hasMany" + "'", str9, "hasMany");
    }

    @Test
    public void test00949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00949");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});", (java.lang.Long) 100L, (java.lang.Long) 10L);
    }

    @Test
    public void test00950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00950");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.read = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str8 = apiObject0.update;
        java.lang.String str9 = apiObject0.update;
        apiObject0.create = "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});/";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str8, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str9, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
    }

    @Test
    public void test00951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00951");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("hi!");
        java.lang.String str2 = hasManyAssociation1.getAssociationKey();
        hasManyAssociation1.setAssociationKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        hasManyAssociation1.setAssociationKey("");
        java.lang.Boolean boolean7 = hasManyAssociation1.getAutoLoad();
        java.lang.String str8 = hasManyAssociation1.getAssociationKey();
        hasManyAssociation1.setName("exclusion");
        hasManyAssociation1.setAutoLoad((java.lang.Boolean) false);
        hasManyAssociation1.setInstanceName("future");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test00952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00952");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
        belongsToAssociation1.setInstanceName("Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[],proxy:{type:\"direct\",directFn:hi!}});");
    }

    @Test
    public void test00953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00953");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean8 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean8.setConvert("hi!");
        java.lang.Boolean boolean11 = modelFieldBean8.getPersist();
        java.lang.String str12 = modelFieldBean8.getMapping();
        java.lang.String str13 = modelFieldBean8.getName();
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray20 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList18);
        modelFieldBean8.setDepends((java.util.List<java.lang.String>) strList18);
        modelFieldBean2.setDepends((java.util.List<java.lang.String>) strList18);
        modelFieldBean2.setUseNull((java.lang.Boolean) false);
        java.lang.String[] strArray27 = new java.lang.String[] { "", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        modelFieldBean2.setDepends((java.util.List<java.lang.String>) strList28);
        java.lang.Boolean boolean31 = modelFieldBean2.getCritical();
        java.lang.Object obj32 = modelFieldBean2.getReference();
        java.lang.String str33 = modelFieldBean2.getConvert();
        java.util.List<ch.rasc.extclassgenerator.validation.AbstractValidation> abstractValidationList34 = modelFieldBean2.getValidators();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(boolean31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNull(abstractValidationList34);
    }

    @Test
    public void test00954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00954");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.destroy = "";
        apiObject0.destroy = "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/";
        apiObject0.destroy = "Ext.data.Model";
        apiObject0.destroy = "exclusion";
    }

    @Test
    public void test00955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00955");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        referenceBean0.setType("");
        java.lang.String str3 = referenceBean0.getAssociation();
        referenceBean0.setInverse("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        java.lang.String str6 = referenceBean0.getType();
        java.lang.String str7 = referenceBean0.getParent();
        referenceBean0.setChild("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        referenceBean0.setRole("/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/");
        boolean boolean12 = referenceBean0.hasAnyProperties();
        java.lang.String str13 = referenceBean0.getChild();
        referenceBean0.setInverse("Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
        referenceBean0.setChild("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});/");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});" + "'", str13, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
    }

    @Test
    public void test00956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00956");
        ch.rasc.extclassgenerator.validation.ExclusionValidation exclusionValidation2 = new ch.rasc.extclassgenerator.validation.ExclusionValidation("/ch.rasc.extclassgenerator.PartialDataOptionsBean/", "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});/");
    }

    @Test
    public void test00957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00957");
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation5 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal6 = rangeValidation5.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation10 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal11 = rangeValidation10.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation12 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal6, bigDecimal11);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation18 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal19 = rangeValidation18.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation23 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal24 = rangeValidation23.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation25 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal19, bigDecimal24);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation31 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal32 = rangeValidation31.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation36 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal37 = rangeValidation36.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation38 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal32, bigDecimal37);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation43 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal44 = rangeValidation43.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation48 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal49 = rangeValidation48.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation50 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal44, bigDecimal49);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation51 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal37, bigDecimal44);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation52 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});", bigDecimal24, bigDecimal44);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation53 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", bigDecimal11, bigDecimal44);
        java.math.BigDecimal bigDecimal54 = rangeValidation53.getMax();
        java.math.BigDecimal bigDecimal55 = rangeValidation53.getMin();
        java.math.BigDecimal bigDecimal56 = rangeValidation53.getMin();
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertNotNull(bigDecimal37);
        org.junit.Assert.assertNotNull(bigDecimal44);
        org.junit.Assert.assertNotNull(bigDecimal49);
        org.junit.Assert.assertNotNull(bigDecimal54);
        org.junit.Assert.assertNotNull(bigDecimal55);
        org.junit.Assert.assertNotNull(bigDecimal56);
    }

    @Test
    public void test00958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00958");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean4 = allDataOptionsBean0.getPersist();
        java.lang.Boolean boolean5 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean6 = allDataOptionsBean0.getChanges();
        allDataOptionsBean0.setChanges((java.lang.Boolean) false);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + false + "'", boolean5, false);
        org.junit.Assert.assertNull(boolean6);
    }

    @Test
    public void test00959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00959");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean4 = allDataOptionsBean0.getPersist();
        allDataOptionsBean0.setCritical((java.lang.Boolean) true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test00960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00960");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});", "hi!");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean6 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean6.setConvert("hi!");
        java.lang.Boolean boolean9 = modelFieldBean6.getPersist();
        java.lang.String str10 = modelFieldBean6.getMapping();
        java.lang.String str11 = modelFieldBean6.getName();
        java.lang.String str12 = modelFieldBean6.getConvert();
        java.lang.String str13 = modelFieldBean6.getDateFormat();
        java.lang.Object obj14 = modelFieldBean6.getDefaultValue();
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean18 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean18.setConvert("hi!");
        modelFieldBean18.setMapping("hi!");
        modelFieldBean18.setUseNull((java.lang.Boolean) true);
        modelFieldBean18.setAllowBlank((java.lang.Boolean) false);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray34 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList32);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray35 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("", (java.util.List<java.lang.String>) strList32);
        java.util.List<java.lang.String> strList36 = exclusionValidationArray35.getList();
        modelFieldBean18.setDepends(strList36);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray38 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});", strList36);
        java.lang.String str39 = exclusionValidationArray38.getField();
        java.util.List<java.lang.String> strList40 = exclusionValidationArray38.getList();
        modelFieldBean6.setDepends(strList40);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray42 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("Ext.define(\"null\",{extend:\"\",config:{fields:[]}});", strList40);
        modelFieldBean2.setDefaultValue((java.lang.Object) exclusionValidationArray42);
        modelFieldBean2.setMapping("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});/");
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});" + "'", str39, "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        org.junit.Assert.assertNotNull(strList40);
    }

    @Test
    public void test00961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00961");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        ch.rasc.extclassgenerator.validation.CreditCardNumberValidation creditCardNumberValidation6 = new ch.rasc.extclassgenerator.validation.CreditCardNumberValidation("");
        ch.rasc.extclassgenerator.validation.FormatValidation formatValidation9 = new ch.rasc.extclassgenerator.validation.FormatValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        ch.rasc.extclassgenerator.validation.FutureValidation futureValidation11 = new ch.rasc.extclassgenerator.validation.FutureValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        ch.rasc.extclassgenerator.validation.FormatValidation formatValidation14 = new ch.rasc.extclassgenerator.validation.FormatValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        ch.rasc.extclassgenerator.validation.AbstractValidation[] abstractValidationArray15 = new ch.rasc.extclassgenerator.validation.AbstractValidation[] { creditCardNumberValidation6, formatValidation9, futureValidation11, formatValidation14 };
        java.util.ArrayList<ch.rasc.extclassgenerator.validation.AbstractValidation> abstractValidationList16 = new java.util.ArrayList<ch.rasc.extclassgenerator.validation.AbstractValidation>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<ch.rasc.extclassgenerator.validation.AbstractValidation>) abstractValidationList16, abstractValidationArray15);
        modelFieldBean2.setValidators((java.util.List<ch.rasc.extclassgenerator.validation.AbstractValidation>) abstractValidationList16);
        java.util.List<java.lang.String> strList19 = modelFieldBean2.getDepends();
        ch.rasc.extclassgenerator.ModelType modelType20 = modelFieldBean2.getModelType();
        modelFieldBean2.setAllowNull((java.lang.Boolean) true);
        java.lang.String str23 = modelFieldBean2.getMapping();
        java.lang.Boolean boolean24 = modelFieldBean2.getCritical();
        modelFieldBean2.setCritical((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(abstractValidationArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(strList19);
        org.junit.Assert.assertNull(modelType20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(boolean24);
    }

    @Test
    public void test00962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00962");
        java.util.List<java.lang.String> strList1 = null;
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray2 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("Ext.define(\"ch.rasc.extclassgenerator.LineEnding\",{extend:\"Ext.data.Model\",config:{fields:[]}});", strList1);
        java.util.List<java.lang.String> strList3 = inclusionValidationArray2.getList();
        org.junit.Assert.assertNull(strList3);
    }

    @Test
    public void test00963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00963");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean8 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean8.setConvert("hi!");
        java.lang.Boolean boolean11 = modelFieldBean8.getPersist();
        java.lang.String str12 = modelFieldBean8.getMapping();
        java.lang.String str13 = modelFieldBean8.getName();
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray20 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList18);
        modelFieldBean8.setDepends((java.util.List<java.lang.String>) strList18);
        modelFieldBean2.setDepends((java.util.List<java.lang.String>) strList18);
        modelFieldBean2.setUseNull((java.lang.Boolean) false);
        java.lang.String[] strArray27 = new java.lang.String[] { "", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        modelFieldBean2.setDepends((java.util.List<java.lang.String>) strList28);
        modelFieldBean2.setAllowBlank((java.lang.Boolean) false);
        modelFieldBean2.setName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
        java.lang.Object obj35 = modelFieldBean2.getDefaultValue();
        java.lang.Boolean boolean36 = modelFieldBean2.getUnique();
        modelFieldBean2.setConvert("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(boolean36);
    }

    @Test
    public void test00964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00964");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("ch.rasc.extclassgenerator.ModelBean", "/ch.rasc.extclassgenerator.ModelAnnotationProcessor/");
        java.lang.Boolean boolean3 = modelFieldBean2.getAllowBlank();
        java.util.List<java.lang.String> strList4 = modelFieldBean2.getDepends();
        modelFieldBean2.setName("ch.rasc.extclassgenerator.PartialDataOptionsBean");
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNull(strList4);
    }

    @Test
    public void test00965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00965");
        ch.rasc.extclassgenerator.validation.EmailValidation emailValidation1 = new ch.rasc.extclassgenerator.validation.EmailValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});/");
    }

    @Test
    public void test00966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00966");
        ch.rasc.extclassgenerator.validation.FormatValidation formatValidation2 = new ch.rasc.extclassgenerator.validation.FormatValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", "");
        java.lang.String str3 = formatValidation2.getMatcher();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "//" + "'", str3, "//");
    }

    @Test
    public void test00967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00967");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});/", "");
    }

    @Test
    public void test00968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00968");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("Ext.define(\"null\",{extend:\"\",config:{fields:[]}});");
    }

    @Test
    public void test00969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00969");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getRole();
        referenceBean0.setChild("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        java.lang.String str5 = referenceBean0.getType();
        referenceBean0.setRole("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
        java.lang.String str8 = referenceBean0.getRole();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});" + "'", str8, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
    }

    @Test
    public void test00970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00970");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("exclusion");
        java.lang.String str2 = belongsToAssociation1.getGetterName();
        java.lang.String str3 = belongsToAssociation1.getModel();
        java.lang.String str4 = belongsToAssociation1.getSetterName();
        java.lang.String str5 = belongsToAssociation1.getForeignKey();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "exclusion" + "'", str3, "exclusion");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00971");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("");
        java.lang.String str2 = belongsToAssociation1.getInstanceName();
        belongsToAssociation1.setGetterName("json");
        java.lang.String str5 = belongsToAssociation1.getSetterName();
        belongsToAssociation1.setForeignKey("Ext.data.Model");
        java.lang.String str8 = belongsToAssociation1.getSetterName();
        java.lang.String str9 = belongsToAssociation1.getGetterName();
        belongsToAssociation1.setAssociationKey("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});/");
        java.lang.String str12 = belongsToAssociation1.getPrimaryKey();
        belongsToAssociation1.setPrimaryKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
        java.lang.String str15 = belongsToAssociation1.getModel();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "json" + "'", str9, "json");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test00972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00972");
        ch.rasc.extclassgenerator.validation.PastValidation pastValidation1 = new ch.rasc.extclassgenerator.validation.PastValidation("/Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});/");
    }

    @Test
    public void test00973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00973");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean4 = allDataOptionsBean0.getPersist();
        boolean boolean5 = allDataOptionsBean0.hasAnyProperties();
        java.lang.Boolean boolean6 = allDataOptionsBean0.getPersist();
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(boolean6);
    }

    @Test
    public void test00974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00974");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("ch.rasc.extclassgenerator.ModelAnnotationProcessor");
        java.lang.Boolean boolean2 = hasManyAssociation1.getAutoLoad();
        org.junit.Assert.assertNull(boolean2);
    }

    @Test
    public void test00975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00975");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});", "/Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});/");
    }

    @Test
    public void test00976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00976");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean8 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean8.setConvert("hi!");
        java.lang.Boolean boolean11 = modelFieldBean8.getPersist();
        java.lang.String str12 = modelFieldBean8.getMapping();
        java.lang.String str13 = modelFieldBean8.getName();
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray20 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList18);
        modelFieldBean8.setDepends((java.util.List<java.lang.String>) strList18);
        modelFieldBean2.setDepends((java.util.List<java.lang.String>) strList18);
        modelFieldBean2.setUseNull((java.lang.Boolean) false);
        java.lang.Boolean boolean25 = modelFieldBean2.getCritical();
        modelFieldBean2.setCritical((java.lang.Boolean) true);
        java.lang.Boolean boolean28 = modelFieldBean2.getPersist();
        java.lang.Object obj29 = modelFieldBean2.getReference();
        modelFieldBean2.setConvert("");
        java.lang.Object obj32 = modelFieldBean2.getReference();
        java.lang.Boolean boolean33 = modelFieldBean2.getPersist();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(boolean25);
        org.junit.Assert.assertNull(boolean28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(boolean33);
    }

    @Test
    public void test00977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00977");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        modelBean0.setIdProperty("");
        boolean boolean5 = modelBean0.isDisablePagingParameters();
        modelBean0.setExtend("");
        ch.rasc.extclassgenerator.PartialDataOptionsBean partialDataOptionsBean8 = modelBean0.getPartialDataOptions();
        modelBean0.setMessageProperty("hi!");
        modelBean0.setWriteAllFields((java.lang.Boolean) false);
        modelBean0.setCreateMethod("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
        boolean boolean15 = modelBean0.isDisablePagingParameters();
        java.lang.String str16 = modelBean0.getRootProperty();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(partialDataOptionsBean8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test00978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00978");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("hi!");
        hasManyAssociation1.setPrimaryKey("creditCardNumber");
        hasManyAssociation1.setForeignKey("");
        java.lang.String str6 = hasManyAssociation1.getInstanceName();
        java.lang.String str7 = hasManyAssociation1.getForeignKey();
        hasManyAssociation1.setName("ch.rasc.extclassgenerator.ModelAnnotationProcessor");
        java.lang.String str10 = hasManyAssociation1.getName();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ch.rasc.extclassgenerator.ModelAnnotationProcessor" + "'", str10, "ch.rasc.extclassgenerator.ModelAnnotationProcessor");
    }

    @Test
    public void test00979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00979");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});/", (java.lang.Long) 32L, (java.lang.Long) 100L);
    }

    @Test
    public void test00980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00980");
        ch.rasc.extclassgenerator.ModelType modelType1 = null;
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("", modelType1);
        modelFieldBean2.setDateFormat("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        modelFieldBean2.setCalculate("Ext.define(\"null\",{extend:\"\",config:{fields:[]}});");
        java.lang.Boolean boolean7 = modelFieldBean2.getAllowBlank();
        org.junit.Assert.assertNull(boolean7);
    }

    @Test
    public void test00981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00981");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        hasOneAssociation1.setGetterName("hi!");
        hasOneAssociation1.setSetterName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str6 = hasOneAssociation1.getInstanceName();
        java.lang.String str7 = hasOneAssociation1.getSetterName();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str7, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
    }

    @Test
    public void test00982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00982");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});";
        apiObject0.destroy = "belongsTo";
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});";
        java.lang.String str10 = apiObject0.destroy;
        apiObject0.destroy = "";
        java.lang.String str13 = apiObject0.read;
        java.lang.String str14 = apiObject0.read;
        java.lang.String str15 = apiObject0.create;
        apiObject0.destroy = "length";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "belongsTo" + "'", str10, "belongsTo");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});" + "'", str15, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
    }

    @Test
    public void test00983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00983");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getChild();
        java.lang.String str3 = referenceBean0.getAssociation();
        boolean boolean4 = referenceBean0.typeOnly();
        referenceBean0.setAssociation("ch.rasc.extclassgenerator.ModelAnnotationProcessor");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00984");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        java.lang.String str6 = modelFieldBean2.getMapping();
        java.lang.String str7 = modelFieldBean2.getName();
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray14 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList12);
        modelFieldBean2.setDepends((java.util.List<java.lang.String>) strList12);
        modelFieldBean2.setCalculate("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean21 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean21.setConvert("hi!");
        java.lang.Boolean boolean24 = modelFieldBean21.getPersist();
        java.lang.String str25 = modelFieldBean21.getMapping();
        java.lang.String str26 = modelFieldBean21.getName();
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray33 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList31);
        modelFieldBean21.setDepends((java.util.List<java.lang.String>) strList31);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray35 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});", (java.util.List<java.lang.String>) strList31);
        modelFieldBean2.setDepends((java.util.List<java.lang.String>) strList31);
        modelFieldBean2.setUnique((java.lang.Boolean) false);
        java.util.List<java.lang.String> strList39 = modelFieldBean2.getDepends();
        java.lang.Object obj40 = modelFieldBean2.getDefaultValue();
        modelFieldBean2.setCritical((java.lang.Boolean) false);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(boolean24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertNull(obj40);
    }

    @Test
    public void test00985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00985");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getChild();
        boolean boolean2 = referenceBean0.typeOnly();
        java.lang.String str3 = referenceBean0.getType();
        java.lang.String str4 = referenceBean0.getChild();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00986");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getRole();
        referenceBean0.setChild("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        referenceBean0.setAssociation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        referenceBean0.setRole("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        referenceBean0.setChild("hi!");
        referenceBean0.setRole("json");
        java.lang.String str13 = referenceBean0.getAssociation();
        referenceBean0.setAssociation("Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"debug\",\n    type : \"boolean\"\n  }, {\n    name : \"useSingleQuotes\",\n    type : \"boolean\"\n  }, {\n    name : \"surroundApiWithQuotes\",\n    type : \"boolean\"\n  } ]\n});");
        java.lang.String str16 = referenceBean0.getAssociation();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});" + "'", str13, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"debug\",\n    type : \"boolean\"\n  }, {\n    name : \"useSingleQuotes\",\n    type : \"boolean\"\n  }, {\n    name : \"surroundApiWithQuotes\",\n    type : \"boolean\"\n  } ]\n});" + "'", str16, "Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"debug\",\n    type : \"boolean\"\n  }, {\n    name : \"useSingleQuotes\",\n    type : \"boolean\"\n  }, {\n    name : \"surroundApiWithQuotes\",\n    type : \"boolean\"\n  } ]\n});");
    }

    @Test
    public void test00987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00987");
        ch.rasc.extclassgenerator.OutputConfig outputConfig0 = new ch.rasc.extclassgenerator.OutputConfig();
        boolean boolean1 = outputConfig0.isDebug();
        ch.rasc.extclassgenerator.IncludeValidation includeValidation2 = outputConfig0.getIncludeValidation();
        outputConfig0.setSurroundApiWithQuotes(false);
        ch.rasc.extclassgenerator.LineEnding lineEnding5 = outputConfig0.getLineEnding();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(includeValidation2);
        org.junit.Assert.assertNull(lineEnding5);
    }

    @Test
    public void test00988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00988");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        referenceBean0.setInverse("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
        referenceBean0.setChild("hi!");
        java.lang.String str5 = referenceBean0.getAssociation();
        referenceBean0.setInverse("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        java.lang.String str8 = referenceBean0.getRole();
        boolean boolean9 = referenceBean0.typeOnly();
        referenceBean0.setType("");
        java.lang.String str12 = referenceBean0.getAssociation();
        java.lang.String str13 = referenceBean0.getParent();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test00989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00989");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Integer) 35, (java.lang.Integer) 1);
    }

    @Test
    public void test00990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00990");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        modelFieldBean2.setMapping("hi!");
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        modelFieldBean2.setAllowBlank((java.lang.Boolean) false);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray18 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList16);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray19 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("", (java.util.List<java.lang.String>) strList16);
        java.util.List<java.lang.String> strList20 = exclusionValidationArray19.getList();
        modelFieldBean2.setDepends(strList20);
        modelFieldBean2.setMapping("Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.Boolean boolean24 = modelFieldBean2.getUnique();
        modelFieldBean2.setMapping("Ext.data.Model");
        java.lang.Object obj27 = null;
        modelFieldBean2.setReference(obj27);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNull(boolean24);
    }

    @Test
    public void test00991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00991");
        ch.rasc.extclassgenerator.OutputConfig outputConfig0 = new ch.rasc.extclassgenerator.OutputConfig();
        boolean boolean1 = outputConfig0.isDebug();
        ch.rasc.extclassgenerator.OutputFormat outputFormat2 = outputConfig0.getOutputFormat();
        boolean boolean3 = outputConfig0.isDebug();
        ch.rasc.extclassgenerator.IncludeValidation includeValidation4 = outputConfig0.getIncludeValidation();
        ch.rasc.extclassgenerator.OutputConfig outputConfig5 = new ch.rasc.extclassgenerator.OutputConfig();
        boolean boolean6 = outputConfig5.isSurroundApiWithQuotes();
        boolean boolean7 = outputConfig5.isDebug();
        boolean boolean8 = outputConfig5.isSurroundApiWithQuotes();
        outputConfig5.setSurroundApiWithQuotes(false);
        boolean boolean11 = outputConfig5.isDebug();
        boolean boolean12 = outputConfig0.equals((java.lang.Object) boolean11);
        outputConfig0.setDebug(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(outputFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(includeValidation4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00992");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("hi!");
        hasManyAssociation1.setAssociationKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        hasManyAssociation1.setForeignKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        hasManyAssociation1.setAutoLoad((java.lang.Boolean) true);
    }

    @Test
    public void test00993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00993");
        ch.rasc.extclassgenerator.validation.FutureValidation futureValidation1 = new ch.rasc.extclassgenerator.validation.FutureValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});/");
    }

    @Test
    public void test00994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00994");
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation5 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal6 = rangeValidation5.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation12 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal13 = rangeValidation12.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation17 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal18 = rangeValidation17.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation19 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal13, bigDecimal18);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation24 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal25 = rangeValidation24.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation29 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal30 = rangeValidation29.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation31 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal25, bigDecimal30);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation32 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal18, bigDecimal25);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation33 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/", bigDecimal6, bigDecimal18);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation39 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal40 = rangeValidation39.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation44 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal45 = rangeValidation44.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation46 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal40, bigDecimal45);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation52 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal53 = rangeValidation52.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation57 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal58 = rangeValidation57.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation59 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal53, bigDecimal58);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation65 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal66 = rangeValidation65.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation70 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal71 = rangeValidation70.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation72 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal66, bigDecimal71);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation77 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal78 = rangeValidation77.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation82 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal83 = rangeValidation82.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation84 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal78, bigDecimal83);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation85 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal71, bigDecimal78);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation86 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});", bigDecimal58, bigDecimal78);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation87 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", bigDecimal45, bigDecimal78);
        java.math.BigDecimal bigDecimal88 = rangeValidation87.getMax();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation89 = new ch.rasc.extclassgenerator.validation.RangeValidation("", bigDecimal18, bigDecimal88);
        java.math.BigDecimal bigDecimal90 = rangeValidation89.getMin();
        java.math.BigDecimal bigDecimal91 = rangeValidation89.getMin();
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(bigDecimal40);
        org.junit.Assert.assertNotNull(bigDecimal45);
        org.junit.Assert.assertNotNull(bigDecimal53);
        org.junit.Assert.assertNotNull(bigDecimal58);
        org.junit.Assert.assertNotNull(bigDecimal66);
        org.junit.Assert.assertNotNull(bigDecimal71);
        org.junit.Assert.assertNotNull(bigDecimal78);
        org.junit.Assert.assertNotNull(bigDecimal83);
        org.junit.Assert.assertNotNull(bigDecimal88);
        org.junit.Assert.assertNotNull(bigDecimal90);
        org.junit.Assert.assertNotNull(bigDecimal91);
    }

    @Test
    public void test00995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00995");
        ch.rasc.extclassgenerator.validation.CreditCardNumberValidation creditCardNumberValidation1 = new ch.rasc.extclassgenerator.validation.CreditCardNumberValidation("Ext.define(\"Ext.define(\"null\",{extend:\"Ext.data.Model\",idProperty:\"hi!\",fields:[],proxy:{type:\"direct\",idParam:\"hi!\"}});\",{extend:\"/\\\\/Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\\\\//\",uses:[\"hi!\"],fields:[],hasMany:[\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\",\"json\",\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\",\"\"],associations:[{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],proxy:{type:\"direct\",directFn:hi!}});");
    }

    @Test
    public void test00996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00996");
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation3 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});", (java.lang.Long) 97L, (java.lang.Long) 100L);
    }

    @Test
    public void test00997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00997");
        ch.rasc.extclassgenerator.validation.FormatValidation formatValidation2 = new ch.rasc.extclassgenerator.validation.FormatValidation("ch.rasc.extclassgenerator.ModelAnnotationProcessor", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
        java.lang.String str3 = formatValidation2.getMatcher();
        java.lang.String str4 = formatValidation2.getMatcher();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});/" + "'", str3, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});/" + "'", str4, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});/");
    }

    @Test
    public void test00998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00998");
        ch.rasc.extclassgenerator.OutputConfig outputConfig0 = new ch.rasc.extclassgenerator.OutputConfig();
        boolean boolean1 = outputConfig0.isSurroundApiWithQuotes();
        boolean boolean2 = outputConfig0.isSurroundApiWithQuotes();
        outputConfig0.setDebug(false);
        outputConfig0.setDebug(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00999");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        modelFieldBean2.setMapping("hi!");
        java.lang.String str7 = modelFieldBean2.getMapping();
        java.lang.String str8 = modelFieldBean2.getDateFormat();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test01000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test01000");
        ch.rasc.extclassgenerator.validation.PastValidation pastValidation1 = new ch.rasc.extclassgenerator.validation.PastValidation("creditCardNumber");
    }
}
