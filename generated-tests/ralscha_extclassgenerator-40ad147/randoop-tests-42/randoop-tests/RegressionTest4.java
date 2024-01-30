import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test02001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02001");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});";
        apiObject0.destroy = "belongsTo";
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});";
        java.lang.String str10 = apiObject0.destroy;
        apiObject0.read = "Ext.define('Ext.define('ch.rasc.extclassgenerator.association.HasManyAssociation',\n{\n  extend : 'Ext.data.Model',\n  fields : [ {\n    name : 'autoLoad',\n    type : 'boolean'\n  }, {\n    name : 'name',\n    type : 'string'\n  }, {\n    name : 'type',\n    type : 'string'\n  }, {\n    name : 'model',\n    type : 'string'\n  }, {\n    name : 'associationKey',\n    type : 'string'\n  }, {\n    name : 'foreignKey',\n    type : 'string'\n  }, {\n    name : 'primaryKey',\n    type : 'string'\n  }, {\n    name : 'instanceName',\n    type : 'string'\n  } ]\n});',{extend:'',uses:['hi!'],fields:[],associations:[{type:'hasMany',model:'hi!'},{type:'hasMany',model:'hi!',associationKey:'Ext.define(\\'ch.rasc.extclassgenerator.ModelAnnotationProcessor\\',{extend:\\'Ext.data.Model\\',fields:[]});'},{type:'hasMany',model:'hi!',associationKey:'Ext.define(\\'ch.rasc.extclassgenerator.ModelAnnotationProcessor\\',{extend:\\'Ext.data.Model\\',fields:[]});'},{type:'hasMany',model:'hi!',foreignKey:''}]});";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "belongsTo" + "'", str10, "belongsTo");
    }

    @Test
    public void test02002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02002");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[],proxy:{type:\"direct\",directFn:hi!,writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",config:{fields:[]}});\"}}}});", "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]}});");
    }

    @Test
    public void test02003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02003");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        java.lang.String str2 = hasOneAssociation1.getName();
        hasOneAssociation1.setInstanceName("");
        java.lang.String str5 = hasOneAssociation1.getForeignKey();
        java.lang.String str6 = hasOneAssociation1.getGetterName();
        hasOneAssociation1.setAssociationKey("Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});");
        hasOneAssociation1.setGetterName("Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
        hasOneAssociation1.setGetterName("length");
        hasOneAssociation1.setName("Ext.define(\"ch.rasc.extclassgenerator.validation.PresenceValidation\",{extend:\"Ext.data.Model\",fields:[{name:\"type\",type:\"string\"},{name:\"field\",type:\"string\"}]});");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test02004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02004");
        ch.rasc.extclassgenerator.OutputConfig outputConfig0 = new ch.rasc.extclassgenerator.OutputConfig();
        boolean boolean1 = outputConfig0.isSurroundApiWithQuotes();
        boolean boolean2 = outputConfig0.isDebug();
        outputConfig0.setDebug(false);
        outputConfig0.setUseSingleQuotes(false);
        ch.rasc.extclassgenerator.OutputFormat outputFormat7 = outputConfig0.getOutputFormat();
        ch.rasc.extclassgenerator.OutputFormat outputFormat8 = outputConfig0.getOutputFormat();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(outputFormat7);
        org.junit.Assert.assertNull(outputFormat8);
    }

    @Test
    public void test02005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02005");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        java.lang.String str6 = modelFieldBean2.getMapping();
        java.lang.String str7 = modelFieldBean2.getName();
        java.lang.Boolean boolean8 = modelFieldBean2.getUnique();
        modelFieldBean2.setUnique((java.lang.Boolean) true);
        java.lang.Boolean boolean11 = modelFieldBean2.getAllowNull();
        java.lang.Object obj12 = modelFieldBean2.getDefaultValue();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test02006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02006");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        java.lang.Boolean boolean1 = allDataOptionsBean0.getPersist();
        java.lang.Boolean boolean2 = allDataOptionsBean0.getPersist();
        allDataOptionsBean0.setChanges((java.lang.Boolean) true);
        allDataOptionsBean0.setAssociated((java.lang.Boolean) true);
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNull(boolean2);
    }

    @Test
    public void test02007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02007");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", (java.lang.Integer) 10, (java.lang.Integer) 1);
    }

    @Test
    public void test02008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02008");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        ch.rasc.extclassgenerator.validation.GenericValidation genericValidation3 = new ch.rasc.extclassgenerator.validation.GenericValidation("/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/", "length", strMap2);
        java.lang.String str4 = genericValidation3.getField();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = genericValidation3.getOptions();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "length" + "'", str4, "length");
        org.junit.Assert.assertNull(strMap5);
    }

    @Test
    public void test02009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02009");
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
        modelFieldBean2.setAllowBlank((java.lang.Boolean) true);
        modelFieldBean2.setPersist((java.lang.Boolean) false);
        java.lang.String str34 = modelFieldBean2.getType();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + boolean29 + "' != '" + false + "'", boolean29, false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str34, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
    }

    @Test
    public void test02010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02010");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        referenceBean0.setAssociation("Ext.define(\"null\",{extend:\"\",config:{fields:[]}});");
        referenceBean0.setRole("json");
        java.lang.String str10 = referenceBean0.getAssociation();
        java.lang.String str11 = referenceBean0.getInverse();
        referenceBean0.setInverse("creditCardNumber");
        referenceBean0.setInverse("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Ext.define(\"null\",{extend:\"\",config:{fields:[]}});" + "'", str10, "Ext.define(\"null\",{extend:\"\",config:{fields:[]}});");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test02011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02011");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("/ch.rasc.extclassgenerator.ModelAnnotationProcessor/", (java.lang.Long) 35L, (java.lang.Long) 32L);
    }

    @Test
    public void test02012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02012");
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
        java.lang.String str24 = modelFieldBean2.getDateFormat();
        modelFieldBean2.setCalculate("Ext.define(\"null\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ],\n  proxy : {\n    type : \"direct\",\n    reader : {\n      totalProperty : \"/Ext.define(\\\"ch.rasc.extclassgenerator.association.HasManyAssociation\\\",{extend:\\\"Ext.data.Model\\\",fields:[{name:\\\"autoLoad\\\",type:\\\"boolean\\\"},{name:\\\"name\\\",type:\\\"string\\\"},{name:\\\"type\\\",type:\\\"string\\\"},{name:\\\"model\\\",type:\\\"string\\\"},{name:\\\"associationKey\\\",type:\\\"string\\\"},{name:\\\"foreignKey\\\",type:\\\"string\\\"},{name:\\\"primaryKey\\\",type:\\\"string\\\"},{name:\\\"instanceName\\\",type:\\\"string\\\"}]});/\"\n    }\n  }\n});");
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(boolean23);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test02013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02013");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        belongsToAssociation1.setForeignKey("hasOne");
        belongsToAssociation1.setSetterName("/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/");
        java.lang.String str6 = belongsToAssociation1.getSetterName();
        belongsToAssociation1.setAssociationKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        java.lang.String str9 = belongsToAssociation1.getAssociationKey();
        java.lang.String str10 = belongsToAssociation1.getAssociationKey();
        belongsToAssociation1.setSetterName("/ch.rasc.extclassgenerator.PartialDataOptionsBean/");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/" + "'", str6, "/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});" + "'", str9, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});" + "'", str10, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
    }

    @Test
    public void test02014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02014");
        ch.rasc.extclassgenerator.validation.ExclusionValidation exclusionValidation2 = new ch.rasc.extclassgenerator.validation.ExclusionValidation("Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});", "Ext.define(\"ch.rasc.extclassgenerator.LineEnding\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
        java.lang.String str3 = exclusionValidation2.getList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.LineEnding\",{extend:\"Ext.data.Model\",config:{fields:[]}});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.LineEnding\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
    }

    @Test
    public void test02015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02015");
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
        hasManyAssociation12.setInstanceName("Ext.define(\"ch.rasc.extclassgenerator.ModelFieldBean\",{extend:\"Ext.data.Model\",fields:[{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"dateFormat\",type:\"string\"},{name:\"useNull\",type:\"boolean\"},{name:\"allowNull\",type:\"boolean\"},{name:\"mapping\",type:\"string\"},{name:\"persist\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"convert\",type:\"string\"},{name:\"calculate\",type:\"string\"},{name:\"allowBlank\",type:\"boolean\"},{name:\"unique\",type:\"boolean\"}]});");
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test02016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02016");
        ch.rasc.extclassgenerator.PartialDataOptionsBean partialDataOptionsBean0 = new ch.rasc.extclassgenerator.PartialDataOptionsBean();
        boolean boolean1 = partialDataOptionsBean0.hasAnyProperties();
        partialDataOptionsBean0.setChanges((java.lang.Boolean) true);
        java.lang.Boolean boolean4 = partialDataOptionsBean0.getPersist();
        partialDataOptionsBean0.setChanges((java.lang.Boolean) false);
        java.lang.Boolean boolean7 = partialDataOptionsBean0.getAssociated();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNull(boolean7);
    }

    @Test
    public void test02017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02017");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        ch.rasc.extclassgenerator.validation.GenericValidation genericValidation3 = new ch.rasc.extclassgenerator.validation.GenericValidation("/\\/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});\\//", "", strMap2);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = genericValidation3.getOptions();
        org.junit.Assert.assertNull(strMap4);
    }

    @Test
    public void test02018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02018");
        ch.rasc.extclassgenerator.validation.DigitsValidation digitsValidation3 = new ch.rasc.extclassgenerator.validation.DigitsValidation("digits", 97, 10);
        int int4 = digitsValidation3.getFraction();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test02019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02019");
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
        java.util.Set<java.lang.String> strSet19 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        javax.lang.model.element.Element element20 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror21 = null;
        javax.lang.model.element.ExecutableElement executableElement22 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable24 = modelAnnotationProcessor0.getCompletions(element20, annotationMirror21, executableElement22, "Ext.data.Model");
        javax.annotation.processing.ProcessingEnvironment processingEnvironment25 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelAnnotationProcessor0.init(processingEnvironment25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Tool provided null ProcessingEnvironment");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertTrue("'" + sourceVersion2 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion2.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(wildcardIterable8);
        org.junit.Assert.assertNotNull(wildcardIterable13);
        org.junit.Assert.assertNotNull(wildcardIterable18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(wildcardIterable24);
    }

    @Test
    public void test02020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02020");
        ch.rasc.extclassgenerator.ModelAnnotationProcessor modelAnnotationProcessor0 = new ch.rasc.extclassgenerator.ModelAnnotationProcessor();
        java.util.Set<java.lang.String> strSet1 = modelAnnotationProcessor0.getSupportedOptions();
        java.util.Set<java.lang.String> strSet2 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        javax.lang.model.element.Element element3 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror4 = null;
        javax.lang.model.element.ExecutableElement executableElement5 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable7 = modelAnnotationProcessor0.getCompletions(element3, annotationMirror4, executableElement5, "Ext.define(\"null\",{extend:\"\",config:{fields:[]}});");
        javax.lang.model.SourceVersion sourceVersion8 = modelAnnotationProcessor0.getSupportedSourceVersion();
        javax.lang.model.element.Element element9 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror10 = null;
        javax.lang.model.element.ExecutableElement executableElement11 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable13 = modelAnnotationProcessor0.getCompletions(element9, annotationMirror10, executableElement11, "Ext.define(\"null\",{extend:\"\",fields:[]});");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(wildcardIterable7);
        org.junit.Assert.assertTrue("'" + sourceVersion8 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion8.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(wildcardIterable13);
    }

    @Test
    public void test02021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02021");
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation3 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelFieldBean\",{extend:\"Ext.data.Model\",fields:[{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"dateFormat\",type:\"string\"},{name:\"useNull\",type:\"boolean\"},{name:\"allowNull\",type:\"boolean\"},{name:\"mapping\",type:\"string\"},{name:\"persist\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"convert\",type:\"string\"},{name:\"calculate\",type:\"string\"},{name:\"allowBlank\",type:\"boolean\"},{name:\"unique\",type:\"boolean\"}]});", (java.lang.Long) 97L, (java.lang.Long) 32L);
    }

    @Test
    public void test02022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02022");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        modelBean0.setIdProperty("");
        boolean boolean5 = modelBean0.isDisablePagingParameters();
        modelBean0.setExtend("");
        ch.rasc.extclassgenerator.PartialDataOptionsBean partialDataOptionsBean8 = modelBean0.getPartialDataOptions();
        modelBean0.setMessageProperty("hi!");
        ch.rasc.extclassgenerator.OutputFormat outputFormat11 = ch.rasc.extclassgenerator.OutputFormat.EXTJS5;
        java.lang.String str13 = ch.rasc.extclassgenerator.ModelGenerator.generateJavascript(modelBean0, outputFormat11, false);
        modelBean0.setClientIdPropertyAddToWriter(true);
        modelBean0.setClientIdPropertyAddToWriter(true);
        java.util.List<ch.rasc.extclassgenerator.association.AbstractAssociation> abstractAssociationList18 = modelBean0.getAssociations();
        modelBean0.setWriter("/Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});/");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(partialDataOptionsBean8);
        org.junit.Assert.assertTrue("'" + outputFormat11 + "' != '" + ch.rasc.extclassgenerator.OutputFormat.EXTJS5 + "'", outputFormat11.equals(ch.rasc.extclassgenerator.OutputFormat.EXTJS5));
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str13, "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNotNull(abstractAssociationList18);
    }

    @Test
    public void test02023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02023");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"debug\",\n    type : \"boolean\"\n  }, {\n    name : \"useSingleQuotes\",\n    type : \"boolean\"\n  }, {\n    name : \"surroundApiWithQuotes\",\n    type : \"boolean\"\n  } ]\n});", (java.lang.Long) 0L, (java.lang.Long) 52L);
    }

    @Test
    public void test02024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02024");
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
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean41 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean41.setConvert("hi!");
        modelFieldBean41.setMapping("hi!");
        java.lang.String str46 = modelFieldBean41.getMapping();
        java.lang.String[] strArray51 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray54 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList52);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray55 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("", (java.util.List<java.lang.String>) strList52);
        modelFieldBean41.setDepends((java.util.List<java.lang.String>) strList52);
        modelFieldBean2.setDepends((java.util.List<java.lang.String>) strList52);
        modelFieldBean2.setName("");
        modelFieldBean2.setUnique((java.lang.Boolean) true);
        java.lang.Boolean boolean62 = modelFieldBean2.getAllowBlank();
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
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNull(boolean62);
    }

    @Test
    public void test02025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02025");
        ch.rasc.extclassgenerator.validation.FormatValidation formatValidation2 = new ch.rasc.extclassgenerator.validation.FormatValidation("/\\/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});\\//", "exclusion");
        java.lang.String str3 = formatValidation2.getMatcher();
        java.lang.String str4 = formatValidation2.getMatcher();
        java.lang.String str5 = formatValidation2.getMatcher();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/exclusion/" + "'", str3, "/exclusion/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "/exclusion/" + "'", str4, "/exclusion/");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/exclusion/" + "'", str5, "/exclusion/");
    }

    @Test
    public void test02026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02026");
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
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray18 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("creditCardNumber", strList17);
        java.lang.String str19 = exclusionValidationArray18.getType();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "exclusion" + "'", str19, "exclusion");
    }

    @Test
    public void test02027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02027");
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
        java.lang.Boolean boolean30 = modelFieldBean2.getAllowNull();
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        java.lang.Boolean boolean33 = modelFieldBean2.getCritical();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(boolean25);
        org.junit.Assert.assertEquals("'" + boolean30 + "' != '" + false + "'", boolean30, false);
        org.junit.Assert.assertEquals("'" + boolean33 + "' != '" + true + "'", boolean33, true);
    }

    @Test
    public void test02028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02028");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("");
        belongsToAssociation1.setForeignKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        java.lang.String str4 = belongsToAssociation1.getType();
        java.lang.String str5 = belongsToAssociation1.getModel();
        belongsToAssociation1.setGetterName("Ext.define('Ext.define('ch.rasc.extclassgenerator.association.HasManyAssociation',\n{\n  extend : 'Ext.data.Model',\n  fields : [ {\n    name : 'autoLoad',\n    type : 'boolean'\n  }, {\n    name : 'name',\n    type : 'string'\n  }, {\n    name : 'type',\n    type : 'string'\n  }, {\n    name : 'model',\n    type : 'string'\n  }, {\n    name : 'associationKey',\n    type : 'string'\n  }, {\n    name : 'foreignKey',\n    type : 'string'\n  }, {\n    name : 'primaryKey',\n    type : 'string'\n  }, {\n    name : 'instanceName',\n    type : 'string'\n  } ]\n});',{extend:'',uses:['hi!'],fields:[],associations:[{type:'hasMany',model:'hi!'},{type:'hasMany',model:'hi!',associationKey:'Ext.define(\\'ch.rasc.extclassgenerator.ModelAnnotationProcessor\\',{extend:\\'Ext.data.Model\\',fields:[]});'},{type:'hasMany',model:'hi!',associationKey:'Ext.define(\\'ch.rasc.extclassgenerator.ModelAnnotationProcessor\\',{extend:\\'Ext.data.Model\\',fields:[]});'},{type:'hasMany',model:'hi!',foreignKey:''}]});");
        java.lang.String str8 = belongsToAssociation1.getSetterName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "belongsTo" + "'", str4, "belongsTo");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test02029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02029");
        ch.rasc.extclassgenerator.validation.PresenceValidation presenceValidation1 = new ch.rasc.extclassgenerator.validation.PresenceValidation("Ext.define(\"java.util.ArrayList\",{extend:\"Ext.data.Model\",fields:[]});");
    }

    @Test
    public void test02030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02030");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        ch.rasc.extclassgenerator.validation.GenericValidation genericValidation3 = new ch.rasc.extclassgenerator.validation.GenericValidation("/hasMany/", "Ext.define('Ext.define('ch.rasc.extclassgenerator.association.HasManyAssociation',\n{\n  extend : 'Ext.data.Model',\n  fields : [ {\n    name : 'autoLoad',\n    type : 'boolean'\n  }, {\n    name : 'name',\n    type : 'string'\n  }, {\n    name : 'type',\n    type : 'string'\n  }, {\n    name : 'model',\n    type : 'string'\n  }, {\n    name : 'associationKey',\n    type : 'string'\n  }, {\n    name : 'foreignKey',\n    type : 'string'\n  }, {\n    name : 'primaryKey',\n    type : 'string'\n  }, {\n    name : 'instanceName',\n    type : 'string'\n  } ]\n});',{extend:'',uses:['hi!'],fields:[],associations:[{type:'hasMany',model:'hi!'},{type:'hasMany',model:'hi!',associationKey:'Ext.define(\\'ch.rasc.extclassgenerator.ModelAnnotationProcessor\\',{extend:\\'Ext.data.Model\\',fields:[]});'},{type:'hasMany',model:'hi!',associationKey:'Ext.define(\\'ch.rasc.extclassgenerator.ModelAnnotationProcessor\\',{extend:\\'Ext.data.Model\\',fields:[]});'},{type:'hasMany',model:'hi!',foreignKey:''}]});", strMap2);
    }

    @Test
    public void test02031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02031");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("");
        java.lang.String str2 = belongsToAssociation1.getGetterName();
        belongsToAssociation1.setAssociationKey("belongsTo");
        belongsToAssociation1.setSetterName("Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[],proxy:{type:\"direct\",directFn:hi!,writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",config:{fields:[]}});\"}}}});");
        java.lang.String str7 = belongsToAssociation1.getModel();
        belongsToAssociation1.setPrimaryKey("/hi!/");
        belongsToAssociation1.setAssociationKey("Ext.define(\"ch.rasc.extclassgenerator.validation.PresenceValidation\",{extend:\"Ext.data.Model\",fields:[{name:\"type\",type:\"string\"},{name:\"field\",type:\"string\"}]});");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test02032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02032");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.data.Model");
        modelFieldBean2.setAllowNull((java.lang.Boolean) false);
        java.lang.String str5 = modelFieldBean2.getName();
        modelFieldBean2.setDateFormat("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        modelFieldBean2.setUnique((java.lang.Boolean) false);
        java.lang.Boolean boolean10 = modelFieldBean2.getPersist();
        modelFieldBean2.setConvert("/Ext.data.Model/");
        java.lang.Boolean boolean13 = modelFieldBean2.getPersist();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNull(boolean13);
    }

    @Test
    public void test02033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02033");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getChild();
        java.lang.String str2 = referenceBean0.getInverse();
        referenceBean0.setType("");
        referenceBean0.setRole("Ext.define(\"ch.rasc.extclassgenerator.validation.PresenceValidation\",{extend:\"Ext.data.Model\",fields:[{name:\"type\",type:\"string\"},{name:\"field\",type:\"string\"}]});");
        boolean boolean7 = referenceBean0.hasAnyProperties();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test02034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02034");
        ch.rasc.extclassgenerator.ModelType modelType1 = null;
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("", modelType1);
        java.lang.Boolean boolean3 = modelFieldBean2.getUnique();
        java.lang.String str4 = modelFieldBean2.getCalculate();
        modelFieldBean2.setAllowNull((java.lang.Boolean) true);
        java.util.List<ch.rasc.extclassgenerator.validation.AbstractValidation> abstractValidationList7 = modelFieldBean2.getValidators();
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(abstractValidationList7);
    }

    @Test
    public void test02035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02035");
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
        allDataOptionsBean0.setChanges((java.lang.Boolean) false);
        java.lang.Boolean boolean16 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean17 = allDataOptionsBean0.getChanges();
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + false + "'", boolean9, false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + true + "'", boolean13, true);
        org.junit.Assert.assertEquals("'" + boolean16 + "' != '" + true + "'", boolean16, true);
        org.junit.Assert.assertEquals("'" + boolean17 + "' != '" + false + "'", boolean17, false);
    }

    @Test
    public void test02036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02036");
        ch.rasc.extclassgenerator.validation.PresenceValidation presenceValidation1 = new ch.rasc.extclassgenerator.validation.PresenceValidation("/range/");
    }

    @Test
    public void test02037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02037");
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation3 = new ch.rasc.extclassgenerator.validation.RangeValidation("ch.rasc.extclassgenerator.PartialDataOptionsBean", (java.lang.Long) 35L, (java.lang.Long) 97L);
        java.math.BigDecimal bigDecimal4 = rangeValidation3.getMin();
        org.junit.Assert.assertNotNull(bigDecimal4);
    }

    @Test
    public void test02038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02038");
        ch.rasc.extclassgenerator.validation.NotBlankValidation notBlankValidation1 = new ch.rasc.extclassgenerator.validation.NotBlankValidation("length");
    }

    @Test
    public void test02039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02039");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("/Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});/", "/Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});/");
    }

    @Test
    public void test02040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02040");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("hi!");
        java.lang.String str2 = hasManyAssociation1.getAssociationKey();
        hasManyAssociation1.setAssociationKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        hasManyAssociation1.setAssociationKey("");
        hasManyAssociation1.setAssociationKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        hasManyAssociation1.setName("Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[],proxy:{type:\"direct\",directFn:hi!}});");
        hasManyAssociation1.setPrimaryKey("/hi!/");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test02041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02041");
        ch.rasc.extclassgenerator.validation.DigitsValidation digitsValidation3 = new ch.rasc.extclassgenerator.validation.DigitsValidation("hasMany", (int) (short) 0, (int) '#');
        java.lang.String str4 = digitsValidation3.getField();
        int int5 = digitsValidation3.getFraction();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hasMany" + "'", str4, "hasMany");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test02042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02042");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        belongsToAssociation1.setGetterName("presence");
    }

    @Test
    public void test02043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02043");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean3 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean3.setConvert("hi!");
        modelFieldBean3.setUseNull((java.lang.Boolean) true);
        java.lang.String str8 = modelFieldBean3.getName();
        java.lang.String str9 = modelFieldBean3.getCalculate();
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray17 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList15);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray18 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("digits", (java.util.List<java.lang.String>) strList15);
        java.util.List<java.lang.String> strList19 = inclusionValidationArray18.getList();
        java.util.List<java.lang.String> strList20 = inclusionValidationArray18.getList();
        modelFieldBean3.setReference((java.lang.Object) strList20);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray22 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("Ext.define(\"null\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ],\n    proxy : {\n      type : \"direct\",\n      reader : {\n        type : \"Ext.define(\\\"java.util.ArrayList\\\",\\r\\n{\\n  extend : \\\"Ext.data.Model\\\",\\n  fields : [ ]\\n});\"\n      }\n    }\n  }\n});", strList20);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test02044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02044");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        java.lang.String str1 = apiObject0.update;
        java.lang.String str2 = apiObject0.read;
        java.lang.String str3 = apiObject0.create;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test02045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02045");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.read;
        apiObject0.update = "hi!";
        apiObject0.create = "creditCardNumber";
        java.lang.String str8 = apiObject0.destroy;
        apiObject0.read = "hasOne";
        apiObject0.update = "belongsTo";
        java.lang.String str13 = apiObject0.create;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "creditCardNumber" + "'", str13, "creditCardNumber");
    }

    @Test
    public void test02046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02046");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        modelBean0.setIdProperty("");
        java.lang.String str5 = modelBean0.getIdentifier();
        modelBean0.setDisablePagingParameters(true);
        java.lang.String str8 = modelBean0.getRootProperty();
        java.lang.String str9 = modelBean0.getUpdateMethod();
        java.util.List<ch.rasc.extclassgenerator.validation.AbstractValidation> abstractValidationList10 = modelBean0.getValidations();
        modelBean0.setMessageProperty("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.util.List<ch.rasc.extclassgenerator.association.AbstractAssociation> abstractAssociationList13 = modelBean0.getAssociations();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(abstractValidationList10);
        org.junit.Assert.assertNotNull(abstractAssociationList13);
    }

    @Test
    public void test02047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02047");
        ch.rasc.extclassgenerator.validation.PastValidation pastValidation1 = new ch.rasc.extclassgenerator.validation.PastValidation("ch.rasc.extclassgenerator.ModelAnnotationProcessor");
    }

    @Test
    public void test02048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02048");
        ch.rasc.extclassgenerator.validation.NotBlankValidation notBlankValidation1 = new ch.rasc.extclassgenerator.validation.NotBlankValidation("presence");
    }

    @Test
    public void test02049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02049");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});/", (java.lang.Long) 1L, (java.lang.Long) 52L);
    }

    @Test
    public void test02050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02050");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.read = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str8 = apiObject0.update;
        java.lang.String str9 = apiObject0.destroy;
        apiObject0.destroy = "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.read = "";
        apiObject0.destroy = "Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str8, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test02051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02051");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getChild();
        java.lang.String str2 = referenceBean0.getRole();
        referenceBean0.setAssociation("");
        java.lang.String str5 = referenceBean0.getParent();
        referenceBean0.setParent("/\\/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});\\//");
        referenceBean0.setRole("inclusion");
        referenceBean0.setRole("");
        referenceBean0.setParent("belongsTo");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test02052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02052");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        referenceBean0.setType("");
        java.lang.String str3 = referenceBean0.getAssociation();
        referenceBean0.setInverse("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        java.lang.String str6 = referenceBean0.getAssociation();
        java.lang.String str7 = referenceBean0.getAssociation();
        java.lang.String str8 = referenceBean0.getAssociation();
        referenceBean0.setType("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test02053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02053");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("Ext.data.Model", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
        modelFieldBean2.setPersist((java.lang.Boolean) false);
        modelFieldBean2.setPersist((java.lang.Boolean) true);
    }

    @Test
    public void test02054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02054");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getChild();
        java.lang.String str2 = referenceBean0.getChild();
        referenceBean0.setAssociation("creditCardNumber");
        referenceBean0.setInverse("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        referenceBean0.setRole("exclusion");
        referenceBean0.setType("Ext.define(\"ch.rasc.extclassgenerator.LineEnding\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
        java.lang.String str11 = referenceBean0.getParent();
        java.lang.String str12 = referenceBean0.getInverse();
        java.lang.String str13 = referenceBean0.getParent();
        java.lang.String str14 = referenceBean0.getType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str12, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.LineEnding\",{extend:\"Ext.data.Model\",config:{fields:[]}});" + "'", str14, "Ext.define(\"ch.rasc.extclassgenerator.LineEnding\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
    }

    @Test
    public void test02055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02055");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        modelBean0.setIdProperty("");
        boolean boolean5 = modelBean0.isDisablePagingParameters();
        modelBean0.setExtend("");
        java.lang.String str8 = modelBean0.getSuccessProperty();
        ch.rasc.extclassgenerator.validation.FutureValidation futureValidation10 = new ch.rasc.extclassgenerator.validation.FutureValidation("/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/");
        java.lang.String str11 = futureValidation10.getField();
        modelBean0.addValidation((ch.rasc.extclassgenerator.validation.AbstractValidation) futureValidation10);
        modelBean0.setVersionProperty("ch.rasc.extclassgenerator.ModelAnnotationProcessor");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/" + "'", str11, "/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/");
    }

    @Test
    public void test02056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02056");
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
        modelFieldBean2.setName("hi!");
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        ch.rasc.extclassgenerator.ModelType modelType21 = modelFieldBean2.getModelType();
        modelFieldBean2.setPersist((java.lang.Boolean) true);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertNull(modelType21);
    }

    @Test
    public void test02057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02057");
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
        java.lang.Object obj51 = null;
        boolean boolean52 = outputConfig44.equals(obj51);
        outputConfig44.setSurroundApiWithQuotes(true);
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
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test02058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02058");
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
        java.lang.String str18 = apiObject0.create;
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});";
        apiObject0.read = "hasMany";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "json" + "'", str10, "json");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/" + "'", str11, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "belongsTo" + "'", str18, "belongsTo");
    }

    @Test
    public void test02059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02059");
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
        modelFieldBean2.setAllowNull((java.lang.Boolean) false);
        java.lang.Object obj22 = modelFieldBean2.getDefaultValue();
        java.lang.Boolean boolean23 = modelFieldBean2.getAllowNull();
        org.junit.Assert.assertNotNull(abstractValidationArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(strList19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + boolean23 + "' != '" + false + "'", boolean23, false);
    }

    @Test
    public void test02060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02060");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        modelFieldBean2.setDateFormat("hi!");
        java.lang.Boolean boolean8 = modelFieldBean2.getUseNull();
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        modelFieldBean2.setCalculate("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        modelFieldBean2.setAllowBlank((java.lang.Boolean) false);
        modelFieldBean2.setReference((java.lang.Object) "Ext.define(\"null\",{extend:\"\",config:{fields:[]}});");
        java.lang.String str17 = modelFieldBean2.getConvert();
        java.lang.Object obj18 = modelFieldBean2.getDefaultValue();
        java.lang.Boolean boolean19 = modelFieldBean2.getAllowBlank();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + boolean19 + "' != '" + false + "'", boolean19, false);
    }

    @Test
    public void test02061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02061");
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
        modelFieldBean2.setName("/Ext.data.Model/");
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
    public void test02062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02062");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        java.lang.String str6 = modelFieldBean2.getMapping();
        modelFieldBean2.setConvert("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation10 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        hasOneAssociation10.setInstanceName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setDefaultValue((java.lang.Object) hasOneAssociation10);
        hasOneAssociation10.setAssociationKey("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});");
        java.lang.String str16 = hasOneAssociation10.getName();
        java.lang.String str17 = hasOneAssociation10.getName();
        hasOneAssociation10.setName("hi!");
        java.lang.String str20 = hasOneAssociation10.getSetterName();
        hasOneAssociation10.setForeignKey("Ext.define(\"ch.rasc.extclassgenerator.association.BelongsToAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"setterName\",type:\"string\"},{name:\"getterName\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});");
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test02063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02063");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        modelBean0.setAutodetectTypes(true);
        modelBean0.setReader("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        modelBean0.setUpdateMethod("ch.rasc.extclassgenerator.OutputConfig");
        java.lang.String str9 = modelBean0.getCreateMethod();
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test02064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02064");
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
        java.lang.String str16 = apiObject0.create;
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str8, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str9, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str11, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ch.rasc.extclassgenerator.ModelAnnotationProcessor" + "'", str16, "ch.rasc.extclassgenerator.ModelAnnotationProcessor");
    }

    @Test
    public void test02065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02065");
        ch.rasc.extclassgenerator.validation.CreditCardNumberValidation creditCardNumberValidation1 = new ch.rasc.extclassgenerator.validation.CreditCardNumberValidation("Ext.define(\"ch.rasc.extclassgenerator.association.BelongsToAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"setterName\",\n    type : \"string\"\n  }, {\n    name : \"getterName\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
    }

    @Test
    public void test02066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02066");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});", "Ext.data.Model");
        java.lang.String str3 = modelFieldBean2.getMapping();
        modelFieldBean2.setMapping("ch.rasc.extclassgenerator.PartialDataOptionsBean");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test02067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02067");
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
        modelFieldBean2.setName("hi!");
        java.lang.Class<?> wildcardClass19 = modelFieldBean2.getClass();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test02068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02068");
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
        modelFieldBean2.setAllowNull((java.lang.Boolean) false);
        java.lang.Boolean boolean22 = modelFieldBean2.getUseNull();
        java.util.List<java.lang.String> strList23 = modelFieldBean2.getDepends();
        org.junit.Assert.assertNotNull(abstractValidationArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(strList19);
        org.junit.Assert.assertEquals("'" + boolean22 + "' != '" + false + "'", boolean22, false);
        org.junit.Assert.assertNull(strList23);
    }

    @Test
    public void test02069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02069");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        modelBean0.setIdProperty("");
        java.lang.String str5 = modelBean0.getIdentifier();
        modelBean0.setDisablePagingParameters(true);
        java.lang.String str8 = modelBean0.getRootProperty();
        java.lang.Boolean boolean9 = modelBean0.getWriteAllFields();
        modelBean0.setAutodetectTypes(true);
        ch.rasc.extclassgenerator.PartialDataOptionsBean partialDataOptionsBean12 = new ch.rasc.extclassgenerator.PartialDataOptionsBean();
        java.lang.Boolean boolean13 = partialDataOptionsBean12.getChanges();
        java.lang.Boolean boolean14 = partialDataOptionsBean12.getCritical();
        partialDataOptionsBean12.setCritical((java.lang.Boolean) true);
        partialDataOptionsBean12.setAssociated((java.lang.Boolean) false);
        modelBean0.setPartialDataOptions(partialDataOptionsBean12);
        java.lang.Boolean boolean20 = partialDataOptionsBean12.getCritical();
        partialDataOptionsBean12.setPersist((java.lang.Boolean) true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertEquals("'" + boolean20 + "' != '" + true + "'", boolean20, true);
    }

    @Test
    public void test02070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02070");
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
        java.lang.String str16 = apiObject0.destroy;
        apiObject0.destroy = "range";
        apiObject0.read = "";
        apiObject0.destroy = "/ch.rasc.extclassgenerator.PartialDataOptionsBean/";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "json" + "'", str10, "json");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/" + "'", str11, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test02071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02071");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("hi!");
        hasManyAssociation1.setAssociationKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str4 = hasManyAssociation1.getInstanceName();
        hasManyAssociation1.setName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        hasManyAssociation1.setPrimaryKey("");
        java.lang.Boolean boolean9 = hasManyAssociation1.getAutoLoad();
        hasManyAssociation1.setPrimaryKey("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        hasManyAssociation1.setAssociationKey("ch.rasc.extclassgenerator.ModelAnnotationProcessor");
        hasManyAssociation1.setName("/ch.rasc.extclassgenerator.ModelAnnotationProcessor/");
        hasManyAssociation1.setName("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        java.lang.String str18 = hasManyAssociation1.getModel();
        java.lang.String str19 = hasManyAssociation1.getType();
        java.lang.String str20 = hasManyAssociation1.getType();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hasMany" + "'", str19, "hasMany");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hasMany" + "'", str20, "hasMany");
    }

    @Test
    public void test02072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02072");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        modelFieldBean2.setCalculate("json");
        java.lang.Boolean boolean8 = modelFieldBean2.getCritical();
        java.lang.String str9 = modelFieldBean2.getMapping();
        modelFieldBean2.setUnique((java.lang.Boolean) false);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test02073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02073");
        ch.rasc.extclassgenerator.ModelAnnotationProcessor modelAnnotationProcessor0 = new ch.rasc.extclassgenerator.ModelAnnotationProcessor();
        java.util.Set<java.lang.String> strSet1 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        java.util.Set<java.lang.String> strSet2 = modelAnnotationProcessor0.getSupportedOptions();
        java.util.Set<java.lang.String> strSet3 = modelAnnotationProcessor0.getSupportedOptions();
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
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test02074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02074");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.read;
        apiObject0.update = "hi!";
        apiObject0.update = "ch.rasc.extclassgenerator.ModelAnnotationProcessor";
        java.lang.String str8 = apiObject0.create;
        apiObject0.read = "";
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test02075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02075");
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
        modelFieldBean2.setUseNull((java.lang.Boolean) false);
        modelFieldBean2.setCalculate("/range/");
        modelFieldBean2.setPersist((java.lang.Boolean) true);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNull(abstractValidationList13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test02076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02076");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});", "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        java.lang.String str3 = modelFieldBean2.getCalculate();
        modelFieldBean2.setUnique((java.lang.Boolean) true);
        java.lang.Boolean boolean6 = modelFieldBean2.getAllowNull();
        java.util.List<java.lang.String> strList7 = null;
        modelFieldBean2.setDepends(strList7);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(boolean6);
    }

    @Test
    public void test02077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02077");
        ch.rasc.extclassgenerator.validation.InclusionValidation inclusionValidation2 = new ch.rasc.extclassgenerator.validation.InclusionValidation("exclusion", "ch.rasc.extclassgenerator.ModelBean");
        java.lang.String str3 = inclusionValidation2.getList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ch.rasc.extclassgenerator.ModelBean" + "'", str3, "ch.rasc.extclassgenerator.ModelBean");
    }

    @Test
    public void test02078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02078");
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation3 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"null\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ],\n    proxy : {\n      type : \"direct\",\n      reader : {\n        type : \"Ext.define(\\\"java.util.ArrayList\\\",\\r\\n{\\n  extend : \\\"Ext.data.Model\\\",\\n  fields : [ ]\\n});\"\n      }\n    }\n  }\n});", (java.lang.Long) 32L, (java.lang.Long) 100L);
    }

    @Test
    public void test02079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02079");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray12 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList10);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray13 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("", (java.util.List<java.lang.String>) strList10);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray14 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("json", (java.util.List<java.lang.String>) strList10);
        java.util.List<java.lang.String> strList15 = exclusionValidationArray14.getList();
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray16 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("exclusion", strList15);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray17 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", strList15);
        java.util.List<java.lang.String> strList18 = exclusionValidationArray17.getList();
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray19 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("creditCardNumber", strList18);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray20 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("hasOne", strList18);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test02080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02080");
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
        modelFieldBean2.setCalculate("presence");
        java.lang.Boolean boolean20 = modelFieldBean2.getCritical();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertNull(boolean15);
        org.junit.Assert.assertNull(boolean20);
    }

    @Test
    public void test02081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02081");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("Ext.define(\"Ext.define(\"null\",{extend:\"Ext.data.Model\",idProperty:\"hi!\",fields:[],proxy:{type:\"direct\",idParam:\"hi!\"}});\",{extend:\"/\\\\/Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\\\\//\",uses:[\"hi!\"],fields:[],hasMany:[\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\",\"json\",\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\",\"\"],associations:[{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],proxy:{type:\"direct\",directFn:hi!}});", "Ext.define(\"ch.rasc.extclassgenerator.association.BelongsToAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"setterName\",type:\"string\"},{name:\"getterName\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});");
    }

    @Test
    public void test02082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02082");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean4 = allDataOptionsBean0.getCritical();
        java.lang.Boolean boolean5 = allDataOptionsBean0.getPersist();
        java.lang.Boolean boolean6 = allDataOptionsBean0.getChanges();
        java.lang.Boolean boolean7 = allDataOptionsBean0.getChanges();
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertNull(boolean7);
    }

    @Test
    public void test02083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02083");
        ch.rasc.extclassgenerator.validation.EmailValidation emailValidation1 = new ch.rasc.extclassgenerator.validation.EmailValidation("/belongsTo/");
    }

    @Test
    public void test02084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02084");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        java.lang.String str3 = modelBean0.getName();
        modelBean0.setSuccessProperty("json");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean6 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        java.lang.Boolean boolean7 = allDataOptionsBean6.getPersist();
        java.lang.Boolean boolean8 = allDataOptionsBean6.getPersist();
        allDataOptionsBean6.setChanges((java.lang.Boolean) true);
        allDataOptionsBean6.setCritical((java.lang.Boolean) false);
        allDataOptionsBean6.setCritical((java.lang.Boolean) false);
        modelBean0.setAllDataOptions(allDataOptionsBean6);
        ch.rasc.extclassgenerator.PartialDataOptionsBean partialDataOptionsBean16 = modelBean0.getPartialDataOptions();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertNull(partialDataOptionsBean16);
    }

    @Test
    public void test02085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02085");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getRole();
        referenceBean0.setChild("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        referenceBean0.setAssociation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        boolean boolean7 = referenceBean0.hasAnyProperties();
        boolean boolean8 = referenceBean0.typeOnly();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test02086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02086");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.read = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.update = "";
        apiObject0.read = "json";
        java.lang.String str12 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});";
        java.lang.String str15 = apiObject0.create;
        java.lang.String str16 = apiObject0.read;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});" + "'", str15, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "json" + "'", str16, "json");
    }

    @Test
    public void test02087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02087");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        java.lang.String str1 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str4 = apiObject0.update;
        java.lang.String str5 = apiObject0.create;
        apiObject0.create = "email";
        apiObject0.create = "hi!";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str5, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
    }

    @Test
    public void test02088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02088");
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
        java.lang.String str18 = modelFieldBean2.getMapping();
        java.lang.Boolean boolean19 = modelFieldBean2.getAllowBlank();
        java.lang.Class<?> wildcardClass20 = modelFieldBean2.getClass();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(boolean19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test02089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02089");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        ch.rasc.extclassgenerator.validation.GenericValidation genericValidation3 = new ch.rasc.extclassgenerator.validation.GenericValidation("/ch.rasc.extclassgenerator.ModelAnnotationProcessor/", "Ext.define(\"null\",\r\n{\n  extend : \"\",\n  fields : [ ],\n  hasMany : [ \"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\", \"json\", \"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\", \"\" ]\n});", strMap2);
    }

    @Test
    public void test02090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02090");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        java.lang.String str6 = referenceBean0.getAssociation();
        referenceBean0.setInverse("");
        java.lang.String str9 = referenceBean0.getParent();
        referenceBean0.setChild("digits");
        java.lang.String str12 = referenceBean0.getChild();
        referenceBean0.setRole("Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});");
        boolean boolean15 = referenceBean0.typeOnly();
        java.lang.Class<?> wildcardClass16 = referenceBean0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "digits" + "'", str12, "digits");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test02091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02091");
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
        modelFieldBean2.setDateFormat("/ch.rasc.extclassgenerator.ModelAnnotationProcessor/");
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str19, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
    }

    @Test
    public void test02092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02092");
        ch.rasc.extclassgenerator.validation.DigitsValidation digitsValidation3 = new ch.rasc.extclassgenerator.validation.DigitsValidation("", (int) ' ', (int) (byte) 1);
        int int4 = digitsValidation3.getInteger();
        java.lang.String str5 = digitsValidation3.getField();
        int int6 = digitsValidation3.getInteger();
        int int7 = digitsValidation3.getFraction();
        int int8 = digitsValidation3.getInteger();
        int int9 = digitsValidation3.getInteger();
        java.lang.String str10 = digitsValidation3.getField();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test02093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02093");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        java.lang.String str6 = modelFieldBean2.getMapping();
        modelFieldBean2.setConvert("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        ch.rasc.extclassgenerator.ModelType modelType9 = modelFieldBean2.getModelType();
        modelFieldBean2.setName("length");
        modelFieldBean2.setUnique((java.lang.Boolean) false);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(modelType9);
    }

    @Test
    public void test02094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02094");
        ch.rasc.extclassgenerator.validation.ExclusionValidation exclusionValidation2 = new ch.rasc.extclassgenerator.validation.ExclusionValidation("hi!", "ch.rasc.extclassgenerator.OutputConfig");
        java.lang.String str3 = exclusionValidation2.getList();
        java.lang.String str4 = exclusionValidation2.getField();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ch.rasc.extclassgenerator.OutputConfig" + "'", str3, "ch.rasc.extclassgenerator.OutputConfig");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test02095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02095");
        ch.rasc.extclassgenerator.validation.PresenceValidation presenceValidation1 = new ch.rasc.extclassgenerator.validation.PresenceValidation("/inclusion/");
    }

    @Test
    public void test02096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02096");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.data.Model");
        modelFieldBean2.setConvert("hasOne");
        java.lang.Object obj5 = modelFieldBean2.getReference();
        modelFieldBean2.setDateFormat("");
        java.lang.String str8 = modelFieldBean2.getDateFormat();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test02097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02097");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Integer) 35, (java.lang.Integer) 97);
    }

    @Test
    public void test02098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02098");
        ch.rasc.extclassgenerator.validation.InclusionValidation inclusionValidation2 = new ch.rasc.extclassgenerator.validation.InclusionValidation("Ext.define(\"null\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ],\n    proxy : {\n      type : \"direct\",\n      reader : {\n        type : \"Ext.define(\\\"java.util.ArrayList\\\",\\r\\n{\\n  extend : \\\"Ext.data.Model\\\",\\n  fields : [ ]\\n});\"\n      }\n    }\n  }\n});", "Ext.data.Model");
        java.lang.String str3 = inclusionValidation2.getList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.data.Model" + "'", str3, "Ext.data.Model");
    }

    @Test
    public void test02099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02099");
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
        modelBean0.setWriteAllFields((java.lang.Boolean) false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test02100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02100");
        ch.rasc.extclassgenerator.validation.FormatValidation formatValidation2 = new ch.rasc.extclassgenerator.validation.FormatValidation("Ext.define(\"java.util.ArrayList\",{extend:\"Ext.data.Model\",fields:[]});", "Ext.define(\"null\",{extend:\"\",fields:[]});");
    }

    @Test
    public void test02101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02101");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("");
        java.lang.String str2 = belongsToAssociation1.getInstanceName();
        belongsToAssociation1.setSetterName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        belongsToAssociation1.setGetterName("Ext.define(\"ch.rasc.extclassgenerator.association.BelongsToAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"setterName\",\n    type : \"string\"\n  }, {\n    name : \"getterName\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        belongsToAssociation1.setAssociationKey("Ext.define(\"null\",\r\n{\n  extend : \"\",\n  idgen : \"Ext.define(\\\"java.util.ArrayList\\\",\\r\\n{\\n  extend : \\\"Ext.data.Model\\\",\\n  fields : [ ]\\n});\",\n  fields : [ ],\n  proxy : {\n    type : \"direct\",\n    reader : {\n      root : \"Ext.define(\\\"null\\\",{extend:\\\"Ext.data.Model\\\",idProperty:\\\"hi!\\\",fields:[],proxy:{type:\\\"direct\\\",idParam:\\\"hi!\\\"}});\",\n      messageProperty : \"hi!\"\n    },\n    writer : {\n      writeAllFields : false\n    }\n  }\n});");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test02102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02102");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setDateFormat("hi!");
        ch.rasc.extclassgenerator.OutputConfig outputConfig5 = new ch.rasc.extclassgenerator.OutputConfig();
        boolean boolean6 = outputConfig5.isDebug();
        ch.rasc.extclassgenerator.OutputFormat outputFormat7 = outputConfig5.getOutputFormat();
        boolean boolean8 = outputConfig5.isDebug();
        boolean boolean9 = modelFieldBean2.hasOnlyName(outputConfig5);
        modelFieldBean2.setUseNull((java.lang.Boolean) false);
        java.lang.Boolean boolean12 = modelFieldBean2.getAllowBlank();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(outputFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(boolean12);
    }

    @Test
    public void test02103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02103");
        ch.rasc.extclassgenerator.validation.DigitsValidation digitsValidation3 = new ch.rasc.extclassgenerator.validation.DigitsValidation("digits", (int) (byte) 0, 32);
        int int4 = digitsValidation3.getFraction();
        int int5 = digitsValidation3.getInteger();
        java.lang.String str6 = digitsValidation3.getType();
        int int7 = digitsValidation3.getInteger();
        int int8 = digitsValidation3.getFraction();
        int int9 = digitsValidation3.getInteger();
        java.lang.String str10 = digitsValidation3.getType();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "digits" + "'", str6, "digits");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "digits" + "'", str10, "digits");
    }

    @Test
    public void test02104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02104");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        referenceBean0.setAssociation("belongsTo");
        referenceBean0.setAssociation("exclusion");
        referenceBean0.setAssociation("/ch.rasc.extclassgenerator.ModelAnnotationProcessor/");
        boolean boolean16 = referenceBean0.typeOnly();
        java.lang.String str17 = referenceBean0.getRole();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test02105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02105");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.update = "exclusion";
        java.lang.String str8 = apiObject0.update;
        java.lang.String str9 = apiObject0.update;
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});";
        apiObject0.create = "/ch.rasc.extclassgenerator.ModelAnnotationProcessor/";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "exclusion" + "'", str8, "exclusion");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "exclusion" + "'", str9, "exclusion");
    }

    @Test
    public void test02106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02106");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("");
        java.lang.String str2 = belongsToAssociation1.getInstanceName();
        belongsToAssociation1.setGetterName("json");
        java.lang.String str5 = belongsToAssociation1.getSetterName();
        belongsToAssociation1.setSetterName("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        java.lang.String str8 = belongsToAssociation1.getSetterName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});" + "'", str8, "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
    }

    @Test
    public void test02107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02107");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        ch.rasc.extclassgenerator.validation.GenericValidation genericValidation3 = new ch.rasc.extclassgenerator.validation.GenericValidation("Ext.define('ch.rasc.extclassgenerator.validation.CreditCardNumberValidation',{extend:'Ext.data.Model',config:{fields:[{name:'type',type:'string'},{name:'field',type:'string'}]}});", "future", strMap2);
    }

    @Test
    public void test02108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02108");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("presence", "Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
    }

    @Test
    public void test02109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02109");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        hasOneAssociation1.setGetterName("hi!");
        hasOneAssociation1.setSetterName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str6 = hasOneAssociation1.getInstanceName();
        hasOneAssociation1.setGetterName("Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"associated\",\n    type : \"boolean\"\n  }, {\n    name : \"changes\",\n    type : \"boolean\"\n  }, {\n    name : \"critical\",\n    type : \"boolean\"\n  }, {\n    name : \"persist\",\n    type : \"boolean\"\n  } ]\n});");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test02110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02110");
        ch.rasc.extclassgenerator.OutputConfig outputConfig0 = new ch.rasc.extclassgenerator.OutputConfig();
        outputConfig0.setSurroundApiWithQuotes(false);
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation6 = new ch.rasc.extclassgenerator.validation.LengthValidation("Ext.data.Model", (java.lang.Long) 10L, (java.lang.Long) 1L);
        boolean boolean7 = outputConfig0.equals((java.lang.Object) 1L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test02111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02111");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        modelFieldBean2.setUseNull((java.lang.Boolean) false);
        modelFieldBean2.setUnique((java.lang.Boolean) false);
    }

    @Test
    public void test02112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02112");
        ch.rasc.extclassgenerator.ModelAnnotationProcessor modelAnnotationProcessor0 = new ch.rasc.extclassgenerator.ModelAnnotationProcessor();
        java.util.Set<java.lang.String> strSet1 = modelAnnotationProcessor0.getSupportedOptions();
        java.util.Set<java.lang.String> strSet2 = modelAnnotationProcessor0.getSupportedOptions();
        java.util.Set<java.lang.String> strSet3 = modelAnnotationProcessor0.getSupportedOptions();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test02113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02113");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        java.lang.String str2 = hasOneAssociation1.getSetterName();
        hasOneAssociation1.setPrimaryKey("belongsTo");
        java.lang.String str5 = hasOneAssociation1.getSetterName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test02114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02114");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getChild();
        java.lang.String str2 = referenceBean0.getChild();
        referenceBean0.setAssociation("creditCardNumber");
        referenceBean0.setInverse("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        referenceBean0.setRole("exclusion");
        referenceBean0.setInverse("ch.rasc.extclassgenerator.PartialDataOptionsBean");
        java.lang.String str11 = referenceBean0.getAssociation();
        referenceBean0.setRole("digits");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "creditCardNumber" + "'", str11, "creditCardNumber");
    }

    @Test
    public void test02115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02115");
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
        modelFieldBean2.setUseNull((java.lang.Boolean) false);
        java.lang.String str20 = modelFieldBean2.getDateFormat();
        java.lang.String str21 = modelFieldBean2.getType();
        java.lang.Boolean boolean22 = modelFieldBean2.getAllowBlank();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertNull(boolean17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str21, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(boolean22);
    }

    @Test
    public void test02116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02116");
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
        java.lang.Object obj18 = modelFieldBean2.getDefaultValue();
        modelFieldBean2.setAllowBlank((java.lang.Boolean) true);
        modelFieldBean2.setUseNull((java.lang.Boolean) false);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test02117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02117");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});";
        apiObject0.destroy = "belongsTo";
        apiObject0.destroy = "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str10 = apiObject0.read;
        apiObject0.read = "";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test02118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02118");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        java.lang.String str4 = apiObject0.read;
        java.lang.String str5 = apiObject0.read;
        java.lang.String str6 = apiObject0.create;
        apiObject0.read = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test02119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02119");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("");
        belongsToAssociation1.setForeignKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        java.lang.String str4 = belongsToAssociation1.getType();
        java.lang.String str5 = belongsToAssociation1.getModel();
        belongsToAssociation1.setGetterName("Ext.define('Ext.define('ch.rasc.extclassgenerator.association.HasManyAssociation',\n{\n  extend : 'Ext.data.Model',\n  fields : [ {\n    name : 'autoLoad',\n    type : 'boolean'\n  }, {\n    name : 'name',\n    type : 'string'\n  }, {\n    name : 'type',\n    type : 'string'\n  }, {\n    name : 'model',\n    type : 'string'\n  }, {\n    name : 'associationKey',\n    type : 'string'\n  }, {\n    name : 'foreignKey',\n    type : 'string'\n  }, {\n    name : 'primaryKey',\n    type : 'string'\n  }, {\n    name : 'instanceName',\n    type : 'string'\n  } ]\n});',{extend:'',uses:['hi!'],fields:[],associations:[{type:'hasMany',model:'hi!'},{type:'hasMany',model:'hi!',associationKey:'Ext.define(\\'ch.rasc.extclassgenerator.ModelAnnotationProcessor\\',{extend:\\'Ext.data.Model\\',fields:[]});'},{type:'hasMany',model:'hi!',associationKey:'Ext.define(\\'ch.rasc.extclassgenerator.ModelAnnotationProcessor\\',{extend:\\'Ext.data.Model\\',fields:[]});'},{type:'hasMany',model:'hi!',foreignKey:''}]});");
        belongsToAssociation1.setGetterName("Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
        belongsToAssociation1.setInstanceName("hasMany");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "belongsTo" + "'", str4, "belongsTo");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test02120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02120");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("Ext.define(\"ch.rasc.extclassgenerator.LineEnding\",{extend:\"Ext.data.Model\",config:{fields:[]}});", (java.lang.Long) 35L, (java.lang.Long) 0L);
    }

    @Test
    public void test02121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02121");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        modelFieldBean2.setDateFormat("hi!");
        java.lang.Boolean boolean8 = modelFieldBean2.getUseNull();
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        modelFieldBean2.setCalculate("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        modelFieldBean2.setAllowBlank((java.lang.Boolean) false);
        modelFieldBean2.setReference((java.lang.Object) "Ext.define(\"null\",{extend:\"\",config:{fields:[]}});");
        java.lang.Boolean boolean17 = modelFieldBean2.getUnique();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertNull(boolean17);
    }

    @Test
    public void test02122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02122");
        ch.rasc.extclassgenerator.validation.PastValidation pastValidation1 = new ch.rasc.extclassgenerator.validation.PastValidation("Ext.define(\"null\",\r\n{\n  extend : \"\",\n  idgen : \"Ext.define(\\\"java.util.ArrayList\\\",\\r\\n{\\n  extend : \\\"Ext.data.Model\\\",\\n  fields : [ ]\\n});\",\n  fields : [ ],\n  proxy : {\n    type : \"direct\",\n    reader : {\n      root : \"Ext.define(\\\"null\\\",{extend:\\\"Ext.data.Model\\\",idProperty:\\\"hi!\\\",fields:[],proxy:{type:\\\"direct\\\",idParam:\\\"hi!\\\"}});\",\n      messageProperty : \"hi!\"\n    },\n    writer : {\n      writeAllFields : false\n    }\n  }\n});");
    }

    @Test
    public void test02123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02123");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        java.lang.String str3 = modelFieldBean2.getName();
        java.lang.Boolean boolean4 = modelFieldBean2.getCritical();
        modelFieldBean2.setAllowBlank((java.lang.Boolean) false);
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
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray30 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});", strList28);
        java.util.List<java.lang.String> strList31 = exclusionValidationArray30.getList();
        java.util.List<java.lang.String> strList32 = exclusionValidationArray30.getList();
        modelFieldBean2.setDepends(strList32);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(strList32);
    }

    @Test
    public void test02124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02124");
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation3 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", (java.lang.Long) 32L, (java.lang.Long) 0L);
    }

    @Test
    public void test02125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02125");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        boolean boolean3 = allDataOptionsBean0.hasAnyProperties();
        java.lang.Boolean boolean4 = allDataOptionsBean0.getPersist();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test02126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02126");
        ch.rasc.extclassgenerator.ModelType modelType1 = null;
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("digits", modelType1);
        ch.rasc.extclassgenerator.OutputConfig outputConfig3 = new ch.rasc.extclassgenerator.OutputConfig();
        boolean boolean4 = outputConfig3.isDebug();
        boolean boolean5 = outputConfig3.isSurroundApiWithQuotes();
        outputConfig3.setUseSingleQuotes(false);
        boolean boolean8 = modelFieldBean2.hasOnlyName(outputConfig3);
        outputConfig3.setDebug(true);
        ch.rasc.extclassgenerator.IncludeValidation includeValidation11 = outputConfig3.getIncludeValidation();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(includeValidation11);
    }

    @Test
    public void test02127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02127");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        java.lang.String str4 = apiObject0.read;
        java.lang.String str5 = apiObject0.destroy;
        apiObject0.create = "Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test02128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02128");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getType();
        referenceBean0.setRole("Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});");
        java.lang.String str4 = referenceBean0.getAssociation();
        java.lang.String str5 = referenceBean0.getChild();
        referenceBean0.setType("Ext.define(\"ch.rasc.extclassgenerator.association.BelongsToAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"setterName\",\n    type : \"string\"\n  }, {\n    name : \"getterName\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test02129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02129");
        ch.rasc.extclassgenerator.ModelValidation modelValidation1 = null;
        ch.rasc.extclassgenerator.IncludeValidation includeValidation2 = null;
        // The following exception was thrown during execution in test generation
        try {
            ch.rasc.extclassgenerator.validation.AbstractValidation abstractValidation3 = ch.rasc.extclassgenerator.validation.AbstractValidation.createValidation("/Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});/", modelValidation1, includeValidation2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02130");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        java.lang.String str3 = modelBean0.getIdProperty();
        modelBean0.setTotalProperty("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean8 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.Object obj9 = modelFieldBean8.getDefaultValue();
        java.lang.Object obj10 = modelFieldBean8.getDefaultValue();
        modelBean0.addField(modelFieldBean8);
        java.lang.Boolean boolean12 = modelFieldBean8.getCritical();
        java.lang.Boolean boolean13 = modelFieldBean8.getUnique();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertNull(boolean13);
    }

    @Test
    public void test02131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02131");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getInverse();
        java.lang.String str3 = referenceBean0.getInverse();
        referenceBean0.setAssociation("/\\/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});\\//");
        boolean boolean6 = referenceBean0.typeOnly();
        java.lang.String str7 = referenceBean0.getAssociation();
        boolean boolean8 = referenceBean0.hasAnyProperties();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/\\/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});\\//" + "'", str7, "/\\/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});\\//");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test02132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02132");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("hi!");
        hasManyAssociation1.setAssociationKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str4 = hasManyAssociation1.getInstanceName();
        java.lang.String str5 = hasManyAssociation1.getModel();
        hasManyAssociation1.setForeignKey("/ch.rasc.extclassgenerator.PartialDataOptionsBean/");
        hasManyAssociation1.setInstanceName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test02133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02133");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});/", (java.lang.Long) 10L, (java.lang.Long) 10L);
        java.lang.String str4 = lengthValidation3.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "length" + "'", str4, "length");
    }

    @Test
    public void test02134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02134");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        ch.rasc.extclassgenerator.ModelType modelType7 = modelFieldBean2.getModelType();
        java.lang.String str8 = modelFieldBean2.getDateFormat();
        java.lang.Boolean boolean9 = modelFieldBean2.getAllowBlank();
        modelFieldBean2.setMapping("/hasOne/");
        org.junit.Assert.assertNull(modelType7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void test02135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02135");
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
        java.lang.String str28 = modelFieldBean2.getMapping();
        modelFieldBean2.setAllowBlank((java.lang.Boolean) false);
        java.lang.Object obj31 = modelFieldBean2.getDefaultValue();
        modelFieldBean2.setCritical((java.lang.Boolean) true);
        modelFieldBean2.setDateFormat("email");
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(boolean23);
        org.junit.Assert.assertNull(boolean26);
        org.junit.Assert.assertNull(modelType27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(obj31);
    }

    @Test
    public void test02136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02136");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getParent();
        referenceBean0.setInverse("hi!");
        referenceBean0.setParent("exclusion");
        boolean boolean7 = referenceBean0.typeOnly();
        java.lang.String str8 = referenceBean0.getParent();
        java.lang.String str9 = referenceBean0.getParent();
        referenceBean0.setParent("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "exclusion" + "'", str8, "exclusion");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "exclusion" + "'", str9, "exclusion");
    }

    @Test
    public void test02137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02137");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getChild();
        java.lang.String str3 = referenceBean0.getAssociation();
        boolean boolean4 = referenceBean0.typeOnly();
        java.lang.String str5 = referenceBean0.getInverse();
        java.lang.String str6 = referenceBean0.getRole();
        referenceBean0.setInverse("Ext.define(\"ch.rasc.extclassgenerator.association.BelongsToAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ {\n      name : \"setterName\",\n      type : \"string\"\n    }, {\n      name : \"getterName\",\n      type : \"string\"\n    }, {\n      name : \"type\",\n      type : \"string\"\n    }, {\n      name : \"model\",\n      type : \"string\"\n    }, {\n      name : \"associationKey\",\n      type : \"string\"\n    }, {\n      name : \"foreignKey\",\n      type : \"string\"\n    }, {\n      name : \"primaryKey\",\n      type : \"string\"\n    }, {\n      name : \"instanceName\",\n      type : \"string\"\n    } ]\n  }\n});");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test02138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02138");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        hasOneAssociation1.setGetterName("hi!");
        hasOneAssociation1.setSetterName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str6 = hasOneAssociation1.getName();
        hasOneAssociation1.setForeignKey("exclusion");
        hasOneAssociation1.setSetterName("Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
        hasOneAssociation1.setGetterName("/inclusion/");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test02139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02139");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        java.lang.String str10 = referenceBean0.getType();
        referenceBean0.setChild("Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
        java.lang.String str13 = referenceBean0.getRole();
        java.lang.String str14 = referenceBean0.getType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test02140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02140");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getParent();
        referenceBean0.setType("");
        referenceBean0.setRole("json");
        boolean boolean7 = referenceBean0.typeOnly();
        referenceBean0.setType("Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
        referenceBean0.setRole("ch.rasc.extclassgenerator.ModelBean");
        java.lang.String str12 = referenceBean0.getParent();
        java.lang.String str13 = referenceBean0.getParent();
        boolean boolean14 = referenceBean0.typeOnly();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test02141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02141");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.data.Model");
        modelFieldBean2.setAllowNull((java.lang.Boolean) false);
        java.lang.String str5 = modelFieldBean2.getName();
        modelFieldBean2.setMapping("hi!");
        java.lang.Boolean boolean8 = modelFieldBean2.getUseNull();
        java.lang.Object obj9 = modelFieldBean2.getReference();
        java.lang.Boolean boolean10 = modelFieldBean2.getUseNull();
        java.lang.Object obj11 = modelFieldBean2.getReference();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + false + "'", boolean8, false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + false + "'", boolean10, false);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test02142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02142");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        java.lang.String str2 = hasOneAssociation1.getName();
        hasOneAssociation1.setInstanceName("");
        hasOneAssociation1.setName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str7 = hasOneAssociation1.getForeignKey();
        hasOneAssociation1.setGetterName("Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});");
        hasOneAssociation1.setForeignKey("Ext.define(\"null\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ],\n    proxy : {\n      type : \"direct\",\n      reader : {\n        type : \"Ext.define(\\\"java.util.ArrayList\\\",\\r\\n{\\n  extend : \\\"Ext.data.Model\\\",\\n  fields : [ ]\\n});\"\n      }\n    }\n  }\n});");
        hasOneAssociation1.setForeignKey("length");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test02143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02143");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("hi!");
        java.lang.String str2 = hasManyAssociation1.getAssociationKey();
        hasManyAssociation1.setAssociationKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        hasManyAssociation1.setAssociationKey("");
        java.lang.Boolean boolean7 = hasManyAssociation1.getAutoLoad();
        java.lang.String str8 = hasManyAssociation1.getAssociationKey();
        hasManyAssociation1.setName("exclusion");
        hasManyAssociation1.setAutoLoad((java.lang.Boolean) false);
        java.lang.String str13 = hasManyAssociation1.getModel();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test02144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02144");
        ch.rasc.extclassgenerator.validation.PastValidation pastValidation1 = new ch.rasc.extclassgenerator.validation.PastValidation("format");
    }

    @Test
    public void test02145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02145");
        ch.rasc.extclassgenerator.validation.ExclusionValidation exclusionValidation2 = new ch.rasc.extclassgenerator.validation.ExclusionValidation("hi!", "");
        java.lang.String str3 = exclusionValidation2.getList();
        java.lang.String str4 = exclusionValidation2.getList();
        java.lang.String str5 = exclusionValidation2.getList();
        java.lang.String str6 = exclusionValidation2.getList();
        java.lang.String str7 = exclusionValidation2.getField();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test02146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02146");
        ch.rasc.extclassgenerator.validation.EmailValidation emailValidation1 = new ch.rasc.extclassgenerator.validation.EmailValidation("/inclusion/");
    }

    @Test
    public void test02147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02147");
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
        java.util.Set<java.lang.String> strSet15 = modelAnnotationProcessor0.getSupportedOptions();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(wildcardIterable7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(wildcardIterable13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test02148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02148");
        ch.rasc.extclassgenerator.validation.FormatValidation formatValidation2 = new ch.rasc.extclassgenerator.validation.FormatValidation("past", "hasMany");
    }

    @Test
    public void test02149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02149");
        ch.rasc.extclassgenerator.ModelType modelType1 = null;
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ {\n      name : \"debug\",\n      type : \"boolean\"\n    }, {\n      name : \"useSingleQuotes\",\n      type : \"boolean\"\n    }, {\n      name : \"surroundApiWithQuotes\",\n      type : \"boolean\"\n    } ]\n  }\n});", modelType1);
        java.lang.Boolean boolean3 = modelFieldBean2.getUnique();
        org.junit.Assert.assertNull(boolean3);
    }

    @Test
    public void test02150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02150");
        ch.rasc.extclassgenerator.validation.FormatValidation formatValidation2 = new ch.rasc.extclassgenerator.validation.FormatValidation("/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/", "/range/");
        java.lang.String str3 = formatValidation2.getMatcher();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/\\/range\\//" + "'", str3, "/\\/range\\//");
    }

    @Test
    public void test02151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02151");
        ch.rasc.extclassgenerator.validation.DigitsValidation digitsValidation3 = new ch.rasc.extclassgenerator.validation.DigitsValidation("hasOne", (int) (byte) 100, (int) (byte) -1);
        int int4 = digitsValidation3.getInteger();
        int int5 = digitsValidation3.getFraction();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test02152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02152");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        modelBean0.setAutodetectTypes(true);
        modelBean0.setReadMethod("/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/");
        java.lang.String str7 = modelBean0.getRootProperty();
        modelBean0.setCreateMethod("");
        modelBean0.setUpdateMethod("inclusion");
        java.lang.Boolean boolean12 = modelBean0.getWriteAllFields();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(boolean12);
    }

    @Test
    public void test02153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02153");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        modelFieldBean2.setMapping("hi!");
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        modelFieldBean2.setAllowBlank((java.lang.Boolean) false);
        modelFieldBean2.setConvert("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        java.lang.String str13 = modelFieldBean2.getDateFormat();
        java.lang.String str14 = modelFieldBean2.getMapping();
        java.lang.Boolean boolean15 = modelFieldBean2.getAllowNull();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + boolean15 + "' != '" + true + "'", boolean15, true);
    }

    @Test
    public void test02154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02154");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        modelBean0.setIdProperty("");
        java.lang.String str5 = modelBean0.getIdentifier();
        modelBean0.setDisablePagingParameters(true);
        java.lang.String str8 = modelBean0.getRootProperty();
        java.lang.Boolean boolean9 = modelBean0.getWriteAllFields();
        modelBean0.setAutodetectTypes(true);
        modelBean0.setIdentifier("Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[],proxy:{type:\"direct\",directFn:hi!,writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",config:{fields:[]}});\"}}}});");
        java.lang.Boolean boolean14 = modelBean0.getWriteAllFields();
        java.lang.String[] strArray15 = modelBean0.getHasMany();
        java.lang.String str16 = modelBean0.getMessageProperty();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test02155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02155");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("Ext.define(\"Ext.define(\"null\",{extend:\"Ext.data.Model\",idProperty:\"hi!\",fields:[],proxy:{type:\"direct\",idParam:\"hi!\"}});\",{extend:\"/\\\\/Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\\\\//\",uses:[\"hi!\"],fields:[],hasMany:[\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\",\"json\",\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\",\"\"],associations:[{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],proxy:{type:\"direct\",directFn:hi!}});", "Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"associated\",\n    type : \"boolean\"\n  }, {\n    name : \"changes\",\n    type : \"boolean\"\n  }, {\n    name : \"critical\",\n    type : \"boolean\"\n  }, {\n    name : \"persist\",\n    type : \"boolean\"\n  } ]\n});");
    }

    @Test
    public void test02156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02156");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("hi!");
        hasManyAssociation1.setAssociationKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str4 = hasManyAssociation1.getInstanceName();
        hasManyAssociation1.setName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        hasManyAssociation1.setPrimaryKey("");
        java.lang.String str9 = hasManyAssociation1.getName();
        java.lang.String str10 = hasManyAssociation1.getName();
        hasManyAssociation1.setAssociationKey("belongsTo");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str9, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str10, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
    }

    @Test
    public void test02157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02157");
        ch.rasc.extclassgenerator.validation.EmailValidation emailValidation1 = new ch.rasc.extclassgenerator.validation.EmailValidation("Ext.define(\"ch.rasc.extclassgenerator.AllDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});");
    }

    @Test
    public void test02158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02158");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        hasManyAssociation1.setAutoLoad((java.lang.Boolean) false);
        java.lang.String str4 = hasManyAssociation1.getName();
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test02159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02159");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        java.lang.String str7 = modelFieldBean2.getName();
        java.lang.String str8 = modelFieldBean2.getCalculate();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray16 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList14);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray17 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("digits", (java.util.List<java.lang.String>) strList14);
        java.util.List<java.lang.String> strList18 = inclusionValidationArray17.getList();
        java.util.List<java.lang.String> strList19 = inclusionValidationArray17.getList();
        modelFieldBean2.setReference((java.lang.Object) strList19);
        java.lang.String str21 = modelFieldBean2.getDateFormat();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test02160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02160");
        ch.rasc.extclassgenerator.PartialDataOptionsBean partialDataOptionsBean0 = new ch.rasc.extclassgenerator.PartialDataOptionsBean();
        java.lang.Boolean boolean1 = partialDataOptionsBean0.getChanges();
        java.lang.Boolean boolean2 = partialDataOptionsBean0.getCritical();
        partialDataOptionsBean0.setCritical((java.lang.Boolean) true);
        partialDataOptionsBean0.setAssociated((java.lang.Boolean) true);
        java.lang.Boolean boolean7 = partialDataOptionsBean0.getPersist();
        partialDataOptionsBean0.setCritical((java.lang.Boolean) false);
        partialDataOptionsBean0.setChanges((java.lang.Boolean) false);
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNull(boolean7);
    }

    @Test
    public void test02161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02161");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        ch.rasc.extclassgenerator.validation.GenericValidation genericValidation3 = new ch.rasc.extclassgenerator.validation.GenericValidation("/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/", "length", strMap2);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = genericValidation3.getOptions();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = genericValidation3.getOptions();
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strMap5);
    }

    @Test
    public void test02162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02162");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        java.lang.String str3 = modelBean0.getReadMethod();
        java.lang.String str4 = modelBean0.getCreateMethod();
        modelBean0.setPaging(true);
        modelBean0.setIdProperty("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});/");
        java.lang.Boolean boolean9 = modelBean0.getWriteAllFields();
        boolean boolean10 = modelBean0.isPaging();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test02163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02163");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        referenceBean0.setParent("");
        java.lang.String str12 = referenceBean0.getParent();
        referenceBean0.setInverse("/Ext.data.Model/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test02164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02164");
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
        java.lang.String str18 = referenceBean0.getInverse();
        java.lang.String str19 = referenceBean0.getAssociation();
        java.lang.String str20 = referenceBean0.getRole();
        referenceBean0.setType("Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",{extend:\"Ext.data.Model\",fields:[{name:\"debug\",type:\"boolean\"},{name:\"useSingleQuotes\",type:\"boolean\"},{name:\"surroundApiWithQuotes\",type:\"boolean\"}]});");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str19, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test02165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02165");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean4 = allDataOptionsBean0.getCritical();
        allDataOptionsBean0.setCritical((java.lang.Boolean) true);
        boolean boolean7 = allDataOptionsBean0.hasAnyProperties();
        allDataOptionsBean0.setPersist((java.lang.Boolean) true);
        java.lang.Boolean boolean10 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean11 = allDataOptionsBean0.getPersist();
        java.lang.Boolean boolean12 = allDataOptionsBean0.getAssociated();
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + false + "'", boolean10, false);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + false + "'", boolean12, false);
    }

    @Test
    public void test02166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02166");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.data.Model");
        modelFieldBean2.setAllowNull((java.lang.Boolean) false);
        java.lang.String str5 = modelFieldBean2.getName();
        modelFieldBean2.setDateFormat("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        modelFieldBean2.setUnique((java.lang.Boolean) false);
        java.util.List<java.lang.String> strList10 = modelFieldBean2.getDepends();
        modelFieldBean2.setAllowNull((java.lang.Boolean) false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(strList10);
    }

    @Test
    public void test02167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02167");
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
        java.lang.String str21 = modelFieldBean2.getConvert();
        modelFieldBean2.setName("Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});");
        modelFieldBean2.setPersist((java.lang.Boolean) true);
        modelFieldBean2.setUnique((java.lang.Boolean) false);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertNull(boolean17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test02168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02168");
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
        java.lang.String str23 = modelFieldBean2.getDateFormat();
        java.lang.String str24 = modelFieldBean2.getDateFormat();
        modelFieldBean2.setDateFormat("Ext.define(\"Ext.define(\"null\",{extend:\"Ext.data.Model\",idProperty:\"hi!\",fields:[],proxy:{type:\"direct\",idParam:\"hi!\"}});\",{extend:\"/\\\\/Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\\\\//\",uses:[\"hi!\"],fields:[],hasMany:[\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\",\"json\",\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\",\"\"],associations:[{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],proxy:{type:\"direct\",directFn:hi!}});");
        org.junit.Assert.assertNotNull(abstractValidationArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test02169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02169");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getChild();
        java.lang.String str2 = referenceBean0.getInverse();
        boolean boolean3 = referenceBean0.hasAnyProperties();
        referenceBean0.setChild("");
        referenceBean0.setRole("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
        referenceBean0.setParent("Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test02170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02170");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("digits");
        java.lang.String str2 = belongsToAssociation1.getModel();
        java.lang.String str3 = belongsToAssociation1.getSetterName();
        java.lang.String str4 = belongsToAssociation1.getType();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "digits" + "'", str2, "digits");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "belongsTo" + "'", str4, "belongsTo");
    }

    @Test
    public void test02171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02171");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.update = "exclusion";
        java.lang.String str8 = apiObject0.update;
        java.lang.String str9 = apiObject0.read;
        apiObject0.create = "/\\/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});\\//";
        apiObject0.read = "Ext.define(\"ch.rasc.extclassgenerator.association.BelongsToAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"setterName\",type:\"string\"},{name:\"getterName\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "exclusion" + "'", str8, "exclusion");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test02172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02172");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        java.lang.String str6 = modelFieldBean2.getMapping();
        java.lang.Boolean boolean7 = modelFieldBean2.getAllowNull();
        java.lang.Class<?> wildcardClass8 = modelFieldBean2.getClass();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test02173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02173");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        modelBean0.setIdProperty("");
        boolean boolean5 = modelBean0.isDisablePagingParameters();
        modelBean0.setExtend("");
        ch.rasc.extclassgenerator.PartialDataOptionsBean partialDataOptionsBean8 = modelBean0.getPartialDataOptions();
        modelBean0.setMessageProperty("hi!");
        ch.rasc.extclassgenerator.OutputFormat outputFormat11 = ch.rasc.extclassgenerator.OutputFormat.EXTJS5;
        java.lang.String str13 = ch.rasc.extclassgenerator.ModelGenerator.generateJavascript(modelBean0, outputFormat11, false);
        modelBean0.setClientIdPropertyAddToWriter(true);
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean18 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean18.setConvert("hi!");
        java.lang.Boolean boolean21 = modelFieldBean18.getPersist();
        java.lang.String str22 = modelFieldBean18.getMapping();
        modelFieldBean18.setConvert("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation26 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        hasOneAssociation26.setInstanceName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean18.setDefaultValue((java.lang.Object) hasOneAssociation26);
        modelBean0.addAssociation((ch.rasc.extclassgenerator.association.AbstractAssociation) hasOneAssociation26);
        hasOneAssociation26.setGetterName("Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ {\n      name : \"debug\",\n      type : \"boolean\"\n    }, {\n      name : \"useSingleQuotes\",\n      type : \"boolean\"\n    }, {\n      name : \"surroundApiWithQuotes\",\n      type : \"boolean\"\n    } ]\n  }\n});");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(partialDataOptionsBean8);
        org.junit.Assert.assertTrue("'" + outputFormat11 + "' != '" + ch.rasc.extclassgenerator.OutputFormat.EXTJS5 + "'", outputFormat11.equals(ch.rasc.extclassgenerator.OutputFormat.EXTJS5));
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str13, "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(boolean21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test02174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02174");
        ch.rasc.extclassgenerator.validation.PastValidation pastValidation1 = new ch.rasc.extclassgenerator.validation.PastValidation("Ext.define(\"ch.rasc.extclassgenerator.association.BelongsToAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"setterName\",\n    type : \"string\"\n  }, {\n    name : \"getterName\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
    }

    @Test
    public void test02175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02175");
        ch.rasc.extclassgenerator.validation.ExclusionValidation exclusionValidation2 = new ch.rasc.extclassgenerator.validation.ExclusionValidation("exclusion", "/Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});/");
    }

    @Test
    public void test02176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02176");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str2 = hasOneAssociation1.getGetterName();
        hasOneAssociation1.setGetterName("");
        java.lang.String str5 = hasOneAssociation1.getGetterName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test02177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02177");
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
        modelFieldBean2.setAllowBlank((java.lang.Boolean) false);
        modelFieldBean2.setAllowNull((java.lang.Boolean) false);
        java.lang.Object obj23 = modelFieldBean2.getReference();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test02178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02178");
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
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean18 = modelBean0.getField("/hasMany/");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(partialDataOptionsBean8);
        org.junit.Assert.assertNull(modelFieldBean18);
    }

    @Test
    public void test02179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02179");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        modelFieldBean2.setPersist((java.lang.Boolean) false);
        java.lang.Boolean boolean5 = modelFieldBean2.getUseNull();
        java.lang.Boolean boolean6 = modelFieldBean2.getUseNull();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean6);
    }

    @Test
    public void test02180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02180");
        ch.rasc.extclassgenerator.ModelAnnotationProcessor modelAnnotationProcessor0 = new ch.rasc.extclassgenerator.ModelAnnotationProcessor();
        java.util.Set<java.lang.String> strSet1 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        javax.lang.model.SourceVersion sourceVersion2 = modelAnnotationProcessor0.getSupportedSourceVersion();
        java.util.Set<java.lang.String> strSet3 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        javax.lang.model.element.Element element4 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror5 = null;
        javax.lang.model.element.ExecutableElement executableElement6 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable8 = modelAnnotationProcessor0.getCompletions(element4, annotationMirror5, executableElement6, "/Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});/");
        javax.annotation.processing.ProcessingEnvironment processingEnvironment9 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelAnnotationProcessor0.init(processingEnvironment9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Tool provided null ProcessingEnvironment");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertTrue("'" + sourceVersion2 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion2.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(wildcardIterable8);
    }

    @Test
    public void test02181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02181");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        ch.rasc.extclassgenerator.validation.GenericValidation genericValidation3 = new ch.rasc.extclassgenerator.validation.GenericValidation("", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});", strMap2);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = genericValidation3.getOptions();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = genericValidation3.getOptions();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = genericValidation3.getOptions();
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
    }

    @Test
    public void test02182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02182");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("hi!");
        hasManyAssociation1.setAssociationKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str4 = hasManyAssociation1.getInstanceName();
        hasManyAssociation1.setPrimaryKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str7 = hasManyAssociation1.getForeignKey();
        hasManyAssociation1.setInstanceName("hi!");
        hasManyAssociation1.setPrimaryKey("hi!");
        java.lang.String str12 = hasManyAssociation1.getName();
        hasManyAssociation1.setAutoLoad((java.lang.Boolean) false);
        java.lang.String str15 = hasManyAssociation1.getForeignKey();
        hasManyAssociation1.setInstanceName("/hasMany/");
        java.lang.String str18 = hasManyAssociation1.getForeignKey();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test02183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02183");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str2 = belongsToAssociation1.getSetterName();
        java.lang.String str3 = belongsToAssociation1.getGetterName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test02184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02184");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        modelFieldBean2.setDateFormat("hi!");
        java.lang.Boolean boolean8 = modelFieldBean2.getUseNull();
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        modelFieldBean2.setCalculate("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        modelFieldBean2.setAllowBlank((java.lang.Boolean) false);
        modelFieldBean2.setMapping("Ext.define(\"null\",\r\n{\n  extend : \"\",\n  fields : [ ],\n  hasMany : [ \"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\", \"json\", \"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\", \"\" ]\n});");
        java.lang.Class<?> wildcardClass17 = modelFieldBean2.getClass();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test02185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02185");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean4 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean4.setConvert("hi!");
        modelFieldBean4.setMapping("hi!");
        modelFieldBean4.setUseNull((java.lang.Boolean) true);
        modelFieldBean4.setAllowBlank((java.lang.Boolean) false);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray20 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList18);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray21 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("", (java.util.List<java.lang.String>) strList18);
        java.util.List<java.lang.String> strList22 = exclusionValidationArray21.getList();
        modelFieldBean4.setDepends(strList22);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray24 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", strList22);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray25 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("digits", strList22);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strList22);
    }

    @Test
    public void test02186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02186");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("Ext.define(\"ch.rasc.extclassgenerator.association.BelongsToAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"setterName\",type:\"string\"},{name:\"getterName\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});", (java.lang.Integer) 10, (java.lang.Integer) 52);
    }

    @Test
    public void test02187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02187");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getChild();
        java.lang.String str2 = referenceBean0.getChild();
        referenceBean0.setAssociation("creditCardNumber");
        referenceBean0.setInverse("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        boolean boolean7 = referenceBean0.hasAnyProperties();
        java.lang.String str8 = referenceBean0.getInverse();
        referenceBean0.setChild("/belongsTo/");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str8, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
    }

    @Test
    public void test02188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02188");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        boolean boolean1 = allDataOptionsBean0.hasAnyProperties();
        allDataOptionsBean0.setPersist((java.lang.Boolean) true);
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        allDataOptionsBean0.setCritical((java.lang.Boolean) false);
        boolean boolean8 = allDataOptionsBean0.hasAnyProperties();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test02189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02189");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("");
        java.lang.String str2 = belongsToAssociation1.getInstanceName();
        belongsToAssociation1.setGetterName("json");
        java.lang.String str5 = belongsToAssociation1.getSetterName();
        belongsToAssociation1.setForeignKey("Ext.data.Model");
        java.lang.String str8 = belongsToAssociation1.getSetterName();
        java.lang.String str9 = belongsToAssociation1.getGetterName();
        belongsToAssociation1.setAssociationKey("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});/");
        java.lang.String str12 = belongsToAssociation1.getSetterName();
        java.lang.String str13 = belongsToAssociation1.getGetterName();
        belongsToAssociation1.setSetterName("notBlank");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "json" + "'", str9, "json");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "json" + "'", str13, "json");
    }

    @Test
    public void test02190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02190");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        ch.rasc.extclassgenerator.validation.GenericValidation genericValidation3 = new ch.rasc.extclassgenerator.validation.GenericValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});", "Ext.define(\"null\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ],\n    proxy : {\n      type : \"direct\",\n      reader : {\n        type : \"Ext.define(\\\"java.util.ArrayList\\\",\\r\\n{\\n  extend : \\\"Ext.data.Model\\\",\\n  fields : [ ]\\n});\"\n      }\n    }\n  }\n});", strMap2);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = genericValidation3.getOptions();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = genericValidation3.getOptions();
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strMap5);
    }

    @Test
    public void test02191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02191");
        ch.rasc.extclassgenerator.OutputConfig outputConfig0 = new ch.rasc.extclassgenerator.OutputConfig();
        boolean boolean1 = outputConfig0.isSurroundApiWithQuotes();
        boolean boolean2 = outputConfig0.isSurroundApiWithQuotes();
        outputConfig0.setSurroundApiWithQuotes(true);
        outputConfig0.setSurroundApiWithQuotes(true);
        ch.rasc.extclassgenerator.OutputFormat outputFormat7 = outputConfig0.getOutputFormat();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(outputFormat7);
    }

    @Test
    public void test02192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02192");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        java.lang.String str1 = apiObject0.update;
        java.lang.String str2 = apiObject0.update;
        java.lang.String str3 = apiObject0.destroy;
        java.lang.String str4 = apiObject0.read;
        apiObject0.destroy = "json";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test02193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02193");
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
        java.lang.String str49 = modelFieldBean2.getDateFormat();
        modelFieldBean2.setConvert("Ext.define(\"ch.rasc.extclassgenerator.LineEnding\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
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
        org.junit.Assert.assertNull(str49);
    }

    @Test
    public void test02194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02194");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        boolean boolean4 = allDataOptionsBean0.hasAnyProperties();
        java.lang.Boolean boolean5 = allDataOptionsBean0.getChanges();
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(boolean5);
    }

    @Test
    public void test02195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02195");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        java.lang.Boolean boolean1 = allDataOptionsBean0.getPersist();
        java.lang.Boolean boolean2 = allDataOptionsBean0.getPersist();
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean4 = allDataOptionsBean0.getCritical();
        allDataOptionsBean0.setChanges((java.lang.Boolean) false);
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test02196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02196");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        java.lang.String str6 = referenceBean0.getAssociation();
        referenceBean0.setInverse("");
        java.lang.String str9 = referenceBean0.getChild();
        java.lang.String str10 = referenceBean0.getAssociation();
        java.lang.String str11 = referenceBean0.getInverse();
        referenceBean0.setParent("ch.rasc.extclassgenerator.association.HasManyAssociation");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test02197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02197");
        ch.rasc.extclassgenerator.validation.ExclusionValidation exclusionValidation2 = new ch.rasc.extclassgenerator.validation.ExclusionValidation("Ext.define(\"ch.rasc.extclassgenerator.association.BelongsToAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"setterName\",type:\"string\"},{name:\"getterName\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});", "hasOne");
    }

    @Test
    public void test02198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02198");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        referenceBean0.setType("");
        java.lang.String str3 = referenceBean0.getAssociation();
        referenceBean0.setInverse("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        java.lang.String str6 = referenceBean0.getAssociation();
        referenceBean0.setParent("/hasMany/");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test02199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02199");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("Ext.define('Ext.define('ch.rasc.extclassgenerator.association.HasManyAssociation',\n{\n  extend : 'Ext.data.Model',\n  fields : [ {\n    name : 'autoLoad',\n    type : 'boolean'\n  }, {\n    name : 'name',\n    type : 'string'\n  }, {\n    name : 'type',\n    type : 'string'\n  }, {\n    name : 'model',\n    type : 'string'\n  }, {\n    name : 'associationKey',\n    type : 'string'\n  }, {\n    name : 'foreignKey',\n    type : 'string'\n  }, {\n    name : 'primaryKey',\n    type : 'string'\n  }, {\n    name : 'instanceName',\n    type : 'string'\n  } ]\n});',{extend:'',uses:['hi!'],fields:[],associations:[{type:'hasMany',model:'hi!'},{type:'hasMany',model:'hi!',associationKey:'Ext.define(\\'ch.rasc.extclassgenerator.ModelAnnotationProcessor\\',{extend:\\'Ext.data.Model\\',fields:[]});'},{type:'hasMany',model:'hi!',associationKey:'Ext.define(\\'ch.rasc.extclassgenerator.ModelAnnotationProcessor\\',{extend:\\'Ext.data.Model\\',fields:[]});'},{type:'hasMany',model:'hi!',foreignKey:''}]});", (java.lang.Long) 52L, (java.lang.Long) 1L);
    }

    @Test
    public void test02200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02200");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getChild();
        java.lang.String str2 = referenceBean0.getChild();
        referenceBean0.setRole("json");
        referenceBean0.setChild("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        referenceBean0.setInverse("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        referenceBean0.setChild("past");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test02201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02201");
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
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean23 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean23.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean26 = allDataOptionsBean23.getAssociated();
        java.lang.Boolean boolean27 = allDataOptionsBean23.getPersist();
        allDataOptionsBean23.setAssociated((java.lang.Boolean) false);
        allDataOptionsBean23.setPersist((java.lang.Boolean) false);
        java.lang.Boolean boolean32 = allDataOptionsBean23.getPersist();
        java.lang.Boolean boolean33 = allDataOptionsBean23.getPersist();
        boolean boolean34 = allDataOptionsBean23.hasAnyProperties();
        modelFieldBean2.setDefaultValue((java.lang.Object) allDataOptionsBean23);
        allDataOptionsBean23.setAssociated((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(abstractValidationArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(strList19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + boolean26 + "' != '" + false + "'", boolean26, false);
        org.junit.Assert.assertNull(boolean27);
        org.junit.Assert.assertEquals("'" + boolean32 + "' != '" + false + "'", boolean32, false);
        org.junit.Assert.assertEquals("'" + boolean33 + "' != '" + false + "'", boolean33, false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test02202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02202");
        ch.rasc.extclassgenerator.validation.FormatValidation formatValidation2 = new ch.rasc.extclassgenerator.validation.FormatValidation("", "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        java.lang.String str3 = formatValidation2.getMatcher();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});/" + "'", str3, "/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});/");
    }

    @Test
    public void test02203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02203");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        java.lang.String str3 = modelBean0.getIdProperty();
        java.lang.String[] strArray4 = modelBean0.getHasMany();
        modelBean0.setExtend("/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/");
        java.util.List<ch.rasc.extclassgenerator.validation.AbstractValidation> abstractValidationList7 = modelBean0.getValidations();
        java.lang.String str8 = modelBean0.getCreateMethod();
        modelBean0.setIdProperty("");
        java.lang.String str11 = modelBean0.getVersionProperty();
        java.lang.String str12 = modelBean0.getWriter();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(abstractValidationList7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "json" + "'", str12, "json");
    }

    @Test
    public void test02204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02204");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean4 = allDataOptionsBean0.getPersist();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        allDataOptionsBean0.setPersist((java.lang.Boolean) false);
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean11 = allDataOptionsBean0.getChanges();
        java.lang.Boolean boolean12 = allDataOptionsBean0.getAssociated();
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + false + "'", boolean12, false);
    }

    @Test
    public void test02205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02205");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getChild();
        java.lang.String str2 = referenceBean0.getChild();
        referenceBean0.setRole("json");
        referenceBean0.setChild("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        referenceBean0.setInverse("Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[],proxy:{type:\"direct\",directFn:hi!}});");
        java.lang.String str9 = referenceBean0.getChild();
        java.lang.String str10 = referenceBean0.getChild();
        referenceBean0.setRole("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str9, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str10, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
    }

    @Test
    public void test02206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02206");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("Ext.define(\"null\",{extend:\"\",fields:[]});");
        java.lang.String str2 = hasOneAssociation1.getSetterName();
        hasOneAssociation1.setSetterName("Ext.define(\"null\",{extend:\"\",fields:[]});");
        hasOneAssociation1.setName("//");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test02207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02207");
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
        apiObject0.destroy = "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str8, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str9, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str11, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "exclusion" + "'", str12, "exclusion");
    }

    @Test
    public void test02208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02208");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        java.lang.String str6 = modelFieldBean2.getMapping();
        java.lang.Boolean boolean7 = modelFieldBean2.getAllowNull();
        java.lang.String str8 = modelFieldBean2.getName();
        modelFieldBean2.setCalculate("json");
        java.lang.String str11 = modelFieldBean2.getDateFormat();
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        modelFieldBean2.setName("Ext.define(\"null\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ],\n    proxy : {\n      type : \"direct\",\n      reader : {\n        type : \"Ext.define(\\\"java.util.ArrayList\\\",\\r\\n{\\n  extend : \\\"Ext.data.Model\\\",\\n  fields : [ ]\\n});\"\n      }\n    }\n  }\n});");
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test02209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02209");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        java.lang.String str6 = modelFieldBean2.getMapping();
        java.lang.String str7 = modelFieldBean2.getName();
        java.lang.String str8 = modelFieldBean2.getConvert();
        ch.rasc.extclassgenerator.ModelType modelType9 = modelFieldBean2.getModelType();
        modelFieldBean2.setPersist((java.lang.Boolean) false);
        java.lang.String str12 = modelFieldBean2.getMapping();
        java.lang.Object obj13 = modelFieldBean2.getReference();
        modelFieldBean2.setConvert("Ext.define(\"null\",\r\n{\n  extend : \"\",\n  fields : [ ],\n  hasMany : [ \"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\", \"json\", \"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\", \"\" ]\n});");
        java.lang.String str16 = modelFieldBean2.getMapping();
        java.lang.Boolean boolean17 = modelFieldBean2.getCritical();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(modelType9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(boolean17);
    }

    @Test
    public void test02210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02210");
        ch.rasc.extclassgenerator.validation.InclusionValidation inclusionValidation2 = new ch.rasc.extclassgenerator.validation.InclusionValidation("", "");
        java.lang.String str3 = inclusionValidation2.getList();
        java.lang.String str4 = inclusionValidation2.getField();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test02211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02211");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("digits");
        java.lang.String str2 = hasManyAssociation1.getType();
        java.lang.Boolean boolean3 = hasManyAssociation1.getAutoLoad();
        java.lang.String str4 = hasManyAssociation1.getAssociationKey();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hasMany" + "'", str2, "hasMany");
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test02212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02212");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean4 = allDataOptionsBean0.getPersist();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        allDataOptionsBean0.setPersist((java.lang.Boolean) false);
        boolean boolean9 = allDataOptionsBean0.hasAnyProperties();
        java.lang.Boolean boolean10 = allDataOptionsBean0.getAssociated();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) true);
        java.lang.Boolean boolean13 = allDataOptionsBean0.getCritical();
        java.lang.Boolean boolean14 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean15 = allDataOptionsBean0.getPersist();
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + false + "'", boolean10, false);
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertEquals("'" + boolean14 + "' != '" + true + "'", boolean14, true);
        org.junit.Assert.assertEquals("'" + boolean15 + "' != '" + false + "'", boolean15, false);
    }

    @Test
    public void test02213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02213");
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
        modelFieldBean2.setAllowBlank((java.lang.Boolean) true);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray39 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList37);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray40 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("", (java.util.List<java.lang.String>) strList37);
        modelFieldBean2.setDepends((java.util.List<java.lang.String>) strList37);
        modelFieldBean2.setCalculate("");
        java.lang.String str44 = modelFieldBean2.getName();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + boolean29 + "' != '" + false + "'", boolean29, false);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[],proxy:{type:\"direct\",directFn:hi!}});" + "'", str44, "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[],proxy:{type:\"direct\",directFn:hi!}});");
    }

    @Test
    public void test02214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02214");
        ch.rasc.extclassgenerator.validation.InclusionValidation inclusionValidation2 = new ch.rasc.extclassgenerator.validation.InclusionValidation("json", "json");
        java.lang.String str3 = inclusionValidation2.getList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "json" + "'", str3, "json");
    }

    @Test
    public void test02215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02215");
        ch.rasc.extclassgenerator.validation.NotBlankValidation notBlankValidation1 = new ch.rasc.extclassgenerator.validation.NotBlankValidation("Ext.define(\"Ext.define(\"null\",{extend:\"Ext.data.Model\",idProperty:\"hi!\",fields:[],proxy:{type:\"direct\",idParam:\"hi!\"}});\",{extend:\"/\\\\/Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\\\\//\",uses:[\"hi!\"],fields:[],hasMany:[\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\",\"json\",\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\",\"\"],associations:[{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],proxy:{type:\"direct\",directFn:hi!}});");
    }

    @Test
    public void test02216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02216");
        ch.rasc.extclassgenerator.ModelType modelType1 = null;
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("creditCardNumber", modelType1);
        modelFieldBean2.setUnique((java.lang.Boolean) false);
        java.lang.String str5 = modelFieldBean2.getType();
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test02217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02217");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.Object obj3 = modelFieldBean2.getDefaultValue();
        java.lang.Boolean boolean4 = modelFieldBean2.getPersist();
        java.lang.Boolean boolean5 = modelFieldBean2.getUnique();
        java.lang.Boolean boolean6 = modelFieldBean2.getAllowBlank();
        modelFieldBean2.setUseNull((java.lang.Boolean) false);
        modelFieldBean2.setName("past");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean6);
    }

    @Test
    public void test02218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02218");
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
        org.junit.Assert.assertNotNull(wildcardIterable9);
        org.junit.Assert.assertTrue("'" + sourceVersion10 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion10.equals(javax.lang.model.SourceVersion.RELEASE_6));
    }

    @Test
    public void test02219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02219");
        ch.rasc.extclassgenerator.ModelType modelType1 = null;
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"debug\",\n    type : \"boolean\"\n  }, {\n    name : \"useSingleQuotes\",\n    type : \"boolean\"\n  }, {\n    name : \"surroundApiWithQuotes\",\n    type : \"boolean\"\n  } ]\n});", modelType1);
        java.util.List<ch.rasc.extclassgenerator.validation.AbstractValidation> abstractValidationList3 = modelFieldBean2.getValidators();
        org.junit.Assert.assertNull(abstractValidationList3);
    }

    @Test
    public void test02220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02220");
        ch.rasc.extclassgenerator.validation.InclusionValidation inclusionValidation2 = new ch.rasc.extclassgenerator.validation.InclusionValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});", "presence");
    }

    @Test
    public void test02221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02221");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getRole();
        referenceBean0.setChild("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        referenceBean0.setRole("json");
        java.lang.String str7 = referenceBean0.getAssociation();
        referenceBean0.setChild("digits");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test02222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02222");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});", (java.lang.Long) 1L, (java.lang.Long) 32L);
    }

    @Test
    public void test02223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02223");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("hi!");
        belongsToAssociation1.setSetterName("");
        java.lang.String str4 = belongsToAssociation1.getForeignKey();
        belongsToAssociation1.setAssociationKey("inclusion");
        belongsToAssociation1.setSetterName("Ext.define(\"null\",{extend:\"\",config:{fields:[]}});");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test02224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02224");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        modelFieldBean2.setCritical((java.lang.Boolean) false);
        java.lang.String str7 = modelFieldBean2.getDateFormat();
        modelFieldBean2.setPersist((java.lang.Boolean) false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test02225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02225");
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
        java.lang.Class<?> wildcardClass14 = referenceBean0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test02226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02226");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        java.lang.String str6 = referenceBean0.getAssociation();
        referenceBean0.setInverse("");
        java.lang.String str9 = referenceBean0.getChild();
        referenceBean0.setType("belongsTo");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test02227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02227");
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
        javax.lang.model.SourceVersion sourceVersion12 = modelAnnotationProcessor0.getSupportedSourceVersion();
        javax.lang.model.SourceVersion sourceVersion13 = modelAnnotationProcessor0.getSupportedSourceVersion();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + sourceVersion5 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion5.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(wildcardIterable10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + sourceVersion12 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion12.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertTrue("'" + sourceVersion13 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion13.equals(javax.lang.model.SourceVersion.RELEASE_6));
    }

    @Test
    public void test02228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02228");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("exclusion", "future");
        java.util.List<ch.rasc.extclassgenerator.validation.AbstractValidation> abstractValidationList3 = modelFieldBean2.getValidators();
        org.junit.Assert.assertNull(abstractValidationList3);
    }

    @Test
    public void test02229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02229");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getChild();
        java.lang.String str2 = referenceBean0.getInverse();
        java.lang.String str3 = referenceBean0.getInverse();
        boolean boolean4 = referenceBean0.hasAnyProperties();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02230");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        java.lang.String str1 = apiObject0.update;
        apiObject0.update = "";
        apiObject0.read = "";
        java.lang.String str6 = apiObject0.destroy;
        java.lang.String str7 = apiObject0.create;
        apiObject0.read = "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});";
        java.lang.String str10 = apiObject0.create;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test02231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02231");
        ch.rasc.extclassgenerator.validation.ExclusionValidation exclusionValidation2 = new ch.rasc.extclassgenerator.validation.ExclusionValidation("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]}});", "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});/");
        java.lang.String str3 = exclusionValidation2.getField();
        java.lang.String str4 = exclusionValidation2.getList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]}});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]}});");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});/" + "'", str4, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});/");
    }

    @Test
    public void test02232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02232");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        java.lang.String str2 = hasOneAssociation1.getName();
        hasOneAssociation1.setInstanceName("");
        hasOneAssociation1.setPrimaryKey("hasOne");
        java.lang.String str7 = hasOneAssociation1.getName();
        java.lang.String str8 = hasOneAssociation1.getName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test02233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02233");
        ch.rasc.extclassgenerator.validation.DigitsValidation digitsValidation3 = new ch.rasc.extclassgenerator.validation.DigitsValidation("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});", 32, 10);
        int int4 = digitsValidation3.getInteger();
        int int5 = digitsValidation3.getInteger();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test02234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02234");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        ch.rasc.extclassgenerator.ModelType modelType7 = modelFieldBean2.getModelType();
        java.lang.String str8 = modelFieldBean2.getDateFormat();
        java.lang.Boolean boolean9 = modelFieldBean2.getAllowBlank();
        modelFieldBean2.setMapping("hasOne");
        org.junit.Assert.assertNull(modelType7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void test02235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02235");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        java.lang.String str6 = modelFieldBean2.getMapping();
        java.lang.Object obj7 = modelFieldBean2.getReference();
        modelFieldBean2.setCalculate("exclusion");
        java.lang.Boolean boolean10 = modelFieldBean2.getUnique();
        java.lang.String str11 = modelFieldBean2.getConvert();
        java.lang.String str12 = modelFieldBean2.getConvert();
        java.lang.String str13 = modelFieldBean2.getName();
        modelFieldBean2.setMapping("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});");
        modelFieldBean2.setAllowBlank((java.lang.Boolean) false);
        java.lang.Object obj18 = modelFieldBean2.getDefaultValue();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test02236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02236");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("exclusion");
        java.lang.String str2 = hasManyAssociation1.getType();
        hasManyAssociation1.setInstanceName("/Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});/");
        java.lang.Boolean boolean5 = hasManyAssociation1.getAutoLoad();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hasMany" + "'", str2, "hasMany");
        org.junit.Assert.assertNull(boolean5);
    }

    @Test
    public void test02237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02237");
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
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray47 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});", strList45);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray48 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("format", strList45);
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
    public void test02238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02238");
        ch.rasc.extclassgenerator.validation.DigitsValidation digitsValidation3 = new ch.rasc.extclassgenerator.validation.DigitsValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", (int) '#', (int) '4');
        int int4 = digitsValidation3.getFraction();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test02239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02239");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        java.lang.String str3 = modelBean0.getIdProperty();
        java.lang.String str4 = modelBean0.getCreateMethod();
        modelBean0.setIdProperty("hi!");
        java.lang.String str7 = modelBean0.getName();
        java.lang.String str8 = modelBean0.getDestroyMethod();
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean9 = null;
        modelBean0.setAllDataOptions(allDataOptionsBean9);
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation12 = new ch.rasc.extclassgenerator.association.HasManyAssociation("hi!");
        java.lang.String str13 = hasManyAssociation12.getAssociationKey();
        hasManyAssociation12.setAssociationKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        hasManyAssociation12.setAssociationKey("");
        modelBean0.addAssociation((ch.rasc.extclassgenerator.association.AbstractAssociation) hasManyAssociation12);
        ch.rasc.extclassgenerator.validation.ExclusionValidation exclusionValidation21 = new ch.rasc.extclassgenerator.validation.ExclusionValidation("digits", "belongsTo");
        java.lang.String str22 = exclusionValidation21.getList();
        java.lang.String str23 = exclusionValidation21.getList();
        modelBean0.addValidation((ch.rasc.extclassgenerator.validation.AbstractValidation) exclusionValidation21);
        ch.rasc.extclassgenerator.validation.CreditCardNumberValidation creditCardNumberValidation26 = new ch.rasc.extclassgenerator.validation.CreditCardNumberValidation("/hasOne/");
        modelBean0.addValidation((ch.rasc.extclassgenerator.validation.AbstractValidation) creditCardNumberValidation26);
        modelBean0.setWriteAllFields((java.lang.Boolean) false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "belongsTo" + "'", str22, "belongsTo");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "belongsTo" + "'", str23, "belongsTo");
    }

    @Test
    public void test02240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02240");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("/ch.rasc.extclassgenerator.PartialDataOptionsBean/");
    }

    @Test
    public void test02241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02241");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Object obj5 = modelFieldBean2.getReference();
        modelFieldBean2.setPersist((java.lang.Boolean) false);
        java.lang.String str8 = modelFieldBean2.getName();
        java.lang.String str9 = modelFieldBean2.getDateFormat();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test02242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02242");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.data.Model");
        modelFieldBean2.setAllowNull((java.lang.Boolean) false);
        java.lang.String str5 = modelFieldBean2.getName();
        modelFieldBean2.setCalculate("/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/");
        java.lang.String str8 = modelFieldBean2.getName();
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        java.lang.Class<?> wildcardClass11 = modelFieldBean2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02243");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("range", (java.lang.Integer) 52, (java.lang.Integer) 32);
    }

    @Test
    public void test02244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02244");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        java.lang.String str1 = modelBean0.getReadMethod();
        java.util.List<ch.rasc.extclassgenerator.validation.AbstractValidation> abstractValidationList2 = modelBean0.getValidations();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(abstractValidationList2);
    }

    @Test
    public void test02245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02245");
        ch.rasc.extclassgenerator.ModelAnnotationProcessor modelAnnotationProcessor0 = new ch.rasc.extclassgenerator.ModelAnnotationProcessor();
        java.util.Set<java.lang.String> strSet1 = modelAnnotationProcessor0.getSupportedOptions();
        java.util.Set<java.lang.String> strSet2 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        java.util.Set<java.lang.String> strSet3 = modelAnnotationProcessor0.getSupportedOptions();
        java.util.Set<java.lang.String> strSet4 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
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
    public void test02246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02246");
        ch.rasc.extclassgenerator.OutputConfig outputConfig0 = new ch.rasc.extclassgenerator.OutputConfig();
        boolean boolean1 = outputConfig0.isSurroundApiWithQuotes();
        boolean boolean2 = outputConfig0.isSurroundApiWithQuotes();
        outputConfig0.setSurroundApiWithQuotes(true);
        boolean boolean5 = outputConfig0.isSurroundApiWithQuotes();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test02247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02247");
        ch.rasc.extclassgenerator.validation.EmailValidation emailValidation1 = new ch.rasc.extclassgenerator.validation.EmailValidation("Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"associated\",\n    type : \"boolean\"\n  }, {\n    name : \"changes\",\n    type : \"boolean\"\n  }, {\n    name : \"critical\",\n    type : \"boolean\"\n  }, {\n    name : \"persist\",\n    type : \"boolean\"\n  } ]\n});");
    }

    @Test
    public void test02248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02248");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});", (java.lang.Long) 52L, (java.lang.Long) 10L);
    }

    @Test
    public void test02249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02249");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.read = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.update = "";
        apiObject0.read = "json";
        java.lang.String str12 = apiObject0.destroy;
        java.lang.String str13 = apiObject0.create;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str13, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
    }

    @Test
    public void test02250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02250");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.update = "exclusion";
        java.lang.String str8 = apiObject0.read;
        java.lang.String str9 = apiObject0.destroy;
        apiObject0.create = "creditCardNumber";
        apiObject0.update = "hi!";
        java.lang.String str14 = apiObject0.create;
        java.lang.String str15 = apiObject0.read;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "creditCardNumber" + "'", str14, "creditCardNumber");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test02251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02251");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        java.lang.Boolean boolean1 = allDataOptionsBean0.getChanges();
        java.lang.Boolean boolean2 = allDataOptionsBean0.getCritical();
        java.lang.Boolean boolean3 = allDataOptionsBean0.getChanges();
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNull(boolean3);
    }

    @Test
    public void test02252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02252");
        ch.rasc.extclassgenerator.validation.FormatValidation formatValidation2 = new ch.rasc.extclassgenerator.validation.FormatValidation("Ext.define(\"null\",{extend:\"\",config:{fields:[]}});", "hi!");
        java.lang.String str3 = formatValidation2.getMatcher();
        java.lang.String str4 = formatValidation2.getMatcher();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/hi!/" + "'", str3, "/hi!/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "/hi!/" + "'", str4, "/hi!/");
    }

    @Test
    public void test02253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02253");
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
        java.lang.Boolean boolean32 = modelFieldBean2.getPersist();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(wildcardIterable22);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(wildcardIterable29);
        org.junit.Assert.assertEquals("'" + boolean31 + "' != '" + true + "'", boolean31, true);
        org.junit.Assert.assertNull(boolean32);
    }

    @Test
    public void test02254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02254");
        ch.rasc.extclassgenerator.ModelAnnotationProcessor modelAnnotationProcessor0 = new ch.rasc.extclassgenerator.ModelAnnotationProcessor();
        java.util.Set<java.lang.String> strSet1 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        javax.lang.model.SourceVersion sourceVersion2 = modelAnnotationProcessor0.getSupportedSourceVersion();
        javax.lang.model.SourceVersion sourceVersion3 = modelAnnotationProcessor0.getSupportedSourceVersion();
        javax.lang.model.element.Element element4 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror5 = null;
        javax.lang.model.element.ExecutableElement executableElement6 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable8 = modelAnnotationProcessor0.getCompletions(element4, annotationMirror5, executableElement6, "json");
        java.util.Set<java.lang.String> strSet9 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        javax.lang.model.SourceVersion sourceVersion10 = modelAnnotationProcessor0.getSupportedSourceVersion();
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
        org.junit.Assert.assertTrue("'" + sourceVersion2 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion2.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertTrue("'" + sourceVersion3 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion3.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(wildcardIterable8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertTrue("'" + sourceVersion10 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion10.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test02255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02255");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        java.lang.String str3 = modelBean0.getIdProperty();
        modelBean0.setTotalProperty("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean8 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.Object obj9 = modelFieldBean8.getDefaultValue();
        java.lang.Object obj10 = modelFieldBean8.getDefaultValue();
        modelBean0.addField(modelFieldBean8);
        modelFieldBean8.setConvert("Ext.define('Ext.define('ch.rasc.extclassgenerator.association.HasManyAssociation',\n{\n  extend : 'Ext.data.Model',\n  fields : [ {\n    name : 'autoLoad',\n    type : 'boolean'\n  }, {\n    name : 'name',\n    type : 'string'\n  }, {\n    name : 'type',\n    type : 'string'\n  }, {\n    name : 'model',\n    type : 'string'\n  }, {\n    name : 'associationKey',\n    type : 'string'\n  }, {\n    name : 'foreignKey',\n    type : 'string'\n  }, {\n    name : 'primaryKey',\n    type : 'string'\n  }, {\n    name : 'instanceName',\n    type : 'string'\n  } ]\n});',{extend:'',uses:['hi!'],fields:[],associations:[{type:'hasMany',model:'hi!'},{type:'hasMany',model:'hi!',associationKey:'Ext.define(\\'ch.rasc.extclassgenerator.ModelAnnotationProcessor\\',{extend:\\'Ext.data.Model\\',fields:[]});'},{type:'hasMany',model:'hi!',associationKey:'Ext.define(\\'ch.rasc.extclassgenerator.ModelAnnotationProcessor\\',{extend:\\'Ext.data.Model\\',fields:[]});'},{type:'hasMany',model:'hi!',foreignKey:''}]});");
        java.lang.String str14 = modelFieldBean8.getMapping();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test02256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02256");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("");
        java.lang.String str2 = hasOneAssociation1.getGetterName();
        hasOneAssociation1.setSetterName("Ext.define(\"ch.rasc.extclassgenerator.validation.PresenceValidation\",{extend:\"Ext.data.Model\",fields:[{name:\"type\",type:\"string\"},{name:\"field\",type:\"string\"}]});");
        java.lang.String str5 = hasOneAssociation1.getName();
        java.lang.String str6 = hasOneAssociation1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hasOne" + "'", str6, "hasOne");
    }

    @Test
    public void test02257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02257");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean4 = allDataOptionsBean0.getCritical();
        boolean boolean5 = allDataOptionsBean0.hasAnyProperties();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) true);
        allDataOptionsBean0.setPersist((java.lang.Boolean) true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test02258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02258");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        referenceBean0.setType("");
        java.lang.String str3 = referenceBean0.getAssociation();
        referenceBean0.setInverse("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        java.lang.String str6 = referenceBean0.getAssociation();
        referenceBean0.setInverse("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test02259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02259");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("hi!");
        hasManyAssociation1.setAssociationKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        hasManyAssociation1.setName("belongsTo");
        hasManyAssociation1.setPrimaryKey("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        hasManyAssociation1.setAutoLoad((java.lang.Boolean) true);
        java.lang.String str10 = hasManyAssociation1.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "belongsTo" + "'", str10, "belongsTo");
    }

    @Test
    public void test02260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02260");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        modelFieldBean2.setMapping("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
        java.lang.String str8 = modelFieldBean2.getDateFormat();
        modelFieldBean2.setMapping("Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});");
        ch.rasc.extclassgenerator.ModelType modelType11 = modelFieldBean2.getModelType();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(modelType11);
    }

    @Test
    public void test02261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02261");
        ch.rasc.extclassgenerator.validation.FormatValidation formatValidation2 = new ch.rasc.extclassgenerator.validation.FormatValidation("Ext.define(\"Ext.define(\"null\",{extend:\"Ext.data.Model\",idProperty:\"hi!\",fields:[],proxy:{type:\"direct\",idParam:\"hi!\"}});\",{extend:\"/\\\\/Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\\\\//\",uses:[\"hi!\"],fields:[],hasMany:[\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\",\"json\",\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\",\"\"],associations:[{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],proxy:{type:\"direct\",directFn:hi!}});", "/belongsTo/");
        java.lang.String str3 = formatValidation2.getField();
        java.lang.String str4 = formatValidation2.getMatcher();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"Ext.define(\"null\",{extend:\"Ext.data.Model\",idProperty:\"hi!\",fields:[],proxy:{type:\"direct\",idParam:\"hi!\"}});\",{extend:\"/\\\\/Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\\\\//\",uses:[\"hi!\"],fields:[],hasMany:[\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\",\"json\",\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\",\"\"],associations:[{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],proxy:{type:\"direct\",directFn:hi!}});" + "'", str3, "Ext.define(\"Ext.define(\"null\",{extend:\"Ext.data.Model\",idProperty:\"hi!\",fields:[],proxy:{type:\"direct\",idParam:\"hi!\"}});\",{extend:\"/\\\\/Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\\\\//\",uses:[\"hi!\"],fields:[],hasMany:[\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\",\"json\",\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\",\"\"],associations:[{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],proxy:{type:\"direct\",directFn:hi!}});");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "/\\/belongsTo\\//" + "'", str4, "/\\/belongsTo\\//");
    }

    @Test
    public void test02262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02262");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        java.lang.String str4 = apiObject0.read;
        java.lang.String str5 = apiObject0.create;
        java.lang.String str6 = apiObject0.destroy;
        apiObject0.update = "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[],proxy:{type:\"direct\",directFn:hi!}});";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test02263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02263");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str2 = hasOneAssociation1.getForeignKey();
        java.lang.String str3 = hasOneAssociation1.getName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test02264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02264");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.read = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str8 = apiObject0.destroy;
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.association.HasOneAssociation\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"setterName\",type:\"string\"},{name:\"getterName\",type:\"string\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]}});";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test02265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02265");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});";
        apiObject0.destroy = "belongsTo";
        apiObject0.destroy = "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str10 = apiObject0.create;
        java.lang.String str11 = apiObject0.create;
        apiObject0.read = "presence";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});" + "'", str10, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});" + "'", str11, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
    }

    @Test
    public void test02266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02266");
        ch.rasc.extclassgenerator.validation.ExclusionValidation exclusionValidation2 = new ch.rasc.extclassgenerator.validation.ExclusionValidation("Ext.data.Model", "Ext.define(\"null\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ],\n    proxy : {\n      type : \"direct\",\n      reader : {\n        type : \"Ext.define(\\\"java.util.ArrayList\\\",\\r\\n{\\n  extend : \\\"Ext.data.Model\\\",\\n  fields : [ ]\\n});\"\n      }\n    }\n  }\n});");
    }

    @Test
    public void test02267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02267");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        java.lang.String str2 = hasOneAssociation1.getPrimaryKey();
        java.lang.String str3 = hasOneAssociation1.getForeignKey();
        hasOneAssociation1.setAssociationKey("Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
        hasOneAssociation1.setPrimaryKey("/Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});/");
        hasOneAssociation1.setInstanceName("exclusion");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test02268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02268");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getChild();
        java.lang.String str2 = referenceBean0.getChild();
        referenceBean0.setAssociation("creditCardNumber");
        referenceBean0.setType("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        java.lang.String str7 = referenceBean0.getRole();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test02269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02269");
        ch.rasc.extclassgenerator.validation.InclusionValidation inclusionValidation2 = new ch.rasc.extclassgenerator.validation.InclusionValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelFieldBean\",{extend:\"Ext.data.Model\",fields:[{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"dateFormat\",type:\"string\"},{name:\"useNull\",type:\"boolean\"},{name:\"allowNull\",type:\"boolean\"},{name:\"mapping\",type:\"string\"},{name:\"persist\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"convert\",type:\"string\"},{name:\"calculate\",type:\"string\"},{name:\"allowBlank\",type:\"boolean\"},{name:\"unique\",type:\"boolean\"}]});", "future");
    }

    @Test
    public void test02270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02270");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("/hasMany/");
        hasOneAssociation1.setInstanceName("Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",{extend:\"Ext.data.Model\",fields:[{name:\"debug\",type:\"boolean\"},{name:\"useSingleQuotes\",type:\"boolean\"},{name:\"surroundApiWithQuotes\",type:\"boolean\"}]});");
    }

    @Test
    public void test02271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02271");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        java.lang.String str2 = hasOneAssociation1.getName();
        hasOneAssociation1.setInstanceName("");
        hasOneAssociation1.setName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str7 = hasOneAssociation1.getForeignKey();
        java.lang.String str8 = hasOneAssociation1.getPrimaryKey();
        java.lang.String str9 = hasOneAssociation1.getSetterName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test02272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02272");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        hasOneAssociation1.setGetterName("creditCardNumber");
        java.lang.String str4 = hasOneAssociation1.getName();
        hasOneAssociation1.setAssociationKey("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        hasOneAssociation1.setSetterName("ch.rasc.extclassgenerator.association.HasManyAssociation");
        java.lang.String str9 = hasOneAssociation1.getInstanceName();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test02273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02273");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/");
        java.lang.String str2 = belongsToAssociation1.getModel();
        java.lang.String str3 = belongsToAssociation1.getGetterName();
        java.lang.String str4 = belongsToAssociation1.getGetterName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/" + "'", str2, "/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test02274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02274");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getParent();
        referenceBean0.setInverse("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        java.lang.String str5 = referenceBean0.getType();
        java.lang.String str6 = referenceBean0.getChild();
        java.lang.String str7 = referenceBean0.getType();
        referenceBean0.setParent("/belongsTo/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test02275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02275");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        hasOneAssociation1.setInstanceName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        hasOneAssociation1.setName("creditCardNumber");
        java.lang.String str6 = hasOneAssociation1.getName();
        java.lang.String str7 = hasOneAssociation1.getName();
        hasOneAssociation1.setName("inclusion");
        java.lang.String str10 = hasOneAssociation1.getGetterName();
        java.lang.String str11 = hasOneAssociation1.getForeignKey();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "creditCardNumber" + "'", str6, "creditCardNumber");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "creditCardNumber" + "'", str7, "creditCardNumber");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test02276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02276");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("Ext.define(\"null\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ],\n  proxy : {\n    type : \"direct\",\n    reader : {\n      totalProperty : \"/Ext.define(\\\"ch.rasc.extclassgenerator.association.HasManyAssociation\\\",{extend:\\\"Ext.data.Model\\\",fields:[{name:\\\"autoLoad\\\",type:\\\"boolean\\\"},{name:\\\"name\\\",type:\\\"string\\\"},{name:\\\"type\\\",type:\\\"string\\\"},{name:\\\"model\\\",type:\\\"string\\\"},{name:\\\"associationKey\\\",type:\\\"string\\\"},{name:\\\"foreignKey\\\",type:\\\"string\\\"},{name:\\\"primaryKey\\\",type:\\\"string\\\"},{name:\\\"instanceName\\\",type:\\\"string\\\"}]});/\"\n    }\n  }\n});", (java.lang.Integer) 100, (java.lang.Integer) 0);
    }

    @Test
    public void test02277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02277");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("//", (java.lang.Integer) 52, (java.lang.Integer) 97);
    }

    @Test
    public void test02278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02278");
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
        ch.rasc.extclassgenerator.ModelType modelType32 = modelFieldBean2.getModelType();
        java.lang.Boolean boolean33 = modelFieldBean2.getUseNull();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(boolean25);
        org.junit.Assert.assertNull(boolean28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(modelType32);
        org.junit.Assert.assertEquals("'" + boolean33 + "' != '" + false + "'", boolean33, false);
    }

    @Test
    public void test02279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02279");
        ch.rasc.extclassgenerator.validation.EmailValidation emailValidation1 = new ch.rasc.extclassgenerator.validation.EmailValidation("ch.rasc.extclassgenerator.OutputConfig");
    }

    @Test
    public void test02280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02280");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        ch.rasc.extclassgenerator.validation.GenericValidation genericValidation3 = new ch.rasc.extclassgenerator.validation.GenericValidation("Ext.data.Model", "Ext.define('Ext.define('ch.rasc.extclassgenerator.association.HasManyAssociation',\n{\n  extend : 'Ext.data.Model',\n  fields : [ {\n    name : 'autoLoad',\n    type : 'boolean'\n  }, {\n    name : 'name',\n    type : 'string'\n  }, {\n    name : 'type',\n    type : 'string'\n  }, {\n    name : 'model',\n    type : 'string'\n  }, {\n    name : 'associationKey',\n    type : 'string'\n  }, {\n    name : 'foreignKey',\n    type : 'string'\n  }, {\n    name : 'primaryKey',\n    type : 'string'\n  }, {\n    name : 'instanceName',\n    type : 'string'\n  } ]\n});',{extend:'',uses:['hi!'],fields:[],associations:[{type:'hasMany',model:'hi!'},{type:'hasMany',model:'hi!',associationKey:'Ext.define(\\'ch.rasc.extclassgenerator.ModelAnnotationProcessor\\',{extend:\\'Ext.data.Model\\',fields:[]});'},{type:'hasMany',model:'hi!',associationKey:'Ext.define(\\'ch.rasc.extclassgenerator.ModelAnnotationProcessor\\',{extend:\\'Ext.data.Model\\',fields:[]});'},{type:'hasMany',model:'hi!',foreignKey:''}]});", strMap2);
    }

    @Test
    public void test02281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02281");
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
        java.math.BigDecimal bigDecimal41 = rangeValidation40.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation46 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});", (java.lang.Long) 97L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal47 = rangeValidation46.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation53 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal54 = rangeValidation53.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation58 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal59 = rangeValidation58.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation60 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal54, bigDecimal59);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation65 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal66 = rangeValidation65.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation70 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal71 = rangeValidation70.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation72 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal66, bigDecimal71);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation73 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});", bigDecimal54, bigDecimal66);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation74 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});", bigDecimal47, bigDecimal54);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation75 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});", bigDecimal41, bigDecimal47);
        java.lang.String str76 = rangeValidation75.getField();
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertNotNull(bigDecimal37);
        org.junit.Assert.assertNotNull(bigDecimal41);
        org.junit.Assert.assertNotNull(bigDecimal47);
        org.junit.Assert.assertNotNull(bigDecimal54);
        org.junit.Assert.assertNotNull(bigDecimal59);
        org.junit.Assert.assertNotNull(bigDecimal66);
        org.junit.Assert.assertNotNull(bigDecimal71);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});" + "'", str76, "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});");
    }

    @Test
    public void test02282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02282");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getRole();
        referenceBean0.setChild("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        referenceBean0.setAssociation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        referenceBean0.setRole("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        referenceBean0.setChild("hi!");
        java.lang.String str11 = referenceBean0.getInverse();
        java.lang.String str12 = referenceBean0.getInverse();
        java.lang.String str13 = referenceBean0.getInverse();
        java.lang.String str14 = referenceBean0.getChild();
        referenceBean0.setParent("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test02283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02283");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean4 = allDataOptionsBean0.getCritical();
        allDataOptionsBean0.setCritical((java.lang.Boolean) true);
        boolean boolean7 = allDataOptionsBean0.hasAnyProperties();
        allDataOptionsBean0.setPersist((java.lang.Boolean) false);
        allDataOptionsBean0.setCritical((java.lang.Boolean) true);
        java.lang.Boolean boolean12 = allDataOptionsBean0.getChanges();
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(boolean12);
    }

    @Test
    public void test02284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02284");
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
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation30 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal31 = rangeValidation30.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation35 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal36 = rangeValidation35.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation37 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal31, bigDecimal36);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation38 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal24, bigDecimal31);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation39 = new ch.rasc.extclassgenerator.validation.RangeValidation("digits", bigDecimal6, bigDecimal24);
        java.math.BigDecimal bigDecimal40 = rangeValidation39.getMax();
        java.math.BigDecimal bigDecimal41 = rangeValidation39.getMax();
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigDecimal36);
        org.junit.Assert.assertNotNull(bigDecimal40);
        org.junit.Assert.assertNotNull(bigDecimal41);
    }

    @Test
    public void test02285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02285");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        modelBean0.setIdProperty("");
        boolean boolean5 = modelBean0.isDisablePagingParameters();
        boolean boolean6 = modelBean0.isPaging();
        java.lang.String str7 = modelBean0.getRootProperty();
        modelBean0.setReader("");
        modelBean0.setName("hasOne");
        modelBean0.setIdProperty("ch.rasc.extclassgenerator.association.HasManyAssociation");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean14 = modelBean0.getAllDataOptions();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(allDataOptionsBean14);
    }

    @Test
    public void test02286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02286");
        ch.rasc.extclassgenerator.validation.FutureValidation futureValidation1 = new ch.rasc.extclassgenerator.validation.FutureValidation("/ch.rasc.extclassgenerator.PartialDataOptionsBean/");
    }

    @Test
    public void test02287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02287");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        referenceBean0.setType("");
        java.lang.String str3 = referenceBean0.getAssociation();
        referenceBean0.setInverse("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        java.lang.String str6 = referenceBean0.getAssociation();
        referenceBean0.setInverse("/Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});/");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test02288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02288");
        ch.rasc.extclassgenerator.validation.ExclusionValidation exclusionValidation2 = new ch.rasc.extclassgenerator.validation.ExclusionValidation("/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/", "Ext.define(\"ch.rasc.extclassgenerator.association.HasOneAssociation\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"setterName\",type:\"string\"},{name:\"getterName\",type:\"string\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]}});");
    }

    @Test
    public void test02289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02289");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("/hi!/");
        hasOneAssociation1.setAssociationKey("ch.rasc.extclassgenerator.PartialDataOptionsBean");
    }

    @Test
    public void test02290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02290");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        hasOneAssociation1.setInstanceName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str4 = hasOneAssociation1.getName();
        java.lang.String str5 = hasOneAssociation1.getName();
        java.lang.String str6 = hasOneAssociation1.getModel();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test02291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02291");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean4 = allDataOptionsBean0.getCritical();
        allDataOptionsBean0.setCritical((java.lang.Boolean) true);
        boolean boolean7 = allDataOptionsBean0.hasAnyProperties();
        allDataOptionsBean0.setPersist((java.lang.Boolean) true);
        java.lang.Boolean boolean10 = allDataOptionsBean0.getCritical();
        allDataOptionsBean0.setCritical((java.lang.Boolean) false);
        java.lang.Boolean boolean13 = allDataOptionsBean0.getAssociated();
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + false + "'", boolean13, false);
    }

    @Test
    public void test02292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02292");
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
        java.lang.Boolean boolean17 = modelFieldBean2.getUnique();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertNull(boolean17);
    }

    @Test
    public void test02293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02293");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("");
        java.lang.String str2 = hasOneAssociation1.getPrimaryKey();
        java.lang.String str3 = hasOneAssociation1.getSetterName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test02294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02294");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("Ext.define(\"null\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ],\n    proxy : {\n      type : \"direct\",\n      reader : {\n        type : \"Ext.define(\\\"java.util.ArrayList\\\",\\r\\n{\\n  extend : \\\"Ext.data.Model\\\",\\n  fields : [ ]\\n});\"\n      }\n    }\n  }\n});", (java.lang.Integer) 0, (java.lang.Integer) 52);
    }

    @Test
    public void test02295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02295");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("Ext.define(\"ch.rasc.extclassgenerator.association.BelongsToAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"setterName\",type:\"string\"},{name:\"getterName\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});", (java.lang.Long) 97L, (java.lang.Long) 10L);
    }

    @Test
    public void test02296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02296");
        ch.rasc.extclassgenerator.validation.DigitsValidation digitsValidation3 = new ch.rasc.extclassgenerator.validation.DigitsValidation("notBlank", (int) (byte) 0, 10);
    }

    @Test
    public void test02297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02297");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});", "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        java.lang.Boolean boolean3 = modelFieldBean2.getUseNull();
        modelFieldBean2.setAllowBlank((java.lang.Boolean) false);
        java.lang.String str6 = modelFieldBean2.getName();
        java.lang.Boolean boolean7 = modelFieldBean2.getAllowBlank();
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});" + "'", str6, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + false + "'", boolean7, false);
    }

    @Test
    public void test02298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02298");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getChild();
        java.lang.String str2 = referenceBean0.getRole();
        referenceBean0.setParent("hasOne");
        java.lang.String str5 = referenceBean0.getInverse();
        referenceBean0.setChild("Ext.data.Model");
        java.lang.String str8 = referenceBean0.getInverse();
        java.lang.String str9 = referenceBean0.getRole();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test02299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02299");
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
        ch.rasc.extclassgenerator.ModelType modelType24 = modelFieldBean2.getModelType();
        java.lang.String str25 = modelFieldBean2.getName();
        java.lang.Boolean boolean26 = modelFieldBean2.getUnique();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(boolean23);
        org.junit.Assert.assertNull(modelType24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNull(boolean26);
    }

    @Test
    public void test02300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02300");
        ch.rasc.extclassgenerator.validation.CreditCardNumberValidation creditCardNumberValidation1 = new ch.rasc.extclassgenerator.validation.CreditCardNumberValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});/");
    }

    @Test
    public void test02301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02301");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.update = "exclusion";
        java.lang.String str8 = apiObject0.update;
        java.lang.String str9 = apiObject0.read;
        apiObject0.create = "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});/";
        java.lang.String str12 = apiObject0.destroy;
        java.lang.String str13 = apiObject0.destroy;
        java.lang.String str14 = apiObject0.create;
        apiObject0.destroy = "past";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "exclusion" + "'", str8, "exclusion");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});/" + "'", str14, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});/");
    }

    @Test
    public void test02302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02302");
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation5 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal6 = rangeValidation5.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation10 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal11 = rangeValidation10.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation12 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal6, bigDecimal11);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation17 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal18 = rangeValidation17.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation22 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal23 = rangeValidation22.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation24 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal18, bigDecimal23);
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation25 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});", bigDecimal6, bigDecimal18);
        java.lang.Class<?> wildcardClass26 = rangeValidation25.getClass();
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test02303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02303");
        ch.rasc.extclassgenerator.validation.FutureValidation futureValidation1 = new ch.rasc.extclassgenerator.validation.FutureValidation("Ext.define(\"ch.rasc.extclassgenerator.association.BelongsToAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"setterName\",\n    type : \"string\"\n  }, {\n    name : \"getterName\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
    }

    @Test
    public void test02304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02304");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.data.Model");
        modelFieldBean2.setAllowNull((java.lang.Boolean) false);
        java.lang.String str5 = modelFieldBean2.getCalculate();
        java.lang.Object obj6 = modelFieldBean2.getDefaultValue();
        ch.rasc.extclassgenerator.OutputConfig outputConfig7 = new ch.rasc.extclassgenerator.OutputConfig();
        boolean boolean8 = outputConfig7.isSurroundApiWithQuotes();
        boolean boolean9 = outputConfig7.isDebug();
        ch.rasc.extclassgenerator.LineEnding lineEnding10 = outputConfig7.getLineEnding();
        outputConfig7.setUseSingleQuotes(true);
        boolean boolean13 = outputConfig7.isUseSingleQuotes();
        boolean boolean14 = modelFieldBean2.hasOnlyName(outputConfig7);
        outputConfig7.setUseSingleQuotes(false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(lineEnding10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test02305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02305");
        ch.rasc.extclassgenerator.validation.CreditCardNumberValidation creditCardNumberValidation1 = new ch.rasc.extclassgenerator.validation.CreditCardNumberValidation("ch.rasc.extclassgenerator.ModelAnnotationProcessor");
    }

    @Test
    public void test02306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02306");
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
        apiObject0.read = "";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test02307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02307");
        ch.rasc.extclassgenerator.validation.InclusionValidation inclusionValidation2 = new ch.rasc.extclassgenerator.validation.InclusionValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});/", "Ext.define(\"ch.rasc.extclassgenerator.ModelFieldBean\",{extend:\"Ext.data.Model\",fields:[{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"dateFormat\",type:\"string\"},{name:\"useNull\",type:\"boolean\"},{name:\"allowNull\",type:\"boolean\"},{name:\"mapping\",type:\"string\"},{name:\"persist\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"convert\",type:\"string\"},{name:\"calculate\",type:\"string\"},{name:\"allowBlank\",type:\"boolean\"},{name:\"unique\",type:\"boolean\"}]});");
    }

    @Test
    public void test02308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02308");
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation4 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal5 = rangeValidation4.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation9 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal10 = rangeValidation9.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation11 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", bigDecimal5, bigDecimal10);
        java.lang.String str12 = rangeValidation11.getField();
        java.math.BigDecimal bigDecimal13 = rangeValidation11.getMin();
        java.math.BigDecimal bigDecimal14 = rangeValidation11.getMax();
        java.math.BigDecimal bigDecimal15 = rangeValidation11.getMin();
        java.math.BigDecimal bigDecimal16 = rangeValidation11.getMin();
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/" + "'", str12, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal16);
    }

    @Test
    public void test02309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02309");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getChild();
        java.lang.String str2 = referenceBean0.getChild();
        java.lang.String str3 = referenceBean0.getType();
        referenceBean0.setRole("Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[],proxy:{type:\"direct\",directFn:hi!}});");
        referenceBean0.setRole("range");
        java.lang.String str8 = referenceBean0.getAssociation();
        java.lang.String str9 = referenceBean0.getRole();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "range" + "'", str9, "range");
    }

    @Test
    public void test02310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02310");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        ch.rasc.extclassgenerator.validation.GenericValidation genericValidation3 = new ch.rasc.extclassgenerator.validation.GenericValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});", strMap2);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = genericValidation3.getOptions();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = genericValidation3.getOptions();
        java.lang.String str6 = genericValidation3.getField();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = genericValidation3.getOptions();
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});" + "'", str6, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        org.junit.Assert.assertNull(strMap7);
    }

    @Test
    public void test02311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02311");
        ch.rasc.extclassgenerator.validation.FormatValidation formatValidation2 = new ch.rasc.extclassgenerator.validation.FormatValidation("format", "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});");
        java.lang.String str3 = formatValidation2.getMatcher();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/" + "'", str3, "/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/");
    }

    @Test
    public void test02312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02312");
        ch.rasc.extclassgenerator.OutputConfig outputConfig0 = new ch.rasc.extclassgenerator.OutputConfig();
        boolean boolean1 = outputConfig0.isSurroundApiWithQuotes();
        boolean boolean2 = outputConfig0.isDebug();
        ch.rasc.extclassgenerator.ModelAnnotationProcessor modelAnnotationProcessor3 = new ch.rasc.extclassgenerator.ModelAnnotationProcessor();
        java.util.Set<java.lang.String> strSet4 = modelAnnotationProcessor3.getSupportedAnnotationTypes();
        boolean boolean5 = outputConfig0.equals((java.lang.Object) strSet4);
        boolean boolean6 = outputConfig0.isSurroundApiWithQuotes();
        ch.rasc.extclassgenerator.IncludeValidation includeValidation7 = outputConfig0.getIncludeValidation();
        outputConfig0.setSurroundApiWithQuotes(false);
        outputConfig0.setUseSingleQuotes(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(includeValidation7);
    }

    @Test
    public void test02313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02313");
        ch.rasc.extclassgenerator.validation.CreditCardNumberValidation creditCardNumberValidation1 = new ch.rasc.extclassgenerator.validation.CreditCardNumberValidation("presence");
    }

    @Test
    public void test02314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02314");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("hi!");
        hasManyAssociation1.setAssociationKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str4 = hasManyAssociation1.getInstanceName();
        hasManyAssociation1.setPrimaryKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str7 = hasManyAssociation1.getForeignKey();
        hasManyAssociation1.setInstanceName("hi!");
        hasManyAssociation1.setPrimaryKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        java.lang.String str12 = hasManyAssociation1.getInstanceName();
        hasManyAssociation1.setAutoLoad((java.lang.Boolean) true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test02315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02315");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        java.lang.String str2 = hasOneAssociation1.getName();
        hasOneAssociation1.setInstanceName("");
        java.lang.String str5 = hasOneAssociation1.getInstanceName();
        hasOneAssociation1.setAssociationKey("/\\/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});\\//");
        java.lang.String str8 = hasOneAssociation1.getGetterName();
        hasOneAssociation1.setGetterName("Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
        java.lang.String str11 = hasOneAssociation1.getPrimaryKey();
        hasOneAssociation1.setGetterName("ch.rasc.extclassgenerator.PartialDataOptionsBean");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test02316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02316");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("exclusion", (java.lang.Integer) 100, (java.lang.Integer) (-1));
    }

    @Test
    public void test02317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02317");
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
        modelFieldBean2.setUnique((java.lang.Boolean) false);
        java.lang.String str20 = modelFieldBean2.getType();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str20, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
    }

    @Test
    public void test02318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02318");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("hi!");
        java.lang.String str2 = hasManyAssociation1.getAssociationKey();
        java.lang.String str3 = hasManyAssociation1.getModel();
        hasManyAssociation1.setName("creditCardNumber");
        java.lang.Boolean boolean6 = hasManyAssociation1.getAutoLoad();
        hasManyAssociation1.setPrimaryKey("Ext.define(\"ch.rasc.extclassgenerator.ReferenceBean\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"type\",type:\"string\"},{name:\"association\",type:\"string\"},{name:\"child\",type:\"string\"},{name:\"parent\",type:\"string\"},{name:\"role\",type:\"string\"},{name:\"inverse\",type:\"string\"}]}});");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(boolean6);
    }

    @Test
    public void test02319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02319");
        ch.rasc.extclassgenerator.validation.EmailValidation emailValidation1 = new ch.rasc.extclassgenerator.validation.EmailValidation("future");
    }

    @Test
    public void test02320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02320");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("/hasOne/", (java.lang.Integer) (-1), (java.lang.Integer) 100);
    }

    @Test
    public void test02321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02321");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("hi!");
        java.lang.String str2 = hasManyAssociation1.getAssociationKey();
        hasManyAssociation1.setAssociationKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        hasManyAssociation1.setAssociationKey("");
        java.lang.Boolean boolean7 = hasManyAssociation1.getAutoLoad();
        java.lang.String str8 = hasManyAssociation1.getAssociationKey();
        hasManyAssociation1.setName("exclusion");
        hasManyAssociation1.setName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
        java.lang.Boolean boolean13 = hasManyAssociation1.getAutoLoad();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(boolean13);
    }

    @Test
    public void test02322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02322");
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
        apiObject0.read = "creditCardNumber";
        java.lang.String str18 = apiObject0.create;
        java.lang.String str19 = apiObject0.update;
        apiObject0.read = "hasOne";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str18, "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hasMany" + "'", str19, "hasMany");
    }

    @Test
    public void test02323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02323");
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
        java.lang.String str15 = apiObject0.destroy;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "belongsTo" + "'", str10, "belongsTo");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test02324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02324");
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
        modelFieldBean2.setCritical((java.lang.Boolean) false);
        modelFieldBean2.setAllowNull((java.lang.Boolean) true);
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
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
    public void test02325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02325");
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
        java.lang.String str15 = modelFieldBean2.getCalculate();
        modelFieldBean2.setCritical((java.lang.Boolean) false);
        modelFieldBean2.setCritical((java.lang.Boolean) true);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "exclusion" + "'", str15, "exclusion");
    }

    @Test
    public void test02326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02326");
        ch.rasc.extclassgenerator.validation.CreditCardNumberValidation creditCardNumberValidation1 = new ch.rasc.extclassgenerator.validation.CreditCardNumberValidation("exclusion");
        java.lang.String str2 = creditCardNumberValidation1.getType();
        java.lang.String str3 = creditCardNumberValidation1.getType();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "creditCardNumber" + "'", str2, "creditCardNumber");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "creditCardNumber" + "'", str3, "creditCardNumber");
    }

    @Test
    public void test02327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02327");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        java.lang.String str6 = referenceBean0.getAssociation();
        referenceBean0.setInverse("");
        java.lang.String str9 = referenceBean0.getParent();
        java.lang.String str10 = referenceBean0.getRole();
        boolean boolean11 = referenceBean0.typeOnly();
        java.lang.String str12 = referenceBean0.getType();
        referenceBean0.setInverse("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test02328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02328");
        ch.rasc.extclassgenerator.ModelAnnotationProcessor modelAnnotationProcessor0 = new ch.rasc.extclassgenerator.ModelAnnotationProcessor();
        java.util.Set<java.lang.String> strSet1 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        javax.lang.model.SourceVersion sourceVersion2 = modelAnnotationProcessor0.getSupportedSourceVersion();
        javax.lang.model.SourceVersion sourceVersion3 = modelAnnotationProcessor0.getSupportedSourceVersion();
        javax.lang.model.element.Element element4 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror5 = null;
        javax.lang.model.element.ExecutableElement executableElement6 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable8 = modelAnnotationProcessor0.getCompletions(element4, annotationMirror5, executableElement6, "json");
        java.util.Set<java.lang.String> strSet9 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        java.util.Set<java.lang.String> strSet10 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        java.util.Set<java.lang.String> strSet11 = modelAnnotationProcessor0.getSupportedOptions();
        java.util.Set<java.lang.String> strSet12 = modelAnnotationProcessor0.getSupportedOptions();
        javax.lang.model.SourceVersion sourceVersion13 = modelAnnotationProcessor0.getSupportedSourceVersion();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertTrue("'" + sourceVersion2 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion2.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertTrue("'" + sourceVersion3 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion3.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(wildcardIterable8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertTrue("'" + sourceVersion13 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion13.equals(javax.lang.model.SourceVersion.RELEASE_6));
    }

    @Test
    public void test02329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02329");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("notBlank", (java.lang.Integer) 1, (java.lang.Integer) 1);
    }

    @Test
    public void test02330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02330");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        referenceBean0.setType("");
        java.lang.String str3 = referenceBean0.getAssociation();
        referenceBean0.setInverse("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        referenceBean0.setInverse("ch.rasc.extclassgenerator.ModelBean");
        boolean boolean8 = referenceBean0.typeOnly();
        referenceBean0.setInverse("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});/");
        referenceBean0.setType("Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
        boolean boolean13 = referenceBean0.hasAnyProperties();
        java.lang.String str14 = referenceBean0.getParent();
        boolean boolean15 = referenceBean0.hasAnyProperties();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test02331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02331");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("");
        java.lang.String str2 = belongsToAssociation1.getInstanceName();
        belongsToAssociation1.setSetterName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str5 = belongsToAssociation1.getGetterName();
        belongsToAssociation1.setSetterName("Ext.define(\"null\",{extend:\"\",fields:[]});");
        java.lang.String str8 = belongsToAssociation1.getModel();
        belongsToAssociation1.setAssociationKey("Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"debug\",type:\"boolean\"},{name:\"useSingleQuotes\",type:\"boolean\"},{name:\"surroundApiWithQuotes\",type:\"boolean\"}]}});");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test02332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02332");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        java.lang.String str6 = referenceBean0.getParent();
        boolean boolean7 = referenceBean0.hasAnyProperties();
        referenceBean0.setChild("hasMany");
        boolean boolean10 = referenceBean0.hasAnyProperties();
        referenceBean0.setAssociation("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test02333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02333");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("ch.rasc.extclassgenerator.ModelAnnotationProcessor");
    }

    @Test
    public void test02334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02334");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("");
        belongsToAssociation1.setForeignKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        java.lang.String str4 = belongsToAssociation1.getGetterName();
        belongsToAssociation1.setSetterName("inclusion");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test02335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02335");
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
        allDataOptionsBean0.setAssociated((java.lang.Boolean) true);
        java.lang.Boolean boolean16 = allDataOptionsBean0.getChanges();
        allDataOptionsBean0.setCritical((java.lang.Boolean) true);
        java.lang.Boolean boolean19 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean20 = allDataOptionsBean0.getCritical();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + false + "'", boolean9, false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + true + "'", boolean13, true);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertEquals("'" + boolean19 + "' != '" + true + "'", boolean19, true);
        org.junit.Assert.assertEquals("'" + boolean20 + "' != '" + true + "'", boolean20, true);
    }

    @Test
    public void test02336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02336");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("presence", (java.lang.Integer) 35, (java.lang.Integer) 10);
    }

    @Test
    public void test02337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02337");
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
        modelFieldBean2.setCritical((java.lang.Boolean) false);
        java.lang.Boolean boolean33 = modelFieldBean2.getAllowBlank();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(boolean33);
    }

    @Test
    public void test02338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02338");
        ch.rasc.extclassgenerator.ModelType modelType1 = null;
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("", modelType1);
        java.lang.Boolean boolean3 = modelFieldBean2.getUseNull();
        modelFieldBean2.setMapping("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        modelFieldBean2.setName("Ext.define(\"ch.rasc.extclassgenerator.association.HasOneAssociation\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"setterName\",type:\"string\"},{name:\"getterName\",type:\"string\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]}});");
        org.junit.Assert.assertNull(boolean3);
    }

    @Test
    public void test02339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02339");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean4 = allDataOptionsBean0.getPersist();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        allDataOptionsBean0.setPersist((java.lang.Boolean) false);
        java.lang.Boolean boolean9 = allDataOptionsBean0.getPersist();
        java.lang.Boolean boolean10 = allDataOptionsBean0.getCritical();
        boolean boolean11 = allDataOptionsBean0.hasAnyProperties();
        allDataOptionsBean0.setChanges((java.lang.Boolean) true);
        allDataOptionsBean0.setCritical((java.lang.Boolean) false);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + false + "'", boolean9, false);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test02340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02340");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        java.lang.String str3 = modelFieldBean2.getName();
        java.lang.String str4 = modelFieldBean2.getConvert();
        java.lang.Object obj5 = modelFieldBean2.getDefaultValue();
        modelFieldBean2.setPersist((java.lang.Boolean) false);
        java.lang.Boolean boolean8 = modelFieldBean2.getUseNull();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(boolean8);
    }

    @Test
    public void test02341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02341");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.data.Model");
        modelFieldBean2.setAllowNull((java.lang.Boolean) false);
        java.lang.String str5 = modelFieldBean2.getName();
        modelFieldBean2.setDateFormat("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        modelFieldBean2.setUnique((java.lang.Boolean) false);
        java.lang.Boolean boolean10 = modelFieldBean2.getPersist();
        modelFieldBean2.setConvert("/Ext.data.Model/");
        java.lang.String str13 = modelFieldBean2.getMapping();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test02342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02342");
        ch.rasc.extclassgenerator.validation.DigitsValidation digitsValidation3 = new ch.rasc.extclassgenerator.validation.DigitsValidation("Ext.define(\"ch.rasc.extclassgenerator.ReferenceBean\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"type\",type:\"string\"},{name:\"association\",type:\"string\"},{name:\"child\",type:\"string\"},{name:\"parent\",type:\"string\"},{name:\"role\",type:\"string\"},{name:\"inverse\",type:\"string\"}]}});", 97, 52);
        int int4 = digitsValidation3.getFraction();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test02343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02343");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("hi!");
        java.lang.String str2 = hasManyAssociation1.getAssociationKey();
        java.lang.String str3 = hasManyAssociation1.getForeignKey();
        java.lang.String str4 = hasManyAssociation1.getPrimaryKey();
        java.lang.String str5 = hasManyAssociation1.getInstanceName();
        java.lang.Boolean boolean6 = hasManyAssociation1.getAutoLoad();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(boolean6);
    }

    @Test
    public void test02344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02344");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("Ext.define(\"ch.rasc.extclassgenerator.association.HasOneAssociation\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"setterName\",type:\"string\"},{name:\"getterName\",type:\"string\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]}});", (java.lang.Integer) 52, (java.lang.Integer) 0);
    }

    @Test
    public void test02345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02345");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean4 = allDataOptionsBean0.getPersist();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean7 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean8 = allDataOptionsBean0.getPersist();
        allDataOptionsBean0.setCritical((java.lang.Boolean) true);
        java.lang.Boolean boolean11 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean12 = allDataOptionsBean0.getPersist();
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + false + "'", boolean7, false);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + false + "'", boolean11, false);
        org.junit.Assert.assertNull(boolean12);
    }

    @Test
    public void test02346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02346");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getRole();
        referenceBean0.setChild("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        referenceBean0.setAssociation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        referenceBean0.setRole("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        referenceBean0.setChild("hi!");
        java.lang.String str11 = referenceBean0.getInverse();
        java.lang.String str12 = referenceBean0.getInverse();
        java.lang.String str13 = referenceBean0.getInverse();
        java.lang.String str14 = referenceBean0.getRole();
        java.lang.String str15 = referenceBean0.getAssociation();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/" + "'", str14, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});" + "'", str15, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
    }

    @Test
    public void test02347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02347");
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
        java.util.List<java.lang.String> strList28 = modelFieldBean2.getDepends();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[],proxy:{type:\"direct\",directFn:hi!}});" + "'", str27, "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[],proxy:{type:\"direct\",directFn:hi!}});");
        org.junit.Assert.assertNotNull(strList28);
    }

    @Test
    public void test02348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02348");
        ch.rasc.extclassgenerator.validation.PresenceValidation presenceValidation1 = new ch.rasc.extclassgenerator.validation.PresenceValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});/");
    }

    @Test
    public void test02349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02349");
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
        modelFieldBean2.setUnique((java.lang.Boolean) false);
        java.lang.Boolean boolean36 = modelFieldBean2.getCritical();
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
        org.junit.Assert.assertNull(boolean36);
    }

    @Test
    public void test02350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02350");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        modelFieldBean2.setMapping("hi!");
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        modelFieldBean2.setAllowBlank((java.lang.Boolean) false);
        java.util.List<ch.rasc.extclassgenerator.validation.AbstractValidation> abstractValidationList11 = modelFieldBean2.getValidators();
        modelFieldBean2.setUseNull((java.lang.Boolean) false);
        java.lang.Boolean boolean14 = modelFieldBean2.getAllowBlank();
        org.junit.Assert.assertNull(abstractValidationList11);
        org.junit.Assert.assertEquals("'" + boolean14 + "' != '" + false + "'", boolean14, false);
    }

    @Test
    public void test02351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02351");
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
        java.lang.Object obj23 = modelFieldBean2.getDefaultValue();
        modelFieldBean2.setAllowBlank((java.lang.Boolean) true);
        java.lang.Boolean boolean26 = modelFieldBean2.getPersist();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(boolean26);
    }

    @Test
    public void test02352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02352");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("past", (java.lang.Integer) 100, (java.lang.Integer) 35);
    }

    @Test
    public void test02353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02353");
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
        allDataOptionsBean0.setChanges((java.lang.Boolean) false);
        java.lang.Boolean boolean20 = allDataOptionsBean0.getChanges();
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertEquals("'" + boolean15 + "' != '" + false + "'", boolean15, false);
        org.junit.Assert.assertEquals("'" + boolean20 + "' != '" + false + "'", boolean20, false);
    }

    @Test
    public void test02354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02354");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        ch.rasc.extclassgenerator.validation.GenericValidation genericValidation3 = new ch.rasc.extclassgenerator.validation.GenericValidation("", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});", strMap2);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = genericValidation3.getOptions();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = genericValidation3.getOptions();
        java.lang.String str6 = genericValidation3.getField();
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});" + "'", str6, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
    }

    @Test
    public void test02355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02355");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        java.lang.String str6 = modelFieldBean2.getMapping();
        modelFieldBean2.setCritical((java.lang.Boolean) true);
        java.lang.String str9 = modelFieldBean2.getName();
        java.lang.Object obj10 = modelFieldBean2.getReference();
        java.lang.Boolean boolean11 = modelFieldBean2.getPersist();
        java.lang.Object obj12 = modelFieldBean2.getReference();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test02356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02356");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("ch.rasc.extclassgenerator.PartialDataOptionsBean");
        java.lang.String str2 = belongsToAssociation1.getPrimaryKey();
        java.lang.String str3 = belongsToAssociation1.getGetterName();
        belongsToAssociation1.setSetterName("Ext.define(\"ch.rasc.extclassgenerator.validation.PresenceValidation\",{extend:\"Ext.data.Model\",fields:[{name:\"type\",type:\"string\"},{name:\"field\",type:\"string\"}]});");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test02357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02357");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        java.lang.String str6 = referenceBean0.getType();
        referenceBean0.setChild("hasOne");
        java.lang.String str9 = referenceBean0.getChild();
        java.lang.String str10 = referenceBean0.getAssociation();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hasOne" + "'", str9, "hasOne");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test02358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02358");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        referenceBean0.setType("");
        referenceBean0.setChild("");
        java.lang.String str5 = referenceBean0.getParent();
        java.lang.String str6 = referenceBean0.getRole();
        boolean boolean7 = referenceBean0.typeOnly();
        referenceBean0.setInverse("inclusion");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test02359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02359");
        java.util.List<java.lang.String> strList1 = null;
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray2 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});", strList1);
        java.util.List<java.lang.String> strList3 = exclusionValidationArray2.getList();
        java.util.List<java.lang.String> strList4 = exclusionValidationArray2.getList();
        java.util.List<java.lang.String> strList5 = exclusionValidationArray2.getList();
        java.util.List<java.lang.String> strList6 = exclusionValidationArray2.getList();
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNull(strList4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertNull(strList6);
    }

    @Test
    public void test02360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02360");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        java.lang.String str3 = modelBean0.getIdProperty();
        modelBean0.setTotalProperty("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelBean0.setCreateMethod("creditCardNumber");
        modelBean0.setUpdateMethod("/ch.rasc.extclassgenerator.ModelAnnotationProcessor/");
        modelBean0.setWriteAllFields((java.lang.Boolean) false);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test02361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02361");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getType();
        referenceBean0.setInverse("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        java.lang.String str4 = referenceBean0.getAssociation();
        java.lang.String str5 = referenceBean0.getAssociation();
        referenceBean0.setRole("digits");
        referenceBean0.setInverse("Ext.define(\"ch.rasc.extclassgenerator.association.BelongsToAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"setterName\",\n    type : \"string\"\n  }, {\n    name : \"getterName\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test02362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02362");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        modelFieldBean2.setCritical((java.lang.Boolean) false);
        java.lang.String str7 = modelFieldBean2.getDateFormat();
        java.lang.String str8 = modelFieldBean2.getConvert();
        java.lang.String str9 = modelFieldBean2.getDateFormat();
        java.lang.String str10 = modelFieldBean2.getDateFormat();
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean15 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean15.setConvert("hi!");
        java.lang.Boolean boolean18 = modelFieldBean15.getPersist();
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
        modelFieldBean15.setDepends((java.util.List<java.lang.String>) strList31);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray36 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", (java.util.List<java.lang.String>) strList31);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray37 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});", (java.util.List<java.lang.String>) strList31);
        java.util.List<java.lang.String> strList38 = inclusionValidationArray37.getList();
        modelFieldBean2.setDepends(strList38);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(boolean18);
        org.junit.Assert.assertNull(boolean24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(strList38);
    }

    @Test
    public void test02363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02363");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("Ext.define(\"java.util.ArrayList\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 32L, (java.lang.Long) 32L);
    }

    @Test
    public void test02364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02364");
        ch.rasc.extclassgenerator.PartialDataOptionsBean partialDataOptionsBean0 = new ch.rasc.extclassgenerator.PartialDataOptionsBean();
        boolean boolean1 = partialDataOptionsBean0.hasAnyProperties();
        partialDataOptionsBean0.setChanges((java.lang.Boolean) true);
        java.lang.Boolean boolean4 = partialDataOptionsBean0.getPersist();
        partialDataOptionsBean0.setChanges((java.lang.Boolean) false);
        partialDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test02365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02365");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        java.lang.String str1 = apiObject0.update;
        apiObject0.destroy = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});";
        apiObject0.create = "";
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test02366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02366");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Object obj5 = modelFieldBean2.getReference();
        modelFieldBean2.setPersist((java.lang.Boolean) false);
        modelFieldBean2.setDateFormat("Ext.data.Model");
        ch.rasc.extclassgenerator.ModelType modelType10 = modelFieldBean2.getModelType();
        java.util.List<ch.rasc.extclassgenerator.validation.AbstractValidation> abstractValidationList11 = modelFieldBean2.getValidators();
        java.lang.Object obj12 = modelFieldBean2.getDefaultValue();
        modelFieldBean2.setName("Ext.define(\"ch.rasc.extclassgenerator.LineEnding\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
        modelFieldBean2.setDateFormat("Ext.define(\"null\",{extend:\"Ext.data.Model\",idProperty:\"hi!\",fields:[],proxy:{type:\"direct\",idParam:\"hi!\"}});");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(modelType10);
        org.junit.Assert.assertNull(abstractValidationList11);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test02367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02367");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("Ext.define(\"null\",\r\n{\n  extend : \"\",\n  fields : [ ],\n  validations : [ {\n    type : \"range\",\n    field : \"/Ext.define(\\\"ch.rasc.extclassgenerator.association.HasManyAssociation\\\",{extend:\\\"Ext.data.Model\\\",fields:[{name:\\\"autoLoad\\\",type:\\\"boolean\\\"},{name:\\\"name\\\",type:\\\"string\\\"},{name:\\\"type\\\",type:\\\"string\\\"},{name:\\\"model\\\",type:\\\"string\\\"},{name:\\\"associationKey\\\",type:\\\"string\\\"},{name:\\\"foreignKey\\\",type:\\\"string\\\"},{name:\\\"primaryKey\\\",type:\\\"string\\\"},{name:\\\"instanceName\\\",type:\\\"string\\\"}]});/\",\n    min : 0,\n    max : 0\n  } ]\n});", (java.lang.Integer) (-1), (java.lang.Integer) (-1));
    }

    @Test
    public void test02368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02368");
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
        java.lang.String str18 = apiObject0.create;
        apiObject0.destroy = "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[],proxy:{type:\"direct\",directFn:hi!}});";
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});";
        apiObject0.update = "Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});";
        java.lang.String str25 = apiObject0.update;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "json" + "'", str10, "json");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/" + "'", str11, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "belongsTo" + "'", str18, "belongsTo");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});" + "'", str25, "Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
    }

    @Test
    public void test02369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02369");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        modelFieldBean2.setDateFormat("hi!");
        java.lang.String str8 = modelFieldBean2.getCalculate();
        ch.rasc.extclassgenerator.ModelType modelType9 = modelFieldBean2.getModelType();
        ch.rasc.extclassgenerator.ModelType modelType10 = modelFieldBean2.getModelType();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(modelType9);
        org.junit.Assert.assertNull(modelType10);
    }

    @Test
    public void test02370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02370");
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation3 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"null\",\r\n{\n  extend : \"\",\n  fields : [ ],\n  hasMany : [ \"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\", \"json\", \"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\", \"\" ]\n});", (java.lang.Long) 52L, (java.lang.Long) 97L);
    }

    @Test
    public void test02371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02371");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.destroy = "";
        apiObject0.destroy = "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/";
        java.lang.String str5 = apiObject0.read;
        java.lang.String str6 = apiObject0.read;
        apiObject0.update = "Ext.define(\"null\",{extend:\"\",config:{fields:[]}});";
        apiObject0.read = "Ext.define(\"null\",{extend:\"\",fields:[]});";
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test02372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02372");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        java.lang.Boolean boolean1 = allDataOptionsBean0.getChanges();
        java.lang.Boolean boolean2 = allDataOptionsBean0.getCritical();
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean4 = allDataOptionsBean0.getChanges();
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test02373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02373");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("Ext.define(\"null\",\r\n{\n  extend : \"\",\n  fields : [ ],\n  validations : [ {\n    type : \"range\",\n    field : \"/Ext.define(\\\"ch.rasc.extclassgenerator.association.HasManyAssociation\\\",{extend:\\\"Ext.data.Model\\\",fields:[{name:\\\"autoLoad\\\",type:\\\"boolean\\\"},{name:\\\"name\\\",type:\\\"string\\\"},{name:\\\"type\\\",type:\\\"string\\\"},{name:\\\"model\\\",type:\\\"string\\\"},{name:\\\"associationKey\\\",type:\\\"string\\\"},{name:\\\"foreignKey\\\",type:\\\"string\\\"},{name:\\\"primaryKey\\\",type:\\\"string\\\"},{name:\\\"instanceName\\\",type:\\\"string\\\"}]});/\",\n    min : 0,\n    max : 0\n  } ]\n});", (java.lang.Long) (-1L), (java.lang.Long) 35L);
    }

    @Test
    public void test02374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02374");
        ch.rasc.extclassgenerator.ModelType modelType1 = null;
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("", modelType1);
        modelFieldBean2.setDateFormat("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        java.lang.Boolean boolean5 = modelFieldBean2.getAllowBlank();
        org.junit.Assert.assertNull(boolean5);
    }

    @Test
    public void test02375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02375");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});", "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        java.lang.String str3 = modelFieldBean2.getCalculate();
        modelFieldBean2.setUnique((java.lang.Boolean) true);
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        java.lang.Object obj8 = modelFieldBean2.getDefaultValue();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test02376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02376");
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation3 = new ch.rasc.extclassgenerator.validation.RangeValidation("hi!", (java.lang.Long) 10L, (java.lang.Long) 0L);
        java.lang.String str4 = rangeValidation3.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "range" + "'", str4, "range");
    }

    @Test
    public void test02377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02377");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("Ext.define(\"null\",\r\n{\n  extend : \"\",\n  fields : [ ],\n  hasMany : [ \"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\", \"json\", \"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\", \"\" ]\n});", (java.lang.Long) 10L, (java.lang.Long) 32L);
    }

    @Test
    public void test02378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02378");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        java.lang.String str6 = referenceBean0.getInverse();
        referenceBean0.setAssociation("/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/");
        referenceBean0.setRole("Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});");
        referenceBean0.setChild("Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test02379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02379");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.data.Model");
        java.lang.Boolean boolean3 = modelFieldBean2.getAllowBlank();
        ch.rasc.extclassgenerator.OutputConfig outputConfig4 = null;
        boolean boolean5 = modelFieldBean2.hasOnlyName(outputConfig4);
        modelFieldBean2.setAllowBlank((java.lang.Boolean) false);
        java.lang.String str8 = modelFieldBean2.getCalculate();
        java.lang.Object obj9 = modelFieldBean2.getDefaultValue();
        java.lang.String str10 = modelFieldBean2.getMapping();
        java.lang.Object obj11 = modelFieldBean2.getReference();
        modelFieldBean2.setCritical((java.lang.Boolean) false);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test02380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02380");
        ch.rasc.extclassgenerator.validation.PastValidation pastValidation1 = new ch.rasc.extclassgenerator.validation.PastValidation("/Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});/");
    }

    @Test
    public void test02381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02381");
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
        referenceBean0.setInverse("/hasMany/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test02382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02382");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        java.lang.String str6 = referenceBean0.getInverse();
        java.lang.String str7 = referenceBean0.getParent();
        java.lang.String str8 = referenceBean0.getRole();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test02383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02383");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.data.Model");
        modelFieldBean2.setAllowNull((java.lang.Boolean) false);
        java.lang.String str5 = modelFieldBean2.getName();
        java.lang.Boolean boolean6 = modelFieldBean2.getUnique();
        modelFieldBean2.setMapping("hasOne");
        modelFieldBean2.setAllowNull((java.lang.Boolean) true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(boolean6);
    }

    @Test
    public void test02384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02384");
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
        modelBean0.setRootProperty("/hasMany/");
        modelBean0.setClientIdPropertyAddToWriter(false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + outputFormat12 + "' != '" + ch.rasc.extclassgenerator.OutputFormat.EXTJS5 + "'", outputFormat12.equals(ch.rasc.extclassgenerator.OutputFormat.EXTJS5));
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str15, "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});");
    }

    @Test
    public void test02385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02385");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});/", (java.lang.Integer) (-1), (java.lang.Integer) 35);
    }

    @Test
    public void test02386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02386");
        ch.rasc.extclassgenerator.validation.InclusionValidation inclusionValidation2 = new ch.rasc.extclassgenerator.validation.InclusionValidation("exclusion", "Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",{extend:\"Ext.data.Model\",fields:[{name:\"debug\",type:\"boolean\"},{name:\"useSingleQuotes\",type:\"boolean\"},{name:\"surroundApiWithQuotes\",type:\"boolean\"}]});");
    }

    @Test
    public void test02387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02387");
        ch.rasc.extclassgenerator.PartialDataOptionsBean partialDataOptionsBean0 = new ch.rasc.extclassgenerator.PartialDataOptionsBean();
        boolean boolean1 = partialDataOptionsBean0.hasAnyProperties();
        partialDataOptionsBean0.setChanges((java.lang.Boolean) true);
        java.lang.Boolean boolean4 = partialDataOptionsBean0.getPersist();
        partialDataOptionsBean0.setChanges((java.lang.Boolean) false);
        boolean boolean7 = partialDataOptionsBean0.hasAnyProperties();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test02388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02388");
        ch.rasc.extclassgenerator.ModelAnnotationProcessor modelAnnotationProcessor0 = new ch.rasc.extclassgenerator.ModelAnnotationProcessor();
        java.util.Set<java.lang.String> strSet1 = modelAnnotationProcessor0.getSupportedOptions();
        java.util.Set<java.lang.String> strSet2 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        java.util.Set<java.lang.String> strSet3 = modelAnnotationProcessor0.getSupportedOptions();
        javax.lang.model.SourceVersion sourceVersion4 = modelAnnotationProcessor0.getSupportedSourceVersion();
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
        org.junit.Assert.assertTrue("'" + sourceVersion4 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion4.equals(javax.lang.model.SourceVersion.RELEASE_6));
    }

    @Test
    public void test02389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02389");
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
        java.lang.String str15 = modelBean0.getReader();
        java.lang.String str16 = modelBean0.getVersionProperty();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/" + "'", str7, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        org.junit.Assert.assertNotNull(abstractAssociationList9);
        org.junit.Assert.assertNull(modelFieldBean13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "json" + "'", str15, "json");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test02390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02390");
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
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray21 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("Ext.define(\"ch.rasc.extclassgenerator.validation.PresenceValidation\",{extend:\"Ext.data.Model\",fields:[{name:\"type\",type:\"string\"},{name:\"field\",type:\"string\"}]});", strList20);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray22 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("presence", strList20);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray23 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]}});", strList20);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test02391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02391");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        boolean boolean2 = referenceBean0.hasAnyProperties();
        referenceBean0.setAssociation("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        boolean boolean5 = referenceBean0.typeOnly();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test02392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02392");
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
        java.lang.Boolean boolean26 = modelFieldBean2.getAllowNull();
        java.util.List<ch.rasc.extclassgenerator.validation.AbstractValidation> abstractValidationList27 = modelFieldBean2.getValidators();
        modelFieldBean2.setAllowNull((java.lang.Boolean) true);
        modelFieldBean2.setCritical((java.lang.Boolean) true);
        ch.rasc.extclassgenerator.ModelAnnotationProcessor modelAnnotationProcessor32 = new ch.rasc.extclassgenerator.ModelAnnotationProcessor();
        java.util.Set<java.lang.String> strSet33 = modelAnnotationProcessor32.getSupportedOptions();
        javax.lang.model.SourceVersion sourceVersion34 = modelAnnotationProcessor32.getSupportedSourceVersion();
        java.util.Set<java.lang.String> strSet35 = modelAnnotationProcessor32.getSupportedAnnotationTypes();
        javax.lang.model.element.Element element36 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror37 = null;
        javax.lang.model.element.ExecutableElement executableElement38 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable40 = modelAnnotationProcessor32.getCompletions(element36, annotationMirror37, executableElement38, "hasMany");
        javax.lang.model.element.Element element41 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror42 = null;
        javax.lang.model.element.ExecutableElement executableElement43 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable45 = modelAnnotationProcessor32.getCompletions(element41, annotationMirror42, executableElement43, "digits");
        javax.lang.model.element.Element element46 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror47 = null;
        javax.lang.model.element.ExecutableElement executableElement48 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable50 = modelAnnotationProcessor32.getCompletions(element46, annotationMirror47, executableElement48, "Ext.define(\"ch.rasc.extclassgenerator.validation.PresenceValidation\",{extend:\"Ext.data.Model\",fields:[{name:\"type\",type:\"string\"},{name:\"field\",type:\"string\"}]});");
        java.util.Set<java.lang.String> strSet51 = modelAnnotationProcessor32.getSupportedAnnotationTypes();
        javax.lang.model.SourceVersion sourceVersion52 = modelAnnotationProcessor32.getSupportedSourceVersion();
        modelFieldBean2.setReference((java.lang.Object) modelAnnotationProcessor32);
        java.lang.Boolean boolean54 = modelFieldBean2.getCritical();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(boolean23);
        org.junit.Assert.assertNull(boolean26);
        org.junit.Assert.assertNull(abstractValidationList27);
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertTrue("'" + sourceVersion34 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion34.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(wildcardIterable40);
        org.junit.Assert.assertNotNull(wildcardIterable45);
        org.junit.Assert.assertNotNull(wildcardIterable50);
        org.junit.Assert.assertNotNull(strSet51);
        org.junit.Assert.assertTrue("'" + sourceVersion52 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion52.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertEquals("'" + boolean54 + "' != '" + true + "'", boolean54, true);
    }

    @Test
    public void test02393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02393");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("hi!");
        hasManyAssociation1.setPrimaryKey("creditCardNumber");
        hasManyAssociation1.setInstanceName("hi!");
        java.lang.Boolean boolean6 = hasManyAssociation1.getAutoLoad();
        org.junit.Assert.assertNull(boolean6);
    }

    @Test
    public void test02394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02394");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        referenceBean0.setType("");
        referenceBean0.setChild("");
        boolean boolean5 = referenceBean0.typeOnly();
        boolean boolean6 = referenceBean0.hasAnyProperties();
        java.lang.String str7 = referenceBean0.getAssociation();
        referenceBean0.setChild("Ext.define(\"null\",{extend:\"\",config:{fields:[]}});");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test02395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02395");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        modelBean0.setIdProperty("");
        modelBean0.setReadMethod("hi!");
        java.lang.String str7 = modelBean0.getReader();
        modelBean0.setClientIdPropertyAddToWriter(false);
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean11 = modelBean0.getField("");
        ch.rasc.extclassgenerator.PartialDataOptionsBean partialDataOptionsBean12 = modelBean0.getPartialDataOptions();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "json" + "'", str7, "json");
        org.junit.Assert.assertNull(modelFieldBean11);
        org.junit.Assert.assertNull(partialDataOptionsBean12);
    }

    @Test
    public void test02396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02396");
        ch.rasc.extclassgenerator.ModelType modelType1 = null;
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("Ext.define(\"null\",{extend:\"\",config:{fields:[]}});", modelType1);
        java.lang.String str3 = modelFieldBean2.getType();
        java.lang.Boolean boolean4 = modelFieldBean2.getAllowBlank();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test02397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02397");
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
        ch.rasc.extclassgenerator.PartialDataOptionsBean partialDataOptionsBean16 = new ch.rasc.extclassgenerator.PartialDataOptionsBean();
        java.lang.Boolean boolean17 = partialDataOptionsBean16.getAssociated();
        partialDataOptionsBean16.setAssociated((java.lang.Boolean) false);
        modelBean0.setPartialDataOptions(partialDataOptionsBean16);
        java.lang.String str21 = modelBean0.getUpdateMethod();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(partialDataOptionsBean8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(boolean17);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test02398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02398");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        modelBean0.setIdProperty("");
        boolean boolean5 = modelBean0.isDisablePagingParameters();
        modelBean0.setExtend("");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean9 = modelBean0.getField("hi!");
        modelBean0.setDestroyMethod("hi!");
        java.lang.String str12 = modelBean0.getReader();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(modelFieldBean9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "json" + "'", str12, "json");
    }

    @Test
    public void test02399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02399");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("hi!");
        hasManyAssociation1.setForeignKey("");
        java.lang.Boolean boolean4 = hasManyAssociation1.getAutoLoad();
        java.lang.String str5 = hasManyAssociation1.getName();
        java.lang.String str6 = hasManyAssociation1.getForeignKey();
        java.lang.Boolean boolean7 = hasManyAssociation1.getAutoLoad();
        java.lang.String str8 = hasManyAssociation1.getAssociationKey();
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test02400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02400");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.update = "exclusion";
        apiObject0.destroy = "hi!";
        apiObject0.create = "";
        java.lang.String str12 = apiObject0.read;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test02401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02401");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        modelFieldBean2.setDateFormat("hi!");
        java.lang.Boolean boolean8 = modelFieldBean2.getUseNull();
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        modelFieldBean2.setCalculate("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        modelFieldBean2.setAllowBlank((java.lang.Boolean) false);
        modelFieldBean2.setMapping("Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});");
        java.lang.Boolean boolean17 = modelFieldBean2.getUseNull();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertEquals("'" + boolean17 + "' != '" + true + "'", boolean17, true);
    }

    @Test
    public void test02402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02402");
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
        java.lang.String str17 = apiObject0.create;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str13, "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "//" + "'", str16, "//");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});" + "'", str17, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
    }

    @Test
    public void test02403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02403");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        belongsToAssociation1.setForeignKey("hasOne");
        belongsToAssociation1.setSetterName("/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/");
        java.lang.String str6 = belongsToAssociation1.getSetterName();
        belongsToAssociation1.setForeignKey("/inclusion/");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/" + "'", str6, "/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/");
    }

    @Test
    public void test02404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02404");
        ch.rasc.extclassgenerator.validation.PresenceValidation presenceValidation1 = new ch.rasc.extclassgenerator.validation.PresenceValidation("Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[],proxy:{type:\"direct\",directFn:hi!}});");
    }

    @Test
    public void test02405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02405");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("Ext.define(\"null\",{extend:\"Ext.data.Model\",idProperty:\"hi!\",fields:[],proxy:{type:\"direct\",idParam:\"hi!\"}});", "ch.rasc.extclassgenerator.ModelAnnotationProcessor");
        modelFieldBean2.setAllowNull((java.lang.Boolean) true);
        modelFieldBean2.setMapping("hasMany");
    }

    @Test
    public void test02406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02406");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean4 = allDataOptionsBean0.getCritical();
        java.lang.Boolean boolean5 = allDataOptionsBean0.getPersist();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        allDataOptionsBean0.setChanges((java.lang.Boolean) true);
        java.lang.Boolean boolean10 = allDataOptionsBean0.getCritical();
        allDataOptionsBean0.setPersist((java.lang.Boolean) false);
        allDataOptionsBean0.setChanges((java.lang.Boolean) false);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean10);
    }

    @Test
    public void test02407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02407");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean4 = allDataOptionsBean0.getCritical();
        java.lang.Boolean boolean5 = allDataOptionsBean0.getPersist();
        java.lang.Boolean boolean6 = allDataOptionsBean0.getCritical();
        java.lang.Boolean boolean7 = allDataOptionsBean0.getAssociated();
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + false + "'", boolean7, false);
    }

    @Test
    public void test02408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02408");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        modelBean0.setIdProperty("");
        boolean boolean5 = modelBean0.isDisablePagingParameters();
        boolean boolean6 = modelBean0.isPaging();
        modelBean0.setDisablePagingParameters(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test02409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02409");
        ch.rasc.extclassgenerator.ModelAnnotationProcessor modelAnnotationProcessor0 = new ch.rasc.extclassgenerator.ModelAnnotationProcessor();
        java.util.Set<java.lang.String> strSet1 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        java.util.Set<java.lang.String> strSet2 = modelAnnotationProcessor0.getSupportedOptions();
        java.util.Set<java.lang.String> strSet3 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        java.util.Set<java.lang.String> strSet4 = modelAnnotationProcessor0.getSupportedOptions();
        javax.lang.model.element.Element element5 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror6 = null;
        javax.lang.model.element.ExecutableElement executableElement7 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable9 = modelAnnotationProcessor0.getCompletions(element5, annotationMirror6, executableElement7, "ch.rasc.extclassgenerator.ModelAnnotationProcessor");
        java.util.Set<java.lang.String> strSet10 = modelAnnotationProcessor0.getSupportedOptions();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(wildcardIterable9);
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test02410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02410");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});", (java.lang.Long) 32L, (java.lang.Long) 35L);
    }

    @Test
    public void test02411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02411");
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
        java.lang.Boolean boolean23 = modelFieldBean2.getAllowBlank();
        java.lang.Boolean boolean24 = modelFieldBean2.getAllowBlank();
        modelFieldBean2.setAllowBlank((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(abstractValidationArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(strList19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(boolean23);
        org.junit.Assert.assertNull(boolean24);
    }

    @Test
    public void test02412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02412");
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
        java.lang.Boolean boolean15 = modelFieldBean2.getUnique();
        modelFieldBean2.setCritical((java.lang.Boolean) true);
        modelFieldBean2.setDateFormat("/ch.rasc.extclassgenerator.ModelAnnotationProcessor/");
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(boolean15);
    }

    @Test
    public void test02413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02413");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("ch.rasc.extclassgenerator.ModelBean");
        java.lang.String str2 = hasManyAssociation1.getName();
        java.lang.String str3 = hasManyAssociation1.getPrimaryKey();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test02414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02414");
        ch.rasc.extclassgenerator.validation.InclusionValidation inclusionValidation2 = new ch.rasc.extclassgenerator.validation.InclusionValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});", "");
        java.lang.String str3 = inclusionValidation2.getList();
        java.lang.String str4 = inclusionValidation2.getField();
        java.lang.String str5 = inclusionValidation2.getList();
        java.lang.String str6 = inclusionValidation2.getList();
        java.lang.String str7 = inclusionValidation2.getList();
        java.lang.String str8 = inclusionValidation2.getList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});" + "'", str4, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test02415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02415");
        ch.rasc.extclassgenerator.validation.InclusionValidation inclusionValidation2 = new ch.rasc.extclassgenerator.validation.InclusionValidation("hasMany", "Ext.data.Model");
        java.lang.String str3 = inclusionValidation2.getList();
        java.lang.String str4 = inclusionValidation2.getList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.data.Model" + "'", str3, "Ext.data.Model");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Ext.data.Model" + "'", str4, "Ext.data.Model");
    }

    @Test
    public void test02416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02416");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.read = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str8 = apiObject0.update;
        apiObject0.read = "json";
        apiObject0.read = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});";
        java.lang.String str13 = apiObject0.destroy;
        java.lang.String str14 = apiObject0.destroy;
        apiObject0.create = "digits";
        apiObject0.read = "Ext.define(\"null\",\r\n{\n  extend : \"\",\n  idgen : \"Ext.define(\\\"java.util.ArrayList\\\",\\r\\n{\\n  extend : \\\"Ext.data.Model\\\",\\n  fields : [ ]\\n});\",\n  fields : [ ],\n  proxy : {\n    type : \"direct\",\n    reader : {\n      root : \"Ext.define(\\\"null\\\",{extend:\\\"Ext.data.Model\\\",idProperty:\\\"hi!\\\",fields:[],proxy:{type:\\\"direct\\\",idParam:\\\"hi!\\\"}});\",\n      messageProperty : \"hi!\"\n    },\n    writer : {\n      writeAllFields : false\n    }\n  }\n});";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str8, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test02417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02417");
        ch.rasc.extclassgenerator.validation.PastValidation pastValidation1 = new ch.rasc.extclassgenerator.validation.PastValidation("//");
    }

    @Test
    public void test02418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02418");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[],proxy:{type:\"direct\",directFn:hi!}});", (java.lang.Long) 1L, (java.lang.Long) 52L);
    }

    @Test
    public void test02419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02419");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        modelBean0.setIdProperty("");
        boolean boolean5 = modelBean0.isDisablePagingParameters();
        modelBean0.setExtend("");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean9 = modelBean0.getField("hi!");
        modelBean0.setVersionProperty("Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
        modelBean0.setClientIdProperty("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        java.util.Map<java.lang.String, ch.rasc.extclassgenerator.ModelFieldBean> strMap14 = modelBean0.getFields();
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = null;
        ch.rasc.extclassgenerator.validation.GenericValidation genericValidation18 = new ch.rasc.extclassgenerator.validation.GenericValidation("Ext.define(\"null\",{extend:\"\",config:{fields:[]}});", "/\\/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});\\//", strMap17);
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = genericValidation18.getOptions();
        modelBean0.addValidation((ch.rasc.extclassgenerator.validation.AbstractValidation) genericValidation18);
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = genericValidation18.getOptions();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(modelFieldBean9);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(strMap19);
        org.junit.Assert.assertNull(strMap21);
    }

    @Test
    public void test02420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02420");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        java.lang.String str3 = modelBean0.getReadMethod();
        java.lang.String str4 = modelBean0.getCreateMethod();
        modelBean0.setPaging(true);
        modelBean0.setCreateMethod("Ext.data.Model");
        modelBean0.setMessageProperty("Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[],proxy:{type:\"direct\",directFn:hi!}});");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test02421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02421");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Object obj5 = modelFieldBean2.getReference();
        modelFieldBean2.setPersist((java.lang.Boolean) false);
        java.lang.String str8 = modelFieldBean2.getName();
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test02422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02422");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getChild();
        java.lang.String str2 = referenceBean0.getRole();
        referenceBean0.setParent("hasOne");
        java.lang.String str5 = referenceBean0.getInverse();
        referenceBean0.setRole("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        java.lang.String str8 = referenceBean0.getInverse();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test02423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02423");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getParent();
        referenceBean0.setType("");
        referenceBean0.setRole("json");
        java.lang.String str7 = referenceBean0.getRole();
        java.lang.String str8 = referenceBean0.getChild();
        referenceBean0.setRole("Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[],proxy:{type:\"direct\",directFn:hi!}});");
        boolean boolean11 = referenceBean0.typeOnly();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "json" + "'", str7, "json");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test02424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02424");
        ch.rasc.extclassgenerator.ModelAnnotationProcessor modelAnnotationProcessor0 = new ch.rasc.extclassgenerator.ModelAnnotationProcessor();
        java.util.Set<java.lang.String> strSet1 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        java.util.Set<java.lang.String> strSet2 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        java.util.Set<java.lang.String> strSet3 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        javax.lang.model.SourceVersion sourceVersion4 = modelAnnotationProcessor0.getSupportedSourceVersion();
        javax.lang.model.SourceVersion sourceVersion5 = modelAnnotationProcessor0.getSupportedSourceVersion();
        javax.lang.model.SourceVersion sourceVersion6 = modelAnnotationProcessor0.getSupportedSourceVersion();
        javax.lang.model.element.Element element7 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror8 = null;
        javax.lang.model.element.ExecutableElement executableElement9 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable11 = modelAnnotationProcessor0.getCompletions(element7, annotationMirror8, executableElement9, "Ext.define(\"ch.rasc.extclassgenerator.validation.PresenceValidation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"field\",\n    type : \"string\"\n  } ]\n});");
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
        org.junit.Assert.assertTrue("'" + sourceVersion4 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion4.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertTrue("'" + sourceVersion5 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion5.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertTrue("'" + sourceVersion6 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion6.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(wildcardIterable11);
    }

    @Test
    public void test02425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02425");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("/belongsTo/");
        java.lang.String str2 = belongsToAssociation1.getGetterName();
        belongsToAssociation1.setForeignKey("/Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});/");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test02426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02426");
        ch.rasc.extclassgenerator.validation.FormatValidation formatValidation2 = new ch.rasc.extclassgenerator.validation.FormatValidation("", "belongsTo");
        java.lang.String str3 = formatValidation2.getMatcher();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/belongsTo/" + "'", str3, "/belongsTo/");
    }

    @Test
    public void test02427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02427");
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
        java.util.Set<java.lang.String> strSet14 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(wildcardIterable7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(wildcardIterable13);
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test02428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02428");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        java.lang.String str1 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str4 = apiObject0.update;
        apiObject0.create = "";
        apiObject0.destroy = "Ext.data.Model";
        java.lang.String str9 = apiObject0.read;
        java.lang.String str10 = apiObject0.destroy;
        java.lang.Class<?> wildcardClass11 = apiObject0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Ext.data.Model" + "'", str10, "Ext.data.Model");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02429");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        java.lang.String str3 = modelBean0.getIdProperty();
        java.lang.String[] strArray4 = modelBean0.getHasMany();
        boolean boolean5 = modelBean0.isClientIdPropertyAddToWriter();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test02430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02430");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("Ext.define(\"null\",{extend:\"\",fields:[]});", (java.lang.Integer) 0, (java.lang.Integer) 32);
    }

    @Test
    public void test02431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02431");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        java.lang.String str6 = referenceBean0.getInverse();
        referenceBean0.setAssociation("/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/");
        boolean boolean9 = referenceBean0.hasAnyProperties();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test02432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02432");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("past");
    }

    @Test
    public void test02433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02433");
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
        java.util.List<java.lang.String> strList30 = modelFieldBean2.getDepends();
        java.lang.String str31 = modelFieldBean2.getConvert();
        ch.rasc.extclassgenerator.ModelType modelType32 = modelFieldBean2.getModelType();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(boolean25);
        org.junit.Assert.assertNull(boolean28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNull(modelType32);
    }

    @Test
    public void test02434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02434");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean4 = allDataOptionsBean0.getPersist();
        boolean boolean5 = allDataOptionsBean0.hasAnyProperties();
        boolean boolean6 = allDataOptionsBean0.hasAnyProperties();
        allDataOptionsBean0.setChanges((java.lang.Boolean) true);
        java.lang.Boolean boolean9 = allDataOptionsBean0.getChanges();
        java.lang.Boolean boolean10 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean11 = allDataOptionsBean0.getPersist();
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + false + "'", boolean10, false);
        org.junit.Assert.assertNull(boolean11);
    }

    @Test
    public void test02435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02435");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        java.lang.String str6 = modelFieldBean2.getMapping();
        java.lang.Boolean boolean7 = modelFieldBean2.getAllowNull();
        java.lang.String str8 = modelFieldBean2.getName();
        modelFieldBean2.setCalculate("json");
        java.lang.Boolean boolean11 = modelFieldBean2.getAllowNull();
        modelFieldBean2.setPersist((java.lang.Boolean) true);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(boolean11);
    }

    @Test
    public void test02436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02436");
        ch.rasc.extclassgenerator.validation.NotBlankValidation notBlankValidation1 = new ch.rasc.extclassgenerator.validation.NotBlankValidation("ch.rasc.extclassgenerator.ModelAnnotationProcessor");
        java.lang.String str2 = notBlankValidation1.getField();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ch.rasc.extclassgenerator.ModelAnnotationProcessor" + "'", str2, "ch.rasc.extclassgenerator.ModelAnnotationProcessor");
    }

    @Test
    public void test02437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02437");
        ch.rasc.extclassgenerator.ModelAnnotationProcessor modelAnnotationProcessor0 = new ch.rasc.extclassgenerator.ModelAnnotationProcessor();
        java.util.Set<java.lang.String> strSet1 = modelAnnotationProcessor0.getSupportedOptions();
        java.util.Set<java.lang.String> strSet2 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        java.util.Set<java.lang.String> strSet3 = modelAnnotationProcessor0.getSupportedOptions();
        java.util.Set<java.lang.String> strSet4 = modelAnnotationProcessor0.getSupportedOptions();
        javax.lang.model.element.Element element5 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror6 = null;
        javax.lang.model.element.ExecutableElement executableElement7 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable9 = modelAnnotationProcessor0.getCompletions(element5, annotationMirror6, executableElement7, "/\\/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});\\//");
        javax.lang.model.element.Element element10 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror11 = null;
        javax.lang.model.element.ExecutableElement executableElement12 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable14 = modelAnnotationProcessor0.getCompletions(element10, annotationMirror11, executableElement12, "Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"debug\",\n    type : \"boolean\"\n  }, {\n    name : \"useSingleQuotes\",\n    type : \"boolean\"\n  }, {\n    name : \"surroundApiWithQuotes\",\n    type : \"boolean\"\n  } ]\n});");
        java.util.Set<java.lang.String> strSet15 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        java.util.Set<java.lang.String> strSet16 = modelAnnotationProcessor0.getSupportedOptions();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(wildcardIterable9);
        org.junit.Assert.assertNotNull(wildcardIterable14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test02438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02438");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        java.lang.String str6 = modelFieldBean2.getMapping();
        java.lang.String str7 = modelFieldBean2.getName();
        java.lang.String str8 = modelFieldBean2.getConvert();
        ch.rasc.extclassgenerator.ModelType modelType9 = modelFieldBean2.getModelType();
        java.lang.String str10 = modelFieldBean2.getType();
        modelFieldBean2.setCalculate("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        java.util.List<ch.rasc.extclassgenerator.validation.AbstractValidation> abstractValidationList13 = modelFieldBean2.getValidators();
        java.util.List<java.lang.String> strList14 = modelFieldBean2.getDepends();
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean17 = modelFieldBean2.getPersist();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(modelType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str10, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(abstractValidationList13);
        org.junit.Assert.assertNull(strList14);
        org.junit.Assert.assertNull(boolean17);
    }

    @Test
    public void test02439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02439");
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
        org.junit.Assert.assertTrue("'" + sourceVersion3 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion3.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(wildcardIterable9);
        org.junit.Assert.assertNotNull(wildcardIterable14);
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test02440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02440");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getType();
        referenceBean0.setRole("Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});");
        java.lang.String str4 = referenceBean0.getRole();
        referenceBean0.setInverse("belongsTo");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});" + "'", str4, "Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});");
    }

    @Test
    public void test02441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02441");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        referenceBean0.setType("");
        java.lang.String str3 = referenceBean0.getAssociation();
        referenceBean0.setInverse("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        java.lang.String str6 = referenceBean0.getType();
        java.lang.String str7 = referenceBean0.getParent();
        referenceBean0.setChild("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        referenceBean0.setRole("/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/");
        boolean boolean12 = referenceBean0.hasAnyProperties();
        java.lang.String str13 = referenceBean0.getRole();
        java.lang.String str14 = referenceBean0.getChild();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/" + "'", str13, "/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});" + "'", str14, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
    }

    @Test
    public void test02442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02442");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        java.lang.String str6 = modelFieldBean2.getMapping();
        modelFieldBean2.setConvert("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        java.lang.Boolean boolean9 = modelFieldBean2.getAllowNull();
        java.lang.String str10 = modelFieldBean2.getCalculate();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test02443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02443");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        java.lang.String str6 = modelFieldBean2.getMapping();
        java.lang.Object obj7 = modelFieldBean2.getReference();
        modelFieldBean2.setCalculate("exclusion");
        java.lang.Boolean boolean10 = modelFieldBean2.getUnique();
        java.lang.String str11 = modelFieldBean2.getConvert();
        java.lang.String str12 = modelFieldBean2.getConvert();
        java.lang.String str13 = modelFieldBean2.getMapping();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test02444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02444");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        modelFieldBean2.setCritical((java.lang.Boolean) false);
        java.lang.String str7 = modelFieldBean2.getDateFormat();
        java.lang.String str8 = modelFieldBean2.getConvert();
        ch.rasc.extclassgenerator.ModelType modelType9 = modelFieldBean2.getModelType();
        java.lang.String str10 = modelFieldBean2.getMapping();
        modelFieldBean2.setUseNull((java.lang.Boolean) false);
        java.lang.Boolean boolean13 = modelFieldBean2.getUseNull();
        java.lang.Object obj14 = modelFieldBean2.getReference();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(modelType9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + false + "'", boolean13, false);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test02445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02445");
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
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation24 = new ch.rasc.extclassgenerator.association.HasManyAssociation("hi!");
        hasManyAssociation24.setAssociationKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        hasManyAssociation24.setForeignKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        hasManyAssociation24.setInstanceName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        hasManyAssociation24.setInstanceName("");
        modelBean0.addAssociation((ch.rasc.extclassgenerator.association.AbstractAssociation) hasManyAssociation24);
        hasManyAssociation24.setName("Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(partialDataOptionsBean8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(partialDataOptionsBean18);
    }

    @Test
    public void test02446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02446");
        ch.rasc.extclassgenerator.validation.NotBlankValidation notBlankValidation1 = new ch.rasc.extclassgenerator.validation.NotBlankValidation("Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ {\n      name : \"debug\",\n      type : \"boolean\"\n    }, {\n      name : \"useSingleQuotes\",\n      type : \"boolean\"\n    }, {\n      name : \"surroundApiWithQuotes\",\n      type : \"boolean\"\n    } ]\n  }\n});");
    }

    @Test
    public void test02447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02447");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        modelBean0.setIdProperty("");
        boolean boolean5 = modelBean0.isDisablePagingParameters();
        modelBean0.setExtend("");
        ch.rasc.extclassgenerator.PartialDataOptionsBean partialDataOptionsBean8 = modelBean0.getPartialDataOptions();
        modelBean0.setMessageProperty("hi!");
        ch.rasc.extclassgenerator.OutputFormat outputFormat11 = ch.rasc.extclassgenerator.OutputFormat.EXTJS5;
        java.lang.String str13 = ch.rasc.extclassgenerator.ModelGenerator.generateJavascript(modelBean0, outputFormat11, false);
        modelBean0.setClientIdPropertyAddToWriter(true);
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean18 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean18.setConvert("hi!");
        java.lang.Boolean boolean21 = modelFieldBean18.getPersist();
        java.lang.String str22 = modelFieldBean18.getMapping();
        modelFieldBean18.setConvert("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation26 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        hasOneAssociation26.setInstanceName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean18.setDefaultValue((java.lang.Object) hasOneAssociation26);
        modelBean0.addAssociation((ch.rasc.extclassgenerator.association.AbstractAssociation) hasOneAssociation26);
        java.lang.String str31 = modelBean0.getVersionProperty();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(partialDataOptionsBean8);
        org.junit.Assert.assertTrue("'" + outputFormat11 + "' != '" + ch.rasc.extclassgenerator.OutputFormat.EXTJS5 + "'", outputFormat11.equals(ch.rasc.extclassgenerator.OutputFormat.EXTJS5));
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str13, "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(boolean21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test02448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02448");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        java.lang.String str6 = modelFieldBean2.getMapping();
        java.lang.Object obj7 = modelFieldBean2.getReference();
        modelFieldBean2.setCalculate("exclusion");
        java.lang.Boolean boolean10 = modelFieldBean2.getUnique();
        java.lang.String str11 = modelFieldBean2.getConvert();
        java.lang.Boolean boolean12 = modelFieldBean2.getAllowNull();
        java.lang.Object obj13 = modelFieldBean2.getReference();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test02449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02449");
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
        java.lang.Boolean boolean36 = modelFieldBean2.getUseNull();
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean40 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean40.setConvert("hi!");
        java.lang.Boolean boolean43 = modelFieldBean40.getPersist();
        java.lang.String str44 = modelFieldBean40.getMapping();
        java.lang.String str45 = modelFieldBean40.getName();
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray52 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList50);
        modelFieldBean40.setDepends((java.util.List<java.lang.String>) strList50);
        modelFieldBean40.setCalculate("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean59 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean59.setConvert("hi!");
        java.lang.Boolean boolean62 = modelFieldBean59.getPersist();
        java.lang.String str63 = modelFieldBean59.getMapping();
        java.lang.String str64 = modelFieldBean59.getName();
        java.lang.String[] strArray68 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList69 = new java.util.ArrayList<java.lang.String>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList69, strArray68);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray71 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList69);
        modelFieldBean59.setDepends((java.util.List<java.lang.String>) strList69);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray73 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});", (java.util.List<java.lang.String>) strList69);
        modelFieldBean40.setDepends((java.util.List<java.lang.String>) strList69);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray75 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});/", (java.util.List<java.lang.String>) strList69);
        modelFieldBean2.setDepends((java.util.List<java.lang.String>) strList69);
        java.util.List<ch.rasc.extclassgenerator.validation.AbstractValidation> abstractValidationList77 = modelFieldBean2.getValidators();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertEquals("'" + boolean36 + "' != '" + false + "'", boolean36, false);
        org.junit.Assert.assertNull(boolean43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNull(boolean62);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNull(abstractValidationList77);
    }

    @Test
    public void test02450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02450");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        boolean boolean1 = allDataOptionsBean0.hasAnyProperties();
        allDataOptionsBean0.setPersist((java.lang.Boolean) true);
        allDataOptionsBean0.setCritical((java.lang.Boolean) false);
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean8 = allDataOptionsBean0.getPersist();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test02451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02451");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("/Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});/");
        java.lang.String str2 = hasOneAssociation1.getSetterName();
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test02452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02452");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray10 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList8);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray11 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("", (java.util.List<java.lang.String>) strList8);
        java.util.List<java.lang.String> strList12 = exclusionValidationArray11.getList();
        java.util.List<java.lang.String> strList13 = exclusionValidationArray11.getList();
        java.util.List<java.lang.String> strList14 = exclusionValidationArray11.getList();
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray15 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("json", strList14);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray16 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("Ext.define(\"ch.rasc.extclassgenerator.association.BelongsToAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"setterName\",\n    type : \"string\"\n  }, {\n    name : \"getterName\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});", strList14);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray17 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});", strList14);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test02453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02453");
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
        java.util.Set<java.lang.String> strSet14 = modelAnnotationProcessor0.getSupportedOptions();
        javax.lang.model.element.Element element15 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror16 = null;
        javax.lang.model.element.ExecutableElement executableElement17 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable19 = modelAnnotationProcessor0.getCompletions(element15, annotationMirror16, executableElement17, "/hasMany/");
        javax.annotation.processing.ProcessingEnvironment processingEnvironment20 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelAnnotationProcessor0.init(processingEnvironment20);
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
        org.junit.Assert.assertNotNull(wildcardIterable19);
    }

    @Test
    public void test02454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02454");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean4 = allDataOptionsBean0.getPersist();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        allDataOptionsBean0.setPersist((java.lang.Boolean) false);
        boolean boolean9 = allDataOptionsBean0.hasAnyProperties();
        boolean boolean10 = allDataOptionsBean0.hasAnyProperties();
        allDataOptionsBean0.setChanges((java.lang.Boolean) false);
        boolean boolean13 = allDataOptionsBean0.hasAnyProperties();
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test02455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02455");
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation3 = new ch.rasc.extclassgenerator.validation.RangeValidation("exclusion", (java.lang.Long) 1L, (java.lang.Long) 100L);
        java.math.BigDecimal bigDecimal4 = rangeValidation3.getMin();
        org.junit.Assert.assertNotNull(bigDecimal4);
    }

    @Test
    public void test02456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02456");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean3 = new ch.rasc.extclassgenerator.ModelFieldBean("Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});", "hi!");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean7 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean7.setConvert("hi!");
        java.lang.Boolean boolean10 = modelFieldBean7.getPersist();
        java.lang.String str11 = modelFieldBean7.getMapping();
        java.lang.String str12 = modelFieldBean7.getName();
        java.lang.String str13 = modelFieldBean7.getConvert();
        java.lang.String str14 = modelFieldBean7.getDateFormat();
        java.lang.Object obj15 = modelFieldBean7.getDefaultValue();
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean19 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean19.setConvert("hi!");
        modelFieldBean19.setMapping("hi!");
        modelFieldBean19.setUseNull((java.lang.Boolean) true);
        modelFieldBean19.setAllowBlank((java.lang.Boolean) false);
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray35 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList33);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray36 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("", (java.util.List<java.lang.String>) strList33);
        java.util.List<java.lang.String> strList37 = exclusionValidationArray36.getList();
        modelFieldBean19.setDepends(strList37);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray39 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});", strList37);
        java.lang.String str40 = exclusionValidationArray39.getField();
        java.util.List<java.lang.String> strList41 = exclusionValidationArray39.getList();
        modelFieldBean7.setDepends(strList41);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray43 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("Ext.define(\"null\",{extend:\"\",config:{fields:[]}});", strList41);
        modelFieldBean3.setDefaultValue((java.lang.Object) exclusionValidationArray43);
        java.util.List<java.lang.String> strList45 = exclusionValidationArray43.getList();
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray46 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("/Ext.data.Model/", strList45);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});" + "'", str40, "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertNotNull(strList45);
    }

    @Test
    public void test02457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02457");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});");
        hasOneAssociation1.setInstanceName("Ext.data.Model");
        java.lang.String str4 = hasOneAssociation1.getSetterName();
        hasOneAssociation1.setForeignKey("/Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});/");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test02458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02458");
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
        java.lang.String str14 = referenceBean0.getRole();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});" + "'", str12, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "json" + "'", str14, "json");
    }

    @Test
    public void test02459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02459");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray12 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList10);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray13 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("", (java.util.List<java.lang.String>) strList10);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray14 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("json", (java.util.List<java.lang.String>) strList10);
        java.util.List<java.lang.String> strList15 = exclusionValidationArray14.getList();
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray16 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("exclusion", strList15);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray17 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", strList15);
        java.util.List<java.lang.String> strList18 = exclusionValidationArray17.getList();
        java.util.List<java.lang.String> strList19 = exclusionValidationArray17.getList();
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray20 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});", strList19);
        java.util.List<java.lang.String> strList21 = exclusionValidationArray20.getList();
        java.util.List<java.lang.String> strList22 = exclusionValidationArray20.getList();
        java.util.List<java.lang.String> strList23 = exclusionValidationArray20.getList();
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray24 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("/Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});/", strList23);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(strList23);
    }

    @Test
    public void test02460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02460");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.update = "exclusion";
        java.lang.String str8 = apiObject0.read;
        java.lang.String str9 = apiObject0.destroy;
        apiObject0.update = "creditCardNumber";
        apiObject0.destroy = "Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"debug\",\n    type : \"boolean\"\n  }, {\n    name : \"useSingleQuotes\",\n    type : \"boolean\"\n  }, {\n    name : \"surroundApiWithQuotes\",\n    type : \"boolean\"\n  } ]\n});";
        java.lang.String str14 = apiObject0.destroy;
        apiObject0.update = "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});/";
        apiObject0.read = "Ext.define(\"Ext.define(\"null\",{extend:\"Ext.data.Model\",idProperty:\"hi!\",fields:[],proxy:{type:\"direct\",idParam:\"hi!\"}});\",{extend:\"/\\\\/Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\\\\//\",uses:[\"hi!\"],fields:[],hasMany:[\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\",\"json\",\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\",\"\"],associations:[{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],proxy:{type:\"direct\",directFn:hi!}});";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"debug\",\n    type : \"boolean\"\n  }, {\n    name : \"useSingleQuotes\",\n    type : \"boolean\"\n  }, {\n    name : \"surroundApiWithQuotes\",\n    type : \"boolean\"\n  } ]\n});" + "'", str14, "Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"debug\",\n    type : \"boolean\"\n  }, {\n    name : \"useSingleQuotes\",\n    type : \"boolean\"\n  }, {\n    name : \"surroundApiWithQuotes\",\n    type : \"boolean\"\n  } ]\n});");
    }

    @Test
    public void test02461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02461");
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
        java.lang.String str26 = apiObject0.destroy;
        java.lang.String str27 = apiObject0.read;
        java.lang.String str28 = apiObject0.destroy;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "json" + "'", str10, "json");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/" + "'", str12, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[],proxy:{type:\"direct\",directFn:hi!}});" + "'", str25, "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[],proxy:{type:\"direct\",directFn:hi!}});");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[],proxy:{type:\"direct\",directFn:hi!}});" + "'", str27, "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[],proxy:{type:\"direct\",directFn:hi!}});");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test02462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02462");
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation4 = new ch.rasc.extclassgenerator.validation.RangeValidation("ch.rasc.extclassgenerator.ModelBean", (java.lang.Long) 97L, (java.lang.Long) 0L);
        java.math.BigDecimal bigDecimal5 = rangeValidation4.getMax();
        java.math.BigDecimal bigDecimal6 = rangeValidation4.getMin();
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
        java.math.BigDecimal bigDecimal98 = rangeValidation97.getMin();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation99 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"null\",\r\n{\n  extend : \"Ext.data.Model\",\n  idgen : \"Ext.define(\\\"null\\\",{extend:\\\"Ext.data.Model\\\",config:{fields:[],proxy:{type:\\\"direct\\\",directFn:hi!,writer:{type:\\\"Ext.define(\\\\\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\\\\\",{extend:\\\\\\\"Ext.data.Model\\\\\\\",config:{fields:[]}});\\\"}}}});\",\n  fields : [ ]\n});", bigDecimal6, bigDecimal98);
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
        org.junit.Assert.assertNotNull(bigDecimal98);
    }

    @Test
    public void test02463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02463");
        ch.rasc.extclassgenerator.validation.InclusionValidation inclusionValidation2 = new ch.rasc.extclassgenerator.validation.InclusionValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});/", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
        java.lang.String str3 = inclusionValidation2.getList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
    }

    @Test
    public void test02464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02464");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        java.lang.String str2 = hasOneAssociation1.getName();
        hasOneAssociation1.setInstanceName("");
        java.lang.String str5 = hasOneAssociation1.getInstanceName();
        hasOneAssociation1.setSetterName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str8 = hasOneAssociation1.getGetterName();
        hasOneAssociation1.setSetterName("belongsTo");
        java.lang.String str11 = hasOneAssociation1.getGetterName();
        java.lang.String str12 = hasOneAssociation1.getName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test02465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02465");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("Ext.define(\"null\",\r\n{\n  extend : \"Ext.data.Model\",\n  idgen : \"Ext.define(\\\"null\\\",{extend:\\\"Ext.data.Model\\\",config:{fields:[],proxy:{type:\\\"direct\\\",directFn:hi!,writer:{type:\\\"Ext.define(\\\\\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\\\\\",{extend:\\\\\\\"Ext.data.Model\\\\\\\",config:{fields:[]}});\\\"}}}});\",\n  fields : [ ]\n});");
    }

    @Test
    public void test02466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02466");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Object obj5 = modelFieldBean2.getReference();
        java.lang.String str6 = modelFieldBean2.getName();
        ch.rasc.extclassgenerator.OutputConfig outputConfig7 = new ch.rasc.extclassgenerator.OutputConfig();
        boolean boolean8 = outputConfig7.isSurroundApiWithQuotes();
        boolean boolean9 = outputConfig7.isSurroundApiWithQuotes();
        boolean boolean10 = modelFieldBean2.hasOnlyName(outputConfig7);
        java.lang.String str11 = modelFieldBean2.getDateFormat();
        java.lang.Boolean boolean12 = modelFieldBean2.getUseNull();
        java.lang.String str13 = modelFieldBean2.getMapping();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test02467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02467");
        ch.rasc.extclassgenerator.validation.InclusionValidation inclusionValidation2 = new ch.rasc.extclassgenerator.validation.InclusionValidation("/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/", "exclusion");
        java.lang.String str3 = inclusionValidation2.getList();
        java.lang.String str4 = inclusionValidation2.getList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "exclusion" + "'", str3, "exclusion");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "exclusion" + "'", str4, "exclusion");
    }

    @Test
    public void test02468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02468");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        ch.rasc.extclassgenerator.validation.GenericValidation genericValidation3 = new ch.rasc.extclassgenerator.validation.GenericValidation("ch.rasc.extclassgenerator.PartialDataOptionsBean", "Ext.data.Model", strMap2);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = genericValidation3.getOptions();
        java.lang.String str5 = genericValidation3.getType();
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ch.rasc.extclassgenerator.PartialDataOptionsBean" + "'", str5, "ch.rasc.extclassgenerator.PartialDataOptionsBean");
    }

    @Test
    public void test02469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02469");
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
        referenceBean0.setParent("ch.rasc.extclassgenerator.ModelAnnotationProcessor");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});" + "'", str13, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
    }

    @Test
    public void test02470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02470");
        ch.rasc.extclassgenerator.validation.PresenceValidation presenceValidation1 = new ch.rasc.extclassgenerator.validation.PresenceValidation("//");
    }

    @Test
    public void test02471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02471");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        ch.rasc.extclassgenerator.validation.GenericValidation genericValidation3 = new ch.rasc.extclassgenerator.validation.GenericValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});", "/\\/belongsTo\\//", strMap2);
    }

    @Test
    public void test02472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02472");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        modelFieldBean2.setDateFormat("hi!");
        java.lang.Boolean boolean8 = modelFieldBean2.getUseNull();
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        modelFieldBean2.setCalculate("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        java.lang.Boolean boolean13 = modelFieldBean2.getUseNull();
        modelFieldBean2.setDateFormat("Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",{extend:\"Ext.data.Model\",fields:[{name:\"debug\",type:\"boolean\"},{name:\"useSingleQuotes\",type:\"boolean\"},{name:\"surroundApiWithQuotes\",type:\"boolean\"}]});");
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + true + "'", boolean13, true);
    }

    @Test
    public void test02473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02473");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        boolean boolean1 = allDataOptionsBean0.hasAnyProperties();
        boolean boolean2 = allDataOptionsBean0.hasAnyProperties();
        boolean boolean3 = allDataOptionsBean0.hasAnyProperties();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test02474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02474");
        ch.rasc.extclassgenerator.validation.InclusionValidation inclusionValidation2 = new ch.rasc.extclassgenerator.validation.InclusionValidation("/\\/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});\\//", "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});/");
        java.lang.String str3 = inclusionValidation2.getField();
        java.lang.Class<?> wildcardClass4 = inclusionValidation2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/\\/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});\\//" + "'", str3, "/\\/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});\\//");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test02475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02475");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("Ext.define(\"ch.rasc.extclassgenerator.AllDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});", (java.lang.Integer) 32, (java.lang.Integer) 100);
    }

    @Test
    public void test02476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02476");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Object obj5 = modelFieldBean2.getReference();
        modelFieldBean2.setPersist((java.lang.Boolean) false);
        modelFieldBean2.setAllowNull((java.lang.Boolean) false);
        ch.rasc.extclassgenerator.ModelType modelType10 = modelFieldBean2.getModelType();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(modelType10);
    }

    @Test
    public void test02477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02477");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("Ext.define(\"null\",\r\n{\n  extend : \"Ext.data.Model\",\n  idgen : \"Ext.define(\\\"null\\\",{extend:\\\"Ext.data.Model\\\",config:{fields:[],proxy:{type:\\\"direct\\\",directFn:hi!,writer:{type:\\\"Ext.define(\\\\\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\\\\\",{extend:\\\\\\\"Ext.data.Model\\\\\\\",config:{fields:[]}});\\\"}}}});\",\n  fields : [ ]\n});");
    }

    @Test
    public void test02478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02478");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        java.lang.String str1 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str4 = apiObject0.update;
        apiObject0.create = "";
        apiObject0.destroy = "Ext.data.Model";
        java.lang.String str9 = apiObject0.update;
        apiObject0.read = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});";
        java.lang.String str12 = apiObject0.read;
        java.lang.String str13 = apiObject0.update;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});" + "'", str12, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test02479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02479");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        java.lang.String str3 = modelBean0.getReadMethod();
        java.lang.String str4 = modelBean0.getCreateMethod();
        modelBean0.setPaging(true);
        modelBean0.setReadMethod("hasOne");
        java.lang.String str9 = modelBean0.getIdentifier();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test02480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02480");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});", (java.lang.Integer) 32, (java.lang.Integer) 1);
        java.lang.String str4 = lengthValidation3.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "length" + "'", str4, "length");
    }

    @Test
    public void test02481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02481");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        allDataOptionsBean0.setChanges((java.lang.Boolean) false);
        allDataOptionsBean0.setPersist((java.lang.Boolean) false);
        allDataOptionsBean0.setChanges((java.lang.Boolean) true);
        java.lang.Boolean boolean9 = allDataOptionsBean0.getPersist();
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + false + "'", boolean9, false);
    }

    @Test
    public void test02482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02482");
        ch.rasc.extclassgenerator.validation.InclusionValidation inclusionValidation2 = new ch.rasc.extclassgenerator.validation.InclusionValidation("/inclusion/", "range");
    }

    @Test
    public void test02483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02483");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        modelBean0.setIdProperty("");
        boolean boolean5 = modelBean0.isDisablePagingParameters();
        boolean boolean6 = modelBean0.isPaging();
        java.lang.String str7 = modelBean0.getRootProperty();
        modelBean0.setReader("");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean11 = modelBean0.getField("hasOne");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(modelFieldBean11);
    }

    @Test
    public void test02484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02484");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getType();
        referenceBean0.setAssociation("format");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test02485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02485");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        java.lang.String str3 = modelBean0.getIdProperty();
        java.lang.String str4 = modelBean0.getCreateMethod();
        modelBean0.setIdProperty("hi!");
        java.lang.String str7 = modelBean0.getName();
        modelBean0.setUpdateMethod("hi!");
        modelBean0.setRootProperty("Ext.define(\"ch.rasc.extclassgenerator.ModelFieldBean\",{extend:\"Ext.data.Model\",fields:[{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"dateFormat\",type:\"string\"},{name:\"useNull\",type:\"boolean\"},{name:\"allowNull\",type:\"boolean\"},{name:\"mapping\",type:\"string\"},{name:\"persist\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"convert\",type:\"string\"},{name:\"calculate\",type:\"string\"},{name:\"allowBlank\",type:\"boolean\"},{name:\"unique\",type:\"boolean\"}]});");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test02486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02486");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        modelBean0.setIdProperty("");
        boolean boolean5 = modelBean0.isDisablePagingParameters();
        modelBean0.setExtend("");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean9 = modelBean0.getField("hi!");
        boolean boolean10 = modelBean0.isPaging();
        modelBean0.setClientIdProperty("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        modelBean0.setClientIdProperty("Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});");
        modelBean0.setVersionProperty("/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(modelFieldBean9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test02487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02487");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean4 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean4.setConvert("hi!");
        modelFieldBean4.setMapping("hi!");
        modelFieldBean4.setUseNull((java.lang.Boolean) true);
        modelFieldBean4.setAllowBlank((java.lang.Boolean) false);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray20 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList18);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray21 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("", (java.util.List<java.lang.String>) strList18);
        java.util.List<java.lang.String> strList22 = exclusionValidationArray21.getList();
        modelFieldBean4.setDepends(strList22);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray24 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("ch.rasc.extclassgenerator.ModelAnnotationProcessor", strList22);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray25 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});", strList22);
        java.util.List<java.lang.String> strList26 = exclusionValidationArray25.getList();
        java.lang.String str27 = exclusionValidationArray25.getField();
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});" + "'", str27, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
    }

    @Test
    public void test02488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02488");
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
        java.lang.Boolean boolean24 = modelFieldBean2.getAllowNull();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(boolean23);
        org.junit.Assert.assertNull(boolean24);
    }

    @Test
    public void test02489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02489");
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
        boolean boolean15 = referenceBean0.hasAnyProperties();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});" + "'", str12, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test02490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02490");
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
        java.util.Set<java.lang.String> strSet15 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertTrue("'" + sourceVersion2 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion2.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertTrue("'" + sourceVersion3 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion3.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(wildcardIterable8);
        org.junit.Assert.assertTrue("'" + sourceVersion9 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion9.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(wildcardIterable14);
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test02491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02491");
        ch.rasc.extclassgenerator.OutputConfig outputConfig0 = new ch.rasc.extclassgenerator.OutputConfig();
        boolean boolean1 = outputConfig0.isSurroundApiWithQuotes();
        boolean boolean2 = outputConfig0.isDebug();
        ch.rasc.extclassgenerator.ModelAnnotationProcessor modelAnnotationProcessor3 = new ch.rasc.extclassgenerator.ModelAnnotationProcessor();
        java.util.Set<java.lang.String> strSet4 = modelAnnotationProcessor3.getSupportedAnnotationTypes();
        boolean boolean5 = outputConfig0.equals((java.lang.Object) strSet4);
        boolean boolean6 = outputConfig0.isSurroundApiWithQuotes();
        boolean boolean7 = outputConfig0.isSurroundApiWithQuotes();
        boolean boolean8 = outputConfig0.isUseSingleQuotes();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test02492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02492");
        ch.rasc.extclassgenerator.validation.ExclusionValidation exclusionValidation2 = new ch.rasc.extclassgenerator.validation.ExclusionValidation("/Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});/", "Ext.define(\"ch.rasc.extclassgenerator.validation.InclusionValidationArray\",{extend:\"Ext.data.Model\",fields:[{name:\"type\",type:\"string\"},{name:\"field\",type:\"string\"}]});");
    }

    @Test
    public void test02493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02493");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("Ext.define(\"java.util.ArrayList\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Integer) 97, (java.lang.Integer) 97);
    }

    @Test
    public void test02494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02494");
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
        java.lang.String str21 = modelFieldBean2.getConvert();
        java.lang.Boolean boolean22 = modelFieldBean2.getAllowBlank();
        java.lang.Boolean boolean23 = modelFieldBean2.getCritical();
        java.lang.String str24 = modelFieldBean2.getMapping();
        modelFieldBean2.setConvert("Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});");
        org.junit.Assert.assertNotNull(abstractValidationArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNull(boolean22);
        org.junit.Assert.assertNull(boolean23);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test02495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02495");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        java.lang.Boolean boolean1 = allDataOptionsBean0.getPersist();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) true);
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test02496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02496");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("length", "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});");
        java.lang.String str3 = modelFieldBean2.getConvert();
        java.lang.Object obj4 = modelFieldBean2.getDefaultValue();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test02497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02497");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        java.lang.String str3 = modelBean0.getIdProperty();
        modelBean0.setTotalProperty("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean6 = modelBean0.getAllDataOptions();
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean8 = modelBean0.getField("belongsTo");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(allDataOptionsBean6);
        org.junit.Assert.assertNull(modelFieldBean8);
    }

    @Test
    public void test02498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02498");
        ch.rasc.extclassgenerator.validation.EmailValidation emailValidation1 = new ch.rasc.extclassgenerator.validation.EmailValidation("Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ {\n      name : \"debug\",\n      type : \"boolean\"\n    }, {\n      name : \"useSingleQuotes\",\n      type : \"boolean\"\n    }, {\n      name : \"surroundApiWithQuotes\",\n      type : \"boolean\"\n    } ]\n  }\n});");
    }

    @Test
    public void test02499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02499");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("hi!");
        hasManyAssociation1.setForeignKey("");
        java.lang.Boolean boolean4 = hasManyAssociation1.getAutoLoad();
        java.lang.String str5 = hasManyAssociation1.getName();
        java.lang.String str6 = hasManyAssociation1.getForeignKey();
        hasManyAssociation1.setAssociationKey("ch.rasc.extclassgenerator.ModelAnnotationProcessor");
        hasManyAssociation1.setAutoLoad((java.lang.Boolean) true);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test02500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02500");
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation3 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 100L, (java.lang.Long) 97L);
    }
}
