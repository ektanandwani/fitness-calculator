package com.example.calculator;

import java.util.Scanner;

public class CalorieCalculator {
	
	public static double calculateCalorie(int age, char gender, double height, double weight) {
    	double calories = -1;
    	
    	return calories;
	}

	public static String calculate() {
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
	    double cal = calculateCalorie(age, gender, h, w);
	    if(cal > 0 && cal != -1)
	    	return "Number of calories to consume everyday: " + cal;
    	return "";
	}
}
