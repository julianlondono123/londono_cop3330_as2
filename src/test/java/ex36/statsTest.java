package ex36;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class statsTest {



    @Test
    void is_done() {
    stats app = new stats();
    assertEquals(true, stats.is_done("done"));
    assertEquals(false, stats.is_done("notdone"));
    }

    @Test
    void is_numeric() {
        stats app = new stats();
        assertEquals(true, stats.is_numeric("1234"));
        assertEquals(false, stats.is_numeric("hi"));
    }

    @Test
    void max() {
        List<Double> nums = new ArrayList(Arrays.asList(1.00,2.00,10.00,500.00));
        stats app = new stats();
        assertEquals(500.00, stats.max(nums));
    }

    @Test
    void min() {
        List<Double> nums = new ArrayList(Arrays.asList(1.00,2.00,10.00,500.00));
        stats app = new stats();
        assertEquals(1, stats.min(nums));

    }

    @Test
    void mean() {
        List<Double> nums = new ArrayList(Arrays.asList(1.00,2.00,10.00,500.00));
        stats app = new stats();
        assertEquals(128.25, stats.mean(nums));
    }

    @Test
    void std() {
        List<Double> nums = new ArrayList(Arrays.asList(1.00,2.00,10.00,500.00));
        stats app = new stats();
        assertEquals(214.66, stats.max(nums));
    }
}