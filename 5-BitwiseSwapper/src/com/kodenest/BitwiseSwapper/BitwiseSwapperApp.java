package com.kodenest.BitwiseSwapper;

import java.util.Scanner;

public class BitwiseSwapperApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the first number");
		int a=scan.nextInt();
		System.out.println("enter the second number");
		int b=scan.nextInt();
		BitwiseSwapper b1=new BitwiseSwapper();
		b1.swapUsingBitwise(a, b);
		scan.close();
		
	}

}
