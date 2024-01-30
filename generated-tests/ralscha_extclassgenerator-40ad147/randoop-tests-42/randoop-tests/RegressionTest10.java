import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

    public static boolean debug = false;

    @Test
    public void test05001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05001");
        ch.rasc.extclassgenerator.ModelAnnotationProcessor modelAnnotationProcessor0 = new ch.rasc.extclassgenerator.ModelAnnotationProcessor();
        java.util.Set<java.lang.String> strSet1 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        java.util.Set<java.lang.String> strSet2 = modelAnnotationProcessor0.getSupportedOptions();
        javax.lang.model.element.Element element3 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror4 = null;
        javax.lang.model.element.ExecutableElement executableElement5 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable7 = modelAnnotationProcessor0.getCompletions(element3, annotationMirror4, executableElement5, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        javax.lang.model.SourceVersion sourceVersion8 = modelAnnotationProcessor0.getSupportedSourceVersion();
        java.util.Set<java.lang.String> strSet9 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        java.util.Set<java.lang.String> strSet10 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        java.util.Set<java.lang.String> strSet11 = modelAnnotationProcessor0.getSupportedOptions();
        javax.lang.model.SourceVersion sourceVersion12 = modelAnnotationProcessor0.getSupportedSourceVersion();
        javax.annotation.processing.ProcessingEnvironment processingEnvironment13 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelAnnotationProcessor0.init(processingEnvironment13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Tool provided null ProcessingEnvironment");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(wildcardIterable7);
        org.junit.Assert.assertTrue("'" + sourceVersion8 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion8.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + sourceVersion12 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion12.equals(javax.lang.model.SourceVersion.RELEASE_6));
    }

    @Test
    public void test05002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05002");
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation6 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal7 = rangeValidation6.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation11 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal12 = rangeValidation11.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation13 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal7, bigDecimal12);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation19 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal20 = rangeValidation19.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation24 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal25 = rangeValidation24.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation26 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal20, bigDecimal25);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation31 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal32 = rangeValidation31.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation36 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal37 = rangeValidation36.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation38 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal32, bigDecimal37);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation39 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal25, bigDecimal32);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation40 = new ch.rasc.extclassgenerator.validation.RangeValidation("digits", bigDecimal7, bigDecimal25);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation47 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal48 = rangeValidation47.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation52 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal53 = rangeValidation52.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation54 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal48, bigDecimal53);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation60 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal61 = rangeValidation60.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation65 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal66 = rangeValidation65.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation67 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal61, bigDecimal66);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation72 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal73 = rangeValidation72.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation77 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal78 = rangeValidation77.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation79 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal73, bigDecimal78);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation80 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal66, bigDecimal73);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation81 = new ch.rasc.extclassgenerator.validation.RangeValidation("digits", bigDecimal48, bigDecimal66);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation85 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal86 = rangeValidation85.getMin();
        java.math.BigDecimal bigDecimal87 = rangeValidation85.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation88 = new ch.rasc.extclassgenerator.validation.RangeValidation("length", bigDecimal48, bigDecimal87);
        java.math.BigDecimal bigDecimal89 = rangeValidation88.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation90 = new ch.rasc.extclassgenerator.validation.RangeValidation("belongsTo", bigDecimal25, bigDecimal89);
        java.math.BigDecimal bigDecimal91 = rangeValidation90.getMin();
        java.math.BigDecimal bigDecimal92 = rangeValidation90.getMax();
        java.math.BigDecimal bigDecimal93 = rangeValidation90.getMin();
        java.math.BigDecimal bigDecimal94 = rangeValidation90.getMax();
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertNotNull(bigDecimal37);
        org.junit.Assert.assertNotNull(bigDecimal48);
        org.junit.Assert.assertNotNull(bigDecimal53);
        org.junit.Assert.assertNotNull(bigDecimal61);
        org.junit.Assert.assertNotNull(bigDecimal66);
        org.junit.Assert.assertNotNull(bigDecimal73);
        org.junit.Assert.assertNotNull(bigDecimal78);
        org.junit.Assert.assertNotNull(bigDecimal86);
        org.junit.Assert.assertNotNull(bigDecimal87);
        org.junit.Assert.assertNotNull(bigDecimal89);
        org.junit.Assert.assertNotNull(bigDecimal91);
        org.junit.Assert.assertNotNull(bigDecimal92);
        org.junit.Assert.assertNotNull(bigDecimal93);
        org.junit.Assert.assertNotNull(bigDecimal94);
    }

    @Test
    public void test05003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05003");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getParent();
        referenceBean0.setInverse("hi!");
        referenceBean0.setParent("exclusion");
        java.lang.String str7 = referenceBean0.getInverse();
        boolean boolean8 = referenceBean0.typeOnly();
        java.lang.String str9 = referenceBean0.getInverse();
        referenceBean0.setRole("digits");
        java.lang.String str12 = referenceBean0.getType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test05004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05004");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        java.lang.String str6 = referenceBean0.getParent();
        java.lang.String str7 = referenceBean0.getRole();
        referenceBean0.setType("/Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});/");
        java.lang.String str10 = referenceBean0.getRole();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test05005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05005");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("/belongsTo/");
        belongsToAssociation1.setGetterName("/Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});/");
    }

    @Test
    public void test05006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05006");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});", (java.lang.Long) 97L, (java.lang.Long) 52L);
    }

    @Test
    public void test05007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05007");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Object obj5 = modelFieldBean2.getReference();
        modelFieldBean2.setPersist((java.lang.Boolean) false);
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        ch.rasc.extclassgenerator.ModelType modelType10 = modelFieldBean2.getModelType();
        modelFieldBean2.setDateFormat("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean15 = new ch.rasc.extclassgenerator.ModelFieldBean("/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/", "range");
        modelFieldBean15.setUseNull((java.lang.Boolean) false);
        modelFieldBean2.setDefaultValue((java.lang.Object) false);
        java.lang.Object obj19 = modelFieldBean2.getDefaultValue();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(modelType10);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + false + "'", obj19, false);
    }

    @Test
    public void test05008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05008");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        ch.rasc.extclassgenerator.validation.GenericValidation genericValidation3 = new ch.rasc.extclassgenerator.validation.GenericValidation("/\\/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});\\//", "/ch.rasc.extclassgenerator.ModelAnnotationProcessor/", strMap2);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = genericValidation3.getOptions();
        org.junit.Assert.assertNull(strMap4);
    }

    @Test
    public void test05009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05009");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});";
        apiObject0.update = "json";
        apiObject0.destroy = "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/";
        java.lang.String str10 = apiObject0.read;
        apiObject0.update = "/Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});/";
        apiObject0.destroy = "Ext.define(\"null\",\r\n{\n  extend : \"/Ext.define(\\\"ch.rasc.extclassgenerator.association.HasManyAssociation\\\",{extend:\\\"Ext.data.Model\\\",fields:[{name:\\\"autoLoad\\\",type:\\\"boolean\\\"},{name:\\\"name\\\",type:\\\"string\\\"},{name:\\\"type\\\",type:\\\"string\\\"},{name:\\\"model\\\",type:\\\"string\\\"},{name:\\\"associationKey\\\",type:\\\"string\\\"},{name:\\\"foreignKey\\\",type:\\\"string\\\"},{name:\\\"primaryKey\\\",type:\\\"string\\\"},{name:\\\"instanceName\\\",type:\\\"string\\\"}]});/\",\n  config : {\n    fields : [ ],\n    proxy : {\n      type : \"direct\",\n      reader : {\n        successProperty : \"hasMany\"\n      },\n      writer : {\n        type : \"Ext.define(\\\"null\\\",{extend:\\\"Ext.data.Model\\\",fields:[],proxy:{type:\\\"direct\\\",directFn:hi!}});\"\n      }\n    }\n  }\n});";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test05010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05010");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("hi!", (java.lang.Long) 97L, (java.lang.Long) 32L);
    }

    @Test
    public void test05011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05011");
        ch.rasc.extclassgenerator.validation.EmailValidation emailValidation1 = new ch.rasc.extclassgenerator.validation.EmailValidation("Ext.define(\"ch.rasc.extclassgenerator.ReferenceBean\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"type\",type:\"string\"},{name:\"association\",type:\"string\"},{name:\"child\",type:\"string\"},{name:\"parent\",type:\"string\"},{name:\"role\",type:\"string\"},{name:\"inverse\",type:\"string\"}]}});");
    }

    @Test
    public void test05012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05012");
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
        modelFieldBean2.setMapping("belongsTo");
        ch.rasc.extclassgenerator.OutputConfig outputConfig26 = new ch.rasc.extclassgenerator.OutputConfig();
        boolean boolean27 = outputConfig26.isDebug();
        ch.rasc.extclassgenerator.OutputFormat outputFormat28 = outputConfig26.getOutputFormat();
        java.lang.Object obj29 = null;
        boolean boolean30 = outputConfig26.equals(obj29);
        ch.rasc.extclassgenerator.IncludeValidation includeValidation31 = outputConfig26.getIncludeValidation();
        boolean boolean32 = modelFieldBean2.hasOnlyName(outputConfig26);
        ch.rasc.extclassgenerator.IncludeValidation includeValidation33 = outputConfig26.getIncludeValidation();
        boolean boolean34 = outputConfig26.isSurroundApiWithQuotes();
        org.junit.Assert.assertNotNull(abstractValidationArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(strList19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(boolean23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(outputFormat28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(includeValidation31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(includeValidation33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test05013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05013");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.read = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str8 = apiObject0.update;
        apiObject0.read = "json";
        java.lang.String str11 = apiObject0.create;
        apiObject0.create = "Ext.define(\"null\",\r\n{\n  extend : \"\",\n  fields : [ ],\n  validations : [ {\n    type : \"range\",\n    field : \"/Ext.define(\\\"ch.rasc.extclassgenerator.association.HasManyAssociation\\\",{extend:\\\"Ext.data.Model\\\",fields:[{name:\\\"autoLoad\\\",type:\\\"boolean\\\"},{name:\\\"name\\\",type:\\\"string\\\"},{name:\\\"type\\\",type:\\\"string\\\"},{name:\\\"model\\\",type:\\\"string\\\"},{name:\\\"associationKey\\\",type:\\\"string\\\"},{name:\\\"foreignKey\\\",type:\\\"string\\\"},{name:\\\"primaryKey\\\",type:\\\"string\\\"},{name:\\\"instanceName\\\",type:\\\"string\\\"}]});/\",\n    min : 0,\n    max : 0\n  } ]\n});";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str8, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str11, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
    }

    @Test
    public void test05014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05014");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.destroy = "";
        apiObject0.destroy = "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/";
        java.lang.String str5 = apiObject0.read;
        java.lang.String str6 = apiObject0.read;
        apiObject0.update = "Ext.define(\"null\",{extend:\"\",config:{fields:[]}});";
        java.lang.String str9 = apiObject0.read;
        apiObject0.update = "/\\/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});\\//";
        java.lang.String str12 = apiObject0.create;
        apiObject0.update = "Ext.data.Model";
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test05015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05015");
        ch.rasc.extclassgenerator.ModelAnnotationProcessor modelAnnotationProcessor0 = new ch.rasc.extclassgenerator.ModelAnnotationProcessor();
        java.util.Set<java.lang.String> strSet1 = modelAnnotationProcessor0.getSupportedOptions();
        java.util.Set<java.lang.String> strSet2 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        javax.lang.model.element.Element element3 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror4 = null;
        javax.lang.model.element.ExecutableElement executableElement5 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable7 = modelAnnotationProcessor0.getCompletions(element3, annotationMirror4, executableElement5, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});/");
        javax.annotation.processing.ProcessingEnvironment processingEnvironment8 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelAnnotationProcessor0.init(processingEnvironment8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Tool provided null ProcessingEnvironment");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(wildcardIterable7);
    }

    @Test
    public void test05016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05016");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getRole();
        referenceBean0.setChild("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        referenceBean0.setAssociation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        java.lang.String str7 = referenceBean0.getAssociation();
        java.lang.String str8 = referenceBean0.getParent();
        referenceBean0.setType("Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});");
        boolean boolean11 = referenceBean0.typeOnly();
        referenceBean0.setParent("//");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});" + "'", str7, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test05017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05017");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Object obj5 = modelFieldBean2.getReference();
        modelFieldBean2.setPersist((java.lang.Boolean) false);
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        modelFieldBean2.setDateFormat("Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});");
        modelFieldBean2.setCalculate("Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[],proxy:{type:\"direct\",directFn:hi!,writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",config:{fields:[]}});\"}}}});");
        java.lang.Boolean boolean14 = modelFieldBean2.getAllowBlank();
        java.lang.Boolean boolean15 = modelFieldBean2.getUseNull();
        java.lang.String str16 = modelFieldBean2.getConvert();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertEquals("'" + boolean15 + "' != '" + true + "'", boolean15, true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test05018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05018");
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
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"associated\",\n    type : \"boolean\"\n  }, {\n    name : \"changes\",\n    type : \"boolean\"\n  }, {\n    name : \"critical\",\n    type : \"boolean\"\n  }, {\n    name : \"persist\",\n    type : \"boolean\"\n  } ]\n});";
        java.lang.String str21 = apiObject0.destroy;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "json" + "'", str10, "json");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/" + "'", str12, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});" + "'", str17, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "json" + "'", str18, "json");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});" + "'", str21, "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
    }

    @Test
    public void test05019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05019");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        java.lang.String str2 = hasOneAssociation1.getName();
        hasOneAssociation1.setInstanceName("");
        hasOneAssociation1.setName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str7 = hasOneAssociation1.getForeignKey();
        java.lang.String str8 = hasOneAssociation1.getAssociationKey();
        hasOneAssociation1.setSetterName("Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[],proxy:{type:\"direct\",directFn:hi!,writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",config:{fields:[]}});\"}}}});");
        java.lang.String str11 = hasOneAssociation1.getModel();
        java.lang.String str12 = hasOneAssociation1.getSetterName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[],proxy:{type:\"direct\",directFn:hi!,writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",config:{fields:[]}});\"}}}});" + "'", str12, "Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[],proxy:{type:\"direct\",directFn:hi!,writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",config:{fields:[]}});\"}}}});");
    }

    @Test
    public void test05020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05020");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        hasOneAssociation1.setInstanceName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str4 = hasOneAssociation1.getSetterName();
        java.lang.String str5 = hasOneAssociation1.getPrimaryKey();
        hasOneAssociation1.setGetterName("hasOne");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test05021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05021");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("Ext.define(\"null\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ],\n    proxy : {\n      type : \"direct\",\n      reader : {\n        type : \"Ext.define(\\\"java.util.ArrayList\\\",\\r\\n{\\n  extend : \\\"Ext.data.Model\\\",\\n  fields : [ ]\\n});\"\n      }\n    }\n  }\n});");
        hasOneAssociation1.setSetterName("Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});");
        hasOneAssociation1.setInstanceName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
    }

    @Test
    public void test05022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05022");
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
        apiObject0.update = "range";
        apiObject0.update = "Ext.define('Ext.define('ch.rasc.extclassgenerator.association.HasManyAssociation',\n{\n  extend : 'Ext.data.Model',\n  fields : [ {\n    name : 'autoLoad',\n    type : 'boolean'\n  }, {\n    name : 'name',\n    type : 'string'\n  }, {\n    name : 'type',\n    type : 'string'\n  }, {\n    name : 'model',\n    type : 'string'\n  }, {\n    name : 'associationKey',\n    type : 'string'\n  }, {\n    name : 'foreignKey',\n    type : 'string'\n  }, {\n    name : 'primaryKey',\n    type : 'string'\n  }, {\n    name : 'instanceName',\n    type : 'string'\n  } ]\n});',{extend:'',uses:['hi!'],fields:[],associations:[{type:'hasMany',model:'hi!'},{type:'hasMany',model:'hi!',associationKey:'Ext.define(\\'ch.rasc.extclassgenerator.ModelAnnotationProcessor\\',{extend:\\'Ext.data.Model\\',fields:[]});'},{type:'hasMany',model:'hi!',associationKey:'Ext.define(\\'ch.rasc.extclassgenerator.ModelAnnotationProcessor\\',{extend:\\'Ext.data.Model\\',fields:[]});'},{type:'hasMany',model:'hi!',foreignKey:''}]});";
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.validation.RangeValidation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"min\",\n    type : \"float\"\n  }, {\n    name : \"max\",\n    type : \"float\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"field\",\n    type : \"string\"\n  } ]\n});";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str8, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str9, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str11, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
    }

    @Test
    public void test05023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05023");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("ch.rasc.extclassgenerator.ModelAnnotationProcessor", (java.lang.Long) 0L, (java.lang.Long) 0L);
    }

    @Test
    public void test05024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05024");
        ch.rasc.extclassgenerator.ModelType modelType1 = null;
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", modelType1);
        java.lang.Object obj3 = modelFieldBean2.getDefaultValue();
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test05025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05025");
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
        modelFieldBean2.setPersist((java.lang.Boolean) false);
        java.lang.Object obj24 = modelFieldBean2.getDefaultValue();
        java.lang.String str25 = modelFieldBean2.getType();
        modelFieldBean2.setCalculate("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});");
        java.lang.String str28 = modelFieldBean2.getType();
        org.junit.Assert.assertNotNull(abstractValidationArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str25, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str28, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
    }

    @Test
    public void test05026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05026");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        modelBean0.setIdProperty("");
        java.lang.String str5 = modelBean0.getIdentifier();
        modelBean0.setDisablePagingParameters(true);
        java.lang.String str8 = modelBean0.getMessageProperty();
        modelBean0.setReader("/Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});/");
        modelBean0.setReadMethod("format");
        modelBean0.setExtend("Ext.define(\"ch.rasc.extclassgenerator.validation.InclusionValidationArray\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"field\",\n    type : \"string\"\n  } ]\n});");
        java.lang.String str15 = modelBean0.getCreateMethod();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test05027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05027");
        ch.rasc.extclassgenerator.validation.DigitsValidation digitsValidation3 = new ch.rasc.extclassgenerator.validation.DigitsValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelFieldBean\",{extend:\"Ext.data.Model\",fields:[{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"dateFormat\",type:\"string\"},{name:\"useNull\",type:\"boolean\"},{name:\"allowNull\",type:\"boolean\"},{name:\"mapping\",type:\"string\"},{name:\"persist\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"convert\",type:\"string\"},{name:\"calculate\",type:\"string\"},{name:\"allowBlank\",type:\"boolean\"},{name:\"unique\",type:\"boolean\"}]});", 100, 35);
        int int4 = digitsValidation3.getInteger();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test05028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05028");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("");
        hasOneAssociation1.setPrimaryKey("Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});");
        java.lang.String str4 = hasOneAssociation1.getSetterName();
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test05029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05029");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        java.lang.String str6 = referenceBean0.getParent();
        java.lang.String str7 = referenceBean0.getChild();
        referenceBean0.setInverse("/Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"debug\",type:\"boolean\"},{name:\"useSingleQuotes\",type:\"boolean\"},{name:\"surroundApiWithQuotes\",type:\"boolean\"}]}});/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test05030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05030");
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation3 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"null\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ],\n  proxy : {\n    type : \"direct\",\n    reader : {\n      totalProperty : \"/Ext.define(\\\"ch.rasc.extclassgenerator.association.HasManyAssociation\\\",{extend:\\\"Ext.data.Model\\\",fields:[{name:\\\"autoLoad\\\",type:\\\"boolean\\\"},{name:\\\"name\\\",type:\\\"string\\\"},{name:\\\"type\\\",type:\\\"string\\\"},{name:\\\"model\\\",type:\\\"string\\\"},{name:\\\"associationKey\\\",type:\\\"string\\\"},{name:\\\"foreignKey\\\",type:\\\"string\\\"},{name:\\\"primaryKey\\\",type:\\\"string\\\"},{name:\\\"instanceName\\\",type:\\\"string\\\"}]});/\"\n    }\n  }\n});", (java.lang.Long) 97L, (java.lang.Long) 52L);
    }

    @Test
    public void test05031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05031");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getRole();
        referenceBean0.setInverse("");
        java.lang.String str5 = referenceBean0.getAssociation();
        referenceBean0.setType("Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});");
        boolean boolean8 = referenceBean0.hasAnyProperties();
        referenceBean0.setInverse("belongsTo");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test05032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05032");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getChild();
        java.lang.String str2 = referenceBean0.getChild();
        referenceBean0.setType("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        referenceBean0.setType("");
        referenceBean0.setParent("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        java.lang.String str9 = referenceBean0.getRole();
        java.lang.String str10 = referenceBean0.getParent();
        referenceBean0.setChild("ch.rasc.extclassgenerator.association.HasManyAssociation");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/" + "'", str10, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
    }

    @Test
    public void test05033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05033");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("/hasMany/", (java.lang.Long) (-1L), (java.lang.Long) (-1L));
    }

    @Test
    public void test05034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05034");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("hi!");
        belongsToAssociation1.setSetterName("");
        belongsToAssociation1.setSetterName("creditCardNumber");
        java.lang.String str6 = belongsToAssociation1.getGetterName();
        java.lang.String str7 = belongsToAssociation1.getSetterName();
        java.lang.String str8 = belongsToAssociation1.getGetterName();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "creditCardNumber" + "'", str7, "creditCardNumber");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test05035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05035");
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
        modelFieldBean2.setName("Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[],proxy:{type:\"direct\",directFn:hi!}});");
        java.lang.String str27 = modelFieldBean2.getName();
        java.lang.Boolean boolean28 = modelFieldBean2.getAllowNull();
        modelFieldBean2.setAllowNull((java.lang.Boolean) false);
        java.lang.String str31 = modelFieldBean2.getDateFormat();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[],proxy:{type:\"direct\",directFn:hi!}});" + "'", str27, "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[],proxy:{type:\"direct\",directFn:hi!}});");
        org.junit.Assert.assertEquals("'" + boolean28 + "' != '" + false + "'", boolean28, false);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test05036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05036");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.update = "exclusion";
        java.lang.String str8 = apiObject0.read;
        java.lang.String str9 = apiObject0.destroy;
        apiObject0.create = "creditCardNumber";
        apiObject0.read = "";
        java.lang.String str14 = apiObject0.create;
        java.lang.String str15 = apiObject0.destroy;
        java.lang.String str16 = apiObject0.read;
        apiObject0.create = "";
        apiObject0.destroy = "/format/";
        java.lang.String str21 = apiObject0.read;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "creditCardNumber" + "'", str14, "creditCardNumber");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test05037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05037");
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
        java.util.List<java.lang.String> strList34 = null;
        modelFieldBean2.setDepends(strList34);
        modelFieldBean2.setDateFormat("/range/");
        java.lang.Boolean boolean38 = modelFieldBean2.getCritical();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(boolean38);
    }

    @Test
    public void test05038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05038");
        ch.rasc.extclassgenerator.PartialDataOptionsBean partialDataOptionsBean0 = new ch.rasc.extclassgenerator.PartialDataOptionsBean();
        boolean boolean1 = partialDataOptionsBean0.hasAnyProperties();
        java.lang.Boolean boolean2 = partialDataOptionsBean0.getCritical();
        java.lang.Boolean boolean3 = partialDataOptionsBean0.getAssociated();
        partialDataOptionsBean0.setCritical((java.lang.Boolean) false);
        java.lang.Boolean boolean6 = partialDataOptionsBean0.getPersist();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNull(boolean6);
    }

    @Test
    public void test05039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05039");
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation3 = new ch.rasc.extclassgenerator.validation.RangeValidation("notBlank", (java.lang.Long) (-1L), (java.lang.Long) 0L);
    }

    @Test
    public void test05040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05040");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        modelBean0.setIdProperty("");
        boolean boolean5 = modelBean0.isDisablePagingParameters();
        modelBean0.setExtend("");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean9 = modelBean0.getField("hi!");
        boolean boolean10 = modelBean0.isPaging();
        modelBean0.setVersionProperty("Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"associated\",\n    type : \"boolean\"\n  }, {\n    name : \"changes\",\n    type : \"boolean\"\n  }, {\n    name : \"critical\",\n    type : \"boolean\"\n  }, {\n    name : \"persist\",\n    type : \"boolean\"\n  } ]\n});");
        boolean boolean13 = modelBean0.isPaging();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(modelFieldBean9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test05041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05041");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("/Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});/", (java.lang.Integer) 10, (java.lang.Integer) (-1));
    }

    @Test
    public void test05042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05042");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.update = "exclusion";
        apiObject0.read = "";
        apiObject0.create = "Ext.define(\"Ext.define(\"null\",{extend:\"Ext.data.Model\",idProperty:\"hi!\",fields:[],proxy:{type:\"direct\",idParam:\"hi!\"}});\",{extend:\"/\\\\/Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\\\\//\",uses:[\"hi!\"],fields:[],hasMany:[\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\",\"json\",\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\",\"\"],associations:[{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],proxy:{type:\"direct\",directFn:hi!}});";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
    }

    @Test
    public void test05043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05043");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        java.lang.String str6 = referenceBean0.getAssociation();
        referenceBean0.setInverse("");
        java.lang.String str9 = referenceBean0.getParent();
        java.lang.String str10 = referenceBean0.getRole();
        java.lang.String str11 = referenceBean0.getChild();
        java.lang.String str12 = referenceBean0.getChild();
        boolean boolean13 = referenceBean0.typeOnly();
        boolean boolean14 = referenceBean0.hasAnyProperties();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test05044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05044");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});");
        java.lang.String str2 = hasManyAssociation1.getName();
        java.lang.Boolean boolean3 = hasManyAssociation1.getAutoLoad();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(boolean3);
    }

    @Test
    public void test05045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05045");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("Ext.define(\"ch.rasc.extclassgenerator.AllDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});");
        hasManyAssociation1.setName("java.util.ArrayList");
        java.lang.String str4 = hasManyAssociation1.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.util.ArrayList" + "'", str4, "java.util.ArrayList");
    }

    @Test
    public void test05046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05046");
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
        java.util.Set<java.lang.String> strSet15 = modelAnnotationProcessor0.getSupportedOptions();
        javax.annotation.processing.ProcessingEnvironment processingEnvironment16 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelAnnotationProcessor0.init(processingEnvironment16);
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
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test05047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05047");
        ch.rasc.extclassgenerator.validation.InclusionValidation inclusionValidation2 = new ch.rasc.extclassgenerator.validation.InclusionValidation("past", "Ext.define(\"ch.rasc.extclassgenerator.association.HasOneAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"setterName\",\n    type : \"string\"\n  }, {\n    name : \"getterName\",\n    type : \"string\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        java.lang.String str3 = inclusionValidation2.getList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.association.HasOneAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"setterName\",\n    type : \"string\"\n  }, {\n    name : \"getterName\",\n    type : \"string\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.association.HasOneAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"setterName\",\n    type : \"string\"\n  }, {\n    name : \"getterName\",\n    type : \"string\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
    }

    @Test
    public void test05048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05048");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        modelBean0.setIdProperty("");
        boolean boolean5 = modelBean0.isDisablePagingParameters();
        modelBean0.setExtend("");
        ch.rasc.extclassgenerator.PartialDataOptionsBean partialDataOptionsBean8 = modelBean0.getPartialDataOptions();
        modelBean0.setMessageProperty("hi!");
        modelBean0.setWriteAllFields((java.lang.Boolean) false);
        modelBean0.setWriter("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});/");
        modelBean0.setClientIdProperty("Ext.define(\"ch.rasc.extclassgenerator.ReferenceBean\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"type\",type:\"string\"},{name:\"association\",type:\"string\"},{name:\"child\",type:\"string\"},{name:\"parent\",type:\"string\"},{name:\"role\",type:\"string\"},{name:\"inverse\",type:\"string\"}]}});");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(partialDataOptionsBean8);
    }

    @Test
    public void test05049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05049");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("creditCardNumber", (java.lang.Integer) 0, (java.lang.Integer) 52);
    }

    @Test
    public void test05050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05050");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        ch.rasc.extclassgenerator.validation.GenericValidation genericValidation3 = new ch.rasc.extclassgenerator.validation.GenericValidation("digits", "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", strMap2);
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
    public void test05051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05051");
        ch.rasc.extclassgenerator.validation.EmailValidation emailValidation1 = new ch.rasc.extclassgenerator.validation.EmailValidation("Ext.define(\"null\",\r\n{\n  extend : \"/Ext.define(\\\"ch.rasc.extclassgenerator.association.HasManyAssociation\\\",{extend:\\\"Ext.data.Model\\\",fields:[{name:\\\"autoLoad\\\",type:\\\"boolean\\\"},{name:\\\"name\\\",type:\\\"string\\\"},{name:\\\"type\\\",type:\\\"string\\\"},{name:\\\"model\\\",type:\\\"string\\\"},{name:\\\"associationKey\\\",type:\\\"string\\\"},{name:\\\"foreignKey\\\",type:\\\"string\\\"},{name:\\\"primaryKey\\\",type:\\\"string\\\"},{name:\\\"instanceName\\\",type:\\\"string\\\"}]});/\",\n  config : {\n    fields : [ ],\n    proxy : {\n      type : \"direct\",\n      reader : {\n        successProperty : \"hasMany\"\n      },\n      writer : {\n        type : \"Ext.define(\\\"null\\\",{extend:\\\"Ext.data.Model\\\",fields:[],proxy:{type:\\\"direct\\\",directFn:hi!}});\"\n      }\n    }\n  }\n});");
    }

    @Test
    public void test05052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05052");
        ch.rasc.extclassgenerator.validation.FormatValidation formatValidation2 = new ch.rasc.extclassgenerator.validation.FormatValidation("ch.rasc.extclassgenerator.PartialDataOptionsBean", "/\\/\\\\/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});\\\\/\\//");
    }

    @Test
    public void test05053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05053");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("");
        java.lang.String str2 = belongsToAssociation1.getInstanceName();
        belongsToAssociation1.setGetterName("json");
        java.lang.String str5 = belongsToAssociation1.getSetterName();
        belongsToAssociation1.setForeignKey("Ext.data.Model");
        java.lang.String str8 = belongsToAssociation1.getSetterName();
        java.lang.String str9 = belongsToAssociation1.getGetterName();
        belongsToAssociation1.setAssociationKey("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});/");
        java.lang.String str12 = belongsToAssociation1.getPrimaryKey();
        java.lang.String str13 = belongsToAssociation1.getGetterName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "json" + "'", str9, "json");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "json" + "'", str13, "json");
    }

    @Test
    public void test05054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05054");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("hi!");
        hasManyAssociation1.setAssociationKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        hasManyAssociation1.setName("belongsTo");
        hasManyAssociation1.setPrimaryKey("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        hasManyAssociation1.setName("hasMany");
        hasManyAssociation1.setName("Ext.data.Model");
        hasManyAssociation1.setAssociationKey("digits");
        java.lang.String str14 = hasManyAssociation1.getType();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hasMany" + "'", str14, "hasMany");
    }

    @Test
    public void test05055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05055");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        referenceBean0.setParent("");
        java.lang.String str12 = referenceBean0.getType();
        java.lang.String str13 = referenceBean0.getParent();
        java.lang.String str14 = referenceBean0.getChild();
        java.lang.String str15 = referenceBean0.getAssociation();
        referenceBean0.setAssociation("/\\/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});\\//");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test05056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05056");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        hasOneAssociation1.setInstanceName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str4 = hasOneAssociation1.getSetterName();
        hasOneAssociation1.setSetterName("/Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});/");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test05057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05057");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        java.lang.String str6 = modelFieldBean2.getMapping();
        java.lang.Boolean boolean7 = modelFieldBean2.getAllowNull();
        java.lang.String str8 = modelFieldBean2.getName();
        java.lang.Boolean boolean9 = modelFieldBean2.getUseNull();
        modelFieldBean2.setUnique((java.lang.Boolean) true);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void test05058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05058");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.data.Model");
        modelFieldBean2.setAllowNull((java.lang.Boolean) false);
        java.lang.String str5 = modelFieldBean2.getName();
        modelFieldBean2.setDateFormat("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        modelFieldBean2.setUnique((java.lang.Boolean) false);
        modelFieldBean2.setCritical((java.lang.Boolean) true);
        java.lang.Object obj12 = modelFieldBean2.getReference();
        java.lang.String str13 = modelFieldBean2.getDateFormat();
        java.lang.Boolean boolean14 = modelFieldBean2.getAllowNull();
        java.lang.Boolean boolean15 = modelFieldBean2.getAllowNull();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/" + "'", str13, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        org.junit.Assert.assertEquals("'" + boolean14 + "' != '" + false + "'", boolean14, false);
        org.junit.Assert.assertEquals("'" + boolean15 + "' != '" + false + "'", boolean15, false);
    }

    @Test
    public void test05059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05059");
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
        modelFieldBean2.setAllowBlank((java.lang.Boolean) true);
        modelFieldBean2.setConvert("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.Object obj36 = modelFieldBean2.getDefaultValue();
        java.lang.Boolean boolean37 = modelFieldBean2.getAllowNull();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(boolean31);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertEquals("'" + boolean37 + "' != '" + false + "'", boolean37, false);
    }

    @Test
    public void test05060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05060");
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
        java.lang.Boolean boolean36 = modelFieldBean2.getAllowBlank();
        java.util.List<ch.rasc.extclassgenerator.validation.AbstractValidation> abstractValidationList37 = modelFieldBean2.getValidators();
        modelFieldBean2.setUnique((java.lang.Boolean) true);
        modelFieldBean2.setName("/hi!/");
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertEquals("'" + boolean36 + "' != '" + false + "'", boolean36, false);
        org.junit.Assert.assertNull(abstractValidationList37);
    }

    @Test
    public void test05061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05061");
        ch.rasc.extclassgenerator.validation.ExclusionValidation exclusionValidation2 = new ch.rasc.extclassgenerator.validation.ExclusionValidation("Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[],proxy:{type:\"direct\",directFn:hi!,writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",config:{fields:[]}});\"}}}});", "/Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});/");
    }

    @Test
    public void test05062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05062");
        ch.rasc.extclassgenerator.ModelAnnotationProcessor modelAnnotationProcessor0 = new ch.rasc.extclassgenerator.ModelAnnotationProcessor();
        java.util.Set<java.lang.String> strSet1 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        java.util.Set<java.lang.String> strSet2 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        java.util.Set<java.lang.String> strSet3 = modelAnnotationProcessor0.getSupportedOptions();
        javax.lang.model.element.Element element4 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror5 = null;
        javax.lang.model.element.ExecutableElement executableElement6 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable8 = modelAnnotationProcessor0.getCompletions(element4, annotationMirror5, executableElement6, "belongsTo");
        java.util.Set<java.lang.String> strSet9 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        javax.annotation.processing.ProcessingEnvironment processingEnvironment10 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelAnnotationProcessor0.init(processingEnvironment10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Tool provided null ProcessingEnvironment");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(wildcardIterable8);
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test05063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05063");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getType();
        referenceBean0.setType("hasMany");
        referenceBean0.setType("hi!");
        referenceBean0.setRole("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});");
        referenceBean0.setRole("");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test05064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05064");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        java.lang.String str1 = apiObject0.update;
        java.lang.String str2 = apiObject0.read;
        apiObject0.create = "Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test05065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05065");
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation6 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal7 = rangeValidation6.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation11 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal12 = rangeValidation11.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation13 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal7, bigDecimal12);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation19 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal20 = rangeValidation19.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation24 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal25 = rangeValidation24.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation26 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal20, bigDecimal25);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation32 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal33 = rangeValidation32.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation37 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal38 = rangeValidation37.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation39 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal33, bigDecimal38);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation44 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal45 = rangeValidation44.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation49 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal50 = rangeValidation49.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation51 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal45, bigDecimal50);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation52 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal38, bigDecimal45);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation53 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});", bigDecimal25, bigDecimal45);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation54 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", bigDecimal12, bigDecimal45);
        java.math.BigDecimal bigDecimal55 = rangeValidation54.getMax();
        java.math.BigDecimal bigDecimal56 = rangeValidation54.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation61 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal62 = rangeValidation61.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation68 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal69 = rangeValidation68.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation73 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal74 = rangeValidation73.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation75 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal69, bigDecimal74);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation80 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal81 = rangeValidation80.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation85 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal86 = rangeValidation85.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation87 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal81, bigDecimal86);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation88 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal74, bigDecimal81);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation89 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/", bigDecimal62, bigDecimal74);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation90 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});", bigDecimal56, bigDecimal62);
        java.math.BigDecimal bigDecimal91 = rangeValidation90.getMax();
        java.math.BigDecimal bigDecimal92 = rangeValidation90.getMin();
        java.math.BigDecimal bigDecimal93 = rangeValidation90.getMax();
        java.lang.String str94 = rangeValidation90.getField();
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal33);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertNotNull(bigDecimal45);
        org.junit.Assert.assertNotNull(bigDecimal50);
        org.junit.Assert.assertNotNull(bigDecimal55);
        org.junit.Assert.assertNotNull(bigDecimal56);
        org.junit.Assert.assertNotNull(bigDecimal62);
        org.junit.Assert.assertNotNull(bigDecimal69);
        org.junit.Assert.assertNotNull(bigDecimal74);
        org.junit.Assert.assertNotNull(bigDecimal81);
        org.junit.Assert.assertNotNull(bigDecimal86);
        org.junit.Assert.assertNotNull(bigDecimal91);
        org.junit.Assert.assertNotNull(bigDecimal92);
        org.junit.Assert.assertNotNull(bigDecimal93);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});" + "'", str94, "Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
    }

    @Test
    public void test05066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05066");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[],proxy:{type:\"direct\",directFn:hi!}});");
        java.lang.String str2 = hasOneAssociation1.getInstanceName();
        java.lang.String str3 = hasOneAssociation1.getPrimaryKey();
        java.lang.String str4 = hasOneAssociation1.getGetterName();
        hasOneAssociation1.setForeignKey("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ {\n      name : \"autoLoad\",\n      type : \"boolean\"\n    }, {\n      name : \"name\",\n      type : \"string\"\n    }, {\n      name : \"type\",\n      type : \"string\"\n    }, {\n      name : \"model\",\n      type : \"string\"\n    }, {\n      name : \"associationKey\",\n      type : \"string\"\n    }, {\n      name : \"foreignKey\",\n      type : \"string\"\n    }, {\n      name : \"primaryKey\",\n      type : \"string\"\n    }, {\n      name : \"instanceName\",\n      type : \"string\"\n    } ]\n  }\n});");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test05067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05067");
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
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"associated\",\n    type : \"boolean\"\n  }, {\n    name : \"changes\",\n    type : \"boolean\"\n  }, {\n    name : \"critical\",\n    type : \"boolean\"\n  }, {\n    name : \"persist\",\n    type : \"boolean\"\n  } ]\n});";
        java.lang.String str21 = apiObject0.read;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "json" + "'", str10, "json");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/" + "'", str12, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});" + "'", str17, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "json" + "'", str18, "json");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});" + "'", str21, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
    }

    @Test
    public void test05068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05068");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        modelFieldBean2.setCalculate("json");
        java.lang.Boolean boolean8 = modelFieldBean2.getCritical();
        java.lang.String str9 = modelFieldBean2.getMapping();
        java.util.List<java.lang.String> strList10 = modelFieldBean2.getDepends();
        modelFieldBean2.setAllowNull((java.lang.Boolean) true);
        java.lang.Object obj13 = modelFieldBean2.getDefaultValue();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strList10);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test05069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05069");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        java.lang.String str6 = referenceBean0.getType();
        referenceBean0.setChild("hasOne");
        java.lang.String str9 = referenceBean0.getChild();
        referenceBean0.setParent("/Ext.define(\"ch.rasc.extclassgenerator.validation.PresenceValidation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"field\",\n    type : \"string\"\n  } ]\n});/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hasOne" + "'", str9, "hasOne");
    }

    @Test
    public void test05070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05070");
        ch.rasc.extclassgenerator.validation.PastValidation pastValidation1 = new ch.rasc.extclassgenerator.validation.PastValidation("/\\/range\\//");
    }

    @Test
    public void test05071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05071");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        ch.rasc.extclassgenerator.validation.GenericValidation genericValidation3 = new ch.rasc.extclassgenerator.validation.GenericValidation("Ext.define(\"ch.rasc.extclassgenerator.AllDataOptionsBean\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ {\n      name : \"associated\",\n      type : \"boolean\"\n    }, {\n      name : \"changes\",\n      type : \"boolean\"\n    }, {\n      name : \"critical\",\n      type : \"boolean\"\n    }, {\n      name : \"persist\",\n      type : \"boolean\"\n    } ]\n  }\n});", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});", strMap2);
    }

    @Test
    public void test05072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05072");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getChild();
        java.lang.String str2 = referenceBean0.getChild();
        referenceBean0.setAssociation("creditCardNumber");
        referenceBean0.setInverse("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        referenceBean0.setRole("exclusion");
        referenceBean0.setType("Ext.define(\"ch.rasc.extclassgenerator.LineEnding\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
        java.lang.String str11 = referenceBean0.getParent();
        java.lang.String str12 = referenceBean0.getAssociation();
        java.lang.String str13 = referenceBean0.getInverse();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "creditCardNumber" + "'", str12, "creditCardNumber");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str13, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
    }

    @Test
    public void test05073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05073");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("Ext.define(\"java.util.Collections$UnmodifiableSet\",{extend:\"Ext.data.Model\",config:{fields:[]}});", (java.lang.Integer) (-1), (java.lang.Integer) 52);
    }

    @Test
    public void test05074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05074");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});";
        apiObject0.update = "json";
        apiObject0.destroy = "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/";
        java.lang.String str10 = apiObject0.update;
        java.lang.String str11 = apiObject0.update;
        apiObject0.destroy = "";
        apiObject0.read = "ch.rasc.extclassgenerator.OutputConfig";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "json" + "'", str10, "json");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "json" + "'", str11, "json");
    }

    @Test
    public void test05075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05075");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});";
        apiObject0.update = "json";
        apiObject0.destroy = "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/";
        java.lang.String str10 = apiObject0.read;
        apiObject0.update = "/Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});/";
        java.lang.String str13 = apiObject0.destroy;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/" + "'", str13, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
    }

    @Test
    public void test05076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05076");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("ch.rasc.extclassgenerator.ModelBean");
        java.lang.String str2 = hasOneAssociation1.getSetterName();
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test05077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05077");
        ch.rasc.extclassgenerator.validation.ExclusionValidation exclusionValidation2 = new ch.rasc.extclassgenerator.validation.ExclusionValidation("/ch.rasc.extclassgenerator.ModelAnnotationProcessor/", "Ext.data.Model");
    }

    @Test
    public void test05078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05078");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.data.Model");
        modelFieldBean2.setAllowNull((java.lang.Boolean) false);
        java.lang.Boolean boolean5 = modelFieldBean2.getAllowBlank();
        java.lang.Object obj6 = modelFieldBean2.getDefaultValue();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test05079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05079");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        java.lang.String str6 = modelFieldBean2.getMapping();
        java.lang.String str7 = modelFieldBean2.getName();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray16 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList14);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray17 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("", (java.util.List<java.lang.String>) strList14);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray18 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("json", (java.util.List<java.lang.String>) strList14);
        modelFieldBean2.setDepends((java.util.List<java.lang.String>) strList14);
        modelFieldBean2.setPersist((java.lang.Boolean) true);
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean24 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean24.setConvert("hi!");
        java.lang.Object obj27 = modelFieldBean24.getReference();
        modelFieldBean24.setPersist((java.lang.Boolean) false);
        java.lang.String str30 = modelFieldBean24.getType();
        modelFieldBean2.setDefaultValue((java.lang.Object) modelFieldBean24);
        java.lang.String str32 = modelFieldBean2.getDateFormat();
        java.lang.Boolean boolean33 = modelFieldBean2.getAllowNull();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str30, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(boolean33);
    }

    @Test
    public void test05080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05080");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.read = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.update = "";
        apiObject0.read = "json";
        java.lang.String str12 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});";
        java.lang.String str15 = apiObject0.read;
        apiObject0.destroy = "ch.rasc.extclassgenerator.validation.CreditCardNumberValidation";
        java.lang.String str18 = apiObject0.create;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "json" + "'", str15, "json");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});" + "'", str18, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
    }

    @Test
    public void test05081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05081");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("Ext.define(\"ch.rasc.extclassgenerator.AllDataOptionsBean\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ {\n      name : \"associated\",\n      type : \"boolean\"\n    }, {\n      name : \"changes\",\n      type : \"boolean\"\n    }, {\n      name : \"critical\",\n      type : \"boolean\"\n    }, {\n      name : \"persist\",\n      type : \"boolean\"\n    } ]\n  }\n});", (java.lang.Integer) 100, (java.lang.Integer) 100);
    }

    @Test
    public void test05082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05082");
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation3 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});", (java.lang.Long) 0L, (java.lang.Long) 32L);
        java.lang.String str4 = rangeValidation3.getField();
        java.math.BigDecimal bigDecimal5 = rangeValidation3.getMax();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});" + "'", str4, "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        org.junit.Assert.assertNotNull(bigDecimal5);
    }

    @Test
    public void test05083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05083");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        referenceBean0.setInverse("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
        referenceBean0.setChild("hi!");
        java.lang.String str5 = referenceBean0.getAssociation();
        referenceBean0.setInverse("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        java.lang.String str8 = referenceBean0.getType();
        referenceBean0.setInverse("creditCardNumber");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test05084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05084");
        ch.rasc.extclassgenerator.validation.NotBlankValidation notBlankValidation1 = new ch.rasc.extclassgenerator.validation.NotBlankValidation("Ext.define(\"ch.rasc.extclassgenerator.association.HasOneAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"setterName\",\n    type : \"string\"\n  }, {\n    name : \"getterName\",\n    type : \"string\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
    }

    @Test
    public void test05085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05085");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        java.lang.String str3 = modelBean0.getReadMethod();
        ch.rasc.extclassgenerator.validation.FormatValidation formatValidation6 = new ch.rasc.extclassgenerator.validation.FormatValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str7 = formatValidation6.getMatcher();
        modelBean0.addValidation((ch.rasc.extclassgenerator.validation.AbstractValidation) formatValidation6);
        java.util.List<ch.rasc.extclassgenerator.association.AbstractAssociation> abstractAssociationList9 = modelBean0.getAssociations();
        modelBean0.setReadMethod("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean13 = modelBean0.getField("Ext.define(\"null\",{extend:\"\",config:{fields:[]}});");
        java.lang.String str14 = modelBean0.getCreateMethod();
        modelBean0.setDisablePagingParameters(true);
        java.lang.String str17 = modelBean0.getReader();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/" + "'", str7, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        org.junit.Assert.assertNotNull(abstractAssociationList9);
        org.junit.Assert.assertNull(modelFieldBean13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "json" + "'", str17, "json");
    }

    @Test
    public void test05086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05086");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("ch.rasc.extclassgenerator.PartialDataOptionsBean", "Ext.define(\"null\",{extend:\"Ext.data.Model\",idProperty:\"hi!\",fields:[],proxy:{type:\"direct\",idParam:\"hi!\"}});");
    }

    @Test
    public void test05087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05087");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("Ext.data.Model", "/ch.rasc.extclassgenerator.ModelAnnotationProcessor/");
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        modelFieldBean2.setCalculate("Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[],proxy:{type:\"direct\",directFn:hi!,writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",config:{fields:[]}});\"}}}});");
    }

    @Test
    public void test05088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05088");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("Ext.define(\"ch.rasc.extclassgenerator.association.BelongsToAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ {\n      name : \"setterName\",\n      type : \"string\"\n    }, {\n      name : \"getterName\",\n      type : \"string\"\n    }, {\n      name : \"type\",\n      type : \"string\"\n    }, {\n      name : \"model\",\n      type : \"string\"\n    }, {\n      name : \"associationKey\",\n      type : \"string\"\n    }, {\n      name : \"foreignKey\",\n      type : \"string\"\n    }, {\n      name : \"primaryKey\",\n      type : \"string\"\n    }, {\n      name : \"instanceName\",\n      type : \"string\"\n    } ]\n  }\n});", "Ext.define(\"null\",\r\n{\n  extend : \"\",\n  idgen : \"Ext.define(\\\"java.util.ArrayList\\\",\\r\\n{\\n  extend : \\\"Ext.data.Model\\\",\\n  fields : [ ]\\n});\",\n  fields : [ ],\n  proxy : {\n    type : \"direct\",\n    reader : {\n      root : \"Ext.define(\\\"null\\\",{extend:\\\"Ext.data.Model\\\",idProperty:\\\"hi!\\\",fields:[],proxy:{type:\\\"direct\\\",idParam:\\\"hi!\\\"}});\",\n      messageProperty : \"hi!\"\n    },\n    writer : {\n      writeAllFields : false\n    }\n  }\n});");
        java.lang.String str3 = modelFieldBean2.getConvert();
        java.lang.String str4 = modelFieldBean2.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Ext.define(\"null\",\r\n{\n  extend : \"\",\n  idgen : \"Ext.define(\\\"java.util.ArrayList\\\",\\r\\n{\\n  extend : \\\"Ext.data.Model\\\",\\n  fields : [ ]\\n});\",\n  fields : [ ],\n  proxy : {\n    type : \"direct\",\n    reader : {\n      root : \"Ext.define(\\\"null\\\",{extend:\\\"Ext.data.Model\\\",idProperty:\\\"hi!\\\",fields:[],proxy:{type:\\\"direct\\\",idParam:\\\"hi!\\\"}});\",\n      messageProperty : \"hi!\"\n    },\n    writer : {\n      writeAllFields : false\n    }\n  }\n});" + "'", str4, "Ext.define(\"null\",\r\n{\n  extend : \"\",\n  idgen : \"Ext.define(\\\"java.util.ArrayList\\\",\\r\\n{\\n  extend : \\\"Ext.data.Model\\\",\\n  fields : [ ]\\n});\",\n  fields : [ ],\n  proxy : {\n    type : \"direct\",\n    reader : {\n      root : \"Ext.define(\\\"null\\\",{extend:\\\"Ext.data.Model\\\",idProperty:\\\"hi!\\\",fields:[],proxy:{type:\\\"direct\\\",idParam:\\\"hi!\\\"}});\",\n      messageProperty : \"hi!\"\n    },\n    writer : {\n      writeAllFields : false\n    }\n  }\n});");
    }

    @Test
    public void test05089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05089");
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
        modelFieldBean2.setAllowBlank((java.lang.Boolean) false);
        modelFieldBean2.setUnique((java.lang.Boolean) true);
        java.lang.Boolean boolean23 = modelFieldBean2.getAllowNull();
        org.junit.Assert.assertNotNull(abstractValidationArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(boolean23);
    }

    @Test
    public void test05090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05090");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setDateFormat("hi!");
        ch.rasc.extclassgenerator.OutputConfig outputConfig5 = new ch.rasc.extclassgenerator.OutputConfig();
        boolean boolean6 = outputConfig5.isDebug();
        ch.rasc.extclassgenerator.OutputFormat outputFormat7 = outputConfig5.getOutputFormat();
        boolean boolean8 = outputConfig5.isDebug();
        boolean boolean9 = modelFieldBean2.hasOnlyName(outputConfig5);
        ch.rasc.extclassgenerator.IncludeValidation includeValidation10 = outputConfig5.getIncludeValidation();
        java.lang.Object obj11 = new java.lang.Object();
        boolean boolean12 = outputConfig5.equals(obj11);
        outputConfig5.setDebug(true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(outputFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(includeValidation10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test05091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05091");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.data.Model");
        modelFieldBean2.setConvert("hasOne");
        java.lang.Object obj5 = modelFieldBean2.getReference();
        modelFieldBean2.setAllowBlank((java.lang.Boolean) false);
        modelFieldBean2.setUseNull((java.lang.Boolean) false);
        java.util.List<java.lang.String> strList10 = modelFieldBean2.getDepends();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(strList10);
    }

    @Test
    public void test05092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05092");
        ch.rasc.extclassgenerator.validation.DigitsValidation digitsValidation3 = new ch.rasc.extclassgenerator.validation.DigitsValidation("", (int) ' ', (int) (byte) 1);
        int int4 = digitsValidation3.getFraction();
        int int5 = digitsValidation3.getInteger();
        int int6 = digitsValidation3.getInteger();
        int int7 = digitsValidation3.getInteger();
        int int8 = digitsValidation3.getFraction();
        int int9 = digitsValidation3.getInteger();
        int int10 = digitsValidation3.getInteger();
        int int11 = digitsValidation3.getFraction();
        int int12 = digitsValidation3.getFraction();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test05093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05093");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/", "range");
        modelFieldBean2.setUseNull((java.lang.Boolean) false);
        ch.rasc.extclassgenerator.ModelType modelType5 = modelFieldBean2.getModelType();
        org.junit.Assert.assertNull(modelType5);
    }

    @Test
    public void test05094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05094");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("Ext.define(\"ch.rasc.extclassgenerator.ReferenceBean\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"type\",type:\"string\"},{name:\"association\",type:\"string\"},{name:\"child\",type:\"string\"},{name:\"parent\",type:\"string\"},{name:\"role\",type:\"string\"},{name:\"inverse\",type:\"string\"}]}});");
    }

    @Test
    public void test05095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05095");
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
        java.lang.String str19 = apiObject0.destroy;
        apiObject0.destroy = "/Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});/";
        apiObject0.create = "";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "json" + "'", str10, "json");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/" + "'", str12, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});" + "'", str19, "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
    }

    @Test
    public void test05096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05096");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setDateFormat("Ext.define(\"ch.rasc.extclassgenerator.validation.PresenceValidation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"field\",\n    type : \"string\"\n  } ]\n});");
    }

    @Test
    public void test05097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05097");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        java.lang.String str6 = modelFieldBean2.getMapping();
        modelFieldBean2.setConvert("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        java.lang.Boolean boolean9 = modelFieldBean2.getCritical();
        java.lang.String str10 = modelFieldBean2.getName();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test05098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05098");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        java.lang.String str3 = modelBean0.getReadMethod();
        java.lang.String str4 = modelBean0.getDestroyMethod();
        java.lang.String str5 = modelBean0.getSuccessProperty();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test05099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05099");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("Ext.define(\"java.util.ArrayList\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Integer) 0, (java.lang.Integer) 100);
    }

    @Test
    public void test05100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05100");
        ch.rasc.extclassgenerator.OutputConfig outputConfig0 = new ch.rasc.extclassgenerator.OutputConfig();
        boolean boolean1 = outputConfig0.isSurroundApiWithQuotes();
        boolean boolean2 = outputConfig0.isDebug();
        outputConfig0.setDebug(false);
        outputConfig0.setUseSingleQuotes(false);
        ch.rasc.extclassgenerator.OutputFormat outputFormat7 = outputConfig0.getOutputFormat();
        ch.rasc.extclassgenerator.IncludeValidation includeValidation8 = outputConfig0.getIncludeValidation();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(outputFormat7);
        org.junit.Assert.assertNull(includeValidation8);
    }

    @Test
    public void test05101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05101");
        ch.rasc.extclassgenerator.ModelBean modelBean2 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean2.setDisablePagingParameters(false);
        java.util.List<ch.rasc.extclassgenerator.association.AbstractAssociation> abstractAssociationList5 = modelBean2.getAssociations();
        java.lang.String str6 = modelBean2.getMessageProperty();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation12 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal13 = rangeValidation12.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation17 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal18 = rangeValidation17.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation19 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal13, bigDecimal18);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation25 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal26 = rangeValidation25.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation30 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal31 = rangeValidation30.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation32 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal26, bigDecimal31);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation37 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal38 = rangeValidation37.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation42 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal43 = rangeValidation42.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation44 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal38, bigDecimal43);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation45 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal31, bigDecimal38);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation46 = new ch.rasc.extclassgenerator.validation.RangeValidation("digits", bigDecimal13, bigDecimal31);
        modelBean2.addValidation((ch.rasc.extclassgenerator.validation.AbstractValidation) rangeValidation46);
        java.math.BigDecimal bigDecimal48 = rangeValidation46.getMin();
        java.math.BigDecimal bigDecimal49 = rangeValidation46.getMin();
        java.math.BigDecimal bigDecimal50 = rangeValidation46.getMax();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation54 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal55 = rangeValidation54.getMax();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation56 = new ch.rasc.extclassgenerator.validation.RangeValidation("hasMany", bigDecimal50, bigDecimal55);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation60 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});/", (java.lang.Long) 10L, (java.lang.Long) 100L);
        java.math.BigDecimal bigDecimal61 = rangeValidation60.getMax();
        java.math.BigDecimal bigDecimal62 = rangeValidation60.getMax();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation63 = new ch.rasc.extclassgenerator.validation.RangeValidation("ch.rasc.extclassgenerator.ModelBean", bigDecimal50, bigDecimal62);
        java.math.BigDecimal bigDecimal64 = rangeValidation63.getMin();
        org.junit.Assert.assertNotNull(abstractAssociationList5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertNotNull(bigDecimal43);
        org.junit.Assert.assertNotNull(bigDecimal48);
        org.junit.Assert.assertNotNull(bigDecimal49);
        org.junit.Assert.assertNotNull(bigDecimal50);
        org.junit.Assert.assertNotNull(bigDecimal55);
        org.junit.Assert.assertNotNull(bigDecimal61);
        org.junit.Assert.assertNotNull(bigDecimal62);
        org.junit.Assert.assertNotNull(bigDecimal64);
    }

    @Test
    public void test05102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05102");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.update = "exclusion";
        java.lang.String str8 = apiObject0.read;
        java.lang.String str9 = apiObject0.destroy;
        apiObject0.update = "creditCardNumber";
        apiObject0.create = "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.update = "hasMany";
        java.lang.String str16 = apiObject0.read;
        apiObject0.read = "/format/";
        java.lang.String str19 = apiObject0.destroy;
        java.lang.String str20 = apiObject0.destroy;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test05103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05103");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        java.lang.String str6 = modelFieldBean2.getMapping();
        java.lang.Object obj7 = modelFieldBean2.getReference();
        modelFieldBean2.setCalculate("exclusion");
        java.lang.Boolean boolean10 = modelFieldBean2.getUnique();
        java.lang.String str11 = modelFieldBean2.getConvert();
        java.lang.Boolean boolean12 = modelFieldBean2.getAllowNull();
        modelFieldBean2.setAllowBlank((java.lang.Boolean) true);
        java.util.List<java.lang.String> strList15 = null;
        modelFieldBean2.setDepends(strList15);
        modelFieldBean2.setPersist((java.lang.Boolean) true);
        java.lang.String str19 = modelFieldBean2.getType();
        java.lang.Object obj20 = modelFieldBean2.getReference();
        java.lang.Boolean boolean21 = modelFieldBean2.getAllowBlank();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str19, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertEquals("'" + boolean21 + "' != '" + true + "'", boolean21, true);
    }

    @Test
    public void test05104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05104");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.destroy = "";
        apiObject0.destroy = "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/";
        java.lang.String str5 = apiObject0.read;
        apiObject0.update = "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/";
        apiObject0.read = "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/";
        apiObject0.destroy = "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]}});";
        apiObject0.destroy = "Ext.define(\"ch.rasc.extclassgenerator.LineEnding\",{extend:\"Ext.data.Model\",config:{fields:[]}});";
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test05105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05105");
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation7 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal8 = rangeValidation7.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation12 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal13 = rangeValidation12.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation14 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal8, bigDecimal13);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation20 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal21 = rangeValidation20.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation25 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal26 = rangeValidation25.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation27 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal21, bigDecimal26);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation32 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal33 = rangeValidation32.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation37 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal38 = rangeValidation37.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation39 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal33, bigDecimal38);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation40 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal26, bigDecimal33);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation41 = new ch.rasc.extclassgenerator.validation.RangeValidation("digits", bigDecimal8, bigDecimal26);
        java.math.BigDecimal bigDecimal42 = rangeValidation41.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation47 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});", (java.lang.Long) 97L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal48 = rangeValidation47.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation54 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal55 = rangeValidation54.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation59 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal60 = rangeValidation59.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation61 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal55, bigDecimal60);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation66 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal67 = rangeValidation66.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation71 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal72 = rangeValidation71.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation73 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal67, bigDecimal72);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation74 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});", bigDecimal55, bigDecimal67);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation75 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});", bigDecimal48, bigDecimal55);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation76 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});", bigDecimal42, bigDecimal48);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation80 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.data.Model", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal81 = rangeValidation80.getMax();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation82 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.validation.InclusionValidationArray\",{extend:\"Ext.data.Model\",fields:[{name:\"type\",type:\"string\"},{name:\"field\",type:\"string\"}]});", bigDecimal48, bigDecimal81);
        java.math.BigDecimal bigDecimal83 = rangeValidation82.getMin();
        java.lang.String str84 = rangeValidation82.getType();
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigDecimal33);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertNotNull(bigDecimal48);
        org.junit.Assert.assertNotNull(bigDecimal55);
        org.junit.Assert.assertNotNull(bigDecimal60);
        org.junit.Assert.assertNotNull(bigDecimal67);
        org.junit.Assert.assertNotNull(bigDecimal72);
        org.junit.Assert.assertNotNull(bigDecimal81);
        org.junit.Assert.assertNotNull(bigDecimal83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "range" + "'", str84, "range");
    }

    @Test
    public void test05106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05106");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean4 = allDataOptionsBean0.getPersist();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        allDataOptionsBean0.setPersist((java.lang.Boolean) false);
        boolean boolean9 = allDataOptionsBean0.hasAnyProperties();
        java.lang.Boolean boolean10 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean11 = allDataOptionsBean0.getCritical();
        allDataOptionsBean0.setChanges((java.lang.Boolean) true);
        boolean boolean14 = allDataOptionsBean0.hasAnyProperties();
        java.lang.Boolean boolean15 = allDataOptionsBean0.getChanges();
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + false + "'", boolean10, false);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + boolean15 + "' != '" + true + "'", boolean15, true);
    }

    @Test
    public void test05107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05107");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        hasOneAssociation1.setInstanceName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        hasOneAssociation1.setName("creditCardNumber");
        java.lang.String str6 = hasOneAssociation1.getName();
        hasOneAssociation1.setSetterName("hasMany");
        java.lang.String str9 = hasOneAssociation1.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "creditCardNumber" + "'", str6, "creditCardNumber");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "creditCardNumber" + "'", str9, "creditCardNumber");
    }

    @Test
    public void test05108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05108");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.read = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str8 = apiObject0.update;
        apiObject0.read = "json";
        apiObject0.read = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});";
        java.lang.String str13 = apiObject0.update;
        apiObject0.read = "json";
        apiObject0.read = "/\\/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});\\//";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str8, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str13, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
    }

    @Test
    public void test05109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05109");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str2 = belongsToAssociation1.getSetterName();
        belongsToAssociation1.setAssociationKey("belongsTo");
        java.lang.String str5 = belongsToAssociation1.getSetterName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test05110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05110");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",{extend:\"Ext.data.Model\",fields:[{name:\"debug\",type:\"boolean\"},{name:\"useSingleQuotes\",type:\"boolean\"},{name:\"surroundApiWithQuotes\",type:\"boolean\"}]});", "Ext.define(\"ch.rasc.extclassgenerator.association.BelongsToAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ {\n      name : \"setterName\",\n      type : \"string\"\n    }, {\n      name : \"getterName\",\n      type : \"string\"\n    }, {\n      name : \"type\",\n      type : \"string\"\n    }, {\n      name : \"model\",\n      type : \"string\"\n    }, {\n      name : \"associationKey\",\n      type : \"string\"\n    }, {\n      name : \"foreignKey\",\n      type : \"string\"\n    }, {\n      name : \"primaryKey\",\n      type : \"string\"\n    }, {\n      name : \"instanceName\",\n      type : \"string\"\n    } ]\n  }\n});");
        java.lang.Object obj3 = null;
        modelFieldBean2.setReference(obj3);
        java.lang.Boolean boolean5 = modelFieldBean2.getUseNull();
        org.junit.Assert.assertNull(boolean5);
    }

    @Test
    public void test05111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05111");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getChild();
        java.lang.String str2 = referenceBean0.getChild();
        referenceBean0.setAssociation("creditCardNumber");
        referenceBean0.setType("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        referenceBean0.setChild("length");
        referenceBean0.setParent("json");
        referenceBean0.setChild("exclusion");
        referenceBean0.setParent("digits");
        java.lang.String str15 = referenceBean0.getParent();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "digits" + "'", str15, "digits");
    }

    @Test
    public void test05112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05112");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        java.lang.String str2 = hasOneAssociation1.getName();
        java.lang.String str3 = hasOneAssociation1.getGetterName();
        java.lang.String str4 = hasOneAssociation1.getAssociationKey();
        hasOneAssociation1.setInstanceName("digits");
        hasOneAssociation1.setName("hasOne");
        java.lang.String str9 = hasOneAssociation1.getName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hasOne" + "'", str9, "hasOne");
    }

    @Test
    public void test05113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05113");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        java.lang.String str2 = hasOneAssociation1.getPrimaryKey();
        java.lang.String str3 = hasOneAssociation1.getForeignKey();
        hasOneAssociation1.setAssociationKey("Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
        hasOneAssociation1.setPrimaryKey("/Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});/");
        java.lang.String str8 = hasOneAssociation1.getForeignKey();
        java.lang.String str9 = hasOneAssociation1.getName();
        hasOneAssociation1.setGetterName("Ext.define(\"null\",\r\n{\n  extend : \"\",\n  config : {\n    fields : [ ],\n    proxy : {\n      type : \"direct\",\n      api : {\n        create : Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});\n      },\n      reader : {\n        messageProperty : \"hi!\"\n      }\n    }\n  }\n});");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test05114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05114");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        modelBean0.setIdProperty("");
        modelBean0.setClientIdPropertyAddToWriter(true);
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean7 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean7.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean10 = allDataOptionsBean7.getAssociated();
        java.lang.Boolean boolean11 = allDataOptionsBean7.getCritical();
        java.lang.Boolean boolean12 = allDataOptionsBean7.getPersist();
        allDataOptionsBean7.setAssociated((java.lang.Boolean) false);
        allDataOptionsBean7.setPersist((java.lang.Boolean) false);
        java.lang.Boolean boolean17 = allDataOptionsBean7.getCritical();
        modelBean0.setAllDataOptions(allDataOptionsBean7);
        boolean boolean19 = modelBean0.isPaging();
        modelBean0.setIdentifier("Ext.define(\"ch.rasc.extclassgenerator.ReferenceBean\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"type\",type:\"string\"},{name:\"association\",type:\"string\"},{name:\"child\",type:\"string\"},{name:\"parent\",type:\"string\"},{name:\"role\",type:\"string\"},{name:\"inverse\",type:\"string\"}]}});");
        ch.rasc.extclassgenerator.validation.DigitsValidation digitsValidation25 = new ch.rasc.extclassgenerator.validation.DigitsValidation("digits", (int) (byte) 0, 32);
        int int26 = digitsValidation25.getFraction();
        int int27 = digitsValidation25.getInteger();
        int int28 = digitsValidation25.getInteger();
        int int29 = digitsValidation25.getFraction();
        modelBean0.addValidation((ch.rasc.extclassgenerator.validation.AbstractValidation) digitsValidation25);
        int int31 = digitsValidation25.getInteger();
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + false + "'", boolean10, false);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertNull(boolean17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32 + "'", int26 == 32);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 32 + "'", int29 == 32);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test05115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05115");
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
        java.util.Set<java.lang.String> strSet15 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        java.util.Set<java.lang.String> strSet16 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        javax.lang.model.element.Element element17 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror18 = null;
        javax.lang.model.element.ExecutableElement executableElement19 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable21 = modelAnnotationProcessor0.getCompletions(element17, annotationMirror18, executableElement19, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});/");
        javax.annotation.processing.ProcessingEnvironment processingEnvironment22 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelAnnotationProcessor0.init(processingEnvironment22);
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
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(wildcardIterable21);
    }

    @Test
    public void test05116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05116");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("length");
    }

    @Test
    public void test05117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05117");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        java.lang.String str10 = referenceBean0.getParent();
        referenceBean0.setType("Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
        referenceBean0.setParent("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});/");
        java.lang.String str15 = referenceBean0.getChild();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test05118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05118");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        modelBean0.setIdProperty("");
        modelBean0.setClientIdPropertyAddToWriter(true);
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean7 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean7.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean10 = allDataOptionsBean7.getAssociated();
        java.lang.Boolean boolean11 = allDataOptionsBean7.getCritical();
        java.lang.Boolean boolean12 = allDataOptionsBean7.getPersist();
        allDataOptionsBean7.setAssociated((java.lang.Boolean) false);
        allDataOptionsBean7.setPersist((java.lang.Boolean) false);
        java.lang.Boolean boolean17 = allDataOptionsBean7.getCritical();
        modelBean0.setAllDataOptions(allDataOptionsBean7);
        allDataOptionsBean7.setPersist((java.lang.Boolean) false);
        java.lang.Boolean boolean21 = allDataOptionsBean7.getAssociated();
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + false + "'", boolean10, false);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertNull(boolean17);
        org.junit.Assert.assertEquals("'" + boolean21 + "' != '" + false + "'", boolean21, false);
    }

    @Test
    public void test05119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05119");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});", (java.lang.Long) 10L, (java.lang.Long) 35L);
    }

    @Test
    public void test05120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05120");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("exclusion");
        java.lang.String str2 = hasManyAssociation1.getType();
        hasManyAssociation1.setName("ch.rasc.extclassgenerator.association.HasManyAssociation");
        hasManyAssociation1.setAssociationKey("/hasMany/");
        java.lang.String str7 = hasManyAssociation1.getName();
        hasManyAssociation1.setName("/Ext.define(\"null\",{extend:\"Ext.data.Model\",idProperty:\"hi!\",fields:[],proxy:{type:\"direct\",idParam:\"hi!\"}});/");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hasMany" + "'", str2, "hasMany");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ch.rasc.extclassgenerator.association.HasManyAssociation" + "'", str7, "ch.rasc.extclassgenerator.association.HasManyAssociation");
    }

    @Test
    public void test05121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05121");
        ch.rasc.extclassgenerator.validation.FutureValidation futureValidation1 = new ch.rasc.extclassgenerator.validation.FutureValidation("Ext.define(\"ch.rasc.extclassgenerator.ReferenceBean\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"type\",type:\"string\"},{name:\"association\",type:\"string\"},{name:\"child\",type:\"string\"},{name:\"parent\",type:\"string\"},{name:\"role\",type:\"string\"},{name:\"inverse\",type:\"string\"}]}});");
    }

    @Test
    public void test05122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05122");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});/");
        hasManyAssociation1.setAssociationKey("notBlank");
        java.lang.Boolean boolean4 = hasManyAssociation1.getAutoLoad();
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test05123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05123");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        modelBean0.setIdProperty("");
        boolean boolean5 = modelBean0.isDisablePagingParameters();
        modelBean0.setReader("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        java.lang.String[] strArray8 = modelBean0.getHasMany();
        java.lang.String str9 = modelBean0.getUpdateMethod();
        ch.rasc.extclassgenerator.PartialDataOptionsBean partialDataOptionsBean10 = modelBean0.getPartialDataOptions();
        java.util.List<ch.rasc.extclassgenerator.validation.AbstractValidation> abstractValidationList11 = modelBean0.getValidations();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(partialDataOptionsBean10);
        org.junit.Assert.assertNotNull(abstractValidationList11);
    }

    @Test
    public void test05124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05124");
        ch.rasc.extclassgenerator.ModelType modelType1 = null;
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("json", modelType1);
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean5 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean5.setConvert("hi!");
        ch.rasc.extclassgenerator.validation.CreditCardNumberValidation creditCardNumberValidation9 = new ch.rasc.extclassgenerator.validation.CreditCardNumberValidation("");
        ch.rasc.extclassgenerator.validation.FormatValidation formatValidation12 = new ch.rasc.extclassgenerator.validation.FormatValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        ch.rasc.extclassgenerator.validation.FutureValidation futureValidation14 = new ch.rasc.extclassgenerator.validation.FutureValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        ch.rasc.extclassgenerator.validation.FormatValidation formatValidation17 = new ch.rasc.extclassgenerator.validation.FormatValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        ch.rasc.extclassgenerator.validation.AbstractValidation[] abstractValidationArray18 = new ch.rasc.extclassgenerator.validation.AbstractValidation[] { creditCardNumberValidation9, formatValidation12, futureValidation14, formatValidation17 };
        java.util.ArrayList<ch.rasc.extclassgenerator.validation.AbstractValidation> abstractValidationList19 = new java.util.ArrayList<ch.rasc.extclassgenerator.validation.AbstractValidation>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<ch.rasc.extclassgenerator.validation.AbstractValidation>) abstractValidationList19, abstractValidationArray18);
        modelFieldBean5.setValidators((java.util.List<ch.rasc.extclassgenerator.validation.AbstractValidation>) abstractValidationList19);
        modelFieldBean2.setValidators((java.util.List<ch.rasc.extclassgenerator.validation.AbstractValidation>) abstractValidationList19);
        modelFieldBean2.setUnique((java.lang.Boolean) false);
        ch.rasc.extclassgenerator.validation.DigitsValidation digitsValidation28 = new ch.rasc.extclassgenerator.validation.DigitsValidation("/Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});/", (int) (byte) 1, (int) (byte) 100);
        int int29 = digitsValidation28.getInteger();
        modelFieldBean2.setReference((java.lang.Object) digitsValidation28);
        org.junit.Assert.assertNotNull(abstractValidationArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test05125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05125");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        modelBean0.setIdProperty("");
        boolean boolean5 = modelBean0.isDisablePagingParameters();
        modelBean0.setReader("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        java.lang.String[] strArray8 = modelBean0.getHasMany();
        java.util.List<ch.rasc.extclassgenerator.validation.AbstractValidation> abstractValidationList9 = modelBean0.getValidations();
        java.lang.String str10 = modelBean0.getName();
        java.util.Map<java.lang.String, ch.rasc.extclassgenerator.ModelFieldBean> strMap11 = modelBean0.getFields();
        modelBean0.setReader("Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
        java.lang.String str14 = modelBean0.getSuccessProperty();
        boolean boolean15 = modelBean0.isClientIdPropertyAddToWriter();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(abstractValidationList9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test05126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05126");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getRole();
        referenceBean0.setRole("/hasOne/");
        java.lang.String str5 = referenceBean0.getRole();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/hasOne/" + "'", str5, "/hasOne/");
    }

    @Test
    public void test05127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05127");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        referenceBean0.setInverse("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
        referenceBean0.setRole("digits");
        boolean boolean5 = referenceBean0.hasAnyProperties();
        java.lang.String str6 = referenceBean0.getType();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test05128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05128");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        java.util.List<java.lang.String> strList7 = modelFieldBean2.getDepends();
        modelFieldBean2.setConvert("/\\/exclusion\\//");
        org.junit.Assert.assertNull(strList7);
    }

    @Test
    public void test05129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05129");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        referenceBean0.setType("");
        java.lang.String str3 = referenceBean0.getAssociation();
        referenceBean0.setInverse("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        java.lang.String str6 = referenceBean0.getType();
        java.lang.String str7 = referenceBean0.getChild();
        referenceBean0.setChild("Ext.define(\"ch.rasc.extclassgenerator.association.HasOneAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"setterName\",\n    type : \"string\"\n  }, {\n    name : \"getterName\",\n    type : \"string\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test05130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05130");
        ch.rasc.extclassgenerator.validation.PresenceValidation presenceValidation1 = new ch.rasc.extclassgenerator.validation.PresenceValidation("Ext.define(\"Ext.define(\"null\",{extend:\"Ext.data.Model\",idProperty:\"hi!\",fields:[],proxy:{type:\"direct\",idParam:\"hi!\"}});\",{extend:\"/\\\\/Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\\\\//\",uses:[\"hi!\"],fields:[],hasMany:[\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\",\"json\",\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\",\"\"],associations:[{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],proxy:{type:\"direct\",directFn:hi!}});");
    }

    @Test
    public void test05131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05131");
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
        java.util.Set<java.lang.String> strSet16 = modelAnnotationProcessor0.getSupportedOptions();
        javax.lang.model.element.Element element17 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror18 = null;
        javax.lang.model.element.ExecutableElement executableElement19 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable21 = modelAnnotationProcessor0.getCompletions(element17, annotationMirror18, executableElement19, "Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[],proxy:{type:\"direct\",directFn:hi!,writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",config:{fields:[]}});\"}}}});");
        java.util.Set<java.lang.String> strSet22 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        java.util.Set<java.lang.String> strSet23 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertTrue("'" + sourceVersion2 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion2.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertTrue("'" + sourceVersion3 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion3.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(wildcardIterable9);
        org.junit.Assert.assertNotNull(wildcardIterable14);
        org.junit.Assert.assertTrue("'" + sourceVersion15 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion15.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(wildcardIterable21);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(strSet23);
    }

    @Test
    public void test05132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05132");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        modelFieldBean2.setMapping("hi!");
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        modelFieldBean2.setAllowBlank((java.lang.Boolean) false);
        modelFieldBean2.setConvert("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        java.lang.String str13 = modelFieldBean2.getDateFormat();
        java.lang.String str14 = modelFieldBean2.getMapping();
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test05133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05133");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        modelBean0.setIdProperty("");
        java.lang.String str5 = modelBean0.getIdentifier();
        modelBean0.setDisablePagingParameters(true);
        java.util.List<ch.rasc.extclassgenerator.validation.AbstractValidation> abstractValidationList8 = modelBean0.getValidations();
        modelBean0.setIdProperty("");
        java.lang.Class<?> wildcardClass11 = modelBean0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(abstractValidationList8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test05134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05134");
        ch.rasc.extclassgenerator.ModelType modelType1 = null;
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ {\n      name : \"debug\",\n      type : \"boolean\"\n    }, {\n      name : \"useSingleQuotes\",\n      type : \"boolean\"\n    }, {\n      name : \"surroundApiWithQuotes\",\n      type : \"boolean\"\n    } ]\n  }\n});", modelType1);
        modelFieldBean2.setCritical((java.lang.Boolean) false);
        java.lang.String str5 = modelFieldBean2.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ {\n      name : \"debug\",\n      type : \"boolean\"\n    }, {\n      name : \"useSingleQuotes\",\n      type : \"boolean\"\n    }, {\n      name : \"surroundApiWithQuotes\",\n      type : \"boolean\"\n    } ]\n  }\n});" + "'", str5, "Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ {\n      name : \"debug\",\n      type : \"boolean\"\n    }, {\n      name : \"useSingleQuotes\",\n      type : \"boolean\"\n    }, {\n      name : \"surroundApiWithQuotes\",\n      type : \"boolean\"\n    } ]\n  }\n});");
    }

    @Test
    public void test05135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05135");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        java.lang.String str2 = hasOneAssociation1.getName();
        hasOneAssociation1.setInstanceName("");
        java.lang.String str5 = hasOneAssociation1.getForeignKey();
        java.lang.String str6 = hasOneAssociation1.getGetterName();
        hasOneAssociation1.setAssociationKey("Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});");
        hasOneAssociation1.setGetterName("Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
        java.lang.String str11 = hasOneAssociation1.getName();
        hasOneAssociation1.setGetterName("Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"associated\",\n    type : \"boolean\"\n  }, {\n    name : \"changes\",\n    type : \"boolean\"\n  }, {\n    name : \"critical\",\n    type : \"boolean\"\n  }, {\n    name : \"persist\",\n    type : \"boolean\"\n  } ]\n});");
        java.lang.String str14 = hasOneAssociation1.getModel();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test05136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05136");
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation3 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.validation.PresenceValidation\",{extend:\"Ext.data.Model\",fields:[{name:\"type\",type:\"string\"},{name:\"field\",type:\"string\"}]});", (java.lang.Long) 0L, (java.lang.Long) 10L);
        java.math.BigDecimal bigDecimal4 = rangeValidation3.getMin();
        java.lang.String str5 = rangeValidation3.getType();
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "range" + "'", str5, "range");
    }

    @Test
    public void test05137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05137");
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
        modelFieldBean2.setAllowBlank((java.lang.Boolean) false);
        modelFieldBean2.setAllowBlank((java.lang.Boolean) true);
        java.lang.String str23 = modelFieldBean2.getName();
        modelFieldBean2.setAllowBlank((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(abstractValidationArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test05138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05138");
        ch.rasc.extclassgenerator.PartialDataOptionsBean partialDataOptionsBean0 = new ch.rasc.extclassgenerator.PartialDataOptionsBean();
        java.lang.Boolean boolean1 = partialDataOptionsBean0.getChanges();
        java.lang.Boolean boolean2 = partialDataOptionsBean0.getCritical();
        partialDataOptionsBean0.setCritical((java.lang.Boolean) true);
        partialDataOptionsBean0.setAssociated((java.lang.Boolean) true);
        boolean boolean7 = partialDataOptionsBean0.hasAnyProperties();
        java.lang.Boolean boolean8 = partialDataOptionsBean0.getPersist();
        partialDataOptionsBean0.setAssociated((java.lang.Boolean) true);
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(boolean8);
    }

    @Test
    public void test05139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05139");
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
        java.lang.String str15 = apiObject0.create;
        apiObject0.update = "/Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});/";
        apiObject0.update = "creditCardNumber";
        apiObject0.create = "ch.rasc.extclassgenerator.ModelAnnotationProcessor";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "json" + "'", str10, "json");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/" + "'", str12, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});" + "'", str15, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
    }

    @Test
    public void test05140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05140");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        referenceBean0.setType("");
        referenceBean0.setChild("");
        referenceBean0.setParent("");
        boolean boolean7 = referenceBean0.hasAnyProperties();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test05141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05141");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray10 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList8);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray11 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("", (java.util.List<java.lang.String>) strList8);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray12 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("json", (java.util.List<java.lang.String>) strList8);
        java.util.List<java.lang.String> strList13 = exclusionValidationArray12.getList();
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray14 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", strList13);
        java.lang.String str15 = inclusionValidationArray14.getField();
        java.util.List<java.lang.String> strList16 = inclusionValidationArray14.getList();
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray17 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", strList16);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str15, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test05142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05142");
        ch.rasc.extclassgenerator.ModelAnnotationProcessor modelAnnotationProcessor0 = new ch.rasc.extclassgenerator.ModelAnnotationProcessor();
        java.util.Set<java.lang.String> strSet1 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        javax.lang.model.SourceVersion sourceVersion2 = modelAnnotationProcessor0.getSupportedSourceVersion();
        javax.lang.model.SourceVersion sourceVersion3 = modelAnnotationProcessor0.getSupportedSourceVersion();
        javax.lang.model.element.Element element4 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror5 = null;
        javax.lang.model.element.ExecutableElement executableElement6 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable8 = modelAnnotationProcessor0.getCompletions(element4, annotationMirror5, executableElement6, "json");
        javax.lang.model.SourceVersion sourceVersion9 = modelAnnotationProcessor0.getSupportedSourceVersion();
        java.util.Set<java.lang.String> strSet10 = modelAnnotationProcessor0.getSupportedOptions();
        javax.lang.model.element.Element element11 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror12 = null;
        javax.lang.model.element.ExecutableElement executableElement13 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable15 = modelAnnotationProcessor0.getCompletions(element11, annotationMirror12, executableElement13, "ch.rasc.extclassgenerator.ModelBean");
        javax.lang.model.SourceVersion sourceVersion16 = modelAnnotationProcessor0.getSupportedSourceVersion();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertTrue("'" + sourceVersion2 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion2.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertTrue("'" + sourceVersion3 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion3.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(wildcardIterable8);
        org.junit.Assert.assertTrue("'" + sourceVersion9 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion9.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(wildcardIterable15);
        org.junit.Assert.assertTrue("'" + sourceVersion16 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion16.equals(javax.lang.model.SourceVersion.RELEASE_6));
    }

    @Test
    public void test05143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05143");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("");
        java.lang.String str2 = belongsToAssociation1.getInstanceName();
        java.lang.String str3 = belongsToAssociation1.getInstanceName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test05144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05144");
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
        java.lang.String str17 = hasManyAssociation8.getName();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test05145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05145");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        ch.rasc.extclassgenerator.validation.GenericValidation genericValidation3 = new ch.rasc.extclassgenerator.validation.GenericValidation("Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});", "Ext.define(\"ch.rasc.extclassgenerator.validation.InclusionValidationArray\",{extend:\"Ext.data.Model\",fields:[{name:\"type\",type:\"string\"},{name:\"field\",type:\"string\"}]});", strMap2);
    }

    @Test
    public void test05146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05146");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        modelFieldBean2.setCritical((java.lang.Boolean) false);
        modelFieldBean2.setDateFormat("inclusion");
    }

    @Test
    public void test05147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05147");
        ch.rasc.extclassgenerator.validation.FormatValidation formatValidation2 = new ch.rasc.extclassgenerator.validation.FormatValidation("Ext.define(\"ch.rasc.extclassgenerator.validation.PastValidation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"field\",\n    type : \"string\"\n  } ]\n});", "Ext.define('ch.rasc.extclassgenerator.ModelAnnotationProcessor',{extend:'Ext.data.Model',fields:[]});");
    }

    @Test
    public void test05148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05148");
        ch.rasc.extclassgenerator.OutputConfig outputConfig0 = new ch.rasc.extclassgenerator.OutputConfig();
        boolean boolean1 = outputConfig0.isSurroundApiWithQuotes();
        boolean boolean2 = outputConfig0.isDebug();
        ch.rasc.extclassgenerator.ModelAnnotationProcessor modelAnnotationProcessor3 = new ch.rasc.extclassgenerator.ModelAnnotationProcessor();
        java.util.Set<java.lang.String> strSet4 = modelAnnotationProcessor3.getSupportedAnnotationTypes();
        boolean boolean5 = outputConfig0.equals((java.lang.Object) strSet4);
        boolean boolean6 = outputConfig0.isSurroundApiWithQuotes();
        ch.rasc.extclassgenerator.IncludeValidation includeValidation7 = outputConfig0.getIncludeValidation();
        boolean boolean8 = outputConfig0.isDebug();
        outputConfig0.setUseSingleQuotes(false);
        outputConfig0.setDebug(false);
        ch.rasc.extclassgenerator.IncludeValidation includeValidation13 = ch.rasc.extclassgenerator.IncludeValidation.BUILTIN;
        outputConfig0.setIncludeValidation(includeValidation13);
        ch.rasc.extclassgenerator.LineEnding lineEnding15 = outputConfig0.getLineEnding();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(includeValidation7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + includeValidation13 + "' != '" + ch.rasc.extclassgenerator.IncludeValidation.BUILTIN + "'", includeValidation13.equals(ch.rasc.extclassgenerator.IncludeValidation.BUILTIN));
        org.junit.Assert.assertNull(lineEnding15);
    }

    @Test
    public void test05149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05149");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        java.lang.String str3 = modelBean0.getIdProperty();
        modelBean0.setTotalProperty("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean8 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.Object obj9 = modelFieldBean8.getDefaultValue();
        java.lang.Object obj10 = modelFieldBean8.getDefaultValue();
        modelBean0.addField(modelFieldBean8);
        java.util.Map<java.lang.String, ch.rasc.extclassgenerator.ModelFieldBean> strMap12 = modelBean0.getFields();
        boolean boolean13 = modelBean0.isAutodetectTypes();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test05150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05150");
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
        modelFieldBean2.setAllowBlank((java.lang.Boolean) true);
        java.lang.Boolean boolean27 = modelFieldBean2.getUnique();
        java.lang.String str28 = modelFieldBean2.getMapping();
        modelFieldBean2.setAllowBlank((java.lang.Boolean) true);
        java.util.List<ch.rasc.extclassgenerator.validation.AbstractValidation> abstractValidationList31 = modelFieldBean2.getValidators();
        java.lang.Boolean boolean32 = modelFieldBean2.getAllowBlank();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(boolean27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(abstractValidationList31);
        org.junit.Assert.assertEquals("'" + boolean32 + "' != '" + true + "'", boolean32, true);
    }

    @Test
    public void test05151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05151");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("format");
        hasOneAssociation1.setAssociationKey("Ext.define(\"null\",\r\n{\n  extend : \"\",\n  fields : [ ],\n  validations : [ {\n    type : \"range\",\n    field : \"/Ext.define(\\\"ch.rasc.extclassgenerator.association.HasManyAssociation\\\",{extend:\\\"Ext.data.Model\\\",fields:[{name:\\\"autoLoad\\\",type:\\\"boolean\\\"},{name:\\\"name\\\",type:\\\"string\\\"},{name:\\\"type\\\",type:\\\"string\\\"},{name:\\\"model\\\",type:\\\"string\\\"},{name:\\\"associationKey\\\",type:\\\"string\\\"},{name:\\\"foreignKey\\\",type:\\\"string\\\"},{name:\\\"primaryKey\\\",type:\\\"string\\\"},{name:\\\"instanceName\\\",type:\\\"string\\\"}]});/\",\n    min : 0,\n    max : 0\n  } ]\n});");
    }

    @Test
    public void test05152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05152");
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
        modelFieldBean2.setPersist((java.lang.Boolean) true);
        java.lang.String str30 = modelFieldBean2.getName();
        java.util.List<ch.rasc.extclassgenerator.validation.AbstractValidation> abstractValidationList31 = modelFieldBean2.getValidators();
        modelFieldBean2.setPersist((java.lang.Boolean) false);
        modelFieldBean2.setPersist((java.lang.Boolean) true);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(boolean25);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNull(abstractValidationList31);
    }

    @Test
    public void test05153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05153");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("hi!");
        hasManyAssociation1.setAssociationKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str4 = hasManyAssociation1.getInstanceName();
        hasManyAssociation1.setName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        hasManyAssociation1.setPrimaryKey("");
        java.lang.String str9 = hasManyAssociation1.getName();
        hasManyAssociation1.setForeignKey("range");
        java.lang.String str12 = hasManyAssociation1.getPrimaryKey();
        hasManyAssociation1.setPrimaryKey("/Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});/");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str9, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test05154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05154");
        ch.rasc.extclassgenerator.validation.InclusionValidation inclusionValidation2 = new ch.rasc.extclassgenerator.validation.InclusionValidation("ch.rasc.extclassgenerator.ModelBean", "Ext.define(\"null\",{extend:\"\",config:{fields:[]}});");
        java.lang.String str3 = inclusionValidation2.getList();
        java.lang.String str4 = inclusionValidation2.getType();
        java.lang.String str5 = inclusionValidation2.getField();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"null\",{extend:\"\",config:{fields:[]}});" + "'", str3, "Ext.define(\"null\",{extend:\"\",config:{fields:[]}});");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "inclusion" + "'", str4, "inclusion");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ch.rasc.extclassgenerator.ModelBean" + "'", str5, "ch.rasc.extclassgenerator.ModelBean");
    }

    @Test
    public void test05155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05155");
        ch.rasc.extclassgenerator.ModelAnnotationProcessor modelAnnotationProcessor0 = new ch.rasc.extclassgenerator.ModelAnnotationProcessor();
        java.util.Set<java.lang.String> strSet1 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        java.util.Set<java.lang.String> strSet2 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        javax.lang.model.SourceVersion sourceVersion3 = modelAnnotationProcessor0.getSupportedSourceVersion();
        java.util.Set<java.lang.String> strSet4 = modelAnnotationProcessor0.getSupportedOptions();
        javax.lang.model.element.Element element5 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror6 = null;
        javax.lang.model.element.ExecutableElement executableElement7 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable9 = modelAnnotationProcessor0.getCompletions(element5, annotationMirror6, executableElement7, "range");
        javax.lang.model.element.Element element10 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror11 = null;
        javax.lang.model.element.ExecutableElement executableElement12 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable14 = modelAnnotationProcessor0.getCompletions(element10, annotationMirror11, executableElement12, "Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"debug\",\n    type : \"boolean\"\n  }, {\n    name : \"useSingleQuotes\",\n    type : \"boolean\"\n  }, {\n    name : \"surroundApiWithQuotes\",\n    type : \"boolean\"\n  } ]\n});");
        java.util.Set<java.lang.String> strSet15 = modelAnnotationProcessor0.getSupportedOptions();
        javax.lang.model.SourceVersion sourceVersion16 = modelAnnotationProcessor0.getSupportedSourceVersion();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + sourceVersion3 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion3.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(wildcardIterable9);
        org.junit.Assert.assertNotNull(wildcardIterable14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertTrue("'" + sourceVersion16 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion16.equals(javax.lang.model.SourceVersion.RELEASE_6));
    }

    @Test
    public void test05156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05156");
        ch.rasc.extclassgenerator.OutputConfig outputConfig0 = new ch.rasc.extclassgenerator.OutputConfig();
        boolean boolean1 = outputConfig0.isDebug();
        ch.rasc.extclassgenerator.OutputFormat outputFormat2 = outputConfig0.getOutputFormat();
        boolean boolean3 = outputConfig0.isSurroundApiWithQuotes();
        ch.rasc.extclassgenerator.IncludeValidation includeValidation4 = null;
        outputConfig0.setIncludeValidation(includeValidation4);
        ch.rasc.extclassgenerator.OutputFormat outputFormat6 = outputConfig0.getOutputFormat();
        boolean boolean7 = outputConfig0.isSurroundApiWithQuotes();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(outputFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(outputFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test05157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05157");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        referenceBean0.setType("");
        java.lang.String str3 = referenceBean0.getAssociation();
        referenceBean0.setInverse("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        java.lang.String str6 = referenceBean0.getInverse();
        referenceBean0.setChild("hi!");
        referenceBean0.setRole("Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",{extend:\"Ext.data.Model\",fields:[{name:\"debug\",type:\"boolean\"},{name:\"useSingleQuotes\",type:\"boolean\"},{name:\"surroundApiWithQuotes\",type:\"boolean\"}]});");
        boolean boolean11 = referenceBean0.hasAnyProperties();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});" + "'", str6, "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test05158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05158");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getInverse();
        java.lang.String str3 = referenceBean0.getInverse();
        referenceBean0.setAssociation("/\\/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});\\//");
        referenceBean0.setType("");
        java.lang.String str8 = referenceBean0.getType();
        referenceBean0.setParent("Ext.define(\"ch.rasc.extclassgenerator.validation.PresenceValidation\",{extend:\"Ext.data.Model\",fields:[{name:\"type\",type:\"string\"},{name:\"field\",type:\"string\"}]});");
        referenceBean0.setAssociation("format");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test05159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05159");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        modelBean0.setIdProperty("");
        boolean boolean5 = modelBean0.isDisablePagingParameters();
        modelBean0.setExtend("");
        ch.rasc.extclassgenerator.PartialDataOptionsBean partialDataOptionsBean8 = modelBean0.getPartialDataOptions();
        modelBean0.setMessageProperty("hi!");
        modelBean0.setWriteAllFields((java.lang.Boolean) false);
        modelBean0.setWriter("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});/");
        modelBean0.setVersionProperty("Ext.define(\"null\",{extend:\"Ext.data.Model\",idProperty:\"hi!\",fields:[],proxy:{type:\"direct\",idParam:\"hi!\"}});");
        modelBean0.setClientIdPropertyAddToWriter(false);
        java.lang.String str19 = modelBean0.getCreateMethod();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(partialDataOptionsBean8);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test05160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05160");
        ch.rasc.extclassgenerator.validation.CreditCardNumberValidation creditCardNumberValidation1 = new ch.rasc.extclassgenerator.validation.CreditCardNumberValidation("Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[],proxy:{type:\"direct\",directFn:hi!}});");
        java.lang.String str2 = creditCardNumberValidation1.getType();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "creditCardNumber" + "'", str2, "creditCardNumber");
    }

    @Test
    public void test05161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05161");
        ch.rasc.extclassgenerator.validation.EmailValidation emailValidation1 = new ch.rasc.extclassgenerator.validation.EmailValidation("Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"debug\",type:\"boolean\"},{name:\"useSingleQuotes\",type:\"boolean\"},{name:\"surroundApiWithQuotes\",type:\"boolean\"}]}});");
    }

    @Test
    public void test05162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05162");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.Object obj3 = modelFieldBean2.getDefaultValue();
        java.lang.Object obj4 = modelFieldBean2.getDefaultValue();
        java.lang.String str5 = modelFieldBean2.getCalculate();
        modelFieldBean2.setMapping("ch.rasc.extclassgenerator.OutputConfig");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test05163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05163");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("Ext.define(\"ch.rasc.extclassgenerator.association.BelongsToAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ {\n      name : \"setterName\",\n      type : \"string\"\n    }, {\n      name : \"getterName\",\n      type : \"string\"\n    }, {\n      name : \"type\",\n      type : \"string\"\n    }, {\n      name : \"model\",\n      type : \"string\"\n    }, {\n      name : \"associationKey\",\n      type : \"string\"\n    }, {\n      name : \"foreignKey\",\n      type : \"string\"\n    }, {\n      name : \"primaryKey\",\n      type : \"string\"\n    }, {\n      name : \"instanceName\",\n      type : \"string\"\n    } ]\n  }\n});", "");
    }

    @Test
    public void test05164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05164");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        java.lang.String str6 = modelFieldBean2.getMapping();
        modelFieldBean2.setCritical((java.lang.Boolean) true);
        java.lang.String str9 = modelFieldBean2.getName();
        java.util.List<java.lang.String> strList10 = modelFieldBean2.getDepends();
        java.lang.Boolean boolean11 = modelFieldBean2.getPersist();
        java.util.List<ch.rasc.extclassgenerator.validation.AbstractValidation> abstractValidationList12 = modelFieldBean2.getValidators();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(strList10);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(abstractValidationList12);
    }

    @Test
    public void test05165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05165");
        ch.rasc.extclassgenerator.validation.ExclusionValidation exclusionValidation2 = new ch.rasc.extclassgenerator.validation.ExclusionValidation("ch.rasc.extclassgenerator.PartialDataOptionsBean", "Ext.define('Ext.define('ch.rasc.extclassgenerator.association.HasManyAssociation',\n{\n  extend : 'Ext.data.Model',\n  fields : [ {\n    name : 'autoLoad',\n    type : 'boolean'\n  }, {\n    name : 'name',\n    type : 'string'\n  }, {\n    name : 'type',\n    type : 'string'\n  }, {\n    name : 'model',\n    type : 'string'\n  }, {\n    name : 'associationKey',\n    type : 'string'\n  }, {\n    name : 'foreignKey',\n    type : 'string'\n  }, {\n    name : 'primaryKey',\n    type : 'string'\n  }, {\n    name : 'instanceName',\n    type : 'string'\n  } ]\n});',{extend:'',uses:['hi!'],fields:[],associations:[{type:'hasMany',model:'hi!'},{type:'hasMany',model:'hi!',associationKey:'Ext.define(\\'ch.rasc.extclassgenerator.ModelAnnotationProcessor\\',{extend:\\'Ext.data.Model\\',fields:[]});'},{type:'hasMany',model:'hi!',associationKey:'Ext.define(\\'ch.rasc.extclassgenerator.ModelAnnotationProcessor\\',{extend:\\'Ext.data.Model\\',fields:[]});'},{type:'hasMany',model:'hi!',foreignKey:''}]});");
        java.lang.String str3 = exclusionValidation2.getList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define('Ext.define('ch.rasc.extclassgenerator.association.HasManyAssociation',\n{\n  extend : 'Ext.data.Model',\n  fields : [ {\n    name : 'autoLoad',\n    type : 'boolean'\n  }, {\n    name : 'name',\n    type : 'string'\n  }, {\n    name : 'type',\n    type : 'string'\n  }, {\n    name : 'model',\n    type : 'string'\n  }, {\n    name : 'associationKey',\n    type : 'string'\n  }, {\n    name : 'foreignKey',\n    type : 'string'\n  }, {\n    name : 'primaryKey',\n    type : 'string'\n  }, {\n    name : 'instanceName',\n    type : 'string'\n  } ]\n});',{extend:'',uses:['hi!'],fields:[],associations:[{type:'hasMany',model:'hi!'},{type:'hasMany',model:'hi!',associationKey:'Ext.define(\\'ch.rasc.extclassgenerator.ModelAnnotationProcessor\\',{extend:\\'Ext.data.Model\\',fields:[]});'},{type:'hasMany',model:'hi!',associationKey:'Ext.define(\\'ch.rasc.extclassgenerator.ModelAnnotationProcessor\\',{extend:\\'Ext.data.Model\\',fields:[]});'},{type:'hasMany',model:'hi!',foreignKey:''}]});" + "'", str3, "Ext.define('Ext.define('ch.rasc.extclassgenerator.association.HasManyAssociation',\n{\n  extend : 'Ext.data.Model',\n  fields : [ {\n    name : 'autoLoad',\n    type : 'boolean'\n  }, {\n    name : 'name',\n    type : 'string'\n  }, {\n    name : 'type',\n    type : 'string'\n  }, {\n    name : 'model',\n    type : 'string'\n  }, {\n    name : 'associationKey',\n    type : 'string'\n  }, {\n    name : 'foreignKey',\n    type : 'string'\n  }, {\n    name : 'primaryKey',\n    type : 'string'\n  }, {\n    name : 'instanceName',\n    type : 'string'\n  } ]\n});',{extend:'',uses:['hi!'],fields:[],associations:[{type:'hasMany',model:'hi!'},{type:'hasMany',model:'hi!',associationKey:'Ext.define(\\'ch.rasc.extclassgenerator.ModelAnnotationProcessor\\',{extend:\\'Ext.data.Model\\',fields:[]});'},{type:'hasMany',model:'hi!',associationKey:'Ext.define(\\'ch.rasc.extclassgenerator.ModelAnnotationProcessor\\',{extend:\\'Ext.data.Model\\',fields:[]});'},{type:'hasMany',model:'hi!',foreignKey:''}]});");
    }

    @Test
    public void test05166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05166");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("hi!");
        hasManyAssociation1.setForeignKey("");
        java.lang.String str4 = hasManyAssociation1.getForeignKey();
        hasManyAssociation1.setAutoLoad((java.lang.Boolean) true);
        java.lang.String str7 = hasManyAssociation1.getName();
        hasManyAssociation1.setInstanceName("");
        java.lang.Boolean boolean10 = hasManyAssociation1.getAutoLoad();
        java.lang.String str11 = hasManyAssociation1.getForeignKey();
        hasManyAssociation1.setName("ch.rasc.extclassgenerator.OutputConfig");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test05167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05167");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.String str5 = modelFieldBean2.getName();
        modelFieldBean2.setMapping("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setMapping("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        modelFieldBean2.setMapping("Ext.define(\"ch.rasc.extclassgenerator.validation.PastValidation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"field\",\n    type : \"string\"\n  } ]\n});");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test05168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05168");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        java.lang.String str6 = modelFieldBean2.getMapping();
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray14 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList12);
        java.util.List<java.lang.String> strList15 = inclusionValidationArray14.getList();
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray16 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", strList15);
        modelFieldBean2.setDepends(strList15);
        java.lang.String str18 = modelFieldBean2.getConvert();
        modelFieldBean2.setUseNull((java.lang.Boolean) false);
        java.lang.Boolean boolean21 = modelFieldBean2.getAllowBlank();
        modelFieldBean2.setMapping("/Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"debug\",type:\"boolean\"},{name:\"useSingleQuotes\",type:\"boolean\"},{name:\"surroundApiWithQuotes\",type:\"boolean\"}]}});/");
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(boolean21);
    }

    @Test
    public void test05169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05169");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        java.lang.String str10 = referenceBean0.getType();
        java.lang.String str11 = referenceBean0.getParent();
        referenceBean0.setChild("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});/");
        java.lang.String str14 = referenceBean0.getInverse();
        java.lang.String str15 = referenceBean0.getInverse();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test05170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05170");
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation3 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"null\",{extend:\"\",config:{fields:[]}});", (java.lang.Long) 97L, (java.lang.Long) 97L);
        java.math.BigDecimal bigDecimal4 = rangeValidation3.getMax();
        java.math.BigDecimal bigDecimal5 = rangeValidation3.getMin();
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
    }

    @Test
    public void test05171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05171");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        java.lang.String str2 = hasOneAssociation1.getName();
        hasOneAssociation1.setInstanceName("");
        java.lang.String str5 = hasOneAssociation1.getForeignKey();
        java.lang.String str6 = hasOneAssociation1.getGetterName();
        hasOneAssociation1.setAssociationKey("Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});");
        hasOneAssociation1.setGetterName("Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
        hasOneAssociation1.setForeignKey("/\\/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});\\//");
        hasOneAssociation1.setInstanceName("Ext.define(\"null\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ],\n  proxy : {\n    type : \"direct\",\n    reader : {\n      totalProperty : \"/Ext.define(\\\"ch.rasc.extclassgenerator.association.HasManyAssociation\\\",{extend:\\\"Ext.data.Model\\\",fields:[{name:\\\"autoLoad\\\",type:\\\"boolean\\\"},{name:\\\"name\\\",type:\\\"string\\\"},{name:\\\"type\\\",type:\\\"string\\\"},{name:\\\"model\\\",type:\\\"string\\\"},{name:\\\"associationKey\\\",type:\\\"string\\\"},{name:\\\"foreignKey\\\",type:\\\"string\\\"},{name:\\\"primaryKey\\\",type:\\\"string\\\"},{name:\\\"instanceName\\\",type:\\\"string\\\"}]});/\"\n    }\n  }\n});");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test05172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05172");
        ch.rasc.extclassgenerator.ModelAnnotationProcessor modelAnnotationProcessor0 = new ch.rasc.extclassgenerator.ModelAnnotationProcessor();
        java.util.Set<java.lang.String> strSet1 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        java.util.Set<java.lang.String> strSet2 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        javax.lang.model.SourceVersion sourceVersion3 = modelAnnotationProcessor0.getSupportedSourceVersion();
        java.util.Set<java.lang.String> strSet4 = modelAnnotationProcessor0.getSupportedOptions();
        javax.lang.model.element.Element element5 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror6 = null;
        javax.lang.model.element.ExecutableElement executableElement7 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable9 = modelAnnotationProcessor0.getCompletions(element5, annotationMirror6, executableElement7, "range");
        java.util.Set<java.lang.String> strSet10 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        java.util.Set<java.lang.String> strSet11 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        javax.lang.model.element.Element element12 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror13 = null;
        javax.lang.model.element.ExecutableElement executableElement14 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable16 = modelAnnotationProcessor0.getCompletions(element12, annotationMirror13, executableElement14, "ch.rasc.extclassgenerator.ModelBean");
        java.util.Set<java.lang.String> strSet17 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        javax.annotation.processing.ProcessingEnvironment processingEnvironment18 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelAnnotationProcessor0.init(processingEnvironment18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Tool provided null ProcessingEnvironment");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + sourceVersion3 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion3.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(wildcardIterable9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(wildcardIterable16);
        org.junit.Assert.assertNotNull(strSet17);
    }

    @Test
    public void test05173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05173");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("exclusion");
        java.lang.String str2 = hasOneAssociation1.getPrimaryKey();
        hasOneAssociation1.setName("/range/");
        hasOneAssociation1.setInstanceName("/Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});/");
        hasOneAssociation1.setSetterName("Ext.define(\"null\",\r\n{\n  extend : \"Ext.data.Model\",\n  idgen : \"Ext.define(\\\"null\\\",{extend:\\\"Ext.data.Model\\\",config:{fields:[],proxy:{type:\\\"direct\\\",directFn:hi!,writer:{type:\\\"Ext.define(\\\\\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\\\\\",{extend:\\\\\\\"Ext.data.Model\\\\\\\",config:{fields:[]}});\\\"}}}});\",\n  fields : [ ]\n});");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test05174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05174");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean4 = allDataOptionsBean0.getPersist();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean7 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean8 = allDataOptionsBean0.getPersist();
        allDataOptionsBean0.setPersist((java.lang.Boolean) true);
        java.lang.Boolean boolean11 = allDataOptionsBean0.getPersist();
        java.lang.Boolean boolean12 = allDataOptionsBean0.getAssociated();
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + false + "'", boolean7, false);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + false + "'", boolean12, false);
    }

    @Test
    public void test05175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05175");
        ch.rasc.extclassgenerator.validation.InclusionValidation inclusionValidation2 = new ch.rasc.extclassgenerator.validation.InclusionValidation("", "exclusion");
        java.lang.String str3 = inclusionValidation2.getList();
        java.lang.String str4 = inclusionValidation2.getList();
        java.lang.String str5 = inclusionValidation2.getList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "exclusion" + "'", str3, "exclusion");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "exclusion" + "'", str4, "exclusion");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "exclusion" + "'", str5, "exclusion");
    }

    @Test
    public void test05176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05176");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getChild();
        java.lang.String str2 = referenceBean0.getInverse();
        referenceBean0.setParent("");
        boolean boolean5 = referenceBean0.hasAnyProperties();
        referenceBean0.setChild("Ext.define(\"ch.rasc.extclassgenerator.association.HasOneAssociation\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"setterName\",type:\"string\"},{name:\"getterName\",type:\"string\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]}});");
        referenceBean0.setRole("creditCardNumber");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test05177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05177");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hasOne", "hi!");
        java.util.List<java.lang.String> strList3 = modelFieldBean2.getDepends();
        java.lang.Boolean boolean4 = modelFieldBean2.getPersist();
        java.lang.String str5 = modelFieldBean2.getCalculate();
        java.lang.Boolean boolean6 = modelFieldBean2.getAllowNull();
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(boolean6);
    }

    @Test
    public void test05178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05178");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.update = "exclusion";
        java.lang.String str8 = apiObject0.destroy;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.LineEnding\",{extend:\"Ext.data.Model\",config:{fields:[]}});";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test05179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05179");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});";
        apiObject0.destroy = "belongsTo";
        java.lang.String str8 = apiObject0.update;
        apiObject0.read = "future";
        apiObject0.destroy = "//";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str8, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
    }

    @Test
    public void test05180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05180");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        java.lang.String str2 = hasOneAssociation1.getName();
        hasOneAssociation1.setInstanceName("");
        hasOneAssociation1.setName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str7 = hasOneAssociation1.getForeignKey();
        java.lang.String str8 = hasOneAssociation1.getAssociationKey();
        hasOneAssociation1.setSetterName("Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[],proxy:{type:\"direct\",directFn:hi!,writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",config:{fields:[]}});\"}}}});");
        hasOneAssociation1.setName("Ext.define(\"null\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ],\n  proxy : {\n    type : \"direct\",\n    reader : {\n      totalProperty : \"/Ext.define(\\\"ch.rasc.extclassgenerator.association.HasManyAssociation\\\",{extend:\\\"Ext.data.Model\\\",fields:[{name:\\\"autoLoad\\\",type:\\\"boolean\\\"},{name:\\\"name\\\",type:\\\"string\\\"},{name:\\\"type\\\",type:\\\"string\\\"},{name:\\\"model\\\",type:\\\"string\\\"},{name:\\\"associationKey\\\",type:\\\"string\\\"},{name:\\\"foreignKey\\\",type:\\\"string\\\"},{name:\\\"primaryKey\\\",type:\\\"string\\\"},{name:\\\"instanceName\\\",type:\\\"string\\\"}]});/\"\n    }\n  }\n});");
        hasOneAssociation1.setName("presence");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test05181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05181");
        ch.rasc.extclassgenerator.validation.FutureValidation futureValidation1 = new ch.rasc.extclassgenerator.validation.FutureValidation("Ext.define(\"null\",\r\n{\n  extend : \"\",\n  fields : [ ],\n  validations : [ {\n    type : \"range\",\n    field : \"/Ext.define(\\\"ch.rasc.extclassgenerator.association.HasManyAssociation\\\",{extend:\\\"Ext.data.Model\\\",fields:[{name:\\\"autoLoad\\\",type:\\\"boolean\\\"},{name:\\\"name\\\",type:\\\"string\\\"},{name:\\\"type\\\",type:\\\"string\\\"},{name:\\\"model\\\",type:\\\"string\\\"},{name:\\\"associationKey\\\",type:\\\"string\\\"},{name:\\\"foreignKey\\\",type:\\\"string\\\"},{name:\\\"primaryKey\\\",type:\\\"string\\\"},{name:\\\"instanceName\\\",type:\\\"string\\\"}]});/\",\n    min : 0,\n    max : 0\n  } ]\n});");
    }

    @Test
    public void test05182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05182");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        java.lang.String str10 = referenceBean0.getType();
        java.lang.String str11 = referenceBean0.getParent();
        referenceBean0.setChild("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});/");
        referenceBean0.setAssociation("");
        referenceBean0.setRole("/range/");
        java.lang.String str18 = referenceBean0.getChild();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});/" + "'", str18, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});/");
    }

    @Test
    public void test05183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05183");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean4 = allDataOptionsBean0.getCritical();
        allDataOptionsBean0.setCritical((java.lang.Boolean) true);
        boolean boolean7 = allDataOptionsBean0.hasAnyProperties();
        allDataOptionsBean0.setPersist((java.lang.Boolean) false);
        allDataOptionsBean0.setCritical((java.lang.Boolean) true);
        boolean boolean12 = allDataOptionsBean0.hasAnyProperties();
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test05184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05184");
        ch.rasc.extclassgenerator.validation.ExclusionValidation exclusionValidation2 = new ch.rasc.extclassgenerator.validation.ExclusionValidation("Ext.define(\"ch.rasc.extclassgenerator.validation.PresenceValidation\",{extend:\"Ext.data.Model\",fields:[{name:\"type\",type:\"string\"},{name:\"field\",type:\"string\"}]});", "range");
        java.lang.String str3 = exclusionValidation2.getField();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.validation.PresenceValidation\",{extend:\"Ext.data.Model\",fields:[{name:\"type\",type:\"string\"},{name:\"field\",type:\"string\"}]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.validation.PresenceValidation\",{extend:\"Ext.data.Model\",fields:[{name:\"type\",type:\"string\"},{name:\"field\",type:\"string\"}]});");
    }

    @Test
    public void test05185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05185");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean4 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean4.setConvert("hi!");
        java.lang.Object obj7 = modelFieldBean4.getReference();
        java.lang.String str8 = modelFieldBean4.getName();
        ch.rasc.extclassgenerator.OutputConfig outputConfig9 = new ch.rasc.extclassgenerator.OutputConfig();
        boolean boolean10 = outputConfig9.isSurroundApiWithQuotes();
        boolean boolean11 = outputConfig9.isSurroundApiWithQuotes();
        boolean boolean12 = modelFieldBean4.hasOnlyName(outputConfig9);
        java.lang.String str13 = modelFieldBean4.getDateFormat();
        java.lang.Boolean boolean14 = modelFieldBean4.getAllowNull();
        java.lang.Object obj15 = modelFieldBean4.getReference();
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray24 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList22);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray25 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("", (java.util.List<java.lang.String>) strList22);
        java.util.List<java.lang.String> strList26 = exclusionValidationArray25.getList();
        java.util.List<java.lang.String> strList27 = exclusionValidationArray25.getList();
        java.util.List<java.lang.String> strList28 = exclusionValidationArray25.getList();
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray29 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("json", strList28);
        modelFieldBean4.setDepends(strList28);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray31 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("Ext.define(\"ch.rasc.extclassgenerator.validation.PresenceValidation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"field\",\n    type : \"string\"\n  } ]\n});", strList28);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray32 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("ch.rasc.extclassgenerator.ModelAnnotationProcessor", strList28);
        java.util.List<java.lang.String> strList33 = exclusionValidationArray32.getList();
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNotNull(strList33);
    }

    @Test
    public void test05186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05186");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("", "/Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});/");
        java.lang.Boolean boolean3 = modelFieldBean2.getAllowBlank();
        org.junit.Assert.assertNull(boolean3);
    }

    @Test
    public void test05187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05187");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getChild();
        boolean boolean2 = referenceBean0.typeOnly();
        java.lang.String str3 = referenceBean0.getInverse();
        referenceBean0.setInverse("");
        referenceBean0.setType("Ext.define(\"java.util.ArrayList\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test05188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05188");
        ch.rasc.extclassgenerator.validation.ExclusionValidation exclusionValidation2 = new ch.rasc.extclassgenerator.validation.ExclusionValidation("Ext.define(\"null\",\r\n{\n  extend : \"Ext.data.Model\",\n  idgen : \"Ext.define(\\\"null\\\",{extend:\\\"Ext.data.Model\\\",config:{fields:[],proxy:{type:\\\"direct\\\",directFn:hi!,writer:{type:\\\"Ext.define(\\\\\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\\\\\",{extend:\\\\\\\"Ext.data.Model\\\\\\\",config:{fields:[]}});\\\"}}}});\",\n  fields : [ ]\n});", "hi!");
    }

    @Test
    public void test05189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05189");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("hi!");
        hasManyAssociation1.setAssociationKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str4 = hasManyAssociation1.getInstanceName();
        hasManyAssociation1.setName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        hasManyAssociation1.setPrimaryKey("");
        java.lang.Boolean boolean9 = hasManyAssociation1.getAutoLoad();
        hasManyAssociation1.setPrimaryKey("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        hasManyAssociation1.setName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
        hasManyAssociation1.setAssociationKey("/Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});/");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void test05190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05190");
        ch.rasc.extclassgenerator.validation.CreditCardNumberValidation creditCardNumberValidation1 = new ch.rasc.extclassgenerator.validation.CreditCardNumberValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});");
        java.lang.String str2 = creditCardNumberValidation1.getType();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "creditCardNumber" + "'", str2, "creditCardNumber");
    }

    @Test
    public void test05191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05191");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("Ext.define(\"ch.rasc.extclassgenerator.ReferenceBean\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"type\",type:\"string\"},{name:\"association\",type:\"string\"},{name:\"child\",type:\"string\"},{name:\"parent\",type:\"string\"},{name:\"role\",type:\"string\"},{name:\"inverse\",type:\"string\"}]}});", (java.lang.Integer) 32, (java.lang.Integer) (-1));
    }

    @Test
    public void test05192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05192");
        ch.rasc.extclassgenerator.OutputConfig outputConfig0 = new ch.rasc.extclassgenerator.OutputConfig();
        boolean boolean1 = outputConfig0.isDebug();
        ch.rasc.extclassgenerator.OutputFormat outputFormat2 = outputConfig0.getOutputFormat();
        boolean boolean3 = outputConfig0.isDebug();
        boolean boolean4 = outputConfig0.isUseSingleQuotes();
        boolean boolean5 = outputConfig0.isDebug();
        ch.rasc.extclassgenerator.OutputFormat outputFormat6 = outputConfig0.getOutputFormat();
        boolean boolean7 = outputConfig0.isDebug();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(outputFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(outputFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test05193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05193");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        java.lang.String str6 = modelFieldBean2.getMapping();
        java.lang.Object obj7 = modelFieldBean2.getReference();
        modelFieldBean2.setCalculate("exclusion");
        java.lang.Boolean boolean10 = modelFieldBean2.getUnique();
        java.lang.String str11 = modelFieldBean2.getConvert();
        java.lang.Object obj12 = modelFieldBean2.getDefaultValue();
        modelFieldBean2.setAllowNull((java.lang.Boolean) false);
        modelFieldBean2.setAllowNull((java.lang.Boolean) true);
        java.lang.String str17 = modelFieldBean2.getConvert();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test05194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05194");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});";
        apiObject0.update = "json";
        apiObject0.destroy = "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/";
        java.lang.String str10 = apiObject0.update;
        java.lang.String str11 = apiObject0.destroy;
        apiObject0.create = "belongsTo";
        apiObject0.read = "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[],proxy:{type:\"direct\",directFn:hi!}});";
        apiObject0.destroy = "Ext.define(\"ch.rasc.extclassgenerator.validation.PastValidation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"field\",\n    type : \"string\"\n  } ]\n});";
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.association.HasOneAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ {\n      name : \"setterName\",\n      type : \"string\"\n    }, {\n      name : \"getterName\",\n      type : \"string\"\n    }, {\n      name : \"name\",\n      type : \"string\"\n    }, {\n      name : \"type\",\n      type : \"string\"\n    }, {\n      name : \"model\",\n      type : \"string\"\n    }, {\n      name : \"associationKey\",\n      type : \"string\"\n    }, {\n      name : \"foreignKey\",\n      type : \"string\"\n    }, {\n      name : \"primaryKey\",\n      type : \"string\"\n    }, {\n      name : \"instanceName\",\n      type : \"string\"\n    } ]\n  }\n});";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "json" + "'", str10, "json");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/" + "'", str11, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
    }

    @Test
    public void test05195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05195");
        ch.rasc.extclassgenerator.validation.ExclusionValidation exclusionValidation2 = new ch.rasc.extclassgenerator.validation.ExclusionValidation("Ext.define(\"null\",{extend:\"\",config:{fields:[]}});", "hasOne");
        java.lang.String str3 = exclusionValidation2.getField();
        java.lang.String str4 = exclusionValidation2.getList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"null\",{extend:\"\",config:{fields:[]}});" + "'", str3, "Ext.define(\"null\",{extend:\"\",config:{fields:[]}});");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hasOne" + "'", str4, "hasOne");
    }

    @Test
    public void test05196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05196");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});/", (java.lang.Long) 1L, (java.lang.Long) 52L);
    }

    @Test
    public void test05197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05197");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"debug\",type:\"boolean\"},{name:\"useSingleQuotes\",type:\"boolean\"},{name:\"surroundApiWithQuotes\",type:\"boolean\"}]}});", (java.lang.Integer) (-1), (java.lang.Integer) 35);
    }

    @Test
    public void test05198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05198");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        java.lang.String str2 = hasOneAssociation1.getInstanceName();
        java.lang.String str3 = hasOneAssociation1.getForeignKey();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test05199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05199");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});", "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});/");
        java.lang.Boolean boolean3 = modelFieldBean2.getUseNull();
        modelFieldBean2.setCalculate("Ext.define(\"null\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ],\n  proxy : {\n    type : \"direct\",\n    reader : {\n      totalProperty : \"/Ext.define(\\\"ch.rasc.extclassgenerator.association.HasManyAssociation\\\",{extend:\\\"Ext.data.Model\\\",fields:[{name:\\\"autoLoad\\\",type:\\\"boolean\\\"},{name:\\\"name\\\",type:\\\"string\\\"},{name:\\\"type\\\",type:\\\"string\\\"},{name:\\\"model\\\",type:\\\"string\\\"},{name:\\\"associationKey\\\",type:\\\"string\\\"},{name:\\\"foreignKey\\\",type:\\\"string\\\"},{name:\\\"primaryKey\\\",type:\\\"string\\\"},{name:\\\"instanceName\\\",type:\\\"string\\\"}]});/\"\n    }\n  }\n});");
        java.lang.Object obj6 = modelFieldBean2.getReference();
        java.lang.Boolean boolean7 = modelFieldBean2.getPersist();
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(boolean7);
    }

    @Test
    public void test05200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05200");
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation4 = new ch.rasc.extclassgenerator.validation.RangeValidation("belongsTo", (java.lang.Long) 10L, (java.lang.Long) 0L);
        java.math.BigDecimal bigDecimal5 = rangeValidation4.getMax();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation10 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal11 = rangeValidation10.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation17 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal18 = rangeValidation17.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation22 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal23 = rangeValidation22.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation24 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal18, bigDecimal23);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation29 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal30 = rangeValidation29.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation34 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal35 = rangeValidation34.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation36 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal30, bigDecimal35);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation37 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal23, bigDecimal30);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation38 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/", bigDecimal11, bigDecimal23);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation39 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"debug\",type:\"boolean\"},{name:\"useSingleQuotes\",type:\"boolean\"},{name:\"surroundApiWithQuotes\",type:\"boolean\"}]}});", bigDecimal5, bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(bigDecimal35);
    }

    @Test
    public void test05201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05201");
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
        modelFieldBean2.setName("hasMany");
        java.lang.String str23 = modelFieldBean2.getConvert();
        java.lang.String str24 = modelFieldBean2.getName();
        org.junit.Assert.assertNotNull(abstractValidationArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(strList19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hasMany" + "'", str24, "hasMany");
    }

    @Test
    public void test05202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05202");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        boolean boolean4 = allDataOptionsBean0.hasAnyProperties();
        allDataOptionsBean0.setCritical((java.lang.Boolean) true);
        boolean boolean7 = allDataOptionsBean0.hasAnyProperties();
        allDataOptionsBean0.setPersist((java.lang.Boolean) true);
        java.lang.Boolean boolean10 = allDataOptionsBean0.getChanges();
        allDataOptionsBean0.setChanges((java.lang.Boolean) false);
        allDataOptionsBean0.setCritical((java.lang.Boolean) false);
        boolean boolean15 = allDataOptionsBean0.hasAnyProperties();
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test05203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05203");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        java.lang.String str1 = apiObject0.update;
        apiObject0.update = "";
        apiObject0.read = "";
        java.lang.String str6 = apiObject0.destroy;
        java.lang.String str7 = apiObject0.create;
        apiObject0.destroy = "json";
        java.lang.String str10 = apiObject0.update;
        apiObject0.read = "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});/";
        java.lang.String str13 = apiObject0.update;
        java.lang.String str14 = apiObject0.read;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});/" + "'", str14, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});/");
    }

    @Test
    public void test05204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05204");
        ch.rasc.extclassgenerator.validation.ExclusionValidation exclusionValidation2 = new ch.rasc.extclassgenerator.validation.ExclusionValidation("Ext.define(\"null\",\r\n{\n  extend : \"\",\n  idgen : \"Ext.define(\\\"java.util.ArrayList\\\",\\r\\n{\\n  extend : \\\"Ext.data.Model\\\",\\n  fields : [ ]\\n});\",\n  fields : [ ],\n  proxy : {\n    type : \"direct\",\n    reader : {\n      root : \"Ext.define(\\\"null\\\",{extend:\\\"Ext.data.Model\\\",idProperty:\\\"hi!\\\",fields:[],proxy:{type:\\\"direct\\\",idParam:\\\"hi!\\\"}});\",\n      messageProperty : \"hi!\"\n    },\n    writer : {\n      writeAllFields : false\n    }\n  }\n});", "Ext.define(\"ch.rasc.extclassgenerator.validation.InclusionValidationArray\",{extend:\"Ext.data.Model\",fields:[{name:\"type\",type:\"string\"},{name:\"field\",type:\"string\"}]});");
        java.lang.String str3 = exclusionValidation2.getList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.validation.InclusionValidationArray\",{extend:\"Ext.data.Model\",fields:[{name:\"type\",type:\"string\"},{name:\"field\",type:\"string\"}]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.validation.InclusionValidationArray\",{extend:\"Ext.data.Model\",fields:[{name:\"type\",type:\"string\"},{name:\"field\",type:\"string\"}]});");
    }

    @Test
    public void test05205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05205");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        ch.rasc.extclassgenerator.validation.GenericValidation genericValidation3 = new ch.rasc.extclassgenerator.validation.GenericValidation("/Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});/", "Ext.define(\"null\",\r\n{\n  extend : \"\",\n  idgen : \"Ext.define(\\\"java.util.ArrayList\\\",\\r\\n{\\n  extend : \\\"Ext.data.Model\\\",\\n  fields : [ ]\\n});\",\n  fields : [ ],\n  proxy : {\n    type : \"direct\",\n    reader : {\n      root : \"Ext.define(\\\"null\\\",{extend:\\\"Ext.data.Model\\\",idProperty:\\\"hi!\\\",fields:[],proxy:{type:\\\"direct\\\",idParam:\\\"hi!\\\"}});\",\n      messageProperty : \"hi!\"\n    },\n    writer : {\n      writeAllFields : false\n    }\n  }\n});", strMap2);
    }

    @Test
    public void test05206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05206");
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
        modelFieldBean4.setName("Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[],proxy:{type:\"direct\",directFn:hi!}});");
        modelFieldBean4.setMapping("");
        java.lang.Boolean boolean31 = modelFieldBean4.getUseNull();
        modelFieldBean4.setAllowBlank((java.lang.Boolean) true);
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray42 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList40);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray43 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("", (java.util.List<java.lang.String>) strList40);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray44 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("json", (java.util.List<java.lang.String>) strList40);
        java.lang.String str45 = exclusionValidationArray44.getType();
        java.util.List<java.lang.String> strList46 = exclusionValidationArray44.getList();
        java.lang.String str47 = exclusionValidationArray44.getField();
        java.util.List<java.lang.String> strList48 = exclusionValidationArray44.getList();
        modelFieldBean4.setDepends(strList48);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray50 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[],proxy:{type:\"direct\",directFn:hi!,writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",config:{fields:[]}});\"}}}});", strList48);
        java.util.List<java.lang.String> strList51 = exclusionValidationArray50.getList();
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray52 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("creditCardNumber", strList51);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + boolean31 + "' != '" + false + "'", boolean31, false);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "exclusion" + "'", str45, "exclusion");
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "json" + "'", str47, "json");
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(strList51);
    }

    @Test
    public void test05207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05207");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean4 = allDataOptionsBean0.getPersist();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        allDataOptionsBean0.setPersist((java.lang.Boolean) false);
        boolean boolean9 = allDataOptionsBean0.hasAnyProperties();
        allDataOptionsBean0.setChanges((java.lang.Boolean) false);
        allDataOptionsBean0.setChanges((java.lang.Boolean) true);
        allDataOptionsBean0.setPersist((java.lang.Boolean) true);
        java.lang.Boolean boolean16 = allDataOptionsBean0.getAssociated();
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + boolean16 + "' != '" + false + "'", boolean16, false);
    }

    @Test
    public void test05208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05208");
        ch.rasc.extclassgenerator.validation.FormatValidation formatValidation2 = new ch.rasc.extclassgenerator.validation.FormatValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});", "Ext.define(\"null\",\r\n{\n  extend : \"Ext.data.Model\",\n  idgen : \"Ext.define(\\\"null\\\",{extend:\\\"Ext.data.Model\\\",config:{fields:[],proxy:{type:\\\"direct\\\",directFn:hi!,writer:{type:\\\"Ext.define(\\\\\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\\\\\",{extend:\\\\\\\"Ext.data.Model\\\\\\\",config:{fields:[]}});\\\"}}}});\",\n  fields : [ ]\n});");
    }

    @Test
    public void test05209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05209");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean4 = allDataOptionsBean0.getPersist();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        allDataOptionsBean0.setPersist((java.lang.Boolean) false);
        java.lang.Boolean boolean9 = allDataOptionsBean0.getPersist();
        java.lang.Boolean boolean10 = allDataOptionsBean0.getCritical();
        java.lang.Boolean boolean11 = allDataOptionsBean0.getCritical();
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + false + "'", boolean9, false);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNull(boolean11);
    }

    @Test
    public void test05210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05210");
        ch.rasc.extclassgenerator.validation.DigitsValidation digitsValidation3 = new ch.rasc.extclassgenerator.validation.DigitsValidation("", (int) ' ', (int) (byte) 1);
        int int4 = digitsValidation3.getFraction();
        int int5 = digitsValidation3.getInteger();
        int int6 = digitsValidation3.getFraction();
        int int7 = digitsValidation3.getInteger();
        int int8 = digitsValidation3.getInteger();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test05211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05211");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getChild();
        java.lang.String str2 = referenceBean0.getChild();
        referenceBean0.setAssociation("creditCardNumber");
        referenceBean0.setInverse("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        referenceBean0.setRole("length");
        referenceBean0.setChild("creditCardNumber");
        java.lang.String str11 = referenceBean0.getChild();
        referenceBean0.setChild("/ch.rasc.extclassgenerator.PartialDataOptionsBean/");
        referenceBean0.setChild("Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"associated\",\n    type : \"boolean\"\n  }, {\n    name : \"changes\",\n    type : \"boolean\"\n  }, {\n    name : \"critical\",\n    type : \"boolean\"\n  }, {\n    name : \"persist\",\n    type : \"boolean\"\n  } ]\n});");
        referenceBean0.setType("Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
        java.lang.String str18 = referenceBean0.getType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "creditCardNumber" + "'", str11, "creditCardNumber");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});" + "'", str18, "Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
    }

    @Test
    public void test05212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05212");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        java.lang.String str6 = referenceBean0.getParent();
        java.lang.String str7 = referenceBean0.getChild();
        java.lang.String str8 = referenceBean0.getAssociation();
        boolean boolean9 = referenceBean0.hasAnyProperties();
        boolean boolean10 = referenceBean0.typeOnly();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test05213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05213");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getType();
        referenceBean0.setInverse("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        java.lang.String str4 = referenceBean0.getAssociation();
        java.lang.String str5 = referenceBean0.getInverse();
        referenceBean0.setInverse("/\\/range\\//");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/" + "'", str5, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
    }

    @Test
    public void test05214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05214");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});";
        apiObject0.destroy = "belongsTo";
        apiObject0.destroy = "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str10 = apiObject0.destroy;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str10, "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});");
    }

    @Test
    public void test05215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05215");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.read;
        apiObject0.update = "hi!";
        apiObject0.update = "ch.rasc.extclassgenerator.ModelAnnotationProcessor";
        apiObject0.read = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});";
        apiObject0.destroy = "Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});";
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.validation.PresenceValidation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"field\",\n    type : \"string\"\n  } ]\n});";
        java.lang.String str14 = apiObject0.destroy;
        java.lang.String str15 = apiObject0.destroy;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});" + "'", str14, "Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});" + "'", str15, "Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});");
    }

    @Test
    public void test05216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05216");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        java.lang.String str3 = modelBean0.getIdProperty();
        java.lang.String[] strArray4 = modelBean0.getHasMany();
        modelBean0.setExtend("/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/");
        modelBean0.setAutodetectTypes(false);
        modelBean0.setVersionProperty("/ch.rasc.extclassgenerator.ModelAnnotationProcessor/");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strArray4);
    }

    @Test
    public void test05217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05217");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getChild();
        java.lang.String str3 = referenceBean0.getAssociation();
        boolean boolean4 = referenceBean0.typeOnly();
        java.lang.String str5 = referenceBean0.getInverse();
        referenceBean0.setRole("ch.rasc.extclassgenerator.PartialDataOptionsBean");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test05218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05218");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        referenceBean0.setParent("");
        java.lang.String str12 = referenceBean0.getType();
        java.lang.String str13 = referenceBean0.getParent();
        referenceBean0.setParent("Ext.define(\"null\",\r\n{\n  extend : \"\",\n  fields : [ ],\n  hasMany : [ \"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\", \"json\", \"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\", \"\" ]\n});");
        referenceBean0.setAssociation("Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});");
        boolean boolean18 = referenceBean0.typeOnly();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test05219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05219");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("range");
        belongsToAssociation1.setGetterName("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        belongsToAssociation1.setPrimaryKey("Ext.define(\"ch.rasc.extclassgenerator.association.HasOneAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"setterName\",\n    type : \"string\"\n  }, {\n    name : \"getterName\",\n    type : \"string\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        belongsToAssociation1.setGetterName("/ch.rasc.extclassgenerator.PartialDataOptionsBean/");
    }

    @Test
    public void test05220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05220");
        ch.rasc.extclassgenerator.OutputConfig outputConfig0 = new ch.rasc.extclassgenerator.OutputConfig();
        boolean boolean1 = outputConfig0.isSurroundApiWithQuotes();
        boolean boolean2 = outputConfig0.isSurroundApiWithQuotes();
        boolean boolean3 = outputConfig0.isDebug();
        boolean boolean4 = outputConfig0.isDebug();
        ch.rasc.extclassgenerator.OutputFormat outputFormat5 = outputConfig0.getOutputFormat();
        boolean boolean6 = outputConfig0.isSurroundApiWithQuotes();
        ch.rasc.extclassgenerator.LineEnding lineEnding7 = outputConfig0.getLineEnding();
        ch.rasc.extclassgenerator.LineEnding lineEnding8 = outputConfig0.getLineEnding();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(outputFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(lineEnding7);
        org.junit.Assert.assertNull(lineEnding8);
    }

    @Test
    public void test05221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05221");
        ch.rasc.extclassgenerator.validation.InclusionValidation inclusionValidation2 = new ch.rasc.extclassgenerator.validation.InclusionValidation("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ {\n      name : \"autoLoad\",\n      type : \"boolean\"\n    }, {\n      name : \"name\",\n      type : \"string\"\n    }, {\n      name : \"type\",\n      type : \"string\"\n    }, {\n      name : \"model\",\n      type : \"string\"\n    }, {\n      name : \"associationKey\",\n      type : \"string\"\n    }, {\n      name : \"foreignKey\",\n      type : \"string\"\n    }, {\n      name : \"primaryKey\",\n      type : \"string\"\n    }, {\n      name : \"instanceName\",\n      type : \"string\"\n    } ]\n  }\n});", "/\\/\\\\/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});\\\\/\\//");
    }

    @Test
    public void test05222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05222");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("belongsTo");
        java.lang.String str2 = hasOneAssociation1.getInstanceName();
        hasOneAssociation1.setInstanceName("Ext.define(\"ch.rasc.extclassgenerator.association.HasOneAssociation\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"setterName\",type:\"string\"},{name:\"getterName\",type:\"string\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]}});");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test05223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05223");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        referenceBean0.setType("");
        java.lang.String str3 = referenceBean0.getAssociation();
        boolean boolean4 = referenceBean0.hasAnyProperties();
        java.lang.String str5 = referenceBean0.getType();
        java.lang.String str6 = referenceBean0.getParent();
        boolean boolean7 = referenceBean0.hasAnyProperties();
        referenceBean0.setInverse("ch.rasc.extclassgenerator.association.HasManyAssociation");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test05224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05224");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});";
        apiObject0.destroy = "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/";
        java.lang.String str8 = apiObject0.read;
        apiObject0.create = "length";
        java.lang.String str11 = apiObject0.create;
        apiObject0.destroy = "/range/";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "length" + "'", str11, "length");
    }

    @Test
    public void test05225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05225");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean4 = allDataOptionsBean0.getCritical();
        java.lang.Boolean boolean5 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean6 = allDataOptionsBean0.getPersist();
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + false + "'", boolean5, false);
        org.junit.Assert.assertNull(boolean6);
    }

    @Test
    public void test05226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05226");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        modelBean0.setIdProperty("");
        boolean boolean5 = modelBean0.isDisablePagingParameters();
        boolean boolean6 = modelBean0.isPaging();
        java.lang.String str7 = modelBean0.getRootProperty();
        modelBean0.setReader("");
        modelBean0.setVersionProperty("/Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",{extend:\"Ext.data.Model\",fields:[{name:\"debug\",type:\"boolean\"},{name:\"useSingleQuotes\",type:\"boolean\"},{name:\"surroundApiWithQuotes\",type:\"boolean\"}]});/");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test05227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05227");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.read = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str8 = apiObject0.update;
        java.lang.String str9 = apiObject0.update;
        java.lang.String str10 = apiObject0.create;
        java.lang.String str11 = apiObject0.create;
        apiObject0.create = "Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});";
        java.lang.String str14 = apiObject0.destroy;
        java.lang.String str15 = apiObject0.read;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str8, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str9, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str10, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str11, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str15, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
    }

    @Test
    public void test05228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05228");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getRole();
        referenceBean0.setChild("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        referenceBean0.setRole("json");
        java.lang.String str7 = referenceBean0.getAssociation();
        referenceBean0.setAssociation("belongsTo");
        referenceBean0.setAssociation("Ext.data.Model");
        boolean boolean12 = referenceBean0.hasAnyProperties();
        referenceBean0.setChild("creditCardNumber");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test05229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05229");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        java.lang.String str6 = referenceBean0.getParent();
        java.lang.String str7 = referenceBean0.getParent();
        java.lang.String str8 = referenceBean0.getInverse();
        referenceBean0.setParent("Ext.define(\"ch.rasc.extclassgenerator.association.HasOneAssociation\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"setterName\",type:\"string\"},{name:\"getterName\",type:\"string\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]}});");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test05230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05230");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getType();
        referenceBean0.setInverse("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        java.lang.String str4 = referenceBean0.getAssociation();
        java.lang.String str5 = referenceBean0.getAssociation();
        referenceBean0.setRole("digits");
        referenceBean0.setRole("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
        referenceBean0.setRole("Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test05231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05231");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("json");
        java.lang.String str2 = belongsToAssociation1.getPrimaryKey();
        java.lang.String str3 = belongsToAssociation1.getAssociationKey();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test05232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05232");
        ch.rasc.extclassgenerator.validation.FormatValidation formatValidation2 = new ch.rasc.extclassgenerator.validation.FormatValidation("/Ext.define(\"ch.rasc.extclassgenerator.validation.PresenceValidation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"field\",\n    type : \"string\"\n  } ]\n});/", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        java.lang.String str3 = formatValidation2.getMatcher();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});/" + "'", str3, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});/");
    }

    @Test
    public void test05233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05233");
        ch.rasc.extclassgenerator.ModelType modelType1 = null;
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", modelType1);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray9 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList7);
        java.util.List<java.lang.String> strList10 = inclusionValidationArray9.getList();
        modelFieldBean2.setDepends(strList10);
        java.lang.Boolean boolean12 = modelFieldBean2.getUseNull();
        java.util.List<ch.rasc.extclassgenerator.validation.AbstractValidation> abstractValidationList13 = modelFieldBean2.getValidators();
        java.lang.Boolean boolean14 = modelFieldBean2.getAllowNull();
        ch.rasc.extclassgenerator.ModelType modelType16 = null;
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean17 = new ch.rasc.extclassgenerator.ModelFieldBean("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", modelType16);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray24 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList22);
        java.util.List<java.lang.String> strList25 = inclusionValidationArray24.getList();
        modelFieldBean17.setDepends(strList25);
        modelFieldBean2.setDepends(strList25);
        ch.rasc.extclassgenerator.ReferenceBean referenceBean28 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean29 = referenceBean28.typeOnly();
        referenceBean28.setChild("");
        referenceBean28.setAssociation("");
        referenceBean28.setChild("");
        referenceBean28.setAssociation("");
        java.lang.String str38 = referenceBean28.getType();
        java.lang.String str39 = referenceBean28.getParent();
        referenceBean28.setType("Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
        referenceBean28.setAssociation("hasOne");
        referenceBean28.setAssociation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setReference((java.lang.Object) "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.Boolean boolean47 = modelFieldBean2.getAllowBlank();
        java.lang.Boolean boolean48 = modelFieldBean2.getUseNull();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertNull(abstractValidationList13);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(boolean47);
        org.junit.Assert.assertNull(boolean48);
    }

    @Test
    public void test05234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05234");
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation4 = new ch.rasc.extclassgenerator.validation.RangeValidation("/ch.rasc.extclassgenerator.ModelAnnotationProcessor/", (java.lang.Long) 32L, (java.lang.Long) (-1L));
        java.math.BigDecimal bigDecimal5 = rangeValidation4.getMax();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation9 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.data.Model", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.lang.String str10 = rangeValidation9.getType();
        java.math.BigDecimal bigDecimal11 = rangeValidation9.getMax();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation12 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"associated\",\n    type : \"boolean\"\n  }, {\n    name : \"changes\",\n    type : \"boolean\"\n  }, {\n    name : \"critical\",\n    type : \"boolean\"\n  }, {\n    name : \"persist\",\n    type : \"boolean\"\n  } ]\n});", bigDecimal5, bigDecimal11);
        java.math.BigDecimal bigDecimal13 = rangeValidation12.getMax();
        java.lang.String str14 = rangeValidation12.getType();
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "range" + "'", str10, "range");
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "range" + "'", str14, "range");
    }

    @Test
    public void test05235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05235");
        ch.rasc.extclassgenerator.validation.ExclusionValidation exclusionValidation2 = new ch.rasc.extclassgenerator.validation.ExclusionValidation("Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});", "/Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});/");
        java.lang.String str3 = exclusionValidation2.getList();
        java.lang.String str4 = exclusionValidation2.getList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});/" + "'", str3, "/Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});/" + "'", str4, "/Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});/");
    }

    @Test
    public void test05236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05236");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("java.util.ArrayList");
    }

    @Test
    public void test05237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05237");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.read = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str8 = apiObject0.update;
        apiObject0.update = "hasOne";
        apiObject0.destroy = "/hasOne/";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str8, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
    }

    @Test
    public void test05238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05238");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.read;
        apiObject0.update = "hi!";
        apiObject0.update = "ch.rasc.extclassgenerator.ModelAnnotationProcessor";
        apiObject0.destroy = "/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/";
        java.lang.String str10 = apiObject0.update;
        apiObject0.create = "future";
        java.lang.String str13 = apiObject0.update;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ch.rasc.extclassgenerator.ModelAnnotationProcessor" + "'", str10, "ch.rasc.extclassgenerator.ModelAnnotationProcessor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ch.rasc.extclassgenerator.ModelAnnotationProcessor" + "'", str13, "ch.rasc.extclassgenerator.ModelAnnotationProcessor");
    }

    @Test
    public void test05239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05239");
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
        modelFieldBean2.setAllowNull((java.lang.Boolean) false);
        modelFieldBean2.setUnique((java.lang.Boolean) true);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(boolean25);
        org.junit.Assert.assertNull(boolean28);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test05240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05240");
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation3 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.validation.InclusionValidation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"list\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"field\",\n    type : \"string\"\n  } ]\n});", (java.lang.Long) 32L, (java.lang.Long) 52L);
    }

    @Test
    public void test05241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05241");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("hi!");
        hasManyAssociation1.setForeignKey("");
        java.lang.String str4 = hasManyAssociation1.getForeignKey();
        java.lang.String str5 = hasManyAssociation1.getType();
        hasManyAssociation1.setInstanceName("Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[],proxy:{type:\"direct\",directFn:hi!,writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",config:{fields:[]}});\"}}}});");
        hasManyAssociation1.setInstanceName("Ext.define(\"ch.rasc.extclassgenerator.association.BelongsToAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"setterName\",\n    type : \"string\"\n  }, {\n    name : \"getterName\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        java.lang.String str10 = hasManyAssociation1.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hasMany" + "'", str5, "hasMany");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test05242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05242");
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
        modelBean0.setIdProperty("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        modelBean0.setClientIdPropertyAddToWriter(true);
        modelBean0.setTotalProperty("creditCardNumber");
        modelBean0.setUpdateMethod("/Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});/");
        java.lang.String str27 = modelBean0.getUpdateMethod();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});/" + "'", str27, "/Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});/");
    }

    @Test
    public void test05243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05243");
        ch.rasc.extclassgenerator.validation.PresenceValidation presenceValidation1 = new ch.rasc.extclassgenerator.validation.PresenceValidation("Ext.define(\"ch.rasc.extclassgenerator.validation.InclusionValidation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"list\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"field\",\n    type : \"string\"\n  } ]\n});");
    }

    @Test
    public void test05244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05244");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("/ch.rasc.extclassgenerator.PartialDataOptionsBean/", (java.lang.Long) (-1L), (java.lang.Long) 32L);
    }

    @Test
    public void test05245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05245");
        ch.rasc.extclassgenerator.validation.PastValidation pastValidation1 = new ch.rasc.extclassgenerator.validation.PastValidation("future");
    }

    @Test
    public void test05246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05246");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("Ext.data.Model");
        java.lang.String str2 = belongsToAssociation1.getAssociationKey();
        belongsToAssociation1.setSetterName("/\\/belongsTo\\//");
        java.lang.String str5 = belongsToAssociation1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "belongsTo" + "'", str5, "belongsTo");
    }

    @Test
    public void test05247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05247");
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
        modelFieldBean2.setPersist((java.lang.Boolean) false);
        java.lang.Object obj24 = modelFieldBean2.getDefaultValue();
        modelFieldBean2.setDateFormat("/Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});/");
        org.junit.Assert.assertNotNull(abstractValidationArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test05248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05248");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getChild();
        java.lang.String str2 = referenceBean0.getChild();
        referenceBean0.setAssociation("creditCardNumber");
        referenceBean0.setType("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        referenceBean0.setChild("length");
        referenceBean0.setParent("json");
        referenceBean0.setChild("exclusion");
        referenceBean0.setParent("digits");
        boolean boolean15 = referenceBean0.hasAnyProperties();
        java.lang.String str16 = referenceBean0.getRole();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test05249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05249");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        modelBean0.setIdProperty("");
        boolean boolean5 = modelBean0.isDisablePagingParameters();
        modelBean0.setExtend("");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean9 = modelBean0.getField("hi!");
        boolean boolean10 = modelBean0.isPaging();
        modelBean0.setClientIdProperty("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        modelBean0.setClientIdProperty("Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});");
        modelBean0.setExtend("hasOne");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(modelFieldBean9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test05250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05250");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray9 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList7);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray10 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("exclusion", (java.util.List<java.lang.String>) strList7);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray11 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("Ext.define(\"ch.rasc.extclassgenerator.LineEnding\",{extend:\"Ext.data.Model\",config:{fields:[]}});", (java.util.List<java.lang.String>) strList7);
        java.util.List<java.lang.String> strList12 = inclusionValidationArray11.getList();
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray13 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("/Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",{extend:\"Ext.data.Model\",fields:[{name:\"debug\",type:\"boolean\"},{name:\"useSingleQuotes\",type:\"boolean\"},{name:\"surroundApiWithQuotes\",type:\"boolean\"}]});/", strList12);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test05251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05251");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.read = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.update = "";
        java.lang.String str10 = apiObject0.read;
        java.lang.String str11 = apiObject0.destroy;
        java.lang.String str12 = apiObject0.destroy;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str10, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test05252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05252");
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
        modelFieldBean2.setAllowBlank((java.lang.Boolean) false);
        modelFieldBean2.setUnique((java.lang.Boolean) true);
        modelFieldBean2.setCalculate("/Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});/");
        org.junit.Assert.assertNotNull(abstractValidationArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test05253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05253");
        ch.rasc.extclassgenerator.validation.ExclusionValidation exclusionValidation2 = new ch.rasc.extclassgenerator.validation.ExclusionValidation("ch.rasc.extclassgenerator.PartialDataOptionsBean", "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        java.lang.String str3 = exclusionValidation2.getList();
        java.lang.String str4 = exclusionValidation2.getList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/" + "'", str3, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/" + "'", str4, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
    }

    @Test
    public void test05254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05254");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        java.lang.String str6 = referenceBean0.getAssociation();
        java.lang.String str7 = referenceBean0.getInverse();
        referenceBean0.setType("past");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test05255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05255");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        hasOneAssociation1.setGetterName("hi!");
        hasOneAssociation1.setSetterName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str6 = hasOneAssociation1.getName();
        hasOneAssociation1.setName("Ext.define(\"ch.rasc.extclassgenerator.validation.InclusionValidationArray\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"field\",\n    type : \"string\"\n  } ]\n});");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test05256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05256");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("");
        java.lang.String str2 = belongsToAssociation1.getType();
        java.lang.String str3 = belongsToAssociation1.getType();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "belongsTo" + "'", str2, "belongsTo");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "belongsTo" + "'", str3, "belongsTo");
    }

    @Test
    public void test05257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05257");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("");
        java.lang.String str2 = belongsToAssociation1.getInstanceName();
        belongsToAssociation1.setGetterName("json");
        java.lang.String str5 = belongsToAssociation1.getSetterName();
        belongsToAssociation1.setForeignKey("Ext.data.Model");
        java.lang.String str8 = belongsToAssociation1.getInstanceName();
        java.lang.String str9 = belongsToAssociation1.getInstanceName();
        belongsToAssociation1.setGetterName("json");
        java.lang.String str12 = belongsToAssociation1.getPrimaryKey();
        belongsToAssociation1.setSetterName("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});/");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test05258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05258");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        java.lang.String str6 = modelFieldBean2.getMapping();
        java.lang.String str7 = modelFieldBean2.getName();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray16 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList14);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray17 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("", (java.util.List<java.lang.String>) strList14);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray18 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("json", (java.util.List<java.lang.String>) strList14);
        modelFieldBean2.setDepends((java.util.List<java.lang.String>) strList14);
        modelFieldBean2.setPersist((java.lang.Boolean) true);
        java.lang.Boolean boolean22 = modelFieldBean2.getAllowBlank();
        java.lang.String str23 = modelFieldBean2.getType();
        modelFieldBean2.setDateFormat("range");
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(boolean22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str23, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
    }

    @Test
    public void test05259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05259");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.destroy = "";
        apiObject0.destroy = "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/";
        java.lang.String str5 = apiObject0.read;
        apiObject0.update = "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/";
        java.lang.String str8 = apiObject0.destroy;
        java.lang.String str9 = apiObject0.destroy;
        apiObject0.read = "digits";
        java.lang.String str12 = apiObject0.destroy;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/" + "'", str8, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/" + "'", str9, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/" + "'", str12, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
    }

    @Test
    public void test05260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05260");
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
        java.math.BigDecimal bigDecimal34 = rangeValidation32.getMin();
        java.math.BigDecimal bigDecimal35 = rangeValidation32.getMin();
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/" + "'", str33, "/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/");
        org.junit.Assert.assertNotNull(bigDecimal34);
        org.junit.Assert.assertNotNull(bigDecimal35);
    }

    @Test
    public void test05261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05261");
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
        modelFieldBean4.setAllowBlank((java.lang.Boolean) false);
        java.lang.String str35 = modelFieldBean4.getMapping();
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray43 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList41);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray44 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("digits", (java.util.List<java.lang.String>) strList41);
        java.util.List<java.lang.String> strList45 = inclusionValidationArray44.getList();
        modelFieldBean4.setDefaultValue((java.lang.Object) strList45);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray47 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});", strList45);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray48 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("Ext.define(\"null\",\r\n{\n  extend : \"Ext.data.Model\",\n  idgen : \"Ext.define(\\\"null\\\",{extend:\\\"Ext.data.Model\\\",config:{fields:[],proxy:{type:\\\"direct\\\",directFn:hi!,writer:{type:\\\"Ext.define(\\\\\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\\\\\",{extend:\\\\\\\"Ext.data.Model\\\\\\\",config:{fields:[]}});\\\"}}}});\",\n  fields : [ ]\n});", strList45);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(strList45);
    }

    @Test
    public void test05262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05262");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        java.lang.String str10 = referenceBean0.getType();
        java.lang.String str11 = referenceBean0.getParent();
        referenceBean0.setType("Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
        referenceBean0.setAssociation("hasOne");
        boolean boolean16 = referenceBean0.hasAnyProperties();
        java.lang.String str17 = referenceBean0.getParent();
        java.lang.String str18 = referenceBean0.getChild();
        java.lang.String str19 = referenceBean0.getAssociation();
        referenceBean0.setChild("digits");
        java.lang.String str22 = referenceBean0.getRole();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hasOne" + "'", str19, "hasOne");
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test05263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05263");
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation3 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.association.HasOneAssociation\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"setterName\",type:\"string\"},{name:\"getterName\",type:\"string\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]}});", (java.lang.Long) 10L, (java.lang.Long) 32L);
    }

    @Test
    public void test05264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05264");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("hi!");
        hasManyAssociation1.setAssociationKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str4 = hasManyAssociation1.getInstanceName();
        hasManyAssociation1.setPrimaryKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        hasManyAssociation1.setForeignKey("exclusion");
        java.lang.String str9 = hasManyAssociation1.getName();
        hasManyAssociation1.setName("/Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});/");
        hasManyAssociation1.setAssociationKey("/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test05265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05265");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Object obj5 = modelFieldBean2.getReference();
        modelFieldBean2.setPersist((java.lang.Boolean) false);
        modelFieldBean2.setConvert("Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});");
        java.lang.Boolean boolean10 = modelFieldBean2.getAllowNull();
        java.util.List<ch.rasc.extclassgenerator.validation.AbstractValidation> abstractValidationList11 = modelFieldBean2.getValidators();
        modelFieldBean2.setPersist((java.lang.Boolean) true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNull(abstractValidationList11);
    }

    @Test
    public void test05266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05266");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Object obj5 = modelFieldBean2.getReference();
        java.lang.String str6 = modelFieldBean2.getName();
        ch.rasc.extclassgenerator.OutputConfig outputConfig7 = new ch.rasc.extclassgenerator.OutputConfig();
        boolean boolean8 = outputConfig7.isSurroundApiWithQuotes();
        boolean boolean9 = outputConfig7.isSurroundApiWithQuotes();
        boolean boolean10 = modelFieldBean2.hasOnlyName(outputConfig7);
        java.lang.String str11 = modelFieldBean2.getDateFormat();
        java.lang.Boolean boolean12 = modelFieldBean2.getAllowNull();
        java.lang.Boolean boolean13 = modelFieldBean2.getUseNull();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertNull(boolean13);
    }

    @Test
    public void test05267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05267");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        java.lang.String str2 = hasOneAssociation1.getGetterName();
        hasOneAssociation1.setGetterName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        java.lang.String str5 = hasOneAssociation1.getForeignKey();
        hasOneAssociation1.setForeignKey("hasMany");
        java.lang.String str8 = hasOneAssociation1.getModel();
        java.lang.String str9 = hasOneAssociation1.getSetterName();
        java.lang.String str10 = hasOneAssociation1.getGetterName();
        hasOneAssociation1.setGetterName("Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"debug\",type:\"boolean\"},{name:\"useSingleQuotes\",type:\"boolean\"},{name:\"surroundApiWithQuotes\",type:\"boolean\"}]}});");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});" + "'", str8, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});" + "'", str10, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
    }

    @Test
    public void test05268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05268");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("ch.rasc.extclassgenerator.ModelAnnotationProcessor", (java.lang.Integer) 0, (java.lang.Integer) 97);
        java.lang.String str4 = lengthValidation3.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "length" + "'", str4, "length");
    }

    @Test
    public void test05269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05269");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean4 = allDataOptionsBean0.getCritical();
        java.lang.Boolean boolean5 = allDataOptionsBean0.getPersist();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean8 = allDataOptionsBean0.getPersist();
        java.lang.Boolean boolean9 = allDataOptionsBean0.getPersist();
        java.lang.Boolean boolean10 = allDataOptionsBean0.getPersist();
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNull(boolean10);
    }

    @Test
    public void test05270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05270");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        java.lang.String str6 = modelFieldBean2.getMapping();
        modelFieldBean2.setConvert("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation10 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        hasOneAssociation10.setInstanceName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setDefaultValue((java.lang.Object) hasOneAssociation10);
        modelFieldBean2.setPersist((java.lang.Boolean) true);
        modelFieldBean2.setPersist((java.lang.Boolean) false);
        modelFieldBean2.setName("//");
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test05271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05271");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("/Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});/");
    }

    @Test
    public void test05272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05272");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        ch.rasc.extclassgenerator.validation.GenericValidation genericValidation3 = new ch.rasc.extclassgenerator.validation.GenericValidation("Ext.data.Model", "hasOne", strMap2);
    }

    @Test
    public void test05273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05273");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        belongsToAssociation1.setSetterName("json");
        java.lang.String str4 = belongsToAssociation1.getInstanceName();
        java.lang.String str5 = belongsToAssociation1.getType();
        belongsToAssociation1.setInstanceName("/Ext.define(\"null\",{extend:\"Ext.data.Model\",idProperty:\"hi!\",fields:[],proxy:{type:\"direct\",idParam:\"hi!\"}});/");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "belongsTo" + "'", str5, "belongsTo");
    }

    @Test
    public void test05274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05274");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("/Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"debug\",type:\"boolean\"},{name:\"useSingleQuotes\",type:\"boolean\"},{name:\"surroundApiWithQuotes\",type:\"boolean\"}]}});/", (java.lang.Integer) 1, (java.lang.Integer) 32);
    }

    @Test
    public void test05275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05275");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.read = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.update = "";
        apiObject0.read = "json";
        java.lang.String str12 = apiObject0.create;
        java.lang.String str13 = apiObject0.update;
        apiObject0.destroy = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});";
        apiObject0.create = "inclusion";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str12, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test05276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05276");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("Ext.define(\"null\",{extend:\"Ext.data.Model\",idProperty:\"hi!\",fields:[],proxy:{type:\"direct\",idParam:\"hi!\"}});", "ch.rasc.extclassgenerator.ModelAnnotationProcessor");
        java.lang.Object obj3 = modelFieldBean2.getReference();
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test05277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05277");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        java.lang.String str6 = referenceBean0.getParent();
        boolean boolean7 = referenceBean0.hasAnyProperties();
        java.lang.String str8 = referenceBean0.getType();
        referenceBean0.setRole("/Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});/");
        java.lang.String str11 = referenceBean0.getType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test05278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05278");
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
        modelFieldBean2.setReference((java.lang.Object) 0L);
        modelFieldBean2.setCritical((java.lang.Boolean) false);
        java.lang.String str35 = modelFieldBean2.getMapping();
        modelFieldBean2.setPersist((java.lang.Boolean) false);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test05279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05279");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        ch.rasc.extclassgenerator.validation.GenericValidation genericValidation3 = new ch.rasc.extclassgenerator.validation.GenericValidation("/Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});/", "/Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"debug\",type:\"boolean\"},{name:\"useSingleQuotes\",type:\"boolean\"},{name:\"surroundApiWithQuotes\",type:\"boolean\"}]}});/", strMap2);
    }

    @Test
    public void test05280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05280");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});", "ch.rasc.extclassgenerator.ModelAnnotationProcessor");
        modelFieldBean2.setAllowNull((java.lang.Boolean) true);
        modelFieldBean2.setName("/Ext.define(\"null\",{extend:\"Ext.data.Model\",idProperty:\"hi!\",fields:[],proxy:{type:\"direct\",idParam:\"hi!\"}});/");
    }

    @Test
    public void test05281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05281");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        java.lang.String str6 = referenceBean0.getAssociation();
        referenceBean0.setInverse("");
        java.lang.String str9 = referenceBean0.getParent();
        java.lang.String str10 = referenceBean0.getRole();
        java.lang.String str11 = referenceBean0.getChild();
        java.lang.String str12 = referenceBean0.getInverse();
        referenceBean0.setInverse("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
        referenceBean0.setChild("Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"debug\",\n    type : \"boolean\"\n  }, {\n    name : \"useSingleQuotes\",\n    type : \"boolean\"\n  }, {\n    name : \"surroundApiWithQuotes\",\n    type : \"boolean\"\n  } ]\n});");
        referenceBean0.setType("/\\/belongsTo\\//");
        referenceBean0.setAssociation("/\\/range\\//");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test05282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05282");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        java.lang.Boolean boolean1 = allDataOptionsBean0.getPersist();
        java.lang.Boolean boolean2 = allDataOptionsBean0.getPersist();
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean4 = allDataOptionsBean0.getCritical();
        java.lang.Boolean boolean5 = allDataOptionsBean0.getChanges();
        allDataOptionsBean0.setCritical((java.lang.Boolean) false);
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNull(boolean5);
    }

    @Test
    public void test05283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05283");
        ch.rasc.extclassgenerator.validation.ExclusionValidation exclusionValidation2 = new ch.rasc.extclassgenerator.validation.ExclusionValidation("Ext.define(\"ch.rasc.extclassgenerator.association.HasOneAssociation\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"setterName\",type:\"string\"},{name:\"getterName\",type:\"string\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]}});", "digits");
    }

    @Test
    public void test05284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05284");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getChild();
        java.lang.String str2 = referenceBean0.getChild();
        referenceBean0.setType("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        boolean boolean5 = referenceBean0.hasAnyProperties();
        java.lang.String str6 = referenceBean0.getType();
        referenceBean0.setChild("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        boolean boolean9 = referenceBean0.hasAnyProperties();
        java.lang.String str10 = referenceBean0.getParent();
        referenceBean0.setParent("Ext.data.Model");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});" + "'", str6, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test05285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05285");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("/hasMany/", (java.lang.Integer) 52, (java.lang.Integer) 35);
    }

    @Test
    public void test05286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05286");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean4 = allDataOptionsBean0.getPersist();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        allDataOptionsBean0.setPersist((java.lang.Boolean) false);
        java.lang.Boolean boolean9 = allDataOptionsBean0.getPersist();
        java.lang.Boolean boolean10 = allDataOptionsBean0.getPersist();
        java.lang.Boolean boolean11 = allDataOptionsBean0.getPersist();
        allDataOptionsBean0.setCritical((java.lang.Boolean) false);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + false + "'", boolean9, false);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + false + "'", boolean10, false);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + false + "'", boolean11, false);
    }

    @Test
    public void test05287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05287");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.data.Model");
        modelFieldBean2.setAllowNull((java.lang.Boolean) false);
        java.lang.String str5 = modelFieldBean2.getCalculate();
        modelFieldBean2.setUseNull((java.lang.Boolean) false);
        java.lang.String str8 = modelFieldBean2.getDateFormat();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test05288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05288");
        ch.rasc.extclassgenerator.validation.InclusionValidation inclusionValidation2 = new ch.rasc.extclassgenerator.validation.InclusionValidation("hi!", "json");
        java.lang.String str3 = inclusionValidation2.getField();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test05289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05289");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});");
        java.lang.Boolean boolean2 = hasManyAssociation1.getAutoLoad();
        org.junit.Assert.assertNull(boolean2);
    }

    @Test
    public void test05290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05290");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        java.lang.String str2 = hasOneAssociation1.getName();
        hasOneAssociation1.setInstanceName("");
        hasOneAssociation1.setName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        hasOneAssociation1.setGetterName("belongsTo");
        hasOneAssociation1.setGetterName("/\\/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});\\//");
        hasOneAssociation1.setSetterName("/ch.rasc.extclassgenerator.ModelAnnotationProcessor/");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test05291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05291");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        java.lang.String str6 = modelFieldBean2.getMapping();
        modelFieldBean2.setCritical((java.lang.Boolean) true);
        java.lang.String str9 = modelFieldBean2.getName();
        java.util.List<java.lang.String> strList10 = modelFieldBean2.getDepends();
        java.lang.Boolean boolean11 = modelFieldBean2.getUseNull();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(strList10);
        org.junit.Assert.assertNull(boolean11);
    }

    @Test
    public void test05292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05292");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        java.lang.String str6 = modelFieldBean2.getMapping();
        modelFieldBean2.setCritical((java.lang.Boolean) true);
        java.lang.String str9 = modelFieldBean2.getName();
        java.util.List<java.lang.String> strList10 = modelFieldBean2.getDepends();
        modelFieldBean2.setUnique((java.lang.Boolean) true);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(strList10);
    }

    @Test
    public void test05293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05293");
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
        java.lang.String str25 = apiObject0.update;
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ {\n      name : \"debug\",\n      type : \"boolean\"\n    }, {\n      name : \"useSingleQuotes\",\n      type : \"boolean\"\n    }, {\n      name : \"surroundApiWithQuotes\",\n      type : \"boolean\"\n    } ]\n  }\n});";
        java.lang.String str28 = apiObject0.read;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "json" + "'", str10, "json");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/" + "'", str12, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.LineEnding\",{extend:\"Ext.data.Model\",config:{fields:[]}});" + "'", str25, "Ext.define(\"ch.rasc.extclassgenerator.LineEnding\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[],proxy:{type:\"direct\",directFn:hi!}});" + "'", str28, "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[],proxy:{type:\"direct\",directFn:hi!}});");
    }

    @Test
    public void test05294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05294");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        java.lang.String str10 = referenceBean0.getParent();
        referenceBean0.setType("Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
        referenceBean0.setParent("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});/");
        referenceBean0.setInverse("length");
        java.lang.String str17 = referenceBean0.getChild();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test05295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05295");
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
        javax.lang.model.SourceVersion sourceVersion14 = modelAnnotationProcessor0.getSupportedSourceVersion();
        java.util.Set<java.lang.String> strSet15 = modelAnnotationProcessor0.getSupportedOptions();
        javax.lang.model.element.Element element16 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror17 = null;
        javax.lang.model.element.ExecutableElement executableElement18 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable20 = modelAnnotationProcessor0.getCompletions(element16, annotationMirror17, executableElement18, "/Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});/");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertTrue("'" + sourceVersion2 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion2.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(wildcardIterable8);
        org.junit.Assert.assertNotNull(wildcardIterable13);
        org.junit.Assert.assertTrue("'" + sourceVersion14 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion14.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(wildcardIterable20);
    }

    @Test
    public void test05296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05296");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getChild();
        java.lang.String str2 = referenceBean0.getChild();
        referenceBean0.setAssociation("creditCardNumber");
        referenceBean0.setType("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        java.lang.String str7 = referenceBean0.getInverse();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test05297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05297");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("Ext.define(\"ch.rasc.extclassgenerator.validation.PresenceValidation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"field\",\n    type : \"string\"\n  } ]\n});", (java.lang.Long) 1L, (java.lang.Long) 0L);
    }

    @Test
    public void test05298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05298");
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation3 = new ch.rasc.extclassgenerator.validation.RangeValidation("inclusion", (java.lang.Long) 32L, (java.lang.Long) 32L);
        java.math.BigDecimal bigDecimal4 = rangeValidation3.getMax();
        java.math.BigDecimal bigDecimal5 = rangeValidation3.getMax();
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
    }

    @Test
    public void test05299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05299");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        java.lang.Boolean boolean1 = allDataOptionsBean0.getCritical();
        java.lang.Boolean boolean2 = allDataOptionsBean0.getCritical();
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNull(boolean2);
    }

    @Test
    public void test05300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05300");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Object obj5 = modelFieldBean2.getReference();
        ch.rasc.extclassgenerator.ModelType modelType6 = modelFieldBean2.getModelType();
        modelFieldBean2.setCritical((java.lang.Boolean) true);
        java.lang.String str9 = modelFieldBean2.getCalculate();
        modelFieldBean2.setUnique((java.lang.Boolean) false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(modelType6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test05301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05301");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean4 = allDataOptionsBean0.getPersist();
        java.lang.Boolean boolean5 = allDataOptionsBean0.getPersist();
        java.lang.Boolean boolean6 = allDataOptionsBean0.getCritical();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        allDataOptionsBean0.setAssociated((java.lang.Boolean) true);
        allDataOptionsBean0.setPersist((java.lang.Boolean) true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean6);
    }

    @Test
    public void test05302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05302");
        ch.rasc.extclassgenerator.validation.FormatValidation formatValidation2 = new ch.rasc.extclassgenerator.validation.FormatValidation("Ext.define(\"ch.rasc.extclassgenerator.validation.InclusionValidation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"list\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"field\",\n    type : \"string\"\n  } ]\n});", "Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[],proxy:{type:\"direct\",directFn:hi!,writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",config:{fields:[]}});\"}}}});");
    }

    @Test
    public void test05303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05303");
        ch.rasc.extclassgenerator.validation.NotBlankValidation notBlankValidation1 = new ch.rasc.extclassgenerator.validation.NotBlankValidation("ch.rasc.extclassgenerator.association.HasManyAssociation");
    }

    @Test
    public void test05304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05304");
        ch.rasc.extclassgenerator.validation.PresenceValidation presenceValidation1 = new ch.rasc.extclassgenerator.validation.PresenceValidation("/\\/hasMany\\//");
    }

    @Test
    public void test05305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05305");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        ch.rasc.extclassgenerator.validation.GenericValidation genericValidation3 = new ch.rasc.extclassgenerator.validation.GenericValidation("hasOne", "hasOne", strMap2);
    }

    @Test
    public void test05306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05306");
        ch.rasc.extclassgenerator.validation.CreditCardNumberValidation creditCardNumberValidation1 = new ch.rasc.extclassgenerator.validation.CreditCardNumberValidation("Ext.define(\"ch.rasc.extclassgenerator.LineEnding\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
    }

    @Test
    public void test05307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05307");
        ch.rasc.extclassgenerator.OutputConfig outputConfig0 = new ch.rasc.extclassgenerator.OutputConfig();
        boolean boolean1 = outputConfig0.isDebug();
        boolean boolean2 = outputConfig0.isSurroundApiWithQuotes();
        ch.rasc.extclassgenerator.IncludeValidation includeValidation3 = outputConfig0.getIncludeValidation();
        ch.rasc.extclassgenerator.LineEnding lineEnding4 = outputConfig0.getLineEnding();
        boolean boolean5 = outputConfig0.isDebug();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(includeValidation3);
        org.junit.Assert.assertNull(lineEnding4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test05308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05308");
        ch.rasc.extclassgenerator.validation.DigitsValidation digitsValidation3 = new ch.rasc.extclassgenerator.validation.DigitsValidation("Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});", 32, (int) ' ');
        int int4 = digitsValidation3.getInteger();
        int int5 = digitsValidation3.getFraction();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test05309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05309");
        ch.rasc.extclassgenerator.validation.InclusionValidation inclusionValidation2 = new ch.rasc.extclassgenerator.validation.InclusionValidation("Ext.define(\"ch.rasc.extclassgenerator.association.HasOneAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"setterName\",\n    type : \"string\"\n  }, {\n    name : \"getterName\",\n    type : \"string\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});", "Ext.define(\"null\",{extend:\"\",fields:[]});");
        java.lang.String str3 = inclusionValidation2.getList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"null\",{extend:\"\",fields:[]});" + "'", str3, "Ext.define(\"null\",{extend:\"\",fields:[]});");
    }

    @Test
    public void test05310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05310");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("hi!");
        java.lang.String str2 = hasManyAssociation1.getAssociationKey();
        hasManyAssociation1.setAssociationKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        hasManyAssociation1.setAssociationKey("");
        hasManyAssociation1.setPrimaryKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str9 = hasManyAssociation1.getModel();
        hasManyAssociation1.setAutoLoad((java.lang.Boolean) false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test05311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05311");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getType();
        referenceBean0.setRole("Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});");
        boolean boolean4 = referenceBean0.hasAnyProperties();
        java.lang.String str5 = referenceBean0.getAssociation();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test05312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05312");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.read;
        apiObject0.update = "hi!";
        apiObject0.update = "ch.rasc.extclassgenerator.ModelAnnotationProcessor";
        apiObject0.destroy = "/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/";
        java.lang.String str10 = apiObject0.update;
        java.lang.String str11 = apiObject0.create;
        apiObject0.create = "/Ext.define(\"null\",{extend:\"Ext.data.Model\",idProperty:\"hi!\",fields:[],proxy:{type:\"direct\",idParam:\"hi!\"}});/";
        java.lang.String str14 = apiObject0.create;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ch.rasc.extclassgenerator.ModelAnnotationProcessor" + "'", str10, "ch.rasc.extclassgenerator.ModelAnnotationProcessor");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/Ext.define(\"null\",{extend:\"Ext.data.Model\",idProperty:\"hi!\",fields:[],proxy:{type:\"direct\",idParam:\"hi!\"}});/" + "'", str14, "/Ext.define(\"null\",{extend:\"Ext.data.Model\",idProperty:\"hi!\",fields:[],proxy:{type:\"direct\",idParam:\"hi!\"}});/");
    }

    @Test
    public void test05313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05313");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        java.lang.String str10 = referenceBean0.getType();
        java.lang.String str11 = referenceBean0.getParent();
        referenceBean0.setType("Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
        referenceBean0.setAssociation("hasOne");
        java.lang.String str16 = referenceBean0.getParent();
        java.lang.String str17 = referenceBean0.getRole();
        boolean boolean18 = referenceBean0.typeOnly();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test05314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05314");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        java.lang.String str6 = referenceBean0.getInverse();
        java.lang.String str7 = referenceBean0.getParent();
        referenceBean0.setParent("ch.rasc.extclassgenerator.ModelBean");
        boolean boolean10 = referenceBean0.typeOnly();
        referenceBean0.setAssociation("Ext.define(\"null\",\r\n{\n  extend : \"\",\n  config : {\n    fields : [ ],\n    proxy : {\n      type : \"direct\",\n      api : {\n        create : Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});\n      },\n      reader : {\n        messageProperty : \"hi!\"\n      }\n    }\n  }\n});");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test05315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05315");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getChild();
        java.lang.String str3 = referenceBean0.getChild();
        referenceBean0.setRole("hi!");
        referenceBean0.setChild("creditCardNumber");
        boolean boolean8 = referenceBean0.hasAnyProperties();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test05316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05316");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("Ext.define(\"ch.rasc.extclassgenerator.validation.PresenceValidation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"field\",\n    type : \"string\"\n  } ]\n});", (java.lang.Long) 0L, (java.lang.Long) 52L);
    }

    @Test
    public void test05317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05317");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        modelFieldBean2.setCritical((java.lang.Boolean) false);
        ch.rasc.extclassgenerator.ModelType modelType9 = modelFieldBean2.getModelType();
        java.lang.String str10 = modelFieldBean2.getDateFormat();
        modelFieldBean2.setUseNull((java.lang.Boolean) false);
        org.junit.Assert.assertNull(modelType9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test05318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05318");
        ch.rasc.extclassgenerator.validation.DigitsValidation digitsValidation3 = new ch.rasc.extclassgenerator.validation.DigitsValidation("", 1, (int) (short) 10);
    }

    @Test
    public void test05319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05319");
        ch.rasc.extclassgenerator.validation.EmailValidation emailValidation1 = new ch.rasc.extclassgenerator.validation.EmailValidation("Ext.define(\"ch.rasc.extclassgenerator.AllDataOptionsBean\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ {\n      name : \"associated\",\n      type : \"boolean\"\n    }, {\n      name : \"changes\",\n      type : \"boolean\"\n    }, {\n      name : \"critical\",\n      type : \"boolean\"\n    }, {\n      name : \"persist\",\n      type : \"boolean\"\n    } ]\n  }\n});");
    }

    @Test
    public void test05320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05320");
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation3 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});/", (java.lang.Long) 0L, (java.lang.Long) 100L);
    }

    @Test
    public void test05321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05321");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        java.lang.Boolean boolean1 = allDataOptionsBean0.getPersist();
        java.lang.Boolean boolean2 = allDataOptionsBean0.getPersist();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean5 = allDataOptionsBean0.getCritical();
        java.lang.Boolean boolean6 = allDataOptionsBean0.getPersist();
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean6);
    }

    @Test
    public void test05322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05322");
        ch.rasc.extclassgenerator.validation.FormatValidation formatValidation2 = new ch.rasc.extclassgenerator.validation.FormatValidation("future", "Ext.define(\"ch.rasc.extclassgenerator.AllDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});");
    }

    @Test
    public void test05323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05323");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Object obj5 = modelFieldBean2.getReference();
        modelFieldBean2.setPersist((java.lang.Boolean) false);
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        ch.rasc.extclassgenerator.ModelType modelType10 = modelFieldBean2.getModelType();
        modelFieldBean2.setDateFormat("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean15 = new ch.rasc.extclassgenerator.ModelFieldBean("/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/", "range");
        modelFieldBean15.setUseNull((java.lang.Boolean) false);
        modelFieldBean2.setDefaultValue((java.lang.Object) false);
        modelFieldBean2.setDateFormat("/range/");
        ch.rasc.extclassgenerator.validation.FormatValidation formatValidation23 = new ch.rasc.extclassgenerator.validation.FormatValidation("length", "belongsTo");
        modelFieldBean2.setReference((java.lang.Object) "length");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(modelType10);
    }

    @Test
    public void test05324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05324");
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation3 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});/", (java.lang.Long) 52L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal4 = rangeValidation3.getMin();
        org.junit.Assert.assertNotNull(bigDecimal4);
    }

    @Test
    public void test05325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05325");
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
        java.lang.String str23 = modelFieldBean2.getType();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str23, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
    }

    @Test
    public void test05326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05326");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("");
        java.lang.String str2 = belongsToAssociation1.getInstanceName();
        belongsToAssociation1.setGetterName("json");
        java.lang.String str5 = belongsToAssociation1.getSetterName();
        belongsToAssociation1.setSetterName("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        java.lang.String str8 = belongsToAssociation1.getGetterName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "json" + "'", str8, "json");
    }

    @Test
    public void test05327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05327");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getRole();
        referenceBean0.setChild("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        referenceBean0.setAssociation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        referenceBean0.setRole("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        referenceBean0.setChild("hi!");
        java.lang.String str11 = referenceBean0.getInverse();
        java.lang.String str12 = referenceBean0.getInverse();
        referenceBean0.setParent("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str15 = referenceBean0.getType();
        java.lang.String str16 = referenceBean0.getAssociation();
        referenceBean0.setChild("Ext.define(\"ch.rasc.extclassgenerator.validation.InclusionValidation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"list\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"field\",\n    type : \"string\"\n  } ]\n});");
        boolean boolean19 = referenceBean0.hasAnyProperties();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});" + "'", str16, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test05328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05328");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getRole();
        referenceBean0.setChild("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        referenceBean0.setRole("json");
        java.lang.String str7 = referenceBean0.getAssociation();
        java.lang.String str8 = referenceBean0.getParent();
        referenceBean0.setType("Ext.data.Model");
        referenceBean0.setChild("");
        java.lang.String str13 = referenceBean0.getChild();
        java.lang.String str14 = referenceBean0.getType();
        referenceBean0.setParent("creditCardNumber");
        java.lang.String str17 = referenceBean0.getInverse();
        java.lang.String str18 = referenceBean0.getAssociation();
        referenceBean0.setInverse("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Ext.data.Model" + "'", str14, "Ext.data.Model");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test05329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05329");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        hasOneAssociation1.setGetterName("hi!");
        hasOneAssociation1.setSetterName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str6 = hasOneAssociation1.getName();
        hasOneAssociation1.setForeignKey("exclusion");
        hasOneAssociation1.setSetterName("Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
        java.lang.String str11 = hasOneAssociation1.getPrimaryKey();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test05330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05330");
        ch.rasc.extclassgenerator.validation.InclusionValidation inclusionValidation2 = new ch.rasc.extclassgenerator.validation.InclusionValidation("Ext.define(\"ch.rasc.extclassgenerator.validation.PresenceValidation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"field\",\n    type : \"string\"\n  } ]\n});", "/range/");
    }

    @Test
    public void test05331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05331");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        boolean boolean2 = referenceBean0.hasAnyProperties();
        java.lang.String str3 = referenceBean0.getAssociation();
        java.lang.String str4 = referenceBean0.getAssociation();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test05332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05332");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        modelBean0.setAutodetectTypes(true);
        modelBean0.setReadMethod("/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/");
        java.lang.String str7 = modelBean0.getRootProperty();
        modelBean0.setCreateMethod("");
        modelBean0.setUpdateMethod("inclusion");
        java.util.Map<java.lang.String, ch.rasc.extclassgenerator.ModelFieldBean> strMap12 = modelBean0.getFields();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test05333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05333");
        ch.rasc.extclassgenerator.ModelAnnotationProcessor modelAnnotationProcessor0 = new ch.rasc.extclassgenerator.ModelAnnotationProcessor();
        java.util.Set<java.lang.String> strSet1 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        java.util.Set<java.lang.String> strSet2 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        javax.lang.model.SourceVersion sourceVersion3 = modelAnnotationProcessor0.getSupportedSourceVersion();
        java.util.Set<java.lang.String> strSet4 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        java.util.Set<java.lang.String> strSet5 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        javax.lang.model.SourceVersion sourceVersion6 = modelAnnotationProcessor0.getSupportedSourceVersion();
        javax.lang.model.element.Element element7 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror8 = null;
        javax.lang.model.element.ExecutableElement executableElement9 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable11 = modelAnnotationProcessor0.getCompletions(element7, annotationMirror8, executableElement9, "/Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});/");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + sourceVersion3 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion3.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + sourceVersion6 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion6.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(wildcardIterable11);
    }

    @Test
    public void test05334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05334");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getChild();
        java.lang.String str2 = referenceBean0.getChild();
        referenceBean0.setAssociation("creditCardNumber");
        referenceBean0.setType("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        java.lang.String str7 = referenceBean0.getType();
        boolean boolean8 = referenceBean0.typeOnly();
        referenceBean0.setType("/hasMany/");
        boolean boolean11 = referenceBean0.typeOnly();
        referenceBean0.setAssociation("Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
        java.lang.String str14 = referenceBean0.getAssociation();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});" + "'", str7, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});" + "'", str14, "Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
    }

    @Test
    public void test05335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05335");
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
        java.lang.Boolean boolean23 = modelFieldBean2.getAllowBlank();
        modelFieldBean2.setCritical((java.lang.Boolean) true);
        java.lang.Boolean boolean26 = modelFieldBean2.getUseNull();
        ch.rasc.extclassgenerator.ModelType modelType27 = modelFieldBean2.getModelType();
        java.lang.String str28 = modelFieldBean2.getType();
        modelFieldBean2.setConvert("Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(boolean23);
        org.junit.Assert.assertNull(boolean26);
        org.junit.Assert.assertNull(modelType27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str28, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
    }

    @Test
    public void test05336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05336");
        ch.rasc.extclassgenerator.OutputConfig outputConfig0 = new ch.rasc.extclassgenerator.OutputConfig();
        boolean boolean1 = outputConfig0.isDebug();
        ch.rasc.extclassgenerator.OutputFormat outputFormat2 = outputConfig0.getOutputFormat();
        boolean boolean3 = outputConfig0.isDebug();
        ch.rasc.extclassgenerator.OutputFormat outputFormat4 = outputConfig0.getOutputFormat();
        ch.rasc.extclassgenerator.OutputFormat outputFormat5 = outputConfig0.getOutputFormat();
        outputConfig0.setSurroundApiWithQuotes(true);
        outputConfig0.setSurroundApiWithQuotes(true);
        outputConfig0.setDebug(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(outputFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(outputFormat4);
        org.junit.Assert.assertNull(outputFormat5);
    }

    @Test
    public void test05337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05337");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getChild();
        java.lang.String str2 = referenceBean0.getChild();
        referenceBean0.setAssociation("creditCardNumber");
        referenceBean0.setType("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        java.lang.String str7 = referenceBean0.getType();
        boolean boolean8 = referenceBean0.typeOnly();
        java.lang.String str9 = referenceBean0.getRole();
        java.lang.String str10 = referenceBean0.getRole();
        java.lang.String str11 = referenceBean0.getAssociation();
        java.lang.String str12 = referenceBean0.getRole();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});" + "'", str7, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "creditCardNumber" + "'", str11, "creditCardNumber");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test05338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05338");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("hi!");
        hasManyAssociation1.setAssociationKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str4 = hasManyAssociation1.getInstanceName();
        hasManyAssociation1.setName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        hasManyAssociation1.setPrimaryKey("");
        java.lang.Boolean boolean9 = hasManyAssociation1.getAutoLoad();
        java.lang.String str10 = hasManyAssociation1.getName();
        hasManyAssociation1.setName("ch.rasc.extclassgenerator.association.HasManyAssociation");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str10, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
    }

    @Test
    public void test05339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05339");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        java.lang.String str2 = hasOneAssociation1.getName();
        hasOneAssociation1.setInstanceName("");
        java.lang.String str5 = hasOneAssociation1.getForeignKey();
        java.lang.String str6 = hasOneAssociation1.getGetterName();
        java.lang.String str7 = hasOneAssociation1.getSetterName();
        hasOneAssociation1.setName("/Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});/");
        hasOneAssociation1.setGetterName("/\\/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});\\//");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test05340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05340");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[],proxy:{type:\"direct\",directFn:hi!,writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",config:{fields:[]}});\"}}}});");
        java.lang.String str2 = hasManyAssociation1.getModel();
        java.lang.String str3 = hasManyAssociation1.getModel();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[],proxy:{type:\"direct\",directFn:hi!,writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",config:{fields:[]}});\"}}}});" + "'", str2, "Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[],proxy:{type:\"direct\",directFn:hi!,writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",config:{fields:[]}});\"}}}});");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[],proxy:{type:\"direct\",directFn:hi!,writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",config:{fields:[]}});\"}}}});" + "'", str3, "Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[],proxy:{type:\"direct\",directFn:hi!,writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",config:{fields:[]}});\"}}}});");
    }

    @Test
    public void test05341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05341");
        ch.rasc.extclassgenerator.validation.PresenceValidation presenceValidation1 = new ch.rasc.extclassgenerator.validation.PresenceValidation("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});");
    }

    @Test
    public void test05342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05342");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});";
        apiObject0.update = "json";
        apiObject0.destroy = "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/";
        java.lang.String str10 = apiObject0.update;
        apiObject0.read = "format";
        apiObject0.destroy = "inclusion";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "json" + "'", str10, "json");
    }

    @Test
    public void test05343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05343");
        ch.rasc.extclassgenerator.validation.PastValidation pastValidation1 = new ch.rasc.extclassgenerator.validation.PastValidation("Ext.define(\"null\",\r\n{\n  extend : \"\",\n  fields : [ ],\n  hasMany : [ \"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\", \"json\", \"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\", \"\" ]\n});");
    }

    @Test
    public void test05344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05344");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        java.lang.String str3 = modelBean0.getReadMethod();
        java.lang.String str4 = modelBean0.getDestroyMethod();
        java.lang.String str5 = modelBean0.getReadMethod();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test05345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05345");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        modelFieldBean2.setCritical((java.lang.Boolean) false);
        java.lang.Boolean boolean7 = modelFieldBean2.getUnique();
        modelFieldBean2.setConvert("");
        modelFieldBean2.setAllowBlank((java.lang.Boolean) false);
        org.junit.Assert.assertNull(boolean7);
    }

    @Test
    public void test05346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05346");
        ch.rasc.extclassgenerator.ModelAnnotationProcessor modelAnnotationProcessor0 = new ch.rasc.extclassgenerator.ModelAnnotationProcessor();
        java.util.Set<java.lang.String> strSet1 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        java.util.Set<java.lang.String> strSet2 = modelAnnotationProcessor0.getSupportedOptions();
        javax.lang.model.element.Element element3 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror4 = null;
        javax.lang.model.element.ExecutableElement executableElement5 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable7 = modelAnnotationProcessor0.getCompletions(element3, annotationMirror4, executableElement5, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.util.Set<java.lang.String> strSet8 = modelAnnotationProcessor0.getSupportedOptions();
        javax.lang.model.SourceVersion sourceVersion9 = modelAnnotationProcessor0.getSupportedSourceVersion();
        javax.lang.model.element.Element element10 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror11 = null;
        javax.lang.model.element.ExecutableElement executableElement12 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable14 = modelAnnotationProcessor0.getCompletions(element10, annotationMirror11, executableElement12, "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ {\n      name : \"autoLoad\",\n      type : \"boolean\"\n    }, {\n      name : \"name\",\n      type : \"string\"\n    }, {\n      name : \"type\",\n      type : \"string\"\n    }, {\n      name : \"model\",\n      type : \"string\"\n    }, {\n      name : \"associationKey\",\n      type : \"string\"\n    }, {\n      name : \"foreignKey\",\n      type : \"string\"\n    }, {\n      name : \"primaryKey\",\n      type : \"string\"\n    }, {\n      name : \"instanceName\",\n      type : \"string\"\n    } ]\n  }\n});");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(wildcardIterable7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + sourceVersion9 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion9.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(wildcardIterable14);
    }

    @Test
    public void test05347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05347");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getChild();
        boolean boolean2 = referenceBean0.typeOnly();
        java.lang.String str3 = referenceBean0.getType();
        referenceBean0.setParent("Ext.define(\"null\",{extend:\"\",config:{fields:[]}});");
        boolean boolean6 = referenceBean0.typeOnly();
        referenceBean0.setType("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        referenceBean0.setInverse("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});/");
        java.lang.String str11 = referenceBean0.getAssociation();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test05348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05348");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getChild();
        java.lang.String str3 = referenceBean0.getChild();
        java.lang.String str4 = referenceBean0.getParent();
        referenceBean0.setInverse("hasOne");
        java.lang.String str7 = referenceBean0.getInverse();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hasOne" + "'", str7, "hasOne");
    }

    @Test
    public void test05349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05349");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});", "creditCardNumber");
        java.lang.Boolean boolean3 = modelFieldBean2.getPersist();
        java.lang.String str4 = modelFieldBean2.getCalculate();
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test05350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05350");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray14 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList12);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray15 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("", (java.util.List<java.lang.String>) strList12);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray16 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("json", (java.util.List<java.lang.String>) strList12);
        java.util.List<java.lang.String> strList17 = exclusionValidationArray16.getList();
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray18 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("exclusion", strList17);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray19 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", strList17);
        java.util.List<java.lang.String> strList20 = exclusionValidationArray19.getList();
        java.util.List<java.lang.String> strList21 = exclusionValidationArray19.getList();
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray22 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});", strList21);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray23 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});", strList21);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray24 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("email", strList21);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray25 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("Ext.define('Ext.define('ch.rasc.extclassgenerator.association.HasManyAssociation',\n{\n  extend : 'Ext.data.Model',\n  fields : [ {\n    name : 'autoLoad',\n    type : 'boolean'\n  }, {\n    name : 'name',\n    type : 'string'\n  }, {\n    name : 'type',\n    type : 'string'\n  }, {\n    name : 'model',\n    type : 'string'\n  }, {\n    name : 'associationKey',\n    type : 'string'\n  }, {\n    name : 'foreignKey',\n    type : 'string'\n  }, {\n    name : 'primaryKey',\n    type : 'string'\n  }, {\n    name : 'instanceName',\n    type : 'string'\n  } ]\n});',{extend:'',uses:['hi!'],fields:[],associations:[{type:'hasMany',model:'hi!'},{type:'hasMany',model:'hi!',associationKey:'Ext.define(\\'ch.rasc.extclassgenerator.ModelAnnotationProcessor\\',{extend:\\'Ext.data.Model\\',fields:[]});'},{type:'hasMany',model:'hi!',associationKey:'Ext.define(\\'ch.rasc.extclassgenerator.ModelAnnotationProcessor\\',{extend:\\'Ext.data.Model\\',fields:[]});'},{type:'hasMany',model:'hi!',foreignKey:''}]});", strList21);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList21);
    }

    @Test
    public void test05351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05351");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("/Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"debug\",type:\"boolean\"},{name:\"useSingleQuotes\",type:\"boolean\"},{name:\"surroundApiWithQuotes\",type:\"boolean\"}]}});/", (java.lang.Integer) 32, (java.lang.Integer) 0);
    }

    @Test
    public void test05352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05352");
        ch.rasc.extclassgenerator.validation.EmailValidation emailValidation1 = new ch.rasc.extclassgenerator.validation.EmailValidation("Ext.define(\"ch.rasc.extclassgenerator.association.HasOneAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ {\n      name : \"setterName\",\n      type : \"string\"\n    }, {\n      name : \"getterName\",\n      type : \"string\"\n    }, {\n      name : \"name\",\n      type : \"string\"\n    }, {\n      name : \"type\",\n      type : \"string\"\n    }, {\n      name : \"model\",\n      type : \"string\"\n    }, {\n      name : \"associationKey\",\n      type : \"string\"\n    }, {\n      name : \"foreignKey\",\n      type : \"string\"\n    }, {\n      name : \"primaryKey\",\n      type : \"string\"\n    }, {\n      name : \"instanceName\",\n      type : \"string\"\n    } ]\n  }\n});");
    }

    @Test
    public void test05353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05353");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean4 = allDataOptionsBean0.getPersist();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        allDataOptionsBean0.setPersist((java.lang.Boolean) false);
        java.lang.Boolean boolean9 = allDataOptionsBean0.getPersist();
        java.lang.Boolean boolean10 = allDataOptionsBean0.getCritical();
        allDataOptionsBean0.setChanges((java.lang.Boolean) true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + false + "'", boolean9, false);
        org.junit.Assert.assertNull(boolean10);
    }

    @Test
    public void test05354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05354");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        ch.rasc.extclassgenerator.validation.GenericValidation genericValidation3 = new ch.rasc.extclassgenerator.validation.GenericValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelFieldBean\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"dateFormat\",type:\"string\"},{name:\"useNull\",type:\"boolean\"},{name:\"allowNull\",type:\"boolean\"},{name:\"mapping\",type:\"string\"},{name:\"persist\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"convert\",type:\"string\"},{name:\"calculate\",type:\"string\"},{name:\"allowBlank\",type:\"boolean\"},{name:\"unique\",type:\"boolean\"}]}});", "Ext.define(\"ch.rasc.extclassgenerator.validation.PresenceValidation\",{extend:\"Ext.data.Model\",fields:[{name:\"type\",type:\"string\"},{name:\"field\",type:\"string\"}]});", strMap2);
    }

    @Test
    public void test05355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05355");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        java.lang.String str3 = modelBean0.getIdProperty();
        modelBean0.setTotalProperty("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        boolean boolean6 = modelBean0.isClientIdPropertyAddToWriter();
        java.lang.String str7 = modelBean0.getTotalProperty();
        modelBean0.setClientIdPropertyAddToWriter(false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str7, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
    }

    @Test
    public void test05356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05356");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
        hasOneAssociation1.setGetterName("Ext.define(\"ch.rasc.extclassgenerator.validation.InclusionValidation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"list\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"field\",\n    type : \"string\"\n  } ]\n});");
    }

    @Test
    public void test05357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05357");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getRole();
        referenceBean0.setChild("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        java.lang.String str5 = referenceBean0.getType();
        referenceBean0.setParent("hi!");
        java.lang.String str8 = referenceBean0.getInverse();
        java.lang.String str9 = referenceBean0.getType();
        referenceBean0.setParent("Ext.define(\"ch.rasc.extclassgenerator.validation.InclusionValidationArray\",{extend:\"Ext.data.Model\",fields:[{name:\"type\",type:\"string\"},{name:\"field\",type:\"string\"}]});");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test05358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05358");
        ch.rasc.extclassgenerator.validation.ExclusionValidation exclusionValidation2 = new ch.rasc.extclassgenerator.validation.ExclusionValidation("/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/", "/\\/range\\//");
        java.lang.String str3 = exclusionValidation2.getList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/\\/range\\//" + "'", str3, "/\\/range\\//");
    }

    @Test
    public void test05359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05359");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        java.lang.String str6 = modelFieldBean2.getMapping();
        java.lang.String str7 = modelFieldBean2.getName();
        java.lang.String str8 = modelFieldBean2.getConvert();
        ch.rasc.extclassgenerator.ModelType modelType9 = modelFieldBean2.getModelType();
        ch.rasc.extclassgenerator.validation.PresenceValidation presenceValidation11 = new ch.rasc.extclassgenerator.validation.PresenceValidation("exclusion");
        modelFieldBean2.setDefaultValue((java.lang.Object) "exclusion");
        java.lang.String str13 = modelFieldBean2.getCalculate();
        modelFieldBean2.setUnique((java.lang.Boolean) true);
        java.lang.Boolean boolean16 = modelFieldBean2.getUseNull();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(modelType9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(boolean16);
    }

    @Test
    public void test05360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05360");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        java.lang.String str10 = referenceBean0.getParent();
        referenceBean0.setType("Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
        referenceBean0.setParent("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});/");
        referenceBean0.setType("Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[],proxy:{type:\"direct\",directFn:hi!}});");
        referenceBean0.setRole("/Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});/");
        referenceBean0.setRole("Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[],proxy:{type:\"direct\",directFn:hi!,writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",config:{fields:[]}});\"}}}});");
        java.lang.String str21 = referenceBean0.getParent();
        referenceBean0.setRole("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});/" + "'", str21, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});/");
    }

    @Test
    public void test05361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05361");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        java.lang.String str6 = referenceBean0.getAssociation();
        referenceBean0.setInverse("");
        java.lang.String str9 = referenceBean0.getParent();
        referenceBean0.setChild("digits");
        referenceBean0.setRole("/hi!/");
        java.lang.String str14 = referenceBean0.getInverse();
        referenceBean0.setAssociation("ch.rasc.extclassgenerator.ModelBean");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test05362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05362");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Object obj5 = modelFieldBean2.getReference();
        java.lang.String str6 = modelFieldBean2.getName();
        java.lang.String str7 = modelFieldBean2.getConvert();
        java.util.List<ch.rasc.extclassgenerator.validation.AbstractValidation> abstractValidationList8 = modelFieldBean2.getValidators();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(abstractValidationList8);
    }

    @Test
    public void test05363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05363");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        ch.rasc.extclassgenerator.validation.GenericValidation genericValidation3 = new ch.rasc.extclassgenerator.validation.GenericValidation("hasOne", "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[],proxy:{type:\"direct\",directFn:hi!}});", strMap2);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = genericValidation3.getOptions();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = genericValidation3.getOptions();
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strMap5);
    }

    @Test
    public void test05364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05364");
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
        java.lang.Object obj17 = modelFieldBean2.getReference();
        java.lang.String str18 = modelFieldBean2.getName();
        java.lang.String str19 = modelFieldBean2.getMapping();
        java.lang.Boolean boolean20 = modelFieldBean2.getPersist();
        modelFieldBean2.setUseNull((java.lang.Boolean) false);
        modelFieldBean2.setCalculate("/\\/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});\\//");
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(boolean20);
    }

    @Test
    public void test05365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05365");
        ch.rasc.extclassgenerator.validation.FormatValidation formatValidation2 = new ch.rasc.extclassgenerator.validation.FormatValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelFieldBean\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"dateFormat\",type:\"string\"},{name:\"useNull\",type:\"boolean\"},{name:\"allowNull\",type:\"boolean\"},{name:\"mapping\",type:\"string\"},{name:\"persist\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"convert\",type:\"string\"},{name:\"calculate\",type:\"string\"},{name:\"allowBlank\",type:\"boolean\"},{name:\"unique\",type:\"boolean\"}]}});", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
    }

    @Test
    public void test05366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05366");
        ch.rasc.extclassgenerator.validation.FutureValidation futureValidation1 = new ch.rasc.extclassgenerator.validation.FutureValidation("Ext.define(\"ch.rasc.extclassgenerator.association.HasOneAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"setterName\",\n    type : \"string\"\n  }, {\n    name : \"getterName\",\n    type : \"string\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
    }

    @Test
    public void test05367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05367");
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation3 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"null\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ],\n    proxy : {\n      type : \"direct\",\n      reader : {\n        type : \"Ext.define(\\\"java.util.ArrayList\\\",\\r\\n{\\n  extend : \\\"Ext.data.Model\\\",\\n  fields : [ ]\\n});\"\n      }\n    }\n  }\n});", (java.lang.Long) 10L, (java.lang.Long) 0L);
    }

    @Test
    public void test05368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05368");
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
        modelFieldBean2.setName("Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[],proxy:{type:\"direct\",directFn:hi!}});");
        modelFieldBean2.setMapping("");
        java.lang.Boolean boolean29 = modelFieldBean2.getUseNull();
        java.lang.String str30 = modelFieldBean2.getMapping();
        modelFieldBean2.setCritical((java.lang.Boolean) false);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + boolean29 + "' != '" + false + "'", boolean29, false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test05369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05369");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("inclusion", "/Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});/");
        ch.rasc.extclassgenerator.ModelType modelType3 = modelFieldBean2.getModelType();
        modelFieldBean2.setDateFormat("Ext.define('Ext.define('ch.rasc.extclassgenerator.association.HasManyAssociation',\n{\n  extend : 'Ext.data.Model',\n  fields : [ {\n    name : 'autoLoad',\n    type : 'boolean'\n  }, {\n    name : 'name',\n    type : 'string'\n  }, {\n    name : 'type',\n    type : 'string'\n  }, {\n    name : 'model',\n    type : 'string'\n  }, {\n    name : 'associationKey',\n    type : 'string'\n  }, {\n    name : 'foreignKey',\n    type : 'string'\n  }, {\n    name : 'primaryKey',\n    type : 'string'\n  }, {\n    name : 'instanceName',\n    type : 'string'\n  } ]\n});',{extend:'',uses:['hi!'],fields:[],associations:[{type:'hasMany',model:'hi!'},{type:'hasMany',model:'hi!',associationKey:'Ext.define(\\'ch.rasc.extclassgenerator.ModelAnnotationProcessor\\',{extend:\\'Ext.data.Model\\',fields:[]});'},{type:'hasMany',model:'hi!',associationKey:'Ext.define(\\'ch.rasc.extclassgenerator.ModelAnnotationProcessor\\',{extend:\\'Ext.data.Model\\',fields:[]});'},{type:'hasMany',model:'hi!',foreignKey:''}]});");
        org.junit.Assert.assertNull(modelType3);
    }

    @Test
    public void test05370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05370");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        java.lang.String str2 = hasOneAssociation1.getGetterName();
        hasOneAssociation1.setGetterName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        hasOneAssociation1.setForeignKey("hasOne");
        hasOneAssociation1.setForeignKey("Ext.data.Model");
        hasOneAssociation1.setAssociationKey("Ext.define(\"null\",\r\n{\n  extend : \"\",\n  idgen : \"Ext.define(\\\"java.util.ArrayList\\\",\\r\\n{\\n  extend : \\\"Ext.data.Model\\\",\\n  fields : [ ]\\n});\",\n  fields : [ ],\n  proxy : {\n    type : \"direct\",\n    reader : {\n      root : \"Ext.define(\\\"null\\\",{extend:\\\"Ext.data.Model\\\",idProperty:\\\"hi!\\\",fields:[],proxy:{type:\\\"direct\\\",idParam:\\\"hi!\\\"}});\",\n      messageProperty : \"hi!\"\n    },\n    writer : {\n      writeAllFields : false\n    }\n  }\n});");
        java.lang.String str11 = hasOneAssociation1.getType();
        hasOneAssociation1.setSetterName("Ext.define(\"ch.rasc.extclassgenerator.validation.InclusionValidationArray\",{extend:\"Ext.data.Model\",fields:[{name:\"type\",type:\"string\"},{name:\"field\",type:\"string\"}]});");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hasOne" + "'", str11, "hasOne");
    }

    @Test
    public void test05371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05371");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"debug\",\n    type : \"boolean\"\n  }, {\n    name : \"useSingleQuotes\",\n    type : \"boolean\"\n  }, {\n    name : \"surroundApiWithQuotes\",\n    type : \"boolean\"\n  } ]\n});");
        belongsToAssociation1.setGetterName("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]}});");
        java.lang.String str4 = belongsToAssociation1.getAssociationKey();
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test05372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05372");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("");
        java.lang.String str2 = belongsToAssociation1.getInstanceName();
        belongsToAssociation1.setGetterName("json");
        java.lang.String str5 = belongsToAssociation1.getSetterName();
        java.lang.String str6 = belongsToAssociation1.getGetterName();
        belongsToAssociation1.setGetterName("/Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});/");
        java.lang.Class<?> wildcardClass9 = belongsToAssociation1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "json" + "'", str6, "json");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test05373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05373");
        ch.rasc.extclassgenerator.validation.ExclusionValidation exclusionValidation2 = new ch.rasc.extclassgenerator.validation.ExclusionValidation("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ {\n      name : \"autoLoad\",\n      type : \"boolean\"\n    }, {\n      name : \"name\",\n      type : \"string\"\n    }, {\n      name : \"type\",\n      type : \"string\"\n    }, {\n      name : \"model\",\n      type : \"string\"\n    }, {\n      name : \"associationKey\",\n      type : \"string\"\n    }, {\n      name : \"foreignKey\",\n      type : \"string\"\n    }, {\n      name : \"primaryKey\",\n      type : \"string\"\n    }, {\n      name : \"instanceName\",\n      type : \"string\"\n    } ]\n  }\n});", "/\\/range\\//");
        java.lang.String str3 = exclusionValidation2.getField();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ {\n      name : \"autoLoad\",\n      type : \"boolean\"\n    }, {\n      name : \"name\",\n      type : \"string\"\n    }, {\n      name : \"type\",\n      type : \"string\"\n    }, {\n      name : \"model\",\n      type : \"string\"\n    }, {\n      name : \"associationKey\",\n      type : \"string\"\n    }, {\n      name : \"foreignKey\",\n      type : \"string\"\n    }, {\n      name : \"primaryKey\",\n      type : \"string\"\n    }, {\n      name : \"instanceName\",\n      type : \"string\"\n    } ]\n  }\n});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ {\n      name : \"autoLoad\",\n      type : \"boolean\"\n    }, {\n      name : \"name\",\n      type : \"string\"\n    }, {\n      name : \"type\",\n      type : \"string\"\n    }, {\n      name : \"model\",\n      type : \"string\"\n    }, {\n      name : \"associationKey\",\n      type : \"string\"\n    }, {\n      name : \"foreignKey\",\n      type : \"string\"\n    }, {\n      name : \"primaryKey\",\n      type : \"string\"\n    }, {\n      name : \"instanceName\",\n      type : \"string\"\n    } ]\n  }\n});");
    }

    @Test
    public void test05374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05374");
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
        java.lang.String[] strArray17 = modelBean0.getHasMany();
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean20 = new ch.rasc.extclassgenerator.ModelFieldBean("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});", "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        java.lang.Boolean boolean21 = modelFieldBean20.getCritical();
        modelBean0.addField(modelFieldBean20);
        java.util.List<java.lang.String> strList23 = modelFieldBean20.getDepends();
        java.lang.Boolean boolean24 = modelFieldBean20.getUseNull();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNull(boolean21);
        org.junit.Assert.assertNull(strList23);
        org.junit.Assert.assertNull(boolean24);
    }

    @Test
    public void test05375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05375");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Object obj5 = modelFieldBean2.getReference();
        modelFieldBean2.setPersist((java.lang.Boolean) false);
        java.lang.String str8 = modelFieldBean2.getName();
        ch.rasc.extclassgenerator.ReferenceBean referenceBean9 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean10 = referenceBean9.typeOnly();
        referenceBean9.setChild("");
        referenceBean9.setAssociation("");
        java.lang.String str15 = referenceBean9.getParent();
        java.lang.String str16 = referenceBean9.getType();
        java.lang.String str17 = referenceBean9.getRole();
        modelFieldBean2.setReference((java.lang.Object) referenceBean9);
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        modelFieldBean2.setUseNull((java.lang.Boolean) false);
        modelFieldBean2.setMapping("digits");
        java.lang.Object obj25 = modelFieldBean2.getReference();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test05376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05376");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("Ext.define(\"ch.rasc.extclassgenerator.association.HasOneAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ {\n      name : \"setterName\",\n      type : \"string\"\n    }, {\n      name : \"getterName\",\n      type : \"string\"\n    }, {\n      name : \"name\",\n      type : \"string\"\n    }, {\n      name : \"type\",\n      type : \"string\"\n    }, {\n      name : \"model\",\n      type : \"string\"\n    }, {\n      name : \"associationKey\",\n      type : \"string\"\n    }, {\n      name : \"foreignKey\",\n      type : \"string\"\n    }, {\n      name : \"primaryKey\",\n      type : \"string\"\n    }, {\n      name : \"instanceName\",\n      type : \"string\"\n    } ]\n  }\n});", (java.lang.Long) (-1L), (java.lang.Long) 0L);
    }

    @Test
    public void test05377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05377");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getChild();
        boolean boolean2 = referenceBean0.typeOnly();
        java.lang.String str3 = referenceBean0.getAssociation();
        java.lang.String str4 = referenceBean0.getChild();
        referenceBean0.setParent("");
        java.lang.String str7 = referenceBean0.getInverse();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test05378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05378");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.read = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});";
        java.lang.String str10 = apiObject0.destroy;
        java.lang.String str11 = apiObject0.destroy;
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ {\n      name : \"debug\",\n      type : \"boolean\"\n    }, {\n      name : \"useSingleQuotes\",\n      type : \"boolean\"\n    }, {\n      name : \"surroundApiWithQuotes\",\n      type : \"boolean\"\n    } ]\n  }\n});";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test05379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05379");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getType();
        referenceBean0.setRole("Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});");
        java.lang.String str4 = referenceBean0.getRole();
        referenceBean0.setChild("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        java.lang.String str7 = referenceBean0.getInverse();
        java.lang.String str8 = referenceBean0.getChild();
        java.lang.String str9 = referenceBean0.getParent();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});" + "'", str4, "Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});" + "'", str8, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test05380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05380");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});";
        apiObject0.update = "json";
        apiObject0.destroy = "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/";
        java.lang.String str10 = apiObject0.update;
        java.lang.String str11 = apiObject0.destroy;
        apiObject0.create = "belongsTo";
        apiObject0.destroy = "hi!";
        java.lang.String str16 = apiObject0.update;
        java.lang.String str17 = apiObject0.update;
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.validation.InclusionValidationArray\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"field\",\n    type : \"string\"\n  } ]\n});";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "json" + "'", str10, "json");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/" + "'", str11, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "json" + "'", str16, "json");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "json" + "'", str17, "json");
    }

    @Test
    public void test05381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05381");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        java.lang.String str6 = modelFieldBean2.getMapping();
        modelFieldBean2.setCritical((java.lang.Boolean) true);
        java.lang.String str9 = modelFieldBean2.getName();
        java.util.List<java.lang.String> strList10 = modelFieldBean2.getDepends();
        java.lang.Boolean boolean11 = modelFieldBean2.getPersist();
        ch.rasc.extclassgenerator.ModelType modelType12 = modelFieldBean2.getModelType();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(strList10);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(modelType12);
    }

    @Test
    public void test05382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05382");
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation3 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});/", (java.lang.Long) 10L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal4 = rangeValidation3.getMin();
        java.math.BigDecimal bigDecimal5 = rangeValidation3.getMin();
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
    }

    @Test
    public void test05383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05383");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getParent();
        referenceBean0.setInverse("hi!");
        referenceBean0.setParent("exclusion");
        java.lang.String str7 = referenceBean0.getInverse();
        boolean boolean8 = referenceBean0.typeOnly();
        boolean boolean9 = referenceBean0.typeOnly();
        boolean boolean10 = referenceBean0.typeOnly();
        java.lang.String str11 = referenceBean0.getType();
        referenceBean0.setAssociation("/format/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test05384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05384");
        ch.rasc.extclassgenerator.validation.InclusionValidation inclusionValidation2 = new ch.rasc.extclassgenerator.validation.InclusionValidation("Ext.define(\"null\",{extend:\"\",config:{fields:[]}});", "belongsTo");
        java.lang.String str3 = inclusionValidation2.getList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "belongsTo" + "'", str3, "belongsTo");
    }

    @Test
    public void test05385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05385");
        ch.rasc.extclassgenerator.validation.ExclusionValidation exclusionValidation2 = new ch.rasc.extclassgenerator.validation.ExclusionValidation("/format/", "/Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});/");
        java.lang.String str3 = exclusionValidation2.getList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});/" + "'", str3, "/Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});/");
    }

    @Test
    public void test05386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05386");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        boolean boolean1 = allDataOptionsBean0.hasAnyProperties();
        boolean boolean2 = allDataOptionsBean0.hasAnyProperties();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) true);
        allDataOptionsBean0.setCritical((java.lang.Boolean) false);
        allDataOptionsBean0.setAssociated((java.lang.Boolean) true);
        java.lang.Boolean boolean9 = allDataOptionsBean0.getChanges();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void test05387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05387");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.Object obj3 = modelFieldBean2.getDefaultValue();
        java.lang.Boolean boolean4 = modelFieldBean2.getPersist();
        modelFieldBean2.setMapping("Ext.define(\"null\",{extend:\"\",config:{fields:[]}});");
        java.lang.String str7 = modelFieldBean2.getConvert();
        java.lang.Boolean boolean8 = modelFieldBean2.getPersist();
        java.lang.String str9 = modelFieldBean2.getDateFormat();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test05388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05388");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("creditCardNumber");
        hasOneAssociation1.setSetterName("/Ext.define(\"null\",\r\n{\n  extend : \"\",\n  fields : [ ],\n  hasMany : [ \"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\", \"json\", \"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\", \"\" ]\n});/");
    }

    @Test
    public void test05389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05389");
        ch.rasc.extclassgenerator.validation.ExclusionValidation exclusionValidation2 = new ch.rasc.extclassgenerator.validation.ExclusionValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});", "/Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});/");
    }

    @Test
    public void test05390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05390");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        hasOneAssociation1.setInstanceName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        hasOneAssociation1.setName("creditCardNumber");
        java.lang.String str6 = hasOneAssociation1.getName();
        java.lang.String str7 = hasOneAssociation1.getName();
        java.lang.String str8 = hasOneAssociation1.getForeignKey();
        java.lang.String str9 = hasOneAssociation1.getGetterName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "creditCardNumber" + "'", str6, "creditCardNumber");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "creditCardNumber" + "'", str7, "creditCardNumber");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test05391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05391");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[],proxy:{type:\"direct\",directFn:hi!}});", "hasMany");
        java.lang.String str3 = modelFieldBean2.getCalculate();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test05392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05392");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getChild();
        java.lang.String str2 = referenceBean0.getChild();
        referenceBean0.setAssociation("creditCardNumber");
        referenceBean0.setType("");
        referenceBean0.setType("Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[],proxy:{type:\"direct\",directFn:hi!}});");
        java.lang.String str9 = referenceBean0.getRole();
        referenceBean0.setChild("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
        java.lang.String str12 = referenceBean0.getRole();
        java.lang.String str13 = referenceBean0.getChild();
        boolean boolean14 = referenceBean0.typeOnly();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});" + "'", str13, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test05393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05393");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        java.lang.String str3 = modelBean0.getReadMethod();
        java.lang.String str4 = modelBean0.getIdentifier();
        java.lang.String str5 = modelBean0.getWriter();
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean6 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        java.lang.Boolean boolean7 = allDataOptionsBean6.getPersist();
        java.lang.Boolean boolean8 = allDataOptionsBean6.getPersist();
        java.lang.Boolean boolean9 = allDataOptionsBean6.getAssociated();
        modelBean0.setAllDataOptions(allDataOptionsBean6);
        java.lang.Boolean boolean11 = allDataOptionsBean6.getChanges();
        boolean boolean12 = allDataOptionsBean6.hasAnyProperties();
        allDataOptionsBean6.setPersist((java.lang.Boolean) false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "json" + "'", str5, "json");
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test05394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05394");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.read = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.update = "";
        apiObject0.create = "digits";
        apiObject0.read = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});";
        apiObject0.read = "range";
        java.lang.String str16 = apiObject0.destroy;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"associated\",\n    type : \"boolean\"\n  }, {\n    name : \"changes\",\n    type : \"boolean\"\n  }, {\n    name : \"critical\",\n    type : \"boolean\"\n  }, {\n    name : \"persist\",\n    type : \"boolean\"\n  } ]\n});";
        apiObject0.read = "ch.rasc.extclassgenerator.ModelAnnotationProcessor";
        java.lang.String str21 = apiObject0.read;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ch.rasc.extclassgenerator.ModelAnnotationProcessor" + "'", str21, "ch.rasc.extclassgenerator.ModelAnnotationProcessor");
    }

    @Test
    public void test05395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05395");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});/");
        java.lang.String str2 = hasOneAssociation1.getName();
        hasOneAssociation1.setGetterName("Ext.define(\"null\",\r\n{\n  extend : \"\",\n  fields : [ ],\n  validations : [ {\n    type : \"range\",\n    field : \"/Ext.define(\\\"ch.rasc.extclassgenerator.association.HasManyAssociation\\\",{extend:\\\"Ext.data.Model\\\",fields:[{name:\\\"autoLoad\\\",type:\\\"boolean\\\"},{name:\\\"name\\\",type:\\\"string\\\"},{name:\\\"type\\\",type:\\\"string\\\"},{name:\\\"model\\\",type:\\\"string\\\"},{name:\\\"associationKey\\\",type:\\\"string\\\"},{name:\\\"foreignKey\\\",type:\\\"string\\\"},{name:\\\"primaryKey\\\",type:\\\"string\\\"},{name:\\\"instanceName\\\",type:\\\"string\\\"}]});/\",\n    min : 0,\n    max : 0\n  } ]\n});");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test05396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05396");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("hi!");
        hasManyAssociation1.setAssociationKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str4 = hasManyAssociation1.getInstanceName();
        hasManyAssociation1.setName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        hasManyAssociation1.setPrimaryKey("");
        java.lang.Boolean boolean9 = hasManyAssociation1.getAutoLoad();
        hasManyAssociation1.setPrimaryKey("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        hasManyAssociation1.setName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str14 = hasManyAssociation1.getInstanceName();
        hasManyAssociation1.setForeignKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        hasManyAssociation1.setName("Ext.define(\"ch.rasc.extclassgenerator.validation.PresenceValidation\",{extend:\"Ext.data.Model\",fields:[{name:\"type\",type:\"string\"},{name:\"field\",type:\"string\"}]});");
        java.lang.String str19 = hasManyAssociation1.getPrimaryKey();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});" + "'", str19, "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
    }

    @Test
    public void test05397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05397");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});/", "Ext.define(\"null\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ],\n    proxy : {\n      type : \"direct\",\n      reader : {\n        type : \"Ext.define(\\\"java.util.ArrayList\\\",\\r\\n{\\n  extend : \\\"Ext.data.Model\\\",\\n  fields : [ ]\\n});\"\n      }\n    }\n  }\n});");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation4 = new ch.rasc.extclassgenerator.association.HasManyAssociation("hi!");
        hasManyAssociation4.setAssociationKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str7 = hasManyAssociation4.getInstanceName();
        hasManyAssociation4.setPrimaryKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str10 = hasManyAssociation4.getForeignKey();
        hasManyAssociation4.setInstanceName("hi!");
        modelFieldBean2.setReference((java.lang.Object) "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test05398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05398");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("");
        java.lang.String str2 = belongsToAssociation1.getInstanceName();
        belongsToAssociation1.setGetterName("json");
        java.lang.String str5 = belongsToAssociation1.getSetterName();
        belongsToAssociation1.setForeignKey("Ext.data.Model");
        java.lang.String str8 = belongsToAssociation1.getInstanceName();
        belongsToAssociation1.setForeignKey("digits");
        belongsToAssociation1.setGetterName("Ext.define(\"ch.rasc.extclassgenerator.ModelFieldBean\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"dateFormat\",type:\"string\"},{name:\"useNull\",type:\"boolean\"},{name:\"allowNull\",type:\"boolean\"},{name:\"mapping\",type:\"string\"},{name:\"persist\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"convert\",type:\"string\"},{name:\"calculate\",type:\"string\"},{name:\"allowBlank\",type:\"boolean\"},{name:\"unique\",type:\"boolean\"}]}});");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test05399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05399");
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation3 = new ch.rasc.extclassgenerator.validation.RangeValidation("", (java.lang.Long) 10L, (java.lang.Long) 52L);
        java.math.BigDecimal bigDecimal4 = rangeValidation3.getMin();
        org.junit.Assert.assertNotNull(bigDecimal4);
    }

    @Test
    public void test05400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05400");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        ch.rasc.extclassgenerator.validation.GenericValidation genericValidation3 = new ch.rasc.extclassgenerator.validation.GenericValidation("Ext.define(\"null\",\r\n{\n  extend : \"\",\n  fields : [ ],\n  validations : [ {\n    type : \"range\",\n    field : \"/Ext.define(\\\"ch.rasc.extclassgenerator.association.HasManyAssociation\\\",{extend:\\\"Ext.data.Model\\\",fields:[{name:\\\"autoLoad\\\",type:\\\"boolean\\\"},{name:\\\"name\\\",type:\\\"string\\\"},{name:\\\"type\\\",type:\\\"string\\\"},{name:\\\"model\\\",type:\\\"string\\\"},{name:\\\"associationKey\\\",type:\\\"string\\\"},{name:\\\"foreignKey\\\",type:\\\"string\\\"},{name:\\\"primaryKey\\\",type:\\\"string\\\"},{name:\\\"instanceName\\\",type:\\\"string\\\"}]});/\",\n    min : 0,\n    max : 0\n  } ]\n});", "/\\/range\\//", strMap2);
    }

    @Test
    public void test05401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05401");
        ch.rasc.extclassgenerator.ModelAnnotationProcessor modelAnnotationProcessor0 = new ch.rasc.extclassgenerator.ModelAnnotationProcessor();
        java.util.Set<java.lang.String> strSet1 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        javax.lang.model.SourceVersion sourceVersion2 = modelAnnotationProcessor0.getSupportedSourceVersion();
        javax.lang.model.SourceVersion sourceVersion3 = modelAnnotationProcessor0.getSupportedSourceVersion();
        javax.lang.model.element.Element element4 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror5 = null;
        javax.lang.model.element.ExecutableElement executableElement6 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable8 = modelAnnotationProcessor0.getCompletions(element4, annotationMirror5, executableElement6, "json");
        javax.lang.model.SourceVersion sourceVersion9 = modelAnnotationProcessor0.getSupportedSourceVersion();
        javax.lang.model.element.Element element10 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror11 = null;
        javax.lang.model.element.ExecutableElement executableElement12 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable14 = modelAnnotationProcessor0.getCompletions(element10, annotationMirror11, executableElement12, "Ext.define(\"null\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ],\n  proxy : {\n    type : \"direct\",\n    reader : {\n      totalProperty : \"/Ext.define(\\\"ch.rasc.extclassgenerator.association.HasManyAssociation\\\",{extend:\\\"Ext.data.Model\\\",fields:[{name:\\\"autoLoad\\\",type:\\\"boolean\\\"},{name:\\\"name\\\",type:\\\"string\\\"},{name:\\\"type\\\",type:\\\"string\\\"},{name:\\\"model\\\",type:\\\"string\\\"},{name:\\\"associationKey\\\",type:\\\"string\\\"},{name:\\\"foreignKey\\\",type:\\\"string\\\"},{name:\\\"primaryKey\\\",type:\\\"string\\\"},{name:\\\"instanceName\\\",type:\\\"string\\\"}]});/\"\n    }\n  }\n});");
        java.util.Set<java.lang.String> strSet15 = modelAnnotationProcessor0.getSupportedOptions();
        java.util.Set<java.lang.String> strSet16 = modelAnnotationProcessor0.getSupportedOptions();
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
        org.junit.Assert.assertTrue("'" + sourceVersion9 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion9.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(wildcardIterable14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test05402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05402");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("hi!");
        hasManyAssociation1.setForeignKey("");
        java.lang.String str4 = hasManyAssociation1.getForeignKey();
        java.lang.String str5 = hasManyAssociation1.getPrimaryKey();
        hasManyAssociation1.setAssociationKey("json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test05403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05403");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray11 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList9);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray12 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("", (java.util.List<java.lang.String>) strList9);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray13 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("json", (java.util.List<java.lang.String>) strList9);
        java.util.List<java.lang.String> strList14 = exclusionValidationArray13.getList();
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray15 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("exclusion", strList14);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray16 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", strList14);
        java.util.List<java.lang.String> strList17 = exclusionValidationArray16.getList();
        java.util.List<java.lang.String> strList18 = exclusionValidationArray16.getList();
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray19 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("Ext.define(\"ch.rasc.extclassgenerator.validation.PresenceValidation\",{extend:\"Ext.data.Model\",fields:[{name:\"type\",type:\"string\"},{name:\"field\",type:\"string\"}]});", strList18);
        java.util.List<java.lang.String> strList20 = exclusionValidationArray19.getList();
        java.util.List<java.lang.String> strList21 = exclusionValidationArray19.getList();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList21);
    }

    @Test
    public void test05404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05404");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.destroy = "";
        java.lang.String str3 = apiObject0.create;
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});";
        java.lang.String str6 = apiObject0.update;
        apiObject0.read = "Ext.data.Model";
        java.lang.String str9 = apiObject0.update;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});" + "'", str6, "Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});" + "'", str9, "Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});");
    }

    @Test
    public void test05405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05405");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("hi!");
        hasManyAssociation1.setAssociationKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        hasManyAssociation1.setForeignKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        hasManyAssociation1.setInstanceName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str8 = hasManyAssociation1.getPrimaryKey();
        hasManyAssociation1.setPrimaryKey("Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test05406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05406");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        java.lang.Boolean boolean5 = modelFieldBean2.getAllowNull();
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
    }

    @Test
    public void test05407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05407");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getChild();
        java.lang.String str2 = referenceBean0.getChild();
        referenceBean0.setAssociation("creditCardNumber");
        referenceBean0.setInverse("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        referenceBean0.setRole("length");
        java.lang.String str9 = referenceBean0.getParent();
        referenceBean0.setParent("/\\/\\\\/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});\\\\/\\//");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test05408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05408");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean4 = allDataOptionsBean0.getPersist();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean7 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean8 = allDataOptionsBean0.getPersist();
        allDataOptionsBean0.setPersist((java.lang.Boolean) false);
        java.lang.Boolean boolean11 = allDataOptionsBean0.getPersist();
        boolean boolean12 = allDataOptionsBean0.hasAnyProperties();
        java.lang.Boolean boolean13 = allDataOptionsBean0.getCritical();
        java.lang.Boolean boolean14 = allDataOptionsBean0.getCritical();
        java.lang.Boolean boolean15 = allDataOptionsBean0.getCritical();
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + false + "'", boolean7, false);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + false + "'", boolean11, false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertNull(boolean15);
    }

    @Test
    public void test05409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05409");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        boolean boolean4 = allDataOptionsBean0.hasAnyProperties();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) true);
        allDataOptionsBean0.setChanges((java.lang.Boolean) false);
        allDataOptionsBean0.setCritical((java.lang.Boolean) false);
        allDataOptionsBean0.setAssociated((java.lang.Boolean) true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test05410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05410");
        ch.rasc.extclassgenerator.validation.FutureValidation futureValidation1 = new ch.rasc.extclassgenerator.validation.FutureValidation("Ext.define(\"ch.rasc.extclassgenerator.association.BelongsToAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ {\n      name : \"setterName\",\n      type : \"string\"\n    }, {\n      name : \"getterName\",\n      type : \"string\"\n    }, {\n      name : \"type\",\n      type : \"string\"\n    }, {\n      name : \"model\",\n      type : \"string\"\n    }, {\n      name : \"associationKey\",\n      type : \"string\"\n    }, {\n      name : \"foreignKey\",\n      type : \"string\"\n    }, {\n      name : \"primaryKey\",\n      type : \"string\"\n    }, {\n      name : \"instanceName\",\n      type : \"string\"\n    } ]\n  }\n});");
        java.lang.String str2 = futureValidation1.getType();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "future" + "'", str2, "future");
    }

    @Test
    public void test05411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05411");
        ch.rasc.extclassgenerator.validation.ExclusionValidation exclusionValidation2 = new ch.rasc.extclassgenerator.validation.ExclusionValidation("Ext.define(\"null\",{extend:\"Ext.data.Model\",idProperty:\"hi!\",fields:[],proxy:{type:\"direct\",idParam:\"hi!\"}});", "/ch.rasc.extclassgenerator.ModelAnnotationProcessor/");
    }

    @Test
    public void test05412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05412");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hasOne");
        hasOneAssociation1.setGetterName("/Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});/");
    }

    @Test
    public void test05413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05413");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        java.lang.String str3 = modelBean0.getIdProperty();
        java.lang.String[] strArray4 = modelBean0.getHasMany();
        modelBean0.setExtend("/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/");
        java.util.List<ch.rasc.extclassgenerator.validation.AbstractValidation> abstractValidationList7 = modelBean0.getValidations();
        java.lang.String str8 = modelBean0.getCreateMethod();
        modelBean0.setIdProperty("");
        modelBean0.setDestroyMethod("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(abstractValidationList7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test05414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05414");
        ch.rasc.extclassgenerator.ModelAnnotationProcessor modelAnnotationProcessor0 = new ch.rasc.extclassgenerator.ModelAnnotationProcessor();
        java.util.Set<java.lang.String> strSet1 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        javax.lang.model.SourceVersion sourceVersion2 = modelAnnotationProcessor0.getSupportedSourceVersion();
        javax.lang.model.SourceVersion sourceVersion3 = modelAnnotationProcessor0.getSupportedSourceVersion();
        javax.lang.model.SourceVersion sourceVersion4 = modelAnnotationProcessor0.getSupportedSourceVersion();
        java.util.Set<java.lang.String> strSet5 = modelAnnotationProcessor0.getSupportedOptions();
        javax.lang.model.element.Element element6 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror7 = null;
        javax.lang.model.element.ExecutableElement executableElement8 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable10 = modelAnnotationProcessor0.getCompletions(element6, annotationMirror7, executableElement8, "");
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
        org.junit.Assert.assertTrue("'" + sourceVersion4 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion4.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(wildcardIterable10);
    }

    @Test
    public void test05415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05415");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        ch.rasc.extclassgenerator.validation.GenericValidation genericValidation3 = new ch.rasc.extclassgenerator.validation.GenericValidation("exclusion", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});", strMap2);
        java.lang.String str4 = genericValidation3.getType();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = genericValidation3.getOptions();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = genericValidation3.getOptions();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "exclusion" + "'", str4, "exclusion");
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
    }

    @Test
    public void test05416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05416");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.data.Model");
        modelFieldBean2.setAllowNull((java.lang.Boolean) false);
        java.lang.String str5 = modelFieldBean2.getName();
        modelFieldBean2.setMapping("hi!");
        java.lang.Boolean boolean8 = modelFieldBean2.getUseNull();
        modelFieldBean2.setUseNull((java.lang.Boolean) false);
        java.lang.String str11 = modelFieldBean2.getMapping();
        java.lang.Boolean boolean12 = modelFieldBean2.getAllowNull();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + false + "'", boolean8, false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + false + "'", boolean12, false);
    }

    @Test
    public void test05417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05417");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("hi!");
        java.lang.String str2 = hasManyAssociation1.getAssociationKey();
        java.lang.String str3 = hasManyAssociation1.getForeignKey();
        java.lang.String str4 = hasManyAssociation1.getPrimaryKey();
        java.lang.String str5 = hasManyAssociation1.getName();
        hasManyAssociation1.setAssociationKey("ch.rasc.extclassgenerator.association.HasManyAssociation");
        java.lang.String str8 = hasManyAssociation1.getModel();
        hasManyAssociation1.setAutoLoad((java.lang.Boolean) false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test05418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05418");
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
        javax.lang.model.SourceVersion sourceVersion14 = modelAnnotationProcessor0.getSupportedSourceVersion();
        javax.lang.model.element.Element element15 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror16 = null;
        javax.lang.model.element.ExecutableElement executableElement17 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable19 = modelAnnotationProcessor0.getCompletions(element15, annotationMirror16, executableElement17, "exclusion");
        javax.lang.model.element.Element element20 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror21 = null;
        javax.lang.model.element.ExecutableElement executableElement22 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable24 = modelAnnotationProcessor0.getCompletions(element20, annotationMirror21, executableElement22, "range");
        java.util.Set<java.lang.String> strSet25 = modelAnnotationProcessor0.getSupportedOptions();
        java.util.Set<java.lang.String> strSet26 = modelAnnotationProcessor0.getSupportedOptions();
        javax.lang.model.element.Element element27 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror28 = null;
        javax.lang.model.element.ExecutableElement executableElement29 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable31 = modelAnnotationProcessor0.getCompletions(element27, annotationMirror28, executableElement29, "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[],proxy:{type:\"direct\",directFn:hi!}});");
        javax.lang.model.SourceVersion sourceVersion32 = modelAnnotationProcessor0.getSupportedSourceVersion();
        javax.lang.model.SourceVersion sourceVersion33 = modelAnnotationProcessor0.getSupportedSourceVersion();
        java.util.Set<java.lang.String> strSet34 = modelAnnotationProcessor0.getSupportedOptions();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertTrue("'" + sourceVersion2 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion2.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(wildcardIterable8);
        org.junit.Assert.assertNotNull(wildcardIterable13);
        org.junit.Assert.assertTrue("'" + sourceVersion14 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion14.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(wildcardIterable19);
        org.junit.Assert.assertNotNull(wildcardIterable24);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNotNull(wildcardIterable31);
        org.junit.Assert.assertTrue("'" + sourceVersion32 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion32.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertTrue("'" + sourceVersion33 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion33.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(strSet34);
    }

    @Test
    public void test05419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05419");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getParent();
        referenceBean0.setInverse("hi!");
        referenceBean0.setParent("exclusion");
        boolean boolean7 = referenceBean0.typeOnly();
        java.lang.String str8 = referenceBean0.getParent();
        java.lang.String str9 = referenceBean0.getInverse();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "exclusion" + "'", str8, "exclusion");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test05420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05420");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("Ext.define(\"ch.rasc.extclassgenerator.validation.PresenceValidation\",{extend:\"Ext.data.Model\",fields:[{name:\"type\",type:\"string\"},{name:\"field\",type:\"string\"}]});", (java.lang.Long) 1L, (java.lang.Long) 32L);
    }

    @Test
    public void test05421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05421");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});", "creditCardNumber");
        java.lang.String str3 = modelFieldBean2.getType();
        modelFieldBean2.setCalculate("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        modelFieldBean2.setUnique((java.lang.Boolean) true);
        java.lang.String str8 = modelFieldBean2.getType();
        java.lang.String str9 = modelFieldBean2.getMapping();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "creditCardNumber" + "'", str3, "creditCardNumber");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "creditCardNumber" + "'", str8, "creditCardNumber");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test05422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05422");
        ch.rasc.extclassgenerator.validation.FutureValidation futureValidation1 = new ch.rasc.extclassgenerator.validation.FutureValidation("Ext.define(\"ch.rasc.extclassgenerator.validation.RangeValidation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"min\",\n    type : \"float\"\n  }, {\n    name : \"max\",\n    type : \"float\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"field\",\n    type : \"string\"\n  } ]\n});");
    }

    @Test
    public void test05423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05423");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("json");
        java.lang.String str2 = belongsToAssociation1.getGetterName();
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test05424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05424");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        modelBean0.setIdProperty("");
        java.lang.String str5 = modelBean0.getIdentifier();
        modelBean0.setDisablePagingParameters(true);
        java.lang.String str8 = modelBean0.getRootProperty();
        java.lang.Boolean boolean9 = modelBean0.getWriteAllFields();
        modelBean0.setAutodetectTypes(true);
        modelBean0.setIdentifier("Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[],proxy:{type:\"direct\",directFn:hi!,writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",config:{fields:[]}});\"}}}});");
        modelBean0.setCreateMethod("/Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});/");
        java.lang.String str16 = modelBean0.getWriter();
        modelBean0.setRootProperty("Ext.define(\"ch.rasc.extclassgenerator.validation.InclusionValidationArray\",{extend:\"Ext.data.Model\",fields:[{name:\"type\",type:\"string\"},{name:\"field\",type:\"string\"}]});");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "json" + "'", str16, "json");
    }

    @Test
    public void test05425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05425");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean3 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.data.Model");
        modelFieldBean3.setAllowNull((java.lang.Boolean) false);
        java.lang.String str6 = modelFieldBean3.getName();
        modelFieldBean3.setMapping("hi!");
        java.lang.Boolean boolean9 = modelFieldBean3.getAllowBlank();
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean14 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean14.setConvert("hi!");
        java.lang.Boolean boolean17 = modelFieldBean14.getPersist();
        java.lang.String str18 = modelFieldBean14.getMapping();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray26 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList24);
        java.util.List<java.lang.String> strList27 = inclusionValidationArray26.getList();
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray28 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", strList27);
        modelFieldBean14.setDepends(strList27);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray30 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("hasMany", strList27);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray31 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", strList27);
        modelFieldBean3.setDepends(strList27);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray33 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("hasMany", strList27);
        java.lang.String str34 = exclusionValidationArray33.getType();
        java.util.List<java.lang.String> strList35 = exclusionValidationArray33.getList();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNull(boolean17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "exclusion" + "'", str34, "exclusion");
        org.junit.Assert.assertNotNull(strList35);
    }

    @Test
    public void test05426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05426");
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
        outputConfig0.setSurroundApiWithQuotes(false);
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
    }

    @Test
    public void test05427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05427");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        java.lang.String str3 = modelBean0.getReadMethod();
        java.lang.String str4 = modelBean0.getIdentifier();
        java.lang.String str5 = modelBean0.getWriter();
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean6 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        java.lang.Boolean boolean7 = allDataOptionsBean6.getPersist();
        java.lang.Boolean boolean8 = allDataOptionsBean6.getPersist();
        java.lang.Boolean boolean9 = allDataOptionsBean6.getAssociated();
        modelBean0.setAllDataOptions(allDataOptionsBean6);
        java.lang.Boolean boolean11 = allDataOptionsBean6.getChanges();
        allDataOptionsBean6.setPersist((java.lang.Boolean) false);
        java.lang.Boolean boolean14 = allDataOptionsBean6.getChanges();
        allDataOptionsBean6.setPersist((java.lang.Boolean) false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "json" + "'", str5, "json");
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(boolean14);
    }

    @Test
    public void test05428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05428");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        boolean boolean4 = allDataOptionsBean0.hasAnyProperties();
        allDataOptionsBean0.setCritical((java.lang.Boolean) true);
        boolean boolean7 = allDataOptionsBean0.hasAnyProperties();
        allDataOptionsBean0.setPersist((java.lang.Boolean) true);
        java.lang.Boolean boolean10 = allDataOptionsBean0.getChanges();
        allDataOptionsBean0.setChanges((java.lang.Boolean) false);
        allDataOptionsBean0.setCritical((java.lang.Boolean) false);
        allDataOptionsBean0.setChanges((java.lang.Boolean) false);
        allDataOptionsBean0.setPersist((java.lang.Boolean) false);
        allDataOptionsBean0.setCritical((java.lang.Boolean) false);
        allDataOptionsBean0.setAssociated((java.lang.Boolean) true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(boolean10);
    }

    @Test
    public void test05429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05429");
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
        modelFieldBean2.setPersist((java.lang.Boolean) true);
        ch.rasc.extclassgenerator.ModelType modelType30 = modelFieldBean2.getModelType();
        java.lang.String str31 = modelFieldBean2.getConvert();
        java.lang.String str32 = modelFieldBean2.getConvert();
        modelFieldBean2.setDateFormat("/hasMany/");
        java.lang.Boolean boolean35 = modelFieldBean2.getUseNull();
        modelFieldBean2.setConvert("Ext.define(\"ch.rasc.extclassgenerator.ModelFieldBean\",{extend:\"Ext.data.Model\",fields:[{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"dateFormat\",type:\"string\"},{name:\"useNull\",type:\"boolean\"},{name:\"allowNull\",type:\"boolean\"},{name:\"mapping\",type:\"string\"},{name:\"persist\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"convert\",type:\"string\"},{name:\"calculate\",type:\"string\"},{name:\"allowBlank\",type:\"boolean\"},{name:\"unique\",type:\"boolean\"}]});");
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(boolean25);
        org.junit.Assert.assertNull(modelType30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + boolean35 + "' != '" + false + "'", boolean35, false);
    }

    @Test
    public void test05430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05430");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("");
        java.lang.String str2 = belongsToAssociation1.getInstanceName();
        belongsToAssociation1.setSetterName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str5 = belongsToAssociation1.getGetterName();
        java.lang.String str6 = belongsToAssociation1.getSetterName();
        belongsToAssociation1.setSetterName("past");
        java.lang.String str9 = belongsToAssociation1.getInstanceName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str6, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test05431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05431");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.read = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str8 = apiObject0.update;
        java.lang.String str9 = apiObject0.destroy;
        apiObject0.update = "range";
        apiObject0.update = "Ext.define(\"null\",\r\n{\n  extend : \"\",\n  idgen : \"Ext.define(\\\"java.util.ArrayList\\\",\\r\\n{\\n  extend : \\\"Ext.data.Model\\\",\\n  fields : [ ]\\n});\",\n  fields : [ ],\n  proxy : {\n    type : \"direct\",\n    reader : {\n      root : \"Ext.define(\\\"null\\\",{extend:\\\"Ext.data.Model\\\",idProperty:\\\"hi!\\\",fields:[],proxy:{type:\\\"direct\\\",idParam:\\\"hi!\\\"}});\",\n      messageProperty : \"hi!\"\n    },\n    writer : {\n      writeAllFields : false\n    }\n  }\n});";
        java.lang.String str14 = apiObject0.destroy;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str8, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test05432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05432");
        ch.rasc.extclassgenerator.validation.DigitsValidation digitsValidation3 = new ch.rasc.extclassgenerator.validation.DigitsValidation("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]}});", (int) (byte) 1, 100);
        int int4 = digitsValidation3.getFraction();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test05433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05433");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        modelFieldBean2.setMapping("hi!");
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        modelFieldBean2.setAllowBlank((java.lang.Boolean) false);
        modelFieldBean2.setConvert("Ext.define(\"java.util.Collections$UnmodifiableSet\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
    }

    @Test
    public void test05434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05434");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        java.lang.String str2 = hasManyAssociation1.getName();
        hasManyAssociation1.setName("Ext.define(\"ch.rasc.extclassgenerator.ModelFieldBean\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"dateFormat\",type:\"string\"},{name:\"useNull\",type:\"boolean\"},{name:\"allowNull\",type:\"boolean\"},{name:\"mapping\",type:\"string\"},{name:\"persist\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"convert\",type:\"string\"},{name:\"calculate\",type:\"string\"},{name:\"allowBlank\",type:\"boolean\"},{name:\"unique\",type:\"boolean\"}]}});");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test05435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05435");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray10 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList8);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray11 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("", (java.util.List<java.lang.String>) strList8);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray12 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("json", (java.util.List<java.lang.String>) strList8);
        java.util.List<java.lang.String> strList13 = exclusionValidationArray12.getList();
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray14 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("exclusion", strList13);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray15 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("belongsTo", strList13);
        java.util.List<java.lang.String> strList16 = exclusionValidationArray15.getList();
        java.lang.String str17 = exclusionValidationArray15.getField();
        java.util.List<java.lang.String> strList18 = exclusionValidationArray15.getList();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "belongsTo" + "'", str17, "belongsTo");
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test05436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05436");
        ch.rasc.extclassgenerator.ModelAnnotationProcessor modelAnnotationProcessor0 = new ch.rasc.extclassgenerator.ModelAnnotationProcessor();
        java.util.Set<java.lang.String> strSet1 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        java.util.Set<java.lang.String> strSet2 = modelAnnotationProcessor0.getSupportedOptions();
        java.util.Set<java.lang.String> strSet3 = modelAnnotationProcessor0.getSupportedOptions();
        java.util.Set<java.lang.String> strSet4 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        javax.lang.model.element.Element element5 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror6 = null;
        javax.lang.model.element.ExecutableElement executableElement7 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable9 = modelAnnotationProcessor0.getCompletions(element5, annotationMirror6, executableElement7, "/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/");
        java.util.Set<java.lang.String> strSet10 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        javax.lang.model.SourceVersion sourceVersion11 = modelAnnotationProcessor0.getSupportedSourceVersion();
        javax.lang.model.SourceVersion sourceVersion12 = modelAnnotationProcessor0.getSupportedSourceVersion();
        java.util.Set<java.lang.String> strSet13 = modelAnnotationProcessor0.getSupportedOptions();
        java.util.Set<java.lang.String> strSet14 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(wildcardIterable9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + sourceVersion11 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion11.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertTrue("'" + sourceVersion12 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion12.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test05437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05437");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        modelFieldBean2.setMapping("hi!");
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        modelFieldBean2.setAllowBlank((java.lang.Boolean) false);
        ch.rasc.extclassgenerator.OutputConfig outputConfig11 = new ch.rasc.extclassgenerator.OutputConfig();
        outputConfig11.setUseSingleQuotes(false);
        boolean boolean14 = modelFieldBean2.hasOnlyName(outputConfig11);
        java.lang.Boolean boolean15 = modelFieldBean2.getAllowBlank();
        java.lang.String str16 = modelFieldBean2.getMapping();
        java.lang.Boolean boolean17 = modelFieldBean2.getAllowBlank();
        java.lang.Boolean boolean18 = modelFieldBean2.getUnique();
        modelFieldBean2.setConvert("Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"associated\",\n    type : \"boolean\"\n  }, {\n    name : \"changes\",\n    type : \"boolean\"\n  }, {\n    name : \"critical\",\n    type : \"boolean\"\n  }, {\n    name : \"persist\",\n    type : \"boolean\"\n  } ]\n});");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + boolean15 + "' != '" + false + "'", boolean15, false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + boolean17 + "' != '" + false + "'", boolean17, false);
        org.junit.Assert.assertNull(boolean18);
    }

    @Test
    public void test05438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05438");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});");
        java.lang.String str2 = belongsToAssociation1.getSetterName();
        belongsToAssociation1.setGetterName("hasOne");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test05439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05439");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean4 = allDataOptionsBean0.getPersist();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        allDataOptionsBean0.setPersist((java.lang.Boolean) false);
        allDataOptionsBean0.setChanges((java.lang.Boolean) false);
        java.lang.Boolean boolean11 = allDataOptionsBean0.getChanges();
        java.lang.Boolean boolean12 = allDataOptionsBean0.getAssociated();
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + false + "'", boolean11, false);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + false + "'", boolean12, false);
    }

    @Test
    public void test05440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05440");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.read;
        apiObject0.update = "hi!";
        apiObject0.create = "creditCardNumber";
        java.lang.String str8 = apiObject0.destroy;
        apiObject0.destroy = "length";
        apiObject0.create = "ch.rasc.extclassgenerator.ModelBean";
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ {\n      name : \"debug\",\n      type : \"boolean\"\n    }, {\n      name : \"useSingleQuotes\",\n      type : \"boolean\"\n    }, {\n      name : \"surroundApiWithQuotes\",\n      type : \"boolean\"\n    } ]\n  }\n});";
        java.lang.String str15 = apiObject0.destroy;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "length" + "'", str15, "length");
    }

    @Test
    public void test05441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05441");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        java.lang.Boolean boolean3 = modelFieldBean2.getCritical();
        ch.rasc.extclassgenerator.OutputConfig outputConfig4 = new ch.rasc.extclassgenerator.OutputConfig();
        boolean boolean5 = outputConfig4.isSurroundApiWithQuotes();
        boolean boolean6 = outputConfig4.isDebug();
        ch.rasc.extclassgenerator.LineEnding lineEnding7 = outputConfig4.getLineEnding();
        ch.rasc.extclassgenerator.LineEnding lineEnding8 = outputConfig4.getLineEnding();
        boolean boolean9 = outputConfig4.isUseSingleQuotes();
        boolean boolean10 = modelFieldBean2.hasOnlyName(outputConfig4);
        ch.rasc.extclassgenerator.IncludeValidation includeValidation11 = outputConfig4.getIncludeValidation();
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(lineEnding7);
        org.junit.Assert.assertNull(lineEnding8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(includeValidation11);
    }

    @Test
    public void test05442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05442");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getType();
        referenceBean0.setInverse("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        java.lang.String str4 = referenceBean0.getChild();
        referenceBean0.setType("Ext.define(\"null\",{extend:\"\",config:{fields:[]}});");
        referenceBean0.setRole("Ext.define(\"null\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ],\n    proxy : {\n      type : \"direct\",\n      reader : {\n        type : \"Ext.define(\\\"java.util.ArrayList\\\",\\r\\n{\\n  extend : \\\"Ext.data.Model\\\",\\n  fields : [ ]\\n});\"\n      }\n    }\n  }\n});");
        java.lang.String str9 = referenceBean0.getParent();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test05443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05443");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Object obj5 = modelFieldBean2.getReference();
        modelFieldBean2.setPersist((java.lang.Boolean) false);
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        java.util.List<ch.rasc.extclassgenerator.validation.AbstractValidation> abstractValidationList10 = modelFieldBean2.getValidators();
        java.lang.Boolean boolean11 = modelFieldBean2.getUnique();
        java.lang.String str12 = modelFieldBean2.getConvert();
        modelFieldBean2.setDateFormat("Ext.define(\"ch.rasc.extclassgenerator.AllDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(abstractValidationList10);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test05444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05444");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str2 = belongsToAssociation1.getSetterName();
        belongsToAssociation1.setAssociationKey("belongsTo");
        java.lang.String str5 = belongsToAssociation1.getAssociationKey();
        java.lang.String str6 = belongsToAssociation1.getAssociationKey();
        belongsToAssociation1.setGetterName("belongsTo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "belongsTo" + "'", str5, "belongsTo");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "belongsTo" + "'", str6, "belongsTo");
    }

    @Test
    public void test05445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05445");
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation4 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal5 = rangeValidation4.getMin();
        java.math.BigDecimal bigDecimal6 = rangeValidation4.getMin();
        java.math.BigDecimal bigDecimal7 = rangeValidation4.getMin();
        java.math.BigDecimal bigDecimal8 = rangeValidation4.getMin();
        java.math.BigDecimal bigDecimal9 = rangeValidation4.getMax();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation13 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) (-1L), (java.lang.Long) 97L);
        java.math.BigDecimal bigDecimal14 = rangeValidation13.getMax();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation15 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.association.BelongsToAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ {\n      name : \"setterName\",\n      type : \"string\"\n    }, {\n      name : \"getterName\",\n      type : \"string\"\n    }, {\n      name : \"type\",\n      type : \"string\"\n    }, {\n      name : \"model\",\n      type : \"string\"\n    }, {\n      name : \"associationKey\",\n      type : \"string\"\n    }, {\n      name : \"foreignKey\",\n      type : \"string\"\n    }, {\n      name : \"primaryKey\",\n      type : \"string\"\n    }, {\n      name : \"instanceName\",\n      type : \"string\"\n    } ]\n  }\n});", bigDecimal9, bigDecimal14);
        java.math.BigDecimal bigDecimal16 = rangeValidation15.getMax();
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal16);
    }

    @Test
    public void test05446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05446");
        ch.rasc.extclassgenerator.validation.PastValidation pastValidation1 = new ch.rasc.extclassgenerator.validation.PastValidation("Ext.define(\"ch.rasc.extclassgenerator.association.HasOneAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ {\n      name : \"setterName\",\n      type : \"string\"\n    }, {\n      name : \"getterName\",\n      type : \"string\"\n    }, {\n      name : \"name\",\n      type : \"string\"\n    }, {\n      name : \"type\",\n      type : \"string\"\n    }, {\n      name : \"model\",\n      type : \"string\"\n    }, {\n      name : \"associationKey\",\n      type : \"string\"\n    }, {\n      name : \"foreignKey\",\n      type : \"string\"\n    }, {\n      name : \"primaryKey\",\n      type : \"string\"\n    }, {\n      name : \"instanceName\",\n      type : \"string\"\n    } ]\n  }\n});");
    }

    @Test
    public void test05447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05447");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.destroy = "";
        apiObject0.destroy = "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/";
        apiObject0.destroy = "ch.rasc.extclassgenerator.PartialDataOptionsBean";
        apiObject0.update = "/Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",{extend:\"Ext.data.Model\",fields:[{name:\"debug\",type:\"boolean\"},{name:\"useSingleQuotes\",type:\"boolean\"},{name:\"surroundApiWithQuotes\",type:\"boolean\"}]});/";
    }

    @Test
    public void test05448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05448");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hasOne", "hi!");
        java.lang.Boolean boolean3 = modelFieldBean2.getPersist();
        java.util.List<java.lang.String> strList4 = modelFieldBean2.getDepends();
        java.lang.String str5 = modelFieldBean2.getName();
        modelFieldBean2.setUnique((java.lang.Boolean) false);
        java.lang.String str8 = modelFieldBean2.getType();
        modelFieldBean2.setPersist((java.lang.Boolean) false);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNull(strList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hasOne" + "'", str5, "hasOne");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test05449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05449");
        ch.rasc.extclassgenerator.ModelType modelType1 = null;
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ {\n      name : \"debug\",\n      type : \"boolean\"\n    }, {\n      name : \"useSingleQuotes\",\n      type : \"boolean\"\n    }, {\n      name : \"surroundApiWithQuotes\",\n      type : \"boolean\"\n    } ]\n  }\n});", modelType1);
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean3 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean3.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean6 = allDataOptionsBean3.getAssociated();
        boolean boolean7 = allDataOptionsBean3.hasAnyProperties();
        allDataOptionsBean3.setAssociated((java.lang.Boolean) true);
        boolean boolean10 = allDataOptionsBean3.hasAnyProperties();
        java.lang.Boolean boolean11 = allDataOptionsBean3.getPersist();
        modelFieldBean2.setReference((java.lang.Object) boolean11);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + false + "'", boolean6, false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(boolean11);
    }

    @Test
    public void test05450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05450");
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
        boolean boolean19 = modelBean0.isDisablePagingParameters();
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test05451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05451");
        ch.rasc.extclassgenerator.ModelType modelType2 = null;
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean3 = new ch.rasc.extclassgenerator.ModelFieldBean("", modelType2);
        modelFieldBean3.setDateFormat("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        java.util.List<ch.rasc.extclassgenerator.validation.AbstractValidation> abstractValidationList6 = modelFieldBean3.getValidators();
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean10 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean10.setConvert("hi!");
        modelFieldBean10.setMapping("hi!");
        modelFieldBean10.setUseNull((java.lang.Boolean) true);
        modelFieldBean10.setAllowBlank((java.lang.Boolean) false);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray26 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList24);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray27 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("", (java.util.List<java.lang.String>) strList24);
        java.util.List<java.lang.String> strList28 = exclusionValidationArray27.getList();
        modelFieldBean10.setDepends(strList28);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray30 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", strList28);
        modelFieldBean3.setDepends(strList28);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray32 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("Ext.define(\"null\",\r\n{\n  extend : \"\",\n  fields : [ ],\n  validations : [ {\n    type : \"range\",\n    field : \"/Ext.define(\\\"ch.rasc.extclassgenerator.association.HasManyAssociation\\\",{extend:\\\"Ext.data.Model\\\",fields:[{name:\\\"autoLoad\\\",type:\\\"boolean\\\"},{name:\\\"name\\\",type:\\\"string\\\"},{name:\\\"type\\\",type:\\\"string\\\"},{name:\\\"model\\\",type:\\\"string\\\"},{name:\\\"associationKey\\\",type:\\\"string\\\"},{name:\\\"foreignKey\\\",type:\\\"string\\\"},{name:\\\"primaryKey\\\",type:\\\"string\\\"},{name:\\\"instanceName\\\",type:\\\"string\\\"}]});/\",\n    min : 0,\n    max : 0\n  } ]\n});", strList28);
        org.junit.Assert.assertNull(abstractValidationList6);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strList28);
    }

    @Test
    public void test05452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05452");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getInverse();
        java.lang.String str3 = referenceBean0.getInverse();
        referenceBean0.setAssociation("/\\/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});\\//");
        referenceBean0.setType("");
        java.lang.String str8 = referenceBean0.getType();
        referenceBean0.setParent("Ext.define(\"ch.rasc.extclassgenerator.validation.PresenceValidation\",{extend:\"Ext.data.Model\",fields:[{name:\"type\",type:\"string\"},{name:\"field\",type:\"string\"}]});");
        java.lang.String str11 = referenceBean0.getType();
        boolean boolean12 = referenceBean0.hasAnyProperties();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test05453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05453");
        ch.rasc.extclassgenerator.validation.PastValidation pastValidation1 = new ch.rasc.extclassgenerator.validation.PastValidation("Ext.define(\"null\",\r\n{\n  extend : \"\",\n  fields : [ ],\n  validations : [ {\n    type : \"range\",\n    field : \"/Ext.define(\\\"ch.rasc.extclassgenerator.association.HasManyAssociation\\\",{extend:\\\"Ext.data.Model\\\",fields:[{name:\\\"autoLoad\\\",type:\\\"boolean\\\"},{name:\\\"name\\\",type:\\\"string\\\"},{name:\\\"type\\\",type:\\\"string\\\"},{name:\\\"model\\\",type:\\\"string\\\"},{name:\\\"associationKey\\\",type:\\\"string\\\"},{name:\\\"foreignKey\\\",type:\\\"string\\\"},{name:\\\"primaryKey\\\",type:\\\"string\\\"},{name:\\\"instanceName\\\",type:\\\"string\\\"}]});/\",\n    min : 0,\n    max : 0\n  } ]\n});");
        java.lang.String str2 = pastValidation1.getType();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "past" + "'", str2, "past");
    }

    @Test
    public void test05454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05454");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.read = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str8 = apiObject0.update;
        java.lang.String str9 = apiObject0.destroy;
        apiObject0.update = "range";
        apiObject0.destroy = "Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ {\n      name : \"debug\",\n      type : \"boolean\"\n    }, {\n      name : \"useSingleQuotes\",\n      type : \"boolean\"\n    }, {\n      name : \"surroundApiWithQuotes\",\n      type : \"boolean\"\n    } ]\n  }\n});";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str8, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test05455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05455");
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation4 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.lang.String str5 = rangeValidation4.getField();
        java.math.BigDecimal bigDecimal6 = rangeValidation4.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation10 = new ch.rasc.extclassgenerator.validation.RangeValidation("format", (java.lang.Long) 52L, (java.lang.Long) 35L);
        java.math.BigDecimal bigDecimal11 = rangeValidation10.getMin();
        java.math.BigDecimal bigDecimal12 = rangeValidation10.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation13 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"null\",\r\n{\n  extend : \"\",\n  fields : [ ],\n  hasMany : [ \"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\", \"json\", \"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\", \"\" ]\n});/", bigDecimal6, bigDecimal12);
        java.math.BigDecimal bigDecimal14 = rangeValidation13.getMax();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});" + "'", str5, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal14);
    }

    @Test
    public void test05456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05456");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        java.lang.String str2 = hasOneAssociation1.getName();
        hasOneAssociation1.setInstanceName("");
        hasOneAssociation1.setName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str7 = hasOneAssociation1.getForeignKey();
        java.lang.String str8 = hasOneAssociation1.getAssociationKey();
        hasOneAssociation1.setInstanceName("");
        hasOneAssociation1.setInstanceName("/Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"debug\",type:\"boolean\"},{name:\"useSingleQuotes\",type:\"boolean\"},{name:\"surroundApiWithQuotes\",type:\"boolean\"}]}});/");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test05457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05457");
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
        javax.lang.model.element.Element element15 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror16 = null;
        javax.lang.model.element.ExecutableElement executableElement17 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable19 = modelAnnotationProcessor0.getCompletions(element15, annotationMirror16, executableElement17, "digits");
        javax.lang.model.element.Element element20 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror21 = null;
        javax.lang.model.element.ExecutableElement executableElement22 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable24 = modelAnnotationProcessor0.getCompletions(element20, annotationMirror21, executableElement22, "ch.rasc.extclassgenerator.PartialDataOptionsBean");
        javax.lang.model.SourceVersion sourceVersion25 = modelAnnotationProcessor0.getSupportedSourceVersion();
        javax.lang.model.SourceVersion sourceVersion26 = modelAnnotationProcessor0.getSupportedSourceVersion();
        java.util.Set<java.lang.String> strSet27 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        javax.annotation.processing.ProcessingEnvironment processingEnvironment28 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelAnnotationProcessor0.init(processingEnvironment28);
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
        org.junit.Assert.assertNotNull(wildcardIterable19);
        org.junit.Assert.assertNotNull(wildcardIterable24);
        org.junit.Assert.assertTrue("'" + sourceVersion25 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion25.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertTrue("'" + sourceVersion26 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion26.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(strSet27);
    }

    @Test
    public void test05458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05458");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("presence", "ch.rasc.extclassgenerator.ModelAnnotationProcessor");
    }

    @Test
    public void test05459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05459");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        java.lang.String str6 = modelFieldBean2.getMapping();
        java.lang.String str7 = modelFieldBean2.getName();
        java.lang.String str8 = modelFieldBean2.getMapping();
        java.lang.String str9 = modelFieldBean2.getType();
        modelFieldBean2.setUnique((java.lang.Boolean) false);
        modelFieldBean2.setCritical((java.lang.Boolean) false);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str9, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
    }

    @Test
    public void test05460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05460");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        java.lang.String str3 = modelBean0.getIdProperty();
        java.lang.String[] strArray4 = modelBean0.getHasMany();
        java.lang.String str5 = modelBean0.getSuccessProperty();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test05461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05461");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.data.Model");
        modelFieldBean2.setAllowNull((java.lang.Boolean) false);
        java.lang.String str5 = modelFieldBean2.getName();
        modelFieldBean2.setDateFormat("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        modelFieldBean2.setUnique((java.lang.Boolean) false);
        java.lang.Boolean boolean10 = modelFieldBean2.getPersist();
        modelFieldBean2.setConvert("Ext.define(\"null\",{extend:\"\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(boolean10);
    }

    @Test
    public void test05462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05462");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        modelBean0.setIdProperty("");
        java.lang.String str5 = modelBean0.getIdentifier();
        modelBean0.setDisablePagingParameters(true);
        java.lang.String str8 = modelBean0.getMessageProperty();
        modelBean0.setReader("/Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});/");
        modelBean0.setReadMethod("format");
        modelBean0.setExtend("Ext.define(\"ch.rasc.extclassgenerator.validation.InclusionValidationArray\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"field\",\n    type : \"string\"\n  } ]\n});");
        modelBean0.setTotalProperty("Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test05463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05463");
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
        modelFieldBean2.setDateFormat("ch.rasc.extclassgenerator.ModelAnnotationProcessor");
        modelFieldBean2.setUseNull((java.lang.Boolean) false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(wildcardIterable22);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(wildcardIterable29);
        org.junit.Assert.assertEquals("'" + boolean31 + "' != '" + true + "'", boolean31, true);
    }

    @Test
    public void test05464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05464");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        modelBean0.setIdProperty("");
        boolean boolean5 = modelBean0.isDisablePagingParameters();
        modelBean0.setReader("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        modelBean0.setWriter("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        boolean boolean10 = modelBean0.isAutodetectTypes();
        modelBean0.setUpdateMethod("future");
        modelBean0.setReader("/hi!/");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean16 = modelBean0.getField("/Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"debug\",type:\"boolean\"},{name:\"useSingleQuotes\",type:\"boolean\"},{name:\"surroundApiWithQuotes\",type:\"boolean\"}]}});/");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(modelFieldBean16);
    }

    @Test
    public void test05465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05465");
        ch.rasc.extclassgenerator.validation.NotBlankValidation notBlankValidation1 = new ch.rasc.extclassgenerator.validation.NotBlankValidation("/exclusion/");
    }

    @Test
    public void test05466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05466");
        ch.rasc.extclassgenerator.ModelAnnotationProcessor modelAnnotationProcessor0 = new ch.rasc.extclassgenerator.ModelAnnotationProcessor();
        java.util.Set<java.lang.String> strSet1 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        javax.lang.model.SourceVersion sourceVersion2 = modelAnnotationProcessor0.getSupportedSourceVersion();
        javax.lang.model.SourceVersion sourceVersion3 = modelAnnotationProcessor0.getSupportedSourceVersion();
        java.util.Set<java.lang.String> strSet4 = modelAnnotationProcessor0.getSupportedOptions();
        java.util.Set<java.lang.String> strSet5 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        javax.lang.model.SourceVersion sourceVersion6 = modelAnnotationProcessor0.getSupportedSourceVersion();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertTrue("'" + sourceVersion2 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion2.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertTrue("'" + sourceVersion3 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion3.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + sourceVersion6 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion6.equals(javax.lang.model.SourceVersion.RELEASE_6));
    }

    @Test
    public void test05467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05467");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});/", "belongsTo");
        java.util.List<ch.rasc.extclassgenerator.validation.AbstractValidation> abstractValidationList3 = modelFieldBean2.getValidators();
        org.junit.Assert.assertNull(abstractValidationList3);
    }

    @Test
    public void test05468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05468");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getRole();
        referenceBean0.setChild("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        referenceBean0.setAssociation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        referenceBean0.setRole("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        referenceBean0.setChild("hi!");
        java.lang.String str11 = referenceBean0.getAssociation();
        java.lang.String str12 = referenceBean0.getInverse();
        referenceBean0.setAssociation("/\\/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});\\//");
        java.lang.String str15 = referenceBean0.getInverse();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});" + "'", str11, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test05469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05469");
        ch.rasc.extclassgenerator.validation.ExclusionValidation exclusionValidation2 = new ch.rasc.extclassgenerator.validation.ExclusionValidation("ch.rasc.extclassgenerator.ModelAnnotationProcessor", "/Ext.define(\"ch.rasc.extclassgenerator.validation.PresenceValidation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"field\",\n    type : \"string\"\n  } ]\n});/");
    }

    @Test
    public void test05470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05470");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        modelBean0.setIdProperty("");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean6 = modelBean0.getField("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});");
        org.junit.Assert.assertNull(modelFieldBean6);
    }

    @Test
    public void test05471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05471");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("Ext.define(\"ch.rasc.extclassgenerator.ReferenceBean\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"type\",type:\"string\"},{name:\"association\",type:\"string\"},{name:\"child\",type:\"string\"},{name:\"parent\",type:\"string\"},{name:\"role\",type:\"string\"},{name:\"inverse\",type:\"string\"}]}});");
        java.lang.String str2 = hasOneAssociation1.getSetterName();
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test05472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05472");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("//");
        hasOneAssociation1.setAssociationKey("Ext.define(\"ch.rasc.extclassgenerator.association.HasOneAssociation\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"setterName\",type:\"string\"},{name:\"getterName\",type:\"string\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]}});");
    }

    @Test
    public void test05473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05473");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray10 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList8);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray11 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("", (java.util.List<java.lang.String>) strList8);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray12 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("json", (java.util.List<java.lang.String>) strList8);
        java.util.List<java.lang.String> strList13 = exclusionValidationArray12.getList();
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray14 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("", strList13);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray15 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("/ch.rasc.extclassgenerator.ModelAnnotationProcessor/", strList13);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test05474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05474");
        ch.rasc.extclassgenerator.validation.CreditCardNumberValidation creditCardNumberValidation1 = new ch.rasc.extclassgenerator.validation.CreditCardNumberValidation("Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"debug\",type:\"boolean\"},{name:\"useSingleQuotes\",type:\"boolean\"},{name:\"surroundApiWithQuotes\",type:\"boolean\"}]}});");
    }

    @Test
    public void test05475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05475");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        modelFieldBean2.setDateFormat("hi!");
        java.lang.Boolean boolean8 = modelFieldBean2.getUseNull();
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        java.lang.Boolean boolean11 = modelFieldBean2.getAllowNull();
        ch.rasc.extclassgenerator.validation.InclusionValidation inclusionValidation14 = new ch.rasc.extclassgenerator.validation.InclusionValidation("/\\/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});\\//", "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});/");
        java.lang.String str15 = inclusionValidation14.getField();
        modelFieldBean2.setReference((java.lang.Object) inclusionValidation14);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "/\\/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});\\//" + "'", str15, "/\\/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});\\//");
    }

    @Test
    public void test05476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05476");
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
        modelFieldBean2.setReference((java.lang.Object) 0L);
        java.util.List<java.lang.String> strList33 = modelFieldBean2.getDepends();
        java.lang.String str34 = modelFieldBean2.getType();
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        java.lang.Boolean boolean37 = modelFieldBean2.getCritical();
        modelFieldBean2.setUnique((java.lang.Boolean) false);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str34, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(boolean37);
    }

    @Test
    public void test05477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05477");
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
        java.util.Set<java.lang.String> strSet13 = modelAnnotationProcessor0.getSupportedOptions();
        javax.annotation.processing.ProcessingEnvironment processingEnvironment14 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelAnnotationProcessor0.init(processingEnvironment14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Tool provided null ProcessingEnvironment");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(wildcardIterable7);
        org.junit.Assert.assertNotNull(wildcardIterable12);
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test05478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05478");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("hi!");
        java.lang.String str2 = hasManyAssociation1.getAssociationKey();
        hasManyAssociation1.setAssociationKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        hasManyAssociation1.setAssociationKey("");
        hasManyAssociation1.setAssociationKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        hasManyAssociation1.setName("Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[],proxy:{type:\"direct\",directFn:hi!}});");
        hasManyAssociation1.setName("/\\/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});\\//");
        java.lang.String str13 = hasManyAssociation1.getModel();
        hasManyAssociation1.setAutoLoad((java.lang.Boolean) true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test05479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05479");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("hi!");
        hasManyAssociation1.setAssociationKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str4 = hasManyAssociation1.getInstanceName();
        hasManyAssociation1.setName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        hasManyAssociation1.setPrimaryKey("");
        java.lang.Boolean boolean9 = hasManyAssociation1.getAutoLoad();
        hasManyAssociation1.setPrimaryKey("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        hasManyAssociation1.setName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str14 = hasManyAssociation1.getInstanceName();
        hasManyAssociation1.setAutoLoad((java.lang.Boolean) false);
        hasManyAssociation1.setAutoLoad((java.lang.Boolean) false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test05480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05480");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        referenceBean0.setType("");
        java.lang.String str3 = referenceBean0.getAssociation();
        referenceBean0.setInverse("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        java.lang.String str6 = referenceBean0.getType();
        java.lang.String str7 = referenceBean0.getParent();
        referenceBean0.setChild("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        referenceBean0.setChild("ch.rasc.extclassgenerator.ModelAnnotationProcessor");
        referenceBean0.setType("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]}});");
        referenceBean0.setAssociation("/Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});/");
        java.lang.String str16 = referenceBean0.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]}});" + "'", str16, "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]}});");
    }

    @Test
    public void test05481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05481");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.data.Model");
        modelFieldBean2.setAllowNull((java.lang.Boolean) false);
        java.lang.String str5 = modelFieldBean2.getName();
        modelFieldBean2.setDateFormat("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        modelFieldBean2.setUnique((java.lang.Boolean) false);
        modelFieldBean2.setCritical((java.lang.Boolean) true);
        modelFieldBean2.setPersist((java.lang.Boolean) false);
        java.lang.Boolean boolean14 = modelFieldBean2.getAllowBlank();
        java.lang.String str15 = modelFieldBean2.getDateFormat();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/" + "'", str15, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
    }

    @Test
    public void test05482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05482");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setDateFormat("hi!");
        ch.rasc.extclassgenerator.OutputConfig outputConfig5 = new ch.rasc.extclassgenerator.OutputConfig();
        boolean boolean6 = outputConfig5.isDebug();
        ch.rasc.extclassgenerator.OutputFormat outputFormat7 = outputConfig5.getOutputFormat();
        boolean boolean8 = outputConfig5.isDebug();
        boolean boolean9 = modelFieldBean2.hasOnlyName(outputConfig5);
        ch.rasc.extclassgenerator.IncludeValidation includeValidation10 = outputConfig5.getIncludeValidation();
        ch.rasc.extclassgenerator.ModelBean modelBean12 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean12.setDisablePagingParameters(false);
        java.util.List<ch.rasc.extclassgenerator.association.AbstractAssociation> abstractAssociationList15 = modelBean12.getAssociations();
        java.lang.String str16 = modelBean12.getMessageProperty();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation22 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal23 = rangeValidation22.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation27 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal28 = rangeValidation27.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation29 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal23, bigDecimal28);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation35 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal36 = rangeValidation35.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation40 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal41 = rangeValidation40.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation42 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal36, bigDecimal41);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation47 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal48 = rangeValidation47.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation52 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal53 = rangeValidation52.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation54 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal48, bigDecimal53);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation55 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal41, bigDecimal48);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation56 = new ch.rasc.extclassgenerator.validation.RangeValidation("digits", bigDecimal23, bigDecimal41);
        modelBean12.addValidation((ch.rasc.extclassgenerator.validation.AbstractValidation) rangeValidation56);
        java.math.BigDecimal bigDecimal58 = rangeValidation56.getMin();
        java.math.BigDecimal bigDecimal59 = rangeValidation56.getMin();
        java.math.BigDecimal bigDecimal60 = rangeValidation56.getMax();
        java.math.BigDecimal bigDecimal61 = rangeValidation56.getMax();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation66 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal67 = rangeValidation66.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation71 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal72 = rangeValidation71.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation73 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal67, bigDecimal72);
        java.lang.String str74 = rangeValidation73.getField();
        java.math.BigDecimal bigDecimal75 = rangeValidation73.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation76 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});/", bigDecimal61, bigDecimal75);
        java.math.BigDecimal bigDecimal77 = rangeValidation76.getMax();
        boolean boolean78 = outputConfig5.equals((java.lang.Object) rangeValidation76);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(outputFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(includeValidation10);
        org.junit.Assert.assertNotNull(abstractAssociationList15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertNotNull(bigDecimal36);
        org.junit.Assert.assertNotNull(bigDecimal41);
        org.junit.Assert.assertNotNull(bigDecimal48);
        org.junit.Assert.assertNotNull(bigDecimal53);
        org.junit.Assert.assertNotNull(bigDecimal58);
        org.junit.Assert.assertNotNull(bigDecimal59);
        org.junit.Assert.assertNotNull(bigDecimal60);
        org.junit.Assert.assertNotNull(bigDecimal61);
        org.junit.Assert.assertNotNull(bigDecimal67);
        org.junit.Assert.assertNotNull(bigDecimal72);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/" + "'", str74, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        org.junit.Assert.assertNotNull(bigDecimal75);
        org.junit.Assert.assertNotNull(bigDecimal77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test05483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05483");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("hi!");
        hasManyAssociation1.setAssociationKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str4 = hasManyAssociation1.getInstanceName();
        hasManyAssociation1.setPrimaryKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str7 = hasManyAssociation1.getForeignKey();
        hasManyAssociation1.setInstanceName("hi!");
        hasManyAssociation1.setPrimaryKey("hi!");
        java.lang.String str12 = hasManyAssociation1.getInstanceName();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test05484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05484");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("");
        java.lang.String str2 = belongsToAssociation1.getGetterName();
        belongsToAssociation1.setGetterName("range");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test05485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05485");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getChild();
        boolean boolean2 = referenceBean0.typeOnly();
        java.lang.String str3 = referenceBean0.getInverse();
        java.lang.String str4 = referenceBean0.getInverse();
        java.lang.String str5 = referenceBean0.getParent();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test05486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05486");
        ch.rasc.extclassgenerator.validation.DigitsValidation digitsValidation3 = new ch.rasc.extclassgenerator.validation.DigitsValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});/", (int) 'a', (int) '4');
        int int4 = digitsValidation3.getFraction();
        java.lang.String str5 = digitsValidation3.getType();
        int int6 = digitsValidation3.getFraction();
        int int7 = digitsValidation3.getInteger();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "digits" + "'", str5, "digits");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test05487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05487");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getChild();
        java.lang.String str3 = referenceBean0.getChild();
        referenceBean0.setRole("hi!");
        referenceBean0.setParent("Ext.define(\"ch.rasc.extclassgenerator.validation.PresenceValidation\",{extend:\"Ext.data.Model\",fields:[{name:\"type\",type:\"string\"},{name:\"field\",type:\"string\"}]});");
        java.lang.String str8 = referenceBean0.getChild();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test05488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05488");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean4 = allDataOptionsBean0.getPersist();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        allDataOptionsBean0.setPersist((java.lang.Boolean) false);
        boolean boolean9 = allDataOptionsBean0.hasAnyProperties();
        java.lang.Boolean boolean10 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean11 = allDataOptionsBean0.getCritical();
        boolean boolean12 = allDataOptionsBean0.hasAnyProperties();
        allDataOptionsBean0.setPersist((java.lang.Boolean) false);
        java.lang.Boolean boolean15 = allDataOptionsBean0.getPersist();
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + false + "'", boolean10, false);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + boolean15 + "' != '" + false + "'", boolean15, false);
    }

    @Test
    public void test05489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05489");
        ch.rasc.extclassgenerator.validation.InclusionValidation inclusionValidation2 = new ch.rasc.extclassgenerator.validation.InclusionValidation("Ext.define(\"null\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ],\n    proxy : {\n      type : \"direct\",\n      reader : {\n        type : \"Ext.define(\\\"java.util.ArrayList\\\",\\r\\n{\\n  extend : \\\"Ext.data.Model\\\",\\n  fields : [ ]\\n});\"\n      }\n    }\n  }\n});", "/hi!/");
    }

    @Test
    public void test05490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05490");
        ch.rasc.extclassgenerator.validation.EmailValidation emailValidation1 = new ch.rasc.extclassgenerator.validation.EmailValidation("Ext.define(\"ch.rasc.extclassgenerator.validation.RangeValidation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"min\",\n    type : \"float\"\n  }, {\n    name : \"max\",\n    type : \"float\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"field\",\n    type : \"string\"\n  } ]\n});");
    }

    @Test
    public void test05491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05491");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/");
        java.lang.String str2 = belongsToAssociation1.getModel();
        belongsToAssociation1.setForeignKey("Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
        belongsToAssociation1.setGetterName("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});");
        belongsToAssociation1.setForeignKey("Ext.data.Model");
        java.lang.String str9 = belongsToAssociation1.getSetterName();
        java.lang.String str10 = belongsToAssociation1.getModel();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/" + "'", str2, "/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/" + "'", str10, "/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/");
    }

    @Test
    public void test05492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05492");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        referenceBean0.setInverse("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
        referenceBean0.setRole("digits");
        java.lang.String str5 = referenceBean0.getType();
        referenceBean0.setChild("email");
        boolean boolean8 = referenceBean0.hasAnyProperties();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test05493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05493");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean4 = allDataOptionsBean0.getCritical();
        java.lang.Boolean boolean5 = allDataOptionsBean0.getPersist();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        allDataOptionsBean0.setChanges((java.lang.Boolean) true);
        java.lang.Boolean boolean10 = allDataOptionsBean0.getChanges();
        java.lang.Boolean boolean11 = allDataOptionsBean0.getAssociated();
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + false + "'", boolean11, false);
    }

    @Test
    public void test05494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05494");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("Ext.define('ch.rasc.extclassgenerator.ModelAnnotationProcessor',{extend:'Ext.data.Model',fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 97L);
    }

    @Test
    public void test05495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05495");
        ch.rasc.extclassgenerator.ModelAnnotationProcessor modelAnnotationProcessor0 = new ch.rasc.extclassgenerator.ModelAnnotationProcessor();
        java.util.Set<java.lang.String> strSet1 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        java.util.Set<java.lang.String> strSet2 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        java.util.Set<java.lang.String> strSet3 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        java.util.Set<java.lang.String> strSet4 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        javax.lang.model.SourceVersion sourceVersion5 = modelAnnotationProcessor0.getSupportedSourceVersion();
        java.util.Set<java.lang.String> strSet6 = modelAnnotationProcessor0.getSupportedOptions();
        java.util.Set<java.lang.String> strSet7 = modelAnnotationProcessor0.getSupportedOptions();
        java.util.Set<java.lang.String> strSet8 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        javax.lang.model.SourceVersion sourceVersion9 = modelAnnotationProcessor0.getSupportedSourceVersion();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + sourceVersion5 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion5.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + sourceVersion9 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion9.equals(javax.lang.model.SourceVersion.RELEASE_6));
    }

    @Test
    public void test05496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05496");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean3 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean3.setConvert("hi!");
        modelFieldBean3.setMapping("hi!");
        modelFieldBean3.setUseNull((java.lang.Boolean) true);
        modelFieldBean3.setAllowBlank((java.lang.Boolean) false);
        modelFieldBean3.setConvert("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        java.lang.String str14 = modelFieldBean3.getDateFormat();
        java.lang.Boolean boolean15 = modelFieldBean3.getAllowBlank();
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray25 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList23);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray26 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("digits", (java.util.List<java.lang.String>) strList23);
        java.util.List<java.lang.String> strList27 = inclusionValidationArray26.getList();
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray28 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("", strList27);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray29 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("length", strList27);
        java.util.List<java.lang.String> strList30 = inclusionValidationArray29.getList();
        modelFieldBean3.setDepends(strList30);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray32 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});/", strList30);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + boolean15 + "' != '" + false + "'", boolean15, false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(strList30);
    }

    @Test
    public void test05497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05497");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        java.lang.String str10 = referenceBean0.getType();
        java.lang.String str11 = referenceBean0.getParent();
        referenceBean0.setType("Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
        referenceBean0.setAssociation("hasOne");
        boolean boolean16 = referenceBean0.hasAnyProperties();
        java.lang.String str17 = referenceBean0.getParent();
        java.lang.String str18 = referenceBean0.getChild();
        java.lang.String str19 = referenceBean0.getAssociation();
        java.lang.String str20 = referenceBean0.getRole();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hasOne" + "'", str19, "hasOne");
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test05498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05498");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        java.lang.String str6 = modelFieldBean2.getMapping();
        java.lang.Object obj7 = modelFieldBean2.getReference();
        modelFieldBean2.setCalculate("exclusion");
        java.lang.Boolean boolean10 = modelFieldBean2.getUnique();
        modelFieldBean2.setMapping("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.util.List<ch.rasc.extclassgenerator.validation.AbstractValidation> abstractValidationList13 = modelFieldBean2.getValidators();
        ch.rasc.extclassgenerator.ReferenceBean referenceBean14 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str15 = referenceBean14.getChild();
        referenceBean14.setType("Ext.data.Model");
        modelFieldBean2.setReference((java.lang.Object) referenceBean14);
        modelFieldBean2.setAllowBlank((java.lang.Boolean) false);
        java.lang.String str21 = modelFieldBean2.getMapping();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNull(abstractValidationList13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str21, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
    }

    @Test
    public void test05499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05499");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean4 = allDataOptionsBean0.getPersist();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        allDataOptionsBean0.setPersist((java.lang.Boolean) false);
        allDataOptionsBean0.setChanges((java.lang.Boolean) false);
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        allDataOptionsBean0.setChanges((java.lang.Boolean) false);
        java.lang.Boolean boolean15 = allDataOptionsBean0.getPersist();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean18 = allDataOptionsBean0.getAssociated();
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertEquals("'" + boolean15 + "' != '" + false + "'", boolean15, false);
        org.junit.Assert.assertEquals("'" + boolean18 + "' != '" + false + "'", boolean18, false);
    }

    @Test
    public void test05500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05500");
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
        modelFieldBean2.setName("hasMany");
        java.util.List<ch.rasc.extclassgenerator.validation.AbstractValidation> abstractValidationList23 = modelFieldBean2.getValidators();
        java.lang.Boolean boolean24 = modelFieldBean2.getUnique();
        java.lang.Object obj25 = modelFieldBean2.getReference();
        java.lang.String str26 = modelFieldBean2.getDateFormat();
        org.junit.Assert.assertNotNull(abstractValidationArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(strList19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(abstractValidationList23);
        org.junit.Assert.assertNull(boolean24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(str26);
    }
}

