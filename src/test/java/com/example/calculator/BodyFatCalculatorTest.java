package com.example.calculator;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BodyFatCalculatorTest extends TestCase {

    @Test
    public void calculate() {
        BodyFatCalculator bodyFatCalculator = new BodyFatCalculator();
        String res;

        res=bodyFatCalculator.calculate(68,1.75,0,0);
        assertEquals("Invalid Inputs", res);

        res=bodyFatCalculator.calculate(55,1.65,-1,0);
        assertEquals("Invalid Inputs", res);

        res=bodyFatCalculator.calculate(0,0,-1,0);
        assertEquals("Invalid Inputs", res);

        res=bodyFatCalculator.calculate(70,1.75,1,-1);
        assertEquals("Invalid Inputs", res);
       
    }
}