package com.wipro.flowcontrolstatements;

public class Ex1A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=Integer.parseInt(args[0]);
		if(number<0)
			System.out.println("Negative");
		else if(number>0)
			System.out.println("Positive");
		else
			System.out.println("Zero");
	}

}
