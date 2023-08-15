package com.kodnest.TheCalculatorDilemma;

import java.util.Scanner;

public class CalculatorDilemmaApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the first number");
		int a=scan.nextInt();
		System.out.println("enter the Second number");
		int b=scan.nextInt();
		System.out.println("enter the method in calculation");
		char character=scan.next().charAt(0);
		calc c1=new calc();
		c1.calculator(character, a, b);
		scan.close();
	}

}
