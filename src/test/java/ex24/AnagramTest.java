package ex24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    @Test
    void anagram_check() {
        Anagram app = new Anagram();
        assertEquals(true, Anagram.anagram_check("note", "tone"));
    }
}