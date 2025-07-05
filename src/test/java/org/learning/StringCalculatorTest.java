package org.learning;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.learning.Exceptions.ContainsNegativeNumbersException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringCalculatorTest {

    private IncubyteTDDAssessment calculator;

    @BeforeEach
    public void setUp() {
        calculator = new IncubyteTDDAssessment();
    }

    @Test
    public void testEmptyStringReturnsZero() {
        assertEquals(0, calculator.add(""));
    }

    @Test
    public void testMultipleNumbersCommaDelimited() {
        assertEquals(10, calculator.add("1,2,3,4"));
    }


}