package com.kodnest.TaxCalculator;

import java.util.Scanner;

public class taxCalculatorApplication {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the total purchased amount");
		double purchaseAmount=scan.nextDouble();
		System.out.println("enter the tax amount");
		double purchasetax=scan.nextDouble();
		scan.close();
		taxCalculator t1=new taxCalculator();
		t1.Calculator(purchaseAmount, purchasetax);
	}

}
