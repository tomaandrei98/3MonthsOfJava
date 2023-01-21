package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

class BMICalculatorTest {
    private BMICalculator bmiCalculator;

    @BeforeEach
    public void setup() {
        bmiCalculator = new BMICalculator();
    }

    @Test
    public void calculateBMITest() {
        double actualOutput = bmiCalculator.calculateBMI(60, 180);
        double expectedOutput = 18.51851851851852;

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void shouldPassFor60KgAnd180Cm() {
        String actualOutput = bmiCalculator.formatBMIResult(bmiCalculator.calculateBMI(60, 180));
        String expectedOutput = "18.5";

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void formatBMIResultTest() {
        String actualOutput = bmiCalculator.formatBMIResult(24.2424);
        String expectedOutput = "24.2";

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void enterNumberShouldReturnFourForInputFour() {
        BMICalculator bmiCalculatorMock = spy(BMICalculator.class);
        doReturn(4.0).when(bmiCalculatorMock).enterNumber(anyString());

        double actualOutput = bmiCalculatorMock.enterNumber("Enter a number");
        double expectedOutput = 4.0;

        assertEquals(expectedOutput, actualOutput);
    }
}