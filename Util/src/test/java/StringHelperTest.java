import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringHelperTest {
    private final String testString = "test string 123bill Pay ";

    @Test // normal case
    void rightOf1() {
        assertEquals("bill", StringHelper.rightOf(testString,"123",4, false));
    }
    @Test // toSearchFor not found
    void rightOf2() {
        assertEquals("", StringHelper.rightOf(  testString,"TTT",5,false));
    }
    @Test // nChars = 0
    void rightOf3() {
        assertEquals("bill Pay ", StringHelper.rightOf(testString,"123", 0,false));
    }
    @Test // nChars != 0
    void rightOf4() {
        assertEquals("bi", StringHelper.rightOf(testString,"123",2));
    }
    @Test // trimResult = true
    void rightOf5() {
        assertEquals("123bill Pay", StringHelper.rightOf(testString,"string",0, true));
    }
    @Test // toSearchIn = null
    void rightOf6() {
        assertEquals("", StringHelper.rightOf(null,"123",0));
    }
    @Test // toSearchFor = null
    void rightOf7() {
        assertEquals("", StringHelper.rightOf(testString,null,0));
    }

    @Test // normal case
    void leftOf1() {
        assertEquals("123", StringHelper.leftOf(testString,"bill",4, false));
    }
    @Test // toSearchFor not found
    void leftOf2() {
        assertEquals("", StringHelper.leftOf(testString,"TTT",5,false));
    }
    @Test // nChars = 0
    void leftOf3() {
        assertEquals("test string ", StringHelper.leftOf(testString,"123", 0,false));
    }
    @Test // nChars != 0
    void leftOf4() {
        assertEquals("g ", StringHelper.leftOf(testString,"123",2, false));
    }
    @Test // trimResult = true
    void leftOf5() {
        assertEquals("test ", StringHelper.leftOf(testString,"string",0, true));
    }
    @Test // toSearchIn = null
    void leftOf6() {
        assertEquals("", StringHelper.leftOf(null,"123",0));
    }
    @Test // toSearchFor = null
    void leftOf7() {
        assertEquals("", StringHelper.leftOf(testString,null,0));
    }

    @Test
    void getFlatPhoneNumber() {
        assertEquals("11231231234", StringHelper.getFlatPhoneNumber("1-123-123-1234"));
    }

    @Test
    void getFormatedPhoneNumber() {
        assertEquals("1-123-123-1234", StringHelper.getFlatPhoneNumber("11231231234"));
    }

}