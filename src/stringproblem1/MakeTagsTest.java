package stringproblem1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MakeTagsTest {

    MakeTags obj;

    @Before
    public void setUp() {
        obj = new MakeTags();
    }

    @Test
    public void makeTagsTest() {
        assertEquals("<i>Yay</i>", obj.makeTags("i", "Yay"));
        assertEquals("<i>Hello</i>", obj.makeTags("i", "Hello"));
        assertEquals("<cite>Yay</cite>", obj.makeTags("cite", "Yay"));
    }
    /*@Test
    public void `test how work Kotlin in Junit 5`() {
        assertEquals("<i>Yay</i>", obj.makeTags("i", "Yay"));
        assertEquals("<i>Hello</i>", obj.makeTags("i", "Hello"));
        assertEquals("<cite>Yay</cite>", obj.makeTags("cite", "Yay"));
    }*/

}