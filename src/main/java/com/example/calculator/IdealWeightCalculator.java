package com.example.calculator;

import java.util.*;

public class IdealWeightCalculator {
	
	
	public static double calcWeight(int age, char gen, double height) {
		double weight = -1;
		if(age >=2 && age <=80 && height > 0) {
			if(gen == 'M' || gen == 'm')
				weight = 50 + (height-152.4)*2.3;
			else if(gen == 'F' || gen == 'f')
				weight = 45.5 + (height-152.4)*2.3;
		}
		return weight;
	}

	public static String calculate() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Age (2-80): ");
    	int age = sc.nextInt();
    	System.out.println("Gender (M/F): ");
    	char gender = sc.next().charAt(0);
		System.out.println("Height (in cm): ");
		double height = sc.nextDouble();
		double weight = calcWeight(age, gender, height);
		if(weight > 0 && weight != -1)
			return "Ideal weight should be " + weight; 
    	return "Invalid Input";
	}
}
