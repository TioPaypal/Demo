import java.math.BigDecimal;

/**
 *  @author Julien Nadon
 *
 *   StringHelper Class
 */
public class StringHelper {


    public static String rightOf(String toSearchIn, String toSearchFor, int nChars, boolean trimResult) {

        return null;
    }

    public static String rightOf(String toSearchIn, String toSearchFor) {
        return rightOf(toSearchIn, toSearchFor, 0, false);
    }

    public static String rightOf(String toSearchIn, String toSearchFor, int nChars){
        return rightOf(toSearchIn, toSearchFor, nChars, false);
    }

    public static String rightOf(String toSearchIn, String toSearchFor, boolean trimResult){
        return rightOf(toSearchIn, toSearchFor, 0, false    );
    }

    public static String leftOf(String toSearchIn, String toSearchFor, int nChars, boolean trimResult) {

        return null;
    }

    public static String leftOf(String toSearchIn, String toSearchFor) {
        return rightOf(toSearchIn, toSearchFor, 0, false);
    }

    public static String leftOf(String toSearchIn, String toSearchFor, int nChars){
        return rightOf(toSearchIn, toSearchFor, nChars, false);
    }

    public static String leftOf(String toSearchIn, String toSearchFor, boolean trimResult){
        return rightOf(toSearchIn, toSearchFor, 0, false);
    }


    public static String between(String toSaerchIn, String leftLimit, String rightLimit, boolean trimResults) {
        return null;
    }

    public static String between(String toSaerchIn, String leftLimit, String rightLimit) {
        return between(toSaerchIn, leftLimit, rightLimit, true);
    }

    public static String getFlatPhoneNumber(String phoneNumber){
        return null;
    }

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
