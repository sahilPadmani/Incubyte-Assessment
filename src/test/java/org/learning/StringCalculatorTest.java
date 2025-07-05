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

    @Test
    public void testCustomSingleCharacterDelimiter() {
        assertEquals(6, calculator.add("//;\n1;2;3"));
    }


    @Test
    public void testStringContainMultipleNegativeNumbers() {

        ContainsNegativeNumbersException exception = assertThrows(ContainsNegativeNumbersException.class, () -> {
            calculator.add("1,-2,3,-5");
        });

        String expectedMessage = "negative numbers not allowed <-2,-5>";
        assertEquals(expectedMessage, exception.getMessage());
    }

    @Test
    public void testStringContainMultipleNegativeNumbersForCustomSingleCharacterDelimiter() {

        ContainsNegativeNumbersException exception = assertThrows(ContainsNegativeNumbersException.class, () -> {
            calculator.add("//:\n1:-2:3:-5");
        });

        String expectedMessage = "negative numbers not allowed <-2,-5>";
        assertEquals(expectedMessage, exception.getMessage());
    }

    @Test
    public void testEmptyCustomSingleCharacterDelimiterForEmpty() {
        assertEquals(0, calculator.add("//;\n"));
    }

    @Test
    public void testInvalidStringFormat() {
        assertThrows(RuntimeException.class, () -> calculator.add("1,,"));
    }

    @Test
    public void testInvalidFormat() {
        assertThrows(RuntimeException.class, () -> calculator.add("1,\n2"));
    }
}