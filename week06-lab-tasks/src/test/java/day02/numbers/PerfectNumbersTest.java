package day02.numbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerfectNumbersTest {

    @Test
    void isPerfectNumberTest(){
        PerfectNumbers perfectNumbers=new PerfectNumbers();

        assertTrue(perfectNumbers.isPerfectNumber(8128));
        assertTrue(perfectNumbers.isPerfectNumber(6));

        assertFalse(perfectNumbers.isPerfectNumber(9));
        assertFalse(perfectNumbers.isPerfectNumber(7246));
    }

}