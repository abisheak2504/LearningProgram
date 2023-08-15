package com.kodnest.BitwiseBitCounter;

import java.util.Scanner;

public class BitwiseBitConverterApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the integer");
		int a=scan.nextInt();
		scan.close();
		bitwiseBitConverter b1=new bitwiseBitConverter();
		System.out.println("your bit value is : "+b1.countSetBits(a));

	}

}
