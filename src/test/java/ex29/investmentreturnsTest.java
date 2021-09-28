package ex29;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class investmentreturnsTest {



    @Test
    void valid() {
    investmentreturns app = new investmentreturns();

    assertEquals(true, investmentreturns.valid("5"));
    assertEquals(false, investmentreturns.valid("0"));
    assertEquals(false, investmentreturns.valid("ggg000"));
    }
}