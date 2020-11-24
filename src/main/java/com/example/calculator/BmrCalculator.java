package com.example.calculator;

import java.util.Scanner;

public class BmrCalculator {
	
	
	public static double calculateBmr(int age, char gen, double h, double w)
	{
		double bmr = -1;
		if(age >= 15 && age <= 80 && h > 0 && w > 0)
		{
			if(gen == 'M' || gen == 'm')
				bmr = 10*w + 6.25*h - 5*age + 5;
			else if(gen == 'F' || gen == 'f')
				bmr = 10*w + 6.25*h - 5*age - 161;
		}
		
		return bmr;
	}
	
	public static String calculate() {
	    System.out.println("BMR gives the amount of energy used while at rest");
	    System.out.println();
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Age (15-80): ");
	    int age = sc.nextInt();
	    System.out.println("Gender (M/F): " );
	    char gender = sc.next().charAt(0);
	    System.out.println("Height (cm): ");
	    double h = sc.nextDouble();
	    System.out.println("Weight (kg): ");
	    double w = sc.nextDouble();
	    double bmr = calculateBmr(age, gender, h, w);
	    
	    if(bmr > 0 && bmr != -1)
	    	return "BMR = " + bmr + " calories/day";
	    
	    return "Invalid Inputs";
	}

}
