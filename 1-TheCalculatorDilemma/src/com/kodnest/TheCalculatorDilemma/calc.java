package com.kodnest.TheCalculatorDilemma;

public class calc {
	void calculator(char character,int a,int b) {
		
		switch(character){
		case '+':
			System.out.println("Your addition value is : "+(a+b));
			break;
		case '-':
			System.out.println("you Subration value is : "+(a-b));
			break;
		case '*':
			System.out.println("Your Multiply value is : "+(a*b));
			break;
		case '/':
			System.out.println("Your Division value is : "+(a/b));
			break;
		case '%':
			System.out.println("Your modulo value is : "+ (a%b));
			break;
		default:
			System.out.println("read the given option correctly");
			
		}
		
	}

}
