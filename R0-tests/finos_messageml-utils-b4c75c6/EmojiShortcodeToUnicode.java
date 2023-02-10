package org.symphonyoss.symphony.messageml.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import org.inlinetest.Here;
import static org.inlinetest.Here.group;

/**
 * Class that contains HashMap which has conversion shortcode -> unicode for all supported Emojis.
 * @author cristiadu
 * @since 10/10/17
 */
public class EmojiShortcodeToUnicode {

    private static final String EMOJI_JSON_FILE = "emoji.properties";

    private static final Map<String, String> emojiShortcodeToUnicode = new HashMap<>();

    public static String getUnicode(String shortcode) {
        return emojiShortcodeToUnicode.get(shortcode);
    }

    public static Boolean hasUnicodeRepresentation(String shortcode) {
        return (emojiShortcodeToUnicode.get(shortcode) != null);
    }

    private static String emojiToUnicodeString(int... unicodes) {
        return new String(unicodes, 0, unicodes.length);
    }

    // Loads emoticons from file because the list is too big for a java class
    static {
        try (InputStream is = EmojiShortcodeToUnicode.class.getClassLoader().getResourceAsStream(EMOJI_JSON_FILE)) {
            Properties properties = new Properties();
            properties.load(is);
            for (String key : properties.stringPropertyNames()) {
                String[] unicodeAStringArray = properties.getProperty(key).split(",");
                new Here("Randoop", 36).given(key, "kiss_mm").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f468", "0x0000200d", "0x00002764", "0x0000fe0f", "0x0000200d", "0x0001f48b", "0x0000200d", "0x0001f468" });
                new Here("Randoop", 36).given(key, "woman_standing_medium_dark_skin_tone").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f9cd", "0x0001f3fe", "0x0000200d", "0x00002640", "0x0000fe0f" });
                new Here("Unit", 36).given(key, "man_walking_tone1").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f6b6", "0x0001f3fb", "0x0000200d", "0x00002642", "0x0000fe0f" });
                new Here("Unit", 36).given(key, "thunder_cloud_rain").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x000026c8", "0x0000fe0f" });
                new Here("Unit", 36).given(key, "person_in_motorized_wheelchair_dark_skin_tone").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f9d1", "0x0001f3ff", "0x0000200d", "0x0001f9bc" });
                new Here("Randoop", 36).given(key, "judge").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f9d1", "0x0000200d", "0x00002696", "0x0000fe0f" });
                new Here("Unit", 36).given(key, "woman_frowning_tone4").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f64d", "0x0001f3fe", "0x0000200d", "0x00002640", "0x0000fe0f" });
                new Here("Randoop", 36).given(key, "no_good_tone5").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f645", "0x0001f3ff" });
                new Here("Unit", 36).given(key, "mouse2").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f401" });
                new Here("Unit", 36).given(key, "person_light_skin_tone_curly_hair").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f9d1", "0x0001f3fb", "0x0000200d", "0x0001f9b1" });
                new Here("Unit", 36).given(key, "man_scientist_medium_light_skin_tone").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f468", "0x0001f3fc", "0x0000200d", "0x0001f52c" });
                new Here("Randoop", 36).given(key, "man_surfing_light_skin_tone").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f3c4", "0x0001f3fb", "0x0000200d", "0x00002642", "0x0000fe0f" });
                new Here("Randoop", 36).given(key, "man_factory_worker_medium_dark_skin_tone").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f468", "0x0001f3fe", "0x0000200d", "0x0001f3ed" });
                new Here("Unit", 36).given(key, "man_in_tuxedo_tone3").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f935", "0x0001f3fd" });
                new Here("Unit", 36).given(key, "man_mountain_biking_light_skin_tone").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f6b5", "0x0001f3fb", "0x0000200d", "0x00002642", "0x0000fe0f" });
                new Here("Randoop", 36).given(key, "pilot_medium_dark_skin_tone").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f9d1", "0x0001f3fe", "0x0000200d", "0x00002708", "0x0000fe0f" });
                new Here("Randoop", 36).given(key, "man_walking_tone5").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f6b6", "0x0001f3ff", "0x0000200d", "0x00002642", "0x0000fe0f" });
                new Here("Randoop", 36).given(key, "man_judge_light_skin_tone").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f468", "0x0001f3fb", "0x0000200d", "0x00002696", "0x0000fe0f" });
                new Here("Randoop", 36).given(key, "hourglass_flowing_sand").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x000023f3" });
                new Here("Randoop", 36).given(key, "woman_getting_haircut_dark_skin_tone").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f487", "0x0001f3ff", "0x0000200d", "0x00002640", "0x0000fe0f" });
                new Here("Unit", 36).given(key, "guardsman").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f482" });
                new Here("Unit", 36).given(key, "gemini").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0000264a" });
                new Here("Unit", 36).given(key, "owl").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f989" });
                new Here("Unit", 36).given(key, "stethoscope").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001fa7a" });
                new Here("Randoop", 36).given(key, "woman_frowning_tone5").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f64d", "0x0001f3ff", "0x0000200d", "0x00002640", "0x0000fe0f" });
                new Here("Randoop", 36).given(key, "woman_in_manual_wheelchair_medium_dark_skin_tone").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f469", "0x0001f3fe", "0x0000200d", "0x0001f9bd" });
                new Here("Randoop", 36).given(key, "man_red_haired_medium_dark_skin_tone").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f468", "0x0001f3fe", "0x0000200d", "0x0001f9b0" });
                new Here("Unit", 36).given(key, "speak_no_evil").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f64a" });
                new Here("Randoop", 36).given(key, "woman_cook_dark_skin_tone").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f469", "0x0001f3ff", "0x0000200d", "0x0001f373" });
                new Here("Unit", 36).given(key, "woman_frowning_tone5").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f64d", "0x0001f3ff", "0x0000200d", "0x00002640", "0x0000fe0f" });
                new Here("Randoop", 36).given(key, "man_supervillain_dark_skin_tone").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f9b9", "0x0001f3ff", "0x0000200d", "0x00002642", "0x0000fe0f" });
                new Here("Unit", 36).given(key, "older_man").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f474" });
                new Here("Unit", 36).given(key, "no_good_tone4").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f645", "0x0001f3fe" });
                new Here("Randoop", 36).given(key, "partly_sunny").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x000026c5" });
                new Here("Unit", 36).given(key, "man_walking_tone2").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f6b6", "0x0001f3fc", "0x0000200d", "0x00002642", "0x0000fe0f" });
                new Here("Randoop", 36).given(key, "capital_abcd").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f520" });
                new Here("Unit", 36).given(key, "man_getting_haircut_dark_skin_tone").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f487", "0x0001f3ff", "0x0000200d", "0x00002642", "0x0000fe0f" });
                new Here("Randoop", 36).given(key, "envelope").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x00002709", "0x0000fe0f" });
                new Here("Randoop", 36).given(key, "black_medium_small_square").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x000025fe" });
                new Here("Unit", 36).given(key, "man_singer_tone2").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f468", "0x0001f3fc", "0x0000200d", "0x0001f3a4" });
                new Here("Unit", 36).given(key, "zero").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x00000030", "0x0000fe0f", "0x000020e3" });
                new Here("Randoop", 36).given(key, "no_good_tone1").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f645", "0x0001f3fb" });
                new Here("Randoop", 36).given(key, "woman_frowning_tone3").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f64d", "0x0001f3fd", "0x0000200d", "0x00002640", "0x0000fe0f" });
                new Here("Unit", 36).given(key, "bellhop").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f6ce", "0x0000fe0f" });
                new Here("Unit", 36).given(key, "stuck_out_tongue_closed_eyes").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f61d" });
                new Here("Unit", 36).given(key, "man_in_tuxedo_tone4").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f935", "0x0001f3fe" });
                new Here("Unit", 36).given(key, "weight_lifter_tone1").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f3cb", "0x0001f3fb" });
                new Here("Randoop", 36).given(key, "man_with_probing_cane_medium_skin_tone").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f468", "0x0001f3fd", "0x0000200d", "0x0001f9af" });
                new Here("Unit", 36).given(key, "office_worker_tone1").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f9d1", "0x0001f3fb", "0x0000200d", "0x0001f4bc" });
                new Here("Randoop", 36).given(key, "man_singer_tone4").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f468", "0x0001f3fe", "0x0000200d", "0x0001f3a4" });
                new Here("Unit", 36).given(key, "man_detective_dark_skin_tone").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f575", "0x0001f3ff", "0x0000200d", "0x00002642", "0x0000fe0f" });
                new Here("Randoop", 36).given(key, "capricorn").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x00002651" });
                new Here("Unit", 36).given(key, "no_good_tone1").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f645", "0x0001f3fb" });
                new Here("Randoop", 36).given(key, "woman_gesturing_ok_medium_light_skin_tone").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f646", "0x0001f3fc", "0x0000200d", "0x00002640", "0x0000fe0f" });
                new Here("Randoop", 36).given(key, "vampire_dark_skin_tone").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f9db", "0x0001f3ff" });
                new Here("Randoop", 36).given(key, "man_walking_tone4").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f6b6", "0x0001f3fe", "0x0000200d", "0x00002642", "0x0000fe0f" });
                new Here("Randoop", 36).given(key, "no_good_tone4").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f645", "0x0001f3fe" });
                new Here("Unit", 36).given(key, "woman_and_man_holding_hands_dark_skin_tone_medium_dark_skin_tone").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f469", "0x0001f3ff", "0x0000200d", "0x0001f91d", "0x0000200d", "0x0001f468", "0x0001f3fe" });
                new Here("Randoop", 36).given(key, "eyeglasses").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f453" });
                new Here("Unit", 36).given(key, "woman_gesturing_ok_medium_light_skin_tone").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f646", "0x0001f3fc", "0x0000200d", "0x00002640", "0x0000fe0f" });
                new Here("Unit", 36).given(key, "man_singer_tone1").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f468", "0x0001f3fb", "0x0000200d", "0x0001f3a4" });
                new Here("Unit", 36).given(key, "man_factory_worker_medium_dark_skin_tone").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f468", "0x0001f3fe", "0x0000200d", "0x0001f3ed" });
                new Here("Unit", 36).given(key, "banjo").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001fa95" });
                new Here("Randoop", 36).given(key, "no_good_tone2").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f645", "0x0001f3fc" });
                new Here("Randoop", 36).given(key, "man_mountain_biking_light_skin_tone").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f6b5", "0x0001f3fb", "0x0000200d", "0x00002642", "0x0000fe0f" });
                new Here("Randoop", 36).given(key, "man_singer_tone3").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f468", "0x0001f3fd", "0x0000200d", "0x0001f3a4" });
                new Here("Unit", 36).given(key, "no_good_tone3").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f645", "0x0001f3fd" });
                new Here("Unit", 36).given(key, "ticket").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f3ab" });
                new Here("Unit", 36).given(key, "cat").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f431" });
                new Here("Unit", 36).given(key, "man_playing_water_polo_medium_light_skin_tone").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f93d", "0x0001f3fc", "0x0000200d", "0x00002642", "0x0000fe0f" });
                new Here("Unit", 36).given(key, "woman_curly_haired").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f469", "0x0000200d", "0x0001f9b1" });
                new Here("Randoop", 36).given(key, "woman_bowing_dark_skin_tone").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f647", "0x0001f3ff", "0x0000200d", "0x00002640", "0x0000fe0f" });
                new Here("Randoop", 36).given(key, "weight_lifter_tone3").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f3cb", "0x0001f3fd" });
                new Here("Unit", 36).given(key, "office_worker_tone2").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f9d1", "0x0001f3fc", "0x0000200d", "0x0001f4bc" });
                new Here("Randoop", 36).given(key, "deaf_person_medium_light_skin_tone").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f9cf", "0x0001f3fc" });
                new Here("Randoop", 36).given(key, "woman_detective_dark_skin_tone").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f575", "0x0001f3ff", "0x0000200d", "0x00002640", "0x0000fe0f" });
                new Here("Randoop", 36).given(key, "expressionless").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f611" });
                new Here("Randoop", 36).given(key, "factory_worker").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f9d1", "0x0000200d", "0x0001f3ed" });
                new Here("Randoop", 36).given(key, "older_man").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f474" });
                new Here("Unit", 36).given(key, "office_worker_tone4").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f9d1", "0x0001f3fe", "0x0000200d", "0x0001f4bc" });
                new Here("Unit", 36).given(key, "person_in_motorized_wheelchair").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f9d1", "0x0000200d", "0x0001f9bc" });
                new Here("Unit", 36).given(key, "judge").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f9d1", "0x0000200d", "0x00002696", "0x0000fe0f" });
                new Here("Randoop", 36).given(key, "woman_frowning_tone2").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f64d", "0x0001f3fc", "0x0000200d", "0x00002640", "0x0000fe0f" });
                new Here("Unit", 36).given(key, "last_quarter_moon_with_face").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f31c" });
                new Here("Unit", 36).given(key, "woman_construction_worker_light_skin_tone").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f477", "0x0001f3fb", "0x0000200d", "0x00002640", "0x0000fe0f" });
                new Here("Unit", 36).given(key, "office_worker_tone3").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f9d1", "0x0001f3fd", "0x0000200d", "0x0001f4bc" });
                new Here("Randoop", 36).given(key, "man_detective_dark_skin_tone").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f575", "0x0001f3ff", "0x0000200d", "0x00002642", "0x0000fe0f" });
                new Here("Randoop", 36).given(key, "gemini").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0000264a" });
                new Here("Randoop", 36).given(key, "woman_construction_worker_light_skin_tone").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f477", "0x0001f3fb", "0x0000200d", "0x00002640", "0x0000fe0f" });
                new Here("Unit", 36).given(key, "man_surfing_light_skin_tone").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f3c4", "0x0001f3fb", "0x0000200d", "0x00002642", "0x0000fe0f" });
                new Here("Randoop", 36).given(key, "thunder_cloud_rain").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x000026c8", "0x0000fe0f" });
                new Here("Unit", 36).given(key, "man_walking_tone3").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f6b6", "0x0001f3fd", "0x0000200d", "0x00002642", "0x0000fe0f" });
                new Here("Unit", 36).given(key, "expressionless").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f611" });
                new Here("Randoop", 36).given(key, "ticket").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f3ab" });
                new Here("Randoop", 36).given(key, "last_quarter_moon_with_face").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f31c" });
                new Here("Unit", 36).given(key, "man_with_probing_cane_medium_skin_tone").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f468", "0x0001f3fd", "0x0000200d", "0x0001f9af" });
                new Here("Unit", 36).given(key, "person_tone5_bald").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f9d1", "0x0001f3ff", "0x0000200d", "0x0001f9b2" });
                new Here("Randoop", 36).given(key, "weight_lifter_tone4").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f3cb", "0x0001f3fe" });
                new Here("Randoop", 36).given(key, "speak_no_evil").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f64a" });
                new Here("Randoop", 36).given(key, "person_tone5_bald").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f9d1", "0x0001f3ff", "0x0000200d", "0x0001f9b2" });
                new Here("Randoop", 36).given(key, "man_playing_water_polo_medium_light_skin_tone").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f93d", "0x0001f3fc", "0x0000200d", "0x00002642", "0x0000fe0f" });
                new Here("Unit", 36).given(key, "deaf_person_medium_light_skin_tone").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f9cf", "0x0001f3fc" });
                new Here("Unit", 36).given(key, "woman_curly_haired_medium_skin_tone").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f469", "0x0001f3fd", "0x0000200d", "0x0001f9b1" });
                new Here("Randoop", 36).given(key, "man_singer_tone5").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f468", "0x0001f3ff", "0x0000200d", "0x0001f3a4" });
                new Here("Randoop", 36).given(key, "eight_pointed_black_star").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x00002734", "0x0000fe0f" });
                new Here("Unit", 36).given(key, "woman_tipping_hand_medium_dark_skin_tone").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f481", "0x0001f3fe", "0x0000200d", "0x00002640", "0x0000fe0f" });
                new Here("Randoop", 36).given(key, "weight_lifter_tone2").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f3cb", "0x0001f3fc" });
                new Here("Unit", 36).given(key, "woman_frowning_tone1").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f64d", "0x0001f3fb", "0x0000200d", "0x00002640", "0x0000fe0f" });
                new Here("Unit", 36).given(key, "woman_getting_haircut_dark_skin_tone").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f487", "0x0001f3ff", "0x0000200d", "0x00002640", "0x0000fe0f" });
                new Here("Randoop", 36).given(key, "office_worker_tone2").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f9d1", "0x0001f3fc", "0x0000200d", "0x0001f4bc" });
                new Here("Unit", 36).given(key, "factory_worker").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f9d1", "0x0000200d", "0x0001f3ed" });
                new Here("Unit", 36).given(key, "no_good_tone2").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f645", "0x0001f3fc" });
                new Here("Unit", 36).given(key, "man_artist").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f468", "0x0000200d", "0x0001f3a8" });
                new Here("Randoop", 36).given(key, "no_good_tone3").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f645", "0x0001f3fd" });
                new Here("Unit", 36).given(key, "palms_up_together_light_skin_tone").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f932", "0x0001f3fb" });
                new Here("Randoop", 36).given(key, "wrestling").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f93c" });
                new Here("Randoop", 36).given(key, "mouse2").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f401" });
                new Here("Randoop", 36).given(key, "office_worker_tone3").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f9d1", "0x0001f3fd", "0x0000200d", "0x0001f4bc" });
                new Here("Randoop", 36).given(key, "person_in_motorized_wheelchair").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f9d1", "0x0000200d", "0x0001f9bc" });
                new Here("Randoop", 36).given(key, "woman_frowning_tone1").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f64d", "0x0001f3fb", "0x0000200d", "0x00002640", "0x0000fe0f" });
                new Here("Unit", 36).given(key, "man_walking_tone4").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f6b6", "0x0001f3fe", "0x0000200d", "0x00002642", "0x0000fe0f" });
                new Here("Unit", 36).given(key, "wrestling").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f93c" });
                new Here("Unit", 36).given(key, "man_in_tuxedo_tone1").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f935", "0x0001f3fb" });
                new Here("Unit", 36).given(key, "woman_standing_medium_dark_skin_tone").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f9cd", "0x0001f3fe", "0x0000200d", "0x00002640", "0x0000fe0f" });
                new Here("Unit", 36).given(key, "vampire_dark_skin_tone").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f9db", "0x0001f3ff" });
                new Here("Unit", 36).given(key, "capital_abcd").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f520" });
                new Here("Unit", 36).given(key, "envelope").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x00002709", "0x0000fe0f" });
                new Here("Unit", 36).given(key, "hourglass_flowing_sand").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x000023f3" });
                new Here("Randoop", 36).given(key, "palms_up_together_light_skin_tone").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f932", "0x0001f3fb" });
                new Here("Randoop", 36).given(key, "woman_construction_worker_dark_skin_tone").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f477", "0x0001f3ff", "0x0000200d", "0x00002640", "0x0000fe0f" });
                new Here("Randoop", 36).given(key, "man_bald_medium_skin_tone").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f468", "0x0001f3fd", "0x0000200d", "0x0001f9b2" });
                new Here("Unit", 36).given(key, "partly_sunny").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x000026c5" });
                new Here("Unit", 36).given(key, "office_worker_tone5").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f9d1", "0x0001f3ff", "0x0000200d", "0x0001f4bc" });
                new Here("Unit", 36).given(key, "woman_tipping_hand_light_skin_tone").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f481", "0x0001f3fb", "0x0000200d", "0x00002640", "0x0000fe0f" });
                new Here("Randoop", 36).given(key, "man_walking_tone3").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f6b6", "0x0001f3fd", "0x0000200d", "0x00002642", "0x0000fe0f" });
                new Here("Randoop", 36).given(key, "bellhop").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f6ce", "0x0000fe0f" });
                new Here("Randoop", 36).given(key, "office_worker_tone5").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f9d1", "0x0001f3ff", "0x0000200d", "0x0001f4bc" });
                new Here("Randoop", 36).given(key, "man_in_tuxedo_tone1").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f935", "0x0001f3fb" });
                new Here("Unit", 36).given(key, "woman_construction_worker_dark_skin_tone").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f477", "0x0001f3ff", "0x0000200d", "0x00002640", "0x0000fe0f" });
                new Here("Unit", 36).given(key, "woman_bowing_dark_skin_tone").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f647", "0x0001f3ff", "0x0000200d", "0x00002640", "0x0000fe0f" });
                new Here("Unit", 36).given(key, "pilot_medium_dark_skin_tone").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f9d1", "0x0001f3fe", "0x0000200d", "0x00002708", "0x0000fe0f" });
                new Here("Randoop", 36).given(key, "man_singer_tone1").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f468", "0x0001f3fb", "0x0000200d", "0x0001f3a4" });
                new Here("Unit", 36).given(key, "weight_lifter_tone5").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f3cb", "0x0001f3ff" });
                new Here("Randoop", 36).given(key, "man_in_tuxedo_tone2").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f935", "0x0001f3fc" });
                new Here("Randoop", 36).given(key, "weight_lifter_tone5").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f3cb", "0x0001f3ff" });
                new Here("Randoop", 36).given(key, "man_walking_tone1").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f6b6", "0x0001f3fb", "0x0000200d", "0x00002642", "0x0000fe0f" });
                new Here("Unit", 36).given(key, "face_palm").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f926" });
                new Here("Randoop", 36).given(key, "banjo").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001fa95" });
                new Here("Unit", 36).given(key, "man_in_tuxedo_tone2").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f935", "0x0001f3fc" });
                new Here("Randoop", 36).given(key, "man_scientist_medium_light_skin_tone").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f468", "0x0001f3fc", "0x0000200d", "0x0001f52c" });
                new Here("Unit", 36).given(key, "man_bald_medium_skin_tone").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f468", "0x0001f3fd", "0x0000200d", "0x0001f9b2" });
                new Here("Unit", 36).given(key, "weight_lifter_tone2").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f3cb", "0x0001f3fc" });
                new Here("Unit", 36).given(key, "man_in_tuxedo_tone5").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f935", "0x0001f3ff" });
                new Here("Randoop", 36).given(key, "office_worker_tone4").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f9d1", "0x0001f3fe", "0x0000200d", "0x0001f4bc" });
                new Here("Randoop", 36).given(key, "person_light_skin_tone_curly_hair").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f9d1", "0x0001f3fb", "0x0000200d", "0x0001f9b1" });
                new Here("Randoop", 36).given(key, "man_singer_tone2").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f468", "0x0001f3fc", "0x0000200d", "0x0001f3a4" });
                new Here("Randoop", 36).given(key, "zero").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x00000030", "0x0000fe0f", "0x000020e3" });
                new Here("Randoop", 36).given(key, "man_in_tuxedo_tone5").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f935", "0x0001f3ff" });
                new Here("Randoop", 36).given(key, "owl").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f989" });
                new Here("Randoop", 36).given(key, "stethoscope").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001fa7a" });
                new Here("Unit", 36).given(key, "woman_detective_dark_skin_tone").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f575", "0x0001f3ff", "0x0000200d", "0x00002640", "0x0000fe0f" });
                new Here("Unit", 36).given(key, "woman_in_manual_wheelchair_medium_dark_skin_tone").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f469", "0x0001f3fe", "0x0000200d", "0x0001f9bd" });
                new Here("Randoop", 36).given(key, "weight_lifter_tone1").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f3cb", "0x0001f3fb" });
                new Here("Randoop", 36).given(key, "face_palm").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f926" });
                new Here("Unit", 36).given(key, "man_singer_tone3").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f468", "0x0001f3fd", "0x0000200d", "0x0001f3a4" });
                new Here("Unit", 36).given(key, "woman_cook_dark_skin_tone").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f469", "0x0001f3ff", "0x0000200d", "0x0001f373" });
                new Here("Unit", 36).given(key, "man_singer_tone4").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f468", "0x0001f3fe", "0x0000200d", "0x0001f3a4" });
                new Here("Unit", 36).given(key, "woman_frowning_tone2").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f64d", "0x0001f3fc", "0x0000200d", "0x00002640", "0x0000fe0f" });
                new Here("Randoop", 36).given(key, "man_in_tuxedo_tone4").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f935", "0x0001f3fe" });
                new Here("Unit", 36).given(key, "no_good_tone5").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f645", "0x0001f3ff" });
                new Here("Unit", 36).given(key, "weight_lifter_tone3").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f3cb", "0x0001f3fd" });
                new Here("Unit", 36).given(key, "woman_frowning_tone3").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f64d", "0x0001f3fd", "0x0000200d", "0x00002640", "0x0000fe0f" });
                new Here("Randoop", 36).given(key, "woman_curly_haired").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f469", "0x0000200d", "0x0001f9b1" });
                new Here("Unit", 36).given(key, "eight_pointed_black_star").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x00002734", "0x0000fe0f" });
                new Here("Unit", 36).given(key, "kiss_mm").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f468", "0x0000200d", "0x00002764", "0x0000fe0f", "0x0000200d", "0x0001f48b", "0x0000200d", "0x0001f468" });
                new Here("Unit", 36).given(key, "hatching_chick").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f423" });
                new Here("Randoop", 36).given(key, "cat").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f431" });
                new Here("Unit", 36).given(key, "eyeglasses").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f453" });
                new Here("Unit", 36).given(key, "man_singer_tone5").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f468", "0x0001f3ff", "0x0000200d", "0x0001f3a4" });
                new Here("Unit", 36).given(key, "man_supervillain_dark_skin_tone").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f9b9", "0x0001f3ff", "0x0000200d", "0x00002642", "0x0000fe0f" });
                new Here("Unit", 36).given(key, "man_walking_tone5").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f6b6", "0x0001f3ff", "0x0000200d", "0x00002642", "0x0000fe0f" });
                new Here("Unit", 36).given(key, "man_red_haired_medium_dark_skin_tone").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f468", "0x0001f3fe", "0x0000200d", "0x0001f9b0" });
                new Here("Randoop", 36).given(key, "woman_tipping_hand_light_skin_tone").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f481", "0x0001f3fb", "0x0000200d", "0x00002640", "0x0000fe0f" });
                new Here("Randoop", 36).given(key, "stuck_out_tongue_closed_eyes").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f61d" });
                new Here("Unit", 36).given(key, "capricorn").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x00002651" });
                new Here("Unit", 36).given(key, "black_medium_small_square").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x000025fe" });
                new Here("Randoop", 36).given(key, "man_artist").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f468", "0x0000200d", "0x0001f3a8" });
                new Here("Randoop", 36).given(key, "man_getting_haircut_dark_skin_tone").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f487", "0x0001f3ff", "0x0000200d", "0x00002642", "0x0000fe0f" });
                new Here("Randoop", 36).given(key, "woman_curly_haired_medium_skin_tone").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f469", "0x0001f3fd", "0x0000200d", "0x0001f9b1" });
                new Here("Randoop", 36).given(key, "hatching_chick").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f423" });
                new Here("Randoop", 36).given(key, "woman_frowning_tone4").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f64d", "0x0001f3fe", "0x0000200d", "0x00002640", "0x0000fe0f" });
                new Here("Randoop", 36).given(key, "person_in_motorized_wheelchair_dark_skin_tone").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f9d1", "0x0001f3ff", "0x0000200d", "0x0001f9bc" });
                new Here("Randoop", 36).given(key, "man_in_tuxedo_tone3").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f935", "0x0001f3fd" });
                new Here("Unit", 36).given(key, "weight_lifter_tone4").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f3cb", "0x0001f3fe" });
                new Here("Unit", 36).given(key, "man_judge_light_skin_tone").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f468", "0x0001f3fb", "0x0000200d", "0x00002696", "0x0000fe0f" });
                new Here("Randoop", 36).given(key, "office_worker_tone1").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f9d1", "0x0001f3fb", "0x0000200d", "0x0001f4bc" });
                new Here("Randoop", 36).given(key, "man_walking_tone2").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f6b6", "0x0001f3fc", "0x0000200d", "0x00002642", "0x0000fe0f" });
                new Here("Randoop", 36).given(key, "guardsman").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f482" });
                new Here("Randoop", 36).given(key, "man_in_motorized_wheelchair_dark_skin_tone").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f468", "0x0001f3ff", "0x0000200d", "0x0001f9bc" });
                new Here("Unit", 36).given(key, "man_in_motorized_wheelchair_dark_skin_tone").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f468", "0x0001f3ff", "0x0000200d", "0x0001f9bc" });
                new Here("Randoop", 36).given(key, "woman_and_man_holding_hands_dark_skin_tone_medium_dark_skin_tone").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f469", "0x0001f3ff", "0x0000200d", "0x0001f91d", "0x0000200d", "0x0001f468", "0x0001f3fe" });
                new Here("Randoop", 36).given(key, "woman_tipping_hand_medium_dark_skin_tone").given(properties, "65.xml").checkEq(unicodeAStringArray, new String[] { "0x0001f481", "0x0001f3fe", "0x0000200d", "0x00002640", "0x0000fe0f" });
                int[] unicodeArray = new int[unicodeAStringArray.length];
                for (int i = 0; i < unicodeAStringArray.length; i++) {
                    unicodeArray[i] = Integer.decode(unicodeAStringArray[i]);
                }
                emojiShortcodeToUnicode.put(key, emojiToUnicodeString(unicodeArray));
            }
        } catch (IOException e) {
        }
    }
}
