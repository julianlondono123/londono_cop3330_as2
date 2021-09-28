package ex25;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class password_strengthTest {


    @Test
    void passwordValidator() {
        password_strength app = new password_strength();
        assertEquals(4, password_strength.passwordValidator("12345"));
        assertEquals(3, password_strength.passwordValidator("abcdef"));
        assertEquals(2, password_strength.passwordValidator("abc123xyz"));
        assertEquals(1, password_strength.passwordValidator("1337h@xor!"));
    }
}