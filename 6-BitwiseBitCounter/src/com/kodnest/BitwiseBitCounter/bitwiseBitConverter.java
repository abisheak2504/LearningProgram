package com.kodnest.BitwiseBitCounter;

public class bitwiseBitConverter {
	int countSetBits(int a) {
		int integer=a;
		System.out.println("biinary code is : "+Integer.toBinaryString(integer));
		return Integer.bitCount(integer);
	}
}
