package construct;

public class GUID {

    /**
     * Gets GUID as string.
     *
     * @param GUID GUID.
     * @return GUID as string.
     */
    public static String getGuidAsString(byte[] GUID) {
        final StringBuilder res = new StringBuilder();
        res.append(AddLeadingZero((int) GUID[3] & 0xFF));
        res.append(AddLeadingZero((int) GUID[2] & 0xFF));
        res.append(AddLeadingZero((int) GUID[1] & 0xFF));
        res.append(AddLeadingZero((int) GUID[0] & 0xFF));
        res.append("-");
        res.append(AddLeadingZero((int) GUID[5] & 0xFF));
        res.append(AddLeadingZero((int) GUID[4] & 0xFF));
        res.append("-");
        res.append(AddLeadingZero((int) GUID[7] & 0xFF));
        res.append(AddLeadingZero((int) GUID[6] & 0xFF));
        res.append("-");
        res.append(AddLeadingZero((int) GUID[8] & 0xFF));
        res.append(AddLeadingZero((int) GUID[9] & 0xFF));
        res.append("-");
        res.append(AddLeadingZero((int) GUID[10] & 0xFF));
        res.append(AddLeadingZero((int) GUID[11] & 0xFF));
        res.append(AddLeadingZero((int) GUID[12] & 0xFF));
        res.append(AddLeadingZero((int) GUID[13] & 0xFF));
        res.append(AddLeadingZero((int) GUID[14] & 0xFF));
        res.append(AddLeadingZero((int) GUID[15] & 0xFF));
        return res.toString();
    }
}