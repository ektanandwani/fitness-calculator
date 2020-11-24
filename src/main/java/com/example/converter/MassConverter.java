package com.example.converter;

public class MassConverter {
	// kg, grams to pound and vice versa
	private static double kgToGram(double kg) {
		return kg*1000;
	}
	
	private static double kgToPound(double kg) {
		return kg*1000;
	}
	
	private static double gramToKg(double gram) {
		return gram/1000;
	}
	
	private static double gramToPound(double gram) {
		return gram*0.00220462;
	}
	
	private static double poundToGram(double pound) {
		return pound*453.592;
	}
	
	private static double poundToKg(double pound) {
		return pound*0.453592000004704;
	}
}
