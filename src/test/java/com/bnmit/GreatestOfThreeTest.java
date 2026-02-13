package com.bnmit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(TestResultLogger.class)
public class GreatestOfThreeTest {

    @Test
    void testFirstIsGreatest() {
        assertEquals(30, GreatestOfThree.findGreatest(30, 20, 10));
    }

    @Test
    void testSecondIsGreatest() {
        assertEquals(40, GreatestOfThree.findGreatest(10, 40, 20));
    }

    @Test
    void testThirdIsGreatest() {
        assertEquals(50, GreatestOfThree.findGreatest(10, 20, 50));
    }

    @Test
    void testAllEqual() {
        assertEquals(25, GreatestOfThree.findGreatest(25, 25, 25));
    }

    @Test
    void testNegativeNumbers() {
        assertEquals(-5, GreatestOfThree.findGreatest(-10, 5, -20));
    }
}
