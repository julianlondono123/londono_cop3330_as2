package ex26;

import org.example.PaymentCalculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {


    @Test
    void calculateMonthsUntilPaidOff() {
        PaymentCalculator app = new PaymentCalculator();
        assertEquals(70, PaymentCalculator.calculateMonthsUntilPaidOff(100.00, 5000.00, 12.00/(365.00*100)));
    }
}