package com.example.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class BmiCalculatorTest {

    @Test
    public void calculate() {
//        String res= BmiCalculator.calculate();
//        assertEquals("Invalid Inputs", res);
    }
    @Test
    public void calculateBmi()
    {
        Double res= BmiCalculator.calculateBmi(-1, -1);
        assertEquals( Double.valueOf(-1), res);
    }
}