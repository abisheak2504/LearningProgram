package com.kodnest.MethodOverloadingCalculator;

public class MethodOverloadingCalculator {
	int calculate(int a,int b) {
		int c=a+b;
		return c;
	}
	double calculate(double a,int b) {
		double c=a-b;
		return c;
	}
	double calculate(int a,double b) {
		double c=a*b;
		return c;
	}
	double calculate(double a,double b) {
		double c=a/b;
		return c;
	}
	
}
