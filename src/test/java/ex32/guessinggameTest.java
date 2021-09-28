package ex32;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class guessinggameTest {


    @Test
    void is_numeric() {
    guessinggame app = new guessinggame();
    assertEquals(true, guessinggame.is_numeric("150"));
    assertEquals(false, guessinggame.is_numeric("1g5"));
    }

    @Test
    void guess_check() {
        guessinggame app = new guessinggame();
        assertEquals("Too high. Guess again.", guessinggame.guess_check(15, 12, 0) );
        assertEquals("Too low. Guess again.", guessinggame.guess_check(15, 20, 0));
        assertEquals("You got it in " + 5 + " guesses!", guessinggame.guess_check(15,15,5));
    }
}