package ex31;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class heartrateTest {


    @Test
    void karv() {
    heartrate app = new heartrate();
    assertEquals(138, heartrate.karv(22, 65, 55));
    assertEquals(191, heartrate.karv(22, 65, 95));
    }
}