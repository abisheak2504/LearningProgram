package com.kodnest.TemperatureConversion;

import java.util.Scanner;

public class TemperatureConverterApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Welcome to the Temperature Conversion Tool!");
		System.out.println("*******************************************************************************************************");
		System.out.println("Select an option:");
		System.out.println("if you want to convert Celsius to Fahrenheit type :1");
		System.out.println("if you want to convert Fahrenheit to Celsius type :2");
		System.out.println("*******************************************************************************************************");
		int num=scan.nextInt();
		switch(num){
		case 1:
			System.out.println("Eneter the celsius value");
			double c=scan.nextDouble();
			double celsiusToFahrenheit=Temperatureconverter.celsiusToFahrenheit(c);
			System.out.println(c+"°C is equivalent to "+celsiusToFahrenheit+"°F");
			break;
		case 2:
			System.out.println("Eneter the Fahrenheit value");
			Double f=scan.nextDouble();
			double fahrenheitToCelsius=Temperatureconverter.fahrenheitToCelsius(f);
			System.out.println(f+"°F is equivalent to "+fahrenheitToCelsius+"°C");
			break;
		default:
			System.out.println("in the earth we have only 2 types of temperature only");
		}
		
	}

}
