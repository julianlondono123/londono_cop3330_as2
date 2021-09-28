package ex35;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PickWinnerTest {

    @Test
    void get_winner() {
    PickWinner app = new PickWinner();
    List<String> names = new ArrayList<String> (Arrays.asList("Juan"));
    assertEquals("Juan", PickWinner.get_winner(names));
    }
}