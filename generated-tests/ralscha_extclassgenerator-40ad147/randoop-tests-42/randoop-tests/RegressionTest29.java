import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest29 {

    public static boolean debug = false;

    @Test
    public void test14501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14501");
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
        modelBean0.setWriteAllFields((java.lang.Boolean) true);
        java.lang.Boolean boolean19 = modelBean0.getWriteAllFields();
        modelBean0.setReader("/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(partialDataOptionsBean8);
        org.junit.Assert.assertEquals("'" + boolean19 + "' != '" + true + "'", boolean19, true);
    }

    @Test
    public void test14502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14502");
        ch.rasc.extclassgenerator.PartialDataOptionsBean partialDataOptionsBean0 = new ch.rasc.extclassgenerator.PartialDataOptionsBean();
        java.lang.Boolean boolean1 = partialDataOptionsBean0.getChanges();
        java.lang.Boolean boolean2 = partialDataOptionsBean0.getCritical();
        boolean boolean3 = partialDataOptionsBean0.hasAnyProperties();
        java.lang.Boolean boolean4 = partialDataOptionsBean0.getCritical();
        partialDataOptionsBean0.setChanges((java.lang.Boolean) true);
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test14503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14503");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean4 = allDataOptionsBean0.getPersist();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        allDataOptionsBean0.setPersist((java.lang.Boolean) false);
        boolean boolean9 = allDataOptionsBean0.hasAnyProperties();
        allDataOptionsBean0.setChanges((java.lang.Boolean) false);
        allDataOptionsBean0.setChanges((java.lang.Boolean) true);
        allDataOptionsBean0.setPersist((java.lang.Boolean) false);
        allDataOptionsBean0.setPersist((java.lang.Boolean) true);
        java.lang.Boolean boolean18 = allDataOptionsBean0.getPersist();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) true);
        java.lang.Boolean boolean21 = allDataOptionsBean0.getCritical();
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + boolean18 + "' != '" + true + "'", boolean18, true);
        org.junit.Assert.assertNull(boolean21);
    }

    @Test
    public void test14504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14504");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        modelBean0.setIdProperty("");
        boolean boolean5 = modelBean0.isDisablePagingParameters();
        modelBean0.setExtend("");
        ch.rasc.extclassgenerator.PartialDataOptionsBean partialDataOptionsBean8 = modelBean0.getPartialDataOptions();
        modelBean0.setMessageProperty("hi!");
        modelBean0.setWriteAllFields((java.lang.Boolean) false);
        java.lang.String str13 = modelBean0.getName();
        modelBean0.setVersionProperty("Ext.define(\"null\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ],\n  proxy : {\n    type : \"direct\",\n    reader : {\n      totalProperty : \"/Ext.define(\\\"ch.rasc.extclassgenerator.association.HasManyAssociation\\\",{extend:\\\"Ext.data.Model\\\",fields:[{name:\\\"autoLoad\\\",type:\\\"boolean\\\"},{name:\\\"name\\\",type:\\\"string\\\"},{name:\\\"type\\\",type:\\\"string\\\"},{name:\\\"model\\\",type:\\\"string\\\"},{name:\\\"associationKey\\\",type:\\\"string\\\"},{name:\\\"foreignKey\\\",type:\\\"string\\\"},{name:\\\"primaryKey\\\",type:\\\"string\\\"},{name:\\\"instanceName\\\",type:\\\"string\\\"}]});/\"\n    }\n  }\n});");
        java.lang.String str16 = modelBean0.getSuccessProperty();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(partialDataOptionsBean8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test14505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14505");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        java.lang.String str1 = apiObject0.update;
        apiObject0.update = "";
        apiObject0.read = "";
        java.lang.String str6 = apiObject0.destroy;
        apiObject0.create = "Ext.define(\"null\",{extend:\"Ext.data.Model\",idProperty:\"hi!\",fields:[],proxy:{type:\"direct\",idParam:\"hi!\"}});";
        apiObject0.update = "/range/";
        apiObject0.update = "/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});/";
        java.lang.String str13 = apiObject0.read;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test14506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14506");
        ch.rasc.extclassgenerator.validation.ExclusionValidation exclusionValidation2 = new ch.rasc.extclassgenerator.validation.ExclusionValidation("json", "ch.rasc.extclassgenerator.association.HasManyAssociation");
        java.lang.String str3 = exclusionValidation2.getList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ch.rasc.extclassgenerator.association.HasManyAssociation" + "'", str3, "ch.rasc.extclassgenerator.association.HasManyAssociation");
    }

    @Test
    public void test14507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14507");
        ch.rasc.extclassgenerator.validation.ExclusionValidation exclusionValidation2 = new ch.rasc.extclassgenerator.validation.ExclusionValidation("/belongsTo/", "/belongsTo/");
        java.lang.String str3 = exclusionValidation2.getList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/belongsTo/" + "'", str3, "/belongsTo/");
    }

    @Test
    public void test14508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14508");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        modelFieldBean2.setDateFormat("hi!");
        modelFieldBean2.setAllowNull((java.lang.Boolean) false);
        modelFieldBean2.setPersist((java.lang.Boolean) true);
        java.lang.Boolean boolean12 = modelFieldBean2.getPersist();
        modelFieldBean2.setCalculate("Ext.define(\"ch.rasc.extclassgenerator.ReferenceBean\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"type\",type:\"string\"},{name:\"association\",type:\"string\"},{name:\"child\",type:\"string\"},{name:\"parent\",type:\"string\"},{name:\"role\",type:\"string\"},{name:\"inverse\",type:\"string\"}]}});");
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
    }

    @Test
    public void test14509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14509");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getParent();
        referenceBean0.setInverse("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        java.lang.String str5 = referenceBean0.getInverse();
        referenceBean0.setChild("/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/");
        java.lang.String str8 = referenceBean0.getAssociation();
        java.lang.String str9 = referenceBean0.getInverse();
        java.lang.String str10 = referenceBean0.getParent();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});" + "'", str5, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});" + "'", str9, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test14510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14510");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        hasOneAssociation1.setGetterName("hi!");
        hasOneAssociation1.setPrimaryKey("ch.rasc.extclassgenerator.validation.RangeValidation");
    }

    @Test
    public void test14511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14511");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        java.lang.String str2 = hasOneAssociation1.getName();
        hasOneAssociation1.setInstanceName("");
        java.lang.String str5 = hasOneAssociation1.getForeignKey();
        java.lang.String str6 = hasOneAssociation1.getGetterName();
        hasOneAssociation1.setAssociationKey("Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});");
        hasOneAssociation1.setGetterName("Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
        java.lang.String str11 = hasOneAssociation1.getName();
        java.lang.String str12 = hasOneAssociation1.getForeignKey();
        hasOneAssociation1.setForeignKey("");
        hasOneAssociation1.setName("");
        java.lang.String str17 = hasOneAssociation1.getAssociationKey();
        hasOneAssociation1.setGetterName("/\\/Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});\\//");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str17, "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});");
    }

    @Test
    public void test14512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14512");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        boolean boolean4 = allDataOptionsBean0.hasAnyProperties();
        allDataOptionsBean0.setCritical((java.lang.Boolean) true);
        boolean boolean7 = allDataOptionsBean0.hasAnyProperties();
        allDataOptionsBean0.setPersist((java.lang.Boolean) true);
        allDataOptionsBean0.setCritical((java.lang.Boolean) true);
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        boolean boolean14 = allDataOptionsBean0.hasAnyProperties();
        boolean boolean15 = allDataOptionsBean0.hasAnyProperties();
        java.lang.Boolean boolean16 = allDataOptionsBean0.getChanges();
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(boolean16);
    }

    @Test
    public void test14513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14513");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.update = "exclusion";
        java.lang.String str8 = apiObject0.update;
        java.lang.String str9 = apiObject0.read;
        apiObject0.read = "ch.rasc.extclassgenerator.ModelAnnotationProcessor";
        java.lang.String str12 = apiObject0.destroy;
        apiObject0.destroy = "/email/";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "exclusion" + "'", str8, "exclusion");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test14514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14514");
        ch.rasc.extclassgenerator.validation.ExclusionValidation exclusionValidation2 = new ch.rasc.extclassgenerator.validation.ExclusionValidation("/ch.rasc.extclassgenerator.ModelAnnotationProcessor/", "Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ {\n      name : \"debug\",\n      type : \"boolean\"\n    }, {\n      name : \"useSingleQuotes\",\n      type : \"boolean\"\n    }, {\n      name : \"surroundApiWithQuotes\",\n      type : \"boolean\"\n    } ]\n  }\n});");
    }

    @Test
    public void test14515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14515");
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
        java.lang.Boolean boolean26 = modelFieldBean3.getCritical();
        modelFieldBean3.setCritical((java.lang.Boolean) true);
        modelFieldBean3.setPersist((java.lang.Boolean) true);
        java.lang.String str31 = modelFieldBean3.getName();
        java.util.List<ch.rasc.extclassgenerator.validation.AbstractValidation> abstractValidationList32 = modelFieldBean3.getValidators();
        modelFieldBean3.setMapping("ch.rasc.extclassgenerator.OutputConfig");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean38 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean38.setConvert("hi!");
        java.lang.Boolean boolean41 = modelFieldBean38.getPersist();
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean44 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean44.setConvert("hi!");
        java.lang.Boolean boolean47 = modelFieldBean44.getPersist();
        java.lang.String str48 = modelFieldBean44.getMapping();
        java.lang.String str49 = modelFieldBean44.getName();
        java.lang.String[] strArray53 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList54 = new java.util.ArrayList<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList54, strArray53);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray56 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList54);
        modelFieldBean44.setDepends((java.util.List<java.lang.String>) strList54);
        modelFieldBean38.setDepends((java.util.List<java.lang.String>) strList54);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray59 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/", (java.util.List<java.lang.String>) strList54);
        modelFieldBean3.setDepends((java.util.List<java.lang.String>) strList54);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray61 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("format", (java.util.List<java.lang.String>) strList54);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(boolean26);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNull(abstractValidationList32);
        org.junit.Assert.assertNull(boolean41);
        org.junit.Assert.assertNull(boolean47);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test14516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14516");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("hi!");
        hasManyAssociation1.setAssociationKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str4 = hasManyAssociation1.getInstanceName();
        hasManyAssociation1.setName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        hasManyAssociation1.setAutoLoad((java.lang.Boolean) false);
        hasManyAssociation1.setForeignKey("/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/");
        java.lang.Boolean boolean11 = hasManyAssociation1.getAutoLoad();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + false + "'", boolean11, false);
    }

    @Test
    public void test14517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14517");
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
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.association.HasOneAssociation\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"setterName\",type:\"string\"},{name:\"getterName\",type:\"string\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]}});";
        java.lang.String str23 = apiObject0.create;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "json" + "'", str10, "json");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/" + "'", str11, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});" + "'", str20, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.association.HasOneAssociation\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"setterName\",type:\"string\"},{name:\"getterName\",type:\"string\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]}});" + "'", str23, "Ext.define(\"ch.rasc.extclassgenerator.association.HasOneAssociation\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"setterName\",type:\"string\"},{name:\"getterName\",type:\"string\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]}});");
    }

    @Test
    public void test14518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14518");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});/", "Ext.define('ch.rasc.extclassgenerator.ModelAnnotationProcessor',{extend:'Ext.data.Model',fields:[]});");
        modelFieldBean2.setAllowBlank((java.lang.Boolean) false);
        modelFieldBean2.setUnique((java.lang.Boolean) false);
    }

    @Test
    public void test14519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14519");
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
        java.util.Set<java.lang.String> strSet15 = modelAnnotationProcessor0.getSupportedOptions();
        java.util.Set<java.lang.String> strSet16 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        javax.lang.model.element.Element element17 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror18 = null;
        javax.lang.model.element.ExecutableElement executableElement19 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable21 = modelAnnotationProcessor0.getCompletions(element17, annotationMirror18, executableElement19, "/Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});/");
        java.util.Set<java.lang.String> strSet22 = modelAnnotationProcessor0.getSupportedOptions();
        javax.annotation.processing.ProcessingEnvironment processingEnvironment23 = null;
        // The following exception was thrown during execution in test generation
        try {
            modelAnnotationProcessor0.init(processingEnvironment23);
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
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(wildcardIterable21);
        org.junit.Assert.assertNotNull(strSet22);
    }

    @Test
    public void test14520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14520");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("Ext.define(\"ch.rasc.extclassgenerator.validation.CreditCardNumberValidation\",{extend:\"Ext.data.Model\",fields:[{name:\"type\",type:\"string\"},{name:\"field\",type:\"string\"}]});", (java.lang.Integer) 97, (java.lang.Integer) 1);
    }

    @Test
    public void test14521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14521");
        ch.rasc.extclassgenerator.validation.InclusionValidation inclusionValidation2 = new ch.rasc.extclassgenerator.validation.InclusionValidation("format", "Ext.define(\"ch.rasc.extclassgenerator.association.BelongsToAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"setterName\",\n    type : \"string\"\n  }, {\n    name : \"getterName\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        java.lang.String str3 = inclusionValidation2.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "inclusion" + "'", str3, "inclusion");
    }

    @Test
    public void test14522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14522");
        ch.rasc.extclassgenerator.validation.InclusionValidation inclusionValidation2 = new ch.rasc.extclassgenerator.validation.InclusionValidation("Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});", "/belongsTo/");
        java.lang.String str3 = inclusionValidation2.getList();
        java.lang.String str4 = inclusionValidation2.getList();
        java.lang.String str5 = inclusionValidation2.getList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/belongsTo/" + "'", str3, "/belongsTo/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "/belongsTo/" + "'", str4, "/belongsTo/");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/belongsTo/" + "'", str5, "/belongsTo/");
    }

    @Test
    public void test14523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14523");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("/\\/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});\\//", "Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ {\n      name : \"debug\",\n      type : \"boolean\"\n    }, {\n      name : \"useSingleQuotes\",\n      type : \"boolean\"\n    }, {\n      name : \"surroundApiWithQuotes\",\n      type : \"boolean\"\n    } ]\n  }\n});");
        java.lang.String str3 = modelFieldBean2.getName();
        java.util.List<java.lang.String> strList4 = modelFieldBean2.getDepends();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/\\/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});\\//" + "'", str3, "/\\/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});\\//");
        org.junit.Assert.assertNull(strList4);
    }

    @Test
    public void test14524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14524");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.data.Model");
        modelFieldBean2.setAllowNull((java.lang.Boolean) false);
        java.lang.String str5 = modelFieldBean2.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Ext.data.Model" + "'", str5, "Ext.data.Model");
    }

    @Test
    public void test14525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14525");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getParent();
        referenceBean0.setInverse("hi!");
        referenceBean0.setParent("exclusion");
        java.lang.String str7 = referenceBean0.getInverse();
        java.lang.String str8 = referenceBean0.getChild();
        boolean boolean9 = referenceBean0.typeOnly();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test14526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14526");
        ch.rasc.extclassgenerator.validation.InclusionValidation inclusionValidation2 = new ch.rasc.extclassgenerator.validation.InclusionValidation("/Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});/", "/Ext.define(\"ch.rasc.extclassgenerator.association.BelongsToAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"setterName\",type:\"string\"},{name:\"getterName\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/");
    }

    @Test
    public void test14527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14527");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getRole();
        referenceBean0.setChild("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        referenceBean0.setAssociation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        java.lang.String str7 = referenceBean0.getAssociation();
        referenceBean0.setParent("/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/");
        java.lang.String str10 = referenceBean0.getChild();
        referenceBean0.setParent("Ext.define('Ext.define('ch.rasc.extclassgenerator.association.HasManyAssociation',\n{\n  extend : 'Ext.data.Model',\n  fields : [ {\n    name : 'autoLoad',\n    type : 'boolean'\n  }, {\n    name : 'name',\n    type : 'string'\n  }, {\n    name : 'type',\n    type : 'string'\n  }, {\n    name : 'model',\n    type : 'string'\n  }, {\n    name : 'associationKey',\n    type : 'string'\n  }, {\n    name : 'foreignKey',\n    type : 'string'\n  }, {\n    name : 'primaryKey',\n    type : 'string'\n  }, {\n    name : 'instanceName',\n    type : 'string'\n  } ]\n});',{extend:'',uses:['hi!'],fields:[],associations:[{type:'hasMany',model:'hi!'},{type:'hasMany',model:'hi!',associationKey:'Ext.define(\\'ch.rasc.extclassgenerator.ModelAnnotationProcessor\\',{extend:\\'Ext.data.Model\\',fields:[]});'},{type:'hasMany',model:'hi!',associationKey:'Ext.define(\\'ch.rasc.extclassgenerator.ModelAnnotationProcessor\\',{extend:\\'Ext.data.Model\\',fields:[]});'},{type:'hasMany',model:'hi!',foreignKey:''}]});");
        referenceBean0.setInverse("/ch.rasc.extclassgenerator.PartialDataOptionsBean/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});" + "'", str7, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});" + "'", str10, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
    }

    @Test
    public void test14528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14528");
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
        javax.lang.model.element.Element element16 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror17 = null;
        javax.lang.model.element.ExecutableElement executableElement18 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable20 = modelAnnotationProcessor0.getCompletions(element16, annotationMirror17, executableElement18, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        javax.lang.model.element.Element element21 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror22 = null;
        javax.lang.model.element.ExecutableElement executableElement23 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable25 = modelAnnotationProcessor0.getCompletions(element21, annotationMirror22, executableElement23, "ch.rasc.extclassgenerator.validation.RangeValidation");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertTrue("'" + sourceVersion2 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion2.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertTrue("'" + sourceVersion3 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion3.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(wildcardIterable8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(wildcardIterable14);
        org.junit.Assert.assertTrue("'" + sourceVersion15 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion15.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(wildcardIterable20);
        org.junit.Assert.assertNotNull(wildcardIterable25);
    }

    @Test
    public void test14529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14529");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.data.Model");
        java.lang.Boolean boolean3 = modelFieldBean2.getAllowBlank();
        ch.rasc.extclassgenerator.OutputConfig outputConfig4 = null;
        boolean boolean5 = modelFieldBean2.hasOnlyName(outputConfig4);
        modelFieldBean2.setAllowBlank((java.lang.Boolean) false);
        java.lang.String str8 = modelFieldBean2.getCalculate();
        java.lang.Boolean boolean9 = modelFieldBean2.getUseNull();
        java.util.List<java.lang.String> strList10 = modelFieldBean2.getDepends();
        ch.rasc.extclassgenerator.ModelType modelType11 = modelFieldBean2.getModelType();
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNull(strList10);
        org.junit.Assert.assertNull(modelType11);
    }

    @Test
    public void test14530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14530");
        ch.rasc.extclassgenerator.validation.ExclusionValidation exclusionValidation2 = new ch.rasc.extclassgenerator.validation.ExclusionValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});", "/hi!/");
        java.lang.String str3 = exclusionValidation2.getField();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
    }

    @Test
    public void test14531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14531");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Object obj5 = modelFieldBean2.getReference();
        modelFieldBean2.setPersist((java.lang.Boolean) false);
        modelFieldBean2.setDateFormat("Ext.data.Model");
        java.lang.Boolean boolean10 = modelFieldBean2.getUnique();
        modelFieldBean2.setAllowBlank((java.lang.Boolean) true);
        modelFieldBean2.setName("Ext.define(\"null\",\r\n{\n  extend : \"\",\n  fields : [ ],\n  hasMany : [ \"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\", \"json\", \"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\", \"\" ]\n});");
        java.lang.Boolean boolean15 = modelFieldBean2.getCritical();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNull(boolean15);
    }

    @Test
    public void test14532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14532");
        ch.rasc.extclassgenerator.ModelAnnotationProcessor modelAnnotationProcessor0 = new ch.rasc.extclassgenerator.ModelAnnotationProcessor();
        java.util.Set<java.lang.String> strSet1 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        java.util.Set<java.lang.String> strSet2 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        java.util.Set<java.lang.String> strSet3 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        javax.lang.model.SourceVersion sourceVersion4 = modelAnnotationProcessor0.getSupportedSourceVersion();
        javax.lang.model.element.Element element5 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror6 = null;
        javax.lang.model.element.ExecutableElement executableElement7 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable9 = modelAnnotationProcessor0.getCompletions(element5, annotationMirror6, executableElement7, "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[],proxy:{type:\"direct\",directFn:hi!}});");
        javax.lang.model.element.Element element10 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror11 = null;
        javax.lang.model.element.ExecutableElement executableElement12 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable14 = modelAnnotationProcessor0.getCompletions(element10, annotationMirror11, executableElement12, "Ext.define(\"null\",{extend:\"\",config:{fields:[]}});");
        javax.lang.model.SourceVersion sourceVersion15 = modelAnnotationProcessor0.getSupportedSourceVersion();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + sourceVersion4 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion4.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(wildcardIterable9);
        org.junit.Assert.assertNotNull(wildcardIterable14);
        org.junit.Assert.assertTrue("'" + sourceVersion15 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion15.equals(javax.lang.model.SourceVersion.RELEASE_6));
    }

    @Test
    public void test14533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14533");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("/hi!/");
        hasOneAssociation1.setAssociationKey("Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[],proxy:{type:\"direct\",directFn:hi!}});");
        hasOneAssociation1.setName("Ext.define(\"ch.rasc.extclassgenerator.association.HasOneAssociation\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"setterName\",type:\"string\"},{name:\"getterName\",type:\"string\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]}});");
        java.lang.String str6 = hasOneAssociation1.getGetterName();
        java.lang.String str7 = hasOneAssociation1.getModel();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/hi!/" + "'", str7, "/hi!/");
    }

    @Test
    public void test14534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14534");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("");
        java.lang.String str2 = belongsToAssociation1.getInstanceName();
        java.lang.String str3 = belongsToAssociation1.getSetterName();
        java.lang.String str4 = belongsToAssociation1.getGetterName();
        java.lang.String str5 = belongsToAssociation1.getForeignKey();
        belongsToAssociation1.setGetterName("Ext.data.Model");
        belongsToAssociation1.setInstanceName("Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});");
        java.lang.String str10 = belongsToAssociation1.getSetterName();
        belongsToAssociation1.setSetterName("Ext.define('ch.rasc.extclassgenerator.ModelAnnotationProcessor',{extend:'Ext.data.Model',fields:[]});");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test14535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14535");
        ch.rasc.extclassgenerator.validation.DigitsValidation digitsValidation3 = new ch.rasc.extclassgenerator.validation.DigitsValidation("Ext.define(\"null\",{extend:\"Ext.data.Model\",idProperty:\"hi!\",fields:[],proxy:{type:\"direct\",idParam:\"hi!\"}});", 35, (int) (short) 100);
        int int4 = digitsValidation3.getFraction();
        int int5 = digitsValidation3.getFraction();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test14536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14536");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        modelBean0.setIdProperty("");
        boolean boolean5 = modelBean0.isDisablePagingParameters();
        modelBean0.setReader("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        java.lang.String[] strArray8 = modelBean0.getHasMany();
        java.lang.String str9 = modelBean0.getUpdateMethod();
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean10 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean10.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean13 = allDataOptionsBean10.getAssociated();
        java.lang.Boolean boolean14 = allDataOptionsBean10.getPersist();
        allDataOptionsBean10.setAssociated((java.lang.Boolean) false);
        modelBean0.setAllDataOptions(allDataOptionsBean10);
        boolean boolean18 = allDataOptionsBean10.hasAnyProperties();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + false + "'", boolean13, false);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test14537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14537");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        boolean boolean1 = allDataOptionsBean0.hasAnyProperties();
        boolean boolean2 = allDataOptionsBean0.hasAnyProperties();
        java.lang.Boolean boolean3 = allDataOptionsBean0.getChanges();
        java.lang.Boolean boolean4 = allDataOptionsBean0.getPersist();
        allDataOptionsBean0.setChanges((java.lang.Boolean) true);
        allDataOptionsBean0.setPersist((java.lang.Boolean) true);
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test14538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14538");
        ch.rasc.extclassgenerator.validation.CreditCardNumberValidation creditCardNumberValidation1 = new ch.rasc.extclassgenerator.validation.CreditCardNumberValidation("/hasOne/");
        java.lang.String str2 = creditCardNumberValidation1.getType();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "creditCardNumber" + "'", str2, "creditCardNumber");
    }

    @Test
    public void test14539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14539");
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
        modelBean0.setClientIdProperty("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        java.lang.String str24 = modelBean0.getDestroyMethod();
        modelBean0.setPaging(false);
        modelBean0.setRootProperty("Ext.define(\"null\",\r\n{\n  extend : \"\",\n  idgen : \"Ext.define(\\\"java.util.ArrayList\\\",\\r\\n{\\n  extend : \\\"Ext.data.Model\\\",\\n  fields : [ ]\\n});\",\n  fields : [ ],\n  proxy : {\n    type : \"direct\",\n    reader : {\n      root : \"Ext.define(\\\"null\\\",{extend:\\\"Ext.data.Model\\\",idProperty:\\\"hi!\\\",fields:[],proxy:{type:\\\"direct\\\",idParam:\\\"hi!\\\"}});\",\n      messageProperty : \"hi!\"\n    },\n    writer : {\n      writeAllFields : false\n    }\n  }\n});");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean29 = modelBean0.getAllDataOptions();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "json" + "'", str21, "json");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(allDataOptionsBean29);
    }

    @Test
    public void test14540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14540");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        boolean boolean4 = allDataOptionsBean0.hasAnyProperties();
        allDataOptionsBean0.setCritical((java.lang.Boolean) true);
        boolean boolean7 = allDataOptionsBean0.hasAnyProperties();
        allDataOptionsBean0.setPersist((java.lang.Boolean) true);
        allDataOptionsBean0.setCritical((java.lang.Boolean) false);
        boolean boolean12 = allDataOptionsBean0.hasAnyProperties();
        allDataOptionsBean0.setChanges((java.lang.Boolean) true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test14541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14541");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getParent();
        referenceBean0.setInverse("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        boolean boolean5 = referenceBean0.hasAnyProperties();
        referenceBean0.setInverse("");
        java.lang.String str8 = referenceBean0.getType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test14542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14542");
        ch.rasc.extclassgenerator.ModelType modelType1 = null;
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("future", modelType1);
        modelFieldBean2.setAllowNull((java.lang.Boolean) true);
        modelFieldBean2.setDateFormat("Ext.define(\"ch.rasc.extclassgenerator.association.BelongsToAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"setterName\",type:\"string\"},{name:\"getterName\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});");
    }

    @Test
    public void test14543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14543");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("");
        java.lang.String str2 = belongsToAssociation1.getInstanceName();
        belongsToAssociation1.setSetterName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str5 = belongsToAssociation1.getPrimaryKey();
        java.lang.String str6 = belongsToAssociation1.getInstanceName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test14544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14544");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getAssociation();
        referenceBean0.setAssociation("Ext.define(\"null\",\r\n{\n  extend : \"\",\n  fields : [ ],\n  hasMany : [ \"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\", \"json\", \"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\", \"\" ]\n});");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test14545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14545");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        java.lang.String str6 = modelFieldBean2.getMapping();
        java.lang.Object obj7 = modelFieldBean2.getReference();
        modelFieldBean2.setCalculate("exclusion");
        java.lang.Boolean boolean10 = modelFieldBean2.getUnique();
        modelFieldBean2.setMapping("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setMapping("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        modelFieldBean2.setMapping("");
        ch.rasc.extclassgenerator.OutputConfig outputConfig17 = new ch.rasc.extclassgenerator.OutputConfig();
        boolean boolean18 = outputConfig17.isDebug();
        ch.rasc.extclassgenerator.OutputFormat outputFormat19 = outputConfig17.getOutputFormat();
        boolean boolean20 = outputConfig17.isDebug();
        ch.rasc.extclassgenerator.IncludeValidation includeValidation21 = outputConfig17.getIncludeValidation();
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean22 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean22.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean25 = allDataOptionsBean22.getAssociated();
        java.lang.Boolean boolean26 = allDataOptionsBean22.getPersist();
        allDataOptionsBean22.setAssociated((java.lang.Boolean) false);
        allDataOptionsBean22.setPersist((java.lang.Boolean) false);
        java.lang.Boolean boolean31 = allDataOptionsBean22.getAssociated();
        allDataOptionsBean22.setAssociated((java.lang.Boolean) true);
        boolean boolean34 = outputConfig17.equals((java.lang.Object) true);
        boolean boolean35 = outputConfig17.isSurroundApiWithQuotes();
        boolean boolean36 = modelFieldBean2.hasOnlyName(outputConfig17);
        ch.rasc.extclassgenerator.IncludeValidation includeValidation37 = outputConfig17.getIncludeValidation();
        boolean boolean38 = outputConfig17.isDebug();
        ch.rasc.extclassgenerator.LineEnding lineEnding39 = outputConfig17.getLineEnding();
        boolean boolean40 = outputConfig17.isUseSingleQuotes();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(outputFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(includeValidation21);
        org.junit.Assert.assertEquals("'" + boolean25 + "' != '" + false + "'", boolean25, false);
        org.junit.Assert.assertNull(boolean26);
        org.junit.Assert.assertEquals("'" + boolean31 + "' != '" + false + "'", boolean31, false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(includeValidation37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(lineEnding39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test14546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14546");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        java.lang.String str6 = modelFieldBean2.getMapping();
        java.lang.String str7 = modelFieldBean2.getName();
        java.lang.String str8 = modelFieldBean2.getMapping();
        modelFieldBean2.setConvert("/Ext.define(\"ch.rasc.extclassgenerator.validation.InclusionValidation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"list\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"field\",\n    type : \"string\"\n  } ]\n});/");
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test14547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14547");
        ch.rasc.extclassgenerator.validation.FormatValidation formatValidation2 = new ch.rasc.extclassgenerator.validation.FormatValidation("email", "ch.rasc.extclassgenerator.OutputConfig");
    }

    @Test
    public void test14548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14548");
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation3 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 32L);
        java.math.BigDecimal bigDecimal4 = rangeValidation3.getMax();
        org.junit.Assert.assertNotNull(bigDecimal4);
    }

    @Test
    public void test14549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14549");
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
        java.util.Set<java.lang.String> strSet17 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        java.util.Set<java.lang.String> strSet18 = modelAnnotationProcessor0.getSupportedOptions();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertTrue("'" + sourceVersion2 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion2.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertTrue("'" + sourceVersion3 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion3.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(wildcardIterable8);
        org.junit.Assert.assertTrue("'" + sourceVersion9 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion9.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(wildcardIterable14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strSet18);
    }

    @Test
    public void test14550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14550");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.String str5 = modelFieldBean2.getName();
        modelFieldBean2.setMapping("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        ch.rasc.extclassgenerator.ModelType modelType8 = modelFieldBean2.getModelType();
        modelFieldBean2.setCalculate("Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"debug\",type:\"boolean\"},{name:\"useSingleQuotes\",type:\"boolean\"},{name:\"surroundApiWithQuotes\",type:\"boolean\"}],proxy:{type:\"direct\",reader:{type:\"/format/\",messageProperty:\"Ext.define(\\\"ch.rasc.extclassgenerator.validation.InclusionValidationArray\\\",{extend:\\\"Ext.data.Model\\\",fields:[{name:\\\"type\\\",type:\\\"string\\\"},{name:\\\"field\\\",type:\\\"string\\\"}]});\"}}}});");
        java.lang.Boolean boolean11 = modelFieldBean2.getAllowBlank();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(modelType8);
        org.junit.Assert.assertNull(boolean11);
    }

    @Test
    public void test14551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14551");
        ch.rasc.extclassgenerator.validation.InclusionValidation inclusionValidation2 = new ch.rasc.extclassgenerator.validation.InclusionValidation("/\\/Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});\\//", "hi!");
    }

    @Test
    public void test14552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14552");
        ch.rasc.extclassgenerator.validation.PastValidation pastValidation1 = new ch.rasc.extclassgenerator.validation.PastValidation("Ext.define(\"java.util.ArrayList\",{extend:\"Ext.data.Model\",fields:[]});");
    }

    @Test
    public void test14553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14553");
        java.math.BigDecimal bigDecimal1 = null;
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation6 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.math.BigDecimal bigDecimal7 = rangeValidation6.getMax();
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
        java.math.BigDecimal bigDecimal48 = rangeValidation47.getMax();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation49 = new ch.rasc.extclassgenerator.validation.RangeValidation("exclusion", bigDecimal7, bigDecimal48);
        java.math.BigDecimal bigDecimal50 = rangeValidation49.getMax();
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation51 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});", bigDecimal1, bigDecimal50);
        java.math.BigDecimal bigDecimal52 = rangeValidation51.getMin();
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(bigDecimal44);
        org.junit.Assert.assertNotNull(bigDecimal48);
        org.junit.Assert.assertNotNull(bigDecimal50);
        org.junit.Assert.assertNull(bigDecimal52);
    }

    @Test
    public void test14554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14554");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        java.lang.String str2 = hasOneAssociation1.getName();
        java.lang.String str3 = hasOneAssociation1.getGetterName();
        hasOneAssociation1.setPrimaryKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str6 = hasOneAssociation1.getName();
        hasOneAssociation1.setSetterName("json");
        java.lang.String str9 = hasOneAssociation1.getAssociationKey();
        hasOneAssociation1.setName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
        java.lang.String str12 = hasOneAssociation1.getGetterName();
        hasOneAssociation1.setName("hi!");
        hasOneAssociation1.setAssociationKey("Ext.data.Model");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test14555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14555");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("Ext.define(\"ch.rasc.extclassgenerator.association.HasOneAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"setterName\",type:\"string\"},{name:\"getterName\",type:\"string\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});", (java.lang.Long) 0L, (java.lang.Long) 10L);
    }

    @Test
    public void test14556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14556");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        java.lang.String str3 = modelBean0.getIdProperty();
        java.lang.String str4 = modelBean0.getCreateMethod();
        modelBean0.setIdProperty("hi!");
        java.lang.String str7 = modelBean0.getName();
        modelBean0.setUpdateMethod("Ext.define(\"ch.rasc.extclassgenerator.validation.InclusionValidationArray\",{extend:\"Ext.data.Model\",fields:[{name:\"type\",type:\"string\"},{name:\"field\",type:\"string\"}]});");
        java.lang.String str10 = modelBean0.getRootProperty();
        modelBean0.setWriteAllFields((java.lang.Boolean) true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test14557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14557");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        java.lang.String str3 = modelBean0.getIdProperty();
        modelBean0.setIdentifier("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        modelBean0.setName("");
        java.lang.String str8 = modelBean0.getIdentifier();
        modelBean0.setIdentifier("/exclusion/");
        modelBean0.setMessageProperty("/Ext.define(\"ch.rasc.extclassgenerator.validation.RangeValidation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"min\",\n    type : \"float\"\n  }, {\n    name : \"max\",\n    type : \"float\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"field\",\n    type : \"string\"\n  } ]\n});/");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});" + "'", str8, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
    }

    @Test
    public void test14558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14558");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        boolean boolean2 = referenceBean0.hasAnyProperties();
        java.lang.String str3 = referenceBean0.getType();
        referenceBean0.setParent("Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
        java.lang.String str6 = referenceBean0.getInverse();
        java.lang.String str7 = referenceBean0.getChild();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test14559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14559");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        modelBean0.setIdProperty("");
        modelBean0.setReadMethod("hi!");
        java.lang.String str7 = modelBean0.getReader();
        modelBean0.setClientIdPropertyAddToWriter(false);
        java.lang.String str10 = modelBean0.getDestroyMethod();
        modelBean0.setMessageProperty("ch.rasc.extclassgenerator.ModelAnnotationProcessor");
        modelBean0.setAutodetectTypes(true);
        java.lang.String str15 = modelBean0.getIdProperty();
        java.lang.String str16 = modelBean0.getSuccessProperty();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "json" + "'", str7, "json");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test14560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14560");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.Object obj3 = modelFieldBean2.getDefaultValue();
        java.lang.Boolean boolean4 = modelFieldBean2.getPersist();
        java.lang.Boolean boolean5 = modelFieldBean2.getAllowNull();
        java.lang.Boolean boolean6 = modelFieldBean2.getCritical();
        modelFieldBean2.setAllowNull((java.lang.Boolean) true);
        modelFieldBean2.setAllowBlank((java.lang.Boolean) true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean6);
    }

    @Test
    public void test14561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14561");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("hi!");
        java.lang.String str2 = hasManyAssociation1.getAssociationKey();
        hasManyAssociation1.setAssociationKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        hasManyAssociation1.setAssociationKey("");
        java.lang.String str7 = hasManyAssociation1.getAssociationKey();
        hasManyAssociation1.setAssociationKey("Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test14562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14562");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean3 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean3.setConvert("hi!");
        java.lang.Boolean boolean6 = modelFieldBean3.getPersist();
        java.lang.String str7 = modelFieldBean3.getMapping();
        java.lang.String str8 = modelFieldBean3.getName();
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray15 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList13);
        modelFieldBean3.setDepends((java.util.List<java.lang.String>) strList13);
        java.lang.Boolean boolean17 = modelFieldBean3.getPersist();
        java.lang.Object obj18 = modelFieldBean3.getReference();
        java.lang.String str19 = modelFieldBean3.getName();
        java.lang.String str20 = modelFieldBean3.getMapping();
        java.util.List<java.lang.String> strList21 = modelFieldBean3.getDepends();
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray22 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("/Ext.data.Model/", strList21);
        java.util.List<java.lang.String> strList23 = inclusionValidationArray22.getList();
        java.util.List<java.lang.String> strList24 = inclusionValidationArray22.getList();
        java.util.List<java.lang.String> strList25 = inclusionValidationArray22.getList();
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(boolean17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList25);
    }

    @Test
    public void test14563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14563");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        modelBean0.setIdProperty("");
        modelBean0.setReadMethod("hi!");
        java.lang.String str7 = modelBean0.getUpdateMethod();
        java.lang.String str8 = modelBean0.getCreateMethod();
        modelBean0.setTotalProperty("Ext.define(\"null\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ],\n    proxy : {\n      type : \"direct\",\n      reader : {\n        type : \"Ext.define(\\\"java.util.ArrayList\\\",\\r\\n{\\n  extend : \\\"Ext.data.Model\\\",\\n  fields : [ ]\\n});\"\n      }\n    }\n  }\n});");
        java.lang.String str11 = modelBean0.getClientIdProperty();
        java.lang.String str12 = modelBean0.getIdProperty();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test14564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14564");
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation3 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"null\",\r\n{\n  extend : \"\",\n  fields : [ ],\n  validations : [ {\n    type : \"range\",\n    field : \"/Ext.define(\\\"ch.rasc.extclassgenerator.association.HasManyAssociation\\\",{extend:\\\"Ext.data.Model\\\",fields:[{name:\\\"autoLoad\\\",type:\\\"boolean\\\"},{name:\\\"name\\\",type:\\\"string\\\"},{name:\\\"type\\\",type:\\\"string\\\"},{name:\\\"model\\\",type:\\\"string\\\"},{name:\\\"associationKey\\\",type:\\\"string\\\"},{name:\\\"foreignKey\\\",type:\\\"string\\\"},{name:\\\"primaryKey\\\",type:\\\"string\\\"},{name:\\\"instanceName\\\",type:\\\"string\\\"}]});/\",\n    min : 0,\n    max : 0\n  } ]\n});", (java.lang.Long) 0L, (java.lang.Long) 35L);
        java.math.BigDecimal bigDecimal4 = rangeValidation3.getMax();
        java.math.BigDecimal bigDecimal5 = rangeValidation3.getMin();
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
    }

    @Test
    public void test14565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14565");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean7 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean7.setConvert("hi!");
        modelFieldBean7.setMapping("hi!");
        modelFieldBean7.setUseNull((java.lang.Boolean) true);
        modelFieldBean7.setAllowBlank((java.lang.Boolean) false);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray23 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList21);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray24 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("", (java.util.List<java.lang.String>) strList21);
        java.util.List<java.lang.String> strList25 = exclusionValidationArray24.getList();
        modelFieldBean7.setDepends(strList25);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray27 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("ch.rasc.extclassgenerator.ModelAnnotationProcessor", strList25);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray28 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});", strList25);
        java.util.List<java.lang.String> strList29 = exclusionValidationArray28.getList();
        java.util.List<java.lang.String> strList30 = exclusionValidationArray28.getList();
        java.util.List<java.lang.String> strList31 = exclusionValidationArray28.getList();
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray32 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("//", strList31);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray33 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("Ext.define(\"null\",\r\n{\n  extend : \"\",\n  idgen : \"Ext.define(\\\"java.util.ArrayList\\\",\\r\\n{\\n  extend : \\\"Ext.data.Model\\\",\\n  fields : [ ]\\n});\",\n  fields : [ ],\n  proxy : {\n    type : \"direct\",\n    reader : {\n      root : \"Ext.define(\\\"null\\\",{extend:\\\"Ext.data.Model\\\",idProperty:\\\"hi!\\\",fields:[],proxy:{type:\\\"direct\\\",idParam:\\\"hi!\\\"}});\",\n      messageProperty : \"hi!\"\n    },\n    writer : {\n      writeAllFields : false\n    }\n  }\n});", strList31);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray34 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("Ext.define(\"ch.rasc.extclassgenerator.association.BelongsToAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ {\n      name : \"setterName\",\n      type : \"string\"\n    }, {\n      name : \"getterName\",\n      type : \"string\"\n    }, {\n      name : \"type\",\n      type : \"string\"\n    }, {\n      name : \"model\",\n      type : \"string\"\n    }, {\n      name : \"associationKey\",\n      type : \"string\"\n    }, {\n      name : \"foreignKey\",\n      type : \"string\"\n    }, {\n      name : \"primaryKey\",\n      type : \"string\"\n    }, {\n      name : \"instanceName\",\n      type : \"string\"\n    } ]\n  }\n});", strList31);
        java.util.List<java.lang.String> strList35 = inclusionValidationArray34.getList();
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(strList35);
    }

    @Test
    public void test14566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14566");
        ch.rasc.extclassgenerator.validation.InclusionValidation inclusionValidation2 = new ch.rasc.extclassgenerator.validation.InclusionValidation("/Ext.define(\"null\",\r\n{\n  extend : \"\",\n  fields : [ ],\n  hasMany : [ \"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\", \"json\", \"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\", \"\" ]\n});/", "json");
        java.lang.String str3 = inclusionValidation2.getList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "json" + "'", str3, "json");
    }

    @Test
    public void test14567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14567");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        java.lang.String str1 = apiObject0.update;
        apiObject0.destroy = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});";
        java.lang.String str4 = apiObject0.read;
        apiObject0.create = "/\\/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});\\//";
        apiObject0.read = "Ext.define(\"ch.rasc.extclassgenerator.validation.CreditCardNumberValidation\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"type\",type:\"string\"},{name:\"field\",type:\"string\"}],proxy:{type:\"direct\",reader:{type:\"Ext.define(\\\"null\\\",\\r\\n{\\n  extend : \\\"Ext.data.Model\\\",\\n  config : {\\n    fields : [ ],\\n    proxy : {\\n      type : \\\"direct\\\",\\n      reader : {\\n        type : \\\"Ext.define(\\\\\\\"java.util.ArrayList\\\\\\\",\\\\r\\\\n{\\\\n  extend : \\\\\\\"Ext.data.Model\\\\\\\",\\\\n  fields : [ ]\\\\n});\\\"\\n      }\\n    }\\n  }\\n});\",successProperty:\"/hasOne/\"}}}});";
        java.lang.String str9 = apiObject0.destroy;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});" + "'", str9, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
    }

    @Test
    public void test14568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14568");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getChild();
        boolean boolean2 = referenceBean0.typeOnly();
        java.lang.String str3 = referenceBean0.getAssociation();
        java.lang.String str4 = referenceBean0.getChild();
        referenceBean0.setParent("");
        referenceBean0.setType("Ext.define(\"ch.rasc.extclassgenerator.LineEnding\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
        referenceBean0.setType("Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",{extend:\"Ext.data.Model\",fields:[{name:\"debug\",type:\"boolean\"},{name:\"useSingleQuotes\",type:\"boolean\"},{name:\"surroundApiWithQuotes\",type:\"boolean\"}]});");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test14569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14569");
        ch.rasc.extclassgenerator.validation.DigitsValidation digitsValidation3 = new ch.rasc.extclassgenerator.validation.DigitsValidation("/Ext.data.Model/", (int) '#', 0);
        java.lang.String str4 = digitsValidation3.getField();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "/Ext.data.Model/" + "'", str4, "/Ext.data.Model/");
    }

    @Test
    public void test14570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14570");
        ch.rasc.extclassgenerator.validation.InclusionValidation inclusionValidation2 = new ch.rasc.extclassgenerator.validation.InclusionValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});", "/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/");
    }

    @Test
    public void test14571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14571");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("");
        java.lang.String str2 = belongsToAssociation1.getGetterName();
        belongsToAssociation1.setSetterName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
        belongsToAssociation1.setInstanceName("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});");
        belongsToAssociation1.setSetterName("Ext.define('ch.rasc.extclassgenerator.validation.CreditCardNumberValidation',{extend:'Ext.data.Model',config:{fields:[{name:'type',type:'string'},{name:'field',type:'string'}]}});");
        belongsToAssociation1.setInstanceName("Ext.define(\"null\",\r\n{\n  extend : \"\",\n  fields : [ ],\n  validations : [ {\n    type : \"range\",\n    field : \"/Ext.define(\\\"ch.rasc.extclassgenerator.association.HasManyAssociation\\\",{extend:\\\"Ext.data.Model\\\",fields:[{name:\\\"autoLoad\\\",type:\\\"boolean\\\"},{name:\\\"name\\\",type:\\\"string\\\"},{name:\\\"type\\\",type:\\\"string\\\"},{name:\\\"model\\\",type:\\\"string\\\"},{name:\\\"associationKey\\\",type:\\\"string\\\"},{name:\\\"foreignKey\\\",type:\\\"string\\\"},{name:\\\"primaryKey\\\",type:\\\"string\\\"},{name:\\\"instanceName\\\",type:\\\"string\\\"}]});/\",\n    min : 0,\n    max : 0\n  } ]\n});");
        java.lang.String str11 = belongsToAssociation1.getGetterName();
        belongsToAssociation1.setGetterName("Ext.define(\"ch.rasc.extclassgenerator.validation.PresenceValidation\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ {\n      name : \"type\",\n      type : \"string\"\n    }, {\n      name : \"field\",\n      type : \"string\"\n    } ]\n  }\n});");
        belongsToAssociation1.setSetterName("creditCardNumber");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test14572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14572");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("hi!");
        hasManyAssociation1.setAssociationKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str4 = hasManyAssociation1.getInstanceName();
        hasManyAssociation1.setPrimaryKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str7 = hasManyAssociation1.getForeignKey();
        hasManyAssociation1.setInstanceName("hi!");
        hasManyAssociation1.setPrimaryKey("hi!");
        java.lang.Boolean boolean12 = hasManyAssociation1.getAutoLoad();
        java.lang.String str13 = hasManyAssociation1.getName();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test14573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14573");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.destroy = "";
        apiObject0.destroy = "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/";
        apiObject0.update = "Ext.data.Model";
        apiObject0.read = "/format/";
        java.lang.String str9 = apiObject0.update;
        apiObject0.create = "Ext.define(\"null\",\r\n{\n  extend : \"\",\n  fields : [ ],\n  validations : [ {\n    type : \"range\",\n    field : \"/Ext.define(\\\"ch.rasc.extclassgenerator.association.HasManyAssociation\\\",{extend:\\\"Ext.data.Model\\\",fields:[{name:\\\"autoLoad\\\",type:\\\"boolean\\\"},{name:\\\"name\\\",type:\\\"string\\\"},{name:\\\"type\\\",type:\\\"string\\\"},{name:\\\"model\\\",type:\\\"string\\\"},{name:\\\"associationKey\\\",type:\\\"string\\\"},{name:\\\"foreignKey\\\",type:\\\"string\\\"},{name:\\\"primaryKey\\\",type:\\\"string\\\"},{name:\\\"instanceName\\\",type:\\\"string\\\"}]});/\",\n    min : 0,\n    max : 0\n  } ]\n});";
        java.lang.String str12 = apiObject0.create;
        java.lang.String str13 = apiObject0.create;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Ext.data.Model" + "'", str9, "Ext.data.Model");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Ext.define(\"null\",\r\n{\n  extend : \"\",\n  fields : [ ],\n  validations : [ {\n    type : \"range\",\n    field : \"/Ext.define(\\\"ch.rasc.extclassgenerator.association.HasManyAssociation\\\",{extend:\\\"Ext.data.Model\\\",fields:[{name:\\\"autoLoad\\\",type:\\\"boolean\\\"},{name:\\\"name\\\",type:\\\"string\\\"},{name:\\\"type\\\",type:\\\"string\\\"},{name:\\\"model\\\",type:\\\"string\\\"},{name:\\\"associationKey\\\",type:\\\"string\\\"},{name:\\\"foreignKey\\\",type:\\\"string\\\"},{name:\\\"primaryKey\\\",type:\\\"string\\\"},{name:\\\"instanceName\\\",type:\\\"string\\\"}]});/\",\n    min : 0,\n    max : 0\n  } ]\n});" + "'", str12, "Ext.define(\"null\",\r\n{\n  extend : \"\",\n  fields : [ ],\n  validations : [ {\n    type : \"range\",\n    field : \"/Ext.define(\\\"ch.rasc.extclassgenerator.association.HasManyAssociation\\\",{extend:\\\"Ext.data.Model\\\",fields:[{name:\\\"autoLoad\\\",type:\\\"boolean\\\"},{name:\\\"name\\\",type:\\\"string\\\"},{name:\\\"type\\\",type:\\\"string\\\"},{name:\\\"model\\\",type:\\\"string\\\"},{name:\\\"associationKey\\\",type:\\\"string\\\"},{name:\\\"foreignKey\\\",type:\\\"string\\\"},{name:\\\"primaryKey\\\",type:\\\"string\\\"},{name:\\\"instanceName\\\",type:\\\"string\\\"}]});/\",\n    min : 0,\n    max : 0\n  } ]\n});");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Ext.define(\"null\",\r\n{\n  extend : \"\",\n  fields : [ ],\n  validations : [ {\n    type : \"range\",\n    field : \"/Ext.define(\\\"ch.rasc.extclassgenerator.association.HasManyAssociation\\\",{extend:\\\"Ext.data.Model\\\",fields:[{name:\\\"autoLoad\\\",type:\\\"boolean\\\"},{name:\\\"name\\\",type:\\\"string\\\"},{name:\\\"type\\\",type:\\\"string\\\"},{name:\\\"model\\\",type:\\\"string\\\"},{name:\\\"associationKey\\\",type:\\\"string\\\"},{name:\\\"foreignKey\\\",type:\\\"string\\\"},{name:\\\"primaryKey\\\",type:\\\"string\\\"},{name:\\\"instanceName\\\",type:\\\"string\\\"}]});/\",\n    min : 0,\n    max : 0\n  } ]\n});" + "'", str13, "Ext.define(\"null\",\r\n{\n  extend : \"\",\n  fields : [ ],\n  validations : [ {\n    type : \"range\",\n    field : \"/Ext.define(\\\"ch.rasc.extclassgenerator.association.HasManyAssociation\\\",{extend:\\\"Ext.data.Model\\\",fields:[{name:\\\"autoLoad\\\",type:\\\"boolean\\\"},{name:\\\"name\\\",type:\\\"string\\\"},{name:\\\"type\\\",type:\\\"string\\\"},{name:\\\"model\\\",type:\\\"string\\\"},{name:\\\"associationKey\\\",type:\\\"string\\\"},{name:\\\"foreignKey\\\",type:\\\"string\\\"},{name:\\\"primaryKey\\\",type:\\\"string\\\"},{name:\\\"instanceName\\\",type:\\\"string\\\"}]});/\",\n    min : 0,\n    max : 0\n  } ]\n});");
    }

    @Test
    public void test14574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14574");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.data.Model");
        modelFieldBean2.setAllowNull((java.lang.Boolean) false);
        java.lang.String str5 = modelFieldBean2.getName();
        modelFieldBean2.setCalculate("/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/");
        modelFieldBean2.setCritical((java.lang.Boolean) false);
        modelFieldBean2.setConvert("belongsTo");
        java.lang.Object obj12 = modelFieldBean2.getReference();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test14575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14575");
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
        modelFieldBean2.setMapping("Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"debug\",type:\"boolean\"},{name:\"useSingleQuotes\",type:\"boolean\"},{name:\"surroundApiWithQuotes\",type:\"boolean\"}],proxy:{type:\"direct\",reader:{type:\"/format/\",messageProperty:\"Ext.define(\\\"ch.rasc.extclassgenerator.validation.InclusionValidationArray\\\",{extend:\\\"Ext.data.Model\\\",fields:[{name:\\\"type\\\",type:\\\"string\\\"},{name:\\\"field\\\",type:\\\"string\\\"}]});\"}}}});");
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
    public void test14576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14576");
        ch.rasc.extclassgenerator.PartialDataOptionsBean partialDataOptionsBean0 = new ch.rasc.extclassgenerator.PartialDataOptionsBean();
        java.lang.Boolean boolean1 = partialDataOptionsBean0.getChanges();
        java.lang.Boolean boolean2 = partialDataOptionsBean0.getCritical();
        java.lang.Boolean boolean3 = partialDataOptionsBean0.getChanges();
        java.lang.Boolean boolean4 = partialDataOptionsBean0.getChanges();
        partialDataOptionsBean0.setChanges((java.lang.Boolean) false);
        java.lang.Boolean boolean7 = partialDataOptionsBean0.getChanges();
        partialDataOptionsBean0.setCritical((java.lang.Boolean) false);
        partialDataOptionsBean0.setAssociated((java.lang.Boolean) true);
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + false + "'", boolean7, false);
    }

    @Test
    public void test14577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14577");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});", "creditCardNumber");
        java.lang.Boolean boolean3 = modelFieldBean2.getPersist();
        java.lang.Boolean boolean4 = modelFieldBean2.getUseNull();
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test14578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14578");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        java.lang.String str6 = modelFieldBean2.getMapping();
        java.lang.String str7 = modelFieldBean2.getName();
        java.lang.String str8 = modelFieldBean2.getConvert();
        java.lang.String str9 = modelFieldBean2.getDateFormat();
        java.lang.Object obj10 = modelFieldBean2.getDefaultValue();
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean14 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean14.setConvert("hi!");
        modelFieldBean14.setMapping("hi!");
        modelFieldBean14.setUseNull((java.lang.Boolean) true);
        modelFieldBean14.setAllowBlank((java.lang.Boolean) false);
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray30 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList28);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray31 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("", (java.util.List<java.lang.String>) strList28);
        java.util.List<java.lang.String> strList32 = exclusionValidationArray31.getList();
        modelFieldBean14.setDepends(strList32);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray34 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});", strList32);
        java.lang.String str35 = exclusionValidationArray34.getField();
        java.util.List<java.lang.String> strList36 = exclusionValidationArray34.getList();
        modelFieldBean2.setDepends(strList36);
        java.util.List<java.lang.String> strList38 = modelFieldBean2.getDepends();
        java.lang.String str39 = modelFieldBean2.getName();
        java.lang.Boolean boolean40 = modelFieldBean2.getAllowBlank();
        java.lang.Boolean boolean41 = modelFieldBean2.getUnique();
        modelFieldBean2.setCalculate("Ext.define(\"ch.rasc.extclassgenerator.ReferenceBean\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"type\",type:\"string\"},{name:\"association\",type:\"string\"},{name:\"child\",type:\"string\"},{name:\"parent\",type:\"string\"},{name:\"role\",type:\"string\"},{name:\"inverse\",type:\"string\"}]}});");
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});" + "'", str35, "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNull(boolean40);
        org.junit.Assert.assertNull(boolean41);
    }

    @Test
    public void test14579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14579");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getRole();
        referenceBean0.setChild("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        referenceBean0.setRole("json");
        boolean boolean7 = referenceBean0.hasAnyProperties();
        boolean boolean8 = referenceBean0.typeOnly();
        java.lang.String str9 = referenceBean0.getAssociation();
        boolean boolean10 = referenceBean0.hasAnyProperties();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test14580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14580");
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
        apiObject0.read = "Ext.define(\"ch.rasc.extclassgenerator.association.BelongsToAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"setterName\",\n    type : \"string\"\n  }, {\n    name : \"getterName\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});";
        java.lang.String str17 = apiObject0.create;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str8, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str9, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str11, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str17, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
    }

    @Test
    public void test14581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14581");
        ch.rasc.extclassgenerator.validation.PastValidation pastValidation1 = new ch.rasc.extclassgenerator.validation.PastValidation("ch.rasc.extclassgenerator.validation.RangeValidation");
    }

    @Test
    public void test14582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14582");
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
        java.util.List<java.lang.String> strList36 = null;
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray37 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});", strList36);
        java.util.List<java.lang.String> strList38 = exclusionValidationArray37.getList();
        java.util.List<java.lang.String> strList39 = exclusionValidationArray37.getList();
        java.util.List<java.lang.String> strList40 = exclusionValidationArray37.getList();
        modelFieldBean2.setReference((java.lang.Object) strList40);
        java.lang.Boolean boolean42 = modelFieldBean2.getCritical();
        java.util.List<java.lang.String> strList43 = modelFieldBean2.getDepends();
        modelFieldBean2.setUnique((java.lang.Boolean) false);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(strList38);
        org.junit.Assert.assertNull(strList39);
        org.junit.Assert.assertNull(strList40);
        org.junit.Assert.assertNull(boolean42);
        org.junit.Assert.assertNotNull(strList43);
    }

    @Test
    public void test14583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14583");
        ch.rasc.extclassgenerator.validation.FormatValidation formatValidation2 = new ch.rasc.extclassgenerator.validation.FormatValidation("Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"debug\",\n    type : \"boolean\"\n  }, {\n    name : \"useSingleQuotes\",\n    type : \"boolean\"\n  }, {\n    name : \"surroundApiWithQuotes\",\n    type : \"boolean\"\n  } ]\n});", "Ext.define(\"null\",{extend:\"Ext.data.Model\",idProperty:\"hi!\",fields:[],proxy:{type:\"direct\",idParam:\"hi!\"}});");
        java.lang.String str3 = formatValidation2.getMatcher();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/Ext.define(\"null\",{extend:\"Ext.data.Model\",idProperty:\"hi!\",fields:[],proxy:{type:\"direct\",idParam:\"hi!\"}});/" + "'", str3, "/Ext.define(\"null\",{extend:\"Ext.data.Model\",idProperty:\"hi!\",fields:[],proxy:{type:\"direct\",idParam:\"hi!\"}});/");
    }

    @Test
    public void test14584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14584");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.destroy = "";
        apiObject0.destroy = "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/";
        java.lang.String str5 = apiObject0.read;
        java.lang.String str6 = apiObject0.destroy;
        java.lang.String str7 = apiObject0.destroy;
        java.lang.String str8 = apiObject0.read;
        apiObject0.read = "Ext.define(\"ch.rasc.extclassgenerator.LineEnding\",{extend:\"Ext.data.Model\",config:{fields:[]}});";
        apiObject0.destroy = "/\\/exclusion\\//";
        java.lang.String str13 = apiObject0.create;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/" + "'", str6, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/" + "'", str7, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test14585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14585");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("hi!");
        java.lang.String str2 = hasManyAssociation1.getAssociationKey();
        hasManyAssociation1.setAssociationKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        hasManyAssociation1.setAssociationKey("");
        java.lang.String str7 = hasManyAssociation1.getAssociationKey();
        java.lang.String str8 = hasManyAssociation1.getForeignKey();
        java.lang.String str9 = hasManyAssociation1.getName();
        java.lang.String str10 = hasManyAssociation1.getAssociationKey();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test14586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14586");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean4 = allDataOptionsBean0.getPersist();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        allDataOptionsBean0.setPersist((java.lang.Boolean) false);
        java.lang.Boolean boolean9 = allDataOptionsBean0.getAssociated();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) true);
        java.lang.Boolean boolean12 = allDataOptionsBean0.getPersist();
        java.lang.Boolean boolean13 = allDataOptionsBean0.getChanges();
        java.lang.Boolean boolean14 = allDataOptionsBean0.getCritical();
        boolean boolean15 = allDataOptionsBean0.hasAnyProperties();
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + false + "'", boolean9, false);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + false + "'", boolean12, false);
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test14587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14587");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        java.lang.String str10 = referenceBean0.getType();
        java.lang.String str11 = referenceBean0.getParent();
        referenceBean0.setAssociation("ch.rasc.extclassgenerator.ModelAnnotationProcessor");
        java.lang.String str14 = referenceBean0.getInverse();
        referenceBean0.setRole("/Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",{extend:\"Ext.data.Model\",fields:[{name:\"debug\",type:\"boolean\"},{name:\"useSingleQuotes\",type:\"boolean\"},{name:\"surroundApiWithQuotes\",type:\"boolean\"}]});/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test14588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14588");
        ch.rasc.extclassgenerator.validation.InclusionValidation inclusionValidation2 = new ch.rasc.extclassgenerator.validation.InclusionValidation("Ext.define(\"ch.rasc.extclassgenerator.association.HasOneAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ {\n      name : \"setterName\",\n      type : \"string\"\n    }, {\n      name : \"getterName\",\n      type : \"string\"\n    }, {\n      name : \"name\",\n      type : \"string\"\n    }, {\n      name : \"type\",\n      type : \"string\"\n    }, {\n      name : \"model\",\n      type : \"string\"\n    }, {\n      name : \"associationKey\",\n      type : \"string\"\n    }, {\n      name : \"foreignKey\",\n      type : \"string\"\n    }, {\n      name : \"primaryKey\",\n      type : \"string\"\n    }, {\n      name : \"instanceName\",\n      type : \"string\"\n    } ]\n  }\n});", "/\\/range\\//");
    }

    @Test
    public void test14589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14589");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("hi!");
        hasManyAssociation1.setAssociationKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        hasManyAssociation1.setName("belongsTo");
        hasManyAssociation1.setPrimaryKey("Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});");
    }

    @Test
    public void test14590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14590");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        java.lang.String str2 = hasOneAssociation1.getGetterName();
        hasOneAssociation1.setGetterName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        java.lang.String str5 = hasOneAssociation1.getForeignKey();
        hasOneAssociation1.setForeignKey("hasMany");
        java.lang.String str8 = hasOneAssociation1.getName();
        hasOneAssociation1.setGetterName("/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});/");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test14591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14591");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getChild();
        java.lang.String str2 = referenceBean0.getChild();
        referenceBean0.setType("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        boolean boolean5 = referenceBean0.hasAnyProperties();
        java.lang.String str6 = referenceBean0.getType();
        referenceBean0.setChild("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        java.lang.String str9 = referenceBean0.getInverse();
        java.lang.String str10 = referenceBean0.getParent();
        java.lang.String str11 = referenceBean0.getAssociation();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});" + "'", str6, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test14592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14592");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean4 = allDataOptionsBean0.getPersist();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        allDataOptionsBean0.setPersist((java.lang.Boolean) false);
        boolean boolean9 = allDataOptionsBean0.hasAnyProperties();
        allDataOptionsBean0.setChanges((java.lang.Boolean) false);
        boolean boolean12 = allDataOptionsBean0.hasAnyProperties();
        java.lang.Boolean boolean13 = allDataOptionsBean0.getAssociated();
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + false + "'", boolean13, false);
    }

    @Test
    public void test14593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14593");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]}});");
    }

    @Test
    public void test14594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14594");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        ch.rasc.extclassgenerator.validation.GenericValidation genericValidation3 = new ch.rasc.extclassgenerator.validation.GenericValidation("Ext.define(\"null\",{extend:\"\",config:{fields:[]}});", "ch.rasc.extclassgenerator.ModelFieldBean", strMap2);
    }

    @Test
    public void test14595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14595");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("/ch.rasc.extclassgenerator.PartialDataOptionsBean/", "Ext.define(\"ch.rasc.extclassgenerator.validation.PresenceValidation\",{extend:\"Ext.data.Model\",fields:[{name:\"type\",type:\"string\"},{name:\"field\",type:\"string\"}]});");
    }

    @Test
    public void test14596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14596");
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
        java.lang.String str12 = referenceBean0.getInverse();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});" + "'", str5, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});" + "'", str12, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
    }

    @Test
    public void test14597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14597");
        ch.rasc.extclassgenerator.validation.InclusionValidation inclusionValidation2 = new ch.rasc.extclassgenerator.validation.InclusionValidation("Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ {\n      name : \"debug\",\n      type : \"boolean\"\n    }, {\n      name : \"useSingleQuotes\",\n      type : \"boolean\"\n    }, {\n      name : \"surroundApiWithQuotes\",\n      type : \"boolean\"\n    } ]\n  }\n});", "Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]}});");
    }

    @Test
    public void test14598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14598");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("hi!");
        java.lang.String str2 = hasManyAssociation1.getAssociationKey();
        java.lang.String str3 = hasManyAssociation1.getForeignKey();
        hasManyAssociation1.setInstanceName("length");
        hasManyAssociation1.setName("exclusion");
        java.lang.String str8 = hasManyAssociation1.getAssociationKey();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test14599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14599");
        ch.rasc.extclassgenerator.ModelType modelType1 = null;
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", modelType1);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray9 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList7);
        java.util.List<java.lang.String> strList10 = inclusionValidationArray9.getList();
        modelFieldBean2.setDepends(strList10);
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean12 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        java.lang.Boolean boolean13 = allDataOptionsBean12.getPersist();
        modelFieldBean2.setReference((java.lang.Object) allDataOptionsBean12);
        java.lang.Boolean boolean15 = allDataOptionsBean12.getChanges();
        java.lang.Boolean boolean16 = allDataOptionsBean12.getAssociated();
        allDataOptionsBean12.setChanges((java.lang.Boolean) true);
        allDataOptionsBean12.setChanges((java.lang.Boolean) true);
        boolean boolean21 = allDataOptionsBean12.hasAnyProperties();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertNull(boolean15);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test14600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14600");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("/Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});/");
        java.lang.String str2 = belongsToAssociation1.getSetterName();
        java.lang.String str3 = belongsToAssociation1.getForeignKey();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test14601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14601");
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
        java.lang.String str30 = modelFieldBean2.getMapping();
        java.lang.String str31 = modelFieldBean2.getType();
        modelFieldBean2.setPersist((java.lang.Boolean) false);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(boolean25);
        org.junit.Assert.assertNull(boolean28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str31, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
    }

    @Test
    public void test14602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14602");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        modelFieldBean2.setMapping("hi!");
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        modelFieldBean2.setAllowBlank((java.lang.Boolean) false);
        modelFieldBean2.setConvert("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        ch.rasc.extclassgenerator.ModelType modelType13 = modelFieldBean2.getModelType();
        java.lang.Boolean boolean14 = modelFieldBean2.getCritical();
        modelFieldBean2.setConvert("Ext.define(\"ch.rasc.extclassgenerator.association.HasOneAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"setterName\",type:\"string\"},{name:\"getterName\",type:\"string\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});");
        org.junit.Assert.assertNull(modelType13);
        org.junit.Assert.assertNull(boolean14);
    }

    @Test
    public void test14603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14603");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        referenceBean0.setType("");
        java.lang.String str3 = referenceBean0.getAssociation();
        referenceBean0.setInverse("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        referenceBean0.setInverse("ch.rasc.extclassgenerator.ModelBean");
        boolean boolean8 = referenceBean0.typeOnly();
        referenceBean0.setInverse("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});/");
        referenceBean0.setRole("Ext.define(\"ch.rasc.extclassgenerator.validation.RangeValidation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"min\",\n    type : \"float\"\n  }, {\n    name : \"max\",\n    type : \"float\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"field\",\n    type : \"string\"\n  } ]\n});");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test14604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14604");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getChild();
        java.lang.String str2 = referenceBean0.getChild();
        referenceBean0.setAssociation("creditCardNumber");
        referenceBean0.setInverse("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        referenceBean0.setRole("length");
        referenceBean0.setChild("creditCardNumber");
        java.lang.String str11 = referenceBean0.getChild();
        referenceBean0.setChild("/ch.rasc.extclassgenerator.PartialDataOptionsBean/");
        java.lang.String str14 = referenceBean0.getAssociation();
        boolean boolean15 = referenceBean0.hasAnyProperties();
        java.lang.String str16 = referenceBean0.getParent();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "creditCardNumber" + "'", str11, "creditCardNumber");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "creditCardNumber" + "'", str14, "creditCardNumber");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test14605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14605");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        boolean boolean1 = allDataOptionsBean0.hasAnyProperties();
        boolean boolean2 = allDataOptionsBean0.hasAnyProperties();
        java.lang.Boolean boolean3 = allDataOptionsBean0.getChanges();
        java.lang.Boolean boolean4 = allDataOptionsBean0.getPersist();
        allDataOptionsBean0.setChanges((java.lang.Boolean) true);
        allDataOptionsBean0.setPersist((java.lang.Boolean) true);
        allDataOptionsBean0.setCritical((java.lang.Boolean) false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test14606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14606");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Boolean boolean5 = modelFieldBean2.getPersist();
        java.lang.String str6 = modelFieldBean2.getMapping();
        java.lang.String str7 = modelFieldBean2.getName();
        modelFieldBean2.setCritical((java.lang.Boolean) true);
        modelFieldBean2.setUseNull((java.lang.Boolean) false);
        modelFieldBean2.setConvert("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setUnique((java.lang.Boolean) true);
        java.util.List<java.lang.String> strList16 = modelFieldBean2.getDepends();
        java.util.List<java.lang.String> strList17 = modelFieldBean2.getDepends();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(strList16);
        org.junit.Assert.assertNull(strList17);
    }

    @Test
    public void test14607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14607");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Object obj5 = modelFieldBean2.getReference();
        modelFieldBean2.setPersist((java.lang.Boolean) false);
        java.lang.String str8 = modelFieldBean2.getName();
        java.lang.String str9 = modelFieldBean2.getName();
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean13 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean13.setConvert("hi!");
        java.lang.Boolean boolean16 = modelFieldBean13.getPersist();
        java.lang.String str17 = modelFieldBean13.getMapping();
        java.lang.String str18 = modelFieldBean13.getName();
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray25 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList23);
        modelFieldBean13.setDepends((java.util.List<java.lang.String>) strList23);
        modelFieldBean13.setCalculate("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean32 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean32.setConvert("hi!");
        java.lang.Boolean boolean35 = modelFieldBean32.getPersist();
        java.lang.String str36 = modelFieldBean32.getMapping();
        java.lang.String str37 = modelFieldBean32.getName();
        java.lang.String[] strArray41 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList42 = new java.util.ArrayList<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList42, strArray41);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray44 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList42);
        modelFieldBean32.setDepends((java.util.List<java.lang.String>) strList42);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray46 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});", (java.util.List<java.lang.String>) strList42);
        modelFieldBean13.setDepends((java.util.List<java.lang.String>) strList42);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray48 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});/", (java.util.List<java.lang.String>) strList42);
        java.util.List<java.lang.String> strList49 = inclusionValidationArray48.getList();
        modelFieldBean2.setDepends(strList49);
        java.lang.Boolean boolean51 = modelFieldBean2.getUseNull();
        java.lang.Boolean boolean52 = modelFieldBean2.getUnique();
        modelFieldBean2.setPersist((java.lang.Boolean) false);
        modelFieldBean2.setCritical((java.lang.Boolean) false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(boolean35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertNull(boolean51);
        org.junit.Assert.assertNull(boolean52);
    }

    @Test
    public void test14608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14608");
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
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean29 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean29.setConvert("hi!");
        java.lang.Boolean boolean32 = modelFieldBean29.getPersist();
        java.lang.String str33 = modelFieldBean29.getMapping();
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList39 = new java.util.ArrayList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray41 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList39);
        java.util.List<java.lang.String> strList42 = inclusionValidationArray41.getList();
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray43 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", strList42);
        modelFieldBean29.setDepends(strList42);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray45 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("hasMany", strList42);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray46 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", strList42);
        java.util.List<java.lang.String> strList47 = inclusionValidationArray46.getList();
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray48 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("", strList47);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray49 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("format", strList47);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray50 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", strList47);
        modelFieldBean2.setDepends(strList47);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(boolean21);
        org.junit.Assert.assertNull(boolean32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(strList47);
    }

    @Test
    public void test14609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14609");
        ch.rasc.extclassgenerator.validation.FormatValidation formatValidation2 = new ch.rasc.extclassgenerator.validation.FormatValidation("length", "/\\/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});\\//");
        java.lang.String str3 = formatValidation2.getMatcher();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/\\/\\\\/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});\\\\/\\//" + "'", str3, "/\\/\\\\/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});\\\\/\\//");
    }

    @Test
    public void test14610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14610");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        allDataOptionsBean0.setCritical((java.lang.Boolean) true);
        boolean boolean7 = allDataOptionsBean0.hasAnyProperties();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test14611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14611");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        java.lang.String str2 = hasOneAssociation1.getName();
        java.lang.String str3 = hasOneAssociation1.getSetterName();
        java.lang.String str4 = hasOneAssociation1.getAssociationKey();
        hasOneAssociation1.setForeignKey("email");
        java.lang.String str7 = hasOneAssociation1.getGetterName();
        hasOneAssociation1.setGetterName("Ext.define(\"ch.rasc.extclassgenerator.AllDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});");
        java.lang.String str10 = hasOneAssociation1.getAssociationKey();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test14612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14612");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        java.lang.String str3 = modelBean0.getIdProperty();
        modelBean0.setReader("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        modelBean0.setWriter("hi!");
        java.lang.String str8 = modelBean0.getMessageProperty();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test14613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14613");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.read;
        apiObject0.update = "hi!";
        apiObject0.create = "creditCardNumber";
        java.lang.String str8 = apiObject0.destroy;
        apiObject0.destroy = "length";
        apiObject0.read = "Ext.define(\"ch.rasc.extclassgenerator.validation.PresenceValidation\",{extend:\"Ext.data.Model\",fields:[{name:\"type\",type:\"string\"},{name:\"field\",type:\"string\"}]});";
        java.lang.String str13 = apiObject0.read;
        java.lang.String str14 = apiObject0.update;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.validation.PresenceValidation\",{extend:\"Ext.data.Model\",fields:[{name:\"type\",type:\"string\"},{name:\"field\",type:\"string\"}]});" + "'", str13, "Ext.define(\"ch.rasc.extclassgenerator.validation.PresenceValidation\",{extend:\"Ext.data.Model\",fields:[{name:\"type\",type:\"string\"},{name:\"field\",type:\"string\"}]});");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test14614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14614");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.read = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str8 = apiObject0.update;
        java.lang.String str9 = apiObject0.destroy;
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.LineEnding\",{extend:\"Ext.data.Model\",config:{fields:[]}});";
        java.lang.String str12 = apiObject0.create;
        java.lang.String str13 = apiObject0.create;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str8, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str12, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str13, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
    }

    @Test
    public void test14615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14615");
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation3 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});", (java.lang.Long) 32L, (java.lang.Long) 0L);
        java.lang.String str4 = rangeValidation3.getField();
        java.math.BigDecimal bigDecimal5 = rangeValidation3.getMin();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});" + "'", str4, "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        org.junit.Assert.assertNotNull(bigDecimal5);
    }

    @Test
    public void test14616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14616");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getChild();
        boolean boolean2 = referenceBean0.typeOnly();
        java.lang.String str3 = referenceBean0.getAssociation();
        java.lang.String str4 = referenceBean0.getAssociation();
        referenceBean0.setAssociation("Ext.define(\"null\",\r\n{\n  extend : \"/Ext.define(\\\"ch.rasc.extclassgenerator.association.HasManyAssociation\\\",{extend:\\\"Ext.data.Model\\\",fields:[{name:\\\"autoLoad\\\",type:\\\"boolean\\\"},{name:\\\"name\\\",type:\\\"string\\\"},{name:\\\"type\\\",type:\\\"string\\\"},{name:\\\"model\\\",type:\\\"string\\\"},{name:\\\"associationKey\\\",type:\\\"string\\\"},{name:\\\"foreignKey\\\",type:\\\"string\\\"},{name:\\\"primaryKey\\\",type:\\\"string\\\"},{name:\\\"instanceName\\\",type:\\\"string\\\"}]});/\",\n  config : {\n    fields : [ ],\n    proxy : {\n      type : \"direct\",\n      reader : {\n        successProperty : \"hasMany\"\n      },\n      writer : {\n        type : \"Ext.define(\\\"null\\\",{extend:\\\"Ext.data.Model\\\",fields:[],proxy:{type:\\\"direct\\\",directFn:hi!}});\"\n      }\n    }\n  }\n});");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test14617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14617");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        java.lang.String str6 = referenceBean0.getParent();
        java.lang.String str7 = referenceBean0.getRole();
        referenceBean0.setRole("hasOne");
        boolean boolean10 = referenceBean0.typeOnly();
        referenceBean0.setInverse("belongsTo");
        boolean boolean13 = referenceBean0.hasAnyProperties();
        java.lang.String str14 = referenceBean0.getRole();
        referenceBean0.setType("/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});/");
        referenceBean0.setChild("hi!");
        java.lang.String str19 = referenceBean0.getAssociation();
        java.lang.String str20 = referenceBean0.getInverse();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hasOne" + "'", str14, "hasOne");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "belongsTo" + "'", str20, "belongsTo");
    }

    @Test
    public void test14618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14618");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        java.lang.String str6 = referenceBean0.getAssociation();
        referenceBean0.setInverse("");
        java.lang.String str9 = referenceBean0.getParent();
        java.lang.String str10 = referenceBean0.getRole();
        boolean boolean11 = referenceBean0.typeOnly();
        referenceBean0.setInverse("Ext.define(\"ch.rasc.extclassgenerator.association.BelongsToAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ {\n      name : \"setterName\",\n      type : \"string\"\n    }, {\n      name : \"getterName\",\n      type : \"string\"\n    }, {\n      name : \"type\",\n      type : \"string\"\n    }, {\n      name : \"model\",\n      type : \"string\"\n    }, {\n      name : \"associationKey\",\n      type : \"string\"\n    }, {\n      name : \"foreignKey\",\n      type : \"string\"\n    }, {\n      name : \"primaryKey\",\n      type : \"string\"\n    }, {\n      name : \"instanceName\",\n      type : \"string\"\n    } ]\n  }\n});");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test14619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14619");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        modelFieldBean2.setCalculate("Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});");
        modelFieldBean2.setCalculate("ch.rasc.extclassgenerator.PartialDataOptionsBean");
        java.lang.String str11 = modelFieldBean2.getName();
        modelFieldBean2.setConvert("Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ {\n      name : \"associated\",\n      type : \"boolean\"\n    }, {\n      name : \"changes\",\n      type : \"boolean\"\n    }, {\n      name : \"critical\",\n      type : \"boolean\"\n    }, {\n      name : \"persist\",\n      type : \"boolean\"\n    } ]\n  }\n});");
        modelFieldBean2.setDateFormat("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test14620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14620");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("exclusion");
        java.lang.String str2 = hasManyAssociation1.getType();
        hasManyAssociation1.setPrimaryKey("Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
        hasManyAssociation1.setAutoLoad((java.lang.Boolean) true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hasMany" + "'", str2, "hasMany");
    }

    @Test
    public void test14621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14621");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getChild();
        java.lang.String str2 = referenceBean0.getChild();
        referenceBean0.setAssociation("creditCardNumber");
        referenceBean0.setType("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        referenceBean0.setChild("length");
        referenceBean0.setParent("json");
        referenceBean0.setChild("exclusion");
        referenceBean0.setParent("digits");
        java.lang.String str15 = referenceBean0.getChild();
        java.lang.String str16 = referenceBean0.getType();
        referenceBean0.setChild("Ext.define(\"ch.rasc.extclassgenerator.association.HasOneAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ {\n      name : \"setterName\",\n      type : \"string\"\n    }, {\n      name : \"getterName\",\n      type : \"string\"\n    }, {\n      name : \"name\",\n      type : \"string\"\n    }, {\n      name : \"type\",\n      type : \"string\"\n    }, {\n      name : \"model\",\n      type : \"string\"\n    }, {\n      name : \"associationKey\",\n      type : \"string\"\n    }, {\n      name : \"foreignKey\",\n      type : \"string\"\n    }, {\n      name : \"primaryKey\",\n      type : \"string\"\n    }, {\n      name : \"instanceName\",\n      type : \"string\"\n    } ]\n  }\n});");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "exclusion" + "'", str15, "exclusion");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});" + "'", str16, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
    }

    @Test
    public void test14622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14622");
        ch.rasc.extclassgenerator.validation.DigitsValidation digitsValidation3 = new ch.rasc.extclassgenerator.validation.DigitsValidation("ch.rasc.extclassgenerator.AllDataOptionsBean", (int) (byte) 1, (int) ' ');
    }

    @Test
    public void test14623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14623");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]}});");
    }

    @Test
    public void test14624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14624");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.update = "exclusion";
        java.lang.String str8 = apiObject0.read;
        java.lang.String str9 = apiObject0.destroy;
        apiObject0.update = "creditCardNumber";
        apiObject0.read = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});";
        java.lang.String str14 = apiObject0.create;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str14, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
    }

    @Test
    public void test14625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14625");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("/ch.rasc.extclassgenerator.ModelAnnotationProcessor/");
        java.lang.String str2 = belongsToAssociation1.getType();
        java.lang.String str3 = belongsToAssociation1.getGetterName();
        java.lang.String str4 = belongsToAssociation1.getGetterName();
        java.lang.String str5 = belongsToAssociation1.getGetterName();
        belongsToAssociation1.setGetterName("length");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "belongsTo" + "'", str2, "belongsTo");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test14626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14626");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        java.lang.Boolean boolean1 = allDataOptionsBean0.getPersist();
        java.lang.Boolean boolean2 = allDataOptionsBean0.getPersist();
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        allDataOptionsBean0.setPersist((java.lang.Boolean) true);
        allDataOptionsBean0.setChanges((java.lang.Boolean) true);
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNull(boolean3);
    }

    @Test
    public void test14627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14627");
        ch.rasc.extclassgenerator.OutputConfig outputConfig0 = new ch.rasc.extclassgenerator.OutputConfig();
        boolean boolean1 = outputConfig0.isSurroundApiWithQuotes();
        boolean boolean2 = outputConfig0.isDebug();
        ch.rasc.extclassgenerator.ModelAnnotationProcessor modelAnnotationProcessor3 = new ch.rasc.extclassgenerator.ModelAnnotationProcessor();
        java.util.Set<java.lang.String> strSet4 = modelAnnotationProcessor3.getSupportedAnnotationTypes();
        boolean boolean5 = outputConfig0.equals((java.lang.Object) strSet4);
        boolean boolean6 = outputConfig0.isSurroundApiWithQuotes();
        boolean boolean7 = outputConfig0.isSurroundApiWithQuotes();
        outputConfig0.setSurroundApiWithQuotes(false);
        outputConfig0.setUseSingleQuotes(false);
        ch.rasc.extclassgenerator.OutputFormat outputFormat12 = outputConfig0.getOutputFormat();
        boolean boolean13 = outputConfig0.isDebug();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(outputFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test14628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14628");
        ch.rasc.extclassgenerator.validation.DigitsValidation digitsValidation3 = new ch.rasc.extclassgenerator.validation.DigitsValidation("/Ext.define(\"java.util.Collections$UnmodifiableSet\",{extend:\"Ext.data.Model\",config:{fields:[]}});/", 0, (int) (short) 100);
    }

    @Test
    public void test14629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14629");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "exclusion";
        java.lang.String str6 = apiObject0.update;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str6, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
    }

    @Test
    public void test14630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14630");
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
        javax.lang.model.SourceVersion sourceVersion34 = modelAnnotationProcessor23.getSupportedSourceVersion();
        java.util.Set<java.lang.String> strSet35 = modelAnnotationProcessor23.getSupportedAnnotationTypes();
        java.util.Set<java.lang.String> strSet36 = modelAnnotationProcessor23.getSupportedAnnotationTypes();
        org.junit.Assert.assertNotNull(abstractValidationArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(boolean22);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(wildcardIterable30);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertTrue("'" + sourceVersion34 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion34.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(strSet36);
    }

    @Test
    public void test14631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14631");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        modelBean0.setIdProperty("");
        boolean boolean5 = modelBean0.isDisablePagingParameters();
        modelBean0.setExtend("");
        ch.rasc.extclassgenerator.PartialDataOptionsBean partialDataOptionsBean8 = modelBean0.getPartialDataOptions();
        java.lang.String str9 = modelBean0.getTotalProperty();
        java.lang.String str10 = modelBean0.getExtend();
        modelBean0.setReadMethod("hi!");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean15 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean15.setConvert("hi!");
        ch.rasc.extclassgenerator.validation.CreditCardNumberValidation creditCardNumberValidation19 = new ch.rasc.extclassgenerator.validation.CreditCardNumberValidation("");
        ch.rasc.extclassgenerator.validation.FormatValidation formatValidation22 = new ch.rasc.extclassgenerator.validation.FormatValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        ch.rasc.extclassgenerator.validation.FutureValidation futureValidation24 = new ch.rasc.extclassgenerator.validation.FutureValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        ch.rasc.extclassgenerator.validation.FormatValidation formatValidation27 = new ch.rasc.extclassgenerator.validation.FormatValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        ch.rasc.extclassgenerator.validation.AbstractValidation[] abstractValidationArray28 = new ch.rasc.extclassgenerator.validation.AbstractValidation[] { creditCardNumberValidation19, formatValidation22, futureValidation24, formatValidation27 };
        java.util.ArrayList<ch.rasc.extclassgenerator.validation.AbstractValidation> abstractValidationList29 = new java.util.ArrayList<ch.rasc.extclassgenerator.validation.AbstractValidation>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<ch.rasc.extclassgenerator.validation.AbstractValidation>) abstractValidationList29, abstractValidationArray28);
        modelFieldBean15.setValidators((java.util.List<ch.rasc.extclassgenerator.validation.AbstractValidation>) abstractValidationList29);
        java.util.List<java.lang.String> strList32 = modelFieldBean15.getDepends();
        java.lang.Boolean boolean33 = modelFieldBean15.getPersist();
        java.lang.Object obj34 = modelFieldBean15.getDefaultValue();
        modelBean0.addField(modelFieldBean15);
        java.util.List<ch.rasc.extclassgenerator.validation.AbstractValidation> abstractValidationList36 = modelFieldBean15.getValidators();
        java.lang.Object obj37 = modelFieldBean15.getReference();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(partialDataOptionsBean8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(abstractValidationArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(strList32);
        org.junit.Assert.assertNull(boolean33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(abstractValidationList36);
        org.junit.Assert.assertNull(obj37);
    }

    @Test
    public void test14632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14632");
        ch.rasc.extclassgenerator.validation.ExclusionValidation exclusionValidation2 = new ch.rasc.extclassgenerator.validation.ExclusionValidation("future", "Ext.define(\"null\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ],\n    proxy : {\n      type : \"direct\",\n      reader : {\n        type : \"Ext.define(\\\"java.util.ArrayList\\\",\\r\\n{\\n  extend : \\\"Ext.data.Model\\\",\\n  fields : [ ]\\n});\"\n      }\n    }\n  }\n});");
        java.lang.String str3 = exclusionValidation2.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "exclusion" + "'", str3, "exclusion");
    }

    @Test
    public void test14633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14633");
        ch.rasc.extclassgenerator.ModelType modelType3 = null;
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean4 = new ch.rasc.extclassgenerator.ModelFieldBean("", modelType3);
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean7 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean7.setConvert("hi!");
        java.lang.Boolean boolean10 = modelFieldBean7.getPersist();
        java.lang.String str11 = modelFieldBean7.getMapping();
        java.lang.String str12 = modelFieldBean7.getName();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray19 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList17);
        modelFieldBean7.setDepends((java.util.List<java.lang.String>) strList17);
        modelFieldBean7.setCalculate("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean26 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean26.setConvert("hi!");
        java.lang.Boolean boolean29 = modelFieldBean26.getPersist();
        java.lang.String str30 = modelFieldBean26.getMapping();
        java.lang.String str31 = modelFieldBean26.getName();
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray38 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList36);
        modelFieldBean26.setDepends((java.util.List<java.lang.String>) strList36);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray40 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});", (java.util.List<java.lang.String>) strList36);
        modelFieldBean7.setDepends((java.util.List<java.lang.String>) strList36);
        modelFieldBean4.setDepends((java.util.List<java.lang.String>) strList36);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray43 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("length", (java.util.List<java.lang.String>) strList36);
        java.util.List<java.lang.String> strList44 = exclusionValidationArray43.getList();
        java.util.List<java.lang.String> strList45 = exclusionValidationArray43.getList();
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray46 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("Ext.define(\"ch.rasc.extclassgenerator.validation.RangeValidation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"min\",\n    type : \"float\"\n  }, {\n    name : \"max\",\n    type : \"float\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"field\",\n    type : \"string\"\n  } ]\n});", strList45);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(boolean29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertNotNull(strList45);
    }

    @Test
    public void test14634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14634");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.destroy = "";
        apiObject0.destroy = "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/";
        java.lang.String str5 = apiObject0.read;
        java.lang.String str6 = apiObject0.destroy;
        java.lang.String str7 = apiObject0.create;
        java.lang.String str8 = apiObject0.read;
        apiObject0.destroy = "/exclusion/";
        java.lang.String str11 = apiObject0.destroy;
        apiObject0.destroy = "/Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});/";
        apiObject0.read = "Ext.define(\"null\",{extend:\"\",config:{fields:[]}});";
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/" + "'", str6, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/exclusion/" + "'", str11, "/exclusion/");
    }

    @Test
    public void test14635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14635");
        ch.rasc.extclassgenerator.PartialDataOptionsBean partialDataOptionsBean0 = new ch.rasc.extclassgenerator.PartialDataOptionsBean();
        java.lang.Boolean boolean1 = partialDataOptionsBean0.getChanges();
        java.lang.Boolean boolean2 = partialDataOptionsBean0.getCritical();
        java.lang.Boolean boolean3 = partialDataOptionsBean0.getChanges();
        java.lang.Boolean boolean4 = partialDataOptionsBean0.getCritical();
        java.lang.Boolean boolean5 = partialDataOptionsBean0.getCritical();
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNull(boolean5);
    }

    @Test
    public void test14636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14636");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        ch.rasc.extclassgenerator.validation.GenericValidation genericValidation3 = new ch.rasc.extclassgenerator.validation.GenericValidation("Ext.define(\"java.util.Collections$UnmodifiableSet\",{extend:\"Ext.data.Model\",config:{fields:[]}});", "length", strMap2);
    }

    @Test
    public void test14637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14637");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Object obj5 = modelFieldBean2.getReference();
        modelFieldBean2.setPersist((java.lang.Boolean) false);
        modelFieldBean2.setDateFormat("Ext.data.Model");
        ch.rasc.extclassgenerator.ModelType modelType10 = modelFieldBean2.getModelType();
        java.util.List<ch.rasc.extclassgenerator.validation.AbstractValidation> abstractValidationList11 = modelFieldBean2.getValidators();
        java.lang.Object obj12 = modelFieldBean2.getDefaultValue();
        java.util.List<java.lang.String> strList13 = modelFieldBean2.getDepends();
        modelFieldBean2.setConvert("/Ext.define(\"ch.rasc.extclassgenerator.validation.InclusionValidation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"list\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"field\",\n    type : \"string\"\n  } ]\n});/");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(modelType10);
        org.junit.Assert.assertNull(abstractValidationList11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(strList13);
    }

    @Test
    public void test14638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14638");
        ch.rasc.extclassgenerator.validation.ExclusionValidation exclusionValidation2 = new ch.rasc.extclassgenerator.validation.ExclusionValidation("ch.rasc.extclassgenerator.OutputConfig", "Ext.define(\"null\",\r\n{\n  extend : \"Ext.data.Model\",\n  idgen : \"Ext.define(\\\"null\\\",{extend:\\\"Ext.data.Model\\\",config:{fields:[],proxy:{type:\\\"direct\\\",directFn:hi!,writer:{type:\\\"Ext.define(\\\\\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\\\\\",{extend:\\\\\\\"Ext.data.Model\\\\\\\",config:{fields:[]}});\\\"}}}});\",\n  fields : [ ]\n});");
    }

    @Test
    public void test14639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14639");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("digits", (java.lang.Integer) (-1), (java.lang.Integer) (-1));
    }

    @Test
    public void test14640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14640");
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation3 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"null\",{extend:\"\",config:{fields:[]}});", (java.lang.Long) 97L, (java.lang.Long) 97L);
        java.math.BigDecimal bigDecimal4 = rangeValidation3.getMax();
        java.math.BigDecimal bigDecimal5 = rangeValidation3.getMax();
        java.math.BigDecimal bigDecimal6 = rangeValidation3.getMin();
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal6);
    }

    @Test
    public void test14641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14641");
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
        java.lang.Boolean boolean15 = allDataOptionsBean0.getPersist();
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + false + "'", boolean10, false);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + boolean15 + "' != '" + false + "'", boolean15, false);
    }

    @Test
    public void test14642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14642");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        java.lang.String str1 = apiObject0.update;
        apiObject0.update = "";
        apiObject0.read = "";
        java.lang.String str6 = apiObject0.destroy;
        java.lang.String str7 = apiObject0.create;
        apiObject0.create = "hasOne";
        java.lang.String str10 = apiObject0.read;
        apiObject0.destroy = "/Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});/";
        java.lang.String str13 = apiObject0.destroy;
        apiObject0.update = "/\\/Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});\\//";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});/" + "'", str13, "/Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});/");
    }

    @Test
    public void test14643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14643");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("/\\/hasMany\\//", "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});/");
    }

    @Test
    public void test14644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14644");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.data.Model");
        modelFieldBean2.setAllowNull((java.lang.Boolean) false);
        java.lang.String str5 = modelFieldBean2.getName();
        modelFieldBean2.setCalculate("/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/");
        java.lang.String str8 = modelFieldBean2.getName();
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        modelFieldBean2.setAllowNull((java.lang.Boolean) true);
        java.lang.Boolean boolean13 = modelFieldBean2.getUnique();
        java.lang.String str14 = modelFieldBean2.getCalculate();
        modelFieldBean2.setConvert("ch.rasc.extclassgenerator.association.HasManyAssociation");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/" + "'", str14, "/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/");
    }

    @Test
    public void test14645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14645");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});/", "/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/");
        modelFieldBean2.setAllowNull((java.lang.Boolean) true);
    }

    @Test
    public void test14646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14646");
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
        modelFieldBean2.setMapping("Ext.define(\"null\",{extend:\"\",config:{fields:[]}});");
        java.lang.String str38 = modelFieldBean2.getCalculate();
        modelFieldBean2.setCritical((java.lang.Boolean) false);
        modelFieldBean2.setMapping("Ext.define(\"null\",\r\n{\n  extend : \"\",\n  fields : [ ],\n  validations : [ {\n    type : \"range\",\n    field : \"/Ext.define(\\\"ch.rasc.extclassgenerator.association.HasManyAssociation\\\",{extend:\\\"Ext.data.Model\\\",fields:[{name:\\\"autoLoad\\\",type:\\\"boolean\\\"},{name:\\\"name\\\",type:\\\"string\\\"},{name:\\\"type\\\",type:\\\"string\\\"},{name:\\\"model\\\",type:\\\"string\\\"},{name:\\\"associationKey\\\",type:\\\"string\\\"},{name:\\\"foreignKey\\\",type:\\\"string\\\"},{name:\\\"primaryKey\\\",type:\\\"string\\\"},{name:\\\"instanceName\\\",type:\\\"string\\\"}]});/\",\n    min : 0,\n    max : 0\n  } ]\n});");
        modelFieldBean2.setName("");
        java.lang.String str45 = modelFieldBean2.getCalculate();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str45);
    }

    @Test
    public void test14647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14647");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getChild();
        java.lang.String str2 = referenceBean0.getChild();
        java.lang.String str3 = referenceBean0.getType();
        java.lang.String str4 = referenceBean0.getChild();
        referenceBean0.setType("Ext.define(\"ch.rasc.extclassgenerator.LineEnding\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
        java.lang.String str7 = referenceBean0.getAssociation();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test14648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14648");
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
        java.util.Set<java.lang.String> strSet20 = modelAnnotationProcessor0.getSupportedOptions();
        javax.lang.model.SourceVersion sourceVersion21 = modelAnnotationProcessor0.getSupportedSourceVersion();
        javax.lang.model.element.Element element22 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror23 = null;
        javax.lang.model.element.ExecutableElement executableElement24 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable26 = modelAnnotationProcessor0.getCompletions(element22, annotationMirror23, executableElement24, "Ext.define(\"null\",\r\n{\n  extend : \"\",\n  config : {\n    fields : [ ],\n    proxy : {\n      type : \"direct\",\n      api : {\n        create : Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});\n      },\n      reader : {\n        messageProperty : \"hi!\"\n      }\n    }\n  }\n});");
        javax.lang.model.SourceVersion sourceVersion27 = modelAnnotationProcessor0.getSupportedSourceVersion();
        java.util.Set<java.lang.String> strSet28 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(wildcardIterable7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(wildcardIterable13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(wildcardIterable19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertTrue("'" + sourceVersion21 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion21.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(wildcardIterable26);
        org.junit.Assert.assertTrue("'" + sourceVersion27 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion27.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(strSet28);
    }

    @Test
    public void test14649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14649");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});";
        apiObject0.destroy = "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/";
        java.lang.String str8 = apiObject0.destroy;
        java.lang.String str9 = apiObject0.destroy;
        apiObject0.update = "/Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",{extend:\"Ext.data.Model\",fields:[{name:\"debug\",type:\"boolean\"},{name:\"useSingleQuotes\",type:\"boolean\"},{name:\"surroundApiWithQuotes\",type:\"boolean\"}]});/";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/" + "'", str8, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/" + "'", str9, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
    }

    @Test
    public void test14650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14650");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("ch.rasc.extclassgenerator.ModelFieldBean", "/\\/hi!\\//");
    }

    @Test
    public void test14651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14651");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getParent();
        referenceBean0.setType("");
        referenceBean0.setRole("json");
        java.lang.String str7 = referenceBean0.getType();
        java.lang.String str8 = referenceBean0.getChild();
        referenceBean0.setAssociation("Ext.define(\"ch.rasc.extclassgenerator.validation.CreditCardNumberValidation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"field\",\n    type : \"string\"\n  } ]\n});");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test14652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14652");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setDateFormat("hi!");
        java.util.List<java.lang.String> strList5 = modelFieldBean2.getDepends();
        java.util.List<java.lang.String> strList6 = modelFieldBean2.getDepends();
        java.lang.Boolean boolean7 = modelFieldBean2.getCritical();
        modelFieldBean2.setPersist((java.lang.Boolean) false);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertNull(strList6);
        org.junit.Assert.assertNull(boolean7);
    }

    @Test
    public void test14653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14653");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        referenceBean0.setType("");
        referenceBean0.setInverse("/range/");
        boolean boolean5 = referenceBean0.typeOnly();
        java.lang.String str6 = referenceBean0.getAssociation();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test14654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14654");
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
        java.lang.Boolean boolean21 = modelBean0.getWriteAllFields();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + boolean21 + "' != '" + false + "'", boolean21, false);
    }

    @Test
    public void test14655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14655");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getChild();
        java.lang.String str2 = referenceBean0.getRole();
        referenceBean0.setAssociation("");
        java.lang.String str5 = referenceBean0.getParent();
        referenceBean0.setParent("/\\/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});\\//");
        java.lang.String str8 = referenceBean0.getChild();
        referenceBean0.setParent("Ext.define(\"ch.rasc.extclassgenerator.LineEnding\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
        java.lang.String str11 = referenceBean0.getParent();
        referenceBean0.setAssociation("ch.rasc.extclassgenerator.validation.CreditCardNumberValidation");
        java.lang.String str14 = referenceBean0.getRole();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.LineEnding\",{extend:\"Ext.data.Model\",config:{fields:[]}});" + "'", str11, "Ext.define(\"ch.rasc.extclassgenerator.LineEnding\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test14656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14656");
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
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray38 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList36);
        java.util.List<java.lang.String> strList39 = inclusionValidationArray38.getList();
        java.util.List<java.lang.String> strList40 = inclusionValidationArray38.getList();
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray41 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});", strList40);
        modelFieldBean2.setDepends(strList40);
        java.util.List<java.lang.String> strList43 = modelFieldBean2.getDepends();
        ch.rasc.extclassgenerator.validation.EmailValidation emailValidation45 = new ch.rasc.extclassgenerator.validation.EmailValidation("/\\/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});\\//");
        modelFieldBean2.setReference((java.lang.Object) emailValidation45);
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
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
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertNotNull(strList43);
    }

    @Test
    public void test14657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14657");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        java.lang.String str6 = referenceBean0.getParent();
        java.lang.String str7 = referenceBean0.getType();
        referenceBean0.setAssociation("/\\/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});\\//");
        referenceBean0.setType("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});/");
        referenceBean0.setParent("Ext.define(\"ch.rasc.extclassgenerator.association.BelongsToAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"setterName\",\n    type : \"string\"\n  }, {\n    name : \"getterName\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        boolean boolean14 = referenceBean0.hasAnyProperties();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test14658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14658");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getType();
        referenceBean0.setInverse("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        java.lang.String str4 = referenceBean0.getAssociation();
        java.lang.String str5 = referenceBean0.getAssociation();
        java.lang.String str6 = referenceBean0.getRole();
        java.lang.String str7 = referenceBean0.getParent();
        java.lang.String str8 = referenceBean0.getRole();
        referenceBean0.setType("Ext.define(\"ch.rasc.extclassgenerator.ModelFieldBean\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"dateFormat\",\n    type : \"string\"\n  }, {\n    name : \"useNull\",\n    type : \"boolean\"\n  }, {\n    name : \"allowNull\",\n    type : \"boolean\"\n  }, {\n    name : \"mapping\",\n    type : \"string\"\n  }, {\n    name : \"persist\",\n    type : \"boolean\"\n  }, {\n    name : \"critical\",\n    type : \"boolean\"\n  }, {\n    name : \"convert\",\n    type : \"string\"\n  }, {\n    name : \"calculate\",\n    type : \"string\"\n  }, {\n    name : \"allowBlank\",\n    type : \"boolean\"\n  }, {\n    name : \"unique\",\n    type : \"boolean\"\n  } ]\n});");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test14659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14659");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean6 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean6.setConvert("hi!");
        modelFieldBean6.setMapping("hi!");
        modelFieldBean6.setUseNull((java.lang.Boolean) true);
        modelFieldBean6.setAllowBlank((java.lang.Boolean) false);
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray22 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("", (java.util.List<java.lang.String>) strList20);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray23 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("", (java.util.List<java.lang.String>) strList20);
        java.util.List<java.lang.String> strList24 = exclusionValidationArray23.getList();
        modelFieldBean6.setDepends(strList24);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray26 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("ch.rasc.extclassgenerator.ModelAnnotationProcessor", strList24);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray27 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});", strList24);
        java.util.List<java.lang.String> strList28 = exclusionValidationArray27.getList();
        java.util.List<java.lang.String> strList29 = exclusionValidationArray27.getList();
        java.util.List<java.lang.String> strList30 = exclusionValidationArray27.getList();
        ch.rasc.extclassgenerator.validation.InclusionValidationArray inclusionValidationArray31 = new ch.rasc.extclassgenerator.validation.InclusionValidationArray("//", strList30);
        ch.rasc.extclassgenerator.validation.ExclusionValidationArray exclusionValidationArray32 = new ch.rasc.extclassgenerator.validation.ExclusionValidationArray("/hasMany/", strList30);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(strList30);
    }

    @Test
    public void test14660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14660");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        java.lang.Boolean boolean1 = allDataOptionsBean0.getPersist();
        java.lang.Boolean boolean2 = allDataOptionsBean0.getPersist();
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean4 = allDataOptionsBean0.getCritical();
        java.lang.Boolean boolean5 = allDataOptionsBean0.getCritical();
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNull(boolean5);
    }

    @Test
    public void test14661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14661");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        java.lang.Object obj5 = modelFieldBean2.getReference();
        modelFieldBean2.setPersist((java.lang.Boolean) false);
        java.lang.String str8 = modelFieldBean2.getName();
        java.lang.String str9 = modelFieldBean2.getName();
        modelFieldBean2.setPersist((java.lang.Boolean) false);
        java.lang.Boolean boolean12 = modelFieldBean2.getPersist();
        modelFieldBean2.setPersist((java.lang.Boolean) true);
        modelFieldBean2.setCritical((java.lang.Boolean) true);
        java.lang.String str17 = modelFieldBean2.getName();
        java.util.List<java.lang.String> strList18 = modelFieldBean2.getDepends();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + false + "'", boolean12, false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(strList18);
    }

    @Test
    public void test14662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14662");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("Ext.define(\"ch.rasc.extclassgenerator.ApiObject\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"read\",\n    type : \"string\"\n  }, {\n    name : \"create\",\n    type : \"string\"\n  }, {\n    name : \"update\",\n    type : \"string\"\n  }, {\n    name : \"destroy\",\n    type : \"string\"\n  } ]\n});");
    }

    @Test
    public void test14663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14663");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        ch.rasc.extclassgenerator.validation.GenericValidation genericValidation3 = new ch.rasc.extclassgenerator.validation.GenericValidation("Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[],proxy:{type:\"direct\",directFn:hi!,writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",config:{fields:[]}});\"}}}});", "ch.rasc.extclassgenerator.PartialDataOptionsBean", strMap2);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = genericValidation3.getOptions();
        org.junit.Assert.assertNull(strMap4);
    }

    @Test
    public void test14664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14664");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.destroy = "";
        apiObject0.destroy = "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/";
        java.lang.String str5 = apiObject0.read;
        apiObject0.update = "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/";
        apiObject0.destroy = "Ext.define(\"null\",{extend:\"\",fields:[]});";
        java.lang.String str10 = apiObject0.create;
        java.lang.String str11 = apiObject0.create;
        apiObject0.read = "Ext.define('null',{extend:'/Ext.define(\\'ch.rasc.extclassgenerator.association.HasManyAssociation\\',{extend:\\'Ext.data.Model\\',fields:[{name:\\'autoLoad\\',type:\\'boolean\\'},{name:\\'name\\',type:\\'string\\'},{name:\\'type\\',type:\\'string\\'},{name:\\'model\\',type:\\'string\\'},{name:\\'associationKey\\',type:\\'string\\'},{name:\\'foreignKey\\',type:\\'string\\'},{name:\\'primaryKey\\',type:\\'string\\'},{name:\\'instanceName\\',type:\\'string\\'}]});/',config:{fields:[],proxy:{type:'direct',api:{update:creditCardNumber}}}});";
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test14665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14665");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getType();
        referenceBean0.setRole("Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});");
        java.lang.String str4 = referenceBean0.getRole();
        referenceBean0.setChild("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        java.lang.String str7 = referenceBean0.getInverse();
        referenceBean0.setParent("Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str10 = referenceBean0.getParent();
        java.lang.String str11 = referenceBean0.getType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});" + "'", str4, "Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str10, "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test14666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14666");
        ch.rasc.extclassgenerator.validation.FormatValidation formatValidation2 = new ch.rasc.extclassgenerator.validation.FormatValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});", "Ext.define('ch.rasc.extclassgenerator.ModelAnnotationProcessor',{extend:'Ext.data.Model',fields:[]});");
    }

    @Test
    public void test14667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14667");
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
        javax.lang.model.element.Element element15 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror16 = null;
        javax.lang.model.element.ExecutableElement executableElement17 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable19 = modelAnnotationProcessor0.getCompletions(element15, annotationMirror16, executableElement17, "/Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});/");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertTrue("'" + sourceVersion2 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion2.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertTrue("'" + sourceVersion3 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion3.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertTrue("'" + sourceVersion4 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion4.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(wildcardIterable9);
        org.junit.Assert.assertNotNull(wildcardIterable14);
        org.junit.Assert.assertNotNull(wildcardIterable19);
    }

    @Test
    public void test14668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14668");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getParent();
        referenceBean0.setType("");
        referenceBean0.setRole("json");
        boolean boolean7 = referenceBean0.typeOnly();
        boolean boolean8 = referenceBean0.hasAnyProperties();
        referenceBean0.setInverse("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test14669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14669");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});";
        java.lang.String str6 = apiObject0.destroy;
        apiObject0.read = "/hi!/";
        apiObject0.create = "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[],proxy:{type:\"direct\",directFn:hi!}});";
        java.lang.String str11 = apiObject0.create;
        apiObject0.read = "java.util.Collections$UnmodifiableSet";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[],proxy:{type:\"direct\",directFn:hi!}});" + "'", str11, "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[],proxy:{type:\"direct\",directFn:hi!}});");
    }

    @Test
    public void test14670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14670");
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
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable24 = modelAnnotationProcessor0.getCompletions(element20, annotationMirror21, executableElement22, "/hasMany/");
        javax.lang.model.SourceVersion sourceVersion25 = modelAnnotationProcessor0.getSupportedSourceVersion();
        java.util.Set<java.lang.String> strSet26 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(wildcardIterable7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(wildcardIterable14);
        org.junit.Assert.assertNotNull(wildcardIterable19);
        org.junit.Assert.assertNotNull(wildcardIterable24);
        org.junit.Assert.assertTrue("'" + sourceVersion25 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion25.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(strSet26);
    }

    @Test
    public void test14671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14671");
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
        java.lang.String str17 = referenceBean0.getAssociation();
        referenceBean0.setChild("/\\/ch.rasc.extclassgenerator.ModelAnnotationProcessor\\//");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});" + "'", str13, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});" + "'", str17, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
    }

    @Test
    public void test14672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14672");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getParent();
        referenceBean0.setType("");
        referenceBean0.setRole("json");
        boolean boolean7 = referenceBean0.typeOnly();
        boolean boolean8 = referenceBean0.hasAnyProperties();
        boolean boolean9 = referenceBean0.typeOnly();
        referenceBean0.setParent("ch.rasc.extclassgenerator.AllDataOptionsBean");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test14673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14673");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        modelFieldBean2.setMapping("hi!");
        modelFieldBean2.setUseNull((java.lang.Boolean) true);
        modelFieldBean2.setAllowBlank((java.lang.Boolean) false);
        java.util.List<ch.rasc.extclassgenerator.validation.AbstractValidation> abstractValidationList11 = modelFieldBean2.getValidators();
        java.lang.String str12 = modelFieldBean2.getConvert();
        java.lang.Boolean boolean13 = modelFieldBean2.getUnique();
        java.lang.String str14 = modelFieldBean2.getCalculate();
        ch.rasc.extclassgenerator.ModelType modelType15 = modelFieldBean2.getModelType();
        org.junit.Assert.assertNull(abstractValidationList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(modelType15);
    }

    @Test
    public void test14674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14674");
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation3 = new ch.rasc.extclassgenerator.validation.RangeValidation("/Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});/", (java.lang.Long) 1L, (java.lang.Long) 100L);
        java.lang.String str4 = rangeValidation3.getType();
        java.lang.String str5 = rangeValidation3.getField();
        java.math.BigDecimal bigDecimal6 = rangeValidation3.getMax();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "range" + "'", str4, "range");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});/" + "'", str5, "/Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});/");
        org.junit.Assert.assertNotNull(bigDecimal6);
    }

    @Test
    public void test14675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14675");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("/Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[],proxy:{type:\"direct\",directFn:hi!,writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",config:{fields:[]}});\"}}}});/", (java.lang.Integer) 10, (java.lang.Integer) 52);
    }

    @Test
    public void test14676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14676");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        java.lang.String str1 = referenceBean0.getType();
        referenceBean0.setRole("hi!");
        java.lang.String str4 = referenceBean0.getAssociation();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test14677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14677");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("/hi!/", (java.lang.Integer) 1, (java.lang.Integer) (-1));
    }

    @Test
    public void test14678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14678");
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
        hasManyAssociation12.setName("ch.rasc.extclassgenerator.association.HasManyAssociation");
        hasManyAssociation12.setAutoLoad((java.lang.Boolean) false);
        hasManyAssociation12.setAutoLoad((java.lang.Boolean) true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test14679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14679");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str2 = hasOneAssociation1.getGetterName();
        hasOneAssociation1.setGetterName("");
        hasOneAssociation1.setSetterName("ch.rasc.extclassgenerator.ModelAnnotationProcessor");
        java.lang.String str7 = hasOneAssociation1.getType();
        hasOneAssociation1.setPrimaryKey("/\\/\\\\/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});\\\\/\\//");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hasOne" + "'", str7, "hasOne");
    }

    @Test
    public void test14680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14680");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        java.lang.String str2 = hasOneAssociation1.getName();
        hasOneAssociation1.setInstanceName("");
        hasOneAssociation1.setName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        hasOneAssociation1.setGetterName("belongsTo");
        hasOneAssociation1.setForeignKey("Ext.define(\"null\",{extend:\"Ext.data.Model\",idProperty:\"hi!\",fields:[],proxy:{type:\"direct\",idParam:\"hi!\"}});");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test14681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14681");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getChild();
        java.lang.String str3 = referenceBean0.getAssociation();
        boolean boolean4 = referenceBean0.typeOnly();
        java.lang.String str5 = referenceBean0.getInverse();
        boolean boolean6 = referenceBean0.typeOnly();
        referenceBean0.setInverse("Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});");
        referenceBean0.setChild("Ext.define(\"ch.rasc.extclassgenerator.validation.InclusionValidation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"list\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"field\",\n    type : \"string\"\n  } ]\n});");
        boolean boolean11 = referenceBean0.typeOnly();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test14682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14682");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("inclusion");
        java.lang.String str2 = hasManyAssociation1.getForeignKey();
        hasManyAssociation1.setAutoLoad((java.lang.Boolean) true);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test14683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14683");
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
        java.lang.Boolean boolean29 = modelFieldBean2.getUnique();
        java.util.List<java.lang.String> strList30 = modelFieldBean2.getDepends();
        java.lang.String str31 = modelFieldBean2.getType();
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
        org.junit.Assert.assertNull(boolean29);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str31, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
    }

    @Test
    public void test14684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14684");
        ch.rasc.extclassgenerator.validation.InclusionValidation inclusionValidation2 = new ch.rasc.extclassgenerator.validation.InclusionValidation("", "");
        java.lang.String str3 = inclusionValidation2.getList();
        java.lang.String str4 = inclusionValidation2.getList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test14685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14685");
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
        java.lang.String str19 = modelFieldBean2.getCalculate();
        java.lang.String str20 = modelFieldBean2.getConvert();
        modelFieldBean2.setConvert("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
        java.lang.Object obj23 = null;
        modelFieldBean2.setDefaultValue(obj23);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test14686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14686");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.data.Model");
        modelFieldBean2.setAllowNull((java.lang.Boolean) false);
        java.lang.String str5 = modelFieldBean2.getName();
        modelFieldBean2.setDateFormat("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        modelFieldBean2.setUnique((java.lang.Boolean) false);
        java.util.List<java.lang.String> strList10 = modelFieldBean2.getDepends();
        modelFieldBean2.setMapping("/Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});/");
        java.lang.Boolean boolean13 = modelFieldBean2.getAllowNull();
        java.lang.String str14 = modelFieldBean2.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(strList10);
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + false + "'", boolean13, false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Ext.data.Model" + "'", str14, "Ext.data.Model");
    }

    @Test
    public void test14687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14687");
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
        java.lang.Boolean boolean17 = hasManyAssociation8.getAutoLoad();
        hasManyAssociation8.setName("Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[],proxy:{type:\"direct\",directFn:hi!,writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",config:{fields:[]}});\"}}}});");
        hasManyAssociation8.setAssociationKey("Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"debug\",\n    type : \"boolean\"\n  }, {\n    name : \"useSingleQuotes\",\n    type : \"boolean\"\n  }, {\n    name : \"surroundApiWithQuotes\",\n    type : \"boolean\"\n  } ]\n});");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(boolean17);
    }

    @Test
    public void test14688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14688");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        referenceBean0.setType("");
        java.lang.String str3 = referenceBean0.getAssociation();
        referenceBean0.setInverse("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        java.lang.String str6 = referenceBean0.getType();
        java.lang.String str7 = referenceBean0.getChild();
        referenceBean0.setParent("ch.rasc.extclassgenerator.ModelAnnotationProcessor");
        java.lang.String str10 = referenceBean0.getType();
        boolean boolean11 = referenceBean0.typeOnly();
        referenceBean0.setRole("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
        referenceBean0.setInverse("range");
        referenceBean0.setParent("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
        java.lang.String str18 = referenceBean0.getParent();
        java.lang.String str19 = referenceBean0.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});" + "'", str18, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test14689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14689");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        java.lang.String str1 = apiObject0.update;
        apiObject0.update = "";
        apiObject0.read = "";
        apiObject0.create = "/Ext.define(\"ch.rasc.extclassgenerator.validation.CreditCardNumberValidation\",{extend:\"Ext.data.Model\",fields:[{name:\"type\",type:\"string\"},{name:\"field\",type:\"string\"}]});/";
        java.lang.String str8 = apiObject0.read;
        java.lang.String str9 = apiObject0.update;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test14690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14690");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.destroy = "";
        apiObject0.destroy = "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/";
        java.lang.String str5 = apiObject0.read;
        apiObject0.update = "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/";
        apiObject0.read = "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/";
        apiObject0.destroy = "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]}});";
        apiObject0.update = "/Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",{extend:\"Ext.data.Model\",fields:[{name:\"debug\",type:\"boolean\"},{name:\"useSingleQuotes\",type:\"boolean\"},{name:\"surroundApiWithQuotes\",type:\"boolean\"}]});/";
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test14691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14691");
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
        ch.rasc.extclassgenerator.ModelBean modelBean14 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean14.setDisablePagingParameters(false);
        java.lang.String str17 = modelBean14.getName();
        boolean boolean18 = modelBean14.isAutodetectTypes();
        modelFieldBean2.setDefaultValue((java.lang.Object) modelBean14);
        java.util.List<ch.rasc.extclassgenerator.validation.AbstractValidation> abstractValidationList20 = modelBean14.getValidations();
        modelBean14.setUpdateMethod("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});");
        modelBean14.setWriteAllFields((java.lang.Boolean) false);
        boolean boolean25 = modelBean14.isClientIdPropertyAddToWriter();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(abstractValidationList20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test14692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14692");
        ch.rasc.extclassgenerator.validation.CreditCardNumberValidation creditCardNumberValidation1 = new ch.rasc.extclassgenerator.validation.CreditCardNumberValidation("/\\/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});\\//");
    }

    @Test
    public void test14693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14693");
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
        apiObject0.read = "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});";
        apiObject0.destroy = "/Ext.define(\"ch.rasc.extclassgenerator.validation.PresenceValidation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"field\",\n    type : \"string\"\n  } ]\n});/";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "json" + "'", str10, "json");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/" + "'", str12, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});" + "'", str17, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "json" + "'", str18, "json");
    }

    @Test
    public void test14694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14694");
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
        ch.rasc.extclassgenerator.PartialDataOptionsBean partialDataOptionsBean22 = modelBean0.getPartialDataOptions();
        modelBean0.setAutodetectTypes(false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(partialDataOptionsBean22);
    }

    @Test
    public void test14695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14695");
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
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable13 = modelAnnotationProcessor0.getCompletions(element9, annotationMirror10, executableElement11, "notBlank");
        javax.lang.model.SourceVersion sourceVersion14 = modelAnnotationProcessor0.getSupportedSourceVersion();
        java.util.Set<java.lang.String> strSet15 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(wildcardIterable7);
        org.junit.Assert.assertTrue("'" + sourceVersion8 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion8.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(wildcardIterable13);
        org.junit.Assert.assertTrue("'" + sourceVersion14 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion14.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test14696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14696");
        ch.rasc.extclassgenerator.validation.DigitsValidation digitsValidation3 = new ch.rasc.extclassgenerator.validation.DigitsValidation("Ext.define(\"null\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ],\n    proxy : {\n      type : \"direct\",\n      reader : {\n        successProperty : \"json\"\n      }\n    }\n  }\n});", 32, (int) (short) 10);
    }

    @Test
    public void test14697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14697");
        ch.rasc.extclassgenerator.validation.EmailValidation emailValidation1 = new ch.rasc.extclassgenerator.validation.EmailValidation("/Ext.define(\"null\",\r\n{\n  extend : \"Ext.data.Model\",\n  idgen : \"Ext.define(\\\"null\\\",{extend:\\\"Ext.data.Model\\\",config:{fields:[],proxy:{type:\\\"direct\\\",directFn:hi!,writer:{type:\\\"Ext.define(\\\\\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\\\\\",{extend:\\\\\\\"Ext.data.Model\\\\\\\",config:{fields:[]}});\\\"}}}});\",\n  fields : [ ]\n});/");
    }

    @Test
    public void test14698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14698");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("");
        java.lang.String str2 = hasOneAssociation1.getPrimaryKey();
        java.lang.String str3 = hasOneAssociation1.getName();
        hasOneAssociation1.setGetterName("Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"debug\",\n    type : \"boolean\"\n  }, {\n    name : \"useSingleQuotes\",\n    type : \"boolean\"\n  }, {\n    name : \"surroundApiWithQuotes\",\n    type : \"boolean\"\n  } ]\n});");
        java.lang.String str6 = hasOneAssociation1.getGetterName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"debug\",\n    type : \"boolean\"\n  }, {\n    name : \"useSingleQuotes\",\n    type : \"boolean\"\n  }, {\n    name : \"surroundApiWithQuotes\",\n    type : \"boolean\"\n  } ]\n});" + "'", str6, "Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"debug\",\n    type : \"boolean\"\n  }, {\n    name : \"useSingleQuotes\",\n    type : \"boolean\"\n  }, {\n    name : \"surroundApiWithQuotes\",\n    type : \"boolean\"\n  } ]\n});");
    }

    @Test
    public void test14699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14699");
        ch.rasc.extclassgenerator.validation.DigitsValidation digitsValidation3 = new ch.rasc.extclassgenerator.validation.DigitsValidation("Ext.define(\"ch.rasc.extclassgenerator.LineEnding\",{extend:\"Ext.data.Model\",config:{fields:[]}});", (int) (byte) 0, (int) (short) -1);
        int int4 = digitsValidation3.getInteger();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test14700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14700");
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
        java.lang.String str27 = modelFieldBean2.getConvert();
        modelFieldBean2.setName("/Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});/");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(outputFormat20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test14701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14701");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.read;
        apiObject0.update = "hi!";
        apiObject0.update = "ch.rasc.extclassgenerator.ModelAnnotationProcessor";
        apiObject0.read = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});";
        apiObject0.destroy = "Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});";
        java.lang.String str12 = apiObject0.update;
        java.lang.String str13 = apiObject0.update;
        java.lang.String str14 = apiObject0.update;
        java.lang.String str15 = apiObject0.create;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ch.rasc.extclassgenerator.ModelAnnotationProcessor" + "'", str12, "ch.rasc.extclassgenerator.ModelAnnotationProcessor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ch.rasc.extclassgenerator.ModelAnnotationProcessor" + "'", str13, "ch.rasc.extclassgenerator.ModelAnnotationProcessor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ch.rasc.extclassgenerator.ModelAnnotationProcessor" + "'", str14, "ch.rasc.extclassgenerator.ModelAnnotationProcessor");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test14702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14702");
        ch.rasc.extclassgenerator.ModelType modelType1 = null;
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[],proxy:{type:\"direct\",directFn:hi!,writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",config:{fields:[]}});\"}}}});", modelType1);
        java.lang.Object obj3 = modelFieldBean2.getReference();
        java.lang.Object obj4 = modelFieldBean2.getDefaultValue();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test14703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14703");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.data.Model");
        modelFieldBean2.setConvert("hasOne");
        java.lang.Boolean boolean5 = modelFieldBean2.getAllowNull();
        java.util.List<java.lang.String> strList6 = modelFieldBean2.getDepends();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(strList6);
    }

    @Test
    public void test14704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14704");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});";
        apiObject0.destroy = "belongsTo";
        apiObject0.destroy = "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str10 = apiObject0.create;
        apiObject0.read = "Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});";
        java.lang.String str13 = apiObject0.destroy;
        java.lang.String str14 = apiObject0.create;
        java.lang.String str15 = apiObject0.update;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});" + "'", str10, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str13, "Ext.define(\"null\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});" + "'", str14, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str15, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
    }

    @Test
    public void test14705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14705");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});";
        apiObject0.update = "json";
        java.lang.String str8 = apiObject0.create;
        apiObject0.read = "/\\/\\\\/belongsTo\\\\/\\//";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});" + "'", str8, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
    }

    @Test
    public void test14706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14706");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        modelBean0.setDisablePagingParameters(false);
        modelBean0.setIdProperty("");
        java.lang.String str5 = modelBean0.getIdentifier();
        modelBean0.setDisablePagingParameters(true);
        java.lang.String str8 = modelBean0.getRootProperty();
        java.lang.Boolean boolean9 = modelBean0.getWriteAllFields();
        modelBean0.setAutodetectTypes(true);
        modelBean0.setIdentifier("Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[],proxy:{type:\"direct\",directFn:hi!,writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",config:{fields:[]}});\"}}}});");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean14 = modelBean0.getAllDataOptions();
        modelBean0.setDestroyMethod("range");
        modelBean0.setUpdateMethod("Ext.define(\"ch.rasc.extclassgenerator.association.BelongsToAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"setterName\",\n    type : \"string\"\n  }, {\n    name : \"getterName\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation20 = new ch.rasc.extclassgenerator.association.HasOneAssociation("");
        java.lang.String str21 = hasOneAssociation20.getPrimaryKey();
        hasOneAssociation20.setGetterName("belongsTo");
        java.lang.String str24 = hasOneAssociation20.getInstanceName();
        java.lang.String str25 = hasOneAssociation20.getSetterName();
        java.lang.String str26 = hasOneAssociation20.getGetterName();
        modelBean0.addAssociation((ch.rasc.extclassgenerator.association.AbstractAssociation) hasOneAssociation20);
        java.lang.String str28 = modelBean0.getMessageProperty();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNull(allDataOptionsBean14);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "belongsTo" + "'", str26, "belongsTo");
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test14707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14707");
        ch.rasc.extclassgenerator.validation.ExclusionValidation exclusionValidation2 = new ch.rasc.extclassgenerator.validation.ExclusionValidation("Ext.define(\"ch.rasc.extclassgenerator.association.HasOneAssociation\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"setterName\",type:\"string\"},{name:\"getterName\",type:\"string\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]}});", "/\\/exclusion\\//");
        java.lang.String str3 = exclusionValidation2.getList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/\\/exclusion\\//" + "'", str3, "/\\/exclusion\\//");
    }

    @Test
    public void test14708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14708");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        java.lang.String str2 = referenceBean0.getRole();
        referenceBean0.setChild("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        referenceBean0.setAssociation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        java.lang.String str7 = referenceBean0.getAssociation();
        referenceBean0.setParent("/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/");
        boolean boolean10 = referenceBean0.hasAnyProperties();
        java.lang.String str11 = referenceBean0.getRole();
        referenceBean0.setParent("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]}});");
        java.lang.String str14 = referenceBean0.getAssociation();
        java.lang.String str15 = referenceBean0.getAssociation();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});" + "'", str7, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});" + "'", str14, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});" + "'", str15, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
    }

    @Test
    public void test14709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14709");
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
        java.lang.String str17 = modelBean0.getIdProperty();
        boolean boolean18 = modelBean0.isPaging();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "json" + "'", str16, "json");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test14710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14710");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("Ext.define(\"ch.rasc.extclassgenerator.validation.InclusionValidationArray\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"field\",\n    type : \"string\"\n  } ]\n});", (java.lang.Integer) 52, (java.lang.Integer) (-1));
    }

    @Test
    public void test14711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14711");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});";
        apiObject0.destroy = "belongsTo";
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});";
        java.lang.String str10 = apiObject0.destroy;
        apiObject0.destroy = "";
        java.lang.String str13 = apiObject0.read;
        apiObject0.destroy = "/ch.rasc.extclassgenerator.ModelAnnotationProcessor/";
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ReferenceBean\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"type\",type:\"string\"},{name:\"association\",type:\"string\"},{name:\"child\",type:\"string\"},{name:\"parent\",type:\"string\"},{name:\"role\",type:\"string\"},{name:\"inverse\",type:\"string\"}]}});";
        apiObject0.update = "/belongsTo/";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "belongsTo" + "'", str10, "belongsTo");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test14712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14712");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        java.lang.String str2 = hasOneAssociation1.getSetterName();
        hasOneAssociation1.setPrimaryKey("belongsTo");
        java.lang.String str5 = hasOneAssociation1.getName();
        hasOneAssociation1.setGetterName("/Ext.define(\"java.util.ArrayList\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});/");
        hasOneAssociation1.setGetterName("/hasOne/");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test14713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14713");
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
        java.lang.Object obj30 = modelFieldBean2.getDefaultValue();
        java.lang.Boolean boolean31 = modelFieldBean2.getAllowBlank();
        java.lang.String str32 = modelFieldBean2.getMapping();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(boolean25);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(boolean31);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test14714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14714");
        ch.rasc.extclassgenerator.ModelAnnotationProcessor modelAnnotationProcessor0 = new ch.rasc.extclassgenerator.ModelAnnotationProcessor();
        java.util.Set<java.lang.String> strSet1 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        java.util.Set<java.lang.String> strSet2 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        javax.lang.model.element.Element element3 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror4 = null;
        javax.lang.model.element.ExecutableElement executableElement5 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable7 = modelAnnotationProcessor0.getCompletions(element3, annotationMirror4, executableElement5, "");
        java.util.Set<java.lang.String> strSet8 = modelAnnotationProcessor0.getSupportedOptions();
        java.util.Set<java.lang.String> strSet9 = modelAnnotationProcessor0.getSupportedOptions();
        javax.lang.model.element.Element element10 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror11 = null;
        javax.lang.model.element.ExecutableElement executableElement12 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable14 = modelAnnotationProcessor0.getCompletions(element10, annotationMirror11, executableElement12, "Ext.define(\"ch.rasc.extclassgenerator.LineEnding\",{extend:\"Ext.data.Model\",config:{fields:[]}});");
        java.util.Set<java.lang.String> strSet15 = modelAnnotationProcessor0.getSupportedOptions();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(wildcardIterable7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(wildcardIterable14);
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test14715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14715");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("/Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[],proxy:{type:\"direct\",directFn:hi!,writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",config:{fields:[]}});\"}}}});/");
    }

    @Test
    public void test14716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14716");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.destroy = "";
        apiObject0.destroy = "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/";
        java.lang.String str5 = apiObject0.read;
        java.lang.String str6 = apiObject0.read;
        apiObject0.update = "Ext.define(\"null\",{extend:\"\",config:{fields:[]}});";
        java.lang.String str9 = apiObject0.read;
        apiObject0.create = "/hasMany/";
        apiObject0.read = "ch.rasc.extclassgenerator.ModelAnnotationProcessor";
        java.lang.String str14 = apiObject0.read;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ch.rasc.extclassgenerator.ModelAnnotationProcessor" + "'", str14, "ch.rasc.extclassgenerator.ModelAnnotationProcessor");
    }

    @Test
    public void test14717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14717");
        ch.rasc.extclassgenerator.validation.DigitsValidation digitsValidation3 = new ch.rasc.extclassgenerator.validation.DigitsValidation("/hi!/", (int) (byte) 1, (int) '#');
        int int4 = digitsValidation3.getInteger();
        int int5 = digitsValidation3.getFraction();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test14718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14718");
        ch.rasc.extclassgenerator.validation.InclusionValidation inclusionValidation2 = new ch.rasc.extclassgenerator.validation.InclusionValidation("/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});/", "");
    }

    @Test
    public void test14719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14719");
        ch.rasc.extclassgenerator.validation.DigitsValidation digitsValidation3 = new ch.rasc.extclassgenerator.validation.DigitsValidation("Ext.define(\"ch.rasc.extclassgenerator.LineEnding\",{extend:\"Ext.data.Model\",config:{fields:[]}});", (int) (short) 1, (int) (byte) -1);
        int int4 = digitsValidation3.getFraction();
        int int5 = digitsValidation3.getInteger();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test14720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14720");
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
        modelFieldBean2.setUnique((java.lang.Boolean) false);
        modelFieldBean2.setAllowBlank((java.lang.Boolean) true);
        java.lang.String str25 = modelFieldBean2.getMapping();
        modelFieldBean2.setPersist((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(abstractValidationArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test14721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14721");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("/digits/");
    }

    @Test
    public void test14722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14722");
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
        java.lang.String str18 = apiObject0.destroy;
        java.lang.String str19 = apiObject0.create;
        java.lang.String str20 = apiObject0.read;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "json" + "'", str10, "json");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/" + "'", str12, "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});/");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});" + "'", str17, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});" + "'", str18, "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});" + "'", str19, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});" + "'", str20, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
    }

    @Test
    public void test14723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14723");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("Ext.define(\"ch.rasc.extclassgenerator.validation.CreditCardNumberValidation\",{extend:\"Ext.data.Model\",fields:[{name:\"type\",type:\"string\"},{name:\"field\",type:\"string\"}]});", "Ext.define(\"ch.rasc.extclassgenerator.association.HasOneAssociation\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"setterName\",type:\"string\"},{name:\"getterName\",type:\"string\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]}});");
    }

    @Test
    public void test14724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14724");
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
        modelFieldBean2.setUnique((java.lang.Boolean) false);
        java.lang.String str60 = modelFieldBean2.getDateFormat();
        modelFieldBean2.setName("presence");
        java.lang.Boolean boolean63 = modelFieldBean2.getUnique();
        ch.rasc.extclassgenerator.ModelType modelType64 = modelFieldBean2.getModelType();
        modelFieldBean2.setName("");
        modelFieldBean2.setConvert("ch.rasc.extclassgenerator.OutputConfig");
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
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertEquals("'" + boolean63 + "' != '" + false + "'", boolean63, false);
        org.junit.Assert.assertNull(modelType64);
    }

    @Test
    public void test14725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14725");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean4 = allDataOptionsBean0.getCritical();
        java.lang.Boolean boolean5 = allDataOptionsBean0.getPersist();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        allDataOptionsBean0.setChanges((java.lang.Boolean) true);
        allDataOptionsBean0.setChanges((java.lang.Boolean) false);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNull(boolean5);
    }

    @Test
    public void test14726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14726");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        ch.rasc.extclassgenerator.validation.GenericValidation genericValidation3 = new ch.rasc.extclassgenerator.validation.GenericValidation("Ext.define(\"ch.rasc.extclassgenerator.association.HasOneAssociation\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"setterName\",type:\"string\"},{name:\"getterName\",type:\"string\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]}});", "/\\/range\\//", strMap2);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = genericValidation3.getOptions();
        org.junit.Assert.assertNull(strMap4);
    }

    @Test
    public void test14727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14727");
        ch.rasc.extclassgenerator.validation.InclusionValidation inclusionValidation2 = new ch.rasc.extclassgenerator.validation.InclusionValidation("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});", "length");
        java.lang.String str3 = inclusionValidation2.getList();
        java.lang.String str4 = inclusionValidation2.getList();
        java.lang.String str5 = inclusionValidation2.getList();
        java.lang.String str6 = inclusionValidation2.getList();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "length" + "'", str3, "length");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "length" + "'", str4, "length");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "length" + "'", str5, "length");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "length" + "'", str6, "length");
    }

    @Test
    public void test14728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14728");
        ch.rasc.extclassgenerator.validation.RangeValidation rangeValidation3 = new ch.rasc.extclassgenerator.validation.RangeValidation("Ext.define(\"ch.rasc.extclassgenerator.OutputConfig\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ {\n      name : \"debug\",\n      type : \"boolean\"\n    }, {\n      name : \"useSingleQuotes\",\n      type : \"boolean\"\n    }, {\n      name : \"surroundApiWithQuotes\",\n      type : \"boolean\"\n    } ]\n  }\n});", (java.lang.Long) 0L, (java.lang.Long) 32L);
        java.math.BigDecimal bigDecimal4 = rangeValidation3.getMin();
        java.math.BigDecimal bigDecimal5 = rangeValidation3.getMax();
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
    }

    @Test
    public void test14729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14729");
        ch.rasc.extclassgenerator.ModelAnnotationProcessor modelAnnotationProcessor0 = new ch.rasc.extclassgenerator.ModelAnnotationProcessor();
        java.util.Set<java.lang.String> strSet1 = modelAnnotationProcessor0.getSupportedOptions();
        java.util.Set<java.lang.String> strSet2 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        javax.lang.model.element.Element element3 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror4 = null;
        javax.lang.model.element.ExecutableElement executableElement5 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable7 = modelAnnotationProcessor0.getCompletions(element3, annotationMirror4, executableElement5, "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]}});");
        java.util.Set<java.lang.String> strSet8 = modelAnnotationProcessor0.getSupportedOptions();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(wildcardIterable7);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test14730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14730");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});", (java.lang.Integer) 1, (java.lang.Integer) 52);
        java.lang.String str4 = lengthValidation3.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "length" + "'", str4, "length");
    }

    @Test
    public void test14731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14731");
        ch.rasc.extclassgenerator.ModelBean modelBean0 = new ch.rasc.extclassgenerator.ModelBean();
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation4 = new ch.rasc.extclassgenerator.validation.LengthValidation("belongsTo", (java.lang.Integer) 100, (java.lang.Integer) 0);
        modelBean0.addValidation((ch.rasc.extclassgenerator.validation.AbstractValidation) lengthValidation4);
        java.lang.String str6 = modelBean0.getReader();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "json" + "'", str6, "json");
    }

    @Test
    public void test14732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14732");
        ch.rasc.extclassgenerator.OutputConfig outputConfig0 = new ch.rasc.extclassgenerator.OutputConfig();
        boolean boolean1 = outputConfig0.isSurroundApiWithQuotes();
        boolean boolean2 = outputConfig0.isSurroundApiWithQuotes();
        outputConfig0.setSurroundApiWithQuotes(true);
        outputConfig0.setSurroundApiWithQuotes(true);
        ch.rasc.extclassgenerator.IncludeValidation includeValidation7 = outputConfig0.getIncludeValidation();
        outputConfig0.setSurroundApiWithQuotes(false);
        outputConfig0.setDebug(true);
        boolean boolean12 = outputConfig0.isSurroundApiWithQuotes();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(includeValidation7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test14733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14733");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        boolean boolean4 = allDataOptionsBean0.hasAnyProperties();
        allDataOptionsBean0.setCritical((java.lang.Boolean) true);
        boolean boolean7 = allDataOptionsBean0.hasAnyProperties();
        allDataOptionsBean0.setChanges((java.lang.Boolean) false);
        java.lang.Boolean boolean10 = allDataOptionsBean0.getCritical();
        java.lang.Boolean boolean11 = allDataOptionsBean0.getChanges();
        java.lang.Boolean boolean12 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean13 = allDataOptionsBean0.getPersist();
        allDataOptionsBean0.setChanges((java.lang.Boolean) false);
        boolean boolean16 = allDataOptionsBean0.hasAnyProperties();
        java.lang.Boolean boolean17 = allDataOptionsBean0.getPersist();
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + false + "'", boolean11, false);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + false + "'", boolean12, false);
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(boolean17);
    }

    @Test
    public void test14734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14734");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str2 = belongsToAssociation1.getSetterName();
        belongsToAssociation1.setAssociationKey("belongsTo");
        java.lang.String str5 = belongsToAssociation1.getGetterName();
        java.lang.String str6 = belongsToAssociation1.getForeignKey();
        java.lang.String str7 = belongsToAssociation1.getPrimaryKey();
        belongsToAssociation1.setForeignKey("Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});");
        java.lang.String str10 = belongsToAssociation1.getAssociationKey();
        java.lang.String str11 = belongsToAssociation1.getForeignKey();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "belongsTo" + "'", str10, "belongsTo");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});" + "'", str11, "Ext.define(\"ch.rasc.extclassgenerator.ModelBean\",{extend:\"Ext.data.Model\",fields:[{name:\"autodetectTypes\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"extend\",type:\"string\"},{name:\"idProperty\",type:\"string\"},{name:\"versionProperty\",type:\"string\"},{name:\"clientIdProperty\",type:\"string\"},{name:\"clientIdPropertyAddToWriter\",type:\"boolean\"},{name:\"paging\",type:\"boolean\"},{name:\"disablePagingParameters\",type:\"boolean\"},{name:\"readMethod\",type:\"string\"},{name:\"createMethod\",type:\"string\"},{name:\"updateMethod\",type:\"string\"},{name:\"destroyMethod\",type:\"string\"},{name:\"messageProperty\",type:\"string\"},{name:\"successProperty\",type:\"string\"},{name:\"totalProperty\",type:\"string\"},{name:\"rootProperty\",type:\"string\"},{name:\"writer\",type:\"string\"},{name:\"reader\",type:\"string\"},{name:\"writeAllFields\",type:\"boolean\"},{name:\"identifier\",type:\"string\"}]});");
    }

    @Test
    public void test14735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14735");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.data.Model");
        java.lang.Boolean boolean3 = modelFieldBean2.getAllowBlank();
        modelFieldBean2.setUseNull((java.lang.Boolean) false);
        java.lang.String str6 = modelFieldBean2.getConvert();
        modelFieldBean2.setAllowBlank((java.lang.Boolean) true);
        java.lang.Object obj9 = modelFieldBean2.getDefaultValue();
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test14736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14736");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("hi!");
        hasManyAssociation1.setAssociationKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        hasManyAssociation1.setName("belongsTo");
        hasManyAssociation1.setPrimaryKey("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
        hasManyAssociation1.setAutoLoad((java.lang.Boolean) true);
        java.lang.String str10 = hasManyAssociation1.getPrimaryKey();
        hasManyAssociation1.setName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});");
        hasManyAssociation1.setName("/\\/ch.rasc.extclassgenerator.ModelAnnotationProcessor\\//");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});" + "'", str10, "Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"autoLoad\",\n    type : \"boolean\"\n  }, {\n    name : \"name\",\n    type : \"string\"\n  }, {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"model\",\n    type : \"string\"\n  }, {\n    name : \"associationKey\",\n    type : \"string\"\n  }, {\n    name : \"foreignKey\",\n    type : \"string\"\n  }, {\n    name : \"primaryKey\",\n    type : \"string\"\n  }, {\n    name : \"instanceName\",\n    type : \"string\"\n  } ]\n});");
    }

    @Test
    public void test14737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14737");
        ch.rasc.extclassgenerator.OutputConfig outputConfig0 = new ch.rasc.extclassgenerator.OutputConfig();
        boolean boolean1 = outputConfig0.isDebug();
        ch.rasc.extclassgenerator.OutputFormat outputFormat2 = outputConfig0.getOutputFormat();
        boolean boolean3 = outputConfig0.isDebug();
        ch.rasc.extclassgenerator.IncludeValidation includeValidation4 = outputConfig0.getIncludeValidation();
        ch.rasc.extclassgenerator.validation.DigitsValidation digitsValidation8 = new ch.rasc.extclassgenerator.validation.DigitsValidation("json", (int) (byte) 0, (int) (byte) 0);
        int int9 = digitsValidation8.getFraction();
        java.lang.String str10 = digitsValidation8.getField();
        int int11 = digitsValidation8.getFraction();
        int int12 = digitsValidation8.getInteger();
        boolean boolean13 = outputConfig0.equals((java.lang.Object) digitsValidation8);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(outputFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(includeValidation4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "json" + "'", str10, "json");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test14738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14738");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean4 = allDataOptionsBean0.getPersist();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        allDataOptionsBean0.setPersist((java.lang.Boolean) false);
        boolean boolean9 = allDataOptionsBean0.hasAnyProperties();
        java.lang.Boolean boolean10 = allDataOptionsBean0.getAssociated();
        allDataOptionsBean0.setChanges((java.lang.Boolean) true);
        boolean boolean13 = allDataOptionsBean0.hasAnyProperties();
        java.lang.Boolean boolean14 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean15 = allDataOptionsBean0.getChanges();
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + false + "'", boolean10, false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + boolean14 + "' != '" + false + "'", boolean14, false);
        org.junit.Assert.assertEquals("'" + boolean15 + "' != '" + true + "'", boolean15, true);
    }

    @Test
    public void test14739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14739");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.read;
        apiObject0.update = "hi!";
        apiObject0.update = "ch.rasc.extclassgenerator.ModelAnnotationProcessor";
        apiObject0.destroy = "/Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});/";
        java.lang.String str10 = apiObject0.update;
        java.lang.String str11 = apiObject0.create;
        apiObject0.create = "/\\/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});\\//";
        java.lang.String str14 = apiObject0.read;
        apiObject0.read = "Ext.define(\"null\",\r\n{\n  extend : \"\",\n  config : {\n    fields : [ ],\n    proxy : {\n      type : \"direct\",\n      api : {\n        create : Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});\n      },\n      reader : {\n        messageProperty : \"hi!\"\n      }\n    }\n  }\n});";
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ch.rasc.extclassgenerator.ModelAnnotationProcessor" + "'", str10, "ch.rasc.extclassgenerator.ModelAnnotationProcessor");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test14740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14740");
        ch.rasc.extclassgenerator.ApiObject apiObject0 = new ch.rasc.extclassgenerator.ApiObject();
        apiObject0.update = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        java.lang.String str3 = apiObject0.update;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.read = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});";
        apiObject0.update = "";
        apiObject0.create = "digits";
        apiObject0.read = "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});";
        apiObject0.create = "/Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",uses:[\"hi!\"],config:{fields:[{name:\"hi!\",type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}],associations:[{type:\"hasMany\",model:\"hi!\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",associationKey:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"},{type:\"hasMany\",model:\"hi!\",foreignKey:\"\"}],proxy:{type:\"direct\",api:{destroy:Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});},reader:{type:\"hi!\"},writer:{type:\"Ext.define(\\\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\\\",{extend:\\\"Ext.data.Model\\\",fields:[]});\"}}}});/";
        java.lang.String str16 = apiObject0.read;
        apiObject0.create = "Ext.define(\"ch.rasc.extclassgenerator.association.HasOneAssociation\",{extend:\"Ext.data.Model\",fields:[{name:\"setterName\",type:\"string\"},{name:\"getterName\",type:\"string\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]});";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});" + "'", str3, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});" + "'", str16, "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
    }

    @Test
    public void test14741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14741");
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
        ch.rasc.extclassgenerator.ModelType modelType26 = modelFieldBean2.getModelType();
        modelFieldBean2.setCritical((java.lang.Boolean) true);
        java.lang.Boolean boolean29 = modelFieldBean2.getUseNull();
        modelFieldBean2.setCritical((java.lang.Boolean) true);
        modelFieldBean2.setAllowNull((java.lang.Boolean) false);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(modelType26);
        org.junit.Assert.assertNull(boolean29);
    }

    @Test
    public void test14742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14742");
        ch.rasc.extclassgenerator.validation.LengthValidation lengthValidation3 = new ch.rasc.extclassgenerator.validation.LengthValidation("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ {\n      name : \"autoLoad\",\n      type : \"boolean\"\n    }, {\n      name : \"name\",\n      type : \"string\"\n    }, {\n      name : \"type\",\n      type : \"string\"\n    }, {\n      name : \"model\",\n      type : \"string\"\n    }, {\n      name : \"associationKey\",\n      type : \"string\"\n    }, {\n      name : \"foreignKey\",\n      type : \"string\"\n    }, {\n      name : \"primaryKey\",\n      type : \"string\"\n    }, {\n      name : \"instanceName\",\n      type : \"string\"\n    } ]\n  }\n});", (java.lang.Long) 35L, (java.lang.Long) 0L);
    }

    @Test
    public void test14743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14743");
        ch.rasc.extclassgenerator.association.HasManyAssociation hasManyAssociation1 = new ch.rasc.extclassgenerator.association.HasManyAssociation("/\\/ch.rasc.extclassgenerator.ModelAnnotationProcessor\\//");
        hasManyAssociation1.setPrimaryKey("Ext.define(\"ch.rasc.extclassgenerator.AllDataOptionsBean\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]}});");
    }

    @Test
    public void test14744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14744");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        java.lang.String str6 = referenceBean0.getAssociation();
        referenceBean0.setInverse("");
        referenceBean0.setType("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        referenceBean0.setParent("Ext.define(\"null\",{extend:\"\",config:{fields:[]}});");
        referenceBean0.setParent("");
        java.lang.String str15 = referenceBean0.getParent();
        java.lang.String str16 = referenceBean0.getChild();
        referenceBean0.setInverse("Ext.define(\"ch.rasc.extclassgenerator.validation.PresenceValidation\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ {\n    name : \"type\",\n    type : \"string\"\n  }, {\n    name : \"field\",\n    type : \"string\"\n  } ]\n});");
        java.lang.String str19 = referenceBean0.getParent();
        referenceBean0.setType("Ext.define(\"ch.rasc.extclassgenerator.AllDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test14745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14745");
        ch.rasc.extclassgenerator.validation.DigitsValidation digitsValidation3 = new ch.rasc.extclassgenerator.validation.DigitsValidation("Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});", (int) (short) 100, 97);
        int int4 = digitsValidation3.getFraction();
        int int5 = digitsValidation3.getInteger();
        int int6 = digitsValidation3.getFraction();
        int int7 = digitsValidation3.getInteger();
        java.lang.String str8 = digitsValidation3.getField();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});" + "'", str8, "Ext.define(\"ch.rasc.extclassgenerator.PartialDataOptionsBean\",{extend:\"Ext.data.Model\",fields:[{name:\"associated\",type:\"boolean\"},{name:\"changes\",type:\"boolean\"},{name:\"critical\",type:\"boolean\"},{name:\"persist\",type:\"boolean\"}]});");
    }

    @Test
    public void test14746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14746");
        ch.rasc.extclassgenerator.association.BelongsToAssociation belongsToAssociation1 = new ch.rasc.extclassgenerator.association.BelongsToAssociation("");
        java.lang.String str2 = belongsToAssociation1.getGetterName();
        belongsToAssociation1.setAssociationKey("Ext.define(\"ch.rasc.extclassgenerator.association.HasManyAssociation\",{extend:\"Ext.data.Model\",config:{fields:[{name:\"autoLoad\",type:\"boolean\"},{name:\"name\",type:\"string\"},{name:\"type\",type:\"string\"},{name:\"model\",type:\"string\"},{name:\"associationKey\",type:\"string\"},{name:\"foreignKey\",type:\"string\"},{name:\"primaryKey\",type:\"string\"},{name:\"instanceName\",type:\"string\"}]}});");
        belongsToAssociation1.setAssociationKey("past");
        belongsToAssociation1.setSetterName("belongsTo");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test14747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14747");
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
        java.util.Set<java.lang.String> strSet12 = modelAnnotationProcessor0.getSupportedAnnotationTypes();
        javax.lang.model.element.Element element13 = null;
        javax.lang.model.element.AnnotationMirror annotationMirror14 = null;
        javax.lang.model.element.ExecutableElement executableElement15 = null;
        java.lang.Iterable<? extends javax.annotation.processing.Completion> wildcardIterable17 = modelAnnotationProcessor0.getCompletions(element13, annotationMirror14, executableElement15, "Ext.define(\"null\",\r\n{\n  extend : \"\",\n  config : {\n    fields : [ ],\n    proxy : {\n      type : \"direct\",\n      api : {\n        create : Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",config:{fields:[]}});\n      },\n      reader : {\n        messageProperty : \"hi!\"\n      }\n    }\n  }\n});");
        java.util.Set<java.lang.String> strSet18 = modelAnnotationProcessor0.getSupportedOptions();
        java.util.Set<java.lang.String> strSet19 = modelAnnotationProcessor0.getSupportedOptions();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + sourceVersion5 + "' != '" + javax.lang.model.SourceVersion.RELEASE_6 + "'", sourceVersion5.equals(javax.lang.model.SourceVersion.RELEASE_6));
        org.junit.Assert.assertNotNull(wildcardIterable10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(wildcardIterable17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(strSet19);
    }

    @Test
    public void test14748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14748");
        ch.rasc.extclassgenerator.validation.DigitsValidation digitsValidation3 = new ch.rasc.extclassgenerator.validation.DigitsValidation("/Ext.define(\"null\",{extend:\"Ext.data.Model\",config:{fields:[]}});/", 100, (int) '#');
        int int4 = digitsValidation3.getFraction();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test14749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14749");
        ch.rasc.extclassgenerator.ModelFieldBean modelFieldBean2 = new ch.rasc.extclassgenerator.ModelFieldBean("hi!", "Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        modelFieldBean2.setConvert("hi!");
        modelFieldBean2.setMapping("hi!");
        modelFieldBean2.setCritical((java.lang.Boolean) false);
        java.lang.Object obj9 = modelFieldBean2.getDefaultValue();
        java.lang.String str10 = modelFieldBean2.getMapping();
        java.lang.String str11 = modelFieldBean2.getMapping();
        modelFieldBean2.setCritical((java.lang.Boolean) false);
        java.lang.String str14 = modelFieldBean2.getConvert();
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test14750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14750");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = allDataOptionsBean0.getAssociated();
        java.lang.Boolean boolean4 = allDataOptionsBean0.getPersist();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) false);
        allDataOptionsBean0.setPersist((java.lang.Boolean) false);
        boolean boolean9 = allDataOptionsBean0.hasAnyProperties();
        allDataOptionsBean0.setChanges((java.lang.Boolean) false);
        allDataOptionsBean0.setChanges((java.lang.Boolean) true);
        java.lang.Boolean boolean14 = allDataOptionsBean0.getChanges();
        allDataOptionsBean0.setAssociated((java.lang.Boolean) true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + boolean14 + "' != '" + true + "'", boolean14, true);
    }

    @Test
    public void test14751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14751");
        ch.rasc.extclassgenerator.ReferenceBean referenceBean0 = new ch.rasc.extclassgenerator.ReferenceBean();
        boolean boolean1 = referenceBean0.typeOnly();
        referenceBean0.setChild("");
        referenceBean0.setAssociation("");
        referenceBean0.setAssociation("Ext.define(\"null\",{extend:\"\",config:{fields:[]}});");
        referenceBean0.setRole("json");
        referenceBean0.setParent("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        java.lang.String str12 = referenceBean0.getType();
        java.lang.String str13 = referenceBean0.getAssociation();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Ext.define(\"null\",{extend:\"\",config:{fields:[]}});" + "'", str13, "Ext.define(\"null\",{extend:\"\",config:{fields:[]}});");
    }

    @Test
    public void test14752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14752");
        ch.rasc.extclassgenerator.AllDataOptionsBean allDataOptionsBean0 = new ch.rasc.extclassgenerator.AllDataOptionsBean();
        java.lang.Boolean boolean1 = allDataOptionsBean0.getPersist();
        java.lang.Boolean boolean2 = allDataOptionsBean0.getPersist();
        allDataOptionsBean0.setChanges((java.lang.Boolean) false);
        java.lang.Boolean boolean5 = allDataOptionsBean0.getPersist();
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNull(boolean5);
    }

    @Test
    public void test14753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14753");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("format");
        java.lang.String str2 = hasOneAssociation1.getAssociationKey();
        java.lang.String str3 = hasOneAssociation1.getModel();
        java.lang.String str4 = hasOneAssociation1.getForeignKey();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "format" + "'", str3, "format");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test14754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14754");
        ch.rasc.extclassgenerator.association.HasOneAssociation hasOneAssociation1 = new ch.rasc.extclassgenerator.association.HasOneAssociation("hi!");
        java.lang.String str2 = hasOneAssociation1.getName();
        java.lang.String str3 = hasOneAssociation1.getGetterName();
        hasOneAssociation1.setPrimaryKey("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",{extend:\"Ext.data.Model\",fields:[]});");
        java.lang.String str6 = hasOneAssociation1.getName();
        hasOneAssociation1.setSetterName("json");
        java.lang.String str9 = hasOneAssociation1.getAssociationKey();
        hasOneAssociation1.setName("Ext.define(\"ch.rasc.extclassgenerator.ModelAnnotationProcessor\",\r\n{\n  extend : \"Ext.data.Model\",\n  fields : [ ]\n});");
        java.lang.String str12 = hasOneAssociation1.getGetterName();
        hasOneAssociation1.setGetterName("/ch.rasc.extclassgenerator.PartialDataOptionsBean/");
        hasOneAssociation1.setSetterName("Ext.define(\"java.util.Collections$EmptyList\",\r\n{\n  extend : \"Ext.data.Model\",\n  config : {\n    fields : [ ]\n  }\n});");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test14755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14755");
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
        java.lang.String str33 = modelFieldBean2.getConvert();
        modelFieldBean2.setPersist((java.lang.Boolean) true);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }
}

