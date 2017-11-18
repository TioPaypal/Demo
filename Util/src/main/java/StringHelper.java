import java.math.BigDecimal;

/**
 *  @author Julien Nadon
 *
 *   StringHelper Class
 */

public class StringHelper {

    /**
     *
     * @param toSearchIn
     * @param toSearchFor
     * @param nChars
     * @param trimResult
     * @return
     */
    public static String rightOf(String toSearchIn, String toSearchFor, int nChars, boolean trimResult) {

        return null;
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
     *
     * @param toSearchIn
     * @param toSearchFor
     * @param nChars
     * @param trimResult
     * @return
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
     * @param toSaerchIn
     * @param leftLimit
     * @param rightLimit
     * @param trimResult
     * @return
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
