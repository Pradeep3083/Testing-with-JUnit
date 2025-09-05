package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void canTwoAddNumbers(){
        Calculator calTest = new Calculator();
        var number1 = 10;
        var number2 = 20;
        var result = calTest.add(number1,number2);
        assertEquals(30,result);
    }

    @Test
    void canHandleWhenInputInZero(){
        Calculator calTest = new Calculator();
        var result = calTest.add(0);
        assertEquals(0,result);
    }

    @Test
    void canAddNumbersFromAGivenArray(){
        Calculator calTest = new Calculator();
        var numbers = new int[]{1,5,3};
        var result = calTest.add(numbers);
        assertEquals(9,result);
    }
}
