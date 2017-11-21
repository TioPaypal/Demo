/**
 * @author Julien Nadon
 *
 * StringHelper Class
 */

public class StringHelper {

    /**
     * Provides nChars located directly to the right of the first occurrence of toSearchFor.
     *
     * @param toSearchIn  String to look in
     * @param toSearchFor String to look for
     * @param nChars      Maximum number of chars to return. If 0, return everything to the right of toSearchFor.
     * @param trimResult  whether or not to trim the results.
     * @return Returns string of maximum nChars found in toSearchIn, right of the first occurrence of toSearchFor
     * returns an empty string if toSearchFor is not found within toSearchIn
     */
    public static String rightOf(String toSearchIn, String toSearchFor, int nChars, boolean trimResult) {
        if (toSearchFor == null || toSearchIn == null) return "";
        int firstO = toSearchIn.indexOf(toSearchFor);

        if (firstO < 0) return "";

        if (nChars == 0) {
            nChars = toSearchIn.length() - firstO - toSearchFor.length();
        }

        String res = toSearchIn.substring(firstO + toSearchFor.length(), firstO + toSearchFor.length() + nChars);
        if (trimResult) {
            res = res.trim();
        }

        return res;
    }


    /**
     * Overloaded method with default param(s):
     * nChars=0
     * trimResult=true
     */
    public static String rightOf(String toSearchIn, String toSearchFor) {
        return rightOf(toSearchIn, toSearchFor, 0, true);
    }

    /**
     * Overloaded method with default param(s):
     * trimResult=true
     */
    public static String rightOf(String toSearchIn, String toSearchFor, int nChars) {
        return rightOf(toSearchIn, toSearchFor, nChars, true);
    }

    /**
     * Overloaded method with default param(s):
     * default nChars=0
     */
    public static String rightOf(String toSearchIn, String toSearchFor, boolean trimResult) {
        return rightOf(toSearchIn, toSearchFor, 0, trimResult);
    }

    /**
     * Provides nChars located directly to the left of the first occurrence of toSearchFor.
     *
     * @param toSearchIn  String to look in
     * @param toSearchFor String to look for
     * @param nChars      Maximum number of chars to return. If 0, return everything to the left of toSearchFor.
     * @param trimResult  whether or not to trim the results.
     * @return Returns string of maximum nChars found in toSearchIn, left of the first occurrence of toSearchFor
     * returns an empty string if toSearchFor is not found within toSearchIn
     */
    public static String leftOf(String toSearchIn, String toSearchFor, int nChars, boolean trimResult) {
        if (toSearchFor == null || toSearchIn == null) return "";

        int firstO = toSearchIn.indexOf(toSearchFor);
        if (firstO < 0) return "";

        if (nChars == 0) {
            nChars = firstO;
        }

        String res = toSearchIn.substring(firstO - nChars, firstO);
        if (trimResult) {
            res = res.trim();
        }

        return res;
    }

    /**
     * Overloaded method with default param(s):
     * nChars=0
     * trimResult=true
     */
    public static String leftOf(String toSearchIn, String toSearchFor) {
        return leftOf(toSearchIn, toSearchFor, 0, true);
    }

    /**
     * Overloaded method with default param(s):
     * trimResult=true
     */
    public static String leftOf(String toSearchIn, String toSearchFor, int nChars) {
        return leftOf(toSearchIn, toSearchFor, nChars, true);
    }

    /**
     * Overloaded method with default param(s):
     * nChars=0
     */
    public static String leftOf(String toSearchIn, String toSearchFor, boolean trimResult) {
        return leftOf(toSearchIn, toSearchFor, 0, trimResult);
    }

    /**
     * @param toSearchIn String to search within
     * @param leftLimit  left delimiting value
     * @param rightLimit right delimiting value
     * @param trimResult whether or not to trim the results.
     * @return provides a string  delimited at left by "leftLimit" and at the right side by "rightLimit" found in toSearchIn
     */
    public static String between(String toSearchIn, String leftLimit, String rightLimit, boolean trimResult) {
        if (toSearchIn == null || leftLimit == null || rightLimit ==null ){
            return "";
        }
        int right = -1;
        int left = toSearchIn.indexOf(leftLimit);
        if (rightLimit.equals(leftLimit)|| leftLimit.indexOf(rightLimit) >= 0){
            right = toSearchIn.indexOf(rightLimit, left+leftLimit.length());
        } else{
            right = toSearchIn.indexOf(rightLimit);
        }
        if (left < 0 || right < 0){
            return "";
        }
        String ret = toSearchIn.substring(left+leftLimit.length(),right);
        if (trimResult){
            return ret.trim();
        } else {
            return ret;
        }
    }

    /**
     * Overloaded method with default param(s):
     * trimResult=0
     */
    public static String between(String toSearchIn, String leftLimit, String rightLimit) {
        return between(toSearchIn, leftLimit, rightLimit, true);
    }

    /**
     * From a formated phone number, reutrn the flat phone number (10digits)
     *
     * @param phoneNumber the formated phone number (XXX)-XXX-XXXX
     * @return a flat phone number XXXXXXXXXXX
     */
    public static String getFlatPhoneNumber(String phoneNumber) {
        String flat = phoneNumber.replaceAll("[^0-9.]", "");
        if (flat.length() != 10) {
            return "";
        }
        return flat;
    }

    /**
     * From a flat phone number, return as a string the formatted phone number
     *
     * @param phoneNumber a flat phone number XXXXXXXXXXX (10 dig)
     * @return a phone number with the format (XXX)-XXX-XXXX
     */
    public static String getFormatedPhoneNumber(String phoneNumber) {
        String seperator = "-";
        String formatedNumber = new StringBuilder()
                .append("(")
                .append(phoneNumber.substring(1, 4))
                .append(")")
                .append(seperator)
                .append(phoneNumber.substring(4, 7))
                .append(seperator)
                .append(phoneNumber.substring(7, 11))
                .toString();
        return formatedNumber;
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
