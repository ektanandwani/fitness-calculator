package com.example.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class BmiCalculatorTest {
	 BmiCalculator bmiCalculator=new BmiCalculator();
     String res;

    @Test
    public void calculate() {

        res=bmiCalculator.calculate(0, 0);
        assertEquals("Invalid Inputs", res);

        res=bmiCalculator.calculate(1.2, 0);
        assertEquals("Invalid Inputs", res);

        res=bmiCalculator.calculate(0, 10);
        assertEquals("Invalid Inputs", res);

        res=bmiCalculator.calculate(-1, -2);
        assertEquals("Invalid Inputs", res);

        res=bmiCalculator.calculate(2, 40);
        assertNotEquals("Invalid Inputs", res);

        res=bmiCalculator.calculate(2, 80);
        assertNotEquals("Invalid Inputs", res);

        res=bmiCalculator.calculate(1.5, 60);
        assertNotEquals("Invalid Inputs", res);

        res=bmiCalculator.calculate(1.5, 90);
        assertNotEquals("Invalid Inputs", res);

        res=bmiCalculator.calculate(1, 18.5);
        assertNotEquals("Invalid Inputs", res);

        res=bmiCalculator.calculate(1, 25);
        assertNotEquals("Invalid Inputs", res);

        res=bmiCalculator.calculate(1, 30);
        assertNotEquals("Invalid Inputs", res);
        
        res=bmiCalculator.calculate(1.58, 40);
        assertTrue(res.contains("Underweight"));
        
        res=bmiCalculator.calculate(1.58, 50);
        assertTrue(res.contains("Healthy"));
        
        res=bmiCalculator.calculate(1.58, 65);
        assertTrue(res.contains("Overweight"));
        
        res=bmiCalculator.calculate(1.58, 80);
        assertTrue(res.contains("Obese"));

    }
       
    @Test
    public void calculateBmi()
    {
        Double res= bmiCalculator.calculateBmi(-1, -1);
        assertEquals( Double.valueOf(-1), res);
        
        res= bmiCalculator.calculateBmi(40, -1);
        assertEquals( Double.valueOf(-1), res);
        
        res = bmiCalculator.calculateBmi(1.53,70);
        assertEquals(29.90302874, res, 0.1);
        
        
        
    }
}
