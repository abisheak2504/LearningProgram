package com.kodnest.LogicalOperatorValidator;

import java.util.Scanner;

public class LogicalOperatorApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the 2boolean value");
		boolean a=scan.nextBoolean();
		boolean b=scan.nextBoolean();	
		scan.close();
		logicalOperator l1=new logicalOperator();
		boolean valid=l1.isValidInput(a, b);
		if(true==valid) {
			System.out.println("input is valid");
		}
		else {
			System.out.println("input is notvalid");
		}
		
	}

}
