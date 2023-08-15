package com.kodnest.MethodOverloadingCalculator;

import java.util.Scanner;

public class MethodOverloadingCalculatorApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter thee two number");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("enter the symbols : +,-,*,/");
		char symbol=scan.next().charAt(0);
		scan.close();
		MethodOverloadingCalculator m1=new MethodOverloadingCalculator();
		switch(symbol) {
		case'+':
			System.out.println("your addition value is : "+m1.calculate(a, b));
			break;
		case'-':
			double c=a;
			System.out.println("your addition value is : "+m1.calculate(c,b));
			break;
		case'*':
			double d=b;
			System.out.println("your addition value is : "+m1.calculate(a,d));
			break;
		case'/':
			double e=a;
			double f=b;
			System.out.println("your addition value is : "+m1.calculate(e,f));
			break;
		default:
			System.out.println("you have only cabapility to calculate +,-,*,/ only");
		}
}

}
