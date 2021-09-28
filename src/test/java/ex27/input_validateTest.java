package ex27;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class input_validateTest {


    @Test
    void name_length() {
        input_validate app = new input_validate();
        assertEquals(false, input_validate.name_length("a"));
        assertEquals(true, input_validate.name_length("abcdef"));
    }

    @Test
    void zip() {
        input_validate app = new input_validate();
        assertEquals(true, input_validate.zip("32832"));
        assertEquals(false, input_validate.zip("3282"));
        assertEquals(false,input_validate.zip("3283f5"));
    }

    @Test
    void id() {
        input_validate app = new input_validate();
        assertEquals(true, input_validate.id("AA-1234"));
        assertEquals(false, input_validate.id("A-1234"));
        assertEquals(false, input_validate.id("AA-12345"));
        assertEquals(false, input_validate.id("a9-12346"));
    }

    @Test
    void validateInput() {
        input_validate app = new input_validate();
        assertEquals("There were no errors found", input_validate.validateInput("Julian","londono", "32832", "AA-1234"));
    }
}