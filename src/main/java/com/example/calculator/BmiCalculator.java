package com.example.calculator;


import java.util.Scanner;

public class BmiCalculator {
    private static double calculateBmi(double height, double weight) {
    	double bmi;
    	if(height > 0 && weight > 0)
    		bmi = weight/height*height;
    	else
    		bmi = -1;

        return bmi;
    }

    public static String calculate()
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter your height in meter: ");
    	double height = sc.nextDouble();
    	System.out.println("Enter your weight in kg: ");
    	double weight = sc.nextDouble();
    	double bmi = calculateBmi(height, weight);
    	sc.close();
    	if (bmi > 0 && bmi < 18.5) {
          return "Underweight. Your BMI is " + bmi;
	    } else if (bmi > 18.5 && bmi < 24.9) {
	          return "Healthy. Your BMI is " + bmi;
	    } else if (bmi > 25 && bmi < 30) {
	          return "Overweight. Your BMI is " + bmi;
	    } else if (bmi > 30) {
	          return "Obese. Your BMI is " + bmi;
	    }
    	
    	return "Invalid Inputs";
    }
    
}
