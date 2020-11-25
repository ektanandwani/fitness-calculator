package com.example.converter;

public class CalorieConverter {
	// joules to calories and vice versa
	public static double calToJoule(double cal) {
		return cal*4.1868;
	}
	
	public static double jouleToCal(double joule) {
		return joule*0.2388459;
	}
}
