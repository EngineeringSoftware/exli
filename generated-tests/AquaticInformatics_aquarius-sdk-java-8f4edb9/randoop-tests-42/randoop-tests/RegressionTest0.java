import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test00001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00001");
        boolean boolean1 = net.servicestack.client.JsonServiceClient.hasRequestBody("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ActivityType activityType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ActivityType.Attachment;
        org.junit.Assert.assertTrue("'" + activityType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ActivityType.Attachment + "'", activityType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ActivityType.Attachment));
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ThresholdSuppressionOption thresholdSuppressionOption0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ThresholdSuppressionOption.On;
        org.junit.Assert.assertTrue("'" + thresholdSuppressionOption0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ThresholdSuppressionOption.On + "'", thresholdSuppressionOption0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ThresholdSuppressionOption.On));
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ActivityWithDetailsType activityWithDetailsType0 = com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ActivityWithDetailsType.NONE;
        org.junit.Assert.assertTrue("'" + activityWithDetailsType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ActivityWithDetailsType.NONE + "'", activityWithDetailsType0.equals(com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ActivityWithDetailsType.NONE));
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CurrentMeterType currentMeterType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CurrentMeterType.UpwardLookingAdvm;
        org.junit.Assert.assertTrue("'" + currentMeterType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CurrentMeterType.UpwardLookingAdvm + "'", currentMeterType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CurrentMeterType.UpwardLookingAdvm));
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        java.lang.String str0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.IPostTimeSeriesRequest.LocationUniqueId;
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ReasonForAdjustmentType reasonForAdjustmentType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ReasonForAdjustmentType.AdjustedForStorage;
        org.junit.Assert.assertTrue("'" + reasonForAdjustmentType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ReasonForAdjustmentType.AdjustedForStorage + "'", reasonForAdjustmentType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ReasonForAdjustmentType.AdjustedForStorage));
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        java.lang.Boolean boolean0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.IFieldVisitDataRequest.IncludeCrossSectionSurveyProfile;
        org.junit.Assert.assertNull(boolean0);
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ActivityType activityType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ActivityType.CrossSectionSurvey;
        org.junit.Assert.assertTrue("'" + activityType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ActivityType.CrossSectionSurvey + "'", activityType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ActivityType.CrossSectionSurvey));
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitApproval fieldVisitApproval0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.IFieldVisitData.Approval;
        org.junit.Assert.assertNull(fieldVisitApproval0);
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        java.lang.Boolean boolean0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.IFieldVisitDataRequest.IncludeVerticals;
        org.junit.Assert.assertNull(boolean0);
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CorrectionType correctionType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CorrectionType.FillGaps;
        org.junit.Assert.assertTrue("'" + correctionType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CorrectionType.FillGaps + "'", correctionType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CorrectionType.FillGaps));
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ChannelMaterialType channelMaterialType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ChannelMaterialType.BedrockLedgeArtificial;
        org.junit.Assert.assertTrue("'" + channelMaterialType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ChannelMaterialType.BedrockLedgeArtificial + "'", channelMaterialType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ChannelMaterialType.BedrockLedgeArtificial));
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.StringCategoricalResult stringCategoricalResult0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.StringCategoricalResult();
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.AttachmentType attachmentType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.AttachmentType.Text;
        org.junit.Assert.assertTrue("'" + attachmentType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.AttachmentType.Text + "'", attachmentType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.AttachmentType.Text));
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ExtendedAttributeApplicability extendedAttributeApplicability0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ExtendedAttributeApplicability.AppliesToLocations;
        org.junit.Assert.assertTrue("'" + extendedAttributeApplicability0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ExtendedAttributeApplicability.AppliesToLocations + "'", extendedAttributeApplicability0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ExtendedAttributeApplicability.AppliesToLocations));
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Acquisition.AttachmentType attachmentType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Acquisition.AttachmentType.HistoricalSwami;
        org.junit.Assert.assertTrue("'" + attachmentType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Acquisition.AttachmentType.HistoricalSwami + "'", attachmentType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Acquisition.AttachmentType.HistoricalSwami));
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ActivityType activityType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ActivityType.DischargeEngineeredStructure;
        org.junit.Assert.assertTrue("'" + activityType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ActivityType.DischargeEngineeredStructure + "'", activityType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ActivityType.DischargeEngineeredStructure));
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.InspectionType inspectionType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.InspectionType.CrestStageGage;
        org.junit.Assert.assertTrue("'" + inspectionType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.InspectionType.CrestStageGage + "'", inspectionType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.InspectionType.CrestStageGage));
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        java.lang.String str0 = com.aquaticinformatics.aquarius.sdk.timeseries.EndPoints.ACQUISITIONV2;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "/AQUARIUS/Acquisition/v2" + "'", str0, "/AQUARIUS/Acquisition/v2");
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.AttachmentCategory attachmentCategory0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.AttachmentCategory.InventoryControl;
        org.junit.Assert.assertTrue("'" + attachmentCategory0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.AttachmentCategory.InventoryControl + "'", attachmentCategory0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.AttachmentCategory.InventoryControl));
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReadingType fieldVisitReadingType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReadingType.Unknown;
        org.junit.Assert.assertTrue("'" + fieldVisitReadingType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReadingType.Unknown + "'", fieldVisitReadingType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReadingType.Unknown));
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        java.lang.String str0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.IQualityCodeRequest.Description;
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CurrentMeterType currentMeterType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CurrentMeterType.SidewaysLookingAdvm;
        org.junit.Assert.assertTrue("'" + currentMeterType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CurrentMeterType.SidewaysLookingAdvm + "'", currentMeterType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CurrentMeterType.SidewaysLookingAdvm));
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.QualitativeUncertaintyType qualitativeUncertaintyType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.QualitativeUncertaintyType.Unknown;
        org.junit.Assert.assertTrue("'" + qualitativeUncertaintyType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.QualitativeUncertaintyType.Unknown + "'", qualitativeUncertaintyType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.QualitativeUncertaintyType.Unknown));
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PlannedActivityActivityType plannedActivityActivityType0 = com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PlannedActivityActivityType.SAMPLE_INTEGRATED_VERTICAL_PROFILE;
        org.junit.Assert.assertTrue("'" + plannedActivityActivityType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PlannedActivityActivityType.SAMPLE_INTEGRATED_VERTICAL_PROFILE + "'", plannedActivityActivityType0.equals(com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PlannedActivityActivityType.SAMPLE_INTEGRATED_VERTICAL_PROFILE));
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostTag postTag0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostTag();
        java.lang.String str1 = postTag0.Key;
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        java.util.function.Supplier<com.aquaticinformatics.aquarius.sdk.samples.IPaginatedResponse<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DeleteFieldTrip>> deleteFieldTripIPaginatedResponseSupplier1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.aquaticinformatics.aquarius.sdk.samples.LazyResult<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DeleteFieldTrip> deleteFieldTripItor2 = new com.aquaticinformatics.aquarius.sdk.samples.LazyResult<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DeleteFieldTrip>(strConsumer0, deleteFieldTripIPaginatedResponseSupplier1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ChannelEvennessType channelEvennessType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ChannelEvennessType.Uneven;
        org.junit.Assert.assertTrue("'" + channelEvennessType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ChannelEvennessType.Uneven + "'", channelEvennessType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ChannelEvennessType.Uneven));
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        java.lang.String str0 = com.aquaticinformatics.aquarius.sdk.samples.serializers.InstantDeserializer.JsonMaxValue;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "MaxInstant" + "'", str0, "MaxInstant");
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        java.lang.String str0 = com.aquaticinformatics.aquarius.sdk.samples.serializers.InstantDeserializer.JsonMaxConcreteValue;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "9999-12-31T23:59:59.999Z" + "'", str0, "9999-12-31T23:59:59.999Z");
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DeterminationType determinationType0 = com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DeterminationType.BLANK_CORRECTED_CALCULATED;
        org.junit.Assert.assertTrue("'" + determinationType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DeterminationType.BLANK_CORRECTED_CALCULATED + "'", determinationType0.equals(com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DeterminationType.BLANK_CORRECTED_CALCULATED));
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Acquisition.AttachmentType attachmentType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Acquisition.AttachmentType.FieldDataPlugin;
        org.junit.Assert.assertTrue("'" + attachmentType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Acquisition.AttachmentType.FieldDataPlugin + "'", attachmentType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Acquisition.AttachmentType.FieldDataPlugin));
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Acquisition.AttachmentType attachmentType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Acquisition.AttachmentType.Binary;
        org.junit.Assert.assertTrue("'" + attachmentType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Acquisition.AttachmentType.Binary + "'", attachmentType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Acquisition.AttachmentType.Binary));
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CurrentMeterType currentMeterType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CurrentMeterType.PriceAa;
        org.junit.Assert.assertTrue("'" + currentMeterType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CurrentMeterType.PriceAa + "'", currentMeterType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CurrentMeterType.PriceAa));
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        java.lang.String str0 = com.aquaticinformatics.aquarius.sdk.samples.serializers.InstantDeserializer.Pattern;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ" + "'", str0, "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ");
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        java.lang.String str0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.IPostTimeSeriesRequest.ComputationPeriodIdentifier;
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        java.util.function.Supplier<com.aquaticinformatics.aquarius.sdk.samples.IPaginatedResponse<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.RatingShift>> ratingShiftIPaginatedResponseSupplier1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.aquaticinformatics.aquarius.sdk.samples.LazyResult<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.RatingShift> ratingShiftItor2 = new com.aquaticinformatics.aquarius.sdk.samples.LazyResult<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.RatingShift>(strConsumer0, ratingShiftIPaginatedResponseSupplier1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        java.lang.String str2 = com.aquaticinformatics.aquarius.sdk.helpers.SdkServiceClient.resolveServerWithDefaultScheme("9999-12-31T23:59:59.999Z", "/AQUARIUS/Acquisition/v2");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/AQUARIUS/Acquisition/v2://9999-12-31T23:59:59.999Z" + "'", str2, "/AQUARIUS/Acquisition/v2://9999-12-31T23:59:59.999Z");
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.TagApplicability tagApplicability0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.TagApplicability.AppliesToSensorsGauges;
        org.junit.Assert.assertTrue("'" + tagApplicability0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.TagApplicability.AppliesToSensorsGauges + "'", tagApplicability0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.TagApplicability.AppliesToSensorsGauges));
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        java.lang.String str0 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.FractionalSecondsPattern;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "'.'SSSSSSS" + "'", str0, "'.'SSSSSSS");
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.TemporalExpressionType temporalExpressionType0 = com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.TemporalExpressionType.FIRST_WEEK_OF_MONTH;
        org.junit.Assert.assertTrue("'" + temporalExpressionType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.TemporalExpressionType.FIRST_WEEK_OF_MONTH + "'", temporalExpressionType0.equals(com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.TemporalExpressionType.FIRST_WEEK_OF_MONTH));
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        // The following exception was thrown during execution in test generation
        try {
            com.aquaticinformatics.aquarius.sdk.timeseries.AquariusClient aquariusClient3 = com.aquaticinformatics.aquarius.sdk.timeseries.AquariusClient.createConnectedClient("9999-12-31T23:59:59.999Z", "MaxInstant", "'.'SSSSSSS");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.net.MalformedURLException: For input string: \"59:59.999Z\"");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.AttachmentCategory attachmentCategory0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.AttachmentCategory.Site;
        org.junit.Assert.assertTrue("'" + attachmentCategory0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.AttachmentCategory.Site + "'", attachmentCategory0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.AttachmentCategory.Site));
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ActivityType activityType0 = com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ActivityType.OTHER_QC;
        org.junit.Assert.assertTrue("'" + activityType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ActivityType.OTHER_QC + "'", activityType0.equals(com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ActivityType.OTHER_QC));
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = com.aquaticinformatics.aquarius.sdk.samples.serializers.InstantDeserializer.FORMATTER;
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.FORMATTER;
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        java.lang.Integer int0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.IStackPositionMetadataOperation.StackPosition;
        org.junit.Assert.assertNull(int0);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Current current0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Current();
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CurrentMeterType currentMeterType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CurrentMeterType.Unspecified;
        org.junit.Assert.assertTrue("'" + currentMeterType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CurrentMeterType.Unspecified + "'", currentMeterType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CurrentMeterType.Unspecified));
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        java.lang.String str0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.IPostTimeSeriesRequest.Comment;
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutComputationPeriod putComputationPeriod0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutComputationPeriod();
        java.lang.String str1 = putComputationPeriod0.PublicIdentifier;
        putComputationPeriod0.DisplayName = "";
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        net.servicestack.client.ExceptionFilter exceptionFilter0 = null;
        net.servicestack.client.JsonServiceClient.GlobalExceptionFilter = exceptionFilter0;
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.AdjustmentType adjustmentType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.AdjustmentType.Percentage;
        org.junit.Assert.assertTrue("'" + adjustmentType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.AdjustmentType.Percentage + "'", adjustmentType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.AdjustmentType.Percentage));
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        java.lang.String str0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.IPostTimeSeriesRequest.Unit;
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ActivityType activityType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ActivityType.LevelSurvey;
        org.junit.Assert.assertTrue("'" + activityType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ActivityType.LevelSurvey + "'", activityType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ActivityType.LevelSurvey));
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostDatumConvertedTimeSeries postDatumConvertedTimeSeries0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostDatumConvertedTimeSeries();
        postDatumConvertedTimeSeries0.SourceIsLocalAssumedDatum = false;
        java.lang.String str3 = postDatumConvertedTimeSeries0.getComputationIdentifier();
        java.lang.Boolean boolean4 = postDatumConvertedTimeSeries0.isTargetIsLocalAssumedDatum();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.PointVelocityObservationType pointVelocityObservationType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.PointVelocityObservationType.OneAtPointFive;
        org.junit.Assert.assertTrue("'" + pointVelocityObservationType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.PointVelocityObservationType.OneAtPointFive + "'", pointVelocityObservationType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.PointVelocityObservationType.OneAtPointFive));
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeterSuspensionType meterSuspensionType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeterSuspensionType.PackReel;
        org.junit.Assert.assertTrue("'" + meterSuspensionType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeterSuspensionType.PackReel + "'", meterSuspensionType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeterSuspensionType.PackReel));
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CurrentMeterType currentMeterType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CurrentMeterType.UltrasonicMeter;
        org.junit.Assert.assertTrue("'" + currentMeterType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CurrentMeterType.UltrasonicMeter + "'", currentMeterType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CurrentMeterType.UltrasonicMeter));
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        java.lang.String str0 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.Pattern;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSSSSSZZZZZ" + "'", str0, "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSSSSSZZZZZ");
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.RatingCurveType ratingCurveType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.RatingCurveType.StandardEquation;
        org.junit.Assert.assertTrue("'" + ratingCurveType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.RatingCurveType.StandardEquation + "'", ratingCurveType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.RatingCurveType.StandardEquation));
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostObservedProperty postObservedProperty0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostObservedProperty();
        java.lang.String str1 = postObservedProperty0.getCasNumber();
        postObservedProperty0.CustomId = "hi!";
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate specimenTemplate0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate();
        java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabInstructionTemplate> labInstructionTemplateList1 = specimenTemplate0.LabInstructionTemplates;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalyticalGroup analyticalGroup2 = specimenTemplate0.AnalyticalGroup;
        org.junit.Assert.assertNull(labInstructionTemplateList1);
        org.junit.Assert.assertNull(analyticalGroup2);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemObject importItemObject0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemObject();
        java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportChangeItem> importChangeItemList1 = importItemObject0.getItemComparison();
        org.junit.Assert.assertNull(importChangeItemList1);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CorrectionType correctionType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CorrectionType.CopyPaste;
        org.junit.Assert.assertTrue("'" + correctionType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CorrectionType.CopyPaste + "'", correctionType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CorrectionType.CopyPaste));
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Acquisition.DeleteSession deleteSession0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Acquisition.DeleteSession();
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.DeleteQualityCode deleteQualityCode0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.DeleteQualityCode();
        java.lang.Integer int1 = deleteQualityCode0.getGradeCode();
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.PublishServiceResponse publishServiceResponse0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.PublishServiceResponse();
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeterSuspensionType meterSuspensionType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeterSuspensionType.TetheredBoat;
        org.junit.Assert.assertTrue("'" + meterSuspensionType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeterSuspensionType.TetheredBoat + "'", meterSuspensionType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeterSuspensionType.TetheredBoat));
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.RoleFlattened roleFlattened0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.RoleFlattened();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.RoleFlattenedBase roleFlattenedBase2 = roleFlattened0.setCanEditAppendConfigurations((java.lang.Boolean) false);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.RoleFlattenedBase roleFlattenedBase4 = roleFlattenedBase2.setName("");
        java.lang.Boolean boolean5 = roleFlattenedBase4.CanEditAppendConfigurations;
        org.junit.Assert.assertNotNull(roleFlattenedBase2);
        org.junit.Assert.assertNotNull(roleFlattenedBase4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + false + "'", boolean5, false);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.AttachmentType attachmentType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.AttachmentType.Image;
        org.junit.Assert.assertTrue("'" + attachmentType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.AttachmentType.Image + "'", attachmentType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.AttachmentType.Image));
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetSchedule getSchedule0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetSchedule();
        java.lang.String str1 = getSchedule0.Id;
        getSchedule0.Id = "'.'SSSSSSS";
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagApplicability tagApplicability0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagApplicability.AppliesToLocationNotes;
        org.junit.Assert.assertTrue("'" + tagApplicability0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagApplicability.AppliesToLocationNotes + "'", tagApplicability0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagApplicability.AppliesToLocationNotes));
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DeleteSession deleteSession0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DeleteSession();
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        java.lang.String str0 = com.aquaticinformatics.aquarius.sdk.helpers.SdkServiceClient.HttpsScheme;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "https" + "'", str0, "https");
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        java.lang.String str0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.IOpenIdConnectUserAuth.SubjectIdentifier;
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationDatumPeriod locationDatumPeriod0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationDatumPeriod();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationDatumPeriodBase locationDatumPeriodBase2 = locationDatumPeriod0.setComment("'.'SSSSSSS");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationDatumPeriodBase locationDatumPeriodBase4 = locationDatumPeriod0.setComment("hi!");
        locationDatumPeriodBase4.Elevation = 10.0d;
        org.junit.Assert.assertNotNull(locationDatumPeriodBase2);
        org.junit.Assert.assertNotNull(locationDatumPeriodBase4);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        java.lang.String str0 = com.aquaticinformatics.aquarius.sdk.timeseries.EndPoints.PROVISIONING;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "/AQUARIUS/Provisioning/v1" + "'", str0, "/AQUARIUS/Provisioning/v1");
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutQualifierGroup putQualifierGroup0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutQualifierGroup();
        putQualifierGroup0.Identifier = "";
        java.lang.Object obj3 = putQualifierGroup0.getResponseType();
        java.lang.Object obj4 = putQualifierGroup0.getResponseType();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning$QualifierGroupResponse");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning$QualifierGroupResponse");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning$QualifierGroupResponse");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning$QualifierGroupResponse");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning$QualifierGroupResponse");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning$QualifierGroupResponse");
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.TagValueType tagValueType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.TagValueType.None;
        org.junit.Assert.assertTrue("'" + tagValueType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.TagValueType.None + "'", tagValueType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.TagValueType.None));
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Acquisition.AttachmentType attachmentType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Acquisition.AttachmentType.Text;
        org.junit.Assert.assertTrue("'" + attachmentType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Acquisition.AttachmentType.Text + "'", attachmentType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Acquisition.AttachmentType.Text));
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetLabReportImportHistoryEvents getLabReportImportHistoryEvents0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetLabReportImportHistoryEvents();
        java.lang.String str1 = getLabReportImportHistoryEvents0.Sort;
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostDatumConvertedTimeSeries postDatumConvertedTimeSeries0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostDatumConvertedTimeSeries();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostDatumConvertedTimeSeries postDatumConvertedTimeSeries2 = postDatumConvertedTimeSeries0.setDescription("yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ");
        postDatumConvertedTimeSeries0.Publish = false;
        postDatumConvertedTimeSeries0.SubLocationIdentifier = "";
        org.junit.Assert.assertNotNull(postDatumConvertedTimeSeries2);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CalibrationCheckType calibrationCheckType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CalibrationCheckType.CheckbarAsChanged;
        org.junit.Assert.assertTrue("'" + calibrationCheckType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CalibrationCheckType.CheckbarAsChanged + "'", calibrationCheckType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CalibrationCheckType.CheckbarAsChanged));
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        java.lang.Boolean boolean0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.IFieldVisitDataRequest.IncludeNodeDetails;
        org.junit.Assert.assertNull(boolean0);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        java.lang.String str0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.IPostTimeSeriesRequest.Label;
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CurrentMeterType currentMeterType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CurrentMeterType.Estimated;
        org.junit.Assert.assertTrue("'" + currentMeterType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CurrentMeterType.Estimated + "'", currentMeterType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CurrentMeterType.Estimated));
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservationImportSummary observationImportSummary0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservationImportSummary();
        observationImportSummary0.UpdateCount = (-1);
        java.lang.String str3 = observationImportSummary0.getSummaryReportText();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Method method0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Method();
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.GetCodeTableBase getCodeTableBase0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.GetCodeTableBase();
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutProject putProject0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutProject();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutProject putProject2 = putProject0.setScopeStatement("yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ");
        java.time.OffsetDateTime offsetDateTime3 = putProject0.StartTime;
        org.junit.Assert.assertNotNull(putProject2);
        org.junit.Assert.assertNull(offsetDateTime3);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        java.lang.String str0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.IFieldVisitDataRequest.ConvertToStandardReferenceDatum;
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        // The following exception was thrown during execution in test generation
        try {
            java.time.Instant instant1 = com.aquaticinformatics.aquarius.sdk.samples.serializers.InstantDeserializer.parse("");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutTag putTag0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutTag();
        java.lang.String str1 = putTag0.Name;
        java.lang.String str2 = putTag0.getDescription();
        java.lang.Object obj3 = putTag0.getResponseType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$SamplingContextTag");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$SamplingContextTag");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$SamplingContextTag");
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.FixedValueCategoricalResult fixedValueCategoricalResult0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.FixedValueCategoricalResult();
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostSensor postSensor0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostSensor();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.SensorBase sensorBase2 = postSensor0.setName("");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.SensorBase sensorBase4 = sensorBase2.setManufacturer("hi!");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.SensorBase sensorBase6 = sensorBase2.setParameterId("yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ");
        sensorBase6.Manufacturer = "/AQUARIUS/Acquisition/v2://9999-12-31T23:59:59.999Z";
        org.junit.Assert.assertNotNull(sensorBase2);
        org.junit.Assert.assertNotNull(sensorBase4);
        org.junit.Assert.assertNotNull(sensorBase6);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_6 = getObservationsV2_0.setDataClassifications((java.util.List<java.lang.String>) strList4);
        getObservationsV2_6.DepthUnitCustomId = "hi!";
        java.lang.String str9 = getObservationsV2_6.DepthUnitId;
        java.util.List<java.lang.String> strList10 = getObservationsV2_6.LabResultLaboratoryIds;
        getObservationsV2_6.MaxNumericResultValue = (-1.0d);
        java.util.List<java.lang.String> strList13 = getObservationsV2_6.getAnalyticalGroupIds();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(getObservationsV2_6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strList10);
        org.junit.Assert.assertNull(strList13);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReadingType fieldVisitReadingType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReadingType.MeanIndexVelocity;
        org.junit.Assert.assertTrue("'" + fieldVisitReadingType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReadingType.MeanIndexVelocity + "'", fieldVisitReadingType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReadingType.MeanIndexVelocity));
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.GradeListServiceRequest gradeListServiceRequest0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.GradeListServiceRequest();
        java.lang.Object obj1 = gradeListServiceRequest0.getResponseType();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$GradeListServiceResponse");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$GradeListServiceResponse");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$GradeListServiceResponse");
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ReadingType readingType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ReadingType.CleaningAfter;
        org.junit.Assert.assertTrue("'" + readingType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ReadingType.CleaningAfter + "'", readingType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ReadingType.CleaningAfter));
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostSensor postSensor0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostSensor();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.SensorBase sensorBase2 = postSensor0.setName("");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.SensorBase sensorBase4 = postSensor0.setUnitId("");
        java.lang.String str5 = sensorBase4.Name;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.SensorBase sensorBase7 = sensorBase4.setModel("/AQUARIUS/Acquisition/v2");
        org.junit.Assert.assertNotNull(sensorBase2);
        org.junit.Assert.assertNotNull(sensorBase4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(sensorBase7);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        com.aquaticinformatics.aquarius.sdk.timeseries.EndPoints endPoints0 = new com.aquaticinformatics.aquarius.sdk.timeseries.EndPoints();
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Acquisition.AttachmentType attachmentType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Acquisition.AttachmentType.Xml;
        org.junit.Assert.assertTrue("'" + attachmentType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Acquisition.AttachmentType.Xml + "'", attachmentType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Acquisition.AttachmentType.Xml));
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationDatumPeriod locationDatumPeriod0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationDatumPeriod();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationDatumPeriodBase locationDatumPeriodBase2 = locationDatumPeriod0.setComment("'.'SSSSSSS");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationDatumPeriodBase locationDatumPeriodBase4 = locationDatumPeriod0.setComment("hi!");
        java.lang.Double double5 = locationDatumPeriod0.getUncertainty();
        org.junit.Assert.assertNotNull(locationDatumPeriodBase2);
        org.junit.Assert.assertNotNull(locationDatumPeriodBase4);
        org.junit.Assert.assertNull(double5);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        net.servicestack.client.ConnectionFilter connectionFilter0 = net.servicestack.client.JsonServiceClient.GlobalRequestFilter;
        org.junit.Assert.assertNull(connectionFilter0);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Sensor sensor0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Sensor();
        java.time.Instant instant1 = sensor0.getLastModifiedUtc();
        java.lang.String str2 = sensor0.getSerialNumber();
        org.junit.Assert.assertNull(instant1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.TimeSeriesType timeSeriesType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.TimeSeriesType.Reflected;
        int int1 = timeSeriesType0.getValue();
        org.junit.Assert.assertTrue("'" + timeSeriesType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.TimeSeriesType.Reflected + "'", timeSeriesType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.TimeSeriesType.Reflected));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Current current0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Current();
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CorrectionType correctionType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CorrectionType.Deviation;
        org.junit.Assert.assertTrue("'" + correctionType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CorrectionType.Deviation + "'", correctionType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CorrectionType.Deviation));
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutFieldDataPlugin putFieldDataPlugin0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutFieldDataPlugin();
        java.lang.Integer int1 = putFieldDataPlugin0.getPluginPriority();
        java.lang.Boolean boolean2 = putFieldDataPlugin0.getIsEnabled();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(boolean2);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Acquisition.AttachmentType attachmentType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Acquisition.AttachmentType.SonTek;
        org.junit.Assert.assertTrue("'" + attachmentType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Acquisition.AttachmentType.SonTek + "'", attachmentType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Acquisition.AttachmentType.SonTek));
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.OpenIdConnectUser openIdConnectUser0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.OpenIdConnectUser();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.OpenIdConnectUser openIdConnectUser2 = openIdConnectUser0.setIdentifier("");
        java.lang.String str3 = openIdConnectUser2.FirstName;
        java.lang.String str4 = openIdConnectUser2.getFirstName();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.User user6 = openIdConnectUser2.setActive((java.lang.Boolean) true);
        java.lang.Boolean boolean7 = openIdConnectUser2.CanConfigureSystem;
        org.junit.Assert.assertNotNull(openIdConnectUser2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNull(boolean7);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
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
        java.lang.String str16 = reading0.getUnit();
        org.junit.Assert.assertNull(doubleWithDisplay1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(dischargeSummary7);
        org.junit.Assert.assertNotNull(doubleWithDisplay11);
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertNotNull(reading15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutNullMeasureQualifier putNullMeasureQualifier0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutNullMeasureQualifier();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutNullMeasureQualifier putNullMeasureQualifier2 = putNullMeasureQualifier0.setId("hi!");
        putNullMeasureQualifier2.Name = "/AQUARIUS/Acquisition/v2://9999-12-31T23:59:59.999Z";
        putNullMeasureQualifier2.Id = "MaxInstant";
        org.junit.Assert.assertNotNull(putNullMeasureQualifier2);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeasurementGradeType measurementGradeType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeasurementGradeType.Unspecified;
        org.junit.Assert.assertTrue("'" + measurementGradeType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeasurementGradeType.Unspecified + "'", measurementGradeType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeasurementGradeType.Unspecified));
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeterSuspensionType meterSuspensionType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeterSuspensionType.Handline;
        org.junit.Assert.assertTrue("'" + meterSuspensionType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeterSuspensionType.Handline + "'", meterSuspensionType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeterSuspensionType.Handline));
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DeploymentMethodType deploymentMethodType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DeploymentMethodType.BridgeUpstreamSide;
        org.junit.Assert.assertTrue("'" + deploymentMethodType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DeploymentMethodType.BridgeUpstreamSide + "'", deploymentMethodType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DeploymentMethodType.BridgeUpstreamSide));
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostStandard postStandard0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostStandard();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostStandard postStandard2 = postStandard0.setCustomId("/AQUARIUS/Provisioning/v1");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostStandard postStandard4 = postStandard2.setId("/AQUARIUS/Acquisition/v2://9999-12-31T23:59:59.999Z");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes5 = null;
        postStandard2.AuditAttributes = auditAttributes5;
        org.junit.Assert.assertNotNull(postStandard2);
        org.junit.Assert.assertNotNull(postStandard4);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CalibrationCheckType calibrationCheckType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CalibrationCheckType.Calibration;
        org.junit.Assert.assertTrue("'" + calibrationCheckType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CalibrationCheckType.Calibration + "'", calibrationCheckType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CalibrationCheckType.Calibration));
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetProjectHistory getProjectHistory0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetProjectHistory();
        java.lang.String str1 = getProjectHistory0.getId();
        java.lang.Object obj2 = getProjectHistory0.getResponseType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$SearchResultAuditHistory");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$SearchResultAuditHistory");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$SearchResultAuditHistory");
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutNullMeasureQualifier putNullMeasureQualifier0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutNullMeasureQualifier();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutNullMeasureQualifier putNullMeasureQualifier2 = putNullMeasureQualifier0.setDescription("");
        java.lang.Object obj3 = putNullMeasureQualifier2.getResponseType();
        org.junit.Assert.assertNotNull(putNullMeasureQualifier2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$NullMeasureQualifier");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$NullMeasureQualifier");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$NullMeasureQualifier");
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation observation0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DataClassificationType dataClassificationType1 = observation0.getDataClassification();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Medium medium2 = null;
        observation0.Medium = medium2;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingLocation samplingLocation4 = null;
        observation0.SamplingLocation = samplingLocation4;
        org.junit.Assert.assertNull(dataClassificationType1);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation observation0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PlannedFieldResult plannedFieldResult1 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation observation2 = observation0.setPlannedFieldResult(plannedFieldResult1);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabInstruction labInstruction3 = null;
        observation2.LabInstruction = labInstruction3;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservationStatistics observationStatistics5 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation observation6 = observation2.setStatistics(observationStatistics5);
        java.time.OffsetDateTime offsetDateTime7 = observation6.getResultTime();
        java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportHistoryEventSimple> importHistoryEventSimpleList8 = observation6.ImportHistoryEventSimples;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedProperty observedProperty9 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation observation10 = observation6.setObservedProperty(observedProperty9);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ResultGrade resultGrade11 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation observation12 = observation6.setResultGrade(resultGrade11);
        java.lang.String str13 = observation12.getMediumSubdivision();
        org.junit.Assert.assertNotNull(observation2);
        org.junit.Assert.assertNotNull(observation6);
        org.junit.Assert.assertNull(offsetDateTime7);
        org.junit.Assert.assertNull(importHistoryEventSimpleList8);
        org.junit.Assert.assertNotNull(observation10);
        org.junit.Assert.assertNotNull(observation12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_6 = getObservationsV2_0.setDataClassifications((java.util.List<java.lang.String>) strList4);
        getObservationsV2_6.DepthUnitCustomId = "hi!";
        java.lang.String str9 = getObservationsV2_6.CustomId;
        java.util.List<java.lang.String> strList10 = getObservationsV2_6.getSearch();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_11 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        getObservationsV2_11.SpecimenIds = strList14;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags17 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray21 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags24 = putLocationTags17.setTagUniqueIds(strList22);
        getObservationsV2_11.QualityControlTypes = strList22;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_26 = getObservationsV2_6.setMedia((java.util.List<java.lang.String>) strList22);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_27 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String str28 = getObservationsV2_27.getCustomId();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_29 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        getObservationsV2_29.SpecimenIds = strList32;
        getObservationsV2_27.ProjectIds = strList32;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_36 = getObservationsV2_6.setObservedPropertyIds((java.util.List<java.lang.String>) strList32);
        getObservationsV2_6.Limit = 10;
        java.util.List<java.lang.String> strList39 = null;
        getObservationsV2_6.ActivityIds = strList39;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SampleFractionType sampleFractionType41 = getObservationsV2_6.SampleFraction;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(getObservationsV2_6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strList10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(putLocationTags24);
        org.junit.Assert.assertNotNull(getObservationsV2_26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(getObservationsV2_36);
        org.junit.Assert.assertNull(sampleFractionType41);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.AttachmentType attachmentType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.AttachmentType.WinRiver;
        org.junit.Assert.assertTrue("'" + attachmentType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.AttachmentType.WinRiver + "'", attachmentType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.AttachmentType.WinRiver));
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.MediumSystemCodeType mediumSystemCodeType0 = com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.MediumSystemCodeType.GROUNDWATER;
        org.junit.Assert.assertTrue("'" + mediumSystemCodeType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.MediumSystemCodeType.GROUNDWATER + "'", mediumSystemCodeType0.equals(com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.MediumSystemCodeType.GROUNDWATER));
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ActivityType activityType0 = com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ActivityType.SPIKE;
        org.junit.Assert.assertTrue("'" + activityType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ActivityType.SPIKE + "'", activityType0.equals(com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ActivityType.SPIKE));
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Acquisition.AttachmentType attachmentType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Acquisition.AttachmentType.Csv;
        org.junit.Assert.assertTrue("'" + attachmentType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Acquisition.AttachmentType.Csv + "'", attachmentType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Acquisition.AttachmentType.Csv));
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostDetectioncondition postDetectioncondition0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostDetectioncondition();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes1 = postDetectioncondition0.getAuditAttributes();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostDetectioncondition postDetectioncondition3 = postDetectioncondition0.setId("9999-12-31T23:59:59.999Z");
        postDetectioncondition0.Description = "9999-12-31T23:59:59.999Z";
        postDetectioncondition0.CustomId = "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSSSSSZZZZZ";
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes8 = postDetectioncondition0.AuditAttributes;
        java.lang.String str9 = postDetectioncondition0.getCustomId();
        org.junit.Assert.assertNull(auditAttributes1);
        org.junit.Assert.assertNotNull(postDetectioncondition3);
        org.junit.Assert.assertNull(auditAttributes8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSSSSSZZZZZ" + "'", str9, "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSSSSSZZZZZ");
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.OpenIdConnectUser openIdConnectUser0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.OpenIdConnectUser();
        java.lang.String str1 = openIdConnectUser0.getSubjectIdentifier();
        java.lang.String str2 = openIdConnectUser0.getSubjectIdentifier();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReadingType fieldVisitReadingType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReadingType.Reference;
        org.junit.Assert.assertTrue("'" + fieldVisitReadingType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReadingType.Reference + "'", fieldVisitReadingType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReadingType.Reference));
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.DeleteLocationFolder deleteLocationFolder0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.DeleteLocationFolder();
        java.lang.String str1 = deleteLocationFolder0.LocationFolderUniqueId;
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation observation0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PlannedFieldResult plannedFieldResult1 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation observation2 = observation0.setPlannedFieldResult(plannedFieldResult1);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabInstruction labInstruction3 = null;
        observation2.LabInstruction = labInstruction3;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservationStatistics observationStatistics5 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation observation6 = observation2.setStatistics(observationStatistics5);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ResultStatus resultStatus7 = observation2.ResultStatus;
        org.junit.Assert.assertNotNull(observation2);
        org.junit.Assert.assertNotNull(observation6);
        org.junit.Assert.assertNull(resultStatus7);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.HorizontalFlowType horizontalFlowType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.HorizontalFlowType.Uneven;
        org.junit.Assert.assertTrue("'" + horizontalFlowType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.HorizontalFlowType.Uneven + "'", horizontalFlowType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.HorizontalFlowType.Uneven));
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutTag putTag0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutTag();
        java.lang.String str1 = putTag0.Name;
        java.lang.String str2 = putTag0.getName();
        java.lang.String str3 = putTag0.Description;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes4 = putTag0.AuditAttributes;
        java.lang.String str5 = putTag0.Id;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(auditAttributes4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostCalculatedDerivedTimeSeries postCalculatedDerivedTimeSeries0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostCalculatedDerivedTimeSeries();
        java.lang.String str1 = postCalculatedDerivedTimeSeries0.getComputationIdentifier();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostCalculatedDerivedTimeSeries postCalculatedDerivedTimeSeries3 = postCalculatedDerivedTimeSeries0.setSubLocationIdentifier("MaxInstant");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(postCalculatedDerivedTimeSeries3);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostLocation postLocation0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostLocation();
        postLocation0.Description = "hi!";
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationBase locationBase4 = postLocation0.setLocationType("/AQUARIUS/Acquisition/v2");
        java.lang.String str5 = postLocation0.ElevationUnits;
        org.junit.Assert.assertNotNull(locationBase4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Attachment attachment0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Attachment();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.AttachmentCategory attachmentCategory1 = attachment0.AttachmentCategory;
        java.lang.Double double2 = attachment0.GpsLongitude;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.AttachmentType attachmentType3 = attachment0.getAttachmentType();
        org.junit.Assert.assertNull(attachmentCategory1);
        org.junit.Assert.assertNull(double2);
        org.junit.Assert.assertNull(attachmentType3);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ResultGrade resultGrade0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ResultGrade();
        resultGrade0.Id = "/AQUARIUS/Acquisition/v2://9999-12-31T23:59:59.999Z";
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutTimeSeries putTimeSeries0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutTimeSeries();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutTimeSeries putTimeSeries2 = putTimeSeries0.setDescription("hi!");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutTimeSeries putTimeSeries4 = putTimeSeries0.setDescription("/AQUARIUS/Acquisition/v2://9999-12-31T23:59:59.999Z");
        java.lang.String str5 = putTimeSeries4.Comment;
        org.junit.Assert.assertNotNull(putTimeSeries2);
        org.junit.Assert.assertNotNull(putTimeSeries4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DeleteProject deleteProject0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DeleteProject();
        java.lang.String str1 = deleteProject0.getId();
        deleteProject0.Id = "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSSSSSZZZZZ";
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ActivityWithDetailsType activityWithDetailsType0 = com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ActivityWithDetailsType.FIELD_SURVEY;
        org.junit.Assert.assertTrue("'" + activityWithDetailsType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ActivityWithDetailsType.FIELD_SURVEY + "'", activityWithDetailsType0.equals(com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ActivityWithDetailsType.FIELD_SURVEY));
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        net.servicestack.client.ConnectionFilter connectionFilter0 = null;
        net.servicestack.client.JsonServiceClient.GlobalRequestFilter = connectionFilter0;
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostUnitGroup postUnitGroup0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostUnitGroup();
        java.lang.Integer int1 = postUnitGroup0.getTimeDimension();
        postUnitGroup0.BaseUnitIdentifier = "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ";
        java.lang.Integer int4 = postUnitGroup0.IntensityDimension;
        java.lang.Integer int5 = postUnitGroup0.IntensityDimension;
        java.lang.String str6 = postUnitGroup0.getBaseUnitSingularName();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeterType meterType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeterType.Nwis48TransferredVelocity;
        org.junit.Assert.assertTrue("'" + meterType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeterType.Nwis48TransferredVelocity + "'", meterType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeterType.Nwis48TransferredVelocity));
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostExtendedAttribute postExtendedAttribute0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostExtendedAttribute();
        java.lang.String str1 = postExtendedAttribute0.getKey();
        postExtendedAttribute0.DefaultValue = "/AQUARIUS/Acquisition/v2://9999-12-31T23:59:59.999Z";
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.TagValueType tagValueType4 = postExtendedAttribute0.ValueType;
        java.lang.String str5 = postExtendedAttribute0.getDefaultValue();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(tagValueType4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/AQUARIUS/Acquisition/v2://9999-12-31T23:59:59.999Z" + "'", str5, "/AQUARIUS/Acquisition/v2://9999-12-31T23:59:59.999Z");
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation observation0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PlannedFieldResult plannedFieldResult1 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation observation2 = observation0.setPlannedFieldResult(plannedFieldResult1);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabInstruction labInstruction3 = null;
        observation2.LabInstruction = labInstruction3;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservationStatistics observationStatistics5 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation observation6 = observation2.setStatistics(observationStatistics5);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DataClassificationType dataClassificationType7 = observation6.DataClassification;
        org.junit.Assert.assertNotNull(observation2);
        org.junit.Assert.assertNotNull(observation6);
        org.junit.Assert.assertNull(dataClassificationType7);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.util.List<java.lang.String> strList1 = getObservationsV2_0.SamplingContextTagIds;
        java.time.Instant instant2 = getObservationsV2_0.getEndModificationTime();
        java.util.List<java.lang.String> strList3 = getObservationsV2_0.Media;
        java.util.List<java.lang.String> strList4 = getObservationsV2_0.ActivityTypes;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.FieldResultType fieldResultType5 = null;
        getObservationsV2_0.FieldResultType = fieldResultType5;
        org.junit.Assert.assertNull(strList1);
        org.junit.Assert.assertNull(instant2);
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNull(strList4);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SearchResultLabReportImportHistoryEvent searchResultLabReportImportHistoryEvent0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SearchResultLabReportImportHistoryEvent();
        java.lang.Integer int1 = searchResultLabReportImportHistoryEvent0.getTotalCount();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SearchResultLabReportImportHistoryEvent searchResultLabReportImportHistoryEvent3 = searchResultLabReportImportHistoryEvent0.setTotalCount((java.lang.Integer) (-1));
        searchResultLabReportImportHistoryEvent0.Cursor = "";
        searchResultLabReportImportHistoryEvent0.Cursor = "MaxInstant";
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(searchResultLabReportImportHistoryEvent3);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutTag putTag0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutTag();
        java.lang.String str1 = putTag0.Name;
        java.lang.String str2 = putTag0.getName();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutTag putTag4 = putTag0.setDescription("");
        java.lang.String str5 = putTag4.Id;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes6 = putTag4.AuditAttributes;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(putTag4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(auditAttributes6);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
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
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.MediumType mediumType22 = com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.MediumType.SOIL;
        activityTemplate0.Medium = mediumType22;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.MediumType mediumType24 = com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.MediumType.AIR;
        activityTemplate0.Medium = mediumType24;
        java.lang.String str26 = activityTemplate0.Id;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(labInstructionTemplateList10);
        org.junit.Assert.assertNotNull(specimenTemplate13);
        org.junit.Assert.assertNull(labInstructionTemplateList16);
        org.junit.Assert.assertNotNull(specimenTemplateArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(postFieldVisitActivityWithTemplate20);
        org.junit.Assert.assertTrue("'" + mediumType22 + "' != '" + com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.MediumType.SOIL + "'", mediumType22.equals(com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.MediumType.SOIL));
        org.junit.Assert.assertTrue("'" + mediumType24 + "' != '" + com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.MediumType.AIR + "'", mediumType24.equals(com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.MediumType.AIR));
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostUnitGroup postUnitGroup0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostUnitGroup();
        java.lang.Integer int1 = postUnitGroup0.getTimeDimension();
        postUnitGroup0.BaseUnitIdentifier = "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ";
        java.lang.Integer int4 = postUnitGroup0.IntensityDimension;
        java.lang.Integer int5 = postUnitGroup0.IntensityDimension;
        postUnitGroup0.DisplayName = "";
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostUnitGroup postUnitGroup9 = postUnitGroup0.setBaseUnitSingularName("/AQUARIUS/Acquisition/v2://9999-12-31T23:59:59.999Z");
        java.lang.String str10 = postUnitGroup0.DisplayName;
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNotNull(postUnitGroup9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
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
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.QualityControlType qualityControlType11 = com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.QualityControlType.OTHER_QC;
        observation10.QualityControlType = qualityControlType11;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedProperty observedProperty13 = null;
        observation10.ObservedProperty = observedProperty13;
        org.junit.Assert.assertNotNull(observation2);
        org.junit.Assert.assertNotNull(observation6);
        org.junit.Assert.assertNotNull(observation10);
        org.junit.Assert.assertTrue("'" + qualityControlType11 + "' != '" + com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.QualityControlType.OTHER_QC + "'", qualityControlType11.equals(com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.QualityControlType.OTHER_QC));
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.RatingCurveListServiceRequest ratingCurveListServiceRequest0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.RatingCurveListServiceRequest();
        java.lang.Object obj1 = ratingCurveListServiceRequest0.getResponseType();
        java.lang.Object obj2 = ratingCurveListServiceRequest0.getResponseType();
        java.time.Instant instant3 = ratingCurveListServiceRequest0.QueryTo;
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$RatingCurveListServiceResponse");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$RatingCurveListServiceResponse");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$RatingCurveListServiceResponse");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$RatingCurveListServiceResponse");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$RatingCurveListServiceResponse");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$RatingCurveListServiceResponse");
        org.junit.Assert.assertNull(instant3);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.RecurringReport recurringReport0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.RecurringReport();
        java.time.Instant instant1 = recurringReport0.getNextGenerationDate();
        java.lang.String str2 = recurringReport0.RecurrencePeriod;
        org.junit.Assert.assertNull(instant1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutOpenIdConnectRelyingPartyConfiguration putOpenIdConnectRelyingPartyConfiguration0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutOpenIdConnectRelyingPartyConfiguration();
        java.util.List<java.lang.String> strList1 = putOpenIdConnectRelyingPartyConfiguration0.getScopes();
        java.lang.String str2 = putOpenIdConnectRelyingPartyConfiguration0.DisplayName;
        org.junit.Assert.assertNull(strList1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning provisioning0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning();
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        com.aquaticinformatics.aquarius.sdk.helpers.MultipartBuilder multipartBuilder0 = new com.aquaticinformatics.aquarius.sdk.helpers.MultipartBuilder();
        com.aquaticinformatics.aquarius.sdk.helpers.ContentPart contentPart1 = null;
        // The following exception was thrown during execution in test generation
        try {
            multipartBuilder0.addContentPart(contentPart1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeterType meterType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeterType.Pygmy;
        org.junit.Assert.assertTrue("'" + meterType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeterType.Pygmy + "'", meterType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeterType.Pygmy));
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        java.time.Duration duration0 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.DurationDeserializer.MaxValue;
        org.junit.Assert.assertNotNull(duration0);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ThresholdTypeSeverity thresholdTypeSeverity0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ThresholdTypeSeverity.Error;
        org.junit.Assert.assertTrue("'" + thresholdTypeSeverity0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ThresholdTypeSeverity.Error + "'", thresholdTypeSeverity0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ThresholdTypeSeverity.Error));
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.DeleteLocationFolder deleteLocationFolder0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.DeleteLocationFolder();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.DeleteLocationFolder deleteLocationFolder2 = deleteLocationFolder0.setLocationFolderUniqueId("MaxInstant");
        deleteLocationFolder2.LocationFolderUniqueId = "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ";
        org.junit.Assert.assertNotNull(deleteLocationFolder2);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
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
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.CategoricalResult categoricalResult12 = observation6.getCategoricalResult();
        org.junit.Assert.assertNotNull(observation2);
        org.junit.Assert.assertNotNull(observation6);
        org.junit.Assert.assertNull(offsetDateTime7);
        org.junit.Assert.assertNotNull(observation11);
        org.junit.Assert.assertNull(categoricalResult12);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Schedule schedule0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Schedule();
        java.time.OffsetDateTime offsetDateTime1 = schedule0.EndDate;
        org.junit.Assert.assertNull(offsetDateTime1);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PlannedActivityActivityType plannedActivityActivityType0 = com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PlannedActivityActivityType.REPLICATE;
        org.junit.Assert.assertTrue("'" + plannedActivityActivityType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PlannedActivityActivityType.REPLICATE + "'", plannedActivityActivityType0.equals(com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PlannedActivityActivityType.REPLICATE));
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest timeAlignedDataServiceRequest0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ControlConditionActivity controlConditionActivity1 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ControlConditionActivity();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ControlCleanedType controlCleanedType2 = null;
        controlConditionActivity1.ControlCleaned = controlCleanedType2;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse4 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse();
        java.time.Instant instant5 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse6 = locationDescriptionListServiceResponse4.setNextToken(instant5);
        controlConditionActivity1.DateCleaned = instant5;
        timeAlignedDataServiceRequest0.QueryFrom = instant5;
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
        getObservationsV2_9.ActivityIds = strList20;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest timeAlignedDataServiceRequest24 = timeAlignedDataServiceRequest0.setTimeSeriesOutputUnitIds(strList20);
        java.lang.Boolean boolean25 = timeAlignedDataServiceRequest0.isApplyRounding();
        java.lang.Boolean boolean26 = timeAlignedDataServiceRequest0.isIncludeGapMarkers();
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertNotNull(locationDescriptionListServiceResponse6);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(putLocationTags22);
        org.junit.Assert.assertNotNull(timeAlignedDataServiceRequest24);
        org.junit.Assert.assertNull(boolean25);
        org.junit.Assert.assertNull(boolean26);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        java.lang.String str0 = com.aquaticinformatics.aquarius.sdk.helpers.SdkServiceClient.HttpScheme;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http" + "'", str0, "http");
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DeleteProject deleteProject0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DeleteProject();
        java.lang.String str1 = deleteProject0.getId();
        java.lang.String str2 = deleteProject0.getId();
        java.lang.String str3 = deleteProject0.Id;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DayOfWeekType dayOfWeekType0 = com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DayOfWeekType.SATURDAY;
        org.junit.Assert.assertTrue("'" + dayOfWeekType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DayOfWeekType.SATURDAY + "'", dayOfWeekType0.equals(com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DayOfWeekType.SATURDAY));
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostDetectioncondition postDetectioncondition0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostDetectioncondition();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes1 = postDetectioncondition0.getAuditAttributes();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostDetectioncondition postDetectioncondition3 = postDetectioncondition0.setId("9999-12-31T23:59:59.999Z");
        postDetectioncondition0.Description = "9999-12-31T23:59:59.999Z";
        postDetectioncondition0.CustomId = "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSSSSSZZZZZ";
        java.lang.String str8 = postDetectioncondition0.getCustomId();
        postDetectioncondition0.Name = "";
        java.lang.String str11 = postDetectioncondition0.Id;
        org.junit.Assert.assertNull(auditAttributes1);
        org.junit.Assert.assertNotNull(postDetectioncondition3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSSSSSZZZZZ" + "'", str8, "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSSSSSZZZZZ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "9999-12-31T23:59:59.999Z" + "'", str11, "9999-12-31T23:59:59.999Z");
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostUnitGroup postUnitGroup0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostUnitGroup();
        java.lang.Integer int1 = postUnitGroup0.getTimeDimension();
        postUnitGroup0.BaseUnitIdentifier = "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ";
        java.lang.Integer int4 = postUnitGroup0.IntensityDimension;
        postUnitGroup0.GroupIdentifier = "/AQUARIUS/Acquisition/v2://9999-12-31T23:59:59.999Z";
        java.lang.Integer int7 = postUnitGroup0.getCurrentDimension();
        java.lang.Integer int8 = postUnitGroup0.getTimeDimension();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.UnitGroupBase unitGroupBase10 = postUnitGroup0.setIntensityDimension((java.lang.Integer) (-1));
        java.lang.Integer int11 = unitGroupBase10.LengthDimension;
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNotNull(unitGroupBase10);
        org.junit.Assert.assertNull(int11);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
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
        java.lang.Object obj24 = importItem23.Item;
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
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutNullMeasureQualifier putNullMeasureQualifier0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutNullMeasureQualifier();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutNullMeasureQualifier putNullMeasureQualifier2 = putNullMeasureQualifier0.setDescription("");
        putNullMeasureQualifier0.Description = "MinDuration";
        org.junit.Assert.assertNotNull(putNullMeasureQualifier2);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostDatumConvertedTimeSeries postDatumConvertedTimeSeries0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostDatumConvertedTimeSeries();
        postDatumConvertedTimeSeries0.SourceIsLocalAssumedDatum = false;
        java.lang.String str3 = postDatumConvertedTimeSeries0.getLabel();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ExtendedAttributeApplicability extendedAttributeApplicability0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ExtendedAttributeApplicability.AppliesToTimeSeries;
        org.junit.Assert.assertTrue("'" + extendedAttributeApplicability0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ExtendedAttributeApplicability.AppliesToTimeSeries + "'", extendedAttributeApplicability0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ExtendedAttributeApplicability.AppliesToTimeSeries));
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.AttachmentType attachmentType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.AttachmentType.AquaCalc;
        org.junit.Assert.assertTrue("'" + attachmentType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.AttachmentType.AquaCalc + "'", attachmentType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.AttachmentType.AquaCalc));
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer instantDeserializer0 = new com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer();
        com.google.gson.JsonElement jsonElement1 = null;
        java.lang.reflect.Type type2 = null;
        com.google.gson.JsonDeserializationContext jsonDeserializationContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.Instant instant4 = instantDeserializer0.deserialize(jsonElement1, type2, jsonDeserializationContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeasurementLocationToGageType measurementLocationToGageType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeasurementLocationToGageType.Unspecified;
        org.junit.Assert.assertTrue("'" + measurementLocationToGageType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeasurementLocationToGageType.Unspecified + "'", measurementLocationToGageType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeasurementLocationToGageType.Unspecified));
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeterSuspensionType meterSuspensionType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeterSuspensionType.Unspecified;
        org.junit.Assert.assertTrue("'" + meterSuspensionType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeterSuspensionType.Unspecified + "'", meterSuspensionType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeterSuspensionType.Unspecified));
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitDataServiceResponse fieldVisitDataServiceResponse0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitDataServiceResponse();
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CrossSectionSurveyActivity> crossSectionSurveyActivityList1 = fieldVisitDataServiceResponse0.getCrossSectionSurveyActivity();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DatumConversionResult datumConversionResult2 = null;
        fieldVisitDataServiceResponse0.DatumConversionResult = datumConversionResult2;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DatumConversionResult datumConversionResult4 = null;
        fieldVisitDataServiceResponse0.DatumConversionResult = datumConversionResult4;
        org.junit.Assert.assertNull(crossSectionSurveyActivityList1);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostDatumConvertedTimeSeries postDatumConvertedTimeSeries0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostDatumConvertedTimeSeries();
        postDatumConvertedTimeSeries0.SourceIsLocalAssumedDatum = false;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostDatumConvertedTimeSeries postDatumConvertedTimeSeries4 = postDatumConvertedTimeSeries0.setComputationPeriodIdentifier("/AQUARIUS/Acquisition/v2://9999-12-31T23:59:59.999Z");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostDatumConvertedTimeSeries postDatumConvertedTimeSeries6 = postDatumConvertedTimeSeries0.setSourceIsLocalAssumedDatum((java.lang.Boolean) true);
        java.lang.String str7 = postDatumConvertedTimeSeries6.getSubLocationIdentifier();
        org.junit.Assert.assertNotNull(postDatumConvertedTimeSeries4);
        org.junit.Assert.assertNotNull(postDatumConvertedTimeSeries6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String str1 = putLocationTags0.getLocationUniqueId();
        putLocationTags0.LocationUniqueId = "'.'SSSSSSS";
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ApplyTagRequest[] applyTagRequestArray4 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ApplyTagRequest[] {};
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ApplyTagRequest> applyTagRequestList5 = new java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ApplyTagRequest>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ApplyTagRequest>) applyTagRequestList5, applyTagRequestArray4);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags7 = putLocationTags0.setTags(applyTagRequestList5);
        java.util.ArrayList<java.lang.String> strList8 = putLocationTags0.TagUniqueIds;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(applyTagRequestArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(putLocationTags7);
        org.junit.Assert.assertNull(strList8);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportHistoryEvent importHistoryEvent0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportHistoryEvent();
        java.time.OffsetDateTime offsetDateTime1 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportHistoryEvent importHistoryEvent2 = importHistoryEvent0.setImportTime(offsetDateTime1);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.UserProfile userProfile3 = importHistoryEvent0.ImportedBy;
        org.junit.Assert.assertNotNull(importHistoryEvent2);
        org.junit.Assert.assertNull(userProfile3);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        java.lang.String str0 = com.aquaticinformatics.aquarius.sdk.timeseries.EndPoints.ROOT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "/AQUARIUS" + "'", str0, "/AQUARIUS");
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostExtendedAttribute postExtendedAttribute0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostExtendedAttribute();
        java.util.ArrayList<java.lang.String> strList1 = postExtendedAttribute0.getPickListValues();
        org.junit.Assert.assertNull(strList1);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ChannelMaterialType channelMaterialType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ChannelMaterialType.Sand;
        org.junit.Assert.assertTrue("'" + channelMaterialType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ChannelMaterialType.Sand + "'", channelMaterialType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ChannelMaterialType.Sand));
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.PointVelocityDischargeActivity pointVelocityDischargeActivity0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.PointVelocityDischargeActivity();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.QuantityWithDisplay quantityWithDisplay1 = pointVelocityDischargeActivity0.getVelocityAverage();
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Vertical> verticalList2 = pointVelocityDischargeActivity0.Verticals;
        java.lang.String str3 = pointVelocityDischargeActivity0.SerialNumber;
        java.lang.Integer int4 = pointVelocityDischargeActivity0.getNumberOfPanels();
        java.lang.Boolean boolean5 = pointVelocityDischargeActivity0.IsValid;
        org.junit.Assert.assertNull(quantityWithDisplay1);
        org.junit.Assert.assertNull(verticalList2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(boolean5);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagApplicability tagApplicability0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagApplicability.AppliesToReports;
        org.junit.Assert.assertTrue("'" + tagApplicability0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagApplicability.AppliesToReports + "'", tagApplicability0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagApplicability.AppliesToReports));
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        // The following exception was thrown during execution in test generation
        try {
            com.aquaticinformatics.aquarius.sdk.AquariusServerVersion aquariusServerVersion1 = com.aquaticinformatics.aquarius.sdk.AquariusServerVersion.Create("yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSSSSSZZZZZ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"yyyy'-'MM'-'dd'T'HH':'mm':'ss'\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Schedule schedule0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Schedule();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Schedule schedule2 = schedule0.setId("hi!");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes3 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Schedule schedule4 = schedule2.setAuditAttributes(auditAttributes3);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes5 = schedule4.getAuditAttributes();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.RecurrenceType recurrenceType6 = schedule4.RecurrenceType;
        org.junit.Assert.assertNotNull(schedule2);
        org.junit.Assert.assertNotNull(schedule4);
        org.junit.Assert.assertNull(auditAttributes5);
        org.junit.Assert.assertNull(recurrenceType6);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeterType meterType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeterType.Adcp;
        org.junit.Assert.assertTrue("'" + meterType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeterType.Adcp + "'", meterType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeterType.Adcp));
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ActivityTemplate activityTemplate0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ActivityTemplate();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes1 = null;
        activityTemplate0.AuditAttributes = auditAttributes1;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ActivityTemplate activityTemplate3 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ActivityTemplate();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes4 = null;
        activityTemplate3.AuditAttributes = auditAttributes4;
        java.lang.String str6 = activityTemplate3.getComment();
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
        activityTemplate3.SpecimenTemplates = specimenTemplateList21;
        activityTemplate0.SpecimenTemplates = specimenTemplateList21;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ActivityTemplateType activityTemplateType26 = activityTemplate0.getType();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(labInstructionTemplateList13);
        org.junit.Assert.assertNotNull(specimenTemplate16);
        org.junit.Assert.assertNull(labInstructionTemplateList19);
        org.junit.Assert.assertNotNull(specimenTemplateArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(postFieldVisitActivityWithTemplate23);
        org.junit.Assert.assertNull(activityTemplateType26);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ReferencePointBase referencePointBase0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ReferencePointBase();
        java.lang.Double double1 = referencePointBase0.Longitude;
        java.lang.String str2 = referencePointBase0.Name;
        org.junit.Assert.assertNull(double1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        java.lang.String str0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.IFieldVisitData.Identifier;
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.GetFieldVisitReadingsByLocationServiceRequest getFieldVisitReadingsByLocationServiceRequest0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.GetFieldVisitReadingsByLocationServiceRequest();
        getFieldVisitReadingsByLocationServiceRequest0.ApplyRounding = false;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_3 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        getObservationsV2_3.SpecimenIds = strList6;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags9 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray13 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags16 = putLocationTags9.setTagUniqueIds(strList14);
        getObservationsV2_3.QualityControlTypes = strList14;
        java.util.List<java.lang.String> strList18 = getObservationsV2_3.getAnalyticalGroupIds();
        java.util.List<java.lang.String> strList19 = getObservationsV2_3.DataClassifications;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.FieldResultType fieldResultType20 = getObservationsV2_3.FieldResultType;
        java.time.Instant instant21 = getObservationsV2_3.getEndObservedTime();
        java.lang.String str22 = getObservationsV2_3.DepthUnitCustomId;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags23 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray27 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags30 = putLocationTags23.setTagUniqueIds(strList28);
        java.util.ArrayList<java.lang.String> strList31 = putLocationTags30.TagUniqueIds;
        getObservationsV2_3.ProjectIds = strList31;
        getFieldVisitReadingsByLocationServiceRequest0.Parameters = strList31;
        java.lang.String str34 = getFieldVisitReadingsByLocationServiceRequest0.getLocationUniqueId();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(putLocationTags16);
        org.junit.Assert.assertNull(strList18);
        org.junit.Assert.assertNull(strList19);
        org.junit.Assert.assertNull(fieldResultType20);
        org.junit.Assert.assertNull(instant21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(putLocationTags30);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.TemporalExpressionType temporalExpressionType0 = com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.TemporalExpressionType.FORTH_WEEK_OF_MONTH;
        org.junit.Assert.assertTrue("'" + temporalExpressionType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.TemporalExpressionType.FORTH_WEEK_OF_MONTH + "'", temporalExpressionType0.equals(com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.TemporalExpressionType.FORTH_WEEK_OF_MONTH));
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ReferencePoint referencePoint0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ReferencePoint();
        java.lang.String str1 = referencePoint0.UniqueId;
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate specimenTemplate0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate();
        java.lang.String str1 = specimenTemplate0.Name;
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.UserBase userBase0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.UserBase();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.UserBase userBase2 = userBase0.setActive((java.lang.Boolean) false);
        userBase0.CanConfigureSystem = false;
        org.junit.Assert.assertNotNull(userBase2);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutQualityCode putQualityCode0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutQualityCode();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutQualityCode putQualityCode2 = putQualityCode0.setColor("yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ");
        putQualityCode2.Color = "/AQUARIUS/Acquisition/v2";
        putQualityCode2.Description = "/AQUARIUS/Acquisition/v2";
        putQualityCode2.DisplayName = "9999-12-31T23:59:59.999Z";
        java.lang.String str9 = putQualityCode2.getDisplayName();
        putQualityCode2.DisplayName = "hi!";
        org.junit.Assert.assertNotNull(putQualityCode2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "9999-12-31T23:59:59.999Z" + "'", str9, "9999-12-31T23:59:59.999Z");
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostImportVerticalProfileData postImportVerticalProfileData0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostImportVerticalProfileData();
        java.lang.String str1 = postImportVerticalProfileData0.getSamplingLocationIds();
        java.lang.String str2 = postImportVerticalProfileData0.getSamplingLocationIds();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostLocation postLocation0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostLocation();
        postLocation0.Description = "hi!";
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationBase locationBase4 = postLocation0.setLocationType("/AQUARIUS/Acquisition/v2");
        java.lang.String str5 = locationBase4.getLocationPath();
        org.junit.Assert.assertNotNull(locationBase4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DeleteAnalyticalGroup deleteAnalyticalGroup0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DeleteAnalyticalGroup();
        java.lang.String str1 = deleteAnalyticalGroup0.getId();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ExpandedRatingCurve expandedRatingCurve0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ExpandedRatingCurve();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.RatingCurveType ratingCurveType1 = expandedRatingCurve0.Type;
        expandedRatingCurve0.IsBlended = false;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ParameterWithUnit parameterWithUnit4 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ParameterWithUnit();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ExpandedRatingCurve expandedRatingCurve5 = expandedRatingCurve0.setOutputParameter(parameterWithUnit4);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ParameterWithUnit parameterWithUnit6 = expandedRatingCurve5.getOutputParameter();
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.RatingShift> ratingShiftList7 = expandedRatingCurve5.Shifts;
        org.junit.Assert.assertNull(ratingCurveType1);
        org.junit.Assert.assertNotNull(expandedRatingCurve5);
        org.junit.Assert.assertNotNull(parameterWithUnit6);
        org.junit.Assert.assertNull(ratingShiftList7);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Acquisition.AttachmentType attachmentType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Acquisition.AttachmentType.ScotLogger;
        org.junit.Assert.assertTrue("'" + attachmentType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Acquisition.AttachmentType.ScotLogger + "'", attachmentType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Acquisition.AttachmentType.ScotLogger));
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.MetricConfiguration metricConfiguration0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.MetricConfiguration();
        java.lang.String str1 = metricConfiguration0.getId();
        java.lang.Boolean boolean2 = metricConfiguration0.getIncludeChildren();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(boolean2);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.FieldVisitSummaryRepresentation fieldVisitSummaryRepresentation0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.FieldVisitSummaryRepresentation();
        java.time.OffsetDateTime offsetDateTime1 = fieldVisitSummaryRepresentation0.getStartTime();
        fieldVisitSummaryRepresentation0.Id = "/AQUARIUS/Acquisition/v2";
        org.junit.Assert.assertNull(offsetDateTime1);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Acquisition.AttachmentType attachmentType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Acquisition.AttachmentType.Hfc;
        org.junit.Assert.assertTrue("'" + attachmentType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Acquisition.AttachmentType.Hfc + "'", attachmentType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Acquisition.AttachmentType.Hfc));
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.GapToleranceOperation gapToleranceOperation0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.GapToleranceOperation();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MetadataChangeOperationType metadataChangeOperationType1 = gapToleranceOperation0.OperationType;
        java.lang.String str2 = gapToleranceOperation0.getComments();
        java.lang.String str3 = gapToleranceOperation0.getComments();
        org.junit.Assert.assertNull(metadataChangeOperationType1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.FieldVisitSummaryRepresentation fieldVisitSummaryRepresentation0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.FieldVisitSummaryRepresentation();
        java.lang.String str1 = fieldVisitSummaryRepresentation0.CustomId;
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DoubleWithDisplay doubleWithDisplay0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DoubleWithDisplay();
        java.lang.String str1 = doubleWithDisplay0.Display;
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.PointVelocityObservationType pointVelocityObservationType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.PointVelocityObservationType.FivePoint;
        org.junit.Assert.assertTrue("'" + pointVelocityObservationType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.PointVelocityObservationType.FivePoint + "'", pointVelocityObservationType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.PointVelocityObservationType.FivePoint));
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MetadataChangeOperationType metadataChangeOperationType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.IMetadataChangeOperation.OperationType;
        org.junit.Assert.assertNull(metadataChangeOperationType0);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescription locationDescription0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescription();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescription locationDescription2 = locationDescription0.setIdentifier("");
        java.lang.String str3 = locationDescription2.UniqueId;
        locationDescription2.UtcOffset = 1.0d;
        org.junit.Assert.assertNotNull(locationDescription2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationRemark locationRemark0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationRemark();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationRemark locationRemark2 = locationRemark0.setDescription("MaxInstant");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationRemark locationRemark3 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationRemark();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationRemark locationRemark5 = locationRemark3.setDescription("MaxInstant");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse6 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse();
        java.time.Instant instant7 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse8 = locationDescriptionListServiceResponse6.setNextToken(instant7);
        locationRemark5.FromTime = instant7;
        locationRemark2.CreateTime = instant7;
        locationRemark2.TypeName = "hi!";
        org.junit.Assert.assertNotNull(locationRemark2);
        org.junit.Assert.assertNotNull(locationRemark5);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(locationDescriptionListServiceResponse8);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_6 = getObservationsV2_0.setDataClassifications((java.util.List<java.lang.String>) strList4);
        getObservationsV2_6.DepthUnitCustomId = "hi!";
        java.lang.String str9 = getObservationsV2_6.CustomId;
        java.util.List<java.lang.String> strList10 = getObservationsV2_6.getSearch();
        getObservationsV2_6.SpecimenName = "/AQUARIUS/Provisioning/v1";
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(getObservationsV2_6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strList10);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SourceRoundedValueType sourceRoundedValueType0 = com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SourceRoundedValueType.ROUNDING_SPECIFICATION;
        org.junit.Assert.assertTrue("'" + sourceRoundedValueType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SourceRoundedValueType.ROUNDING_SPECIFICATION + "'", sourceRoundedValueType0.equals(com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SourceRoundedValueType.ROUNDING_SPECIFICATION));
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ParameterMetadata parameterMetadata0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ParameterMetadata();
        parameterMetadata0.RoundingSpec = "";
        java.lang.String str3 = parameterMetadata0.getInterpolationType();
        java.lang.String str4 = parameterMetadata0.getUnitGroupIdentifier();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ConfigurableDropDownListItem configurableDropDownListItem0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ConfigurableDropDownListItem();
        configurableDropDownListItem0.DisplayOrder = (-1);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationMonitoringMethod locationMonitoringMethod0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationMonitoringMethod();
        java.lang.String str1 = locationMonitoringMethod0.getModel();
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagMetadata> tagMetadataList2 = null;
        locationMonitoringMethod0.Tags = tagMetadataList2;
        java.lang.String str4 = locationMonitoringMethod0.getParameterId();
        java.lang.String str5 = locationMonitoringMethod0.Parameter;
        locationMonitoringMethod0.Comment = "";
        locationMonitoringMethod0.LocationIdentifier = "9999-12-31T23:59:59.999Z";
        java.lang.String str10 = locationMonitoringMethod0.getParameterId();
        java.lang.String str11 = locationMonitoringMethod0.SerialNumber;
        java.lang.String str12 = locationMonitoringMethod0.SubLocationIdentifier;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.FixedDropDownListItem fixedDropDownListItem0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.FixedDropDownListItem();
        java.lang.String str1 = fixedDropDownListItem0.getDropDownListDisplayName();
        java.lang.String str2 = fixedDropDownListItem0.DisplayName;
        java.lang.String str3 = fixedDropDownListItem0.getDisplayName();
        fixedDropDownListItem0.DisplayName = "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetExtendedAttributeDropdownlistitems getExtendedAttributeDropdownlistitems0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetExtendedAttributeDropdownlistitems();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_1 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.util.List<java.lang.String> strList2 = getObservationsV2_1.SamplingContextTagIds;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_3 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        getObservationsV2_3.SpecimenIds = strList6;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags9 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray13 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags16 = putLocationTags9.setTagUniqueIds(strList14);
        getObservationsV2_3.QualityControlTypes = strList14;
        getObservationsV2_1.ResultGrades = strList14;
        getExtendedAttributeDropdownlistitems0.Search = strList14;
        java.lang.Integer int20 = getExtendedAttributeDropdownlistitems0.getLimit();
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(putLocationTags16);
        org.junit.Assert.assertNull(int20);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostActivity postActivity0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostActivity();
        postActivity0.LoggerFileName = "hi!";
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PlannedActivity plannedActivity3 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostActivity postActivity4 = postActivity0.setPlannedActivity(plannedActivity3);
        java.lang.String str5 = postActivity4.Id;
        org.junit.Assert.assertNotNull(postActivity4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutTimeSeries putTimeSeries0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutTimeSeries();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutTimeSeries putTimeSeries2 = putTimeSeries0.setDescription("hi!");
        java.lang.String str3 = putTimeSeries0.getDescription();
        java.lang.String str4 = putTimeSeries0.getTimeSeriesUniqueId();
        org.junit.Assert.assertNotNull(putTimeSeries2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        java.lang.String str0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.IQualityCodeRequest.DisplayName;
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.GageHeightAtZeroFlowActivity gageHeightAtZeroFlowActivity0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.IFieldVisitData.GageHeightAtZeroFlowActivity;
        org.junit.Assert.assertNull(gageHeightAtZeroFlowActivity0);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.DeleteLocationFolder deleteLocationFolder0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.DeleteLocationFolder();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.DeleteLocationFolder deleteLocationFolder2 = deleteLocationFolder0.setLocationFolderUniqueId("MaxInstant");
        java.lang.String str3 = deleteLocationFolder2.LocationFolderUniqueId;
        org.junit.Assert.assertNotNull(deleteLocationFolder2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MaxInstant" + "'", str3, "MaxInstant");
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostCalculatedDerivedTimeSeries postCalculatedDerivedTimeSeries0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostCalculatedDerivedTimeSeries();
        java.util.ArrayList<java.lang.String> strList1 = postCalculatedDerivedTimeSeries0.TimeSeriesUniqueIds;
        java.lang.String str2 = postCalculatedDerivedTimeSeries0.Label;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.InterpolationType interpolationType3 = postCalculatedDerivedTimeSeries0.getInterpolationType();
        org.junit.Assert.assertNull(strList1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(interpolationType3);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeMethodType dischargeMethodType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeMethodType.Unknown;
        org.junit.Assert.assertTrue("'" + dischargeMethodType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeMethodType.Unknown + "'", dischargeMethodType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeMethodType.Unknown));
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostLocation postLocation0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostLocation();
        java.lang.Double double1 = postLocation0.getLatitude();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationBase locationBase3 = postLocation0.setLocationPath("https");
        java.lang.String str4 = postLocation0.LocationName;
        org.junit.Assert.assertNull(double1);
        org.junit.Assert.assertNotNull(locationBase3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ReferencePointBase referencePointBase0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ReferencePointBase();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ReferencePointBase referencePointBase2 = referencePointBase0.setLongitude((java.lang.Double) 10.0d);
        java.time.Instant instant3 = referencePointBase0.DecommissionedDate;
        org.junit.Assert.assertNotNull(referencePointBase2);
        org.junit.Assert.assertNull(instant3);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation observation0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PlannedFieldResult plannedFieldResult1 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation observation2 = observation0.setPlannedFieldResult(plannedFieldResult1);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabInstruction labInstruction3 = null;
        observation2.LabInstruction = labInstruction3;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservationStatistics observationStatistics5 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation observation6 = observation2.setStatistics(observationStatistics5);
        java.time.OffsetDateTime offsetDateTime7 = observation6.getResultTime();
        java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportHistoryEventSimple> importHistoryEventSimpleList8 = observation6.ImportHistoryEventSimples;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedProperty observedProperty9 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation observation10 = observation6.setObservedProperty(observedProperty9);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Taxon taxon11 = observation10.RelatedTaxon;
        org.junit.Assert.assertNotNull(observation2);
        org.junit.Assert.assertNotNull(observation6);
        org.junit.Assert.assertNull(offsetDateTime7);
        org.junit.Assert.assertNull(importHistoryEventSimpleList8);
        org.junit.Assert.assertNotNull(observation10);
        org.junit.Assert.assertNull(taxon11);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.RatingModelOutputValuesServiceRequest ratingModelOutputValuesServiceRequest0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.RatingModelOutputValuesServiceRequest();
        ratingModelOutputValuesServiceRequest0.ApplyShifts = true;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.RatingModelOutputValuesServiceResponse ratingModelOutputValuesServiceResponse3 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.RatingModelOutputValuesServiceResponse();
        java.lang.Double[] doubleArray7 = new java.lang.Double[] { 1.0d, 100.0d, (-1.0d) };
        java.util.ArrayList<java.lang.Double> doubleList8 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList8, doubleArray7);
        ratingModelOutputValuesServiceResponse3.OutputValues = doubleList8;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.RatingModelOutputValuesServiceRequest ratingModelOutputValuesServiceRequest11 = ratingModelOutputValuesServiceRequest0.setInputValues(doubleList8);
        java.lang.String str12 = ratingModelOutputValuesServiceRequest0.RatingModelIdentifier;
        ratingModelOutputValuesServiceRequest0.ApplyShifts = false;
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(ratingModelOutputValuesServiceRequest11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostLocation postLocation0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostLocation();
        postLocation0.Description = "hi!";
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ExtendedAttributeValue[] extendedAttributeValueArray3 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ExtendedAttributeValue[] {};
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ExtendedAttributeValue> extendedAttributeValueList4 = new java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ExtendedAttributeValue>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ExtendedAttributeValue>) extendedAttributeValueList4, extendedAttributeValueArray3);
        postLocation0.ExtendedAttributeValues = extendedAttributeValueList4;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationBase locationBase8 = postLocation0.setElevation((java.lang.Double) 100.0d);
        postLocation0.LocationType = "MaxInstant";
        postLocation0.UtcOffset = "'.'SSSSSSS";
        postLocation0.LocationIdentifier = "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ";
        org.junit.Assert.assertNotNull(extendedAttributeValueArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locationBase8);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CurrentMeterType currentMeterType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CurrentMeterType.TimeOfTravel;
        org.junit.Assert.assertTrue("'" + currentMeterType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CurrentMeterType.TimeOfTravel + "'", currentMeterType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CurrentMeterType.TimeOfTravel));
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitDataServiceResponse fieldVisitDataServiceResponse0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitDataServiceResponse();
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CrossSectionSurveyActivity> crossSectionSurveyActivityList1 = fieldVisitDataServiceResponse0.CrossSectionSurveyActivity;
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeActivity> dischargeActivityList2 = fieldVisitDataServiceResponse0.getDischargeActivities();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.GageHeightAtZeroFlowActivity gageHeightAtZeroFlowActivity3 = null;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitDataServiceResponse fieldVisitDataServiceResponse4 = fieldVisitDataServiceResponse0.setGageHeightAtZeroFlowActivity(gageHeightAtZeroFlowActivity3);
        org.junit.Assert.assertNull(crossSectionSurveyActivityList1);
        org.junit.Assert.assertNull(dischargeActivityList2);
        org.junit.Assert.assertNotNull(fieldVisitDataServiceResponse4);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostFilter postFilter0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostFilter();
        java.time.OffsetDateTime offsetDateTime1 = postFilter0.StartTime;
        java.lang.String str2 = postFilter0.getDescription();
        org.junit.Assert.assertNull(offsetDateTime1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
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
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutBulkEditResultGradesV2 putBulkEditResultGradesV2_34 = putBulkEditResultGradesV2_32.setDepthValue((java.lang.Double) 100.0d);
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
        java.util.List<java.lang.String> strList54 = importItem35.getFields();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItem importItem55 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItem();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_56 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray58 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList59 = new java.util.ArrayList<java.lang.String>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList59, strArray58);
        getObservationsV2_56.SpecimenIds = strList59;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags62 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray66 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList67 = new java.util.ArrayList<java.lang.String>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList67, strArray66);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags69 = putLocationTags62.setTagUniqueIds(strList67);
        getObservationsV2_56.QualityControlTypes = strList67;
        java.util.List<java.lang.String> strList71 = getObservationsV2_56.getLabReportIds();
        importItem55.Errors = getObservationsV2_56;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_73 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.util.List<java.lang.String> strList74 = getObservationsV2_73.SamplingContextTagIds;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_75 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray77 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList78 = new java.util.ArrayList<java.lang.String>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList78, strArray77);
        getObservationsV2_75.SpecimenIds = strList78;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags81 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray85 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList86 = new java.util.ArrayList<java.lang.String>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList86, strArray85);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags88 = putLocationTags81.setTagUniqueIds(strList86);
        getObservationsV2_75.QualityControlTypes = strList86;
        getObservationsV2_73.ResultGrades = strList86;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItem importItem91 = importItem55.setFields((java.util.List<java.lang.String>) strList86);
        importItem35.Fields = strList86;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutBulkEditResultGradesV2 putBulkEditResultGradesV2_93 = putBulkEditResultGradesV2_34.setSamplingLocationGroupIds((java.util.List<java.lang.String>) strList86);
        java.util.List<java.lang.String> strList94 = putBulkEditResultGradesV2_34.getLabReportIds();
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
        org.junit.Assert.assertNull(strList54);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(putLocationTags69);
        org.junit.Assert.assertNull(strList71);
        org.junit.Assert.assertNull(strList74);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(putLocationTags88);
        org.junit.Assert.assertNotNull(importItem91);
        org.junit.Assert.assertNotNull(putBulkEditResultGradesV2_93);
        org.junit.Assert.assertNull(strList94);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostImportLabReportData postImportLabReportData0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostImportLabReportData();
        java.lang.Boolean boolean1 = postImportLabReportData0.UpdateExistingResults;
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Location location0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Location();
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.AppliedTag> appliedTagList1 = location0.Tags;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Location location3 = location0.setUniqueId("MaxInstant");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Location location5 = location0.setUniqueId("9999-12-31T23:59:59.999Z");
        location5.LocationName = "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSSSSSZZZZZ";
        location5.Latitude = 0.0d;
        org.junit.Assert.assertNull(appliedTagList1);
        org.junit.Assert.assertNotNull(location3);
        org.junit.Assert.assertNotNull(location5);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutSchedule putSchedule0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutSchedule();
        java.time.OffsetDateTime offsetDateTime1 = putSchedule0.StartDate;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingLocationGroup samplingLocationGroup2 = null;
        putSchedule0.SamplingLocationGroup = samplingLocationGroup2;
        org.junit.Assert.assertNull(offsetDateTime1);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
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
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DoubleWithDisplay doubleWithDisplay12 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DoubleWithDisplay();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DoubleWithDisplay doubleWithDisplay14 = doubleWithDisplay12.setNumeric((java.lang.Double) 10.0d);
        java.lang.String str15 = doubleWithDisplay14.getDisplay();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.GageHeightReading gageHeightReading16 = gageHeightReading0.setGageHeight(doubleWithDisplay14);
        java.lang.String str17 = doubleWithDisplay14.getDisplay();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(doubleWithDisplay14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(gageHeightReading16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Acquisition acquisition0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Acquisition();
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeterSuspensionType meterSuspensionType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeterSuspensionType.AReel;
        org.junit.Assert.assertTrue("'" + meterSuspensionType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeterSuspensionType.AReel + "'", meterSuspensionType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeterSuspensionType.AReel));
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutSchedule putSchedule0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutSchedule();
        java.time.OffsetDateTime offsetDateTime1 = putSchedule0.getEndDate();
        java.time.OffsetDateTime offsetDateTime2 = putSchedule0.EndDate;
        org.junit.Assert.assertNull(offsetDateTime1);
        org.junit.Assert.assertNull(offsetDateTime2);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Schedule schedule0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Schedule();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Schedule schedule2 = schedule0.setCustomId("");
        java.time.OffsetDateTime offsetDateTime3 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Schedule schedule4 = schedule0.setStartDate(offsetDateTime3);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.RecurrenceType recurrenceType5 = com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.RecurrenceType.MONTHLY;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Schedule schedule6 = schedule4.setRecurrenceType(recurrenceType5);
        java.lang.String str7 = schedule6.Id;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.RecurrenceDayMonthlyType recurrenceDayMonthlyType8 = schedule6.getRecurrenceDayMonthly();
        org.junit.Assert.assertNotNull(schedule2);
        org.junit.Assert.assertNotNull(schedule4);
        org.junit.Assert.assertTrue("'" + recurrenceType5 + "' != '" + com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.RecurrenceType.MONTHLY + "'", recurrenceType5.equals(com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.RecurrenceType.MONTHLY));
        org.junit.Assert.assertNotNull(schedule6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(recurrenceDayMonthlyType8);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment domainObjectAttachment0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment();
        java.lang.String str1 = domainObjectAttachment0.getId();
        java.lang.String str2 = domainObjectAttachment0.getId();
        domainObjectAttachment0.Id = "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ";
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment domainObjectAttachment6 = domainObjectAttachment0.setId("hi!");
        java.lang.String str7 = domainObjectAttachment0.Id;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(domainObjectAttachment6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.RatingModelEffectiveShiftsByStageValuesServiceResponse ratingModelEffectiveShiftsByStageValuesServiceResponse0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.RatingModelEffectiveShiftsByStageValuesServiceResponse();
        java.time.Instant instant1 = ratingModelEffectiveShiftsByStageValuesServiceResponse0.Timestamp;
        org.junit.Assert.assertNull(instant1);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostDatumConvertedTimeSeries postDatumConvertedTimeSeries0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostDatumConvertedTimeSeries();
        postDatumConvertedTimeSeries0.ComputationPeriodIdentifier = "MaxInstant";
        java.lang.String str3 = postDatumConvertedTimeSeries0.ComputationPeriodIdentifier;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostDatumConvertedTimeSeries postDatumConvertedTimeSeries5 = postDatumConvertedTimeSeries0.setPublish((java.lang.Boolean) false);
        java.lang.Object obj6 = postDatumConvertedTimeSeries5.getResponseType();
        postDatumConvertedTimeSeries5.Label = "2021.4.62.0";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MaxInstant" + "'", str3, "MaxInstant");
        org.junit.Assert.assertNotNull(postDatumConvertedTimeSeries5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning$TimeSeries");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning$TimeSeries");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning$TimeSeries");
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostUserV2 postUserV2_0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostUserV2();
        postUserV2_0.Id = "https";
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabResultDetails labResultDetails0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabResultDetails();
        java.lang.String str1 = labResultDetails0.DilutionFactor;
        java.time.OffsetDateTime offsetDateTime2 = labResultDetails0.DateReceived;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(offsetDateTime2);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ChannelMaterialType channelMaterialType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ChannelMaterialType.CobblesBoulders;
        org.junit.Assert.assertTrue("'" + channelMaterialType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ChannelMaterialType.CobblesBoulders + "'", channelMaterialType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ChannelMaterialType.CobblesBoulders));
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.GetApprovalLevel getApprovalLevel0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.GetApprovalLevel();
        getApprovalLevel0.ApprovalLevel = 0L;
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.InterpolationTypeEntry interpolationTypeEntry0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.InterpolationTypeEntry();
        interpolationTypeEntry0.Value = (-1);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.InterpolationTypeEntry interpolationTypeEntry4 = interpolationTypeEntry0.setValue((java.lang.Integer) 1);
        java.lang.String str5 = interpolationTypeEntry0.getInterpolationType();
        org.junit.Assert.assertNotNull(interpolationTypeEntry4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ThresholdTypeRequestBase thresholdTypeRequestBase0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ThresholdTypeRequestBase();
        java.lang.String str1 = thresholdTypeRequestBase0.Description;
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutFieldDataPlugin putFieldDataPlugin0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutFieldDataPlugin();
        putFieldDataPlugin0.PluginPriority = 100;
        java.lang.String str3 = putFieldDataPlugin0.getUniqueId();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate specimenTemplate0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate();
        specimenTemplate0.CustomId = "hi!";
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate specimenTemplate4 = specimenTemplate0.setId("hi!");
        java.lang.String str5 = specimenTemplate0.getCustomId();
        org.junit.Assert.assertNotNull(specimenTemplate4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutTag putTag0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutTag();
        java.lang.String str1 = putTag0.Name;
        java.lang.String str2 = putTag0.getName();
        java.lang.String str3 = putTag0.Description;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes4 = putTag0.AuditAttributes;
        putTag0.Description = "MinDuration";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(auditAttributes4);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.GetLocationFolder getLocationFolder0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.GetLocationFolder();
        getLocationFolder0.LocationFolderUniqueId = "'.'SSSSSSS";
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
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
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_17 = getObservationsV2_0.setSpecimenName("/AQUARIUS/Acquisition/v2://9999-12-31T23:59:59.999Z");
        java.util.List<java.lang.String> strList18 = getObservationsV2_17.getObservedPropertyIds();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(putLocationTags13);
        org.junit.Assert.assertNull(strList15);
        org.junit.Assert.assertNotNull(getObservationsV2_17);
        org.junit.Assert.assertNull(strList18);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutOpenIdConnectUser putOpenIdConnectUser0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutOpenIdConnectUser();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutUserBase putUserBase2 = putOpenIdConnectUser0.setUniqueId("MaxInstant");
        java.lang.Boolean boolean3 = putUserBase2.CanLaunchRatingDevelopmentToolbox;
        org.junit.Assert.assertNotNull(putUserBase2);
        org.junit.Assert.assertNull(boolean3);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
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
        java.lang.String str13 = labResultDetails6.AnalysisComment;
        org.junit.Assert.assertNotNull(labResultDetails2);
        org.junit.Assert.assertNotNull(labResultDetails4);
        org.junit.Assert.assertNotNull(labResultDetails6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/AQUARIUS/Acquisition/v2" + "'", str7, "/AQUARIUS/Acquisition/v2");
        org.junit.Assert.assertNull(laboratory10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "/AQUARIUS/Acquisition/v2" + "'", str13, "/AQUARIUS/Acquisition/v2");
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagDefinition tagDefinition0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagDefinition();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagValueType tagValueType1 = null;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagDefinition tagDefinition2 = tagDefinition0.setValueType(tagValueType1);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagDefinition tagDefinition4 = tagDefinition0.setAppliesToAttachments((java.lang.Boolean) false);
        java.lang.Boolean boolean5 = tagDefinition0.isAppliesToLocationNotes();
        org.junit.Assert.assertNotNull(tagDefinition2);
        org.junit.Assert.assertNotNull(tagDefinition4);
        org.junit.Assert.assertNull(boolean5);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostStandard postStandard0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostStandard();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostStandard postStandard2 = postStandard0.setCustomId("/AQUARIUS/Provisioning/v1");
        postStandard0.Active = true;
        org.junit.Assert.assertNotNull(postStandard2);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
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
        java.time.Instant instant46 = getObservationsV2_45.getEndResultTime();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_47 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray50 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList51 = new java.util.ArrayList<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList51, strArray50);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_53 = getObservationsV2_47.setDataClassifications((java.util.List<java.lang.String>) strList51);
        getObservationsV2_53.DepthUnitCustomId = "hi!";
        java.lang.String str56 = getObservationsV2_53.CustomId;
        java.util.List<java.lang.String> strList57 = getObservationsV2_53.getSearch();
        java.util.List<java.lang.String> strList58 = getObservationsV2_53.getAnalysisMethodSimpleIds();
        java.lang.String[] strArray62 = new java.lang.String[] { "hi!", "", "9999-12-31T23:59:59.999Z" };
        java.util.ArrayList<java.lang.String> strList63 = new java.util.ArrayList<java.lang.String>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList63, strArray62);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_65 = getObservationsV2_53.setSamplingContextTagIds((java.util.List<java.lang.String>) strList63);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DeleteFieldVisits deleteFieldVisits66 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DeleteFieldVisits();
        java.lang.String str67 = deleteFieldVisits66.Sort;
        deleteFieldVisits66.Sort = "9999-12-31T23:59:59.999Z";
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_70 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray73 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList74 = new java.util.ArrayList<java.lang.String>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList74, strArray73);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_76 = getObservationsV2_70.setDataClassifications((java.util.List<java.lang.String>) strList74);
        java.util.List<java.lang.String> strList77 = getObservationsV2_70.ResultGrades;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary78 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary();
        dischargeSummary78.Reviewer = "";
        java.time.Instant instant81 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        dischargeSummary78.MeasurementTime = instant81;
        getObservationsV2_70.StartResultTime = instant81;
        java.lang.String[] strArray93 = new java.lang.String[] { "https", "/AQUARIUS/Provisioning/v1", "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ", "2021.4.62.0", "hi!", "2021.4.62.0", "2021.4.62.0", "/AQUARIUS/Acquisition/v2", "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ" };
        java.util.ArrayList<java.lang.String> strList94 = new java.util.ArrayList<java.lang.String>();
        boolean boolean95 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList94, strArray93);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_96 = getObservationsV2_70.setAnalyticalGroupIds((java.util.List<java.lang.String>) strList94);
        deleteFieldVisits66.PlanningStatuses = strList94;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_98 = getObservationsV2_65.setSamplingLocationIds((java.util.List<java.lang.String>) strList94);
        getObservationsV2_45.AnalyticalGroupIds = strList94;
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
        org.junit.Assert.assertNull(instant46);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(getObservationsV2_53);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNull(strList57);
        org.junit.Assert.assertNull(strList58);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(getObservationsV2_65);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(getObservationsV2_76);
        org.junit.Assert.assertNull(strList77);
        org.junit.Assert.assertNotNull(instant81);
        org.junit.Assert.assertNotNull(strArray93);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertNotNull(getObservationsV2_96);
        org.junit.Assert.assertNotNull(getObservationsV2_98);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_6 = getObservationsV2_0.setDataClassifications((java.util.List<java.lang.String>) strList4);
        getObservationsV2_6.DepthUnitCustomId = "hi!";
        java.lang.String str9 = getObservationsV2_6.CustomId;
        java.util.List<java.lang.String> strList10 = getObservationsV2_6.getSearch();
        java.util.List<java.lang.String> strList11 = getObservationsV2_6.getAnalysisMethodSimpleIds();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "", "9999-12-31T23:59:59.999Z" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_18 = getObservationsV2_6.setSamplingContextTagIds((java.util.List<java.lang.String>) strList16);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.FieldResultType fieldResultType19 = null;
        getObservationsV2_18.FieldResultType = fieldResultType19;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(getObservationsV2_6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strList10);
        org.junit.Assert.assertNull(strList11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(getObservationsV2_18);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItem importItem0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItem();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutQualifierGroup putQualifierGroup1 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutQualifierGroup();
        putQualifierGroup1.Identifier = "";
        java.lang.Object obj4 = putQualifierGroup1.getResponseType();
        importItem0.Errors = obj4;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.PointVelocityDischargeActivity pointVelocityDischargeActivity6 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.PointVelocityDischargeActivity();
        java.lang.String str7 = pointVelocityDischargeActivity6.SoftwareVersion;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.PointVelocityDischargeActivity pointVelocityDischargeActivity9 = pointVelocityDischargeActivity6.setIsValid((java.lang.Boolean) false);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.PointVelocityDischargeActivity pointVelocityDischargeActivity11 = pointVelocityDischargeActivity9.setMeterEquation("yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSSSSSZZZZZ");
        java.lang.Boolean boolean12 = pointVelocityDischargeActivity11.isMeterInspectedAfter();
        importItem0.Errors = boolean12;
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning$QualifierGroupResponse");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning$QualifierGroupResponse");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning$QualifierGroupResponse");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(pointVelocityDischargeActivity9);
        org.junit.Assert.assertNotNull(pointVelocityDischargeActivity11);
        org.junit.Assert.assertNull(boolean12);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.VerticalType verticalType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.VerticalType.MidRiver;
        org.junit.Assert.assertTrue("'" + verticalType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.VerticalType.MidRiver + "'", verticalType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.VerticalType.MidRiver));
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary2 = dischargeSummary0.setPublish((java.lang.Boolean) false);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.QuantityWithDisplay quantityWithDisplay3 = null;
        dischargeSummary0.MeanGageHeight = quantityWithDisplay3;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DoubleWithDisplay doubleWithDisplay5 = dischargeSummary0.DurationInHours;
        dischargeSummary0.GradeCode = (-1);
        org.junit.Assert.assertNotNull(dischargeSummary2);
        org.junit.Assert.assertNull(doubleWithDisplay5);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary();
        dischargeSummary0.Reviewer = "";
        java.lang.String str3 = dischargeSummary0.getReviewer();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Acquisition.PostReportAttachment postReportAttachment0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Acquisition.PostReportAttachment();
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Acquisition.ApplyTagRequest> applyTagRequestList1 = postReportAttachment0.Tags;
        org.junit.Assert.assertNull(applyTagRequestList1);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ExpandedStageTableServiceRequest expandedStageTableServiceRequest0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ExpandedStageTableServiceRequest();
        java.lang.Object obj1 = expandedStageTableServiceRequest0.getResponseType();
        expandedStageTableServiceRequest0.StepSize = 0.0d;
        java.lang.String str4 = expandedStageTableServiceRequest0.TimeSeriesUniqueId;
        java.lang.Double double5 = expandedStageTableServiceRequest0.getStartValue();
        expandedStageTableServiceRequest0.TimeSeriesUniqueId = "2021.4.62.0";
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$ExpandedStageTableServiceResponse");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$ExpandedStageTableServiceResponse");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$ExpandedStageTableServiceResponse");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(double5);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.StandardDatum standardDatum0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.StandardDatum();
        standardDatum0.Identifier = "'.'SSSSSSS";
        standardDatum0.Identifier = "'.'SSSSSSS";
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutUserAuthBase putUserAuthBase0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutUserAuthBase();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutUserAuthBase putUserAuthBase2 = putUserAuthBase0.setUniqueId("MaxInstant");
        java.lang.String str3 = putUserAuthBase2.UniqueId;
        org.junit.Assert.assertNotNull(putUserAuthBase2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MaxInstant" + "'", str3, "MaxInstant");
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitDataByLocationServiceRequest fieldVisitDataByLocationServiceRequest0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitDataByLocationServiceRequest();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitDataByLocationServiceRequest fieldVisitDataByLocationServiceRequest2 = fieldVisitDataByLocationServiceRequest0.setIncludeNodeDetails((java.lang.Boolean) true);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags3 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray7 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags10 = putLocationTags3.setTagUniqueIds(strList8);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitDataByLocationServiceRequest fieldVisitDataByLocationServiceRequest11 = fieldVisitDataByLocationServiceRequest2.setParameters(strList8);
        java.lang.String str12 = fieldVisitDataByLocationServiceRequest2.ConvertToStandardReferenceDatum;
        org.junit.Assert.assertNotNull(fieldVisitDataByLocationServiceRequest2);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(putLocationTags10);
        org.junit.Assert.assertNotNull(fieldVisitDataByLocationServiceRequest11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CorrectionType correctionType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CorrectionType.ThresholdSuppression;
        org.junit.Assert.assertTrue("'" + correctionType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CorrectionType.ThresholdSuppression + "'", correctionType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CorrectionType.ThresholdSuppression));
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.GetActiveDirectoryUser getActiveDirectoryUser0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.GetActiveDirectoryUser();
        java.lang.String str1 = getActiveDirectoryUser0.UniqueId;
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostDatumConvertedTimeSeries postDatumConvertedTimeSeries0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostDatumConvertedTimeSeries();
        postDatumConvertedTimeSeries0.SourceIsLocalAssumedDatum = false;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostDatumConvertedTimeSeries postDatumConvertedTimeSeries4 = postDatumConvertedTimeSeries0.setComputationPeriodIdentifier("/AQUARIUS/Acquisition/v2://9999-12-31T23:59:59.999Z");
        java.lang.Boolean boolean5 = postDatumConvertedTimeSeries0.isPublish();
        org.junit.Assert.assertNotNull(postDatumConvertedTimeSeries4);
        org.junit.Assert.assertNull(boolean5);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        java.lang.String str0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.IIdentifySetting.Group;
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetAnalysisMethod getAnalysisMethod0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetAnalysisMethod();
        java.lang.Object obj1 = getAnalysisMethod0.getResponseType();
        java.lang.Object obj2 = getAnalysisMethod0.getResponseType();
        java.lang.Object obj3 = getAnalysisMethod0.getResponseType();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$AnalysisMethod");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$AnalysisMethod");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$AnalysisMethod");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$AnalysisMethod");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$AnalysisMethod");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$AnalysisMethod");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$AnalysisMethod");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$AnalysisMethod");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$AnalysisMethod");
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingLocationSummary samplingLocationSummary0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingLocationSummary();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingLocationSummary samplingLocationSummary2 = samplingLocationSummary0.setFieldVisitCount((java.lang.Integer) (-1));
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.FieldVisitSummaryRepresentation fieldVisitSummaryRepresentation3 = samplingLocationSummary2.getLatestFieldVisit();
        samplingLocationSummary2.FieldVisitCount = 100;
        org.junit.Assert.assertNotNull(samplingLocationSummary2);
        org.junit.Assert.assertNull(fieldVisitSummaryRepresentation3);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingPlanPlannedActivity samplingPlanPlannedActivity0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingPlanPlannedActivity();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes1 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingPlanPlannedActivity samplingPlanPlannedActivity2 = samplingPlanPlannedActivity0.setAuditAttributes(auditAttributes1);
        java.lang.String str3 = samplingPlanPlannedActivity2.Id;
        org.junit.Assert.assertNotNull(samplingPlanPlannedActivity2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ReferencePointPeriod referencePointPeriod0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ReferencePointPeriod();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ReferencePointPeriod referencePointPeriod2 = referencePointPeriod0.setStandardIdentifier("9999-12-31T23:59:59.999Z");
        referencePointPeriod2.IsMeasuredAgainstLocalAssumedDatum = false;
        referencePointPeriod2.Unit = "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ";
        referencePointPeriod2.Uncertainty = 0.0d;
        org.junit.Assert.assertNotNull(referencePointPeriod2);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Sensor sensor0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Sensor();
        java.time.Instant instant1 = sensor0.getLastModifiedUtc();
        java.time.Instant instant2 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Sensor sensor3 = sensor0.setLastModifiedUtc(instant2);
        java.lang.String str4 = sensor0.ParameterId;
        java.lang.String str5 = sensor0.getUniqueId();
        org.junit.Assert.assertNull(instant1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(sensor3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes2 = auditAttributes0.setCreationUserProfileId("'.'SSSSSSS");
        java.lang.String str3 = auditAttributes0.ModificationUserProfileId;
        org.junit.Assert.assertNotNull(auditAttributes2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.TagApplicability tagApplicability0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.TagApplicability.AppliesToAttachments;
        org.junit.Assert.assertTrue("'" + tagApplicability0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.TagApplicability.AppliesToAttachments + "'", tagApplicability0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.TagApplicability.AppliesToAttachments));
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Calibration calibration0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Calibration();
        java.lang.Double double1 = calibration0.getRangeStart();
        calibration0.Intercept = 0.0d;
        calibration0.RangeEnd = 1.0d;
        calibration0.Slope = 100.0d;
        calibration0.RangeStart = 10.0d;
        org.junit.Assert.assertNull(double1);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.StandardReferenceDatum standardReferenceDatum0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.StandardReferenceDatum();
        java.lang.String str1 = standardReferenceDatum0.StandardIdentifier;
        standardReferenceDatum0.StandardIdentifier = "";
        standardReferenceDatum0.Comments = "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ";
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeActivity> dischargeActivityList0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.IFieldVisitData.DischargeActivities;
        org.junit.Assert.assertNull(dischargeActivityList0);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutActivityTemplate putActivityTemplate0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutActivityTemplate();
        java.lang.String str1 = putActivityTemplate0.getId();
        putActivityTemplate0.Id = "https";
        putActivityTemplate0.CustomId = "http";
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservationImportSummary observationImportSummary0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservationImportSummary();
        observationImportSummary0.UpdateCount = (-1);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservationImportSummary observationImportSummary4 = observationImportSummary0.setUpdateCount((java.lang.Integer) 10);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservationImportSummary observationImportSummary6 = observationImportSummary4.setInvalidRowsCsvUrl("");
        observationImportSummary6.UpdateCount = 1;
        org.junit.Assert.assertNotNull(observationImportSummary4);
        org.junit.Assert.assertNotNull(observationImportSummary6);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesThresholdPeriod timeSeriesThresholdPeriod0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesThresholdPeriod();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesThresholdPeriod timeSeriesThresholdPeriod2 = timeSeriesThresholdPeriod0.setReferenceValue((java.lang.Double) 0.0d);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescription locationDescription3 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescription();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescription locationDescription5 = locationDescription3.setIdentifier("");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ControlConditionActivity controlConditionActivity6 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ControlConditionActivity();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ControlCleanedType controlCleanedType7 = null;
        controlConditionActivity6.ControlCleaned = controlCleanedType7;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse9 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse();
        java.time.Instant instant10 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse11 = locationDescriptionListServiceResponse9.setNextToken(instant10);
        controlConditionActivity6.DateCleaned = instant10;
        locationDescription5.LastModified = instant10;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesThresholdPeriod timeSeriesThresholdPeriod14 = timeSeriesThresholdPeriod2.setAppliedTime(instant10);
        java.time.Instant instant15 = timeSeriesThresholdPeriod2.getEndTime();
        org.junit.Assert.assertNotNull(timeSeriesThresholdPeriod2);
        org.junit.Assert.assertNotNull(locationDescription5);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(locationDescriptionListServiceResponse11);
        org.junit.Assert.assertNotNull(timeSeriesThresholdPeriod14);
        org.junit.Assert.assertNull(instant15);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        java.lang.String str0 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.JsonMaxValue;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "MaxInstant" + "'", str0, "MaxInstant");
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Sensor sensor0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Sensor();
        java.time.Instant instant1 = sensor0.getLastModifiedUtc();
        java.time.Instant instant2 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Sensor sensor3 = sensor0.setLastModifiedUtc(instant2);
        java.lang.String str4 = sensor0.ParameterId;
        java.lang.String str5 = sensor0.getLocationUniqueId();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Sensor sensor7 = sensor0.setLocationUniqueId("MinDuration");
        org.junit.Assert.assertNull(instant1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(sensor3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(sensor7);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Setting setting0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Setting();
        java.lang.String str1 = setting0.getKey();
        java.lang.String str2 = setting0.getGroup();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Setting setting4 = setting0.setIsSystem((java.lang.Boolean) false);
        setting0.Key = "/AQUARIUS/Provisioning/v1";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(setting4);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ChartData chartData0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ChartData();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingLocation samplingLocation1 = chartData0.SamplingLocation;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.UnitGroupWithUnits unitGroupWithUnits2 = null;
        chartData0.UnitGroupWithUnits = unitGroupWithUnits2;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedProperty observedProperty4 = chartData0.getObservedProperty();
        org.junit.Assert.assertNull(samplingLocation1);
        org.junit.Assert.assertNull(observedProperty4);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.DeleteStandardReferenceDatum deleteStandardReferenceDatum0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.DeleteStandardReferenceDatum();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.DeleteStandardReferenceDatum deleteStandardReferenceDatum2 = deleteStandardReferenceDatum0.setStandardIdentifier("MaxInstant");
        deleteStandardReferenceDatum2.StandardIdentifier = "hi!";
        org.junit.Assert.assertNotNull(deleteStandardReferenceDatum2);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.StandardReferenceDatum standardReferenceDatum0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.StandardReferenceDatum();
        java.lang.String str1 = standardReferenceDatum0.StandardIdentifier;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.StandardReferenceDatum standardReferenceDatum3 = standardReferenceDatum0.setUncertainty((java.lang.Double) 0.0d);
        java.lang.String str4 = standardReferenceDatum0.StandardIdentifier;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(standardReferenceDatum3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CorrectionProcessingOrder correctionProcessingOrder0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CorrectionProcessingOrder.PostProcessing;
        org.junit.Assert.assertTrue("'" + correctionProcessingOrder0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CorrectionProcessingOrder.PostProcessing + "'", correctionProcessingOrder0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CorrectionProcessingOrder.PostProcessing));
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ActivityWithDetailsType activityWithDetailsType0 = com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ActivityWithDetailsType.INDEX_CALCULATION;
        org.junit.Assert.assertTrue("'" + activityWithDetailsType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ActivityWithDetailsType.INDEX_CALCULATION + "'", activityWithDetailsType0.equals(com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ActivityWithDetailsType.INDEX_CALCULATION));
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PlannedActivityActivityType plannedActivityActivityType0 = com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PlannedActivityActivityType.INDEX_CALCULATION;
        org.junit.Assert.assertTrue("'" + plannedActivityActivityType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PlannedActivityActivityType.INDEX_CALCULATION + "'", plannedActivityActivityType0.equals(com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PlannedActivityActivityType.INDEX_CALCULATION));
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.GapToleranceOperation gapToleranceOperation0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.GapToleranceOperation();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MetadataChangeOperationType metadataChangeOperationType1 = gapToleranceOperation0.OperationType;
        java.lang.Integer int2 = gapToleranceOperation0.StackPosition;
        org.junit.Assert.assertNull(metadataChangeOperationType1);
        org.junit.Assert.assertNull(int2);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeasurementLocationToGageType measurementLocationToGageType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeasurementLocationToGageType.AtTheGage;
        org.junit.Assert.assertTrue("'" + measurementLocationToGageType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeasurementLocationToGageType.AtTheGage + "'", measurementLocationToGageType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeasurementLocationToGageType.AtTheGage));
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ActivityType activityType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ActivityType.GageHeightAtZeroFlow;
        org.junit.Assert.assertTrue("'" + activityType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ActivityType.GageHeightAtZeroFlow + "'", activityType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ActivityType.GageHeightAtZeroFlow));
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        java.lang.String str2 = com.aquaticinformatics.aquarius.sdk.helpers.SdkServiceClient.resolveServerWithDefaultScheme("/AQUARIUS/Provisioning/v1", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!:///AQUARIUS/Provisioning/v1" + "'", str2, "hi!:///AQUARIUS/Provisioning/v1");
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Unit unit0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Unit();
        java.lang.String str1 = unit0.getUnitIdentifier();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
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
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Taxon taxon10 = observation6.getRelatedTaxon();
        java.lang.String str11 = net.servicestack.client.JsonServiceClient.GetSendMethod((java.lang.Object) taxon10);
        org.junit.Assert.assertNotNull(observation2);
        org.junit.Assert.assertNotNull(observation6);
        org.junit.Assert.assertNull(offsetDateTime7);
        org.junit.Assert.assertNull(taxon10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "POST" + "'", str11, "POST");
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        java.lang.String str0 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.JsonMinValue;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "MinInstant" + "'", str0, "MinInstant");
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.AttachmentType attachmentType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.AttachmentType.Audio;
        org.junit.Assert.assertTrue("'" + attachmentType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.AttachmentType.Audio + "'", attachmentType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.AttachmentType.Audio));
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.GetKeepAlive getKeepAlive0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.GetKeepAlive();
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        java.lang.String str0 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.DateAndTimePattern;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "yyyy'-'MM'-'dd'T'HH':'mm':'ss" + "'", str0, "yyyy'-'MM'-'dd'T'HH':'mm':'ss");
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetUnit getUnit0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetUnit();
        getUnit0.Id = "2021.4.62.0";
        getUnit0.Id = "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ";
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetUnit getUnit6 = getUnit0.setId("");
        java.lang.String str7 = getUnit6.Id;
        org.junit.Assert.assertNotNull(getUnit6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ChartDataPoint chartDataPoint0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ChartDataPoint();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ChartDataPoint chartDataPoint2 = chartDataPoint0.setMdlValueUnitCustomId("MaxInstant");
        java.lang.Double double3 = chartDataPoint2.Value;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ResultDetectionCondition resultDetectionCondition4 = null;
        chartDataPoint2.ResultDetectionCondition = resultDetectionCondition4;
        java.lang.String str6 = chartDataPoint2.MdlValueUnitCustomId;
        org.junit.Assert.assertNotNull(chartDataPoint2);
        org.junit.Assert.assertNull(double3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MaxInstant" + "'", str6, "MaxInstant");
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Grade grade0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Grade();
        grade0.GradeCode = "/AQUARIUS";
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.RoleFlattened roleFlattened0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.RoleFlattened();
        java.lang.Boolean boolean1 = roleFlattened0.CanEditAppendConfigurations;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.RoleFlattened roleFlattened3 = roleFlattened0.setUniqueId("9999-12-31T23:59:59.999Z");
        java.lang.Boolean boolean4 = roleFlattened3.CanAddAppendConfigurations;
        java.lang.String str5 = roleFlattened3.getName();
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNotNull(roleFlattened3);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostDetectioncondition postDetectioncondition0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostDetectioncondition();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes1 = postDetectioncondition0.getAuditAttributes();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostDetectioncondition postDetectioncondition3 = postDetectioncondition0.setId("9999-12-31T23:59:59.999Z");
        java.lang.String str4 = postDetectioncondition3.getDescription();
        java.lang.String str5 = postDetectioncondition3.getCustomId();
        java.lang.String str6 = postDetectioncondition3.getCustomId();
        org.junit.Assert.assertNull(auditAttributes1);
        org.junit.Assert.assertNotNull(postDetectioncondition3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.InspectionType inspectionType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.InspectionType.BubbleGage;
        org.junit.Assert.assertTrue("'" + inspectionType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.InspectionType.BubbleGage + "'", inspectionType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.InspectionType.BubbleGage));
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ControlConditionActivity controlConditionActivity0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ControlConditionActivity();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ControlCleanedType controlCleanedType1 = null;
        controlConditionActivity0.ControlCleaned = controlCleanedType1;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse3 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse();
        java.time.Instant instant4 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse5 = locationDescriptionListServiceResponse3.setNextToken(instant4);
        controlConditionActivity0.DateCleaned = instant4;
        controlConditionActivity0.Comments = "/AQUARIUS";
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(locationDescriptionListServiceResponse5);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabResultDetails labResultDetails0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabResultDetails();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabResultDetails labResultDetails2 = labResultDetails0.setAnalysisComment("/AQUARIUS/Acquisition/v2");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes3 = null;
        labResultDetails2.AuditAttributes = auditAttributes3;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes5 = labResultDetails2.getAuditAttributes();
        org.junit.Assert.assertNotNull(labResultDetails2);
        org.junit.Assert.assertNull(auditAttributes5);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.FixedDropDownListItem fixedDropDownListItem0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.FixedDropDownListItem();
        java.lang.String str1 = fixedDropDownListItem0.getDropDownListDisplayName();
        java.lang.String str2 = fixedDropDownListItem0.DisplayName;
        java.lang.String str3 = fixedDropDownListItem0.getDisplayName();
        fixedDropDownListItem0.Id = "/AQUARIUS/Provisioning/v1";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportType importType0 = com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportType.TAXON_CSV;
        org.junit.Assert.assertTrue("'" + importType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportType.TAXON_CSV + "'", importType0.equals(com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportType.TAXON_CSV));
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetChartDataV2 getChartDataV2_0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetChartDataV2();
        java.lang.String str1 = getChartDataV2_0.getActivityCustomId();
        java.util.List<java.lang.String> strList2 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetChartDataV2 getChartDataV2_3 = getChartDataV2_0.setSearch(strList2);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_4 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_10 = getObservationsV2_4.setDataClassifications((java.util.List<java.lang.String>) strList8);
        java.util.List<java.lang.String> strList11 = getObservationsV2_4.ResultGrades;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary12 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary();
        dischargeSummary12.Reviewer = "";
        java.time.Instant instant15 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        dischargeSummary12.MeasurementTime = instant15;
        getObservationsV2_4.StartResultTime = instant15;
        java.lang.String[] strArray27 = new java.lang.String[] { "https", "/AQUARIUS/Provisioning/v1", "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ", "2021.4.62.0", "hi!", "2021.4.62.0", "2021.4.62.0", "/AQUARIUS/Acquisition/v2", "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_30 = getObservationsV2_4.setAnalyticalGroupIds((java.util.List<java.lang.String>) strList28);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescription locationDescription31 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescription();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescription locationDescription33 = locationDescription31.setIdentifier("");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ControlConditionActivity controlConditionActivity34 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ControlConditionActivity();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ControlCleanedType controlCleanedType35 = null;
        controlConditionActivity34.ControlCleaned = controlCleanedType35;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse37 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse();
        java.time.Instant instant38 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse39 = locationDescriptionListServiceResponse37.setNextToken(instant38);
        controlConditionActivity34.DateCleaned = instant38;
        locationDescription33.LastModified = instant38;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_42 = getObservationsV2_30.setStartResultTime(instant38);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetChartDataV2 getChartDataV2_43 = getChartDataV2_0.setEndObservedTime(instant38);
        java.lang.String str44 = getChartDataV2_0.FilterId;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(getChartDataV2_3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(getObservationsV2_10);
        org.junit.Assert.assertNull(strList11);
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(getObservationsV2_30);
        org.junit.Assert.assertNotNull(locationDescription33);
        org.junit.Assert.assertNotNull(instant38);
        org.junit.Assert.assertNotNull(locationDescriptionListServiceResponse39);
        org.junit.Assert.assertNotNull(getObservationsV2_42);
        org.junit.Assert.assertNotNull(getChartDataV2_43);
        org.junit.Assert.assertNull(str44);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        java.lang.Boolean boolean0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.IFieldVisitDataRequest.IncludeInvalidActivities;
        org.junit.Assert.assertNull(boolean0);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.PointVelocityDischargeActivity pointVelocityDischargeActivity0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.PointVelocityDischargeActivity();
        java.lang.String str1 = pointVelocityDischargeActivity0.SoftwareVersion;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.PointVelocityDischargeActivity pointVelocityDischargeActivity3 = pointVelocityDischargeActivity0.setIsValid((java.lang.Boolean) false);
        pointVelocityDischargeActivity0.NumberOfPanels = 10;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(pointVelocityDischargeActivity3);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescription locationDescription0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescription();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescription locationDescription2 = locationDescription0.setIdentifier("");
        locationDescription2.UtcOffset = 1.0d;
        java.lang.Boolean boolean5 = locationDescription2.getIsExternalLocation();
        java.lang.String str6 = locationDescription2.getName();
        locationDescription2.Identifier = "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSSSSSZZZZZ";
        locationDescription2.Identifier = "MaxInstant";
        org.junit.Assert.assertNotNull(locationDescription2);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.AttachmentType attachmentType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.AttachmentType.Hfc;
        org.junit.Assert.assertTrue("'" + attachmentType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.AttachmentType.Hfc + "'", attachmentType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.AttachmentType.Hfc));
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        // The following exception was thrown during execution in test generation
        try {
            java.time.Instant instant1 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.parse("POST");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'POST' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
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
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Taxon taxon10 = observation6.getRelatedTaxon();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.TaxonomicResult taxonomicResult11 = observation6.TaxonomicResult;
        org.junit.Assert.assertNotNull(observation2);
        org.junit.Assert.assertNotNull(observation6);
        org.junit.Assert.assertNull(offsetDateTime7);
        org.junit.Assert.assertNull(taxon10);
        org.junit.Assert.assertNull(taxonomicResult11);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ChartDataPoint chartDataPoint0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ChartDataPoint();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ChartDataPoint chartDataPoint2 = chartDataPoint0.setMdlValueUnitCustomId("MaxInstant");
        java.lang.String str3 = chartDataPoint0.DepthUnitCustomId;
        java.lang.String str4 = chartDataPoint0.DepthUnitCustomId;
        org.junit.Assert.assertNotNull(chartDataPoint2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutTag putTag0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutTag();
        java.lang.String str1 = putTag0.Name;
        java.lang.String str2 = putTag0.getName();
        java.lang.String str3 = putTag0.Description;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes4 = putTag0.AuditAttributes;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutTag putTag6 = putTag0.setDescription("MaxInstant");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate specimenTemplate7 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate specimenTemplate9 = specimenTemplate7.setCustomId("hi!");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PreservativeType preservativeType10 = com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PreservativeType.SODIUM_AZIDE;
        specimenTemplate9.Preservative = preservativeType10;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabResultDetails labResultDetails12 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabResultDetails();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabResultDetails labResultDetails14 = labResultDetails12.setAnalysisComment("/AQUARIUS/Acquisition/v2");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes15 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabResultDetails labResultDetails16 = labResultDetails14.setAuditAttributes(auditAttributes15);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenTemplate specimenTemplate17 = specimenTemplate9.setAuditAttributes(auditAttributes15);
        putTag6.AuditAttributes = auditAttributes15;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(auditAttributes4);
        org.junit.Assert.assertNotNull(putTag6);
        org.junit.Assert.assertNotNull(specimenTemplate9);
        org.junit.Assert.assertTrue("'" + preservativeType10 + "' != '" + com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PreservativeType.SODIUM_AZIDE + "'", preservativeType10.equals(com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PreservativeType.SODIUM_AZIDE));
        org.junit.Assert.assertNotNull(labResultDetails14);
        org.junit.Assert.assertNotNull(labResultDetails16);
        org.junit.Assert.assertNotNull(specimenTemplate17);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        java.lang.String str0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.IPostTimeSeriesRequest.SubLocationIdentifier;
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Sensor sensor0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Sensor();
        java.time.Instant instant1 = sensor0.getLastModifiedUtc();
        java.time.Instant instant2 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Sensor sensor3 = sensor0.setLastModifiedUtc(instant2);
        java.lang.String str4 = sensor0.ParameterId;
        java.lang.String str5 = sensor0.getLocationUniqueId();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Sensor sensor7 = sensor0.setComments("");
        java.lang.String str8 = sensor0.getUniqueId();
        java.lang.String str9 = sensor0.MethodCode;
        org.junit.Assert.assertNull(instant1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(sensor3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(sensor7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ActivityType activityType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ActivityType.DischargeOtherMethod;
        org.junit.Assert.assertTrue("'" + activityType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ActivityType.DischargeOtherMethod + "'", activityType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ActivityType.DischargeOtherMethod));
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CompletedWork completedWork0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CompletedWork();
        java.lang.Boolean boolean1 = completedWork0.isSafetyInspectionPerformed();
        completedWork0.CollectionAgency = "9999-12-31T23:59:59.999Z";
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ReferencePointPeriod referencePointPeriod0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ReferencePointPeriod();
        java.lang.String str1 = referencePointPeriod0.AppliedByUser;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ReferencePointPeriodBase referencePointPeriodBase3 = referencePointPeriod0.setIsMeasuredAgainstLocalAssumedDatum((java.lang.Boolean) true);
        referencePointPeriod0.Uncertainty = 10.0d;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ReferencePointPeriodBase referencePointPeriodBase7 = referencePointPeriod0.setStandardIdentifier("hi!");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ReferencePointPeriodBase referencePointPeriodBase9 = referencePointPeriod0.setMethod("'.'SSSSSSS");
        java.time.Instant instant10 = referencePointPeriodBase9.getValidFrom();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(referencePointPeriodBase3);
        org.junit.Assert.assertNotNull(referencePointPeriodBase7);
        org.junit.Assert.assertNotNull(referencePointPeriodBase9);
        org.junit.Assert.assertNull(instant10);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.InspectionActivity inspectionActivity0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.InspectionActivity();
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Inspection> inspectionList1 = inspectionActivity0.getInspections();
        java.lang.String str2 = inspectionActivity0.Party;
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Reading> readingList3 = inspectionActivity0.Readings;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.InspectionActivity inspectionActivity5 = inspectionActivity0.setParty("https");
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CalibrationCheck> calibrationCheckList6 = inspectionActivity0.getCalibrationChecks();
        java.lang.Boolean boolean7 = inspectionActivity0.IsValid;
        org.junit.Assert.assertNull(inspectionList1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(readingList3);
        org.junit.Assert.assertNotNull(inspectionActivity5);
        org.junit.Assert.assertNull(calibrationCheckList6);
        org.junit.Assert.assertNull(boolean7);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostExtendedAttribute postExtendedAttribute0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostExtendedAttribute();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DataType dataType1 = postExtendedAttribute0.getDataType();
        java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ExtendedAttributeListItem> extendedAttributeListItemList2 = postExtendedAttribute0.DropDownListItems;
        org.junit.Assert.assertNull(dataType1);
        org.junit.Assert.assertNull(extendedAttributeListItemList2);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ChartData chartData0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ChartData();
        java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ChartDataPoint> chartDataPointList1 = chartData0.DataPoints;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.UnitGroupWithUnits unitGroupWithUnits2 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ChartData chartData3 = chartData0.setDepthUnitGroupWithUnits(unitGroupWithUnits2);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingLocation samplingLocation4 = chartData0.SamplingLocation;
        org.junit.Assert.assertNull(chartDataPointList1);
        org.junit.Assert.assertNotNull(chartData3);
        org.junit.Assert.assertNull(samplingLocation4);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        java.time.Duration duration0 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.DurationDeserializer.MinConcreteValue;
        java.lang.String str1 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.DurationSerializer.format(duration0);
        org.junit.Assert.assertNotNull(duration0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-PT87591240H" + "'", str1, "-PT87591240H");
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostAccessGroup postAccessGroup0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostAccessGroup();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes1 = postAccessGroup0.getAuditAttributes();
        org.junit.Assert.assertNull(auditAttributes1);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
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
        java.lang.String str20 = importItemObject19.RowId;
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
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
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
        java.util.List<java.lang.String> strList56 = getChartDataV2_55.getResultGrades();
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
        org.junit.Assert.assertNull(strList56);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedPropertyImportSummary observedPropertyImportSummary0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedPropertyImportSummary();
        observedPropertyImportSummary0.ErrorCount = 10;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedPropertyImportSummary observedPropertyImportSummary4 = observedPropertyImportSummary0.setSummaryReportText("");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemObservedProperty[] importItemObservedPropertyArray5 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemObservedProperty[] {};
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemObservedProperty> importItemObservedPropertyList6 = new java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemObservedProperty>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemObservedProperty>) importItemObservedPropertyList6, importItemObservedPropertyArray5);
        observedPropertyImportSummary0.ErrorImportItems = importItemObservedPropertyList6;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedPropertyImportSummary observedPropertyImportSummary10 = observedPropertyImportSummary0.setSuccessCount((java.lang.Integer) 10);
        java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemObservedProperty> importItemObservedPropertyList11 = observedPropertyImportSummary10.getErrorImportItems();
        observedPropertyImportSummary10.ErrorCount = 4;
        org.junit.Assert.assertNotNull(observedPropertyImportSummary4);
        org.junit.Assert.assertNotNull(importItemObservedPropertyArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(observedPropertyImportSummary10);
        org.junit.Assert.assertNotNull(importItemObservedPropertyList11);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationDatumPeriod locationDatumPeriod0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationDatumPeriod();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationDatumPeriodBase locationDatumPeriodBase2 = locationDatumPeriod0.setComment("'.'SSSSSSS");
        java.lang.String str3 = locationDatumPeriodBase2.Method;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationDatumPeriodBase locationDatumPeriodBase5 = locationDatumPeriodBase2.setComment("hi!");
        java.lang.String str6 = locationDatumPeriodBase2.getComment();
        org.junit.Assert.assertNotNull(locationDatumPeriodBase2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(locationDatumPeriodBase5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
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
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.MediumType mediumType22 = com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.MediumType.SOIL;
        activityTemplate0.Medium = mediumType22;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.MediumType mediumType24 = com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.MediumType.AIR;
        activityTemplate0.Medium = mediumType24;
        java.lang.String str26 = activityTemplate0.getCustomId();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(labInstructionTemplateList10);
        org.junit.Assert.assertNotNull(specimenTemplate13);
        org.junit.Assert.assertNull(labInstructionTemplateList16);
        org.junit.Assert.assertNotNull(specimenTemplateArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(postFieldVisitActivityWithTemplate20);
        org.junit.Assert.assertTrue("'" + mediumType22 + "' != '" + com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.MediumType.SOIL + "'", mediumType22.equals(com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.MediumType.SOIL));
        org.junit.Assert.assertTrue("'" + mediumType24 + "' != '" + com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.MediumType.AIR + "'", mediumType24.equals(com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.MediumType.AIR));
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.GradesResponse gradesResponse0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.GradesResponse();
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Grade> gradeList1 = gradesResponse0.getResults();
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Grade> gradeList2 = gradesResponse0.Results;
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Grade> gradeList3 = gradesResponse0.Results;
        org.junit.Assert.assertNull(gradeList1);
        org.junit.Assert.assertNull(gradeList2);
        org.junit.Assert.assertNull(gradeList3);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpreadsheetTemplate spreadsheetTemplate0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpreadsheetTemplate();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpreadsheetTemplateType spreadsheetTemplateType1 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpreadsheetTemplate spreadsheetTemplate2 = spreadsheetTemplate0.setType(spreadsheetTemplateType1);
        spreadsheetTemplate2.Description = "multipart/form-data; boundary=****bbcf5f9e-6ccf-4b63-91ab-6e645caf02af****";
        org.junit.Assert.assertNotNull(spreadsheetTemplate2);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabResultDetails labResultDetails0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabResultDetails();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabResultDetails labResultDetails2 = labResultDetails0.setAnalysisComment("/AQUARIUS/Acquisition/v2");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabResultDetails labResultDetails4 = labResultDetails0.setPreparationMethod("https");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes5 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabResultDetails labResultDetails6 = labResultDetails0.setAuditAttributes(auditAttributes5);
        java.lang.String str7 = labResultDetails6.getAnalysisComment();
        labResultDetails6.PreparationMethod = "";
        labResultDetails6.QualityFlag = "https";
        java.lang.String str12 = labResultDetails6.getDilutionFactor();
        org.junit.Assert.assertNotNull(labResultDetails2);
        org.junit.Assert.assertNotNull(labResultDetails4);
        org.junit.Assert.assertNotNull(labResultDetails6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/AQUARIUS/Acquisition/v2" + "'", str7, "/AQUARIUS/Acquisition/v2");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CompletedWork completedWork0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CompletedWork();
        java.lang.Boolean boolean1 = completedWork0.isSafetyInspectionPerformed();
        java.lang.Boolean boolean2 = completedWork0.SafetyInspectionPerformed;
        java.lang.Boolean boolean3 = completedWork0.BiologicalSampleTaken;
        completedWork0.OtherSampleTaken = true;
        java.lang.Boolean boolean6 = completedWork0.isSedimentSampleTaken();
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNull(boolean6);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.TimeSeriesType timeSeriesType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.TimeSeriesType.Unknown;
        org.junit.Assert.assertTrue("'" + timeSeriesType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.TimeSeriesType.Unknown + "'", timeSeriesType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.TimeSeriesType.Unknown));
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ExpandedRatingCurve expandedRatingCurve0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ExpandedRatingCurve();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.RatingCurveType ratingCurveType1 = expandedRatingCurve0.Type;
        expandedRatingCurve0.IsBlended = false;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ParameterWithUnit parameterWithUnit4 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ParameterWithUnit();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ExpandedRatingCurve expandedRatingCurve5 = expandedRatingCurve0.setOutputParameter(parameterWithUnit4);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ParameterWithUnit parameterWithUnit6 = expandedRatingCurve5.getOutputParameter();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ExpandedRatingCurve expandedRatingCurve7 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ExpandedRatingCurve();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.RatingCurveType ratingCurveType8 = expandedRatingCurve7.Type;
        expandedRatingCurve7.IsBlended = false;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ParameterWithUnit parameterWithUnit11 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ParameterWithUnit();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ExpandedRatingCurve expandedRatingCurve12 = expandedRatingCurve7.setOutputParameter(parameterWithUnit11);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ExpandedRatingCurve expandedRatingCurve13 = expandedRatingCurve5.setOutputParameter(parameterWithUnit11);
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.RatingShift> ratingShiftList14 = expandedRatingCurve13.getShifts();
        org.junit.Assert.assertNull(ratingCurveType1);
        org.junit.Assert.assertNotNull(expandedRatingCurve5);
        org.junit.Assert.assertNotNull(parameterWithUnit6);
        org.junit.Assert.assertNull(ratingCurveType8);
        org.junit.Assert.assertNotNull(expandedRatingCurve12);
        org.junit.Assert.assertNotNull(expandedRatingCurve13);
        org.junit.Assert.assertNull(ratingShiftList14);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        java.lang.String str0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.IMetadataChangeOperation.User;
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Reading reading0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Reading();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DoubleWithDisplay doubleWithDisplay1 = reading0.getValue();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Reading reading3 = reading0.setParameterId("hi!");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Reading reading5 = reading3.setModel("MaxInstant");
        reading5.Comments = "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ";
        java.time.Instant instant8 = reading5.Time;
        reading5.GradeCode = 0;
        org.junit.Assert.assertNull(doubleWithDisplay1);
        org.junit.Assert.assertNotNull(reading3);
        org.junit.Assert.assertNotNull(reading5);
        org.junit.Assert.assertNull(instant8);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.util.List<java.lang.String> strList1 = getObservationsV2_0.SamplingContextTagIds;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItem importItem2 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItem();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_3 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        getObservationsV2_3.SpecimenIds = strList6;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags9 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray13 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags16 = putLocationTags9.setTagUniqueIds(strList14);
        getObservationsV2_3.QualityControlTypes = strList14;
        java.util.List<java.lang.String> strList18 = getObservationsV2_3.getLabReportIds();
        importItem2.Errors = getObservationsV2_3;
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
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItem importItem38 = importItem2.setFields((java.util.List<java.lang.String>) strList33);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_39 = getObservationsV2_0.setAnalysisMethodIds((java.util.List<java.lang.String>) strList33);
        java.time.Instant instant40 = getObservationsV2_0.getEndModificationTime();
        org.junit.Assert.assertNull(strList1);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(putLocationTags16);
        org.junit.Assert.assertNull(strList18);
        org.junit.Assert.assertNull(strList21);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(putLocationTags35);
        org.junit.Assert.assertNotNull(importItem38);
        org.junit.Assert.assertNotNull(getObservationsV2_39);
        org.junit.Assert.assertNull(instant40);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostActivity postActivity0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostActivity();
        java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingContextTag> samplingContextTagList1 = postActivity0.SamplingContextTags;
        java.lang.Object obj2 = postActivity0.getResponseType();
        org.junit.Assert.assertNull(samplingContextTagList1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$Activity");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$Activity");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$Activity");
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Acquisition.IHttpFile iHttpFile0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Acquisition.IFileUploadRequest.File;
        org.junit.Assert.assertNull(iHttpFile0);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationFolderWriteBase locationFolderWriteBase0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationFolderWriteBase();
        java.lang.String str1 = locationFolderWriteBase0.LocationFolderName;
        java.lang.String str2 = locationFolderWriteBase0.LocationFolderName;
        java.lang.String str3 = locationFolderWriteBase0.getLocationFolderName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        java.lang.Boolean boolean0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.IFieldVisitDataRequest.ConvertToLocalAssumedDatum;
        org.junit.Assert.assertNull(boolean0);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.AttachmentType attachmentType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.AttachmentType.HistoricalSwami;
        org.junit.Assert.assertTrue("'" + attachmentType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.AttachmentType.HistoricalSwami + "'", attachmentType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.AttachmentType.HistoricalSwami));
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservationImportSummary observationImportSummary0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservationImportSummary();
        observationImportSummary0.UpdateCount = (-1);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservationImportSummary observationImportSummary4 = observationImportSummary0.setSuccessCount((java.lang.Integer) 100);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportHistoryEventSimple importHistoryEventSimple5 = observationImportSummary0.getImportHistoryEventSimple();
        java.lang.Integer int6 = observationImportSummary0.getErrorCount();
        org.junit.Assert.assertNotNull(observationImportSummary4);
        org.junit.Assert.assertNull(importHistoryEventSimple5);
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostFieldVisitActivityWithTemplate postFieldVisitActivityWithTemplate0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostFieldVisitActivityWithTemplate();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes1 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostFieldVisitActivityWithTemplate postFieldVisitActivityWithTemplate2 = postFieldVisitActivityWithTemplate0.setAuditAttributes(auditAttributes1);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.MediumType mediumType3 = null;
        postFieldVisitActivityWithTemplate2.Medium = mediumType3;
        postFieldVisitActivityWithTemplate2.Comment = "hi!";
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.CollectionMethod collectionMethod7 = postFieldVisitActivityWithTemplate2.getCollectionMethod();
        org.junit.Assert.assertNotNull(postFieldVisitActivityWithTemplate2);
        org.junit.Assert.assertNull(collectionMethod7);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        net.servicestack.client.ConnectionFilter connectionFilter0 = null;
        net.servicestack.client.JsonServiceClient.GlobalResponseFilter = connectionFilter0;
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostExtendedAttribute postExtendedAttribute0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostExtendedAttribute();
        java.lang.String str1 = postExtendedAttribute0.getKey();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.EditableExtendedAttribute editableExtendedAttribute3 = postExtendedAttribute0.setVisibleInDatasetList((java.lang.Boolean) true);
        java.lang.String str4 = editableExtendedAttribute3.getDefaultValue();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(editableExtendedAttribute3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostCalculatedDerivedTimeSeries postCalculatedDerivedTimeSeries0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostCalculatedDerivedTimeSeries();
        postCalculatedDerivedTimeSeries0.Parameter = "/AQUARIUS/Acquisition/v2";
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostCalculatedDerivedTimeSeries postCalculatedDerivedTimeSeries4 = postCalculatedDerivedTimeSeries0.setUtcOffset("'.'SSSSSSS");
        postCalculatedDerivedTimeSeries0.ComputationIdentifier = "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSSSSSZZZZZ";
        postCalculatedDerivedTimeSeries0.ComputationIdentifier = "MaxInstant";
        org.junit.Assert.assertNotNull(postCalculatedDerivedTimeSeries4);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetActivityHistory getActivityHistory0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetActivityHistory();
        java.lang.String str1 = getActivityHistory0.Id;
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostSensor postSensor0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostSensor();
        postSensor0.MethodCode = "/AQUARIUS/Acquisition/v2";
        postSensor0.LocationUniqueId = "hi!";
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Acquisition.PublicKey publicKey0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Acquisition.PublicKey();
        publicKey0.KeySize = 1;
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetActivity getActivity0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetActivity();
        getActivity0.Id = "https";
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetActivity getActivity4 = getActivity0.setDetail((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(getActivity4);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Schedule schedule0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Schedule();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Schedule schedule2 = schedule0.setCustomId("");
        java.time.OffsetDateTime offsetDateTime3 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Schedule schedule4 = schedule0.setStartDate(offsetDateTime3);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.RecurrenceType recurrenceType5 = com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.RecurrenceType.MONTHLY;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Schedule schedule6 = schedule4.setRecurrenceType(recurrenceType5);
        schedule6.SamplingLocationGroupSelectionTypeRandomCount = (-1);
        org.junit.Assert.assertNotNull(schedule2);
        org.junit.Assert.assertNotNull(schedule4);
        org.junit.Assert.assertTrue("'" + recurrenceType5 + "' != '" + com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.RecurrenceType.MONTHLY + "'", recurrenceType5.equals(com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.RecurrenceType.MONTHLY));
        org.junit.Assert.assertNotNull(schedule6);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostUnitGroup postUnitGroup0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostUnitGroup();
        java.lang.Integer int1 = postUnitGroup0.getTimeDimension();
        postUnitGroup0.BaseUnitIdentifier = "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ";
        java.lang.Integer int4 = postUnitGroup0.getIntensityDimension();
        java.lang.Integer int5 = postUnitGroup0.getMassDimension();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        java.lang.String str0 = com.aquaticinformatics.aquarius.sdk.samples.serializers.InstantDeserializer.JsonMinConcreteValue;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "0001-01-01T00:00:00.000Z" + "'", str0, "0001-01-01T00:00:00.000Z");
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CorrectionListServiceResponse correctionListServiceResponse0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CorrectionListServiceResponse();
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Correction> correctionList1 = correctionListServiceResponse0.Corrections;
        org.junit.Assert.assertNull(correctionList1);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeChannelMeasurement dischargeChannelMeasurement0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeChannelMeasurement();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ChannelMaterialType channelMaterialType1 = dischargeChannelMeasurement0.getChannelMaterial();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.QuantityWithDisplay quantityWithDisplay2 = dischargeChannelMeasurement0.Discharge;
        java.time.Instant instant3 = dischargeChannelMeasurement0.EndTime;
        dischargeChannelMeasurement0.Channel = "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSSSSSZZZZZ";
        java.lang.String str6 = dischargeChannelMeasurement0.Channel;
        java.lang.String str7 = dischargeChannelMeasurement0.Party;
        org.junit.Assert.assertNull(channelMaterialType1);
        org.junit.Assert.assertNull(quantityWithDisplay2);
        org.junit.Assert.assertNull(instant3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSSSSSZZZZZ" + "'", str6, "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSSSSSZZZZZ");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PopulatedUnitGroup populatedUnitGroup0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PopulatedUnitGroup();
        java.lang.String str1 = populatedUnitGroup0.getDisplayName();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.UnitGroup unitGroup3 = populatedUnitGroup0.setCurrentDimension((java.lang.Integer) 100);
        java.lang.String str4 = populatedUnitGroup0.UniqueId;
        populatedUnitGroup0.TimeDimension = 10;
        populatedUnitGroup0.TemperatureDimension = 100;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.UnitGroup unitGroup10 = populatedUnitGroup0.setIntensityDimension((java.lang.Integer) 1);
        unitGroup10.SubstanceDimension = 100;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(unitGroup3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(unitGroup10);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.GetFieldVisitReadingsByLocationServiceRequest getFieldVisitReadingsByLocationServiceRequest0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.GetFieldVisitReadingsByLocationServiceRequest();
        java.lang.Boolean boolean1 = getFieldVisitReadingsByLocationServiceRequest0.ApplyRounding;
        getFieldVisitReadingsByLocationServiceRequest0.ApplyDatumConversion = true;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.GetFieldVisitReadingsByLocationServiceRequest getFieldVisitReadingsByLocationServiceRequest5 = getFieldVisitReadingsByLocationServiceRequest0.setLocationUniqueId("2021.4.62.0");
        java.lang.Boolean boolean6 = getFieldVisitReadingsByLocationServiceRequest5.Publish;
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNotNull(getFieldVisitReadingsByLocationServiceRequest5);
        org.junit.Assert.assertNull(boolean6);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
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
        java.lang.String str12 = timeSeriesDescription11.UniqueId;
        org.junit.Assert.assertNull(instant1);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(locationDescriptionListServiceResponse8);
        org.junit.Assert.assertNotNull(timeSeriesDescription11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetSpecimen getSpecimen0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetSpecimen();
        java.lang.Boolean boolean1 = getSpecimen0.Detail;
        java.lang.Boolean boolean2 = getSpecimen0.getDetail();
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNull(boolean2);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        com.aquaticinformatics.aquarius.sdk.samples.serializers.InstantDeserializer instantDeserializer0 = new com.aquaticinformatics.aquarius.sdk.samples.serializers.InstantDeserializer();
        com.google.gson.JsonElement jsonElement1 = null;
        java.lang.reflect.Type type2 = null;
        com.google.gson.JsonDeserializationContext jsonDeserializationContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.Instant instant4 = instantDeserializer0.deserialize(jsonElement1, type2, jsonDeserializationContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ReferencePointPeriod referencePointPeriod0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ReferencePointPeriod();
        java.lang.Boolean boolean1 = referencePointPeriod0.IsMeasuredAgainstLocalAssumedDatum;
        referencePointPeriod0.Unit = "/AQUARIUS/Acquisition/v2";
        java.time.Instant instant4 = referencePointPeriod0.AppliedTime;
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNull(instant4);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.InspectionActivity inspectionActivity0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.InspectionActivity();
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CalibrationCheck> calibrationCheckList1 = inspectionActivity0.CalibrationChecks;
        inspectionActivity0.NumberOfReadingsNotDatumConverted = 4;
        org.junit.Assert.assertNull(calibrationCheckList1);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.RatingCurveType ratingCurveType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.RatingCurveType.LogarithmicTable;
        org.junit.Assert.assertTrue("'" + ratingCurveType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.RatingCurveType.LogarithmicTable + "'", ratingCurveType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.RatingCurveType.LogarithmicTable));
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Project project0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Project();
        java.lang.String str1 = project0.getId();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ProjectType projectType2 = com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ProjectType.EVENT_BASED_MONITORING;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Project project3 = project0.setType(projectType2);
        project0.ApprovalAgency = "hi!:///AQUARIUS/Provisioning/v1";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + projectType2 + "' != '" + com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ProjectType.EVENT_BASED_MONITORING + "'", projectType2.equals(com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ProjectType.EVENT_BASED_MONITORING));
        org.junit.Assert.assertNotNull(project3);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemTaxon importItemTaxon0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemTaxon();
        java.lang.String str1 = importItemTaxon0.RowId;
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutUserRoleBase putUserRoleBase0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutUserRoleBase();
        java.lang.String str1 = putUserRoleBase0.getRoleUniqueId();
        java.lang.String str2 = putUserRoleBase0.RoleUniqueId;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutUserRoleBase putUserRoleBase4 = putUserRoleBase0.setUserUniqueId("/AQUARIUS/Acquisition/v2");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(putUserRoleBase4);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SearchResultAccessGroup searchResultAccessGroup0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SearchResultAccessGroup();
        java.lang.String str1 = searchResultAccessGroup0.getCursor();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Sensor sensor0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Sensor();
        java.time.Instant instant1 = sensor0.getLastModifiedUtc();
        java.time.Instant instant2 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Sensor sensor3 = sensor0.setLastModifiedUtc(instant2);
        sensor3.SubLocationIdentifier = "'.'SSSSSSS";
        org.junit.Assert.assertNull(instant1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(sensor3);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Location location0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Location();
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.AppliedTag> appliedTagList1 = location0.Tags;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Location location3 = location0.setUniqueId("MaxInstant");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Location location5 = location0.setLocationName("yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ");
        java.time.Instant instant6 = location5.getLastModified();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.StatisticalDateTimeOffset statisticalDateTimeOffset7 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.StatisticalDateTimeOffset();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostRecurringReport postRecurringReport8 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostRecurringReport();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary9 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary();
        dischargeSummary9.Reviewer = "";
        java.time.Instant instant12 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        dischargeSummary9.MeasurementTime = instant12;
        postRecurringReport8.NextGenerationDate = instant12;
        java.time.Instant instant15 = postRecurringReport8.getNextGenerationDate();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.StatisticalDateTimeOffset statisticalDateTimeOffset16 = statisticalDateTimeOffset7.setDateTimeOffset(instant15);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DownchainProcessorListByRatingModelServiceRequest downchainProcessorListByRatingModelServiceRequest17 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DownchainProcessorListByRatingModelServiceRequest();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MetadataChangeTransactionListServiceRequest metadataChangeTransactionListServiceRequest18 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MetadataChangeTransactionListServiceRequest();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostRecurringReport postRecurringReport19 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostRecurringReport();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary20 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary();
        dischargeSummary20.Reviewer = "";
        java.time.Instant instant23 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        dischargeSummary20.MeasurementTime = instant23;
        postRecurringReport19.NextGenerationDate = instant23;
        java.time.Instant instant26 = postRecurringReport19.getNextGenerationDate();
        java.lang.String str27 = com.aquaticinformatics.aquarius.sdk.samples.serializers.InstantSerializer.format(instant26);
        metadataChangeTransactionListServiceRequest18.QueryFrom = instant26;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DownchainProcessorListByRatingModelServiceRequest downchainProcessorListByRatingModelServiceRequest29 = downchainProcessorListByRatingModelServiceRequest17.setQueryTo(instant26);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DownchainProcessorListByRatingModelServiceRequest downchainProcessorListByRatingModelServiceRequest31 = downchainProcessorListByRatingModelServiceRequest17.setRatingModelIdentifier("hi!");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Qualifier qualifier32 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Qualifier();
        java.time.Instant instant33 = qualifier32.DateApplied;
        java.lang.String str34 = qualifier32.User;
        java.lang.String str35 = qualifier32.getIdentifier();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest timeAlignedDataServiceRequest36 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest();
        java.lang.Object obj37 = timeAlignedDataServiceRequest36.getResponseType();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse38 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse();
        java.time.Instant instant39 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse40 = locationDescriptionListServiceResponse38.setNextToken(instant39);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest timeAlignedDataServiceRequest41 = timeAlignedDataServiceRequest36.setQueryFrom(instant39);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Qualifier qualifier42 = qualifier32.setDateApplied(instant39);
        java.time.Instant instant43 = qualifier42.getDateApplied();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DownchainProcessorListByRatingModelServiceRequest downchainProcessorListByRatingModelServiceRequest44 = downchainProcessorListByRatingModelServiceRequest17.setQueryFrom(instant43);
        statisticalDateTimeOffset16.DateTimeOffset = instant43;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Location location46 = location5.setLastModified(instant43);
        location5.Identifier = "0001-01-01T00:00:00.000Z";
        org.junit.Assert.assertNull(appliedTagList1);
        org.junit.Assert.assertNotNull(location3);
        org.junit.Assert.assertNotNull(location5);
        org.junit.Assert.assertNull(instant6);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertNotNull(statisticalDateTimeOffset16);
        org.junit.Assert.assertNotNull(instant23);
        org.junit.Assert.assertNotNull(instant26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "9999-12-31T23:59:59.999Z" + "'", str27, "9999-12-31T23:59:59.999Z");
        org.junit.Assert.assertNotNull(downchainProcessorListByRatingModelServiceRequest29);
        org.junit.Assert.assertNotNull(downchainProcessorListByRatingModelServiceRequest31);
        org.junit.Assert.assertNull(instant33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertEquals(obj37.toString(), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeAlignedDataServiceResponse");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj37), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeAlignedDataServiceResponse");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj37), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeAlignedDataServiceResponse");
        org.junit.Assert.assertNotNull(instant39);
        org.junit.Assert.assertNotNull(locationDescriptionListServiceResponse40);
        org.junit.Assert.assertNotNull(timeAlignedDataServiceRequest41);
        org.junit.Assert.assertNotNull(qualifier42);
        org.junit.Assert.assertNotNull(instant43);
        org.junit.Assert.assertNotNull(downchainProcessorListByRatingModelServiceRequest44);
        org.junit.Assert.assertNotNull(location46);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.MonitoringMethodWriteBase monitoringMethodWriteBase0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.MonitoringMethodWriteBase();
        monitoringMethodWriteBase0.Description = "MinDuration";
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostObservedPropertyCategoricalValue postObservedPropertyCategoricalValue0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostObservedPropertyCategoricalValue();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostObservedPropertyCategoricalValue postObservedPropertyCategoricalValue2 = postObservedPropertyCategoricalValue0.setId("/AQUARIUS/Acquisition/v2");
        postObservedPropertyCategoricalValue0.Id = "MinInstant";
        org.junit.Assert.assertNotNull(postObservedPropertyCategoricalValue2);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation observation0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PlannedFieldResult plannedFieldResult1 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation observation2 = observation0.setPlannedFieldResult(plannedFieldResult1);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabInstruction labInstruction3 = null;
        observation2.LabInstruction = labInstruction3;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservationStatistics observationStatistics5 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation observation6 = observation2.setStatistics(observationStatistics5);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.CollectionMethod collectionMethod7 = observation6.getCollectionMethod();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservationStatistics observationStatistics8 = null;
        observation6.Statistics = observationStatistics8;
        observation6.MediumSubdivision = "MinDuration";
        org.junit.Assert.assertNotNull(observation2);
        org.junit.Assert.assertNotNull(observation6);
        org.junit.Assert.assertNull(collectionMethod7);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Sensor sensor0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Sensor();
        java.time.Instant instant1 = sensor0.getLastModifiedUtc();
        java.time.Instant instant2 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Sensor sensor3 = sensor0.setLastModifiedUtc(instant2);
        sensor3.SerialNumber = "";
        org.junit.Assert.assertNull(instant1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(sensor3);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        java.lang.String str0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.IPostTimeSeriesRequest.Parameter;
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DeleteActivity deleteActivity0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DeleteActivity();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DeleteActivity deleteActivity2 = deleteActivity0.setId("yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSSSSSZZZZZ");
        java.lang.String str3 = deleteActivity2.Id;
        org.junit.Assert.assertNotNull(deleteActivity2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSSSSSZZZZZ" + "'", str3, "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSSSSSZZZZZ");
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostLocation postLocation0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostLocation();
        postLocation0.Description = "hi!";
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationBase locationBase4 = postLocation0.setLocationType("/AQUARIUS/Acquisition/v2");
        java.lang.Boolean boolean5 = locationBase4.isPublish();
        org.junit.Assert.assertNotNull(locationBase4);
        org.junit.Assert.assertNull(boolean5);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
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
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_17 = getObservationsV2_0.setSpecimenName("/AQUARIUS/Acquisition/v2://9999-12-31T23:59:59.999Z");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitDataServiceResponse fieldVisitDataServiceResponse18 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitDataServiceResponse();
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CrossSectionSurveyActivity> crossSectionSurveyActivityList19 = fieldVisitDataServiceResponse18.CrossSectionSurveyActivity;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitDataServiceResponse fieldVisitDataServiceResponse21 = fieldVisitDataServiceResponse18.setIdentifier("");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary22 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary();
        dischargeSummary22.Reviewer = "";
        java.time.Instant instant25 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        dischargeSummary22.MeasurementTime = instant25;
        fieldVisitDataServiceResponse18.ResponseTime = instant25;
        getObservationsV2_0.StartObservedTime = instant25;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetSpecimens getSpecimens29 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetSpecimens();
        java.util.List<java.lang.String> strList30 = getSpecimens29.getActivityIds();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutUserV2 putUserV2_31 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutUserV2();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.UserType userType32 = putUserV2_31.UserType;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetActivities getActivities33 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetActivities();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse34 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary35 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary37 = dischargeSummary35.setPublish((java.lang.Boolean) false);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse38 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse();
        java.time.Instant instant39 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse40 = locationDescriptionListServiceResponse38.setNextToken(instant39);
        dischargeSummary35.MeasurementTime = instant39;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse42 = locationDescriptionListServiceResponse34.setNextToken(instant39);
        java.time.Instant instant43 = locationDescriptionListServiceResponse34.getNextToken();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetActivities getActivities44 = getActivities33.setToStartTime(instant43);
        java.lang.String str45 = getActivities44.getSort();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_46 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.util.List<java.lang.String> strList47 = getObservationsV2_46.SamplingContextTagIds;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_48 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray50 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList51 = new java.util.ArrayList<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList51, strArray50);
        getObservationsV2_48.SpecimenIds = strList51;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags54 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray58 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList59 = new java.util.ArrayList<java.lang.String>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList59, strArray58);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags61 = putLocationTags54.setTagUniqueIds(strList59);
        getObservationsV2_48.QualityControlTypes = strList59;
        getObservationsV2_46.ResultGrades = strList59;
        getActivities44.Media = strList59;
        putUserV2_31.AccessGroups = strList59;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetSpecimens getSpecimens66 = getSpecimens29.setAnalyticalGroupIds((java.util.List<java.lang.String>) strList59);
        getObservationsV2_0.LabReportIds = strList59;
        java.time.Instant instant68 = getObservationsV2_0.getEndResultTime();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(putLocationTags13);
        org.junit.Assert.assertNull(strList15);
        org.junit.Assert.assertNotNull(getObservationsV2_17);
        org.junit.Assert.assertNull(crossSectionSurveyActivityList19);
        org.junit.Assert.assertNotNull(fieldVisitDataServiceResponse21);
        org.junit.Assert.assertNotNull(instant25);
        org.junit.Assert.assertNull(strList30);
        org.junit.Assert.assertNull(userType32);
        org.junit.Assert.assertNotNull(dischargeSummary37);
        org.junit.Assert.assertNotNull(instant39);
        org.junit.Assert.assertNotNull(locationDescriptionListServiceResponse40);
        org.junit.Assert.assertNotNull(locationDescriptionListServiceResponse42);
        org.junit.Assert.assertNotNull(instant43);
        org.junit.Assert.assertNotNull(getActivities44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(strList47);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(putLocationTags61);
        org.junit.Assert.assertNotNull(getSpecimens66);
        org.junit.Assert.assertNull(instant68);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportHistoryEvent importHistoryEvent0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportHistoryEvent();
        java.lang.String str1 = importHistoryEvent0.FileName;
        java.lang.String str2 = importHistoryEvent0.TimeZoneOffset;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportType importType3 = importHistoryEvent0.ImportType;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(importType3);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.RoleFlattened roleFlattened0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.RoleFlattened();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.RoleFlattenedBase roleFlattenedBase2 = roleFlattened0.setCanEditAppendConfigurations((java.lang.Boolean) false);
        java.lang.Boolean boolean3 = roleFlattened0.CanAddOrRemoveLocations;
        roleFlattened0.CanAddData = true;
        java.lang.Boolean boolean6 = roleFlattened0.CanReadData;
        java.util.ArrayList<java.lang.String> strList7 = roleFlattened0.RoleApprovalTransitions;
        org.junit.Assert.assertNotNull(roleFlattenedBase2);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertNull(strList7);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostSensor postSensor0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostSensor();
        java.lang.Object obj1 = postSensor0.getResponseType();
        java.lang.String str2 = postSensor0.LocationUniqueId;
        postSensor0.SerialNumber = "-PT87591240H";
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning$Sensor");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning$Sensor");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning$Sensor");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.RatingModelOutputValuesServiceRequest ratingModelOutputValuesServiceRequest0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.RatingModelOutputValuesServiceRequest();
        ratingModelOutputValuesServiceRequest0.ApplyShifts = true;
        java.time.Instant instant3 = ratingModelOutputValuesServiceRequest0.getEffectiveTime();
        java.lang.String str4 = ratingModelOutputValuesServiceRequest0.getRatingModelIdentifier();
        java.time.Instant instant5 = ratingModelOutputValuesServiceRequest0.EffectiveTime;
        ratingModelOutputValuesServiceRequest0.RatingModelIdentifier = "/AQUARIUS/Provisioning/v1";
        org.junit.Assert.assertNull(instant3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(instant5);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        // The following exception was thrown during execution in test generation
        try {
            java.time.Duration duration1 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.DurationDeserializer.parse("/AQUARIUS/Acquisition/v2://9999-12-31T23:59:59.999Z");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text cannot be parsed to a Duration");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.EditableExtendedAttribute editableExtendedAttribute0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.EditableExtendedAttribute();
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetActivities getActivities0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetActivities();
        getActivities0.Limit = 10;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetActivities getActivities4 = getActivities0.setCustomId("/AQUARIUS/Provisioning/v1");
        java.time.Instant instant5 = getActivities4.FromStartTime;
        org.junit.Assert.assertNotNull(getActivities4);
        org.junit.Assert.assertNull(instant5);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SearchResultProject searchResultProject0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SearchResultProject();
        java.lang.String str1 = searchResultProject0.Cursor;
        java.lang.String str2 = searchResultProject0.getCursor();
        java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Project> projectList3 = searchResultProject0.getDomainObjects();
        java.lang.String str4 = searchResultProject0.Cursor;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(projectList3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.QuantityWithDisplay quantityWithDisplay1 = dischargeSummary0.getMeanGageHeight();
        java.lang.String str2 = dischargeSummary0.MeanGageHeightMethod;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary4 = dischargeSummary0.setComments("hi!");
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.GageHeightReading> gageHeightReadingList5 = null;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary6 = dischargeSummary0.setGageHeightReadings(gageHeightReadingList5);
        org.junit.Assert.assertNull(quantityWithDisplay1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(dischargeSummary4);
        org.junit.Assert.assertNotNull(dischargeSummary6);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetChartDataV2 getChartDataV2_0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetChartDataV2();
        java.lang.String str1 = getChartDataV2_0.getActivityCustomId();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetChartDataV2 getChartDataV2_3 = getChartDataV2_0.setFilterId("");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_4 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.util.List<java.lang.String> strList5 = getObservationsV2_4.SamplingContextTagIds;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_6 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        getObservationsV2_6.SpecimenIds = strList9;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags12 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray16 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags19 = putLocationTags12.setTagUniqueIds(strList17);
        getObservationsV2_6.QualityControlTypes = strList17;
        getObservationsV2_4.ResultGrades = strList17;
        java.lang.Double double22 = getObservationsV2_4.getMinNumericResultValue();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DeleteFieldVisits deleteFieldVisits23 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DeleteFieldVisits();
        java.lang.String str24 = deleteFieldVisits23.Sort;
        deleteFieldVisits23.Sort = "9999-12-31T23:59:59.999Z";
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_27 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray30 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_33 = getObservationsV2_27.setDataClassifications((java.util.List<java.lang.String>) strList31);
        java.util.List<java.lang.String> strList34 = getObservationsV2_27.ResultGrades;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary35 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary();
        dischargeSummary35.Reviewer = "";
        java.time.Instant instant38 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        dischargeSummary35.MeasurementTime = instant38;
        getObservationsV2_27.StartResultTime = instant38;
        java.lang.String[] strArray50 = new java.lang.String[] { "https", "/AQUARIUS/Provisioning/v1", "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ", "2021.4.62.0", "hi!", "2021.4.62.0", "2021.4.62.0", "/AQUARIUS/Acquisition/v2", "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ" };
        java.util.ArrayList<java.lang.String> strList51 = new java.util.ArrayList<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList51, strArray50);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_53 = getObservationsV2_27.setAnalyticalGroupIds((java.util.List<java.lang.String>) strList51);
        deleteFieldVisits23.PlanningStatuses = strList51;
        getObservationsV2_4.Media = strList51;
        getChartDataV2_0.SpecimenIds = strList51;
        java.lang.Integer int57 = getChartDataV2_0.getLimit();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetChartDataV2 getChartDataV2_59 = getChartDataV2_0.setDepthUnitId("/AQUARIUS/Acquisition/v2");
        java.time.Instant instant60 = getChartDataV2_59.getStartResultTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(getChartDataV2_3);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(putLocationTags19);
        org.junit.Assert.assertNull(double22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(getObservationsV2_33);
        org.junit.Assert.assertNull(strList34);
        org.junit.Assert.assertNotNull(instant38);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(getObservationsV2_53);
        org.junit.Assert.assertNull(int57);
        org.junit.Assert.assertNotNull(getChartDataV2_59);
        org.junit.Assert.assertNull(instant60);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
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
        locationRemark16.TypeName = "9999-12-31T23:59:59.999Z";
        org.junit.Assert.assertNotNull(locationRemark2);
        org.junit.Assert.assertNull(crossSectionSurveyActivityList4);
        org.junit.Assert.assertNotNull(fieldVisitDataServiceResponse6);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(locationRemark13);
        org.junit.Assert.assertNull(instant14);
        org.junit.Assert.assertNotNull(locationRemark16);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutBaseStandardReferenceDatum putBaseStandardReferenceDatum0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutBaseStandardReferenceDatum();
        java.lang.String str1 = putBaseStandardReferenceDatum0.Comments;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutBaseStandardReferenceDatum putBaseStandardReferenceDatum3 = putBaseStandardReferenceDatum0.setComments("MaxInstant");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutBaseStandardReferenceDatum putBaseStandardReferenceDatum5 = putBaseStandardReferenceDatum0.setLocationUniqueId("yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ");
        putBaseStandardReferenceDatum0.Method = "MinDuration";
        java.lang.String str8 = putBaseStandardReferenceDatum0.Comments;
        java.lang.String str9 = putBaseStandardReferenceDatum0.LocationUniqueId;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(putBaseStandardReferenceDatum3);
        org.junit.Assert.assertNotNull(putBaseStandardReferenceDatum5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MaxInstant" + "'", str8, "MaxInstant");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ" + "'", str9, "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ");
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostSamplingLocation postSamplingLocation0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostSamplingLocation();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostSamplingLocation postSamplingLocation1 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostSamplingLocation();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.StandardSimple standardSimple2 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.StandardSimple();
        com.aquaticinformatics.aquarius.sdk.samples.Interval interval3 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.StandardSimple standardSimple4 = standardSimple2.setApplicabilityRange(interval3);
        java.lang.String str5 = standardSimple2.getCustomId();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.StandardSimple standardSimple6 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.StandardSimple();
        com.aquaticinformatics.aquarius.sdk.samples.Interval interval7 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.StandardSimple standardSimple8 = standardSimple6.setApplicabilityRange(interval7);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.StandardSimple standardSimple10 = standardSimple6.setActive((java.lang.Boolean) false);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.StandardSimple standardSimple11 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.StandardSimple();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.StandardSimple standardSimple12 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.StandardSimple();
        com.aquaticinformatics.aquarius.sdk.samples.Interval interval13 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.StandardSimple standardSimple14 = standardSimple12.setApplicabilityRange(interval13);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.StandardSimple standardSimple16 = standardSimple12.setActive((java.lang.Boolean) false);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.StandardSimple standardSimple17 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.StandardSimple();
        com.aquaticinformatics.aquarius.sdk.samples.Interval interval18 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.StandardSimple standardSimple19 = standardSimple17.setApplicabilityRange(interval18);
        java.lang.String str20 = standardSimple19.CustomId;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.StandardSimple standardSimple21 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.StandardSimple();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.StandardSimple standardSimple22 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.StandardSimple();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.StandardSimple standardSimple23 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.StandardSimple();
        com.aquaticinformatics.aquarius.sdk.samples.Interval interval24 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.StandardSimple standardSimple25 = standardSimple23.setApplicabilityRange(interval24);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.StandardSimple standardSimple26 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.StandardSimple();
        com.aquaticinformatics.aquarius.sdk.samples.Interval interval27 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.StandardSimple standardSimple28 = standardSimple26.setApplicabilityRange(interval27);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.StandardSimple[] standardSimpleArray29 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.StandardSimple[] { standardSimple2, standardSimple6, standardSimple11, standardSimple12, standardSimple19, standardSimple21, standardSimple22, standardSimple25, standardSimple26 };
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.StandardSimple> standardSimpleList30 = new java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.StandardSimple>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.StandardSimple>) standardSimpleList30, standardSimpleArray29);
        postSamplingLocation1.Standards = standardSimpleList30;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutFieldVisit putFieldVisit33 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutFieldVisit();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PlannedActivity[] plannedActivityArray34 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PlannedActivity[] {};
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PlannedActivity> plannedActivityList35 = new java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PlannedActivity>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PlannedActivity>) plannedActivityList35, plannedActivityArray34);
        putFieldVisit33.PlannedActivities = plannedActivityList35;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment domainObjectAttachment38 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment();
        java.lang.String str39 = domainObjectAttachment38.getId();
        java.lang.String str40 = domainObjectAttachment38.getId();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Attachment attachment41 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment domainObjectAttachment42 = domainObjectAttachment38.setAttachment(attachment41);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment domainObjectAttachment43 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment();
        java.lang.String str44 = domainObjectAttachment43.getId();
        java.lang.String str45 = domainObjectAttachment43.getId();
        domainObjectAttachment43.Id = "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ";
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment domainObjectAttachment49 = domainObjectAttachment43.setId("hi!");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment domainObjectAttachment50 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment();
        java.lang.String str51 = domainObjectAttachment50.getId();
        java.lang.String str52 = domainObjectAttachment50.getId();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Attachment attachment53 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment domainObjectAttachment54 = domainObjectAttachment50.setAttachment(attachment53);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment domainObjectAttachment55 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment();
        java.lang.String str56 = domainObjectAttachment55.getId();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment domainObjectAttachment57 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment();
        java.lang.String str58 = domainObjectAttachment57.getId();
        java.lang.String str59 = domainObjectAttachment57.getId();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Attachment attachment60 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment domainObjectAttachment61 = domainObjectAttachment57.setAttachment(attachment60);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment domainObjectAttachment62 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment();
        java.lang.String str63 = domainObjectAttachment62.getId();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment[] domainObjectAttachmentArray64 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment[] { domainObjectAttachment38, domainObjectAttachment43, domainObjectAttachment50, domainObjectAttachment55, domainObjectAttachment57, domainObjectAttachment62 };
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment> domainObjectAttachmentList65 = new java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment>) domainObjectAttachmentList65, domainObjectAttachmentArray64);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutFieldVisit putFieldVisit67 = putFieldVisit33.setAttachments((java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment>) domainObjectAttachmentList65);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SamplingPlan samplingPlan68 = putFieldVisit33.getSamplingPlan();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.FieldTripSimple fieldTripSimple69 = putFieldVisit33.getFieldTrip();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Schedule schedule70 = putFieldVisit33.Schedule;
        java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DomainObjectAttachment> domainObjectAttachmentList71 = putFieldVisit33.Attachments;
        postSamplingLocation1.Attachments = domainObjectAttachmentList71;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostSamplingLocation postSamplingLocation73 = postSamplingLocation0.setAttachments(domainObjectAttachmentList71);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostSamplingLocation postSamplingLocation75 = postSamplingLocation73.setName("POST");
        postSamplingLocation75.VerticalDatum = "2021.4.62.0";
        org.junit.Assert.assertNotNull(standardSimple4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(standardSimple8);
        org.junit.Assert.assertNotNull(standardSimple10);
        org.junit.Assert.assertNotNull(standardSimple14);
        org.junit.Assert.assertNotNull(standardSimple16);
        org.junit.Assert.assertNotNull(standardSimple19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(standardSimple25);
        org.junit.Assert.assertNotNull(standardSimple28);
        org.junit.Assert.assertNotNull(standardSimpleArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(plannedActivityArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(domainObjectAttachment42);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(domainObjectAttachment49);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(domainObjectAttachment54);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNotNull(domainObjectAttachment61);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNotNull(domainObjectAttachmentArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(putFieldVisit67);
        org.junit.Assert.assertNull(samplingPlan68);
        org.junit.Assert.assertNull(fieldTripSimple69);
        org.junit.Assert.assertNull(schedule70);
        org.junit.Assert.assertNotNull(domainObjectAttachmentList71);
        org.junit.Assert.assertNotNull(postSamplingLocation73);
        org.junit.Assert.assertNotNull(postSamplingLocation75);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationType putLocationType0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationType();
        putLocationType0.UniqueId = "9999-12-31T23:59:59.999Z";
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.TaxonomyLevel taxonomyLevel0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.TaxonomyLevel();
        java.lang.String str1 = taxonomyLevel0.Id;
        java.lang.String str2 = taxonomyLevel0.getId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeRange timeRange0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeRange();
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.StandardReferenceDatumsResponse standardReferenceDatumsResponse0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.StandardReferenceDatumsResponse();
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.StandardReferenceDatum> standardReferenceDatumList1 = standardReferenceDatumsResponse0.getResults();
        org.junit.Assert.assertNull(standardReferenceDatumList1);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportHistoryEventSimple importHistoryEventSimple0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportHistoryEventSimple();
        java.lang.String str1 = importHistoryEventSimple0.getId();
        java.lang.String str2 = importHistoryEventSimple0.Id;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Note note0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Note();
        java.time.Instant instant1 = note0.StartTime;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Note note3 = note0.setNoteText("");
        org.junit.Assert.assertNull(instant1);
        org.junit.Assert.assertNotNull(note3);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostQualifierGroup postQualifierGroup0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostQualifierGroup();
        postQualifierGroup0.Identifier = "/AQUARIUS";
        java.lang.String str3 = postQualifierGroup0.getIdentifier();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/AQUARIUS" + "'", str3, "/AQUARIUS");
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.GetFieldVisitReadingsByLocationServiceRequest getFieldVisitReadingsByLocationServiceRequest0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.GetFieldVisitReadingsByLocationServiceRequest();
        java.lang.Boolean boolean1 = getFieldVisitReadingsByLocationServiceRequest0.ApplyRounding;
        java.lang.String str2 = getFieldVisitReadingsByLocationServiceRequest0.LocationIdentifier;
        java.lang.String str3 = getFieldVisitReadingsByLocationServiceRequest0.LocationUniqueId;
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservationMinimal observationMinimal0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservationMinimal();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedProperty observedProperty1 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservationMinimal observationMinimal2 = observationMinimal0.setObservedProperty(observedProperty1);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ResultStatus resultStatus3 = observationMinimal2.getResultStatus();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpecimenNestedInActivity specimenNestedInActivity4 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservationMinimal observationMinimal5 = observationMinimal2.setSpecimen(specimenNestedInActivity4);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DataClassificationType dataClassificationType6 = observationMinimal5.DataClassification;
        org.junit.Assert.assertNotNull(observationMinimal2);
        org.junit.Assert.assertNull(resultStatus3);
        org.junit.Assert.assertNotNull(observationMinimal5);
        org.junit.Assert.assertNull(dataClassificationType6);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PreservativeType preservativeType0 = com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PreservativeType.SULFURIC_ACID;
        org.junit.Assert.assertTrue("'" + preservativeType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PreservativeType.SULFURIC_ACID + "'", preservativeType0.equals(com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PreservativeType.SULFURIC_ACID));
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.UserBase userBase0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.UserBase();
        userBase0.Active = true;
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DeleteLabAnalysisMethod deleteLabAnalysisMethod0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DeleteLabAnalysisMethod();
        deleteLabAnalysisMethod0.Id = "/AQUARIUS/Acquisition/v2";
        java.lang.String str3 = deleteLabAnalysisMethod0.Id;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/AQUARIUS/Acquisition/v2" + "'", str3, "/AQUARIUS/Acquisition/v2");
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetLabReport getLabReport0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetLabReport();
        getLabReport0.Id = "https";
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetLabReport getLabReport4 = getLabReport0.setId("");
        java.lang.String str5 = getLabReport4.getId();
        org.junit.Assert.assertNotNull(getLabReport4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.FixedDropDownListItem fixedDropDownListItem0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.FixedDropDownListItem();
        java.lang.String str1 = fixedDropDownListItem0.getDropDownListDisplayName();
        java.lang.String str2 = fixedDropDownListItem0.DisplayName;
        fixedDropDownListItem0.Id = "'.'SSSSSSS";
        fixedDropDownListItem0.DisplayName = "";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.PointVelocityDischargeActivity pointVelocityDischargeActivity0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.PointVelocityDischargeActivity();
        java.lang.String str1 = pointVelocityDischargeActivity0.getModel();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary2 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary4 = dischargeSummary2.setPublish((java.lang.Boolean) false);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DoubleWithDisplay doubleWithDisplay5 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DoubleWithDisplay();
        dischargeSummary4.DifferenceDuringVisit = doubleWithDisplay5;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DoubleWithDisplay doubleWithDisplay8 = doubleWithDisplay5.setNumeric((java.lang.Double) 100.0d);
        pointVelocityDischargeActivity0.MeanObservationDurationInSeconds = doubleWithDisplay8;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(dischargeSummary4);
        org.junit.Assert.assertNotNull(doubleWithDisplay8);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Inspection inspection0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Inspection();
        java.lang.String str1 = inspection0.getManufacturer();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Inspection inspection3 = inspection0.setSubLocationIdentifier("");
        inspection3.Model = "9999-12-31T23:59:59.999Z";
        inspection3.Comments = "MinDuration";
        java.lang.String str8 = inspection3.getComments();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(inspection3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MinDuration" + "'", str8, "MinDuration");
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ConfigurableDropDownListItem configurableDropDownListItem0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.ConfigurableDropDownListItem();
        java.lang.Integer int1 = configurableDropDownListItem0.getDisplayOrder();
        java.lang.Integer int2 = configurableDropDownListItem0.DisplayOrder;
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostLabAnalysisMethod postLabAnalysisMethod0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostLabAnalysisMethod();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes1 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostLabAnalysisMethod postLabAnalysisMethod2 = postLabAnalysisMethod0.setAuditAttributes(auditAttributes1);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedProperty[] observedPropertyArray3 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedProperty[] {};
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedProperty> observedPropertyList4 = new java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedProperty>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedProperty>) observedPropertyList4, observedPropertyArray3);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostLabAnalysisMethod postLabAnalysisMethod6 = postLabAnalysisMethod2.setObservedProperties((java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedProperty>) observedPropertyList4);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes7 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostLabAnalysisMethod postLabAnalysisMethod8 = postLabAnalysisMethod2.setAuditAttributes(auditAttributes7);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes9 = postLabAnalysisMethod8.getAuditAttributes();
        postLabAnalysisMethod8.Description = "MaxInstant";
        org.junit.Assert.assertNotNull(postLabAnalysisMethod2);
        org.junit.Assert.assertNotNull(observedPropertyArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(postLabAnalysisMethod6);
        org.junit.Assert.assertNotNull(postLabAnalysisMethod8);
        org.junit.Assert.assertNull(auditAttributes9);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
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
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_46 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray49 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_52 = getObservationsV2_46.setDataClassifications((java.util.List<java.lang.String>) strList50);
        getObservationsV2_52.DepthUnitCustomId = "hi!";
        java.lang.String str55 = getObservationsV2_52.CustomId;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_56 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray58 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList59 = new java.util.ArrayList<java.lang.String>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList59, strArray58);
        getObservationsV2_56.SpecimenIds = strList59;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags62 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray66 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList67 = new java.util.ArrayList<java.lang.String>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList67, strArray66);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags69 = putLocationTags62.setTagUniqueIds(strList67);
        getObservationsV2_56.QualityControlTypes = strList67;
        java.util.List<java.lang.String> strList71 = getObservationsV2_56.getAnalyticalGroupIds();
        java.util.List<java.lang.String> strList72 = getObservationsV2_56.DataClassifications;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.FieldResultType fieldResultType73 = getObservationsV2_56.FieldResultType;
        java.time.Instant instant74 = getObservationsV2_56.getEndObservedTime();
        java.lang.String str75 = getObservationsV2_56.DepthUnitCustomId;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags76 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray80 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList81 = new java.util.ArrayList<java.lang.String>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList81, strArray80);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags83 = putLocationTags76.setTagUniqueIds(strList81);
        java.util.ArrayList<java.lang.String> strList84 = putLocationTags83.TagUniqueIds;
        getObservationsV2_56.ProjectIds = strList84;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_86 = getObservationsV2_52.setQualityControlTypes((java.util.List<java.lang.String>) strList84);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItem importItem87 = importItem45.setFields((java.util.List<java.lang.String>) strList84);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemStatusType importItemStatusType88 = null;
        importItem45.Status = importItemStatusType88;
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
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(getObservationsV2_52);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(putLocationTags69);
        org.junit.Assert.assertNull(strList71);
        org.junit.Assert.assertNull(strList72);
        org.junit.Assert.assertNull(fieldResultType73);
        org.junit.Assert.assertNull(instant74);
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(putLocationTags83);
        org.junit.Assert.assertNotNull(strList84);
        org.junit.Assert.assertNotNull(getObservationsV2_86);
        org.junit.Assert.assertNotNull(importItem87);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.GradesResponse gradesResponse0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.GradesResponse();
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Grade> gradeList1 = gradesResponse0.getResults();
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Grade> gradeList2 = gradesResponse0.getResults();
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Grade> gradeList3 = gradesResponse0.Results;
        org.junit.Assert.assertNull(gradeList1);
        org.junit.Assert.assertNull(gradeList2);
        org.junit.Assert.assertNull(gradeList3);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetSpecimenHistory getSpecimenHistory0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetSpecimenHistory();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetSpecimenHistory getSpecimenHistory2 = getSpecimenHistory0.setId("hi!:///AQUARIUS/Provisioning/v1");
        java.lang.Object obj3 = getSpecimenHistory0.getResponseType();
        org.junit.Assert.assertNotNull(getSpecimenHistory2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$SearchResultAuditHistory");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$SearchResultAuditHistory");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$SearchResultAuditHistory");
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary2 = dischargeSummary0.setMeanGageHeightMethod("hi!");
        java.lang.String str3 = dischargeSummary2.MeasurementId;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary5 = dischargeSummary2.setDischargeMethod("yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSSSSSZZZZZ");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeUncertainty dischargeUncertainty6 = null;
        dischargeSummary5.DischargeUncertainty = dischargeUncertainty6;
        org.junit.Assert.assertNotNull(dischargeSummary2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(dischargeSummary5);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DeleteLabAnalysisMethod deleteLabAnalysisMethod0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.DeleteLabAnalysisMethod();
        deleteLabAnalysisMethod0.Id = "";
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationType putLocationType0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationType();
        java.lang.Object obj1 = putLocationType0.getResponseType();
        java.util.ArrayList<java.lang.String> strList2 = putLocationType0.ExtendedAttributeDefinitionIds;
        putLocationType0.AttributeTableName = "/AQUARIUS/Provisioning/v1";
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning$LocationType");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning$LocationType");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning$LocationType");
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.RoleFlattened roleFlattened0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.RoleFlattened();
        java.lang.Boolean boolean1 = roleFlattened0.CanEditAppendConfigurations;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.RoleFlattenedBase roleFlattenedBase3 = roleFlattened0.setCanReadData((java.lang.Boolean) false);
        roleFlattenedBase3.CanReadData = true;
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNotNull(roleFlattenedBase3);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        java.lang.String str0 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.ZoneFieldPattern;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ZZZZZ" + "'", str0, "ZZZZZ");
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Unit unit0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Unit();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Unit unit2 = unit0.setBaseOffset((java.lang.Double) (-1.0d));
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Unit unit4 = unit0.setSymbol("yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ");
        java.lang.String str5 = unit4.GroupIdentifier;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Unit unit7 = unit4.setBaseMultiplier((java.lang.Double) 10.0d);
        unit7.UnitIdentifier = "/AQUARIUS/Acquisition/v2";
        org.junit.Assert.assertNotNull(unit2);
        org.junit.Assert.assertNotNull(unit4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(unit7);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.RatingCurve ratingCurve0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.RatingCurve();
        java.lang.String str1 = ratingCurve0.Equation;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ExpandedRatingCurve expandedRatingCurve2 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ExpandedRatingCurve();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.RatingCurveType ratingCurveType3 = expandedRatingCurve2.Type;
        expandedRatingCurve2.IsBlended = false;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ParameterWithUnit parameterWithUnit6 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ParameterWithUnit();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ExpandedRatingCurve expandedRatingCurve7 = expandedRatingCurve2.setOutputParameter(parameterWithUnit6);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.RatingCurve ratingCurve8 = ratingCurve0.setInputParameter(parameterWithUnit6);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ParameterWithUnit parameterWithUnit9 = ratingCurve0.getInputParameter();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ParameterWithUnit parameterWithUnit10 = null;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.RatingCurve ratingCurve11 = ratingCurve0.setInputParameter(parameterWithUnit10);
        java.lang.String str12 = ratingCurve11.Equation;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(ratingCurveType3);
        org.junit.Assert.assertNotNull(expandedRatingCurve7);
        org.junit.Assert.assertNotNull(ratingCurve8);
        org.junit.Assert.assertNotNull(parameterWithUnit9);
        org.junit.Assert.assertNotNull(ratingCurve11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CrossSectionSurveyActivity crossSectionSurveyActivity0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CrossSectionSurveyActivity();
        java.lang.String str1 = crossSectionSurveyActivity0.Channel;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.StartPointType startPointType2 = crossSectionSurveyActivity0.StartingPoint;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(startPointType2);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostUnitGroup postUnitGroup0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostUnitGroup();
        postUnitGroup0.BaseUnitSymbol = "hi!";
        postUnitGroup0.BaseUnitIdentifier = "'.'SSSSSSS";
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.UnitGroupBase unitGroupBase6 = postUnitGroup0.setTimeDimension((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(unitGroupBase6);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.EngineeredStructureDischargeActivity engineeredStructureDischargeActivity0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.EngineeredStructureDischargeActivity();
        engineeredStructureDischargeActivity0.StructureType = "/AQUARIUS/Acquisition/v2";
        java.lang.Boolean boolean3 = engineeredStructureDischargeActivity0.getIsValid();
        org.junit.Assert.assertNull(boolean3);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
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
        java.lang.String str20 = openIdConnectUser17.UniqueId;
        java.lang.Boolean boolean21 = openIdConnectUser17.Active;
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
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(boolean21);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.DeleteLocationFolder deleteLocationFolder0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.DeleteLocationFolder();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.DeleteLocationFolder deleteLocationFolder2 = deleteLocationFolder0.setLocationFolderUniqueId("MaxInstant");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.DeleteLocationFolder deleteLocationFolder4 = deleteLocationFolder2.setLocationFolderUniqueId("'.'SSSSSSS");
        java.lang.String str5 = deleteLocationFolder4.LocationFolderUniqueId;
        org.junit.Assert.assertNotNull(deleteLocationFolder2);
        org.junit.Assert.assertNotNull(deleteLocationFolder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "'.'SSSSSSS" + "'", str5, "'.'SSSSSSS");
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetChartDataV2 getChartDataV2_0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetChartDataV2();
        java.lang.String str1 = getChartDataV2_0.getActivityCustomId();
        java.util.List<java.lang.String> strList2 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetChartDataV2 getChartDataV2_3 = getChartDataV2_0.setSearch(strList2);
        java.util.List<java.lang.String> strList4 = getChartDataV2_3.ProjectIds;
        java.util.List<java.lang.String> strList5 = null;
        getChartDataV2_3.ActivityTypes = strList5;
        java.util.List<java.lang.String> strList7 = getChartDataV2_3.getQualityControlTypes();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(getChartDataV2_3);
        org.junit.Assert.assertNull(strList4);
        org.junit.Assert.assertNull(strList7);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.util.List<java.lang.String> strList1 = getObservationsV2_0.ResultGrades;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_3 = getObservationsV2_0.setFilterId("https");
        getObservationsV2_0.MinNumericResultValue = 1.0d;
        org.junit.Assert.assertNull(strList1);
        org.junit.Assert.assertNotNull(getObservationsV2_3);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.TagApplicability tagApplicability0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.TagApplicability.AppliesToLocationNotes;
        org.junit.Assert.assertTrue("'" + tagApplicability0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.TagApplicability.AppliesToLocationNotes + "'", tagApplicability0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.TagApplicability.AppliesToLocationNotes));
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutNullMeasureQualifier putNullMeasureQualifier0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutNullMeasureQualifier();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutNullMeasureQualifier putNullMeasureQualifier2 = putNullMeasureQualifier0.setId("hi!");
        putNullMeasureQualifier2.Name = "/AQUARIUS/Acquisition/v2://9999-12-31T23:59:59.999Z";
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutNullMeasureQualifier putNullMeasureQualifier6 = putNullMeasureQualifier2.setCustomId("");
        java.lang.String str7 = putNullMeasureQualifier2.getId();
        org.junit.Assert.assertNotNull(putNullMeasureQualifier2);
        org.junit.Assert.assertNotNull(putNullMeasureQualifier6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutActivity putActivity0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutActivity();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Quantity quantity1 = null;
        putActivity0.Depth = quantity1;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.MetricResult[] metricResultArray3 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.MetricResult[] {};
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.MetricResult> metricResultList4 = new java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.MetricResult>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.MetricResult>) metricResultList4, metricResultArray3);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutActivity putActivity6 = putActivity0.setMetricResults((java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.MetricResult>) metricResultList4);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ActivityWithDetailsType activityWithDetailsType7 = com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ActivityWithDetailsType.REPLICATE;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutActivity putActivity8 = putActivity0.setType(activityWithDetailsType7);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ActivityWithDetailsType activityWithDetailsType9 = com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ActivityWithDetailsType.REPLICATE;
        putActivity8.Type = activityWithDetailsType9;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutActivity putActivity12 = putActivity8.setCustomId("");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PlannedActivity plannedActivity13 = null;
        putActivity12.PlannedActivity = plannedActivity13;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Quantity quantity15 = putActivity12.getDepth();
        java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ExtendedAttribute> extendedAttributeList16 = putActivity12.ExtendedAttributes;
        org.junit.Assert.assertNotNull(metricResultArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(putActivity6);
        org.junit.Assert.assertTrue("'" + activityWithDetailsType7 + "' != '" + com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ActivityWithDetailsType.REPLICATE + "'", activityWithDetailsType7.equals(com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ActivityWithDetailsType.REPLICATE));
        org.junit.Assert.assertNotNull(putActivity8);
        org.junit.Assert.assertTrue("'" + activityWithDetailsType9 + "' != '" + com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ActivityWithDetailsType.REPLICATE + "'", activityWithDetailsType9.equals(com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ActivityWithDetailsType.REPLICATE));
        org.junit.Assert.assertNotNull(putActivity12);
        org.junit.Assert.assertNull(quantity15);
        org.junit.Assert.assertNull(extendedAttributeList16);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetShippingContainers getShippingContainers0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetShippingContainers();
        java.lang.Object obj1 = getShippingContainers0.getResponseType();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$SearchResultShippingContainer");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$SearchResultShippingContainer");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$SearchResultShippingContainer");
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ReferencePointPeriod referencePointPeriod0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ReferencePointPeriod();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ReferencePointPeriod referencePointPeriod2 = referencePointPeriod0.setStandardIdentifier("9999-12-31T23:59:59.999Z");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MeasurementDirection measurementDirection3 = referencePointPeriod2.MeasurementDirection;
        java.lang.String str4 = referencePointPeriod2.StandardIdentifier;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ReferencePointPeriod referencePointPeriod6 = referencePointPeriod2.setMethod("yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ");
        java.lang.Boolean boolean7 = referencePointPeriod6.getIsMeasuredAgainstLocalAssumedDatum();
        org.junit.Assert.assertNotNull(referencePointPeriod2);
        org.junit.Assert.assertNull(measurementDirection3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "9999-12-31T23:59:59.999Z" + "'", str4, "9999-12-31T23:59:59.999Z");
        org.junit.Assert.assertNotNull(referencePointPeriod6);
        org.junit.Assert.assertNull(boolean7);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ControlConditionActivity controlConditionActivity0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ControlConditionActivity();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ControlCleanedType controlCleanedType1 = null;
        controlConditionActivity0.ControlCleaned = controlCleanedType1;
        java.lang.String str3 = controlConditionActivity0.Comments;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.QuantityWithDisplay quantityWithDisplay4 = null;
        controlConditionActivity0.DistanceToGage = quantityWithDisplay4;
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostImportVerticalProfileData postImportVerticalProfileData0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostImportVerticalProfileData();
        postImportVerticalProfileData0.TimeZoneOffset = "/AQUARIUS/Acquisition/v2://9999-12-31T23:59:59.999Z";
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostImportVerticalProfileData postImportVerticalProfileData4 = postImportVerticalProfileData0.setSamplingLocationIds("");
        java.lang.String str5 = postImportVerticalProfileData4.getSamplingLocationIds();
        org.junit.Assert.assertNotNull(postImportVerticalProfileData4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
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
        java.lang.String str17 = postFieldVisitActivityWithTemplate0.CustomId;
        org.junit.Assert.assertNull(labInstructionTemplateList6);
        org.junit.Assert.assertNotNull(specimenTemplate9);
        org.junit.Assert.assertNull(labInstructionTemplateList12);
        org.junit.Assert.assertNotNull(specimenTemplateArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(postFieldVisitActivityWithTemplate16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutQualityCode putQualityCode0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutQualityCode();
        java.lang.String str1 = putQualityCode0.Color;
        putQualityCode0.GradeCode = 10;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutQualityCode putQualityCode5 = putQualityCode0.setGradeCode((java.lang.Integer) 4);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(putQualityCode5);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetUnits getUnits0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetUnits();
        java.lang.Object obj1 = getUnits0.getResponseType();
        java.lang.String str2 = getUnits0.getUnitgroup();
        java.lang.String str3 = getUnits0.getUnitgroup();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$SearchResultUnit");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$SearchResultUnit");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$SearchResultUnit");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostObservedProperty postObservedProperty0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostObservedProperty();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.UnitGroup unitGroup1 = postObservedProperty0.UnitGroup;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportHistoryEventSimple[] importHistoryEventSimpleArray2 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportHistoryEventSimple[] {};
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportHistoryEventSimple> importHistoryEventSimpleList3 = new java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportHistoryEventSimple>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportHistoryEventSimple>) importHistoryEventSimpleList3, importHistoryEventSimpleArray2);
        postObservedProperty0.ImportHistoryEventSimples = importHistoryEventSimpleList3;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Unit unit6 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostObservedProperty postObservedProperty7 = postObservedProperty0.setDefaultUnit(unit6);
        java.lang.String str8 = postObservedProperty0.Name;
        org.junit.Assert.assertNull(unitGroup1);
        org.junit.Assert.assertNotNull(importHistoryEventSimpleArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(postObservedProperty7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.FixedDropDownListItem fixedDropDownListItem0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.FixedDropDownListItem();
        fixedDropDownListItem0.DropDownListId = "9999-12-31T23:59:59.999Z";
        java.lang.String str3 = fixedDropDownListItem0.DropDownListId;
        fixedDropDownListItem0.DropDownListId = "http";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9999-12-31T23:59:59.999Z" + "'", str3, "9999-12-31T23:59:59.999Z");
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
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
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutBulkEditResultGradesV2 putBulkEditResultGradesV2_34 = putBulkEditResultGradesV2_32.setDepthValue((java.lang.Double) 100.0d);
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
        java.util.List<java.lang.String> strList54 = importItem35.getFields();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItem importItem55 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItem();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_56 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray58 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList59 = new java.util.ArrayList<java.lang.String>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList59, strArray58);
        getObservationsV2_56.SpecimenIds = strList59;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags62 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray66 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList67 = new java.util.ArrayList<java.lang.String>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList67, strArray66);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags69 = putLocationTags62.setTagUniqueIds(strList67);
        getObservationsV2_56.QualityControlTypes = strList67;
        java.util.List<java.lang.String> strList71 = getObservationsV2_56.getLabReportIds();
        importItem55.Errors = getObservationsV2_56;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_73 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.util.List<java.lang.String> strList74 = getObservationsV2_73.SamplingContextTagIds;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2 getObservationsV2_75 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetObservationsV2();
        java.lang.String[] strArray77 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList78 = new java.util.ArrayList<java.lang.String>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList78, strArray77);
        getObservationsV2_75.SpecimenIds = strList78;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags81 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags();
        java.lang.String[] strArray85 = new java.lang.String[] { "/AQUARIUS/Acquisition/v2", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList86 = new java.util.ArrayList<java.lang.String>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList86, strArray85);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutLocationTags putLocationTags88 = putLocationTags81.setTagUniqueIds(strList86);
        getObservationsV2_75.QualityControlTypes = strList86;
        getObservationsV2_73.ResultGrades = strList86;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItem importItem91 = importItem55.setFields((java.util.List<java.lang.String>) strList86);
        importItem35.Fields = strList86;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutBulkEditResultGradesV2 putBulkEditResultGradesV2_93 = putBulkEditResultGradesV2_34.setSamplingLocationGroupIds((java.util.List<java.lang.String>) strList86);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutBulkEditResultGradesV2 putBulkEditResultGradesV2_95 = putBulkEditResultGradesV2_34.setNumericResultValue((java.lang.Double) 100.0d);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutBulkEditResultGradesV2 putBulkEditResultGradesV2_97 = putBulkEditResultGradesV2_34.setImportHistoryEventId("yyyy'-'MM'-'dd'T'HH':'mm':'ss");
        java.util.List<java.lang.String> strList98 = putBulkEditResultGradesV2_34.Search;
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
        org.junit.Assert.assertNull(strList54);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(putLocationTags69);
        org.junit.Assert.assertNull(strList71);
        org.junit.Assert.assertNull(strList74);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(putLocationTags88);
        org.junit.Assert.assertNotNull(importItem91);
        org.junit.Assert.assertNotNull(putBulkEditResultGradesV2_93);
        org.junit.Assert.assertNotNull(putBulkEditResultGradesV2_95);
        org.junit.Assert.assertNotNull(putBulkEditResultGradesV2_97);
        org.junit.Assert.assertNotNull(strList98);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesDescription timeSeriesDescription0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesDescription();
        timeSeriesDescription0.UtcOffset = 100.0d;
        timeSeriesDescription0.Parameter = "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ";
        java.lang.String str5 = timeSeriesDescription0.getComputationPeriodIdentifier();
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
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
        java.util.List<java.lang.String> strList18 = getObservationsV2_0.getAnalyticalGroupIds();
        java.time.Instant instant19 = getObservationsV2_0.getStartObservedTime();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(putLocationTags13);
        org.junit.Assert.assertNull(strList15);
        org.junit.Assert.assertNull(strList16);
        org.junit.Assert.assertNull(fieldResultType17);
        org.junit.Assert.assertNull(strList18);
        org.junit.Assert.assertNull(instant19);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutTag putTag0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutTag();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditAttributes auditAttributes1 = putTag0.AuditAttributes;
        org.junit.Assert.assertNull(auditAttributes1);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditHistory auditHistory0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditHistory();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.UserProfile userProfile1 = auditHistory0.getUserProfile();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.UserProfile userProfile2 = null;
        auditHistory0.UserProfile = userProfile2;
        org.junit.Assert.assertNull(userProfile1);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish publish0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish();
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Vertical vertical0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Vertical();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.QuantityWithDisplay quantityWithDisplay1 = vertical0.SoundedDepth;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.QuantityWithDisplay quantityWithDisplay2 = null;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Vertical vertical3 = vertical0.setSegmentDischarge(quantityWithDisplay2);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.Vertical vertical5 = vertical3.setVerticalNumber((java.lang.Double) (-1.0d));
        vertical3.VerticalNumber = 100.0d;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.VelocityObservation velocityObservation8 = vertical3.VelocityObservation;
        org.junit.Assert.assertNull(quantityWithDisplay1);
        org.junit.Assert.assertNotNull(vertical3);
        org.junit.Assert.assertNotNull(vertical5);
        org.junit.Assert.assertNull(velocityObservation8);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostFieldVisitActivityWithTemplate postFieldVisitActivityWithTemplate0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostFieldVisitActivityWithTemplate();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.CollectionMethod collectionMethod1 = null;
        postFieldVisitActivityWithTemplate0.CollectionMethod = collectionMethod1;
        java.lang.Object obj3 = postFieldVisitActivityWithTemplate0.getResponseType();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$Activity");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$Activity");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "class com.aquaticinformatics.aquarius.sdk.samples.ServiceModel$Activity");
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ExtendedAttributeFilter extendedAttributeFilter0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ExtendedAttributeFilter();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ExtendedAttributeFilter extendedAttributeFilter2 = extendedAttributeFilter0.setFilterValue("/AQUARIUS/Acquisition/v2");
        java.lang.String str3 = extendedAttributeFilter0.getFilterValue();
        extendedAttributeFilter0.FilterName = "";
        org.junit.Assert.assertNotNull(extendedAttributeFilter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/AQUARIUS/Acquisition/v2" + "'", str3, "/AQUARIUS/Acquisition/v2");
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutUnitGroupWithUnit putUnitGroupWithUnit0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutUnitGroupWithUnit();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutUnitGroupWithUnit putUnitGroupWithUnit2 = putUnitGroupWithUnit0.setId("yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.UnitGroupSystemCodeType unitGroupSystemCodeType3 = putUnitGroupWithUnit0.SystemCode;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutUnitGroupWithUnit putUnitGroupWithUnit5 = putUnitGroupWithUnit0.setCustomId("/AQUARIUS/Acquisition/v2");
        putUnitGroupWithUnit5.Id = "/AQUARIUS/Provisioning/v1";
        java.lang.String str8 = putUnitGroupWithUnit5.CustomId;
        org.junit.Assert.assertNotNull(putUnitGroupWithUnit2);
        org.junit.Assert.assertNull(unitGroupSystemCodeType3);
        org.junit.Assert.assertNotNull(putUnitGroupWithUnit5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/AQUARIUS/Acquisition/v2" + "'", str8, "/AQUARIUS/Acquisition/v2");
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetStandardHistory getStandardHistory0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.GetStandardHistory();
        java.lang.String str1 = getStandardHistory0.getId();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationMonitoringMethod locationMonitoringMethod0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationMonitoringMethod();
        java.lang.String str1 = locationMonitoringMethod0.getModel();
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TagMetadata> tagMetadataList2 = null;
        locationMonitoringMethod0.Tags = tagMetadataList2;
        java.lang.String str4 = locationMonitoringMethod0.getParameterId();
        java.lang.String str5 = locationMonitoringMethod0.Parameter;
        locationMonitoringMethod0.UnitName = "'.'SSSSSSS";
        java.lang.String str8 = locationMonitoringMethod0.getSubLocationIdentifier();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostStatisticalDerivedTimeSeries postStatisticalDerivedTimeSeries0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostStatisticalDerivedTimeSeries();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostStatisticalDerivedTimeSeries postStatisticalDerivedTimeSeries2 = postStatisticalDerivedTimeSeries0.setComment("'.'SSSSSSS");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostStatisticalDerivedTimeSeries postStatisticalDerivedTimeSeries4 = postStatisticalDerivedTimeSeries0.setLabel("'.'SSSSSSS");
        postStatisticalDerivedTimeSeries0.LocationUniqueId = "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSSSSSZZZZZ";
        postStatisticalDerivedTimeSeries0.ComputationIdentifier = "https";
        org.junit.Assert.assertNotNull(postStatisticalDerivedTimeSeries2);
        org.junit.Assert.assertNotNull(postStatisticalDerivedTimeSeries4);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CrossSectionSurveyActivity> crossSectionSurveyActivityList0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.IFieldVisitData.CrossSectionSurveyActivity;
        org.junit.Assert.assertNull(crossSectionSurveyActivityList0);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AttachmentRepresentation attachmentRepresentation0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AttachmentRepresentation();
        java.lang.String str1 = attachmentRepresentation0.getLongitude();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AttachmentRepresentation attachmentRepresentation3 = attachmentRepresentation0.setContentType("yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSSSSSZZZZZ");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AttachmentRepresentation attachmentRepresentation5 = attachmentRepresentation3.setLongitude("hi!");
        java.lang.String str6 = attachmentRepresentation3.getComment();
        java.lang.String str7 = attachmentRepresentation3.Comment;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(attachmentRepresentation3);
        org.junit.Assert.assertNotNull(attachmentRepresentation5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel serviceModel0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel();
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        java.lang.String str0 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.DurationDeserializer.JsonMaxValue;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "MaxDuration" + "'", str0, "MaxDuration");
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
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
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutBulkEditResultGradesV2 putBulkEditResultGradesV2_34 = putBulkEditResultGradesV2_32.setDepthValue((java.lang.Double) 100.0d);
        java.time.Instant instant35 = putBulkEditResultGradesV2_34.getStartModificationTime();
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
        org.junit.Assert.assertNull(instant35);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostObservedProperty postObservedProperty0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostObservedProperty();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostLabAnalysisMethod postLabAnalysisMethod1 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostLabAnalysisMethod();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation observation2 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation();
        observation2.CustomId = "hi!";
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.CategoricalResult categoricalResult5 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation observation6 = observation2.setCategoricalResult(categoricalResult5);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportHistoryEventSimple[] importHistoryEventSimpleArray7 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportHistoryEventSimple[] {};
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportHistoryEventSimple> importHistoryEventSimpleList8 = new java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportHistoryEventSimple>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportHistoryEventSimple>) importHistoryEventSimpleList8, importHistoryEventSimpleArray7);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.Observation observation10 = observation2.setImportHistoryEventSimples((java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportHistoryEventSimple>) importHistoryEventSimpleList8);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostLabAnalysisMethod postLabAnalysisMethod11 = postLabAnalysisMethod1.setImportHistoryEventSimples((java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportHistoryEventSimple>) importHistoryEventSimpleList8);
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostObservedProperty postObservedProperty12 = postObservedProperty0.setImportHistoryEventSimples((java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportHistoryEventSimple>) importHistoryEventSimpleList8);
        java.lang.String str13 = postObservedProperty12.getCustomId();
        org.junit.Assert.assertNotNull(observation6);
        org.junit.Assert.assertNotNull(importHistoryEventSimpleArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(observation10);
        org.junit.Assert.assertNotNull(postLabAnalysisMethod11);
        org.junit.Assert.assertNotNull(postObservedProperty12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
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
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedProperty observedProperty72 = importItemObservedProperty71.getExistingItem();
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
        org.junit.Assert.assertNull(observedProperty72);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostDatumConvertedTimeSeries postDatumConvertedTimeSeries0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostDatumConvertedTimeSeries();
        postDatumConvertedTimeSeries0.SourceIsLocalAssumedDatum = false;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PostDatumConvertedTimeSeries postDatumConvertedTimeSeries4 = postDatumConvertedTimeSeries0.setComputationPeriodIdentifier("/AQUARIUS/Acquisition/v2://9999-12-31T23:59:59.999Z");
        postDatumConvertedTimeSeries0.Label = "MaxInstant";
        org.junit.Assert.assertNotNull(postDatumConvertedTimeSeries4);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ControlConditionActivity controlConditionActivity0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.IFieldVisitData.ControlConditionActivity;
        org.junit.Assert.assertNull(controlConditionActivity0);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.OpenIdConnectUser openIdConnectUser0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.OpenIdConnectUser();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.OpenIdConnectUser openIdConnectUser2 = openIdConnectUser0.setIdentifier("");
        java.lang.String str3 = openIdConnectUser2.FirstName;
        java.lang.String str4 = openIdConnectUser2.getFirstName();
        java.lang.Boolean boolean5 = openIdConnectUser2.Active;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.User user7 = openIdConnectUser2.setSystem((java.lang.Boolean) false);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.User user9 = openIdConnectUser2.setLastName("MinInstant");
        java.lang.String str10 = user9.AuthenticationType;
        org.junit.Assert.assertNotNull(openIdConnectUser2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertNotNull(user9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedPropertyImportSummary observedPropertyImportSummary0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedPropertyImportSummary();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedPropertyImportSummary observedPropertyImportSummary1 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedPropertyImportSummary();
        observedPropertyImportSummary1.ErrorCount = 10;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedPropertyImportSummary observedPropertyImportSummary5 = observedPropertyImportSummary1.setSummaryReportText("");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemObservedProperty[] importItemObservedPropertyArray6 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemObservedProperty[] {};
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemObservedProperty> importItemObservedPropertyList7 = new java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemObservedProperty>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemObservedProperty>) importItemObservedPropertyList7, importItemObservedPropertyArray6);
        observedPropertyImportSummary1.ErrorImportItems = importItemObservedPropertyList7;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedPropertyImportSummary observedPropertyImportSummary11 = observedPropertyImportSummary1.setSuccessCount((java.lang.Integer) 10);
        java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemObservedProperty> importItemObservedPropertyList12 = observedPropertyImportSummary11.getErrorImportItems();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ObservedPropertyImportSummary observedPropertyImportSummary13 = observedPropertyImportSummary0.setErrorImportItems(importItemObservedPropertyList12);
        java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportItemObservedProperty> importItemObservedPropertyList14 = observedPropertyImportSummary13.getImportItems();
        org.junit.Assert.assertNotNull(observedPropertyImportSummary5);
        org.junit.Assert.assertNotNull(importItemObservedPropertyArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(observedPropertyImportSummary11);
        org.junit.Assert.assertNotNull(importItemObservedPropertyList12);
        org.junit.Assert.assertNotNull(observedPropertyImportSummary13);
        org.junit.Assert.assertNull(importItemObservedPropertyList14);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutTimeSeries putTimeSeries0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutTimeSeries();
        java.lang.String str1 = putTimeSeries0.Description;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutTimeSeries putTimeSeries3 = putTimeSeries0.setComment("yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSSSSSZZZZZ");
        java.lang.String str4 = putTimeSeries3.getComment();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(putTimeSeries3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSSSSSZZZZZ" + "'", str4, "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSSSSSZZZZZ");
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReading fieldVisitReading0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReading();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReading fieldVisitReading2 = fieldVisitReading0.setUseLocationDatumAsReference((java.lang.Boolean) true);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.FieldVisitReading fieldVisitReading4 = fieldVisitReading2.setParameter("0001-01-01T00:00:00.000Z");
        fieldVisitReading4.FieldVisitIdentifier = "POST";
        org.junit.Assert.assertNotNull(fieldVisitReading2);
        org.junit.Assert.assertNotNull(fieldVisitReading4);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesDescriptionListByUniqueIdServiceResponse timeSeriesDescriptionListByUniqueIdServiceResponse0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesDescriptionListByUniqueIdServiceResponse();
        java.lang.String str1 = timeSeriesDescriptionListByUniqueIdServiceResponse0.getSummary();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesDescription timeSeriesDescription2 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesDescription();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest timeAlignedDataServiceRequest3 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest();
        java.lang.Object obj4 = timeAlignedDataServiceRequest3.getResponseType();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse5 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse();
        java.time.Instant instant6 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse7 = locationDescriptionListServiceResponse5.setNextToken(instant6);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest timeAlignedDataServiceRequest8 = timeAlignedDataServiceRequest3.setQueryFrom(instant6);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesDescription timeSeriesDescription9 = timeSeriesDescription2.setRawStartTime(instant6);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesDescription timeSeriesDescription10 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesDescription();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesDescription timeSeriesDescription11 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesDescription();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest timeAlignedDataServiceRequest12 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest();
        java.lang.Object obj13 = timeAlignedDataServiceRequest12.getResponseType();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse14 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse();
        java.time.Instant instant15 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse16 = locationDescriptionListServiceResponse14.setNextToken(instant15);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest timeAlignedDataServiceRequest17 = timeAlignedDataServiceRequest12.setQueryFrom(instant15);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesDescription timeSeriesDescription18 = timeSeriesDescription11.setRawStartTime(instant15);
        java.lang.String str19 = timeSeriesDescription11.Unit;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesDescription timeSeriesDescription20 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesDescription();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest timeAlignedDataServiceRequest21 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest();
        java.lang.Object obj22 = timeAlignedDataServiceRequest21.getResponseType();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse23 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse();
        java.time.Instant instant24 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse25 = locationDescriptionListServiceResponse23.setNextToken(instant24);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest timeAlignedDataServiceRequest26 = timeAlignedDataServiceRequest21.setQueryFrom(instant24);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesDescription timeSeriesDescription27 = timeSeriesDescription20.setRawStartTime(instant24);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesDescription timeSeriesDescription28 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesDescription();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesDescription timeSeriesDescription29 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesDescription();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest timeAlignedDataServiceRequest30 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest();
        java.lang.Object obj31 = timeAlignedDataServiceRequest30.getResponseType();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse32 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse();
        java.time.Instant instant33 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse34 = locationDescriptionListServiceResponse32.setNextToken(instant33);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest timeAlignedDataServiceRequest35 = timeAlignedDataServiceRequest30.setQueryFrom(instant33);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesDescription timeSeriesDescription36 = timeSeriesDescription29.setRawStartTime(instant33);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesDescription timeSeriesDescription37 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesDescription();
        timeSeriesDescription37.UtcOffset = 100.0d;
        timeSeriesDescription37.Parameter = "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSZZZZZ";
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesDescription timeSeriesDescription42 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesDescription();
        java.lang.String str43 = timeSeriesDescription42.Parameter;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesDescription timeSeriesDescription44 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesDescription();
        java.lang.String str45 = timeSeriesDescription44.Parameter;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesDescription timeSeriesDescription46 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesDescription();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest timeAlignedDataServiceRequest47 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest();
        java.lang.Object obj48 = timeAlignedDataServiceRequest47.getResponseType();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse49 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse();
        java.time.Instant instant50 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse51 = locationDescriptionListServiceResponse49.setNextToken(instant50);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest timeAlignedDataServiceRequest52 = timeAlignedDataServiceRequest47.setQueryFrom(instant50);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesDescription timeSeriesDescription53 = timeSeriesDescription46.setRawStartTime(instant50);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesDescription timeSeriesDescription54 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesDescription();
        java.lang.String str55 = timeSeriesDescription54.Parameter;
        timeSeriesDescription54.UtcOffsetIsoDuration = "9999-12-31T23:59:59.999Z";
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesDescription timeSeriesDescription58 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesDescription();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest timeAlignedDataServiceRequest59 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest();
        java.lang.Object obj60 = timeAlignedDataServiceRequest59.getResponseType();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse61 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse();
        java.time.Instant instant62 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse63 = locationDescriptionListServiceResponse61.setNextToken(instant62);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeAlignedDataServiceRequest timeAlignedDataServiceRequest64 = timeAlignedDataServiceRequest59.setQueryFrom(instant62);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesDescription timeSeriesDescription65 = timeSeriesDescription58.setRawStartTime(instant62);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesDescription timeSeriesDescription67 = timeSeriesDescription65.setSubLocationIdentifier("");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesDescription timeSeriesDescription69 = timeSeriesDescription67.setUniqueId("/AQUARIUS/Provisioning/v1");
        timeSeriesDescription67.TimeSeriesType = "hi!";
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesDescription timeSeriesDescription72 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesDescription();
        java.lang.String str73 = timeSeriesDescription72.Parameter;
        timeSeriesDescription72.UtcOffsetIsoDuration = "9999-12-31T23:59:59.999Z";
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesDescription[] timeSeriesDescriptionArray76 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesDescription[] { timeSeriesDescription2, timeSeriesDescription10, timeSeriesDescription11, timeSeriesDescription20, timeSeriesDescription28, timeSeriesDescription36, timeSeriesDescription37, timeSeriesDescription42, timeSeriesDescription44, timeSeriesDescription46, timeSeriesDescription54, timeSeriesDescription67, timeSeriesDescription72 };
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesDescription> timeSeriesDescriptionList77 = new java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesDescription>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesDescription>) timeSeriesDescriptionList77, timeSeriesDescriptionArray76);
        timeSeriesDescriptionListByUniqueIdServiceResponse0.TimeSeriesDescriptions = timeSeriesDescriptionList77;
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.TimeSeriesDescription> timeSeriesDescriptionList80 = timeSeriesDescriptionListByUniqueIdServiceResponse0.getTimeSeriesDescriptions();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse81 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary82 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary84 = dischargeSummary82.setPublish((java.lang.Boolean) false);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse85 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse();
        java.time.Instant instant86 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse87 = locationDescriptionListServiceResponse85.setNextToken(instant86);
        dischargeSummary82.MeasurementTime = instant86;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse89 = locationDescriptionListServiceResponse81.setNextToken(instant86);
        java.time.Instant instant90 = locationDescriptionListServiceResponse81.getNextToken();
        java.time.Instant instant91 = locationDescriptionListServiceResponse81.NextToken;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.PublishServiceResponse publishServiceResponse92 = timeSeriesDescriptionListByUniqueIdServiceResponse0.setResponseTime(instant91);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeAlignedDataServiceResponse");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeAlignedDataServiceResponse");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeAlignedDataServiceResponse");
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(locationDescriptionListServiceResponse7);
        org.junit.Assert.assertNotNull(timeAlignedDataServiceRequest8);
        org.junit.Assert.assertNotNull(timeSeriesDescription9);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeAlignedDataServiceResponse");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeAlignedDataServiceResponse");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeAlignedDataServiceResponse");
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertNotNull(locationDescriptionListServiceResponse16);
        org.junit.Assert.assertNotNull(timeAlignedDataServiceRequest17);
        org.junit.Assert.assertNotNull(timeSeriesDescription18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeAlignedDataServiceResponse");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeAlignedDataServiceResponse");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeAlignedDataServiceResponse");
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertNotNull(locationDescriptionListServiceResponse25);
        org.junit.Assert.assertNotNull(timeAlignedDataServiceRequest26);
        org.junit.Assert.assertNotNull(timeSeriesDescription27);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeAlignedDataServiceResponse");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeAlignedDataServiceResponse");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeAlignedDataServiceResponse");
        org.junit.Assert.assertNotNull(instant33);
        org.junit.Assert.assertNotNull(locationDescriptionListServiceResponse34);
        org.junit.Assert.assertNotNull(timeAlignedDataServiceRequest35);
        org.junit.Assert.assertNotNull(timeSeriesDescription36);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertEquals(obj48.toString(), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeAlignedDataServiceResponse");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj48), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeAlignedDataServiceResponse");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj48), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeAlignedDataServiceResponse");
        org.junit.Assert.assertNotNull(instant50);
        org.junit.Assert.assertNotNull(locationDescriptionListServiceResponse51);
        org.junit.Assert.assertNotNull(timeAlignedDataServiceRequest52);
        org.junit.Assert.assertNotNull(timeSeriesDescription53);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertEquals(obj60.toString(), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeAlignedDataServiceResponse");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj60), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeAlignedDataServiceResponse");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj60), "class com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish$TimeAlignedDataServiceResponse");
        org.junit.Assert.assertNotNull(instant62);
        org.junit.Assert.assertNotNull(locationDescriptionListServiceResponse63);
        org.junit.Assert.assertNotNull(timeAlignedDataServiceRequest64);
        org.junit.Assert.assertNotNull(timeSeriesDescription65);
        org.junit.Assert.assertNotNull(timeSeriesDescription67);
        org.junit.Assert.assertNotNull(timeSeriesDescription69);
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertNotNull(timeSeriesDescriptionArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(timeSeriesDescriptionList80);
        org.junit.Assert.assertNotNull(dischargeSummary84);
        org.junit.Assert.assertNotNull(instant86);
        org.junit.Assert.assertNotNull(locationDescriptionListServiceResponse87);
        org.junit.Assert.assertNotNull(locationDescriptionListServiceResponse89);
        org.junit.Assert.assertNotNull(instant90);
        org.junit.Assert.assertNotNull(instant91);
        org.junit.Assert.assertNotNull(publishServiceResponse92);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.RatingCurve ratingCurve0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.RatingCurve();
        java.lang.String str1 = ratingCurve0.Equation;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ExpandedRatingCurve expandedRatingCurve2 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ExpandedRatingCurve();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.RatingCurveType ratingCurveType3 = expandedRatingCurve2.Type;
        expandedRatingCurve2.IsBlended = false;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ParameterWithUnit parameterWithUnit6 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ParameterWithUnit();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ExpandedRatingCurve expandedRatingCurve7 = expandedRatingCurve2.setOutputParameter(parameterWithUnit6);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.RatingCurve ratingCurve8 = ratingCurve0.setInputParameter(parameterWithUnit6);
        java.util.ArrayList<com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.RatingPoint> ratingPointList9 = ratingCurve8.getBaseRatingTable();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(ratingCurveType3);
        org.junit.Assert.assertNotNull(expandedRatingCurve7);
        org.junit.Assert.assertNotNull(ratingCurve8);
        org.junit.Assert.assertNull(ratingPointList9);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ControlConditionActivity controlConditionActivity0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ControlConditionActivity();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ControlCleanedType controlCleanedType1 = null;
        controlConditionActivity0.ControlCleaned = controlCleanedType1;
        java.time.Instant instant3 = controlConditionActivity0.getDateCleaned();
        java.lang.String str4 = controlConditionActivity0.FlowOverControl;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ControlConditionActivity controlConditionActivity6 = controlConditionActivity0.setComments("yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSSSSSSZZZZZ");
        controlConditionActivity6.ControlCode = "hi!";
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.QuantityWithDisplay quantityWithDisplay9 = null;
        controlConditionActivity6.DistanceToGage = quantityWithDisplay9;
        org.junit.Assert.assertNull(instant3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(controlConditionActivity6);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CorrectionType correctionType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CorrectionType.PersistenceGapFill;
        org.junit.Assert.assertTrue("'" + correctionType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CorrectionType.PersistenceGapFill + "'", correctionType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.CorrectionType.PersistenceGapFill));
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Unit unit0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Unit();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.Unit unit2 = unit0.setPluralName("");
        unit2.GroupIdentifier = "POST";
        org.junit.Assert.assertNotNull(unit2);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostSpreadsheetTemplate postSpreadsheetTemplate0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostSpreadsheetTemplate();
        java.lang.String str1 = postSpreadsheetTemplate0.Id;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.SpreadsheetTemplateType spreadsheetTemplateType2 = postSpreadsheetTemplate0.Type;
        java.lang.String str3 = postSpreadsheetTemplate0.CustomId;
        java.lang.String str4 = postSpreadsheetTemplate0.Id;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(spreadsheetTemplateType2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ReferenceStandardOffset referenceStandardOffset0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ReferenceStandardOffset();
        java.lang.String str1 = referenceStandardOffset0.getStandard();
        java.lang.String str2 = referenceStandardOffset0.getStandard();
        java.lang.Double double3 = referenceStandardOffset0.getUncertainty();
        java.lang.Double double4 = referenceStandardOffset0.Uncertainty;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ReferenceStandardOffset referenceStandardOffset6 = referenceStandardOffset0.setUncertainty((java.lang.Double) 1.0d);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(double3);
        org.junit.Assert.assertNull(double4);
        org.junit.Assert.assertNotNull(referenceStandardOffset6);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationUserRoles locationUserRoles0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.LocationUserRoles();
        java.lang.String str1 = locationUserRoles0.getLocationUniqueId();
        java.lang.String str2 = locationUserRoles0.getLocationUniqueId();
        java.lang.String str3 = locationUserRoles0.getLocationUniqueId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditHistory auditHistory0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditHistory();
        java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditChange> auditChangeList1 = auditHistory0.getAuditChanges();
        java.util.List<com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditChange> auditChangeList2 = auditHistory0.getAuditChanges();
        java.time.OffsetDateTime offsetDateTime3 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AuditHistory auditHistory4 = auditHistory0.setModificationTime(offsetDateTime3);
        java.time.OffsetDateTime offsetDateTime5 = auditHistory4.ModificationTime;
        org.junit.Assert.assertNull(auditChangeList1);
        org.junit.Assert.assertNull(auditChangeList2);
        org.junit.Assert.assertNotNull(auditHistory4);
        org.junit.Assert.assertNull(offsetDateTime5);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary();
        dischargeSummary0.Reviewer = "";
        java.time.Instant instant3 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        dischargeSummary0.MeasurementTime = instant3;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.BaseFlowType baseFlowType5 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.BaseFlowType.BaseFlow;
        dischargeSummary0.BaseFlow = baseFlowType5;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeUncertainty dischargeUncertainty7 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeUncertainty();
        dischargeSummary0.DischargeUncertainty = dischargeUncertainty7;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.QualitativeUncertaintyType qualitativeUncertaintyType9 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.QualitativeUncertaintyType.Fair;
        dischargeUncertainty7.QualitativeUncertainty = qualitativeUncertaintyType9;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.UncertaintyType uncertaintyType11 = dischargeUncertainty7.getActiveUncertaintyType();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertTrue("'" + baseFlowType5 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.BaseFlowType.BaseFlow + "'", baseFlowType5.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.BaseFlowType.BaseFlow));
        org.junit.Assert.assertTrue("'" + qualitativeUncertaintyType9 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.QualitativeUncertaintyType.Fair + "'", qualitativeUncertaintyType9.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.QualitativeUncertaintyType.Fair));
        org.junit.Assert.assertNull(uncertaintyType11);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.TimeSeries timeSeries0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.TimeSeries();
        timeSeries0.Publish = false;
        timeSeries0.ComputationIdentifier = "2021.4.62.0";
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutOpenIdConnectAuth putOpenIdConnectAuth0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning.PutOpenIdConnectAuth();
        java.lang.String str1 = putOpenIdConnectAuth0.getSubjectIdentifier();
        java.lang.String str2 = putOpenIdConnectAuth0.SubjectIdentifier;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabInstructionMinimal labInstructionMinimal0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabInstructionMinimal();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabInstructionMinimal labInstructionMinimal2 = labInstructionMinimal0.setAnalysisComment("9999-12-31T23:59:59.999Z");
        labInstructionMinimal0.PreparationMethod = "-PT87591240H";
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.AnalysisMethodMinimal analysisMethodMinimal5 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.LabInstructionMinimal labInstructionMinimal6 = labInstructionMinimal0.setAnalysisMethod(analysisMethodMinimal5);
        java.lang.String str7 = labInstructionMinimal6.getPreparationMethod();
        org.junit.Assert.assertNotNull(labInstructionMinimal2);
        org.junit.Assert.assertNotNull(labInstructionMinimal6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-PT87591240H" + "'", str7, "-PT87591240H");
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostUnit postUnit0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PostUnit();
        postUnit0.BaseMultiplier = (-1.0d);
        java.lang.String str3 = postUnit0.CustomId;
        postUnit0.BaseOffset = 1.0d;
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportHistoryEvent importHistoryEvent0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.ImportHistoryEvent();
        importHistoryEvent0.Id = "9999-12-31T23:59:59.999Z";
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ReasonForAdjustmentType reasonForAdjustmentType0 = com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ReasonForAdjustmentType.MainChannelFlowOnly;
        org.junit.Assert.assertTrue("'" + reasonForAdjustmentType0 + "' != '" + com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ReasonForAdjustmentType.MainChannelFlowOnly + "'", reasonForAdjustmentType0.equals(com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.ReasonForAdjustmentType.MainChannelFlowOnly));
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MethodOperation methodOperation0 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MethodOperation();
        java.time.Instant instant1 = methodOperation0.getDateAppliedUtc();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary2 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary();
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.DischargeSummary dischargeSummary4 = dischargeSummary2.setPublish((java.lang.Boolean) false);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse5 = new com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse();
        java.time.Instant instant6 = com.aquaticinformatics.aquarius.sdk.timeseries.serializers.InstantDeserializer.MaxConcreteValue;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDescriptionListServiceResponse locationDescriptionListServiceResponse7 = locationDescriptionListServiceResponse5.setNextToken(instant6);
        dischargeSummary2.MeasurementTime = instant6;
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MethodOperation methodOperation9 = methodOperation0.setDateAppliedUtc(instant6);
        com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.MetadataChangeOperationType metadataChangeOperationType10 = methodOperation9.getOperationType();
        methodOperation9.User = "/AQUARIUS/Acquisition/v2";
        org.junit.Assert.assertNull(instant1);
        org.junit.Assert.assertNotNull(dischargeSummary4);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(locationDescriptionListServiceResponse7);
        org.junit.Assert.assertNotNull(methodOperation9);
        org.junit.Assert.assertNull(metadataChangeOperationType10);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutUserV2 putUserV2_0 = new com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutUserV2();
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.UserType userType1 = putUserV2_0.UserType;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutUserV2 putUserV2_3 = putUserV2_0.setEmail("MaxInstant");
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.UserProfile userProfile4 = null;
        com.aquaticinformatics.aquarius.sdk.samples.ServiceModel.PutUserV2 putUserV2_5 = putUserV2_0.setUserProfile(userProfile4);
        java.util.List<java.lang.String> strList6 = putUserV2_0.getRoles();
        putUserV2_0.Email = "0001-01-01T00:00:00.000Z";
        org.junit.Assert.assertNull(userType1);
        org.junit.Assert.assertNotNull(putUserV2_3);
        org.junit.Assert.assertNotNull(putUserV2_5);
        org.junit.Assert.assertNull(strList6);
    }
}

