package com.kodenest.BitwiseSwapper;

public class BitwiseSwapper {
	void swapUsingBitwise(int a,int b) {
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("after swapping a : "+a);
		System.out.println("after swapping b : "+b);
	}
}
