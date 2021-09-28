package ex38;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EvenNumsTest {


    @Test
    void evens() {
        EvenNums app = new EvenNums();
        List<Integer> nums = new ArrayList<Integer>(Arrays.asList(1,2,4,5,6,10,100,200,203));
        List<Integer> evennums = new ArrayList<Integer>(Arrays.asList(2,4,6,10,100,200));
        assertEquals(evennums, EvenNums.evens(nums));
    }


}