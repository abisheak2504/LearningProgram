package com.kodnest.TaxCalculator;

public class taxCalculator {
	void Calculator(double purchaseAmount,double purchasetax  ) {
		double purchasetotaltax= purchaseAmount*purchasetax;
		double totalAmount=purchaseAmount+purchasetotaltax;
		System.out.println("total cost including tax : "+totalAmount+"rs");
	}

}
