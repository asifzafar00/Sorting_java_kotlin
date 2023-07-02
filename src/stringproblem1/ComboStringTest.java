package stringproblem1;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComboStringTest {

    ComboString string1;

    @Before
    public void setUp() {
        string1 = new ComboString();
    }

    @Test
    public void comboStringTest() {
        assertEquals("hiHellohi", string1.comboString("Hello", "hi"));
        assertEquals("hiHellohi", string1.comboString("hi", "Hello"));
        assertEquals("baaab", string1.comboString("aaa", "b"));
        assertEquals("a", string1.comboString("a", ""));
        assertEquals("", string1.comboString("", ""));
    }
}