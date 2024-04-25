package com.tngtech.propertyloader.impl.openers;

import com.tngtech.propertyloader.impl.interfaces.PropertyLoaderOpener;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import org.inlinetest.ITest;
import static org.inlinetest.ITest.itest;
import static org.inlinetest.ITest.group;

/**
 * Searches for properties files at a file system path.
 * The search path can be provided as a String or an URL.
 * Use the empty constructor to search the current directory.
 */
public class URLFileOpener implements PropertyLoaderOpener {

    private URL url;

    public URLFileOpener() {
        try {
            this.url = new File("").toURI().toURL();
        } catch (MalformedURLException e) {
            throw new RuntimeException(String.format("THIS CAN NOT HAPPEN: error while forming URL from path '%s'", ""), e);
        }
    }

    public URLFileOpener(URL url) {
        this.url = url;
    }

    public URLFileOpener(String address) {
        try {
            this.url = new File(address.replace("/", File.separator)).toURI().toURL();
            itest("randoop", 34).given(address, "p9MISGq/Jv2djgSJChZPrg==").given(File.separator, "/").checkEq(this.url, "169.xml");
            itest("randoop", 34).given(address, "pcBZ3H8TUtNQZHb3G+FUBkVHl2p4jve58tNYoFl5Nb9FKbDsU/eVh4G6L1/2y4XQz32nN3czQU1Nc6asV9c1YXB3ubkjVnyJf5SFWYmUWXBbNutOHqq6H4StcZpY2jl4ANR+qGXI0iLp9gfUetd+wO+MSR/sT73+sF+NfZKcrYtcmBsq1GiKKYfSCJHUVzWCn5RP1wwMJb4=").given(File.separator, "/").checkEq(this.url, "205.xml");
            itest("randoop", 34).given(address, "com.tngtech.propertyloader.impl.filters.DecryptingFilterException: ALiww57WRxBxTfwCYO/ZTEolf7lrG1iHvQXfofadG91ekHaQKC/LZxZA1fYH5iDdtxpy1zVpEeFVuZ8GZdpJYUo+0gRUDId1g8YAKmpfqdSa3058rlXBTTsT0mKnOsw4pAIyKKNaXqHC3OYOnG0kM2slRVBOrPbjLS3OtjgmIfag89s07Wfam4OASL2Yw8ZsR7+7G2tvAZDPeV+F/X3OjDkerCii98a4nCh5DG9bBgly+ygPvaT7pIIfS8fvD/eulJFeuqof618=").given(File.separator, "/").checkEq(this.url, "162.xml");
            itest("randoop", 34).given(address, "in path /home/itdocker/exli/_downloads/TNG_property-loader/randoop-tests/near%20class%20com.tngtech.propertyloader.impl.PropertyFileReaderException").given(File.separator, "/").checkEq(this.url, "172.xml");
            itest("randoop", 34).given(address, "MbnsJCQPzm5sE+Q8AGzBZw6TWR8gAMIDmjJ1ufekXudng6m/mNRXgoYoDilohxdUdAGlFyH3ZsmJDjoiPQj7du/i0eIgEmg2BfBdmVRdtwZebG5FOhZxz6H9hu0sZdAWvvbm7oHBXFwrpkrl7A449IgRs2uYeLIx").given(File.separator, "/").checkEq(this.url, "157.xml");
            itest("randoop", 34).given(address, "com.tngtech.propertyloader.exception.PropertyLoaderException: by classloader null").given(File.separator, "/").checkEq(this.url, "159.xml");
            itest("evosuite", 34).given(address, "/home/itdocker").given(File.separator, "/").checkEq(this.url, "3.xml");
            itest("randoop", 34).given(address, "in path /home/itdocker/exli/_downloads/TNG_property-loader/randoop-tests/DECRYPT:").given(File.separator, "/").checkEq(this.url, "147.xml");
            itest("randoop", 34).given(address, "lJFeuqof618=").given(File.separator, "/").checkEq(this.url, "125.xml");
            itest("evosuite", 34).given(address, "NV0k2Eb(").given(File.separator, "/").checkEq(this.url, "86.xml");
            itest("randoop", 34).given(address, "VU7gbT6m3w7LQhI8uDE+YuVG075fKdys8Gz/0yegLq2MslWvrLLiGv6zQPvxWCoR+FiPaQ5SYq8KJW5+VjNFSZnHKfGeopKTdqWxdrZHGwEcCpjAm/g48t8nZQ2f3bvO/LVRKW6BX6s=").given(File.separator, "/").checkEq(this.url, "201.xml");
            itest("randoop", 34).given(address, "com.tngtech.propertyloader.impl.filters.ThrowIfPropertyHasToBeDefinedException: s1ZZc+C9e/2324eMDmpyjtmSyP0R6XQOJvqAEsMbVHfc+0EVbBGGOpz5hYs+5NLaorAau2xcQ+g9qUO1TlGi3N/1QFSFjfe3ZE/q6wDzb4s+5xWouCkwMATU4mcfbMyheqsAwyQMtlwZy8mN/NXR+g6icOzKk7iQBpdSFi+7CAXJHJ+nmROv83QAQphpApv8").given(File.separator, "/").checkEq(this.url, "155.xml");
            itest("randoop", 34).given(address, "in path /home/itdocker/exli/_downloads/TNG_property-loader/randoop-tests/com.tngtech.propertyloader.exception.PropertyLoaderException:%20").given(File.separator, "/").checkEq(this.url, "206.xml");
            itest("randoop", 34).given(address, "<HAS_TO_BE_DEFINED>").given(File.separator, "/").checkEq(this.url, "116.xml");
            itest("randoop", 34).given(address, "com.tngtech.propertyloader.exception.PropertyLoaderException: in path /home/itdocker/exli/_downloads/TNG_property-loader/randoop-tests/").given(File.separator, "/").checkEq(this.url, "133.xml");
            itest("evosuite", 34).given(address, "hIq$p{8b7xQUp0;*").given(File.separator, "/").checkEq(this.url, "85.xml");
            itest("randoop", 34).given(address, "com.tngtech.propertyloader.impl.filters.VariableResolvingFilterException: pcBZ3H8TUtNQZHb3G+FUBkVHl2p4jve58tNYoFl5Nb9FKbDsU/eVhybC1T+bNPg6jDgnlLvT8Qx2Fv7LV49r+6dHmnWWlB3H").given(File.separator, "/").checkEq(this.url, "195.xml");
            itest("randoop", 34).given(address, "M1HMqGSipqM=").given(File.separator, "/").checkEq(this.url, "207.xml");
            itest("randoop", 34).given(address, "com.tngtech.propertyloader.impl.filters.ThrowIfPropertyHasToBeDefinedException: <HAS_TO_BE_DEFINED>").given(File.separator, "/").checkEq(this.url, "132.xml");
            itest("randoop", 34).given(address, "hi!").given(File.separator, "/").checkEq(this.url, "117.xml");
            itest("randoop", 34).given(address, "in path /home/itdocker/exli/_downloads/TNG_property-loader/randoop-tests/properties").given(File.separator, "/").checkEq(this.url, "152.xml");
            itest("randoop", 34).given(address, "near class com.tngtech.propertyloader.impl.openers.URLFileOpener").given(File.separator, "/").checkEq(this.url, "145.xml");
            itest("randoop", 34).given(address, "in path /home/itdocker/exli/_downloads/TNG_property-loader/randoop-tests/+XCmNUIAvMgJCMP4TO38tg==").given(File.separator, "/").checkEq(this.url, "154.xml");
            itest("randoop", 34).given(address, "CSIKIKsI9LfAXWsBnDJYZ1tV8EFhGMXKO+p9mIAfJKfwg2dGGrJyPSR2ekPXailuSUWyWLBF2oQm/MkZc24pJTFN/9SgrSLnSL2QCZXCP9V24dsQJFVubNY4N1nK+ZMA8CB9JqB09FTH5TDehlDp+/zWBqw5bk48hluZRcud0TKfQPD+zfP2hQ==").given(File.separator, "/").checkEq(this.url, "124.xml");
            itest("randoop", 34).given(address, "Ohvz26GuiA9APayetqSPf6FrY7j8qD3u").given(File.separator, "/").checkEq(this.url, "143.xml");
            itest("randoop", 34).given(address, "com.tngtech.propertyloader.impl.PropertyFileReaderException: s1ZZc+C9e/2324eMDmpyjtmSyP0R6XQOJvqAEsMbVHfc+0EVbBGGOpz5hYs+5NLaorAau2xcQ+g9qUO1TlGi3N/1QFSFjfe3ZE/q6wDzb4s+5xWouCkwMATU4mcfbMyheqsAwyQMtlwZy8mN/NXR+g6icOzKk7iQBpdSFi+7CAXJHJ+nmROv83QAQphpApv8").given(File.separator, "/").checkEq(this.url, "134.xml");
            itest("randoop", 34).given(address, "in classpath").given(File.separator, "/").checkEq(this.url, "156.xml");
            itest("randoop", 34).given(address, "qlJidmk7fF2S0u6BQ2EPZh8qC4MZkxU/+A8opDnyDRT6gZI+x9Z6MuzU2jaR/hgohdn1fs/EnKdw9vmRaszGWTckFXEvTo8M").given(File.separator, "/").checkEq(this.url, "153.xml");
            itest("randoop", 34).given(address, "com.tngtech.propertyloader.impl.PropertyFileReaderException: in path /home/itdocker/exli/_downloads/TNG_property-loader/randoop-tests/%3CHAS_TO_BE_DEFINED%3E").given(File.separator, "/").checkEq(this.url, "127.xml");
            itest("randoop", 34).given(address, "YwfN2w/WMGg3DN/umZyuvlFRQXoaABm1").given(File.separator, "/").checkEq(this.url, "160.xml");
            itest("evosuite", 34).given(address, "W%=9").given(File.separator, "/").checkEq(this.url, "25.xml");
            itest("randoop", 34).given(address, "com.tngtech.propertyloader.impl.filters.VariableResolvingFilterException: in path /home/itdocker/exli/_downloads/TNG_property-loader/randoop-tests/").given(File.separator, "/").checkEq(this.url, "163.xml");
            itest("randoop", 34).given(address, "8h/PohygV7fPHOcNJGRyw2g+IOWys95W70mR+EUWDUZYjsQY+xJH49N6RnxMR0jLo6QIQueP231uCO9S4EAaELu8f9yXWUbRIIfPdV5JopS5N5qN64uzoxQ2gGFlPzpjifiZGNlI7707OTgV3H3YWFCYQn6z1P62EowTmztOxXcFLjyJMHiSZTugBhiSyE/3Un04ow9KC7ePEKvNaNoPwQ==").given(File.separator, "/").checkEq(this.url, "196.xml");
            itest("randoop", 34).given(address, "com.tngtech.propertyloader.impl.PropertyFileReaderException: W1BKqQAMl9cRACt+iOKGPWGv6+osXebfAGPE8J0ssSZB8/t3aDeofxHR3hWlbGtnPSKpXAUTkv7RppNJtPWxEouYYSK44YIka+5eWmwvBYJWGceDGoUrYv7m+X2V6H78CmkprFj+LRA=").given(File.separator, "/").checkEq(this.url, "167.xml");
            itest("randoop", 34).given(address, "in path /home/itdocker/exli/_downloads/TNG_property-loader/randoop-tests/nqKhoRQTtCsRdjht6nRVRJLb2UWBmVSkIcRgEmeCqqJCPEm467SudMGvmO/XbCdYlcvkblNl5sXfhRA7q6BsNEGT2fNiiHoi24Ol1r7pEyYp2Qb4uBdHJbM6yY2Cw75yRLTnULNliY9ZXqFR2kJiHQO6KouJfU31w3sczeJT9AwfEMZzLF1A49tmBhRHFo/bramNXVpPE/TMfLUeyh/RRw==").given(File.separator, "/").checkEq(this.url, "140.xml");
            itest("evosuite", 34).given(address, "VTW]F[J").given(File.separator, "/").checkEq(this.url, "84.xml");
            itest("randoop", 34).given(address, "in path /home/itdocker/exli/_downloads/TNG_property-loader/randoop-tests/in%20classpath").given(File.separator, "/").checkEq(this.url, "212.xml");
            itest("randoop", 34).given(address, "W1BKqQAMl9cRACt+iOKGPWGv6+osXebfAGPE8J0ssSZB8/t3aDeofxHR3hWlbGtnPSKpXAUTkv7RppNJtPWxEouYYSK44YIka+5eWmwvBYJWGceDGoUrYv7m+X2V6H78CmkprFj+LRA=").given(File.separator, "/").checkEq(this.url, "158.xml");
            itest("randoop", 34).given(address, "in path /home/itdocker/exli/_downloads/TNG_property-loader/randoop-tests/in%20path%20/home/itdocker/exli/_downloads/TNG_property-loader/randoop-tests/nqKhoRQTtCsRdjht6nRVRJLb2UWBmVSkIcRgEmeCqqJCPEm467SudMGvmO/XbCdYlcvkblNl5sXfhRA7q6BsNEGT2fNiiHoi24Ol1r7pEyYp2Qb4uBdHJbM6yY2Cw75yRLTnULNliY9ZXqFR2kJiHQO6KouJfU31w3sczeJT9AwfEMZzLF1A49tmBhRHFo/bramNXVpPE/TMfLUeyh/RRw==").given(File.separator, "/").checkEq(this.url, "210.xml");
            itest("randoop", 34).given(address, "aHEdytWFQU8cH7UPJGPW2srOVNZURJsXC3iEJV8zWKbV6n16RCmnf4EaCZaDxUgjsMlkGNYCAzhynPjymIy32z9pJE344GtYv6iw1mR0AaunBw0mMAPXWwBtn6Pt7tm8NyQVcS9Ojww=").given(File.separator, "/").checkEq(this.url, "161.xml");
            itest("randoop", 34).given(address, "sDHI8YPRVNMMsFZc2gJDstYTj4yZZUDR57npYI0D+5LvLNQwaipMgO4sOp/Bv3u4DmftKG3AQOb4I76GqKcNpSpom7G8UOjTb1TGyeBlRBJk5B1CE4p7AHdiWdDd1baPy7NpGNj25iufPw4uGrVUzIjSnSxp76NfPbzC2YlGSF/j/x9lsMd/7U/wFT0y0CAtMm/BY88Tp6Vytbaldra7haF8hTPDeinW").given(File.separator, "/").checkEq(this.url, "213.xml");
            itest("randoop", 34).given(address, "near class com.tngtech.propertyloader.PropertyLoader").given(File.separator, "/").checkEq(this.url, "149.xml");
            itest("randoop", 34).given(address, "com.tngtech.propertyloader.exception.PropertyLoaderException: W1BKqQAMl9cRACt+iOKGPWGv6+osXebfAGPE8J0ssSZB8/t3aDeofxHR3hWlbGtnPSKpXAUTkv7RppNJtPWxEouYYSK44YIka+5eWmwvBYJWGceDGoUrYv7m+X2V6H78CmkprFj+LRA=").given(File.separator, "/").checkEq(this.url, "176.xml");
            itest("randoop", 34).given(address, "R/K+fX5B2x3Q+Y7G87pyKA==").given(File.separator, "/").checkEq(this.url, "150.xml");
            itest("randoop", 34).given(address, "com.tngtech.propertyloader.impl.filters.ThrowIfPropertyHasToBeDefinedException: CSIKIKsI9LfAXWsBnDJYZ1tV8EFhGMXKO+p9mIAfJKfwg2dGGrJyPSR2ekPXailuSUWyWLBF2oQm/MkZc24pJTFN/9SgrSLnSL2QCZXCP9V24dsQJFVubNY4N1nK+ZMA8CB9JqB09FTH5TDehlDp+/zWBqw5bk48hluZRcud0TKfQPD+zfP2hQ==").given(File.separator, "/").checkEq(this.url, "146.xml");
            itest("randoop", 34).given(address, "com.tngtech.propertyloader.impl.filters.VariableResolvingFilterException: ").given(File.separator, "/").checkEq(this.url, "121.xml");
            itest("randoop", 34).given(address, "AgAElggqoTb/zkPRx6BFs+VOIlTFqyek").given(File.separator, "/").checkEq(this.url, "170.xml");
            itest("randoop", 34).given(address, "s1ZZc+C9e/2324eMDmpyjtmSyP0R6XQOJvqAEsMbVHfc+0EVbBGGOpz5hYs+5NLaorAau2xcQ+g9qUO1TlGi3N/1QFSFjfe3ZE/q6wDzb4s+5xWouCkwMATU4mcfbMyheqsAwyQMtlwZy8mN/NXR+g6icOzKk7iQBpdSFi+7CAXJHJ+nmROv83QAQphpApv8").given(File.separator, "/").checkEq(this.url, "142.xml");
            itest("randoop", 34).given(address, "com.tngtech.propertyloader.impl.PropertyFileReaderException: hi!").given(File.separator, "/").checkEq(this.url, "123.xml");
            itest("randoop", 34).given(address, "com.tngtech.propertyloader.impl.filters.VariableResolvingFilterException: near class com.tngtech.propertyloader.impl.openers.URLFileOpener").given(File.separator, "/").checkEq(this.url, "192.xml");
            itest("randoop", 34).given(address, "com.tngtech.propertyloader.impl.filters.DecryptingFilterException: ").given(File.separator, "/").checkEq(this.url, "193.xml");
            itest("evosuite", 34).given(address, " -> ").given(File.separator, "/").checkEq(this.url, "83.xml");
            itest("randoop", 34).given(address, "in path /home/itdocker/exli/_downloads/TNG_property-loader/randoop-tests/").given(File.separator, "/").checkEq(this.url, "118.xml");
            itest("randoop", 34).given(address, "").given(File.separator, "/").checkEq(this.url, "1.xml");
            itest("randoop", 34).given(address, "properties").given(File.separator, "/").checkEq(this.url, "131.xml");
            itest("randoop", 34).given(address, "com.tngtech.propertyloader.exception.PropertyLoaderException: ").given(File.separator, "/").checkEq(this.url, "144.xml");
            itest("dev", 34).given(address, "/home/itdocker").given(File.separator, "/").checkEq(this.url, "3.xml");
            itest("randoop", 34).given(address, "com.tngtech.propertyloader.impl.PropertyFileReaderException: com.tngtech.propertyloader.exception.PropertyLoaderException: ").given(File.separator, "/").checkEq(this.url, "204.xml");
            itest("randoop", 34).given(address, "com.tngtech.propertyloader.impl.filters.VariableResolvingFilterException: 7aO7G9zWnxCJnWsSVfeZYzB+1LO/qfegH1123SqP/IYVEuBY1YHidJshk8XYQZdLpHmGEzUD98I=").given(File.separator, "/").checkEq(this.url, "164.xml");
            itest("randoop", 34).given(address, "com.tngtech.propertyloader.exception.PropertyLoaderException: DECRYPT:").given(File.separator, "/").checkEq(this.url, "216.xml");
            itest("dev", 34).given(address, "/home/itdocker/exli/_downloads/TNG_property-loader/target/test-classes/").given(File.separator, "/").checkEq(this.url, "0.xml");
            itest("randoop", 34).given(address, "ILwegXpMpCCHkJl16x0dao07UtOjci+rA5W9Ls+znERFTn3uygfglqskJL3IUe8HaOs9yBGs0y667gqiHYng1xwZAVKyLL7FS6jG4FcVuBxkK29V+1P8DTNOHn+tFivUoXyFM8N6KdY=").given(File.separator, "/").checkEq(this.url, "211.xml");
            itest("randoop", 34).given(address, "AOCwM6ik9rtSdCtfGIul8HIUU9foUcYVLxhdrTYcWvxEQX+snzPORFu3tPStW2bRDETMl9/4/QHKCooG1WqQotmr+Oj09t8po1+7fY8BUl+JgEn97UkJpOnf2lwAuEQBYwuqEnNQ8Ng=").given(File.separator, "/").checkEq(this.url, "197.xml");
            itest("randoop", 34).given(address, "NpRrFmWIORUDgg6NF1N326CuJ91bDCuEUimJLQWtyAVIEj13NcymL3HMC0iSogs+vnRxdw5nViaLim18S3jGHQQu5fZqfUmjLw1xalqA8aWuu9Uo4Gq50Q==").given(File.separator, "/").checkEq(this.url, "184.xml");
            itest("randoop", 34).given(address, "7aO7G9zWnxCJnWsSVfeZYzB+1LO/qfegH1123SqP/IYVEuBY1YHidJshk8XYQZdLpHmGEzUD98I=").given(File.separator, "/").checkEq(this.url, "139.xml");
            itest("evosuite", 34).given(address, "[3J'*ymFm^4sml").given(File.separator, "/").checkEq(this.url, "24.xml");
            itest("randoop", 34).given(address, "com.tngtech.propertyloader.impl.filters.ThrowIfPropertyHasToBeDefinedException: com.tngtech.propertyloader.impl.filters.VariableResolvingFilterException: in classpath").given(File.separator, "/").checkEq(this.url, "191.xml");
            itest("randoop", 34).given(address, "in path /home/itdocker/exli/_downloads/TNG_property-loader/randoop-tests/in%20path%20/home/itdocker/exli/_downloads/TNG_property-loader/randoop-tests").given(File.separator, "/").checkEq(this.url, "120.xml");
            itest("randoop", 34).given(address, "com.tngtech.propertyloader.exception.PropertyLoaderException: 3aGbnHi+hVLAG0MBIyySPTGYoN1sdKH7uYUR/Pjz+VY=").given(File.separator, "/").checkEq(this.url, "203.xml");
            itest("randoop", 34).given(address, "/DjNWXIjRrvyNkCPswrUJPnna3XaD1/QNXMB24iczeWSNYEZtkWT64vg61oey3VRLurqRHlZ6RAXnbQ4h9jZ+7sp+/rTrJ04TF+UkOnyQOEhLE0Ac6NdkMvYzsBTj6uQLnM0KJLd7ewH/8AuvIeQdnubHqNiWphD3DCC/HrOUBZabxM8vD0mITu/fxtWLxvge+FbpnOurLWd0mDKwACVjih7JkVthCkd+vxtHSFXMbY4HaY3tQwDfQNeK+CscVv51rCQN6t/i5q6n91KJNAZMMWCY/bTqxKPNyQVcS9Ojww=").given(File.separator, "/").checkEq(this.url, "141.xml");
            itest("randoop", 34).given(address, "com.tngtech.propertyloader.impl.filters.ThrowIfPropertyHasToBeDefinedException: com.tngtech.propertyloader.impl.filters.ThrowIfPropertyHasToBeDefinedException: DECRYPT:").given(File.separator, "/").checkEq(this.url, "217.xml");
            itest("randoop", 34).given(address, "ArCKRX2tPpwnTi13zrBVFCUA5QbA0I9zgHW2Qb3vZD0=").given(File.separator, "/").checkEq(this.url, "151.xml");
            itest("randoop", 34).given(address, "Pr7ka3xqMj2hVE5aeWco2GDMebKhU97agwDJb7OhJohaxzyiQfSuKfVRxQc7hJa6Jlko3GmZ9Sn7HiCdtm8ggRWmob/SiJYC1ZJY5Xzuxn1V5X2M+mUbaoCTbJHC0s0lT8O6hjz9Wmk=").given(File.separator, "/").checkEq(this.url, "214.xml");
            itest("randoop", 34).given(address, "S7N0ivwu4bVpuGYpmkpBEw9JJdmBsgDxaWQ8TukRFIOuKtWnVRVq5mwZSPKzYmagEA5Yr4X3S/tk5EUTJjt/KO3DPNzkZPJXlqUJgqXfeWZmBejbKJYwcNMO+1inbVJXZqQwF4ivtwV45rX7Ux6sYwCb7AcIKEV97qrmPPSHMZaQ3ILKW+AvXhVr3u4sbnvYeVKZw5DXU8/lWIz65YnYXPffDiXUSJ4HSod0og7JCy5iVTUbl7rHIbzUGhW+fd4gMEJuP73IOPI=").given(File.separator, "/").checkEq(this.url, "194.xml");
            itest("randoop", 34).given(address, "sHOqzFyq4YJ5bPXJf3v3vA==").given(File.separator, "/").checkEq(this.url, "168.xml");
            itest("randoop", 34).given(address, "nsYz2nAGSNGZbQxCzJYd9BCjfOEsP5e0e0rgLU4TE1h+ifwBYzeoXbpwzEveyd4FBNykukx3dHagV1PITE4eCKASz1yxwgiP51u7z7d/ZrwoPf1qsdAEV/r2FEjGM41AAypyF28YpPkFVoNqN0HrgHLcsmK8+93voyZ4bk8SDm6U/gX9YPYg5xhRDGClGkWyBPDOOwt/QEk=").given(File.separator, "/").checkEq(this.url, "185.xml");
            itest("evosuite", 34).given(address, "B").given(File.separator, "/").checkEq(this.url, "87.xml");
            itest("randoop", 34).given(address, "by classloader null").given(File.separator, "/").checkEq(this.url, "119.xml");
            itest("randoop", 34).given(address, "near class com.tngtech.propertyloader.impl.PropertyLoaderFactory").given(File.separator, "/").checkEq(this.url, "122.xml");
            itest("randoop", 34).given(address, "com.tngtech.propertyloader.impl.filters.ThrowIfPropertyHasToBeDefinedException: DECRYPT:").given(File.separator, "/").checkEq(this.url, "173.xml");
            itest("evosuite", 34).given(address, "error while forming new URL from URL %s and filename %s").given(File.separator, "/").checkEq(this.url, "22.xml");
            itest("randoop", 34).given(address, "lpUjEmC1zyu1E6+jj1bkIvZIDuWKoNl4").given(File.separator, "/").checkEq(this.url, "177.xml");
            itest("randoop", 34).given(address, "in path /home/itdocker/exli/_downloads/TNG_property-loader/randoop-tests/com.tngtech.propertyloader.impl.filters.ThrowIfPropertyHasToBeDefinedException:%20near%20class%20com.tngtech.propertyloader.impl.PropertyLoaderFactory").given(File.separator, "/").checkEq(this.url, "215.xml");
            itest("randoop", 34).given(address, "com.tngtech.propertyloader.impl.filters.DecryptingFilterException: +XCmNUIAvMgJCMP4TO38tg==").given(File.separator, "/").checkEq(this.url, "209.xml");
            itest("randoop", 34).given(address, "DqUWExByM3JbpoVVOPHaF4PIp2Xk5Xd8sO9bdee0FyFEj+7P16+C/Q==").given(File.separator, "/").checkEq(this.url, "202.xml");
            itest("randoop", 34).given(address, "n8TVA85usAPpWdGY1amIcni2qMtTmxH6MSpSdbkOeQ43JBVxL06PDA==").given(File.separator, "/").checkEq(this.url, "182.xml");
            itest("dev", 34).given(address, "").given(File.separator, "/").checkEq(this.url, "1.xml");
            itest("randoop", 34).given(address, "ALiww57WRxBxTfwCYO/ZTEolf7lrG1iHvQXfofadG91ekHaQKC/LZxZA1fYH5iDdtxpy1zVpEeFVuZ8GZdpJYUo+0gRUDId1g8YAKmpfqdSa3058rlXBTTsT0mKnOsw4pAIyKKNaXqHC3OYOnG0kM2slRVBOrPbjLS3OtjgmIfag89s07Wfam4OASL2Yw8ZsR7+7G2tvAZDPeV+F/X3OjDkerCii98a4nCh5DG9bBgly+ygPvaT7pIIfS8fvD/eulJFeuqof618=").given(File.separator, "/").checkEq(this.url, "126.xml");
            itest("evosuite", 34).given(address, "h?v(`Z1G~T1P!0F*7)").given(File.separator, "/").checkEq(this.url, "23.xml");
            itest("randoop", 34).given(address, "1Nt3eAMhq99JiqVjbWQ6abAcZQ9fTScd8SUrurys68rP84PkT4VzRQPdT5SSnBSE9RFNMGz4t3nj+BTDpVwgeYB1tkG972Q9").given(File.separator, "/").checkEq(this.url, "135.xml");
            itest("randoop", 34).given(address, "in path /home/itdocker/exli/_downloads/TNG_property-loader/randoop-tests/ArCKRX2tPpwnTi13zrBVFCUA5QbA0I9zgHW2Qb3vZD0=").given(File.separator, "/").checkEq(this.url, "174.xml");
            itest("randoop", 34).given(address, "nqKhoRQTtCsRdjht6nRVRJLb2UWBmVSkIcRgEmeCqqJCPEm467SudMGvmO/XbCdYlcvkblNl5sXfhRA7q6BsNEGT2fNiiHoi24Ol1r7pEyYp2Qb4uBdHJbM6yY2Cw75yRLTnULNliY9ZXqFR2kJiHQO6KouJfU31w3sczeJT9AwfEMZzLF1A49tmBhRHFo/bramNXVpPE/TMfLUeyh/RRw==").given(File.separator, "/").checkEq(this.url, "130.xml");
            itest("randoop", 34).given(address, "ORAL9y9KLNEhIHuspWnT0eI0zRVZzVHd+vIItIJ3UFkEr+iaeV11jBXHTWX0je3Bh/LFwphAA96WEmPAgbHln2ImwfeofBIZLdM5w85u3XMZA/e44Tg7M5lodC1S9MLC6hKujcxpYFjQfzXQup84D7wTuaRc+TD42MWSDxtRXKAluVGnrGb6PyYUyisk03G4GRY2mSJDWswLz2V58Rpw20GaxE36j7AE0lnPzyIjHh5xaS+cxCab9GE5J0laK8OW8+AqqlRiQgo=").given(File.separator, "/").checkEq(this.url, "198.xml");
            itest("randoop", 34).given(address, "com.tngtech.propertyloader.impl.filters.VariableResolvingFilterException: +XCmNUIAvMgJCMP4TO38tg==").given(File.separator, "/").checkEq(this.url, "136.xml");
            itest("randoop", 34).given(address, "in path /home/itdocker/exli/_downloads/TNG_property-loader/randoop-tests/hi!").given(File.separator, "/").checkEq(this.url, "199.xml");
            itest("randoop", 34).given(address, "com.tngtech.propertyloader.impl.filters.VariableResolvingFilterException: in classpath").given(File.separator, "/").checkEq(this.url, "128.xml");
            itest("randoop", 34).given(address, "nqKhoRQTtCsRdjht6nRVRJLb2UWBmVSkIcRgEmeCqqKQVmeCkFjJ+X9W0r96Hs4sWpMfAAj9SU8grjm66hGnjRchOKlWKU7CAyqoNxNTzECeoqGhFBO0KxF2OG3qdFVEktvZRYGZVKQhxGASZ4KqopBWZ4KQWMn5wFLDg3lcS6aZ27EjSsH0Fztbd00tqj2FxzjqFmdhnso+yG9CObioOm438q3pPbIz").given(File.separator, "/").checkEq(this.url, "179.xml");
            itest("randoop", 34).given(address, "DECRYPT:").given(File.separator, "/").checkEq(this.url, "138.xml");
            itest("randoop", 34).given(address, "xBQcn9mrIV/Rsar27FQfDOFlE3Pb04V2").given(File.separator, "/").checkEq(this.url, "129.xml");
            itest("randoop", 34).given(address, "AOCwM6ik9rtSdCtfGIul8HIUU9foUcYVO3h/hVfZ0qJGiTi1ttefQRe8aKm8oV9ZI/BBXgIaB1gWatTWmthqGYMALhQCaWJTrxdrVS47dCU3SKFSGDWyqQ==").given(File.separator, "/").checkEq(this.url, "187.xml");
            itest("randoop", 34).given(address, "/home/itdocker").given(File.separator, "/").checkEq(this.url, "3.xml");
            itest("randoop", 34).given(address, "in path /home/itdocker/exli/_downloads/TNG_property-loader/randoop-tests/s1ZZc+C9e/2324eMDmpyjtmSyP0R6XQOJvqAEsMbVHfc+0EVbBGGOpz5hYs+5NLaorAau2xcQ+g9qUO1TlGi3N/1QFSFjfe3ZE/q6wDzb4s+5xWouCkwMATU4mcfbMyheqsAwyQMtlwZy8mN/NXR+g6icOzKk7iQBpdSFi+7CAXJHJ+nmROv83QAQphpApv8").given(File.separator, "/").checkEq(this.url, "186.xml");
            itest("randoop", 34).given(address, "near class com.tngtech.propertyloader.impl.DefaultPropertySuffixContainer").given(File.separator, "/").checkEq(this.url, "137.xml");
            itest("randoop", 34).given(address, "com.tngtech.propertyloader.impl.PropertyFileReaderException: YwfN2w/WMGg3DN/umZyuvlFRQXoaABm1").given(File.separator, "/").checkEq(this.url, "190.xml");
            itest("randoop", 34).given(address, "com.tngtech.propertyloader.impl.filters.DecryptingFilterException: DECRYPT:").given(File.separator, "/").checkEq(this.url, "178.xml");
            itest("randoop", 34).given(address, "near class com.tngtech.propertyloader.impl.PropertyFileReaderException").given(File.separator, "/").checkEq(this.url, "175.xml");
            itest("randoop", 34).given(address, "in path /home/itdocker/exli/_downloads/TNG_property-loader/randoop-tests/%3CHAS_TO_BE_DEFINED%3E").given(File.separator, "/").checkEq(this.url, "181.xml");
            itest("randoop", 34).given(address, "+XCmNUIAvMgJCMP4TO38tg==").given(File.separator, "/").checkEq(this.url, "148.xml");
            itest("evosuite", 34).given(address, "").given(File.separator, "/").checkEq(this.url, "1.xml");
            itest("randoop", 34).given(address, "cCHvi71ee3YBwZnRi6/1aBiFdWW80fLjYXEUs9ju2riBFXc9Tmuzs6gmL4TGypG0xTBQrzthJHZxJ81vsTQbBY8+p4Afy2CgE3XOdBnmmyJXZrb5lCbL6g==").given(File.separator, "/").checkEq(this.url, "188.xml");
            itest("randoop", 34).given(address, "near null").given(File.separator, "/").checkEq(this.url, "183.xml");
            itest("evosuite", 34).given(address, "com.thoughtworks.xstream.persistence.AbstractFilePersistenceStrategy").given(File.separator, "/").checkEq(this.url, "82.xml");
            itest("randoop", 34).given(address, "CSIKIKsI9LfAXWsBnDJYZ1tV8EFhGMXKgpWsGEAxpbkg4FgKyQlmsYlzl0QALjCVliHNT7kKKSfj1/QtFBjldPx/xDxWgy7sSrroUQlEPmtWLPK606U+RdAOG2+Ynr0PN8h4VUQDgsWUVNZjQnnxgIm1PZHOTuULSlXq6QsdU+azkpKs/fUCVlIxhuGI05yLDZcBzjvdt8k=").given(File.separator, "/").checkEq(this.url, "189.xml");
            itest("randoop", 34).given(address, "com.tngtech.propertyloader.exception.PropertyLoaderException: Ah0o1m94cKX2SQOGVV+8A2IH+gAFqcFiDBQIHJ9hdxLmInqGYIO5pKzbvVedzuIMs+56cMsSYVewwk3q5PH1NT/SlERehH5KDrPRcXIiwn2/ji2Ak4leDp4YYow/8LW8OIkS2L2RQMbsM4ELYxSYXZSOUp31yrNCiZmcUzV37mxEYE18bAncL0O1/uHW+Mmp").given(File.separator, "/").checkEq(this.url, "171.xml");
            itest("randoop", 34).given(address, "com.tngtech.propertyloader.exception.PropertyLoaderException: com.tngtech.propertyloader.exception.PropertyLoaderException: Ah0o1m94cKX2SQOGVV+8A2IH+gAFqcFiDBQIHJ9hdxLmInqGYIO5pKzbvVedzuIMs+56cMsSYVewwk3q5PH1NT/SlERehH5KDrPRcXIiwn2/ji2Ak4leDp4YYow/8LW8OIkS2L2RQMbsM4ELYxSYXZSOUp31yrNCiZmcUzV37mxEYE18bAncL0O1/uHW+Mmp").given(File.separator, "/").checkEq(this.url, "208.xml");
            itest("randoop", 34).given(address, "com.tngtech.propertyloader.impl.PropertyFileReaderException: in path /home/itdocker/exli/_downloads/TNG_property-loader/randoop-tests/in%20path%20/home/itdocker/exli/_downloads/TNG_property-loader/randoop-tests").given(File.separator, "/").checkEq(this.url, "180.xml");
        } catch (MalformedURLException e) {
            throw new RuntimeException(String.format("THIS SHOULD NOT HAPPEN: error while forming URL from path '%s'", address), e);
        }
    }

    /**
     * Tries to open the given file.
     * A filename that starts with '/' is understood as an absolute path,
     * i.e. the URLFileOpener forgets about its path.
     *
     * @param fileName the filename
     * @return InputStream of the resource found at the given URL
     */
    public InputStream open(String fileName) {
        try {
            URL urlToFile = new URL(url, fileName);
            return urlToFile.openStream();
        } catch (MalformedURLException e) {
            throw new RuntimeException(String.format("error while forming new URL from URL %s and filename %s", url.getPath(), fileName), e);
        } catch (IOException e) {
            return null;
        }
    }

    @Override
    public String toString() {
        return "in path " + url.getPath();
    }
}
