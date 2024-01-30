import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest24 {

    public static boolean debug = false;

    @Test
    public void test12001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12001");
        ch.rasc.extclassgenerator.validation.InclusionValidation inclusionValidation2 = new ch.rasc.extclassgenerator.validation.InclusionValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});", "");
    }

    @Test
    public void test12002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12002");
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation6 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});", (java.lang.Long) 0L, (java.lang.Long) 32L);
        java.math.BigDecimal bigDecimal7 = rangeValidation6.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation11 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});", (java.lang.Long) 97L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal12 = rangeValidation11.getMin();
        java.math.BigDecimal bigDecimal13 = rangeValidation11.getMax();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation14 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});", bigDecimal7, bigDecimal13);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation18 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal19 = rangeValidation18.getMin();
        java.math.BigDecimal bigDecimal20 = rangeValidation18.getMin();
        java.math.BigDecimal bigDecimal21 = rangeValidation18.getMin();
        java.math.BigDecimal bigDecimal22 = rangeValidation18.getMin();
        java.math.BigDecimal bigDecimal23 = rangeValidation18.getMax();
        java.math.BigDecimal bigDecimal24 = rangeValidation18.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation25 = new ch.rasc.extclassgenerator.validation.RangeValidation("notBlank", bigDecimal13, bigDecimal24);
        java.math.BigDecimal bigDecimal27 = null;
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation31 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});", (java.lang.Long) 100L, (java.lang.Long) 100L);
        java.math.BigDecimal bigDecimal32 = rangeValidation31.getMax();
        java.math.BigDecimal bigDecimal33 = rangeValidation31.getMax();
        java.math.BigDecimal bigDecimal34 = rangeValidation31.getMin();
        java.math.BigDecimal bigDecimal35 = rangeValidation31.getMin();
        java.math.BigDecimal bigDecimal36 = rangeValidation31.getMax();
        java.math.BigDecimal bigDecimal37 = rangeValidation31.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation38 = new ch.rasc.extclassgenerator.validation.RangeValidation("", bigDecimal27, bigDecimal37);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation39 = new ch.rasc.extclassgenerator.validation.RangeValidation("ch.rasc.extclassgenerator.ModelFieldBean", bigDecimal24, bigDecimal27);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertNotNull(bigDecimal33);
        org.junit.Assert.assertNotNull(bigDecimal34);
        org.junit.Assert.assertNotNull(bigDecimal35);
        org.junit.Assert.assertNotNull(bigDecimal36);
        org.junit.Assert.assertNotNull(bigDecimal37);
    }

    @Test
    public void test12003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12003");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getRole();
        referenceBean0.setChild("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        referenceBean0.setAssociation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        java.lang.String str7 = referenceBean0.getChild();
        referenceBean0.setType("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        referenceBean0.setParent("inclusion");
        java.lang.String str12 = referenceBean0.getType();
        java.lang.String str13 = referenceBean0.getInverse();
        referenceBean0.setChild("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});/");
        referenceBean0.setAssociation("Ext.define(\"null\",{extend:\"Ext.data.Model\",idProperty:\"hi!\",fields:[],proxy:{type:\"direct\",idParam:\"hi!\"}});");
        java.lang.String str18 = referenceBean0.getType();
        java.lang.String str19 = referenceBean0.getAssociation();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});" + "'", str7, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});" + "'", str12, "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});" + "'", str18, "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Ext.define(\"null\",{extend:\"Ext.data.Model\",idProperty:\"hi!\",fields:[],proxy:{type:\"direct\",idParam:\"hi!\"}});" + "'", str19, "Ext.define(\"null\",{extend:\"Ext.data.Model\",idProperty:\"hi!\",fields:[],proxy:{type:\"direct\",idParam:\"hi!\"}});");
    }

    @Test
    public void test12004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12004");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("hasOne");
        java.lang.String str2 = belongsToAssociation1.getSetterName();
        belongsToAssociation1.setSetterName("Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});");
        java.lang.String str5 = belongsToAssociation1.getForeignKey();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test12005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12005");
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
        modelFieldBean2.setCritical((java.lang.Boolean) true);
        java.lang.String str23 = modelFieldBean2.getConvert();
        org.junit.Assert.assertNotNull(abstractValidationArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(strList19);
        org.junit.Assert.assertNull(modelType20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test12006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12006");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.data.Model");
        modelFieldBean2.setAllowNull((java.lang.Boolean) false);
        java.lang.String str5 = modelFieldBean2.getName();
        modelFieldBean2.setDateFormat("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        modelFieldBean2.setUnique((java.lang.Boolean) false);
        modelFieldBean2.setCritical((java.lang.Boolean) true);
        modelFieldBean2.setPersist((java.lang.Boolean) false);
        java.lang.Boolean boolean14 = modelFieldBean2.getAllowNull();
        java.lang.String str15 = modelFieldBean2.getCalculate();
        java.lang.String str16 = modelFieldBean2.getConvert();
        java.lang.String str17 = modelFieldBean2.getDateFormat();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + boolean14 + "' != '" + false + "'", boolean14, false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/" + "'", str17, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
    }

    @Test
    public void test12007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12007");
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation4 = new ch.rasc.extclassgenerator.validation.RangeValidation("ch.rasc.extclassgenerator.ModelAnnotationProcessor", (java.lang.Long) 100L, (java.lang.Long) 97L);
        java.math.BigDecimal bigDecimal5 = rangeValidation4.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation11 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal12 = rangeValidation11.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation16 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal17 = rangeValidation16.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation18 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal12, bigDecimal17);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation24 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal25 = rangeValidation24.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation29 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal30 = rangeValidation29.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation31 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal25, bigDecimal30);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation36 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal37 = rangeValidation36.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation41 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal42 = rangeValidation41.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation43 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal37, bigDecimal42);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation44 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal30, bigDecimal37);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation45 = new ch.rasc.extclassgenerator.validation.RangeValidation("digits", bigDecimal12, bigDecimal30);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation46 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.validation.InclusionValidationArray\",{extend:\"Ext.data.Model\",fields:[{name:\"type\",type:\"string\"},{name:\"field\",type:\"string\"}]});", bigDecimal5, bigDecimal12);
        java.math.BigDecimal bigDecimal47 = rangeValidation46.getMax();
        java.math.BigDecimal bigDecimal48 = rangeValidation46.getMax();
        java.math.BigDecimal bigDecimal49 = rangeValidation46.getMax();
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(bigDecimal37);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertNotNull(bigDecimal47);
        org.junit.Assert.assertNotNull(bigDecimal48);
        org.junit.Assert.assertNotNull(bigDecimal49);
    }

    @Test
    public void test12008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12008");
        ch.rasc.extclassgenerator.validation.DigitsValidation digitsValidation3 = new ch.rasc.extclassgenerator.validation.DigitsValidation("/json/", (int) 'a', (int) (byte) 0);
    }

    @Test
    public void test12009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12009");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        modelFieldBean2.setMapping("hi!");
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        modelFieldBean2.setAllowBlank((java.lang.Boolean) false);
        modelFieldBean2.setConvert("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        java.lang.Object obj13 = modelFieldBean2.getDefaultValue();
        java.lang.Boolean boolean14 = modelFieldBean2.getPersist();
        java.lang.String str15 = modelFieldBean2.getMapping();
        modelFieldBean2.setUnique((java.lang.Boolean) false);
        java.lang.String str18 = modelFieldBean2.getType();
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str18, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
    }

    @Test
    public void test12010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12010");
        ch.rasc.extclassgenerator.validation.DigitsValidation digitsValidation3 = new ch.rasc.extclassgenerator.validation.DigitsValidation("/Ext.define(\"null\",{extend:\"\",config:{fields:[]}});/", 0, (int) (byte) -1);
        int int4 = digitsValidation3.getFraction();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test12011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12011");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean4 = allDataOptionsBean0.getPersist();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        allDataOptionsBean0.setPersist((java.lang.Boolean) false);
        java.lang.Boolean boolean9 = allDataOptionsBean0.getPersist();
        java.lang.Boolean boolean10 = allDataOptionsBean0.getPersist();
        allDataOptionsBean0.setCritical((java.lang.Boolean) false);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + false + "'", boolean9, false);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + false + "'", boolean10, false);
    }

    @Test
    public void test12012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12012");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        java.lang.String str2 = hasOneAssociation1.getName();
        hasOneAssociation1.setInstanceName("");
        java.lang.String str5 = hasOneAssociation1.getInstanceName();
        hasOneAssociation1.setSetterName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str8 = hasOneAssociation1.getGetterName();
        hasOneAssociation1.setSetterName("belongsTo");
        hasOneAssociation1.setSetterName("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});/");
        hasOneAssociation1.setSetterName("length");
        java.lang.String str15 = hasOneAssociation1.getAssociationKey();
        java.lang.String str16 = hasOneAssociation1.getForeignKey();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test12013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12013");
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
        modelBean0.setWriter("/ch.rasc.extclassgenerator.ModelAnnotationProcessor/");
        modelBean0.setDestroyMethod("Ext.define(\"ch.rasc.extclassgenerator.AllDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test12014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12014");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.update = "exclusion";
        apiObject0.update = "exclusion";
        apiObject0.update = "Ext.define(\"null\",\r\n{\n  extend : \"\",\n  fields : [ ],\n  validations : [ {\n    type : \"range\",\n    field : \"/Ext.define(\\\"ch.rasc.extclassgenerator.association.HasManyAssociation\\\",{extend:\\\"Ext.data.Model\\\",fields:[{name:\\\"autoLoad\\\",type:\\\"boolean\\\"},{name:\\\"name\\\",type:\\\"string\\\"},{name:\\\"type\\\",type:\\\"string\\\"},{name:\\\"model\\\",type:\\\"string\\\"},{name:\\\"associationKey\\\",type:\\\"string\\\"},{name:\\\"foreignKey\\\",type:\\\"string\\\"},{name:\\\"primaryKey\\\",type:\\\"string\\\"},{name:\\\"instanceName\\\",type:\\\"string\\\"}]});/\",\n    min : 0,\n    max : 0\n  } ]\n});";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
    }

    @Test
    public void test12015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12015");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});", "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});/");
        java.lang.Boolean boolean3 = modelFieldBean2.getUseNull();
        modelFieldBean2.setCalculate("Ext.define(\"null\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ],\n  proxy : {\n    type : \"direct\",\n    reader : {\n      totalProperty : \"/Ext.define(\\\"ch.rasc.extclassgenerator.association.HasManyAssociation\\\",{extend:\\\"Ext.data.Model\\\",fields:[{name:\\\"autoLoad\\\",type:\\\"boolean\\\"},{name:\\\"name\\\",type:\\\"string\\\"},{name:\\\"type\\\",type:\\\"string\\\"},{name:\\\"model\\\",type:\\\"string\\\"},{name:\\\"associationKey\\\",type:\\\"string\\\"},{name:\\\"foreignKey\\\",type:\\\"string\\\"},{name:\\\"primaryKey\\\",type:\\\"string\\\"},{name:\\\"instanceName\\\",type:\\\"string\\\"}]});/\"\n    }\n  }\n});");
        java.lang.String str6 = modelFieldBean2.getCalculate();
        modelFieldBean2.setAllowNull((java.lang.Boolean) true);
        modelFieldBean2.setName("/inclusion/");
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Ext.define(\"null\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ],\n  proxy : {\n    type : \"direct\",\n    reader : {\n      totalProperty : \"/Ext.define(\\\"ch.rasc.extclassgenerator.association.HasManyAssociation\\\",{extend:\\\"Ext.data.Model\\\",fields:[{name:\\\"autoLoad\\\",type:\\\"boolean\\\"},{name:\\\"name\\\",type:\\\"string\\\"},{name:\\\"type\\\",type:\\\"string\\\"},{name:\\\"model\\\",type:\\\"string\\\"},{name:\\\"associationKey\\\",type:\\\"string\\\"},{name:\\\"foreignKey\\\",type:\\\"string\\\"},{name:\\\"primaryKey\\\",type:\\\"string\\\"},{name:\\\"instanceName\\\",type:\\\"string\\\"}]});/\"\n    }\n  }\n});" + "'", str6, "Ext.define(\"null\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ],\n  proxy : {\n    type : \"direct\",\n    reader : {\n      totalProperty : \"/Ext.define(\\\"ch.rasc.extclassgenerator.association.HasManyAssociation\\\",{extend:\\\"Ext.data.Model\\\",fields:[{name:\\\"autoLoad\\\",type:\\\"boolean\\\"},{name:\\\"name\\\",type:\\\"string\\\"},{name:\\\"type\\\",type:\\\"string\\\"},{name:\\\"model\\\",type:\\\"string\\\"},{name:\\\"associationKey\\\",type:\\\"string\\\"},{name:\\\"foreignKey\\\",type:\\\"string\\\"},{name:\\\"primaryKey\\\",type:\\\"string\\\"},{name:\\\"instanceName\\\",type:\\\"string\\\"}]});/\"\n    }\n  }\n});");
    }

    @Test
    public void test12016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12016");
        ch.rasc.extclassgenerator.validation.ExclusionValidation exclusionValidation2 = new ch.rasc.extclassgenerator.validation.ExclusionValidation("java.util.ArrayList", "java.util.ArrayList");
    }

    @Test
    public void test12017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12017");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        java.lang.String str7 = modelFieldBean2.getName();
        java.lang.Object obj8 = modelFieldBean2.getDefaultValue();
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        java.lang.String str11 = modelFieldBean2.getMapping();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test12018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12018");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});", "Ext.define(\"Ext.define(\"null\",{extend:\"Ext.data.Model\",idProperty:\"hi!\",fields:[],proxy:{type:\"direct\",idParam:\"hi!\"}});\",{extend:\"/\\\\/Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\\\\//\",uses:[\"hi!\"],fields:[],hasMany:[\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\",\"json\",\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\",\"\"],associations:[{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],proxy:{type:\"direct\",directFn:hi!}});");
        modelFieldBean2.setAllowNull((java.lang.Boolean) true);
        java.lang.Object obj5 = modelFieldBean2.getDefaultValue();
        java.lang.String str6 = modelFieldBean2.getConvert();
        modelFieldBean2.setAllowBlank((java.lang.Boolean) false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test12019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12019");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        java.lang.String str3 = modelBean0.getIdProperty();
        java.lang.String str4 = modelBean0.getCreateMethod();
        modelBean0.setIdProperty("hi!");
        java.lang.String str7 = modelBean0.getName();
        java.lang.String str8 = modelBean0.getDestroyMethod();
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean9 = null;
        modelBean0.setAllDataOptions(allDataOptionsBean9);
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean12 = modelBean0.getField("/format/");
        boolean boolean13 = modelBean0.isAutodetectTypes();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(modelFieldBean12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test12020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12020");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean4 = allDataOptionsBean0.getPersist();
        java.lang.Boolean boolean5 = allDataOptionsBean0.getPersist();
        java.lang.Boolean boolean6 = allDataOptionsBean0.getPersist();
        allDataOptionsBean0.setPersist((java.lang.Boolean) true);
        boolean boolean9 = allDataOptionsBean0.hasAnyProperties();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) true);
        java.lang.Boolean boolean12 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean13 = allDataOptionsBean0.getAssociated();
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + true + "'", boolean13, true);
    }

    @Test
    public void test12021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12021");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        referenceBean0.setParent("");
        java.lang.String str12 = referenceBean0.getType();
        java.lang.String str13 = referenceBean0.getChild();
        referenceBean0.setRole("/hi!/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test12022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12022");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Object obj5 = modelFieldBean2.getReference();
        modelFieldBean2.setPersist((java.lang.Boolean) false);
        modelFieldBean2.setDateFormat("Ext.data.Model");
        java.lang.String str10 = modelFieldBean2.getType();
        modelFieldBean2.setCalculate("belongsTo");
        modelFieldBean2.setConvert("Ext.define(\"null\",\r\n{\n  extend : \"\",\n  fields : [ ],\n  validations : [ {\n    type : \"range\",\n    field : \"/Ext.define(\\\"ch.rasc.extclassgenerator.association.HasManyAssociation\\\",{extend:\\\"Ext.data.Model\\\",fields:[{name:\\\"autoLoad\\\",type:\\\"boolean\\\"},{name:\\\"name\\\",type:\\\"string\\\"},{name:\\\"type\\\",type:\\\"string\\\"},{name:\\\"model\\\",type:\\\"string\\\"},{name:\\\"associationKey\\\",type:\\\"string\\\"},{name:\\\"foreignKey\\\",type:\\\"string\\\"},{name:\\\"primaryKey\\\",type:\\\"string\\\"},{name:\\\"instanceName\\\",type:\\\"string\\\"}]});/\",\n    min : 0,\n    max : 0\n  } ]\n});");
        modelFieldBean2.setConvert("/email/");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str10, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
    }

    @Test
    public void test12023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12023");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.read;
        apiObject0.update = "hi!";
        apiObject0.update = "ch.rasc.extclassgenerator.ModelAnnotationProcessor";
        apiObject0.read = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});";
        apiObject0.destroy = "Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});";
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.validation.PresenceValidation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"field\",\n    type : \"string\"\n  } ]\n});";
        java.lang.String str14 = apiObject0.destroy;
        apiObject0.read = "Ext.define(\"ch.rasc.extclassgenerator.validation.InclusionValidationArray\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"field\",\n    type : \"string\"\n  } ]\n});";
        apiObject0.create = "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});";
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});" + "'", str14, "Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});");
    }

    @Test
    public void test12024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12024");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("", "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});/");
        modelFieldBean2.setMapping("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});/");
        modelFieldBean2.setUseNull((java.lang.Boolean) false);
    }

    @Test
    public void test12025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12025");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getRole();
        referenceBean0.setInverse("");
        referenceBean0.setChild("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});");
        referenceBean0.setInverse("/Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",{extend:\"Ext.data.Model\",fields:[{name:\"debug\",type:\"boolean\"},{name:\"useSingleQuotes\",type:\"boolean\"},{name:\"surroundApiWithQuotes\",type:\"boolean\"}]});/");
        java.lang.String str9 = referenceBean0.getType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test12026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12026");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("Ext.define(\"ch.rasc.extclassgenerator.ApiObject\",{extend:\"Ext.data.Model\",fields:[{name:\"read\",type:\"string\"},{name:\"create\",type:\"string\"},{name:\"update\",type:\"string\"},{name:\"destroy\",type:\"string\"}]});", (java.lang.Integer) 100, (java.lang.Integer) 52);
    }

    @Test
    public void test12027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12027");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/");
        java.lang.String str2 = belongsToAssociation1.getModel();
        java.lang.String str3 = belongsToAssociation1.getGetterName();
        java.lang.String str4 = belongsToAssociation1.getModel();
        belongsToAssociation1.setSetterName("length");
        belongsToAssociation1.setGetterName("Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]}});");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/" + "'", str2, "/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/" + "'", str4, "/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/");
    }

    @Test
    public void test12028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12028");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.read = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.update = "";
        apiObject0.create = "digits";
        apiObject0.read = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});";
        apiObject0.create = "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});/";
        java.lang.String str16 = apiObject0.create;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});/" + "'", str16, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});/");
    }

    @Test
    public void test12029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12029");
        ch.rasc.extclassgenerator.ModelAnnotationProcessor modelAnnotationProcessor0 = new ch.rasc.extclassgenerator.ModelAnnotationProcessor();
        java.util.Set<java.lang.String> strSet1 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        java.util.Set<java.lang.String> strSet2 = modelAnnotationProcessor0.getSupportedOptions();
        java.util.Set<java.lang.String> strSet3 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        java.util.Set<java.lang.String> strSet4 = modelAnnotationProcessor0.getSupportedOptions();
        javax.lang.model.element.Element element5 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror6 = null;
        javax.lang.model.element.ExecutableElement executableElement7 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable9 = modelAnnotationProcessor0.getCompletions(element5, annotationMirror6, executableElement7, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        javax.lang.model.element.Element element10 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror11 = null;
        javax.lang.model.element.ExecutableElement executableElement12 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable14 = modelAnnotationProcessor0.getCompletions(element10, annotationMirror11, executableElement12, "Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
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
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(wildcardIterable9);
        org.junit.Assert.assertNotNull(wildcardIterable14);
    }

    @Test
    public void test12030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12030");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("Ext.define(\"ch.rasc.extclassgenerator.ApiObject\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"read\",type:\"string\"},{name:\"create\",type:\"string\"},{name:\"update\",type:\"string\"},{name:\"destroy\",type:\"string\"}]}});");
    }

    @Test
    public void test12031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12031");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("");
        belongsToAssociation1.setForeignKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        belongsToAssociation1.setSetterName("/Ext.define(\"ch.rasc.extclassgenerator.validation.RangeValidation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"min\",\n    type : \"float\"\n  }, {\n    name : \"max\",\n    type : \"float\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"field\",\n    type : \"string\"\n  } ]\n});/");
    }

    @Test
    public void test12032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12032");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.update = "exclusion";
        java.lang.String str8 = apiObject0.update;
        java.lang.String str9 = apiObject0.update;
        java.lang.String str10 = apiObject0.update;
        apiObject0.destroy = "Ext.define(\"null\",{extend:\"\",config:{fields:[]}});";
        apiObject0.update = "Ext.define('null',{extend:'/Ext.define(\\'ch.rasc.extclassgenerator.association.HasManyAssociation\\',{extend:\\'Ext.data.Model\\',fields:[{name:\\'autoLoad\\',type:\\'boolean\\'},{name:\\'name\\',type:\\'string\\'},{name:\\'type\\',type:\\'string\\'},{name:\\'model\\',type:\\'string\\'},{name:\\'associationKey\\',type:\\'string\\'},{name:\\'foreignKey\\',type:\\'string\\'},{name:\\'primaryKey\\',type:\\'string\\'},{name:\\'instanceName\\',type:\\'string\\'}]});/',config:{fields:[],proxy:{type:'direct',api:{update:creditCardNumber}}}});";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "exclusion" + "'", str8, "exclusion");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "exclusion" + "'", str9, "exclusion");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "exclusion" + "'", str10, "exclusion");
    }

    @Test
    public void test12033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12033");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        java.lang.String str2 = hasOneAssociation1.getName();
        hasOneAssociation1.setInstanceName("");
        java.lang.String str5 = hasOneAssociation1.getInstanceName();
        hasOneAssociation1.setSetterName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str8 = hasOneAssociation1.getGetterName();
        hasOneAssociation1.setSetterName("belongsTo");
        hasOneAssociation1.setSetterName("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});/");
        hasOneAssociation1.setSetterName("length");
        java.lang.String str15 = hasOneAssociation1.getAssociationKey();
        java.lang.String str16 = hasOneAssociation1.getGetterName();
        hasOneAssociation1.setInstanceName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test12034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12034");
        ch.rasc.extclassgenerator.validation.ExclusionValidation exclusionValidation2 = new ch.rasc.extclassgenerator.validation.ExclusionValidation("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});", "Ext.define(\"ch.rasc.extclassgenerator.ApiObject\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"read\",\n    type : \"string\"\n  }, {\n    name : \"create\",\n    type : \"string\"\n  }, {\n    name : \"update\",\n    type : \"string\"\n  }, {\n    name : \"destroy\",\n    type : \"string\"\n  } ]\n});");
    }

    @Test
    public void test12035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12035");
        ch.rasc.extclassgenerator.validation.DigitsValidation digitsValidation3 = new ch.rasc.extclassgenerator.validation.DigitsValidation("length", 97, (int) (short) 100);
        java.lang.String str4 = digitsValidation3.getField();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "length" + "'", str4, "length");
    }

    @Test
    public void test12036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12036");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.read;
        apiObject0.update = "hi!";
        apiObject0.destroy = "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/";
        java.lang.String str8 = apiObject0.destroy;
        apiObject0.destroy = "length";
        apiObject0.destroy = "inclusion";
        java.lang.String str13 = apiObject0.read;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/" + "'", str8, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test12037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12037");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        ch.rasc.extclassgenerator.validation.GenericValidation genericValidation3 = new ch.rasc.extclassgenerator.validation.GenericValidation("Ext.define('Ext.define('ch.rasc.extclassgenerator.association.HasManyAssociation',\n{\n  extend : 'Ext.data.Model',\n  fields : [ {\n    name : 'autoLoad',\n    type : 'boolean'\n  }, {\n    name : 'name',\n    type : 'string'\n  }, {\n    name : 'type',\n    type : 'string'\n  }, {\n    name : 'model',\n    type : 'string'\n  }, {\n    name : 'associationKey',\n    type : 'string'\n  }, {\n    name : 'foreignKey',\n    type : 'string'\n  }, {\n    name : 'primaryKey',\n    type : 'string'\n  }, {\n    name : 'instanceName',\n    type : 'string'\n  } ]\n});',{extend:'',uses:['hi!'],fields:[],associations:[{type:'hasMany',model:'hi!'},{type:'hasMany',model:'hi!',associationKey:'Ext.define(\\'ch.rasc.extclassgenerator.ModelAnnotationProcessor\\',{extend:\\'Ext.data.Model\\',fields:[]});'},{type:'hasMany',model:'hi!',associationKey:'Ext.define(\\'ch.rasc.extclassgenerator.ModelAnnotationProcessor\\',{extend:\\'Ext.data.Model\\',fields:[]});'},{type:'hasMany',model:'hi!',foreignKey:''}]});", "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});/", strMap2);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = genericValidation3.getOptions();
        org.junit.Assert.assertNull(strMap4);
    }

    @Test
    public void test12038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12038");
        ch.rasc.extclassgenerator.validation.FormatValidation formatValidation2 = new ch.rasc.extclassgenerator.validation.FormatValidation("/Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});/", "/hi!/");
        java.lang.String str3 = formatValidation2.getMatcher();
        java.lang.String str4 = formatValidation2.getMatcher();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/\\/hi!\\//" + "'", str3, "/\\/hi!\\//");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "/\\/hi!\\//" + "'", str4, "/\\/hi!\\//");
    }

    @Test
    public void test12039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12039");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        java.lang.Boolean boolean1 = allDataOptionsBean0.getPersist();
        java.lang.Boolean boolean2 = allDataOptionsBean0.getPersist();
        allDataOptionsBean0.setChanges((java.lang.Boolean) true);
        allDataOptionsBean0.setCritical((java.lang.Boolean) false);
        java.lang.Boolean boolean7 = allDataOptionsBean0.getChanges();
        java.lang.Boolean boolean8 = allDataOptionsBean0.getAssociated();
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNull(boolean8);
    }

    @Test
    public void test12040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12040");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        boolean boolean4 = allDataOptionsBean0.hasAnyProperties();
        allDataOptionsBean0.setCritical((java.lang.Boolean) true);
        boolean boolean7 = allDataOptionsBean0.hasAnyProperties();
        allDataOptionsBean0.setPersist((java.lang.Boolean) true);
        java.lang.Boolean boolean10 = allDataOptionsBean0.getChanges();
        allDataOptionsBean0.setChanges((java.lang.Boolean) false);
        java.lang.Boolean boolean13 = allDataOptionsBean0.getPersist();
        java.lang.Boolean boolean14 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean15 = allDataOptionsBean0.getPersist();
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + true + "'", boolean13, true);
        org.junit.Assert.assertEquals("'" + boolean14 + "' != '" + false + "'", boolean14, false);
        org.junit.Assert.assertEquals("'" + boolean15 + "' != '" + true + "'", boolean15, true);
    }

    @Test
    public void test12041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12041");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        ch.rasc.extclassgenerator.validation.GenericValidation genericValidation3 = new ch.rasc.extclassgenerator.validation.GenericValidation("/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});/", "/\\/exclusion\\//", strMap2);
    }

    @Test
    public void test12042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12042");
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
        java.util.List<java.lang.String> strList13 = modelFieldBean2.getDepends();
        modelFieldBean2.setAllowNull((java.lang.Boolean) true);
        modelFieldBean2.setCritical((java.lang.Boolean) true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertNull(strList13);
    }

    @Test
    public void test12043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12043");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getRole();
        referenceBean0.setChild("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        referenceBean0.setRole("json");
        java.lang.String str7 = referenceBean0.getAssociation();
        java.lang.String str8 = referenceBean0.getParent();
        referenceBean0.setAssociation("ch.rasc.extclassgenerator.ModelAnnotationProcessor");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test12044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12044");
        ch.rasc.extclassgenerator.validation.CreditCardNumberValidation creditCardNumberValidation1 = new ch.rasc.extclassgenerator.validation.CreditCardNumberValidation("Ext.define(\"ch.rasc.extclassgenerator.ReferenceBean\",{extend:\"Ext.data.Model\",fields:[{name:\"type\",type:\"string\"},{name:\"association\",type:\"string\"},{name:\"child\",type:\"string\"},{name:\"parent\",type:\"string\"},{name:\"role\",type:\"string\"},{name:\"inverse\",type:\"string\"}]});");
    }

    @Test
    public void test12045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12045");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        referenceBean0.setInverse("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
        referenceBean0.setChild("hi!");
        boolean boolean5 = referenceBean0.typeOnly();
        boolean boolean6 = referenceBean0.typeOnly();
        java.lang.String str7 = referenceBean0.getChild();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test12046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12046");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getParent();
        referenceBean0.setInverse("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        java.lang.String str5 = referenceBean0.getInverse();
        boolean boolean6 = referenceBean0.hasAnyProperties();
        java.lang.String str7 = referenceBean0.getAssociation();
        referenceBean0.setParent("ch.rasc.extclassgenerator.PartialDataOptionsBean");
        java.lang.String str10 = referenceBean0.getParent();
        java.lang.String str11 = referenceBean0.getAssociation();
        java.lang.String str12 = referenceBean0.getParent();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});" + "'", str5, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ch.rasc.extclassgenerator.PartialDataOptionsBean" + "'", str10, "ch.rasc.extclassgenerator.PartialDataOptionsBean");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ch.rasc.extclassgenerator.PartialDataOptionsBean" + "'", str12, "ch.rasc.extclassgenerator.PartialDataOptionsBean");
    }

    @Test
    public void test12047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12047");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getChild();
        java.lang.String str3 = referenceBean0.getAssociation();
        boolean boolean4 = referenceBean0.typeOnly();
        java.lang.String str5 = referenceBean0.getInverse();
        referenceBean0.setParent("");
        referenceBean0.setParent("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        referenceBean0.setAssociation("ch.rasc.extclassgenerator.OutputConfig");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test12048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12048");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean3 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean3.setConvert("hi!");
        java.lang.Boolean boolean6 = modelFieldBean3.getPersist();
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean9 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean9.setConvert("hi!");
        java.lang.Boolean boolean12 = modelFieldBean9.getPersist();
        java.lang.String str13 = modelFieldBean9.getMapping();
        java.lang.String str14 = modelFieldBean9.getName();
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray21 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList19);
        modelFieldBean9.setDepends((java.util.List<java.lang.String>) strList19);
        modelFieldBean3.setDepends((java.util.List<java.lang.String>) strList19);
        modelFieldBean3.setUseNull((java.lang.Boolean) false);
        java.lang.String[] strArray28 = new java.lang.String[] { "", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        modelFieldBean3.setDepends((java.util.List<java.lang.String>) strList29);
        modelFieldBean3.setAllowBlank((java.lang.Boolean) false);
        java.lang.String str34 = modelFieldBean3.getMapping();
        java.util.List<java.lang.String> strList35 = null;
        modelFieldBean3.setDepends(strList35);
        java.lang.Boolean boolean37 = modelFieldBean3.getUseNull();
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean41 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean41.setConvert("hi!");
        java.lang.Boolean boolean44 = modelFieldBean41.getPersist();
        java.lang.String str45 = modelFieldBean41.getMapping();
        java.lang.String str46 = modelFieldBean41.getName();
        java.lang.String[] strArray50 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList51 = new java.util.ArrayList<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList51, strArray50);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray53 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList51);
        modelFieldBean41.setDepends((java.util.List<java.lang.String>) strList51);
        modelFieldBean41.setCalculate("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean60 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean60.setConvert("hi!");
        java.lang.Boolean boolean63 = modelFieldBean60.getPersist();
        java.lang.String str64 = modelFieldBean60.getMapping();
        java.lang.String str65 = modelFieldBean60.getName();
        java.lang.String[] strArray69 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList70 = new java.util.ArrayList<java.lang.String>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList70, strArray69);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray72 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList70);
        modelFieldBean60.setDepends((java.util.List<java.lang.String>) strList70);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray74 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});", (java.util.List<java.lang.String>) strList70);
        modelFieldBean41.setDepends((java.util.List<java.lang.String>) strList70);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray76 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});/", (java.util.List<java.lang.String>) strList70);
        modelFieldBean3.setDepends((java.util.List<java.lang.String>) strList70);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray78 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("/belongsTo/", (java.util.List<java.lang.String>) strList70);
        java.lang.String str79 = inclusionValidationArray78.getField();
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertEquals("'" + boolean37 + "' != '" + false + "'", boolean37, false);
        org.junit.Assert.assertNull(boolean44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNull(boolean63);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "/belongsTo/" + "'", str79, "/belongsTo/");
    }

    @Test
    public void test12049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12049");
        ch.rasc.extclassgenerator.validation.FormatValidation formatValidation2 = new ch.rasc.extclassgenerator.validation.FormatValidation("Ext.define(\"ch.rasc.extclassgenerator.validation.InclusionValidationArray\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ {\n      name : \"type\",\n      type : \"string\"\n    }, {\n      name : \"field\",\n      type : \"string\"\n    } ]\n  }\n});", "Ext.define(\"ch.rasc.extclassgenerator.LineEnding\",{extend:\"Ext.data.Model\",fields:[]});");
    }

    @Test
    public void test12050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12050");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getChild();
        java.lang.String str2 = referenceBean0.getChild();
        java.lang.String str3 = referenceBean0.getType();
        boolean boolean4 = referenceBean0.hasAnyProperties();
        java.lang.String str5 = referenceBean0.getAssociation();
        referenceBean0.setType("");
        referenceBean0.setAssociation("Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",{extend:\"Ext.data.Model\",fields:[{name:\"debug\",type:\"boolean\"},{name:\"useSingleQuotes\",type:\"boolean\"},{name:\"surroundApiWithQuotes\",type:\"boolean\"}]});");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test12051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12051");
        ch.rasc.extclassgenerator.ModelType modelType1 = null;
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});", modelType1);
        modelFieldBean2.setCalculate("Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"associated\",\n    type : \"boolean\"\n  }, {\n    name : \"changes\",\n    type : \"boolean\"\n  }, {\n    name : \"critical\",\n    type : \"boolean\"\n  }, {\n    name : \"persist\",\n    type : \"boolean\"\n  } ]\n});");
        modelFieldBean2.setCritical((java.lang.Boolean) true);
    }

    @Test
    public void test12052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12052");
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
        java.util.Set<java.lang.String> strSet17 = modelAnnotationProcessor0.getSupportedOptions();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertTrue("'" + sourceVersion2 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion2.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertTrue("'" + sourceVersion3 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion3.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(wildcardIterable8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(wildcardIterable14);
        org.junit.Assert.assertTrue("'" + sourceVersion15 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion15.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strSet17);
    }

    @Test
    public void test12053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12053");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("Ext.define(\"Ext.define(\"null\",{extend:\"Ext.data.Model\",idProperty:\"hi!\",fields:[],proxy:{type:\"direct\",idParam:\"hi!\"}});\",{extend:\"/\\\\/Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\\\\//\",uses:[\"hi!\"],fields:[],hasMany:[\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\",\"json\",\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\",\"\"],associations:[{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],proxy:{type:\"direct\",directFn:hi!}});", (java.lang.Long) (-1L), (java.lang.Long) 32L);
    }

    @Test
    public void test12054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12054");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        ch.rasc.extclassgenerator.validation.GenericValidation genericValidation3 = new ch.rasc.extclassgenerator.validation.GenericValidation("ch.rasc.extclassgenerator.validation.RangeValidation", "Ext.define(\"ch.rasc.extclassgenerator.association.HasOneAssociation\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"setterName\",type:\"string\"},{name:\"getterName\",type:\"string\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]}});", strMap2);
    }

    @Test
    public void test12055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12055");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        modelBean0.setIdProperty("");
        modelBean0.setReadMethod("hi!");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation8 = new ch.rasc.extclassgenerator.association.HasManyAssociation("hi!");
        java.lang.String str9 = hasManyAssociation8.getAssociationKey();
        hasManyAssociation8.setAssociationKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        hasManyAssociation8.setAssociationKey("");
        java.lang.Boolean boolean14 = hasManyAssociation8.getAutoLoad();
        java.lang.String str15 = hasManyAssociation8.getForeignKey();
        java.lang.String str16 = hasManyAssociation8.getInstanceName();
        java.lang.String str17 = hasManyAssociation8.getModel();
        modelBean0.addAssociation((ch.rasc.extclassgenerator.association.AbstractAssociation) hasManyAssociation8);
        modelBean0.setWriteAllFields((java.lang.Boolean) false);
        java.lang.String str21 = modelBean0.getWriter();
        java.lang.String str22 = modelBean0.getRootProperty();
        java.lang.String str23 = modelBean0.getTotalProperty();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "json" + "'", str21, "json");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test12056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12056");
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
        allDataOptionsBean0.setPersist((java.lang.Boolean) true);
        java.lang.Boolean boolean15 = allDataOptionsBean0.getPersist();
        java.lang.Boolean boolean16 = allDataOptionsBean0.getAssociated();
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + false + "'", boolean7, false);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + false + "'", boolean11, false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + boolean15 + "' != '" + true + "'", boolean15, true);
        org.junit.Assert.assertEquals("'" + boolean16 + "' != '" + false + "'", boolean16, false);
    }

    @Test
    public void test12057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12057");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean3 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean3.setConvert("hi!");
        java.lang.Boolean boolean6 = modelFieldBean3.getPersist();
        java.lang.String str7 = modelFieldBean3.getMapping();
        java.lang.Object obj8 = modelFieldBean3.getReference();
        modelFieldBean3.setCalculate("exclusion");
        java.lang.Boolean boolean11 = modelFieldBean3.getUnique();
        java.lang.String str12 = modelFieldBean3.getConvert();
        java.lang.Object obj13 = modelFieldBean3.getDefaultValue();
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray22 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList20);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray23 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("", (java.util.List<java.lang.String>) strList20);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray24 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("json", (java.util.List<java.lang.String>) strList20);
        modelFieldBean3.setDepends((java.util.List<java.lang.String>) strList20);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray26 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("belongsTo", (java.util.List<java.lang.String>) strList20);
        java.util.List<java.lang.String> strList27 = inclusionValidationArray26.getList();
        java.util.List<java.lang.String> strList28 = inclusionValidationArray26.getList();
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(strList28);
    }

    @Test
    public void test12058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12058");
        ch.rasc.extclassgenerator.validation.DigitsValidation digitsValidation3 = new ch.rasc.extclassgenerator.validation.DigitsValidation("Ext.define(\"java.util.Collections$UnmodifiableSet\",{extend:\"Ext.data.Model\",config:{fields:[]}});", 0, (int) (byte) 0);
        java.lang.String str4 = digitsValidation3.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "digits" + "'", str4, "digits");
    }

    @Test
    public void test12059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12059");
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
        java.lang.String str17 = referenceBean0.getParent();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test12060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12060");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.Object obj3 = modelFieldBean2.getDefaultValue();
        java.lang.Boolean boolean4 = modelFieldBean2.getPersist();
        java.lang.Boolean boolean5 = modelFieldBean2.getAllowNull();
        modelFieldBean2.setAllowBlank((java.lang.Boolean) false);
        java.lang.Boolean boolean8 = modelFieldBean2.getPersist();
        modelFieldBean2.setCritical((java.lang.Boolean) false);
        ch.rasc.extclassgenerator.ModelType modelType11 = modelFieldBean2.getModelType();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertNull(modelType11);
    }

    @Test
    public void test12061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12061");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("ch.rasc.extclassgenerator.ModelFieldBean");
    }

    @Test
    public void test12062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12062");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getChild();
        java.lang.String str2 = referenceBean0.getRole();
        referenceBean0.setParent("hasOne");
        java.lang.String str5 = referenceBean0.getInverse();
        referenceBean0.setInverse("length");
        java.lang.String str8 = referenceBean0.getType();
        java.lang.String str9 = referenceBean0.getChild();
        java.lang.String str10 = referenceBean0.getAssociation();
        java.lang.String str11 = referenceBean0.getRole();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test12063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12063");
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
        modelBean0.setDestroyMethod("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean29 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean29.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean32 = allDataOptionsBean29.getAssociated();
        java.lang.Boolean boolean33 = allDataOptionsBean29.getCritical();
        java.lang.Boolean boolean34 = allDataOptionsBean29.getPersist();
        java.lang.Boolean boolean35 = allDataOptionsBean29.getCritical();
        modelBean0.setAllDataOptions(allDataOptionsBean29);
        java.lang.String str37 = modelBean0.getUpdateMethod();
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean38 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean38.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean41 = allDataOptionsBean38.getAssociated();
        java.lang.Boolean boolean42 = allDataOptionsBean38.getPersist();
        allDataOptionsBean38.setAssociated((java.lang.Boolean) false);
        allDataOptionsBean38.setPersist((java.lang.Boolean) false);
        allDataOptionsBean38.setChanges((java.lang.Boolean) false);
        allDataOptionsBean38.setPersist((java.lang.Boolean) false);
        java.lang.Boolean boolean51 = allDataOptionsBean38.getPersist();
        modelBean0.setAllDataOptions(allDataOptionsBean38);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + boolean32 + "' != '" + false + "'", boolean32, false);
        org.junit.Assert.assertNull(boolean33);
        org.junit.Assert.assertNull(boolean34);
        org.junit.Assert.assertNull(boolean35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});/" + "'", str37, "/Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});/");
        org.junit.Assert.assertEquals("'" + boolean41 + "' != '" + false + "'", boolean41, false);
        org.junit.Assert.assertNull(boolean42);
        org.junit.Assert.assertEquals("'" + boolean51 + "' != '" + false + "'", boolean51, false);
    }

    @Test
    public void test12064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12064");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        java.lang.String str1 = apiObject0.update;
        java.lang.String str2 = apiObject0.update;
        java.lang.String str3 = apiObject0.destroy;
        java.lang.String str4 = apiObject0.read;
        apiObject0.destroy = "Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});";
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});";
        java.lang.String str9 = apiObject0.destroy;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});" + "'", str9, "Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});");
    }

    @Test
    public void test12065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12065");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        java.lang.String str2 = hasOneAssociation1.getName();
        hasOneAssociation1.setInstanceName("");
        java.lang.String str5 = hasOneAssociation1.getForeignKey();
        java.lang.String str6 = hasOneAssociation1.getGetterName();
        java.lang.String str7 = hasOneAssociation1.getSetterName();
        hasOneAssociation1.setName("/range/");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test12066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12066");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("");
        java.lang.String str2 = belongsToAssociation1.getInstanceName();
        belongsToAssociation1.setGetterName("json");
        java.lang.String str5 = belongsToAssociation1.getSetterName();
        belongsToAssociation1.setForeignKey("Ext.data.Model");
        java.lang.String str8 = belongsToAssociation1.getSetterName();
        java.lang.String str9 = belongsToAssociation1.getGetterName();
        belongsToAssociation1.setAssociationKey("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});/");
        java.lang.String str12 = belongsToAssociation1.getSetterName();
        java.lang.String str13 = belongsToAssociation1.getSetterName();
        java.lang.String str14 = belongsToAssociation1.getAssociationKey();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "json" + "'", str9, "json");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});/" + "'", str14, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});/");
    }

    @Test
    public void test12067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12067");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        java.lang.String str6 = referenceBean0.getParent();
        java.lang.String str7 = referenceBean0.getRole();
        boolean boolean8 = referenceBean0.typeOnly();
        java.lang.String str9 = referenceBean0.getChild();
        java.lang.String str10 = referenceBean0.getInverse();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test12068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12068");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean4 = allDataOptionsBean0.getPersist();
        java.lang.Boolean boolean5 = allDataOptionsBean0.getCritical();
        allDataOptionsBean0.setPersist((java.lang.Boolean) false);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNull(boolean5);
    }

    @Test
    public void test12069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12069");
        ch.rasc.extclassgenerator.validation.InclusionValidation inclusionValidation2 = new ch.rasc.extclassgenerator.validation.InclusionValidation("Ext.define(\"java.util.ArrayList\",{extend:\"Ext.data.Model\",fields:[]});", "Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});");
        java.lang.String str3 = inclusionValidation2.getList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});");
    }

    @Test
    public void test12070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12070");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("");
        java.lang.String str2 = belongsToAssociation1.getInstanceName();
        belongsToAssociation1.setGetterName("json");
        java.lang.String str5 = belongsToAssociation1.getSetterName();
        java.lang.String str6 = belongsToAssociation1.getGetterName();
        belongsToAssociation1.setGetterName("/Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});/");
        java.lang.String str9 = belongsToAssociation1.getSetterName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "json" + "'", str6, "json");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test12071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12071");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getType();
        referenceBean0.setInverse("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        java.lang.String str4 = referenceBean0.getInverse();
        java.lang.String str5 = referenceBean0.getAssociation();
        referenceBean0.setParent("Ext.define(\"ch.rasc.extclassgenerator.validation.InclusionValidation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"list\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"field\",\n    type : \"string\"\n  } ]\n});");
        java.lang.String str8 = referenceBean0.getType();
        java.lang.String str9 = referenceBean0.getChild();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/" + "'", str4, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test12072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12072");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray12 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList10);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray13 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("", (java.util.List<java.lang.String>) strList10);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray14 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("json", (java.util.List<java.lang.String>) strList10);
        java.util.List<java.lang.String> strList15 = exclusionValidationArray14.getList();
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray16 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("exclusion", strList15);
        java.util.List<java.lang.String> strList17 = exclusionValidationArray16.getList();
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray18 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", strList17);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray19 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("Ext.define(\"ch.rasc.extclassgenerator.ModelFieldBean\",{extend:\"Ext.data.Model\",fields:[{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"dateFormat\",type:\"string\"},{name:\"useNull\",type:\"boolean\"},{name:\"allowNull\",type:\"boolean\"},{name:\"mapping\",type:\"string\"},{name:\"persist\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"convert\",type:\"string\"},{name:\"calculate\",type:\"string\"},{name:\"allowBlank\",type:\"boolean\"},{name:\"unique\",type:\"boolean\"}]});", strList17);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray20 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});", strList17);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test12073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12073");
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
        java.lang.String str33 = modelFieldBean2.getCalculate();
        java.lang.Boolean boolean34 = modelFieldBean2.getUnique();
        java.lang.Boolean boolean35 = modelFieldBean2.getUnique();
        ch.rasc.extclassgenerator.ModelType modelType36 = modelFieldBean2.getModelType();
        java.lang.Boolean boolean37 = modelFieldBean2.getAllowNull();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(boolean34);
        org.junit.Assert.assertNull(boolean35);
        org.junit.Assert.assertNull(modelType36);
        org.junit.Assert.assertEquals("'" + boolean37 + "' != '" + false + "'", boolean37, false);
    }

    @Test
    public void test12074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12074");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        modelBean0.setIdProperty("");
        boolean boolean5 = modelBean0.isDisablePagingParameters();
        modelBean0.setExtend("");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean9 = modelBean0.getField("hi!");
        boolean boolean10 = modelBean0.isPaging();
        modelBean0.setWriteAllFields((java.lang.Boolean) true);
        boolean boolean13 = modelBean0.isClientIdPropertyAddToWriter();
        modelBean0.setClientIdProperty("json");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(modelFieldBean9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test12075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12075");
        ch.rasc.extclassgenerator.validation.DigitsValidation digitsValidation3 = new ch.rasc.extclassgenerator.validation.DigitsValidation("Ext.define(\"null\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ],\n    proxy : {\n      type : \"direct\",\n      reader : {\n        successProperty : \"json\"\n      }\n    }\n  }\n});", (int) (short) 10, (int) (short) 1);
    }

    @Test
    public void test12076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12076");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setMessageProperty("");
        java.lang.String str3 = modelBean0.getWriter();
        modelBean0.setSuccessProperty("/ch.rasc.extclassgenerator.ModelAnnotationProcessor/");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "json" + "'", str3, "json");
    }

    @Test
    public void test12077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12077");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        java.lang.String str3 = modelBean0.getIdProperty();
        modelBean0.setVersionProperty("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        java.lang.String str6 = modelBean0.getName();
        modelBean0.setWriter("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str9 = modelBean0.getReader();
        modelBean0.setTotalProperty("Ext.define(\"null\",\r\n{\n  extend : \"\",\n  fields : [ ],\n  validations : [ {\n    type : \"range\",\n    field : \"/Ext.define(\\\"ch.rasc.extclassgenerator.association.HasManyAssociation\\\",{extend:\\\"Ext.data.Model\\\",fields:[{name:\\\"autoLoad\\\",type:\\\"boolean\\\"},{name:\\\"name\\\",type:\\\"string\\\"},{name:\\\"type\\\",type:\\\"string\\\"},{name:\\\"model\\\",type:\\\"string\\\"},{name:\\\"associationKey\\\",type:\\\"string\\\"},{name:\\\"foreignKey\\\",type:\\\"string\\\"},{name:\\\"primaryKey\\\",type:\\\"string\\\"},{name:\\\"instanceName\\\",type:\\\"string\\\"}]});/\",\n    min : 0,\n    max : 0\n  } ]\n});");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "json" + "'", str9, "json");
    }

    @Test
    public void test12078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12078");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.update = "exclusion";
        java.lang.String str8 = apiObject0.read;
        java.lang.String str9 = apiObject0.destroy;
        apiObject0.create = "creditCardNumber";
        apiObject0.update = "hi!";
        apiObject0.create = "";
        apiObject0.update = "digits";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test12079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12079");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getType();
        referenceBean0.setInverse("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        java.lang.String str4 = referenceBean0.getChild();
        referenceBean0.setType("Ext.define(\"null\",{extend:\"\",config:{fields:[]}});");
        java.lang.String str7 = referenceBean0.getAssociation();
        boolean boolean8 = referenceBean0.hasAnyProperties();
        boolean boolean9 = referenceBean0.hasAnyProperties();
        java.lang.String str10 = referenceBean0.getAssociation();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test12080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12080");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean4 = allDataOptionsBean0.getCritical();
        java.lang.Boolean boolean5 = allDataOptionsBean0.getPersist();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean8 = allDataOptionsBean0.getPersist();
        allDataOptionsBean0.setChanges((java.lang.Boolean) true);
        allDataOptionsBean0.setChanges((java.lang.Boolean) false);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean8);
    }

    @Test
    public void test12081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12081");
        ch.rasc.extclassgenerator.validation.ExclusionValidation exclusionValidation2 = new ch.rasc.extclassgenerator.validation.ExclusionValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});", "/hasMany/");
    }

    @Test
    public void test12082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12082");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("hi!");
        hasManyAssociation1.setAssociationKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str4 = hasManyAssociation1.getInstanceName();
        hasManyAssociation1.setPrimaryKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str7 = hasManyAssociation1.getForeignKey();
        hasManyAssociation1.setAutoLoad((java.lang.Boolean) false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test12083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12083");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getChild();
        java.lang.String str2 = referenceBean0.getRole();
        referenceBean0.setAssociation("");
        java.lang.String str5 = referenceBean0.getParent();
        java.lang.String str6 = referenceBean0.getRole();
        java.lang.String str7 = referenceBean0.getType();
        referenceBean0.setInverse("");
        boolean boolean10 = referenceBean0.hasAnyProperties();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test12084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12084");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hasOne", "hi!");
        java.lang.Boolean boolean3 = modelFieldBean2.getPersist();
        java.util.List<java.lang.String> strList4 = modelFieldBean2.getDepends();
        java.lang.String str5 = modelFieldBean2.getName();
        modelFieldBean2.setUnique((java.lang.Boolean) false);
        java.lang.String str8 = modelFieldBean2.getType();
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNull(strList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hasOne" + "'", str5, "hasOne");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test12085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12085");
        ch.rasc.extclassgenerator.ModelAnnotationProcessor modelAnnotationProcessor0 = new ch.rasc.extclassgenerator.ModelAnnotationProcessor();
        java.util.Set<java.lang.String> strSet1 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        javax.lang.model.SourceVersion sourceVersion2 = modelAnnotationProcessor0.getSupportedSourceVersion();
        javax.lang.model.SourceVersion sourceVersion3 = modelAnnotationProcessor0.getSupportedSourceVersion();
        javax.lang.model.SourceVersion sourceVersion4 = modelAnnotationProcessor0.getSupportedSourceVersion();
        javax.lang.model.element.Element element5 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror6 = null;
        javax.lang.model.element.ExecutableElement executableElement7 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable9 = modelAnnotationProcessor0.getCompletions(element5, annotationMirror6, executableElement7, "hi!");
        java.util.Set<java.lang.String> strSet10 = modelAnnotationProcessor0.getSupportedOptions();
        java.util.Set<java.lang.String> strSet11 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        java.util.Set<java.lang.String> strSet12 = modelAnnotationProcessor0.getSupportedOptions();
        javax.lang.model.element.Element element13 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror14 = null;
        javax.lang.model.element.ExecutableElement executableElement15 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable17 = modelAnnotationProcessor0.getCompletions(element13, annotationMirror14, executableElement15, "hasOne");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertTrue("'" + sourceVersion2 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion2.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertTrue("'" + sourceVersion3 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion3.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertTrue("'" + sourceVersion4 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion4.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(wildcardIterable9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(wildcardIterable17);
    }

    @Test
    public void test12086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12086");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        hasOneAssociation1.setGetterName("creditCardNumber");
        java.lang.String str4 = hasOneAssociation1.getSetterName();
        hasOneAssociation1.setInstanceName("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]}});");
        java.lang.String str7 = hasOneAssociation1.getName();
        hasOneAssociation1.setGetterName("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test12087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12087");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        hasOneAssociation1.setInstanceName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str4 = hasOneAssociation1.getSetterName();
        hasOneAssociation1.setName("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});/");
        hasOneAssociation1.setName("/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/");
        java.lang.String str9 = hasOneAssociation1.getType();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hasOne" + "'", str9, "hasOne");
    }

    @Test
    public void test12088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12088");
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
        java.lang.String str15 = modelFieldBean2.getCalculate();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(strList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str14, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test12089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12089");
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
        modelFieldBean2.setConvert("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.Boolean boolean17 = modelFieldBean2.getUseNull();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertNull(boolean17);
    }

    @Test
    public void test12090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12090");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("hasOne");
        java.lang.String str2 = belongsToAssociation1.getSetterName();
        belongsToAssociation1.setGetterName("length");
        belongsToAssociation1.setGetterName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
        java.lang.String str7 = belongsToAssociation1.getGetterName();
        belongsToAssociation1.setSetterName("Ext.define(\"ch.rasc.extclassgenerator.AllDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});");
        belongsToAssociation1.setInstanceName("Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str12 = belongsToAssociation1.getSetterName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});" + "'", str7, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.AllDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});" + "'", str12, "Ext.define(\"ch.rasc.extclassgenerator.AllDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});");
    }

    @Test
    public void test12091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12091");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean4 = allDataOptionsBean0.getPersist();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean7 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean8 = allDataOptionsBean0.getPersist();
        allDataOptionsBean0.setPersist((java.lang.Boolean) true);
        java.lang.Boolean boolean11 = allDataOptionsBean0.getPersist();
        java.lang.Boolean boolean12 = allDataOptionsBean0.getCritical();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + false + "'", boolean7, false);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertNull(boolean12);
    }

    @Test
    public void test12092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12092");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.update = "exclusion";
        java.lang.String str8 = apiObject0.create;
        java.lang.String str9 = apiObject0.create;
        java.lang.String str10 = apiObject0.destroy;
        java.lang.String str11 = apiObject0.update;
        apiObject0.update = "/ch.rasc.extclassgenerator.ModelAnnotationProcessor/";
        java.lang.String str14 = apiObject0.read;
        java.lang.String str15 = apiObject0.update;
        java.lang.String str16 = apiObject0.read;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str8, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str9, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "exclusion" + "'", str11, "exclusion");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "/ch.rasc.extclassgenerator.ModelAnnotationProcessor/" + "'", str15, "/ch.rasc.extclassgenerator.ModelAnnotationProcessor/");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test12093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12093");
        ch.rasc.extclassgenerator.OutputConfig outputConfig0 = new ch.rasc.extclassgenerator.OutputConfig();
        outputConfig0.setSurroundApiWithQuotes(false);
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean5 = new ch.rasc.extclassgenerator.ModelFieldBean("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});", "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        java.lang.String str6 = modelFieldBean5.getCalculate();
        modelFieldBean5.setUnique((java.lang.Boolean) true);
        modelFieldBean5.setUseNull((java.lang.Boolean) true);
        boolean boolean11 = outputConfig0.equals((java.lang.Object) modelFieldBean5);
        outputConfig0.setUseSingleQuotes(true);
        outputConfig0.setDebug(false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test12094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12094");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getChild();
        java.lang.String str2 = referenceBean0.getInverse();
        referenceBean0.setParent("");
        java.lang.String str5 = referenceBean0.getRole();
        referenceBean0.setParent("/Ext.define(\"null\",{extend:\"\",config:{fields:[]}});/");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test12095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12095");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        java.lang.String str3 = modelBean0.getIdProperty();
        java.lang.String[] strArray4 = modelBean0.getHasMany();
        modelBean0.setExtend("/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/");
        java.util.List<ch.rasc.extclassgenerator.validation.AbstractValidation> abstractValidationList7 = modelBean0.getValidations();
        modelBean0.setWriter("Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",{extend:\"Ext.data.Model\",fields:[{name:\"debug\",type:\"boolean\"},{name:\"useSingleQuotes\",type:\"boolean\"},{name:\"surroundApiWithQuotes\",type:\"boolean\"}]});");
        java.lang.String str10 = modelBean0.getClientIdProperty();
        modelBean0.setCreateMethod("Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(abstractValidationList7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test12096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12096");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        ch.rasc.extclassgenerator.validation.GenericValidation genericValidation3 = new ch.rasc.extclassgenerator.validation.GenericValidation("Ext.define(\"null\",\r\n{\n  extend : \"/Ext.define(\\\"ch.rasc.extclassgenerator.association.HasManyAssociation\\\",{extend:\\\"Ext.data.Model\\\",fields:[{name:\\\"autoLoad\\\",type:\\\"boolean\\\"},{name:\\\"name\\\",type:\\\"string\\\"},{name:\\\"type\\\",type:\\\"string\\\"},{name:\\\"model\\\",type:\\\"string\\\"},{name:\\\"associationKey\\\",type:\\\"string\\\"},{name:\\\"foreignKey\\\",type:\\\"string\\\"},{name:\\\"primaryKey\\\",type:\\\"string\\\"},{name:\\\"instanceName\\\",type:\\\"string\\\"}]});/\",\n  config : {\n    fields : [ ],\n    proxy : {\n      type : \"direct\",\n      reader : {\n        successProperty : \"hasMany\"\n      },\n      writer : {\n        type : \"Ext.define(\\\"null\\\",{extend:\\\"Ext.data.Model\\\",fields:[],proxy:{type:\\\"direct\\\",directFn:hi!}});\"\n      }\n    }\n  }\n});", "length", strMap2);
    }

    @Test
    public void test12097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12097");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.update = "exclusion";
        java.lang.String str8 = apiObject0.create;
        java.lang.String str9 = apiObject0.create;
        java.lang.String str10 = apiObject0.read;
        java.lang.String str11 = apiObject0.create;
        apiObject0.update = "hi!";
        java.lang.String str14 = apiObject0.read;
        java.lang.String str15 = apiObject0.read;
        java.lang.String str16 = apiObject0.read;
        java.lang.String str17 = apiObject0.destroy;
        java.lang.String str18 = apiObject0.create;
        java.lang.String str19 = apiObject0.read;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str8, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str9, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str11, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str18, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test12098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12098");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        ch.rasc.extclassgenerator.validation.GenericValidation genericValidation3 = new ch.rasc.extclassgenerator.validation.GenericValidation("digits", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});", strMap2);
        java.lang.String str4 = genericValidation3.getType();
        java.lang.String str5 = genericValidation3.getType();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = genericValidation3.getOptions();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = genericValidation3.getOptions();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "digits" + "'", str4, "digits");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "digits" + "'", str5, "digits");
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap7);
    }

    @Test
    public void test12099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12099");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        referenceBean0.setType("");
        java.lang.String str3 = referenceBean0.getAssociation();
        java.lang.String str4 = referenceBean0.getChild();
        java.lang.String str5 = referenceBean0.getRole();
        referenceBean0.setParent("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        java.lang.String str8 = referenceBean0.getInverse();
        java.lang.String str9 = referenceBean0.getRole();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test12100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12100");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        java.lang.Boolean boolean1 = allDataOptionsBean0.getPersist();
        java.lang.Boolean boolean2 = allDataOptionsBean0.getPersist();
        allDataOptionsBean0.setChanges((java.lang.Boolean) true);
        allDataOptionsBean0.setCritical((java.lang.Boolean) false);
        allDataOptionsBean0.setCritical((java.lang.Boolean) false);
        allDataOptionsBean0.setChanges((java.lang.Boolean) true);
        allDataOptionsBean0.setPersist((java.lang.Boolean) true);
        allDataOptionsBean0.setChanges((java.lang.Boolean) true);
        boolean boolean15 = allDataOptionsBean0.hasAnyProperties();
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test12101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12101");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getChild();
        java.lang.String str2 = referenceBean0.getChild();
        referenceBean0.setAssociation("creditCardNumber");
        referenceBean0.setType("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        referenceBean0.setChild("length");
        referenceBean0.setParent("json");
        boolean boolean11 = referenceBean0.typeOnly();
        boolean boolean12 = referenceBean0.typeOnly();
        referenceBean0.setInverse("/Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});/");
        referenceBean0.setType("Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"debug\",type:\"boolean\"},{name:\"useSingleQuotes\",type:\"boolean\"},{name:\"surroundApiWithQuotes\",type:\"boolean\"}]}});");
        referenceBean0.setParent("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test12102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12102");
        ch.rasc.extclassgenerator.validation.InclusionValidation inclusionValidation2 = new ch.rasc.extclassgenerator.validation.InclusionValidation("ch.rasc.extclassgenerator.validation.CreditCardNumberValidation", "Ext.define(\"null\",\r\n{\n  extend : \"\",\n  config : {\n    fields : [ ],\n    proxy : {\n      type : \"direct\",\n      api : {\n        create : Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});\n      },\n      reader : {\n        messageProperty : \"hi!\"\n      }\n    }\n  }\n});");
        java.lang.String str3 = inclusionValidation2.getList();
        java.lang.String str4 = inclusionValidation2.getList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"null\",\r\n{\n  extend : \"\",\n  config : {\n    fields : [ ],\n    proxy : {\n      type : \"direct\",\n      api : {\n        create : Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});\n      },\n      reader : {\n        messageProperty : \"hi!\"\n      }\n    }\n  }\n});" + "'", str3, "Ext.define(\"null\",\r\n{\n  extend : \"\",\n  config : {\n    fields : [ ],\n    proxy : {\n      type : \"direct\",\n      api : {\n        create : Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});\n      },\n      reader : {\n        messageProperty : \"hi!\"\n      }\n    }\n  }\n});");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Ext.define(\"null\",\r\n{\n  extend : \"\",\n  config : {\n    fields : [ ],\n    proxy : {\n      type : \"direct\",\n      api : {\n        create : Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});\n      },\n      reader : {\n        messageProperty : \"hi!\"\n      }\n    }\n  }\n});" + "'", str4, "Ext.define(\"null\",\r\n{\n  extend : \"\",\n  config : {\n    fields : [ ],\n    proxy : {\n      type : \"direct\",\n      api : {\n        create : Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});\n      },\n      reader : {\n        messageProperty : \"hi!\"\n      }\n    }\n  }\n});");
    }

    @Test
    public void test12103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12103");
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
        java.util.List<java.lang.String> strList26 = modelFieldBean2.getDepends();
        java.lang.String str27 = modelFieldBean2.getCalculate();
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(boolean25);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test12104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12104");
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
        modelFieldBean2.setCalculate("hasMany");
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
    public void test12105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12105");
        ch.rasc.extclassgenerator.validation.DigitsValidation digitsValidation3 = new ch.rasc.extclassgenerator.validation.DigitsValidation("Ext.define(\"java.util.Collections$UnmodifiableSet\",{extend:\"Ext.data.Model\",config:{fields:[]}});", 0, (int) (byte) 0);
        int int4 = digitsValidation3.getFraction();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test12106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12106");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("hi!");
        hasManyAssociation1.setPrimaryKey("creditCardNumber");
        hasManyAssociation1.setPrimaryKey("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});");
        hasManyAssociation1.setAutoLoad((java.lang.Boolean) false);
        hasManyAssociation1.setName("Ext.define(\"ch.rasc.extclassgenerator.AllDataOptionsBean\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ {\n      name : \"associated\",\n      type : \"boolean\"\n    }, {\n      name : \"changes\",\n      type : \"boolean\"\n    }, {\n      name : \"critical\",\n      type : \"boolean\"\n    }, {\n      name : \"persist\",\n      type : \"boolean\"\n    } ]\n  }\n});");
        hasManyAssociation1.setAutoLoad((java.lang.Boolean) false);
    }

    @Test
    public void test12107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12107");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.read = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str8 = apiObject0.update;
        apiObject0.update = "Ext.data.Model";
        apiObject0.destroy = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});";
        apiObject0.update = "/Ext.data.Model/";
        apiObject0.update = "/email/";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str8, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
    }

    @Test
    public void test12108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12108");
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
        java.lang.Boolean boolean41 = modelFieldBean2.getAllowBlank();
        java.lang.Boolean boolean42 = modelFieldBean2.getUseNull();
        java.lang.String str43 = modelFieldBean2.getMapping();
        java.lang.String str44 = modelFieldBean2.getConvert();
        java.lang.Boolean boolean45 = modelFieldBean2.getUseNull();
        modelFieldBean2.setName("/\\/Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});\\//");
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
        org.junit.Assert.assertNull(boolean41);
        org.junit.Assert.assertNull(boolean42);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(boolean45);
    }

    @Test
    public void test12109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12109");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"debug\",type:\"boolean\"},{name:\"useSingleQuotes\",type:\"boolean\"},{name:\"surroundApiWithQuotes\",type:\"boolean\"}],proxy:{type:\"direct\",reader:{type:\"/format/\",messageProperty:\"Ext.define(\\\"ch.rasc.extclassgenerator.validation.InclusionValidationArray\\\",{extend:\\\"Ext.data.Model\\\",fields:[{name:\\\"type\\\",type:\\\"string\\\"},{name:\\\"field\\\",type:\\\"string\\\"}]});\"}}}});", (java.lang.Long) 0L, (java.lang.Long) 1L);
    }

    @Test
    public void test12110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12110");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("Ext.define(\"ch.rasc.extclassgenerator.ApiObject\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"read\",type:\"string\"},{name:\"create\",type:\"string\"},{name:\"update\",type:\"string\"},{name:\"destroy\",type:\"string\"}]}});");
    }

    @Test
    public void test12111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12111");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean4 = allDataOptionsBean0.getPersist();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        allDataOptionsBean0.setPersist((java.lang.Boolean) false);
        boolean boolean9 = allDataOptionsBean0.hasAnyProperties();
        allDataOptionsBean0.setChanges((java.lang.Boolean) false);
        boolean boolean12 = allDataOptionsBean0.hasAnyProperties();
        allDataOptionsBean0.setPersist((java.lang.Boolean) false);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test12112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12112");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        ch.rasc.extclassgenerator.validation.GenericValidation genericValidation3 = new ch.rasc.extclassgenerator.validation.GenericValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});", "Ext.define(\"null\",\r\n{\n  extend : \"\",\n  fields : [ ],\n  hasMany : [ \"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\", \"json\", \"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\", \"\" ]\n});", strMap2);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = genericValidation3.getOptions();
        org.junit.Assert.assertNull(strMap4);
    }

    @Test
    public void test12113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12113");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        modelBean0.setIdProperty("");
        modelBean0.setReadMethod("hi!");
        java.lang.String str7 = modelBean0.getUpdateMethod();
        java.lang.String str8 = modelBean0.getCreateMethod();
        modelBean0.setTotalProperty("Ext.define(\"null\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ],\n    proxy : {\n      type : \"direct\",\n      reader : {\n        type : \"Ext.define(\\\"java.util.ArrayList\\\",\\r\\n{\\n  extend : \\\"Ext.data.Model\\\",\\n  fields : [ ]\\n});\"\n      }\n    }\n  }\n});");
        java.lang.String str11 = modelBean0.getClientIdProperty();
        modelBean0.setIdProperty("Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]}});");
        ch.rasc.extclassgenerator.PartialDataOptionsBean partialDataOptionsBean14 = null;
        modelBean0.setPartialDataOptions(partialDataOptionsBean14);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test12114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12114");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        hasOneAssociation1.setInstanceName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str4 = hasOneAssociation1.getSetterName();
        java.lang.String str5 = hasOneAssociation1.getGetterName();
        java.lang.String str6 = hasOneAssociation1.getName();
        java.lang.String str7 = hasOneAssociation1.getPrimaryKey();
        java.lang.String str8 = hasOneAssociation1.getType();
        java.lang.String str9 = hasOneAssociation1.getGetterName();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hasOne" + "'", str8, "hasOne");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test12115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12115");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getChild();
        java.lang.String str2 = referenceBean0.getChild();
        referenceBean0.setAssociation("creditCardNumber");
        referenceBean0.setInverse("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        boolean boolean7 = referenceBean0.hasAnyProperties();
        boolean boolean8 = referenceBean0.typeOnly();
        referenceBean0.setAssociation("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});");
        referenceBean0.setParent("/ch.rasc.extclassgenerator.PartialDataOptionsBean/");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test12116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12116");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.update = "exclusion";
        apiObject0.destroy = "hi!";
        apiObject0.create = "";
        java.lang.String str12 = apiObject0.update;
        java.lang.String str13 = apiObject0.update;
        java.lang.String str14 = apiObject0.create;
        apiObject0.destroy = "Ext.define(\"ch.rasc.extclassgenerator.validation.InclusionValidationArray\",{extend:\"Ext.data.Model\",fields:[{name:\"type\",type:\"string\"},{name:\"field\",type:\"string\"}]});";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "exclusion" + "'", str12, "exclusion");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "exclusion" + "'", str13, "exclusion");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test12117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12117");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        java.lang.String str6 = referenceBean0.getAssociation();
        referenceBean0.setInverse("");
        java.lang.String str9 = referenceBean0.getParent();
        java.lang.String str10 = referenceBean0.getRole();
        java.lang.String str11 = referenceBean0.getChild();
        referenceBean0.setInverse("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});/");
        referenceBean0.setChild("Ext.define(\"ch.rasc.extclassgenerator.ModelFieldBean\",{extend:\"Ext.data.Model\",fields:[{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"dateFormat\",type:\"string\"},{name:\"useNull\",type:\"boolean\"},{name:\"allowNull\",type:\"boolean\"},{name:\"mapping\",type:\"string\"},{name:\"persist\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"convert\",type:\"string\"},{name:\"calculate\",type:\"string\"},{name:\"allowBlank\",type:\"boolean\"},{name:\"unique\",type:\"boolean\"}]});");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test12118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12118");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        java.lang.String str6 = referenceBean0.getType();
        java.lang.String str7 = referenceBean0.getParent();
        java.lang.String str8 = referenceBean0.getAssociation();
        referenceBean0.setAssociation("json");
        boolean boolean11 = referenceBean0.hasAnyProperties();
        referenceBean0.setParent("Ext.define(\"null\",\r\n{\n  extend : \"/Ext.define(\\\"ch.rasc.extclassgenerator.association.HasManyAssociation\\\",{extend:\\\"Ext.data.Model\\\",fields:[{name:\\\"autoLoad\\\",type:\\\"boolean\\\"},{name:\\\"name\\\",type:\\\"string\\\"},{name:\\\"type\\\",type:\\\"string\\\"},{name:\\\"model\\\",type:\\\"string\\\"},{name:\\\"associationKey\\\",type:\\\"string\\\"},{name:\\\"foreignKey\\\",type:\\\"string\\\"},{name:\\\"primaryKey\\\",type:\\\"string\\\"},{name:\\\"instanceName\\\",type:\\\"string\\\"}]});/\",\n  config : {\n    fields : [ ],\n    proxy : {\n      type : \"direct\",\n      reader : {\n        successProperty : \"hasMany\"\n      },\n      writer : {\n        type : \"Ext.define(\\\"null\\\",{extend:\\\"Ext.data.Model\\\",fields:[],proxy:{type:\\\"direct\\\",directFn:hi!}});\"\n      }\n    }\n  }\n});");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test12119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12119");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getRole();
        referenceBean0.setChild("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        java.lang.String str5 = referenceBean0.getType();
        referenceBean0.setAssociation("ch.rasc.extclassgenerator.ModelAnnotationProcessor");
        referenceBean0.setType("/range/");
        java.lang.String str10 = referenceBean0.getParent();
        java.lang.String str11 = referenceBean0.getInverse();
        referenceBean0.setChild("/\\/Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});\\//");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test12120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12120");
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
        java.lang.String str21 = modelFieldBean2.getType();
        modelFieldBean2.setUnique((java.lang.Boolean) false);
        modelFieldBean2.setName("Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});");
        java.lang.Boolean boolean26 = modelFieldBean2.getUnique();
        org.junit.Assert.assertNotNull(abstractValidationArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str21, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + boolean26 + "' != '" + false + "'", boolean26, false);
    }

    @Test
    public void test12121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12121");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getParent();
        referenceBean0.setInverse("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        java.lang.String str5 = referenceBean0.getType();
        referenceBean0.setAssociation("/Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});/");
        java.lang.String str8 = referenceBean0.getAssociation();
        java.lang.String str9 = referenceBean0.getInverse();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});/" + "'", str8, "/Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});/");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});" + "'", str9, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
    }

    @Test
    public void test12122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12122");
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
        java.lang.String str22 = modelFieldBean2.getDateFormat();
        java.lang.Boolean boolean23 = modelFieldBean2.getUseNull();
        modelFieldBean2.setAllowNull((java.lang.Boolean) true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(boolean23);
    }

    @Test
    public void test12123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12123");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});";
        apiObject0.destroy = "belongsTo";
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});";
        java.lang.String str10 = apiObject0.update;
        java.lang.String str11 = apiObject0.destroy;
        apiObject0.destroy = "ch.rasc.extclassgenerator.OutputConfig";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});" + "'", str10, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "belongsTo" + "'", str11, "belongsTo");
    }

    @Test
    public void test12124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12124");
        java.util.List<java.lang.String> strList1 = null;
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray2 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("Ext.define(\"ch.rasc.extclassgenerator.AllDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});", strList1);
        java.lang.String str3 = inclusionValidationArray2.getType();
        java.util.List<java.lang.String> strList4 = inclusionValidationArray2.getList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "inclusion" + "'", str3, "inclusion");
        org.junit.Assert.assertNull(strList4);
    }

    @Test
    public void test12125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12125");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        java.lang.String str3 = modelBean0.getIdProperty();
        modelBean0.setIdentifier("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        modelBean0.setName("");
        java.lang.String str8 = modelBean0.getIdentifier();
        modelBean0.setIdentifier("/exclusion/");
        modelBean0.setTotalProperty("Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});" + "'", str8, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
    }

    @Test
    public void test12126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12126");
        ch.rasc.extclassgenerator.ModelAnnotationProcessor modelAnnotationProcessor0 = new ch.rasc.extclassgenerator.ModelAnnotationProcessor();
        java.util.Set<java.lang.String> strSet1 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        java.util.Set<java.lang.String> strSet2 = modelAnnotationProcessor0.getSupportedOptions();
        javax.lang.model.element.Element element3 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror4 = null;
        javax.lang.model.element.ExecutableElement executableElement5 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable7 = modelAnnotationProcessor0.getCompletions(element3, annotationMirror4, executableElement5, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        javax.lang.model.SourceVersion sourceVersion8 = modelAnnotationProcessor0.getSupportedSourceVersion();
        javax.lang.model.element.Element element9 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror10 = null;
        javax.lang.model.element.ExecutableElement executableElement11 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable13 = modelAnnotationProcessor0.getCompletions(element9, annotationMirror10, executableElement11, "/hasMany/");
        javax.lang.model.element.Element element14 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror15 = null;
        javax.lang.model.element.ExecutableElement executableElement16 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable18 = modelAnnotationProcessor0.getCompletions(element14, annotationMirror15, executableElement16, "Ext.data.Model");
        javax.lang.model.SourceVersion sourceVersion19 = modelAnnotationProcessor0.getSupportedSourceVersion();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(wildcardIterable7);
        org.junit.Assert.assertTrue("'" + sourceVersion8 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion8.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(wildcardIterable13);
        org.junit.Assert.assertNotNull(wildcardIterable18);
        org.junit.Assert.assertTrue("'" + sourceVersion19 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion19.equals(javax.lang.model.SourceVersion.RELEASE_6));
    }

    @Test
    public void test12127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12127");
        ch.rasc.extclassgenerator.validation.DigitsValidation digitsValidation3 = new ch.rasc.extclassgenerator.validation.DigitsValidation("hi!", 10, 35);
        int int4 = digitsValidation3.getInteger();
        int int5 = digitsValidation3.getInteger();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test12128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12128");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
        java.lang.String str2 = belongsToAssociation1.getPrimaryKey();
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test12129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12129");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getParent();
        java.lang.String str2 = referenceBean0.getRole();
        referenceBean0.setInverse("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str5 = referenceBean0.getInverse();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str5, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
    }

    @Test
    public void test12130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12130");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("ch.rasc.extclassgenerator.AllDataOptionsBean");
    }

    @Test
    public void test12131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12131");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getRole();
        referenceBean0.setChild("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        referenceBean0.setAssociation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        referenceBean0.setRole("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        java.lang.String str9 = referenceBean0.getParent();
        java.lang.String str10 = referenceBean0.getParent();
        boolean boolean11 = referenceBean0.typeOnly();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test12132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12132");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.destroy = "";
        java.lang.String str3 = apiObject0.create;
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});";
        java.lang.String str6 = apiObject0.update;
        apiObject0.read = "Ext.data.Model";
        java.lang.String str9 = apiObject0.destroy;
        apiObject0.destroy = "Ext.define(\"ch.rasc.extclassgenerator.validation.CreditCardNumberValidation\",{extend:\"Ext.data.Model\",fields:[{name:\"type\",type:\"string\"},{name:\"field\",type:\"string\"}]});";
        java.lang.String str12 = apiObject0.update;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});" + "'", str6, "Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});" + "'", str12, "Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});");
    }

    @Test
    public void test12133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12133");
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
        java.lang.Object obj23 = modelFieldBean2.getReference();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(boolean22);
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test12134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12134");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("/range/");
        java.lang.String str2 = hasOneAssociation1.getSetterName();
        hasOneAssociation1.setPrimaryKey("Ext.define(\"ch.rasc.extclassgenerator.ApiObject\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"read\",type:\"string\"},{name:\"create\",type:\"string\"},{name:\"update\",type:\"string\"},{name:\"destroy\",type:\"string\"}]}});");
        java.lang.String str5 = hasOneAssociation1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hasOne" + "'", str5, "hasOne");
    }

    @Test
    public void test12135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12135");
        ch.rasc.extclassgenerator.PartialDataOptionsBean partialDataOptionsBean0 = new ch.rasc.extclassgenerator.PartialDataOptionsBean();
        java.lang.Boolean boolean1 = partialDataOptionsBean0.getChanges();
        java.lang.Boolean boolean2 = partialDataOptionsBean0.getChanges();
        partialDataOptionsBean0.setChanges((java.lang.Boolean) false);
        partialDataOptionsBean0.setAssociated((java.lang.Boolean) true);
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNull(boolean2);
    }

    @Test
    public void test12136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12136");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getRole();
        referenceBean0.setInverse("");
        java.lang.String str5 = referenceBean0.getAssociation();
        referenceBean0.setType("Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});");
        boolean boolean8 = referenceBean0.hasAnyProperties();
        referenceBean0.setChild("Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"debug\",type:\"boolean\"},{name:\"useSingleQuotes\",type:\"boolean\"},{name:\"surroundApiWithQuotes\",type:\"boolean\"}]}});");
        java.lang.String str11 = referenceBean0.getAssociation();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test12137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12137");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        modelFieldBean2.setDateFormat("hi!");
        java.lang.Boolean boolean8 = modelFieldBean2.getUseNull();
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        modelFieldBean2.setCalculate("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        modelFieldBean2.setAllowBlank((java.lang.Boolean) false);
        modelFieldBean2.setCritical((java.lang.Boolean) true);
        java.lang.Boolean boolean17 = modelFieldBean2.getUnique();
        ch.rasc.extclassgenerator.ModelType modelType19 = null;
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean20 = new ch.rasc.extclassgenerator.ModelFieldBean("Ext.define(\"Ext.define(\"null\",{extend:\"Ext.data.Model\",idProperty:\"hi!\",fields:[],proxy:{type:\"direct\",idParam:\"hi!\"}});\",{extend:\"/\\\\/Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\\\\//\",uses:[\"hi!\"],fields:[],hasMany:[\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\",\"json\",\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\",\"\"],associations:[{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],proxy:{type:\"direct\",directFn:hi!}});", modelType19);
        ch.rasc.extclassgenerator.ModelType modelType23 = null;
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean24 = new ch.rasc.extclassgenerator.ModelFieldBean("", modelType23);
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean27 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean27.setConvert("hi!");
        java.lang.Boolean boolean30 = modelFieldBean27.getPersist();
        java.lang.String str31 = modelFieldBean27.getMapping();
        java.lang.String str32 = modelFieldBean27.getName();
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray39 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList37);
        modelFieldBean27.setDepends((java.util.List<java.lang.String>) strList37);
        modelFieldBean27.setCalculate("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean46 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean46.setConvert("hi!");
        java.lang.Boolean boolean49 = modelFieldBean46.getPersist();
        java.lang.String str50 = modelFieldBean46.getMapping();
        java.lang.String str51 = modelFieldBean46.getName();
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList56 = new java.util.ArrayList<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList56, strArray55);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray58 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList56);
        modelFieldBean46.setDepends((java.util.List<java.lang.String>) strList56);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray60 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});", (java.util.List<java.lang.String>) strList56);
        modelFieldBean27.setDepends((java.util.List<java.lang.String>) strList56);
        modelFieldBean24.setDepends((java.util.List<java.lang.String>) strList56);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray63 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("length", (java.util.List<java.lang.String>) strList56);
        modelFieldBean20.setDepends((java.util.List<java.lang.String>) strList56);
        modelFieldBean2.setDepends((java.util.List<java.lang.String>) strList56);
        java.lang.Boolean boolean66 = modelFieldBean2.getPersist();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertNull(boolean17);
        org.junit.Assert.assertNull(boolean30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(boolean49);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNull(boolean66);
    }

    @Test
    public void test12138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12138");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        java.lang.String str1 = apiObject0.update;
        apiObject0.update = "";
        apiObject0.read = "";
        java.lang.String str6 = apiObject0.destroy;
        apiObject0.create = "Ext.define(\"null\",{extend:\"Ext.data.Model\",idProperty:\"hi!\",fields:[],proxy:{type:\"direct\",idParam:\"hi!\"}});";
        java.lang.String str9 = apiObject0.destroy;
        apiObject0.destroy = "creditCardNumber";
        apiObject0.create = "digits";
        java.lang.String str14 = apiObject0.update;
        java.lang.String str15 = apiObject0.read;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test12139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12139");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        referenceBean0.setType("");
        java.lang.String str3 = referenceBean0.getAssociation();
        referenceBean0.setInverse("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        referenceBean0.setInverse("ch.rasc.extclassgenerator.ModelBean");
        boolean boolean8 = referenceBean0.typeOnly();
        java.lang.String str9 = referenceBean0.getAssociation();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test12140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12140");
        ch.rasc.extclassgenerator.validation.DigitsValidation digitsValidation3 = new ch.rasc.extclassgenerator.validation.DigitsValidation("/hi!/", (int) (short) -1, (int) ' ');
    }

    @Test
    public void test12141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12141");
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation3 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});/", (java.lang.Long) 32L, (java.lang.Long) 0L);
    }

    @Test
    public void test12142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12142");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        java.lang.String str1 = apiObject0.update;
        apiObject0.update = "";
        apiObject0.read = "";
        java.lang.String str6 = apiObject0.destroy;
        java.lang.String str7 = apiObject0.create;
        java.lang.String str8 = apiObject0.update;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test12143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12143");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hasMany");
        java.lang.String str2 = hasOneAssociation1.getSetterName();
        java.lang.String str3 = hasOneAssociation1.getName();
        hasOneAssociation1.setAssociationKey("Ext.define(\"ch.rasc.extclassgenerator.ModelFieldBean\",{extend:\"Ext.data.Model\",fields:[{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"dateFormat\",type:\"string\"},{name:\"useNull\",type:\"boolean\"},{name:\"allowNull\",type:\"boolean\"},{name:\"mapping\",type:\"string\"},{name:\"persist\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"convert\",type:\"string\"},{name:\"calculate\",type:\"string\"},{name:\"allowBlank\",type:\"boolean\"},{name:\"unique\",type:\"boolean\"}]});");
        java.lang.String str6 = hasOneAssociation1.getGetterName();
        hasOneAssociation1.setSetterName("inclusion");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test12144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12144");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        referenceBean0.setInverse("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
        referenceBean0.setParent("json");
        referenceBean0.setRole("/range/");
        referenceBean0.setParent("Ext.define(\"ch.rasc.extclassgenerator.validation.CreditCardNumberValidation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"field\",\n    type : \"string\"\n  } ]\n});");
        referenceBean0.setType("/json/");
    }

    @Test
    public void test12145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12145");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        hasOneAssociation1.setGetterName("hi!");
        java.lang.String str4 = hasOneAssociation1.getName();
        java.lang.String str5 = hasOneAssociation1.getModel();
        java.lang.String str6 = hasOneAssociation1.getPrimaryKey();
        hasOneAssociation1.setGetterName("Ext.define(\"ch.rasc.extclassgenerator.ApiObject\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"read\",type:\"string\"},{name:\"create\",type:\"string\"},{name:\"update\",type:\"string\"},{name:\"destroy\",type:\"string\"}]}});");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test12146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12146");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        java.lang.Boolean boolean5 = modelFieldBean2.getCritical();
        java.lang.Boolean boolean6 = modelFieldBean2.getCritical();
        java.lang.String str7 = modelFieldBean2.getCalculate();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test12147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12147");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getRole();
        referenceBean0.setChild("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        referenceBean0.setAssociation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        referenceBean0.setRole("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        referenceBean0.setChild("hi!");
        java.lang.String str11 = referenceBean0.getInverse();
        java.lang.String str12 = referenceBean0.getInverse();
        java.lang.String str13 = referenceBean0.getType();
        java.lang.String str14 = referenceBean0.getChild();
        java.lang.String str15 = referenceBean0.getChild();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test12148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12148");
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
        modelFieldBean2.setUnique((java.lang.Boolean) false);
        modelFieldBean2.setName("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});/");
        modelFieldBean2.setUseNull((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(abstractValidationArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test12149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12149");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        modelFieldBean2.setMapping("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
        java.lang.String str8 = modelFieldBean2.getCalculate();
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        modelFieldBean2.setAllowNull((java.lang.Boolean) true);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test12150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12150");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getRole();
        referenceBean0.setChild("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        referenceBean0.setAssociation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        java.lang.String str7 = referenceBean0.getChild();
        referenceBean0.setType("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        referenceBean0.setParent("inclusion");
        java.lang.String str12 = referenceBean0.getType();
        referenceBean0.setType("/Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});/");
        referenceBean0.setChild("/\\/\\\\/belongsTo\\\\/\\//");
        referenceBean0.setParent("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]}});");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});" + "'", str7, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});" + "'", str12, "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
    }

    @Test
    public void test12151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12151");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("hi!");
        belongsToAssociation1.setSetterName("");
        java.lang.String str4 = belongsToAssociation1.getModel();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test12152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12152");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.read = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str8 = apiObject0.update;
        java.lang.String str9 = apiObject0.destroy;
        apiObject0.create = "json";
        apiObject0.update = "";
        apiObject0.create = "/Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});/";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str8, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test12153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12153");
        ch.rasc.extclassgenerator.validation.InclusionValidation inclusionValidation2 = new ch.rasc.extclassgenerator.validation.InclusionValidation("/format/", "presence");
        java.lang.String str3 = inclusionValidation2.getList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "presence" + "'", str3, "presence");
    }

    @Test
    public void test12154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12154");
        ch.rasc.extclassgenerator.OutputConfig outputConfig0 = new ch.rasc.extclassgenerator.OutputConfig();
        boolean boolean1 = outputConfig0.isDebug();
        boolean boolean2 = outputConfig0.isSurroundApiWithQuotes();
        ch.rasc.extclassgenerator.OutputFormat outputFormat3 = ch.rasc.extclassgenerator.OutputFormat.EXTJS5;
        outputConfig0.setOutputFormat(outputFormat3);
        ch.rasc.extclassgenerator.LineEnding lineEnding5 = outputConfig0.getLineEnding();
        boolean boolean6 = outputConfig0.isSurroundApiWithQuotes();
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean9 = new ch.rasc.extclassgenerator.ModelFieldBean("", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str10 = modelFieldBean9.getConvert();
        modelFieldBean9.setUnique((java.lang.Boolean) true);
        java.lang.String str13 = modelFieldBean9.getConvert();
        java.lang.String str14 = modelFieldBean9.getConvert();
        modelFieldBean9.setName("");
        boolean boolean17 = outputConfig0.equals((java.lang.Object) "");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + outputFormat3 + "' != '" + ch.rasc.extclassgenerator.OutputFormat.EXTJS5 + "'", outputFormat3.equals(ch.rasc.extclassgenerator.OutputFormat.EXTJS5));
        org.junit.Assert.assertNull(lineEnding5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test12155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12155");
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
        javax.lang.model.element.Element element19 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror20 = null;
        javax.lang.model.element.ExecutableElement executableElement21 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable23 = modelAnnotationProcessor0.getCompletions(element19, annotationMirror20, executableElement21, "/ch.rasc.extclassgenerator.PartialDataOptionsBean/");
        javax.lang.model.SourceVersion sourceVersion24 = modelAnnotationProcessor0.getSupportedSourceVersion();
        javax.lang.model.SourceVersion sourceVersion25 = modelAnnotationProcessor0.getSupportedSourceVersion();
        java.util.Set<java.lang.String> strSet26 = modelAnnotationProcessor0.getSupportedOptions();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertTrue("'" + sourceVersion2 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion2.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(wildcardIterable8);
        org.junit.Assert.assertNotNull(wildcardIterable13);
        org.junit.Assert.assertNotNull(wildcardIterable18);
        org.junit.Assert.assertNotNull(wildcardIterable23);
        org.junit.Assert.assertTrue("'" + sourceVersion24 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion24.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertTrue("'" + sourceVersion25 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion25.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(strSet26);
    }

    @Test
    public void test12156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12156");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        java.lang.Boolean boolean1 = allDataOptionsBean0.getPersist();
        java.lang.Boolean boolean2 = allDataOptionsBean0.getPersist();
        boolean boolean3 = allDataOptionsBean0.hasAnyProperties();
        java.lang.Boolean boolean4 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean5 = allDataOptionsBean0.getPersist();
        boolean boolean6 = allDataOptionsBean0.hasAnyProperties();
        java.lang.Boolean boolean7 = allDataOptionsBean0.getPersist();
        allDataOptionsBean0.setChanges((java.lang.Boolean) true);
        allDataOptionsBean0.setPersist((java.lang.Boolean) false);
        java.lang.Boolean boolean12 = allDataOptionsBean0.getChanges();
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
    }

    @Test
    public void test12157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12157");
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
        modelBean0.setIdentifier("belongsTo");
        modelBean0.setMessageProperty("/\\/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});\\//");
        java.lang.String str25 = modelBean0.getRootProperty();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test12158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12158");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("");
        java.lang.String str2 = hasOneAssociation1.getPrimaryKey();
        hasOneAssociation1.setGetterName("belongsTo");
        java.lang.String str5 = hasOneAssociation1.getInstanceName();
        java.lang.String str6 = hasOneAssociation1.getSetterName();
        java.lang.String str7 = hasOneAssociation1.getInstanceName();
        hasOneAssociation1.setName("inclusion");
        java.lang.String str10 = hasOneAssociation1.getSetterName();
        java.lang.String str11 = hasOneAssociation1.getInstanceName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test12159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12159");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean4 = allDataOptionsBean0.getCritical();
        allDataOptionsBean0.setPersist((java.lang.Boolean) false);
        java.lang.Boolean boolean7 = allDataOptionsBean0.getCritical();
        java.lang.Boolean boolean8 = allDataOptionsBean0.getCritical();
        boolean boolean9 = allDataOptionsBean0.hasAnyProperties();
        java.lang.Boolean boolean10 = allDataOptionsBean0.getCritical();
        java.lang.Boolean boolean11 = allDataOptionsBean0.getCritical();
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNull(boolean11);
    }

    @Test
    public void test12160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12160");
        ch.rasc.extclassgenerator.ModelValidation modelValidation1 = null;
        ch.rasc.extclassgenerator.IncludeValidation includeValidation2 = null;
        // The following exception was thrown during execution in test generation
        try {
            ch.rasc.extclassgenerator.validation.AbstractValidation abstractValidation3 = ch.rasc.extclassgenerator.validation.AbstractValidation.createValidation("Ext.define(\"ch.rasc.extclassgenerator.LineEnding\",{extend:\"Ext.data.Model\",fields:[]});", modelValidation1, includeValidation2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test12161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12161");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});";
        apiObject0.update = "json";
        apiObject0.destroy = "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/";
        java.lang.String str10 = apiObject0.update;
        java.lang.String str11 = apiObject0.read;
        java.lang.String str12 = apiObject0.destroy;
        apiObject0.create = "hi!";
        java.lang.String str15 = apiObject0.read;
        apiObject0.read = "Ext.define(\"ch.rasc.extclassgenerator.AllDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});";
        java.lang.String str18 = apiObject0.destroy;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "json" + "'", str10, "json");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/" + "'", str12, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/" + "'", str18, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
    }

    @Test
    public void test12162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12162");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getParent();
        referenceBean0.setInverse("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        java.lang.String str5 = referenceBean0.getInverse();
        referenceBean0.setChild("/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/");
        java.lang.String str8 = referenceBean0.getAssociation();
        java.lang.String str9 = referenceBean0.getAssociation();
        java.lang.String str10 = referenceBean0.getRole();
        java.lang.String str11 = referenceBean0.getAssociation();
        boolean boolean12 = referenceBean0.typeOnly();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});" + "'", str5, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test12163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12163");
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
        java.lang.String str39 = modelFieldBean2.getConvert();
        modelFieldBean2.setCalculate("Ext.define(\"ch.rasc.extclassgenerator.association.HasOneAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"setterName\",type:\"string\"},{name:\"getterName\",type:\"string\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});");
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
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
    }

    @Test
    public void test12164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12164");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("Ext.define(\"null\",\r\n{\n  extend : \"\",\n  idgen : \"Ext.define(\\\"java.util.ArrayList\\\",\\r\\n{\\n  extend : \\\"Ext.data.Model\\\",\\n  fields : [ ]\\n});\",\n  fields : [ ],\n  proxy : {\n    type : \"direct\",\n    reader : {\n      root : \"Ext.define(\\\"null\\\",{extend:\\\"Ext.data.Model\\\",idProperty:\\\"hi!\\\",fields:[],proxy:{type:\\\"direct\\\",idParam:\\\"hi!\\\"}});\",\n      messageProperty : \"hi!\"\n    },\n    writer : {\n      writeAllFields : false\n    }\n  }\n});");
    }

    @Test
    public void test12165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12165");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("Ext.define('null',{extend:'/Ext.define(\\'ch.rasc.extclassgenerator.association.HasManyAssociation\\',{extend:\\'Ext.data.Model\\',fields:[{name:\\'autoLoad\\',type:\\'boolean\\'},{name:\\'name\\',type:\\'string\\'},{name:\\'type\\',type:\\'string\\'},{name:\\'model\\',type:\\'string\\'},{name:\\'associationKey\\',type:\\'string\\'},{name:\\'foreignKey\\',type:\\'string\\'},{name:\\'primaryKey\\',type:\\'string\\'},{name:\\'instanceName\\',type:\\'string\\'}]});/',config:{fields:[],proxy:{type:'direct',api:{update:creditCardNumber}}}});", "/Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]}});/");
    }

    @Test
    public void test12166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12166");
        ch.rasc.extclassgenerator.validation.ExclusionValidation exclusionValidation2 = new ch.rasc.extclassgenerator.validation.ExclusionValidation("/\\/range\\//", "/Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",{extend:\"Ext.data.Model\",fields:[{name:\"debug\",type:\"boolean\"},{name:\"useSingleQuotes\",type:\"boolean\"},{name:\"surroundApiWithQuotes\",type:\"boolean\"}]});/");
        java.lang.String str3 = exclusionValidation2.getList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",{extend:\"Ext.data.Model\",fields:[{name:\"debug\",type:\"boolean\"},{name:\"useSingleQuotes\",type:\"boolean\"},{name:\"surroundApiWithQuotes\",type:\"boolean\"}]});/" + "'", str3, "/Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",{extend:\"Ext.data.Model\",fields:[{name:\"debug\",type:\"boolean\"},{name:\"useSingleQuotes\",type:\"boolean\"},{name:\"surroundApiWithQuotes\",type:\"boolean\"}]});/");
    }

    @Test
    public void test12167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12167");
        ch.rasc.extclassgenerator.ModelAnnotationProcessor modelAnnotationProcessor0 = new ch.rasc.extclassgenerator.ModelAnnotationProcessor();
        java.util.Set<java.lang.String> strSet1 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        javax.lang.model.SourceVersion sourceVersion2 = modelAnnotationProcessor0.getSupportedSourceVersion();
        java.util.Set<java.lang.String> strSet3 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        java.util.Set<java.lang.String> strSet4 = modelAnnotationProcessor0.getSupportedOptions();
        java.util.Set<java.lang.String> strSet5 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        java.util.Set<java.lang.String> strSet6 = modelAnnotationProcessor0.getSupportedOptions();
        javax.lang.model.SourceVersion sourceVersion7 = modelAnnotationProcessor0.getSupportedSourceVersion();
        java.util.Set<java.lang.String> strSet8 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertTrue("'" + sourceVersion2 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion2.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + sourceVersion7 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion7.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test12168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12168");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        java.lang.String str6 = modelFieldBean2.getMapping();
        java.lang.String str7 = modelFieldBean2.getName();
        java.lang.String str8 = modelFieldBean2.getConvert();
        ch.rasc.extclassgenerator.ModelType modelType9 = modelFieldBean2.getModelType();
        modelFieldBean2.setPersist((java.lang.Boolean) false);
        java.lang.String str12 = modelFieldBean2.getMapping();
        modelFieldBean2.setConvert("format");
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(modelType9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test12169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12169");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("exclusion");
        java.lang.String str2 = hasManyAssociation1.getType();
        hasManyAssociation1.setInstanceName("/Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});/");
        java.lang.String str5 = hasManyAssociation1.getType();
        hasManyAssociation1.setName("creditCardNumber");
        java.lang.String str8 = hasManyAssociation1.getModel();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hasMany" + "'", str2, "hasMany");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hasMany" + "'", str5, "hasMany");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "exclusion" + "'", str8, "exclusion");
    }

    @Test
    public void test12170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12170");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getChild();
        java.lang.String str2 = referenceBean0.getInverse();
        java.lang.String str3 = referenceBean0.getType();
        java.lang.String str4 = referenceBean0.getRole();
        java.lang.String str5 = referenceBean0.getType();
        boolean boolean6 = referenceBean0.typeOnly();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test12171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12171");
        ch.rasc.extclassgenerator.validation.NotBlankValidation notBlankValidation1 = new ch.rasc.extclassgenerator.validation.NotBlankValidation("/Ext.define(\"null\",{extend:\"Ext.data.Model\",idProperty:\"hi!\",fields:[],proxy:{type:\"direct\",idParam:\"hi!\"}});/");
    }

    @Test
    public void test12172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12172");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getChild();
        java.lang.String str2 = referenceBean0.getChild();
        referenceBean0.setAssociation("creditCardNumber");
        referenceBean0.setInverse("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        referenceBean0.setRole("exclusion");
        referenceBean0.setInverse("ch.rasc.extclassgenerator.PartialDataOptionsBean");
        java.lang.String str11 = referenceBean0.getChild();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test12173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12173");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.read;
        apiObject0.update = "hi!";
        apiObject0.create = "creditCardNumber";
        java.lang.String str8 = apiObject0.destroy;
        java.lang.String str9 = apiObject0.destroy;
        apiObject0.read = "Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"debug\",\n    type : \"boolean\"\n  }, {\n    name : \"useSingleQuotes\",\n    type : \"boolean\"\n  }, {\n    name : \"surroundApiWithQuotes\",\n    type : \"boolean\"\n  } ]\n});";
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test12174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12174");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.update = "exclusion";
        java.lang.String str8 = apiObject0.destroy;
        apiObject0.create = "Ext.define(\"null\",\r\n{\n  extend : \"\",\n  fields : [ ],\n  hasMany : [ \"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\", \"json\", \"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\", \"\" ]\n});";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test12175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12175");
        ch.rasc.extclassgenerator.OutputConfig outputConfig0 = new ch.rasc.extclassgenerator.OutputConfig();
        boolean boolean1 = outputConfig0.isSurroundApiWithQuotes();
        boolean boolean2 = outputConfig0.isDebug();
        ch.rasc.extclassgenerator.ModelAnnotationProcessor modelAnnotationProcessor3 = new ch.rasc.extclassgenerator.ModelAnnotationProcessor();
        java.util.Set<java.lang.String> strSet4 = modelAnnotationProcessor3.getSupportedAnnotationTypes();
        boolean boolean5 = outputConfig0.equals((java.lang.Object) strSet4);
        boolean boolean6 = outputConfig0.isSurroundApiWithQuotes();
        ch.rasc.extclassgenerator.LineEnding lineEnding7 = outputConfig0.getLineEnding();
        boolean boolean8 = outputConfig0.isUseSingleQuotes();
        outputConfig0.setSurroundApiWithQuotes(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(lineEnding7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test12176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12176");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray13 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList11);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray14 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("", (java.util.List<java.lang.String>) strList11);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray15 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("json", (java.util.List<java.lang.String>) strList11);
        java.util.List<java.lang.String> strList16 = exclusionValidationArray15.getList();
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray17 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("exclusion", strList16);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray18 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", strList16);
        java.util.List<java.lang.String> strList19 = exclusionValidationArray18.getList();
        java.util.List<java.lang.String> strList20 = exclusionValidationArray18.getList();
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray21 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});", strList20);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray22 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});", strList20);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray23 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("email", strList20);
        java.util.List<java.lang.String> strList24 = exclusionValidationArray23.getList();
        java.util.List<java.lang.String> strList25 = exclusionValidationArray23.getList();
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList25);
    }

    @Test
    public void test12177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12177");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        modelFieldBean2.setCritical((java.lang.Boolean) false);
        java.lang.Boolean boolean7 = modelFieldBean2.getUnique();
        java.lang.Boolean boolean8 = modelFieldBean2.getAllowNull();
        java.util.List<ch.rasc.extclassgenerator.validation.AbstractValidation> abstractValidationList9 = modelFieldBean2.getValidators();
        modelFieldBean2.setAllowBlank((java.lang.Boolean) false);
        java.lang.Boolean boolean12 = modelFieldBean2.getPersist();
        modelFieldBean2.setName("/Ext.data.Model/");
        java.lang.String str15 = modelFieldBean2.getConvert();
        java.lang.Boolean boolean16 = modelFieldBean2.getAllowNull();
        java.lang.String str17 = modelFieldBean2.getDateFormat();
        java.lang.String str18 = modelFieldBean2.getConvert();
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertNull(abstractValidationList9);
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test12178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12178");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getRole();
        referenceBean0.setChild("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        referenceBean0.setRole("json");
        boolean boolean7 = referenceBean0.typeOnly();
        referenceBean0.setAssociation("Ext.define(\"ch.rasc.extclassgenerator.validation.PresenceValidation\",{extend:\"Ext.data.Model\",fields:[{name:\"type\",type:\"string\"},{name:\"field\",type:\"string\"}]});");
        referenceBean0.setAssociation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str12 = referenceBean0.getChild();
        java.lang.String str13 = referenceBean0.getInverse();
        referenceBean0.setChild("/\\/\\\\/hasMany\\\\/\\//");
        referenceBean0.setType("Ext.define(\"ch.rasc.extclassgenerator.validation.PresenceValidation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"field\",\n    type : \"string\"\n  } ]\n});");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});" + "'", str12, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test12179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12179");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getChild();
        java.lang.String str2 = referenceBean0.getChild();
        java.lang.String str3 = referenceBean0.getType();
        boolean boolean4 = referenceBean0.hasAnyProperties();
        java.lang.String str5 = referenceBean0.getAssociation();
        referenceBean0.setRole("Ext.define(\"ch.rasc.extclassgenerator.validation.PresenceValidation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"field\",\n    type : \"string\"\n  } ]\n});");
        java.lang.String str8 = referenceBean0.getInverse();
        boolean boolean9 = referenceBean0.typeOnly();
        referenceBean0.setRole("Ext.define(\"null\",{extend:\"\",fields:[]});");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test12180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12180");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        java.lang.String str2 = hasOneAssociation1.getName();
        java.lang.String str3 = hasOneAssociation1.getGetterName();
        java.lang.String str4 = hasOneAssociation1.getSetterName();
        hasOneAssociation1.setGetterName("/\\/Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});\\//");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test12181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12181");
        ch.rasc.extclassgenerator.validation.InclusionValidation inclusionValidation2 = new ch.rasc.extclassgenerator.validation.InclusionValidation("Ext.define(\"ch.rasc.extclassgenerator.validation.InclusionValidationArray\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"field\",\n    type : \"string\"\n  } ]\n});", "/\\/Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});\\//");
    }

    @Test
    public void test12182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12182");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getRole();
        referenceBean0.setChild("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        referenceBean0.setAssociation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        referenceBean0.setRole("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        referenceBean0.setChild("hi!");
        referenceBean0.setRole("/\\/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});\\//");
        referenceBean0.setChild("");
        referenceBean0.setAssociation("/email/");
        referenceBean0.setInverse("Ext.define(\"ch.rasc.extclassgenerator.association.BelongsToAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"setterName\",\n    type : \"string\"\n  }, {\n    name : \"getterName\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test12183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12183");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("/Ext.define(\"ch.rasc.extclassgenerator.validation.CreditCardNumberValidation\",{extend:\"Ext.data.Model\",fields:[{name:\"type\",type:\"string\"},{name:\"field\",type:\"string\"}]});/");
        java.lang.String str2 = belongsToAssociation1.getGetterName();
        java.lang.String str3 = belongsToAssociation1.getModel();
        belongsToAssociation1.setGetterName("/hasMany/");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.validation.CreditCardNumberValidation\",{extend:\"Ext.data.Model\",fields:[{name:\"type\",type:\"string\"},{name:\"field\",type:\"string\"}]});/" + "'", str3, "/Ext.define(\"ch.rasc.extclassgenerator.validation.CreditCardNumberValidation\",{extend:\"Ext.data.Model\",fields:[{name:\"type\",type:\"string\"},{name:\"field\",type:\"string\"}]});/");
    }

    @Test
    public void test12184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12184");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        referenceBean0.setAssociation("belongsTo");
        referenceBean0.setAssociation("exclusion");
        java.lang.String str14 = referenceBean0.getParent();
        referenceBean0.setChild("Ext.define(\"ch.rasc.extclassgenerator.LineEnding\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
        boolean boolean17 = referenceBean0.hasAnyProperties();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test12185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12185");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean4 = allDataOptionsBean0.getCritical();
        java.lang.Boolean boolean5 = allDataOptionsBean0.getPersist();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        allDataOptionsBean0.setPersist((java.lang.Boolean) false);
        java.lang.Boolean boolean10 = allDataOptionsBean0.getCritical();
        boolean boolean11 = allDataOptionsBean0.hasAnyProperties();
        allDataOptionsBean0.setPersist((java.lang.Boolean) false);
        java.lang.Boolean boolean14 = allDataOptionsBean0.getCritical();
        java.lang.Boolean boolean15 = allDataOptionsBean0.getPersist();
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertEquals("'" + boolean15 + "' != '" + false + "'", boolean15, false);
    }

    @Test
    public void test12186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12186");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        java.lang.String str1 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str4 = apiObject0.update;
        java.lang.String str5 = apiObject0.read;
        java.lang.String str6 = apiObject0.create;
        apiObject0.destroy = "/hasOne/";
        apiObject0.create = "/Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});/";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str6, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
    }

    @Test
    public void test12187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12187");
        ch.rasc.extclassgenerator.validation.InclusionValidation inclusionValidation2 = new ch.rasc.extclassgenerator.validation.InclusionValidation("belongsTo", "inclusion");
    }

    @Test
    public void test12188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12188");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("/future/");
    }

    @Test
    public void test12189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12189");
        ch.rasc.extclassgenerator.validation.ExclusionValidation exclusionValidation2 = new ch.rasc.extclassgenerator.validation.ExclusionValidation("Ext.define(\"ch.rasc.extclassgenerator.association.BelongsToAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"setterName\",type:\"string\"},{name:\"getterName\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});", "Ext.data.Model");
    }

    @Test
    public void test12190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12190");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getChild();
        java.lang.String str2 = referenceBean0.getChild();
        boolean boolean3 = referenceBean0.hasAnyProperties();
        java.lang.String str4 = referenceBean0.getRole();
        java.lang.String str5 = referenceBean0.getParent();
        boolean boolean6 = referenceBean0.hasAnyProperties();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test12191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12191");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        java.lang.Boolean boolean1 = allDataOptionsBean0.getPersist();
        java.lang.Boolean boolean2 = allDataOptionsBean0.getPersist();
        allDataOptionsBean0.setChanges((java.lang.Boolean) true);
        allDataOptionsBean0.setCritical((java.lang.Boolean) false);
        allDataOptionsBean0.setPersist((java.lang.Boolean) false);
        java.lang.Boolean boolean9 = allDataOptionsBean0.getPersist();
        allDataOptionsBean0.setChanges((java.lang.Boolean) false);
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + false + "'", boolean9, false);
    }

    @Test
    public void test12192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12192");
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation3 = new ch.rasc.extclassgenerator.validation.RangeValidation("exclusion", (java.lang.Long) 52L, (java.lang.Long) 35L);
    }

    @Test
    public void test12193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12193");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("Ext.define(\"ch.rasc.extclassgenerator.ApiObject\",{extend:\"Ext.data.Model\",fields:[{name:\"read\",type:\"string\"},{name:\"create\",type:\"string\"},{name:\"update\",type:\"string\"},{name:\"destroy\",type:\"string\"}]});");
    }

    @Test
    public void test12194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12194");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.read = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str8 = apiObject0.update;
        java.lang.String str9 = apiObject0.destroy;
        apiObject0.destroy = "Ext.data.Model";
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.validation.CreditCardNumberValidation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"field\",\n    type : \"string\"\n  } ]\n});";
        java.lang.String str14 = apiObject0.create;
        apiObject0.read = "Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"debug\",type:\"boolean\"},{name:\"useSingleQuotes\",type:\"boolean\"},{name:\"surroundApiWithQuotes\",type:\"boolean\"}],proxy:{type:\"direct\",reader:{type:\"/format/\",messageProperty:\"Ext.define(\\\"ch.rasc.extclassgenerator.validation.InclusionValidationArray\\\",{extend:\\\"Ext.data.Model\\\",fields:[{name:\\\"type\\\",type:\\\"string\\\"},{name:\\\"field\\\",type:\\\"string\\\"}]});\"}}}});";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str8, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.validation.CreditCardNumberValidation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"field\",\n    type : \"string\"\n  } ]\n});" + "'", str14, "Ext.define(\"ch.rasc.extclassgenerator.validation.CreditCardNumberValidation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"field\",\n    type : \"string\"\n  } ]\n});");
    }

    @Test
    public void test12195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12195");
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
        modelFieldBean2.setDefaultValue((java.lang.Object) 0.0d);
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        java.lang.String str38 = modelFieldBean2.getMapping();
        java.lang.String str39 = modelFieldBean2.getName();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
    }

    @Test
    public void test12196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12196");
        ch.rasc.extclassgenerator.validation.NotBlankValidation notBlankValidation1 = new ch.rasc.extclassgenerator.validation.NotBlankValidation("Ext.define(\"ch.rasc.extclassgenerator.validation.InclusionValidationArray\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"field\",\n    type : \"string\"\n  } ]\n});");
    }

    @Test
    public void test12197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12197");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});";
        apiObject0.update = "json";
        apiObject0.destroy = "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/";
        java.lang.String str10 = apiObject0.update;
        java.lang.String str11 = apiObject0.destroy;
        apiObject0.create = "belongsTo";
        java.lang.String str14 = apiObject0.destroy;
        apiObject0.read = "range";
        apiObject0.destroy = "Ext.define(\"null\",\r\n{\n  extend : \"\",\n  fields : [ ],\n  validations : [ {\n    type : \"range\",\n    field : \"/Ext.define(\\\"ch.rasc.extclassgenerator.association.HasManyAssociation\\\",{extend:\\\"Ext.data.Model\\\",fields:[{name:\\\"autoLoad\\\",type:\\\"boolean\\\"},{name:\\\"name\\\",type:\\\"string\\\"},{name:\\\"type\\\",type:\\\"string\\\"},{name:\\\"model\\\",type:\\\"string\\\"},{name:\\\"associationKey\\\",type:\\\"string\\\"},{name:\\\"foreignKey\\\",type:\\\"string\\\"},{name:\\\"primaryKey\\\",type:\\\"string\\\"},{name:\\\"instanceName\\\",type:\\\"string\\\"}]});/\",\n    min : 0,\n    max : 0\n  } ]\n});";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "json" + "'", str10, "json");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/" + "'", str11, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/" + "'", str14, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
    }

    @Test
    public void test12198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12198");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Object obj5 = modelFieldBean2.getReference();
        java.lang.String str6 = modelFieldBean2.getName();
        java.lang.String str7 = modelFieldBean2.getConvert();
        modelFieldBean2.setPersist((java.lang.Boolean) true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test12199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12199");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("");
        java.lang.String str2 = hasOneAssociation1.getPrimaryKey();
        hasOneAssociation1.setGetterName("belongsTo");
        hasOneAssociation1.setPrimaryKey("");
        hasOneAssociation1.setPrimaryKey("/\\/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});\\//");
        hasOneAssociation1.setSetterName("Ext.define('ch.rasc.extclassgenerator.validation.CreditCardNumberValidation',{extend:'Ext.data.Model',config:{fields:[{name:'type',type:'string'},{name:'field',type:'string'}]}});");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test12200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12200");
        ch.rasc.extclassgenerator.validation.FormatValidation formatValidation2 = new ch.rasc.extclassgenerator.validation.FormatValidation("ch.rasc.extclassgenerator.AllDataOptionsBean", "Ext.define(\"java.util.Collections$EmptyList\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
    }

    @Test
    public void test12201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12201");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("hi!");
        hasManyAssociation1.setForeignKey("");
        java.lang.String str4 = hasManyAssociation1.getName();
        java.lang.String str5 = hasManyAssociation1.getForeignKey();
        java.lang.String str6 = hasManyAssociation1.getName();
        hasManyAssociation1.setForeignKey("/exclusion/");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test12202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12202");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean4 = allDataOptionsBean0.getPersist();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        allDataOptionsBean0.setPersist((java.lang.Boolean) false);
        java.lang.Boolean boolean9 = allDataOptionsBean0.getAssociated();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) true);
        boolean boolean12 = allDataOptionsBean0.hasAnyProperties();
        java.lang.Boolean boolean13 = allDataOptionsBean0.getAssociated();
        allDataOptionsBean0.setPersist((java.lang.Boolean) true);
        java.lang.Boolean boolean16 = allDataOptionsBean0.getPersist();
        boolean boolean17 = allDataOptionsBean0.hasAnyProperties();
        java.lang.Boolean boolean18 = allDataOptionsBean0.getCritical();
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + false + "'", boolean9, false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + true + "'", boolean13, true);
        org.junit.Assert.assertEquals("'" + boolean16 + "' != '" + true + "'", boolean16, true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(boolean18);
    }

    @Test
    public void test12203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12203");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean6 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean6.setConvert("hi!");
        java.lang.Boolean boolean9 = modelFieldBean6.getPersist();
        java.lang.String str10 = modelFieldBean6.getMapping();
        java.lang.String str11 = modelFieldBean6.getName();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray18 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList16);
        modelFieldBean6.setDepends((java.util.List<java.lang.String>) strList16);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray20 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});", (java.util.List<java.lang.String>) strList16);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray21 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});/", (java.util.List<java.lang.String>) strList16);
        java.util.List<java.lang.String> strList22 = exclusionValidationArray21.getList();
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray23 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", strList22);
        java.util.List<java.lang.String> strList24 = inclusionValidationArray23.getList();
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray25 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("java.util.ArrayList", strList24);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(strList24);
    }

    @Test
    public void test12204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12204");
        ch.rasc.extclassgenerator.validation.PastValidation pastValidation1 = new ch.rasc.extclassgenerator.validation.PastValidation("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});");
        java.lang.String str2 = pastValidation1.getType();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "past" + "'", str2, "past");
    }

    @Test
    public void test12205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12205");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        hasOneAssociation1.setGetterName("hi!");
        hasOneAssociation1.setSetterName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str6 = hasOneAssociation1.getName();
        hasOneAssociation1.setInstanceName("creditCardNumber");
        java.lang.String str9 = hasOneAssociation1.getSetterName();
        java.lang.String str10 = hasOneAssociation1.getPrimaryKey();
        java.lang.String str11 = hasOneAssociation1.getGetterName();
        hasOneAssociation1.setSetterName("/ch.rasc.extclassgenerator.ModelAnnotationProcessor/");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str9, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test12206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12206");
        ch.rasc.extclassgenerator.OutputConfig outputConfig0 = new ch.rasc.extclassgenerator.OutputConfig();
        boolean boolean1 = outputConfig0.isSurroundApiWithQuotes();
        boolean boolean2 = outputConfig0.isDebug();
        boolean boolean3 = outputConfig0.isSurroundApiWithQuotes();
        outputConfig0.setSurroundApiWithQuotes(false);
        boolean boolean6 = outputConfig0.isDebug();
        boolean boolean7 = outputConfig0.isUseSingleQuotes();
        boolean boolean8 = outputConfig0.isSurroundApiWithQuotes();
        boolean boolean9 = outputConfig0.isSurroundApiWithQuotes();
        boolean boolean10 = outputConfig0.isSurroundApiWithQuotes();
        outputConfig0.setUseSingleQuotes(true);
        outputConfig0.setUseSingleQuotes(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test12207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12207");
        ch.rasc.extclassgenerator.PartialDataOptionsBean partialDataOptionsBean0 = new ch.rasc.extclassgenerator.PartialDataOptionsBean();
        java.lang.Boolean boolean1 = partialDataOptionsBean0.getChanges();
        partialDataOptionsBean0.setPersist((java.lang.Boolean) true);
        partialDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean6 = partialDataOptionsBean0.getAssociated();
        partialDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + false + "'", boolean6, false);
    }

    @Test
    public void test12208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12208");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        ch.rasc.extclassgenerator.validation.GenericValidation genericValidation3 = new ch.rasc.extclassgenerator.validation.GenericValidation("Ext.define('ch.rasc.extclassgenerator.validation.CreditCardNumberValidation',{extend:'Ext.data.Model',config:{fields:[{name:'type',type:'string'},{name:'field',type:'string'}]}});", "notBlank", strMap2);
    }

    @Test
    public void test12209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12209");
        ch.rasc.extclassgenerator.validation.InclusionValidation inclusionValidation2 = new ch.rasc.extclassgenerator.validation.InclusionValidation("/\\/\\\\/hasMany\\\\/\\//", "Ext.define(\"ch.rasc.extclassgenerator.validation.PastValidation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"field\",\n    type : \"string\"\n  } ]\n});");
    }

    @Test
    public void test12210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12210");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.update = "exclusion";
        java.lang.String str8 = apiObject0.read;
        java.lang.String str9 = apiObject0.destroy;
        apiObject0.create = "creditCardNumber";
        apiObject0.update = "hi!";
        apiObject0.read = "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});";
        apiObject0.create = "Ext.define('ch.rasc.extclassgenerator.validation.CreditCardNumberValidation',{extend:'Ext.data.Model',config:{fields:[{name:'type',type:'string'},{name:'field',type:'string'}]}});";
        apiObject0.update = "/Ext.define(\"null\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ],\n  proxy : {\n    type : \"direct\",\n    reader : {\n      totalProperty : \"\\/Ext.define(\\\"ch.rasc.extclassgenerator.association.HasManyAssociation\\\",{extend:\\\"Ext.data.Model\\\",fields:[{name:\\\"autoLoad\\\",type:\\\"boolean\\\"},{name:\\\"name\\\",type:\\\"string\\\"},{name:\\\"type\\\",type:\\\"string\\\"},{name:\\\"model\\\",type:\\\"string\\\"},{name:\\\"associationKey\\\",type:\\\"string\\\"},{name:\\\"foreignKey\\\",type:\\\"string\\\"},{name:\\\"primaryKey\\\",type:\\\"string\\\"},{name:\\\"instanceName\\\",type:\\\"string\\\"}]});\\/\"\n    }\n  }\n});/";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test12211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12211");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/");
        java.lang.String str2 = belongsToAssociation1.getModel();
        belongsToAssociation1.setForeignKey("Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
        belongsToAssociation1.setGetterName("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});");
        belongsToAssociation1.setForeignKey("Ext.data.Model");
        java.lang.String str9 = belongsToAssociation1.getSetterName();
        belongsToAssociation1.setGetterName("Ext.define(\"null\",{extend:\"\",config:{fields:[]}});");
        java.lang.String str12 = belongsToAssociation1.getType();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/" + "'", str2, "/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "belongsTo" + "'", str12, "belongsTo");
    }

    @Test
    public void test12212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12212");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getInverse();
        java.lang.String str3 = referenceBean0.getInverse();
        referenceBean0.setAssociation("/\\/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});\\//");
        java.lang.String str6 = referenceBean0.getParent();
        referenceBean0.setType("ch.rasc.extclassgenerator.ModelBean");
        java.lang.String str9 = referenceBean0.getAssociation();
        java.lang.String str10 = referenceBean0.getRole();
        java.lang.String str11 = referenceBean0.getInverse();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/\\/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});\\//" + "'", str9, "/\\/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});\\//");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test12213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12213");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        referenceBean0.setType("");
        referenceBean0.setInverse("/range/");
        java.lang.String str5 = referenceBean0.getChild();
        boolean boolean6 = referenceBean0.hasAnyProperties();
        referenceBean0.setInverse("Ext.define(\"ch.rasc.extclassgenerator.association.BelongsToAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"setterName\",\n    type : \"string\"\n  }, {\n    name : \"getterName\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test12214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12214");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getChild();
        java.lang.String str2 = referenceBean0.getRole();
        java.lang.String str3 = referenceBean0.getParent();
        java.lang.String str4 = referenceBean0.getAssociation();
        java.lang.String str5 = referenceBean0.getInverse();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test12215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12215");
        ch.rasc.extclassgenerator.ModelAnnotationProcessor modelAnnotationProcessor0 = new ch.rasc.extclassgenerator.ModelAnnotationProcessor();
        java.util.Set<java.lang.String> strSet1 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        java.util.Set<java.lang.String> strSet2 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        java.util.Set<java.lang.String> strSet3 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        java.util.Set<java.lang.String> strSet4 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        java.util.Set<java.lang.String> strSet5 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        javax.lang.model.element.Element element6 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror7 = null;
        javax.lang.model.element.ExecutableElement executableElement8 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable10 = modelAnnotationProcessor0.getCompletions(element6, annotationMirror7, executableElement8, "ch.rasc.extclassgenerator.validation.CreditCardNumberValidation");
        java.util.Set<java.lang.String> strSet11 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        java.util.Set<java.lang.String> strSet12 = modelAnnotationProcessor0.getSupportedOptions();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(wildcardIterable10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test12216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12216");
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
        javax.lang.model.element.Element element15 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror16 = null;
        javax.lang.model.element.ExecutableElement executableElement17 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable19 = modelAnnotationProcessor0.getCompletions(element15, annotationMirror16, executableElement17, "belongsTo");
        java.util.Set<java.lang.String> strSet20 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        javax.lang.model.element.Element element21 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror22 = null;
        javax.lang.model.element.ExecutableElement executableElement23 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable25 = modelAnnotationProcessor0.getCompletions(element21, annotationMirror22, executableElement23, "Ext.define(\"null\",\r\n{\n  extend : \"Ext.data.Model\",\n  idgen : \"Ext.define(\\\"null\\\",{extend:\\\"Ext.data.Model\\\",config:{fields:[],proxy:{type:\\\"direct\\\",directFn:hi!,writer:{type:\\\"Ext.define(\\\\\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\\\\\",{extend:\\\\\\\"Ext.data.Model\\\\\\\",config:{fields:[]}});\\\"}}}});\",\n  fields : [ ]\n});");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(wildcardIterable7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(wildcardIterable13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(wildcardIterable19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(wildcardIterable25);
    }

    @Test
    public void test12217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12217");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});";
        apiObject0.update = "json";
        apiObject0.destroy = "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/";
        java.lang.String str10 = apiObject0.update;
        java.lang.String str11 = apiObject0.destroy;
        apiObject0.update = "/\\/Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});\\//";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "json" + "'", str10, "json");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/" + "'", str11, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
    }

    @Test
    public void test12218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12218");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("Ext.define(\"null\",{extend:\"Ext.data.Model\",idProperty:\"hi!\",fields:[],proxy:{type:\"direct\",idParam:\"hi!\"}});", (java.lang.Long) 0L, (java.lang.Long) 97L);
    }

    @Test
    public void test12219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12219");
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation3 = new ch.rasc.extclassgenerator.validation.RangeValidation("range", (java.lang.Long) 32L, (java.lang.Long) 32L);
    }

    @Test
    public void test12220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12220");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean4 = allDataOptionsBean0.getPersist();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        allDataOptionsBean0.setPersist((java.lang.Boolean) false);
        allDataOptionsBean0.setChanges((java.lang.Boolean) false);
        allDataOptionsBean0.setPersist((java.lang.Boolean) false);
        boolean boolean13 = allDataOptionsBean0.hasAnyProperties();
        java.lang.Boolean boolean14 = allDataOptionsBean0.getAssociated();
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + boolean14 + "' != '" + false + "'", boolean14, false);
    }

    @Test
    public void test12221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12221");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        java.lang.String str10 = referenceBean0.getType();
        referenceBean0.setParent("");
        java.lang.String str13 = referenceBean0.getParent();
        boolean boolean14 = referenceBean0.hasAnyProperties();
        referenceBean0.setChild("hasOne");
        java.lang.String str17 = referenceBean0.getAssociation();
        java.lang.String str18 = referenceBean0.getAssociation();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test12222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12222");
        ch.rasc.extclassgenerator.validation.PastValidation pastValidation1 = new ch.rasc.extclassgenerator.validation.PastValidation("Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
    }

    @Test
    public void test12223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12223");
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
        java.lang.String str18 = modelFieldBean2.getConvert();
        ch.rasc.extclassgenerator.ApiObject apiObject19 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject19.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str22 = apiObject19.update;
        apiObject19.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});";
        apiObject19.destroy = "belongsTo";
        apiObject19.destroy = "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str29 = apiObject19.read;
        apiObject19.read = "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str32 = apiObject19.destroy;
        apiObject19.update = "//";
        java.lang.String str35 = apiObject19.update;
        apiObject19.destroy = "/Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});/";
        modelFieldBean2.setReference((java.lang.Object) "/Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});/");
        modelFieldBean2.setAllowBlank((java.lang.Boolean) false);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str22, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str32, "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "//" + "'", str35, "//");
    }

    @Test
    public void test12224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12224");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.read = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.update = "";
        apiObject0.create = "digits";
        java.lang.String str12 = apiObject0.destroy;
        java.lang.String str13 = apiObject0.read;
        java.lang.String str14 = apiObject0.read;
        apiObject0.create = "range";
        apiObject0.read = "Ext.define(\"ch.rasc.extclassgenerator.ReferenceBean\",{extend:\"Ext.data.Model\",fields:[{name:\"type\",type:\"string\"},{name:\"association\",type:\"string\"},{name:\"child\",type:\"string\"},{name:\"parent\",type:\"string\"},{name:\"role\",type:\"string\"},{name:\"inverse\",type:\"string\"}]});";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str13, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str14, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
    }

    @Test
    public void test12225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12225");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("/ch.rasc.extclassgenerator.ModelAnnotationProcessor/", "Ext.data.Model");
        java.lang.Object obj3 = modelFieldBean2.getReference();
        modelFieldBean2.setMapping("Ext.define(\"ch.rasc.extclassgenerator.ApiObject\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"read\",type:\"string\"},{name:\"create\",type:\"string\"},{name:\"update\",type:\"string\"},{name:\"destroy\",type:\"string\"}]}});");
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test12226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12226");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean4 = allDataOptionsBean0.getCritical();
        allDataOptionsBean0.setPersist((java.lang.Boolean) false);
        java.lang.Boolean boolean7 = allDataOptionsBean0.getCritical();
        java.lang.Boolean boolean8 = allDataOptionsBean0.getCritical();
        java.lang.Boolean boolean9 = allDataOptionsBean0.getAssociated();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + false + "'", boolean9, false);
    }

    @Test
    public void test12227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12227");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        hasOneAssociation1.setGetterName("creditCardNumber");
        java.lang.String str4 = hasOneAssociation1.getGetterName();
        hasOneAssociation1.setGetterName("creditCardNumber");
        java.lang.String str7 = hasOneAssociation1.getName();
        hasOneAssociation1.setSetterName("/exclusion/");
        hasOneAssociation1.setPrimaryKey("/Ext.define(\"ch.rasc.extclassgenerator.validation.PresenceValidation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"field\",\n    type : \"string\"\n  } ]\n});/");
        hasOneAssociation1.setSetterName("Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]}});");
        hasOneAssociation1.setGetterName("range");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "creditCardNumber" + "'", str4, "creditCardNumber");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test12228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12228");
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
        java.lang.Boolean boolean27 = modelFieldBean2.getUnique();
        ch.rasc.extclassgenerator.OutputConfig outputConfig28 = new ch.rasc.extclassgenerator.OutputConfig();
        boolean boolean29 = outputConfig28.isSurroundApiWithQuotes();
        boolean boolean30 = outputConfig28.isDebug();
        ch.rasc.extclassgenerator.ModelAnnotationProcessor modelAnnotationProcessor31 = new ch.rasc.extclassgenerator.ModelAnnotationProcessor();
        java.util.Set<java.lang.String> strSet32 = modelAnnotationProcessor31.getSupportedAnnotationTypes();
        boolean boolean33 = outputConfig28.equals((java.lang.Object) strSet32);
        boolean boolean34 = outputConfig28.isSurroundApiWithQuotes();
        boolean boolean35 = modelFieldBean2.hasOnlyName(outputConfig28);
        ch.rasc.extclassgenerator.ModelType modelType36 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelFieldBean2.setModelType(modelType36);
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
        org.junit.Assert.assertNull(boolean27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test12229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12229");
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation4 = new ch.rasc.extclassgenerator.validation.RangeValidation("exclusion", (java.lang.Long) 10L, (java.lang.Long) (-1L));
        java.math.BigDecimal bigDecimal5 = rangeValidation4.getMax();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation9 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});", (java.lang.Long) 1L, (java.lang.Long) 10L);
        java.math.BigDecimal bigDecimal10 = rangeValidation9.getMax();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation11 = new ch.rasc.extclassgenerator.validation.RangeValidation("", bigDecimal5, bigDecimal10);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal10);
    }

    @Test
    public void test12230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12230");
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation4 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 32L, (java.lang.Long) 100L);
        java.math.BigDecimal bigDecimal5 = rangeValidation4.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation9 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.data.Model", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal10 = rangeValidation9.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation11 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ApiObject\",{extend:\"Ext.data.Model\",fields:[{name:\"read\",type:\"string\"},{name:\"create\",type:\"string\"},{name:\"update\",type:\"string\"},{name:\"destroy\",type:\"string\"}]});", bigDecimal5, bigDecimal10);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal10);
    }

    @Test
    public void test12231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12231");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("/Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});/");
    }

    @Test
    public void test12232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12232");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        modelFieldBean2.setMapping("hi!");
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        modelFieldBean2.setAllowBlank((java.lang.Boolean) false);
        ch.rasc.extclassgenerator.OutputConfig outputConfig11 = new ch.rasc.extclassgenerator.OutputConfig();
        outputConfig11.setUseSingleQuotes(false);
        boolean boolean14 = modelFieldBean2.hasOnlyName(outputConfig11);
        java.lang.String str15 = modelFieldBean2.getCalculate();
        java.lang.String str16 = modelFieldBean2.getName();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test12233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12233");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getRole();
        referenceBean0.setChild("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        referenceBean0.setAssociation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        referenceBean0.setRole("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        referenceBean0.setChild("hi!");
        referenceBean0.setRole("json");
        java.lang.String str13 = referenceBean0.getAssociation();
        java.lang.String str14 = referenceBean0.getType();
        java.lang.String str15 = referenceBean0.getInverse();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});" + "'", str13, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test12234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12234");
        ch.rasc.extclassgenerator.PartialDataOptionsBean partialDataOptionsBean0 = new ch.rasc.extclassgenerator.PartialDataOptionsBean();
        java.lang.Boolean boolean1 = partialDataOptionsBean0.getChanges();
        java.lang.Boolean boolean2 = partialDataOptionsBean0.getCritical();
        partialDataOptionsBean0.setCritical((java.lang.Boolean) true);
        partialDataOptionsBean0.setAssociated((java.lang.Boolean) true);
        java.lang.Boolean boolean7 = partialDataOptionsBean0.getPersist();
        partialDataOptionsBean0.setChanges((java.lang.Boolean) true);
        boolean boolean10 = partialDataOptionsBean0.hasAnyProperties();
        partialDataOptionsBean0.setPersist((java.lang.Boolean) false);
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test12235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12235");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        java.lang.String str6 = modelFieldBean2.getMapping();
        java.lang.Object obj7 = modelFieldBean2.getReference();
        modelFieldBean2.setCalculate("exclusion");
        java.lang.Boolean boolean10 = modelFieldBean2.getUnique();
        modelFieldBean2.setMapping("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setMapping("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        java.lang.Boolean boolean15 = modelFieldBean2.getAllowNull();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNull(boolean15);
    }

    @Test
    public void test12236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12236");
        ch.rasc.extclassgenerator.OutputConfig outputConfig0 = new ch.rasc.extclassgenerator.OutputConfig();
        boolean boolean1 = outputConfig0.isSurroundApiWithQuotes();
        boolean boolean2 = outputConfig0.isSurroundApiWithQuotes();
        boolean boolean3 = outputConfig0.isDebug();
        boolean boolean4 = outputConfig0.isDebug();
        ch.rasc.extclassgenerator.OutputFormat outputFormat5 = outputConfig0.getOutputFormat();
        boolean boolean6 = outputConfig0.isSurroundApiWithQuotes();
        boolean boolean7 = outputConfig0.isUseSingleQuotes();
        ch.rasc.extclassgenerator.LineEnding lineEnding8 = outputConfig0.getLineEnding();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(outputFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(lineEnding8);
    }

    @Test
    public void test12237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12237");
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation4 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"null\",{extend:\"\",config:{fields:[]}});", (java.lang.Long) 97L, (java.lang.Long) 97L);
        java.math.BigDecimal bigDecimal5 = rangeValidation4.getMax();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation11 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal12 = rangeValidation11.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation16 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal17 = rangeValidation16.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation18 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal12, bigDecimal17);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation24 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal25 = rangeValidation24.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation29 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal30 = rangeValidation29.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation31 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal25, bigDecimal30);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation36 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal37 = rangeValidation36.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation41 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal42 = rangeValidation41.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation43 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal37, bigDecimal42);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation44 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal30, bigDecimal37);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation45 = new ch.rasc.extclassgenerator.validation.RangeValidation("digits", bigDecimal12, bigDecimal30);
        java.math.BigDecimal bigDecimal46 = rangeValidation45.getMax();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation47 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});", bigDecimal5, bigDecimal46);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(bigDecimal37);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertNotNull(bigDecimal46);
    }

    @Test
    public void test12238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12238");
        ch.rasc.extclassgenerator.validation.ExclusionValidation exclusionValidation2 = new ch.rasc.extclassgenerator.validation.ExclusionValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});", "Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
    }

    @Test
    public void test12239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12239");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray7 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList5);
        java.util.List<java.lang.String> strList8 = inclusionValidationArray7.getList();
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray9 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", strList8);
        java.util.List<java.lang.String> strList10 = exclusionValidationArray9.getList();
        java.util.List<java.lang.String> strList11 = exclusionValidationArray9.getList();
        java.util.List<java.lang.String> strList12 = exclusionValidationArray9.getList();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test12240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12240");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        java.lang.String str2 = hasOneAssociation1.getPrimaryKey();
        java.lang.String str3 = hasOneAssociation1.getSetterName();
        java.lang.String str4 = hasOneAssociation1.getSetterName();
        java.lang.String str5 = hasOneAssociation1.getPrimaryKey();
        java.lang.String str6 = hasOneAssociation1.getName();
        java.lang.String str7 = hasOneAssociation1.getAssociationKey();
        java.lang.String str8 = hasOneAssociation1.getSetterName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test12241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12241");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("");
        belongsToAssociation1.setForeignKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        java.lang.String str4 = belongsToAssociation1.getType();
        java.lang.String str5 = belongsToAssociation1.getModel();
        java.lang.String str6 = belongsToAssociation1.getSetterName();
        belongsToAssociation1.setForeignKey("/ch.rasc.extclassgenerator.ModelAnnotationProcessor/");
        belongsToAssociation1.setInstanceName("Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
        java.lang.String str11 = belongsToAssociation1.getGetterName();
        belongsToAssociation1.setGetterName("ch.rasc.extclassgenerator.validation.CreditCardNumberValidation");
        belongsToAssociation1.setForeignKey("/Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "belongsTo" + "'", str4, "belongsTo");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test12242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12242");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getChild();
        java.lang.String str2 = referenceBean0.getChild();
        referenceBean0.setAssociation("creditCardNumber");
        referenceBean0.setType("");
        referenceBean0.setAssociation("exclusion");
        java.lang.String str9 = referenceBean0.getInverse();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test12243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12243");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        java.lang.String str3 = modelBean0.getIdProperty();
        java.lang.String str4 = modelBean0.getCreateMethod();
        modelBean0.setIdProperty("hi!");
        java.lang.String str7 = modelBean0.getName();
        modelBean0.setIdentifier("");
        boolean boolean10 = modelBean0.isDisablePagingParameters();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test12244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12244");
        ch.rasc.extclassgenerator.validation.ExclusionValidation exclusionValidation2 = new ch.rasc.extclassgenerator.validation.ExclusionValidation("range", "Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"associated\",\n    type : \"boolean\"\n  }, {\n    name : \"changes\",\n    type : \"boolean\"\n  }, {\n    name : \"critical\",\n    type : \"boolean\"\n  }, {\n    name : \"persist\",\n    type : \"boolean\"\n  } ]\n});");
        java.lang.String str3 = exclusionValidation2.getList();
        java.lang.String str4 = exclusionValidation2.getList();
        java.lang.String str5 = exclusionValidation2.getList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"associated\",\n    type : \"boolean\"\n  }, {\n    name : \"changes\",\n    type : \"boolean\"\n  }, {\n    name : \"critical\",\n    type : \"boolean\"\n  }, {\n    name : \"persist\",\n    type : \"boolean\"\n  } ]\n});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"associated\",\n    type : \"boolean\"\n  }, {\n    name : \"changes\",\n    type : \"boolean\"\n  }, {\n    name : \"critical\",\n    type : \"boolean\"\n  }, {\n    name : \"persist\",\n    type : \"boolean\"\n  } ]\n});");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"associated\",\n    type : \"boolean\"\n  }, {\n    name : \"changes\",\n    type : \"boolean\"\n  }, {\n    name : \"critical\",\n    type : \"boolean\"\n  }, {\n    name : \"persist\",\n    type : \"boolean\"\n  } ]\n});" + "'", str4, "Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"associated\",\n    type : \"boolean\"\n  }, {\n    name : \"changes\",\n    type : \"boolean\"\n  }, {\n    name : \"critical\",\n    type : \"boolean\"\n  }, {\n    name : \"persist\",\n    type : \"boolean\"\n  } ]\n});");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"associated\",\n    type : \"boolean\"\n  }, {\n    name : \"changes\",\n    type : \"boolean\"\n  }, {\n    name : \"critical\",\n    type : \"boolean\"\n  }, {\n    name : \"persist\",\n    type : \"boolean\"\n  } ]\n});" + "'", str5, "Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"associated\",\n    type : \"boolean\"\n  }, {\n    name : \"changes\",\n    type : \"boolean\"\n  }, {\n    name : \"critical\",\n    type : \"boolean\"\n  }, {\n    name : \"persist\",\n    type : \"boolean\"\n  } ]\n});");
    }

    @Test
    public void test12245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12245");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        java.lang.Boolean boolean1 = allDataOptionsBean0.getPersist();
        java.lang.Boolean boolean2 = allDataOptionsBean0.getPersist();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean5 = allDataOptionsBean0.getCritical();
        allDataOptionsBean0.setChanges((java.lang.Boolean) true);
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNull(boolean5);
    }

    @Test
    public void test12246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12246");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        modelFieldBean2.setCritical((java.lang.Boolean) false);
        java.lang.String str7 = modelFieldBean2.getDateFormat();
        java.lang.String str8 = modelFieldBean2.getConvert();
        ch.rasc.extclassgenerator.ModelType modelType9 = modelFieldBean2.getModelType();
        java.lang.String str10 = modelFieldBean2.getMapping();
        modelFieldBean2.setUseNull((java.lang.Boolean) false);
        java.lang.Boolean boolean13 = modelFieldBean2.getUseNull();
        modelFieldBean2.setAllowBlank((java.lang.Boolean) true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(modelType9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + false + "'", boolean13, false);
    }

    @Test
    public void test12247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12247");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.read = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str8 = apiObject0.update;
        java.lang.String str9 = apiObject0.destroy;
        apiObject0.create = "json";
        apiObject0.update = "";
        java.lang.String str14 = apiObject0.create;
        apiObject0.update = "Ext.define(\"java.util.Collections$UnmodifiableSet\",{extend:\"Ext.data.Model\",config:{fields:[]}});";
        java.lang.String str17 = apiObject0.destroy;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str8, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "json" + "'", str14, "json");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test12248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12248");
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
        java.lang.Boolean boolean15 = allDataOptionsBean0.getAssociated();
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + false + "'", boolean7, false);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + false + "'", boolean11, false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertEquals("'" + boolean15 + "' != '" + false + "'", boolean15, false);
    }

    @Test
    public void test12249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12249");
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
        java.util.List<java.lang.String> strList33 = modelFieldBean2.getDepends();
        java.util.List<ch.rasc.extclassgenerator.validation.AbstractValidation> abstractValidationList34 = modelFieldBean2.getValidators();
        java.lang.String str35 = modelFieldBean2.getCalculate();
        modelFieldBean2.setMapping("/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});/");
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
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertNull(abstractValidationList34);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test12250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12250");
        ch.rasc.extclassgenerator.validation.DigitsValidation digitsValidation3 = new ch.rasc.extclassgenerator.validation.DigitsValidation("Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});", (int) (short) 100, 97);
        int int4 = digitsValidation3.getInteger();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test12251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12251");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.destroy = "";
        apiObject0.destroy = "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/";
        java.lang.String str5 = apiObject0.read;
        apiObject0.update = "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/";
        java.lang.String str8 = apiObject0.destroy;
        java.lang.String str9 = apiObject0.destroy;
        apiObject0.destroy = "/\\/\\\\/hasMany\\\\/\\//";
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/" + "'", str8, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/" + "'", str9, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
    }

    @Test
    public void test12252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12252");
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
        referenceBean0.setAssociation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        referenceBean0.setType("/Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test12253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12253");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.read;
        java.lang.String str4 = apiObject0.create;
        java.lang.String str5 = apiObject0.read;
        java.lang.String str6 = apiObject0.destroy;
        java.lang.String str7 = apiObject0.update;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str7, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
    }

    @Test
    public void test12254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12254");
        ch.rasc.extclassgenerator.PartialDataOptionsBean partialDataOptionsBean0 = new ch.rasc.extclassgenerator.PartialDataOptionsBean();
        java.lang.Boolean boolean1 = partialDataOptionsBean0.getChanges();
        java.lang.Boolean boolean2 = partialDataOptionsBean0.getCritical();
        partialDataOptionsBean0.setCritical((java.lang.Boolean) true);
        java.lang.Boolean boolean5 = partialDataOptionsBean0.getPersist();
        partialDataOptionsBean0.setChanges((java.lang.Boolean) false);
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNull(boolean5);
    }

    @Test
    public void test12255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12255");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        java.lang.String str2 = hasOneAssociation1.getName();
        java.lang.String str3 = hasOneAssociation1.getGetterName();
        java.lang.String str4 = hasOneAssociation1.getAssociationKey();
        hasOneAssociation1.setInstanceName("digits");
        java.lang.String str7 = hasOneAssociation1.getModel();
        java.lang.String str8 = hasOneAssociation1.getGetterName();
        java.lang.String str9 = hasOneAssociation1.getForeignKey();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test12256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12256");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("/range/", "Ext.define(\"null\",{extend:\"\",fields:[]});");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray14 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList12);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray15 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("", (java.util.List<java.lang.String>) strList12);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray16 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("json", (java.util.List<java.lang.String>) strList12);
        java.util.List<java.lang.String> strList17 = exclusionValidationArray16.getList();
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray18 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("exclusion", strList17);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray19 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", strList17);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray20 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("json", strList17);
        modelFieldBean2.setDepends(strList17);
        java.lang.Boolean boolean22 = modelFieldBean2.getCritical();
        java.lang.Boolean boolean23 = modelFieldBean2.getCritical();
        modelFieldBean2.setCritical((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNull(boolean22);
        org.junit.Assert.assertNull(boolean23);
    }

    @Test
    public void test12257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12257");
        ch.rasc.extclassgenerator.OutputConfig outputConfig0 = new ch.rasc.extclassgenerator.OutputConfig();
        boolean boolean1 = outputConfig0.isDebug();
        ch.rasc.extclassgenerator.OutputFormat outputFormat2 = outputConfig0.getOutputFormat();
        boolean boolean3 = outputConfig0.isDebug();
        ch.rasc.extclassgenerator.IncludeValidation includeValidation4 = outputConfig0.getIncludeValidation();
        outputConfig0.setUseSingleQuotes(true);
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean9 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean9.setConvert("hi!");
        java.lang.Boolean boolean12 = modelFieldBean9.getPersist();
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean15 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean15.setConvert("hi!");
        java.lang.Boolean boolean18 = modelFieldBean15.getPersist();
        java.lang.String str19 = modelFieldBean15.getMapping();
        java.lang.String str20 = modelFieldBean15.getName();
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray27 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList25);
        modelFieldBean15.setDepends((java.util.List<java.lang.String>) strList25);
        modelFieldBean9.setDepends((java.util.List<java.lang.String>) strList25);
        modelFieldBean9.setUseNull((java.lang.Boolean) false);
        java.lang.Boolean boolean32 = modelFieldBean9.getCritical();
        modelFieldBean9.setCritical((java.lang.Boolean) true);
        java.lang.Boolean boolean35 = modelFieldBean9.getPersist();
        java.lang.Object obj36 = modelFieldBean9.getReference();
        modelFieldBean9.setConvert("");
        java.lang.String str39 = modelFieldBean9.getMapping();
        modelFieldBean9.setName("creditCardNumber");
        boolean boolean42 = outputConfig0.equals((java.lang.Object) modelFieldBean9);
        java.lang.Boolean boolean43 = modelFieldBean9.getUseNull();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(outputFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(includeValidation4);
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertNull(boolean18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(boolean32);
        org.junit.Assert.assertNull(boolean35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + boolean43 + "' != '" + false + "'", boolean43, false);
    }

    @Test
    public void test12258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12258");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("belongsTo", (java.lang.Long) 35L, (java.lang.Long) 1L);
    }

    @Test
    public void test12259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12259");
        ch.rasc.extclassgenerator.PartialDataOptionsBean partialDataOptionsBean0 = new ch.rasc.extclassgenerator.PartialDataOptionsBean();
        java.lang.Boolean boolean1 = partialDataOptionsBean0.getChanges();
        java.lang.Boolean boolean2 = partialDataOptionsBean0.getChanges();
        partialDataOptionsBean0.setPersist((java.lang.Boolean) true);
        partialDataOptionsBean0.setChanges((java.lang.Boolean) false);
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNull(boolean2);
    }

    @Test
    public void test12260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12260");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        ch.rasc.extclassgenerator.validation.GenericValidation genericValidation3 = new ch.rasc.extclassgenerator.validation.GenericValidation("Ext.define(\"null\",\r\n{\n  extend : \"Ext.data.Model\",\n  idgen : \"Ext.define(\\\"null\\\",{extend:\\\"Ext.data.Model\\\",config:{fields:[],proxy:{type:\\\"direct\\\",directFn:hi!,writer:{type:\\\"Ext.define(\\\\\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\\\\\",{extend:\\\\\\\"Ext.data.Model\\\\\\\",config:{fields:[]}});\\\"}}}});\",\n  fields : [ ]\n});", "Ext.define(\"ch.rasc.extclassgenerator.validation.PastValidation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"field\",\n    type : \"string\"\n  } ]\n});", strMap2);
    }

    @Test
    public void test12261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12261");
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
        modelFieldBean2.setAllowBlank((java.lang.Boolean) true);
        java.lang.Boolean boolean23 = modelFieldBean2.getPersist();
        modelFieldBean2.setAllowNull((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(abstractValidationArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(strList19);
        org.junit.Assert.assertNull(modelType20);
        org.junit.Assert.assertNull(boolean23);
    }

    @Test
    public void test12262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12262");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        ch.rasc.extclassgenerator.validation.GenericValidation genericValidation3 = new ch.rasc.extclassgenerator.validation.GenericValidation("hi!", "Ext.define(\"ch.rasc.extclassgenerator.AllDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});", strMap2);
    }

    @Test
    public void test12263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12263");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.read = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.update = "";
        apiObject0.read = "json";
        java.lang.String str12 = apiObject0.create;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ReferenceBean\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"type\",type:\"string\"},{name:\"association\",type:\"string\"},{name:\"child\",type:\"string\"},{name:\"parent\",type:\"string\"},{name:\"role\",type:\"string\"},{name:\"inverse\",type:\"string\"}]}});";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str12, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
    }

    @Test
    public void test12264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12264");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        modelFieldBean2.setMapping("hi!");
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        modelFieldBean2.setDateFormat("Ext.define(\"ch.rasc.extclassgenerator.validation.PresenceValidation\",{extend:\"Ext.data.Model\",fields:[{name:\"type\",type:\"string\"},{name:\"field\",type:\"string\"}]});");
        modelFieldBean2.setUnique((java.lang.Boolean) false);
        java.lang.String str13 = modelFieldBean2.getDateFormat();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.validation.PresenceValidation\",{extend:\"Ext.data.Model\",fields:[{name:\"type\",type:\"string\"},{name:\"field\",type:\"string\"}]});" + "'", str13, "Ext.define(\"ch.rasc.extclassgenerator.validation.PresenceValidation\",{extend:\"Ext.data.Model\",fields:[{name:\"type\",type:\"string\"},{name:\"field\",type:\"string\"}]});");
    }

    @Test
    public void test12265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12265");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.destroy = "";
        apiObject0.destroy = "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/";
        java.lang.String str5 = apiObject0.read;
        java.lang.String str6 = apiObject0.destroy;
        java.lang.String str7 = apiObject0.destroy;
        java.lang.String str8 = apiObject0.create;
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"debug\",type:\"boolean\"},{name:\"useSingleQuotes\",type:\"boolean\"},{name:\"surroundApiWithQuotes\",type:\"boolean\"}]}});";
        java.lang.String str11 = apiObject0.read;
        java.lang.String str12 = apiObject0.destroy;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/" + "'", str6, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/" + "'", str7, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/" + "'", str12, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
    }

    @Test
    public void test12266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12266");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.read = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.update = "";
        apiObject0.create = "digits";
        apiObject0.read = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});";
        apiObject0.create = "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});/";
        java.lang.String str16 = apiObject0.destroy;
        java.lang.String str17 = apiObject0.update;
        java.lang.String str18 = apiObject0.destroy;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ {\n      name : \"autoLoad\",\n      type : \"boolean\"\n    }, {\n      name : \"name\",\n      type : \"string\"\n    }, {\n      name : \"type\",\n      type : \"string\"\n    }, {\n      name : \"model\",\n      type : \"string\"\n    }, {\n      name : \"associationKey\",\n      type : \"string\"\n    }, {\n      name : \"foreignKey\",\n      type : \"string\"\n    }, {\n      name : \"primaryKey\",\n      type : \"string\"\n    }, {\n      name : \"instanceName\",\n      type : \"string\"\n    } ]\n  }\n});";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test12267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12267");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});";
        apiObject0.destroy = "belongsTo";
        apiObject0.destroy = "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str10 = apiObject0.read;
        apiObject0.read = "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str13 = apiObject0.destroy;
        apiObject0.update = "//";
        java.lang.String str16 = apiObject0.update;
        apiObject0.read = "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});";
        apiObject0.destroy = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str13, "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "//" + "'", str16, "//");
    }

    @Test
    public void test12268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12268");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});/", (java.lang.Integer) 52, (java.lang.Integer) 1);
    }

    @Test
    public void test12269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12269");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("Ext.define(\"ch.rasc.extclassgenerator.validation.PresenceValidation\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ {\n      name : \"type\",\n      type : \"string\"\n    }, {\n      name : \"field\",\n      type : \"string\"\n    } ]\n  }\n});", "Ext.define(\"null\",\r\n{\n  extend : \"\",\n  fields : [ ],\n  hasMany : [ \"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\", \"json\", \"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\", \"\" ]\n});");
        modelFieldBean2.setAllowNull((java.lang.Boolean) false);
    }

    @Test
    public void test12270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12270");
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
        java.lang.String str17 = apiObject0.read;
        apiObject0.update = "Ext.define(\"null\",\r\n{\n  extend : \"\",\n  idgen : \"Ext.define(\\\"java.util.ArrayList\\\",\\r\\n{\\n  extend : \\\"Ext.data.Model\\\",\\n  fields : [ ]\\n});\",\n  fields : [ ],\n  proxy : {\n    type : \"direct\",\n    reader : {\n      root : \"Ext.define(\\\"null\\\",{extend:\\\"Ext.data.Model\\\",idProperty:\\\"hi!\\\",fields:[],proxy:{type:\\\"direct\\\",idParam:\\\"hi!\\\"}});\",\n      messageProperty : \"hi!\"\n    },\n    writer : {\n      writeAllFields : false\n    }\n  }\n});";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test12271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12271");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getChild();
        java.lang.String str2 = referenceBean0.getRole();
        referenceBean0.setParent("hasOne");
        java.lang.String str5 = referenceBean0.getInverse();
        java.lang.String str6 = referenceBean0.getType();
        referenceBean0.setRole("hasOne");
        java.lang.String str9 = referenceBean0.getType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test12272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12272");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getChild();
        java.lang.String str2 = referenceBean0.getChild();
        referenceBean0.setAssociation("creditCardNumber");
        referenceBean0.setType("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        referenceBean0.setInverse("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});");
        referenceBean0.setAssociation("json");
        referenceBean0.setChild("");
        java.lang.String str13 = referenceBean0.getInverse();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});" + "'", str13, "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});");
    }

    @Test
    public void test12273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12273");
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
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});";
        java.lang.String str20 = apiObject0.update;
        apiObject0.destroy = "Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"associated\",\n    type : \"boolean\"\n  }, {\n    name : \"changes\",\n    type : \"boolean\"\n  }, {\n    name : \"critical\",\n    type : \"boolean\"\n  }, {\n    name : \"persist\",\n    type : \"boolean\"\n  } ]\n});";
        apiObject0.update = "";
        java.lang.String str25 = apiObject0.update;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "json" + "'", str10, "json");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/" + "'", str11, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});" + "'", str20, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test12274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12274");
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
        ch.rasc.extclassgenerator.validation.ExclusionValidation exclusionValidation20 = new ch.rasc.extclassgenerator.validation.ExclusionValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        java.lang.String str21 = exclusionValidation20.getList();
        modelBean0.addValidation((ch.rasc.extclassgenerator.validation.AbstractValidation) exclusionValidation20);
        modelBean0.setRootProperty("/Ext.define(\"null\",\r\n{\n  extend : \"Ext.data.Model\",\n  idgen : \"Ext.define(\\\"null\\\",{extend:\\\"Ext.data.Model\\\",config:{fields:[],proxy:{type:\\\"direct\\\",directFn:hi!,writer:{type:\\\"Ext.define(\\\\\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\\\\\",{extend:\\\\\\\"Ext.data.Model\\\\\\\",config:{fields:[]}});\\\"}}}});\",\n  fields : [ ]\n});/");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});" + "'", str21, "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
    }

    @Test
    public void test12275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12275");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.read;
        java.lang.String str4 = apiObject0.create;
        java.lang.String str5 = apiObject0.read;
        java.lang.String str6 = apiObject0.destroy;
        apiObject0.create = "/inclusion/";
        java.lang.String str9 = apiObject0.destroy;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test12276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12276");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        ch.rasc.extclassgenerator.validation.GenericValidation genericValidation3 = new ch.rasc.extclassgenerator.validation.GenericValidation("ch.rasc.extclassgenerator.validation.RangeValidation", "Ext.define(\"ch.rasc.extclassgenerator.association.BelongsToAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ {\n      name : \"setterName\",\n      type : \"string\"\n    }, {\n      name : \"getterName\",\n      type : \"string\"\n    }, {\n      name : \"type\",\n      type : \"string\"\n    }, {\n      name : \"model\",\n      type : \"string\"\n    }, {\n      name : \"associationKey\",\n      type : \"string\"\n    }, {\n      name : \"foreignKey\",\n      type : \"string\"\n    }, {\n      name : \"primaryKey\",\n      type : \"string\"\n    }, {\n      name : \"instanceName\",\n      type : \"string\"\n    } ]\n  }\n});", strMap2);
    }

    @Test
    public void test12277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12277");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.read = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str8 = apiObject0.update;
        java.lang.String str9 = apiObject0.destroy;
        apiObject0.create = "json";
        apiObject0.update = "";
        java.lang.String str14 = apiObject0.destroy;
        apiObject0.update = "/\\/exclusion\\//";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str8, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test12278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12278");
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
        java.lang.String str16 = referenceBean0.getAssociation();
        java.lang.String str17 = referenceBean0.getAssociation();
        java.lang.String str18 = referenceBean0.getRole();
        referenceBean0.setChild("format");
        boolean boolean21 = referenceBean0.hasAnyProperties();
        java.lang.String str22 = referenceBean0.getChild();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hasOne" + "'", str16, "hasOne");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hasOne" + "'", str17, "hasOne");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "format" + "'", str22, "format");
    }

    @Test
    public void test12279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12279");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("exclusion");
        java.lang.String str2 = hasManyAssociation1.getType();
        hasManyAssociation1.setName("hasMany");
        hasManyAssociation1.setAssociationKey("/Ext.define(\"java.util.Collections$UnmodifiableSet\",{extend:\"Ext.data.Model\",config:{fields:[]}});/");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hasMany" + "'", str2, "hasMany");
    }

    @Test
    public void test12280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12280");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getRole();
        referenceBean0.setChild("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        referenceBean0.setChild("Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
        referenceBean0.setAssociation("Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});");
        boolean boolean9 = referenceBean0.typeOnly();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test12281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12281");
        ch.rasc.extclassgenerator.validation.InclusionValidation inclusionValidation2 = new ch.rasc.extclassgenerator.validation.InclusionValidation("/hasMany/", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str3 = inclusionValidation2.getList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
    }

    @Test
    public void test12282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12282");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]}});");
    }

    @Test
    public void test12283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12283");
        ch.rasc.extclassgenerator.validation.NotBlankValidation notBlankValidation1 = new ch.rasc.extclassgenerator.validation.NotBlankValidation("Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ {\n      name : \"associated\",\n      type : \"boolean\"\n    }, {\n      name : \"changes\",\n      type : \"boolean\"\n    }, {\n      name : \"critical\",\n      type : \"boolean\"\n    }, {\n      name : \"persist\",\n      type : \"boolean\"\n    } ]\n  }\n});");
    }

    @Test
    public void test12284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12284");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        modelFieldBean2.setDateFormat("hi!");
        java.lang.Boolean boolean8 = modelFieldBean2.getUseNull();
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        modelFieldBean2.setCalculate("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        modelFieldBean2.setAllowBlank((java.lang.Boolean) false);
        modelFieldBean2.setMapping("Ext.define(\"null\",\r\n{\n  extend : \"\",\n  fields : [ ],\n  hasMany : [ \"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\", \"json\", \"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\", \"\" ]\n});");
        modelFieldBean2.setConvert("/\\/exclusion\\//");
        modelFieldBean2.setUnique((java.lang.Boolean) false);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean8);
    }

    @Test
    public void test12285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12285");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean4 = allDataOptionsBean0.getPersist();
        java.lang.Boolean boolean5 = allDataOptionsBean0.getPersist();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) true);
        allDataOptionsBean0.setCritical((java.lang.Boolean) true);
        java.lang.Boolean boolean10 = allDataOptionsBean0.getChanges();
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean10);
    }

    @Test
    public void test12286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12286");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        java.lang.String str6 = modelFieldBean2.getMapping();
        modelFieldBean2.setCritical((java.lang.Boolean) true);
        java.lang.String str9 = modelFieldBean2.getName();
        java.lang.Object obj10 = modelFieldBean2.getReference();
        modelFieldBean2.setAllowNull((java.lang.Boolean) true);
        java.util.List<ch.rasc.extclassgenerator.validation.AbstractValidation> abstractValidationList13 = modelFieldBean2.getValidators();
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(abstractValidationList13);
    }

    @Test
    public void test12287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12287");
        ch.rasc.extclassgenerator.OutputConfig outputConfig0 = new ch.rasc.extclassgenerator.OutputConfig();
        boolean boolean1 = outputConfig0.isSurroundApiWithQuotes();
        boolean boolean2 = outputConfig0.isSurroundApiWithQuotes();
        boolean boolean3 = outputConfig0.isDebug();
        boolean boolean4 = outputConfig0.isDebug();
        ch.rasc.extclassgenerator.OutputFormat outputFormat5 = outputConfig0.getOutputFormat();
        ch.rasc.extclassgenerator.IncludeValidation includeValidation6 = outputConfig0.getIncludeValidation();
        ch.rasc.extclassgenerator.IncludeValidation includeValidation7 = outputConfig0.getIncludeValidation();
        ch.rasc.extclassgenerator.IncludeValidation includeValidation8 = outputConfig0.getIncludeValidation();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(outputFormat5);
        org.junit.Assert.assertNull(includeValidation6);
        org.junit.Assert.assertNull(includeValidation7);
        org.junit.Assert.assertNull(includeValidation8);
    }

    @Test
    public void test12288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12288");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getRole();
        referenceBean0.setChild("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        referenceBean0.setRole("json");
        boolean boolean7 = referenceBean0.typeOnly();
        referenceBean0.setRole("Ext.data.Model");
        referenceBean0.setRole("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});");
        java.lang.String str12 = referenceBean0.getChild();
        referenceBean0.setChild("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        referenceBean0.setType("Ext.define(\"ch.rasc.extclassgenerator.association.HasOneAssociation\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"setterName\",type:\"string\"},{name:\"getterName\",type:\"string\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]}});");
        java.lang.String str17 = referenceBean0.getInverse();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});" + "'", str12, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test12289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12289");
        ch.rasc.extclassgenerator.validation.DigitsValidation digitsValidation3 = new ch.rasc.extclassgenerator.validation.DigitsValidation("Ext.define(\"ch.rasc.extclassgenerator.validation.CreditCardNumberValidation\",{extend:\"Ext.data.Model\",fields:[{name:\"type\",type:\"string\"},{name:\"field\",type:\"string\"}]});", (int) (byte) 1, (int) (byte) 100);
        int int4 = digitsValidation3.getFraction();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test12290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12290");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("hi!");
        hasManyAssociation1.setAssociationKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        hasManyAssociation1.setForeignKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        hasManyAssociation1.setInstanceName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str8 = hasManyAssociation1.getName();
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test12291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12291");
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
        java.util.Set<java.lang.String> strSet17 = modelAnnotationProcessor0.getSupportedOptions();
        javax.lang.model.SourceVersion sourceVersion18 = modelAnnotationProcessor0.getSupportedSourceVersion();
        java.util.Set<java.lang.String> strSet19 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertTrue("'" + sourceVersion2 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion2.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertTrue("'" + sourceVersion3 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion3.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(wildcardIterable9);
        org.junit.Assert.assertNotNull(wildcardIterable14);
        org.junit.Assert.assertTrue("'" + sourceVersion15 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion15.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertTrue("'" + sourceVersion18 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion18.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(strSet19);
    }

    @Test
    public void test12292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12292");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean4 = allDataOptionsBean0.getPersist();
        boolean boolean5 = allDataOptionsBean0.hasAnyProperties();
        boolean boolean6 = allDataOptionsBean0.hasAnyProperties();
        allDataOptionsBean0.setChanges((java.lang.Boolean) true);
        java.lang.Boolean boolean9 = allDataOptionsBean0.getPersist();
        java.lang.Boolean boolean10 = allDataOptionsBean0.getPersist();
        java.lang.Boolean boolean11 = allDataOptionsBean0.getPersist();
        java.lang.Boolean boolean12 = allDataOptionsBean0.getCritical();
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(boolean12);
    }

    @Test
    public void test12293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12293");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getChild();
        java.lang.String str2 = referenceBean0.getRole();
        referenceBean0.setParent("hasOne");
        java.lang.String str5 = referenceBean0.getInverse();
        referenceBean0.setChild("Ext.data.Model");
        boolean boolean8 = referenceBean0.hasAnyProperties();
        java.lang.String str9 = referenceBean0.getChild();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Ext.data.Model" + "'", str9, "Ext.data.Model");
    }

    @Test
    public void test12294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12294");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getRole();
        referenceBean0.setChild("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        referenceBean0.setAssociation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        java.lang.String str7 = referenceBean0.getAssociation();
        java.lang.String str8 = referenceBean0.getParent();
        boolean boolean9 = referenceBean0.hasAnyProperties();
        referenceBean0.setChild("");
        referenceBean0.setParent("/Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});" + "'", str7, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test12295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12295");
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation3 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal4 = rangeValidation3.getMax();
        java.math.BigDecimal bigDecimal5 = rangeValidation3.getMax();
        java.math.BigDecimal bigDecimal6 = rangeValidation3.getMax();
        java.math.BigDecimal bigDecimal7 = rangeValidation3.getMin();
        java.lang.String str8 = rangeValidation3.getType();
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "range" + "'", str8, "range");
    }

    @Test
    public void test12296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12296");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        hasOneAssociation1.setInstanceName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        hasOneAssociation1.setName("creditCardNumber");
        java.lang.String str6 = hasOneAssociation1.getName();
        java.lang.String str7 = hasOneAssociation1.getName();
        hasOneAssociation1.setSetterName("digits");
        hasOneAssociation1.setName("Ext.define(\"ch.rasc.extclassgenerator.association.BelongsToAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"setterName\",\n    type : \"string\"\n  }, {\n    name : \"getterName\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        hasOneAssociation1.setSetterName("Ext.define(\"null\",\r\n{\n  extend : \"\",\n  idgen : \"Ext.define(\\\"java.util.ArrayList\\\",\\r\\n{\\n  extend : \\\"Ext.data.Model\\\",\\n  fields : [ ]\\n});\",\n  fields : [ ],\n  proxy : {\n    type : \"direct\",\n    reader : {\n      root : \"Ext.define(\\\"null\\\",{extend:\\\"Ext.data.Model\\\",idProperty:\\\"hi!\\\",fields:[],proxy:{type:\\\"direct\\\",idParam:\\\"hi!\\\"}});\",\n      messageProperty : \"hi!\"\n    },\n    writer : {\n      writeAllFields : false\n    }\n  }\n});");
        java.lang.String str14 = hasOneAssociation1.getGetterName();
        java.lang.String str15 = hasOneAssociation1.getSetterName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "creditCardNumber" + "'", str6, "creditCardNumber");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "creditCardNumber" + "'", str7, "creditCardNumber");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Ext.define(\"null\",\r\n{\n  extend : \"\",\n  idgen : \"Ext.define(\\\"java.util.ArrayList\\\",\\r\\n{\\n  extend : \\\"Ext.data.Model\\\",\\n  fields : [ ]\\n});\",\n  fields : [ ],\n  proxy : {\n    type : \"direct\",\n    reader : {\n      root : \"Ext.define(\\\"null\\\",{extend:\\\"Ext.data.Model\\\",idProperty:\\\"hi!\\\",fields:[],proxy:{type:\\\"direct\\\",idParam:\\\"hi!\\\"}});\",\n      messageProperty : \"hi!\"\n    },\n    writer : {\n      writeAllFields : false\n    }\n  }\n});" + "'", str15, "Ext.define(\"null\",\r\n{\n  extend : \"\",\n  idgen : \"Ext.define(\\\"java.util.ArrayList\\\",\\r\\n{\\n  extend : \\\"Ext.data.Model\\\",\\n  fields : [ ]\\n});\",\n  fields : [ ],\n  proxy : {\n    type : \"direct\",\n    reader : {\n      root : \"Ext.define(\\\"null\\\",{extend:\\\"Ext.data.Model\\\",idProperty:\\\"hi!\\\",fields:[],proxy:{type:\\\"direct\\\",idParam:\\\"hi!\\\"}});\",\n      messageProperty : \"hi!\"\n    },\n    writer : {\n      writeAllFields : false\n    }\n  }\n});");
    }

    @Test
    public void test12297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12297");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        ch.rasc.extclassgenerator.validation.GenericValidation genericValidation3 = new ch.rasc.extclassgenerator.validation.GenericValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", "/Ext.define(\"ch.rasc.extclassgenerator.validation.CreditCardNumberValidation\",{extend:\"Ext.data.Model\",fields:[{name:\"type\",type:\"string\"},{name:\"field\",type:\"string\"}]});/", strMap2);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = genericValidation3.getOptions();
        org.junit.Assert.assertNull(strMap4);
    }

    @Test
    public void test12298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12298");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        java.lang.String str2 = hasOneAssociation1.getName();
        hasOneAssociation1.setInstanceName("");
        java.lang.String str5 = hasOneAssociation1.getInstanceName();
        hasOneAssociation1.setSetterName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str8 = hasOneAssociation1.getAssociationKey();
        java.lang.String str9 = hasOneAssociation1.getName();
        hasOneAssociation1.setForeignKey("hasMany");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test12299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12299");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("/\\/Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});\\//", "Ext.define(\"null\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ],\n    proxy : {\n      type : \"direct\",\n      reader : {\n        successProperty : \"json\"\n      }\n    }\n  }\n});");
    }

    @Test
    public void test12300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12300");
        ch.rasc.extclassgenerator.validation.InclusionValidation inclusionValidation2 = new ch.rasc.extclassgenerator.validation.InclusionValidation("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]}});", "Ext.define(\"null\",\r\n{\n  extend : \"\",\n  idgen : \"Ext.define(\\\"java.util.ArrayList\\\",\\r\\n{\\n  extend : \\\"Ext.data.Model\\\",\\n  fields : [ ]\\n});\",\n  fields : [ ],\n  proxy : {\n    type : \"direct\",\n    reader : {\n      root : \"Ext.define(\\\"null\\\",{extend:\\\"Ext.data.Model\\\",idProperty:\\\"hi!\\\",fields:[],proxy:{type:\\\"direct\\\",idParam:\\\"hi!\\\"}});\",\n      messageProperty : \"hi!\"\n    },\n    writer : {\n      writeAllFields : false\n    }\n  }\n});");
    }

    @Test
    public void test12301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12301");
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
        java.lang.String str45 = modelFieldBean2.getConvert();
        java.lang.Boolean boolean46 = modelFieldBean2.getPersist();
        modelFieldBean2.setMapping("json");
        ch.rasc.extclassgenerator.ModelBean modelBean49 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean49.setDisablePagingParameters(false);
        modelBean49.setIdProperty("");
        boolean boolean54 = modelBean49.isDisablePagingParameters();
        modelBean49.setExtend("");
        ch.rasc.extclassgenerator.PartialDataOptionsBean partialDataOptionsBean57 = modelBean49.getPartialDataOptions();
        modelBean49.setMessageProperty("hi!");
        ch.rasc.extclassgenerator.OutputFormat outputFormat60 = ch.rasc.extclassgenerator.OutputFormat.EXTJS5;
        java.lang.String str62 = ch.rasc.extclassgenerator.ModelGenerator.generateJavascript(modelBean49, outputFormat60, false);
        java.util.List<ch.rasc.extclassgenerator.validation.AbstractValidation> abstractValidationList63 = modelBean49.getValidations();
        modelFieldBean2.setValidators(abstractValidationList63);
        java.lang.Boolean boolean65 = modelFieldBean2.getCritical();
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
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertNull(boolean46);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(partialDataOptionsBean57);
        org.junit.Assert.assertTrue("'" + outputFormat60 + "' != '" + ch.rasc.extclassgenerator.OutputFormat.EXTJS5 + "'", outputFormat60.equals(ch.rasc.extclassgenerator.OutputFormat.EXTJS5));
// flaky:         org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str62, "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNotNull(abstractValidationList63);
        org.junit.Assert.assertNull(boolean65);
    }

    @Test
    public void test12302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12302");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.data.Model");
        modelFieldBean2.setAllowNull((java.lang.Boolean) false);
        java.lang.String str5 = modelFieldBean2.getConvert();
        java.lang.Boolean boolean6 = modelFieldBean2.getUseNull();
        modelFieldBean2.setMapping("json");
        java.lang.String str9 = modelFieldBean2.getMapping();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + false + "'", boolean6, false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "json" + "'", str9, "json");
    }

    @Test
    public void test12303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12303");
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
        modelFieldBean2.setPersist((java.lang.Boolean) true);
        ch.rasc.extclassgenerator.ReferenceBean referenceBean26 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str27 = referenceBean26.getChild();
        java.lang.String str28 = referenceBean26.getChild();
        referenceBean26.setAssociation("creditCardNumber");
        referenceBean26.setType("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        java.lang.String str33 = referenceBean26.getType();
        boolean boolean34 = referenceBean26.typeOnly();
        referenceBean26.setType("/hasMany/");
        java.lang.String str37 = referenceBean26.getParent();
        modelFieldBean2.setReference((java.lang.Object) str37);
        org.junit.Assert.assertNotNull(abstractValidationArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});" + "'", str33, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test12304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12304");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});", (java.lang.Integer) 100, (java.lang.Integer) (-1));
    }

    @Test
    public void test12305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12305");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray8 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList6);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray9 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("digits", (java.util.List<java.lang.String>) strList6);
        java.util.List<java.lang.String> strList10 = inclusionValidationArray9.getList();
        java.util.List<java.lang.String> strList11 = inclusionValidationArray9.getList();
        java.util.List<java.lang.String> strList12 = inclusionValidationArray9.getList();
        java.util.List<java.lang.String> strList13 = inclusionValidationArray9.getList();
        java.util.List<java.lang.String> strList14 = inclusionValidationArray9.getList();
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray15 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("Ext.define(\"ch.rasc.extclassgenerator.ApiObject\",{extend:\"Ext.data.Model\",fields:[{name:\"read\",type:\"string\"},{name:\"create\",type:\"string\"},{name:\"update\",type:\"string\"},{name:\"destroy\",type:\"string\"}]});", strList14);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test12306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12306");
        ch.rasc.extclassgenerator.ModelType modelType1 = null;
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("creditCardNumber", modelType1);
        modelFieldBean2.setUnique((java.lang.Boolean) false);
        modelFieldBean2.setUnique((java.lang.Boolean) true);
    }

    @Test
    public void test12307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12307");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("Ext.define(\"ch.rasc.extclassgenerator.association.BelongsToAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ {\n      name : \"setterName\",\n      type : \"string\"\n    }, {\n      name : \"getterName\",\n      type : \"string\"\n    }, {\n      name : \"type\",\n      type : \"string\"\n    }, {\n      name : \"model\",\n      type : \"string\"\n    }, {\n      name : \"associationKey\",\n      type : \"string\"\n    }, {\n      name : \"foreignKey\",\n      type : \"string\"\n    }, {\n      name : \"primaryKey\",\n      type : \"string\"\n    }, {\n      name : \"instanceName\",\n      type : \"string\"\n    } ]\n  }\n});");
        java.lang.String str2 = hasOneAssociation1.getName();
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test12308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12308");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("inclusion");
        belongsToAssociation1.setAssociationKey("Ext.define(\"ch.rasc.extclassgenerator.validation.PresenceValidation\",{extend:\"Ext.data.Model\",fields:[{name:\"type\",type:\"string\"},{name:\"field\",type:\"string\"}]});");
    }

    @Test
    public void test12309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12309");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Object obj5 = modelFieldBean2.getReference();
        ch.rasc.extclassgenerator.ModelType modelType6 = modelFieldBean2.getModelType();
        java.lang.String str7 = modelFieldBean2.getMapping();
        java.lang.String str8 = modelFieldBean2.getConvert();
        modelFieldBean2.setCalculate("/Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});/");
        java.lang.String str11 = modelFieldBean2.getName();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(modelType6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test12310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12310");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        belongsToAssociation1.setForeignKey("hasOne");
        belongsToAssociation1.setSetterName("/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/");
        java.lang.String str6 = belongsToAssociation1.getSetterName();
        belongsToAssociation1.setAssociationKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        java.lang.String str9 = belongsToAssociation1.getAssociationKey();
        belongsToAssociation1.setGetterName("Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[],proxy:{type:\"direct\",directFn:hi!}});");
        java.lang.String str12 = belongsToAssociation1.getAssociationKey();
        java.lang.String str13 = belongsToAssociation1.getSetterName();
        belongsToAssociation1.setSetterName("Ext.define(\"null\",{extend:\"\",fields:[]});");
        belongsToAssociation1.setInstanceName("Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]}});");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/" + "'", str6, "/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});" + "'", str9, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});" + "'", str12, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/" + "'", str13, "/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/");
    }

    @Test
    public void test12311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12311");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        modelBean0.setIdProperty("");
        boolean boolean5 = modelBean0.isDisablePagingParameters();
        modelBean0.setReader("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        java.lang.String[] strArray8 = modelBean0.getHasMany();
        java.util.List<ch.rasc.extclassgenerator.association.AbstractAssociation> abstractAssociationList9 = modelBean0.getAssociations();
        modelBean0.setSuccessProperty("Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
        modelBean0.setIdProperty("/hi!/");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(abstractAssociationList9);
    }

    @Test
    public void test12312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12312");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});");
        java.lang.String str3 = modelFieldBean2.getConvert();
        java.lang.String str4 = modelFieldBean2.getMapping();
        modelFieldBean2.setCritical((java.lang.Boolean) false);
        modelFieldBean2.setCalculate("exclusion");
        java.lang.String str9 = modelFieldBean2.getConvert();
        modelFieldBean2.setMapping("hasMany");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test12313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12313");
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
        modelFieldBean2.setMapping("ch.rasc.extclassgenerator.PartialDataOptionsBean");
        java.util.List<ch.rasc.extclassgenerator.validation.AbstractValidation> abstractValidationList41 = modelFieldBean2.getValidators();
        java.lang.String str42 = modelFieldBean2.getName();
        modelFieldBean2.setCritical((java.lang.Boolean) true);
        java.lang.Object obj45 = null;
        modelFieldBean2.setDefaultValue(obj45);
        java.lang.Object obj47 = modelFieldBean2.getDefaultValue();
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
        org.junit.Assert.assertNull(abstractValidationList41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNull(obj47);
    }

    @Test
    public void test12314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12314");
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
        java.lang.String str16 = modelBean0.getUpdateMethod();
        modelBean0.setTotalProperty("Ext.define(\"ch.rasc.extclassgenerator.association.HasOneAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ {\n      name : \"setterName\",\n      type : \"string\"\n    }, {\n      name : \"getterName\",\n      type : \"string\"\n    }, {\n      name : \"name\",\n      type : \"string\"\n    }, {\n      name : \"type\",\n      type : \"string\"\n    }, {\n      name : \"model\",\n      type : \"string\"\n    }, {\n      name : \"associationKey\",\n      type : \"string\"\n    }, {\n      name : \"foreignKey\",\n      type : \"string\"\n    }, {\n      name : \"primaryKey\",\n      type : \"string\"\n    }, {\n      name : \"instanceName\",\n      type : \"string\"\n    } ]\n  }\n});");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(partialDataOptionsBean8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test12315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12315");
        ch.rasc.extclassgenerator.validation.DigitsValidation digitsValidation3 = new ch.rasc.extclassgenerator.validation.DigitsValidation("Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"debug\",\n    type : \"boolean\"\n  }, {\n    name : \"useSingleQuotes\",\n    type : \"boolean\"\n  }, {\n    name : \"surroundApiWithQuotes\",\n    type : \"boolean\"\n  } ]\n});", 97, (int) (short) 1);
        int int4 = digitsValidation3.getFraction();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test12316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12316");
        ch.rasc.extclassgenerator.validation.DigitsValidation digitsValidation3 = new ch.rasc.extclassgenerator.validation.DigitsValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});/", (int) ' ', 32);
        int int4 = digitsValidation3.getFraction();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test12317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12317");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        java.lang.String str3 = modelBean0.getIdProperty();
        java.lang.String[] strArray4 = modelBean0.getHasMany();
        modelBean0.setExtend("/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/");
        modelBean0.setAutodetectTypes(false);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation13 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal14 = rangeValidation13.getMax();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation18 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});", (java.lang.Long) 0L, (java.lang.Long) 32L);
        java.math.BigDecimal bigDecimal19 = rangeValidation18.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation20 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[],proxy:{type:\"direct\",directFn:hi!}});", bigDecimal14, bigDecimal19);
        java.math.BigDecimal bigDecimal21 = rangeValidation20.getMax();
        modelBean0.addValidation((ch.rasc.extclassgenerator.validation.AbstractValidation) rangeValidation20);
        modelBean0.setDestroyMethod("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        boolean boolean25 = modelBean0.isDisablePagingParameters();
        java.util.List<ch.rasc.extclassgenerator.validation.AbstractValidation> abstractValidationList26 = modelBean0.getValidations();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(abstractValidationList26);
    }

    @Test
    public void test12318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12318");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        boolean boolean4 = allDataOptionsBean0.hasAnyProperties();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) true);
        java.lang.Boolean boolean7 = allDataOptionsBean0.getAssociated();
        allDataOptionsBean0.setPersist((java.lang.Boolean) false);
        boolean boolean10 = allDataOptionsBean0.hasAnyProperties();
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test12319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12319");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getRole();
        referenceBean0.setChild("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        referenceBean0.setAssociation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        java.lang.String str7 = referenceBean0.getChild();
        referenceBean0.setType("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        referenceBean0.setInverse("/ch.rasc.extclassgenerator.PartialDataOptionsBean/");
        referenceBean0.setRole("/Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",{extend:\"Ext.data.Model\",fields:[{name:\"debug\",type:\"boolean\"},{name:\"useSingleQuotes\",type:\"boolean\"},{name:\"surroundApiWithQuotes\",type:\"boolean\"}]});/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});" + "'", str7, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
    }

    @Test
    public void test12320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12320");
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
        javax.lang.model.element.Element element18 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror19 = null;
        javax.lang.model.element.ExecutableElement executableElement20 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable22 = modelAnnotationProcessor0.getCompletions(element18, annotationMirror19, executableElement20, "/ch.rasc.extclassgenerator.PartialDataOptionsBean/");
        javax.lang.model.SourceVersion sourceVersion23 = modelAnnotationProcessor0.getSupportedSourceVersion();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + sourceVersion3 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion3.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(wildcardIterable9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(wildcardIterable16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(wildcardIterable22);
        org.junit.Assert.assertTrue("'" + sourceVersion23 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion23.equals(javax.lang.model.SourceVersion.RELEASE_6));
    }

    @Test
    public void test12321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12321");
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
        modelFieldBean2.setDateFormat("length");
        java.lang.String str23 = modelFieldBean2.getType();
        java.lang.Object obj24 = modelFieldBean2.getDefaultValue();
        org.junit.Assert.assertNotNull(abstractValidationArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str23, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test12322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12322");
        ch.rasc.extclassgenerator.validation.DigitsValidation digitsValidation3 = new ch.rasc.extclassgenerator.validation.DigitsValidation("Ext.define(\"ch.rasc.extclassgenerator.AllDataOptionsBean\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ {\n      name : \"associated\",\n      type : \"boolean\"\n    }, {\n      name : \"changes\",\n      type : \"boolean\"\n    }, {\n      name : \"critical\",\n      type : \"boolean\"\n    }, {\n      name : \"persist\",\n      type : \"boolean\"\n    } ]\n  }\n});", (int) (byte) 1, 0);
    }

    @Test
    public void test12323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12323");
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
        java.lang.Class<?> wildcardClass35 = modelFieldBean2.getClass();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test12324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12324");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("");
        java.lang.String str2 = belongsToAssociation1.getInstanceName();
        belongsToAssociation1.setSetterName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str5 = belongsToAssociation1.getGetterName();
        belongsToAssociation1.setSetterName("Ext.define(\"null\",{extend:\"\",fields:[]});");
        java.lang.String str8 = belongsToAssociation1.getModel();
        belongsToAssociation1.setPrimaryKey("format");
        belongsToAssociation1.setInstanceName("json");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test12325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12325");
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
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.validation.InclusionValidationArray\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"field\",\n    type : \"string\"\n  } ]\n});";
        java.lang.String str22 = apiObject0.destroy;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "json" + "'", str10, "json");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/" + "'", str12, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "json" + "'", str19, "json");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});" + "'", str22, "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
    }

    @Test
    public void test12326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12326");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("Ext.define(\"ch.rasc.extclassgenerator.validation.PresenceValidation\",{extend:\"Ext.data.Model\",fields:[{name:\"type\",type:\"string\"},{name:\"field\",type:\"string\"}]});", "length");
        ch.rasc.extclassgenerator.OutputConfig outputConfig3 = null;
        boolean boolean4 = modelFieldBean2.hasOnlyName(outputConfig3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test12327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12327");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        java.util.List<ch.rasc.extclassgenerator.association.AbstractAssociation> abstractAssociationList3 = modelBean0.getAssociations();
        modelBean0.setCreateMethod("/\\/\\\\/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});\\\\/\\//");
        org.junit.Assert.assertNotNull(abstractAssociationList3);
    }

    @Test
    public void test12328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12328");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        hasOneAssociation1.setGetterName("belongsTo");
        java.lang.String str4 = hasOneAssociation1.getSetterName();
        hasOneAssociation1.setSetterName("/Ext.define(\"ch.rasc.extclassgenerator.validation.PresenceValidation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"field\",\n    type : \"string\"\n  } ]\n});/");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test12329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12329");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("Ext.define(\"ch.rasc.extclassgenerator.LineEnding\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
        hasManyAssociation1.setAssociationKey("Ext.define(\"ch.rasc.extclassgenerator.association.HasOneAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"setterName\",type:\"string\"},{name:\"getterName\",type:\"string\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});");
    }

    @Test
    public void test12330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12330");
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation3 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.validation.InclusionValidationArray\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ {\n      name : \"type\",\n      type : \"string\"\n    }, {\n      name : \"field\",\n      type : \"string\"\n    } ]\n  }\n});", (java.lang.Long) 52L, (java.lang.Long) 1L);
    }

    @Test
    public void test12331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12331");
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
        referenceBean0.setInverse("Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
        boolean boolean15 = referenceBean0.hasAnyProperties();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test12332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12332");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        java.lang.Boolean boolean1 = allDataOptionsBean0.getPersist();
        java.lang.Boolean boolean2 = allDataOptionsBean0.getPersist();
        boolean boolean3 = allDataOptionsBean0.hasAnyProperties();
        java.lang.Boolean boolean4 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean5 = allDataOptionsBean0.getPersist();
        boolean boolean6 = allDataOptionsBean0.hasAnyProperties();
        java.lang.Boolean boolean7 = allDataOptionsBean0.getPersist();
        allDataOptionsBean0.setChanges((java.lang.Boolean) true);
        allDataOptionsBean0.setPersist((java.lang.Boolean) false);
        java.lang.Boolean boolean12 = allDataOptionsBean0.getAssociated();
        boolean boolean13 = allDataOptionsBean0.hasAnyProperties();
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test12333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12333");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        java.lang.String str10 = referenceBean0.getParent();
        boolean boolean11 = referenceBean0.typeOnly();
        java.lang.String str12 = referenceBean0.getRole();
        referenceBean0.setInverse("Ext.define(\"ch.rasc.extclassgenerator.validation.RangeValidation\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"min\",type:\"float\"},{name:\"max\",type:\"float\"},{name:\"type\",type:\"string\"},{name:\"field\",type:\"string\"}]}});");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test12334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12334");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getRole();
        referenceBean0.setChild("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        referenceBean0.setRole("json");
        java.lang.String str7 = referenceBean0.getAssociation();
        java.lang.String str8 = referenceBean0.getParent();
        java.lang.String str9 = referenceBean0.getRole();
        java.lang.String str10 = referenceBean0.getChild();
        boolean boolean11 = referenceBean0.typeOnly();
        referenceBean0.setInverse("/hi!/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "json" + "'", str9, "json");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});" + "'", str10, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test12335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12335");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        java.lang.String str10 = referenceBean0.getParent();
        boolean boolean11 = referenceBean0.typeOnly();
        java.lang.String str12 = referenceBean0.getChild();
        referenceBean0.setInverse("Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str15 = referenceBean0.getInverse();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str15, "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});");
    }

    @Test
    public void test12336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12336");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.data.Model");
        java.lang.String str3 = modelFieldBean2.getCalculate();
        modelFieldBean2.setConvert("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        modelFieldBean2.setPersist((java.lang.Boolean) true);
        java.lang.Boolean boolean8 = modelFieldBean2.getAllowBlank();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(boolean8);
    }

    @Test
    public void test12337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12337");
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
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean28 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean28.setConvert("hi!");
        modelFieldBean28.setMapping("hi!");
        modelFieldBean28.setUseNull((java.lang.Boolean) true);
        modelFieldBean28.setAllowBlank((java.lang.Boolean) false);
        java.lang.String[] strArray41 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList42 = new java.util.ArrayList<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList42, strArray41);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray44 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList42);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray45 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("", (java.util.List<java.lang.String>) strList42);
        java.util.List<java.lang.String> strList46 = exclusionValidationArray45.getList();
        modelFieldBean28.setDepends(strList46);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray48 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});", strList46);
        java.util.List<java.lang.String> strList49 = exclusionValidationArray48.getList();
        java.util.List<java.lang.String> strList50 = exclusionValidationArray48.getList();
        modelFieldBean2.setDepends(strList50);
        java.lang.Boolean boolean52 = modelFieldBean2.getAllowBlank();
        ch.rasc.extclassgenerator.OutputConfig outputConfig53 = new ch.rasc.extclassgenerator.OutputConfig();
        boolean boolean54 = outputConfig53.isSurroundApiWithQuotes();
        boolean boolean55 = outputConfig53.isDebug();
        boolean boolean56 = outputConfig53.isSurroundApiWithQuotes();
        outputConfig53.setSurroundApiWithQuotes(false);
        boolean boolean59 = outputConfig53.isDebug();
        boolean boolean60 = outputConfig53.isUseSingleQuotes();
        boolean boolean61 = outputConfig53.isSurroundApiWithQuotes();
        boolean boolean62 = modelFieldBean2.hasOnlyName(outputConfig53);
        org.junit.Assert.assertNotNull(abstractValidationArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(strList19);
        org.junit.Assert.assertNull(modelType20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(boolean24);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertNotNull(strList50);
        org.junit.Assert.assertNull(boolean52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test12338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12338");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]}});");
        belongsToAssociation1.setAssociationKey("Ext.define(\"ch.rasc.extclassgenerator.validation.CreditCardNumberValidation\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"type\",type:\"string\"},{name:\"field\",type:\"string\"}],proxy:{type:\"direct\",reader:{type:\"Ext.define(\\\"null\\\",\\r\\n{\\n  extend : \\\"Ext.data.Model\\\",\\n  config : {\\n    fields : [ ],\\n    proxy : {\\n      type : \\\"direct\\\",\\n      reader : {\\n        type : \\\"Ext.define(\\\\\\\"java.util.ArrayList\\\\\\\",\\\\r\\\\n{\\\\n  extend : \\\\\\\"Ext.data.Model\\\\\\\",\\\\n  fields : [ ]\\\\n});\\\"\\n      }\\n    }\\n  }\\n});\",successProperty:\"/hasOne/\"}}}});");
    }

    @Test
    public void test12339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12339");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("/\\/hasMany\\//", "Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});");
        modelFieldBean2.setAllowNull((java.lang.Boolean) true);
    }

    @Test
    public void test12340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12340");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        modelBean0.setIdProperty("");
        boolean boolean5 = modelBean0.isDisablePagingParameters();
        modelBean0.setReader("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        java.lang.String[] strArray8 = modelBean0.getHasMany();
        java.lang.String str9 = modelBean0.getUpdateMethod();
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean10 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        java.lang.Boolean boolean11 = allDataOptionsBean10.getPersist();
        java.lang.Boolean boolean12 = allDataOptionsBean10.getPersist();
        java.lang.Boolean boolean13 = allDataOptionsBean10.getAssociated();
        allDataOptionsBean10.setPersist((java.lang.Boolean) true);
        java.lang.Boolean boolean16 = allDataOptionsBean10.getCritical();
        modelBean0.setAllDataOptions(allDataOptionsBean10);
        modelBean0.setAutodetectTypes(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertNull(boolean16);
    }

    @Test
    public void test12341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12341");
        ch.rasc.extclassgenerator.validation.FormatValidation formatValidation2 = new ch.rasc.extclassgenerator.validation.FormatValidation("Ext.define(\"ch.rasc.extclassgenerator.association.HasOneAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"setterName\",type:\"string\"},{name:\"getterName\",type:\"string\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});", "/\\/range\\//");
    }

    @Test
    public void test12342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12342");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});";
        apiObject0.update = "json";
        apiObject0.destroy = "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/";
        java.lang.String str10 = apiObject0.update;
        java.lang.String str11 = apiObject0.update;
        apiObject0.destroy = "";
        java.lang.String str14 = apiObject0.create;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "json" + "'", str10, "json");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "json" + "'", str11, "json");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});" + "'", str14, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
    }

    @Test
    public void test12343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12343");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        java.lang.String str6 = referenceBean0.getAssociation();
        referenceBean0.setInverse("");
        referenceBean0.setType("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        referenceBean0.setParent("Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str13 = referenceBean0.getRole();
        referenceBean0.setParent("ch.rasc.extclassgenerator.ModelFieldBean");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test12344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12344");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("");
        hasOneAssociation1.setPrimaryKey("Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});");
        java.lang.String str4 = hasOneAssociation1.getType();
        hasOneAssociation1.setSetterName("hasMany");
        hasOneAssociation1.setPrimaryKey("Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hasOne" + "'", str4, "hasOne");
    }

    @Test
    public void test12345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12345");
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
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable13 = modelAnnotationProcessor0.getCompletions(element9, annotationMirror10, executableElement11, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        javax.lang.model.element.Element element14 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror15 = null;
        javax.lang.model.element.ExecutableElement executableElement16 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable18 = modelAnnotationProcessor0.getCompletions(element14, annotationMirror15, executableElement16, "hasMany");
        javax.lang.model.element.Element element19 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror20 = null;
        javax.lang.model.element.ExecutableElement executableElement21 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable23 = modelAnnotationProcessor0.getCompletions(element19, annotationMirror20, executableElement21, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
        java.util.Set<java.lang.String> strSet24 = modelAnnotationProcessor0.getSupportedOptions();
        java.util.Set<java.lang.String> strSet25 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(wildcardIterable7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(wildcardIterable13);
        org.junit.Assert.assertNotNull(wildcardIterable18);
        org.junit.Assert.assertNotNull(wildcardIterable23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(strSet25);
    }

    @Test
    public void test12346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12346");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getChild();
        java.lang.String str2 = referenceBean0.getInverse();
        java.lang.String str3 = referenceBean0.getType();
        java.lang.String str4 = referenceBean0.getRole();
        java.lang.String str5 = referenceBean0.getType();
        referenceBean0.setRole("/Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});/");
        referenceBean0.setInverse("presence");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test12347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12347");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("Ext.define(\"ch.rasc.extclassgenerator.validation.RangeValidation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"min\",\n    type : \"float\"\n  }, {\n    name : \"max\",\n    type : \"float\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"field\",\n    type : \"string\"\n  } ]\n});", (java.lang.Integer) 97, (java.lang.Integer) 97);
    }

    @Test
    public void test12348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12348");
        ch.rasc.extclassgenerator.validation.FormatValidation formatValidation2 = new ch.rasc.extclassgenerator.validation.FormatValidation("/email/", "Ext.define(\"java.util.ArrayList\",{extend:\"Ext.data.Model\",fields:[]});");
    }

    @Test
    public void test12349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12349");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        modelBean0.setIdProperty("");
        boolean boolean5 = modelBean0.isDisablePagingParameters();
        modelBean0.setReader("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        modelBean0.setWriter("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        boolean boolean10 = modelBean0.isAutodetectTypes();
        java.lang.String str11 = modelBean0.getReader();
        java.lang.String str12 = modelBean0.getUpdateMethod();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});" + "'", str11, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test12350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12350");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        modelFieldBean2.setDateFormat("hi!");
        java.lang.Boolean boolean8 = modelFieldBean2.getUseNull();
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        modelFieldBean2.setCalculate("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        modelFieldBean2.setAllowBlank((java.lang.Boolean) false);
        modelFieldBean2.setMapping("Ext.define(\"null\",\r\n{\n  extend : \"\",\n  fields : [ ],\n  hasMany : [ \"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\", \"json\", \"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\", \"\" ]\n});");
        modelFieldBean2.setPersist((java.lang.Boolean) false);
        java.lang.String str19 = modelFieldBean2.getCalculate();
        modelFieldBean2.setCritical((java.lang.Boolean) true);
        modelFieldBean2.setName("/hasOne/");
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});" + "'", str19, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
    }

    @Test
    public void test12351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12351");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        modelFieldBean2.setMapping("hi!");
        java.lang.Object obj7 = modelFieldBean2.getDefaultValue();
        java.lang.Object obj8 = modelFieldBean2.getReference();
        modelFieldBean2.setUseNull((java.lang.Boolean) false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test12352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12352");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("/Ext.define(\"java.util.Collections$UnmodifiableSet\",{extend:\"Ext.data.Model\",config:{fields:[]}});/", (java.lang.Integer) 32, (java.lang.Integer) 10);
    }

    @Test
    public void test12353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12353");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("ch.rasc.extclassgenerator.validation.CreditCardNumberValidation", "Ext.define(\"ch.rasc.extclassgenerator.validation.PastValidation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"field\",\n    type : \"string\"\n  } ]\n});");
        modelFieldBean2.setDateFormat("Ext.define(\"ch.rasc.extclassgenerator.validation.PresenceValidation\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ {\n      name : \"type\",\n      type : \"string\"\n    }, {\n      name : \"field\",\n      type : \"string\"\n    } ]\n  }\n});");
    }

    @Test
    public void test12354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12354");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        ch.rasc.extclassgenerator.validation.GenericValidation genericValidation3 = new ch.rasc.extclassgenerator.validation.GenericValidation("Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[],proxy:{type:\"direct\",directFn:hi!}});", "Ext.data.Model", strMap2);
    }

    @Test
    public void test12355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12355");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        boolean boolean1 = allDataOptionsBean0.hasAnyProperties();
        boolean boolean2 = allDataOptionsBean0.hasAnyProperties();
        java.lang.Boolean boolean3 = allDataOptionsBean0.getChanges();
        java.lang.Boolean boolean4 = allDataOptionsBean0.getPersist();
        java.lang.Boolean boolean5 = allDataOptionsBean0.getChanges();
        java.lang.Boolean boolean6 = allDataOptionsBean0.getCritical();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean6);
    }

    @Test
    public void test12356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12356");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        ch.rasc.extclassgenerator.validation.GenericValidation genericValidation3 = new ch.rasc.extclassgenerator.validation.GenericValidation("", "Ext.define(\"ch.rasc.extclassgenerator.association.HasOneAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"setterName\",type:\"string\"},{name:\"getterName\",type:\"string\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});", strMap2);
    }

    @Test
    public void test12357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12357");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        java.lang.String str3 = modelBean0.getIdProperty();
        java.lang.String str4 = modelBean0.getReadMethod();
        java.lang.String str5 = modelBean0.getIdentifier();
        java.lang.String str6 = modelBean0.getRootProperty();
        java.lang.String str7 = modelBean0.getMessageProperty();
        modelBean0.setTotalProperty("Ext.define(\"ch.rasc.extclassgenerator.validation.RangeValidation\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"min\",type:\"float\"},{name:\"max\",type:\"float\"},{name:\"type\",type:\"string\"},{name:\"field\",type:\"string\"}]}});");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test12358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12358");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});/", "Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
    }

    @Test
    public void test12359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12359");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        modelFieldBean2.setCalculate("Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});");
        modelFieldBean2.setAllowBlank((java.lang.Boolean) false);
        modelFieldBean2.setMapping("/\\/hasMany\\//");
        modelFieldBean2.setName("Ext.define(\"null\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ],\n    proxy : {\n      type : \"direct\",\n      reader : {\n        successProperty : \"json\"\n      }\n    }\n  }\n});");
    }

    @Test
    public void test12360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12360");
        ch.rasc.extclassgenerator.validation.PastValidation pastValidation1 = new ch.rasc.extclassgenerator.validation.PastValidation("ch.rasc.extclassgenerator.validation.CreditCardNumberValidation");
    }

    @Test
    public void test12361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12361");
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation4 = new ch.rasc.extclassgenerator.validation.RangeValidation("ch.rasc.extclassgenerator.OutputConfig", (java.lang.Long) 10L, (java.lang.Long) 97L);
        java.math.BigDecimal bigDecimal5 = rangeValidation4.getMin();
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
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation47 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});", bigDecimal19, bigDecimal39);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation51 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.data.Model", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal52 = rangeValidation51.getMax();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation53 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});", bigDecimal19, bigDecimal52);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation57 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal58 = rangeValidation57.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation59 = new ch.rasc.extclassgenerator.validation.RangeValidation("digits", bigDecimal52, bigDecimal58);
        java.math.BigDecimal bigDecimal60 = rangeValidation59.getMax();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation61 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.association.HasOneAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ {\n      name : \"setterName\",\n      type : \"string\"\n    }, {\n      name : \"getterName\",\n      type : \"string\"\n    }, {\n      name : \"name\",\n      type : \"string\"\n    }, {\n      name : \"type\",\n      type : \"string\"\n    }, {\n      name : \"model\",\n      type : \"string\"\n    }, {\n      name : \"associationKey\",\n      type : \"string\"\n    }, {\n      name : \"foreignKey\",\n      type : \"string\"\n    }, {\n      name : \"primaryKey\",\n      type : \"string\"\n    }, {\n      name : \"instanceName\",\n      type : \"string\"\n    } ]\n  }\n});", bigDecimal5, bigDecimal60);
        java.math.BigDecimal bigDecimal62 = rangeValidation61.getMin();
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(bigDecimal44);
        org.junit.Assert.assertNotNull(bigDecimal52);
        org.junit.Assert.assertNotNull(bigDecimal58);
        org.junit.Assert.assertNotNull(bigDecimal60);
        org.junit.Assert.assertNotNull(bigDecimal62);
    }

    @Test
    public void test12362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12362");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        modelBean0.setIdProperty("");
        java.lang.String str5 = modelBean0.getIdentifier();
        java.util.Map<java.lang.String, ch.rasc.extclassgenerator.ModelFieldBean> strMap6 = modelBean0.getFields();
        boolean boolean7 = modelBean0.isDisablePagingParameters();
        java.lang.String str8 = modelBean0.getIdProperty();
        ch.rasc.extclassgenerator.PartialDataOptionsBean partialDataOptionsBean9 = null;
        modelBean0.setPartialDataOptions(partialDataOptionsBean9);
        boolean boolean11 = modelBean0.isPaging();
        java.lang.Boolean boolean12 = modelBean0.getWriteAllFields();
        modelBean0.setMessageProperty("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});");
        modelBean0.setPaging(false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(boolean12);
    }

    @Test
    public void test12363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12363");
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
        modelFieldBean2.setPersist((java.lang.Boolean) true);
        modelFieldBean2.setPersist((java.lang.Boolean) true);
        ch.rasc.extclassgenerator.ModelType modelType23 = null;
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean24 = new ch.rasc.extclassgenerator.ModelFieldBean("", modelType23);
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean27 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean27.setConvert("hi!");
        java.lang.Boolean boolean30 = modelFieldBean27.getPersist();
        java.lang.String str31 = modelFieldBean27.getMapping();
        java.lang.String str32 = modelFieldBean27.getName();
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray39 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList37);
        modelFieldBean27.setDepends((java.util.List<java.lang.String>) strList37);
        modelFieldBean27.setCalculate("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean46 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean46.setConvert("hi!");
        java.lang.Boolean boolean49 = modelFieldBean46.getPersist();
        java.lang.String str50 = modelFieldBean46.getMapping();
        java.lang.String str51 = modelFieldBean46.getName();
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList56 = new java.util.ArrayList<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList56, strArray55);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray58 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList56);
        modelFieldBean46.setDepends((java.util.List<java.lang.String>) strList56);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray60 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});", (java.util.List<java.lang.String>) strList56);
        modelFieldBean27.setDepends((java.util.List<java.lang.String>) strList56);
        modelFieldBean24.setDepends((java.util.List<java.lang.String>) strList56);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray63 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("length", (java.util.List<java.lang.String>) strList56);
        java.util.List<java.lang.String> strList64 = exclusionValidationArray63.getList();
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray65 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("Ext.define(\"null\",{extend:\"\",config:{fields:[]}});", strList64);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray66 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("Ext.define(\"ch.rasc.extclassgenerator.validation.PresenceValidation\",{extend:\"Ext.data.Model\",fields:[{name:\"type\",type:\"string\"},{name:\"field\",type:\"string\"}]});", strList64);
        modelFieldBean2.setDepends(strList64);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertNull(boolean30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(boolean49);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(strList64);
    }

    @Test
    public void test12364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12364");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        java.lang.String str6 = modelFieldBean2.getMapping();
        modelFieldBean2.setConvert("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation10 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        hasOneAssociation10.setInstanceName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setDefaultValue((java.lang.Object) hasOneAssociation10);
        java.lang.String str14 = modelFieldBean2.getMapping();
        modelFieldBean2.setUnique((java.lang.Boolean) true);
        java.lang.String str17 = modelFieldBean2.getType();
        java.lang.String str18 = modelFieldBean2.getMapping();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str17, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test12365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12365");
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
        ch.rasc.extclassgenerator.PartialDataOptionsBean partialDataOptionsBean18 = modelBean0.getPartialDataOptions();
        modelBean0.setClientIdPropertyAddToWriter(true);
        modelBean0.setReadMethod("/exclusion/");
        java.lang.String str23 = modelBean0.getIdProperty();
        modelBean0.setWriteAllFields((java.lang.Boolean) false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(partialDataOptionsBean8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(partialDataOptionsBean18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test12366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12366");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getChild();
        referenceBean0.setType("/Ext.define(\"null\",\r\n{\n  extend : \"Ext.data.Model\",\n  idgen : \"Ext.define(\\\"null\\\",{extend:\\\"Ext.data.Model\\\",config:{fields:[],proxy:{type:\\\"direct\\\",directFn:hi!,writer:{type:\\\"Ext.define(\\\\\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\\\\\",{extend:\\\\\\\"Ext.data.Model\\\\\\\",config:{fields:[]}});\\\"}}}});\",\n  fields : [ ]\n});/");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test12367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12367");
        ch.rasc.extclassgenerator.ModelAnnotationProcessor modelAnnotationProcessor0 = new ch.rasc.extclassgenerator.ModelAnnotationProcessor();
        java.util.Set<java.lang.String> strSet1 = modelAnnotationProcessor0.getSupportedOptions();
        java.util.Set<java.lang.String> strSet2 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        java.util.Set<java.lang.String> strSet3 = modelAnnotationProcessor0.getSupportedOptions();
        java.util.Set<java.lang.String> strSet4 = modelAnnotationProcessor0.getSupportedOptions();
        java.util.Set<java.lang.String> strSet5 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        java.util.Set<java.lang.String> strSet6 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        javax.lang.model.element.Element element7 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror8 = null;
        javax.lang.model.element.ExecutableElement executableElement9 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable11 = modelAnnotationProcessor0.getCompletions(element7, annotationMirror8, executableElement9, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});/");
        javax.lang.model.element.Element element12 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror13 = null;
        javax.lang.model.element.ExecutableElement executableElement14 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable16 = modelAnnotationProcessor0.getCompletions(element12, annotationMirror13, executableElement14, "");
        java.util.Set<java.lang.String> strSet17 = modelAnnotationProcessor0.getSupportedOptions();
        java.util.Set<java.lang.String> strSet18 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(wildcardIterable11);
        org.junit.Assert.assertNotNull(wildcardIterable16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strSet18);
    }

    @Test
    public void test12368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12368");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.destroy = "";
        apiObject0.destroy = "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/";
        java.lang.String str5 = apiObject0.read;
        java.lang.String str6 = apiObject0.destroy;
        java.lang.String str7 = apiObject0.destroy;
        java.lang.String str8 = apiObject0.read;
        apiObject0.read = "Ext.define(\"ch.rasc.extclassgenerator.LineEnding\",{extend:\"Ext.data.Model\",config:{fields:[]}});";
        apiObject0.destroy = "/\\/exclusion\\//";
        apiObject0.destroy = "belongsTo";
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/" + "'", str6, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/" + "'", str7, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test12369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12369");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        java.lang.String str6 = modelFieldBean2.getMapping();
        java.lang.Object obj7 = modelFieldBean2.getReference();
        modelFieldBean2.setCalculate("exclusion");
        java.lang.Boolean boolean10 = modelFieldBean2.getUnique();
        modelFieldBean2.setMapping("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setMapping("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
        modelFieldBean2.setUnique((java.lang.Boolean) true);
        modelFieldBean2.setDateFormat("");
        java.lang.String str19 = modelFieldBean2.getConvert();
        java.lang.String str20 = modelFieldBean2.getDateFormat();
        java.lang.String str21 = modelFieldBean2.getType();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str21, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
    }

    @Test
    public void test12370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12370");
        ch.rasc.extclassgenerator.validation.CreditCardNumberValidation creditCardNumberValidation1 = new ch.rasc.extclassgenerator.validation.CreditCardNumberValidation("Ext.define(\"ch.rasc.extclassgenerator.ApiObject\",{extend:\"Ext.data.Model\",fields:[{name:\"read\",type:\"string\"},{name:\"create\",type:\"string\"},{name:\"update\",type:\"string\"},{name:\"destroy\",type:\"string\"}]});");
        java.lang.String str2 = creditCardNumberValidation1.getType();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "creditCardNumber" + "'", str2, "creditCardNumber");
    }

    @Test
    public void test12371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12371");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});";
        apiObject0.destroy = "belongsTo";
        apiObject0.read = "";
        java.lang.String str10 = apiObject0.destroy;
        java.lang.String str11 = apiObject0.destroy;
        java.lang.String str12 = apiObject0.destroy;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "belongsTo" + "'", str10, "belongsTo");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "belongsTo" + "'", str11, "belongsTo");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "belongsTo" + "'", str12, "belongsTo");
    }

    @Test
    public void test12372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12372");
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
        apiObject0.read = "Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});";
        apiObject0.destroy = "hasMany";
        apiObject0.update = "";
        java.lang.String str20 = apiObject0.create;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str8, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str9, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str11, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ch.rasc.extclassgenerator.ModelAnnotationProcessor" + "'", str20, "ch.rasc.extclassgenerator.ModelAnnotationProcessor");
    }

    @Test
    public void test12373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12373");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        boolean boolean4 = allDataOptionsBean0.hasAnyProperties();
        allDataOptionsBean0.setCritical((java.lang.Boolean) true);
        boolean boolean7 = allDataOptionsBean0.hasAnyProperties();
        allDataOptionsBean0.setChanges((java.lang.Boolean) false);
        java.lang.Boolean boolean10 = allDataOptionsBean0.getCritical();
        java.lang.Boolean boolean11 = allDataOptionsBean0.getChanges();
        java.lang.Boolean boolean12 = allDataOptionsBean0.getCritical();
        allDataOptionsBean0.setChanges((java.lang.Boolean) false);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + false + "'", boolean11, false);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
    }

    @Test
    public void test12374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12374");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getRole();
        referenceBean0.setChild("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        referenceBean0.setAssociation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        referenceBean0.setRole("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        referenceBean0.setChild("hi!");
        referenceBean0.setRole("json");
        java.lang.String str13 = referenceBean0.getAssociation();
        java.lang.String str14 = referenceBean0.getType();
        referenceBean0.setChild("/hi!/");
        boolean boolean17 = referenceBean0.hasAnyProperties();
        referenceBean0.setInverse("/inclusion/");
        referenceBean0.setRole("/Ext.define(\"ch.rasc.extclassgenerator.validation.RangeValidation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"min\",\n    type : \"float\"\n  }, {\n    name : \"max\",\n    type : \"float\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"field\",\n    type : \"string\"\n  } ]\n});/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});" + "'", str13, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test12375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12375");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        java.lang.String str6 = referenceBean0.getInverse();
        boolean boolean7 = referenceBean0.typeOnly();
        referenceBean0.setInverse("/Ext.define(\"null\",{extend:\"Ext.data.Model\",idProperty:\"hi!\",fields:[],proxy:{type:\"direct\",idParam:\"hi!\"}});/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test12376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12376");
        ch.rasc.extclassgenerator.validation.FutureValidation futureValidation1 = new ch.rasc.extclassgenerator.validation.FutureValidation("java.util.ArrayList");
    }

    @Test
    public void test12377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12377");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        modelFieldBean2.setDateFormat("hi!");
        java.lang.Boolean boolean8 = modelFieldBean2.getUseNull();
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        modelFieldBean2.setCalculate("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        modelFieldBean2.setAllowBlank((java.lang.Boolean) false);
        modelFieldBean2.setMapping("Ext.define(\"null\",\r\n{\n  extend : \"\",\n  fields : [ ],\n  hasMany : [ \"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\", \"json\", \"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\", \"\" ]\n});");
        modelFieldBean2.setPersist((java.lang.Boolean) false);
        java.util.List<java.lang.String> strList19 = modelFieldBean2.getDepends();
        java.lang.Boolean boolean20 = modelFieldBean2.getCritical();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertNull(strList19);
        org.junit.Assert.assertNull(boolean20);
    }

    @Test
    public void test12378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12378");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("hi!");
        hasManyAssociation1.setAssociationKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str4 = hasManyAssociation1.getPrimaryKey();
        java.lang.String str5 = hasManyAssociation1.getAssociationKey();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str5, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
    }

    @Test
    public void test12379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12379");
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
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray24 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList22);
        java.util.List<java.lang.String> strList25 = inclusionValidationArray24.getList();
        java.lang.String str26 = inclusionValidationArray24.getField();
        java.util.List<java.lang.String> strList27 = inclusionValidationArray24.getList();
        modelFieldBean2.setDepends(strList27);
        java.lang.Object obj29 = modelFieldBean2.getDefaultValue();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(modelType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str10, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test12380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12380");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("Ext.define(\"ch.rasc.extclassgenerator.AllDataOptionsBean\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ {\n      name : \"associated\",\n      type : \"boolean\"\n    }, {\n      name : \"changes\",\n      type : \"boolean\"\n    }, {\n      name : \"critical\",\n      type : \"boolean\"\n    }, {\n      name : \"persist\",\n      type : \"boolean\"\n    } ]\n  }\n});");
    }

    @Test
    public void test12381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12381");
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
        java.lang.Boolean boolean14 = modelFieldBean2.getUseNull();
        ch.rasc.extclassgenerator.ModelType modelType15 = modelFieldBean2.getModelType();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertNull(modelType15);
    }

    @Test
    public void test12382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12382");
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
        modelFieldBean2.setPersist((java.lang.Boolean) false);
        modelFieldBean2.setPersist((java.lang.Boolean) false);
        java.lang.String str40 = modelFieldBean2.getName();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});" + "'", str40, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
    }

    @Test
    public void test12383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12383");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        modelBean0.setAutodetectTypes(true);
        java.lang.String str5 = modelBean0.getCreateMethod();
        java.lang.String str6 = modelBean0.getTotalProperty();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test12384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12384");
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
        modelFieldBean2.setAllowNull((java.lang.Boolean) true);
        modelFieldBean2.setUseNull((java.lang.Boolean) false);
        java.lang.String str19 = modelFieldBean2.getMapping();
        ch.rasc.extclassgenerator.ApiObject apiObject20 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject20.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str23 = apiObject20.update;
        apiObject20.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});";
        apiObject20.destroy = "belongsTo";
        java.lang.String str28 = apiObject20.read;
        modelFieldBean2.setReference((java.lang.Object) apiObject20);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str10, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str23, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test12385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12385");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getChild();
        java.lang.String str2 = referenceBean0.getChild();
        boolean boolean3 = referenceBean0.hasAnyProperties();
        java.lang.String str4 = referenceBean0.getAssociation();
        boolean boolean5 = referenceBean0.hasAnyProperties();
        referenceBean0.setChild("/ch.rasc.extclassgenerator.ModelAnnotationProcessor/");
        java.lang.String str8 = referenceBean0.getInverse();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test12386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12386");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});");
        java.lang.String str3 = modelFieldBean2.getConvert();
        java.lang.Boolean boolean4 = modelFieldBean2.getPersist();
        java.lang.Boolean boolean5 = modelFieldBean2.getUnique();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNull(boolean5);
    }

    @Test
    public void test12387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12387");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        ch.rasc.extclassgenerator.validation.GenericValidation genericValidation3 = new ch.rasc.extclassgenerator.validation.GenericValidation("Ext.define(\"ch.rasc.extclassgenerator.AllDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});", "Ext.define(\"ch.rasc.extclassgenerator.ModelFieldBean\",{extend:\"Ext.data.Model\",fields:[{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"dateFormat\",type:\"string\"},{name:\"useNull\",type:\"boolean\"},{name:\"allowNull\",type:\"boolean\"},{name:\"mapping\",type:\"string\"},{name:\"persist\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"convert\",type:\"string\"},{name:\"calculate\",type:\"string\"},{name:\"allowBlank\",type:\"boolean\"},{name:\"unique\",type:\"boolean\"}]});", strMap2);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = genericValidation3.getOptions();
        org.junit.Assert.assertNull(strMap4);
    }

    @Test
    public void test12388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12388");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getChild();
        java.lang.String str3 = referenceBean0.getAssociation();
        java.lang.String str4 = referenceBean0.getType();
        java.lang.String str5 = referenceBean0.getInverse();
        referenceBean0.setInverse("/ch.rasc.extclassgenerator.PartialDataOptionsBean/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test12389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12389");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        modelBean0.setIdProperty("");
        boolean boolean5 = modelBean0.isDisablePagingParameters();
        modelBean0.setExtend("");
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation11 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});", (java.lang.Long) 100L, (java.lang.Long) 100L);
        java.math.BigDecimal bigDecimal12 = rangeValidation11.getMax();
        java.math.BigDecimal bigDecimal13 = rangeValidation11.getMax();
        java.math.BigDecimal bigDecimal14 = rangeValidation11.getMin();
        java.math.BigDecimal bigDecimal15 = rangeValidation11.getMin();
        java.math.BigDecimal bigDecimal16 = rangeValidation11.getMax();
        modelBean0.addValidation((ch.rasc.extclassgenerator.validation.AbstractValidation) rangeValidation11);
        modelBean0.setPaging(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal16);
    }

    @Test
    public void test12390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12390");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("hi!");
        java.lang.String str2 = hasManyAssociation1.getAssociationKey();
        hasManyAssociation1.setAssociationKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        hasManyAssociation1.setAssociationKey("");
        java.lang.Boolean boolean7 = hasManyAssociation1.getAutoLoad();
        java.lang.String str8 = hasManyAssociation1.getForeignKey();
        java.lang.String str9 = hasManyAssociation1.getInstanceName();
        hasManyAssociation1.setPrimaryKey("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});/");
        hasManyAssociation1.setAutoLoad((java.lang.Boolean) true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test12391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12391");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getParent();
        referenceBean0.setInverse("hi!");
        referenceBean0.setParent("exclusion");
        java.lang.String str7 = referenceBean0.getInverse();
        java.lang.String str8 = referenceBean0.getRole();
        referenceBean0.setType("/\\/\\\\/belongsTo\\\\/\\//");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test12392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12392");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});";
        java.lang.String str6 = apiObject0.destroy;
        apiObject0.read = "/hi!/";
        apiObject0.create = "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[],proxy:{type:\"direct\",directFn:hi!}});";
        apiObject0.update = "/Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});/";
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelFieldBean\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"dateFormat\",\n    type : \"string\"\n  }, {\n    name : \"useNull\",\n    type : \"boolean\"\n  }, {\n    name : \"allowNull\",\n    type : \"boolean\"\n  }, {\n    name : \"mapping\",\n    type : \"string\"\n  }, {\n    name : \"persist\",\n    type : \"boolean\"\n  }, {\n    name : \"critical\",\n    type : \"boolean\"\n  }, {\n    name : \"convert\",\n    type : \"string\"\n  }, {\n    name : \"calculate\",\n    type : \"string\"\n  }, {\n    name : \"allowBlank\",\n    type : \"boolean\"\n  }, {\n    name : \"unique\",\n    type : \"boolean\"\n  } ]\n});";
        apiObject0.destroy = "inclusion";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test12393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12393");
        ch.rasc.extclassgenerator.validation.InclusionValidation inclusionValidation2 = new ch.rasc.extclassgenerator.validation.InclusionValidation("Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ {\n      name : \"associated\",\n      type : \"boolean\"\n    }, {\n      name : \"changes\",\n      type : \"boolean\"\n    }, {\n      name : \"critical\",\n      type : \"boolean\"\n    }, {\n      name : \"persist\",\n      type : \"boolean\"\n    } ]\n  }\n});", "/\\/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});\\//");
        java.lang.String str3 = inclusionValidation2.getList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/\\/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});\\//" + "'", str3, "/\\/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});\\//");
    }

    @Test
    public void test12394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12394");
        ch.rasc.extclassgenerator.validation.FormatValidation formatValidation2 = new ch.rasc.extclassgenerator.validation.FormatValidation("Ext.define(\"ch.rasc.extclassgenerator.association.BelongsToAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"setterName\",type:\"string\"},{name:\"getterName\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});", "Ext.define(\"ch.rasc.extclassgenerator.validation.InclusionValidation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"list\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"field\",\n    type : \"string\"\n  } ]\n});");
        java.lang.String str3 = formatValidation2.getMatcher();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.validation.InclusionValidation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"list\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"field\",\n    type : \"string\"\n  } ]\n});/" + "'", str3, "/Ext.define(\"ch.rasc.extclassgenerator.validation.InclusionValidation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"list\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"field\",\n    type : \"string\"\n  } ]\n});/");
    }

    @Test
    public void test12395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12395");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getType();
        referenceBean0.setInverse("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        java.lang.String str4 = referenceBean0.getAssociation();
        java.lang.String str5 = referenceBean0.getAssociation();
        java.lang.String str6 = referenceBean0.getRole();
        java.lang.String str7 = referenceBean0.getParent();
        referenceBean0.setType("Ext.define(\"null\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ],\n  proxy : {\n    type : \"direct\",\n    reader : {\n      totalProperty : \"/Ext.define(\\\"ch.rasc.extclassgenerator.association.HasManyAssociation\\\",{extend:\\\"Ext.data.Model\\\",fields:[{name:\\\"autoLoad\\\",type:\\\"boolean\\\"},{name:\\\"name\\\",type:\\\"string\\\"},{name:\\\"type\\\",type:\\\"string\\\"},{name:\\\"model\\\",type:\\\"string\\\"},{name:\\\"associationKey\\\",type:\\\"string\\\"},{name:\\\"foreignKey\\\",type:\\\"string\\\"},{name:\\\"primaryKey\\\",type:\\\"string\\\"},{name:\\\"instanceName\\\",type:\\\"string\\\"}]});/\"\n    }\n  }\n});");
        java.lang.String str10 = referenceBean0.getRole();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test12396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12396");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getChild();
        java.lang.String str2 = referenceBean0.getRole();
        referenceBean0.setAssociation("");
        java.lang.String str5 = referenceBean0.getParent();
        referenceBean0.setParent("/\\/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});\\//");
        referenceBean0.setRole("inclusion");
        referenceBean0.setRole("");
        referenceBean0.setType("creditCardNumber");
        boolean boolean14 = referenceBean0.typeOnly();
        referenceBean0.setChild("ch.rasc.extclassgenerator.PartialDataOptionsBean");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test12397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12397");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getParent();
        referenceBean0.setInverse("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        java.lang.String str5 = referenceBean0.getType();
        java.lang.String str6 = referenceBean0.getChild();
        java.lang.String str7 = referenceBean0.getChild();
        java.lang.String str8 = referenceBean0.getInverse();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});" + "'", str8, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
    }

    @Test
    public void test12398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12398");
        ch.rasc.extclassgenerator.ModelType modelType1 = null;
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});", modelType1);
        modelFieldBean2.setDateFormat("Ext.define(\"ch.rasc.extclassgenerator.LineEnding\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
        java.lang.Boolean boolean5 = modelFieldBean2.getCritical();
        java.util.List<java.lang.String> strList6 = modelFieldBean2.getDepends();
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean9 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean9.setConvert("hi!");
        modelFieldBean9.setMapping("hi!");
        modelFieldBean9.setCritical((java.lang.Boolean) false);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray23 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList21);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray24 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("", (java.util.List<java.lang.String>) strList21);
        java.util.List<java.lang.String> strList25 = exclusionValidationArray24.getList();
        modelFieldBean9.setDepends(strList25);
        modelFieldBean2.setDepends(strList25);
        java.lang.Boolean boolean28 = modelFieldBean2.getUseNull();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(strList6);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNull(boolean28);
    }

    @Test
    public void test12399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12399");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});", "Ext.define(\"ch.rasc.extclassgenerator.ReferenceBean\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"type\",type:\"string\"},{name:\"association\",type:\"string\"},{name:\"child\",type:\"string\"},{name:\"parent\",type:\"string\"},{name:\"role\",type:\"string\"},{name:\"inverse\",type:\"string\"}]}});");
    }

    @Test
    public void test12400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12400");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getRole();
        referenceBean0.setChild("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        referenceBean0.setRole("json");
        java.lang.String str7 = referenceBean0.getAssociation();
        referenceBean0.setAssociation("belongsTo");
        referenceBean0.setAssociation("Ext.data.Model");
        boolean boolean12 = referenceBean0.hasAnyProperties();
        referenceBean0.setInverse("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
        java.lang.String str15 = referenceBean0.getParent();
        referenceBean0.setInverse("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});/");
        java.lang.String str18 = referenceBean0.getParent();
        referenceBean0.setRole("/\\/\\\\/belongsTo\\\\/\\//");
        referenceBean0.setAssociation("/Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test12401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12401");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});", "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        modelFieldBean2.setPersist((java.lang.Boolean) false);
        modelFieldBean2.setAllowBlank((java.lang.Boolean) true);
        java.lang.Boolean boolean7 = modelFieldBean2.getCritical();
        java.lang.Class<?> wildcardClass8 = modelFieldBean2.getClass();
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test12402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12402");
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
        java.lang.String str19 = modelFieldBean2.getName();
        java.lang.Boolean boolean20 = modelFieldBean2.getAllowBlank();
        java.lang.Boolean boolean21 = modelFieldBean2.getCritical();
        modelFieldBean2.setName("Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"associated\",\n    type : \"boolean\"\n  }, {\n    name : \"changes\",\n    type : \"boolean\"\n  }, {\n    name : \"critical\",\n    type : \"boolean\"\n  }, {\n    name : \"persist\",\n    type : \"boolean\"\n  } ]\n});");
        java.lang.Boolean boolean24 = modelFieldBean2.getPersist();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNull(abstractValidationList13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(boolean20);
        org.junit.Assert.assertNull(boolean21);
        org.junit.Assert.assertNull(boolean24);
    }

    @Test
    public void test12403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12403");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});";
        apiObject0.destroy = "belongsTo";
        java.lang.String str8 = apiObject0.create;
        apiObject0.destroy = "/digits/";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});" + "'", str8, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
    }

    @Test
    public void test12404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12404");
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
        referenceBean0.setAssociation("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ {\n      name : \"autoLoad\",\n      type : \"boolean\"\n    }, {\n      name : \"name\",\n      type : \"string\"\n    }, {\n      name : \"type\",\n      type : \"string\"\n    }, {\n      name : \"model\",\n      type : \"string\"\n    }, {\n      name : \"associationKey\",\n      type : \"string\"\n    }, {\n      name : \"foreignKey\",\n      type : \"string\"\n    }, {\n      name : \"primaryKey\",\n      type : \"string\"\n    }, {\n      name : \"instanceName\",\n      type : \"string\"\n    } ]\n  }\n});");
        java.lang.String str18 = referenceBean0.getInverse();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test12405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12405");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("digits");
        java.lang.String str2 = hasManyAssociation1.getName();
        hasManyAssociation1.setInstanceName("/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/");
        hasManyAssociation1.setAutoLoad((java.lang.Boolean) true);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test12406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12406");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getRole();
        referenceBean0.setChild("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        referenceBean0.setRole("json");
        boolean boolean7 = referenceBean0.typeOnly();
        referenceBean0.setRole("Ext.data.Model");
        referenceBean0.setType("Ext.define(\"null\",{extend:\"\",config:{fields:[]}});");
        java.lang.String str12 = referenceBean0.getRole();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Ext.data.Model" + "'", str12, "Ext.data.Model");
    }

    @Test
    public void test12407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12407");
        ch.rasc.extclassgenerator.validation.PastValidation pastValidation1 = new ch.rasc.extclassgenerator.validation.PastValidation("exclusion");
    }

    @Test
    public void test12408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12408");
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
        java.lang.String str16 = referenceBean0.getParent();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test12409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12409");
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation4 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", (java.lang.Long) 52L, (java.lang.Long) 10L);
        java.math.BigDecimal bigDecimal5 = rangeValidation4.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation11 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal12 = rangeValidation11.getMin();
        java.math.BigDecimal bigDecimal13 = rangeValidation11.getMin();
        java.math.BigDecimal bigDecimal14 = rangeValidation11.getMin();
        java.math.BigDecimal bigDecimal15 = rangeValidation11.getMax();
        java.math.BigDecimal bigDecimal16 = rangeValidation11.getMax();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation20 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal21 = rangeValidation20.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation22 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});/", bigDecimal16, bigDecimal21);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation26 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});", (java.lang.Long) 100L, (java.lang.Long) 100L);
        java.math.BigDecimal bigDecimal27 = rangeValidation26.getMax();
        java.math.BigDecimal bigDecimal28 = rangeValidation26.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation29 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal21, bigDecimal28);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation30 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ReferenceBean\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"type\",type:\"string\"},{name:\"association\",type:\"string\"},{name:\"child\",type:\"string\"},{name:\"parent\",type:\"string\"},{name:\"role\",type:\"string\"},{name:\"inverse\",type:\"string\"}]}});", bigDecimal5, bigDecimal28);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertNotNull(bigDecimal28);
    }

    @Test
    public void test12410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12410");
        ch.rasc.extclassgenerator.validation.ExclusionValidation exclusionValidation2 = new ch.rasc.extclassgenerator.validation.ExclusionValidation("/Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});/", "Ext.define(\"ch.rasc.extclassgenerator.validation.CreditCardNumberValidation\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"type\",type:\"string\"},{name:\"field\",type:\"string\"}],proxy:{type:\"direct\",reader:{type:\"Ext.define(\\\"null\\\",\\r\\n{\\n  extend : \\\"Ext.data.Model\\\",\\n  config : {\\n    fields : [ ],\\n    proxy : {\\n      type : \\\"direct\\\",\\n      reader : {\\n        type : \\\"Ext.define(\\\\\\\"java.util.ArrayList\\\\\\\",\\\\r\\\\n{\\\\n  extend : \\\\\\\"Ext.data.Model\\\\\\\",\\\\n  fields : [ ]\\\\n});\\\"\\n      }\\n    }\\n  }\\n});\",successProperty:\"/hasOne/\"}}}});");
    }

    @Test
    public void test12411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12411");
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
        java.util.Set<java.lang.String> strSet17 = modelAnnotationProcessor0.getSupportedOptions();
        javax.lang.model.SourceVersion sourceVersion18 = modelAnnotationProcessor0.getSupportedSourceVersion();
        javax.lang.model.SourceVersion sourceVersion19 = modelAnnotationProcessor0.getSupportedSourceVersion();
        java.util.Set<java.lang.String> strSet20 = modelAnnotationProcessor0.getSupportedOptions();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertTrue("'" + sourceVersion2 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion2.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertTrue("'" + sourceVersion3 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion3.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(wildcardIterable9);
        org.junit.Assert.assertNotNull(wildcardIterable14);
        org.junit.Assert.assertTrue("'" + sourceVersion15 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion15.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertTrue("'" + sourceVersion18 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion18.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertTrue("'" + sourceVersion19 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion19.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(strSet20);
    }

    @Test
    public void test12412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12412");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        java.lang.String str2 = hasOneAssociation1.getName();
        java.lang.String str3 = hasOneAssociation1.getGetterName();
        hasOneAssociation1.setPrimaryKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str6 = hasOneAssociation1.getName();
        hasOneAssociation1.setSetterName("json");
        java.lang.String str9 = hasOneAssociation1.getAssociationKey();
        java.lang.String str10 = hasOneAssociation1.getSetterName();
        java.lang.String str11 = hasOneAssociation1.getForeignKey();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "json" + "'", str10, "json");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test12413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12413");
        ch.rasc.extclassgenerator.validation.FormatValidation formatValidation2 = new ch.rasc.extclassgenerator.validation.FormatValidation("Ext.define(\"null\",{extend:\"\",config:{fields:[]}});", "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});/");
        java.lang.String str3 = formatValidation2.getMatcher();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/\\/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});\\//" + "'", str3, "/\\/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});\\//");
    }

    @Test
    public void test12414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12414");
        ch.rasc.extclassgenerator.validation.FormatValidation formatValidation2 = new ch.rasc.extclassgenerator.validation.FormatValidation("Ext.define(\"java.util.ArrayList\",{extend:\"Ext.data.Model\",fields:[]});", "/exclusion/");
        java.lang.String str3 = formatValidation2.getMatcher();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/\\/exclusion\\//" + "'", str3, "/\\/exclusion\\//");
    }

    @Test
    public void test12415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12415");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.destroy = "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});/";
        apiObject0.update = "Ext.data.Model";
    }

    @Test
    public void test12416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12416");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        modelFieldBean2.setMapping("hi!");
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        modelFieldBean2.setAllowBlank((java.lang.Boolean) false);
        modelFieldBean2.setConvert("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        java.lang.Object obj13 = modelFieldBean2.getDefaultValue();
        java.lang.Boolean boolean14 = modelFieldBean2.getPersist();
        java.lang.String str15 = modelFieldBean2.getMapping();
        java.lang.Boolean boolean16 = modelFieldBean2.getPersist();
        ch.rasc.extclassgenerator.ModelType modelType17 = modelFieldBean2.getModelType();
        java.lang.String str18 = modelFieldBean2.getCalculate();
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertNull(modelType17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test12417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12417");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("hi!");
        hasManyAssociation1.setForeignKey("");
        java.lang.Boolean boolean4 = hasManyAssociation1.getAutoLoad();
        java.lang.String str5 = hasManyAssociation1.getName();
        java.lang.String str6 = hasManyAssociation1.getForeignKey();
        hasManyAssociation1.setAutoLoad((java.lang.Boolean) true);
        hasManyAssociation1.setForeignKey("exclusion");
        hasManyAssociation1.setName("Ext.define(\"ch.rasc.extclassgenerator.ReferenceBean\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"type\",type:\"string\"},{name:\"association\",type:\"string\"},{name:\"child\",type:\"string\"},{name:\"parent\",type:\"string\"},{name:\"role\",type:\"string\"},{name:\"inverse\",type:\"string\"}]}});");
        hasManyAssociation1.setName("Ext.define(\"ch.rasc.extclassgenerator.validation.InclusionValidationArray\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ {\n      name : \"type\",\n      type : \"string\"\n    }, {\n      name : \"field\",\n      type : \"string\"\n    } ]\n  }\n});");
        java.lang.String str15 = hasManyAssociation1.getName();
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.validation.InclusionValidationArray\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ {\n      name : \"type\",\n      type : \"string\"\n    }, {\n      name : \"field\",\n      type : \"string\"\n    } ]\n  }\n});" + "'", str15, "Ext.define(\"ch.rasc.extclassgenerator.validation.InclusionValidationArray\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ {\n      name : \"type\",\n      type : \"string\"\n    }, {\n      name : \"field\",\n      type : \"string\"\n    } ]\n  }\n});");
    }

    @Test
    public void test12418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12418");
        ch.rasc.extclassgenerator.validation.InclusionValidation inclusionValidation2 = new ch.rasc.extclassgenerator.validation.InclusionValidation("Ext.define(\"ch.rasc.extclassgenerator.validation.CreditCardNumberValidation\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"type\",type:\"string\"},{name:\"field\",type:\"string\"}],proxy:{type:\"direct\",reader:{type:\"Ext.define(\\\"null\\\",\\r\\n{\\n  extend : \\\"Ext.data.Model\\\",\\n  config : {\\n    fields : [ ],\\n    proxy : {\\n      type : \\\"direct\\\",\\n      reader : {\\n        type : \\\"Ext.define(\\\\\\\"java.util.ArrayList\\\\\\\",\\\\r\\\\n{\\\\n  extend : \\\\\\\"Ext.data.Model\\\\\\\",\\\\n  fields : [ ]\\\\n});\\\"\\n      }\\n    }\\n  }\\n});\",successProperty:\"/hasOne/\"}}}});", "belongsTo");
    }

    @Test
    public void test12419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12419");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        modelFieldBean2.setDateFormat("hi!");
        java.lang.Boolean boolean8 = modelFieldBean2.getUseNull();
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        modelFieldBean2.setCalculate("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        java.lang.Boolean boolean13 = modelFieldBean2.getUseNull();
        modelFieldBean2.setCalculate("digits");
        modelFieldBean2.setPersist((java.lang.Boolean) true);
        java.lang.Object obj18 = modelFieldBean2.getDefaultValue();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + true + "'", boolean13, true);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test12420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12420");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        modelBean0.setIdProperty("");
        boolean boolean5 = modelBean0.isDisablePagingParameters();
        modelBean0.setReader("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        java.lang.String str8 = modelBean0.getTotalProperty();
        ch.rasc.extclassgenerator.PartialDataOptionsBean partialDataOptionsBean9 = modelBean0.getPartialDataOptions();
        modelBean0.setDestroyMethod("/Ext.define(\"null\",\r\n{\n  extend : \"\",\n  fields : [ ],\n  hasMany : [ \"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\", \"json\", \"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\", \"\" ]\n});/");
        modelBean0.setCreateMethod("/\\/belongsTo\\//");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(partialDataOptionsBean9);
    }

    @Test
    public void test12421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12421");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        java.lang.String str6 = referenceBean0.getParent();
        boolean boolean7 = referenceBean0.hasAnyProperties();
        java.lang.String str8 = referenceBean0.getType();
        java.lang.String str9 = referenceBean0.getRole();
        referenceBean0.setParent("hi!");
        referenceBean0.setType("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});/");
        java.lang.String str14 = referenceBean0.getAssociation();
        boolean boolean15 = referenceBean0.hasAnyProperties();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test12422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12422");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("/Ext.define(\"null\",\r\n{\n  extend : \"\",\n  fields : [ ],\n  hasMany : [ \"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\", \"json\", \"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\", \"\" ]\n});/", "Ext.define(\"ch.rasc.extclassgenerator.association.HasOneAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"setterName\",\n    type : \"string\"\n  }, {\n    name : \"getterName\",\n    type : \"string\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
    }

    @Test
    public void test12423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12423");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("belongsTo", (java.lang.Long) 1L, (java.lang.Long) 0L);
    }

    @Test
    public void test12424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12424");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.update = "exclusion";
        java.lang.String str8 = apiObject0.destroy;
        apiObject0.update = "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/";
        java.lang.String str11 = apiObject0.create;
        apiObject0.read = "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});";
        apiObject0.destroy = "Ext.define(\"ch.rasc.extclassgenerator.validation.InclusionValidationArray\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"field\",\n    type : \"string\"\n  } ]\n});";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str11, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
    }

    @Test
    public void test12425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12425");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("exclusion");
        java.lang.String str2 = hasManyAssociation1.getType();
        hasManyAssociation1.setName("ch.rasc.extclassgenerator.association.HasManyAssociation");
        java.lang.Boolean boolean5 = hasManyAssociation1.getAutoLoad();
        hasManyAssociation1.setName("Ext.define(\"ch.rasc.extclassgenerator.ReferenceBean\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"type\",type:\"string\"},{name:\"association\",type:\"string\"},{name:\"child\",type:\"string\"},{name:\"parent\",type:\"string\"},{name:\"role\",type:\"string\"},{name:\"inverse\",type:\"string\"}]}});");
        java.lang.String str8 = hasManyAssociation1.getName();
        java.lang.String str9 = hasManyAssociation1.getName();
        java.lang.Boolean boolean10 = hasManyAssociation1.getAutoLoad();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hasMany" + "'", str2, "hasMany");
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ReferenceBean\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"type\",type:\"string\"},{name:\"association\",type:\"string\"},{name:\"child\",type:\"string\"},{name:\"parent\",type:\"string\"},{name:\"role\",type:\"string\"},{name:\"inverse\",type:\"string\"}]}});" + "'", str8, "Ext.define(\"ch.rasc.extclassgenerator.ReferenceBean\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"type\",type:\"string\"},{name:\"association\",type:\"string\"},{name:\"child\",type:\"string\"},{name:\"parent\",type:\"string\"},{name:\"role\",type:\"string\"},{name:\"inverse\",type:\"string\"}]}});");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ReferenceBean\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"type\",type:\"string\"},{name:\"association\",type:\"string\"},{name:\"child\",type:\"string\"},{name:\"parent\",type:\"string\"},{name:\"role\",type:\"string\"},{name:\"inverse\",type:\"string\"}]}});" + "'", str9, "Ext.define(\"ch.rasc.extclassgenerator.ReferenceBean\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"type\",type:\"string\"},{name:\"association\",type:\"string\"},{name:\"child\",type:\"string\"},{name:\"parent\",type:\"string\"},{name:\"role\",type:\"string\"},{name:\"inverse\",type:\"string\"}]}});");
        org.junit.Assert.assertNull(boolean10);
    }

    @Test
    public void test12426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12426");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("hi!");
        java.lang.String str2 = hasManyAssociation1.getAssociationKey();
        hasManyAssociation1.setAssociationKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        hasManyAssociation1.setAssociationKey("");
        hasManyAssociation1.setForeignKey("Ext.define(\"Ext.define(\"null\",{extend:\"Ext.data.Model\",idProperty:\"hi!\",fields:[],proxy:{type:\"direct\",idParam:\"hi!\"}});\",{extend:\"/\\\\/Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\\\\//\",uses:[\"hi!\"],fields:[],hasMany:[\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\",\"json\",\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\",\"\"],associations:[{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],proxy:{type:\"direct\",directFn:hi!}});");
        java.lang.String str9 = hasManyAssociation1.getModel();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test12427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12427");
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
        java.lang.String str16 = referenceBean0.getAssociation();
        java.lang.String str17 = referenceBean0.getType();
        referenceBean0.setInverse("/\\/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});\\//");
        boolean boolean20 = referenceBean0.hasAnyProperties();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hasOne" + "'", str16, "hasOne");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});" + "'", str17, "Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test12428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12428");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.read = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str8 = apiObject0.update;
        apiObject0.update = "hasOne";
        apiObject0.update = "json";
        apiObject0.update = "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});/";
        apiObject0.read = "Ext.data.Model";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str8, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
    }

    @Test
    public void test12429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12429");
        ch.rasc.extclassgenerator.validation.PresenceValidation presenceValidation1 = new ch.rasc.extclassgenerator.validation.PresenceValidation("ch.rasc.extclassgenerator.validation.RangeValidation");
    }

    @Test
    public void test12430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12430");
        ch.rasc.extclassgenerator.validation.CreditCardNumberValidation creditCardNumberValidation1 = new ch.rasc.extclassgenerator.validation.CreditCardNumberValidation("Ext.define(\"ch.rasc.extclassgenerator.validation.PresenceValidation\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ {\n      name : \"type\",\n      type : \"string\"\n    }, {\n      name : \"field\",\n      type : \"string\"\n    } ]\n  }\n});");
    }

    @Test
    public void test12431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12431");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        java.lang.String str1 = apiObject0.update;
        java.lang.String str2 = apiObject0.read;
        apiObject0.create = "hasOne";
        apiObject0.destroy = "/\\/format\\//";
        apiObject0.create = "ch.rasc.extclassgenerator.ModelBean";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test12432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12432");
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation3 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal4 = rangeValidation3.getMin();
        java.math.BigDecimal bigDecimal5 = rangeValidation3.getMin();
        java.math.BigDecimal bigDecimal6 = rangeValidation3.getMin();
        java.math.BigDecimal bigDecimal7 = rangeValidation3.getMax();
        java.math.BigDecimal bigDecimal8 = rangeValidation3.getMax();
        java.math.BigDecimal bigDecimal9 = rangeValidation3.getMax();
        java.lang.String str10 = rangeValidation3.getType();
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "range" + "'", str10, "range");
    }

    @Test
    public void test12433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12433");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        java.lang.String str6 = referenceBean0.getType();
        java.lang.String str7 = referenceBean0.getParent();
        java.lang.String str8 = referenceBean0.getInverse();
        java.lang.String str9 = referenceBean0.getAssociation();
        boolean boolean10 = referenceBean0.hasAnyProperties();
        java.lang.String str11 = referenceBean0.getType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test12434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12434");
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
        modelFieldBean2.setName("/Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"debug\",type:\"boolean\"},{name:\"useSingleQuotes\",type:\"boolean\"},{name:\"surroundApiWithQuotes\",type:\"boolean\"}]}});/");
        modelFieldBean2.setMapping("/\\/range\\//");
        org.junit.Assert.assertNotNull(abstractValidationArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test12435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12435");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        java.lang.String str2 = hasOneAssociation1.getName();
        hasOneAssociation1.setInstanceName("");
        hasOneAssociation1.setName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str7 = hasOneAssociation1.getForeignKey();
        java.lang.String str8 = hasOneAssociation1.getPrimaryKey();
        hasOneAssociation1.setSetterName("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        java.lang.String str11 = hasOneAssociation1.getGetterName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test12436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12436");
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
        javax.lang.model.element.Element element16 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror17 = null;
        javax.lang.model.element.ExecutableElement executableElement18 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable20 = modelAnnotationProcessor0.getCompletions(element16, annotationMirror17, executableElement18, "json");
        javax.lang.model.SourceVersion sourceVersion21 = modelAnnotationProcessor0.getSupportedSourceVersion();
        javax.annotation.processing.ProcessingEnvironment processingEnvironment22 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelAnnotationProcessor0.init(processingEnvironment22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Tool provided null ProcessingEnvironment");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertTrue("'" + sourceVersion2 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion2.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertTrue("'" + sourceVersion3 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion3.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertTrue("'" + sourceVersion4 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion4.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(wildcardIterable9);
        org.junit.Assert.assertNotNull(wildcardIterable14);
        org.junit.Assert.assertTrue("'" + sourceVersion15 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion15.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(wildcardIterable20);
        org.junit.Assert.assertTrue("'" + sourceVersion21 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion21.equals(javax.lang.model.SourceVersion.RELEASE_6));
    }

    @Test
    public void test12437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12437");
        ch.rasc.extclassgenerator.validation.FormatValidation formatValidation2 = new ch.rasc.extclassgenerator.validation.FormatValidation("", "//");
    }

    @Test
    public void test12438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12438");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        java.lang.String str2 = hasOneAssociation1.getName();
        hasOneAssociation1.setInstanceName("");
        java.lang.String str5 = hasOneAssociation1.getForeignKey();
        java.lang.String str6 = hasOneAssociation1.getGetterName();
        hasOneAssociation1.setAssociationKey("Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str9 = hasOneAssociation1.getSetterName();
        hasOneAssociation1.setForeignKey("Ext.define(\"ch.rasc.extclassgenerator.validation.PresenceValidation\",{extend:\"Ext.data.Model\",fields:[{name:\"type\",type:\"string\"},{name:\"field\",type:\"string\"}]});");
        hasOneAssociation1.setSetterName("digits");
        java.lang.String str14 = hasOneAssociation1.getSetterName();
        hasOneAssociation1.setName("Ext.define(\"ch.rasc.extclassgenerator.association.HasOneAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ {\n      name : \"setterName\",\n      type : \"string\"\n    }, {\n      name : \"getterName\",\n      type : \"string\"\n    }, {\n      name : \"name\",\n      type : \"string\"\n    }, {\n      name : \"type\",\n      type : \"string\"\n    }, {\n      name : \"model\",\n      type : \"string\"\n    }, {\n      name : \"associationKey\",\n      type : \"string\"\n    }, {\n      name : \"foreignKey\",\n      type : \"string\"\n    }, {\n      name : \"primaryKey\",\n      type : \"string\"\n    }, {\n      name : \"instanceName\",\n      type : \"string\"\n    } ]\n  }\n});");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "digits" + "'", str14, "digits");
    }

    @Test
    public void test12439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12439");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("/Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});/");
        hasOneAssociation1.setGetterName("inclusion");
    }

    @Test
    public void test12440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12440");
        ch.rasc.extclassgenerator.validation.ExclusionValidation exclusionValidation2 = new ch.rasc.extclassgenerator.validation.ExclusionValidation("email", "");
    }

    @Test
    public void test12441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12441");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        ch.rasc.extclassgenerator.validation.GenericValidation genericValidation3 = new ch.rasc.extclassgenerator.validation.GenericValidation("Ext.define(\"ch.rasc.extclassgenerator.association.HasOneAssociation\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"setterName\",type:\"string\"},{name:\"getterName\",type:\"string\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]}});", "Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[],proxy:{type:\"direct\",directFn:hi!,writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",config:{fields:[]}});\"}}}});", strMap2);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = genericValidation3.getOptions();
        org.junit.Assert.assertNull(strMap4);
    }

    @Test
    public void test12442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12442");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        java.lang.String str3 = modelFieldBean2.getName();
        modelFieldBean2.setDateFormat("Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"debug\",type:\"boolean\"},{name:\"useSingleQuotes\",type:\"boolean\"},{name:\"surroundApiWithQuotes\",type:\"boolean\"}],proxy:{type:\"direct\",reader:{type:\"/format/\",messageProperty:\"Ext.define(\\\"ch.rasc.extclassgenerator.validation.InclusionValidationArray\\\",{extend:\\\"Ext.data.Model\\\",fields:[{name:\\\"type\\\",type:\\\"string\\\"},{name:\\\"field\\\",type:\\\"string\\\"}]});\"}}}});");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
    }

    @Test
    public void test12443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12443");
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
        java.lang.Object obj17 = modelFieldBean2.getDefaultValue();
        java.lang.Boolean boolean18 = modelFieldBean2.getCritical();
        ch.rasc.extclassgenerator.ModelAnnotationProcessor modelAnnotationProcessor19 = new ch.rasc.extclassgenerator.ModelAnnotationProcessor();
        java.util.Set<java.lang.String> strSet20 = modelAnnotationProcessor19.getSupportedAnnotationTypes();
        java.util.Set<java.lang.String> strSet21 = modelAnnotationProcessor19.getSupportedOptions();
        javax.lang.model.element.Element element22 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror23 = null;
        javax.lang.model.element.ExecutableElement executableElement24 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable26 = modelAnnotationProcessor19.getCompletions(element22, annotationMirror23, executableElement24, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.util.Set<java.lang.String> strSet27 = modelAnnotationProcessor19.getSupportedAnnotationTypes();
        java.util.Set<java.lang.String> strSet28 = modelAnnotationProcessor19.getSupportedAnnotationTypes();
        javax.lang.model.element.Element element29 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror30 = null;
        javax.lang.model.element.ExecutableElement executableElement31 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable33 = modelAnnotationProcessor19.getCompletions(element29, annotationMirror30, executableElement31, "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});");
        javax.lang.model.element.Element element34 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror35 = null;
        javax.lang.model.element.ExecutableElement executableElement36 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable38 = modelAnnotationProcessor19.getCompletions(element34, annotationMirror35, executableElement36, "digits");
        javax.lang.model.element.Element element39 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror40 = null;
        javax.lang.model.element.ExecutableElement executableElement41 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable43 = modelAnnotationProcessor19.getCompletions(element39, annotationMirror40, executableElement41, "ch.rasc.extclassgenerator.PartialDataOptionsBean");
        javax.lang.model.SourceVersion sourceVersion44 = modelAnnotationProcessor19.getSupportedSourceVersion();
        javax.lang.model.SourceVersion sourceVersion45 = modelAnnotationProcessor19.getSupportedSourceVersion();
        javax.lang.model.element.Element element46 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror47 = null;
        javax.lang.model.element.ExecutableElement executableElement48 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable50 = modelAnnotationProcessor19.getCompletions(element46, annotationMirror47, executableElement48, "hasMany");
        modelFieldBean2.setDefaultValue((java.lang.Object) wildcardIterable50);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str10, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertEquals("'" + boolean18 + "' != '" + true + "'", boolean18, true);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(wildcardIterable26);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(wildcardIterable33);
        org.junit.Assert.assertNotNull(wildcardIterable38);
        org.junit.Assert.assertNotNull(wildcardIterable43);
        org.junit.Assert.assertTrue("'" + sourceVersion44 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion44.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertTrue("'" + sourceVersion45 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion45.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(wildcardIterable50);
    }

    @Test
    public void test12444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12444");
        ch.rasc.extclassgenerator.validation.ExclusionValidation exclusionValidation2 = new ch.rasc.extclassgenerator.validation.ExclusionValidation("Ext.define(\"ch.rasc.extclassgenerator.validation.InclusionValidationArray\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"field\",\n    type : \"string\"\n  } ]\n});", "/Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]}});/");
    }

    @Test
    public void test12445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12445");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        java.lang.String str1 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str4 = apiObject0.update;
        apiObject0.create = "";
        java.lang.String str7 = apiObject0.update;
        java.lang.String str8 = apiObject0.read;
        java.lang.String str9 = apiObject0.update;
        java.lang.String str10 = apiObject0.create;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test12446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12446");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        java.lang.String str2 = hasOneAssociation1.getName();
        hasOneAssociation1.setInstanceName("");
        java.lang.String str5 = hasOneAssociation1.getForeignKey();
        java.lang.String str6 = hasOneAssociation1.getGetterName();
        hasOneAssociation1.setAssociationKey("Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});");
        hasOneAssociation1.setGetterName("Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
        java.lang.String str11 = hasOneAssociation1.getName();
        hasOneAssociation1.setName("range");
        hasOneAssociation1.setInstanceName("Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
        java.lang.String str16 = hasOneAssociation1.getSetterName();
        java.lang.String str17 = hasOneAssociation1.getSetterName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test12447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12447");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        java.lang.String str6 = modelFieldBean2.getMapping();
        modelFieldBean2.setCritical((java.lang.Boolean) true);
        java.lang.String str9 = modelFieldBean2.getCalculate();
        java.lang.Boolean boolean10 = modelFieldBean2.getCritical();
        java.lang.String str11 = modelFieldBean2.getName();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test12448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12448");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        referenceBean0.setType("");
        referenceBean0.setChild("");
        referenceBean0.setType("/\\/hi!\\//");
    }

    @Test
    public void test12449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12449");
        ch.rasc.extclassgenerator.validation.FormatValidation formatValidation2 = new ch.rasc.extclassgenerator.validation.FormatValidation("hasMany", "hasMany");
        java.lang.String str3 = formatValidation2.getMatcher();
        java.lang.String str4 = formatValidation2.getMatcher();
        java.lang.String str5 = formatValidation2.getMatcher();
        java.lang.String str6 = formatValidation2.getMatcher();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/hasMany/" + "'", str3, "/hasMany/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "/hasMany/" + "'", str4, "/hasMany/");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/hasMany/" + "'", str5, "/hasMany/");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/hasMany/" + "'", str6, "/hasMany/");
    }

    @Test
    public void test12450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12450");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        hasManyAssociation1.setAutoLoad((java.lang.Boolean) false);
        java.lang.String str4 = hasManyAssociation1.getModel();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/" + "'", str4, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
    }

    @Test
    public void test12451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12451");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.String str5 = modelFieldBean2.getMapping();
        modelFieldBean2.setAllowNull((java.lang.Boolean) true);
        java.lang.String str8 = modelFieldBean2.getName();
        modelFieldBean2.setMapping("Ext.data.Model");
        modelFieldBean2.setMapping("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
        java.lang.String str13 = modelFieldBean2.getMapping();
        java.lang.Boolean boolean14 = modelFieldBean2.getUnique();
        java.lang.Boolean boolean15 = modelFieldBean2.getCritical();
        java.lang.Boolean boolean16 = modelFieldBean2.getCritical();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});" + "'", str13, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertNull(boolean15);
        org.junit.Assert.assertNull(boolean16);
    }

    @Test
    public void test12452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12452");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.destroy = "";
        apiObject0.destroy = "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/";
        apiObject0.destroy = "Ext.data.Model";
        java.lang.String str7 = apiObject0.create;
        apiObject0.update = "/Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});/";
        java.lang.String str10 = apiObject0.read;
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test12453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12453");
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
        ch.rasc.extclassgenerator.ModelType modelType23 = modelFieldBean2.getModelType();
        java.util.List<ch.rasc.extclassgenerator.validation.AbstractValidation> abstractValidationList24 = modelFieldBean2.getValidators();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(modelType23);
        org.junit.Assert.assertNull(abstractValidationList24);
    }

    @Test
    public void test12454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12454");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        referenceBean0.setType("");
        java.lang.String str3 = referenceBean0.getAssociation();
        referenceBean0.setInverse("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        java.lang.String str6 = referenceBean0.getType();
        java.lang.String str7 = referenceBean0.getParent();
        referenceBean0.setChild("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        boolean boolean10 = referenceBean0.typeOnly();
        referenceBean0.setInverse("/\\/\\\\/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});\\\\/\\//");
        referenceBean0.setChild("Ext.define(\"ch.rasc.extclassgenerator.validation.PresenceValidation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"field\",\n    type : \"string\"\n  } ]\n});");
        java.lang.String str15 = referenceBean0.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test12455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12455");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.read = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.destroy = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});";
        apiObject0.read = "json";
        apiObject0.update = "/Ext.define(\"null\",{extend:\"Ext.data.Model\",idProperty:\"hi!\",fields:[],proxy:{type:\"direct\",idParam:\"hi!\"}});/";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
    }

    @Test
    public void test12456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12456");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getChild();
        java.lang.String str2 = referenceBean0.getChild();
        referenceBean0.setAssociation("creditCardNumber");
        referenceBean0.setType("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        java.lang.String str7 = referenceBean0.getParent();
        referenceBean0.setChild("Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test12457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12457");
        ch.rasc.extclassgenerator.ModelType modelType1 = null;
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("length", modelType1);
        modelFieldBean2.setDateFormat("");
        java.lang.Object obj5 = modelFieldBean2.getDefaultValue();
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test12458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12458");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        java.lang.String str10 = referenceBean0.getType();
        referenceBean0.setChild("Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
        java.lang.String str13 = referenceBean0.getType();
        boolean boolean14 = referenceBean0.hasAnyProperties();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test12459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12459");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        modelBean0.setIdProperty("");
        modelBean0.setReadMethod("hi!");
        java.lang.String str7 = modelBean0.getUpdateMethod();
        boolean boolean8 = modelBean0.isPaging();
        boolean boolean9 = modelBean0.isPaging();
        boolean boolean10 = modelBean0.isPaging();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test12460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12460");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        java.lang.String str6 = referenceBean0.getParent();
        referenceBean0.setParent("exclusion");
        java.lang.String str9 = referenceBean0.getAssociation();
        java.lang.String str10 = referenceBean0.getAssociation();
        referenceBean0.setInverse("Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
        java.lang.String str13 = referenceBean0.getAssociation();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test12461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12461");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("hi!");
        hasManyAssociation1.setAssociationKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        hasManyAssociation1.setName("belongsTo");
        hasManyAssociation1.setPrimaryKey("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        hasManyAssociation1.setAutoLoad((java.lang.Boolean) true);
        java.lang.String str10 = hasManyAssociation1.getPrimaryKey();
        hasManyAssociation1.setName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        java.lang.String str13 = hasManyAssociation1.getName();
        java.lang.String str14 = hasManyAssociation1.getForeignKey();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});" + "'", str10, "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});" + "'", str13, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test12462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12462");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        java.lang.String str10 = referenceBean0.getParent();
        referenceBean0.setType("Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
        referenceBean0.setParent("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});/");
        java.lang.String str15 = referenceBean0.getParent();
        java.lang.String str16 = referenceBean0.getInverse();
        referenceBean0.setAssociation("Ext.define(\"ch.rasc.extclassgenerator.validation.InclusionValidationArray\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ {\n      name : \"type\",\n      type : \"string\"\n    }, {\n      name : \"field\",\n      type : \"string\"\n    } ]\n  }\n});");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});/" + "'", str15, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});/");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test12463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12463");
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation3 = new ch.rasc.extclassgenerator.validation.RangeValidation("ch.rasc.extclassgenerator.OutputConfig", (java.lang.Long) 10L, (java.lang.Long) 97L);
        java.math.BigDecimal bigDecimal4 = rangeValidation3.getMax();
        org.junit.Assert.assertNotNull(bigDecimal4);
    }

    @Test
    public void test12464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12464");
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
        java.lang.String[] strArray17 = modelBean0.getHasMany();
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean19 = modelBean0.getField("Ext.define(\"ch.rasc.extclassgenerator.LineEnding\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "json" + "'", str16, "json");
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNull(modelFieldBean19);
    }

    @Test
    public void test12465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12465");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        referenceBean0.setRole("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
        java.lang.String str12 = referenceBean0.getRole();
        java.lang.String str13 = referenceBean0.getRole();
        java.lang.String str14 = referenceBean0.getType();
        referenceBean0.setParent("Ext.define(\"ch.rasc.extclassgenerator.AllDataOptionsBean\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ {\n      name : \"associated\",\n      type : \"boolean\"\n    }, {\n      name : \"changes\",\n      type : \"boolean\"\n    }, {\n      name : \"critical\",\n      type : \"boolean\"\n    }, {\n      name : \"persist\",\n      type : \"boolean\"\n    } ]\n  }\n});");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});" + "'", str12, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});" + "'", str13, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test12466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12466");
        ch.rasc.extclassgenerator.validation.ExclusionValidation exclusionValidation2 = new ch.rasc.extclassgenerator.validation.ExclusionValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelFieldBean\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"dateFormat\",type:\"string\"},{name:\"useNull\",type:\"boolean\"},{name:\"allowNull\",type:\"boolean\"},{name:\"mapping\",type:\"string\"},{name:\"persist\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"convert\",type:\"string\"},{name:\"calculate\",type:\"string\"},{name:\"allowBlank\",type:\"boolean\"},{name:\"unique\",type:\"boolean\"}]}});", "ch.rasc.extclassgenerator.validation.CreditCardNumberValidation");
    }

    @Test
    public void test12467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12467");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getRole();
        referenceBean0.setInverse("");
        java.lang.String str5 = referenceBean0.getAssociation();
        referenceBean0.setAssociation("exclusion");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test12468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12468");
        ch.rasc.extclassgenerator.validation.InclusionValidation inclusionValidation2 = new ch.rasc.extclassgenerator.validation.InclusionValidation("", "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});/");
        java.lang.String str3 = inclusionValidation2.getList();
        java.lang.String str4 = inclusionValidation2.getList();
        java.lang.String str5 = inclusionValidation2.getList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});/" + "'", str3, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});/" + "'", str4, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});/");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});/" + "'", str5, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});/");
    }

    @Test
    public void test12469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12469");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});";
        apiObject0.destroy = "belongsTo";
        apiObject0.destroy = "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str10 = apiObject0.read;
        apiObject0.read = "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str13 = apiObject0.destroy;
        java.lang.String str14 = apiObject0.create;
        apiObject0.read = "ch.rasc.extclassgenerator.OutputConfig";
        java.lang.String str17 = apiObject0.destroy;
        java.lang.String str18 = apiObject0.create;
        apiObject0.destroy = "";
        apiObject0.update = "";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str13, "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});" + "'", str14, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str17, "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});" + "'", str18, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
    }

    @Test
    public void test12470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12470");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getChild();
        java.lang.String str2 = referenceBean0.getInverse();
        referenceBean0.setParent("");
        java.lang.String str5 = referenceBean0.getRole();
        referenceBean0.setInverse("presence");
        boolean boolean8 = referenceBean0.hasAnyProperties();
        referenceBean0.setChild("ch.rasc.extclassgenerator.ModelBean");
        boolean boolean11 = referenceBean0.typeOnly();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test12471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12471");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getParent();
        referenceBean0.setInverse("hi!");
        referenceBean0.setParent("exclusion");
        java.lang.String str7 = referenceBean0.getInverse();
        java.lang.String str8 = referenceBean0.getRole();
        java.lang.String str9 = referenceBean0.getInverse();
        referenceBean0.setAssociation("Ext.define('null',{extend:'/Ext.define(\\'ch.rasc.extclassgenerator.association.HasManyAssociation\\',{extend:\\'Ext.data.Model\\',fields:[{name:\\'autoLoad\\',type:\\'boolean\\'},{name:\\'name\\',type:\\'string\\'},{name:\\'type\\',type:\\'string\\'},{name:\\'model\\',type:\\'string\\'},{name:\\'associationKey\\',type:\\'string\\'},{name:\\'foreignKey\\',type:\\'string\\'},{name:\\'primaryKey\\',type:\\'string\\'},{name:\\'instanceName\\',type:\\'string\\'}]});/',config:{fields:[],proxy:{type:'direct',api:{update:creditCardNumber}}}});");
        referenceBean0.setParent("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test12472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12472");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("");
        java.lang.String str2 = belongsToAssociation1.getGetterName();
        belongsToAssociation1.setSetterName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
        belongsToAssociation1.setInstanceName("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});");
        belongsToAssociation1.setSetterName("Ext.define('ch.rasc.extclassgenerator.validation.CreditCardNumberValidation',{extend:'Ext.data.Model',config:{fields:[{name:'type',type:'string'},{name:'field',type:'string'}]}});");
        belongsToAssociation1.setInstanceName("Ext.define(\"null\",\r\n{\n  extend : \"\",\n  fields : [ ],\n  validations : [ {\n    type : \"range\",\n    field : \"/Ext.define(\\\"ch.rasc.extclassgenerator.association.HasManyAssociation\\\",{extend:\\\"Ext.data.Model\\\",fields:[{name:\\\"autoLoad\\\",type:\\\"boolean\\\"},{name:\\\"name\\\",type:\\\"string\\\"},{name:\\\"type\\\",type:\\\"string\\\"},{name:\\\"model\\\",type:\\\"string\\\"},{name:\\\"associationKey\\\",type:\\\"string\\\"},{name:\\\"foreignKey\\\",type:\\\"string\\\"},{name:\\\"primaryKey\\\",type:\\\"string\\\"},{name:\\\"instanceName\\\",type:\\\"string\\\"}]});/\",\n    min : 0,\n    max : 0\n  } ]\n});");
        java.lang.String str11 = belongsToAssociation1.getGetterName();
        belongsToAssociation1.setGetterName("Ext.define(\"null\",\r\n{\n  extend : \"\",\n  config : {\n    fields : [ ],\n    proxy : {\n      type : \"direct\",\n      api : {\n        create : Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});\n      },\n      reader : {\n        messageProperty : \"hi!\"\n      }\n    }\n  }\n});");
        belongsToAssociation1.setForeignKey("/belongsTo/");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test12473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12473");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.String str5 = modelFieldBean2.getName();
        modelFieldBean2.setAllowBlank((java.lang.Boolean) false);
        modelFieldBean2.setDateFormat("/\\/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});\\//");
        java.lang.Boolean boolean10 = modelFieldBean2.getAllowNull();
        ch.rasc.extclassgenerator.ApiObject apiObject11 = new ch.rasc.extclassgenerator.ApiObject();
        java.lang.String str12 = apiObject11.update;
        apiObject11.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str15 = apiObject11.update;
        apiObject11.create = "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[],proxy:{type:\"direct\",directFn:hi!}});";
        apiObject11.create = "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});/";
        modelFieldBean2.setDefaultValue((java.lang.Object) "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});/");
        ch.rasc.extclassgenerator.ModelType modelType21 = modelFieldBean2.getModelType();
        modelFieldBean2.setConvert("Ext.define(\"null\",\r\n{\n  extend : \"\",\n  idgen : \"Ext.define(\\\"java.util.ArrayList\\\",\\r\\n{\\n  extend : \\\"Ext.data.Model\\\",\\n  fields : [ ]\\n});\",\n  fields : [ ],\n  proxy : {\n    type : \"direct\",\n    reader : {\n      root : \"Ext.define(\\\"null\\\",{extend:\\\"Ext.data.Model\\\",idProperty:\\\"hi!\\\",fields:[],proxy:{type:\\\"direct\\\",idParam:\\\"hi!\\\"}});\",\n      messageProperty : \"hi!\"\n    },\n    writer : {\n      writeAllFields : false\n    }\n  }\n});");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(modelType21);
    }

    @Test
    public void test12474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12474");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getChild();
        java.lang.String str2 = referenceBean0.getChild();
        referenceBean0.setAssociation("creditCardNumber");
        referenceBean0.setType("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        referenceBean0.setChild("length");
        referenceBean0.setParent("json");
        referenceBean0.setChild("exclusion");
        referenceBean0.setParent("digits");
        referenceBean0.setInverse("hasOne");
        referenceBean0.setType("/range/");
        boolean boolean19 = referenceBean0.typeOnly();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test12475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12475");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getChild();
        java.lang.String str2 = referenceBean0.getChild();
        referenceBean0.setType("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        boolean boolean5 = referenceBean0.hasAnyProperties();
        java.lang.String str6 = referenceBean0.getType();
        java.lang.String str7 = referenceBean0.getParent();
        boolean boolean8 = referenceBean0.typeOnly();
        boolean boolean9 = referenceBean0.typeOnly();
        referenceBean0.setChild("format");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});" + "'", str6, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test12476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12476");
        ch.rasc.extclassgenerator.validation.PresenceValidation presenceValidation1 = new ch.rasc.extclassgenerator.validation.PresenceValidation("Ext.define(\"ch.rasc.extclassgenerator.association.BelongsToAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ {\n      name : \"setterName\",\n      type : \"string\"\n    }, {\n      name : \"getterName\",\n      type : \"string\"\n    }, {\n      name : \"type\",\n      type : \"string\"\n    }, {\n      name : \"model\",\n      type : \"string\"\n    }, {\n      name : \"associationKey\",\n      type : \"string\"\n    }, {\n      name : \"foreignKey\",\n      type : \"string\"\n    }, {\n      name : \"primaryKey\",\n      type : \"string\"\n    }, {\n      name : \"instanceName\",\n      type : \"string\"\n    } ]\n  }\n});");
    }

    @Test
    public void test12477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12477");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        java.lang.String str10 = referenceBean0.getType();
        java.lang.String str11 = referenceBean0.getParent();
        referenceBean0.setChild("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});/");
        java.lang.String str14 = referenceBean0.getAssociation();
        boolean boolean15 = referenceBean0.typeOnly();
        java.lang.String str16 = referenceBean0.getChild();
        boolean boolean17 = referenceBean0.typeOnly();
        java.lang.String str18 = referenceBean0.getRole();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});/" + "'", str16, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});/");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test12478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12478");
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
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable13 = modelAnnotationProcessor0.getCompletions(element9, annotationMirror10, executableElement11, "belongsTo");
        java.util.Set<java.lang.String> strSet14 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        javax.lang.model.element.Element element15 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror16 = null;
        javax.lang.model.element.ExecutableElement executableElement17 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable19 = modelAnnotationProcessor0.getCompletions(element15, annotationMirror16, executableElement17, "/Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});/");
        javax.lang.model.element.Element element20 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror21 = null;
        javax.lang.model.element.ExecutableElement executableElement22 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable24 = modelAnnotationProcessor0.getCompletions(element20, annotationMirror21, executableElement22, "/hi!/");
        javax.lang.model.SourceVersion sourceVersion25 = modelAnnotationProcessor0.getSupportedSourceVersion();
        javax.lang.model.element.Element element26 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror27 = null;
        javax.lang.model.element.ExecutableElement executableElement28 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable30 = modelAnnotationProcessor0.getCompletions(element26, annotationMirror27, executableElement28, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        java.util.Set<java.lang.String> strSet31 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(wildcardIterable7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(wildcardIterable13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(wildcardIterable19);
        org.junit.Assert.assertNotNull(wildcardIterable24);
        org.junit.Assert.assertTrue("'" + sourceVersion25 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion25.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(wildcardIterable30);
        org.junit.Assert.assertNotNull(strSet31);
    }

    @Test
    public void test12479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12479");
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
        java.util.List<java.lang.String> strList19 = exclusionValidationArray16.getList();
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray20 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ {\n      name : \"associated\",\n      type : \"boolean\"\n    }, {\n      name : \"changes\",\n      type : \"boolean\"\n    }, {\n      name : \"critical\",\n      type : \"boolean\"\n    }, {\n      name : \"persist\",\n      type : \"boolean\"\n    } ]\n  }\n});", strList19);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test12480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12480");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.read = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str8 = apiObject0.update;
        apiObject0.read = "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/";
        java.lang.String str11 = apiObject0.read;
        apiObject0.read = "Ext.define(\"ch.rasc.extclassgenerator.association.BelongsToAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"setterName\",type:\"string\"},{name:\"getterName\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});";
        java.lang.String str14 = apiObject0.read;
        java.lang.String str15 = apiObject0.destroy;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str8, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/" + "'", str11, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.association.BelongsToAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"setterName\",type:\"string\"},{name:\"getterName\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});" + "'", str14, "Ext.define(\"ch.rasc.extclassgenerator.association.BelongsToAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"setterName\",type:\"string\"},{name:\"getterName\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test12481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12481");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[],proxy:{type:\"direct\",directFn:hi!}});");
        java.lang.Object obj3 = modelFieldBean2.getDefaultValue();
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test12482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12482");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str2 = belongsToAssociation1.getSetterName();
        belongsToAssociation1.setAssociationKey("belongsTo");
        java.lang.String str5 = belongsToAssociation1.getGetterName();
        belongsToAssociation1.setGetterName("Ext.define(\"ch.rasc.extclassgenerator.LineEnding\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
        belongsToAssociation1.setForeignKey("Ext.define(\"null\",{extend:\"\",config:{fields:[]}});");
        belongsToAssociation1.setSetterName("Ext.define(\"null\",\r\n{\n  extend : \"\",\n  fields : [ ],\n  hasMany : [ \"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\", \"json\", \"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\", \"\" ]\n});");
        belongsToAssociation1.setSetterName("Ext.define(\"null\",\r\n{\n  extend : \"Ext.data.Model\",\n  idgen : \"Ext.define(\\\"null\\\",{extend:\\\"Ext.data.Model\\\",config:{fields:[],proxy:{type:\\\"direct\\\",directFn:hi!,writer:{type:\\\"Ext.define(\\\\\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\\\\\",{extend:\\\\\\\"Ext.data.Model\\\\\\\",config:{fields:[]}});\\\"}}}});\",\n  fields : [ ]\n});");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test12483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12483");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        java.lang.String str2 = hasOneAssociation1.getSetterName();
        java.lang.String str3 = hasOneAssociation1.getGetterName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test12484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12484");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getChild();
        boolean boolean2 = referenceBean0.typeOnly();
        java.lang.String str3 = referenceBean0.getAssociation();
        referenceBean0.setParent("hasOne");
        java.lang.String str6 = referenceBean0.getInverse();
        java.lang.String str7 = referenceBean0.getChild();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test12485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12485");
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation5 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal6 = rangeValidation5.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation10 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal11 = rangeValidation10.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation12 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal6, bigDecimal11);
        java.math.BigDecimal bigDecimal13 = null;
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation14 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelFieldBean\",{extend:\"Ext.data.Model\",fields:[{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"dateFormat\",type:\"string\"},{name:\"useNull\",type:\"boolean\"},{name:\"allowNull\",type:\"boolean\"},{name:\"mapping\",type:\"string\"},{name:\"persist\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"convert\",type:\"string\"},{name:\"calculate\",type:\"string\"},{name:\"allowBlank\",type:\"boolean\"},{name:\"unique\",type:\"boolean\"}]});", bigDecimal11, bigDecimal13);
        java.math.BigDecimal bigDecimal15 = rangeValidation14.getMax();
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNull(bigDecimal15);
    }

    @Test
    public void test12486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12486");
        ch.rasc.extclassgenerator.ModelType modelType1 = null;
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});", modelType1);
        java.lang.String str3 = modelFieldBean2.getName();
        java.lang.String str4 = modelFieldBean2.getDateFormat();
        java.lang.Boolean boolean5 = modelFieldBean2.getCritical();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(boolean5);
    }

    @Test
    public void test12487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12487");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});", "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        java.lang.Boolean boolean3 = modelFieldBean2.getCritical();
        java.lang.Boolean boolean4 = modelFieldBean2.getAllowBlank();
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean8 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean8.setConvert("hi!");
        modelFieldBean8.setMapping("hi!");
        modelFieldBean8.setUseNull((java.lang.Boolean) true);
        modelFieldBean8.setAllowBlank((java.lang.Boolean) false);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray24 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList22);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray25 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("", (java.util.List<java.lang.String>) strList22);
        java.util.List<java.lang.String> strList26 = exclusionValidationArray25.getList();
        modelFieldBean8.setDepends(strList26);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray28 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[],proxy:{type:\"direct\",directFn:hi!}});", strList26);
        modelFieldBean2.setDepends(strList26);
        java.lang.Boolean boolean30 = modelFieldBean2.getUnique();
        java.lang.String str31 = modelFieldBean2.getDateFormat();
        java.lang.String str32 = modelFieldBean2.getConvert();
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNull(boolean30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test12488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12488");
        ch.rasc.extclassgenerator.ModelAnnotationProcessor modelAnnotationProcessor0 = new ch.rasc.extclassgenerator.ModelAnnotationProcessor();
        javax.lang.model.SourceVersion sourceVersion1 = modelAnnotationProcessor0.getSupportedSourceVersion();
        javax.lang.model.element.Element element2 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror3 = null;
        javax.lang.model.element.ExecutableElement executableElement4 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable6 = modelAnnotationProcessor0.getCompletions(element2, annotationMirror3, executableElement4, "//");
        java.util.Set<java.lang.String> strSet7 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        java.util.Set<java.lang.String> strSet8 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        javax.lang.model.element.Element element9 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror10 = null;
        javax.lang.model.element.ExecutableElement executableElement11 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable13 = modelAnnotationProcessor0.getCompletions(element9, annotationMirror10, executableElement11, "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[],proxy:{type:\"direct\",directFn:hi!}});");
        javax.lang.model.element.Element element14 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror15 = null;
        javax.lang.model.element.ExecutableElement executableElement16 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable18 = modelAnnotationProcessor0.getCompletions(element14, annotationMirror15, executableElement16, "/\\/belongsTo\\//");
        org.junit.Assert.assertTrue("'" + sourceVersion1 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion1.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(wildcardIterable6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(wildcardIterable13);
        org.junit.Assert.assertNotNull(wildcardIterable18);
    }

    @Test
    public void test12489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12489");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        modelBean0.setAutodetectTypes(true);
        modelBean0.setUpdateMethod("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        boolean boolean7 = modelBean0.isAutodetectTypes();
        java.lang.String str8 = modelBean0.getIdentifier();
        java.lang.String str9 = modelBean0.getVersionProperty();
        modelBean0.setDestroyMethod("Ext.define(\"null\",\r\n{\n  extend : \"\",\n  idgen : \"Ext.define(\\\"java.util.ArrayList\\\",\\r\\n{\\n  extend : \\\"Ext.data.Model\\\",\\n  fields : [ ]\\n});\",\n  fields : [ ],\n  proxy : {\n    type : \"direct\",\n    reader : {\n      root : \"Ext.define(\\\"null\\\",{extend:\\\"Ext.data.Model\\\",idProperty:\\\"hi!\\\",fields:[],proxy:{type:\\\"direct\\\",idParam:\\\"hi!\\\"}});\",\n      messageProperty : \"hi!\"\n    },\n    writer : {\n      writeAllFields : false\n    }\n  }\n});");
        modelBean0.setUpdateMethod("/Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});/");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test12490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12490");
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
        java.lang.Boolean boolean34 = modelFieldBean2.getAllowBlank();
        modelFieldBean2.setPersist((java.lang.Boolean) false);
        java.lang.Boolean boolean37 = modelFieldBean2.getPersist();
        java.lang.String str38 = modelFieldBean2.getDateFormat();
        org.junit.Assert.assertNotNull(abstractValidationArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(boolean22);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(wildcardIterable30);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertNull(boolean34);
        org.junit.Assert.assertEquals("'" + boolean37 + "' != '" + false + "'", boolean37, false);
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test12491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12491");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.read;
        apiObject0.read = "/\\/\\\\/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});\\\\/\\//";
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test12492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12492");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean4 = allDataOptionsBean0.getPersist();
        java.lang.Boolean boolean5 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean6 = allDataOptionsBean0.getChanges();
        java.lang.Boolean boolean7 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean8 = allDataOptionsBean0.getAssociated();
        allDataOptionsBean0.setChanges((java.lang.Boolean) false);
        allDataOptionsBean0.setAssociated((java.lang.Boolean) true);
        allDataOptionsBean0.setCritical((java.lang.Boolean) false);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + false + "'", boolean5, false);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + false + "'", boolean7, false);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + false + "'", boolean8, false);
    }

    @Test
    public void test12493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12493");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getRole();
        referenceBean0.setChild("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        referenceBean0.setRole("json");
        boolean boolean7 = referenceBean0.hasAnyProperties();
        referenceBean0.setRole("ch.rasc.extclassgenerator.ModelBean");
        java.lang.String str10 = referenceBean0.getParent();
        referenceBean0.setParent("Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",{extend:\"Ext.data.Model\",fields:[{name:\"debug\",type:\"boolean\"},{name:\"useSingleQuotes\",type:\"boolean\"},{name:\"surroundApiWithQuotes\",type:\"boolean\"}]});");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test12494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12494");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("ch.rasc.extclassgenerator.ModelBean");
        belongsToAssociation1.setSetterName("Ext.define('Ext.define('ch.rasc.extclassgenerator.association.HasManyAssociation',\n{\n  extend : 'Ext.data.Model',\n  fields : [ {\n    name : 'autoLoad',\n    type : 'boolean'\n  }, {\n    name : 'name',\n    type : 'string'\n  }, {\n    name : 'type',\n    type : 'string'\n  }, {\n    name : 'model',\n    type : 'string'\n  }, {\n    name : 'associationKey',\n    type : 'string'\n  }, {\n    name : 'foreignKey',\n    type : 'string'\n  }, {\n    name : 'primaryKey',\n    type : 'string'\n  }, {\n    name : 'instanceName',\n    type : 'string'\n  } ]\n});',{extend:'',uses:['hi!'],fields:[],associations:[{type:'hasMany',model:'hi!'},{type:'hasMany',model:'hi!',associationKey:'Ext.define(\\'ch.rasc.extclassgenerator.ModelAnnotationProcessor\\',{extend:\\'Ext.data.Model\\',fields:[]});'},{type:'hasMany',model:'hi!',associationKey:'Ext.define(\\'ch.rasc.extclassgenerator.ModelAnnotationProcessor\\',{extend:\\'Ext.data.Model\\',fields:[]});'},{type:'hasMany',model:'hi!',foreignKey:''}]});");
        java.lang.String str4 = belongsToAssociation1.getInstanceName();
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test12495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12495");
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
        allDataOptionsBean6.setCritical((java.lang.Boolean) true);
        java.lang.Boolean boolean13 = allDataOptionsBean6.getChanges();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "json" + "'", str5, "json");
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNull(boolean13);
    }

    @Test
    public void test12496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12496");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("", "Ext.define(\"ch.rasc.extclassgenerator.validation.PresenceValidation\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ {\n      name : \"type\",\n      type : \"string\"\n    }, {\n      name : \"field\",\n      type : \"string\"\n    } ]\n  }\n});");
    }

    @Test
    public void test12497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12497");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        java.lang.String str6 = referenceBean0.getAssociation();
        referenceBean0.setInverse("");
        java.lang.String str9 = referenceBean0.getParent();
        java.lang.String str10 = referenceBean0.getRole();
        java.lang.String str11 = referenceBean0.getAssociation();
        java.lang.String str12 = referenceBean0.getType();
        referenceBean0.setChild("digits");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test12498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12498");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getChild();
        java.lang.String str2 = referenceBean0.getChild();
        referenceBean0.setType("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        referenceBean0.setType("");
        referenceBean0.setParent("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        java.lang.String str9 = referenceBean0.getRole();
        java.lang.String str10 = referenceBean0.getParent();
        java.lang.String str11 = referenceBean0.getRole();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/" + "'", str10, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test12499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12499");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray9 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList7);
        java.util.List<java.lang.String> strList10 = inclusionValidationArray9.getList();
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray11 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", strList10);
        java.util.List<java.lang.String> strList12 = exclusionValidationArray11.getList();
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray13 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("/\\/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});\\//", strList12);
        java.util.List<java.lang.String> strList14 = inclusionValidationArray13.getList();
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray15 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});", strList14);
        java.util.List<java.lang.String> strList16 = inclusionValidationArray15.getList();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test12500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12500");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str6 = apiObject0.read;
        java.lang.String str7 = apiObject0.create;
        apiObject0.read = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});";
        java.lang.String str10 = apiObject0.read;
        apiObject0.create = "presence";
        apiObject0.read = "Ext.define(\"ch.rasc.extclassgenerator.ReferenceBean\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"type\",type:\"string\"},{name:\"association\",type:\"string\"},{name:\"child\",type:\"string\"},{name:\"parent\",type:\"string\"},{name:\"role\",type:\"string\"},{name:\"inverse\",type:\"string\"}]}});";
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str7, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});" + "'", str10, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
    }
}
