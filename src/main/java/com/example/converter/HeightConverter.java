package com.example.converter;

public class HeightConverter {
	// meter, cm to feet and vice versa
	
	public static double cmToFoot(double cm) {
		return cm*0.0328084;
	}
	
	public static double cmTometer(double cm) {
		return cm/100;
	}
	
	public static double meterToFoot(double meter) {
		return meter*3.28084;
	}
	
	public static double meterToCm(double meter) {
		return meter*100;
	}
	
	public static double footToCm(double foot) {
		return foot*30.480000975359999416;
	}
	
	public static double footToMeter(double foot) {
		return foot*0.3048000097536;
	}
}
