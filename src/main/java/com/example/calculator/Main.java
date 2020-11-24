package com.example.calculator;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = getCalcChoice();
	    while(choice != 7) {
	    	switch (choice) {
			case 1:
				System.out.println("Enter your height in meter: ");
				double height = sc.nextDouble();
				System.out.println("Enter your weight in kg: ");
				double weight = sc.nextDouble();
				System.out.println(new BmiCalculator().calculate(height, weight));
				System.out.println();
				break;
			case 2:
				System.out.println(BmrCalculator.calculate());
				System.out.println();
				break;
			case 3:
				System.out.println(BodyFatCalculator.calculate());
				System.out.println();
				break;
			case 4:
				System.out.println(CalorieCalculator.calculate());
				System.out.println();
				break;
			case 5:
				System.out.println(IdealWeightCalculator.calculate());
				System.out.println();
				break;
			case 6:
				System.out.println(LeanBodyMassCalculator.calculate());
				System.out.println();
				break;
			default:
				System.out.println("Invalid choice. Please enter a valid option");
				System.out.println();
				break;
			}
	    	choice = getCalcChoice();
	    	
	    }
    }
	
	public static int getCalcChoice() {
		System.out.println("List of Fitness Calculators");
		System.out.println("1. Body Mass Index (BMI) Calculator");
		System.out.println("2. Basal Metabolic Rate (BMR) Calculator");
		System.out.println("3. Body Fat Weight Calculator");
		System.out.println("4. Calorie Calculator");
		System.out.println("5. Ideal Weight Calculator");
		System.out.println("6. Lean Body Mass Calculator");
		System.out.println("7. Exit");
		System.out.print("Please select the option: ");
	    Scanner scanner = new Scanner(System.in);
	    int choice = scanner.nextInt();
	    return choice;
	}

}
