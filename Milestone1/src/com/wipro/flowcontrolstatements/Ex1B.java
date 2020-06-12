package com.wipro.flowcontrolstatements;

public class Ex1B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		if((a%10)==(b%10))
			System.out.println("true");
		else
			System.out.println("false");
	}

}
