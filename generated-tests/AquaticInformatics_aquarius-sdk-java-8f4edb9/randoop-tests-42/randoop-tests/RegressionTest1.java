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
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation observation0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PlannedFieldResult plannedFieldResult1 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation observation2 = observation0.setPlannedFieldResult(plannedFieldResult1);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabInstruction labInstruction3 = null;
        observation2.LabInstruction = labInstruction3;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservationStatistics observationStatistics5 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation observation6 = observation2.setStatistics(observationStatistics5);
        java.time.OffsetDateTime offsetDateTime7 = observation6.getResultTime();
        java.time.OffsetDateTime offsetDateTime8 = null;
        observation6.ObservedTime = offsetDateTime8;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation observation11 = observation6.setComment("yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ResultGrade resultGrade12 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ResultGrade();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ResultGrade resultGrade14 = resultGrade12.setCustomId("");
        observation6.ResultGrade = resultGrade14;
        java.lang.String str16 = observation6.Id;
        org.junit.Assert.assertNotNull(observation2);
        org.junit.Assert.assertNotNull(observation6);
        org.junit.Assert.assertNull(offsetDateTime7);
        org.junit.Assert.assertNotNull(observation11);
        org.junit.Assert.assertNotNull(resultGrade14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test00502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00502");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ExtendedAttributeFilter extendedAttributeFilter0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ExtendedAttributeFilter();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ExtendedAttributeFilter extendedAttributeFilter2 = extendedAttributeFilter0.setFilterValue("/AQUARIUS/Acquisition/v2");
        extendedAttributeFilter2.FilterName = "ZZZZZ";
        org.junit.Assert.assertNotNull(extendedAttributeFilter2);
    }

    @Test
    public void test00503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00503");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItem importItem0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItem();
        java.lang.Object obj1 = importItem0.Errors;
        org.junit.Assert.assertNull(obj1);
    }

    @Test
    public void test00504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00504");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SearchResultLabReportImportHistoryEvent searchResultLabReportImportHistoryEvent0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SearchResultLabReportImportHistoryEvent();
        java.lang.Integer int1 = searchResultLabReportImportHistoryEvent0.getTotalCount();
        java.lang.Integer int2 = searchResultLabReportImportHistoryEvent0.getTotalCount();
        searchResultLabReportImportHistoryEvent0.TotalCount = 0;
        java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabReportImportHistoryEvent> labReportImportHistoryEventList5 = searchResultLabReportImportHistoryEvent0.getDomainObjects();
        java.lang.String str6 = searchResultLabReportImportHistoryEvent0.getCursor();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(labReportImportHistoryEventList5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00505");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ChartData chartData0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ChartData();
        java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ChartDataPoint> chartDataPointList1 = chartData0.DataPoints;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.UnitGroupWithUnits unitGroupWithUnits2 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ChartData chartData3 = chartData0.setDepthUnitGroupWithUnits(unitGroupWithUnits2);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingLocation samplingLocation4 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ChartData chartData5 = chartData3.setSamplingLocation(samplingLocation4);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.UnitGroupWithUnits unitGroupWithUnits6 = null;
        chartData5.UnitGroupWithUnits = unitGroupWithUnits6;
        org.junit.Assert.assertNull(chartDataPointList1);
        org.junit.Assert.assertNotNull(chartData3);
        org.junit.Assert.assertNotNull(chartData5);
    }

    @Test
    public void test00506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00506");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ExtendedAttributeField extendedAttributeField0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ExtendedAttributeField();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ExtendedAttributeField extendedAttributeField2 = extendedAttributeField0.setDisplayName("");
        java.lang.Boolean boolean3 = extendedAttributeField2.CanBeEmpty;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest timeAlignedDataServiceRequest4 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest();
        java.lang.Object obj5 = timeAlignedDataServiceRequest4.getResponseType();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_6 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray9 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_12 = getObservationsV2_6.setDataClassifications((java.util.List<java.lang.String>) strList10);
        getObservationsV2_12.DepthUnitCustomId = "hi!";
        java.lang.String str15 = getObservationsV2_12.CustomId;
        java.util.List<java.lang.String> strList16 = getObservationsV2_12.getSearch();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_17 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        getObservationsV2_17.SpecimenIds = strList20;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags23 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray27 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags30 = putLocationTags23.setTagUniqueIds(strList28);
        getObservationsV2_17.QualityControlTypes = strList28;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_32 = getObservationsV2_12.setMedia((java.util.List<java.lang.String>) strList28);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_33 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String str34 = getObservationsV2_33.getCustomId();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_35 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        getObservationsV2_35.SpecimenIds = strList38;
        getObservationsV2_33.ProjectIds = strList38;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_42 = getObservationsV2_12.setObservedPropertyIds((java.util.List<java.lang.String>) strList38);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest timeAlignedDataServiceRequest43 = timeAlignedDataServiceRequest4.setTimeSeriesOutputUnitIds(strList38);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ExtendedAttributeField extendedAttributeField44 = extendedAttributeField2.setValueOptions((java.util.List<java.lang.String>) strList38);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ExtendedAttributeField extendedAttributeField46 = extendedAttributeField44.setIsReadOnly((java.lang.Boolean) false);
        java.lang.String str47 = extendedAttributeField44.getNumericType();
        org.junit.Assert.assertNotNull(extendedAttributeField2);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeAlignedDataServiceResponse");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeAlignedDataServiceResponse");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeAlignedDataServiceResponse");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(getObservationsV2_12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(strList16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(putLocationTags30);
        org.junit.Assert.assertNotNull(getObservationsV2_32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(getObservationsV2_42);
        org.junit.Assert.assertNotNull(timeAlignedDataServiceRequest43);
        org.junit.Assert.assertNotNull(extendedAttributeField44);
        org.junit.Assert.assertNotNull(extendedAttributeField46);
        org.junit.Assert.assertNull(str47);
    }

    @Test
    public void test00507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00507");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.StatisticalDateTimeOffset statisticalDateTimeOffset0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.StatisticalDateTimeOffset();
        java.lang.Boolean boolean1 = statisticalDateTimeOffset0.RepresentsEndOfTimePeriod;
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test00508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00508");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeasurementDirection measurementDirection0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeasurementDirection.FromTopToBottom;
        org.junit.Assert.assertTrue("'" + measurementDirection0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeasurementDirection.FromTopToBottom + "'", measurementDirection0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeasurementDirection.FromTopToBottom));
    }

    @Test
    public void test00509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00509");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CompletedWork completedWork0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CompletedWork();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CompletedWork completedWork2 = completedWork0.setGroundWaterLevelPerformed((java.lang.Boolean) false);
        completedWork0.SafetyInspectionPerformed = true;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CompletedWork completedWork6 = completedWork0.setSafetyInspectionPerformed((java.lang.Boolean) true);
        completedWork6.SafetyInspectionPerformed = true;
        java.lang.Boolean boolean9 = completedWork6.GroundWaterLevelPerformed;
        org.junit.Assert.assertNotNull(completedWork2);
        org.junit.Assert.assertNotNull(completedWork6);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + false + "'", boolean9, false);
    }

    @Test
    public void test00510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00510");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutActivityTemplate putActivityTemplate0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutActivityTemplate();
        java.lang.String str1 = putActivityTemplate0.getId();
        java.lang.String str2 = putActivityTemplate0.Id;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes3 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes5 = auditAttributes3.setCreationUserProfileId("'.'SSSSSSS");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutActivityTemplate putActivityTemplate6 = putActivityTemplate0.setAuditAttributes(auditAttributes5);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.MediumType mediumType7 = com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.MediumType.WATER;
        putActivityTemplate6.Medium = mediumType7;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostFieldVisitActivityWithTemplate postFieldVisitActivityWithTemplate9 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostFieldVisitActivityWithTemplate();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate specimenTemplate10 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate();
        specimenTemplate10.CustomId = "hi!";
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate specimenTemplate13 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate specimenTemplate14 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate();
        java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabInstructionTemplate> labInstructionTemplateList15 = specimenTemplate14.getLabInstructionTemplates();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate specimenTemplate16 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate specimenTemplate18 = specimenTemplate16.setCustomId("hi!");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate specimenTemplate19 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate specimenTemplate20 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate();
        java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabInstructionTemplate> labInstructionTemplateList21 = specimenTemplate20.LabInstructionTemplates;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate[] specimenTemplateArray22 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate[] { specimenTemplate10, specimenTemplate13, specimenTemplate14, specimenTemplate18, specimenTemplate19, specimenTemplate20 };
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate> specimenTemplateList23 = new java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate>) specimenTemplateList23, specimenTemplateArray22);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostFieldVisitActivityWithTemplate postFieldVisitActivityWithTemplate25 = postFieldVisitActivityWithTemplate9.setSpecimenTemplates((java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate>) specimenTemplateList23);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutActivityTemplate putActivityTemplate26 = putActivityTemplate6.setSpecimenTemplates((java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate>) specimenTemplateList23);
        java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate> specimenTemplateList27 = putActivityTemplate6.getSpecimenTemplates();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(auditAttributes5);
        org.junit.Assert.assertNotNull(putActivityTemplate6);
        org.junit.Assert.assertTrue("'" + mediumType7 + "' != '" + com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.MediumType.WATER + "'", mediumType7.equals(com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.MediumType.WATER));
        org.junit.Assert.assertNull(labInstructionTemplateList15);
        org.junit.Assert.assertNotNull(specimenTemplate18);
        org.junit.Assert.assertNull(labInstructionTemplateList21);
        org.junit.Assert.assertNotNull(specimenTemplateArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(postFieldVisitActivityWithTemplate25);
        org.junit.Assert.assertNotNull(putActivityTemplate26);
        org.junit.Assert.assertNotNull(specimenTemplateList27);
    }

    @Test
    public void test00511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00511");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetUnitHistory getUnitHistory0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetUnitHistory();
        java.lang.String str1 = getUnitHistory0.getId();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test00512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00512");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest timeAlignedDataServiceRequest0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_1 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        getObservationsV2_1.SpecimenIds = strList4;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags7 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray11 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags14 = putLocationTags7.setTagUniqueIds(strList12);
        getObservationsV2_1.QualityControlTypes = strList12;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest timeAlignedDataServiceRequest16 = timeAlignedDataServiceRequest0.setTimeSeriesUniqueIds(strList12);
        java.util.ArrayList<java.lang.String> strList17 = timeAlignedDataServiceRequest0.TimeSeriesOutputUnitIds;
        timeAlignedDataServiceRequest0.UtcOffset = 1.0d;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(putLocationTags14);
        org.junit.Assert.assertNotNull(timeAlignedDataServiceRequest16);
        org.junit.Assert.assertNull(strList17);
    }

    @Test
    public void test00513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00513");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Setting setting0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Setting();
        java.lang.String str1 = setting0.getKey();
        java.lang.String str2 = setting0.getGroup();
        setting0.Group = "/AQUARIUS/Acquisition/v2://9999-12-31T23:59:59.999Z";
        java.time.Instant instant5 = setting0.LastModifiedTime;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(instant5);
    }

    @Test
    public void test00514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00514");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedProperty observedProperty0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedProperty();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalysisType analysisType1 = observedProperty0.getAnalysisType();
        org.junit.Assert.assertNull(analysisType1);
    }

    @Test
    public void test00515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00515");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.RatingModelOutputValuesServiceRequest ratingModelOutputValuesServiceRequest0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.RatingModelOutputValuesServiceRequest();
        ratingModelOutputValuesServiceRequest0.ApplyShifts = true;
        java.time.Instant instant3 = ratingModelOutputValuesServiceRequest0.getEffectiveTime();
        java.lang.String str4 = ratingModelOutputValuesServiceRequest0.getRatingModelIdentifier();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.RatingModelOutputValuesServiceRequest ratingModelOutputValuesServiceRequest6 = ratingModelOutputValuesServiceRequest0.setApplyShifts((java.lang.Boolean) false);
        java.lang.Boolean boolean7 = ratingModelOutputValuesServiceRequest6.isApplyShifts();
        java.util.ArrayList<java.lang.Double> doubleList8 = ratingModelOutputValuesServiceRequest6.InputValues;
        java.lang.Object obj9 = ratingModelOutputValuesServiceRequest6.getResponseType();
        org.junit.Assert.assertNull(instant3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(ratingModelOutputValuesServiceRequest6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + false + "'", boolean7, false);
        org.junit.Assert.assertNull(doubleList8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$RatingModelOutputValuesServiceResponse");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$RatingModelOutputValuesServiceResponse");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$RatingModelOutputValuesServiceResponse");
    }

    @Test
    public void test00516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00516");
        java.time.Instant instant0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.IMetadataChangeOperation.DateAppliedUtc;
        org.junit.Assert.assertNull(instant0);
    }

    @Test
    public void test00517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00517");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.StandardReferenceDatum standardReferenceDatum0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.StandardReferenceDatum();
        standardReferenceDatum0.LocationUniqueId = "/AQUARIUS/Acquisition/v2";
        java.lang.String str3 = standardReferenceDatum0.StandardIdentifier;
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00518");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitDataServiceResponse fieldVisitDataServiceResponse0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitDataServiceResponse();
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeActivity> dischargeActivityList1 = fieldVisitDataServiceResponse0.DischargeActivities;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ControlConditionActivity controlConditionActivity2 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ControlConditionActivity();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ControlCleanedType controlCleanedType3 = null;
        controlConditionActivity2.ControlCleaned = controlCleanedType3;
        java.lang.String str5 = controlConditionActivity2.FlowOverControl;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitDataServiceResponse fieldVisitDataServiceResponse6 = fieldVisitDataServiceResponse0.setControlConditionActivity(controlConditionActivity2);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.QuantityWithDisplay quantityWithDisplay7 = null;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ControlConditionActivity controlConditionActivity8 = controlConditionActivity2.setDistanceToGage(quantityWithDisplay7);
        org.junit.Assert.assertNull(dischargeActivityList1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(fieldVisitDataServiceResponse6);
        org.junit.Assert.assertNotNull(controlConditionActivity8);
    }

    @Test
    public void test00519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00519");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_6 = getObservationsV2_0.setDataClassifications((java.util.List<java.lang.String>) strList4);
        getObservationsV2_6.DepthUnitCustomId = "hi!";
        java.lang.String str9 = getObservationsV2_6.CustomId;
        java.util.List<java.lang.String> strList10 = getObservationsV2_6.SamplingLocationGroupIds;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_11 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray14 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_17 = getObservationsV2_11.setDataClassifications((java.util.List<java.lang.String>) strList15);
        getObservationsV2_17.DepthUnitCustomId = "hi!";
        java.lang.String str20 = getObservationsV2_17.CustomId;
        java.util.List<java.lang.String> strList21 = getObservationsV2_17.getSearch();
        java.util.List<java.lang.String> strList22 = getObservationsV2_17.getAnalysisMethodSimpleIds();
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "", "9999-12-31T23:59:59.999Z" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_29 = getObservationsV2_17.setSamplingContextTagIds((java.util.List<java.lang.String>) strList27);
        getObservationsV2_6.LabResultLaboratoryIds = strList27;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(getObservationsV2_6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strList10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(getObservationsV2_17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(strList21);
        org.junit.Assert.assertNull(strList22);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(getObservationsV2_29);
    }

    @Test
    public void test00520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00520");
        java.util.Map<java.lang.Object, java.lang.reflect.Type> objMap2 = null;
        com.aquaticinformatics.aquarius.sdk.samples.FieldNamer fieldNamer3 = new com.aquaticinformatics.aquarius.sdk.samples.FieldNamer();
        com.aquaticinformatics.aquarius.sdk.helpers.SdkServiceClient sdkServiceClient5 = com.aquaticinformatics.aquarius.sdk.helpers.SdkServiceClient.Create("MaxDuration", "http", objMap2, (com.aquaticinformatics.aquarius.sdk.helpers.IFieldNamer) fieldNamer3, false);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetResultGrades getResultGrades6 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetResultGrades();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SearchResultResultGrade searchResultResultGrade8 = sdkServiceClient5.get((net.servicestack.client.IReturn<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SearchResultResultGrade>) getResultGrades6, strMap7);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.net.UnknownHostException: MaxDurationhttp");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sdkServiceClient5);
    }

    @Test
    public void test00521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00521");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Reading reading0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Reading();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DoubleWithDisplay doubleWithDisplay1 = reading0.getValue();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ReadingType readingType2 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ReadingType.RoutineBefore;
        reading0.ReadingType = readingType2;
        java.time.Instant instant4 = reading0.Time;
        java.util.ArrayList<java.lang.String> strList5 = reading0.ReadingQualifiers;
        java.lang.String str6 = reading0.getSerialNumber();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DoubleWithDisplay doubleWithDisplay7 = reading0.getUncertainty();
        org.junit.Assert.assertNull(doubleWithDisplay1);
        org.junit.Assert.assertTrue("'" + readingType2 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ReadingType.RoutineBefore + "'", readingType2.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ReadingType.RoutineBefore));
        org.junit.Assert.assertNull(instant4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(doubleWithDisplay7);
    }

    @Test
    public void test00522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00522");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Attachment attachment0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Attachment();
        java.lang.String str1 = attachment0.getUrl();
        attachment0.GpsLongitude = 0.0d;
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test00523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00523");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray4 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags7 = putLocationTags0.setTagUniqueIds(strList5);
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ApplyTagRequest> applyTagRequestList8 = putLocationTags0.Tags;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags10 = putLocationTags0.setLocationUniqueId("2021.4.62.0");
        putLocationTags0.LocationUniqueId = "POST";
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(putLocationTags7);
        org.junit.Assert.assertNull(applyTagRequestList8);
        org.junit.Assert.assertNotNull(putLocationTags10);
    }

    @Test
    public void test00524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00524");
        com.aquaticinformatics.aquarius.sdk.timeseries.serializers.DurationDeserializer durationDeserializer0 = new com.aquaticinformatics.aquarius.sdk.timeseries.serializers.DurationDeserializer();
        com.google.gson.JsonElement jsonElement1 = null;
        java.lang.reflect.Type type2 = null;
        com.google.gson.JsonDeserializationContext jsonDeserializationContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.Duration duration4 = durationDeserializer0.deserialize(jsonElement1, type2, jsonDeserializationContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00525");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutBaseStandardReferenceDatumOffset putBaseStandardReferenceDatumOffset0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutBaseStandardReferenceDatumOffset();
        java.lang.Object obj1 = putBaseStandardReferenceDatumOffset0.getResponseType();
        putBaseStandardReferenceDatumOffset0.Comments = "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSSSSSZZZZZ";
        java.lang.String str4 = putBaseStandardReferenceDatumOffset0.getComments();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutBaseStandardReferenceDatumOffset putBaseStandardReferenceDatumOffset6 = putBaseStandardReferenceDatumOffset0.setComments("'.'SSSSSSS");
        putBaseStandardReferenceDatumOffset6.Uncertainty = 1.0d;
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning$StandardReferenceDatum");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning$StandardReferenceDatum");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning$StandardReferenceDatum");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSSSSSZZZZZ" + "'", str4, "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSSSSSZZZZZ");
        org.junit.Assert.assertNotNull(putBaseStandardReferenceDatumOffset6);
    }

    @Test
    public void test00526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00526");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutObservedProperty putObservedProperty0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutObservedProperty();
        putObservedProperty0.Name = "MinInstant";
        putObservedProperty0.CasNumber = "POST";
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ResultType resultType5 = putObservedProperty0.ResultType;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutUnit putUnit6 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutUnit();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutUnit putUnit8 = putUnit6.setName("MinInstant");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.UnitGroup unitGroup9 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.UnitGroup();
        unitGroup9.CustomId = "https";
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.UnitGroupSystemCodeType unitGroupSystemCodeType12 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.UnitGroup unitGroup13 = unitGroup9.setSystemCode(unitGroupSystemCodeType12);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutUnit putUnit14 = putUnit8.setUnitGroup(unitGroup13);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.UnitGroupSystemCodeType unitGroupSystemCodeType15 = null;
        unitGroup13.SystemCode = unitGroupSystemCodeType15;
        putObservedProperty0.UnitGroup = unitGroup13;
        java.lang.String str18 = unitGroup13.getId();
        org.junit.Assert.assertNull(resultType5);
        org.junit.Assert.assertNotNull(putUnit8);
        org.junit.Assert.assertNotNull(unitGroup13);
        org.junit.Assert.assertNotNull(putUnit14);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test00527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00527");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.StatisticalDateTimeOffsetDeserializer.FORMATTER;
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test00528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00528");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetChartDataV2 getChartDataV2_0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetChartDataV2();
        java.lang.String str1 = getChartDataV2_0.getActivityCustomId();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetChartDataV2 getChartDataV2_3 = getChartDataV2_0.setFilterId("");
        java.time.Instant instant4 = getChartDataV2_0.EndObservedTime;
        getChartDataV2_0.MinNumericResultValue = 1.0d;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(getChartDataV2_3);
        org.junit.Assert.assertNull(instant4);
    }

    @Test
    public void test00529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00529");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostDatumConvertedTimeSeries postDatumConvertedTimeSeries0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostDatumConvertedTimeSeries();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostDatumConvertedTimeSeries postDatumConvertedTimeSeries2 = postDatumConvertedTimeSeries0.setDescription("yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ");
        java.lang.Boolean boolean3 = postDatumConvertedTimeSeries0.TargetIsLocalAssumedDatum;
        java.lang.String str4 = postDatumConvertedTimeSeries0.getComputationIdentifier();
        java.util.List<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ExtendedAttributeValue> extendedAttributeValueList5 = postDatumConvertedTimeSeries0.ExtendedAttributeValues;
        postDatumConvertedTimeSeries0.Publish = false;
        java.lang.String str8 = postDatumConvertedTimeSeries0.getParameter();
        org.junit.Assert.assertNotNull(postDatumConvertedTimeSeries2);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(extendedAttributeValueList5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00530");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AttachmentRepresentation attachmentRepresentation0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AttachmentRepresentation();
        attachmentRepresentation0.Latitude = "/AQUARIUS/Acquisition/v2";
        attachmentRepresentation0.Latitude = "/AQUARIUS";
    }

    @Test
    public void test00531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00531");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Vertical vertical0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Vertical();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Vertical vertical2 = vertical0.setPercentageOfTotalDischarge((java.lang.Double) 100.0d);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.QuantityWithDisplay quantityWithDisplay3 = vertical2.getSegmentWidth();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.QuantityWithDisplay quantityWithDisplay4 = null;
        vertical2.SegmentVelocity = quantityWithDisplay4;
        org.junit.Assert.assertNotNull(vertical2);
        org.junit.Assert.assertNull(quantityWithDisplay3);
    }

    @Test
    public void test00532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00532");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Unit unit0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Unit();
        java.lang.String str1 = unit0.getGroupIdentifier();
        unit0.UniqueId = "/AQUARIUS/Acquisition/v2://9999-12-31T23:59:59.999Z";
        java.lang.Boolean boolean4 = unit0.IsSystem;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test00533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00533");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Acquisition.PostTimeSeriesMetadataResponse postTimeSeriesMetadataResponse0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Acquisition.PostTimeSeriesMetadataResponse();
        postTimeSeriesMetadataResponse0.NotesCreated = 100;
    }

    @Test
    public void test00534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00534");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.PointVelocityDischargeActivity pointVelocityDischargeActivity0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.PointVelocityDischargeActivity();
        java.lang.String str1 = pointVelocityDischargeActivity0.getModel();
        java.lang.String str2 = pointVelocityDischargeActivity0.getFirmwareVersion();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.QuantityWithDisplay quantityWithDisplay3 = null;
        pointVelocityDischargeActivity0.Width = quantityWithDisplay3;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.StartPointType startPointType5 = null;
        pointVelocityDischargeActivity0.StartPoint = startPointType5;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.PointVelocityDischargeActivity pointVelocityDischargeActivity8 = pointVelocityDischargeActivity0.setHorizontalCoefficientUsed((java.lang.Boolean) false);
        pointVelocityDischargeActivity0.MeterInspectedAfter = true;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.PointVelocityDischargeActivity pointVelocityDischargeActivity12 = pointVelocityDischargeActivity0.setSoftwareVersion("9999-12-31T23:59:59.999Z");
        pointVelocityDischargeActivity0.MeterInspectedBefore = true;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(pointVelocityDischargeActivity8);
        org.junit.Assert.assertNotNull(pointVelocityDischargeActivity12);
    }

    @Test
    public void test00535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00535");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutOpenIdConnectRelyingPartyConfiguration putOpenIdConnectRelyingPartyConfiguration0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutOpenIdConnectRelyingPartyConfiguration();
        java.util.List<java.lang.String> strList1 = putOpenIdConnectRelyingPartyConfiguration0.getScopes();
        java.lang.String str2 = putOpenIdConnectRelyingPartyConfiguration0.getOptionalIssuerDiscoveryUri();
        putOpenIdConnectRelyingPartyConfiguration0.IdentifierClaim = "9999-12-31T23:59:59.999Z";
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.OpenIdConnectRelyingPartyConfigurationBase openIdConnectRelyingPartyConfigurationBase6 = putOpenIdConnectRelyingPartyConfiguration0.setRedirectUri("/AQUARIUS/Acquisition/v2://9999-12-31T23:59:59.999Z");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.OpenIdConnectRelyingPartyConfigurationBase openIdConnectRelyingPartyConfigurationBase8 = putOpenIdConnectRelyingPartyConfiguration0.setIdentifierClaim("'.'SSSSSSS");
        java.lang.String str9 = openIdConnectRelyingPartyConfigurationBase8.getIdentifierClaim();
        org.junit.Assert.assertNull(strList1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(openIdConnectRelyingPartyConfigurationBase6);
        org.junit.Assert.assertNotNull(openIdConnectRelyingPartyConfigurationBase8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "'.'SSSSSSS" + "'", str9, "'.'SSSSSSS");
    }

    @Test
    public void test00536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00536");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Unit unit0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Unit();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Unit unit2 = unit0.setBaseOffset((java.lang.Double) (-1.0d));
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Unit unit4 = unit0.setSymbol("yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ");
        java.lang.String str5 = unit4.getUnitIdentifier();
        java.lang.String str6 = unit4.getSingularName();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Unit unit8 = unit4.setSingularName("");
        unit8.UnitIdentifier = "MaxInstant";
        org.junit.Assert.assertNotNull(unit2);
        org.junit.Assert.assertNotNull(unit4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(unit8);
    }

    @Test
    public void test00537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00537");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.QuantityWithDisplay quantityWithDisplay1 = dischargeSummary0.getMeanGageHeight();
        dischargeSummary0.GradeCode = 0;
        org.junit.Assert.assertNull(quantityWithDisplay1);
    }

    @Test
    public void test00538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00538");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ActiveMeterDetails activeMeterDetails0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ActiveMeterDetails();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ActiveMeterDetails activeMeterDetails1 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ActiveMeterDetails();
        activeMeterDetails1.Manufacturer = "https";
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeterType meterType4 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeterType.Adv;
        activeMeterDetails1.MeterType = meterType4;
        activeMeterDetails0.MeterType = meterType4;
        org.junit.Assert.assertTrue("'" + meterType4 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeterType.Adv + "'", meterType4.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeterType.Adv));
    }

    @Test
    public void test00539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00539");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesApprovalsTransactionListServiceRequest timeSeriesApprovalsTransactionListServiceRequest0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesApprovalsTransactionListServiceRequest();
        java.lang.String str1 = timeSeriesApprovalsTransactionListServiceRequest0.getTimeSeriesUniqueId();
        java.time.Instant instant2 = timeSeriesApprovalsTransactionListServiceRequest0.QueryTo;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_3 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_9 = getObservationsV2_3.setDataClassifications((java.util.List<java.lang.String>) strList7);
        java.util.List<java.lang.String> strList10 = getObservationsV2_3.ResultGrades;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary11 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary();
        dischargeSummary11.Reviewer = "";
        java.time.Instant instant14 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        dischargeSummary11.MeasurementTime = instant14;
        getObservationsV2_3.StartResultTime = instant14;
        java.lang.String[] strArray26 = new java.lang.String[] { "https", "/AQUARIUS/Provisioning/v1", "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ", "2021.4.62.0", "hi!", "2021.4.62.0", "2021.4.62.0", "/AQUARIUS/Acquisition/v2", "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_29 = getObservationsV2_3.setAnalyticalGroupIds((java.util.List<java.lang.String>) strList27);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescription locationDescription30 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescription();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescription locationDescription32 = locationDescription30.setIdentifier("");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ControlConditionActivity controlConditionActivity33 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ControlConditionActivity();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ControlCleanedType controlCleanedType34 = null;
        controlConditionActivity33.ControlCleaned = controlCleanedType34;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse36 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse();
        java.time.Instant instant37 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse38 = locationDescriptionListServiceResponse36.setNextToken(instant37);
        controlConditionActivity33.DateCleaned = instant37;
        locationDescription32.LastModified = instant37;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_41 = getObservationsV2_29.setStartResultTime(instant37);
        timeSeriesApprovalsTransactionListServiceRequest0.QueryFrom = instant37;
        java.lang.Object obj43 = timeSeriesApprovalsTransactionListServiceRequest0.getResponseType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(instant2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(getObservationsV2_9);
        org.junit.Assert.assertNull(strList10);
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(getObservationsV2_29);
        org.junit.Assert.assertNotNull(locationDescription32);
        org.junit.Assert.assertNotNull(instant37);
        org.junit.Assert.assertNotNull(locationDescriptionListServiceResponse38);
        org.junit.Assert.assertNotNull(getObservationsV2_41);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertEquals(obj43.toString(), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeSeriesApprovalsTransactionListServiceResponse");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj43), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeSeriesApprovalsTransactionListServiceResponse");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj43), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeSeriesApprovalsTransactionListServiceResponse");
    }

    @Test
    public void test00540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00540");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.RoleFlattened roleFlattened0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.RoleFlattened();
        roleFlattened0.CanAddOrRemoveLocations = false;
        java.lang.String str3 = roleFlattened0.Name;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.RoleFlattenedBase roleFlattenedBase5 = roleFlattened0.setCanReadData((java.lang.Boolean) false);
        roleFlattened0.CanAssignUserRoles = false;
        java.lang.String str8 = roleFlattened0.UniqueId;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.RoleFlattened roleFlattened10 = roleFlattened0.setUniqueId("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(roleFlattenedBase5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(roleFlattened10);
    }

    @Test
    public void test00541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00541");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostSensor postSensor0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostSensor();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.SensorBase sensorBase2 = postSensor0.setName("");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.SensorBase sensorBase4 = sensorBase2.setManufacturer("hi!");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.SensorBase sensorBase6 = sensorBase2.setParameterId("yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.SensorBase sensorBase8 = sensorBase6.setSerialNumber("'.'SSSSSSS");
        sensorBase8.Manufacturer = "MaxInstant";
        java.lang.String str11 = sensorBase8.getMethodCode();
        java.lang.String str12 = sensorBase8.SubLocationIdentifier;
        org.junit.Assert.assertNotNull(sensorBase2);
        org.junit.Assert.assertNotNull(sensorBase4);
        org.junit.Assert.assertNotNull(sensorBase6);
        org.junit.Assert.assertNotNull(sensorBase8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00542");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesDataServiceResponse timeSeriesDataServiceResponse0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesDataServiceResponse();
        java.lang.String str1 = timeSeriesDataServiceResponse0.LocationIdentifier;
        java.lang.String str2 = timeSeriesDataServiceResponse0.getParameter();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00543");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReading fieldVisitReading0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReading();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReading fieldVisitReading2 = fieldVisitReading0.setUseLocationDatumAsReference((java.lang.Boolean) true);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReading fieldVisitReading4 = fieldVisitReading2.setParameter("0001-01-01T00:00:00.000Z");
        fieldVisitReading4.SerialNumber = "/AQUARIUS";
        org.junit.Assert.assertNotNull(fieldVisitReading2);
        org.junit.Assert.assertNotNull(fieldVisitReading4);
    }

    @Test
    public void test00544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00544");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutTimeSeries putTimeSeries0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutTimeSeries();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutTimeSeries putTimeSeries2 = putTimeSeries0.setDescription("hi!");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutTimeSeries putTimeSeries4 = putTimeSeries0.setDescription("/AQUARIUS/Acquisition/v2://9999-12-31T23:59:59.999Z");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutTimeSeries putTimeSeries6 = putTimeSeries4.setComment("MinDuration");
        java.lang.Boolean boolean7 = putTimeSeries6.Publish;
        org.junit.Assert.assertNotNull(putTimeSeries2);
        org.junit.Assert.assertNotNull(putTimeSeries4);
        org.junit.Assert.assertNotNull(putTimeSeries6);
        org.junit.Assert.assertNull(boolean7);
    }

    @Test
    public void test00545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00545");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostObservedProperty postObservedProperty0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostObservedProperty();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostObservedProperty postObservedProperty2 = postObservedProperty0.setCustomId("hi!");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes3 = postObservedProperty0.AuditAttributes;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostObservedProperty postObservedProperty5 = postObservedProperty0.setName("2021.4.62.0");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes6 = postObservedProperty5.AuditAttributes;
        org.junit.Assert.assertNotNull(postObservedProperty2);
        org.junit.Assert.assertNull(auditAttributes3);
        org.junit.Assert.assertNotNull(postObservedProperty5);
        org.junit.Assert.assertNull(auditAttributes6);
    }

    @Test
    public void test00546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00546");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.EffectiveRatingCurveServiceRequest effectiveRatingCurveServiceRequest0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.EffectiveRatingCurveServiceRequest();
        java.lang.String str1 = effectiveRatingCurveServiceRequest0.RatingModelIdentifier;
        java.lang.Double double2 = effectiveRatingCurveServiceRequest0.StepSize;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(double2);
    }

    @Test
    public void test00547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00547");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Approval approval0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Approval();
        java.lang.String str1 = approval0.User;
        approval0.LevelDescription = "MinDuration";
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Approval approval5 = approval0.setApprovalLevel((java.lang.Integer) 4);
        java.lang.String str6 = approval0.User;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(approval5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00548");
        java.lang.Integer int0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.IQualityCodeRequest.GradeCode;
        org.junit.Assert.assertNull(int0);
    }

    @Test
    public void test00549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00549");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesThreshold timeSeriesThreshold0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesThreshold();
        java.lang.String str1 = timeSeriesThreshold0.Name;
        timeSeriesThreshold0.Name = "'.'SSSSSSS";
        java.lang.Integer int4 = timeSeriesThreshold0.Severity;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(int4);
    }

    @Test
    public void test00550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00550");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostFieldVisitActivityWithTemplate postFieldVisitActivityWithTemplate0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostFieldVisitActivityWithTemplate();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes1 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostFieldVisitActivityWithTemplate postFieldVisitActivityWithTemplate2 = postFieldVisitActivityWithTemplate0.setAuditAttributes(auditAttributes1);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation observation3 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PlannedFieldResult plannedFieldResult4 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation observation5 = observation3.setPlannedFieldResult(plannedFieldResult4);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabInstruction labInstruction6 = null;
        observation5.LabInstruction = labInstruction6;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservationStatistics observationStatistics8 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation observation9 = observation5.setStatistics(observationStatistics8);
        java.time.OffsetDateTime offsetDateTime10 = observation9.getResultTime();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Quantity quantity11 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Quantity();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Unit unit12 = null;
        quantity11.Unit = unit12;
        observation9.Depth = quantity11;
        postFieldVisitActivityWithTemplate2.Depth = quantity11;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ActivityTemplateType activityTemplateType16 = postFieldVisitActivityWithTemplate2.getType();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.MediumType mediumType17 = postFieldVisitActivityWithTemplate2.getMedium();
        org.junit.Assert.assertNotNull(postFieldVisitActivityWithTemplate2);
        org.junit.Assert.assertNotNull(observation5);
        org.junit.Assert.assertNotNull(observation9);
        org.junit.Assert.assertNull(offsetDateTime10);
        org.junit.Assert.assertNull(activityTemplateType16);
        org.junit.Assert.assertNull(mediumType17);
    }

    @Test
    public void test00551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00551");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReading fieldVisitReading0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReading();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReadingType fieldVisitReadingType1 = fieldVisitReading0.ReadingType;
        fieldVisitReading0.FieldVisitIdentifier = "9999-12-31T23:59:59.999Z";
        org.junit.Assert.assertNull(fieldVisitReadingType1);
    }

    @Test
    public void test00552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00552");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.util.List<java.lang.String> strList1 = getObservationsV2_0.ResultGrades;
        java.util.List<java.lang.String> strList2 = getObservationsV2_0.getSamplingContextTagIds();
        java.util.List<java.lang.String> strList3 = getObservationsV2_0.getAnalyticalGroupIds();
        org.junit.Assert.assertNull(strList1);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(strList3);
    }

    @Test
    public void test00553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00553");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Unit unit0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Unit();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Unit unit2 = unit0.setBaseOffset((java.lang.Double) (-1.0d));
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Unit unit4 = unit0.setBaseMultiplier((java.lang.Double) 100.0d);
        unit0.PluralName = "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ";
        org.junit.Assert.assertNotNull(unit2);
        org.junit.Assert.assertNotNull(unit4);
    }

    @Test
    public void test00554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00554");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Location location0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Location();
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.AppliedTag> appliedTagList1 = location0.Tags;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Location location3 = location0.setUniqueId("MaxInstant");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Location location5 = location3.setUtcOffset("9999-12-31T23:59:59.999Z");
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.AppliedTag> appliedTagList6 = location3.getTags();
        java.lang.String str7 = location3.getIdentifier();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.AppliedTag appliedTag8 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.AppliedTag();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.AppliedTag appliedTag9 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.AppliedTag();
        java.lang.String str10 = appliedTag9.getUniqueId();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.AppliedTag appliedTag11 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.AppliedTag();
        java.lang.String str12 = appliedTag11.getUniqueId();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.AppliedTag[] appliedTagArray13 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.AppliedTag[] { appliedTag8, appliedTag9, appliedTag11 };
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.AppliedTag> appliedTagList14 = new java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.AppliedTag>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.AppliedTag>) appliedTagList14, appliedTagArray13);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Location location16 = location3.setTags(appliedTagList14);
        java.lang.String str17 = location3.UtcOffset;
        java.lang.Double double18 = location3.Longitude;
        org.junit.Assert.assertNull(appliedTagList1);
        org.junit.Assert.assertNotNull(location3);
        org.junit.Assert.assertNotNull(location5);
        org.junit.Assert.assertNull(appliedTagList6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(appliedTagArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(location16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "9999-12-31T23:59:59.999Z" + "'", str17, "9999-12-31T23:59:59.999Z");
        org.junit.Assert.assertNull(double18);
    }

    @Test
    public void test00555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00555");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportHistoryEvent importHistoryEvent0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportHistoryEvent();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetSpecimens getSpecimens1 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetSpecimens();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutBulkEditResultGradesV2 putBulkEditResultGradesV2_2 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutBulkEditResultGradesV2();
        java.lang.Double double3 = putBulkEditResultGradesV2_2.DepthValue;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_4 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        getObservationsV2_4.SpecimenIds = strList7;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags10 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray14 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags17 = putLocationTags10.setTagUniqueIds(strList15);
        getObservationsV2_4.QualityControlTypes = strList15;
        java.util.List<java.lang.String> strList19 = getObservationsV2_4.getAnalyticalGroupIds();
        java.util.List<java.lang.String> strList20 = getObservationsV2_4.DataClassifications;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.FieldResultType fieldResultType21 = getObservationsV2_4.FieldResultType;
        java.time.Instant instant22 = getObservationsV2_4.getEndObservedTime();
        java.lang.String str23 = getObservationsV2_4.DepthUnitCustomId;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags24 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray28 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags31 = putLocationTags24.setTagUniqueIds(strList29);
        java.util.ArrayList<java.lang.String> strList32 = putLocationTags31.TagUniqueIds;
        getObservationsV2_4.ProjectIds = strList32;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutBulkEditResultGradesV2 putBulkEditResultGradesV2_34 = putBulkEditResultGradesV2_2.setSearch((java.util.List<java.lang.String>) strList32);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutBulkEditResultGradesV2 putBulkEditResultGradesV2_36 = putBulkEditResultGradesV2_34.setDepthValue((java.lang.Double) 100.0d);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItem importItem37 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItem();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_38 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        getObservationsV2_38.SpecimenIds = strList41;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags44 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray48 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList49 = new java.util.ArrayList<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList49, strArray48);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags51 = putLocationTags44.setTagUniqueIds(strList49);
        getObservationsV2_38.QualityControlTypes = strList49;
        java.util.List<java.lang.String> strList53 = getObservationsV2_38.getLabReportIds();
        importItem37.Errors = getObservationsV2_38;
        java.lang.Object obj55 = importItem37.getExistingItem();
        java.util.List<java.lang.String> strList56 = importItem37.getFields();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItem importItem57 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItem();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_58 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray60 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList61 = new java.util.ArrayList<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList61, strArray60);
        getObservationsV2_58.SpecimenIds = strList61;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags64 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray68 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList69 = new java.util.ArrayList<java.lang.String>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList69, strArray68);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags71 = putLocationTags64.setTagUniqueIds(strList69);
        getObservationsV2_58.QualityControlTypes = strList69;
        java.util.List<java.lang.String> strList73 = getObservationsV2_58.getLabReportIds();
        importItem57.Errors = getObservationsV2_58;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_75 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.util.List<java.lang.String> strList76 = getObservationsV2_75.SamplingContextTagIds;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_77 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray79 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList80 = new java.util.ArrayList<java.lang.String>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList80, strArray79);
        getObservationsV2_77.SpecimenIds = strList80;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags83 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray87 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList88 = new java.util.ArrayList<java.lang.String>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList88, strArray87);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags90 = putLocationTags83.setTagUniqueIds(strList88);
        getObservationsV2_77.QualityControlTypes = strList88;
        getObservationsV2_75.ResultGrades = strList88;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItem importItem93 = importItem57.setFields((java.util.List<java.lang.String>) strList88);
        importItem37.Fields = strList88;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutBulkEditResultGradesV2 putBulkEditResultGradesV2_95 = putBulkEditResultGradesV2_36.setSamplingLocationGroupIds((java.util.List<java.lang.String>) strList88);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetSpecimens getSpecimens96 = getSpecimens1.setSamplingLocationIds((java.util.List<java.lang.String>) strList88);
        importHistoryEvent0.DomainObjectIds = strList88;
        org.junit.Assert.assertNull(double3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(putLocationTags17);
        org.junit.Assert.assertNull(strList19);
        org.junit.Assert.assertNull(strList20);
        org.junit.Assert.assertNull(fieldResultType21);
        org.junit.Assert.assertNull(instant22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(putLocationTags31);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertNotNull(putBulkEditResultGradesV2_34);
        org.junit.Assert.assertNotNull(putBulkEditResultGradesV2_36);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(putLocationTags51);
        org.junit.Assert.assertNull(strList53);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(strList56);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(putLocationTags71);
        org.junit.Assert.assertNull(strList73);
        org.junit.Assert.assertNull(strList76);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(putLocationTags90);
        org.junit.Assert.assertNotNull(importItem93);
        org.junit.Assert.assertNotNull(putBulkEditResultGradesV2_95);
        org.junit.Assert.assertNotNull(getSpecimens96);
    }

    @Test
    public void test00556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00556");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutComputationPeriod putComputationPeriod0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutComputationPeriod();
        putComputationPeriod0.FormalName = "/AQUARIUS/Acquisition/v2";
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.CodeTableRequestBase codeTableRequestBase4 = putComputationPeriod0.setPublicIdentifier("MaxInstant");
        codeTableRequestBase4.FormalName = "https";
        org.junit.Assert.assertNotNull(codeTableRequestBase4);
    }

    @Test
    public void test00557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00557");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostFieldVisitActivityWithTemplate postFieldVisitActivityWithTemplate0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostFieldVisitActivityWithTemplate();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes1 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostFieldVisitActivityWithTemplate postFieldVisitActivityWithTemplate2 = postFieldVisitActivityWithTemplate0.setAuditAttributes(auditAttributes1);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.MediumType mediumType3 = null;
        postFieldVisitActivityWithTemplate2.Medium = mediumType3;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostActivity postActivity5 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostActivity();
        postActivity5.LoggerFileName = "hi!";
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostActivity postActivity9 = postActivity5.setCustomId("");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes10 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostActivity postActivity11 = postActivity9.setAuditAttributes(auditAttributes10);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostFieldVisitActivityWithTemplate postFieldVisitActivityWithTemplate12 = postFieldVisitActivityWithTemplate2.setAuditAttributes(auditAttributes10);
        postFieldVisitActivityWithTemplate2.Id = "MinDuration";
        org.junit.Assert.assertNotNull(postFieldVisitActivityWithTemplate2);
        org.junit.Assert.assertNotNull(postActivity9);
        org.junit.Assert.assertNotNull(postActivity11);
        org.junit.Assert.assertNotNull(postFieldVisitActivityWithTemplate12);
    }

    @Test
    public void test00558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00558");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportHistoryEventSimple importHistoryEventSimple0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportHistoryEventSimple();
        java.lang.String str1 = importHistoryEventSimple0.getId();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportType importType2 = importHistoryEventSimple0.ImportType;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(importType2);
    }

    @Test
    public void test00559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00559");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PlanningStatusType planningStatusType0 = com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PlanningStatusType.CANCELLED;
        org.junit.Assert.assertTrue("'" + planningStatusType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PlanningStatusType.CANCELLED + "'", planningStatusType0.equals(com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PlanningStatusType.CANCELLED));
    }

    @Test
    public void test00560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00560");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Reading reading0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Reading();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DoubleWithDisplay doubleWithDisplay1 = reading0.getValue();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Reading reading3 = reading0.setParameterId("hi!");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Reading reading5 = reading3.setMonitoringMethod("'.'SSSSSSS");
        reading5.MonitoringMethod = "9999-12-31T23:59:59.999Z";
        reading5.Publish = false;
        org.junit.Assert.assertNull(doubleWithDisplay1);
        org.junit.Assert.assertNotNull(reading3);
        org.junit.Assert.assertNotNull(reading5);
    }

    @Test
    public void test00561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00561");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.GetUser getUser0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.GetUser();
        getUser0.UniqueId = "2021.4.62.0";
    }

    @Test
    public void test00562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00562");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ReferenceStandardOffset referenceStandardOffset0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ReferenceStandardOffset();
        java.lang.String str1 = referenceStandardOffset0.getStandard();
        java.lang.String str2 = referenceStandardOffset0.getStandard();
        java.lang.Double double3 = referenceStandardOffset0.getUncertainty();
        java.lang.Double double4 = referenceStandardOffset0.Uncertainty;
        referenceStandardOffset0.Comments = "/AQUARIUS/Acquisition/v2://9999-12-31T23:59:59.999Z";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(double3);
        org.junit.Assert.assertNull(double4);
    }

    @Test
    public void test00563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00563");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.StandardDefinition standardDefinition0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.StandardDefinition();
        standardDefinition0.Active = false;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.StandardDefinition standardDefinition4 = standardDefinition0.setCustomId("2021.4.62.0");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes5 = standardDefinition0.AuditAttributes;
        org.junit.Assert.assertNotNull(standardDefinition4);
        org.junit.Assert.assertNull(auditAttributes5);
    }

    @Test
    public void test00564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00564");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationRemark locationRemark0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationRemark();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationRemark locationRemark2 = locationRemark0.setDescription("MaxInstant");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse3 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse();
        java.time.Instant instant4 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse5 = locationDescriptionListServiceResponse3.setNextToken(instant4);
        locationRemark2.FromTime = instant4;
        java.time.Instant instant7 = locationRemark2.getCreateTime();
        java.time.Instant instant8 = locationRemark2.CreateTime;
        org.junit.Assert.assertNotNull(locationRemark2);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(locationDescriptionListServiceResponse5);
        org.junit.Assert.assertNull(instant7);
        org.junit.Assert.assertNull(instant8);
    }

    @Test
    public void test00565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00565");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AttachmentRepresentation attachmentRepresentation0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AttachmentRepresentation();
        java.lang.String str1 = attachmentRepresentation0.getLongitude();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AttachmentRepresentation attachmentRepresentation3 = attachmentRepresentation0.setContentType("yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSSSSSZZZZZ");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AttachmentRepresentation attachmentRepresentation5 = attachmentRepresentation3.setLongitude("hi!");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AttachmentRepresentation attachmentRepresentation7 = attachmentRepresentation3.setSuccess((java.lang.Boolean) true);
        java.time.OffsetDateTime offsetDateTime8 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AttachmentRepresentation attachmentRepresentation9 = attachmentRepresentation7.setDateTaken(offsetDateTime8);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AttachmentRepresentation attachmentRepresentation11 = attachmentRepresentation9.setLongitude("hi!");
        java.lang.String str12 = attachmentRepresentation11.Longitude;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(attachmentRepresentation3);
        org.junit.Assert.assertNotNull(attachmentRepresentation5);
        org.junit.Assert.assertNotNull(attachmentRepresentation7);
        org.junit.Assert.assertNotNull(attachmentRepresentation9);
        org.junit.Assert.assertNotNull(attachmentRepresentation11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test00566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00566");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservationImportSummary observationImportSummary0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservationImportSummary();
        java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemObservation> importItemObservationList1 = observationImportSummary0.getErrorImportItems();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservationImportSummary observationImportSummary3 = observationImportSummary0.setNewCount((java.lang.Integer) 4);
        org.junit.Assert.assertNull(importItemObservationList1);
        org.junit.Assert.assertNotNull(observationImportSummary3);
    }

    @Test
    public void test00567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00567");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostSession postSession0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostSession();
        java.lang.Object obj1 = postSession0.getResponseType();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostSession postSession3 = postSession0.setEncryptedPassword("hi!");
        java.lang.String str4 = postSession3.getUsername();
        postSession3.EncryptedPassword = "https";
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "class java.lang.String");
        org.junit.Assert.assertNotNull(postSession3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00568");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.StandardSimple standardSimple0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.StandardSimple();
        standardSimple0.IssuingOrganization = "-PT87591240H";
        standardSimple0.Id = "/AQUARIUS/Acquisition/v2";
    }

    @Test
    public void test00569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00569");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.FieldVisitSimple fieldVisitSimple0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.FieldVisitSimple();
        fieldVisitSimple0.Participants = "'.'SSSSSSS";
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PlanningStatusType planningStatusType3 = fieldVisitSimple0.getPlanningStatus();
        java.lang.String str4 = fieldVisitSimple0.Id;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.FieldTripSimple fieldTripSimple5 = null;
        fieldVisitSimple0.FieldTrip = fieldTripSimple5;
        org.junit.Assert.assertNull(planningStatusType3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00570");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ExpandedStageTableServiceRequest expandedStageTableServiceRequest0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ExpandedStageTableServiceRequest();
        java.lang.Object obj1 = expandedStageTableServiceRequest0.getResponseType();
        java.lang.Double double2 = expandedStageTableServiceRequest0.getEndValue();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ExpandedStageTableServiceRequest expandedStageTableServiceRequest4 = expandedStageTableServiceRequest0.setEndValue((java.lang.Double) (-1.0d));
        expandedStageTableServiceRequest0.TimeSeriesUniqueId = "ZZZZZ";
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$ExpandedStageTableServiceResponse");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$ExpandedStageTableServiceResponse");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$ExpandedStageTableServiceResponse");
        org.junit.Assert.assertNull(double2);
        org.junit.Assert.assertNotNull(expandedStageTableServiceRequest4);
    }

    @Test
    public void test00571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00571");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostDatumConvertedTimeSeries postDatumConvertedTimeSeries0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostDatumConvertedTimeSeries();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostDatumConvertedTimeSeries postDatumConvertedTimeSeries2 = postDatumConvertedTimeSeries0.setDescription("yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ");
        postDatumConvertedTimeSeries0.Publish = false;
        java.lang.String str5 = postDatumConvertedTimeSeries0.getComment();
        java.lang.String str6 = postDatumConvertedTimeSeries0.getDescription();
        java.lang.String str7 = postDatumConvertedTimeSeries0.Parameter;
        postDatumConvertedTimeSeries0.TargetIsLocalAssumedDatum = true;
        postDatumConvertedTimeSeries0.Unit = "/AQUARIUS";
        org.junit.Assert.assertNotNull(postDatumConvertedTimeSeries2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ" + "'", str6, "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00572");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostUser postUser0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostUser();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.UserProfile userProfile1 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostUser postUser2 = postUser0.setUserProfile(userProfile1);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.UserType userType3 = postUser2.UserType;
        java.lang.String str4 = postUser2.Email;
        org.junit.Assert.assertNotNull(postUser2);
        org.junit.Assert.assertNull(userType3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00573");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationMonitoringMethod locationMonitoringMethod0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationMonitoringMethod();
        java.lang.String str1 = locationMonitoringMethod0.getModel();
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagMetadata> tagMetadataList2 = null;
        locationMonitoringMethod0.Tags = tagMetadataList2;
        java.lang.String str4 = locationMonitoringMethod0.getParameterUniqueId();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationMonitoringMethod locationMonitoringMethod6 = locationMonitoringMethod0.setMethod("'.'SSSSSSS");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationMonitoringMethod locationMonitoringMethod8 = locationMonitoringMethod0.setName("https");
        java.lang.String str9 = locationMonitoringMethod0.Comment;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(locationMonitoringMethod6);
        org.junit.Assert.assertNotNull(locationMonitoringMethod8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00574");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Filter filter0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Filter();
        java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedProperty> observedPropertyList1 = filter0.ObservedProperties;
        java.time.OffsetDateTime offsetDateTime2 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Filter filter3 = filter0.setEndTime(offsetDateTime2);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes4 = filter0.getAuditAttributes();
        java.time.OffsetDateTime offsetDateTime5 = filter0.EndTime;
        java.lang.String str6 = filter0.Id;
        org.junit.Assert.assertNull(observedPropertyList1);
        org.junit.Assert.assertNotNull(filter3);
        org.junit.Assert.assertNull(auditAttributes4);
        org.junit.Assert.assertNull(offsetDateTime5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00575");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ActivityType activityType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ActivityType.CalibrationCheck;
        org.junit.Assert.assertTrue("'" + activityType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ActivityType.CalibrationCheck + "'", activityType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ActivityType.CalibrationCheck));
    }

    @Test
    public void test00576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00576");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingContextTag samplingContextTag0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingContextTag();
        java.lang.String str1 = samplingContextTag0.getDescription();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes2 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingContextTag samplingContextTag3 = samplingContextTag0.setAuditAttributes(auditAttributes2);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingContextTag samplingContextTag5 = samplingContextTag3.setId("yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ");
        java.lang.String str6 = samplingContextTag3.Name;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes7 = samplingContextTag3.AuditAttributes;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(samplingContextTag3);
        org.junit.Assert.assertNotNull(samplingContextTag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(auditAttributes7);
    }

    @Test
    public void test00577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00577");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutSchedule putSchedule0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutSchedule();
        java.time.OffsetDateTime offsetDateTime1 = putSchedule0.StartDate;
        java.time.OffsetDateTime offsetDateTime2 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutSchedule putSchedule3 = putSchedule0.setEndDate(offsetDateTime2);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes4 = putSchedule3.AuditAttributes;
        putSchedule3.SamplingLocationGroupSelectionTypeRandomCount = 4;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes7 = putSchedule3.getAuditAttributes();
        org.junit.Assert.assertNull(offsetDateTime1);
        org.junit.Assert.assertNotNull(putSchedule3);
        org.junit.Assert.assertNull(auditAttributes4);
        org.junit.Assert.assertNull(auditAttributes7);
    }

    @Test
    public void test00578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00578");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutFieldVisit putFieldVisit0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutFieldVisit();
        putFieldVisit0.Notes = "MinDuration";
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ProjectSimple projectSimple3 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutFieldVisit putFieldVisit4 = putFieldVisit0.setProject(projectSimple3);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Schedule schedule5 = putFieldVisit0.getSchedule();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingPlan samplingPlan6 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingPlan();
        samplingPlan6.SamplingLocationGroupSelectionTypeRandomCount = 0;
        java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingPlanPlannedActivity> samplingPlanPlannedActivityList9 = samplingPlan6.PlannedActivities;
        java.lang.String str10 = samplingPlan6.CustomId;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutFieldVisit putFieldVisit11 = putFieldVisit0.setSamplingPlan(samplingPlan6);
        java.time.OffsetDateTime offsetDateTime12 = putFieldVisit11.StartTime;
        java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ExtendedAttribute> extendedAttributeList13 = putFieldVisit11.getExtendedAttributes();
        java.time.OffsetDateTime offsetDateTime14 = null;
        putFieldVisit11.StartTime = offsetDateTime14;
        org.junit.Assert.assertNotNull(putFieldVisit4);
        org.junit.Assert.assertNull(schedule5);
        org.junit.Assert.assertNull(samplingPlanPlannedActivityList9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(putFieldVisit11);
        org.junit.Assert.assertNull(offsetDateTime12);
        org.junit.Assert.assertNull(extendedAttributeList13);
    }

    @Test
    public void test00579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00579");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutNullMeasureQualifier putNullMeasureQualifier0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutNullMeasureQualifier();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutNullMeasureQualifier putNullMeasureQualifier2 = putNullMeasureQualifier0.setName("MaxDuration");
        putNullMeasureQualifier2.Id = "yyyy'-'MM'-'dd'T'HH':'mm':'ss";
        org.junit.Assert.assertNotNull(putNullMeasureQualifier2);
    }

    @Test
    public void test00580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00580");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostStatisticalDerivedTimeSeries postStatisticalDerivedTimeSeries0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostStatisticalDerivedTimeSeries();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostStatisticalDerivedTimeSeries postStatisticalDerivedTimeSeries2 = postStatisticalDerivedTimeSeries0.setComment("'.'SSSSSSS");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostStatisticalDerivedTimeSeries postStatisticalDerivedTimeSeries4 = postStatisticalDerivedTimeSeries0.setLabel("'.'SSSSSSS");
        java.lang.String str5 = postStatisticalDerivedTimeSeries0.getLabel();
        postStatisticalDerivedTimeSeries0.CoverageMinimumPercentage = 100.0d;
        java.util.List<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ExtendedAttributeValue> extendedAttributeValueList8 = postStatisticalDerivedTimeSeries0.ExtendedAttributeValues;
        org.junit.Assert.assertNotNull(postStatisticalDerivedTimeSeries2);
        org.junit.Assert.assertNotNull(postStatisticalDerivedTimeSeries4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "'.'SSSSSSS" + "'", str5, "'.'SSSSSSS");
        org.junit.Assert.assertNull(extendedAttributeValueList8);
    }

    @Test
    public void test00581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00581");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.DeleteQualityCode deleteQualityCode0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.DeleteQualityCode();
        java.lang.Integer int1 = deleteQualityCode0.GradeCode;
        deleteQualityCode0.GradeCode = 1;
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test00582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00582");
        java.util.Map<java.lang.Object, java.lang.reflect.Type> objMap2 = null;
        com.aquaticinformatics.aquarius.sdk.samples.FieldNamer fieldNamer3 = new com.aquaticinformatics.aquarius.sdk.samples.FieldNamer();
        com.aquaticinformatics.aquarius.sdk.helpers.SdkServiceClient sdkServiceClient5 = com.aquaticinformatics.aquarius.sdk.helpers.SdkServiceClient.Create("MaxDuration", "http", objMap2, (com.aquaticinformatics.aquarius.sdk.helpers.IFieldNamer) fieldNamer3, false);
        net.servicestack.client.ExceptionFilter exceptionFilter6 = null;
        sdkServiceClient5.ExceptionFilter = exceptionFilter6;
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.GsonBuilder gsonBuilder8 = sdkServiceClient5.getGsonBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sdkServiceClient5);
    }

    @Test
    public void test00583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00583");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ExpandedRatingCurve expandedRatingCurve0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ExpandedRatingCurve();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ParameterWithUnit parameterWithUnit1 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ParameterWithUnit();
        expandedRatingCurve0.OutputParameter = parameterWithUnit1;
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.OffsetPoint> offsetPointList3 = expandedRatingCurve0.getOffsets();
        java.lang.String str4 = expandedRatingCurve0.getRemarks();
        org.junit.Assert.assertNull(offsetPointList3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00584");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PlannedFieldResult plannedFieldResult0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PlannedFieldResult();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes1 = plannedFieldResult0.AuditAttributes;
        plannedFieldResult0.Id = "'.'SSSSSSS";
        java.lang.String str4 = plannedFieldResult0.DeviceType;
        java.lang.String str5 = plannedFieldResult0.Id;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.MetricConfiguration metricConfiguration6 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.MetricConfiguration();
        java.lang.String str7 = metricConfiguration6.getId();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedProperty observedProperty8 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedProperty();
        observedProperty8.CasNumber = "MinDuration";
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.MetricConfiguration metricConfiguration11 = metricConfiguration6.setObservedProperty(observedProperty8);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ResultType resultType12 = observedProperty8.ResultType;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostObservedProperty postObservedProperty13 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostObservedProperty();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.UnitGroup unitGroup14 = postObservedProperty13.UnitGroup;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Quantity quantity15 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Quantity();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Unit unit16 = null;
        quantity15.Unit = unit16;
        postObservedProperty13.LowerLimit = quantity15;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Quantity quantity19 = postObservedProperty13.LowerLimit;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Unit unit20 = quantity19.Unit;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedProperty observedProperty21 = observedProperty8.setUpperLimit(quantity19);
        plannedFieldResult0.ObservedProperty = observedProperty21;
        plannedFieldResult0.Id = "/AQUARIUS/Acquisition/v2";
        java.lang.String str25 = plannedFieldResult0.getComment();
        org.junit.Assert.assertNull(auditAttributes1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "'.'SSSSSSS" + "'", str5, "'.'SSSSSSS");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(metricConfiguration11);
        org.junit.Assert.assertNull(resultType12);
        org.junit.Assert.assertNull(unitGroup14);
        org.junit.Assert.assertNotNull(quantity19);
        org.junit.Assert.assertNull(unit20);
        org.junit.Assert.assertNotNull(observedProperty21);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test00585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00585");
        java.util.Map<java.lang.Object, java.lang.reflect.Type> objMap2 = null;
        com.aquaticinformatics.aquarius.sdk.samples.FieldNamer fieldNamer3 = new com.aquaticinformatics.aquarius.sdk.samples.FieldNamer();
        com.aquaticinformatics.aquarius.sdk.helpers.SdkServiceClient sdkServiceClient5 = com.aquaticinformatics.aquarius.sdk.helpers.SdkServiceClient.Create("MaxDuration", "http", objMap2, (com.aquaticinformatics.aquarius.sdk.helpers.IFieldNamer) fieldNamer3, false);
        net.servicestack.client.ExceptionFilter exceptionFilter6 = null;
        sdkServiceClient5.ExceptionFilter = exceptionFilter6;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetResultGrades getResultGrades8 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetResultGrades();
        // The following exception was thrown during execution in test generation
        try {
            com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SearchResultResultGrade searchResultResultGrade9 = sdkServiceClient5.send((net.servicestack.client.IReturn<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SearchResultResultGrade>) getResultGrades8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sdkServiceClient5);
    }

    @Test
    public void test00586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00586");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutOpenIdConnectUser putOpenIdConnectUser0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutOpenIdConnectUser();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.UserBase userBase2 = putOpenIdConnectUser0.setCanConfigureSystem((java.lang.Boolean) true);
        java.lang.String str3 = userBase2.getLoginName();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.UserBase userBase5 = userBase2.setFirstName("/AQUARIUS/Acquisition/v2");
        java.lang.Boolean boolean6 = userBase5.CanConfigureSystem;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.UserBase userBase8 = userBase5.setCanLaunchRatingDevelopmentToolbox((java.lang.Boolean) true);
        java.lang.String str9 = userBase5.getLoginName();
        org.junit.Assert.assertNotNull(userBase2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(userBase5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(userBase8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00587");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesDescription timeSeriesDescription0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesDescription();
        java.time.Instant instant1 = timeSeriesDescription0.getCorrectedStartTime();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesDescription timeSeriesDescription3 = timeSeriesDescription0.setLabel("hi!");
        java.lang.Boolean boolean4 = timeSeriesDescription0.isPublish();
        timeSeriesDescription0.UtcOffsetIsoDuration = "ZZZZZ";
        org.junit.Assert.assertNull(instant1);
        org.junit.Assert.assertNotNull(timeSeriesDescription3);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test00588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00588");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemObservedProperty importItemObservedProperty0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemObservedProperty();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItem importItem1 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItem();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_2 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        getObservationsV2_2.SpecimenIds = strList5;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags8 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray12 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags15 = putLocationTags8.setTagUniqueIds(strList13);
        getObservationsV2_2.QualityControlTypes = strList13;
        java.util.List<java.lang.String> strList17 = getObservationsV2_2.getLabReportIds();
        importItem1.Errors = getObservationsV2_2;
        java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportChangeItem> importChangeItemList19 = importItem1.getItemComparison();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemSamplingLocation importItemSamplingLocation20 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemSamplingLocation();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemSamplingLocation importItemSamplingLocation22 = importItemSamplingLocation20.setInput("yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItem importItem23 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItem();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_24 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        getObservationsV2_24.SpecimenIds = strList27;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags30 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray34 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags37 = putLocationTags30.setTagUniqueIds(strList35);
        getObservationsV2_24.QualityControlTypes = strList35;
        java.util.List<java.lang.String> strList39 = getObservationsV2_24.getLabReportIds();
        importItem23.Errors = getObservationsV2_24;
        java.lang.Object obj41 = importItem23.getExistingItem();
        importItem23.Input = "hi!";
        java.lang.Object obj44 = importItem23.getItem();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemStatusType importItemStatusType45 = com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemStatusType.SKIPPED;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItem importItem46 = importItem23.setStatus(importItemStatusType45);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemSamplingLocation importItemSamplingLocation47 = importItemSamplingLocation22.setStatus(importItemStatusType45);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemObject importItemObject48 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemObject();
        java.util.List<java.lang.String> strList49 = importItemObject48.getWarningMessages();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportChangeItem[] importChangeItemArray50 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportChangeItem[] {};
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportChangeItem> importChangeItemList51 = new java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportChangeItem>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportChangeItem>) importChangeItemList51, importChangeItemArray50);
        importItemObject48.ItemComparison = importChangeItemList51;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags54 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray58 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList59 = new java.util.ArrayList<java.lang.String>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList59, strArray58);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags61 = putLocationTags54.setTagUniqueIds(strList59);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemObject importItemObject62 = importItemObject48.setExistingItem((java.lang.Object) putLocationTags54);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.OpenIdConnectUser openIdConnectUser63 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.OpenIdConnectUser();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.OpenIdConnectUser openIdConnectUser65 = openIdConnectUser63.setIdentifier("");
        java.lang.Boolean boolean66 = openIdConnectUser65.CanConfigureSystem;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemObject importItemObject67 = importItemObject48.setErrors((java.lang.Object) openIdConnectUser65);
        java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportChangeItem> importChangeItemList68 = importItemObject67.ItemComparison;
        importItemSamplingLocation47.ItemComparison = importChangeItemList68;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItem importItem70 = importItem1.setItemComparison(importChangeItemList68);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemObservedProperty importItemObservedProperty71 = importItemObservedProperty0.setItemComparison(importChangeItemList68);
        java.lang.String str72 = importItemObservedProperty71.getRowId();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(putLocationTags15);
        org.junit.Assert.assertNull(strList17);
        org.junit.Assert.assertNull(importChangeItemList19);
        org.junit.Assert.assertNotNull(importItemSamplingLocation22);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(putLocationTags37);
        org.junit.Assert.assertNull(strList39);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + importItemStatusType45 + "' != '" + com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemStatusType.SKIPPED + "'", importItemStatusType45.equals(com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemStatusType.SKIPPED));
        org.junit.Assert.assertNotNull(importItem46);
        org.junit.Assert.assertNotNull(importItemSamplingLocation47);
        org.junit.Assert.assertNull(strList49);
        org.junit.Assert.assertNotNull(importChangeItemArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(putLocationTags61);
        org.junit.Assert.assertNotNull(importItemObject62);
        org.junit.Assert.assertNotNull(openIdConnectUser65);
        org.junit.Assert.assertNull(boolean66);
        org.junit.Assert.assertNotNull(importItemObject67);
        org.junit.Assert.assertNotNull(importChangeItemList68);
        org.junit.Assert.assertNotNull(importItem70);
        org.junit.Assert.assertNotNull(importItemObservedProperty71);
        org.junit.Assert.assertNull(str72);
    }

    @Test
    public void test00589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00589");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary2 = dischargeSummary0.setPublish((java.lang.Boolean) false);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary4 = dischargeSummary2.setQualityAssuranceComments("2021.4.62.0");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.QuantityWithDisplay quantityWithDisplay5 = dischargeSummary2.getDischarge();
        org.junit.Assert.assertNotNull(dischargeSummary2);
        org.junit.Assert.assertNotNull(dischargeSummary4);
        org.junit.Assert.assertNull(quantityWithDisplay5);
    }

    @Test
    public void test00590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00590");
        com.aquaticinformatics.aquarius.sdk.AquariusServerVersion aquariusServerVersion0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Current.Version;
        boolean boolean1 = aquariusServerVersion0.IsDeveloperBuild();
        org.junit.Assert.assertNotNull(aquariusServerVersion0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00591");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationMonitoringMethod locationMonitoringMethod0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationMonitoringMethod();
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagMetadata> tagMetadataList1 = locationMonitoringMethod0.Tags;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationMonitoringMethod locationMonitoringMethod3 = locationMonitoringMethod0.setParameterId("yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationMonitoringMethod locationMonitoringMethod5 = locationMonitoringMethod3.setParameter("'.'SSSSSSS");
        java.lang.String str6 = locationMonitoringMethod5.getParameterUniqueId();
        org.junit.Assert.assertNull(tagMetadataList1);
        org.junit.Assert.assertNotNull(locationMonitoringMethod3);
        org.junit.Assert.assertNotNull(locationMonitoringMethod5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00592");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingPlan samplingPlan0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingPlan();
        java.lang.Integer int1 = samplingPlan0.getSamplingLocationGroupSelectionTypeRandomCount();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingPlan samplingPlan3 = samplingPlan0.setSamplingLocationGroupSelectionTypeRandomCount((java.lang.Integer) 100);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingPlan samplingPlan5 = samplingPlan3.setSamplingLocationGroupSelectionTypeRandomCount((java.lang.Integer) 4);
        samplingPlan5.Id = "";
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(samplingPlan3);
        org.junit.Assert.assertNotNull(samplingPlan5);
    }

    @Test
    public void test00593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00593");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.IHttpFile iHttpFile0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.IFileUploadRequest.File;
        org.junit.Assert.assertNull(iHttpFile0);
    }

    @Test
    public void test00594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00594");
        java.lang.String str0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.IPostTimeSeriesRequest.Description;
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test00595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00595");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.VolumetricDischargeReading volumetricDischargeReading0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.VolumetricDischargeReading();
        volumetricDischargeReading0.IsUsed = false;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DoubleWithDisplay doubleWithDisplay3 = volumetricDischargeReading0.EndingVolume;
        java.lang.String str4 = volumetricDischargeReading0.getName();
        org.junit.Assert.assertNull(doubleWithDisplay3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00596");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutUser putUser0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutUser();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_1 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_7 = getObservationsV2_1.setDataClassifications((java.util.List<java.lang.String>) strList5);
        getObservationsV2_7.DepthUnitCustomId = "hi!";
        java.lang.String str10 = getObservationsV2_7.DepthUnitId;
        java.util.List<java.lang.String> strList11 = getObservationsV2_7.LabResultLaboratoryIds;
        getObservationsV2_7.MaxNumericResultValue = (-1.0d);
        java.lang.Integer int14 = getObservationsV2_7.Limit;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest timeAlignedDataServiceRequest15 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_16 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        getObservationsV2_16.SpecimenIds = strList19;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags22 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray26 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags29 = putLocationTags22.setTagUniqueIds(strList27);
        getObservationsV2_16.QualityControlTypes = strList27;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest timeAlignedDataServiceRequest31 = timeAlignedDataServiceRequest15.setTimeSeriesUniqueIds(strList27);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_32 = getObservationsV2_7.setSamplingLocationIds((java.util.List<java.lang.String>) strList27);
        putUser0.Roles = strList27;
        java.lang.Object obj34 = putUser0.getResponseType();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(getObservationsV2_7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strList11);
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(putLocationTags29);
        org.junit.Assert.assertNotNull(timeAlignedDataServiceRequest31);
        org.junit.Assert.assertNotNull(getObservationsV2_32);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals(obj34.toString(), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$User");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj34), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$User");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj34), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$User");
    }

    @Test
    public void test00597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00597");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.GetAuthTokenServiceRequest getAuthTokenServiceRequest0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.GetAuthTokenServiceRequest();
        java.lang.String str1 = getAuthTokenServiceRequest0.getUsername();
        getAuthTokenServiceRequest0.EncryptedPassword = "/AQUARIUS/Acquisition/v2://9999-12-31T23:59:59.999Z";
        java.lang.Object obj4 = getAuthTokenServiceRequest0.getResponseType();
        getAuthTokenServiceRequest0.Username = "ZZZZZ";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "class java.lang.String");
    }

    @Test
    public void test00598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00598");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingPlan samplingPlan0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingPlan();
        samplingPlan0.SamplingLocationGroupSelectionTypeRandomCount = 0;
        java.time.OffsetDateTime offsetDateTime3 = samplingPlan0.StartDate;
        java.time.OffsetDateTime offsetDateTime4 = null;
        samplingPlan0.StartDate = offsetDateTime4;
        org.junit.Assert.assertNull(offsetDateTime3);
    }

    @Test
    public void test00599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00599");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SearchResultLabReportImportHistoryEvent searchResultLabReportImportHistoryEvent0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SearchResultLabReportImportHistoryEvent();
        java.lang.Integer int1 = searchResultLabReportImportHistoryEvent0.getTotalCount();
        java.lang.Integer int2 = searchResultLabReportImportHistoryEvent0.getTotalCount();
        java.lang.String str3 = searchResultLabReportImportHistoryEvent0.Cursor;
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00600");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ReferencePointPeriod referencePointPeriod0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ReferencePointPeriod();
        java.lang.Boolean boolean1 = referencePointPeriod0.IsMeasuredAgainstLocalAssumedDatum;
        referencePointPeriod0.AppliedByUser = "MinDuration";
        java.lang.String str4 = referencePointPeriod0.getUnit();
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00601");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ExtendedAttributeField extendedAttributeField0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ExtendedAttributeField();
        java.lang.Boolean boolean1 = extendedAttributeField0.CanBeEmpty;
        java.lang.String str2 = extendedAttributeField0.getColumnIdentifier();
        extendedAttributeField0.CanBeEmpty = true;
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00602");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        java.util.function.Supplier<com.aquaticinformatics.aquarius.sdk.samples.IPaginatedResponse<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning>> provisioningIPaginatedResponseSupplier1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.aquaticinformatics.aquarius.sdk.samples.LazyResult<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning> provisioningItor2 = new com.aquaticinformatics.aquarius.sdk.samples.LazyResult<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning>(strConsumer0, provisioningIPaginatedResponseSupplier1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00603");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.InputPart inputPart0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.InputPart();
        java.lang.Boolean boolean1 = inputPart0.getContentTypeFromMessage();
        inputPart0.BodyAsString = "9999-12-31T23:59:59.999Z";
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test00604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00604");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostCalculatedDerivedTimeSeries postCalculatedDerivedTimeSeries0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostCalculatedDerivedTimeSeries();
        java.util.ArrayList<java.lang.String> strList1 = postCalculatedDerivedTimeSeries0.TimeSeriesUniqueIds;
        java.lang.String str2 = postCalculatedDerivedTimeSeries0.Label;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostLocation postLocation3 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostLocation();
        postLocation3.Description = "hi!";
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ExtendedAttributeValue[] extendedAttributeValueArray6 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ExtendedAttributeValue[] {};
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ExtendedAttributeValue> extendedAttributeValueList7 = new java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ExtendedAttributeValue>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ExtendedAttributeValue>) extendedAttributeValueList7, extendedAttributeValueArray6);
        postLocation3.ExtendedAttributeValues = extendedAttributeValueList7;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostCalculatedDerivedTimeSeries postCalculatedDerivedTimeSeries10 = postCalculatedDerivedTimeSeries0.setExtendedAttributeValues((java.util.List<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ExtendedAttributeValue>) extendedAttributeValueList7);
        java.lang.String str11 = postCalculatedDerivedTimeSeries0.Comment;
        java.lang.String str12 = postCalculatedDerivedTimeSeries0.getFormula();
        org.junit.Assert.assertNull(strList1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(extendedAttributeValueArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(postCalculatedDerivedTimeSeries10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00605");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationFolderWriteBase locationFolderWriteBase0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationFolderWriteBase();
        java.lang.String str1 = locationFolderWriteBase0.getLocationFolderDescription();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test00606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00606");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitDataByLocationServiceRequest fieldVisitDataByLocationServiceRequest0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitDataByLocationServiceRequest();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitDataByLocationServiceRequest fieldVisitDataByLocationServiceRequest2 = fieldVisitDataByLocationServiceRequest0.setIncludeNodeDetails((java.lang.Boolean) true);
        java.util.ArrayList<java.lang.String> strList3 = fieldVisitDataByLocationServiceRequest2.Parameters;
        java.lang.Object obj4 = fieldVisitDataByLocationServiceRequest2.getResponseType();
        org.junit.Assert.assertNotNull(fieldVisitDataByLocationServiceRequest2);
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$FieldVisitDataByLocationServiceResponse");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$FieldVisitDataByLocationServiceResponse");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$FieldVisitDataByLocationServiceResponse");
    }

    @Test
    public void test00607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00607");
        com.aquaticinformatics.aquarius.sdk.samples.FieldNamer fieldNamer0 = new com.aquaticinformatics.aquarius.sdk.samples.FieldNamer();
        java.lang.reflect.Field field1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = fieldNamer0.translateName(field1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00608");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReadingsByLocationServiceResponse fieldVisitReadingsByLocationServiceResponse0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReadingsByLocationServiceResponse();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReading fieldVisitReading1 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReading();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReading fieldVisitReading2 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReading();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReading fieldVisitReading4 = fieldVisitReading2.setUseLocationDatumAsReference((java.lang.Boolean) true);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReading fieldVisitReading6 = fieldVisitReading4.setParameter("0001-01-01T00:00:00.000Z");
        fieldVisitReading6.FieldVisitIdentifier = "POST";
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReading fieldVisitReading9 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReading();
        java.util.ArrayList<java.lang.String> strList10 = fieldVisitReading9.getQualifiers();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.QuantityWithDisplay quantityWithDisplay11 = null;
        fieldVisitReading9.AdjustmentAmount = quantityWithDisplay11;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReading fieldVisitReading13 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReading();
        java.util.ArrayList<java.lang.String> strList14 = fieldVisitReading13.getQualifiers();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.QuantityWithDisplay quantityWithDisplay15 = null;
        fieldVisitReading13.AdjustmentAmount = quantityWithDisplay15;
        java.time.Instant instant17 = com.aquaticinformatics.aquarius.sdk.samples.serializers.InstantDeserializer.MaxValue;
        fieldVisitReading13.Time = instant17;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReading fieldVisitReading19 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReading();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReading fieldVisitReading21 = fieldVisitReading19.setUseLocationDatumAsReference((java.lang.Boolean) true);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReading fieldVisitReading22 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReading();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReading fieldVisitReading24 = fieldVisitReading22.setUseLocationDatumAsReference((java.lang.Boolean) true);
        fieldVisitReading24.Manufacturer = "https";
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReading fieldVisitReading27 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReading();
        java.util.ArrayList<java.lang.String> strList28 = fieldVisitReading27.getQualifiers();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.QuantityWithDisplay quantityWithDisplay29 = null;
        fieldVisitReading27.AdjustmentAmount = quantityWithDisplay29;
        java.time.Instant instant31 = com.aquaticinformatics.aquarius.sdk.samples.serializers.InstantDeserializer.MaxValue;
        fieldVisitReading27.Time = instant31;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReading fieldVisitReading33 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReading();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReading fieldVisitReading35 = fieldVisitReading33.setUseLocationDatumAsReference((java.lang.Boolean) true);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReading fieldVisitReading37 = fieldVisitReading35.setParameter("0001-01-01T00:00:00.000Z");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReading fieldVisitReading38 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReading();
        java.util.ArrayList<java.lang.String> strList39 = fieldVisitReading38.getQualifiers();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReading fieldVisitReading40 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReading();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReading fieldVisitReading42 = fieldVisitReading40.setUseLocationDatumAsReference((java.lang.Boolean) true);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitApproval fieldVisitApproval43 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitApproval();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReading fieldVisitReading44 = fieldVisitReading42.setApproval(fieldVisitApproval43);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReading fieldVisitReading45 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReading();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReading fieldVisitReading47 = fieldVisitReading45.setUseLocationDatumAsReference((java.lang.Boolean) true);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReading fieldVisitReading49 = fieldVisitReading47.setParameter("0001-01-01T00:00:00.000Z");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReading fieldVisitReading50 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReading();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReading fieldVisitReading52 = fieldVisitReading50.setUseLocationDatumAsReference((java.lang.Boolean) true);
        fieldVisitReading52.Manufacturer = "https";
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReading fieldVisitReading55 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReading();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReading fieldVisitReading57 = fieldVisitReading55.setUseLocationDatumAsReference((java.lang.Boolean) true);
        java.lang.String str58 = fieldVisitReading57.getFieldVisitIdentifier();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReading[] fieldVisitReadingArray59 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReading[] { fieldVisitReading1, fieldVisitReading6, fieldVisitReading9, fieldVisitReading13, fieldVisitReading21, fieldVisitReading24, fieldVisitReading27, fieldVisitReading35, fieldVisitReading38, fieldVisitReading42, fieldVisitReading49, fieldVisitReading52, fieldVisitReading57 };
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReading> fieldVisitReadingList60 = new java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReading>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReading>) fieldVisitReadingList60, fieldVisitReadingArray59);
        fieldVisitReadingsByLocationServiceResponse0.FieldVisitReadings = fieldVisitReadingList60;
        org.junit.Assert.assertNotNull(fieldVisitReading4);
        org.junit.Assert.assertNotNull(fieldVisitReading6);
        org.junit.Assert.assertNull(strList10);
        org.junit.Assert.assertNull(strList14);
        org.junit.Assert.assertNotNull(instant17);
        org.junit.Assert.assertNotNull(fieldVisitReading21);
        org.junit.Assert.assertNotNull(fieldVisitReading24);
        org.junit.Assert.assertNull(strList28);
        org.junit.Assert.assertNotNull(instant31);
        org.junit.Assert.assertNotNull(fieldVisitReading35);
        org.junit.Assert.assertNotNull(fieldVisitReading37);
        org.junit.Assert.assertNull(strList39);
        org.junit.Assert.assertNotNull(fieldVisitReading42);
        org.junit.Assert.assertNotNull(fieldVisitReading44);
        org.junit.Assert.assertNotNull(fieldVisitReading47);
        org.junit.Assert.assertNotNull(fieldVisitReading49);
        org.junit.Assert.assertNotNull(fieldVisitReading52);
        org.junit.Assert.assertNotNull(fieldVisitReading57);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNotNull(fieldVisitReadingArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
    }

    @Test
    public void test00609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00609");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeterType meterType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeterType.Unknown;
        org.junit.Assert.assertTrue("'" + meterType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeterType.Unknown + "'", meterType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeterType.Unknown));
    }

    @Test
    public void test00610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00610");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.StagePoint stagePoint0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.StagePoint();
        java.lang.Double double1 = stagePoint0.InputValue;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.StagePoint stagePoint3 = stagePoint0.setCorrectedValue((java.lang.Double) 0.0d);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.StagePoint stagePoint5 = stagePoint0.setCorrectedValue((java.lang.Double) 0.0d);
        java.lang.Double double6 = stagePoint5.InputValue;
        org.junit.Assert.assertNull(double1);
        org.junit.Assert.assertNotNull(stagePoint3);
        org.junit.Assert.assertNotNull(stagePoint5);
        org.junit.Assert.assertNull(double6);
    }

    @Test
    public void test00611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00611");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutUserRoleBase putUserRoleBase0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutUserRoleBase();
        java.lang.String str1 = putUserRoleBase0.getUserUniqueId();
        putUserRoleBase0.UserUniqueId = "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ";
        java.lang.String str4 = putUserRoleBase0.getRoleUniqueId();
        java.lang.String str5 = putUserRoleBase0.getRoleUniqueId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00612");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutParameter putParameter0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutParameter();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ParameterBase parameterBase2 = putParameter0.setUnitGroupIdentifier("/AQUARIUS/Provisioning/v1");
        java.lang.String str3 = putParameter0.getRoundingSpec();
        java.lang.String str4 = putParameter0.getUnitGroupIdentifier();
        java.lang.Object obj5 = putParameter0.getResponseType();
        java.lang.String str6 = putParameter0.getIdentifier();
        org.junit.Assert.assertNotNull(parameterBase2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "/AQUARIUS/Provisioning/v1" + "'", str4, "/AQUARIUS/Provisioning/v1");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning$Parameter");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning$Parameter");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning$Parameter");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00613");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutOpenIdConnectUser putOpenIdConnectUser0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutOpenIdConnectUser();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.UserBase userBase2 = putOpenIdConnectUser0.setCanConfigureSystem((java.lang.Boolean) true);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutOpenIdConnectUser putOpenIdConnectUser4 = putOpenIdConnectUser0.setIdentifier("/AQUARIUS/Acquisition/v2");
        java.lang.String str5 = putOpenIdConnectUser0.Identifier;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.UserBase userBase7 = putOpenIdConnectUser0.setLoginName("/AQUARIUS/Acquisition/v2");
        java.lang.String str8 = putOpenIdConnectUser0.UniqueId;
        org.junit.Assert.assertNotNull(userBase2);
        org.junit.Assert.assertNotNull(putOpenIdConnectUser4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/AQUARIUS/Acquisition/v2" + "'", str5, "/AQUARIUS/Acquisition/v2");
        org.junit.Assert.assertNotNull(userBase7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00614");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetUnitGroups getUnitGroups0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetUnitGroups();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetUnitGroupsSystemCodeType getUnitGroupsSystemCodeType1 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetUnitGroups getUnitGroups2 = getUnitGroups0.setSystemCode(getUnitGroupsSystemCodeType1);
        java.lang.Object obj3 = getUnitGroups2.getResponseType();
        getUnitGroups2.CustomId = "hi!:///AQUARIUS/Provisioning/v1";
        org.junit.Assert.assertNotNull(getUnitGroups2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$SearchResultUnitGroup");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$SearchResultUnitGroup");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$SearchResultUnitGroup");
    }

    @Test
    public void test00615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00615");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItem importItem0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItem();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_1 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        getObservationsV2_1.SpecimenIds = strList4;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags7 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray11 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags14 = putLocationTags7.setTagUniqueIds(strList12);
        getObservationsV2_1.QualityControlTypes = strList12;
        java.util.List<java.lang.String> strList16 = getObservationsV2_1.getLabReportIds();
        importItem0.Errors = getObservationsV2_1;
        java.lang.Object obj18 = importItem0.getExistingItem();
        importItem0.Input = "hi!";
        java.lang.Object obj21 = importItem0.getItem();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemStatusType importItemStatusType22 = com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemStatusType.SKIPPED;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItem importItem23 = importItem0.setStatus(importItemStatusType22);
        java.util.List<java.lang.String> strList24 = importItem0.Fields;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(putLocationTags14);
        org.junit.Assert.assertNull(strList16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + importItemStatusType22 + "' != '" + com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemStatusType.SKIPPED + "'", importItemStatusType22.equals(com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemStatusType.SKIPPED));
        org.junit.Assert.assertNotNull(importItem23);
        org.junit.Assert.assertNull(strList24);
    }

    @Test
    public void test00616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00616");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        getObservationsV2_0.SpecimenIds = strList3;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags6 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray10 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags13 = putLocationTags6.setTagUniqueIds(strList11);
        getObservationsV2_0.QualityControlTypes = strList11;
        java.util.List<java.lang.String> strList15 = getObservationsV2_0.getAnalyticalGroupIds();
        java.util.List<java.lang.String> strList16 = getObservationsV2_0.DataClassifications;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.FieldResultType fieldResultType17 = getObservationsV2_0.FieldResultType;
        java.time.Instant instant18 = getObservationsV2_0.getEndObservedTime();
        java.lang.String str19 = getObservationsV2_0.CustomId;
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(putLocationTags13);
        org.junit.Assert.assertNull(strList15);
        org.junit.Assert.assertNull(strList16);
        org.junit.Assert.assertNull(fieldResultType17);
        org.junit.Assert.assertNull(instant18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test00617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00617");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutActivity putActivity0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutActivity();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Quantity quantity1 = null;
        putActivity0.Depth = quantity1;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.MetricResult[] metricResultArray3 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.MetricResult[] {};
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.MetricResult> metricResultList4 = new java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.MetricResult>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.MetricResult>) metricResultList4, metricResultArray3);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutActivity putActivity6 = putActivity0.setMetricResults((java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.MetricResult>) metricResultList4);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingLocation samplingLocation7 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutActivity putActivity8 = putActivity6.setSamplingLocation(samplingLocation7);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Device device9 = putActivity8.Device;
        org.junit.Assert.assertNotNull(metricResultArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(putActivity6);
        org.junit.Assert.assertNotNull(putActivity8);
        org.junit.Assert.assertNull(device9);
    }

    @Test
    public void test00618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00618");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutUnit putUnit0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutUnit();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutUnit putUnit2 = putUnit0.setName("MinInstant");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutUnit putUnit4 = putUnit0.setId("/AQUARIUS");
        java.lang.String str5 = putUnit0.getCustomId();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.UnitGroup unitGroup6 = putUnit0.getUnitGroup();
        org.junit.Assert.assertNotNull(putUnit2);
        org.junit.Assert.assertNotNull(putUnit4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(unitGroup6);
    }

    @Test
    public void test00619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00619");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostDetectioncondition postDetectioncondition0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostDetectioncondition();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes1 = postDetectioncondition0.getAuditAttributes();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostDetectioncondition postDetectioncondition3 = postDetectioncondition0.setId("9999-12-31T23:59:59.999Z");
        postDetectioncondition0.Description = "9999-12-31T23:59:59.999Z";
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostDetectioncondition postDetectioncondition7 = postDetectioncondition0.setId("/AQUARIUS/Provisioning/v1");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostDetectioncondition postDetectioncondition9 = postDetectioncondition7.setId("MinInstant");
        java.lang.String str10 = postDetectioncondition7.getName();
        org.junit.Assert.assertNull(auditAttributes1);
        org.junit.Assert.assertNotNull(postDetectioncondition3);
        org.junit.Assert.assertNotNull(postDetectioncondition7);
        org.junit.Assert.assertNotNull(postDetectioncondition9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00620");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.FieldVisitSimple fieldVisitSimple0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.FieldVisitSimple();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingLocationSimple samplingLocationSimple1 = fieldVisitSimple0.getSamplingLocation();
        java.lang.String str2 = fieldVisitSimple0.getId();
        fieldVisitSimple0.Notes = "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ";
        org.junit.Assert.assertNull(samplingLocationSimple1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00621");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroup analyticalGroup0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroup();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes1 = null;
        analyticalGroup0.AuditAttributes = auditAttributes1;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroup analyticalGroup4 = analyticalGroup0.setNumberOfObservedPropertiesInGroupItems((java.lang.Integer) 10);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingContextTag samplingContextTag5 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingContextTag();
        java.lang.String str6 = samplingContextTag5.getDescription();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes7 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingContextTag samplingContextTag8 = samplingContextTag5.setAuditAttributes(auditAttributes7);
        java.lang.String str9 = samplingContextTag5.getName();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalysisMethodSimple analysisMethodSimple10 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalysisMethodSimple();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutDetectioncondition putDetectioncondition11 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutDetectioncondition();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes12 = putDetectioncondition11.getAuditAttributes();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutDetectioncondition putDetectioncondition14 = putDetectioncondition11.setCustomId("http");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingPlanPlannedActivity samplingPlanPlannedActivity15 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingPlanPlannedActivity();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes16 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingPlanPlannedActivity samplingPlanPlannedActivity17 = samplingPlanPlannedActivity15.setAuditAttributes(auditAttributes16);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes18 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes20 = auditAttributes18.setCreationUserProfileId("'.'SSSSSSS");
        samplingPlanPlannedActivity17.AuditAttributes = auditAttributes18;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes22 = samplingPlanPlannedActivity17.AuditAttributes;
        putDetectioncondition11.AuditAttributes = auditAttributes22;
        analysisMethodSimple10.AuditAttributes = auditAttributes22;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingContextTag samplingContextTag25 = samplingContextTag5.setAuditAttributes(auditAttributes22);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroup analyticalGroup26 = analyticalGroup0.setAuditAttributes(auditAttributes22);
        java.lang.String str27 = analyticalGroup0.Id;
        org.junit.Assert.assertNotNull(analyticalGroup4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(samplingContextTag8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(auditAttributes12);
        org.junit.Assert.assertNotNull(putDetectioncondition14);
        org.junit.Assert.assertNotNull(samplingPlanPlannedActivity17);
        org.junit.Assert.assertNotNull(auditAttributes20);
        org.junit.Assert.assertNotNull(auditAttributes22);
        org.junit.Assert.assertNotNull(samplingContextTag25);
        org.junit.Assert.assertNotNull(analyticalGroup26);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test00622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00622");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary2 = dischargeSummary0.setPublish((java.lang.Boolean) false);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DoubleWithDisplay doubleWithDisplay3 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DoubleWithDisplay();
        dischargeSummary2.DifferenceDuringVisit = doubleWithDisplay3;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Adjustment adjustment5 = dischargeSummary2.getAdjustment();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeUncertainty dischargeUncertainty6 = null;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary7 = dischargeSummary2.setDischargeUncertainty(dischargeUncertainty6);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.QuantityWithDisplay quantityWithDisplay8 = null;
        dischargeSummary2.AlternateRatingDischarge = quantityWithDisplay8;
        org.junit.Assert.assertNotNull(dischargeSummary2);
        org.junit.Assert.assertNull(adjustment5);
        org.junit.Assert.assertNotNull(dischargeSummary7);
    }

    @Test
    public void test00623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00623");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutObservedProperty putObservedProperty0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutObservedProperty();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Quantity quantity1 = putObservedProperty0.LowerLimit;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutObservedProperty putObservedProperty3 = putObservedProperty0.setDescription("");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutObservedProperty putObservedProperty5 = putObservedProperty3.setDescription("2021.4.62.0");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Quantity quantity6 = putObservedProperty3.UpperLimit;
        org.junit.Assert.assertNull(quantity1);
        org.junit.Assert.assertNotNull(putObservedProperty3);
        org.junit.Assert.assertNotNull(putObservedProperty5);
        org.junit.Assert.assertNull(quantity6);
    }

    @Test
    public void test00624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00624");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CalibrationCheck calibrationCheck0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CalibrationCheck();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CalibrationCheckType calibrationCheckType1 = calibrationCheck0.getCalibrationCheckType();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DoubleWithDisplay doubleWithDisplay2 = calibrationCheck0.Value;
        java.lang.String str3 = calibrationCheck0.getModel();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DoubleWithDisplay doubleWithDisplay4 = calibrationCheck0.Standard;
        java.lang.String str5 = calibrationCheck0.MonitoringMethod;
        java.lang.String str6 = calibrationCheck0.SensorUniqueId;
        java.lang.Boolean boolean7 = calibrationCheck0.IsValid;
        java.lang.String str8 = calibrationCheck0.getSubLocationIdentifier();
        org.junit.Assert.assertNull(calibrationCheckType1);
        org.junit.Assert.assertNull(doubleWithDisplay2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleWithDisplay4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00625");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutUnitGroupWithUnit putUnitGroupWithUnit0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutUnitGroupWithUnit();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutUnitGroupWithUnit putUnitGroupWithUnit2 = putUnitGroupWithUnit0.setId("yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.UnitGroupSystemCodeType unitGroupSystemCodeType3 = putUnitGroupWithUnit0.SystemCode;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutUnitGroupWithUnit putUnitGroupWithUnit5 = putUnitGroupWithUnit0.setCustomId("/AQUARIUS/Acquisition/v2");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.UnitGroupSystemCodeType unitGroupSystemCodeType6 = putUnitGroupWithUnit5.SystemCode;
        org.junit.Assert.assertNotNull(putUnitGroupWithUnit2);
        org.junit.Assert.assertNull(unitGroupSystemCodeType3);
        org.junit.Assert.assertNotNull(putUnitGroupWithUnit5);
        org.junit.Assert.assertNull(unitGroupSystemCodeType6);
    }

    @Test
    public void test00626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00626");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_6 = getObservationsV2_0.setDataClassifications((java.util.List<java.lang.String>) strList4);
        getObservationsV2_6.DepthUnitCustomId = "hi!";
        java.lang.String str9 = getObservationsV2_6.DepthUnitId;
        java.util.List<java.lang.String> strList10 = getObservationsV2_6.LabResultLaboratoryIds;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_12 = getObservationsV2_6.setSpecimenName("/AQUARIUS/Provisioning/v1");
        java.util.List<java.lang.String> strList13 = getObservationsV2_12.getActivityIds();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SampleFractionType sampleFractionType14 = getObservationsV2_12.getSampleFraction();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(getObservationsV2_6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strList10);
        org.junit.Assert.assertNotNull(getObservationsV2_12);
        org.junit.Assert.assertNull(strList13);
        org.junit.Assert.assertNull(sampleFractionType14);
    }

    @Test
    public void test00627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00627");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetFieldVisits getFieldVisits0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetFieldVisits();
        java.lang.Integer int1 = getFieldVisits0.Limit;
        java.util.List<java.lang.String> strList2 = getFieldVisits0.getProjectIds();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetSpecimens getSpecimens3 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetSpecimens();
        java.util.List<java.lang.String> strList4 = getSpecimens3.getActivityIds();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutUserV2 putUserV2_5 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutUserV2();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.UserType userType6 = putUserV2_5.UserType;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetActivities getActivities7 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetActivities();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse8 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary9 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary11 = dischargeSummary9.setPublish((java.lang.Boolean) false);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse12 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse();
        java.time.Instant instant13 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse14 = locationDescriptionListServiceResponse12.setNextToken(instant13);
        dischargeSummary9.MeasurementTime = instant13;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse16 = locationDescriptionListServiceResponse8.setNextToken(instant13);
        java.time.Instant instant17 = locationDescriptionListServiceResponse8.getNextToken();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetActivities getActivities18 = getActivities7.setToStartTime(instant17);
        java.lang.String str19 = getActivities18.getSort();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_20 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.util.List<java.lang.String> strList21 = getObservationsV2_20.SamplingContextTagIds;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_22 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        getObservationsV2_22.SpecimenIds = strList25;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags28 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray32 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags35 = putLocationTags28.setTagUniqueIds(strList33);
        getObservationsV2_22.QualityControlTypes = strList33;
        getObservationsV2_20.ResultGrades = strList33;
        getActivities18.Media = strList33;
        putUserV2_5.AccessGroups = strList33;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetSpecimens getSpecimens40 = getSpecimens3.setAnalyticalGroupIds((java.util.List<java.lang.String>) strList33);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetFieldVisits getFieldVisits41 = getFieldVisits0.setSearch((java.util.List<java.lang.String>) strList33);
        java.util.List<java.lang.String> strList42 = getFieldVisits41.ScheduleIds;
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(strList4);
        org.junit.Assert.assertNull(userType6);
        org.junit.Assert.assertNotNull(dischargeSummary11);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(locationDescriptionListServiceResponse14);
        org.junit.Assert.assertNotNull(locationDescriptionListServiceResponse16);
        org.junit.Assert.assertNotNull(instant17);
        org.junit.Assert.assertNotNull(getActivities18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(strList21);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(putLocationTags35);
        org.junit.Assert.assertNotNull(getSpecimens40);
        org.junit.Assert.assertNotNull(getFieldVisits41);
        org.junit.Assert.assertNull(strList42);
    }

    @Test
    public void test00628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00628");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_6 = getObservationsV2_0.setDataClassifications((java.util.List<java.lang.String>) strList4);
        getObservationsV2_6.DepthUnitCustomId = "hi!";
        java.lang.String str9 = getObservationsV2_6.DepthUnitId;
        java.util.List<java.lang.String> strList10 = null;
        getObservationsV2_6.ProjectIds = strList10;
        java.util.List<java.lang.String> strList12 = getObservationsV2_6.getResultStatuses();
        java.util.List<java.lang.String> strList13 = getObservationsV2_6.getLabReportIds();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(getObservationsV2_6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strList12);
        org.junit.Assert.assertNull(strList13);
    }

    @Test
    public void test00629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00629");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostUnitGroup postUnitGroup0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostUnitGroup();
        java.lang.Integer int1 = postUnitGroup0.getTimeDimension();
        postUnitGroup0.BaseUnitIdentifier = "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ";
        java.lang.Integer int4 = postUnitGroup0.IntensityDimension;
        postUnitGroup0.GroupIdentifier = "/AQUARIUS/Acquisition/v2://9999-12-31T23:59:59.999Z";
        java.lang.Integer int7 = postUnitGroup0.getCurrentDimension();
        java.lang.Integer int8 = postUnitGroup0.getTimeDimension();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.UnitGroupBase unitGroupBase10 = postUnitGroup0.setMassDimension((java.lang.Integer) 100);
        unitGroupBase10.TimeDimension = 100;
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNotNull(unitGroupBase10);
    }

    @Test
    public void test00630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00630");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary2 = dischargeSummary0.setMeanGageHeightMethod("hi!");
        java.lang.String str3 = dischargeSummary2.MeasurementId;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary5 = dischargeSummary2.setDischargeMethod("yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSSSSSZZZZZ");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.QuantityWithDisplay quantityWithDisplay6 = null;
        dischargeSummary5.Discharge = quantityWithDisplay6;
        org.junit.Assert.assertNotNull(dischargeSummary2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(dischargeSummary5);
    }

    @Test
    public void test00631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00631");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupSimple analyticalGroupSimple0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupSimple();
        java.lang.Integer int1 = analyticalGroupSimple0.getNumberOfAnalysisMethodsInGroupItems();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupSimple analyticalGroupSimple3 = analyticalGroupSimple0.setNumberOfAnalysisMethodsInGroupItems((java.lang.Integer) 10);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupSimpleType analyticalGroupSimpleType4 = analyticalGroupSimple3.Type;
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(analyticalGroupSimple3);
        org.junit.Assert.assertNull(analyticalGroupSimpleType4);
    }

    @Test
    public void test00632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00632");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Reading reading0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Reading();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DoubleWithDisplay doubleWithDisplay1 = reading0.getValue();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Reading reading3 = reading0.setParameterId("hi!");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Reading reading5 = reading3.setModel("MaxInstant");
        reading5.NodeDetails = "https";
        reading5.MonitoringMethod = "MaxDuration";
        org.junit.Assert.assertNull(doubleWithDisplay1);
        org.junit.Assert.assertNotNull(reading3);
        org.junit.Assert.assertNotNull(reading5);
    }

    @Test
    public void test00633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00633");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.GetAuthTokenServiceRequest getAuthTokenServiceRequest0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.GetAuthTokenServiceRequest();
        java.lang.String str1 = getAuthTokenServiceRequest0.getUsername();
        getAuthTokenServiceRequest0.Locale = "9999-12-31T23:59:59.999Z";
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.GetAuthTokenServiceRequest getAuthTokenServiceRequest5 = getAuthTokenServiceRequest0.setLocale("/AQUARIUS/Provisioning/v1");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(getAuthTokenServiceRequest5);
    }

    @Test
    public void test00634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00634");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItem importItem0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItem();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_1 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        getObservationsV2_1.SpecimenIds = strList4;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags7 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray11 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags14 = putLocationTags7.setTagUniqueIds(strList12);
        getObservationsV2_1.QualityControlTypes = strList12;
        java.util.List<java.lang.String> strList16 = getObservationsV2_1.getLabReportIds();
        importItem0.Errors = getObservationsV2_1;
        java.lang.Object obj18 = importItem0.getExistingItem();
        importItem0.Input = "hi!";
        java.lang.Object obj21 = importItem0.getItem();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemStatusType importItemStatusType22 = com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemStatusType.SKIPPED;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItem importItem23 = importItem0.setStatus(importItemStatusType22);
        importItem23.Input = "/AQUARIUS/Provisioning/v1";
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate specimenTemplate26 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate();
        specimenTemplate26.CustomId = "hi!";
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate specimenTemplate30 = specimenTemplate26.setId("hi!");
        java.lang.Boolean boolean31 = specimenTemplate30.getFiltered();
        importItem23.Item = specimenTemplate30;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Processor processor33 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Processor();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostTag postTag34 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostTag();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_35 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray38 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList39 = new java.util.ArrayList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_41 = getObservationsV2_35.setDataClassifications((java.util.List<java.lang.String>) strList39);
        postTag34.PickListValues = strList39;
        java.util.ArrayList<java.lang.String> strList43 = postTag34.PickListValues;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Processor processor44 = processor33.setInputTimeSeriesUniqueIds(strList43);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItem importItem45 = importItem23.setWarningMessages((java.util.List<java.lang.String>) strList43);
        java.util.List<java.lang.String> strList46 = importItem23.getWarningMessages();
        java.lang.Object obj47 = importItem23.ExistingItem;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(putLocationTags14);
        org.junit.Assert.assertNull(strList16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + importItemStatusType22 + "' != '" + com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemStatusType.SKIPPED + "'", importItemStatusType22.equals(com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemStatusType.SKIPPED));
        org.junit.Assert.assertNotNull(importItem23);
        org.junit.Assert.assertNotNull(specimenTemplate30);
        org.junit.Assert.assertNull(boolean31);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(getObservationsV2_41);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertNotNull(processor44);
        org.junit.Assert.assertNotNull(importItem45);
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertNull(obj47);
    }

    @Test
    public void test00635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00635");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostObservedProperty postObservedProperty0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostObservedProperty();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostObservedProperty postObservedProperty2 = postObservedProperty0.setCustomId("hi!");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes3 = postObservedProperty0.AuditAttributes;
        postObservedProperty0.Description = "multipart/form-data; boundary=****bbcf5f9e-6ccf-4b63-91ab-6e645caf02af****";
        org.junit.Assert.assertNotNull(postObservedProperty2);
        org.junit.Assert.assertNull(auditAttributes3);
    }

    @Test
    public void test00636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00636");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeterSuspensionType meterSuspensionType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeterSuspensionType.BReel;
        org.junit.Assert.assertTrue("'" + meterSuspensionType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeterSuspensionType.BReel + "'", meterSuspensionType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeterSuspensionType.BReel));
    }

    @Test
    public void test00637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00637");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.OpenIdConnectRelyingPartyConfiguration openIdConnectRelyingPartyConfiguration0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.OpenIdConnectRelyingPartyConfiguration();
        java.lang.String str1 = openIdConnectRelyingPartyConfiguration0.getClientIdentifier();
        java.lang.String str2 = openIdConnectRelyingPartyConfiguration0.getClientIdentifier();
        openIdConnectRelyingPartyConfiguration0.DisplayName = "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00638");
        // The following exception was thrown during execution in test generation
        try {
            java.time.Duration duration1 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.DurationDeserializer.parse("9999-12-31T23:59:59.999Z");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text cannot be parsed to a Duration");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00639");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostCalculatedDerivedTimeSeries postCalculatedDerivedTimeSeries0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostCalculatedDerivedTimeSeries();
        postCalculatedDerivedTimeSeries0.Parameter = "/AQUARIUS/Acquisition/v2";
        postCalculatedDerivedTimeSeries0.Label = "/AQUARIUS/Acquisition/v2";
        java.lang.String str5 = postCalculatedDerivedTimeSeries0.Parameter;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/AQUARIUS/Acquisition/v2" + "'", str5, "/AQUARIUS/Acquisition/v2");
    }

    @Test
    public void test00640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00640");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Filter filter0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Filter();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Filter filter2 = filter0.setId("2021.4.62.0");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Filter filter4 = filter2.setId("POST");
        filter2.Description = "2021.4.62.0";
        org.junit.Assert.assertNotNull(filter2);
        org.junit.Assert.assertNotNull(filter4);
    }

    @Test
    public void test00641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00641");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.DeleteReferencePoint deleteReferencePoint0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.DeleteReferencePoint();
        java.lang.String str1 = deleteReferencePoint0.ReferencePointUniqueId;
        deleteReferencePoint0.LocationUniqueId = "hi!:///AQUARIUS/Provisioning/v1";
        deleteReferencePoint0.LocationUniqueId = "0001-01-01T00:00:00.000Z";
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test00642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00642");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemSamplingLocation importItemSamplingLocation0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemSamplingLocation();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemSamplingLocation importItemSamplingLocation2 = importItemSamplingLocation0.setInput("yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItem importItem3 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItem();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_4 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        getObservationsV2_4.SpecimenIds = strList7;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags10 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray14 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags17 = putLocationTags10.setTagUniqueIds(strList15);
        getObservationsV2_4.QualityControlTypes = strList15;
        java.util.List<java.lang.String> strList19 = getObservationsV2_4.getLabReportIds();
        importItem3.Errors = getObservationsV2_4;
        java.lang.Object obj21 = importItem3.getExistingItem();
        importItem3.Input = "hi!";
        java.lang.Object obj24 = importItem3.getItem();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemStatusType importItemStatusType25 = com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemStatusType.SKIPPED;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItem importItem26 = importItem3.setStatus(importItemStatusType25);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemSamplingLocation importItemSamplingLocation27 = importItemSamplingLocation2.setStatus(importItemStatusType25);
        importItemSamplingLocation2.RowId = "multipart/form-data; boundary=****bbcf5f9e-6ccf-4b63-91ab-6e645caf02af****";
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_30 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray33 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_36 = getObservationsV2_30.setDataClassifications((java.util.List<java.lang.String>) strList34);
        getObservationsV2_36.DepthUnitCustomId = "hi!";
        java.lang.String str39 = getObservationsV2_36.CustomId;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_40 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        getObservationsV2_40.SpecimenIds = strList43;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags46 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray50 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList51 = new java.util.ArrayList<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList51, strArray50);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags53 = putLocationTags46.setTagUniqueIds(strList51);
        getObservationsV2_40.ActivityIds = strList51;
        getObservationsV2_36.ResultStatuses = strList51;
        getObservationsV2_36.FieldVisitId = "9999-12-31T23:59:59.999Z";
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_58 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray61 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList62 = new java.util.ArrayList<java.lang.String>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList62, strArray61);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_64 = getObservationsV2_58.setDataClassifications((java.util.List<java.lang.String>) strList62);
        java.util.List<java.lang.String> strList65 = getObservationsV2_58.ResultGrades;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary66 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary();
        dischargeSummary66.Reviewer = "";
        java.time.Instant instant69 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        dischargeSummary66.MeasurementTime = instant69;
        getObservationsV2_58.StartResultTime = instant69;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest timeAlignedDataServiceRequest72 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ControlConditionActivity controlConditionActivity73 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ControlConditionActivity();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ControlCleanedType controlCleanedType74 = null;
        controlConditionActivity73.ControlCleaned = controlCleanedType74;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse76 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse();
        java.time.Instant instant77 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse78 = locationDescriptionListServiceResponse76.setNextToken(instant77);
        controlConditionActivity73.DateCleaned = instant77;
        timeAlignedDataServiceRequest72.QueryFrom = instant77;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_81 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray83 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList84 = new java.util.ArrayList<java.lang.String>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList84, strArray83);
        getObservationsV2_81.SpecimenIds = strList84;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags87 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray91 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList92 = new java.util.ArrayList<java.lang.String>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList92, strArray91);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags94 = putLocationTags87.setTagUniqueIds(strList92);
        getObservationsV2_81.ActivityIds = strList92;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest timeAlignedDataServiceRequest96 = timeAlignedDataServiceRequest72.setTimeSeriesOutputUnitIds(strList92);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_97 = getObservationsV2_58.setCollectionMethodIds((java.util.List<java.lang.String>) strList92);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_98 = getObservationsV2_36.setSpecimenIds((java.util.List<java.lang.String>) strList92);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemSamplingLocation importItemSamplingLocation99 = importItemSamplingLocation2.setFields((java.util.List<java.lang.String>) strList92);
        org.junit.Assert.assertNotNull(importItemSamplingLocation2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(putLocationTags17);
        org.junit.Assert.assertNull(strList19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + importItemStatusType25 + "' != '" + com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemStatusType.SKIPPED + "'", importItemStatusType25.equals(com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemStatusType.SKIPPED));
        org.junit.Assert.assertNotNull(importItem26);
        org.junit.Assert.assertNotNull(importItemSamplingLocation27);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(getObservationsV2_36);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(putLocationTags53);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(getObservationsV2_64);
        org.junit.Assert.assertNull(strList65);
        org.junit.Assert.assertNotNull(instant69);
        org.junit.Assert.assertNotNull(instant77);
        org.junit.Assert.assertNotNull(locationDescriptionListServiceResponse78);
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(strArray91);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertNotNull(putLocationTags94);
        org.junit.Assert.assertNotNull(timeAlignedDataServiceRequest96);
        org.junit.Assert.assertNotNull(getObservationsV2_97);
        org.junit.Assert.assertNotNull(getObservationsV2_98);
        org.junit.Assert.assertNotNull(importItemSamplingLocation99);
    }

    @Test
    public void test00643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00643");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeterType meterType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeterType.TimeOfTravel;
        org.junit.Assert.assertTrue("'" + meterType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeterType.TimeOfTravel + "'", meterType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeterType.TimeOfTravel));
    }

    @Test
    public void test00644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00644");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_6 = getObservationsV2_0.setDataClassifications((java.util.List<java.lang.String>) strList4);
        getObservationsV2_6.DepthUnitCustomId = "hi!";
        java.lang.String str9 = getObservationsV2_6.CustomId;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_10 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        getObservationsV2_10.SpecimenIds = strList13;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags16 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray20 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags23 = putLocationTags16.setTagUniqueIds(strList21);
        getObservationsV2_10.ActivityIds = strList21;
        getObservationsV2_6.ResultStatuses = strList21;
        getObservationsV2_6.FieldVisitId = "9999-12-31T23:59:59.999Z";
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_28 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray31 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_34 = getObservationsV2_28.setDataClassifications((java.util.List<java.lang.String>) strList32);
        java.util.List<java.lang.String> strList35 = getObservationsV2_28.ResultGrades;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary36 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary();
        dischargeSummary36.Reviewer = "";
        java.time.Instant instant39 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        dischargeSummary36.MeasurementTime = instant39;
        getObservationsV2_28.StartResultTime = instant39;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest timeAlignedDataServiceRequest42 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ControlConditionActivity controlConditionActivity43 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ControlConditionActivity();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ControlCleanedType controlCleanedType44 = null;
        controlConditionActivity43.ControlCleaned = controlCleanedType44;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse46 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse();
        java.time.Instant instant47 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse48 = locationDescriptionListServiceResponse46.setNextToken(instant47);
        controlConditionActivity43.DateCleaned = instant47;
        timeAlignedDataServiceRequest42.QueryFrom = instant47;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_51 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray53 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList54 = new java.util.ArrayList<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList54, strArray53);
        getObservationsV2_51.SpecimenIds = strList54;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags57 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray61 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList62 = new java.util.ArrayList<java.lang.String>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList62, strArray61);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags64 = putLocationTags57.setTagUniqueIds(strList62);
        getObservationsV2_51.ActivityIds = strList62;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest timeAlignedDataServiceRequest66 = timeAlignedDataServiceRequest42.setTimeSeriesOutputUnitIds(strList62);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_67 = getObservationsV2_28.setCollectionMethodIds((java.util.List<java.lang.String>) strList62);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_68 = getObservationsV2_6.setSpecimenIds((java.util.List<java.lang.String>) strList62);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetLabReportImportHistoryEvents getLabReportImportHistoryEvents69 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetLabReportImportHistoryEvents();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags70 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray74 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList75 = new java.util.ArrayList<java.lang.String>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList75, strArray74);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags77 = putLocationTags70.setTagUniqueIds(strList75);
        java.util.ArrayList<java.lang.String> strList78 = putLocationTags77.TagUniqueIds;
        getLabReportImportHistoryEvents69.LabReportIds = strList78;
        getObservationsV2_68.TaxonIds = strList78;
        java.lang.String str81 = getObservationsV2_68.getImportHistoryEventId();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(getObservationsV2_6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(putLocationTags23);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(getObservationsV2_34);
        org.junit.Assert.assertNull(strList35);
        org.junit.Assert.assertNotNull(instant39);
        org.junit.Assert.assertNotNull(instant47);
        org.junit.Assert.assertNotNull(locationDescriptionListServiceResponse48);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(putLocationTags64);
        org.junit.Assert.assertNotNull(timeAlignedDataServiceRequest66);
        org.junit.Assert.assertNotNull(getObservationsV2_67);
        org.junit.Assert.assertNotNull(getObservationsV2_68);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(putLocationTags77);
        org.junit.Assert.assertNotNull(strList78);
        org.junit.Assert.assertNull(str81);
    }

    @Test
    public void test00645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00645");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutSamplingLocation putSamplingLocation0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutSamplingLocation();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutSamplingLocation putSamplingLocation2 = putSamplingLocation0.setCustomId("https");
        java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ExtendedAttribute> extendedAttributeList3 = putSamplingLocation0.ExtendedAttributes;
        java.lang.String str4 = putSamplingLocation0.Description;
        putSamplingLocation0.CustomId = "POST";
        org.junit.Assert.assertNotNull(putSamplingLocation2);
        org.junit.Assert.assertNull(extendedAttributeList3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00646");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Sensor sensor0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Sensor();
        java.time.Instant instant1 = sensor0.getLastModifiedUtc();
        java.time.Instant instant2 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Sensor sensor3 = sensor0.setLastModifiedUtc(instant2);
        java.lang.String str4 = sensor0.ParameterId;
        java.lang.String str5 = sensor0.getLocationUniqueId();
        sensor0.Name = "yyyy'-'MM'-'dd'T'HH':'mm':'ss";
        java.lang.String str8 = sensor0.UnitId;
        org.junit.Assert.assertNull(instant1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(sensor3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00647");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostFieldVisitActivityWithTemplate postFieldVisitActivityWithTemplate0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostFieldVisitActivityWithTemplate();
        java.lang.String str1 = postFieldVisitActivityWithTemplate0.getId();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.CollectionMethod collectionMethod2 = null;
        postFieldVisitActivityWithTemplate0.CollectionMethod = collectionMethod2;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ActivityTemplateType activityTemplateType4 = postFieldVisitActivityWithTemplate0.getType();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingPlan samplingPlan5 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingPlan();
        samplingPlan5.SamplingLocationGroupSelectionTypeRandomCount = 0;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingLocationGroupSelectionType samplingLocationGroupSelectionType8 = com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingLocationGroupSelectionType.ALL;
        samplingPlan5.SamplingLocationGroupSelectionType = samplingLocationGroupSelectionType8;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingLocationGroup samplingLocationGroup10 = samplingPlan5.getSamplingLocationGroup();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes11 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingPlan samplingPlan12 = samplingPlan5.setAuditAttributes(auditAttributes11);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostFieldVisitActivityWithTemplate postFieldVisitActivityWithTemplate13 = postFieldVisitActivityWithTemplate0.setAuditAttributes(auditAttributes11);
        java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate> specimenTemplateList14 = postFieldVisitActivityWithTemplate13.getSpecimenTemplates();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(activityTemplateType4);
        org.junit.Assert.assertTrue("'" + samplingLocationGroupSelectionType8 + "' != '" + com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingLocationGroupSelectionType.ALL + "'", samplingLocationGroupSelectionType8.equals(com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingLocationGroupSelectionType.ALL));
        org.junit.Assert.assertNull(samplingLocationGroup10);
        org.junit.Assert.assertNotNull(samplingPlan12);
        org.junit.Assert.assertNotNull(postFieldVisitActivityWithTemplate13);
        org.junit.Assert.assertNull(specimenTemplateList14);
    }

    @Test
    public void test00648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00648");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.FieldVisitStatistics fieldVisitStatistics0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.FieldVisitStatistics();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.FieldVisitStatistics fieldVisitStatistics2 = fieldVisitStatistics0.setVerticalProfileCount((java.lang.Integer) 10);
        fieldVisitStatistics2.FieldResultCount = 10;
        org.junit.Assert.assertNotNull(fieldVisitStatistics2);
    }

    @Test
    public void test00649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00649");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostSession postSession0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostSession();
        postSession0.Username = "9999-12-31T23:59:59.999Z";
    }

    @Test
    public void test00650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00650");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationRemark locationRemark0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationRemark();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationRemark locationRemark2 = locationRemark0.setDescription("MaxInstant");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitDataServiceResponse fieldVisitDataServiceResponse3 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitDataServiceResponse();
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CrossSectionSurveyActivity> crossSectionSurveyActivityList4 = fieldVisitDataServiceResponse3.CrossSectionSurveyActivity;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitDataServiceResponse fieldVisitDataServiceResponse6 = fieldVisitDataServiceResponse3.setIdentifier("");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary7 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary();
        dischargeSummary7.Reviewer = "";
        java.time.Instant instant10 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        dischargeSummary7.MeasurementTime = instant10;
        fieldVisitDataServiceResponse3.ResponseTime = instant10;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationRemark locationRemark13 = locationRemark0.setCreateTime(instant10);
        java.time.Instant instant14 = locationRemark13.getFromTime();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationRemark locationRemark16 = locationRemark13.setRemark("/AQUARIUS");
        java.lang.String str17 = locationRemark13.getDescription();
        org.junit.Assert.assertNotNull(locationRemark2);
        org.junit.Assert.assertNull(crossSectionSurveyActivityList4);
        org.junit.Assert.assertNotNull(fieldVisitDataServiceResponse6);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(locationRemark13);
        org.junit.Assert.assertNull(instant14);
        org.junit.Assert.assertNotNull(locationRemark16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MaxInstant" + "'", str17, "MaxInstant");
    }

    @Test
    public void test00651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00651");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ExtendedAttributeField extendedAttributeField0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ExtendedAttributeField();
        java.lang.Boolean boolean1 = extendedAttributeField0.CanBeEmpty;
        java.lang.Boolean boolean2 = extendedAttributeField0.IsReadOnly;
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNull(boolean2);
    }

    @Test
    public void test00652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00652");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostSensor postSensor0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostSensor();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.SensorBase sensorBase2 = postSensor0.setName("");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.SensorBase sensorBase4 = sensorBase2.setManufacturer("hi!");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.SensorBase sensorBase6 = sensorBase2.setParameterId("yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ");
        java.lang.String str7 = sensorBase6.getMethodCode();
        java.lang.String str8 = sensorBase6.getMethodCode();
        org.junit.Assert.assertNotNull(sensorBase2);
        org.junit.Assert.assertNotNull(sensorBase4);
        org.junit.Assert.assertNotNull(sensorBase6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00653");
        java.lang.Boolean boolean0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.IFieldVisitDataRequest.ApplyRounding;
        org.junit.Assert.assertNull(boolean0);
    }

    @Test
    public void test00654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00654");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Reading reading0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Reading();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DoubleWithDisplay doubleWithDisplay1 = reading0.getValue();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Reading reading3 = reading0.setParameterId("hi!");
        java.lang.String str4 = reading0.MonitoringMethod;
        java.lang.String str5 = reading0.getSensorUniqueId();
        java.util.ArrayList<java.lang.String> strList6 = reading0.getReadingQualifiers();
        java.lang.String str7 = reading0.getComments();
        org.junit.Assert.assertNull(doubleWithDisplay1);
        org.junit.Assert.assertNotNull(reading3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strList6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00655");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_6 = getObservationsV2_0.setDataClassifications((java.util.List<java.lang.String>) strList4);
        getObservationsV2_6.DepthUnitCustomId = "hi!";
        java.lang.String str9 = getObservationsV2_6.CustomId;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_10 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        getObservationsV2_10.SpecimenIds = strList13;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags16 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray20 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags23 = putLocationTags16.setTagUniqueIds(strList21);
        getObservationsV2_10.QualityControlTypes = strList21;
        java.util.List<java.lang.String> strList25 = getObservationsV2_10.getAnalyticalGroupIds();
        java.util.List<java.lang.String> strList26 = getObservationsV2_10.DataClassifications;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.FieldResultType fieldResultType27 = getObservationsV2_10.FieldResultType;
        java.time.Instant instant28 = getObservationsV2_10.getEndObservedTime();
        java.lang.String str29 = getObservationsV2_10.DepthUnitCustomId;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags30 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray34 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags37 = putLocationTags30.setTagUniqueIds(strList35);
        java.util.ArrayList<java.lang.String> strList38 = putLocationTags37.TagUniqueIds;
        getObservationsV2_10.ProjectIds = strList38;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_40 = getObservationsV2_6.setQualityControlTypes((java.util.List<java.lang.String>) strList38);
        java.util.List<java.lang.String> strList41 = getObservationsV2_6.getResultStatuses();
        java.util.List<java.lang.String> strList42 = getObservationsV2_6.ResultGrades;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(getObservationsV2_6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(putLocationTags23);
        org.junit.Assert.assertNull(strList25);
        org.junit.Assert.assertNull(strList26);
        org.junit.Assert.assertNull(fieldResultType27);
        org.junit.Assert.assertNull(instant28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(putLocationTags37);
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertNotNull(getObservationsV2_40);
        org.junit.Assert.assertNull(strList41);
        org.junit.Assert.assertNull(strList42);
    }

    @Test
    public void test00656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00656");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ChartDataPoint chartDataPoint0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ChartDataPoint();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ChartDataPoint chartDataPoint2 = chartDataPoint0.setMdlValueUnitCustomId("MaxInstant");
        chartDataPoint2.ObservationId = "2021.4.62.0";
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ChartDataPoint chartDataPoint6 = chartDataPoint2.setValue((java.lang.Double) 1.0d);
        java.lang.String str7 = chartDataPoint6.DepthUnitCustomId;
        org.junit.Assert.assertNotNull(chartDataPoint2);
        org.junit.Assert.assertNotNull(chartDataPoint6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00657");
        java.util.Map<java.lang.Object, java.lang.reflect.Type> objMap2 = null;
        com.aquaticinformatics.aquarius.sdk.samples.FieldNamer fieldNamer3 = new com.aquaticinformatics.aquarius.sdk.samples.FieldNamer();
        com.aquaticinformatics.aquarius.sdk.helpers.SdkServiceClient sdkServiceClient5 = com.aquaticinformatics.aquarius.sdk.helpers.SdkServiceClient.Create("MaxDuration", "http", objMap2, (com.aquaticinformatics.aquarius.sdk.helpers.IFieldNamer) fieldNamer3, false);
        com.google.gson.GsonBuilder gsonBuilder6 = null;
        // The following exception was thrown during execution in test generation
        try {
            fieldNamer3.configure(gsonBuilder6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sdkServiceClient5);
    }

    @Test
    public void test00658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00658");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.QualityControlType qualityControlType0 = com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.QualityControlType.NORMAL;
        org.junit.Assert.assertTrue("'" + qualityControlType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.QualityControlType.NORMAL + "'", qualityControlType0.equals(com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.QualityControlType.NORMAL));
    }

    @Test
    public void test00659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00659");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutBulkEditResultGradesV2 putBulkEditResultGradesV2_0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutBulkEditResultGradesV2();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ExtendedAttributeField extendedAttributeField1 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ExtendedAttributeField();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ExtendedAttributeField extendedAttributeField3 = extendedAttributeField1.setDisplayName("");
        java.lang.Boolean boolean4 = extendedAttributeField3.CanBeEmpty;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest timeAlignedDataServiceRequest5 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest();
        java.lang.Object obj6 = timeAlignedDataServiceRequest5.getResponseType();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_7 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_13 = getObservationsV2_7.setDataClassifications((java.util.List<java.lang.String>) strList11);
        getObservationsV2_13.DepthUnitCustomId = "hi!";
        java.lang.String str16 = getObservationsV2_13.CustomId;
        java.util.List<java.lang.String> strList17 = getObservationsV2_13.getSearch();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_18 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        getObservationsV2_18.SpecimenIds = strList21;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags24 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray28 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags31 = putLocationTags24.setTagUniqueIds(strList29);
        getObservationsV2_18.QualityControlTypes = strList29;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_33 = getObservationsV2_13.setMedia((java.util.List<java.lang.String>) strList29);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_34 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String str35 = getObservationsV2_34.getCustomId();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_36 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList39 = new java.util.ArrayList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        getObservationsV2_36.SpecimenIds = strList39;
        getObservationsV2_34.ProjectIds = strList39;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_43 = getObservationsV2_13.setObservedPropertyIds((java.util.List<java.lang.String>) strList39);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest timeAlignedDataServiceRequest44 = timeAlignedDataServiceRequest5.setTimeSeriesOutputUnitIds(strList39);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ExtendedAttributeField extendedAttributeField45 = extendedAttributeField3.setValueOptions((java.util.List<java.lang.String>) strList39);
        putBulkEditResultGradesV2_0.AnalysisMethodSimpleIds = strList39;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ExtendedAttributeField extendedAttributeField47 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ExtendedAttributeField();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ExtendedAttributeField extendedAttributeField49 = extendedAttributeField47.setDisplayName("");
        java.lang.Boolean boolean50 = extendedAttributeField49.CanBeEmpty;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest timeAlignedDataServiceRequest51 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest();
        java.lang.Object obj52 = timeAlignedDataServiceRequest51.getResponseType();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_53 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray56 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList57 = new java.util.ArrayList<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList57, strArray56);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_59 = getObservationsV2_53.setDataClassifications((java.util.List<java.lang.String>) strList57);
        getObservationsV2_59.DepthUnitCustomId = "hi!";
        java.lang.String str62 = getObservationsV2_59.CustomId;
        java.util.List<java.lang.String> strList63 = getObservationsV2_59.getSearch();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_64 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray66 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList67 = new java.util.ArrayList<java.lang.String>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList67, strArray66);
        getObservationsV2_64.SpecimenIds = strList67;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags70 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray74 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList75 = new java.util.ArrayList<java.lang.String>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList75, strArray74);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags77 = putLocationTags70.setTagUniqueIds(strList75);
        getObservationsV2_64.QualityControlTypes = strList75;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_79 = getObservationsV2_59.setMedia((java.util.List<java.lang.String>) strList75);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_80 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String str81 = getObservationsV2_80.getCustomId();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_82 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray84 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList85 = new java.util.ArrayList<java.lang.String>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList85, strArray84);
        getObservationsV2_82.SpecimenIds = strList85;
        getObservationsV2_80.ProjectIds = strList85;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_89 = getObservationsV2_59.setObservedPropertyIds((java.util.List<java.lang.String>) strList85);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest timeAlignedDataServiceRequest90 = timeAlignedDataServiceRequest51.setTimeSeriesOutputUnitIds(strList85);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ExtendedAttributeField extendedAttributeField91 = extendedAttributeField49.setValueOptions((java.util.List<java.lang.String>) strList85);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutBulkEditResultGradesV2 putBulkEditResultGradesV2_92 = putBulkEditResultGradesV2_0.setLabResultLabAnalysisMethodIds((java.util.List<java.lang.String>) strList85);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutBulkEditResultGradesV2 putBulkEditResultGradesV2_94 = putBulkEditResultGradesV2_92.setSpecimenName("https");
        java.lang.Double double95 = putBulkEditResultGradesV2_94.getMaxNumericResultValue();
        java.lang.String str96 = putBulkEditResultGradesV2_94.getSpecimenName();
        org.junit.Assert.assertNotNull(extendedAttributeField3);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeAlignedDataServiceResponse");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeAlignedDataServiceResponse");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeAlignedDataServiceResponse");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(getObservationsV2_13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(strList17);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(putLocationTags31);
        org.junit.Assert.assertNotNull(getObservationsV2_33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(getObservationsV2_43);
        org.junit.Assert.assertNotNull(timeAlignedDataServiceRequest44);
        org.junit.Assert.assertNotNull(extendedAttributeField45);
        org.junit.Assert.assertNotNull(extendedAttributeField49);
        org.junit.Assert.assertNull(boolean50);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertEquals(obj52.toString(), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeAlignedDataServiceResponse");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj52), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeAlignedDataServiceResponse");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj52), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeAlignedDataServiceResponse");
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(getObservationsV2_59);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNull(strList63);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(putLocationTags77);
        org.junit.Assert.assertNotNull(getObservationsV2_79);
        org.junit.Assert.assertNull(str81);
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(getObservationsV2_89);
        org.junit.Assert.assertNotNull(timeAlignedDataServiceRequest90);
        org.junit.Assert.assertNotNull(extendedAttributeField91);
        org.junit.Assert.assertNotNull(putBulkEditResultGradesV2_92);
        org.junit.Assert.assertNotNull(putBulkEditResultGradesV2_94);
        org.junit.Assert.assertNull(double95);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "https" + "'", str96, "https");
    }

    @Test
    public void test00660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00660");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.RatingModelDescriptionListServiceResponse ratingModelDescriptionListServiceResponse0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.RatingModelDescriptionListServiceResponse();
        java.util.List<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.RatingModelDescription> ratingModelDescriptionList1 = ratingModelDescriptionListServiceResponse0.RatingModelDescriptions;
        java.time.Instant instant2 = ratingModelDescriptionListServiceResponse0.getNextToken();
        java.util.List<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.RatingModelDescription> ratingModelDescriptionList3 = ratingModelDescriptionListServiceResponse0.RatingModelDescriptions;
        java.time.Instant instant4 = ratingModelDescriptionListServiceResponse0.getNextToken();
        org.junit.Assert.assertNull(ratingModelDescriptionList1);
        org.junit.Assert.assertNull(instant2);
        org.junit.Assert.assertNull(ratingModelDescriptionList3);
        org.junit.Assert.assertNull(instant4);
    }

    @Test
    public void test00661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00661");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationFolder locationFolder0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationFolder();
        java.lang.String str1 = locationFolder0.getParentLocationFolderUniqueId();
        java.lang.String str2 = locationFolder0.UniqueId;
        locationFolder0.ParentLocationFolderUniqueId = "2021.4.62.0";
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationFolder locationFolder6 = locationFolder0.setLocationFolderName("POST");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationFolder locationFolder8 = locationFolder6.setParentLocationFolderUniqueId("/AQUARIUS");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationFolder locationFolder10 = locationFolder8.setLocationFolderPath("");
        locationFolder8.UniqueId = "yyyy'-'MM'-'dd'T'HH':'mm':'ss";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(locationFolder6);
        org.junit.Assert.assertNotNull(locationFolder8);
        org.junit.Assert.assertNotNull(locationFolder10);
    }

    @Test
    public void test00662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00662");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostCalculatedDerivedTimeSeries postCalculatedDerivedTimeSeries0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostCalculatedDerivedTimeSeries();
        java.util.ArrayList<java.lang.String> strList1 = postCalculatedDerivedTimeSeries0.TimeSeriesUniqueIds;
        java.lang.String str2 = postCalculatedDerivedTimeSeries0.Label;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostLocation postLocation3 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostLocation();
        postLocation3.Description = "hi!";
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ExtendedAttributeValue[] extendedAttributeValueArray6 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ExtendedAttributeValue[] {};
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ExtendedAttributeValue> extendedAttributeValueList7 = new java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ExtendedAttributeValue>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ExtendedAttributeValue>) extendedAttributeValueList7, extendedAttributeValueArray6);
        postLocation3.ExtendedAttributeValues = extendedAttributeValueList7;
        postCalculatedDerivedTimeSeries0.ExtendedAttributeValues = extendedAttributeValueList7;
        java.lang.String str11 = postCalculatedDerivedTimeSeries0.Method;
        org.junit.Assert.assertNull(strList1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(extendedAttributeValueArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00663");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutSchedule putSchedule0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutSchedule();
        java.time.OffsetDateTime offsetDateTime1 = putSchedule0.StartDate;
        java.time.OffsetDateTime offsetDateTime2 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutSchedule putSchedule3 = putSchedule0.setEndDate(offsetDateTime2);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes4 = putSchedule3.AuditAttributes;
        java.time.OffsetDateTime offsetDateTime5 = null;
        putSchedule3.LastGenerationDate = offsetDateTime5;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutSchedule putSchedule7 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutSchedule();
        java.lang.Integer int8 = putSchedule7.getSamplingLocationGroupSelectionTypeRandomCount();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.RecurrenceType recurrenceType9 = com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.RecurrenceType.BI_WEEKLY;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutSchedule putSchedule10 = putSchedule7.setRecurrenceType(recurrenceType9);
        putSchedule3.RecurrenceType = recurrenceType9;
        java.lang.Integer int12 = putSchedule3.SamplingLocationGroupSelectionTypeRandomCount;
        org.junit.Assert.assertNull(offsetDateTime1);
        org.junit.Assert.assertNotNull(putSchedule3);
        org.junit.Assert.assertNull(auditAttributes4);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertTrue("'" + recurrenceType9 + "' != '" + com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.RecurrenceType.BI_WEEKLY + "'", recurrenceType9.equals(com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.RecurrenceType.BI_WEEKLY));
        org.junit.Assert.assertNotNull(putSchedule10);
        org.junit.Assert.assertNull(int12);
    }

    @Test
    public void test00664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00664");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CompletedWork completedWork0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CompletedWork();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CompletedWork completedWork2 = completedWork0.setGroundWaterLevelPerformed((java.lang.Boolean) false);
        completedWork0.SafetyInspectionPerformed = true;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CompletedWork completedWork6 = completedWork0.setSafetyInspectionPerformed((java.lang.Boolean) true);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CompletedWork completedWork8 = completedWork6.setSedimentSampleTaken((java.lang.Boolean) true);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CompletedWork completedWork10 = completedWork8.setGroundWaterLevelPerformed((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(completedWork2);
        org.junit.Assert.assertNotNull(completedWork6);
        org.junit.Assert.assertNotNull(completedWork8);
        org.junit.Assert.assertNotNull(completedWork10);
    }

    @Test
    public void test00665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00665");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesDescription timeSeriesDescription0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesDescription();
        java.time.Instant instant1 = timeSeriesDescription0.getCorrectedStartTime();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest timeAlignedDataServiceRequest2 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ControlConditionActivity controlConditionActivity3 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ControlConditionActivity();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ControlCleanedType controlCleanedType4 = null;
        controlConditionActivity3.ControlCleaned = controlCleanedType4;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse6 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse();
        java.time.Instant instant7 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse8 = locationDescriptionListServiceResponse6.setNextToken(instant7);
        controlConditionActivity3.DateCleaned = instant7;
        timeAlignedDataServiceRequest2.QueryFrom = instant7;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesDescription timeSeriesDescription11 = timeSeriesDescription0.setCorrectedEndTime(instant7);
        java.time.Instant instant12 = timeSeriesDescription11.CorrectedStartTime;
        org.junit.Assert.assertNull(instant1);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(locationDescriptionListServiceResponse8);
        org.junit.Assert.assertNotNull(timeSeriesDescription11);
        org.junit.Assert.assertNull(instant12);
    }

    @Test
    public void test00666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00666");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitDataByLocationServiceRequest fieldVisitDataByLocationServiceRequest0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitDataByLocationServiceRequest();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitDataByLocationServiceRequest fieldVisitDataByLocationServiceRequest2 = fieldVisitDataByLocationServiceRequest0.setIncludeNodeDetails((java.lang.Boolean) true);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags3 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray7 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags10 = putLocationTags3.setTagUniqueIds(strList8);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitDataByLocationServiceRequest fieldVisitDataByLocationServiceRequest11 = fieldVisitDataByLocationServiceRequest2.setParameters(strList8);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitDataByLocationServiceRequest fieldVisitDataByLocationServiceRequest13 = fieldVisitDataByLocationServiceRequest2.setConvertToStandardReferenceDatum("POST");
        java.lang.Boolean boolean14 = fieldVisitDataByLocationServiceRequest2.IncludeNodeDetails;
        java.lang.Boolean boolean15 = fieldVisitDataByLocationServiceRequest2.IncludeNodeDetails;
        org.junit.Assert.assertNotNull(fieldVisitDataByLocationServiceRequest2);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(putLocationTags10);
        org.junit.Assert.assertNotNull(fieldVisitDataByLocationServiceRequest11);
        org.junit.Assert.assertNotNull(fieldVisitDataByLocationServiceRequest13);
        org.junit.Assert.assertEquals("'" + boolean14 + "' != '" + true + "'", boolean14, true);
        org.junit.Assert.assertEquals("'" + boolean15 + "' != '" + true + "'", boolean15, true);
    }

    @Test
    public void test00667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00667");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ReferencePointPeriod referencePointPeriod0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ReferencePointPeriod();
        java.time.Instant instant1 = referencePointPeriod0.AppliedTimeUtc;
        java.lang.String str2 = referencePointPeriod0.getStandardIdentifier();
        org.junit.Assert.assertNull(instant1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00668");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationDatumPeriod locationDatumPeriod0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationDatumPeriod();
        java.time.Instant instant1 = locationDatumPeriod0.AppliedTimeUtc;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationDatumPeriod locationDatumPeriod3 = locationDatumPeriod0.setAppliedByUser("/AQUARIUS/Acquisition/v2://9999-12-31T23:59:59.999Z");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.MeasurementDirection measurementDirection4 = null;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationDatumPeriodBase locationDatumPeriodBase5 = locationDatumPeriod0.setMeasurementDirection(measurementDirection4);
        java.time.Instant instant6 = locationDatumPeriodBase5.ValidFrom;
        org.junit.Assert.assertNull(instant1);
        org.junit.Assert.assertNotNull(locationDatumPeriod3);
        org.junit.Assert.assertNotNull(locationDatumPeriodBase5);
        org.junit.Assert.assertNull(instant6);
    }

    @Test
    public void test00669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00669");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SearchResultAccessGroup searchResultAccessGroup0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SearchResultAccessGroup();
        searchResultAccessGroup0.Cursor = "/AQUARIUS/Provisioning/v1";
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AccessGroup[] accessGroupArray3 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AccessGroup[] {};
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AccessGroup> accessGroupList4 = new java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AccessGroup>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AccessGroup>) accessGroupList4, accessGroupArray3);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SearchResultAccessGroup searchResultAccessGroup6 = searchResultAccessGroup0.setDomainObjects((java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AccessGroup>) accessGroupList4);
        searchResultAccessGroup0.Cursor = "MinDuration";
        java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AccessGroup> accessGroupList9 = searchResultAccessGroup0.getDomainObjects();
        org.junit.Assert.assertNotNull(accessGroupArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(searchResultAccessGroup6);
        org.junit.Assert.assertNotNull(accessGroupList9);
    }

    @Test
    public void test00670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00670");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MethodOperation methodOperation0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MethodOperation();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MetadataChangeOperationType metadataChangeOperationType1 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MetadataChangeOperationType.Creation;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MethodOperation methodOperation2 = methodOperation0.setOperationType(metadataChangeOperationType1);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MetadataChangeOperationType metadataChangeOperationType3 = methodOperation2.OperationType;
        java.time.Instant instant4 = methodOperation2.getStartTime();
        java.lang.String str5 = methodOperation2.getComments();
        org.junit.Assert.assertTrue("'" + metadataChangeOperationType1 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MetadataChangeOperationType.Creation + "'", metadataChangeOperationType1.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MetadataChangeOperationType.Creation));
        org.junit.Assert.assertNotNull(methodOperation2);
        org.junit.Assert.assertTrue("'" + metadataChangeOperationType3 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MetadataChangeOperationType.Creation + "'", metadataChangeOperationType3.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MetadataChangeOperationType.Creation));
        org.junit.Assert.assertNull(instant4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00671");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.RatingModelOutputValuesServiceRequest ratingModelOutputValuesServiceRequest0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.RatingModelOutputValuesServiceRequest();
        ratingModelOutputValuesServiceRequest0.ApplyShifts = true;
        java.time.Instant instant3 = ratingModelOutputValuesServiceRequest0.getEffectiveTime();
        java.lang.String str4 = ratingModelOutputValuesServiceRequest0.getRatingModelIdentifier();
        java.time.Instant instant5 = ratingModelOutputValuesServiceRequest0.EffectiveTime;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.RatingModelOutputValuesServiceRequest ratingModelOutputValuesServiceRequest6 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.RatingModelOutputValuesServiceRequest();
        ratingModelOutputValuesServiceRequest6.ApplyShifts = true;
        java.time.Instant instant9 = ratingModelOutputValuesServiceRequest6.getEffectiveTime();
        java.lang.String str10 = ratingModelOutputValuesServiceRequest6.getRatingModelIdentifier();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.RatingModelOutputValuesServiceRequest ratingModelOutputValuesServiceRequest12 = ratingModelOutputValuesServiceRequest6.setApplyShifts((java.lang.Boolean) false);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.RatingModelOutputValuesServiceRequest ratingModelOutputValuesServiceRequest14 = ratingModelOutputValuesServiceRequest12.setRatingModelIdentifier("yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.RatingModelOutputValuesServiceResponse ratingModelOutputValuesServiceResponse15 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.RatingModelOutputValuesServiceResponse();
        java.lang.Double[] doubleArray19 = new java.lang.Double[] { 1.0d, 100.0d, (-1.0d) };
        java.util.ArrayList<java.lang.Double> doubleList20 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList20, doubleArray19);
        ratingModelOutputValuesServiceResponse15.OutputValues = doubleList20;
        ratingModelOutputValuesServiceRequest14.InputValues = doubleList20;
        ratingModelOutputValuesServiceRequest0.InputValues = doubleList20;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.RatingModelOutputValuesServiceRequest ratingModelOutputValuesServiceRequest26 = ratingModelOutputValuesServiceRequest0.setRatingModelIdentifier("/AQUARIUS");
        java.util.ArrayList<java.lang.Double> doubleList27 = ratingModelOutputValuesServiceRequest0.getInputValues();
        org.junit.Assert.assertNull(instant3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(instant5);
        org.junit.Assert.assertNull(instant9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(ratingModelOutputValuesServiceRequest12);
        org.junit.Assert.assertNotNull(ratingModelOutputValuesServiceRequest14);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(ratingModelOutputValuesServiceRequest26);
        org.junit.Assert.assertNotNull(doubleList27);
    }

    @Test
    public void test00672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00672");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetChartDataV2 getChartDataV2_0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetChartDataV2();
        getChartDataV2_0.DetectionCondition = "/AQUARIUS/Acquisition/v2://9999-12-31T23:59:59.999Z";
        java.lang.String str3 = getChartDataV2_0.getDepthUnitId();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00673");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Attachment attachment0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Attachment();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.AttachmentCategory attachmentCategory1 = attachment0.AttachmentCategory;
        java.lang.Double double2 = attachment0.GpsLongitude;
        java.lang.String str3 = attachment0.UploadedByUser;
        java.lang.Double double4 = attachment0.getGpsLongitude();
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagMetadata> tagMetadataList5 = attachment0.Tags;
        org.junit.Assert.assertNull(attachmentCategory1);
        org.junit.Assert.assertNull(double2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(double4);
        org.junit.Assert.assertNull(tagMetadataList5);
    }

    @Test
    public void test00674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00674");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.GageHeightReading gageHeightReading0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.GageHeightReading();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ControlConditionActivity controlConditionActivity1 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ControlConditionActivity();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ControlCleanedType controlCleanedType2 = null;
        controlConditionActivity1.ControlCleaned = controlCleanedType2;
        java.lang.String str4 = controlConditionActivity1.getComments();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary5 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary();
        dischargeSummary5.Reviewer = "";
        java.time.Instant instant8 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        dischargeSummary5.MeasurementTime = instant8;
        controlConditionActivity1.DateCleaned = instant8;
        gageHeightReading0.ReadingTime = instant8;
        gageHeightReading0.IsUsed = true;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(instant8);
    }

    @Test
    public void test00675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00675");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SearchResultShippingContainer searchResultShippingContainer0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SearchResultShippingContainer();
        java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ShippingContainer> shippingContainerList1 = searchResultShippingContainer0.DomainObjects;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SearchResultShippingContainer searchResultShippingContainer3 = searchResultShippingContainer0.setTotalCount((java.lang.Integer) 1);
        java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ShippingContainer> shippingContainerList4 = searchResultShippingContainer0.getDomainObjects();
        org.junit.Assert.assertNull(shippingContainerList1);
        org.junit.Assert.assertNotNull(searchResultShippingContainer3);
        org.junit.Assert.assertNull(shippingContainerList4);
    }

    @Test
    public void test00676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00676");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutAccessGroup putAccessGroup0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutAccessGroup();
        java.lang.Boolean boolean1 = putAccessGroup0.getCanEditAllData();
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test00677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00677");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.AttachmentType attachmentType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.AttachmentType.ScotLogger;
        org.junit.Assert.assertTrue("'" + attachmentType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.AttachmentType.ScotLogger + "'", attachmentType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.AttachmentType.ScotLogger));
    }

    @Test
    public void test00678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00678");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SearchResultLabReportImportHistoryEvent searchResultLabReportImportHistoryEvent0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SearchResultLabReportImportHistoryEvent();
        java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabReportImportHistoryEvent> labReportImportHistoryEventList1 = searchResultLabReportImportHistoryEvent0.getDomainObjects();
        org.junit.Assert.assertNull(labReportImportHistoryEventList1);
    }

    @Test
    public void test00679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00679");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutActivity putActivity0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutActivity();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Quantity quantity1 = null;
        putActivity0.Depth = quantity1;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutActivity putActivity3 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutActivity();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PlannedActivity plannedActivity4 = putActivity3.PlannedActivity;
        java.time.OffsetDateTime offsetDateTime5 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutActivity putActivity6 = putActivity3.setEndTime(offsetDateTime5);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingLocation samplingLocation7 = null;
        putActivity6.SamplingLocation = samplingLocation7;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostObservedProperty postObservedProperty9 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostObservedProperty();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.UnitGroup unitGroup10 = postObservedProperty9.UnitGroup;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Quantity quantity11 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Quantity();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Unit unit12 = null;
        quantity11.Unit = unit12;
        postObservedProperty9.LowerLimit = quantity11;
        putActivity6.Depth = quantity11;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutActivity putActivity16 = putActivity0.setDepth(quantity11);
        java.lang.String str17 = putActivity16.getLoggerFileName();
        org.junit.Assert.assertNull(plannedActivity4);
        org.junit.Assert.assertNotNull(putActivity6);
        org.junit.Assert.assertNull(unitGroup10);
        org.junit.Assert.assertNotNull(putActivity16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test00680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00680");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.StandardDefinition standardDefinition0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.StandardDefinition();
        java.lang.String str1 = standardDefinition0.Description;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutSchedule putSchedule2 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutSchedule();
        java.time.OffsetDateTime offsetDateTime3 = putSchedule2.StartDate;
        java.time.OffsetDateTime offsetDateTime4 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutSchedule putSchedule5 = putSchedule2.setEndDate(offsetDateTime4);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes6 = putSchedule5.AuditAttributes;
        java.time.OffsetDateTime offsetDateTime7 = null;
        putSchedule5.LastGenerationDate = offsetDateTime7;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.RecurrenceDayMonthlyType recurrenceDayMonthlyType9 = putSchedule5.RecurrenceDayMonthly;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PlannedFieldResult plannedFieldResult10 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PlannedFieldResult();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes11 = plannedFieldResult10.AuditAttributes;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabResultDetails labResultDetails12 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabResultDetails();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabResultDetails labResultDetails14 = labResultDetails12.setAnalysisComment("/AQUARIUS/Acquisition/v2");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes15 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabResultDetails labResultDetails16 = labResultDetails14.setAuditAttributes(auditAttributes15);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PlannedFieldResult plannedFieldResult17 = plannedFieldResult10.setAuditAttributes(auditAttributes15);
        putSchedule5.AuditAttributes = auditAttributes15;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.StandardDefinition standardDefinition19 = standardDefinition0.setAuditAttributes(auditAttributes15);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.StandardDefinition standardDefinition21 = standardDefinition0.setDescription("yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ");
        java.lang.String str22 = standardDefinition0.IssuingOrganization;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(offsetDateTime3);
        org.junit.Assert.assertNotNull(putSchedule5);
        org.junit.Assert.assertNull(auditAttributes6);
        org.junit.Assert.assertNull(recurrenceDayMonthlyType9);
        org.junit.Assert.assertNull(auditAttributes11);
        org.junit.Assert.assertNotNull(labResultDetails14);
        org.junit.Assert.assertNotNull(labResultDetails16);
        org.junit.Assert.assertNotNull(plannedFieldResult17);
        org.junit.Assert.assertNotNull(standardDefinition19);
        org.junit.Assert.assertNotNull(standardDefinition21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test00681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00681");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingPlan samplingPlan0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingPlan();
        java.lang.Integer int1 = samplingPlan0.getSamplingLocationGroupSelectionTypeRandomCount();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingPlan samplingPlan3 = samplingPlan0.setSamplingLocationGroupSelectionTypeRandomCount((java.lang.Integer) 100);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingPlan samplingPlan5 = samplingPlan3.setCustomId("MinDuration");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingLocationGroup samplingLocationGroup6 = samplingPlan3.SamplingLocationGroup;
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(samplingPlan3);
        org.junit.Assert.assertNotNull(samplingPlan5);
        org.junit.Assert.assertNull(samplingLocationGroup6);
    }

    @Test
    public void test00682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00682");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.OpenIdConnectUser openIdConnectUser0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.OpenIdConnectUser();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.OpenIdConnectUser openIdConnectUser2 = openIdConnectUser0.setIdentifier("");
        java.lang.String str3 = openIdConnectUser2.FirstName;
        java.lang.String str4 = openIdConnectUser2.getFirstName();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.User user6 = openIdConnectUser2.setActive((java.lang.Boolean) true);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.User user8 = openIdConnectUser2.setCanConfigureSystem((java.lang.Boolean) true);
        java.lang.String str9 = openIdConnectUser2.UniqueId;
        java.lang.String str10 = openIdConnectUser2.SubjectIdentifier;
        org.junit.Assert.assertNotNull(openIdConnectUser2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(user8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00683");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostConfigurableDropDownListItem postConfigurableDropDownListItem0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostConfigurableDropDownListItem();
        java.lang.String str1 = postConfigurableDropDownListItem0.getDropDownListId();
        java.lang.String str2 = postConfigurableDropDownListItem0.getDropDownListId();
        postConfigurableDropDownListItem0.Id = "http";
        java.lang.Integer int5 = postConfigurableDropDownListItem0.DisplayOrder;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int5);
    }

    @Test
    public void test00684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00684");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetExportSpecimens getExportSpecimens0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetExportSpecimens();
        java.util.List<java.lang.String> strList1 = getExportSpecimens0.getActivityTypes();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Qualifier qualifier2 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Qualifier();
        java.time.Instant instant3 = qualifier2.DateApplied;
        java.lang.String str4 = qualifier2.User;
        java.lang.String str5 = qualifier2.getIdentifier();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest timeAlignedDataServiceRequest6 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest();
        java.lang.Object obj7 = timeAlignedDataServiceRequest6.getResponseType();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse8 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse();
        java.time.Instant instant9 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse10 = locationDescriptionListServiceResponse8.setNextToken(instant9);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest timeAlignedDataServiceRequest11 = timeAlignedDataServiceRequest6.setQueryFrom(instant9);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Qualifier qualifier12 = qualifier2.setDateApplied(instant9);
        getExportSpecimens0.Before = instant9;
        java.util.List<java.lang.String> strList14 = getExportSpecimens0.getLaboratoryIds();
        java.util.List<java.lang.String> strList15 = getExportSpecimens0.getSearch();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingPlanPlannedActivityRecurrence samplingPlanPlannedActivityRecurrence16 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingPlanPlannedActivityRecurrence();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.RecurrenceFrequencyType recurrenceFrequencyType17 = samplingPlanPlannedActivityRecurrence16.RecurrenceFrequency;
        java.util.List<java.lang.String> strList18 = samplingPlanPlannedActivityRecurrence16.getMonthsOfYear();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutQualifier putQualifier19 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutQualifier();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutQualifier putQualifier21 = putQualifier19.setUniqueId("");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest timeAlignedDataServiceRequest22 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_23 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        getObservationsV2_23.SpecimenIds = strList26;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags29 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray33 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags36 = putLocationTags29.setTagUniqueIds(strList34);
        getObservationsV2_23.QualityControlTypes = strList34;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest timeAlignedDataServiceRequest38 = timeAlignedDataServiceRequest22.setTimeSeriesUniqueIds(strList34);
        putQualifier19.GroupIdentifiers = strList34;
        java.util.ArrayList<java.lang.String> strList40 = putQualifier19.GroupIdentifiers;
        samplingPlanPlannedActivityRecurrence16.MonthsOfYear = strList40;
        getExportSpecimens0.ActivityTypes = strList40;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetExportSpecimens getExportSpecimens44 = getExportSpecimens0.setCursor("hi!");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_45 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray48 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList49 = new java.util.ArrayList<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList49, strArray48);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_51 = getObservationsV2_45.setDataClassifications((java.util.List<java.lang.String>) strList49);
        java.time.Instant instant52 = getObservationsV2_45.getStartObservedTime();
        getObservationsV2_45.MinNumericResultValue = (-1.0d);
        java.util.List<java.lang.String> strList55 = null;
        getObservationsV2_45.SamplingContextTagIds = strList55;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescription locationDescription57 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescription();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescription locationDescription59 = locationDescription57.setIdentifier("");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ControlConditionActivity controlConditionActivity60 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ControlConditionActivity();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ControlCleanedType controlCleanedType61 = null;
        controlConditionActivity60.ControlCleaned = controlCleanedType61;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse63 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse();
        java.time.Instant instant64 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse65 = locationDescriptionListServiceResponse63.setNextToken(instant64);
        controlConditionActivity60.DateCleaned = instant64;
        locationDescription59.LastModified = instant64;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_68 = getObservationsV2_45.setStartResultTime(instant64);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetExportSpecimens getExportSpecimens69 = getExportSpecimens0.setEndModificationTime(instant64);
        getExportSpecimens69.Sort = "ZZZZZ";
        org.junit.Assert.assertNull(strList1);
        org.junit.Assert.assertNull(instant3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeAlignedDataServiceResponse");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeAlignedDataServiceResponse");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeAlignedDataServiceResponse");
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertNotNull(locationDescriptionListServiceResponse10);
        org.junit.Assert.assertNotNull(timeAlignedDataServiceRequest11);
        org.junit.Assert.assertNotNull(qualifier12);
        org.junit.Assert.assertNull(strList14);
        org.junit.Assert.assertNull(strList15);
        org.junit.Assert.assertNull(recurrenceFrequencyType17);
        org.junit.Assert.assertNull(strList18);
        org.junit.Assert.assertNotNull(putQualifier21);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(putLocationTags36);
        org.junit.Assert.assertNotNull(timeAlignedDataServiceRequest38);
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertNotNull(getExportSpecimens44);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(getObservationsV2_51);
        org.junit.Assert.assertNull(instant52);
        org.junit.Assert.assertNotNull(locationDescription59);
        org.junit.Assert.assertNotNull(instant64);
        org.junit.Assert.assertNotNull(locationDescriptionListServiceResponse65);
        org.junit.Assert.assertNotNull(getObservationsV2_68);
        org.junit.Assert.assertNotNull(getExportSpecimens69);
    }

    @Test
    public void test00685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00685");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetChartDataV2 getChartDataV2_0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetChartDataV2();
        java.lang.String str1 = getChartDataV2_0.getActivityCustomId();
        java.lang.String str2 = getChartDataV2_0.DepthUnitId;
        java.util.List<java.lang.String> strList3 = getChartDataV2_0.SpecimenIds;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetChartDataV2 getChartDataV2_4 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetChartDataV2();
        getChartDataV2_4.DetectionCondition = "/AQUARIUS/Acquisition/v2://9999-12-31T23:59:59.999Z";
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.GageHeightReading gageHeightReading7 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.GageHeightReading();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ControlConditionActivity controlConditionActivity8 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ControlConditionActivity();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ControlCleanedType controlCleanedType9 = null;
        controlConditionActivity8.ControlCleaned = controlCleanedType9;
        java.lang.String str11 = controlConditionActivity8.getComments();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary12 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary();
        dischargeSummary12.Reviewer = "";
        java.time.Instant instant15 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        dischargeSummary12.MeasurementTime = instant15;
        controlConditionActivity8.DateCleaned = instant15;
        gageHeightReading7.ReadingTime = instant15;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DoubleWithDisplay doubleWithDisplay19 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DoubleWithDisplay();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DoubleWithDisplay doubleWithDisplay21 = doubleWithDisplay19.setNumeric((java.lang.Double) 10.0d);
        java.lang.String str22 = doubleWithDisplay21.getDisplay();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.GageHeightReading gageHeightReading23 = gageHeightReading7.setGageHeight(doubleWithDisplay21);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetChartDataV2 getChartDataV2_24 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetChartDataV2();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary25 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary27 = dischargeSummary25.setMeanGageHeightMethod("hi!");
        java.lang.String str28 = dischargeSummary27.MeasurementId;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary30 = dischargeSummary27.setDischargeMethod("yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSSSSSZZZZZ");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CalibrationCheck calibrationCheck31 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CalibrationCheck();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CalibrationCheckType calibrationCheckType32 = calibrationCheck31.getCalibrationCheckType();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DoubleWithDisplay doubleWithDisplay33 = calibrationCheck31.Value;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse34 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary35 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary37 = dischargeSummary35.setPublish((java.lang.Boolean) false);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse38 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse();
        java.time.Instant instant39 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse40 = locationDescriptionListServiceResponse38.setNextToken(instant39);
        dischargeSummary35.MeasurementTime = instant39;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse42 = locationDescriptionListServiceResponse34.setNextToken(instant39);
        java.time.Instant instant43 = locationDescriptionListServiceResponse34.getNextToken();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CalibrationCheck calibrationCheck44 = calibrationCheck31.setTime(instant43);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary45 = dischargeSummary27.setMeasurementTime(instant43);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetChartDataV2 getChartDataV2_46 = getChartDataV2_24.setStartResultTime(instant43);
        gageHeightReading7.ReadingTime = instant43;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetChartDataV2 getChartDataV2_48 = getChartDataV2_4.setStartObservedTime(instant43);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetChartDataV2 getChartDataV2_49 = getChartDataV2_0.setEndResultTime(instant43);
        java.time.Instant instant50 = getChartDataV2_49.EndModificationTime;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertNotNull(doubleWithDisplay21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(gageHeightReading23);
        org.junit.Assert.assertNotNull(dischargeSummary27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(dischargeSummary30);
        org.junit.Assert.assertNull(calibrationCheckType32);
        org.junit.Assert.assertNull(doubleWithDisplay33);
        org.junit.Assert.assertNotNull(dischargeSummary37);
        org.junit.Assert.assertNotNull(instant39);
        org.junit.Assert.assertNotNull(locationDescriptionListServiceResponse40);
        org.junit.Assert.assertNotNull(locationDescriptionListServiceResponse42);
        org.junit.Assert.assertNotNull(instant43);
        org.junit.Assert.assertNotNull(calibrationCheck44);
        org.junit.Assert.assertNotNull(dischargeSummary45);
        org.junit.Assert.assertNotNull(getChartDataV2_46);
        org.junit.Assert.assertNotNull(getChartDataV2_48);
        org.junit.Assert.assertNotNull(getChartDataV2_49);
        org.junit.Assert.assertNull(instant50);
    }

    @Test
    public void test00686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00686");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutProject putProject0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutProject();
        java.lang.String str1 = putProject0.ScopeStatement;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes2 = null;
        putProject0.AuditAttributes = auditAttributes2;
        java.time.OffsetDateTime offsetDateTime4 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutProject putProject5 = putProject0.setStartTime(offsetDateTime4);
        java.lang.String str6 = putProject5.getScopeStatement();
        java.time.OffsetDateTime offsetDateTime7 = putProject5.StartTime;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(putProject5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(offsetDateTime7);
    }

    @Test
    public void test00687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00687");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostRecurringReport postRecurringReport0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostRecurringReport();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary1 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary();
        dischargeSummary1.Reviewer = "";
        java.time.Instant instant4 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        dischargeSummary1.MeasurementTime = instant4;
        postRecurringReport0.NextGenerationDate = instant4;
        java.lang.String str7 = postRecurringReport0.getJsonTemplate();
        postRecurringReport0.JsonTemplate = "http://MaxDurationhttp/json/reply/Integer";
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00688");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SearchResultResultStatus searchResultResultStatus0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SearchResultResultStatus();
        java.lang.String str1 = searchResultResultStatus0.Cursor;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ResultStatus[] resultStatusArray2 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ResultStatus[] {};
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ResultStatus> resultStatusList3 = new java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ResultStatus>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ResultStatus>) resultStatusList3, resultStatusArray2);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SearchResultResultStatus searchResultResultStatus5 = searchResultResultStatus0.setDomainObjects((java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ResultStatus>) resultStatusList3);
        java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ResultStatus> resultStatusList6 = searchResultResultStatus5.DomainObjects;
        java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ResultStatus> resultStatusList7 = searchResultResultStatus5.getDomainObjects();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(resultStatusArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(searchResultResultStatus5);
        org.junit.Assert.assertNotNull(resultStatusList6);
        org.junit.Assert.assertNotNull(resultStatusList7);
    }

    @Test
    public void test00689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00689");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Approval approval0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Approval();
        java.lang.String str1 = approval0.User;
        approval0.LevelDescription = "MinDuration";
        approval0.ApprovalLevel = 10;
        java.lang.String str6 = approval0.LevelDescription;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MinDuration" + "'", str6, "MinDuration");
    }

    @Test
    public void test00690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00690");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationType locationType0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationType();
        java.lang.String str1 = locationType0.getDescription();
        java.util.List<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ExtendedAttributeField> extendedAttributeFieldList2 = locationType0.ExtendedAttributeFields;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationType locationType4 = locationType0.setDescription("yyyy'-'MM'-'dd'T'HH':'mm':'ss");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(extendedAttributeFieldList2);
        org.junit.Assert.assertNotNull(locationType4);
    }

    @Test
    public void test00691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00691");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.UnitGroup unitGroup0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.UnitGroup();
        java.lang.Integer int1 = unitGroup0.CurrentDimension;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.UnitGroup unitGroup3 = unitGroup0.setCurrentDimension((java.lang.Integer) 4);
        java.lang.Integer int4 = unitGroup3.getLengthDimension();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(unitGroup3);
        org.junit.Assert.assertNull(int4);
    }

    @Test
    public void test00692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00692");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ActiveMeterDetails activeMeterDetails0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ActiveMeterDetails();
        java.lang.String str1 = activeMeterDetails0.SoftwareVersion;
        java.lang.String str2 = activeMeterDetails0.Manufacturer;
        activeMeterDetails0.SerialNumber = "/AQUARIUS";
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ActiveMeterCalibration[] activeMeterCalibrationArray5 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ActiveMeterCalibration[] {};
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ActiveMeterCalibration> activeMeterCalibrationList6 = new java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ActiveMeterCalibration>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ActiveMeterCalibration>) activeMeterCalibrationList6, activeMeterCalibrationArray5);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ActiveMeterDetails activeMeterDetails8 = activeMeterDetails0.setMeterCalibrations(activeMeterCalibrationList6);
        activeMeterDetails8.Configuration = "MaxInstant";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(activeMeterCalibrationArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(activeMeterDetails8);
    }

    @Test
    public void test00693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00693");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.PublicKey publicKey0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.PublicKey();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.PublicKey publicKey2 = publicKey0.setXml("");
        java.lang.String str3 = publicKey0.Xml;
        org.junit.Assert.assertNotNull(publicKey2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00694");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.NullMeasureQualifier nullMeasureQualifier0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.NullMeasureQualifier();
        java.lang.String str1 = nullMeasureQualifier0.getCustomId();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes2 = nullMeasureQualifier0.AuditAttributes;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(auditAttributes2);
    }

    @Test
    public void test00695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00695");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ExpandedRatingCurve expandedRatingCurve0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ExpandedRatingCurve();
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.RatingPoint> ratingPointList1 = null;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ExpandedRatingCurve expandedRatingCurve2 = expandedRatingCurve0.setBaseRatingTable(ratingPointList1);
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.RatingPoint> ratingPointList3 = expandedRatingCurve2.getBaseRatingTable();
        expandedRatingCurve2.Remarks = "MaxInstant";
        org.junit.Assert.assertNotNull(expandedRatingCurve2);
        org.junit.Assert.assertNull(ratingPointList3);
    }

    @Test
    public void test00696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00696");
        java.util.List<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ExtendedAttributeValue> extendedAttributeValueList0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.IPostTimeSeriesRequest.ExtendedAttributeValues;
        org.junit.Assert.assertNull(extendedAttributeValueList0);
    }

    @Test
    public void test00697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00697");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CrossSectionPoint crossSectionPoint0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CrossSectionPoint();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.QuantityWithDisplay quantityWithDisplay1 = null;
        crossSectionPoint0.Distance = quantityWithDisplay1;
        crossSectionPoint0.PointOrder = 1;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.QuantityWithDisplay quantityWithDisplay5 = crossSectionPoint0.getElevation();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CrossSectionPoint crossSectionPoint7 = crossSectionPoint0.setComments("hi!");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CrossSectionPoint crossSectionPoint9 = crossSectionPoint0.setComments("2021.4.62.0");
        crossSectionPoint9.PointOrder = 0;
        org.junit.Assert.assertNull(quantityWithDisplay5);
        org.junit.Assert.assertNotNull(crossSectionPoint7);
        org.junit.Assert.assertNotNull(crossSectionPoint9);
    }

    @Test
    public void test00698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00698");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutSchedule putSchedule0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutSchedule();
        java.time.OffsetDateTime offsetDateTime1 = putSchedule0.StartDate;
        java.time.OffsetDateTime offsetDateTime2 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutSchedule putSchedule3 = putSchedule0.setEndDate(offsetDateTime2);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingLocationGroup samplingLocationGroup4 = putSchedule3.getSamplingLocationGroup();
        java.time.OffsetDateTime offsetDateTime5 = null;
        putSchedule3.EndDate = offsetDateTime5;
        java.time.OffsetDateTime offsetDateTime7 = putSchedule3.EndDate;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutSchedule putSchedule8 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutSchedule();
        java.time.OffsetDateTime offsetDateTime9 = putSchedule8.StartDate;
        java.time.OffsetDateTime offsetDateTime10 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutSchedule putSchedule11 = putSchedule8.setEndDate(offsetDateTime10);
        java.lang.Integer int12 = putSchedule8.getSamplingLocationGroupSelectionTypeRandomCount();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingLocationGroupSelectionType samplingLocationGroupSelectionType13 = com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingLocationGroupSelectionType.RANDOM;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutSchedule putSchedule14 = putSchedule8.setSamplingLocationGroupSelectionType(samplingLocationGroupSelectionType13);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutSchedule putSchedule15 = putSchedule3.setSamplingLocationGroupSelectionType(samplingLocationGroupSelectionType13);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingLocationGroup samplingLocationGroup16 = putSchedule15.getSamplingLocationGroup();
        org.junit.Assert.assertNull(offsetDateTime1);
        org.junit.Assert.assertNotNull(putSchedule3);
        org.junit.Assert.assertNull(samplingLocationGroup4);
        org.junit.Assert.assertNull(offsetDateTime7);
        org.junit.Assert.assertNull(offsetDateTime9);
        org.junit.Assert.assertNotNull(putSchedule11);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertTrue("'" + samplingLocationGroupSelectionType13 + "' != '" + com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingLocationGroupSelectionType.RANDOM + "'", samplingLocationGroupSelectionType13.equals(com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingLocationGroupSelectionType.RANDOM));
        org.junit.Assert.assertNotNull(putSchedule14);
        org.junit.Assert.assertNotNull(putSchedule15);
        org.junit.Assert.assertNull(samplingLocationGroup16);
    }

    @Test
    public void test00699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00699");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.GetTag getTag0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.GetTag();
        java.lang.String str1 = getTag0.getUniqueId();
        java.lang.Object obj2 = getTag0.getResponseType();
        getTag0.UniqueId = "https";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning$Tag");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning$Tag");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning$Tag");
    }

    @Test
    public void test00700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00700");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ChartDataPoint chartDataPoint0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ChartDataPoint();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ChartDataPoint chartDataPoint2 = chartDataPoint0.setMdlValueUnitCustomId("MaxInstant");
        chartDataPoint2.ObservationId = "2021.4.62.0";
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ChartDataPoint chartDataPoint6 = chartDataPoint2.setMdlValueUnitCustomId("");
        chartDataPoint6.MdlValueUnitCustomId = "2021.4.62.0";
        org.junit.Assert.assertNotNull(chartDataPoint2);
        org.junit.Assert.assertNotNull(chartDataPoint6);
    }

    @Test
    public void test00701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00701");
        java.lang.String str0 = com.aquaticinformatics.aquarius.sdk.samples.serializers.InstantDeserializer.JsonMinValue;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "MinInstant" + "'", str0, "MinInstant");
    }

    @Test
    public void test00702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00702");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DeleteUnit deleteUnit0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DeleteUnit();
        deleteUnit0.Id = "https";
        java.lang.String str3 = deleteUnit0.getId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "https" + "'", str3, "https");
    }

    @Test
    public void test00703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00703");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Inspection inspection0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Inspection();
        java.lang.String str1 = inspection0.getManufacturer();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Inspection inspection3 = inspection0.setSubLocationIdentifier("");
        inspection3.Model = "9999-12-31T23:59:59.999Z";
        inspection3.Comments = "MinDuration";
        java.lang.String str8 = inspection3.SerialNumber;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(inspection3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00704");
        com.aquaticinformatics.aquarius.sdk.timeseries.FieldNamer fieldNamer0 = new com.aquaticinformatics.aquarius.sdk.timeseries.FieldNamer();
        com.google.gson.GsonBuilder gsonBuilder1 = null;
        // The following exception was thrown during execution in test generation
        try {
            fieldNamer0.configure(gsonBuilder1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00705");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DeterminationType determinationType0 = com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DeterminationType.CONTROL_ADJUSTED;
        org.junit.Assert.assertTrue("'" + determinationType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DeterminationType.CONTROL_ADJUSTED + "'", determinationType0.equals(com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DeterminationType.CONTROL_ADJUSTED));
    }

    @Test
    public void test00706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00706");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Tag tag0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Tag();
        java.lang.Boolean boolean1 = tag0.AppliesToLocations;
        tag0.AppliesToLocationNotes = true;
        java.lang.String str4 = tag0.getKey();
        java.lang.Boolean boolean5 = tag0.AppliesToAttachments;
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(boolean5);
    }

    @Test
    public void test00707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00707");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SearchResultUser searchResultUser0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SearchResultUser();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SearchResultUser searchResultUser2 = searchResultUser0.setTotalCount((java.lang.Integer) (-1));
        java.lang.String str3 = searchResultUser0.getCursor();
        java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.User> userList4 = searchResultUser0.DomainObjects;
        org.junit.Assert.assertNotNull(searchResultUser2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(userList4);
    }

    @Test
    public void test00708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00708");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.GetLocationFolder getLocationFolder0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.GetLocationFolder();
        java.lang.String str1 = getLocationFolder0.LocationFolderUniqueId;
        java.lang.String str2 = getLocationFolder0.getLocationFolderUniqueId();
        java.lang.String str3 = getLocationFolder0.getLocationFolderUniqueId();
        getLocationFolder0.LocationFolderUniqueId = "POST";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00709");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagApplicability tagApplicability0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagApplicability.AppliesToLocations;
        org.junit.Assert.assertTrue("'" + tagApplicability0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagApplicability.AppliesToLocations + "'", tagApplicability0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagApplicability.AppliesToLocations));
    }

    @Test
    public void test00710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00710");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeterType meterType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeterType.PolymerCupPygmyMeter;
        org.junit.Assert.assertTrue("'" + meterType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeterType.PolymerCupPygmyMeter + "'", meterType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeterType.PolymerCupPygmyMeter));
    }

    @Test
    public void test00711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00711");
        // The following exception was thrown during execution in test generation
        try {
            com.aquaticinformatics.aquarius.sdk.samples.SamplesClient samplesClient2 = com.aquaticinformatics.aquarius.sdk.samples.SamplesClient.createConnectedClient("0001-01-01T00:00:00.000Z", "hi!:///AQUARIUS/Provisioning/v1");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.net.MalformedURLException: For input string: \"00:00.000Z\"");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00712");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingPlan samplingPlan0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingPlan();
        java.lang.Integer int1 = samplingPlan0.getSamplingLocationGroupSelectionTypeRandomCount();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingPlan samplingPlan3 = samplingPlan0.setSamplingLocationGroupSelectionTypeRandomCount((java.lang.Integer) 100);
        java.lang.String str4 = samplingPlan0.CustomId;
        java.time.OffsetDateTime offsetDateTime5 = samplingPlan0.getLastGenerationDate();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(samplingPlan3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(offsetDateTime5);
    }

    @Test
    public void test00713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00713");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetAnalysisMethodHistory getAnalysisMethodHistory0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetAnalysisMethodHistory();
        java.lang.String str1 = getAnalysisMethodHistory0.Id;
        java.lang.Object obj2 = getAnalysisMethodHistory0.getResponseType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$SearchResultAuditHistory");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$SearchResultAuditHistory");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$SearchResultAuditHistory");
    }

    @Test
    public void test00714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00714");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ExtendedAttributeField extendedAttributeField0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ExtendedAttributeField();
        extendedAttributeField0.IsReadOnly = true;
        extendedAttributeField0.IsReadOnly = false;
    }

    @Test
    public void test00715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00715");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesThreshold timeSeriesThreshold0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesThreshold();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesThreshold timeSeriesThreshold2 = timeSeriesThreshold0.setName("yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSSSSSZZZZZ");
        timeSeriesThreshold2.Description = "/AQUARIUS/Acquisition/v2";
        timeSeriesThreshold2.ReferenceCode = "/AQUARIUS/Acquisition/v2";
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ThresholdType thresholdType7 = timeSeriesThreshold2.Type;
        java.lang.String str8 = timeSeriesThreshold2.DisplayColor;
        org.junit.Assert.assertNotNull(timeSeriesThreshold2);
        org.junit.Assert.assertNull(thresholdType7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00716");
        // The following exception was thrown during execution in test generation
        try {
            com.aquaticinformatics.aquarius.sdk.timeseries.AquariusClient aquariusClient3 = com.aquaticinformatics.aquarius.sdk.timeseries.AquariusClient.createConnectedClient("hi!:///AQUARIUS/Provisioning/v1", "http", "/AQUARIUS");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.net.UnknownHostException: hi!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00717");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutAnalyticalGroup putAnalyticalGroup0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutAnalyticalGroup();
        java.lang.String str1 = putAnalyticalGroup0.getDescription();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutAnalyticalGroup putAnalyticalGroup3 = putAnalyticalGroup0.setName("0001-01-01T00:00:00.000Z");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(putAnalyticalGroup3);
    }

    @Test
    public void test00718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00718");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationMonitoringMethod locationMonitoringMethod0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationMonitoringMethod();
        java.lang.String str1 = locationMonitoringMethod0.getModel();
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagMetadata> tagMetadataList2 = null;
        locationMonitoringMethod0.Tags = tagMetadataList2;
        java.lang.String str4 = locationMonitoringMethod0.getParameterUniqueId();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationMonitoringMethod locationMonitoringMethod6 = locationMonitoringMethod0.setMethod("'.'SSSSSSS");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationMonitoringMethod locationMonitoringMethod8 = locationMonitoringMethod0.setName("https");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationMonitoringMethod locationMonitoringMethod10 = locationMonitoringMethod8.setUnitName("'.'SSSSSSS");
        java.lang.String str11 = locationMonitoringMethod8.Manufacturer;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(locationMonitoringMethod6);
        org.junit.Assert.assertNotNull(locationMonitoringMethod8);
        org.junit.Assert.assertNotNull(locationMonitoringMethod10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00719");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostSamplingLocation postSamplingLocation0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostSamplingLocation();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostSamplingLocation postSamplingLocation2 = postSamplingLocation0.setCustomId("hi!");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation observation3 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PlannedFieldResult plannedFieldResult4 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation observation5 = observation3.setPlannedFieldResult(plannedFieldResult4);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabInstruction labInstruction6 = null;
        observation5.LabInstruction = labInstruction6;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservationStatistics observationStatistics8 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation observation9 = observation5.setStatistics(observationStatistics8);
        java.time.OffsetDateTime offsetDateTime10 = observation9.getResultTime();
        java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportHistoryEventSimple> importHistoryEventSimpleList11 = observation9.ImportHistoryEventSimples;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedProperty observedProperty12 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation observation13 = observation9.setObservedProperty(observedProperty12);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ResultGrade resultGrade14 = observation13.ResultGrade;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabResultDetails labResultDetails15 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabResultDetails();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabResultDetails labResultDetails17 = labResultDetails15.setAnalysisComment("/AQUARIUS/Acquisition/v2");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes18 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabResultDetails labResultDetails19 = labResultDetails17.setAuditAttributes(auditAttributes18);
        observation13.AuditAttributes = auditAttributes18;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostSamplingLocation postSamplingLocation21 = postSamplingLocation2.setAuditAttributes(auditAttributes18);
        java.lang.String str22 = postSamplingLocation21.Latitude;
        java.lang.String str23 = postSamplingLocation21.HorizontalDatum;
        org.junit.Assert.assertNotNull(postSamplingLocation2);
        org.junit.Assert.assertNotNull(observation5);
        org.junit.Assert.assertNotNull(observation9);
        org.junit.Assert.assertNull(offsetDateTime10);
        org.junit.Assert.assertNull(importHistoryEventSimpleList11);
        org.junit.Assert.assertNotNull(observation13);
        org.junit.Assert.assertNull(resultGrade14);
        org.junit.Assert.assertNotNull(labResultDetails17);
        org.junit.Assert.assertNotNull(labResultDetails19);
        org.junit.Assert.assertNotNull(postSamplingLocation21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test00720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00720");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostUserV2 postUserV2_0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostUserV2();
        java.util.List<java.lang.String> strList1 = postUserV2_0.getAccessGroups();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetActivities getActivities2 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetActivities();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse3 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary4 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary6 = dischargeSummary4.setPublish((java.lang.Boolean) false);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse7 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse();
        java.time.Instant instant8 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse9 = locationDescriptionListServiceResponse7.setNextToken(instant8);
        dischargeSummary4.MeasurementTime = instant8;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse11 = locationDescriptionListServiceResponse3.setNextToken(instant8);
        java.time.Instant instant12 = locationDescriptionListServiceResponse3.getNextToken();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetActivities getActivities13 = getActivities2.setToStartTime(instant12);
        java.lang.String str14 = getActivities13.getSort();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetActivities getActivities16 = getActivities13.setLimit((java.lang.Integer) 1);
        getActivities16.Cursor = "";
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest timeAlignedDataServiceRequest19 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_20 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        getObservationsV2_20.SpecimenIds = strList23;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags26 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray30 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags33 = putLocationTags26.setTagUniqueIds(strList31);
        getObservationsV2_20.QualityControlTypes = strList31;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest timeAlignedDataServiceRequest35 = timeAlignedDataServiceRequest19.setTimeSeriesUniqueIds(strList31);
        getActivities16.CollectionMethodIds = strList31;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostUserV2 postUserV2_37 = postUserV2_0.setRoles((java.util.List<java.lang.String>) strList31);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_38 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        getObservationsV2_38.SpecimenIds = strList41;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags44 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray48 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList49 = new java.util.ArrayList<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList49, strArray48);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags51 = putLocationTags44.setTagUniqueIds(strList49);
        getObservationsV2_38.QualityControlTypes = strList49;
        java.util.List<java.lang.String> strList53 = getObservationsV2_38.getAnalyticalGroupIds();
        java.util.List<java.lang.String> strList54 = getObservationsV2_38.DataClassifications;
        java.util.List<java.lang.String> strList55 = getObservationsV2_38.ObservedPropertyIds;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest timeAlignedDataServiceRequest56 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest();
        java.lang.Object obj57 = timeAlignedDataServiceRequest56.getResponseType();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_58 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray61 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList62 = new java.util.ArrayList<java.lang.String>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList62, strArray61);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_64 = getObservationsV2_58.setDataClassifications((java.util.List<java.lang.String>) strList62);
        getObservationsV2_64.DepthUnitCustomId = "hi!";
        java.lang.String str67 = getObservationsV2_64.CustomId;
        java.util.List<java.lang.String> strList68 = getObservationsV2_64.getSearch();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_69 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray71 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList72 = new java.util.ArrayList<java.lang.String>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList72, strArray71);
        getObservationsV2_69.SpecimenIds = strList72;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags75 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray79 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList80 = new java.util.ArrayList<java.lang.String>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList80, strArray79);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags82 = putLocationTags75.setTagUniqueIds(strList80);
        getObservationsV2_69.QualityControlTypes = strList80;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_84 = getObservationsV2_64.setMedia((java.util.List<java.lang.String>) strList80);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_85 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String str86 = getObservationsV2_85.getCustomId();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_87 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray89 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList90 = new java.util.ArrayList<java.lang.String>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList90, strArray89);
        getObservationsV2_87.SpecimenIds = strList90;
        getObservationsV2_85.ProjectIds = strList90;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_94 = getObservationsV2_64.setObservedPropertyIds((java.util.List<java.lang.String>) strList90);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest timeAlignedDataServiceRequest95 = timeAlignedDataServiceRequest56.setTimeSeriesOutputUnitIds(strList90);
        getObservationsV2_38.LabReportIds = strList90;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostUserV2 postUserV2_97 = postUserV2_0.setAccessGroups((java.util.List<java.lang.String>) strList90);
        java.lang.String str98 = postUserV2_97.getId();
        org.junit.Assert.assertNull(strList1);
        org.junit.Assert.assertNotNull(dischargeSummary6);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(locationDescriptionListServiceResponse9);
        org.junit.Assert.assertNotNull(locationDescriptionListServiceResponse11);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(getActivities13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(getActivities16);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(putLocationTags33);
        org.junit.Assert.assertNotNull(timeAlignedDataServiceRequest35);
        org.junit.Assert.assertNotNull(postUserV2_37);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(putLocationTags51);
        org.junit.Assert.assertNull(strList53);
        org.junit.Assert.assertNull(strList54);
        org.junit.Assert.assertNull(strList55);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertEquals(obj57.toString(), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeAlignedDataServiceResponse");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj57), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeAlignedDataServiceResponse");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj57), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeAlignedDataServiceResponse");
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(getObservationsV2_64);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNull(strList68);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(putLocationTags82);
        org.junit.Assert.assertNotNull(getObservationsV2_84);
        org.junit.Assert.assertNull(str86);
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertNotNull(getObservationsV2_94);
        org.junit.Assert.assertNotNull(timeAlignedDataServiceRequest95);
        org.junit.Assert.assertNotNull(postUserV2_97);
        org.junit.Assert.assertNull(str98);
    }

    @Test
    public void test00721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00721");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ThresholdTypeRequestBase thresholdTypeRequestBase0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ThresholdTypeRequestBase();
        thresholdTypeRequestBase0.Description = "multipart/form-data; boundary=****bbcf5f9e-6ccf-4b63-91ab-6e645caf02af****";
        java.lang.String str3 = thresholdTypeRequestBase0.Description;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "multipart/form-data; boundary=****bbcf5f9e-6ccf-4b63-91ab-6e645caf02af****" + "'", str3, "multipart/form-data; boundary=****bbcf5f9e-6ccf-4b63-91ab-6e645caf02af****");
    }

    @Test
    public void test00722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00722");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemTaxon importItemTaxon0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemTaxon();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemTaxon importItemTaxon2 = importItemTaxon0.setRowId("/AQUARIUS/Provisioning/v1");
        java.lang.String str3 = importItemTaxon2.Input;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemTaxon importItemTaxon5 = importItemTaxon2.setInput("MinDuration");
        java.lang.Object obj6 = importItemTaxon5.getErrors();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemStatusType importItemStatusType7 = importItemTaxon5.getStatus();
        java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportChangeItem> importChangeItemList8 = importItemTaxon5.getItemComparison();
        org.junit.Assert.assertNotNull(importItemTaxon2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(importItemTaxon5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(importItemStatusType7);
        org.junit.Assert.assertNull(importChangeItemList8);
    }

    @Test
    public void test00723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00723");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabInstructionTemplate labInstructionTemplate0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabInstructionTemplate();
        java.lang.String str1 = labInstructionTemplate0.HoldingTime;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutSchedule putSchedule2 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutSchedule();
        java.time.OffsetDateTime offsetDateTime3 = putSchedule2.StartDate;
        java.time.OffsetDateTime offsetDateTime4 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutSchedule putSchedule5 = putSchedule2.setEndDate(offsetDateTime4);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes6 = putSchedule5.AuditAttributes;
        java.time.OffsetDateTime offsetDateTime7 = null;
        putSchedule5.LastGenerationDate = offsetDateTime7;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.RecurrenceDayMonthlyType recurrenceDayMonthlyType9 = putSchedule5.RecurrenceDayMonthly;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PlannedFieldResult plannedFieldResult10 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PlannedFieldResult();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes11 = plannedFieldResult10.AuditAttributes;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabResultDetails labResultDetails12 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabResultDetails();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabResultDetails labResultDetails14 = labResultDetails12.setAnalysisComment("/AQUARIUS/Acquisition/v2");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes15 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabResultDetails labResultDetails16 = labResultDetails14.setAuditAttributes(auditAttributes15);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PlannedFieldResult plannedFieldResult17 = plannedFieldResult10.setAuditAttributes(auditAttributes15);
        putSchedule5.AuditAttributes = auditAttributes15;
        labInstructionTemplate0.AuditAttributes = auditAttributes15;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedProperty observedProperty20 = labInstructionTemplate0.ObservedProperty;
        java.lang.String str21 = labInstructionTemplate0.getAnalysisComment();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(offsetDateTime3);
        org.junit.Assert.assertNotNull(putSchedule5);
        org.junit.Assert.assertNull(auditAttributes6);
        org.junit.Assert.assertNull(recurrenceDayMonthlyType9);
        org.junit.Assert.assertNull(auditAttributes11);
        org.junit.Assert.assertNotNull(labResultDetails14);
        org.junit.Assert.assertNotNull(labResultDetails16);
        org.junit.Assert.assertNotNull(plannedFieldResult17);
        org.junit.Assert.assertNull(observedProperty20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test00724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00724");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ChartDataPoint chartDataPoint0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ChartDataPoint();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ChartDataPoint chartDataPoint2 = chartDataPoint0.setMdlValueUnitCustomId("MaxInstant");
        chartDataPoint2.ObservationId = "2021.4.62.0";
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ChartDataPoint chartDataPoint6 = chartDataPoint2.setMdlValueUnitCustomId("");
        java.lang.String str7 = chartDataPoint6.getObservationId();
        org.junit.Assert.assertNotNull(chartDataPoint2);
        org.junit.Assert.assertNotNull(chartDataPoint6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2021.4.62.0" + "'", str7, "2021.4.62.0");
    }

    @Test
    public void test00725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00725");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.AttachmentType attachmentType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.AttachmentType.Pdf;
        org.junit.Assert.assertTrue("'" + attachmentType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.AttachmentType.Pdf + "'", attachmentType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.AttachmentType.Pdf));
    }

    @Test
    public void test00726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00726");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostUser postUser0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostUser();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.UserProfile userProfile1 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostUser postUser2 = postUser0.setUserProfile(userProfile1);
        java.util.List<java.lang.String> strList3 = postUser0.AccessGroups;
        org.junit.Assert.assertNotNull(postUser2);
        org.junit.Assert.assertNull(strList3);
    }

    @Test
    public void test00727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00727");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationMonitoringMethod locationMonitoringMethod0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationMonitoringMethod();
        java.lang.String str1 = locationMonitoringMethod0.getModel();
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagMetadata> tagMetadataList2 = null;
        locationMonitoringMethod0.Tags = tagMetadataList2;
        java.lang.String str4 = locationMonitoringMethod0.getParameterId();
        locationMonitoringMethod0.Method = "/AQUARIUS/Acquisition/v2";
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagMetadata> tagMetadataList7 = locationMonitoringMethod0.Tags;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(tagMetadataList7);
    }

    @Test
    public void test00728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00728");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupType analyticalGroupType0 = com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupType.UNKNOWN;
        org.junit.Assert.assertTrue("'" + analyticalGroupType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupType.UNKNOWN + "'", analyticalGroupType0.equals(com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupType.UNKNOWN));
    }

    @Test
    public void test00729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00729");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingPlanPlannedActivity samplingPlanPlannedActivity0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingPlanPlannedActivity();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes1 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingPlanPlannedActivity samplingPlanPlannedActivity2 = samplingPlanPlannedActivity0.setAuditAttributes(auditAttributes1);
        java.lang.String str3 = samplingPlanPlannedActivity2.getId();
        org.junit.Assert.assertNotNull(samplingPlanPlannedActivity2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00730");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.DeleteSetting deleteSetting0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.DeleteSetting();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.DeleteSetting deleteSetting2 = deleteSetting0.setGroup("/AQUARIUS/Provisioning/v1");
        java.lang.String str3 = deleteSetting2.Key;
        org.junit.Assert.assertNotNull(deleteSetting2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00731");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Unit unit0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Unit();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Unit unit2 = unit0.setBaseOffset((java.lang.Double) (-1.0d));
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Unit unit4 = unit0.setBaseMultiplier((java.lang.Double) 100.0d);
        unit4.PluralName = "MinInstant";
        org.junit.Assert.assertNotNull(unit2);
        org.junit.Assert.assertNotNull(unit4);
    }

    @Test
    public void test00732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00732");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Inspection inspection0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Inspection();
        java.lang.String str1 = inspection0.getManufacturer();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Inspection inspection3 = inspection0.setSubLocationIdentifier("");
        inspection3.Model = "9999-12-31T23:59:59.999Z";
        java.time.Instant instant6 = inspection3.Time;
        inspection3.Comments = "http";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(inspection3);
        org.junit.Assert.assertNull(instant6);
    }

    @Test
    public void test00733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00733");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutSamplingLocation putSamplingLocation0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutSamplingLocation();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutSamplingLocation putSamplingLocation2 = putSamplingLocation0.setCustomId("https");
        java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ExtendedAttribute> extendedAttributeList3 = putSamplingLocation0.ExtendedAttributes;
        java.lang.String str4 = putSamplingLocation0.CustomId;
        java.lang.String str5 = putSamplingLocation0.getHorizontalCollectionMethod();
        org.junit.Assert.assertNotNull(putSamplingLocation2);
        org.junit.Assert.assertNull(extendedAttributeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "https" + "'", str4, "https");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00734");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CalibrationCheck calibrationCheck0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CalibrationCheck();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CalibrationCheckType calibrationCheckType1 = calibrationCheck0.getCalibrationCheckType();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DoubleWithDisplay doubleWithDisplay2 = calibrationCheck0.Value;
        java.lang.String str3 = calibrationCheck0.getModel();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DoubleWithDisplay doubleWithDisplay4 = calibrationCheck0.Standard;
        java.lang.String str5 = calibrationCheck0.MonitoringMethod;
        calibrationCheck0.ParameterId = "";
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CalibrationCheckType calibrationCheckType8 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CalibrationCheckType.PostCalibration;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CalibrationCheck calibrationCheck9 = calibrationCheck0.setCalibrationCheckType(calibrationCheckType8);
        java.lang.String str10 = calibrationCheck0.getParameterId();
        org.junit.Assert.assertNull(calibrationCheckType1);
        org.junit.Assert.assertNull(doubleWithDisplay2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleWithDisplay4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + calibrationCheckType8 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CalibrationCheckType.PostCalibration + "'", calibrationCheckType8.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CalibrationCheckType.PostCalibration));
        org.junit.Assert.assertNotNull(calibrationCheck9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test00735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00735");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutUnit putUnit0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutUnit();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutUnit putUnit2 = putUnit0.setName("MinInstant");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.UnitGroup unitGroup3 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.UnitGroup();
        unitGroup3.CustomId = "https";
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.UnitGroupSystemCodeType unitGroupSystemCodeType6 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.UnitGroup unitGroup7 = unitGroup3.setSystemCode(unitGroupSystemCodeType6);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutUnit putUnit8 = putUnit2.setUnitGroup(unitGroup7);
        putUnit2.Id = "http://MaxDurationhttp/json/reply/Integer";
        putUnit2.BaseMultiplier = 0.0d;
        org.junit.Assert.assertNotNull(putUnit2);
        org.junit.Assert.assertNotNull(unitGroup7);
        org.junit.Assert.assertNotNull(putUnit8);
    }

    @Test
    public void test00736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00736");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CompletedWork completedWork0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CompletedWork();
        java.lang.Boolean boolean1 = completedWork0.isWaterQualitySampleTaken();
        completedWork0.WaterQualitySampleTaken = true;
        java.lang.Boolean boolean4 = completedWork0.isSedimentSampleTaken();
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test00737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00737");
        java.util.Map<java.lang.Object, java.lang.reflect.Type> objMap2 = null;
        com.aquaticinformatics.aquarius.sdk.samples.FieldNamer fieldNamer3 = new com.aquaticinformatics.aquarius.sdk.samples.FieldNamer();
        com.aquaticinformatics.aquarius.sdk.helpers.SdkServiceClient sdkServiceClient5 = com.aquaticinformatics.aquarius.sdk.helpers.SdkServiceClient.Create("MaxDuration", "http", objMap2, (com.aquaticinformatics.aquarius.sdk.helpers.IFieldNamer) fieldNamer3, false);
        sdkServiceClient5.setTimeout((int) (byte) 100);
        byte[] byteArray15 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 100, (byte) 1, (byte) 100 };
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutRecurringReport putRecurringReport17 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutRecurringReport();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationDatumPeriod locationDatumPeriod18 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationDatumPeriod();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationDatumPeriodBase locationDatumPeriodBase20 = locationDatumPeriod18.setComment("'.'SSSSSSS");
        java.lang.Double double21 = locationDatumPeriodBase20.Elevation;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Qualifier qualifier22 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Qualifier();
        java.time.Instant instant23 = qualifier22.DateApplied;
        java.lang.String str24 = qualifier22.User;
        java.lang.String str25 = qualifier22.getIdentifier();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest timeAlignedDataServiceRequest26 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest();
        java.lang.Object obj27 = timeAlignedDataServiceRequest26.getResponseType();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse28 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse();
        java.time.Instant instant29 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse30 = locationDescriptionListServiceResponse28.setNextToken(instant29);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest timeAlignedDataServiceRequest31 = timeAlignedDataServiceRequest26.setQueryFrom(instant29);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Qualifier qualifier32 = qualifier22.setDateApplied(instant29);
        java.time.Instant instant33 = qualifier32.getDateApplied();
        locationDatumPeriodBase20.ValidFrom = instant33;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.RecurringReportBase recurringReportBase35 = putRecurringReport17.setNextGenerationDate(instant33);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.RecurringReportBase recurringReportBase37 = putRecurringReport17.setRecurrencePeriod("/AQUARIUS");
        java.lang.Class<?> wildcardClass38 = putRecurringReport17.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ActivityTemplateType activityTemplateType39 = sdkServiceClient5.post("/AQUARIUS/Acquisition/v2", byteArray15, "MinInstant", (java.lang.Class) wildcardClass38);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.net.UnknownHostException: MaxDurationhttp");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sdkServiceClient5);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0, -1, 1, 100, 1, 100]");
        org.junit.Assert.assertNotNull(locationDatumPeriodBase20);
        org.junit.Assert.assertNull(double21);
        org.junit.Assert.assertNull(instant23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeAlignedDataServiceResponse");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeAlignedDataServiceResponse");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeAlignedDataServiceResponse");
        org.junit.Assert.assertNotNull(instant29);
        org.junit.Assert.assertNotNull(locationDescriptionListServiceResponse30);
        org.junit.Assert.assertNotNull(timeAlignedDataServiceRequest31);
        org.junit.Assert.assertNotNull(qualifier32);
        org.junit.Assert.assertNotNull(instant33);
        org.junit.Assert.assertNotNull(recurringReportBase35);
        org.junit.Assert.assertNotNull(recurringReportBase37);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test00738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00738");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.GetFieldVisitReadingsByLocationServiceRequest getFieldVisitReadingsByLocationServiceRequest0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.GetFieldVisitReadingsByLocationServiceRequest();
        java.lang.Boolean boolean1 = getFieldVisitReadingsByLocationServiceRequest0.ApplyRounding;
        getFieldVisitReadingsByLocationServiceRequest0.ApplyDatumConversion = true;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.GetFieldVisitReadingsByLocationServiceRequest getFieldVisitReadingsByLocationServiceRequest5 = getFieldVisitReadingsByLocationServiceRequest0.setLocationUniqueId("2021.4.62.0");
        getFieldVisitReadingsByLocationServiceRequest5.Publish = false;
        java.util.ArrayList<java.lang.String> strList8 = getFieldVisitReadingsByLocationServiceRequest5.Parameters;
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNotNull(getFieldVisitReadingsByLocationServiceRequest5);
        org.junit.Assert.assertNull(strList8);
    }

    @Test
    public void test00739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00739");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.TagApplicability tagApplicability0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.TagApplicability.AppliesToReports;
        org.junit.Assert.assertTrue("'" + tagApplicability0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.TagApplicability.AppliesToReports + "'", tagApplicability0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.TagApplicability.AppliesToReports));
    }

    @Test
    public void test00740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00740");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Reading reading0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Reading();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DoubleWithDisplay doubleWithDisplay1 = reading0.getValue();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Reading reading3 = reading0.setParameterId("hi!");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Reading reading5 = reading3.setModel("MaxInstant");
        reading5.Comments = "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ";
        java.time.Instant instant8 = reading5.Time;
        java.lang.String str9 = reading5.getUnit();
        java.lang.String str10 = reading5.NodeDetails;
        java.lang.String str11 = reading5.Parameter;
        org.junit.Assert.assertNull(doubleWithDisplay1);
        org.junit.Assert.assertNotNull(reading3);
        org.junit.Assert.assertNotNull(reading5);
        org.junit.Assert.assertNull(instant8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00741");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Schedule schedule0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Schedule();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Schedule schedule2 = schedule0.setCustomId("");
        java.time.OffsetDateTime offsetDateTime3 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Schedule schedule4 = schedule0.setStartDate(offsetDateTime3);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.RecurrenceType recurrenceType5 = com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.RecurrenceType.MONTHLY;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Schedule schedule6 = schedule4.setRecurrenceType(recurrenceType5);
        java.time.OffsetDateTime offsetDateTime7 = schedule6.getEndDate();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.RecurrenceDayMonthlyType recurrenceDayMonthlyType8 = com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.RecurrenceDayMonthlyType.LAST_DAY_OF_MONTH;
        schedule6.RecurrenceDayMonthly = recurrenceDayMonthlyType8;
        java.time.OffsetDateTime offsetDateTime10 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Schedule schedule11 = schedule6.setEndDate(offsetDateTime10);
        java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SchedulePlannedActivity> schedulePlannedActivityList12 = schedule6.SchedulePlannedActivities;
        java.time.OffsetDateTime offsetDateTime13 = schedule6.getLastGenerationDate();
        org.junit.Assert.assertNotNull(schedule2);
        org.junit.Assert.assertNotNull(schedule4);
        org.junit.Assert.assertTrue("'" + recurrenceType5 + "' != '" + com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.RecurrenceType.MONTHLY + "'", recurrenceType5.equals(com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.RecurrenceType.MONTHLY));
        org.junit.Assert.assertNotNull(schedule6);
        org.junit.Assert.assertNull(offsetDateTime7);
        org.junit.Assert.assertTrue("'" + recurrenceDayMonthlyType8 + "' != '" + com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.RecurrenceDayMonthlyType.LAST_DAY_OF_MONTH + "'", recurrenceDayMonthlyType8.equals(com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.RecurrenceDayMonthlyType.LAST_DAY_OF_MONTH));
        org.junit.Assert.assertNotNull(schedule11);
        org.junit.Assert.assertNull(schedulePlannedActivityList12);
        org.junit.Assert.assertNull(offsetDateTime13);
    }

    @Test
    public void test00742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00742");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.DeleteStandardReferenceDatum deleteStandardReferenceDatum0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.DeleteStandardReferenceDatum();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.DeleteStandardReferenceDatum deleteStandardReferenceDatum2 = deleteStandardReferenceDatum0.setStandardIdentifier("MaxInstant");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.DeleteStandardReferenceDatum deleteStandardReferenceDatum4 = deleteStandardReferenceDatum0.setStandardIdentifier("2021.4.62.0");
        java.lang.String str5 = deleteStandardReferenceDatum4.getStandardIdentifier();
        deleteStandardReferenceDatum4.StandardIdentifier = "http://MaxDurationhttp/json/reply/Integer";
        org.junit.Assert.assertNotNull(deleteStandardReferenceDatum2);
        org.junit.Assert.assertNotNull(deleteStandardReferenceDatum4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2021.4.62.0" + "'", str5, "2021.4.62.0");
    }

    @Test
    public void test00743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00743");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Approval approval0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Approval();
        java.lang.String str1 = approval0.User;
        approval0.LevelDescription = "MinDuration";
        approval0.ApprovalLevel = 1;
        java.lang.String str6 = approval0.getLevelDescription();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MinDuration" + "'", str6, "MinDuration");
    }

    @Test
    public void test00744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00744");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabInstructionTemplate labInstructionTemplate0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabInstructionTemplate();
        java.lang.String str1 = labInstructionTemplate0.HoldingTime;
        labInstructionTemplate0.Id = "MaxInstant";
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test00745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00745");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Schedule schedule0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Schedule();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Schedule schedule2 = schedule0.setCustomId("");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SchedulePlannedActivity[] schedulePlannedActivityArray3 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SchedulePlannedActivity[] {};
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SchedulePlannedActivity> schedulePlannedActivityList4 = new java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SchedulePlannedActivity>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SchedulePlannedActivity>) schedulePlannedActivityList4, schedulePlannedActivityArray3);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Schedule schedule6 = schedule2.setSchedulePlannedActivities((java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SchedulePlannedActivity>) schedulePlannedActivityList4);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingLocationGroup samplingLocationGroup7 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Schedule schedule8 = schedule6.setSamplingLocationGroup(samplingLocationGroup7);
        java.time.OffsetDateTime offsetDateTime9 = schedule8.getEndDate();
        java.lang.String str10 = schedule8.Id;
        org.junit.Assert.assertNotNull(schedule2);
        org.junit.Assert.assertNotNull(schedulePlannedActivityArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(schedule6);
        org.junit.Assert.assertNotNull(schedule8);
        org.junit.Assert.assertNull(offsetDateTime9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00746");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostDetectioncondition postDetectioncondition0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostDetectioncondition();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes1 = postDetectioncondition0.getAuditAttributes();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostDetectioncondition postDetectioncondition3 = postDetectioncondition0.setId("9999-12-31T23:59:59.999Z");
        postDetectioncondition3.Name = "/AQUARIUS/Provisioning/v1";
        org.junit.Assert.assertNull(auditAttributes1);
        org.junit.Assert.assertNotNull(postDetectioncondition3);
    }

    @Test
    public void test00747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00747");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Vertical vertical0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Vertical();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.QuantityWithDisplay quantityWithDisplay1 = null;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Vertical vertical2 = vertical0.setSegmentVelocity(quantityWithDisplay1);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.PointVelocityObservationType pointVelocityObservationType3 = vertical0.VelocityObservationMethod;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FlowDirectionType flowDirectionType4 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FlowDirectionType.Normal;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Vertical vertical5 = vertical0.setFlowDirection(flowDirectionType4);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.QuantityWithDisplay quantityWithDisplay6 = vertical0.MeanVelocity;
        org.junit.Assert.assertNotNull(vertical2);
        org.junit.Assert.assertNull(pointVelocityObservationType3);
        org.junit.Assert.assertTrue("'" + flowDirectionType4 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FlowDirectionType.Normal + "'", flowDirectionType4.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FlowDirectionType.Normal));
        org.junit.Assert.assertNotNull(vertical5);
        org.junit.Assert.assertNull(quantityWithDisplay6);
    }

    @Test
    public void test00748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00748");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Vertical vertical0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Vertical();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FlowDirectionType flowDirectionType1 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FlowDirectionType.Reversed;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Vertical vertical2 = vertical0.setFlowDirection(flowDirectionType1);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.VelocityObservation velocityObservation3 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.VelocityObservation();
        vertical0.VelocityObservation = velocityObservation3;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.OpenWaterData openWaterData5 = vertical0.OpenWaterData;
        org.junit.Assert.assertTrue("'" + flowDirectionType1 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FlowDirectionType.Reversed + "'", flowDirectionType1.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FlowDirectionType.Reversed));
        org.junit.Assert.assertNotNull(vertical2);
        org.junit.Assert.assertNull(openWaterData5);
    }

    @Test
    public void test00749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00749");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitDataServiceResponse fieldVisitDataServiceResponse0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitDataServiceResponse();
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeActivity> dischargeActivityList1 = fieldVisitDataServiceResponse0.DischargeActivities;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ControlConditionActivity controlConditionActivity2 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ControlConditionActivity();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ControlCleanedType controlCleanedType3 = null;
        controlConditionActivity2.ControlCleaned = controlCleanedType3;
        java.lang.String str5 = controlConditionActivity2.FlowOverControl;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitDataServiceResponse fieldVisitDataServiceResponse6 = fieldVisitDataServiceResponse0.setControlConditionActivity(controlConditionActivity2);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DatumConversionResult datumConversionResult7 = null;
        fieldVisitDataServiceResponse6.DatumConversionResult = datumConversionResult7;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ControlConditionActivity controlConditionActivity9 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ControlConditionActivity();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ControlCleanedType controlCleanedType10 = null;
        controlConditionActivity9.ControlCleaned = controlCleanedType10;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.QuantityWithDisplay quantityWithDisplay12 = null;
        controlConditionActivity9.DistanceToGage = quantityWithDisplay12;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ControlConditionActivity controlConditionActivity15 = controlConditionActivity9.setParty("POST");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitDataServiceResponse fieldVisitDataServiceResponse16 = fieldVisitDataServiceResponse6.setControlConditionActivity(controlConditionActivity15);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.InspectionActivity inspectionActivity17 = fieldVisitDataServiceResponse16.getInspectionActivity();
        org.junit.Assert.assertNull(dischargeActivityList1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(fieldVisitDataServiceResponse6);
        org.junit.Assert.assertNotNull(controlConditionActivity15);
        org.junit.Assert.assertNotNull(fieldVisitDataServiceResponse16);
        org.junit.Assert.assertNull(inspectionActivity17);
    }

    @Test
    public void test00750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00750");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostUnitGroup postUnitGroup0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostUnitGroup();
        java.lang.Integer int1 = postUnitGroup0.getTimeDimension();
        postUnitGroup0.BaseUnitIdentifier = "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ";
        java.lang.Integer int4 = postUnitGroup0.IntensityDimension;
        postUnitGroup0.GroupIdentifier = "/AQUARIUS/Acquisition/v2://9999-12-31T23:59:59.999Z";
        java.lang.Integer int7 = postUnitGroup0.LengthDimension;
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test00751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00751");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate specimenTemplate0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate specimenTemplate2 = specimenTemplate0.setCustomId("hi!");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PreservativeType preservativeType3 = com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PreservativeType.SODIUM_AZIDE;
        specimenTemplate2.Preservative = preservativeType3;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabResultDetails labResultDetails5 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabResultDetails();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabResultDetails labResultDetails7 = labResultDetails5.setAnalysisComment("/AQUARIUS/Acquisition/v2");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes8 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabResultDetails labResultDetails9 = labResultDetails7.setAuditAttributes(auditAttributes8);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate specimenTemplate10 = specimenTemplate2.setAuditAttributes(auditAttributes8);
        java.lang.String str11 = specimenTemplate2.Name;
        java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabInstructionTemplate> labInstructionTemplateList12 = specimenTemplate2.getLabInstructionTemplates();
        org.junit.Assert.assertNotNull(specimenTemplate2);
        org.junit.Assert.assertTrue("'" + preservativeType3 + "' != '" + com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PreservativeType.SODIUM_AZIDE + "'", preservativeType3.equals(com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PreservativeType.SODIUM_AZIDE));
        org.junit.Assert.assertNotNull(labResultDetails7);
        org.junit.Assert.assertNotNull(labResultDetails9);
        org.junit.Assert.assertNotNull(specimenTemplate10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(labInstructionTemplateList12);
    }

    @Test
    public void test00752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00752");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.GetFieldVisitReadingsByLocationServiceRequest getFieldVisitReadingsByLocationServiceRequest0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.GetFieldVisitReadingsByLocationServiceRequest();
        java.lang.Boolean boolean1 = getFieldVisitReadingsByLocationServiceRequest0.ApplyRounding;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.GetFieldVisitReadingsByLocationServiceRequest getFieldVisitReadingsByLocationServiceRequest3 = getFieldVisitReadingsByLocationServiceRequest0.setApplyDatumConversion((java.lang.Boolean) false);
        java.lang.Boolean boolean4 = getFieldVisitReadingsByLocationServiceRequest0.isApplyRounding();
        java.lang.String str5 = getFieldVisitReadingsByLocationServiceRequest0.getLocationIdentifier();
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNotNull(getFieldVisitReadingsByLocationServiceRequest3);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00753");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.GetFieldVisitReadingsByLocationServiceRequest getFieldVisitReadingsByLocationServiceRequest0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.GetFieldVisitReadingsByLocationServiceRequest();
        java.lang.Boolean boolean1 = getFieldVisitReadingsByLocationServiceRequest0.ApplyRounding;
        java.lang.String str2 = getFieldVisitReadingsByLocationServiceRequest0.LocationIdentifier;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.GetFieldVisitReadingsByLocationServiceRequest getFieldVisitReadingsByLocationServiceRequest4 = getFieldVisitReadingsByLocationServiceRequest0.setPublish((java.lang.Boolean) true);
        java.lang.Boolean boolean5 = getFieldVisitReadingsByLocationServiceRequest0.isApplyDatumConversion();
        getFieldVisitReadingsByLocationServiceRequest0.ApplyDatumConversion = true;
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(getFieldVisitReadingsByLocationServiceRequest4);
        org.junit.Assert.assertNull(boolean5);
    }

    @Test
    public void test00754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00754");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutUserV2 putUserV2_0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutUserV2();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.UserType userType1 = putUserV2_0.UserType;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutUserV2 putUserV2_3 = putUserV2_0.setEmail("MaxInstant");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.UserProfile userProfile4 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutUserV2 putUserV2_5 = putUserV2_0.setUserProfile(userProfile4);
        java.util.List<java.lang.String> strList6 = putUserV2_0.getRoles();
        java.util.List<java.lang.String> strList7 = putUserV2_0.AccessGroups;
        org.junit.Assert.assertNull(userType1);
        org.junit.Assert.assertNotNull(putUserV2_3);
        org.junit.Assert.assertNotNull(putUserV2_5);
        org.junit.Assert.assertNull(strList6);
        org.junit.Assert.assertNull(strList7);
    }

    @Test
    public void test00755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00755");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostFieldVisitActivityWithTemplate postFieldVisitActivityWithTemplate0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostFieldVisitActivityWithTemplate();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate specimenTemplate1 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate();
        specimenTemplate1.CustomId = "hi!";
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate specimenTemplate4 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate specimenTemplate5 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate();
        java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabInstructionTemplate> labInstructionTemplateList6 = specimenTemplate5.getLabInstructionTemplates();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate specimenTemplate7 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate specimenTemplate9 = specimenTemplate7.setCustomId("hi!");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate specimenTemplate10 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate specimenTemplate11 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate();
        java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabInstructionTemplate> labInstructionTemplateList12 = specimenTemplate11.LabInstructionTemplates;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate[] specimenTemplateArray13 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate[] { specimenTemplate1, specimenTemplate4, specimenTemplate5, specimenTemplate9, specimenTemplate10, specimenTemplate11 };
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate> specimenTemplateList14 = new java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate>) specimenTemplateList14, specimenTemplateArray13);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostFieldVisitActivityWithTemplate postFieldVisitActivityWithTemplate16 = postFieldVisitActivityWithTemplate0.setSpecimenTemplates((java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate>) specimenTemplateList14);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.CollectionMethod collectionMethod17 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.CollectionMethod();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostFieldVisitActivityWithTemplate postFieldVisitActivityWithTemplate18 = postFieldVisitActivityWithTemplate16.setCollectionMethod(collectionMethod17);
        postFieldVisitActivityWithTemplate16.Comment = "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ";
        org.junit.Assert.assertNull(labInstructionTemplateList6);
        org.junit.Assert.assertNotNull(specimenTemplate9);
        org.junit.Assert.assertNull(labInstructionTemplateList12);
        org.junit.Assert.assertNotNull(specimenTemplateArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(postFieldVisitActivityWithTemplate16);
        org.junit.Assert.assertNotNull(postFieldVisitActivityWithTemplate18);
    }

    @Test
    public void test00756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00756");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationFolder locationFolder0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationFolder();
        java.lang.String str1 = locationFolder0.getParentLocationFolderUniqueId();
        java.lang.String str2 = locationFolder0.getLocationFolderPath();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00757");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation observation0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PlannedFieldResult plannedFieldResult1 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation observation2 = observation0.setPlannedFieldResult(plannedFieldResult1);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.QualityControlType qualityControlType3 = null;
        observation0.QualityControlType = qualityControlType3;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PlannedFieldResult plannedFieldResult5 = observation0.PlannedFieldResult;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.NullMeasureQualifier nullMeasureQualifier6 = observation0.getNullMeasureQualifier();
        org.junit.Assert.assertNotNull(observation2);
        org.junit.Assert.assertNull(plannedFieldResult5);
        org.junit.Assert.assertNull(nullMeasureQualifier6);
    }

    @Test
    public void test00758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00758");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ChannelMaterialType channelMaterialType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ChannelMaterialType.Gravel;
        org.junit.Assert.assertTrue("'" + channelMaterialType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ChannelMaterialType.Gravel + "'", channelMaterialType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ChannelMaterialType.Gravel));
    }

    @Test
    public void test00759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00759");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.GetSetting getSetting0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.GetSetting();
        java.lang.String str1 = getSetting0.getGroup();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.GetSetting getSetting3 = getSetting0.setKey("hi!");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.GetSetting getSetting5 = getSetting3.setKey("hi!:///AQUARIUS/Provisioning/v1");
        java.lang.String str6 = getSetting3.getGroup();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(getSetting3);
        org.junit.Assert.assertNotNull(getSetting5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00760");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.util.List<java.lang.String> strList1 = getObservationsV2_0.SamplingContextTagIds;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_2 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        getObservationsV2_2.SpecimenIds = strList5;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags8 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray12 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags15 = putLocationTags8.setTagUniqueIds(strList13);
        getObservationsV2_2.QualityControlTypes = strList13;
        getObservationsV2_0.ResultGrades = strList13;
        java.lang.Double double18 = getObservationsV2_0.getMinNumericResultValue();
        java.util.List<java.lang.String> strList19 = getObservationsV2_0.AnalyticalGroupIds;
        org.junit.Assert.assertNull(strList1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(putLocationTags15);
        org.junit.Assert.assertNull(double18);
        org.junit.Assert.assertNull(strList19);
    }

    @Test
    public void test00761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00761");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.RoleFlattened roleFlattened0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.RoleFlattened();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.RoleFlattenedBase roleFlattenedBase2 = roleFlattened0.setCanEditAppendConfigurations((java.lang.Boolean) false);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.RoleFlattenedBase roleFlattenedBase4 = roleFlattenedBase2.setName("");
        roleFlattenedBase2.CanAddOrRemoveLocations = true;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.RoleFlattenedBase roleFlattenedBase8 = roleFlattenedBase2.setCanEditData((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(roleFlattenedBase2);
        org.junit.Assert.assertNotNull(roleFlattenedBase4);
        org.junit.Assert.assertNotNull(roleFlattenedBase8);
    }

    @Test
    public void test00762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00762");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutAddOrUpdateIndex putAddOrUpdateIndex0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutAddOrUpdateIndex();
        java.lang.String str1 = putAddOrUpdateIndex0.FieldVisitId;
        putAddOrUpdateIndex0.FieldVisitId = "MinInstant";
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test00763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00763");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostStatisticalDerivedTimeSeries postStatisticalDerivedTimeSeries0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostStatisticalDerivedTimeSeries();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostStatisticalDerivedTimeSeries postStatisticalDerivedTimeSeries2 = postStatisticalDerivedTimeSeries0.setComment("'.'SSSSSSS");
        java.lang.String str3 = postStatisticalDerivedTimeSeries2.LocationUniqueId;
        java.lang.Integer int4 = postStatisticalDerivedTimeSeries2.ObservationOffsetInMinutes;
        java.lang.Integer int5 = postStatisticalDerivedTimeSeries2.TimeStepCount;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.NewValueLocationType newValueLocationType6 = postStatisticalDerivedTimeSeries2.NewValueLocation;
        org.junit.Assert.assertNotNull(postStatisticalDerivedTimeSeries2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(newValueLocationType6);
    }

    @Test
    public void test00764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00764");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ApprovalsTransaction approvalsTransaction0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ApprovalsTransaction();
    }

    @Test
    public void test00765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00765");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalysisMethodMinimal analysisMethodMinimal0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalysisMethodMinimal();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalysisMethodMinimal analysisMethodMinimal2 = analysisMethodMinimal0.setName("https");
        java.lang.String str3 = analysisMethodMinimal0.getName();
        org.junit.Assert.assertNotNull(analysisMethodMinimal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "https" + "'", str3, "https");
    }

    @Test
    public void test00766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00766");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostStandard postStandard0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostStandard();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostStandard postStandard2 = postStandard0.setCustomId("/AQUARIUS/Provisioning/v1");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostStandard postStandard4 = postStandard2.setId("/AQUARIUS/Acquisition/v2://9999-12-31T23:59:59.999Z");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservationStandard[] observationStandardArray5 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservationStandard[] {};
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservationStandard> observationStandardList6 = new java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservationStandard>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservationStandard>) observationStandardList6, observationStandardArray5);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostStandard postStandard8 = postStandard4.setObservationStandards((java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservationStandard>) observationStandardList6);
        java.lang.Object obj9 = postStandard8.getResponseType();
        com.aquaticinformatics.aquarius.sdk.samples.Interval interval10 = postStandard8.ApplicabilityRange;
        org.junit.Assert.assertNotNull(postStandard2);
        org.junit.Assert.assertNotNull(postStandard4);
        org.junit.Assert.assertNotNull(observationStandardArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(postStandard8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$StandardDefinition");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$StandardDefinition");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$StandardDefinition");
        org.junit.Assert.assertNull(interval10);
    }

    @Test
    public void test00767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00767");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisit fieldVisit0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisit();
        java.time.Instant instant1 = fieldVisit0.StartTime;
        java.lang.String str2 = fieldVisit0.getParty();
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Attachment> attachmentList3 = fieldVisit0.Attachments;
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Attachment> attachmentList4 = fieldVisit0.Attachments;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DatumConversionResult datumConversionResult5 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DatumConversionResult();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DatumConversionResult datumConversionResult7 = datumConversionResult5.setTargetDatum("http");
        java.lang.String str8 = datumConversionResult5.TargetDatum;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DatumConversionResult datumConversionResult10 = datumConversionResult5.setTargetDatum("https");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisit fieldVisit11 = fieldVisit0.setDatumConversionResult(datumConversionResult10);
        java.time.Instant instant12 = fieldVisit0.getStartTime();
        org.junit.Assert.assertNull(instant1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(attachmentList3);
        org.junit.Assert.assertNull(attachmentList4);
        org.junit.Assert.assertNotNull(datumConversionResult7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http" + "'", str8, "http");
        org.junit.Assert.assertNotNull(datumConversionResult10);
        org.junit.Assert.assertNotNull(fieldVisit11);
        org.junit.Assert.assertNull(instant12);
    }

    @Test
    public void test00768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00768");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReadingType fieldVisitReadingType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReadingType.ExtremeMax;
        org.junit.Assert.assertTrue("'" + fieldVisitReadingType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReadingType.ExtremeMax + "'", fieldVisitReadingType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReadingType.ExtremeMax));
    }

    @Test
    public void test00769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00769");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostExtendedAttribute postExtendedAttribute0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostExtendedAttribute();
        java.lang.Boolean boolean1 = postExtendedAttribute0.isRequired();
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ExtendedAttributeApplicability> extendedAttributeApplicabilityList2 = postExtendedAttribute0.Applicability;
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNull(extendedAttributeApplicabilityList2);
    }

    @Test
    public void test00770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00770");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_6 = getObservationsV2_0.setDataClassifications((java.util.List<java.lang.String>) strList4);
        java.time.Instant instant7 = getObservationsV2_0.getStartObservedTime();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItem importItem8 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItem();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_9 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        getObservationsV2_9.SpecimenIds = strList12;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags15 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray19 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags22 = putLocationTags15.setTagUniqueIds(strList20);
        getObservationsV2_9.QualityControlTypes = strList20;
        java.util.List<java.lang.String> strList24 = getObservationsV2_9.getLabReportIds();
        importItem8.Errors = getObservationsV2_9;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_26 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.util.List<java.lang.String> strList27 = getObservationsV2_26.SamplingContextTagIds;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_28 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        getObservationsV2_28.SpecimenIds = strList31;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags34 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray38 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList39 = new java.util.ArrayList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags41 = putLocationTags34.setTagUniqueIds(strList39);
        getObservationsV2_28.QualityControlTypes = strList39;
        getObservationsV2_26.ResultGrades = strList39;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItem importItem44 = importItem8.setFields((java.util.List<java.lang.String>) strList39);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_45 = getObservationsV2_0.setSearch((java.util.List<java.lang.String>) strList39);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.FieldResultType fieldResultType46 = getObservationsV2_45.FieldResultType;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(getObservationsV2_6);
        org.junit.Assert.assertNull(instant7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(putLocationTags22);
        org.junit.Assert.assertNull(strList24);
        org.junit.Assert.assertNull(strList27);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(putLocationTags41);
        org.junit.Assert.assertNotNull(importItem44);
        org.junit.Assert.assertNotNull(getObservationsV2_45);
        org.junit.Assert.assertNull(fieldResultType46);
    }

    @Test
    public void test00771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00771");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservationImportSummary observationImportSummary0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservationImportSummary();
        observationImportSummary0.UpdateCount = (-1);
        java.lang.Integer int3 = observationImportSummary0.ExpectedCount;
        java.lang.String str4 = observationImportSummary0.SummaryReportText;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportError[] importErrorArray5 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportError[] {};
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportError> importErrorList6 = new java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportError>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportError>) importErrorList6, importErrorArray5);
        observationImportSummary0.ImportJobErrors = importErrorList6;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservationImportSummary observationImportSummary9 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservationImportSummary();
        observationImportSummary9.UpdateCount = (-1);
        java.lang.Integer int12 = observationImportSummary9.ExpectedCount;
        java.lang.String str13 = observationImportSummary9.SummaryReportText;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemObservation[] importItemObservationArray14 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemObservation[] {};
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemObservation> importItemObservationList15 = new java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemObservation>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemObservation>) importItemObservationList15, importItemObservationArray14);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservationImportSummary observationImportSummary17 = observationImportSummary9.setImportItems((java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemObservation>) importItemObservationList15);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservationImportSummary observationImportSummary18 = observationImportSummary0.setNonErrorImportItems((java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemObservation>) importItemObservationList15);
        java.lang.Integer int19 = observationImportSummary18.getNewCount();
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(importErrorArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(importItemObservationArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(observationImportSummary17);
        org.junit.Assert.assertNotNull(observationImportSummary18);
        org.junit.Assert.assertNull(int19);
    }

    @Test
    public void test00772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00772");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabResultDetails labResultDetails0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabResultDetails();
        java.lang.String str1 = labResultDetails0.getQualityFlag();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test00773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00773");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.RoleFlattened roleFlattened0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.RoleFlattened();
        java.lang.Boolean boolean1 = roleFlattened0.CanRemoveFieldVisits;
        roleFlattened0.Name = "MaxInstant";
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationType putLocationType4 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationType();
        java.lang.String str5 = putLocationType4.Description;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_6 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray9 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_12 = getObservationsV2_6.setDataClassifications((java.util.List<java.lang.String>) strList10);
        getObservationsV2_12.DepthUnitCustomId = "hi!";
        java.lang.String str15 = getObservationsV2_12.CustomId;
        java.util.List<java.lang.String> strList16 = getObservationsV2_12.getSearch();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_17 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        getObservationsV2_17.SpecimenIds = strList20;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags23 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray27 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags30 = putLocationTags23.setTagUniqueIds(strList28);
        getObservationsV2_17.QualityControlTypes = strList28;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_32 = getObservationsV2_12.setMedia((java.util.List<java.lang.String>) strList28);
        putLocationType4.ExtendedAttributeDefinitionIds = strList28;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.RoleFlattenedBase roleFlattenedBase34 = roleFlattened0.setRoleApprovalTransitions(strList28);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.RoleFlattenedBase roleFlattenedBase36 = roleFlattenedBase34.setCanEditLocationDetails((java.lang.Boolean) true);
        java.lang.Boolean boolean37 = roleFlattenedBase34.CanEditData;
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(getObservationsV2_12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(strList16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(putLocationTags30);
        org.junit.Assert.assertNotNull(getObservationsV2_32);
        org.junit.Assert.assertNotNull(roleFlattenedBase34);
        org.junit.Assert.assertNotNull(roleFlattenedBase36);
        org.junit.Assert.assertNull(boolean37);
    }

    @Test
    public void test00774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00774");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostStatisticalDerivedTimeSeries postStatisticalDerivedTimeSeries0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostStatisticalDerivedTimeSeries();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostStatisticalDerivedTimeSeries postStatisticalDerivedTimeSeries2 = postStatisticalDerivedTimeSeries0.setComment("'.'SSSSSSS");
        java.lang.String str3 = postStatisticalDerivedTimeSeries0.getParameter();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostStatisticalDerivedTimeSeries postStatisticalDerivedTimeSeries5 = postStatisticalDerivedTimeSeries0.setTimeStepCount((java.lang.Integer) 0);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostStatisticalDerivedTimeSeries postStatisticalDerivedTimeSeries6 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostStatisticalDerivedTimeSeries();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostStatisticalDerivedTimeSeries postStatisticalDerivedTimeSeries8 = postStatisticalDerivedTimeSeries6.setComment("'.'SSSSSSS");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostStatisticalDerivedTimeSeries postStatisticalDerivedTimeSeries10 = postStatisticalDerivedTimeSeries6.setLabel("'.'SSSSSSS");
        postStatisticalDerivedTimeSeries6.Parameter = "2021.4.62.0";
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostStatisticalDerivedTimeSeries postStatisticalDerivedTimeSeries14 = postStatisticalDerivedTimeSeries6.setLocationUniqueId("");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.NewValueLocationType newValueLocationType15 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.NewValueLocationType.Unknown;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostStatisticalDerivedTimeSeries postStatisticalDerivedTimeSeries16 = postStatisticalDerivedTimeSeries14.setNewValueLocation(newValueLocationType15);
        postStatisticalDerivedTimeSeries5.NewValueLocation = newValueLocationType15;
        postStatisticalDerivedTimeSeries5.Publish = true;
        org.junit.Assert.assertNotNull(postStatisticalDerivedTimeSeries2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(postStatisticalDerivedTimeSeries5);
        org.junit.Assert.assertNotNull(postStatisticalDerivedTimeSeries8);
        org.junit.Assert.assertNotNull(postStatisticalDerivedTimeSeries10);
        org.junit.Assert.assertNotNull(postStatisticalDerivedTimeSeries14);
        org.junit.Assert.assertTrue("'" + newValueLocationType15 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.NewValueLocationType.Unknown + "'", newValueLocationType15.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.NewValueLocationType.Unknown));
        org.junit.Assert.assertNotNull(postStatisticalDerivedTimeSeries16);
    }

    @Test
    public void test00775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00775");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ReferencePointPeriod referencePointPeriod0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ReferencePointPeriod();
        java.lang.Boolean boolean1 = referencePointPeriod0.IsMeasuredAgainstLocalAssumedDatum;
        java.lang.Double double2 = referencePointPeriod0.getElevation();
        referencePointPeriod0.Unit = "";
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNull(double2);
    }

    @Test
    public void test00776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00776");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Role role0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Role();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Role role2 = role0.setCanRemoveAppendConfigurations((java.lang.Boolean) true);
        role0.CanAddData = true;
        java.lang.Boolean boolean5 = role0.CanRemoveAppendConfigurations;
        org.junit.Assert.assertNotNull(role2);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
    }

    @Test
    public void test00777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00777");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedPropertyImportSummary observedPropertyImportSummary0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedPropertyImportSummary();
        observedPropertyImportSummary0.ErrorCount = 10;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedPropertyImportSummary observedPropertyImportSummary4 = observedPropertyImportSummary0.setSummaryReportText("");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedPropertyImportSummary observedPropertyImportSummary6 = observedPropertyImportSummary0.setSuccessCount((java.lang.Integer) 0);
        java.lang.Integer int7 = observedPropertyImportSummary0.getExpectedCount();
        org.junit.Assert.assertNotNull(observedPropertyImportSummary4);
        org.junit.Assert.assertNotNull(observedPropertyImportSummary6);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test00778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00778");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutBaseStandardReferenceDatum putBaseStandardReferenceDatum0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutBaseStandardReferenceDatum();
        java.lang.Double double1 = putBaseStandardReferenceDatum0.getUncertainty();
        java.lang.Double double2 = putBaseStandardReferenceDatum0.Uncertainty;
        org.junit.Assert.assertNull(double1);
        org.junit.Assert.assertNull(double2);
    }

    @Test
    public void test00779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00779");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesApprovalsTransactionListServiceResponse timeSeriesApprovalsTransactionListServiceResponse0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesApprovalsTransactionListServiceResponse();
        java.lang.String str1 = timeSeriesApprovalsTransactionListServiceResponse0.getSummary();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.PublishServiceResponse publishServiceResponse3 = timeSeriesApprovalsTransactionListServiceResponse0.setResponseVersion((java.lang.Integer) 10);
        java.util.List<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ApprovalsTransaction> approvalsTransactionList4 = timeSeriesApprovalsTransactionListServiceResponse0.getApprovalsTransactions();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(publishServiceResponse3);
        org.junit.Assert.assertNull(approvalsTransactionList4);
    }

    @Test
    public void test00780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00780");
        java.time.Instant instant0 = com.aquaticinformatics.aquarius.sdk.samples.serializers.InstantDeserializer.MaxConcreteValue;
        org.junit.Assert.assertNotNull(instant0);
    }

    @Test
    public void test00781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00781");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisit fieldVisit0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisit();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DatumConversionResult datumConversionResult1 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DatumConversionResult();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DatumConversionResult datumConversionResult3 = datumConversionResult1.setFailureReason("MinInstant");
        fieldVisit0.DatumConversionResult = datumConversionResult3;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.GageHeightAtZeroFlowActivity gageHeightAtZeroFlowActivity5 = fieldVisit0.GageHeightAtZeroFlowActivity;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest timeAlignedDataServiceRequest6 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest();
        java.lang.Object obj7 = timeAlignedDataServiceRequest6.getResponseType();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Attachment attachment8 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Attachment();
        java.lang.String str9 = attachment8.getUrl();
        java.lang.String str10 = attachment8.FileName;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutBulkEditResultGradesV2 putBulkEditResultGradesV2_11 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutBulkEditResultGradesV2();
        java.lang.Double double12 = putBulkEditResultGradesV2_11.DepthValue;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_13 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        getObservationsV2_13.SpecimenIds = strList16;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags19 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray23 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags26 = putLocationTags19.setTagUniqueIds(strList24);
        getObservationsV2_13.QualityControlTypes = strList24;
        java.util.List<java.lang.String> strList28 = getObservationsV2_13.getAnalyticalGroupIds();
        java.util.List<java.lang.String> strList29 = getObservationsV2_13.DataClassifications;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.FieldResultType fieldResultType30 = getObservationsV2_13.FieldResultType;
        java.time.Instant instant31 = getObservationsV2_13.getEndObservedTime();
        java.lang.String str32 = getObservationsV2_13.DepthUnitCustomId;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags33 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray37 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags40 = putLocationTags33.setTagUniqueIds(strList38);
        java.util.ArrayList<java.lang.String> strList41 = putLocationTags40.TagUniqueIds;
        getObservationsV2_13.ProjectIds = strList41;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutBulkEditResultGradesV2 putBulkEditResultGradesV2_43 = putBulkEditResultGradesV2_11.setSearch((java.util.List<java.lang.String>) strList41);
        java.util.List<java.lang.String> strList44 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutBulkEditResultGradesV2 putBulkEditResultGradesV2_45 = putBulkEditResultGradesV2_43.setLabResultLaboratoryIds(strList44);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CalibrationCheck calibrationCheck46 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CalibrationCheck();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CalibrationCheckType calibrationCheckType47 = calibrationCheck46.getCalibrationCheckType();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DoubleWithDisplay doubleWithDisplay48 = calibrationCheck46.Value;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse49 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary50 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary52 = dischargeSummary50.setPublish((java.lang.Boolean) false);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse53 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse();
        java.time.Instant instant54 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse55 = locationDescriptionListServiceResponse53.setNextToken(instant54);
        dischargeSummary50.MeasurementTime = instant54;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse57 = locationDescriptionListServiceResponse49.setNextToken(instant54);
        java.time.Instant instant58 = locationDescriptionListServiceResponse49.getNextToken();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CalibrationCheck calibrationCheck59 = calibrationCheck46.setTime(instant58);
        putBulkEditResultGradesV2_45.StartResultTime = instant58;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Attachment attachment61 = attachment8.setDateUploaded(instant58);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest timeAlignedDataServiceRequest62 = timeAlignedDataServiceRequest6.setQueryFrom(instant58);
        fieldVisit0.LastModified = instant58;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DatumConversionResult datumConversionResult64 = fieldVisit0.DatumConversionResult;
        java.lang.String str65 = datumConversionResult64.TargetDatum;
        org.junit.Assert.assertNotNull(datumConversionResult3);
        org.junit.Assert.assertNull(gageHeightAtZeroFlowActivity5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeAlignedDataServiceResponse");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeAlignedDataServiceResponse");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeAlignedDataServiceResponse");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(double12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(putLocationTags26);
        org.junit.Assert.assertNull(strList28);
        org.junit.Assert.assertNull(strList29);
        org.junit.Assert.assertNull(fieldResultType30);
        org.junit.Assert.assertNull(instant31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(putLocationTags40);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertNotNull(putBulkEditResultGradesV2_43);
        org.junit.Assert.assertNotNull(putBulkEditResultGradesV2_45);
        org.junit.Assert.assertNull(calibrationCheckType47);
        org.junit.Assert.assertNull(doubleWithDisplay48);
        org.junit.Assert.assertNotNull(dischargeSummary52);
        org.junit.Assert.assertNotNull(instant54);
        org.junit.Assert.assertNotNull(locationDescriptionListServiceResponse55);
        org.junit.Assert.assertNotNull(locationDescriptionListServiceResponse57);
        org.junit.Assert.assertNotNull(instant58);
        org.junit.Assert.assertNotNull(calibrationCheck59);
        org.junit.Assert.assertNotNull(attachment61);
        org.junit.Assert.assertNotNull(timeAlignedDataServiceRequest62);
        org.junit.Assert.assertNotNull(datumConversionResult64);
        org.junit.Assert.assertNull(str65);
    }

    @Test
    public void test00782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00782");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutActiveDirectoryUser putActiveDirectoryUser0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutActiveDirectoryUser();
        java.lang.Object obj1 = putActiveDirectoryUser0.getResponseType();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutActiveDirectoryUser putActiveDirectoryUser3 = putActiveDirectoryUser0.setActiveDirectorySid("");
        java.lang.String str4 = putActiveDirectoryUser3.UserPrincipalName;
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning$User");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning$User");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning$User");
        org.junit.Assert.assertNotNull(putActiveDirectoryUser3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00783");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroup analyticalGroup0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroup();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupType analyticalGroupType1 = analyticalGroup0.getType();
        java.lang.String str2 = analyticalGroup0.getName();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroup analyticalGroup4 = analyticalGroup0.setDescription("MinInstant");
        java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem> analyticalGroupItemList5 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroup analyticalGroup6 = analyticalGroup4.setAnalyticalGroupItems(analyticalGroupItemList5);
        java.lang.String str7 = analyticalGroup4.getId();
        org.junit.Assert.assertNull(analyticalGroupType1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(analyticalGroup4);
        org.junit.Assert.assertNotNull(analyticalGroup6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00784");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetChartDataV2 getChartDataV2_0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetChartDataV2();
        java.lang.String str1 = getChartDataV2_0.getActivityCustomId();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetChartDataV2 getChartDataV2_3 = getChartDataV2_0.setFilterId("");
        java.util.List<java.lang.String> strList4 = getChartDataV2_0.ResultGrades;
        java.util.List<java.lang.String> strList5 = getChartDataV2_0.CollectionMethodIds;
        getChartDataV2_0.MinNumericResultValue = 10.0d;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItem importItem8 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItem();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_9 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        getObservationsV2_9.SpecimenIds = strList12;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags15 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray19 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags22 = putLocationTags15.setTagUniqueIds(strList20);
        getObservationsV2_9.QualityControlTypes = strList20;
        java.util.List<java.lang.String> strList24 = getObservationsV2_9.getLabReportIds();
        importItem8.Errors = getObservationsV2_9;
        java.lang.Object obj26 = importItem8.getExistingItem();
        importItem8.Input = "hi!";
        java.lang.Object obj29 = importItem8.getItem();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemStatusType importItemStatusType30 = com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemStatusType.SKIPPED;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItem importItem31 = importItem8.setStatus(importItemStatusType30);
        importItem31.Input = "/AQUARIUS/Provisioning/v1";
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate specimenTemplate34 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate();
        specimenTemplate34.CustomId = "hi!";
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate specimenTemplate38 = specimenTemplate34.setId("hi!");
        java.lang.Boolean boolean39 = specimenTemplate38.getFiltered();
        importItem31.Item = specimenTemplate38;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Processor processor41 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Processor();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostTag postTag42 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostTag();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_43 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray46 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_49 = getObservationsV2_43.setDataClassifications((java.util.List<java.lang.String>) strList47);
        postTag42.PickListValues = strList47;
        java.util.ArrayList<java.lang.String> strList51 = postTag42.PickListValues;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Processor processor52 = processor41.setInputTimeSeriesUniqueIds(strList51);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItem importItem53 = importItem31.setWarningMessages((java.util.List<java.lang.String>) strList51);
        java.util.List<java.lang.String> strList54 = importItem31.getWarningMessages();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetChartDataV2 getChartDataV2_55 = getChartDataV2_0.setSpecimenIds(strList54);
        java.time.Instant instant56 = getChartDataV2_55.StartObservedTime;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(getChartDataV2_3);
        org.junit.Assert.assertNull(strList4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(putLocationTags22);
        org.junit.Assert.assertNull(strList24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + importItemStatusType30 + "' != '" + com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemStatusType.SKIPPED + "'", importItemStatusType30.equals(com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemStatusType.SKIPPED));
        org.junit.Assert.assertNotNull(importItem31);
        org.junit.Assert.assertNotNull(specimenTemplate38);
        org.junit.Assert.assertNull(boolean39);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(getObservationsV2_49);
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertNotNull(processor52);
        org.junit.Assert.assertNotNull(importItem53);
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertNotNull(getChartDataV2_55);
        org.junit.Assert.assertNull(instant56);
    }

    @Test
    public void test00785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00785");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.RoleFlattened roleFlattened0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.RoleFlattened();
        roleFlattened0.CanAddOrRemoveLocations = false;
        java.lang.Boolean boolean3 = roleFlattened0.CanEditAppendConfigurations;
        java.lang.String str4 = roleFlattened0.getName();
        java.lang.Boolean boolean5 = roleFlattened0.CanEditLocationDetails;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.RoleFlattened roleFlattened7 = roleFlattened0.setUniqueId("MinInstant");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.RoleFlattenedBase roleFlattenedBase9 = roleFlattened7.setCanRemoveFieldVisits((java.lang.Boolean) true);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNotNull(roleFlattened7);
        org.junit.Assert.assertNotNull(roleFlattenedBase9);
    }

    @Test
    public void test00786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00786");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.DeleteOpenIdConnectRelyingPartyConfiguration deleteOpenIdConnectRelyingPartyConfiguration0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.DeleteOpenIdConnectRelyingPartyConfiguration();
    }

    @Test
    public void test00787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00787");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutFieldVisit putFieldVisit0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutFieldVisit();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PlannedActivity[] plannedActivityArray1 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PlannedActivity[] {};
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PlannedActivity> plannedActivityList2 = new java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PlannedActivity>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PlannedActivity>) plannedActivityList2, plannedActivityArray1);
        putFieldVisit0.PlannedActivities = plannedActivityList2;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment domainObjectAttachment5 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment();
        java.lang.String str6 = domainObjectAttachment5.getId();
        java.lang.String str7 = domainObjectAttachment5.getId();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Attachment attachment8 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment domainObjectAttachment9 = domainObjectAttachment5.setAttachment(attachment8);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment domainObjectAttachment10 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment();
        java.lang.String str11 = domainObjectAttachment10.getId();
        java.lang.String str12 = domainObjectAttachment10.getId();
        domainObjectAttachment10.Id = "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ";
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment domainObjectAttachment16 = domainObjectAttachment10.setId("hi!");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment domainObjectAttachment17 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment();
        java.lang.String str18 = domainObjectAttachment17.getId();
        java.lang.String str19 = domainObjectAttachment17.getId();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Attachment attachment20 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment domainObjectAttachment21 = domainObjectAttachment17.setAttachment(attachment20);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment domainObjectAttachment22 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment();
        java.lang.String str23 = domainObjectAttachment22.getId();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment domainObjectAttachment24 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment();
        java.lang.String str25 = domainObjectAttachment24.getId();
        java.lang.String str26 = domainObjectAttachment24.getId();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Attachment attachment27 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment domainObjectAttachment28 = domainObjectAttachment24.setAttachment(attachment27);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment domainObjectAttachment29 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment();
        java.lang.String str30 = domainObjectAttachment29.getId();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment[] domainObjectAttachmentArray31 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment[] { domainObjectAttachment5, domainObjectAttachment10, domainObjectAttachment17, domainObjectAttachment22, domainObjectAttachment24, domainObjectAttachment29 };
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment> domainObjectAttachmentList32 = new java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment>) domainObjectAttachmentList32, domainObjectAttachmentArray31);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutFieldVisit putFieldVisit34 = putFieldVisit0.setAttachments((java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment>) domainObjectAttachmentList32);
        java.time.OffsetDateTime offsetDateTime35 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutFieldVisit putFieldVisit36 = putFieldVisit0.setEndTime(offsetDateTime35);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Schedule schedule37 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Schedule();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Schedule schedule39 = schedule37.setCustomId("");
        java.time.OffsetDateTime offsetDateTime40 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Schedule schedule41 = schedule37.setStartDate(offsetDateTime40);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.RecurrenceType recurrenceType42 = com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.RecurrenceType.MONTHLY;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Schedule schedule43 = schedule41.setRecurrenceType(recurrenceType42);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutFieldVisit putFieldVisit44 = putFieldVisit36.setSchedule(schedule41);
        java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ExtendedAttribute> extendedAttributeList45 = putFieldVisit36.ExtendedAttributes;
        org.junit.Assert.assertNotNull(plannedActivityArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(domainObjectAttachment9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(domainObjectAttachment16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(domainObjectAttachment21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(domainObjectAttachment28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(domainObjectAttachmentArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(putFieldVisit34);
        org.junit.Assert.assertNotNull(putFieldVisit36);
        org.junit.Assert.assertNotNull(schedule39);
        org.junit.Assert.assertNotNull(schedule41);
        org.junit.Assert.assertTrue("'" + recurrenceType42 + "' != '" + com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.RecurrenceType.MONTHLY + "'", recurrenceType42.equals(com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.RecurrenceType.MONTHLY));
        org.junit.Assert.assertNotNull(schedule43);
        org.junit.Assert.assertNotNull(putFieldVisit44);
        org.junit.Assert.assertNull(extendedAttributeList45);
    }

    @Test
    public void test00788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00788");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation observation0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PlannedFieldResult plannedFieldResult1 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation observation2 = observation0.setPlannedFieldResult(plannedFieldResult1);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabInstruction labInstruction3 = null;
        observation2.LabInstruction = labInstruction3;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservationStatistics observationStatistics5 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation observation6 = observation2.setStatistics(observationStatistics5);
        java.time.OffsetDateTime offsetDateTime7 = observation6.getResultTime();
        java.time.OffsetDateTime offsetDateTime8 = null;
        observation6.ObservedTime = offsetDateTime8;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation observation11 = observation6.setComment("yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ");
        java.time.OffsetDateTime offsetDateTime12 = observation6.ObservedTime;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ResultStatus resultStatus13 = observation6.ResultStatus;
        org.junit.Assert.assertNotNull(observation2);
        org.junit.Assert.assertNotNull(observation6);
        org.junit.Assert.assertNull(offsetDateTime7);
        org.junit.Assert.assertNotNull(observation11);
        org.junit.Assert.assertNull(offsetDateTime12);
        org.junit.Assert.assertNull(resultStatus13);
    }

    @Test
    public void test00789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00789");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SearchResultTimeZone searchResultTimeZone0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SearchResultTimeZone();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SearchResultTimeZone searchResultTimeZone2 = searchResultTimeZone0.setCursor("/AQUARIUS/Acquisition/v2://9999-12-31T23:59:59.999Z");
        java.lang.Integer int3 = searchResultTimeZone2.TotalCount;
        java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.TimeZone> timeZoneList4 = searchResultTimeZone2.getDomainObjects();
        java.lang.String str5 = searchResultTimeZone2.getCursor();
        java.lang.String str6 = searchResultTimeZone2.Cursor;
        org.junit.Assert.assertNotNull(searchResultTimeZone2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(timeZoneList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/AQUARIUS/Acquisition/v2://9999-12-31T23:59:59.999Z" + "'", str5, "/AQUARIUS/Acquisition/v2://9999-12-31T23:59:59.999Z");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/AQUARIUS/Acquisition/v2://9999-12-31T23:59:59.999Z" + "'", str6, "/AQUARIUS/Acquisition/v2://9999-12-31T23:59:59.999Z");
    }

    @Test
    public void test00790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00790");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesDescription timeSeriesDescription0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesDescription();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest timeAlignedDataServiceRequest1 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest();
        java.lang.Object obj2 = timeAlignedDataServiceRequest1.getResponseType();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse3 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse();
        java.time.Instant instant4 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse5 = locationDescriptionListServiceResponse3.setNextToken(instant4);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest timeAlignedDataServiceRequest6 = timeAlignedDataServiceRequest1.setQueryFrom(instant4);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesDescription timeSeriesDescription7 = timeSeriesDescription0.setRawStartTime(instant4);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesDescription timeSeriesDescription9 = timeSeriesDescription7.setSubLocationIdentifier("");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesDescription timeSeriesDescription11 = timeSeriesDescription9.setUniqueId("/AQUARIUS/Provisioning/v1");
        java.lang.String str12 = timeSeriesDescription11.getDescription();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesDescription timeSeriesDescription14 = timeSeriesDescription11.setPublish((java.lang.Boolean) false);
        java.lang.Boolean boolean15 = timeSeriesDescription14.isPublish();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeAlignedDataServiceResponse");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeAlignedDataServiceResponse");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeAlignedDataServiceResponse");
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(locationDescriptionListServiceResponse5);
        org.junit.Assert.assertNotNull(timeAlignedDataServiceRequest6);
        org.junit.Assert.assertNotNull(timeSeriesDescription7);
        org.junit.Assert.assertNotNull(timeSeriesDescription9);
        org.junit.Assert.assertNotNull(timeSeriesDescription11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(timeSeriesDescription14);
        org.junit.Assert.assertEquals("'" + boolean15 + "' != '" + false + "'", boolean15, false);
    }

    @Test
    public void test00791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00791");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DeleteUnitGroupWithUnit deleteUnitGroupWithUnit0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DeleteUnitGroupWithUnit();
        java.lang.String str1 = deleteUnitGroupWithUnit0.getId();
        java.lang.String str2 = deleteUnitGroupWithUnit0.Id;
        java.lang.String str3 = deleteUnitGroupWithUnit0.getId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00792");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CalibrationCheck calibrationCheck0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CalibrationCheck();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CalibrationCheckType calibrationCheckType1 = calibrationCheck0.getCalibrationCheckType();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DoubleWithDisplay doubleWithDisplay2 = calibrationCheck0.Value;
        java.lang.String str3 = calibrationCheck0.getModel();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DoubleWithDisplay doubleWithDisplay4 = calibrationCheck0.Standard;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DoubleWithDisplay doubleWithDisplay5 = calibrationCheck0.getDifference();
        java.lang.String str6 = calibrationCheck0.Manufacturer;
        org.junit.Assert.assertNull(calibrationCheckType1);
        org.junit.Assert.assertNull(doubleWithDisplay2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleWithDisplay4);
        org.junit.Assert.assertNull(doubleWithDisplay5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00793");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ChartDataPoint chartDataPoint0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ChartDataPoint();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ChartDataPoint chartDataPoint2 = chartDataPoint0.setMdlValueUnitCustomId("MaxInstant");
        java.lang.Double double3 = chartDataPoint2.Value;
        chartDataPoint2.MdlValueUnitCustomId = "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ";
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ChartDataPoint chartDataPoint7 = chartDataPoint2.setNumericResultUnitCustomId("yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ");
        java.time.OffsetDateTime offsetDateTime8 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ChartDataPoint chartDataPoint9 = chartDataPoint2.setObservedTime(offsetDateTime8);
        java.lang.String str10 = chartDataPoint9.getNumericResultUnitCustomId();
        org.junit.Assert.assertNotNull(chartDataPoint2);
        org.junit.Assert.assertNull(double3);
        org.junit.Assert.assertNotNull(chartDataPoint7);
        org.junit.Assert.assertNotNull(chartDataPoint9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ" + "'", str10, "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ");
    }

    @Test
    public void test00794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00794");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationFoldersResponse locationFoldersResponse0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationFoldersResponse();
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationFolder> locationFolderList1 = locationFoldersResponse0.Results;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationFoldersResponse locationFoldersResponse2 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationFoldersResponse();
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationFolder> locationFolderList3 = locationFoldersResponse2.Results;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationFolder locationFolder4 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationFolder();
        java.lang.String str5 = locationFolder4.getParentLocationFolderUniqueId();
        java.lang.String str6 = locationFolder4.UniqueId;
        locationFolder4.ParentLocationFolderUniqueId = "2021.4.62.0";
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationFolder locationFolder9 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationFolder();
        java.lang.String str10 = locationFolder9.getParentLocationFolderUniqueId();
        java.lang.String str11 = locationFolder9.UniqueId;
        locationFolder9.ParentLocationFolderUniqueId = "2021.4.62.0";
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationFolder locationFolder15 = locationFolder9.setLocationFolderName("POST");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationFolder locationFolder17 = locationFolder15.setParentLocationFolderUniqueId("/AQUARIUS");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationFolder locationFolder18 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationFolder();
        java.lang.String str19 = locationFolder18.getParentLocationFolderUniqueId();
        java.lang.String str20 = locationFolder18.UniqueId;
        locationFolder18.ParentLocationFolderUniqueId = "2021.4.62.0";
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationFolder locationFolder24 = locationFolder18.setLocationFolderName("POST");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationFolder locationFolder25 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationFolder();
        java.lang.String str26 = locationFolder25.getParentLocationFolderUniqueId();
        java.lang.String str27 = locationFolder25.ParentLocationFolderPath;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationFolder locationFolder28 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationFolder();
        java.lang.String str29 = locationFolder28.getParentLocationFolderUniqueId();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationFolder locationFolder31 = locationFolder28.setParentLocationFolderUniqueId("9999-12-31T23:59:59.999Z");
        locationFolder31.ParentLocationFolderPath = "/AQUARIUS/Acquisition/v2://9999-12-31T23:59:59.999Z";
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationFolder locationFolder35 = locationFolder31.setLocationFolderDescription("yyyy'-'MM'-'dd'T'HH':'mm':'ss");
        java.lang.String str36 = locationFolder31.LocationFolderDescription;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationFolder locationFolder37 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationFolder();
        java.lang.String str38 = locationFolder37.getParentLocationFolderUniqueId();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationFolder locationFolder40 = locationFolder37.setParentLocationFolderUniqueId("9999-12-31T23:59:59.999Z");
        locationFolder40.ParentLocationFolderPath = "/AQUARIUS/Acquisition/v2://9999-12-31T23:59:59.999Z";
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationFolder locationFolder44 = locationFolder40.setLocationFolderDescription("yyyy'-'MM'-'dd'T'HH':'mm':'ss");
        java.lang.String str45 = locationFolder40.LocationFolderDescription;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationFolder locationFolder46 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationFolder();
        java.lang.String str47 = locationFolder46.getParentLocationFolderUniqueId();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationFolder locationFolder49 = locationFolder46.setParentLocationFolderUniqueId("9999-12-31T23:59:59.999Z");
        locationFolder49.ParentLocationFolderPath = "/AQUARIUS/Acquisition/v2://9999-12-31T23:59:59.999Z";
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationFolder locationFolder53 = locationFolder49.setLocationFolderDescription("yyyy'-'MM'-'dd'T'HH':'mm':'ss");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationFolder locationFolder54 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationFolder();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationFolder locationFolder55 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationFolder();
        java.lang.String str56 = locationFolder55.getParentLocationFolderUniqueId();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationFolder locationFolder58 = locationFolder55.setParentLocationFolderUniqueId("9999-12-31T23:59:59.999Z");
        java.lang.String str59 = locationFolder55.getLocationFolderDescription();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationFolder locationFolder60 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationFolder();
        java.lang.String str61 = locationFolder60.getParentLocationFolderUniqueId();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationFolder locationFolder63 = locationFolder60.setParentLocationFolderUniqueId("9999-12-31T23:59:59.999Z");
        locationFolder63.ParentLocationFolderPath = "/AQUARIUS/Acquisition/v2://9999-12-31T23:59:59.999Z";
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationFolder locationFolder67 = locationFolder63.setLocationFolderDescription("yyyy'-'MM'-'dd'T'HH':'mm':'ss");
        java.lang.String str68 = locationFolder63.LocationFolderDescription;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationFolder locationFolder69 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationFolder();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationFolder locationFolder71 = locationFolder69.setLocationFolderPath("yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSSSSSZZZZZ");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationFolder locationFolder72 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationFolder();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationFolder locationFolder74 = locationFolder72.setLocationFolderPath("yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSSSSSZZZZZ");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationFolder[] locationFolderArray75 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationFolder[] { locationFolder4, locationFolder15, locationFolder24, locationFolder25, locationFolder31, locationFolder40, locationFolder49, locationFolder54, locationFolder55, locationFolder63, locationFolder71, locationFolder74 };
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationFolder> locationFolderList76 = new java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationFolder>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationFolder>) locationFolderList76, locationFolderArray75);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationFoldersResponse locationFoldersResponse78 = locationFoldersResponse2.setResults(locationFolderList76);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationFoldersResponse locationFoldersResponse79 = locationFoldersResponse0.setResults(locationFolderList76);
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationFolder> locationFolderList80 = locationFoldersResponse0.getResults();
        org.junit.Assert.assertNull(locationFolderList1);
        org.junit.Assert.assertNull(locationFolderList3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(locationFolder15);
        org.junit.Assert.assertNotNull(locationFolder17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(locationFolder24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(locationFolder31);
        org.junit.Assert.assertNotNull(locationFolder35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "yyyy'-'MM'-'dd'T'HH':'mm':'ss" + "'", str36, "yyyy'-'MM'-'dd'T'HH':'mm':'ss");
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(locationFolder40);
        org.junit.Assert.assertNotNull(locationFolder44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "yyyy'-'MM'-'dd'T'HH':'mm':'ss" + "'", str45, "yyyy'-'MM'-'dd'T'HH':'mm':'ss");
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(locationFolder49);
        org.junit.Assert.assertNotNull(locationFolder53);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNotNull(locationFolder58);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNotNull(locationFolder63);
        org.junit.Assert.assertNotNull(locationFolder67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "yyyy'-'MM'-'dd'T'HH':'mm':'ss" + "'", str68, "yyyy'-'MM'-'dd'T'HH':'mm':'ss");
        org.junit.Assert.assertNotNull(locationFolder71);
        org.junit.Assert.assertNotNull(locationFolder74);
        org.junit.Assert.assertNotNull(locationFolderArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(locationFoldersResponse78);
        org.junit.Assert.assertNotNull(locationFoldersResponse79);
        org.junit.Assert.assertNotNull(locationFolderList80);
    }

    @Test
    public void test00795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00795");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.InterpolationTypeOperation interpolationTypeOperation0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.InterpolationTypeOperation();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.InterpolationTypeOperation interpolationTypeOperation2 = interpolationTypeOperation0.setUser("0001-01-01T00:00:00.000Z");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MetadataChangeOperationType metadataChangeOperationType3 = interpolationTypeOperation0.OperationType;
        interpolationTypeOperation0.Comments = "ZZZZZ";
        interpolationTypeOperation0.Type = "https";
        java.time.Instant instant8 = interpolationTypeOperation0.StartTime;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.InterpolationTypeOperation interpolationTypeOperation10 = interpolationTypeOperation0.setUser("multipart/form-data; boundary=****44f0772e-c3ca-4316-8e2a-61ec8540d661****");
        org.junit.Assert.assertNotNull(interpolationTypeOperation2);
        org.junit.Assert.assertNull(metadataChangeOperationType3);
        org.junit.Assert.assertNull(instant8);
        org.junit.Assert.assertNotNull(interpolationTypeOperation10);
    }

    @Test
    public void test00796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00796");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation observation0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PlannedFieldResult plannedFieldResult1 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation observation2 = observation0.setPlannedFieldResult(plannedFieldResult1);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabInstruction labInstruction3 = null;
        observation2.LabInstruction = labInstruction3;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.CollectionMethod collectionMethod5 = observation2.CollectionMethod;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.NullMeasureQualifier nullMeasureQualifier6 = null;
        observation2.NullMeasureQualifier = nullMeasureQualifier6;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Taxon taxon8 = null;
        observation2.RelatedTaxon = taxon8;
        org.junit.Assert.assertNotNull(observation2);
        org.junit.Assert.assertNull(collectionMethod5);
    }

    @Test
    public void test00797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00797");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.InputPart inputPart0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.InputPart();
        java.lang.Object obj1 = inputPart0.getHeaders();
        java.lang.String str2 = inputPart0.getBodyAsString();
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00798");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.PointVelocityDischargeActivity pointVelocityDischargeActivity0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.PointVelocityDischargeActivity();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.QuantityWithDisplay quantityWithDisplay1 = pointVelocityDischargeActivity0.getVelocityAverage();
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Vertical> verticalList2 = pointVelocityDischargeActivity0.Verticals;
        java.lang.String str3 = pointVelocityDischargeActivity0.SerialNumber;
        java.lang.Boolean boolean4 = pointVelocityDischargeActivity0.isMeterInspectedAfter();
        pointVelocityDischargeActivity0.MeterInspectedBefore = true;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.QuantityWithDisplay quantityWithDisplay7 = null;
        pointVelocityDischargeActivity0.Width = quantityWithDisplay7;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.QuantityWithDisplay quantityWithDisplay9 = pointVelocityDischargeActivity0.getVelocityAverage();
        org.junit.Assert.assertNull(quantityWithDisplay1);
        org.junit.Assert.assertNull(verticalList2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNull(quantityWithDisplay9);
    }

    @Test
    public void test00799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00799");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagApplicability tagApplicability0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagApplicability.AppliesToSensorsGauges;
        org.junit.Assert.assertTrue("'" + tagApplicability0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagApplicability.AppliesToSensorsGauges + "'", tagApplicability0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagApplicability.AppliesToSensorsGauges));
    }

    @Test
    public void test00800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00800");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CurrentMeterType currentMeterType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CurrentMeterType.Radar;
        org.junit.Assert.assertTrue("'" + currentMeterType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CurrentMeterType.Radar + "'", currentMeterType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CurrentMeterType.Radar));
    }

    @Test
    public void test00801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00801");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostSession postSession0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostSession();
        java.lang.Object obj1 = postSession0.getResponseType();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostSession postSession3 = postSession0.setEncryptedPassword("hi!");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostSession postSession5 = postSession3.setLocale("/AQUARIUS");
        java.lang.String str6 = postSession3.Locale;
        postSession3.Username = "'.'SSSSSSS";
        java.lang.String str9 = postSession3.getLocale();
        java.lang.String str10 = postSession3.getUsername();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "class java.lang.String");
        org.junit.Assert.assertNotNull(postSession3);
        org.junit.Assert.assertNotNull(postSession5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/AQUARIUS" + "'", str6, "/AQUARIUS");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/AQUARIUS" + "'", str9, "/AQUARIUS");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "'.'SSSSSSS" + "'", str10, "'.'SSSSSSS");
    }

    @Test
    public void test00802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00802");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitDataServiceResponse fieldVisitDataServiceResponse0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitDataServiceResponse();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitDataServiceResponse fieldVisitDataServiceResponse1 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitDataServiceResponse();
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeActivity> dischargeActivityList2 = fieldVisitDataServiceResponse1.DischargeActivities;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ControlConditionActivity controlConditionActivity3 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ControlConditionActivity();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ControlCleanedType controlCleanedType4 = null;
        controlConditionActivity3.ControlCleaned = controlCleanedType4;
        java.lang.String str6 = controlConditionActivity3.FlowOverControl;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitDataServiceResponse fieldVisitDataServiceResponse7 = fieldVisitDataServiceResponse1.setControlConditionActivity(controlConditionActivity3);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ControlCleanedType controlCleanedType8 = null;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ControlConditionActivity controlConditionActivity9 = controlConditionActivity3.setControlCleaned(controlCleanedType8);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitDataServiceResponse fieldVisitDataServiceResponse10 = fieldVisitDataServiceResponse0.setControlConditionActivity(controlConditionActivity9);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ControlConditionActivity controlConditionActivity11 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ControlConditionActivity();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ControlCleanedType controlCleanedType12 = null;
        controlConditionActivity11.ControlCleaned = controlCleanedType12;
        java.lang.String str14 = controlConditionActivity11.FlowOverControl;
        java.lang.String str15 = controlConditionActivity11.getComments();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitDataServiceResponse fieldVisitDataServiceResponse16 = fieldVisitDataServiceResponse10.setControlConditionActivity(controlConditionActivity11);
        controlConditionActivity11.FlowOverControl = "http://MaxDurationhttp/json/reply/Integer";
        org.junit.Assert.assertNull(dischargeActivityList2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(fieldVisitDataServiceResponse7);
        org.junit.Assert.assertNotNull(controlConditionActivity9);
        org.junit.Assert.assertNotNull(fieldVisitDataServiceResponse10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(fieldVisitDataServiceResponse16);
    }

    @Test
    public void test00803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00803");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetExportObservations getExportObservations0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetExportObservations();
        java.util.List<java.lang.String> strList1 = getExportObservations0.getLabReportIds();
        java.lang.String str2 = getExportObservations0.DepthUnitCustomId;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetActivityTemplates getActivityTemplates3 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetActivityTemplates();
        java.lang.Object obj4 = getActivityTemplates3.getResponseType();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_5 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        getObservationsV2_5.SpecimenIds = strList8;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags11 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray15 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags18 = putLocationTags11.setTagUniqueIds(strList16);
        getObservationsV2_5.QualityControlTypes = strList16;
        getActivityTemplates3.Type = strList16;
        getExportObservations0.AnalyticalGroupIds = strList16;
        getExportObservations0.MaxNumericResultValue = (-1.0d);
        org.junit.Assert.assertNull(strList1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$SearchResultActivityTemplate");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$SearchResultActivityTemplate");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$SearchResultActivityTemplate");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(putLocationTags18);
    }

    @Test
    public void test00804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00804");
        java.lang.String str0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.IOpenIdConnectUserAuth.Identifier;
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test00805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00805");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesThreshold timeSeriesThreshold0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesThreshold();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesThreshold timeSeriesThreshold2 = timeSeriesThreshold0.setName("yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSSSSSZZZZZ");
        timeSeriesThreshold2.Description = "/AQUARIUS/Acquisition/v2";
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesThreshold timeSeriesThreshold6 = timeSeriesThreshold2.setDisplayColor("yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSSSSSZZZZZ");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ThresholdType thresholdType7 = timeSeriesThreshold6.getType();
        java.lang.String str8 = timeSeriesThreshold6.Description;
        timeSeriesThreshold6.Description = "multipart/form-data; boundary=****bbcf5f9e-6ccf-4b63-91ab-6e645caf02af****";
        org.junit.Assert.assertNotNull(timeSeriesThreshold2);
        org.junit.Assert.assertNotNull(timeSeriesThreshold6);
        org.junit.Assert.assertNull(thresholdType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/AQUARIUS/Acquisition/v2" + "'", str8, "/AQUARIUS/Acquisition/v2");
    }

    @Test
    public void test00806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00806");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostLocationFolder postLocationFolder0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostLocationFolder();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostLocationFolder postLocationFolder2 = postLocationFolder0.setParentLocationFolderPath("-PT87591240H");
        postLocationFolder0.ParentLocationFolderPath = "/AQUARIUS";
        org.junit.Assert.assertNotNull(postLocationFolder2);
    }

    @Test
    public void test00807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00807");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescription locationDescription0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescription();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescription locationDescription2 = locationDescription0.setIdentifier("");
        locationDescription2.UtcOffset = 1.0d;
        java.lang.Boolean boolean5 = locationDescription2.getIsExternalLocation();
        java.lang.String str6 = locationDescription2.getName();
        locationDescription2.Identifier = "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSSSSSZZZZZ";
        java.lang.String str9 = locationDescription2.Identifier;
        java.lang.String str10 = locationDescription2.Name;
        org.junit.Assert.assertNotNull(locationDescription2);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSSSSSZZZZZ" + "'", str9, "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSSSSSZZZZZ");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00808");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ParameterMetadata parameterMetadata0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ParameterMetadata();
        parameterMetadata0.RoundingSpec = "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ";
        java.lang.String str3 = parameterMetadata0.getIdentifier();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ParameterMetadata parameterMetadata5 = parameterMetadata0.setRoundingSpec("'.'SSSSSSS");
        java.lang.String str6 = parameterMetadata5.getUnitGroupIdentifier();
        parameterMetadata5.RoundingSpec = "2021.4.62.0";
        java.lang.String str9 = parameterMetadata5.UnitIdentifier;
        java.lang.String str10 = parameterMetadata5.Identifier;
        parameterMetadata5.UnitIdentifier = "multipart/form-data; boundary=****44f0772e-c3ca-4316-8e2a-61ec8540d661****";
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(parameterMetadata5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00809");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostProject postProject0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostProject();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes1 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostProject postProject2 = postProject0.setAuditAttributes(auditAttributes1);
        java.time.OffsetDateTime offsetDateTime3 = null;
        postProject0.StartTime = offsetDateTime3;
        java.time.OffsetDateTime offsetDateTime5 = postProject0.EndTime;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostProject postProject7 = postProject0.setScopeStatement("");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingPlan samplingPlan8 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingPlan();
        samplingPlan8.SamplingLocationGroupSelectionTypeRandomCount = 0;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingLocationGroupSelectionType samplingLocationGroupSelectionType11 = com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingLocationGroupSelectionType.ALL;
        samplingPlan8.SamplingLocationGroupSelectionType = samplingLocationGroupSelectionType11;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingLocationGroup samplingLocationGroup13 = samplingPlan8.getSamplingLocationGroup();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes14 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingPlan samplingPlan15 = samplingPlan8.setAuditAttributes(auditAttributes14);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostProject postProject16 = postProject7.setAuditAttributes(auditAttributes14);
        java.lang.String str17 = postProject7.Description;
        org.junit.Assert.assertNotNull(postProject2);
        org.junit.Assert.assertNull(offsetDateTime5);
        org.junit.Assert.assertNotNull(postProject7);
        org.junit.Assert.assertTrue("'" + samplingLocationGroupSelectionType11 + "' != '" + com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingLocationGroupSelectionType.ALL + "'", samplingLocationGroupSelectionType11.equals(com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingLocationGroupSelectionType.ALL));
        org.junit.Assert.assertNull(samplingLocationGroup13);
        org.junit.Assert.assertNotNull(samplingPlan15);
        org.junit.Assert.assertNotNull(postProject16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test00810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00810");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostExtendedAttribute postExtendedAttribute0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostExtendedAttribute();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostExtendedAttribute postExtendedAttribute1 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostExtendedAttribute();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.TagValueType tagValueType2 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.TagValueType.PickList;
        postExtendedAttribute1.ValueType = tagValueType2;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.EditableExtendedAttribute editableExtendedAttribute4 = postExtendedAttribute0.setValueType(tagValueType2);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.EditableExtendedAttribute editableExtendedAttribute6 = editableExtendedAttribute4.setRequired((java.lang.Boolean) false);
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ExtendedAttributeApplicability> extendedAttributeApplicabilityList7 = editableExtendedAttribute4.getApplicability();
        org.junit.Assert.assertTrue("'" + tagValueType2 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.TagValueType.PickList + "'", tagValueType2.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.TagValueType.PickList));
        org.junit.Assert.assertNotNull(editableExtendedAttribute4);
        org.junit.Assert.assertNotNull(editableExtendedAttribute6);
        org.junit.Assert.assertNull(extendedAttributeApplicabilityList7);
    }

    @Test
    public void test00811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00811");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostUserV2 postUserV2_0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostUserV2();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.UserProfile userProfile1 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostUserV2 postUserV2_2 = postUserV2_0.setUserProfile(userProfile1);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescription locationDescription3 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescription();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescription locationDescription5 = locationDescription3.setIdentifier("");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescription locationDescription7 = locationDescription5.setUniqueId("'.'SSSSSSS");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.OpenIdConnectRelyingPartyConfiguration openIdConnectRelyingPartyConfiguration8 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.OpenIdConnectRelyingPartyConfiguration();
        openIdConnectRelyingPartyConfiguration8.OptionalIssuerDiscoveryUri = "9999-12-31T23:59:59.999Z";
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_11 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray14 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_17 = getObservationsV2_11.setDataClassifications((java.util.List<java.lang.String>) strList15);
        getObservationsV2_17.DepthUnitCustomId = "hi!";
        java.lang.String str20 = getObservationsV2_17.DepthUnitId;
        java.util.List<java.lang.String> strList21 = null;
        getObservationsV2_17.ProjectIds = strList21;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostUserV2 postUserV2_23 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostUserV2();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.UserProfile userProfile24 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostUserV2 postUserV2_25 = postUserV2_23.setUserProfile(userProfile24);
        java.lang.Object obj26 = postUserV2_25.getResponseType();
        java.util.List<java.lang.String> strList27 = postUserV2_25.AccessGroups;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Reading reading28 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Reading();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DoubleWithDisplay doubleWithDisplay29 = reading28.getValue();
        reading28.ReferencePointUniqueId = "hi!";
        java.lang.String str32 = reading28.Parameter;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary33 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary35 = dischargeSummary33.setPublish((java.lang.Boolean) false);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DoubleWithDisplay doubleWithDisplay36 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DoubleWithDisplay();
        dischargeSummary35.DifferenceDuringVisit = doubleWithDisplay36;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DoubleWithDisplay doubleWithDisplay39 = doubleWithDisplay36.setNumeric((java.lang.Double) 100.0d);
        reading28.Value = doubleWithDisplay39;
        java.lang.Boolean boolean41 = reading28.isPublish();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Reading reading43 = reading28.setParameterId("/AQUARIUS/Acquisition/v2://9999-12-31T23:59:59.999Z");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_44 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray47 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList48 = new java.util.ArrayList<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList48, strArray47);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_50 = getObservationsV2_44.setDataClassifications((java.util.List<java.lang.String>) strList48);
        getObservationsV2_50.DepthUnitCustomId = "hi!";
        java.lang.String str53 = getObservationsV2_50.CustomId;
        java.util.List<java.lang.String> strList54 = getObservationsV2_50.getSearch();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_55 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray57 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList58 = new java.util.ArrayList<java.lang.String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList58, strArray57);
        getObservationsV2_55.SpecimenIds = strList58;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags61 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray65 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList66 = new java.util.ArrayList<java.lang.String>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList66, strArray65);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags68 = putLocationTags61.setTagUniqueIds(strList66);
        getObservationsV2_55.QualityControlTypes = strList66;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_70 = getObservationsV2_50.setMedia((java.util.List<java.lang.String>) strList66);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_71 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String str72 = getObservationsV2_71.getCustomId();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_73 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray75 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList76 = new java.util.ArrayList<java.lang.String>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList76, strArray75);
        getObservationsV2_73.SpecimenIds = strList76;
        getObservationsV2_71.ProjectIds = strList76;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_80 = getObservationsV2_50.setObservedPropertyIds((java.util.List<java.lang.String>) strList76);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Reading reading81 = reading28.setReadingQualifiers(strList76);
        postUserV2_25.Roles = strList76;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_83 = getObservationsV2_17.setIds((java.util.List<java.lang.String>) strList76);
        openIdConnectRelyingPartyConfiguration8.HostedDomains = strList76;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescription locationDescription85 = locationDescription7.setSecondaryFolders(strList76);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostUserV2 postUserV2_86 = postUserV2_0.setAccessGroups((java.util.List<java.lang.String>) strList76);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.UserType userType87 = postUserV2_0.getUserType();
        org.junit.Assert.assertNotNull(postUserV2_2);
        org.junit.Assert.assertNotNull(locationDescription5);
        org.junit.Assert.assertNotNull(locationDescription7);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(getObservationsV2_17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(postUserV2_25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$User");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$User");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$User");
        org.junit.Assert.assertNull(strList27);
        org.junit.Assert.assertNull(doubleWithDisplay29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(dischargeSummary35);
        org.junit.Assert.assertNotNull(doubleWithDisplay39);
        org.junit.Assert.assertNull(boolean41);
        org.junit.Assert.assertNotNull(reading43);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(getObservationsV2_50);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNull(strList54);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(putLocationTags68);
        org.junit.Assert.assertNotNull(getObservationsV2_70);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(getObservationsV2_80);
        org.junit.Assert.assertNotNull(reading81);
        org.junit.Assert.assertNotNull(getObservationsV2_83);
        org.junit.Assert.assertNotNull(locationDescription85);
        org.junit.Assert.assertNotNull(postUserV2_86);
        org.junit.Assert.assertNull(userType87);
    }

    @Test
    public void test00812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00812");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MethodOperation methodOperation0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MethodOperation();
        java.time.Instant instant1 = methodOperation0.getDateAppliedUtc();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary2 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary4 = dischargeSummary2.setPublish((java.lang.Boolean) false);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse5 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse();
        java.time.Instant instant6 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse7 = locationDescriptionListServiceResponse5.setNextToken(instant6);
        dischargeSummary2.MeasurementTime = instant6;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MethodOperation methodOperation9 = methodOperation0.setDateAppliedUtc(instant6);
        methodOperation0.Comments = "/AQUARIUS";
        java.lang.String str12 = methodOperation0.getUser();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Method method14 = methodOperation0.setMethodCode("MaxInstant");
        org.junit.Assert.assertNull(instant1);
        org.junit.Assert.assertNotNull(dischargeSummary4);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(locationDescriptionListServiceResponse7);
        org.junit.Assert.assertNotNull(methodOperation9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(method14);
    }

    @Test
    public void test00813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00813");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.EffectiveRatingCurveServiceRequest effectiveRatingCurveServiceRequest0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.EffectiveRatingCurveServiceRequest();
        java.lang.String str1 = effectiveRatingCurveServiceRequest0.RatingModelIdentifier;
        java.lang.String str2 = effectiveRatingCurveServiceRequest0.RatingModelIdentifier;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00814");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Reading reading0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Reading();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DoubleWithDisplay doubleWithDisplay1 = reading0.getValue();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Reading reading3 = reading0.setParameterId("hi!");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Reading reading5 = reading3.setModel("MaxInstant");
        reading5.Comments = "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ";
        java.time.Instant instant8 = reading5.Time;
        java.lang.String str9 = reading5.getUnit();
        java.lang.Boolean boolean10 = reading5.isUseLocationDatumAsReference();
        reading5.ParameterId = "2021.4.62.0";
        org.junit.Assert.assertNull(doubleWithDisplay1);
        org.junit.Assert.assertNotNull(reading3);
        org.junit.Assert.assertNotNull(reading5);
        org.junit.Assert.assertNull(instant8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(boolean10);
    }

    @Test
    public void test00815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00815");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SearchResultLabReportImportHistoryEvent searchResultLabReportImportHistoryEvent0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SearchResultLabReportImportHistoryEvent();
        searchResultLabReportImportHistoryEvent0.TotalCount = 100;
        java.lang.String str3 = searchResultLabReportImportHistoryEvent0.getCursor();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00816");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostObservationsDryRunV2 postObservationsDryRunV2_0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostObservationsDryRunV2();
        java.lang.String str1 = postObservationsDryRunV2_0.FileType;
        postObservationsDryRunV2_0.LinkFieldVisitsForNewObservations = false;
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test00817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00817");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutBulkEditResultGradesV2 putBulkEditResultGradesV2_0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutBulkEditResultGradesV2();
        java.lang.Double double1 = putBulkEditResultGradesV2_0.DepthValue;
        java.util.List<java.lang.String> strList2 = putBulkEditResultGradesV2_0.Media;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary3 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary();
        dischargeSummary3.Reviewer = "";
        java.time.Instant instant6 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        dischargeSummary3.MeasurementTime = instant6;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutBulkEditResultGradesV2 putBulkEditResultGradesV2_8 = putBulkEditResultGradesV2_0.setStartModificationTime(instant6);
        java.util.List<java.lang.String> strList9 = putBulkEditResultGradesV2_0.getAnalyticalGroupIds();
        org.junit.Assert.assertNull(double1);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(putBulkEditResultGradesV2_8);
        org.junit.Assert.assertNull(strList9);
    }

    @Test
    public void test00818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00818");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedPropertyImportSummary observedPropertyImportSummary0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedPropertyImportSummary();
        observedPropertyImportSummary0.ErrorCount = 10;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedPropertyImportSummary observedPropertyImportSummary4 = observedPropertyImportSummary0.setSummaryReportText("");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemObservedProperty[] importItemObservedPropertyArray5 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemObservedProperty[] {};
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemObservedProperty> importItemObservedPropertyList6 = new java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemObservedProperty>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemObservedProperty>) importItemObservedPropertyList6, importItemObservedPropertyArray5);
        observedPropertyImportSummary0.ErrorImportItems = importItemObservedPropertyList6;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedPropertyImportSummary observedPropertyImportSummary10 = observedPropertyImportSummary0.setSuccessCount((java.lang.Integer) 10);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedPropertyImportSummary observedPropertyImportSummary11 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedPropertyImportSummary();
        observedPropertyImportSummary11.ErrorCount = 10;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedPropertyImportSummary observedPropertyImportSummary15 = observedPropertyImportSummary11.setSummaryReportText("");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemObservedProperty[] importItemObservedPropertyArray16 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemObservedProperty[] {};
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemObservedProperty> importItemObservedPropertyList17 = new java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemObservedProperty>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemObservedProperty>) importItemObservedPropertyList17, importItemObservedPropertyArray16);
        observedPropertyImportSummary11.ErrorImportItems = importItemObservedPropertyList17;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedPropertyImportSummary observedPropertyImportSummary20 = observedPropertyImportSummary0.setErrorImportItems((java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemObservedProperty>) importItemObservedPropertyList17);
        java.lang.Integer int21 = observedPropertyImportSummary0.getUpdateCount();
        org.junit.Assert.assertNotNull(observedPropertyImportSummary4);
        org.junit.Assert.assertNotNull(importItemObservedPropertyArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(observedPropertyImportSummary10);
        org.junit.Assert.assertNotNull(observedPropertyImportSummary15);
        org.junit.Assert.assertNotNull(importItemObservedPropertyArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(observedPropertyImportSummary20);
        org.junit.Assert.assertNull(int21);
    }

    @Test
    public void test00819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00819");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutActivity putActivity0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutActivity();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Quantity quantity1 = null;
        putActivity0.Depth = quantity1;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.MetricResult[] metricResultArray3 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.MetricResult[] {};
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.MetricResult> metricResultList4 = new java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.MetricResult>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.MetricResult>) metricResultList4, metricResultArray3);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutActivity putActivity6 = putActivity0.setMetricResults((java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.MetricResult>) metricResultList4);
        java.lang.String str7 = putActivity6.getCustomId();
        org.junit.Assert.assertNotNull(metricResultArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(putActivity6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00820");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostObservationsDryRunV2 postObservationsDryRunV2_0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostObservationsDryRunV2();
        java.lang.Boolean boolean1 = postObservationsDryRunV2_0.LinkFieldVisitsForNewObservations;
        java.lang.String str2 = postObservationsDryRunV2_0.FileType;
        java.lang.Boolean boolean3 = postObservationsDryRunV2_0.getLinkFieldVisitsForNewObservations();
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(boolean3);
    }

    @Test
    public void test00821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00821");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Unit unit0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Unit();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Unit unit2 = unit0.setBaseOffset((java.lang.Double) (-1.0d));
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Unit unit4 = unit2.setGroupIdentifier("hi!");
        java.lang.Double double5 = unit4.BaseMultiplier;
        org.junit.Assert.assertNotNull(unit2);
        org.junit.Assert.assertNotNull(unit4);
        org.junit.Assert.assertNull(double5);
    }

    @Test
    public void test00822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00822");
        java.util.Map<java.lang.Object, java.lang.reflect.Type> objMap2 = null;
        com.aquaticinformatics.aquarius.sdk.samples.FieldNamer fieldNamer3 = new com.aquaticinformatics.aquarius.sdk.samples.FieldNamer();
        com.aquaticinformatics.aquarius.sdk.helpers.SdkServiceClient sdkServiceClient5 = com.aquaticinformatics.aquarius.sdk.helpers.SdkServiceClient.Create("MaxDuration", "http", objMap2, (com.aquaticinformatics.aquarius.sdk.helpers.IFieldNamer) fieldNamer3, false);
        net.servicestack.client.ExceptionFilter exceptionFilter6 = null;
        sdkServiceClient5.ExceptionFilter = exceptionFilter6;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DeleteAttachment deleteAttachment8 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DeleteAttachment();
        java.lang.String str9 = deleteAttachment8.Id;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DeleteAttachment deleteAttachment11 = deleteAttachment8.setId("/AQUARIUS/Acquisition/v2://9999-12-31T23:59:59.999Z");
        // The following exception was thrown during execution in test generation
        try {
            sdkServiceClient5.delete((net.servicestack.client.IReturnVoid) deleteAttachment8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sdkServiceClient5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(deleteAttachment11);
    }

    @Test
    public void test00823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00823");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.RoleFlattened roleFlattened0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.RoleFlattened();
        roleFlattened0.CanAddOrRemoveLocations = false;
        java.lang.Boolean boolean3 = roleFlattened0.CanEditAppendConfigurations;
        java.lang.String str4 = roleFlattened0.getName();
        java.lang.Boolean boolean5 = roleFlattened0.CanEditLocationDetails;
        roleFlattened0.CanRemoveFieldVisits = false;
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(boolean5);
    }

    @Test
    public void test00824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00824");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.DeleteStandardReferenceDatum deleteStandardReferenceDatum0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.DeleteStandardReferenceDatum();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.DeleteStandardReferenceDatum deleteStandardReferenceDatum2 = deleteStandardReferenceDatum0.setStandardIdentifier("MaxInstant");
        java.lang.String str3 = deleteStandardReferenceDatum2.StandardIdentifier;
        java.lang.String str4 = deleteStandardReferenceDatum2.LocationUniqueId;
        org.junit.Assert.assertNotNull(deleteStandardReferenceDatum2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MaxInstant" + "'", str3, "MaxInstant");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00825");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationRemark locationRemark0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationRemark();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationRemark locationRemark2 = locationRemark0.setDescription("MaxInstant");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse3 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse();
        java.time.Instant instant4 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse5 = locationDescriptionListServiceResponse3.setNextToken(instant4);
        locationRemark2.FromTime = instant4;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationRemark locationRemark8 = locationRemark2.setRemark("yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSSSSSZZZZZ");
        java.lang.String str9 = locationRemark8.TypeName;
        locationRemark8.TypeName = "hi!:///AQUARIUS/Provisioning/v1";
        org.junit.Assert.assertNotNull(locationRemark2);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(locationDescriptionListServiceResponse5);
        org.junit.Assert.assertNotNull(locationRemark8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00826");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetActivities getActivities0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetActivities();
        java.util.List<java.lang.String> strList1 = getActivities0.Media;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetExportObservations getExportObservations2 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetExportObservations();
        java.util.List<java.lang.String> strList3 = getExportObservations2.getLabReportIds();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationType putLocationType4 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationType();
        java.lang.Object obj5 = putLocationType4.getResponseType();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ReportListServiceRequest reportListServiceRequest6 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ReportListServiceRequest();
        reportListServiceRequest6.ReportTitle = "MinDuration";
        java.lang.String str9 = reportListServiceRequest6.getLocationUniqueId();
        java.time.Instant instant10 = null;
        reportListServiceRequest6.CreatedFrom = instant10;
        java.lang.String[] strArray24 = new java.lang.String[] { "https", "", "MinDuration", "/AQUARIUS/Acquisition/v2", "hi!", "", "2021.4.62.0", "MaxInstant", "http", "MinDuration", "2021.4.62.0", "/AQUARIUS" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        reportListServiceRequest6.TagValues = strList25;
        putLocationType4.ExtendedAttributeDefinitionIds = strList25;
        getExportObservations2.SpecimenIds = strList25;
        getActivities0.Ids = strList25;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetActivities getActivities32 = getActivities0.setCursor("http://MaxDurationhttp/json/reply/ArrayList");
        org.junit.Assert.assertNull(strList1);
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning$LocationType");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning$LocationType");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning$LocationType");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(getActivities32);
    }

    @Test
    public void test00827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00827");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetSamplingLocations getSamplingLocations0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetSamplingLocations();
        java.lang.Object obj1 = getSamplingLocations0.getResponseType();
        getSamplingLocations0.Sort = "/AQUARIUS/Acquisition/v2";
        java.lang.String str4 = getSamplingLocations0.Cursor;
        java.time.Instant instant5 = getSamplingLocations0.getStartModificationTime();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$SearchResultSamplingLocation");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$SearchResultSamplingLocation");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$SearchResultSamplingLocation");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(instant5);
    }

    @Test
    public void test00828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00828");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostLocationFolder postLocationFolder0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostLocationFolder();
        postLocationFolder0.LocationFolderDescription = "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ";
        java.lang.String str3 = postLocationFolder0.LocationFolderName;
        java.lang.String str4 = postLocationFolder0.LocationFolderDescription;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ" + "'", str4, "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ");
    }

    @Test
    public void test00829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00829");
        // The following exception was thrown during execution in test generation
        try {
            java.time.Instant instant1 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.parse("2021.4.62.0");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '2021.4.62.0' could not be parsed at index 4");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00830");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeterType meterType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeterType.HorizontalShaft;
        org.junit.Assert.assertTrue("'" + meterType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeterType.HorizontalShaft + "'", meterType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeterType.HorizontalShaft));
    }

    @Test
    public void test00831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00831");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetAnalysisMethodHistory getAnalysisMethodHistory0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetAnalysisMethodHistory();
        java.lang.String str1 = getAnalysisMethodHistory0.Id;
        java.lang.String str2 = getAnalysisMethodHistory0.getId();
        getAnalysisMethodHistory0.Id = "9999-12-31T23:59:59.999Z";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00832");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.RatingModelInputValuesServiceResponse ratingModelInputValuesServiceResponse0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.RatingModelInputValuesServiceResponse();
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { 0.0d };
        java.util.ArrayList<java.lang.Double> doubleList3 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList3, doubleArray2);
        ratingModelInputValuesServiceResponse0.InputValues = doubleList3;
        java.util.ArrayList<java.lang.Double> doubleList6 = ratingModelInputValuesServiceResponse0.InputValues;
        java.util.ArrayList<java.lang.Double> doubleList7 = ratingModelInputValuesServiceResponse0.InputValues;
        ratingModelInputValuesServiceResponse0.ResponseVersion = 1;
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertNotNull(doubleList7);
    }

    @Test
    public void test00833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00833");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutOpenIdConnectUser putOpenIdConnectUser0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutOpenIdConnectUser();
        java.lang.String str1 = putOpenIdConnectUser0.getSubjectIdentifier();
        putOpenIdConnectUser0.SubjectIdentifier = "9999-12-31T23:59:59.999Z";
        putOpenIdConnectUser0.LastName = "multipart/form-data; boundary=****bbcf5f9e-6ccf-4b63-91ab-6e645caf02af****";
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.UserBase userBase7 = putOpenIdConnectUser0.setFirstName("POST");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(userBase7);
    }

    @Test
    public void test00834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00834");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Acquisition.AttachmentType attachmentType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Acquisition.AttachmentType.Zip;
        org.junit.Assert.assertTrue("'" + attachmentType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Acquisition.AttachmentType.Zip + "'", attachmentType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Acquisition.AttachmentType.Zip));
    }

    @Test
    public void test00835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00835");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.CodeTable codeTable0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.CodeTable();
        java.lang.String str1 = codeTable0.getSystemCode();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.CodeTableRequestBase codeTableRequestBase3 = codeTable0.setPublicIdentifier("https");
        java.lang.Boolean boolean4 = codeTable0.IsSystem;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(codeTableRequestBase3);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test00836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00836");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetChartDataV2 getChartDataV2_0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetChartDataV2();
        getChartDataV2_0.DetectionCondition = "/AQUARIUS/Acquisition/v2://9999-12-31T23:59:59.999Z";
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.GageHeightReading gageHeightReading3 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.GageHeightReading();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ControlConditionActivity controlConditionActivity4 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ControlConditionActivity();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ControlCleanedType controlCleanedType5 = null;
        controlConditionActivity4.ControlCleaned = controlCleanedType5;
        java.lang.String str7 = controlConditionActivity4.getComments();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary8 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary();
        dischargeSummary8.Reviewer = "";
        java.time.Instant instant11 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        dischargeSummary8.MeasurementTime = instant11;
        controlConditionActivity4.DateCleaned = instant11;
        gageHeightReading3.ReadingTime = instant11;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DoubleWithDisplay doubleWithDisplay15 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DoubleWithDisplay();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DoubleWithDisplay doubleWithDisplay17 = doubleWithDisplay15.setNumeric((java.lang.Double) 10.0d);
        java.lang.String str18 = doubleWithDisplay17.getDisplay();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.GageHeightReading gageHeightReading19 = gageHeightReading3.setGageHeight(doubleWithDisplay17);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetChartDataV2 getChartDataV2_20 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetChartDataV2();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary21 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary23 = dischargeSummary21.setMeanGageHeightMethod("hi!");
        java.lang.String str24 = dischargeSummary23.MeasurementId;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary26 = dischargeSummary23.setDischargeMethod("yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSSSSSZZZZZ");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CalibrationCheck calibrationCheck27 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CalibrationCheck();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CalibrationCheckType calibrationCheckType28 = calibrationCheck27.getCalibrationCheckType();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DoubleWithDisplay doubleWithDisplay29 = calibrationCheck27.Value;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse30 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary31 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary33 = dischargeSummary31.setPublish((java.lang.Boolean) false);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse34 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse();
        java.time.Instant instant35 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse36 = locationDescriptionListServiceResponse34.setNextToken(instant35);
        dischargeSummary31.MeasurementTime = instant35;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse38 = locationDescriptionListServiceResponse30.setNextToken(instant35);
        java.time.Instant instant39 = locationDescriptionListServiceResponse30.getNextToken();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CalibrationCheck calibrationCheck40 = calibrationCheck27.setTime(instant39);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary41 = dischargeSummary23.setMeasurementTime(instant39);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetChartDataV2 getChartDataV2_42 = getChartDataV2_20.setStartResultTime(instant39);
        gageHeightReading3.ReadingTime = instant39;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetChartDataV2 getChartDataV2_44 = getChartDataV2_0.setStartObservedTime(instant39);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetChartDataV2 getChartDataV2_46 = getChartDataV2_44.setDepthValue((java.lang.Double) (-1.0d));
        java.time.Instant instant47 = getChartDataV2_44.getStartModificationTime();
        java.time.Instant instant48 = getChartDataV2_44.EndObservedTime;
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(doubleWithDisplay17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(gageHeightReading19);
        org.junit.Assert.assertNotNull(dischargeSummary23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(dischargeSummary26);
        org.junit.Assert.assertNull(calibrationCheckType28);
        org.junit.Assert.assertNull(doubleWithDisplay29);
        org.junit.Assert.assertNotNull(dischargeSummary33);
        org.junit.Assert.assertNotNull(instant35);
        org.junit.Assert.assertNotNull(locationDescriptionListServiceResponse36);
        org.junit.Assert.assertNotNull(locationDescriptionListServiceResponse38);
        org.junit.Assert.assertNotNull(instant39);
        org.junit.Assert.assertNotNull(calibrationCheck40);
        org.junit.Assert.assertNotNull(dischargeSummary41);
        org.junit.Assert.assertNotNull(getChartDataV2_42);
        org.junit.Assert.assertNotNull(getChartDataV2_44);
        org.junit.Assert.assertNotNull(getChartDataV2_46);
        org.junit.Assert.assertNull(instant47);
        org.junit.Assert.assertNull(instant48);
    }

    @Test
    public void test00837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00837");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetFilterHistory getFilterHistory0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetFilterHistory();
        java.lang.String str1 = getFilterHistory0.Id;
        java.lang.String str2 = getFilterHistory0.getId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00838");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetSpecimens getSpecimens0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetSpecimens();
        java.util.List<java.lang.String> strList1 = getSpecimens0.getFieldTripIds();
        java.util.List<java.lang.String> strList2 = getSpecimens0.getSearch();
        org.junit.Assert.assertNull(strList1);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test00839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00839");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CurrentMeterType currentMeterType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CurrentMeterType.OpticalCurrent;
        org.junit.Assert.assertTrue("'" + currentMeterType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CurrentMeterType.OpticalCurrent + "'", currentMeterType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CurrentMeterType.OpticalCurrent));
    }

    @Test
    public void test00840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00840");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostCollectionMethod postCollectionMethod0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostCollectionMethod();
        postCollectionMethod0.IdentifierOrganization = "http://MaxDurationhttp/json/reply/Integer";
        java.lang.String str3 = postCollectionMethod0.getCustomId();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00841");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitDataByLocationServiceRequest fieldVisitDataByLocationServiceRequest0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitDataByLocationServiceRequest();
        java.lang.Boolean boolean1 = fieldVisitDataByLocationServiceRequest0.isIncludeCrossSectionSurveyProfile();
        java.lang.Boolean boolean2 = fieldVisitDataByLocationServiceRequest0.ApplyRounding;
        java.lang.Boolean boolean3 = fieldVisitDataByLocationServiceRequest0.IncludeCrossSectionSurveyProfile;
        java.lang.Object obj4 = fieldVisitDataByLocationServiceRequest0.getResponseType();
        java.lang.Boolean boolean5 = fieldVisitDataByLocationServiceRequest0.isConvertToLocalAssumedDatum();
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$FieldVisitDataByLocationServiceResponse");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$FieldVisitDataByLocationServiceResponse");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$FieldVisitDataByLocationServiceResponse");
        org.junit.Assert.assertNull(boolean5);
    }

    @Test
    public void test00842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00842");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ReadingType readingType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ReadingType.ExtremeMax;
        org.junit.Assert.assertTrue("'" + readingType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ReadingType.ExtremeMax + "'", readingType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ReadingType.ExtremeMax));
    }

    @Test
    public void test00843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00843");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ChannelStabilityType channelStabilityType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ChannelStabilityType.Unknown;
        org.junit.Assert.assertTrue("'" + channelStabilityType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ChannelStabilityType.Unknown + "'", channelStabilityType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ChannelStabilityType.Unknown));
    }

    @Test
    public void test00844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00844");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisit fieldVisit0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisit();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DatumConversionResult datumConversionResult1 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DatumConversionResult();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DatumConversionResult datumConversionResult3 = datumConversionResult1.setFailureReason("MinInstant");
        fieldVisit0.DatumConversionResult = datumConversionResult3;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.GageHeightAtZeroFlowActivity gageHeightAtZeroFlowActivity5 = fieldVisit0.GageHeightAtZeroFlowActivity;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest timeAlignedDataServiceRequest6 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest();
        java.lang.Object obj7 = timeAlignedDataServiceRequest6.getResponseType();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Attachment attachment8 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Attachment();
        java.lang.String str9 = attachment8.getUrl();
        java.lang.String str10 = attachment8.FileName;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutBulkEditResultGradesV2 putBulkEditResultGradesV2_11 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutBulkEditResultGradesV2();
        java.lang.Double double12 = putBulkEditResultGradesV2_11.DepthValue;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_13 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        getObservationsV2_13.SpecimenIds = strList16;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags19 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray23 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags26 = putLocationTags19.setTagUniqueIds(strList24);
        getObservationsV2_13.QualityControlTypes = strList24;
        java.util.List<java.lang.String> strList28 = getObservationsV2_13.getAnalyticalGroupIds();
        java.util.List<java.lang.String> strList29 = getObservationsV2_13.DataClassifications;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.FieldResultType fieldResultType30 = getObservationsV2_13.FieldResultType;
        java.time.Instant instant31 = getObservationsV2_13.getEndObservedTime();
        java.lang.String str32 = getObservationsV2_13.DepthUnitCustomId;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags33 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray37 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags40 = putLocationTags33.setTagUniqueIds(strList38);
        java.util.ArrayList<java.lang.String> strList41 = putLocationTags40.TagUniqueIds;
        getObservationsV2_13.ProjectIds = strList41;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutBulkEditResultGradesV2 putBulkEditResultGradesV2_43 = putBulkEditResultGradesV2_11.setSearch((java.util.List<java.lang.String>) strList41);
        java.util.List<java.lang.String> strList44 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutBulkEditResultGradesV2 putBulkEditResultGradesV2_45 = putBulkEditResultGradesV2_43.setLabResultLaboratoryIds(strList44);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CalibrationCheck calibrationCheck46 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CalibrationCheck();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CalibrationCheckType calibrationCheckType47 = calibrationCheck46.getCalibrationCheckType();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DoubleWithDisplay doubleWithDisplay48 = calibrationCheck46.Value;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse49 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary50 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary52 = dischargeSummary50.setPublish((java.lang.Boolean) false);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse53 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse();
        java.time.Instant instant54 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse55 = locationDescriptionListServiceResponse53.setNextToken(instant54);
        dischargeSummary50.MeasurementTime = instant54;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse57 = locationDescriptionListServiceResponse49.setNextToken(instant54);
        java.time.Instant instant58 = locationDescriptionListServiceResponse49.getNextToken();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CalibrationCheck calibrationCheck59 = calibrationCheck46.setTime(instant58);
        putBulkEditResultGradesV2_45.StartResultTime = instant58;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Attachment attachment61 = attachment8.setDateUploaded(instant58);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest timeAlignedDataServiceRequest62 = timeAlignedDataServiceRequest6.setQueryFrom(instant58);
        fieldVisit0.LastModified = instant58;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DatumConversionResult datumConversionResult64 = fieldVisit0.DatumConversionResult;
        java.time.Instant instant65 = fieldVisit0.getStartTime();
        java.time.Instant instant66 = fieldVisit0.StartTime;
        org.junit.Assert.assertNotNull(datumConversionResult3);
        org.junit.Assert.assertNull(gageHeightAtZeroFlowActivity5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeAlignedDataServiceResponse");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeAlignedDataServiceResponse");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeAlignedDataServiceResponse");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(double12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(putLocationTags26);
        org.junit.Assert.assertNull(strList28);
        org.junit.Assert.assertNull(strList29);
        org.junit.Assert.assertNull(fieldResultType30);
        org.junit.Assert.assertNull(instant31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(putLocationTags40);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertNotNull(putBulkEditResultGradesV2_43);
        org.junit.Assert.assertNotNull(putBulkEditResultGradesV2_45);
        org.junit.Assert.assertNull(calibrationCheckType47);
        org.junit.Assert.assertNull(doubleWithDisplay48);
        org.junit.Assert.assertNotNull(dischargeSummary52);
        org.junit.Assert.assertNotNull(instant54);
        org.junit.Assert.assertNotNull(locationDescriptionListServiceResponse55);
        org.junit.Assert.assertNotNull(locationDescriptionListServiceResponse57);
        org.junit.Assert.assertNotNull(instant58);
        org.junit.Assert.assertNotNull(calibrationCheck59);
        org.junit.Assert.assertNotNull(attachment61);
        org.junit.Assert.assertNotNull(timeAlignedDataServiceRequest62);
        org.junit.Assert.assertNotNull(datumConversionResult64);
        org.junit.Assert.assertNull(instant65);
        org.junit.Assert.assertNull(instant66);
    }

    @Test
    public void test00845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00845");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SearchResultCollectionMethod searchResultCollectionMethod0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SearchResultCollectionMethod();
        java.lang.Integer int1 = searchResultCollectionMethod0.TotalCount;
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test00846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00846");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DownchainProcessorListByRatingModelServiceRequest downchainProcessorListByRatingModelServiceRequest0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DownchainProcessorListByRatingModelServiceRequest();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MetadataChangeTransactionListServiceRequest metadataChangeTransactionListServiceRequest1 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MetadataChangeTransactionListServiceRequest();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostRecurringReport postRecurringReport2 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostRecurringReport();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary3 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary();
        dischargeSummary3.Reviewer = "";
        java.time.Instant instant6 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        dischargeSummary3.MeasurementTime = instant6;
        postRecurringReport2.NextGenerationDate = instant6;
        java.time.Instant instant9 = postRecurringReport2.getNextGenerationDate();
        java.lang.String str10 = com.aquaticinformatics.aquarius.sdk.samples.serializers.InstantSerializer.format(instant9);
        metadataChangeTransactionListServiceRequest1.QueryFrom = instant9;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DownchainProcessorListByRatingModelServiceRequest downchainProcessorListByRatingModelServiceRequest12 = downchainProcessorListByRatingModelServiceRequest0.setQueryTo(instant9);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DownchainProcessorListByRatingModelServiceRequest downchainProcessorListByRatingModelServiceRequest14 = downchainProcessorListByRatingModelServiceRequest0.setRatingModelIdentifier("hi!");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Qualifier qualifier15 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Qualifier();
        java.time.Instant instant16 = qualifier15.DateApplied;
        java.lang.String str17 = qualifier15.User;
        java.lang.String str18 = qualifier15.getIdentifier();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest timeAlignedDataServiceRequest19 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest();
        java.lang.Object obj20 = timeAlignedDataServiceRequest19.getResponseType();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse21 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse();
        java.time.Instant instant22 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse23 = locationDescriptionListServiceResponse21.setNextToken(instant22);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest timeAlignedDataServiceRequest24 = timeAlignedDataServiceRequest19.setQueryFrom(instant22);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Qualifier qualifier25 = qualifier15.setDateApplied(instant22);
        java.time.Instant instant26 = qualifier25.getDateApplied();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DownchainProcessorListByRatingModelServiceRequest downchainProcessorListByRatingModelServiceRequest27 = downchainProcessorListByRatingModelServiceRequest0.setQueryFrom(instant26);
        java.time.Instant instant28 = downchainProcessorListByRatingModelServiceRequest27.getQueryFrom();
        java.lang.Object obj29 = downchainProcessorListByRatingModelServiceRequest27.getResponseType();
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "9999-12-31T23:59:59.999Z" + "'", str10, "9999-12-31T23:59:59.999Z");
        org.junit.Assert.assertNotNull(downchainProcessorListByRatingModelServiceRequest12);
        org.junit.Assert.assertNotNull(downchainProcessorListByRatingModelServiceRequest14);
        org.junit.Assert.assertNull(instant16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeAlignedDataServiceResponse");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeAlignedDataServiceResponse");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeAlignedDataServiceResponse");
        org.junit.Assert.assertNotNull(instant22);
        org.junit.Assert.assertNotNull(locationDescriptionListServiceResponse23);
        org.junit.Assert.assertNotNull(timeAlignedDataServiceRequest24);
        org.junit.Assert.assertNotNull(qualifier25);
        org.junit.Assert.assertNotNull(instant26);
        org.junit.Assert.assertNotNull(downchainProcessorListByRatingModelServiceRequest27);
        org.junit.Assert.assertNotNull(instant28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$ProcessorListServiceResponse");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$ProcessorListServiceResponse");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$ProcessorListServiceResponse");
    }

    @Test
    public void test00847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00847");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostLocationTag postLocationTag0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostLocationTag();
        java.lang.Object obj1 = postLocationTag0.getResponseType();
        java.lang.String str2 = postLocationTag0.getName();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning$NameTag");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning$NameTag");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning$NameTag");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00848");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LevelSurveyActivity levelSurveyActivity0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.IFieldVisitData.LevelSurveyActivity;
        org.junit.Assert.assertNull(levelSurveyActivity0);
    }

    @Test
    public void test00849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00849");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.FieldTrip fieldTrip0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.FieldTrip();
        java.lang.String str1 = fieldTrip0.CustomId;
        java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.FieldVisit> fieldVisitList2 = fieldTrip0.FieldVisits;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(fieldVisitList2);
    }

    @Test
    public void test00850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00850");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostImportVerticalProfileData postImportVerticalProfileData0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostImportVerticalProfileData();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostImportVerticalProfileData postImportVerticalProfileData2 = postImportVerticalProfileData0.setActivityId("MinInstant");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostImportVerticalProfileData postImportVerticalProfileData4 = postImportVerticalProfileData0.setSamplingLocationIds("");
        postImportVerticalProfileData4.ActivityId = "yyyy'-'MM'-'dd'T'HH':'mm':'ss";
        org.junit.Assert.assertNotNull(postImportVerticalProfileData2);
        org.junit.Assert.assertNotNull(postImportVerticalProfileData4);
    }

    @Test
    public void test00851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00851");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupSimple analyticalGroupSimple0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupSimple();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupSimpleType analyticalGroupSimpleType1 = analyticalGroupSimple0.getType();
        org.junit.Assert.assertNull(analyticalGroupSimpleType1);
    }

    @Test
    public void test00852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00852");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutBaseStandardReferenceDatum putBaseStandardReferenceDatum0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutBaseStandardReferenceDatum();
        java.lang.String str1 = putBaseStandardReferenceDatum0.Comments;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutBaseStandardReferenceDatum putBaseStandardReferenceDatum3 = putBaseStandardReferenceDatum0.setComments("MaxInstant");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutBaseStandardReferenceDatum putBaseStandardReferenceDatum5 = putBaseStandardReferenceDatum0.setLocationUniqueId("yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ");
        java.lang.Double double6 = putBaseStandardReferenceDatum0.getUncertainty();
        java.lang.String str7 = putBaseStandardReferenceDatum0.getMethod();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(putBaseStandardReferenceDatum3);
        org.junit.Assert.assertNotNull(putBaseStandardReferenceDatum5);
        org.junit.Assert.assertNull(double6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00853");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Processor processor0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Processor();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostTag postTag1 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostTag();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_2 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_8 = getObservationsV2_2.setDataClassifications((java.util.List<java.lang.String>) strList6);
        postTag1.PickListValues = strList6;
        java.util.ArrayList<java.lang.String> strList10 = postTag1.PickListValues;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Processor processor11 = processor0.setInputTimeSeriesUniqueIds(strList10);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Processor processor13 = processor11.setOutputTimeSeriesUniqueId("2021.4.62.0");
        java.lang.String str14 = processor13.getOutputTimeSeriesUniqueId();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeRange timeRange15 = processor13.ProcessorPeriod;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeRange timeRange16 = processor13.ProcessorPeriod;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeRange timeRange17 = processor13.getProcessorPeriod();
        java.lang.String str18 = processor13.Description;
        java.lang.String str19 = processor13.ProcessorType;
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(getObservationsV2_8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(processor11);
        org.junit.Assert.assertNotNull(processor13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2021.4.62.0" + "'", str14, "2021.4.62.0");
        org.junit.Assert.assertNull(timeRange15);
        org.junit.Assert.assertNull(timeRange16);
        org.junit.Assert.assertNull(timeRange17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test00854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00854");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SearchResultFieldTripBasic searchResultFieldTripBasic0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SearchResultFieldTripBasic();
        searchResultFieldTripBasic0.TotalCount = 4;
        searchResultFieldTripBasic0.TotalCount = 100;
        java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.FieldTripBasic> fieldTripBasicList5 = searchResultFieldTripBasic0.getDomainObjects();
        org.junit.Assert.assertNull(fieldTripBasicList5);
    }

    @Test
    public void test00855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00855");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutBulkEditResultGradesV2 putBulkEditResultGradesV2_0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutBulkEditResultGradesV2();
        java.lang.Double double1 = putBulkEditResultGradesV2_0.DepthValue;
        java.util.List<java.lang.String> strList2 = putBulkEditResultGradesV2_0.Media;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary3 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary();
        dischargeSummary3.Reviewer = "";
        java.time.Instant instant6 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        dischargeSummary3.MeasurementTime = instant6;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutBulkEditResultGradesV2 putBulkEditResultGradesV2_8 = putBulkEditResultGradesV2_0.setStartModificationTime(instant6);
        java.lang.String str9 = putBulkEditResultGradesV2_8.getFilterId();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutBulkEditResultGradesV2 putBulkEditResultGradesV2_11 = putBulkEditResultGradesV2_8.setTargetResultGrade("hi!:///AQUARIUS/Provisioning/v1");
        java.lang.String str12 = putBulkEditResultGradesV2_8.FieldVisitId;
        org.junit.Assert.assertNull(double1);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(putBulkEditResultGradesV2_8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(putBulkEditResultGradesV2_11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00856");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagListServiceResponse tagListServiceResponse0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagListServiceResponse();
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagDefinition> tagDefinitionList1 = tagListServiceResponse0.getTags();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagDefinition tagDefinition2 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagDefinition();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagValueType tagValueType3 = null;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagDefinition tagDefinition4 = tagDefinition2.setValueType(tagValueType3);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagDefinition tagDefinition6 = tagDefinition2.setAppliesToAttachments((java.lang.Boolean) false);
        java.lang.Boolean boolean7 = tagDefinition2.AppliesToAttachments;
        java.lang.Boolean boolean8 = tagDefinition2.isAppliesToSensorsGauges();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagDefinition tagDefinition10 = tagDefinition2.setAppliesToSensorsGauges((java.lang.Boolean) false);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagDefinition tagDefinition11 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagDefinition();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagValueType tagValueType12 = null;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagDefinition tagDefinition13 = tagDefinition11.setValueType(tagValueType12);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagDefinition tagDefinition15 = tagDefinition11.setAppliesToAttachments((java.lang.Boolean) false);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagDefinition tagDefinition17 = tagDefinition15.setKey("yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ");
        java.lang.String str18 = tagDefinition15.Key;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagDefinition tagDefinition19 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagDefinition();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagValueType tagValueType20 = null;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagDefinition tagDefinition21 = tagDefinition19.setValueType(tagValueType20);
        tagDefinition21.AppliesToReports = true;
        tagDefinition21.AppliesToReports = true;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagDefinition tagDefinition26 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagDefinition();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagValueType tagValueType27 = null;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagDefinition tagDefinition28 = tagDefinition26.setValueType(tagValueType27);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagDefinition tagDefinition30 = tagDefinition26.setAppliesToAttachments((java.lang.Boolean) false);
        java.lang.Boolean boolean31 = tagDefinition26.AppliesToAttachments;
        java.lang.Boolean boolean32 = tagDefinition26.isAppliesToSensorsGauges();
        java.lang.String str33 = tagDefinition26.getUniqueId();
        java.lang.Boolean boolean34 = tagDefinition26.isAppliesToLocationNotes();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagDefinition tagDefinition35 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagDefinition();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagValueType tagValueType36 = null;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagDefinition tagDefinition37 = tagDefinition35.setValueType(tagValueType36);
        tagDefinition37.AppliesToReports = true;
        tagDefinition37.AppliesToReports = true;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagDefinition tagDefinition43 = tagDefinition37.setAppliesToLocations((java.lang.Boolean) true);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagDefinition tagDefinition44 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagDefinition();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagValueType tagValueType45 = null;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagDefinition tagDefinition46 = tagDefinition44.setValueType(tagValueType45);
        java.util.ArrayList<java.lang.String> strList47 = tagDefinition44.PickListValues;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagDefinition tagDefinition48 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagDefinition();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagValueType tagValueType49 = null;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagDefinition tagDefinition50 = tagDefinition48.setValueType(tagValueType49);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagDefinition tagDefinition52 = tagDefinition48.setAppliesToAttachments((java.lang.Boolean) false);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagDefinition tagDefinition54 = tagDefinition52.setKey("yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagDefinition tagDefinition56 = tagDefinition52.setAppliesToReports((java.lang.Boolean) false);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagDefinition tagDefinition57 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagDefinition();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagValueType tagValueType58 = null;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagDefinition tagDefinition59 = tagDefinition57.setValueType(tagValueType58);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagDefinition tagDefinition61 = tagDefinition57.setAppliesToAttachments((java.lang.Boolean) false);
        java.lang.Boolean boolean62 = tagDefinition57.AppliesToLocationNotes;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagDefinition tagDefinition63 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagDefinition();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagValueType tagValueType64 = null;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagDefinition tagDefinition65 = tagDefinition63.setValueType(tagValueType64);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagDefinition tagDefinition67 = tagDefinition63.setAppliesToAttachments((java.lang.Boolean) false);
        java.lang.Boolean boolean68 = tagDefinition63.AppliesToAttachments;
        tagDefinition63.AppliesToLocations = true;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagDefinition tagDefinition71 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagDefinition();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagValueType tagValueType72 = null;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagDefinition tagDefinition73 = tagDefinition71.setValueType(tagValueType72);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagDefinition tagDefinition75 = tagDefinition71.setAppliesToAttachments((java.lang.Boolean) false);
        java.lang.Boolean boolean76 = tagDefinition71.AppliesToAttachments;
        java.lang.Boolean boolean77 = tagDefinition71.isAppliesToLocations();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagDefinition tagDefinition78 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagDefinition();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagValueType tagValueType79 = null;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagDefinition tagDefinition80 = tagDefinition78.setValueType(tagValueType79);
        java.util.ArrayList<java.lang.String> strList81 = tagDefinition78.PickListValues;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagDefinition[] tagDefinitionArray82 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagDefinition[] { tagDefinition10, tagDefinition15, tagDefinition21, tagDefinition26, tagDefinition43, tagDefinition44, tagDefinition56, tagDefinition57, tagDefinition63, tagDefinition71, tagDefinition78 };
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagDefinition> tagDefinitionList83 = new java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagDefinition>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagDefinition>) tagDefinitionList83, tagDefinitionArray82);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagListServiceResponse tagListServiceResponse85 = tagListServiceResponse0.setTags(tagDefinitionList83);
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagDefinition> tagDefinitionList86 = tagListServiceResponse85.Tags;
        org.junit.Assert.assertNull(tagDefinitionList1);
        org.junit.Assert.assertNotNull(tagDefinition4);
        org.junit.Assert.assertNotNull(tagDefinition6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + false + "'", boolean7, false);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertNotNull(tagDefinition10);
        org.junit.Assert.assertNotNull(tagDefinition13);
        org.junit.Assert.assertNotNull(tagDefinition15);
        org.junit.Assert.assertNotNull(tagDefinition17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ" + "'", str18, "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ");
        org.junit.Assert.assertNotNull(tagDefinition21);
        org.junit.Assert.assertNotNull(tagDefinition28);
        org.junit.Assert.assertNotNull(tagDefinition30);
        org.junit.Assert.assertEquals("'" + boolean31 + "' != '" + false + "'", boolean31, false);
        org.junit.Assert.assertNull(boolean32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(boolean34);
        org.junit.Assert.assertNotNull(tagDefinition37);
        org.junit.Assert.assertNotNull(tagDefinition43);
        org.junit.Assert.assertNotNull(tagDefinition46);
        org.junit.Assert.assertNull(strList47);
        org.junit.Assert.assertNotNull(tagDefinition50);
        org.junit.Assert.assertNotNull(tagDefinition52);
        org.junit.Assert.assertNotNull(tagDefinition54);
        org.junit.Assert.assertNotNull(tagDefinition56);
        org.junit.Assert.assertNotNull(tagDefinition59);
        org.junit.Assert.assertNotNull(tagDefinition61);
        org.junit.Assert.assertNull(boolean62);
        org.junit.Assert.assertNotNull(tagDefinition65);
        org.junit.Assert.assertNotNull(tagDefinition67);
        org.junit.Assert.assertEquals("'" + boolean68 + "' != '" + false + "'", boolean68, false);
        org.junit.Assert.assertNotNull(tagDefinition73);
        org.junit.Assert.assertNotNull(tagDefinition75);
        org.junit.Assert.assertEquals("'" + boolean76 + "' != '" + false + "'", boolean76, false);
        org.junit.Assert.assertNull(boolean77);
        org.junit.Assert.assertNotNull(tagDefinition80);
        org.junit.Assert.assertNull(strList81);
        org.junit.Assert.assertNotNull(tagDefinitionArray82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(tagListServiceResponse85);
        org.junit.Assert.assertNotNull(tagDefinitionList86);
    }

    @Test
    public void test00857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00857");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ActiveMetersAndCalibrationsServiceRequest activeMetersAndCalibrationsServiceRequest0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ActiveMetersAndCalibrationsServiceRequest();
        java.lang.Object obj1 = activeMetersAndCalibrationsServiceRequest0.getResponseType();
        java.lang.Object obj2 = activeMetersAndCalibrationsServiceRequest0.getResponseType();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$ActiveMetersAndCalibrationsServiceResponse");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$ActiveMetersAndCalibrationsServiceResponse");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$ActiveMetersAndCalibrationsServiceResponse");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$ActiveMetersAndCalibrationsServiceResponse");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$ActiveMetersAndCalibrationsServiceResponse");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$ActiveMetersAndCalibrationsServiceResponse");
    }

    @Test
    public void test00858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00858");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutSamplingLocationGroup putSamplingLocationGroup0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutSamplingLocationGroup();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutSamplingLocationGroup putSamplingLocationGroup2 = putSamplingLocationGroup0.setName("MaxInstant");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes3 = null;
        putSamplingLocationGroup2.AuditAttributes = auditAttributes3;
        org.junit.Assert.assertNotNull(putSamplingLocationGroup2);
    }

    @Test
    public void test00859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00859");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ActivityType activityType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ActivityType.DischargeVolumetric;
        org.junit.Assert.assertTrue("'" + activityType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ActivityType.DischargeVolumetric + "'", activityType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ActivityType.DischargeVolumetric));
    }

    @Test
    public void test00860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00860");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DeleteSamplingLocationGroup deleteSamplingLocationGroup0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DeleteSamplingLocationGroup();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DeleteSamplingLocationGroup deleteSamplingLocationGroup2 = deleteSamplingLocationGroup0.setId("-PT87591240H");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DeleteSamplingLocationGroup deleteSamplingLocationGroup4 = deleteSamplingLocationGroup0.setId("MaxInstant");
        java.lang.String str5 = deleteSamplingLocationGroup0.getId();
        org.junit.Assert.assertNotNull(deleteSamplingLocationGroup2);
        org.junit.Assert.assertNotNull(deleteSamplingLocationGroup4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MaxInstant" + "'", str5, "MaxInstant");
    }

    @Test
    public void test00861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00861");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesApprovalsTransactionListServiceRequest timeSeriesApprovalsTransactionListServiceRequest0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesApprovalsTransactionListServiceRequest();
        java.lang.String str1 = timeSeriesApprovalsTransactionListServiceRequest0.getTimeSeriesUniqueId();
        java.time.Instant instant2 = timeSeriesApprovalsTransactionListServiceRequest0.QueryTo;
        java.time.Instant instant3 = timeSeriesApprovalsTransactionListServiceRequest0.QueryTo;
        java.time.Instant instant4 = timeSeriesApprovalsTransactionListServiceRequest0.getQueryTo();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(instant2);
        org.junit.Assert.assertNull(instant3);
        org.junit.Assert.assertNull(instant4);
    }

    @Test
    public void test00862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00862");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Uncertainty uncertainty0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Uncertainty();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.QualitativeUncertaintyType qualitativeUncertaintyType1 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.QualitativeUncertaintyType.Excellent;
        uncertainty0.QualitativeUncertainty = qualitativeUncertaintyType1;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.QualitativeUncertaintyType qualitativeUncertaintyType3 = uncertainty0.QualitativeUncertainty;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.UncertaintyType uncertaintyType4 = uncertainty0.getUncertaintyType();
        org.junit.Assert.assertTrue("'" + qualitativeUncertaintyType1 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.QualitativeUncertaintyType.Excellent + "'", qualitativeUncertaintyType1.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.QualitativeUncertaintyType.Excellent));
        org.junit.Assert.assertTrue("'" + qualitativeUncertaintyType3 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.QualitativeUncertaintyType.Excellent + "'", qualitativeUncertaintyType3.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.QualitativeUncertaintyType.Excellent));
        org.junit.Assert.assertNull(uncertaintyType4);
    }

    @Test
    public void test00863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00863");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostFieldVisitActivityWithTemplate postFieldVisitActivityWithTemplate0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostFieldVisitActivityWithTemplate();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes1 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostFieldVisitActivityWithTemplate postFieldVisitActivityWithTemplate2 = postFieldVisitActivityWithTemplate0.setAuditAttributes(auditAttributes1);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation observation3 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PlannedFieldResult plannedFieldResult4 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation observation5 = observation3.setPlannedFieldResult(plannedFieldResult4);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabInstruction labInstruction6 = null;
        observation5.LabInstruction = labInstruction6;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservationStatistics observationStatistics8 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation observation9 = observation5.setStatistics(observationStatistics8);
        java.time.OffsetDateTime offsetDateTime10 = observation9.getResultTime();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Quantity quantity11 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Quantity();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Unit unit12 = null;
        quantity11.Unit = unit12;
        observation9.Depth = quantity11;
        postFieldVisitActivityWithTemplate2.Depth = quantity11;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ActivityTemplateType activityTemplateType16 = postFieldVisitActivityWithTemplate2.getType();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostFieldVisitActivityWithTemplate postFieldVisitActivityWithTemplate18 = postFieldVisitActivityWithTemplate2.setId("MaxInstant");
        java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate> specimenTemplateList19 = postFieldVisitActivityWithTemplate18.getSpecimenTemplates();
        org.junit.Assert.assertNotNull(postFieldVisitActivityWithTemplate2);
        org.junit.Assert.assertNotNull(observation5);
        org.junit.Assert.assertNotNull(observation9);
        org.junit.Assert.assertNull(offsetDateTime10);
        org.junit.Assert.assertNull(activityTemplateType16);
        org.junit.Assert.assertNotNull(postFieldVisitActivityWithTemplate18);
        org.junit.Assert.assertNull(specimenTemplateList19);
    }

    @Test
    public void test00864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00864");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagDefinition tagDefinition0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagDefinition();
        java.lang.String str1 = tagDefinition0.UniqueId;
        tagDefinition0.UniqueId = "MaxInstant";
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test00865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00865");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ParameterMetadata parameterMetadata0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ParameterMetadata();
        parameterMetadata0.RoundingSpec = "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ";
        java.lang.String str3 = parameterMetadata0.getIdentifier();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ParameterMetadata parameterMetadata5 = parameterMetadata0.setRoundingSpec("'.'SSSSSSS");
        java.lang.String str6 = parameterMetadata5.getUnitGroupIdentifier();
        parameterMetadata5.RoundingSpec = "2021.4.62.0";
        java.lang.String str9 = parameterMetadata5.UnitIdentifier;
        parameterMetadata5.RoundingSpec = "2021.4.62.0";
        java.lang.String str12 = parameterMetadata5.UnitGroupIdentifier;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(parameterMetadata5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00866");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PopulatedUnitGroup populatedUnitGroup0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PopulatedUnitGroup();
        java.lang.String str1 = populatedUnitGroup0.UniqueId;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.UnitGroup unitGroup3 = populatedUnitGroup0.setDisplayName("https");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.UnitGroup unitGroup5 = unitGroup3.setSubstanceDimension((java.lang.Integer) 4);
        java.lang.Integer int6 = unitGroup3.getMassDimension();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(unitGroup3);
        org.junit.Assert.assertNotNull(unitGroup5);
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test00867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00867");
        java.util.Map<java.lang.Object, java.lang.reflect.Type> objMap2 = null;
        com.aquaticinformatics.aquarius.sdk.samples.FieldNamer fieldNamer3 = new com.aquaticinformatics.aquarius.sdk.samples.FieldNamer();
        com.aquaticinformatics.aquarius.sdk.helpers.SdkServiceClient sdkServiceClient5 = com.aquaticinformatics.aquarius.sdk.helpers.SdkServiceClient.Create("MaxDuration", "http", objMap2, (com.aquaticinformatics.aquarius.sdk.helpers.IFieldNamer) fieldNamer3, false);
        sdkServiceClient5.setTimeout((int) (byte) 100);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_8 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray11 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_14 = getObservationsV2_8.setDataClassifications((java.util.List<java.lang.String>) strList12);
        getObservationsV2_14.DepthUnitCustomId = "hi!";
        java.lang.String str17 = getObservationsV2_14.CustomId;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_18 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        getObservationsV2_18.SpecimenIds = strList21;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags24 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray28 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags31 = putLocationTags24.setTagUniqueIds(strList29);
        getObservationsV2_18.ActivityIds = strList29;
        getObservationsV2_14.ResultStatuses = strList29;
        getObservationsV2_14.FieldVisitId = "9999-12-31T23:59:59.999Z";
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_36 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray39 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_42 = getObservationsV2_36.setDataClassifications((java.util.List<java.lang.String>) strList40);
        java.util.List<java.lang.String> strList43 = getObservationsV2_36.ResultGrades;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary44 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary();
        dischargeSummary44.Reviewer = "";
        java.time.Instant instant47 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        dischargeSummary44.MeasurementTime = instant47;
        getObservationsV2_36.StartResultTime = instant47;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest timeAlignedDataServiceRequest50 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ControlConditionActivity controlConditionActivity51 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ControlConditionActivity();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ControlCleanedType controlCleanedType52 = null;
        controlConditionActivity51.ControlCleaned = controlCleanedType52;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse54 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse();
        java.time.Instant instant55 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse56 = locationDescriptionListServiceResponse54.setNextToken(instant55);
        controlConditionActivity51.DateCleaned = instant55;
        timeAlignedDataServiceRequest50.QueryFrom = instant55;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_59 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray61 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList62 = new java.util.ArrayList<java.lang.String>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList62, strArray61);
        getObservationsV2_59.SpecimenIds = strList62;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags65 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray69 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList70 = new java.util.ArrayList<java.lang.String>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList70, strArray69);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags72 = putLocationTags65.setTagUniqueIds(strList70);
        getObservationsV2_59.ActivityIds = strList70;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest timeAlignedDataServiceRequest74 = timeAlignedDataServiceRequest50.setTimeSeriesOutputUnitIds(strList70);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_75 = getObservationsV2_36.setCollectionMethodIds((java.util.List<java.lang.String>) strList70);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_76 = getObservationsV2_14.setSpecimenIds((java.util.List<java.lang.String>) strList70);
        java.lang.String str78 = sdkServiceClient5.createUrl((java.lang.Object) strList70, "POST");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment domainObjectAttachment79 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment();
        java.lang.String str80 = domainObjectAttachment79.getId();
        java.lang.String str81 = domainObjectAttachment79.getId();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutParameter putParameter82 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutParameter();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ParameterBase parameterBase84 = putParameter82.setUnitGroupIdentifier("/AQUARIUS/Provisioning/v1");
        java.lang.String str85 = putParameter82.getRoundingSpec();
        java.lang.String str86 = putParameter82.getUnitGroupIdentifier();
        java.lang.Object obj87 = putParameter82.getResponseType();
        // The following exception was thrown during execution in test generation
        try {
            com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetUsersV2 getUsersV2_88 = sdkServiceClient5.sendRequest((java.lang.Object) domainObjectAttachment79, obj87);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sdkServiceClient5);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(getObservationsV2_14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(putLocationTags31);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(getObservationsV2_42);
        org.junit.Assert.assertNull(strList43);
        org.junit.Assert.assertNotNull(instant47);
        org.junit.Assert.assertNotNull(instant55);
        org.junit.Assert.assertNotNull(locationDescriptionListServiceResponse56);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(putLocationTags72);
        org.junit.Assert.assertNotNull(timeAlignedDataServiceRequest74);
        org.junit.Assert.assertNotNull(getObservationsV2_75);
        org.junit.Assert.assertNotNull(getObservationsV2_76);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "http://MaxDurationhttp/json/reply/ArrayList" + "'", str78, "http://MaxDurationhttp/json/reply/ArrayList");
        org.junit.Assert.assertNull(str80);
        org.junit.Assert.assertNull(str81);
        org.junit.Assert.assertNotNull(parameterBase84);
        org.junit.Assert.assertNull(str85);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "/AQUARIUS/Provisioning/v1" + "'", str86, "/AQUARIUS/Provisioning/v1");
        org.junit.Assert.assertNotNull(obj87);
        org.junit.Assert.assertEquals(obj87.toString(), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning$Parameter");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj87), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning$Parameter");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj87), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning$Parameter");
    }

    @Test
    public void test00868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00868");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Schedule schedule0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Schedule();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Schedule schedule2 = schedule0.setCustomId("");
        java.time.OffsetDateTime offsetDateTime3 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Schedule schedule4 = schedule0.setStartDate(offsetDateTime3);
        java.lang.String str5 = schedule4.CustomId;
        org.junit.Assert.assertNotNull(schedule2);
        org.junit.Assert.assertNotNull(schedule4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test00869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00869");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostAnalysisMethod postAnalysisMethod0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostAnalysisMethod();
        java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportHistoryEventSimple> importHistoryEventSimpleList1 = postAnalysisMethod0.ImportHistoryEventSimples;
        java.lang.String str2 = postAnalysisMethod0.Context;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes3 = postAnalysisMethod0.AuditAttributes;
        postAnalysisMethod0.Context = "2021.4.62.0";
        org.junit.Assert.assertNull(importHistoryEventSimpleList1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(auditAttributes3);
    }

    @Test
    public void test00870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00870");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DeploymentMethodType deploymentMethodType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DeploymentMethodType.Ice;
        org.junit.Assert.assertTrue("'" + deploymentMethodType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DeploymentMethodType.Ice + "'", deploymentMethodType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DeploymentMethodType.Ice));
    }

    @Test
    public void test00871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00871");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ActivityTemplate activityTemplate0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ActivityTemplate();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes1 = null;
        activityTemplate0.AuditAttributes = auditAttributes1;
        java.lang.String str3 = activityTemplate0.getComment();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostFieldVisitActivityWithTemplate postFieldVisitActivityWithTemplate4 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostFieldVisitActivityWithTemplate();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate specimenTemplate5 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate();
        specimenTemplate5.CustomId = "hi!";
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate specimenTemplate8 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate specimenTemplate9 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate();
        java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabInstructionTemplate> labInstructionTemplateList10 = specimenTemplate9.getLabInstructionTemplates();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate specimenTemplate11 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate specimenTemplate13 = specimenTemplate11.setCustomId("hi!");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate specimenTemplate14 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate specimenTemplate15 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate();
        java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabInstructionTemplate> labInstructionTemplateList16 = specimenTemplate15.LabInstructionTemplates;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate[] specimenTemplateArray17 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate[] { specimenTemplate5, specimenTemplate8, specimenTemplate9, specimenTemplate13, specimenTemplate14, specimenTemplate15 };
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate> specimenTemplateList18 = new java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate>) specimenTemplateList18, specimenTemplateArray17);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostFieldVisitActivityWithTemplate postFieldVisitActivityWithTemplate20 = postFieldVisitActivityWithTemplate4.setSpecimenTemplates((java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate>) specimenTemplateList18);
        activityTemplate0.SpecimenTemplates = specimenTemplateList18;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Quantity quantity22 = activityTemplate0.Depth;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.MediumType mediumType23 = activityTemplate0.Medium;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(labInstructionTemplateList10);
        org.junit.Assert.assertNotNull(specimenTemplate13);
        org.junit.Assert.assertNull(labInstructionTemplateList16);
        org.junit.Assert.assertNotNull(specimenTemplateArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(postFieldVisitActivityWithTemplate20);
        org.junit.Assert.assertNull(quantity22);
        org.junit.Assert.assertNull(mediumType23);
    }

    @Test
    public void test00872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00872");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostTag postTag0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostTag();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_1 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_7 = getObservationsV2_1.setDataClassifications((java.util.List<java.lang.String>) strList5);
        postTag0.PickListValues = strList5;
        java.util.ArrayList<java.lang.String> strList9 = postTag0.PickListValues;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.TagValueType tagValueType10 = postTag0.ValueType;
        java.lang.String str11 = postTag0.getKey();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(getObservationsV2_7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNull(tagValueType10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00873");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostDatumConvertedTimeSeries postDatumConvertedTimeSeries0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostDatumConvertedTimeSeries();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostDatumConvertedTimeSeries postDatumConvertedTimeSeries2 = postDatumConvertedTimeSeries0.setDescription("yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ");
        postDatumConvertedTimeSeries0.Publish = false;
        postDatumConvertedTimeSeries0.Publish = false;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostDatumConvertedTimeSeries postDatumConvertedTimeSeries8 = postDatumConvertedTimeSeries0.setSubLocationIdentifier("2021.4.62.0");
        java.lang.Boolean boolean9 = postDatumConvertedTimeSeries0.TargetIsLocalAssumedDatum;
        java.lang.String str10 = postDatumConvertedTimeSeries0.Label;
        org.junit.Assert.assertNotNull(postDatumConvertedTimeSeries2);
        org.junit.Assert.assertNotNull(postDatumConvertedTimeSeries8);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00874");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemObject importItemObject0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemObject();
        java.util.List<java.lang.String> strList1 = importItemObject0.getWarningMessages();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportChangeItem[] importChangeItemArray2 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportChangeItem[] {};
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportChangeItem> importChangeItemList3 = new java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportChangeItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportChangeItem>) importChangeItemList3, importChangeItemArray2);
        importItemObject0.ItemComparison = importChangeItemList3;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags6 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray10 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags13 = putLocationTags6.setTagUniqueIds(strList11);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemObject importItemObject14 = importItemObject0.setExistingItem((java.lang.Object) putLocationTags6);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.OpenIdConnectUser openIdConnectUser15 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.OpenIdConnectUser();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.OpenIdConnectUser openIdConnectUser17 = openIdConnectUser15.setIdentifier("");
        java.lang.Boolean boolean18 = openIdConnectUser17.CanConfigureSystem;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemObject importItemObject19 = importItemObject0.setErrors((java.lang.Object) openIdConnectUser17);
        java.lang.Object obj20 = importItemObject0.ExistingItem;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetChartDataV2 getChartDataV2_21 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetChartDataV2();
        java.lang.String str22 = getChartDataV2_21.getActivityCustomId();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetChartDataV2 getChartDataV2_24 = getChartDataV2_21.setFilterId("");
        java.util.List<java.lang.String> strList25 = getChartDataV2_21.ResultGrades;
        getChartDataV2_21.MinNumericResultValue = 100.0d;
        java.lang.Double double28 = getChartDataV2_21.MaxNumericResultValue;
        importItemObject0.Errors = double28;
        org.junit.Assert.assertNull(strList1);
        org.junit.Assert.assertNotNull(importChangeItemArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(putLocationTags13);
        org.junit.Assert.assertNotNull(importItemObject14);
        org.junit.Assert.assertNotNull(openIdConnectUser17);
        org.junit.Assert.assertNull(boolean18);
        org.junit.Assert.assertNotNull(importItemObject19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(getChartDataV2_24);
        org.junit.Assert.assertNull(strList25);
        org.junit.Assert.assertNull(double28);
    }

    @Test
    public void test00875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00875");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetSamplingLocations getSamplingLocations0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetSamplingLocations();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ReportListServiceRequest reportListServiceRequest1 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ReportListServiceRequest();
        reportListServiceRequest1.ReportTitle = "MinDuration";
        reportListServiceRequest1.LocationUniqueId = "/AQUARIUS";
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetExportSpecimens getExportSpecimens6 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetExportSpecimens();
        java.util.List<java.lang.String> strList7 = getExportSpecimens6.getActivityTypes();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Qualifier qualifier8 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Qualifier();
        java.time.Instant instant9 = qualifier8.DateApplied;
        java.lang.String str10 = qualifier8.User;
        java.lang.String str11 = qualifier8.getIdentifier();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest timeAlignedDataServiceRequest12 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest();
        java.lang.Object obj13 = timeAlignedDataServiceRequest12.getResponseType();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse14 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse();
        java.time.Instant instant15 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse16 = locationDescriptionListServiceResponse14.setNextToken(instant15);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest timeAlignedDataServiceRequest17 = timeAlignedDataServiceRequest12.setQueryFrom(instant15);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Qualifier qualifier18 = qualifier8.setDateApplied(instant15);
        getExportSpecimens6.Before = instant15;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationRemark locationRemark20 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationRemark();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationRemark locationRemark22 = locationRemark20.setDescription("MaxInstant");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitDataServiceResponse fieldVisitDataServiceResponse23 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitDataServiceResponse();
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CrossSectionSurveyActivity> crossSectionSurveyActivityList24 = fieldVisitDataServiceResponse23.CrossSectionSurveyActivity;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitDataServiceResponse fieldVisitDataServiceResponse26 = fieldVisitDataServiceResponse23.setIdentifier("");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary27 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary();
        dischargeSummary27.Reviewer = "";
        java.time.Instant instant30 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        dischargeSummary27.MeasurementTime = instant30;
        fieldVisitDataServiceResponse23.ResponseTime = instant30;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationRemark locationRemark33 = locationRemark20.setCreateTime(instant30);
        getExportSpecimens6.EndModificationTime = instant30;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ReportListServiceRequest reportListServiceRequest35 = reportListServiceRequest1.setCreatedFrom(instant30);
        getSamplingLocations0.StartModificationTime = instant30;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_37 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray40 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_43 = getObservationsV2_37.setDataClassifications((java.util.List<java.lang.String>) strList41);
        getObservationsV2_43.DepthUnitCustomId = "hi!";
        java.lang.String str46 = getObservationsV2_43.CustomId;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_47 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        getObservationsV2_47.SpecimenIds = strList50;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags53 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray57 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList58 = new java.util.ArrayList<java.lang.String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList58, strArray57);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags60 = putLocationTags53.setTagUniqueIds(strList58);
        getObservationsV2_47.QualityControlTypes = strList58;
        java.util.List<java.lang.String> strList62 = getObservationsV2_47.getAnalyticalGroupIds();
        java.util.List<java.lang.String> strList63 = getObservationsV2_47.DataClassifications;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.FieldResultType fieldResultType64 = getObservationsV2_47.FieldResultType;
        java.time.Instant instant65 = getObservationsV2_47.getEndObservedTime();
        java.lang.String str66 = getObservationsV2_47.DepthUnitCustomId;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags67 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray71 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList72 = new java.util.ArrayList<java.lang.String>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList72, strArray71);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags74 = putLocationTags67.setTagUniqueIds(strList72);
        java.util.ArrayList<java.lang.String> strList75 = putLocationTags74.TagUniqueIds;
        getObservationsV2_47.ProjectIds = strList75;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_77 = getObservationsV2_43.setQualityControlTypes((java.util.List<java.lang.String>) strList75);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetSamplingLocations getSamplingLocations78 = getSamplingLocations0.setLocationTypeIds((java.util.List<java.lang.String>) strList75);
        java.time.Instant instant79 = getSamplingLocations0.EndModificationTime;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetSamplingLocations getSamplingLocations81 = getSamplingLocations0.setCustomId("9999-12-31T23:59:59.999Z");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetSamplingLocations getSamplingLocations83 = getSamplingLocations81.setLimit((java.lang.Integer) 0);
        getSamplingLocations83.Limit = 0;
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertNull(instant9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeAlignedDataServiceResponse");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeAlignedDataServiceResponse");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeAlignedDataServiceResponse");
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertNotNull(locationDescriptionListServiceResponse16);
        org.junit.Assert.assertNotNull(timeAlignedDataServiceRequest17);
        org.junit.Assert.assertNotNull(qualifier18);
        org.junit.Assert.assertNotNull(locationRemark22);
        org.junit.Assert.assertNull(crossSectionSurveyActivityList24);
        org.junit.Assert.assertNotNull(fieldVisitDataServiceResponse26);
        org.junit.Assert.assertNotNull(instant30);
        org.junit.Assert.assertNotNull(locationRemark33);
        org.junit.Assert.assertNotNull(reportListServiceRequest35);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(getObservationsV2_43);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(putLocationTags60);
        org.junit.Assert.assertNull(strList62);
        org.junit.Assert.assertNull(strList63);
        org.junit.Assert.assertNull(fieldResultType64);
        org.junit.Assert.assertNull(instant65);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(putLocationTags74);
        org.junit.Assert.assertNotNull(strList75);
        org.junit.Assert.assertNotNull(getObservationsV2_77);
        org.junit.Assert.assertNotNull(getSamplingLocations78);
        org.junit.Assert.assertNull(instant79);
        org.junit.Assert.assertNotNull(getSamplingLocations81);
        org.junit.Assert.assertNotNull(getSamplingLocations83);
    }

    @Test
    public void test00876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00876");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CrossSectionPoint crossSectionPoint0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CrossSectionPoint();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.QuantityWithDisplay quantityWithDisplay1 = null;
        crossSectionPoint0.Distance = quantityWithDisplay1;
        crossSectionPoint0.PointOrder = 1;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CrossSectionPoint crossSectionPoint6 = crossSectionPoint0.setPointOrder((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(crossSectionPoint6);
    }

    @Test
    public void test00877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00877");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.MetricConfiguration metricConfiguration0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.MetricConfiguration();
        java.lang.String str1 = metricConfiguration0.getId();
        metricConfiguration0.CustomId = "/AQUARIUS/Acquisition/v2";
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedProperty observedProperty4 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.MetricConfiguration metricConfiguration5 = metricConfiguration0.setObservedProperty(observedProperty4);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AggregationType aggregationType6 = com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AggregationType.SUM;
        metricConfiguration0.AggregationType = aggregationType6;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.MetricConfiguration metricConfiguration8 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.MetricConfiguration();
        java.lang.String str9 = metricConfiguration8.getId();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedProperty observedProperty10 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedProperty();
        observedProperty10.CasNumber = "MinDuration";
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.MetricConfiguration metricConfiguration13 = metricConfiguration8.setObservedProperty(observedProperty10);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ResultType resultType14 = observedProperty10.ResultType;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostObservedProperty postObservedProperty15 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostObservedProperty();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.UnitGroup unitGroup16 = postObservedProperty15.UnitGroup;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Quantity quantity17 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Quantity();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Unit unit18 = null;
        quantity17.Unit = unit18;
        postObservedProperty15.LowerLimit = quantity17;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Quantity quantity21 = postObservedProperty15.LowerLimit;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Unit unit22 = quantity21.Unit;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedProperty observedProperty23 = observedProperty10.setUpperLimit(quantity21);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostLabAnalysisMethod postLabAnalysisMethod24 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostLabAnalysisMethod();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation observation25 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation();
        observation25.CustomId = "hi!";
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.CategoricalResult categoricalResult28 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation observation29 = observation25.setCategoricalResult(categoricalResult28);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportHistoryEventSimple[] importHistoryEventSimpleArray30 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportHistoryEventSimple[] {};
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportHistoryEventSimple> importHistoryEventSimpleList31 = new java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportHistoryEventSimple>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportHistoryEventSimple>) importHistoryEventSimpleList31, importHistoryEventSimpleArray30);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation observation33 = observation25.setImportHistoryEventSimples((java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportHistoryEventSimple>) importHistoryEventSimpleList31);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostLabAnalysisMethod postLabAnalysisMethod34 = postLabAnalysisMethod24.setImportHistoryEventSimples((java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportHistoryEventSimple>) importHistoryEventSimpleList31);
        observedProperty23.ImportHistoryEventSimples = importHistoryEventSimpleList31;
        metricConfiguration0.ObservedProperty = observedProperty23;
        java.lang.Boolean boolean37 = metricConfiguration0.IncludeChildren;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(metricConfiguration5);
        org.junit.Assert.assertTrue("'" + aggregationType6 + "' != '" + com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AggregationType.SUM + "'", aggregationType6.equals(com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AggregationType.SUM));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(metricConfiguration13);
        org.junit.Assert.assertNull(resultType14);
        org.junit.Assert.assertNull(unitGroup16);
        org.junit.Assert.assertNotNull(quantity21);
        org.junit.Assert.assertNull(unit22);
        org.junit.Assert.assertNotNull(observedProperty23);
        org.junit.Assert.assertNotNull(observation29);
        org.junit.Assert.assertNotNull(importHistoryEventSimpleArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(observation33);
        org.junit.Assert.assertNotNull(postLabAnalysisMethod34);
        org.junit.Assert.assertNull(boolean37);
    }

    @Test
    public void test00878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00878");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetUnits getUnits0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetUnits();
        java.lang.Object obj1 = getUnits0.getResponseType();
        java.lang.String str2 = getUnits0.getUnitgroup();
        java.lang.Object obj3 = getUnits0.getResponseType();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$SearchResultUnit");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$SearchResultUnit");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$SearchResultUnit");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$SearchResultUnit");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$SearchResultUnit");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$SearchResultUnit");
    }

    @Test
    public void test00879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00879");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Role role0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Role();
        java.lang.Boolean boolean1 = role0.CanAssignUserRoles;
        java.lang.Boolean boolean2 = role0.CanAddAppendConfigurations;
        java.lang.Boolean boolean3 = role0.CanReadData;
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNull(boolean3);
    }

    @Test
    public void test00880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00880");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostCalculatedDerivedTimeSeries postCalculatedDerivedTimeSeries0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostCalculatedDerivedTimeSeries();
        java.util.ArrayList<java.lang.String> strList1 = postCalculatedDerivedTimeSeries0.TimeSeriesUniqueIds;
        java.lang.String str2 = postCalculatedDerivedTimeSeries0.Label;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostLocation postLocation3 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostLocation();
        postLocation3.Description = "hi!";
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ExtendedAttributeValue[] extendedAttributeValueArray6 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ExtendedAttributeValue[] {};
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ExtendedAttributeValue> extendedAttributeValueList7 = new java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ExtendedAttributeValue>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ExtendedAttributeValue>) extendedAttributeValueList7, extendedAttributeValueArray6);
        postLocation3.ExtendedAttributeValues = extendedAttributeValueList7;
        postCalculatedDerivedTimeSeries0.ExtendedAttributeValues = extendedAttributeValueList7;
        java.lang.String str11 = postCalculatedDerivedTimeSeries0.getSubLocationIdentifier();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostCalculatedDerivedTimeSeries postCalculatedDerivedTimeSeries13 = postCalculatedDerivedTimeSeries0.setComputationPeriodIdentifier("MaxInstant");
        java.lang.String str14 = postCalculatedDerivedTimeSeries13.Comment;
        postCalculatedDerivedTimeSeries13.Description = "9999-12-31T23:59:59.999Z";
        org.junit.Assert.assertNull(strList1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(extendedAttributeValueArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(postCalculatedDerivedTimeSeries13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test00881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00881");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.BaseFlowType baseFlowType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.BaseFlowType.Unknown;
        org.junit.Assert.assertTrue("'" + baseFlowType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.BaseFlowType.Unknown + "'", baseFlowType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.BaseFlowType.Unknown));
    }

    @Test
    public void test00882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00882");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesDataServiceResponse timeSeriesDataServiceResponse0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesDataServiceResponse();
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.InterpolationType> interpolationTypeList1 = timeSeriesDataServiceResponse0.InterpolationTypes;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesDataServiceResponse timeSeriesDataServiceResponse3 = timeSeriesDataServiceResponse0.setLabel("/AQUARIUS");
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.GapTolerance> gapToleranceList4 = timeSeriesDataServiceResponse3.getGapTolerances();
        org.junit.Assert.assertNull(interpolationTypeList1);
        org.junit.Assert.assertNotNull(timeSeriesDataServiceResponse3);
        org.junit.Assert.assertNull(gapToleranceList4);
    }

    @Test
    public void test00883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00883");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetMediumHistory getMediumHistory0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetMediumHistory();
        java.lang.Object obj1 = getMediumHistory0.getResponseType();
        java.lang.String str2 = getMediumHistory0.getId();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$SearchResultAuditHistory");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$SearchResultAuditHistory");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$SearchResultAuditHistory");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00884");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.GetLocationTimeSeries getLocationTimeSeries0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.GetLocationTimeSeries();
        java.lang.String str1 = getLocationTimeSeries0.LocationUniqueId;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.GetLocationTimeSeries getLocationTimeSeries3 = getLocationTimeSeries0.setLocationUniqueId("hi!");
        getLocationTimeSeries3.LocationUniqueId = "multipart/form-data; boundary=****bbcf5f9e-6ccf-4b63-91ab-6e645caf02af****";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(getLocationTimeSeries3);
    }

    @Test
    public void test00885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00885");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest timeAlignedDataServiceRequest0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest();
        java.lang.Object obj1 = timeAlignedDataServiceRequest0.getResponseType();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Attachment attachment2 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Attachment();
        java.lang.String str3 = attachment2.getUrl();
        java.lang.String str4 = attachment2.FileName;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutBulkEditResultGradesV2 putBulkEditResultGradesV2_5 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutBulkEditResultGradesV2();
        java.lang.Double double6 = putBulkEditResultGradesV2_5.DepthValue;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_7 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        getObservationsV2_7.SpecimenIds = strList10;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags13 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray17 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags20 = putLocationTags13.setTagUniqueIds(strList18);
        getObservationsV2_7.QualityControlTypes = strList18;
        java.util.List<java.lang.String> strList22 = getObservationsV2_7.getAnalyticalGroupIds();
        java.util.List<java.lang.String> strList23 = getObservationsV2_7.DataClassifications;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.FieldResultType fieldResultType24 = getObservationsV2_7.FieldResultType;
        java.time.Instant instant25 = getObservationsV2_7.getEndObservedTime();
        java.lang.String str26 = getObservationsV2_7.DepthUnitCustomId;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags27 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray31 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags34 = putLocationTags27.setTagUniqueIds(strList32);
        java.util.ArrayList<java.lang.String> strList35 = putLocationTags34.TagUniqueIds;
        getObservationsV2_7.ProjectIds = strList35;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutBulkEditResultGradesV2 putBulkEditResultGradesV2_37 = putBulkEditResultGradesV2_5.setSearch((java.util.List<java.lang.String>) strList35);
        java.util.List<java.lang.String> strList38 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutBulkEditResultGradesV2 putBulkEditResultGradesV2_39 = putBulkEditResultGradesV2_37.setLabResultLaboratoryIds(strList38);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CalibrationCheck calibrationCheck40 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CalibrationCheck();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CalibrationCheckType calibrationCheckType41 = calibrationCheck40.getCalibrationCheckType();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DoubleWithDisplay doubleWithDisplay42 = calibrationCheck40.Value;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse43 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary44 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary46 = dischargeSummary44.setPublish((java.lang.Boolean) false);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse47 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse();
        java.time.Instant instant48 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse49 = locationDescriptionListServiceResponse47.setNextToken(instant48);
        dischargeSummary44.MeasurementTime = instant48;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse51 = locationDescriptionListServiceResponse43.setNextToken(instant48);
        java.time.Instant instant52 = locationDescriptionListServiceResponse43.getNextToken();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CalibrationCheck calibrationCheck53 = calibrationCheck40.setTime(instant52);
        putBulkEditResultGradesV2_39.StartResultTime = instant52;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Attachment attachment55 = attachment2.setDateUploaded(instant52);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest timeAlignedDataServiceRequest56 = timeAlignedDataServiceRequest0.setQueryFrom(instant52);
        timeAlignedDataServiceRequest0.IncludeGapMarkers = true;
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeAlignedDataServiceResponse");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeAlignedDataServiceResponse");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeAlignedDataServiceResponse");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(double6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(putLocationTags20);
        org.junit.Assert.assertNull(strList22);
        org.junit.Assert.assertNull(strList23);
        org.junit.Assert.assertNull(fieldResultType24);
        org.junit.Assert.assertNull(instant25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(putLocationTags34);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertNotNull(putBulkEditResultGradesV2_37);
        org.junit.Assert.assertNotNull(putBulkEditResultGradesV2_39);
        org.junit.Assert.assertNull(calibrationCheckType41);
        org.junit.Assert.assertNull(doubleWithDisplay42);
        org.junit.Assert.assertNotNull(dischargeSummary46);
        org.junit.Assert.assertNotNull(instant48);
        org.junit.Assert.assertNotNull(locationDescriptionListServiceResponse49);
        org.junit.Assert.assertNotNull(locationDescriptionListServiceResponse51);
        org.junit.Assert.assertNotNull(instant52);
        org.junit.Assert.assertNotNull(calibrationCheck53);
        org.junit.Assert.assertNotNull(attachment55);
        org.junit.Assert.assertNotNull(timeAlignedDataServiceRequest56);
    }

    @Test
    public void test00886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00886");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ReasonForAdjustmentType reasonForAdjustmentType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ReasonForAdjustmentType.AdjustedForOtherFactors;
        org.junit.Assert.assertTrue("'" + reasonForAdjustmentType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ReasonForAdjustmentType.AdjustedForOtherFactors + "'", reasonForAdjustmentType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ReasonForAdjustmentType.AdjustedForOtherFactors));
    }

    @Test
    public void test00887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00887");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostStatisticalDerivedTimeSeries postStatisticalDerivedTimeSeries0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostStatisticalDerivedTimeSeries();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostStatisticalDerivedTimeSeries postStatisticalDerivedTimeSeries2 = postStatisticalDerivedTimeSeries0.setComment("'.'SSSSSSS");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostStatisticalDerivedTimeSeries postStatisticalDerivedTimeSeries4 = postStatisticalDerivedTimeSeries0.setLabel("'.'SSSSSSS");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostStatisticalDerivedTimeSeries postStatisticalDerivedTimeSeries6 = postStatisticalDerivedTimeSeries0.setParameter("/AQUARIUS/Provisioning/v1");
        postStatisticalDerivedTimeSeries6.ComputationPeriodIdentifier = "";
        java.lang.String str9 = postStatisticalDerivedTimeSeries6.getDescription();
        org.junit.Assert.assertNotNull(postStatisticalDerivedTimeSeries2);
        org.junit.Assert.assertNotNull(postStatisticalDerivedTimeSeries4);
        org.junit.Assert.assertNotNull(postStatisticalDerivedTimeSeries6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00888");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetSpecimens getSpecimens0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetSpecimens();
        java.util.List<java.lang.String> strList1 = getSpecimens0.getActivityIds();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetSpecimens getSpecimens3 = getSpecimens0.setSort("MinDuration");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetChartDataV2 getChartDataV2_4 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetChartDataV2();
        java.lang.String str5 = getChartDataV2_4.getActivityCustomId();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetChartDataV2 getChartDataV2_7 = getChartDataV2_4.setFilterId("");
        java.util.List<java.lang.String> strList8 = getChartDataV2_4.ResultGrades;
        getChartDataV2_4.MinNumericResultValue = 100.0d;
        java.lang.Double double11 = getChartDataV2_4.MaxNumericResultValue;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostTag postTag12 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostTag();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_13 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray16 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_19 = getObservationsV2_13.setDataClassifications((java.util.List<java.lang.String>) strList17);
        postTag12.PickListValues = strList17;
        getChartDataV2_4.SamplingContextTagIds = strList17;
        getSpecimens0.ActivityTypes = strList17;
        java.util.List<java.lang.String> strList23 = getSpecimens0.getSpecimenStatuses();
        org.junit.Assert.assertNull(strList1);
        org.junit.Assert.assertNotNull(getSpecimens3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(getChartDataV2_7);
        org.junit.Assert.assertNull(strList8);
        org.junit.Assert.assertNull(double11);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(getObservationsV2_19);
        org.junit.Assert.assertNull(strList23);
    }

    @Test
    public void test00889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00889");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitDescriptionListServiceResponse fieldVisitDescriptionListServiceResponse0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitDescriptionListServiceResponse();
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitDescription> fieldVisitDescriptionList1 = fieldVisitDescriptionListServiceResponse0.getDeletedFieldVisitDescriptions();
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitDescription> fieldVisitDescriptionList2 = fieldVisitDescriptionListServiceResponse0.getFieldVisitDescriptions();
        org.junit.Assert.assertNull(fieldVisitDescriptionList1);
        org.junit.Assert.assertNull(fieldVisitDescriptionList2);
    }

    @Test
    public void test00890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00890");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Unit unit0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Unit();
        java.lang.String str1 = unit0.getGroupIdentifier();
        unit0.IsSystem = true;
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test00891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00891");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservationMinimal observationMinimal0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservationMinimal();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedProperty observedProperty1 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservationMinimal observationMinimal2 = observationMinimal0.setObservedProperty(observedProperty1);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenNestedInActivity specimenNestedInActivity3 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservationMinimal observationMinimal4 = observationMinimal0.setSpecimen(specimenNestedInActivity3);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.TaxonomicResult taxonomicResult5 = observationMinimal4.TaxonomicResult;
        java.lang.String str6 = observationMinimal4.Comment;
        org.junit.Assert.assertNotNull(observationMinimal2);
        org.junit.Assert.assertNotNull(observationMinimal4);
        org.junit.Assert.assertNull(taxonomicResult5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00892");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.OpenIdConnectUser openIdConnectUser0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.OpenIdConnectUser();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.OpenIdConnectUser openIdConnectUser2 = openIdConnectUser0.setIdentifier("");
        java.lang.String str3 = openIdConnectUser2.FirstName;
        java.lang.String str4 = openIdConnectUser2.getLoginName();
        java.lang.String str5 = openIdConnectUser2.Email;
        org.junit.Assert.assertNotNull(openIdConnectUser2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00893");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostDatumConvertedTimeSeries postDatumConvertedTimeSeries0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostDatumConvertedTimeSeries();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostDatumConvertedTimeSeries postDatumConvertedTimeSeries2 = postDatumConvertedTimeSeries0.setDescription("yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ");
        java.lang.Boolean boolean3 = postDatumConvertedTimeSeries0.TargetIsLocalAssumedDatum;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostDatumConvertedTimeSeries postDatumConvertedTimeSeries5 = postDatumConvertedTimeSeries0.setSubLocationIdentifier("MaxInstant");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostDatumConvertedTimeSeries postDatumConvertedTimeSeries7 = postDatumConvertedTimeSeries5.setLocationUniqueId("yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ");
        java.lang.Boolean boolean8 = postDatumConvertedTimeSeries5.TargetIsLocalAssumedDatum;
        org.junit.Assert.assertNotNull(postDatumConvertedTimeSeries2);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNotNull(postDatumConvertedTimeSeries5);
        org.junit.Assert.assertNotNull(postDatumConvertedTimeSeries7);
        org.junit.Assert.assertNull(boolean8);
    }

    @Test
    public void test00894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00894");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LocationGroupType locationGroupType0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LocationGroupType();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes1 = locationGroupType0.getAuditAttributes();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LocationGroupType locationGroupType3 = locationGroupType0.setCustomId("yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ");
        java.lang.String str4 = locationGroupType3.Id;
        org.junit.Assert.assertNull(auditAttributes1);
        org.junit.Assert.assertNotNull(locationGroupType3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00895");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeterType meterType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeterType.PolymerCupAaMeter;
        org.junit.Assert.assertTrue("'" + meterType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeterType.PolymerCupAaMeter + "'", meterType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeterType.PolymerCupAaMeter));
    }

    @Test
    public void test00896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00896");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutBaseStandardReferenceDatumOffset putBaseStandardReferenceDatumOffset0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutBaseStandardReferenceDatumOffset();
        java.lang.Object obj1 = putBaseStandardReferenceDatumOffset0.getResponseType();
        java.lang.Object obj2 = putBaseStandardReferenceDatumOffset0.getResponseType();
        java.lang.Object obj3 = putBaseStandardReferenceDatumOffset0.getResponseType();
        java.lang.String str4 = putBaseStandardReferenceDatumOffset0.getLocationUniqueId();
        java.lang.Double double5 = putBaseStandardReferenceDatumOffset0.getOffsetToBaseReference();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning$StandardReferenceDatum");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning$StandardReferenceDatum");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning$StandardReferenceDatum");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning$StandardReferenceDatum");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning$StandardReferenceDatum");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning$StandardReferenceDatum");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning$StandardReferenceDatum");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning$StandardReferenceDatum");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning$StandardReferenceDatum");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(double5);
    }

    @Test
    public void test00897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00897");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CurrentMeter currentMeter0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CurrentMeter();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CurrentMeter currentMeter2 = currentMeter0.setSerialNumber("");
        java.lang.String str3 = currentMeter0.SerialNumber;
        org.junit.Assert.assertNotNull(currentMeter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00898");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.NameTagDefinition nameTagDefinition0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.NameTagDefinition();
        java.lang.Boolean boolean1 = nameTagDefinition0.isAppliesToLocations();
        nameTagDefinition0.AppliesToSensorsGauges = true;
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test00899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00899");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate specimenTemplate0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate();
        java.lang.String str1 = specimenTemplate0.CustomId;
        java.lang.String str2 = specimenTemplate0.CustomId;
        specimenTemplate0.Id = "https";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00900");
        java.util.Map<java.lang.Object, java.lang.reflect.Type> objMap2 = null;
        com.aquaticinformatics.aquarius.sdk.samples.FieldNamer fieldNamer3 = new com.aquaticinformatics.aquarius.sdk.samples.FieldNamer();
        com.aquaticinformatics.aquarius.sdk.helpers.SdkServiceClient sdkServiceClient5 = com.aquaticinformatics.aquarius.sdk.helpers.SdkServiceClient.Create("MaxDuration", "http", objMap2, (com.aquaticinformatics.aquarius.sdk.helpers.IFieldNamer) fieldNamer3, false);
        com.google.gson.GsonBuilder gsonBuilder6 = null;
        // The following exception was thrown during execution in test generation
        try {
            fieldNamer3.configure(gsonBuilder6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sdkServiceClient5);
    }

    @Test
    public void test00901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00901");
        java.lang.Object obj0 = null;
        java.lang.String str1 = net.servicestack.client.JsonServiceClient.GetSendMethod(obj0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "POST" + "'", str1, "POST");
    }

    @Test
    public void test00902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00902");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Location location0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Location();
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.AppliedTag> appliedTagList1 = location0.Tags;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Location location3 = location0.setUniqueId("MaxInstant");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Location location5 = location3.setUtcOffset("9999-12-31T23:59:59.999Z");
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.AppliedTag> appliedTagList6 = location3.getTags();
        java.lang.String str7 = location3.getIdentifier();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Location location9 = location3.setLatitude((java.lang.Double) 100.0d);
        java.lang.Boolean boolean10 = location9.Publish;
        org.junit.Assert.assertNull(appliedTagList1);
        org.junit.Assert.assertNotNull(location3);
        org.junit.Assert.assertNotNull(location5);
        org.junit.Assert.assertNull(appliedTagList6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(location9);
        org.junit.Assert.assertNull(boolean10);
    }

    @Test
    public void test00903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00903");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostSchedule postSchedule0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostSchedule();
        java.time.OffsetDateTime offsetDateTime1 = postSchedule0.StartDate;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutSchedule putSchedule2 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutSchedule();
        java.time.OffsetDateTime offsetDateTime3 = putSchedule2.StartDate;
        java.time.OffsetDateTime offsetDateTime4 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutSchedule putSchedule5 = putSchedule2.setEndDate(offsetDateTime4);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes6 = putSchedule5.AuditAttributes;
        java.time.OffsetDateTime offsetDateTime7 = putSchedule5.getEndDate();
        java.time.OffsetDateTime offsetDateTime8 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutSchedule putSchedule9 = putSchedule5.setStartDate(offsetDateTime8);
        java.lang.Integer int10 = putSchedule5.SamplingLocationGroupSelectionTypeRandomCount;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.RecurrenceDayMonthlyType recurrenceDayMonthlyType11 = com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.RecurrenceDayMonthlyType.LAST_DAY_OF_MONTH;
        putSchedule5.RecurrenceDayMonthly = recurrenceDayMonthlyType11;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostSchedule postSchedule13 = postSchedule0.setRecurrenceDayMonthly(recurrenceDayMonthlyType11);
        java.time.OffsetDateTime offsetDateTime14 = postSchedule0.EndDate;
        java.lang.String str15 = postSchedule0.CustomId;
        java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SchedulePlannedActivity> schedulePlannedActivityList16 = postSchedule0.SchedulePlannedActivities;
        org.junit.Assert.assertNull(offsetDateTime1);
        org.junit.Assert.assertNull(offsetDateTime3);
        org.junit.Assert.assertNotNull(putSchedule5);
        org.junit.Assert.assertNull(auditAttributes6);
        org.junit.Assert.assertNull(offsetDateTime7);
        org.junit.Assert.assertNotNull(putSchedule9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertTrue("'" + recurrenceDayMonthlyType11 + "' != '" + com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.RecurrenceDayMonthlyType.LAST_DAY_OF_MONTH + "'", recurrenceDayMonthlyType11.equals(com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.RecurrenceDayMonthlyType.LAST_DAY_OF_MONTH));
        org.junit.Assert.assertNotNull(postSchedule13);
        org.junit.Assert.assertNull(offsetDateTime14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(schedulePlannedActivityList16);
    }

    @Test
    public void test00904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00904");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutBulkEditResultGradesV2 putBulkEditResultGradesV2_0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutBulkEditResultGradesV2();
        java.lang.Double double1 = putBulkEditResultGradesV2_0.DepthValue;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_2 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        getObservationsV2_2.SpecimenIds = strList5;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags8 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray12 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags15 = putLocationTags8.setTagUniqueIds(strList13);
        getObservationsV2_2.QualityControlTypes = strList13;
        java.util.List<java.lang.String> strList17 = getObservationsV2_2.getAnalyticalGroupIds();
        java.util.List<java.lang.String> strList18 = getObservationsV2_2.DataClassifications;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.FieldResultType fieldResultType19 = getObservationsV2_2.FieldResultType;
        java.time.Instant instant20 = getObservationsV2_2.getEndObservedTime();
        java.lang.String str21 = getObservationsV2_2.DepthUnitCustomId;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags22 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray26 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags29 = putLocationTags22.setTagUniqueIds(strList27);
        java.util.ArrayList<java.lang.String> strList30 = putLocationTags29.TagUniqueIds;
        getObservationsV2_2.ProjectIds = strList30;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutBulkEditResultGradesV2 putBulkEditResultGradesV2_32 = putBulkEditResultGradesV2_0.setSearch((java.util.List<java.lang.String>) strList30);
        java.util.List<java.lang.String> strList33 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutBulkEditResultGradesV2 putBulkEditResultGradesV2_34 = putBulkEditResultGradesV2_32.setLabResultLaboratoryIds(strList33);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItem importItem35 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItem();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_36 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList39 = new java.util.ArrayList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        getObservationsV2_36.SpecimenIds = strList39;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags42 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray46 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags49 = putLocationTags42.setTagUniqueIds(strList47);
        getObservationsV2_36.QualityControlTypes = strList47;
        java.util.List<java.lang.String> strList51 = getObservationsV2_36.getLabReportIds();
        importItem35.Errors = getObservationsV2_36;
        java.lang.Object obj53 = importItem35.getExistingItem();
        importItem35.Input = "hi!";
        java.lang.Object obj56 = importItem35.getItem();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemStatusType importItemStatusType57 = com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemStatusType.SKIPPED;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItem importItem58 = importItem35.setStatus(importItemStatusType57);
        importItem58.Input = "/AQUARIUS/Provisioning/v1";
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate specimenTemplate61 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate();
        specimenTemplate61.CustomId = "hi!";
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate specimenTemplate65 = specimenTemplate61.setId("hi!");
        java.lang.Boolean boolean66 = specimenTemplate65.getFiltered();
        importItem58.Item = specimenTemplate65;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Processor processor68 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Processor();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostTag postTag69 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostTag();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_70 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray73 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList74 = new java.util.ArrayList<java.lang.String>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList74, strArray73);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_76 = getObservationsV2_70.setDataClassifications((java.util.List<java.lang.String>) strList74);
        postTag69.PickListValues = strList74;
        java.util.ArrayList<java.lang.String> strList78 = postTag69.PickListValues;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Processor processor79 = processor68.setInputTimeSeriesUniqueIds(strList78);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItem importItem80 = importItem58.setWarningMessages((java.util.List<java.lang.String>) strList78);
        java.util.List<java.lang.String> strList81 = importItem58.getWarningMessages();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutBulkEditResultGradesV2 putBulkEditResultGradesV2_82 = putBulkEditResultGradesV2_32.setSpecimenIds(strList81);
        java.util.List<java.lang.String> strList83 = putBulkEditResultGradesV2_32.LabResultLabAnalysisMethodIds;
        org.junit.Assert.assertNull(double1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(putLocationTags15);
        org.junit.Assert.assertNull(strList17);
        org.junit.Assert.assertNull(strList18);
        org.junit.Assert.assertNull(fieldResultType19);
        org.junit.Assert.assertNull(instant20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(putLocationTags29);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(putBulkEditResultGradesV2_32);
        org.junit.Assert.assertNotNull(putBulkEditResultGradesV2_34);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(putLocationTags49);
        org.junit.Assert.assertNull(strList51);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue("'" + importItemStatusType57 + "' != '" + com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemStatusType.SKIPPED + "'", importItemStatusType57.equals(com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemStatusType.SKIPPED));
        org.junit.Assert.assertNotNull(importItem58);
        org.junit.Assert.assertNotNull(specimenTemplate65);
        org.junit.Assert.assertNull(boolean66);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(getObservationsV2_76);
        org.junit.Assert.assertNotNull(strList78);
        org.junit.Assert.assertNotNull(processor79);
        org.junit.Assert.assertNotNull(importItem80);
        org.junit.Assert.assertNotNull(strList81);
        org.junit.Assert.assertNotNull(putBulkEditResultGradesV2_82);
        org.junit.Assert.assertNull(strList83);
    }

    @Test
    public void test00905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00905");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Device device0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Device();
        device0.Name = "http://MaxDurationhttp/json/reply/ArrayList";
    }

    @Test
    public void test00906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00906");
        java.lang.String str0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ICreateStandardDatum.Comments;
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test00907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00907");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation observation0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PlannedFieldResult plannedFieldResult1 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation observation2 = observation0.setPlannedFieldResult(plannedFieldResult1);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabInstruction labInstruction3 = null;
        observation2.LabInstruction = labInstruction3;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservationStatistics observationStatistics5 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation observation6 = observation2.setStatistics(observationStatistics5);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Taxon taxon7 = null;
        observation2.RelatedTaxon = taxon7;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ResultStatus resultStatus9 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation observation10 = observation2.setResultStatus(resultStatus9);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes11 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation observation12 = observation2.setAuditAttributes(auditAttributes11);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Device device13 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Device();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Device device15 = device13.setType("/AQUARIUS/Acquisition/v2");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Device device17 = device15.setType("/AQUARIUS/Acquisition/v2://9999-12-31T23:59:59.999Z");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Device device19 = device15.setType("http");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation observation20 = observation2.setDevice(device15);
        device15.CustomId = "";
        org.junit.Assert.assertNotNull(observation2);
        org.junit.Assert.assertNotNull(observation6);
        org.junit.Assert.assertNotNull(observation10);
        org.junit.Assert.assertNotNull(observation12);
        org.junit.Assert.assertNotNull(device15);
        org.junit.Assert.assertNotNull(device17);
        org.junit.Assert.assertNotNull(device19);
        org.junit.Assert.assertNotNull(observation20);
    }

    @Test
    public void test00908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00908");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutOpenIdConnectUser putOpenIdConnectUser0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutOpenIdConnectUser();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutUserBase putUserBase2 = putOpenIdConnectUser0.setUniqueId("MaxInstant");
        putOpenIdConnectUser0.Identifier = "/AQUARIUS/Provisioning/v1";
        java.lang.String str5 = putOpenIdConnectUser0.getIdentifier();
        org.junit.Assert.assertNotNull(putUserBase2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/AQUARIUS/Provisioning/v1" + "'", str5, "/AQUARIUS/Provisioning/v1");
    }

    @Test
    public void test00909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00909");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Note note0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Note();
        java.lang.String str1 = note0.getNoteText();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test00910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00910");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostExtendedAttribute postExtendedAttribute0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostExtendedAttribute();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.EditableExtendedAttribute editableExtendedAttribute2 = postExtendedAttribute0.setDefaultValue("https");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetFieldVisits getFieldVisits3 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetFieldVisits();
        java.util.List<java.lang.String> strList4 = getFieldVisits3.getSamplingLocationIds();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags5 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray9 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags12 = putLocationTags5.setTagUniqueIds(strList10);
        java.util.ArrayList<java.lang.String> strList13 = putLocationTags12.TagUniqueIds;
        getFieldVisits3.ScheduleIds = strList13;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.EditableExtendedAttribute editableExtendedAttribute15 = editableExtendedAttribute2.setPickListValues(strList13);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.EditableExtendedAttribute editableExtendedAttribute17 = editableExtendedAttribute2.setDefaultValue("POST");
        java.lang.String str18 = editableExtendedAttribute17.DefaultValue;
        org.junit.Assert.assertNotNull(editableExtendedAttribute2);
        org.junit.Assert.assertNull(strList4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(putLocationTags12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(editableExtendedAttribute15);
        org.junit.Assert.assertNotNull(editableExtendedAttribute17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "POST" + "'", str18, "POST");
    }

    @Test
    public void test00911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00911");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostUnitGroup postUnitGroup0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostUnitGroup();
        java.lang.Integer int1 = postUnitGroup0.getTimeDimension();
        postUnitGroup0.BaseUnitIdentifier = "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ";
        java.lang.Integer int4 = postUnitGroup0.IntensityDimension;
        postUnitGroup0.GroupIdentifier = "/AQUARIUS/Acquisition/v2://9999-12-31T23:59:59.999Z";
        java.lang.Integer int7 = postUnitGroup0.getTimeDimension();
        postUnitGroup0.GroupIdentifier = "/AQUARIUS/Acquisition/v2";
        java.lang.String str10 = postUnitGroup0.GroupIdentifier;
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/AQUARIUS/Acquisition/v2" + "'", str10, "/AQUARIUS/Acquisition/v2");
    }

    @Test
    public void test00912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00912");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Grade grade0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Grade();
        grade0.Description = "ZZZZZ";
        java.lang.Integer int3 = grade0.GradeCode;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Grade grade5 = grade0.setIsSystem((java.lang.Boolean) true);
        java.lang.String str6 = grade0.Description;
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(grade5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ZZZZZ" + "'", str6, "ZZZZZ");
    }

    @Test
    public void test00913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00913");
        java.lang.String str0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ICreateStandardDatum.Method;
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test00914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00914");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ActivityType activityType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ActivityType.Reading;
        org.junit.Assert.assertTrue("'" + activityType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ActivityType.Reading + "'", activityType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ActivityType.Reading));
    }

    @Test
    public void test00915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00915");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetFieldVisits getFieldVisits0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetFieldVisits();
        java.util.List<java.lang.String> strList1 = getFieldVisits0.getSamplingLocationIds();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags2 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray6 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags9 = putLocationTags2.setTagUniqueIds(strList7);
        java.util.ArrayList<java.lang.String> strList10 = putLocationTags9.TagUniqueIds;
        getFieldVisits0.ScheduleIds = strList10;
        java.lang.Integer int12 = getFieldVisits0.Limit;
        java.util.List<java.lang.String> strList13 = getFieldVisits0.getFieldTripIds();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_14 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        getObservationsV2_14.SpecimenIds = strList17;
        getFieldVisits0.Search = strList17;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetFieldVisits getFieldVisits22 = getFieldVisits0.setCursor("");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_23 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray26 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_29 = getObservationsV2_23.setDataClassifications((java.util.List<java.lang.String>) strList27);
        java.util.List<java.lang.String> strList30 = getObservationsV2_23.ResultGrades;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary31 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary();
        dischargeSummary31.Reviewer = "";
        java.time.Instant instant34 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        dischargeSummary31.MeasurementTime = instant34;
        getObservationsV2_23.StartResultTime = instant34;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest timeAlignedDataServiceRequest37 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ControlConditionActivity controlConditionActivity38 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ControlConditionActivity();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ControlCleanedType controlCleanedType39 = null;
        controlConditionActivity38.ControlCleaned = controlCleanedType39;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse41 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse();
        java.time.Instant instant42 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse43 = locationDescriptionListServiceResponse41.setNextToken(instant42);
        controlConditionActivity38.DateCleaned = instant42;
        timeAlignedDataServiceRequest37.QueryFrom = instant42;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_46 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList49 = new java.util.ArrayList<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList49, strArray48);
        getObservationsV2_46.SpecimenIds = strList49;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags52 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray56 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList57 = new java.util.ArrayList<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList57, strArray56);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags59 = putLocationTags52.setTagUniqueIds(strList57);
        getObservationsV2_46.ActivityIds = strList57;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest timeAlignedDataServiceRequest61 = timeAlignedDataServiceRequest37.setTimeSeriesOutputUnitIds(strList57);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_62 = getObservationsV2_23.setCollectionMethodIds((java.util.List<java.lang.String>) strList57);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetFieldVisits getFieldVisits63 = getFieldVisits22.setScheduleIds((java.util.List<java.lang.String>) strList57);
        getFieldVisits63.Limit = 0;
        org.junit.Assert.assertNull(strList1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(putLocationTags9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNull(strList13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(getFieldVisits22);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(getObservationsV2_29);
        org.junit.Assert.assertNull(strList30);
        org.junit.Assert.assertNotNull(instant34);
        org.junit.Assert.assertNotNull(instant42);
        org.junit.Assert.assertNotNull(locationDescriptionListServiceResponse43);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(putLocationTags59);
        org.junit.Assert.assertNotNull(timeAlignedDataServiceRequest61);
        org.junit.Assert.assertNotNull(getObservationsV2_62);
        org.junit.Assert.assertNotNull(getFieldVisits63);
    }

    @Test
    public void test00916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00916");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LocationObservationsGroup locationObservationsGroup0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LocationObservationsGroup();
        java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation> observationList1 = locationObservationsGroup0.Observations;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingLocation samplingLocation2 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LocationObservationsGroup locationObservationsGroup3 = locationObservationsGroup0.setSamplingLocation(samplingLocation2);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LocationObservationsGroup locationObservationsGroup5 = locationObservationsGroup0.setTotalCount((java.lang.Integer) 100);
        org.junit.Assert.assertNull(observationList1);
        org.junit.Assert.assertNotNull(locationObservationsGroup3);
        org.junit.Assert.assertNotNull(locationObservationsGroup5);
    }

    @Test
    public void test00917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00917");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Vertical vertical0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Vertical();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.QuantityWithDisplay quantityWithDisplay1 = vertical0.SoundedDepth;
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Calibration> calibrationList2 = vertical0.getCalibrations();
        org.junit.Assert.assertNull(quantityWithDisplay1);
        org.junit.Assert.assertNull(calibrationList2);
    }

    @Test
    public void test00918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00918");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutQualifierGroup putQualifierGroup0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutQualifierGroup();
        putQualifierGroup0.Identifier = "";
        java.lang.Object obj3 = putQualifierGroup0.getResponseType();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutQualifierGroup putQualifierGroup5 = putQualifierGroup0.setUniqueId("/AQUARIUS/Acquisition/v2://9999-12-31T23:59:59.999Z");
        java.lang.String str6 = putQualifierGroup0.getUniqueId();
        java.lang.Object obj7 = putQualifierGroup0.getResponseType();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning$QualifierGroupResponse");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning$QualifierGroupResponse");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning$QualifierGroupResponse");
        org.junit.Assert.assertNotNull(putQualifierGroup5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/AQUARIUS/Acquisition/v2://9999-12-31T23:59:59.999Z" + "'", str6, "/AQUARIUS/Acquisition/v2://9999-12-31T23:59:59.999Z");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning$QualifierGroupResponse");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning$QualifierGroupResponse");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning$QualifierGroupResponse");
    }

    @Test
    public void test00919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00919");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetExportObservations getExportObservations0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetExportObservations();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DeleteFieldVisits deleteFieldVisits1 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DeleteFieldVisits();
        java.lang.String str2 = deleteFieldVisits1.getSort();
        java.time.Instant instant3 = deleteFieldVisits1.EndStartTime;
        java.util.List<java.lang.String> strList4 = deleteFieldVisits1.getSearch();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_5 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_11 = getObservationsV2_5.setDataClassifications((java.util.List<java.lang.String>) strList9);
        java.time.Instant instant12 = getObservationsV2_5.getStartObservedTime();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItem importItem13 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItem();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_14 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        getObservationsV2_14.SpecimenIds = strList17;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags20 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray24 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags27 = putLocationTags20.setTagUniqueIds(strList25);
        getObservationsV2_14.QualityControlTypes = strList25;
        java.util.List<java.lang.String> strList29 = getObservationsV2_14.getLabReportIds();
        importItem13.Errors = getObservationsV2_14;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_31 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.util.List<java.lang.String> strList32 = getObservationsV2_31.SamplingContextTagIds;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_33 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        getObservationsV2_33.SpecimenIds = strList36;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags39 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray43 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags46 = putLocationTags39.setTagUniqueIds(strList44);
        getObservationsV2_33.QualityControlTypes = strList44;
        getObservationsV2_31.ResultGrades = strList44;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItem importItem49 = importItem13.setFields((java.util.List<java.lang.String>) strList44);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_50 = getObservationsV2_5.setSearch((java.util.List<java.lang.String>) strList44);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DeleteFieldVisits deleteFieldVisits51 = deleteFieldVisits1.setProjectIds((java.util.List<java.lang.String>) strList44);
        getExportObservations0.QualityControlTypes = strList44;
        getExportObservations0.MaxNumericResultValue = 1.0d;
        java.lang.String str55 = getExportObservations0.getDetectionCondition();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(instant3);
        org.junit.Assert.assertNull(strList4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(getObservationsV2_11);
        org.junit.Assert.assertNull(instant12);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(putLocationTags27);
        org.junit.Assert.assertNull(strList29);
        org.junit.Assert.assertNull(strList32);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(putLocationTags46);
        org.junit.Assert.assertNotNull(importItem49);
        org.junit.Assert.assertNotNull(getObservationsV2_50);
        org.junit.Assert.assertNotNull(deleteFieldVisits51);
        org.junit.Assert.assertNull(str55);
    }

    @Test
    public void test00920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00920");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutSchedule putSchedule0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutSchedule();
        java.time.OffsetDateTime offsetDateTime1 = putSchedule0.StartDate;
        java.time.OffsetDateTime offsetDateTime2 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutSchedule putSchedule3 = putSchedule0.setEndDate(offsetDateTime2);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes4 = putSchedule3.AuditAttributes;
        java.time.OffsetDateTime offsetDateTime5 = putSchedule3.getEndDate();
        java.time.OffsetDateTime offsetDateTime6 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutSchedule putSchedule7 = putSchedule3.setStartDate(offsetDateTime6);
        java.lang.Integer int8 = putSchedule3.SamplingLocationGroupSelectionTypeRandomCount;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.RecurrenceDayMonthlyType recurrenceDayMonthlyType9 = com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.RecurrenceDayMonthlyType.LAST_DAY_OF_MONTH;
        putSchedule3.RecurrenceDayMonthly = recurrenceDayMonthlyType9;
        java.lang.String str11 = putSchedule3.CustomId;
        putSchedule3.SamplingLocationGroupSelectionTypeRandomCount = 1;
        org.junit.Assert.assertNull(offsetDateTime1);
        org.junit.Assert.assertNotNull(putSchedule3);
        org.junit.Assert.assertNull(auditAttributes4);
        org.junit.Assert.assertNull(offsetDateTime5);
        org.junit.Assert.assertNotNull(putSchedule7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertTrue("'" + recurrenceDayMonthlyType9 + "' != '" + com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.RecurrenceDayMonthlyType.LAST_DAY_OF_MONTH + "'", recurrenceDayMonthlyType9.equals(com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.RecurrenceDayMonthlyType.LAST_DAY_OF_MONTH));
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00921");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem analyticalGroupItem0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalysisMethod analysisMethod1 = analyticalGroupItem0.getAnalysisMethod();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalysisMethod analysisMethod2 = analyticalGroupItem0.getAnalysisMethod();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalysisMethod analysisMethod3 = null;
        analyticalGroupItem0.AnalysisMethod = analysisMethod3;
        java.lang.String str5 = analyticalGroupItem0.getHoldingTime();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalysisMethod analysisMethod6 = analyticalGroupItem0.getAnalysisMethod();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalysisMethod analysisMethod7 = analyticalGroupItem0.AnalysisMethod;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalysisMethod analysisMethod8 = null;
        analyticalGroupItem0.AnalysisMethod = analysisMethod8;
        org.junit.Assert.assertNull(analysisMethod1);
        org.junit.Assert.assertNull(analysisMethod2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(analysisMethod6);
        org.junit.Assert.assertNull(analysisMethod7);
    }

    @Test
    public void test00922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00922");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.GetParameter getParameter0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.GetParameter();
        getParameter0.UniqueId = "hi!";
        getParameter0.UniqueId = "hi!:///AQUARIUS/Provisioning/v1";
    }

    @Test
    public void test00923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00923");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DownchainProcessorListByRatingModelServiceRequest downchainProcessorListByRatingModelServiceRequest0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DownchainProcessorListByRatingModelServiceRequest();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MetadataChangeTransactionListServiceRequest metadataChangeTransactionListServiceRequest1 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MetadataChangeTransactionListServiceRequest();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostRecurringReport postRecurringReport2 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostRecurringReport();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary3 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary();
        dischargeSummary3.Reviewer = "";
        java.time.Instant instant6 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        dischargeSummary3.MeasurementTime = instant6;
        postRecurringReport2.NextGenerationDate = instant6;
        java.time.Instant instant9 = postRecurringReport2.getNextGenerationDate();
        java.lang.String str10 = com.aquaticinformatics.aquarius.sdk.samples.serializers.InstantSerializer.format(instant9);
        metadataChangeTransactionListServiceRequest1.QueryFrom = instant9;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DownchainProcessorListByRatingModelServiceRequest downchainProcessorListByRatingModelServiceRequest12 = downchainProcessorListByRatingModelServiceRequest0.setQueryTo(instant9);
        java.time.Instant instant13 = downchainProcessorListByRatingModelServiceRequest12.QueryFrom;
        java.lang.String str14 = downchainProcessorListByRatingModelServiceRequest12.getRatingModelIdentifier();
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "9999-12-31T23:59:59.999Z" + "'", str10, "9999-12-31T23:59:59.999Z");
        org.junit.Assert.assertNotNull(downchainProcessorListByRatingModelServiceRequest12);
        org.junit.Assert.assertNull(instant13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test00924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00924");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.MonitoringMethod monitoringMethod0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.MonitoringMethod();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.MonitoringMethod monitoringMethod2 = monitoringMethod0.setParameterUniqueId("/AQUARIUS");
        java.lang.String str3 = monitoringMethod0.getDisplayName();
        java.lang.String str4 = monitoringMethod0.Description;
        monitoringMethod0.ParameterIdentifier = "-PT87591240H";
        org.junit.Assert.assertNotNull(monitoringMethod2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00925");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostAnalysisMethod postAnalysisMethod0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostAnalysisMethod();
        java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportHistoryEventSimple> importHistoryEventSimpleList1 = postAnalysisMethod0.ImportHistoryEventSimples;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostAnalysisMethod postAnalysisMethod3 = postAnalysisMethod0.setDescription("https");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostAnalysisMethod postAnalysisMethod5 = postAnalysisMethod0.setName("hi!:///AQUARIUS/Provisioning/v1");
        java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportHistoryEventSimple> importHistoryEventSimpleList6 = postAnalysisMethod0.ImportHistoryEventSimples;
        org.junit.Assert.assertNull(importHistoryEventSimpleList1);
        org.junit.Assert.assertNotNull(postAnalysisMethod3);
        org.junit.Assert.assertNotNull(postAnalysisMethod5);
        org.junit.Assert.assertNull(importHistoryEventSimpleList6);
    }

    @Test
    public void test00926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00926");
        java.util.Map<java.lang.Object, java.lang.reflect.Type> objMap2 = null;
        com.aquaticinformatics.aquarius.sdk.samples.FieldNamer fieldNamer3 = new com.aquaticinformatics.aquarius.sdk.samples.FieldNamer();
        com.aquaticinformatics.aquarius.sdk.helpers.SdkServiceClient sdkServiceClient5 = com.aquaticinformatics.aquarius.sdk.helpers.SdkServiceClient.Create("MaxDuration", "http", objMap2, (com.aquaticinformatics.aquarius.sdk.helpers.IFieldNamer) fieldNamer3, false);
        sdkServiceClient5.setTimeout((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            sdkServiceClient5.setCookie("", "", (java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal cookie name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sdkServiceClient5);
    }

    @Test
    public void test00927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00927");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpreadsheetTemplate spreadsheetTemplate0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpreadsheetTemplate();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpreadsheetTemplateType spreadsheetTemplateType1 = spreadsheetTemplate0.getType();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpreadsheetTemplateType spreadsheetTemplateType2 = spreadsheetTemplate0.getType();
        spreadsheetTemplate0.Description = "https";
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpreadsheetTemplateType spreadsheetTemplateType5 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpreadsheetTemplate spreadsheetTemplate6 = spreadsheetTemplate0.setType(spreadsheetTemplateType5);
        java.lang.String str7 = spreadsheetTemplate6.getDescription();
        org.junit.Assert.assertNull(spreadsheetTemplateType1);
        org.junit.Assert.assertNull(spreadsheetTemplateType2);
        org.junit.Assert.assertNotNull(spreadsheetTemplate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "https" + "'", str7, "https");
    }

    @Test
    public void test00928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00928");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.OpenIdConnectRelyingPartyConfiguration openIdConnectRelyingPartyConfiguration0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.OpenIdConnectRelyingPartyConfiguration();
        java.lang.String str1 = openIdConnectRelyingPartyConfiguration0.getClientIdentifier();
        openIdConnectRelyingPartyConfiguration0.ClientIdentifier = "MaxDuration";
        java.lang.String str4 = openIdConnectRelyingPartyConfiguration0.IssuerIdentifier;
        java.lang.String str5 = openIdConnectRelyingPartyConfiguration0.getDisplayName();
        java.lang.String str6 = openIdConnectRelyingPartyConfiguration0.getIdentifierClaim();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00929");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostActivity postActivity0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostActivity();
        postActivity0.LoggerFileName = "hi!";
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostActivity postActivity4 = postActivity0.setCustomId("");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes5 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostActivity postActivity6 = postActivity4.setAuditAttributes(auditAttributes5);
        java.lang.Object obj7 = postActivity4.getResponseType();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Quantity quantity8 = postActivity4.getDepth();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Medium medium9 = postActivity4.Medium;
        org.junit.Assert.assertNotNull(postActivity4);
        org.junit.Assert.assertNotNull(postActivity6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$Activity");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$Activity");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$Activity");
        org.junit.Assert.assertNull(quantity8);
        org.junit.Assert.assertNull(medium9);
    }

    @Test
    public void test00930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00930");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Calibration calibration0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Calibration();
        calibration0.Slope = (-1.0d);
        calibration0.InterceptUnit = "";
    }

    @Test
    public void test00931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00931");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.RatingModelEffectiveShiftsServiceRequest ratingModelEffectiveShiftsServiceRequest0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.RatingModelEffectiveShiftsServiceRequest();
        java.lang.String str1 = ratingModelEffectiveShiftsServiceRequest0.getTimeSeriesUniqueId();
        ratingModelEffectiveShiftsServiceRequest0.RatingModelIdentifier = "'.'SSSSSSS";
        ratingModelEffectiveShiftsServiceRequest0.TimeSeriesUniqueId = "9999-12-31T23:59:59.999Z";
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test00932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00932");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitDataByLocationServiceRequest fieldVisitDataByLocationServiceRequest0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitDataByLocationServiceRequest();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitDataByLocationServiceRequest fieldVisitDataByLocationServiceRequest2 = fieldVisitDataByLocationServiceRequest0.setIncludeNodeDetails((java.lang.Boolean) true);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags3 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray7 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags10 = putLocationTags3.setTagUniqueIds(strList8);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitDataByLocationServiceRequest fieldVisitDataByLocationServiceRequest11 = fieldVisitDataByLocationServiceRequest2.setParameters(strList8);
        java.lang.Boolean boolean12 = fieldVisitDataByLocationServiceRequest2.isConvertToLocalAssumedDatum();
        java.lang.Boolean boolean13 = fieldVisitDataByLocationServiceRequest2.isApplyRounding();
        org.junit.Assert.assertNotNull(fieldVisitDataByLocationServiceRequest2);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(putLocationTags10);
        org.junit.Assert.assertNotNull(fieldVisitDataByLocationServiceRequest11);
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertNull(boolean13);
    }

    @Test
    public void test00933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00933");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutAnalyticalGroup putAnalyticalGroup0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutAnalyticalGroup();
        java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem> analyticalGroupItemList1 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutAnalyticalGroup putAnalyticalGroup2 = putAnalyticalGroup0.setAnalyticalGroupItems(analyticalGroupItemList1);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutAnalyticalGroup putAnalyticalGroup4 = putAnalyticalGroup2.setName("/AQUARIUS/Acquisition/v2");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutAnalyticalGroup putAnalyticalGroup6 = putAnalyticalGroup4.setName("yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem analyticalGroupItem7 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalysisMethod analysisMethod8 = analyticalGroupItem7.getAnalysisMethod();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalysisMethod analysisMethod9 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem analyticalGroupItem10 = analyticalGroupItem7.setAnalysisMethod(analysisMethod9);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedProperty observedProperty11 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedProperty();
        observedProperty11.CasNumber = "MinDuration";
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem analyticalGroupItem14 = analyticalGroupItem10.setObservedProperty(observedProperty11);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem analyticalGroupItem15 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalysisMethod analysisMethod16 = analyticalGroupItem15.getAnalysisMethod();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedProperty observedProperty17 = analyticalGroupItem15.ObservedProperty;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem analyticalGroupItem19 = analyticalGroupItem15.setHoldingTime("MinInstant");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem analyticalGroupItem20 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalysisMethod analysisMethod21 = analyticalGroupItem20.getAnalysisMethod();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalysisMethod analysisMethod22 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem analyticalGroupItem23 = analyticalGroupItem20.setAnalysisMethod(analysisMethod22);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedProperty observedProperty24 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedProperty();
        observedProperty24.CasNumber = "MinDuration";
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem analyticalGroupItem27 = analyticalGroupItem23.setObservedProperty(observedProperty24);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem analyticalGroupItem28 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalysisMethod analysisMethod29 = analyticalGroupItem28.getAnalysisMethod();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedProperty observedProperty30 = analyticalGroupItem28.ObservedProperty;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem analyticalGroupItem32 = analyticalGroupItem28.setHoldingTime("MinInstant");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem analyticalGroupItem33 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalysisMethod analysisMethod34 = analyticalGroupItem33.getAnalysisMethod();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalysisMethod analysisMethod35 = analyticalGroupItem33.getAnalysisMethod();
        analyticalGroupItem33.HoldingTime = "9999-12-31T23:59:59.999Z";
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem analyticalGroupItem38 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalysisMethod analysisMethod39 = analyticalGroupItem38.getAnalysisMethod();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalysisMethod analysisMethod40 = analyticalGroupItem38.getAnalysisMethod();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalysisMethod analysisMethod41 = null;
        analyticalGroupItem38.AnalysisMethod = analysisMethod41;
        java.lang.String str43 = analyticalGroupItem38.getHoldingTime();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalysisMethod analysisMethod44 = analyticalGroupItem38.getAnalysisMethod();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem analyticalGroupItem45 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalysisMethod analysisMethod46 = analyticalGroupItem45.getAnalysisMethod();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedProperty observedProperty47 = analyticalGroupItem45.ObservedProperty;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem analyticalGroupItem49 = analyticalGroupItem45.setHoldingTime("MinInstant");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem analyticalGroupItem50 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalysisMethod analysisMethod51 = analyticalGroupItem50.getAnalysisMethod();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedProperty observedProperty52 = analyticalGroupItem50.ObservedProperty;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem analyticalGroupItem54 = analyticalGroupItem50.setHoldingTime("MinInstant");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedProperty observedProperty55 = analyticalGroupItem54.ObservedProperty;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem analyticalGroupItem56 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalysisMethod analysisMethod57 = analyticalGroupItem56.getAnalysisMethod();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedProperty observedProperty58 = analyticalGroupItem56.ObservedProperty;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem analyticalGroupItem59 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalysisMethod analysisMethod60 = analyticalGroupItem59.getAnalysisMethod();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalysisMethod analysisMethod61 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem analyticalGroupItem62 = analyticalGroupItem59.setAnalysisMethod(analysisMethod61);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedProperty observedProperty63 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedProperty();
        observedProperty63.CasNumber = "MinDuration";
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem analyticalGroupItem66 = analyticalGroupItem62.setObservedProperty(observedProperty63);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem analyticalGroupItem67 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem analyticalGroupItem68 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalysisMethod analysisMethod69 = analyticalGroupItem68.getAnalysisMethod();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalysisMethod analysisMethod70 = analyticalGroupItem68.getAnalysisMethod();
        analyticalGroupItem68.HoldingTime = "9999-12-31T23:59:59.999Z";
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem analyticalGroupItem73 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalysisMethod analysisMethod74 = analyticalGroupItem73.getAnalysisMethod();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalysisMethod analysisMethod75 = analyticalGroupItem73.getAnalysisMethod();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalysisMethod analysisMethod76 = null;
        analyticalGroupItem73.AnalysisMethod = analysisMethod76;
        java.lang.String str78 = analyticalGroupItem73.getHoldingTime();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalysisMethod analysisMethod79 = analyticalGroupItem73.getAnalysisMethod();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalysisMethod analysisMethod80 = analyticalGroupItem73.AnalysisMethod;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem analyticalGroupItem81 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalysisMethod analysisMethod82 = analyticalGroupItem81.getAnalysisMethod();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalysisMethod analysisMethod83 = analyticalGroupItem81.getAnalysisMethod();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalysisMethod analysisMethod84 = null;
        analyticalGroupItem81.AnalysisMethod = analysisMethod84;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem analyticalGroupItem86 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalysisMethod analysisMethod87 = analyticalGroupItem86.getAnalysisMethod();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalysisMethod analysisMethod88 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem analyticalGroupItem89 = analyticalGroupItem86.setAnalysisMethod(analysisMethod88);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedProperty observedProperty90 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedProperty();
        observedProperty90.CasNumber = "MinDuration";
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem analyticalGroupItem93 = analyticalGroupItem89.setObservedProperty(observedProperty90);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem[] analyticalGroupItemArray94 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem[] { analyticalGroupItem14, analyticalGroupItem19, analyticalGroupItem23, analyticalGroupItem32, analyticalGroupItem33, analyticalGroupItem38, analyticalGroupItem45, analyticalGroupItem54, analyticalGroupItem56, analyticalGroupItem62, analyticalGroupItem67, analyticalGroupItem68, analyticalGroupItem73, analyticalGroupItem81, analyticalGroupItem93 };
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem> analyticalGroupItemList95 = new java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem>();
        boolean boolean96 = java.util.Collections.addAll((java.util.Collection<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem>) analyticalGroupItemList95, analyticalGroupItemArray94);
        putAnalyticalGroup4.AnalyticalGroupItems = analyticalGroupItemList95;
        java.lang.String str98 = putAnalyticalGroup4.getName();
        java.lang.String str99 = putAnalyticalGroup4.Name;
        org.junit.Assert.assertNotNull(putAnalyticalGroup2);
        org.junit.Assert.assertNotNull(putAnalyticalGroup4);
        org.junit.Assert.assertNotNull(putAnalyticalGroup6);
        org.junit.Assert.assertNull(analysisMethod8);
        org.junit.Assert.assertNotNull(analyticalGroupItem10);
        org.junit.Assert.assertNotNull(analyticalGroupItem14);
        org.junit.Assert.assertNull(analysisMethod16);
        org.junit.Assert.assertNull(observedProperty17);
        org.junit.Assert.assertNotNull(analyticalGroupItem19);
        org.junit.Assert.assertNull(analysisMethod21);
        org.junit.Assert.assertNotNull(analyticalGroupItem23);
        org.junit.Assert.assertNotNull(analyticalGroupItem27);
        org.junit.Assert.assertNull(analysisMethod29);
        org.junit.Assert.assertNull(observedProperty30);
        org.junit.Assert.assertNotNull(analyticalGroupItem32);
        org.junit.Assert.assertNull(analysisMethod34);
        org.junit.Assert.assertNull(analysisMethod35);
        org.junit.Assert.assertNull(analysisMethod39);
        org.junit.Assert.assertNull(analysisMethod40);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(analysisMethod44);
        org.junit.Assert.assertNull(analysisMethod46);
        org.junit.Assert.assertNull(observedProperty47);
        org.junit.Assert.assertNotNull(analyticalGroupItem49);
        org.junit.Assert.assertNull(analysisMethod51);
        org.junit.Assert.assertNull(observedProperty52);
        org.junit.Assert.assertNotNull(analyticalGroupItem54);
        org.junit.Assert.assertNull(observedProperty55);
        org.junit.Assert.assertNull(analysisMethod57);
        org.junit.Assert.assertNull(observedProperty58);
        org.junit.Assert.assertNull(analysisMethod60);
        org.junit.Assert.assertNotNull(analyticalGroupItem62);
        org.junit.Assert.assertNotNull(analyticalGroupItem66);
        org.junit.Assert.assertNull(analysisMethod69);
        org.junit.Assert.assertNull(analysisMethod70);
        org.junit.Assert.assertNull(analysisMethod74);
        org.junit.Assert.assertNull(analysisMethod75);
        org.junit.Assert.assertNull(str78);
        org.junit.Assert.assertNull(analysisMethod79);
        org.junit.Assert.assertNull(analysisMethod80);
        org.junit.Assert.assertNull(analysisMethod82);
        org.junit.Assert.assertNull(analysisMethod83);
        org.junit.Assert.assertNull(analysisMethod87);
        org.junit.Assert.assertNotNull(analyticalGroupItem89);
        org.junit.Assert.assertNotNull(analyticalGroupItem93);
        org.junit.Assert.assertNotNull(analyticalGroupItemArray94);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ" + "'", str98, "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ");
        org.junit.Assert.assertEquals("'" + str99 + "' != '" + "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ" + "'", str99, "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ");
    }

    @Test
    public void test00934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00934");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ChartData chartData0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ChartData();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedProperty observedProperty1 = chartData0.getObservedProperty();
        java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ChartDataPoint> chartDataPointList2 = chartData0.getDataPoints();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingLocation samplingLocation3 = chartData0.getSamplingLocation();
        org.junit.Assert.assertNull(observedProperty1);
        org.junit.Assert.assertNull(chartDataPointList2);
        org.junit.Assert.assertNull(samplingLocation3);
    }

    @Test
    public void test00935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00935");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabResultDetails labResultDetails0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabResultDetails();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabResultDetails labResultDetails2 = labResultDetails0.setAnalysisComment("/AQUARIUS/Acquisition/v2");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabResultDetails labResultDetails4 = labResultDetails0.setPreparationMethod("https");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes5 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabResultDetails labResultDetails6 = labResultDetails0.setAuditAttributes(auditAttributes5);
        java.lang.String str7 = labResultDetails6.getAnalysisComment();
        labResultDetails6.PreparationMethod = "";
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Laboratory laboratory10 = labResultDetails6.getLaboratory();
        java.time.OffsetDateTime offsetDateTime11 = null;
        labResultDetails6.DateReceived = offsetDateTime11;
        java.time.OffsetDateTime offsetDateTime13 = labResultDetails6.DatePrepared;
        org.junit.Assert.assertNotNull(labResultDetails2);
        org.junit.Assert.assertNotNull(labResultDetails4);
        org.junit.Assert.assertNotNull(labResultDetails6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/AQUARIUS/Acquisition/v2" + "'", str7, "/AQUARIUS/Acquisition/v2");
        org.junit.Assert.assertNull(laboratory10);
        org.junit.Assert.assertNull(offsetDateTime13);
    }

    @Test
    public void test00936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00936");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.DeleteUser deleteUser0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.DeleteUser();
        java.lang.String str1 = deleteUser0.UniqueId;
        java.lang.String str2 = deleteUser0.getUniqueId();
        java.lang.String str3 = deleteUser0.UniqueId;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00937");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.AdcpDischargeActivity adcpDischargeActivity0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.AdcpDischargeActivity();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.QuantityWithDisplay quantityWithDisplay1 = null;
        adcpDischargeActivity0.TransducerDepth = quantityWithDisplay1;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.QuantityWithDisplay quantityWithDisplay3 = null;
        adcpDischargeActivity0.TransducerDepth = quantityWithDisplay3;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.AdcpDischargeActivity adcpDischargeActivity6 = adcpDischargeActivity0.setNumberOfTransects((java.lang.Integer) 4);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeChannelMeasurement dischargeChannelMeasurement7 = adcpDischargeActivity0.getDischargeChannelMeasurement();
        org.junit.Assert.assertNotNull(adcpDischargeActivity6);
        org.junit.Assert.assertNull(dischargeChannelMeasurement7);
    }

    @Test
    public void test00938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00938");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemSamplingLocation importItemSamplingLocation0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemSamplingLocation();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemSamplingLocation importItemSamplingLocation1 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemSamplingLocation();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemSamplingLocation importItemSamplingLocation3 = importItemSamplingLocation1.setInput("yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItem importItem4 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItem();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_5 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        getObservationsV2_5.SpecimenIds = strList8;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags11 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray15 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags18 = putLocationTags11.setTagUniqueIds(strList16);
        getObservationsV2_5.QualityControlTypes = strList16;
        java.util.List<java.lang.String> strList20 = getObservationsV2_5.getLabReportIds();
        importItem4.Errors = getObservationsV2_5;
        java.lang.Object obj22 = importItem4.getExistingItem();
        importItem4.Input = "hi!";
        java.lang.Object obj25 = importItem4.getItem();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemStatusType importItemStatusType26 = com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemStatusType.SKIPPED;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItem importItem27 = importItem4.setStatus(importItemStatusType26);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemSamplingLocation importItemSamplingLocation28 = importItemSamplingLocation3.setStatus(importItemStatusType26);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemStatusType importItemStatusType29 = com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemStatusType.ERROR;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemSamplingLocation importItemSamplingLocation30 = importItemSamplingLocation3.setStatus(importItemStatusType29);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemSamplingLocation importItemSamplingLocation31 = importItemSamplingLocation0.setStatus(importItemStatusType29);
        java.lang.String str32 = importItemSamplingLocation31.getRowId();
        org.junit.Assert.assertNotNull(importItemSamplingLocation3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(putLocationTags18);
        org.junit.Assert.assertNull(strList20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + importItemStatusType26 + "' != '" + com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemStatusType.SKIPPED + "'", importItemStatusType26.equals(com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemStatusType.SKIPPED));
        org.junit.Assert.assertNotNull(importItem27);
        org.junit.Assert.assertNotNull(importItemSamplingLocation28);
        org.junit.Assert.assertTrue("'" + importItemStatusType29 + "' != '" + com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemStatusType.ERROR + "'", importItemStatusType29.equals(com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemStatusType.ERROR));
        org.junit.Assert.assertNotNull(importItemSamplingLocation30);
        org.junit.Assert.assertNotNull(importItemSamplingLocation31);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test00939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00939");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.QuantityWithDisplay quantityWithDisplay1 = null;
        dischargeSummary0.MeanGageHeight = quantityWithDisplay1;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary4 = dischargeSummary0.setReviewer("0001-01-01T00:00:00.000Z");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.QuantityWithDisplay quantityWithDisplay5 = dischargeSummary0.MeanIndexVelocity;
        org.junit.Assert.assertNotNull(dischargeSummary4);
        org.junit.Assert.assertNull(quantityWithDisplay5);
    }

    @Test
    public void test00940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00940");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetExportSpecimens getExportSpecimens0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetExportSpecimens();
        java.util.List<java.lang.String> strList1 = getExportSpecimens0.getActivityTypes();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Qualifier qualifier2 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Qualifier();
        java.time.Instant instant3 = qualifier2.DateApplied;
        java.lang.String str4 = qualifier2.User;
        java.lang.String str5 = qualifier2.getIdentifier();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest timeAlignedDataServiceRequest6 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest();
        java.lang.Object obj7 = timeAlignedDataServiceRequest6.getResponseType();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse8 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse();
        java.time.Instant instant9 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse10 = locationDescriptionListServiceResponse8.setNextToken(instant9);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest timeAlignedDataServiceRequest11 = timeAlignedDataServiceRequest6.setQueryFrom(instant9);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Qualifier qualifier12 = qualifier2.setDateApplied(instant9);
        getExportSpecimens0.Before = instant9;
        java.util.List<java.lang.String> strList14 = getExportSpecimens0.getLaboratoryIds();
        java.util.List<java.lang.String> strList15 = getExportSpecimens0.getSearch();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingPlanPlannedActivityRecurrence samplingPlanPlannedActivityRecurrence16 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingPlanPlannedActivityRecurrence();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.RecurrenceFrequencyType recurrenceFrequencyType17 = samplingPlanPlannedActivityRecurrence16.RecurrenceFrequency;
        java.util.List<java.lang.String> strList18 = samplingPlanPlannedActivityRecurrence16.getMonthsOfYear();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutQualifier putQualifier19 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutQualifier();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutQualifier putQualifier21 = putQualifier19.setUniqueId("");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest timeAlignedDataServiceRequest22 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_23 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        getObservationsV2_23.SpecimenIds = strList26;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags29 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray33 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags36 = putLocationTags29.setTagUniqueIds(strList34);
        getObservationsV2_23.QualityControlTypes = strList34;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest timeAlignedDataServiceRequest38 = timeAlignedDataServiceRequest22.setTimeSeriesUniqueIds(strList34);
        putQualifier19.GroupIdentifiers = strList34;
        java.util.ArrayList<java.lang.String> strList40 = putQualifier19.GroupIdentifiers;
        samplingPlanPlannedActivityRecurrence16.MonthsOfYear = strList40;
        getExportSpecimens0.ActivityTypes = strList40;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetExportSpecimens getExportSpecimens44 = getExportSpecimens0.setCursor("hi!");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse45 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary46 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary48 = dischargeSummary46.setPublish((java.lang.Boolean) false);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse49 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse();
        java.time.Instant instant50 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse51 = locationDescriptionListServiceResponse49.setNextToken(instant50);
        dischargeSummary46.MeasurementTime = instant50;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse53 = locationDescriptionListServiceResponse45.setNextToken(instant50);
        java.time.Instant instant54 = locationDescriptionListServiceResponse45.getNextToken();
        java.time.Instant instant55 = locationDescriptionListServiceResponse45.getNextToken();
        getExportSpecimens44.StartModificationTime = instant55;
        getExportSpecimens44.Cursor = "ZZZZZ";
        org.junit.Assert.assertNull(strList1);
        org.junit.Assert.assertNull(instant3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeAlignedDataServiceResponse");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeAlignedDataServiceResponse");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeAlignedDataServiceResponse");
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertNotNull(locationDescriptionListServiceResponse10);
        org.junit.Assert.assertNotNull(timeAlignedDataServiceRequest11);
        org.junit.Assert.assertNotNull(qualifier12);
        org.junit.Assert.assertNull(strList14);
        org.junit.Assert.assertNull(strList15);
        org.junit.Assert.assertNull(recurrenceFrequencyType17);
        org.junit.Assert.assertNull(strList18);
        org.junit.Assert.assertNotNull(putQualifier21);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(putLocationTags36);
        org.junit.Assert.assertNotNull(timeAlignedDataServiceRequest38);
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertNotNull(getExportSpecimens44);
        org.junit.Assert.assertNotNull(dischargeSummary48);
        org.junit.Assert.assertNotNull(instant50);
        org.junit.Assert.assertNotNull(locationDescriptionListServiceResponse51);
        org.junit.Assert.assertNotNull(locationDescriptionListServiceResponse53);
        org.junit.Assert.assertNotNull(instant54);
        org.junit.Assert.assertNotNull(instant55);
    }

    @Test
    public void test00941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00941");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetAnalyticalGroup getAnalyticalGroup0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetAnalyticalGroup();
        java.lang.Object obj1 = getAnalyticalGroup0.getResponseType();
        java.lang.String str2 = getAnalyticalGroup0.getId();
        java.lang.String str3 = getAnalyticalGroup0.getId();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$AnalyticalGroup");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$AnalyticalGroup");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$AnalyticalGroup");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00942");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.RoleFlattened roleFlattened0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.RoleFlattened();
        roleFlattened0.CanAddOrRemoveLocations = false;
        java.lang.Boolean boolean3 = roleFlattened0.CanEditAppendConfigurations;
        java.lang.String str4 = roleFlattened0.getName();
        java.lang.Boolean boolean5 = roleFlattened0.isCanEditData();
        roleFlattened0.CanAddData = true;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.RoleFlattenedBase roleFlattenedBase9 = roleFlattened0.setCanEditData((java.lang.Boolean) true);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.RoleFlattenedBase roleFlattenedBase11 = roleFlattenedBase9.setCanAssignUserRoles((java.lang.Boolean) false);
        roleFlattenedBase11.CanAddData = true;
        java.lang.Boolean boolean14 = roleFlattenedBase11.CanAddAppendConfigurations;
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNotNull(roleFlattenedBase9);
        org.junit.Assert.assertNotNull(roleFlattenedBase11);
        org.junit.Assert.assertNull(boolean14);
    }

    @Test
    public void test00943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00943");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ExpandedRatingCurve expandedRatingCurve0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ExpandedRatingCurve();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.RatingCurveType ratingCurveType1 = expandedRatingCurve0.Type;
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.PeriodOfApplicability> periodOfApplicabilityList2 = expandedRatingCurve0.PeriodsOfApplicability;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ParameterWithUnit parameterWithUnit3 = expandedRatingCurve0.getOutputParameter();
        org.junit.Assert.assertNull(ratingCurveType1);
        org.junit.Assert.assertNull(periodOfApplicabilityList2);
        org.junit.Assert.assertNull(parameterWithUnit3);
    }

    @Test
    public void test00944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00944");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ErrorInfo errorInfo0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ErrorInfo();
        java.util.List<java.lang.String> strList1 = errorInfo0.getLocalizationParameters();
        org.junit.Assert.assertNull(strList1);
    }

    @Test
    public void test00945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00945");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.AdcpDischargeActivity adcpDischargeActivity0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.AdcpDischargeActivity();
        adcpDischargeActivity0.NodeDetails = "";
    }

    @Test
    public void test00946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00946");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Inspection inspection0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Inspection();
        java.lang.String str1 = inspection0.getManufacturer();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Inspection inspection3 = inspection0.setSubLocationIdentifier("");
        inspection0.SubLocationIdentifier = "9999-12-31T23:59:59.999Z";
        inspection0.Model = "hi!:///AQUARIUS/Provisioning/v1";
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.InspectionType inspectionType8 = inspection0.getInspectionType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(inspection3);
        org.junit.Assert.assertNull(inspectionType8);
    }

    @Test
    public void test00947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00947");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetSpecimen getSpecimen0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetSpecimen();
        java.lang.Boolean boolean1 = getSpecimen0.Detail;
        getSpecimen0.Detail = true;
        java.lang.Boolean boolean4 = getSpecimen0.getDetail();
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test00948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00948");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SearchResultResultDetectionCondition searchResultResultDetectionCondition0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SearchResultResultDetectionCondition();
        java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ResultDetectionCondition> resultDetectionConditionList1 = null;
        searchResultResultDetectionCondition0.DomainObjects = resultDetectionConditionList1;
    }

    @Test
    public void test00949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00949");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.MediumSystemCodeType mediumSystemCodeType0 = com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.MediumSystemCodeType.BIOLOGICAL;
        org.junit.Assert.assertTrue("'" + mediumSystemCodeType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.MediumSystemCodeType.BIOLOGICAL + "'", mediumSystemCodeType0.equals(com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.MediumSystemCodeType.BIOLOGICAL));
    }

    @Test
    public void test00950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00950");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ExtendedAttributeListItem extendedAttributeListItem0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ExtendedAttributeListItem();
        extendedAttributeListItem0.CustomId = "/AQUARIUS/Provisioning/v1";
        java.lang.String str3 = extendedAttributeListItem0.Id;
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00951");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationRemark locationRemark0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationRemark();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationRemark locationRemark2 = locationRemark0.setDescription("MaxInstant");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitDataServiceResponse fieldVisitDataServiceResponse3 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitDataServiceResponse();
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CrossSectionSurveyActivity> crossSectionSurveyActivityList4 = fieldVisitDataServiceResponse3.CrossSectionSurveyActivity;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitDataServiceResponse fieldVisitDataServiceResponse6 = fieldVisitDataServiceResponse3.setIdentifier("");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary7 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary();
        dischargeSummary7.Reviewer = "";
        java.time.Instant instant10 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        dischargeSummary7.MeasurementTime = instant10;
        fieldVisitDataServiceResponse3.ResponseTime = instant10;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationRemark locationRemark13 = locationRemark0.setCreateTime(instant10);
        java.time.Instant instant14 = locationRemark13.getFromTime();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationRemark locationRemark16 = locationRemark13.setRemark("/AQUARIUS");
        java.time.Instant instant17 = locationRemark16.CreateTime;
        locationRemark16.TypeName = "multipart/form-data; boundary=****bbcf5f9e-6ccf-4b63-91ab-6e645caf02af****";
        org.junit.Assert.assertNotNull(locationRemark2);
        org.junit.Assert.assertNull(crossSectionSurveyActivityList4);
        org.junit.Assert.assertNotNull(fieldVisitDataServiceResponse6);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(locationRemark13);
        org.junit.Assert.assertNull(instant14);
        org.junit.Assert.assertNotNull(locationRemark16);
        org.junit.Assert.assertNotNull(instant17);
    }

    @Test
    public void test00952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00952");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SearchResultLocationGroupType searchResultLocationGroupType0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SearchResultLocationGroupType();
        java.lang.Integer int1 = searchResultLocationGroupType0.getTotalCount();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SearchResultLocationGroupType searchResultLocationGroupType3 = searchResultLocationGroupType0.setCursor("/AQUARIUS/Provisioning/v1");
        java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LocationGroupType> locationGroupTypeList4 = searchResultLocationGroupType0.getDomainObjects();
        java.lang.String str5 = searchResultLocationGroupType0.getCursor();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(searchResultLocationGroupType3);
        org.junit.Assert.assertNull(locationGroupTypeList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/AQUARIUS/Provisioning/v1" + "'", str5, "/AQUARIUS/Provisioning/v1");
    }

    @Test
    public void test00953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00953");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Acquisition.PostReportAttachment postReportAttachment0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Acquisition.PostReportAttachment();
        postReportAttachment0.Description = "2021.4.62.0";
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Acquisition.PostReportAttachment postReportAttachment4 = postReportAttachment0.setLocationUniqueId("MaxInstant");
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Acquisition.ApplyTagRequest> applyTagRequestList5 = postReportAttachment0.getTags();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Interval interval6 = postReportAttachment0.getSourceTimeRange();
        org.junit.Assert.assertNotNull(postReportAttachment4);
        org.junit.Assert.assertNull(applyTagRequestList5);
        org.junit.Assert.assertNull(interval6);
    }

    @Test
    public void test00954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00954");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Unit unit0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Unit();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Unit unit2 = unit0.setBaseOffset((java.lang.Double) (-1.0d));
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Unit unit4 = unit0.setSymbol("yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ");
        java.lang.String str5 = unit4.getUnitIdentifier();
        unit4.Symbol = "MinInstant";
        org.junit.Assert.assertNotNull(unit2);
        org.junit.Assert.assertNotNull(unit4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00955");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.RatingCurve ratingCurve0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.RatingCurve();
        java.lang.String str1 = ratingCurve0.Equation;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ExpandedRatingCurve expandedRatingCurve2 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ExpandedRatingCurve();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.RatingCurveType ratingCurveType3 = expandedRatingCurve2.Type;
        expandedRatingCurve2.IsBlended = false;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ParameterWithUnit parameterWithUnit6 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ParameterWithUnit();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ExpandedRatingCurve expandedRatingCurve7 = expandedRatingCurve2.setOutputParameter(parameterWithUnit6);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.RatingCurve ratingCurve8 = ratingCurve0.setInputParameter(parameterWithUnit6);
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.OffsetPoint> offsetPointList9 = ratingCurve0.getOffsets();
        ratingCurve0.Id = "https";
        java.lang.String str12 = ratingCurve0.Remarks;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.RatingCurveType ratingCurveType13 = null;
        ratingCurve0.Type = ratingCurveType13;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(ratingCurveType3);
        org.junit.Assert.assertNotNull(expandedRatingCurve7);
        org.junit.Assert.assertNotNull(ratingCurve8);
        org.junit.Assert.assertNull(offsetPointList9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00956");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.InspectionActivity inspectionActivity0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.InspectionActivity();
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Inspection> inspectionList1 = inspectionActivity0.getInspections();
        java.lang.String str2 = inspectionActivity0.Party;
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Inspection> inspectionList3 = inspectionActivity0.Inspections;
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Reading> readingList4 = inspectionActivity0.getReadings();
        org.junit.Assert.assertNull(inspectionList1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(inspectionList3);
        org.junit.Assert.assertNull(readingList4);
    }

    @Test
    public void test00957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00957");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReadingType fieldVisitReadingType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReadingType.CleaningAfter;
        org.junit.Assert.assertTrue("'" + fieldVisitReadingType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReadingType.CleaningAfter + "'", fieldVisitReadingType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReadingType.CleaningAfter));
    }

    @Test
    public void test00958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00958");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutFieldVisit putFieldVisit0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutFieldVisit();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PlannedActivity[] plannedActivityArray1 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PlannedActivity[] {};
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PlannedActivity> plannedActivityList2 = new java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PlannedActivity>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PlannedActivity>) plannedActivityList2, plannedActivityArray1);
        putFieldVisit0.PlannedActivities = plannedActivityList2;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment domainObjectAttachment5 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment();
        java.lang.String str6 = domainObjectAttachment5.getId();
        java.lang.String str7 = domainObjectAttachment5.getId();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Attachment attachment8 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment domainObjectAttachment9 = domainObjectAttachment5.setAttachment(attachment8);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment domainObjectAttachment10 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment();
        java.lang.String str11 = domainObjectAttachment10.getId();
        java.lang.String str12 = domainObjectAttachment10.getId();
        domainObjectAttachment10.Id = "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ";
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment domainObjectAttachment16 = domainObjectAttachment10.setId("hi!");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment domainObjectAttachment17 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment();
        java.lang.String str18 = domainObjectAttachment17.getId();
        java.lang.String str19 = domainObjectAttachment17.getId();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Attachment attachment20 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment domainObjectAttachment21 = domainObjectAttachment17.setAttachment(attachment20);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment domainObjectAttachment22 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment();
        java.lang.String str23 = domainObjectAttachment22.getId();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment domainObjectAttachment24 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment();
        java.lang.String str25 = domainObjectAttachment24.getId();
        java.lang.String str26 = domainObjectAttachment24.getId();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Attachment attachment27 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment domainObjectAttachment28 = domainObjectAttachment24.setAttachment(attachment27);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment domainObjectAttachment29 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment();
        java.lang.String str30 = domainObjectAttachment29.getId();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment[] domainObjectAttachmentArray31 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment[] { domainObjectAttachment5, domainObjectAttachment10, domainObjectAttachment17, domainObjectAttachment22, domainObjectAttachment24, domainObjectAttachment29 };
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment> domainObjectAttachmentList32 = new java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment>) domainObjectAttachmentList32, domainObjectAttachmentArray31);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutFieldVisit putFieldVisit34 = putFieldVisit0.setAttachments((java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment>) domainObjectAttachmentList32);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingPlan samplingPlan35 = putFieldVisit0.getSamplingPlan();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.FieldTripSimple fieldTripSimple36 = putFieldVisit0.getFieldTrip();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Schedule schedule37 = putFieldVisit0.Schedule;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingLocation samplingLocation38 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingLocation();
        java.lang.String str39 = samplingLocation38.Description;
        java.lang.String str40 = samplingLocation38.VerticalCollectionMethod;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingLocation samplingLocation42 = samplingLocation38.setVerticalCollectionMethod("hi!");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutFieldVisit putFieldVisit43 = putFieldVisit0.setSamplingLocation(samplingLocation38);
        samplingLocation38.Id = "hi!:///AQUARIUS/Provisioning/v1";
        org.junit.Assert.assertNotNull(plannedActivityArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(domainObjectAttachment9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(domainObjectAttachment16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(domainObjectAttachment21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(domainObjectAttachment28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(domainObjectAttachmentArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(putFieldVisit34);
        org.junit.Assert.assertNull(samplingPlan35);
        org.junit.Assert.assertNull(fieldTripSimple36);
        org.junit.Assert.assertNull(schedule37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(samplingLocation42);
        org.junit.Assert.assertNotNull(putFieldVisit43);
    }

    @Test
    public void test00959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00959");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagDefinition tagDefinition0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagDefinition();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagValueType tagValueType1 = null;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagDefinition tagDefinition2 = tagDefinition0.setValueType(tagValueType1);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagDefinition tagDefinition4 = tagDefinition0.setAppliesToAttachments((java.lang.Boolean) false);
        java.lang.Boolean boolean5 = tagDefinition0.AppliesToAttachments;
        java.lang.String str6 = tagDefinition0.Key;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagDefinition tagDefinition8 = tagDefinition0.setAppliesToSensorsGauges((java.lang.Boolean) false);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagDefinition tagDefinition10 = tagDefinition0.setAppliesToReports((java.lang.Boolean) false);
        java.lang.Boolean boolean11 = tagDefinition0.AppliesToSensorsGauges;
        org.junit.Assert.assertNotNull(tagDefinition2);
        org.junit.Assert.assertNotNull(tagDefinition4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + false + "'", boolean5, false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(tagDefinition8);
        org.junit.Assert.assertNotNull(tagDefinition10);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + false + "'", boolean11, false);
    }

    @Test
    public void test00960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00960");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutSamplingLocation putSamplingLocation0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutSamplingLocation();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutSamplingLocation putSamplingLocation2 = putSamplingLocation0.setCustomId("https");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutSamplingLocation putSamplingLocation4 = putSamplingLocation2.setVerticalCollectionMethod("POST");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutSamplingLocation putSamplingLocation6 = putSamplingLocation2.setVerticalDatum("MinInstant");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LocationType locationType7 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutSamplingLocation putSamplingLocation8 = putSamplingLocation6.setType(locationType7);
        java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ExtendedAttribute> extendedAttributeList9 = putSamplingLocation6.ExtendedAttributes;
        java.lang.String str10 = putSamplingLocation6.Description;
        org.junit.Assert.assertNotNull(putSamplingLocation2);
        org.junit.Assert.assertNotNull(putSamplingLocation4);
        org.junit.Assert.assertNotNull(putSamplingLocation6);
        org.junit.Assert.assertNotNull(putSamplingLocation8);
        org.junit.Assert.assertNull(extendedAttributeList9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00961");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostActivity postActivity0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostActivity();
        postActivity0.SourceActivityId = "2021.4.62.0";
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PlannedActivity plannedActivity3 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostActivity postActivity4 = postActivity0.setPlannedActivity(plannedActivity3);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostActivity postActivity6 = postActivity0.setLoggerFileName("https");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostFieldVisitActivityWithTemplate postFieldVisitActivityWithTemplate7 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostFieldVisitActivityWithTemplate();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate specimenTemplate8 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate();
        specimenTemplate8.CustomId = "hi!";
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate specimenTemplate11 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate specimenTemplate12 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate();
        java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabInstructionTemplate> labInstructionTemplateList13 = specimenTemplate12.getLabInstructionTemplates();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate specimenTemplate14 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate specimenTemplate16 = specimenTemplate14.setCustomId("hi!");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate specimenTemplate17 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate specimenTemplate18 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate();
        java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabInstructionTemplate> labInstructionTemplateList19 = specimenTemplate18.LabInstructionTemplates;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate[] specimenTemplateArray20 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate[] { specimenTemplate8, specimenTemplate11, specimenTemplate12, specimenTemplate16, specimenTemplate17, specimenTemplate18 };
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate> specimenTemplateList21 = new java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate>) specimenTemplateList21, specimenTemplateArray20);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostFieldVisitActivityWithTemplate postFieldVisitActivityWithTemplate23 = postFieldVisitActivityWithTemplate7.setSpecimenTemplates((java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate>) specimenTemplateList21);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostActivity postActivity24 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostActivity();
        postActivity24.LoggerFileName = "hi!";
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PlannedActivity plannedActivity27 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostActivity postActivity28 = postActivity24.setPlannedActivity(plannedActivity27);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ActivityType activityType29 = postActivity24.Type;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostFieldVisitActivityWithTemplate postFieldVisitActivityWithTemplate30 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostFieldVisitActivityWithTemplate();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate specimenTemplate31 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate();
        specimenTemplate31.CustomId = "hi!";
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate specimenTemplate34 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate specimenTemplate35 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate();
        java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabInstructionTemplate> labInstructionTemplateList36 = specimenTemplate35.getLabInstructionTemplates();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate specimenTemplate37 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate specimenTemplate39 = specimenTemplate37.setCustomId("hi!");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate specimenTemplate40 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate specimenTemplate41 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate();
        java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabInstructionTemplate> labInstructionTemplateList42 = specimenTemplate41.LabInstructionTemplates;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate[] specimenTemplateArray43 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate[] { specimenTemplate31, specimenTemplate34, specimenTemplate35, specimenTemplate39, specimenTemplate40, specimenTemplate41 };
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate> specimenTemplateList44 = new java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate>) specimenTemplateList44, specimenTemplateArray43);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostFieldVisitActivityWithTemplate postFieldVisitActivityWithTemplate46 = postFieldVisitActivityWithTemplate30.setSpecimenTemplates((java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate>) specimenTemplateList44);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.CollectionMethod collectionMethod47 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.CollectionMethod();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostFieldVisitActivityWithTemplate postFieldVisitActivityWithTemplate48 = postFieldVisitActivityWithTemplate46.setCollectionMethod(collectionMethod47);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostActivity postActivity49 = postActivity24.setCollectionMethod(collectionMethod47);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostFieldVisitActivityWithTemplate postFieldVisitActivityWithTemplate50 = postFieldVisitActivityWithTemplate7.setCollectionMethod(collectionMethod47);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostActivity postActivity51 = postActivity0.setCollectionMethod(collectionMethod47);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.FieldVisit fieldVisit52 = postActivity0.getFieldVisit();
        org.junit.Assert.assertNotNull(postActivity4);
        org.junit.Assert.assertNotNull(postActivity6);
        org.junit.Assert.assertNull(labInstructionTemplateList13);
        org.junit.Assert.assertNotNull(specimenTemplate16);
        org.junit.Assert.assertNull(labInstructionTemplateList19);
        org.junit.Assert.assertNotNull(specimenTemplateArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(postFieldVisitActivityWithTemplate23);
        org.junit.Assert.assertNotNull(postActivity28);
        org.junit.Assert.assertNull(activityType29);
        org.junit.Assert.assertNull(labInstructionTemplateList36);
        org.junit.Assert.assertNotNull(specimenTemplate39);
        org.junit.Assert.assertNull(labInstructionTemplateList42);
        org.junit.Assert.assertNotNull(specimenTemplateArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(postFieldVisitActivityWithTemplate46);
        org.junit.Assert.assertNotNull(postFieldVisitActivityWithTemplate48);
        org.junit.Assert.assertNotNull(postActivity49);
        org.junit.Assert.assertNotNull(postFieldVisitActivityWithTemplate50);
        org.junit.Assert.assertNotNull(postActivity51);
        org.junit.Assert.assertNull(fieldVisit52);
    }

    @Test
    public void test00962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00962");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Attachment attachment0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Attachment();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.AttachmentCategory attachmentCategory1 = attachment0.AttachmentCategory;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Attachment attachment3 = attachment0.setFileName("");
        attachment0.UploadedByUser = "/AQUARIUS/Acquisition/v2://9999-12-31T23:59:59.999Z";
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagMetadata> tagMetadataList6 = attachment0.Tags;
        java.lang.String str7 = attachment0.Url;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetExportSpecimens getExportSpecimens8 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetExportSpecimens();
        java.util.List<java.lang.String> strList9 = getExportSpecimens8.getActivityTypes();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Qualifier qualifier10 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Qualifier();
        java.time.Instant instant11 = qualifier10.DateApplied;
        java.lang.String str12 = qualifier10.User;
        java.lang.String str13 = qualifier10.getIdentifier();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest timeAlignedDataServiceRequest14 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest();
        java.lang.Object obj15 = timeAlignedDataServiceRequest14.getResponseType();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse16 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse();
        java.time.Instant instant17 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse18 = locationDescriptionListServiceResponse16.setNextToken(instant17);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest timeAlignedDataServiceRequest19 = timeAlignedDataServiceRequest14.setQueryFrom(instant17);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Qualifier qualifier20 = qualifier10.setDateApplied(instant17);
        getExportSpecimens8.Before = instant17;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationRemark locationRemark22 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationRemark();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationRemark locationRemark24 = locationRemark22.setDescription("MaxInstant");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitDataServiceResponse fieldVisitDataServiceResponse25 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitDataServiceResponse();
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CrossSectionSurveyActivity> crossSectionSurveyActivityList26 = fieldVisitDataServiceResponse25.CrossSectionSurveyActivity;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitDataServiceResponse fieldVisitDataServiceResponse28 = fieldVisitDataServiceResponse25.setIdentifier("");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary29 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary();
        dischargeSummary29.Reviewer = "";
        java.time.Instant instant32 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        dischargeSummary29.MeasurementTime = instant32;
        fieldVisitDataServiceResponse25.ResponseTime = instant32;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationRemark locationRemark35 = locationRemark22.setCreateTime(instant32);
        getExportSpecimens8.EndModificationTime = instant32;
        attachment0.DateUploaded = instant32;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.AttachmentCategory attachmentCategory38 = attachment0.AttachmentCategory;
        org.junit.Assert.assertNull(attachmentCategory1);
        org.junit.Assert.assertNotNull(attachment3);
        org.junit.Assert.assertNull(tagMetadataList6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strList9);
        org.junit.Assert.assertNull(instant11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeAlignedDataServiceResponse");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeAlignedDataServiceResponse");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeAlignedDataServiceResponse");
        org.junit.Assert.assertNotNull(instant17);
        org.junit.Assert.assertNotNull(locationDescriptionListServiceResponse18);
        org.junit.Assert.assertNotNull(timeAlignedDataServiceRequest19);
        org.junit.Assert.assertNotNull(qualifier20);
        org.junit.Assert.assertNotNull(locationRemark24);
        org.junit.Assert.assertNull(crossSectionSurveyActivityList26);
        org.junit.Assert.assertNotNull(fieldVisitDataServiceResponse28);
        org.junit.Assert.assertNotNull(instant32);
        org.junit.Assert.assertNotNull(locationRemark35);
        org.junit.Assert.assertNull(attachmentCategory38);
    }

    @Test
    public void test00963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00963");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservationNestedInSpecimen observationNestedInSpecimen0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservationNestedInSpecimen();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ResultStatus resultStatus1 = observationNestedInSpecimen0.ResultStatus;
        java.lang.String str2 = observationNestedInSpecimen0.Id;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DataClassificationType dataClassificationType3 = observationNestedInSpecimen0.DataClassification;
        org.junit.Assert.assertNull(resultStatus1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(dataClassificationType3);
    }

    @Test
    public void test00964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00964");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesThresholdPeriod timeSeriesThresholdPeriod0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesThresholdPeriod();
        timeSeriesThresholdPeriod0.SecondaryReferenceValue = (-1.0d);
    }

    @Test
    public void test00965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00965");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation observation0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PlannedFieldResult plannedFieldResult1 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation observation2 = observation0.setPlannedFieldResult(plannedFieldResult1);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabInstruction labInstruction3 = null;
        observation2.LabInstruction = labInstruction3;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservationStatistics observationStatistics5 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation observation6 = observation2.setStatistics(observationStatistics5);
        java.time.OffsetDateTime offsetDateTime7 = observation6.getResultTime();
        java.time.OffsetDateTime offsetDateTime8 = null;
        observation6.ObservedTime = offsetDateTime8;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation observation11 = observation6.setComment("yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ResultGrade resultGrade12 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ResultGrade();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ResultGrade resultGrade14 = resultGrade12.setCustomId("");
        observation6.ResultGrade = resultGrade14;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostActivity postActivity16 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostActivity();
        postActivity16.LoggerFileName = "hi!";
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PlannedActivity plannedActivity19 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostActivity postActivity20 = postActivity16.setPlannedActivity(plannedActivity19);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ActivityType activityType21 = postActivity16.Type;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostFieldVisitActivityWithTemplate postFieldVisitActivityWithTemplate22 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostFieldVisitActivityWithTemplate();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate specimenTemplate23 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate();
        specimenTemplate23.CustomId = "hi!";
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate specimenTemplate26 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate specimenTemplate27 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate();
        java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabInstructionTemplate> labInstructionTemplateList28 = specimenTemplate27.getLabInstructionTemplates();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate specimenTemplate29 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate specimenTemplate31 = specimenTemplate29.setCustomId("hi!");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate specimenTemplate32 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate specimenTemplate33 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate();
        java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabInstructionTemplate> labInstructionTemplateList34 = specimenTemplate33.LabInstructionTemplates;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate[] specimenTemplateArray35 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate[] { specimenTemplate23, specimenTemplate26, specimenTemplate27, specimenTemplate31, specimenTemplate32, specimenTemplate33 };
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate> specimenTemplateList36 = new java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate>) specimenTemplateList36, specimenTemplateArray35);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostFieldVisitActivityWithTemplate postFieldVisitActivityWithTemplate38 = postFieldVisitActivityWithTemplate22.setSpecimenTemplates((java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate>) specimenTemplateList36);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.CollectionMethod collectionMethod39 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.CollectionMethod();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostFieldVisitActivityWithTemplate postFieldVisitActivityWithTemplate40 = postFieldVisitActivityWithTemplate38.setCollectionMethod(collectionMethod39);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostActivity postActivity41 = postActivity16.setCollectionMethod(collectionMethod39);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Medium medium42 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Medium();
        postActivity16.Medium = medium42;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes44 = medium42.AuditAttributes;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes45 = medium42.AuditAttributes;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation observation46 = observation6.setMedium(medium42);
        java.time.OffsetDateTime offsetDateTime47 = observation46.getResultTime();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Specimen specimen48 = observation46.getSpecimen();
        org.junit.Assert.assertNotNull(observation2);
        org.junit.Assert.assertNotNull(observation6);
        org.junit.Assert.assertNull(offsetDateTime7);
        org.junit.Assert.assertNotNull(observation11);
        org.junit.Assert.assertNotNull(resultGrade14);
        org.junit.Assert.assertNotNull(postActivity20);
        org.junit.Assert.assertNull(activityType21);
        org.junit.Assert.assertNull(labInstructionTemplateList28);
        org.junit.Assert.assertNotNull(specimenTemplate31);
        org.junit.Assert.assertNull(labInstructionTemplateList34);
        org.junit.Assert.assertNotNull(specimenTemplateArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(postFieldVisitActivityWithTemplate38);
        org.junit.Assert.assertNotNull(postFieldVisitActivityWithTemplate40);
        org.junit.Assert.assertNotNull(postActivity41);
        org.junit.Assert.assertNull(auditAttributes44);
        org.junit.Assert.assertNull(auditAttributes45);
        org.junit.Assert.assertNotNull(observation46);
        org.junit.Assert.assertNull(offsetDateTime47);
        org.junit.Assert.assertNull(specimen48);
    }

    @Test
    public void test00966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00966");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PlannedActivityActivityType plannedActivityActivityType0 = com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PlannedActivityActivityType.OTHER_QC;
        org.junit.Assert.assertTrue("'" + plannedActivityActivityType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PlannedActivityActivityType.OTHER_QC + "'", plannedActivityActivityType0.equals(com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PlannedActivityActivityType.OTHER_QC));
    }

    @Test
    public void test00967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00967");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostStatisticalDerivedTimeSeries postStatisticalDerivedTimeSeries0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostStatisticalDerivedTimeSeries();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostStatisticalDerivedTimeSeries postStatisticalDerivedTimeSeries2 = postStatisticalDerivedTimeSeries0.setComment("'.'SSSSSSS");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostStatisticalDerivedTimeSeries postStatisticalDerivedTimeSeries4 = postStatisticalDerivedTimeSeries0.setMethod("MinDuration");
        java.lang.Boolean boolean5 = postStatisticalDerivedTimeSeries4.isRequireMinimumCoverage();
        org.junit.Assert.assertNotNull(postStatisticalDerivedTimeSeries2);
        org.junit.Assert.assertNotNull(postStatisticalDerivedTimeSeries4);
        org.junit.Assert.assertNull(boolean5);
    }

    @Test
    public void test00968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00968");
        java.lang.String str0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.IIdentifySetting.Key;
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test00969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00969");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostObservationV2 postObservationV2_0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostObservationV2();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabInstruction labInstruction1 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostObservationV2 postObservationV2_2 = postObservationV2_0.setLabInstruction(labInstruction1);
        java.lang.String str3 = postObservationV2_2.MediumSubdivision;
        java.lang.String str4 = postObservationV2_2.getComment();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabResultDetails labResultDetails5 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostObservationV2 postObservationV2_6 = postObservationV2_2.setLabResultDetails(labResultDetails5);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.NullMeasureQualifier nullMeasureQualifier7 = postObservationV2_2.NullMeasureQualifier;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabInstruction labInstruction8 = null;
        postObservationV2_2.LabInstruction = labInstruction8;
        org.junit.Assert.assertNotNull(postObservationV2_2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(postObservationV2_6);
        org.junit.Assert.assertNull(nullMeasureQualifier7);
    }

    @Test
    public void test00970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00970");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostSensor postSensor0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostSensor();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.SensorBase sensorBase2 = postSensor0.setName("");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.SensorBase sensorBase4 = postSensor0.setUnitId("");
        java.lang.String str5 = sensorBase4.Name;
        java.lang.String str6 = sensorBase4.getLocationUniqueId();
        java.lang.String str7 = sensorBase4.UnitId;
        org.junit.Assert.assertNotNull(sensorBase2);
        org.junit.Assert.assertNotNull(sensorBase4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test00971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00971");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutOpenIdConnectUser putOpenIdConnectUser0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutOpenIdConnectUser();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.UserBase userBase2 = putOpenIdConnectUser0.setCanConfigureSystem((java.lang.Boolean) true);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutOpenIdConnectUser putOpenIdConnectUser4 = putOpenIdConnectUser0.setIdentifier("/AQUARIUS/Acquisition/v2");
        java.lang.String str5 = putOpenIdConnectUser4.getIdentifier();
        putOpenIdConnectUser4.FirstName = "multipart/form-data; boundary=****44f0772e-c3ca-4316-8e2a-61ec8540d661****";
        org.junit.Assert.assertNotNull(userBase2);
        org.junit.Assert.assertNotNull(putOpenIdConnectUser4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/AQUARIUS/Acquisition/v2" + "'", str5, "/AQUARIUS/Acquisition/v2");
    }

    @Test
    public void test00972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00972");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutRecurringReport putRecurringReport0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutRecurringReport();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationDatumPeriod locationDatumPeriod1 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationDatumPeriod();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationDatumPeriodBase locationDatumPeriodBase3 = locationDatumPeriod1.setComment("'.'SSSSSSS");
        java.lang.Double double4 = locationDatumPeriodBase3.Elevation;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Qualifier qualifier5 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Qualifier();
        java.time.Instant instant6 = qualifier5.DateApplied;
        java.lang.String str7 = qualifier5.User;
        java.lang.String str8 = qualifier5.getIdentifier();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest timeAlignedDataServiceRequest9 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest();
        java.lang.Object obj10 = timeAlignedDataServiceRequest9.getResponseType();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse11 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse();
        java.time.Instant instant12 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse13 = locationDescriptionListServiceResponse11.setNextToken(instant12);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest timeAlignedDataServiceRequest14 = timeAlignedDataServiceRequest9.setQueryFrom(instant12);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Qualifier qualifier15 = qualifier5.setDateApplied(instant12);
        java.time.Instant instant16 = qualifier15.getDateApplied();
        locationDatumPeriodBase3.ValidFrom = instant16;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.RecurringReportBase recurringReportBase18 = putRecurringReport0.setNextGenerationDate(instant16);
        java.lang.String str19 = recurringReportBase18.RecurrencePeriod;
        org.junit.Assert.assertNotNull(locationDatumPeriodBase3);
        org.junit.Assert.assertNull(double4);
        org.junit.Assert.assertNull(instant6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeAlignedDataServiceResponse");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeAlignedDataServiceResponse");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeAlignedDataServiceResponse");
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(locationDescriptionListServiceResponse13);
        org.junit.Assert.assertNotNull(timeAlignedDataServiceRequest14);
        org.junit.Assert.assertNotNull(qualifier15);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertNotNull(recurringReportBase18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test00973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00973");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.GetLocation getLocation0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.GetLocation();
        java.lang.String str1 = getLocation0.LocationUniqueId;
        getLocation0.LocationUniqueId = "multipart/form-data; boundary=****bbcf5f9e-6ccf-4b63-91ab-6e645caf02af****";
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test00974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00974");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Vertical vertical0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Vertical();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FlowDirectionType flowDirectionType1 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FlowDirectionType.Reversed;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Vertical vertical2 = vertical0.setFlowDirection(flowDirectionType1);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.PointVelocityObservationType pointVelocityObservationType3 = null;
        vertical0.VelocityObservationMethod = pointVelocityObservationType3;
        org.junit.Assert.assertTrue("'" + flowDirectionType1 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FlowDirectionType.Reversed + "'", flowDirectionType1.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FlowDirectionType.Reversed));
        org.junit.Assert.assertNotNull(vertical2);
    }

    @Test
    public void test00975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00975");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitDataByLocationServiceRequest fieldVisitDataByLocationServiceRequest0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitDataByLocationServiceRequest();
        java.lang.String str1 = fieldVisitDataByLocationServiceRequest0.getConvertToStandardReferenceDatum();
        java.lang.String str2 = fieldVisitDataByLocationServiceRequest0.getLocationIdentifier();
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.InspectionType> inspectionTypeList3 = fieldVisitDataByLocationServiceRequest0.getInspectionTypes();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(inspectionTypeList3);
    }

    @Test
    public void test00976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00976");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostSpreadsheetTemplate postSpreadsheetTemplate0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostSpreadsheetTemplate();
        java.lang.String str1 = postSpreadsheetTemplate0.Id;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpreadsheetTemplateType spreadsheetTemplateType2 = postSpreadsheetTemplate0.Type;
        java.lang.String str3 = postSpreadsheetTemplate0.Description;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostLabAnalysisMethod postLabAnalysisMethod4 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostLabAnalysisMethod();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes5 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostLabAnalysisMethod postLabAnalysisMethod6 = postLabAnalysisMethod4.setAuditAttributes(auditAttributes5);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedProperty[] observedPropertyArray7 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedProperty[] {};
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedProperty> observedPropertyList8 = new java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedProperty>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedProperty>) observedPropertyList8, observedPropertyArray7);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostLabAnalysisMethod postLabAnalysisMethod10 = postLabAnalysisMethod6.setObservedProperties((java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedProperty>) observedPropertyList8);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroup analyticalGroup11 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroup();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupType analyticalGroupType12 = analyticalGroup11.getType();
        analyticalGroup11.Name = "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSSSSSZZZZZ";
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroup analyticalGroup15 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroup();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem analyticalGroupItem16 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalysisMethod analysisMethod17 = analyticalGroupItem16.getAnalysisMethod();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem analyticalGroupItem18 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalysisMethod analysisMethod19 = analyticalGroupItem18.getAnalysisMethod();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalysisMethod analysisMethod20 = analyticalGroupItem18.getAnalysisMethod();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem analyticalGroupItem21 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalysisMethod analysisMethod22 = analyticalGroupItem21.getAnalysisMethod();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalysisMethod analysisMethod23 = analyticalGroupItem21.getAnalysisMethod();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalysisMethod analysisMethod24 = null;
        analyticalGroupItem21.AnalysisMethod = analysisMethod24;
        java.lang.String str26 = analyticalGroupItem21.getHoldingTime();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem analyticalGroupItem27 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalysisMethod analysisMethod28 = analyticalGroupItem27.getAnalysisMethod();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalysisMethod analysisMethod29 = analyticalGroupItem27.getAnalysisMethod();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem analyticalGroupItem30 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalysisMethod analysisMethod31 = analyticalGroupItem30.getAnalysisMethod();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem analyticalGroupItem32 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalysisMethod analysisMethod33 = analyticalGroupItem32.getAnalysisMethod();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalysisMethod analysisMethod34 = analyticalGroupItem32.getAnalysisMethod();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalysisMethod analysisMethod35 = null;
        analyticalGroupItem32.AnalysisMethod = analysisMethod35;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem[] analyticalGroupItemArray37 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem[] { analyticalGroupItem16, analyticalGroupItem18, analyticalGroupItem21, analyticalGroupItem27, analyticalGroupItem30, analyticalGroupItem32 };
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem> analyticalGroupItemList38 = new java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem>) analyticalGroupItemList38, analyticalGroupItemArray37);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroup analyticalGroup40 = analyticalGroup15.setAnalyticalGroupItems((java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem>) analyticalGroupItemList38);
        analyticalGroup11.AnalyticalGroupItems = analyticalGroupItemList38;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes42 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes();
        analyticalGroup11.AuditAttributes = auditAttributes42;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostLabAnalysisMethod postLabAnalysisMethod44 = postLabAnalysisMethod10.setAuditAttributes(auditAttributes42);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostSpreadsheetTemplate postSpreadsheetTemplate45 = postSpreadsheetTemplate0.setAuditAttributes(auditAttributes42);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostSpreadsheetTemplate postSpreadsheetTemplate47 = postSpreadsheetTemplate0.setCustomId("hi!");
        java.lang.String str48 = postSpreadsheetTemplate0.getDescription();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(spreadsheetTemplateType2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(postLabAnalysisMethod6);
        org.junit.Assert.assertNotNull(observedPropertyArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(postLabAnalysisMethod10);
        org.junit.Assert.assertNull(analyticalGroupType12);
        org.junit.Assert.assertNull(analysisMethod17);
        org.junit.Assert.assertNull(analysisMethod19);
        org.junit.Assert.assertNull(analysisMethod20);
        org.junit.Assert.assertNull(analysisMethod22);
        org.junit.Assert.assertNull(analysisMethod23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(analysisMethod28);
        org.junit.Assert.assertNull(analysisMethod29);
        org.junit.Assert.assertNull(analysisMethod31);
        org.junit.Assert.assertNull(analysisMethod33);
        org.junit.Assert.assertNull(analysisMethod34);
        org.junit.Assert.assertNotNull(analyticalGroupItemArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(analyticalGroup40);
        org.junit.Assert.assertNotNull(postLabAnalysisMethod44);
        org.junit.Assert.assertNotNull(postSpreadsheetTemplate45);
        org.junit.Assert.assertNotNull(postSpreadsheetTemplate47);
        org.junit.Assert.assertNull(str48);
    }

    @Test
    public void test00977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00977");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.AttachmentType attachmentType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.AttachmentType.Unknown;
        org.junit.Assert.assertTrue("'" + attachmentType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.AttachmentType.Unknown + "'", attachmentType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.AttachmentType.Unknown));
    }

    @Test
    public void test00978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00978");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Reading reading0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Reading();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DoubleWithDisplay doubleWithDisplay1 = reading0.getValue();
        java.lang.String str2 = reading0.Manufacturer;
        java.lang.String str3 = reading0.getSerialNumber();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Reading reading4 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Reading();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DoubleWithDisplay doubleWithDisplay5 = reading4.getValue();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ReadingType readingType6 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ReadingType.RoutineBefore;
        reading4.ReadingType = readingType6;
        reading0.ReadingType = readingType6;
        java.lang.String str9 = reading0.getParameter();
        org.junit.Assert.assertNull(doubleWithDisplay1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleWithDisplay5);
        org.junit.Assert.assertTrue("'" + readingType6 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ReadingType.RoutineBefore + "'", readingType6.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ReadingType.RoutineBefore));
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00979");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SearchResultFilter searchResultFilter0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SearchResultFilter();
        java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Filter> filterList1 = searchResultFilter0.DomainObjects;
        org.junit.Assert.assertNull(filterList1);
    }

    @Test
    public void test00980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00980");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetAnalyticalGroups getAnalyticalGroups0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetAnalyticalGroups();
        java.util.List<java.lang.String> strList1 = getAnalyticalGroups0.ObservedPropertyIds;
        java.util.List<java.lang.String> strList2 = getAnalyticalGroups0.getObservedPropertyIds();
        java.util.List<java.lang.String> strList3 = getAnalyticalGroups0.AnalyticalGroupTypes;
        org.junit.Assert.assertNull(strList1);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(strList3);
    }

    @Test
    public void test00981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00981");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.RecurrenceDayWeeklyType recurrenceDayWeeklyType0 = com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.RecurrenceDayWeeklyType.WEDNESDAY;
        org.junit.Assert.assertTrue("'" + recurrenceDayWeeklyType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.RecurrenceDayWeeklyType.WEDNESDAY + "'", recurrenceDayWeeklyType0.equals(com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.RecurrenceDayWeeklyType.WEDNESDAY));
    }

    @Test
    public void test00982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00982");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutSchedule putSchedule0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutSchedule();
        java.time.OffsetDateTime offsetDateTime1 = putSchedule0.StartDate;
        java.time.OffsetDateTime offsetDateTime2 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutSchedule putSchedule3 = putSchedule0.setEndDate(offsetDateTime2);
        java.lang.Integer int4 = putSchedule0.getSamplingLocationGroupSelectionTypeRandomCount();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingLocationGroupSelectionType samplingLocationGroupSelectionType5 = com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingLocationGroupSelectionType.RANDOM;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutSchedule putSchedule6 = putSchedule0.setSamplingLocationGroupSelectionType(samplingLocationGroupSelectionType5);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostObservedProperty postObservedProperty7 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostObservedProperty();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostObservedProperty postObservedProperty9 = postObservedProperty7.setName("/AQUARIUS/Acquisition/v2://9999-12-31T23:59:59.999Z");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalysisType analysisType10 = postObservedProperty7.getAnalysisType();
        postObservedProperty7.CustomId = "MaxInstant";
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Quantity quantity13 = postObservedProperty7.getLowerLimit();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostLabAnalysisMethod postLabAnalysisMethod14 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostLabAnalysisMethod();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes15 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostLabAnalysisMethod postLabAnalysisMethod16 = postLabAnalysisMethod14.setAuditAttributes(auditAttributes15);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedProperty[] observedPropertyArray17 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedProperty[] {};
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedProperty> observedPropertyList18 = new java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedProperty>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedProperty>) observedPropertyList18, observedPropertyArray17);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostLabAnalysisMethod postLabAnalysisMethod20 = postLabAnalysisMethod16.setObservedProperties((java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedProperty>) observedPropertyList18);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroup analyticalGroup21 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroup();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupType analyticalGroupType22 = analyticalGroup21.getType();
        analyticalGroup21.Name = "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSSSSSZZZZZ";
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroup analyticalGroup25 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroup();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem analyticalGroupItem26 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalysisMethod analysisMethod27 = analyticalGroupItem26.getAnalysisMethod();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem analyticalGroupItem28 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalysisMethod analysisMethod29 = analyticalGroupItem28.getAnalysisMethod();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalysisMethod analysisMethod30 = analyticalGroupItem28.getAnalysisMethod();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem analyticalGroupItem31 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalysisMethod analysisMethod32 = analyticalGroupItem31.getAnalysisMethod();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalysisMethod analysisMethod33 = analyticalGroupItem31.getAnalysisMethod();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalysisMethod analysisMethod34 = null;
        analyticalGroupItem31.AnalysisMethod = analysisMethod34;
        java.lang.String str36 = analyticalGroupItem31.getHoldingTime();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem analyticalGroupItem37 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalysisMethod analysisMethod38 = analyticalGroupItem37.getAnalysisMethod();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalysisMethod analysisMethod39 = analyticalGroupItem37.getAnalysisMethod();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem analyticalGroupItem40 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalysisMethod analysisMethod41 = analyticalGroupItem40.getAnalysisMethod();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem analyticalGroupItem42 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalysisMethod analysisMethod43 = analyticalGroupItem42.getAnalysisMethod();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalysisMethod analysisMethod44 = analyticalGroupItem42.getAnalysisMethod();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalysisMethod analysisMethod45 = null;
        analyticalGroupItem42.AnalysisMethod = analysisMethod45;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem[] analyticalGroupItemArray47 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem[] { analyticalGroupItem26, analyticalGroupItem28, analyticalGroupItem31, analyticalGroupItem37, analyticalGroupItem40, analyticalGroupItem42 };
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem> analyticalGroupItemList48 = new java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem>) analyticalGroupItemList48, analyticalGroupItemArray47);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroup analyticalGroup50 = analyticalGroup25.setAnalyticalGroupItems((java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroupItem>) analyticalGroupItemList48);
        analyticalGroup21.AnalyticalGroupItems = analyticalGroupItemList48;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes52 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes();
        analyticalGroup21.AuditAttributes = auditAttributes52;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostLabAnalysisMethod postLabAnalysisMethod54 = postLabAnalysisMethod20.setAuditAttributes(auditAttributes52);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostObservedProperty postObservedProperty55 = postObservedProperty7.setAuditAttributes(auditAttributes52);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutSchedule putSchedule56 = putSchedule0.setAuditAttributes(auditAttributes52);
        java.time.OffsetDateTime offsetDateTime57 = putSchedule56.EndDate;
        org.junit.Assert.assertNull(offsetDateTime1);
        org.junit.Assert.assertNotNull(putSchedule3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertTrue("'" + samplingLocationGroupSelectionType5 + "' != '" + com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingLocationGroupSelectionType.RANDOM + "'", samplingLocationGroupSelectionType5.equals(com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingLocationGroupSelectionType.RANDOM));
        org.junit.Assert.assertNotNull(putSchedule6);
        org.junit.Assert.assertNotNull(postObservedProperty9);
        org.junit.Assert.assertNull(analysisType10);
        org.junit.Assert.assertNull(quantity13);
        org.junit.Assert.assertNotNull(postLabAnalysisMethod16);
        org.junit.Assert.assertNotNull(observedPropertyArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(postLabAnalysisMethod20);
        org.junit.Assert.assertNull(analyticalGroupType22);
        org.junit.Assert.assertNull(analysisMethod27);
        org.junit.Assert.assertNull(analysisMethod29);
        org.junit.Assert.assertNull(analysisMethod30);
        org.junit.Assert.assertNull(analysisMethod32);
        org.junit.Assert.assertNull(analysisMethod33);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(analysisMethod38);
        org.junit.Assert.assertNull(analysisMethod39);
        org.junit.Assert.assertNull(analysisMethod41);
        org.junit.Assert.assertNull(analysisMethod43);
        org.junit.Assert.assertNull(analysisMethod44);
        org.junit.Assert.assertNotNull(analyticalGroupItemArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(analyticalGroup50);
        org.junit.Assert.assertNotNull(postLabAnalysisMethod54);
        org.junit.Assert.assertNotNull(postObservedProperty55);
        org.junit.Assert.assertNotNull(putSchedule56);
        org.junit.Assert.assertNull(offsetDateTime57);
    }

    @Test
    public void test00983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00983");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.TimeSeries timeSeries0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.TimeSeries();
        java.lang.String str1 = timeSeries0.ComputationIdentifier;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MetadataChangeTransactionListServiceRequest metadataChangeTransactionListServiceRequest2 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MetadataChangeTransactionListServiceRequest();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostRecurringReport postRecurringReport3 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostRecurringReport();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary4 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary();
        dischargeSummary4.Reviewer = "";
        java.time.Instant instant7 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        dischargeSummary4.MeasurementTime = instant7;
        postRecurringReport3.NextGenerationDate = instant7;
        java.time.Instant instant10 = postRecurringReport3.getNextGenerationDate();
        java.lang.String str11 = com.aquaticinformatics.aquarius.sdk.samples.serializers.InstantSerializer.format(instant10);
        metadataChangeTransactionListServiceRequest2.QueryFrom = instant10;
        java.time.Instant instant13 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MinValue;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MetadataChangeTransactionListServiceRequest metadataChangeTransactionListServiceRequest14 = metadataChangeTransactionListServiceRequest2.setQueryFrom(instant13);
        timeSeries0.LastModifiedTime = instant13;
        timeSeries0.Publish = false;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.StatisticalDateTimeOffset statisticalDateTimeOffset18 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.StatisticalDateTimeOffset();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostRecurringReport postRecurringReport19 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostRecurringReport();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary20 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary();
        dischargeSummary20.Reviewer = "";
        java.time.Instant instant23 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        dischargeSummary20.MeasurementTime = instant23;
        postRecurringReport19.NextGenerationDate = instant23;
        java.time.Instant instant26 = postRecurringReport19.getNextGenerationDate();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.StatisticalDateTimeOffset statisticalDateTimeOffset27 = statisticalDateTimeOffset18.setDateTimeOffset(instant26);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesDescription timeSeriesDescription28 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesDescription();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest timeAlignedDataServiceRequest29 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest();
        java.lang.Object obj30 = timeAlignedDataServiceRequest29.getResponseType();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse31 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse();
        java.time.Instant instant32 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse33 = locationDescriptionListServiceResponse31.setNextToken(instant32);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest timeAlignedDataServiceRequest34 = timeAlignedDataServiceRequest29.setQueryFrom(instant32);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesDescription timeSeriesDescription35 = timeSeriesDescription28.setRawStartTime(instant32);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.StatisticalDateTimeOffset statisticalDateTimeOffset36 = statisticalDateTimeOffset18.setDateTimeOffset(instant32);
        timeSeries0.LastModifiedTime = instant32;
        timeSeries0.ComputationIdentifier = "https";
        java.lang.Boolean boolean40 = timeSeries0.isPublish();
        timeSeries0.LocationUniqueId = "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSSSSSZZZZZ";
        timeSeries0.ComputationPeriodIdentifier = "http://MaxDurationhttp/json/reply/Integer";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "9999-12-31T23:59:59.999Z" + "'", str11, "9999-12-31T23:59:59.999Z");
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(metadataChangeTransactionListServiceRequest14);
        org.junit.Assert.assertNotNull(instant23);
        org.junit.Assert.assertNotNull(instant26);
        org.junit.Assert.assertNotNull(statisticalDateTimeOffset27);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeAlignedDataServiceResponse");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeAlignedDataServiceResponse");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeAlignedDataServiceResponse");
        org.junit.Assert.assertNotNull(instant32);
        org.junit.Assert.assertNotNull(locationDescriptionListServiceResponse33);
        org.junit.Assert.assertNotNull(timeAlignedDataServiceRequest34);
        org.junit.Assert.assertNotNull(timeSeriesDescription35);
        org.junit.Assert.assertNotNull(statisticalDateTimeOffset36);
        org.junit.Assert.assertEquals("'" + boolean40 + "' != '" + false + "'", boolean40, false);
    }

    @Test
    public void test00984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00984");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetChartDataV2 getChartDataV2_0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetChartDataV2();
        java.lang.String str1 = getChartDataV2_0.getActivityCustomId();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetChartDataV2 getChartDataV2_3 = getChartDataV2_0.setFilterId("");
        java.util.List<java.lang.String> strList4 = getChartDataV2_0.getIds();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetExtendedAttributeDropdownlistitems getExtendedAttributeDropdownlistitems5 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetExtendedAttributeDropdownlistitems();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_6 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.util.List<java.lang.String> strList7 = getObservationsV2_6.SamplingContextTagIds;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_8 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        getObservationsV2_8.SpecimenIds = strList11;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags14 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray18 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags21 = putLocationTags14.setTagUniqueIds(strList19);
        getObservationsV2_8.QualityControlTypes = strList19;
        getObservationsV2_6.ResultGrades = strList19;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetExtendedAttributeDropdownlistitems getExtendedAttributeDropdownlistitems24 = getExtendedAttributeDropdownlistitems5.setSearch((java.util.List<java.lang.String>) strList19);
        getChartDataV2_0.ObservedPropertyIds = strList19;
        getChartDataV2_0.SpecimenName = "MinDuration";
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetExportObservations getExportObservations28 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetExportObservations();
        java.util.List<java.lang.String> strList29 = getExportObservations28.getLabReportIds();
        java.lang.String str30 = getExportObservations28.DepthUnitCustomId;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetActivityTemplates getActivityTemplates31 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetActivityTemplates();
        java.lang.Object obj32 = getActivityTemplates31.getResponseType();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_33 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        getObservationsV2_33.SpecimenIds = strList36;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags39 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray43 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags46 = putLocationTags39.setTagUniqueIds(strList44);
        getObservationsV2_33.QualityControlTypes = strList44;
        getActivityTemplates31.Type = strList44;
        getExportObservations28.AnalyticalGroupIds = strList44;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetChartDataV2 getChartDataV2_50 = getChartDataV2_0.setAnalysisMethodIds((java.util.List<java.lang.String>) strList44);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_51 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.util.List<java.lang.String> strList52 = getObservationsV2_51.SamplingContextTagIds;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_53 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList56 = new java.util.ArrayList<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList56, strArray55);
        getObservationsV2_53.SpecimenIds = strList56;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags59 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray63 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList64 = new java.util.ArrayList<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList64, strArray63);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags66 = putLocationTags59.setTagUniqueIds(strList64);
        getObservationsV2_53.QualityControlTypes = strList64;
        getObservationsV2_51.ResultGrades = strList64;
        java.lang.Double double69 = getObservationsV2_51.getMinNumericResultValue();
        getObservationsV2_51.DetectionCondition = "https";
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemObservation importItemObservation72 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemObservation();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest timeAlignedDataServiceRequest73 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest();
        java.lang.Object obj74 = timeAlignedDataServiceRequest73.getResponseType();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse75 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse();
        java.time.Instant instant76 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse77 = locationDescriptionListServiceResponse75.setNextToken(instant76);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest timeAlignedDataServiceRequest78 = timeAlignedDataServiceRequest73.setQueryFrom(instant76);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags79 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray83 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList84 = new java.util.ArrayList<java.lang.String>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList84, strArray83);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags86 = putLocationTags79.setTagUniqueIds(strList84);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest timeAlignedDataServiceRequest87 = timeAlignedDataServiceRequest73.setTimeSeriesOutputUnitIds(strList84);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemObservation importItemObservation88 = importItemObservation72.setFields((java.util.List<java.lang.String>) strList84);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_89 = getObservationsV2_51.setSpecimenIds((java.util.List<java.lang.String>) strList84);
        getChartDataV2_0.SamplingLocationIds = strList84;
        java.util.List<java.lang.String> strList91 = getChartDataV2_0.SamplingLocationGroupIds;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(getChartDataV2_3);
        org.junit.Assert.assertNull(strList4);
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(putLocationTags21);
        org.junit.Assert.assertNotNull(getExtendedAttributeDropdownlistitems24);
        org.junit.Assert.assertNull(strList29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$SearchResultActivityTemplate");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$SearchResultActivityTemplate");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$SearchResultActivityTemplate");
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(putLocationTags46);
        org.junit.Assert.assertNotNull(getChartDataV2_50);
        org.junit.Assert.assertNull(strList52);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(putLocationTags66);
        org.junit.Assert.assertNull(double69);
        org.junit.Assert.assertNotNull(obj74);
        org.junit.Assert.assertEquals(obj74.toString(), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeAlignedDataServiceResponse");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj74), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeAlignedDataServiceResponse");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj74), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeAlignedDataServiceResponse");
        org.junit.Assert.assertNotNull(instant76);
        org.junit.Assert.assertNotNull(locationDescriptionListServiceResponse77);
        org.junit.Assert.assertNotNull(timeAlignedDataServiceRequest78);
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(putLocationTags86);
        org.junit.Assert.assertNotNull(timeAlignedDataServiceRequest87);
        org.junit.Assert.assertNotNull(importItemObservation88);
        org.junit.Assert.assertNotNull(getObservationsV2_89);
        org.junit.Assert.assertNull(strList91);
    }

    @Test
    public void test00985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00985");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Activity activity0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Activity();
        java.time.OffsetDateTime offsetDateTime1 = activity0.getStartTime();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Activity activity3 = activity0.setLoggerFileName("'.'SSSSSSS");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingLocation samplingLocation4 = activity0.SamplingLocation;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutActivity putActivity5 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutActivity();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PlannedActivity plannedActivity6 = putActivity5.PlannedActivity;
        java.time.OffsetDateTime offsetDateTime7 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutActivity putActivity8 = putActivity5.setEndTime(offsetDateTime7);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Device device9 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Device();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Device device11 = device9.setType("/AQUARIUS/Acquisition/v2");
        putActivity5.Device = device11;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Device device14 = device11.setDescription("9999-12-31T23:59:59.999Z");
        activity0.Device = device14;
        java.lang.String str16 = activity0.getLoggerFileName();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.CollectionMethod collectionMethod17 = activity0.getCollectionMethod();
        org.junit.Assert.assertNull(offsetDateTime1);
        org.junit.Assert.assertNotNull(activity3);
        org.junit.Assert.assertNull(samplingLocation4);
        org.junit.Assert.assertNull(plannedActivity6);
        org.junit.Assert.assertNotNull(putActivity8);
        org.junit.Assert.assertNotNull(device11);
        org.junit.Assert.assertNotNull(device14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "'.'SSSSSSS" + "'", str16, "'.'SSSSSSS");
        org.junit.Assert.assertNull(collectionMethod17);
    }

    @Test
    public void test00986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00986");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetExportObservations getExportObservations0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetExportObservations();
        java.util.List<java.lang.String> strList1 = getExportObservations0.getLabReportIds();
        java.lang.String str2 = getExportObservations0.DepthUnitCustomId;
        java.util.List<java.lang.String> strList3 = getExportObservations0.getSearch();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetChartDataV2 getChartDataV2_4 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetChartDataV2();
        java.lang.String str5 = getChartDataV2_4.getActivityCustomId();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetChartDataV2 getChartDataV2_7 = getChartDataV2_4.setFilterId("");
        java.util.List<java.lang.String> strList8 = getChartDataV2_4.getIds();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetExtendedAttributeDropdownlistitems getExtendedAttributeDropdownlistitems9 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetExtendedAttributeDropdownlistitems();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_10 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.util.List<java.lang.String> strList11 = getObservationsV2_10.SamplingContextTagIds;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_12 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        getObservationsV2_12.SpecimenIds = strList15;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags18 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray22 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags25 = putLocationTags18.setTagUniqueIds(strList23);
        getObservationsV2_12.QualityControlTypes = strList23;
        getObservationsV2_10.ResultGrades = strList23;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetExtendedAttributeDropdownlistitems getExtendedAttributeDropdownlistitems28 = getExtendedAttributeDropdownlistitems9.setSearch((java.util.List<java.lang.String>) strList23);
        getChartDataV2_4.ObservedPropertyIds = strList23;
        getChartDataV2_4.SpecimenName = "MinDuration";
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetExportObservations getExportObservations32 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetExportObservations();
        java.util.List<java.lang.String> strList33 = getExportObservations32.getLabReportIds();
        java.lang.String str34 = getExportObservations32.DepthUnitCustomId;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetActivityTemplates getActivityTemplates35 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetActivityTemplates();
        java.lang.Object obj36 = getActivityTemplates35.getResponseType();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_37 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        getObservationsV2_37.SpecimenIds = strList40;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags43 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray47 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList48 = new java.util.ArrayList<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList48, strArray47);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags50 = putLocationTags43.setTagUniqueIds(strList48);
        getObservationsV2_37.QualityControlTypes = strList48;
        getActivityTemplates35.Type = strList48;
        getExportObservations32.AnalyticalGroupIds = strList48;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetChartDataV2 getChartDataV2_54 = getChartDataV2_4.setAnalysisMethodIds((java.util.List<java.lang.String>) strList48);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetExportObservations getExportObservations55 = getExportObservations0.setAnalyticalGroupIds((java.util.List<java.lang.String>) strList48);
        java.lang.Integer int56 = getExportObservations0.getLimit();
        org.junit.Assert.assertNull(strList1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(getChartDataV2_7);
        org.junit.Assert.assertNull(strList8);
        org.junit.Assert.assertNull(strList11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(putLocationTags25);
        org.junit.Assert.assertNotNull(getExtendedAttributeDropdownlistitems28);
        org.junit.Assert.assertNull(strList33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertEquals(obj36.toString(), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$SearchResultActivityTemplate");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj36), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$SearchResultActivityTemplate");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj36), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$SearchResultActivityTemplate");
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(putLocationTags50);
        org.junit.Assert.assertNotNull(getChartDataV2_54);
        org.junit.Assert.assertNotNull(getExportObservations55);
        org.junit.Assert.assertNull(int56);
    }

    @Test
    public void test00987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00987");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.GetSensor getSensor0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.GetSensor();
        java.lang.String str1 = getSensor0.UniqueId;
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test00988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00988");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemObject importItemObject0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemObject();
        java.util.List<java.lang.String> strList1 = importItemObject0.getWarningMessages();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportChangeItem[] importChangeItemArray2 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportChangeItem[] {};
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportChangeItem> importChangeItemList3 = new java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportChangeItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportChangeItem>) importChangeItemList3, importChangeItemArray2);
        importItemObject0.ItemComparison = importChangeItemList3;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags6 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray10 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags13 = putLocationTags6.setTagUniqueIds(strList11);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemObject importItemObject14 = importItemObject0.setExistingItem((java.lang.Object) putLocationTags6);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.OpenIdConnectUser openIdConnectUser15 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.OpenIdConnectUser();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.OpenIdConnectUser openIdConnectUser17 = openIdConnectUser15.setIdentifier("");
        java.lang.Boolean boolean18 = openIdConnectUser17.CanConfigureSystem;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemObject importItemObject19 = importItemObject0.setErrors((java.lang.Object) openIdConnectUser17);
        java.lang.Object obj20 = importItemObject0.ExistingItem;
        java.lang.String str21 = importItemObject0.getInput();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemStatusType importItemStatusType22 = importItemObject0.Status;
        org.junit.Assert.assertNull(strList1);
        org.junit.Assert.assertNotNull(importChangeItemArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(putLocationTags13);
        org.junit.Assert.assertNotNull(importItemObject14);
        org.junit.Assert.assertNotNull(openIdConnectUser17);
        org.junit.Assert.assertNull(boolean18);
        org.junit.Assert.assertNotNull(importItemObject19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(importItemStatusType22);
    }

    @Test
    public void test00989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00989");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation observation0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PlannedFieldResult plannedFieldResult1 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation observation2 = observation0.setPlannedFieldResult(plannedFieldResult1);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabInstruction labInstruction3 = null;
        observation2.LabInstruction = labInstruction3;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.CollectionMethod collectionMethod5 = observation2.CollectionMethod;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.NullMeasureQualifier nullMeasureQualifier6 = null;
        observation2.NullMeasureQualifier = nullMeasureQualifier6;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Specimen specimen8 = observation2.getSpecimen();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Device device9 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Device();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation observation10 = observation2.setDevice(device9);
        java.lang.String str11 = observation2.Id;
        org.junit.Assert.assertNotNull(observation2);
        org.junit.Assert.assertNull(collectionMethod5);
        org.junit.Assert.assertNull(specimen8);
        org.junit.Assert.assertNotNull(observation10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00990");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostObservationV2 postObservationV2_0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostObservationV2();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabInstruction labInstruction1 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostObservationV2 postObservationV2_2 = postObservationV2_0.setLabInstruction(labInstruction1);
        java.lang.String str3 = postObservationV2_2.MediumSubdivision;
        java.lang.String str4 = postObservationV2_2.getComment();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DataClassificationType dataClassificationType5 = com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DataClassificationType.FIELD_RESULT;
        postObservationV2_2.DataClassification = dataClassificationType5;
        java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportHistoryEventSimple> importHistoryEventSimpleList7 = postObservationV2_2.ImportHistoryEventSimples;
        org.junit.Assert.assertNotNull(postObservationV2_2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + dataClassificationType5 + "' != '" + com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DataClassificationType.FIELD_RESULT + "'", dataClassificationType5.equals(com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DataClassificationType.FIELD_RESULT));
        org.junit.Assert.assertNull(importHistoryEventSimpleList7);
    }

    @Test
    public void test00991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00991");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutFieldVisit putFieldVisit0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutFieldVisit();
        putFieldVisit0.Notes = "MinDuration";
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ProjectSimple projectSimple3 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutFieldVisit putFieldVisit4 = putFieldVisit0.setProject(projectSimple3);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutFieldVisit putFieldVisit6 = putFieldVisit4.setId("/AQUARIUS/Provisioning/v1");
        java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment> domainObjectAttachmentList7 = putFieldVisit6.getAttachments();
        org.junit.Assert.assertNotNull(putFieldVisit4);
        org.junit.Assert.assertNotNull(putFieldVisit6);
        org.junit.Assert.assertNull(domainObjectAttachmentList7);
    }

    @Test
    public void test00992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00992");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.PointVelocityDischargeActivity pointVelocityDischargeActivity0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.PointVelocityDischargeActivity();
        java.lang.String str1 = pointVelocityDischargeActivity0.getModel();
        java.lang.String str2 = pointVelocityDischargeActivity0.getFirmwareVersion();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.QuantityWithDisplay quantityWithDisplay3 = null;
        pointVelocityDischargeActivity0.Width = quantityWithDisplay3;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.StartPointType startPointType5 = null;
        pointVelocityDischargeActivity0.StartPoint = startPointType5;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.PointVelocityDischargeActivity pointVelocityDischargeActivity8 = pointVelocityDischargeActivity0.setHorizontalCoefficientUsed((java.lang.Boolean) false);
        java.lang.String str9 = pointVelocityDischargeActivity0.getMeterEquation();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.PointVelocityDischargeActivity pointVelocityDischargeActivity11 = pointVelocityDischargeActivity0.setSuspensionWeight("/AQUARIUS/Acquisition/v2://9999-12-31T23:59:59.999Z");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeChannelMeasurement dischargeChannelMeasurement12 = pointVelocityDischargeActivity0.DischargeChannelMeasurement;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(pointVelocityDischargeActivity8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(pointVelocityDischargeActivity11);
        org.junit.Assert.assertNull(dischargeChannelMeasurement12);
    }

    @Test
    public void test00993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00993");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.NameTag nameTag0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.NameTag();
        java.lang.String str1 = nameTag0.UniqueId;
        java.lang.String str2 = nameTag0.UniqueId;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00994");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.GapToleranceOperation gapToleranceOperation0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.GapToleranceOperation();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MetadataChangeOperationType metadataChangeOperationType1 = gapToleranceOperation0.OperationType;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitDataServiceResponse fieldVisitDataServiceResponse2 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitDataServiceResponse();
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CrossSectionSurveyActivity> crossSectionSurveyActivityList3 = fieldVisitDataServiceResponse2.CrossSectionSurveyActivity;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitDataServiceResponse fieldVisitDataServiceResponse5 = fieldVisitDataServiceResponse2.setIdentifier("");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary6 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary();
        dischargeSummary6.Reviewer = "";
        java.time.Instant instant9 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        dischargeSummary6.MeasurementTime = instant9;
        fieldVisitDataServiceResponse2.ResponseTime = instant9;
        gapToleranceOperation0.DateAppliedUtc = instant9;
        gapToleranceOperation0.User = "hi!";
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MonitoringMethodListServiceResponse monitoringMethodListServiceResponse15 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MonitoringMethodListServiceResponse();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CalibrationCheck calibrationCheck16 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CalibrationCheck();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CalibrationCheckType calibrationCheckType17 = calibrationCheck16.getCalibrationCheckType();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DoubleWithDisplay doubleWithDisplay18 = calibrationCheck16.Value;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse19 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary20 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary22 = dischargeSummary20.setPublish((java.lang.Boolean) false);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse23 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse();
        java.time.Instant instant24 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse25 = locationDescriptionListServiceResponse23.setNextToken(instant24);
        dischargeSummary20.MeasurementTime = instant24;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse27 = locationDescriptionListServiceResponse19.setNextToken(instant24);
        java.time.Instant instant28 = locationDescriptionListServiceResponse19.getNextToken();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CalibrationCheck calibrationCheck29 = calibrationCheck16.setTime(instant28);
        monitoringMethodListServiceResponse15.ResponseTime = instant28;
        gapToleranceOperation0.DateAppliedUtc = instant28;
        org.junit.Assert.assertNull(metadataChangeOperationType1);
        org.junit.Assert.assertNull(crossSectionSurveyActivityList3);
        org.junit.Assert.assertNotNull(fieldVisitDataServiceResponse5);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertNull(calibrationCheckType17);
        org.junit.Assert.assertNull(doubleWithDisplay18);
        org.junit.Assert.assertNotNull(dischargeSummary22);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertNotNull(locationDescriptionListServiceResponse25);
        org.junit.Assert.assertNotNull(locationDescriptionListServiceResponse27);
        org.junit.Assert.assertNotNull(instant28);
        org.junit.Assert.assertNotNull(calibrationCheck29);
    }

    @Test
    public void test00995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00995");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingLocation samplingLocation0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingLocation();
        java.lang.String str1 = samplingLocation0.Description;
        java.lang.String str2 = samplingLocation0.VerticalCollectionMethod;
        java.lang.String str3 = samplingLocation0.getLongitude();
        java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingLocationGroup> samplingLocationGroupList4 = samplingLocation0.getSamplingLocationGroups();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(samplingLocationGroupList4);
    }

    @Test
    public void test00996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00996");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.RoleFlattened roleFlattened0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.RoleFlattened();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.RoleFlattenedBase roleFlattenedBase2 = roleFlattened0.setCanEditAppendConfigurations((java.lang.Boolean) false);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.RoleFlattenedBase roleFlattenedBase4 = roleFlattenedBase2.setName("");
        java.lang.String str5 = roleFlattenedBase4.Name;
        roleFlattenedBase4.CanReadData = false;
        org.junit.Assert.assertNotNull(roleFlattenedBase2);
        org.junit.Assert.assertNotNull(roleFlattenedBase4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test00997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00997");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ActivityType activityType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ActivityType.DischargePointVelocity;
        org.junit.Assert.assertTrue("'" + activityType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ActivityType.DischargePointVelocity + "'", activityType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ActivityType.DischargePointVelocity));
    }

    @Test
    public void test00998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00998");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Reading reading0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Reading();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DoubleWithDisplay doubleWithDisplay1 = reading0.getValue();
        reading0.ReferencePointUniqueId = "hi!";
        java.lang.String str4 = reading0.Parameter;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary5 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary7 = dischargeSummary5.setPublish((java.lang.Boolean) false);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DoubleWithDisplay doubleWithDisplay8 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DoubleWithDisplay();
        dischargeSummary7.DifferenceDuringVisit = doubleWithDisplay8;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DoubleWithDisplay doubleWithDisplay11 = doubleWithDisplay8.setNumeric((java.lang.Double) 100.0d);
        reading0.Value = doubleWithDisplay11;
        java.lang.Boolean boolean13 = reading0.isPublish();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Reading reading15 = reading0.setParameterId("/AQUARIUS/Acquisition/v2://9999-12-31T23:59:59.999Z");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ReadingType readingType16 = reading15.ReadingType;
        java.lang.String str17 = reading15.getUnit();
        java.lang.String str18 = reading15.Parameter;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Reading reading20 = reading15.setGradeCode((java.lang.Integer) 1);
        reading15.Manufacturer = "9999-12-31T23:59:59.999Z";
        org.junit.Assert.assertNull(doubleWithDisplay1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(dischargeSummary7);
        org.junit.Assert.assertNotNull(doubleWithDisplay11);
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertNotNull(reading15);
        org.junit.Assert.assertNull(readingType16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(reading20);
    }

    @Test
    public void test00999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00999");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Attachment attachment0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Attachment();
        java.lang.String str1 = attachment0.getUrl();
        java.lang.String str2 = attachment0.FileName;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutBulkEditResultGradesV2 putBulkEditResultGradesV2_3 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutBulkEditResultGradesV2();
        java.lang.Double double4 = putBulkEditResultGradesV2_3.DepthValue;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_5 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        getObservationsV2_5.SpecimenIds = strList8;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags11 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray15 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags18 = putLocationTags11.setTagUniqueIds(strList16);
        getObservationsV2_5.QualityControlTypes = strList16;
        java.util.List<java.lang.String> strList20 = getObservationsV2_5.getAnalyticalGroupIds();
        java.util.List<java.lang.String> strList21 = getObservationsV2_5.DataClassifications;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.FieldResultType fieldResultType22 = getObservationsV2_5.FieldResultType;
        java.time.Instant instant23 = getObservationsV2_5.getEndObservedTime();
        java.lang.String str24 = getObservationsV2_5.DepthUnitCustomId;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags25 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray29 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags32 = putLocationTags25.setTagUniqueIds(strList30);
        java.util.ArrayList<java.lang.String> strList33 = putLocationTags32.TagUniqueIds;
        getObservationsV2_5.ProjectIds = strList33;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutBulkEditResultGradesV2 putBulkEditResultGradesV2_35 = putBulkEditResultGradesV2_3.setSearch((java.util.List<java.lang.String>) strList33);
        java.util.List<java.lang.String> strList36 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutBulkEditResultGradesV2 putBulkEditResultGradesV2_37 = putBulkEditResultGradesV2_35.setLabResultLaboratoryIds(strList36);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CalibrationCheck calibrationCheck38 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CalibrationCheck();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CalibrationCheckType calibrationCheckType39 = calibrationCheck38.getCalibrationCheckType();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DoubleWithDisplay doubleWithDisplay40 = calibrationCheck38.Value;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse41 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary42 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary44 = dischargeSummary42.setPublish((java.lang.Boolean) false);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse45 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse();
        java.time.Instant instant46 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse47 = locationDescriptionListServiceResponse45.setNextToken(instant46);
        dischargeSummary42.MeasurementTime = instant46;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse49 = locationDescriptionListServiceResponse41.setNextToken(instant46);
        java.time.Instant instant50 = locationDescriptionListServiceResponse41.getNextToken();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CalibrationCheck calibrationCheck51 = calibrationCheck38.setTime(instant50);
        putBulkEditResultGradesV2_37.StartResultTime = instant50;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Attachment attachment53 = attachment0.setDateUploaded(instant50);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.AttachmentCategory attachmentCategory54 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.AttachmentCategory.Unknown;
        attachment0.AttachmentCategory = attachmentCategory54;
        java.lang.Double double56 = attachment0.getGpsLongitude();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(double4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(putLocationTags18);
        org.junit.Assert.assertNull(strList20);
        org.junit.Assert.assertNull(strList21);
        org.junit.Assert.assertNull(fieldResultType22);
        org.junit.Assert.assertNull(instant23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(putLocationTags32);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertNotNull(putBulkEditResultGradesV2_35);
        org.junit.Assert.assertNotNull(putBulkEditResultGradesV2_37);
        org.junit.Assert.assertNull(calibrationCheckType39);
        org.junit.Assert.assertNull(doubleWithDisplay40);
        org.junit.Assert.assertNotNull(dischargeSummary44);
        org.junit.Assert.assertNotNull(instant46);
        org.junit.Assert.assertNotNull(locationDescriptionListServiceResponse47);
        org.junit.Assert.assertNotNull(locationDescriptionListServiceResponse49);
        org.junit.Assert.assertNotNull(instant50);
        org.junit.Assert.assertNotNull(calibrationCheck51);
        org.junit.Assert.assertNotNull(attachment53);
        org.junit.Assert.assertTrue("'" + attachmentCategory54 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.AttachmentCategory.Unknown + "'", attachmentCategory54.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.AttachmentCategory.Unknown));
        org.junit.Assert.assertNull(double56);
    }

    @Test
    public void test01000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test01000");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ReferencePointBase referencePointBase0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ReferencePointBase();
        java.lang.Double double1 = referencePointBase0.Longitude;
        java.lang.Double double2 = referencePointBase0.getLatitude();
        java.lang.String str3 = referencePointBase0.Description;
        org.junit.Assert.assertNull(double1);
        org.junit.Assert.assertNull(double2);
        org.junit.Assert.assertNull(str3);
    }
}

