import java.math.BigDecimal;

/**
 *  @author Julien Nadon
 *
 *   StringHelper Class
 */

public class StringHelper {

    /**
     *  Provides nChars located directly to the right of the first occurrence of toSearchFor.
     * @param toSearchIn String to look in
     * @param toSearchFor String to look for
     * @param nChars Maximum number of chars to return. If 0, return everything to the right of toSearchFor.
     * @param trimResult whether or not to trim the results.
     * @return Returns string of maximum nChars found in toSearchIn, right of the first occurrence of toSearchFor
     *  returns an empty string if toSearchFor is not found within toSearchIn
     */
    public static String rightOf(String toSearchIn, String toSearchFor, int nChars, boolean trimResult) {
        if (toSearchFor == null || toSearchIn == null) return "";
        int firstO = toSearchIn.indexOf(toSearchFor);

        if (firstO < 0) return "";

        if (nChars == 0) {
            nChars = toSearchIn.length() - firstO - toSearchFor.length();
        }

        String res = toSearchIn.substring(firstO + toSearchFor.length() ,firstO + toSearchFor.length()+ nChars);
        if (trimResult) {
            res = res.trim();
        }

        return res;
    }


    /**
     * Overloaded method with default param(s):
     *     nChars=0
     *     trimResult=true
     */
    public static String rightOf(String toSearchIn, String toSearchFor) {
        return rightOf(toSearchIn, toSearchFor, 0, true);
    }

    /**
     * Overloaded method with default param(s):
     *     trimResult=true
     */
    public static String rightOf(String toSearchIn, String toSearchFor, int nChars){
        return rightOf(toSearchIn, toSearchFor, nChars, true);
    }

    /**
     * Overloaded method with default param(s):
     *     default nChars=0
     */
    public static String rightOf(String toSearchIn, String toSearchFor, boolean trimResult){
        return rightOf(toSearchIn, toSearchFor, 0, trimResult    );
    }

    /**
     *  Provides nChars located directly to the left of the first occurrence of toSearchFor.
     * @param toSearchIn String to look in
     * @param toSearchFor String to look for
     * @param nChars Maximum number of chars to return. If 0, return everything to the left of toSearchFor.
     * @param trimResult whether or not to trim the results.
     * @return Returns string of maximum nChars found in toSearchIn, left of the first occurrence of toSearchFor
     *  returns an empty string if toSearchFor is not found within toSearchIn
     */
    public static String leftOf(String toSearchIn, String toSearchFor, int nChars, boolean trimResult) {
        return null;
    }

    /**
     * Overloaded method with default param(s):
     *     nChars=0
     *     trimResult=true
     */
    public static String leftOf(String toSearchIn, String toSearchFor) {
        return rightOf(toSearchIn, toSearchFor, 0, true);
    }

    /**
     * Overloaded method with default param(s):
     *     trimResult=true
     */
    public static String leftOf(String toSearchIn, String toSearchFor, int nChars){
        return rightOf(toSearchIn, toSearchFor, nChars, true);
    }

    /**
     * Overloaded method with default param(s):
     *     nChars=0
     */
    public static String leftOf(String toSearchIn, String toSearchFor, boolean trimResult){
        return rightOf(toSearchIn, toSearchFor, 0, trimResult);
    }

    /**
     *
     * @param toSaerchIn String to search within
     * @param leftLimit left delimiting value
     * @param rightLimit right delimiting value
     * @param trimResult whether or not to trim the results.
     * @return provides a string of maximum nChars found in toSearchIn,  delimited at left by "leftLimit" and at the right side by "rightLimit"
     */
    public static String between(String toSaerchIn, String leftLimit, String rightLimit, boolean trimResult) {
        return null;
    }

    /**
     * Overloaded method with default param(s):
     *     trimResult=0
     */
    public static String between(String toSaerchIn, String leftLimit, String rightLimit) {
        return between(toSaerchIn, leftLimit, rightLimit, true);
    }

    /**
     *
     * @param phoneNumber
     * @return
     */
    public static String getFlatPhoneNumber(String phoneNumber){
        return null;
    }

    /**
     *
     * @param phoneNumber
     * @return
     */
    public static String getFormatedPhoneNumber(String phoneNumber){
        return null;
    }


    /*
    @TODO Find a Java alternative for Xelement
    public static String getIntValueFromXmlElement(List<Xelement> elementList, String elementName) {
        return null;
    }

    public static BigDecimal GetDecimalValueFromXmlElement(List<Xelement> elementList, String elementName){
        return null;
    }
    */

}
