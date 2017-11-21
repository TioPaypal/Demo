import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringHelperTest {
    private final String testString = "test string 123bill Pay ";

    @Test
        // normal case
    void rightOf1() {
        assertEquals("bill", StringHelper.rightOf(testString, "123", 4, false));
    }

    @Test
        // toSearchFor not found
    void rightOf2() {
        assertEquals("", StringHelper.rightOf(testString, "TTT", 5, false));
    }

    @Test
        // nChars = 0
    void rightOf3() {
        assertEquals("bill Pay ", StringHelper.rightOf(testString, "123", 0, false));
    }

    @Test
        // nChars != 0
    void rightOf4() {
        assertEquals("bi", StringHelper.rightOf(testString, "123", 2));
    }

    @Test
        // trimResult = true
    void rightOf5() {
        assertEquals("123bill Pay", StringHelper.rightOf(testString, "string", 0, true));
    }

    @Test
        // toSearchIn = null
    void rightOf6() {
        assertEquals("", StringHelper.rightOf(null, "123", 0));
    }

    @Test
        // toSearchFor = null
    void rightOf7() {
        assertEquals("", StringHelper.rightOf(testString, null, 0));
    }

    @Test
        // normal case
    void leftOf1() {
        assertEquals(" 123", StringHelper.leftOf(testString, "bill", 4, false));
    }

    @Test
        // toSearchFor not found
    void leftOf2() {
        assertEquals("", StringHelper.leftOf(testString, "TTT", 5, false));
    }

    @Test
        // nChars = 0
    void leftOf3() {
        assertEquals("test string ", StringHelper.leftOf(testString, "123", 0, false));
    }

    @Test
        // nChars != 0
    void leftOf4() {
        assertEquals("g ", StringHelper.leftOf(testString, "123", 2, false));
    }

    @Test
        // trimResult = true
    void leftOf5() {
        assertEquals("test", StringHelper.leftOf(testString, "string", 0, true));
    }

    @Test
        // toSearchIn = null
    void leftOf6() {
        assertEquals("", StringHelper.leftOf(null, "123", 0));
    }

    @Test
        // toSearchFor = null
    void leftOf7() {
        assertEquals("", StringHelper.leftOf(testString, null, 0));
    }

    @Test
        // Valid case
    void between() {
        assertEquals("b", StringHelper.between("abc", "a", "c"));
    }

    @Test
        // left limit not found
    void between2() {
        assertEquals("", StringHelper.between("abc", "z", "c"));
    }

    @Test
        // left limit not found
    void between3() {
        assertEquals("", StringHelper.between("abc", "a", "d"));
    }

    @Test
        // leftLimit == rightLimit
    void between4() {
        assertEquals("test", StringHelper.between(",1,1test,1", ",1,1", ",1"));
    }

    @Test
        // trimResult == true
    void between5() {
        assertEquals("is a", StringHelper.between("this is a test", "this", "test", true));
    }
    @Test
        // toSearchIn == null
    void between6() { //toSearchIn = null
        assertEquals("", StringHelper.between(null, "this", "test", true));
    }

    @Test
        // Valid number
    void getFlatPhoneNumber() {
        assertEquals("1231231234", StringHelper.getFlatPhoneNumber("(123)-123-1234"));
    }

    @Test
        // invalid number (too long)
    void getFlatPhoneNumber2() {
        assertEquals("", StringHelper.getFlatPhoneNumber("(123)-123-123456"));
    }

    @Test
        // invalid number (too short)
    void getFlatPhoneNumber3() {
        assertEquals("", StringHelper.getFlatPhoneNumber("(123)-123-12"));
    }

    @Test
    void getFormatedPhoneNumber() {
        assertEquals("(123)-123-1234", StringHelper.getFormatedPhoneNumber("11231231234"));
    }

}