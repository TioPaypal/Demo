import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringHelperTest {
    private final String testString = "test string 123bill Pay ";

    @Test // normal case
    void rightOf1() {
        assertEquals("bill",StringHelper.rightOf(testString,"123",4, false));
    }
    @Test // toSearchFor not found
    void rightOf2() {
        assertEquals("",StringHelper.rightOf(  testString,"TTT",5,false));
    }
    @Test // nChars = 0
    void rightOf3() {
        assertEquals("bill Pay ",StringHelper.rightOf(testString,"123", 0,false));
    }
    @Test // nChars != 0
    void rightOf4() {
        assertEquals("bi",StringHelper.rightOf(testString,"123",2));
    }
    @Test // trimResult = true
    void rightOf5() {
        assertEquals("123bill Pay",StringHelper.rightOf(testString,"string",0, true));
    }
    @Test // toSearchIn = null
    void rightOf6() {
        assertEquals("",StringHelper.rightOf(null,"123",0));
    }
    @Test // toSearchFor = null
    void rightOf7() {
        assertEquals("",StringHelper.rightOf(testString,null,0));
    }

    @Test
    void leftOf() {
        fail("TODO");
    }

    @Test
    void leftOf1() {
        fail("TODO");
    }

    @Test
    void leftOf2() {
        fail("TODO");
    }

    @Test
    void leftOf3() {
        fail("TODO");
    }

    @Test
    void between() {
        fail("TODO");
    }

    @Test
    void between1() {
        fail("TODO");
    }

    @Test
    void getFlatPhoneNumber() {
        fail("TODO");
    }

    @Test
    void getFormatedPhoneNumber() {
        fail("TODO");
    }



}