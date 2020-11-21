package com.example.calculator;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class BmiCalculator {
    private static String calculateBmi(int height, double weight) {
        final double countBmi = (weight / Math.pow(height, 2)) * 10000;
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(1);
        df.setMinimumFractionDigits(1);

        String outputText = "\nYour BMI is: " + df.format(countBmi);

        if (countBmi < 18.5) {
            return "Underweight" + outputText;
        } else if (countBmi > 18.5 && countBmi < 24.9) {
            return "Healthy" + outputText;
        } else if (countBmi > 25 && countBmi < 30) {
            return "Overweight" + outputText;
        } else if (countBmi > 30) {
            return "Obese" + outputText;
        }
        return "";
    }

    public static String calculate()
    {
    	
    	return "";
    }
    
}
