package challenges.utilities;

import org.junit.Test;
import static org.junit.Assert.*;

public class MultiBracketValidationTest {
    @Test public void testMultiBracketValidation(){
        MultiBracketValidation test = new MultiBracketValidation();
        String input = "{}[]()";
        assertTrue(test.multiBracketValidation(input));//expected to be true
        input = "{}";
        assertTrue(test.multiBracketValidation(input));
        input = "[]";
        assertTrue(test.multiBracketValidation(input));
        input = "()";
        assertTrue(test.multiBracketValidation(input));
        input = "{[]}";
        assertTrue(test.multiBracketValidation(input));
        input = "({})";
        assertTrue(test.multiBracketValidation(input));
        input = "{({[Hi]})}";
        assertTrue(test.multiBracketValidation(input));//still true when extra characters are inside
        input = "hellothere{}";
        assertTrue(test.multiBracketValidation(input));//true if extra characters are first
        input = "testing";
        assertTrue(test.multiBracketValidation((input)));//true if no brackets at all
        input = "";
        assertTrue(test.multiBracketValidation((input)));//true if empty string
        input = "{";
        assertFalse(test.multiBracketValidation((input)));
        input = "[";
        assertFalse(test.multiBracketValidation((input)));
        input = "(";
        assertFalse(test.multiBracketValidation((input)));
        input = "}()";
        assertFalse(test.multiBracketValidation((input)));
        input = "]hi()";
        assertFalse(test.multiBracketValidation((input)));
        String finalInput = null;//throws nullpointerexception if input is null
        assertThrows(NullPointerException.class, () -> test.multiBracketValidation(finalInput));




    }
}
