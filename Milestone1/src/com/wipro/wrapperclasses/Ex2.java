package com.wipro.wrapperclasses;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=Integer.parseInt(args[0]);
		String binary=Integer.toBinaryString(number);
		String octal=Integer.toOctalString(number);
		String hexadecimal=Integer.toHexString(number);
		System.out.println("Given Number :"+number);
		System.out.println("Binary equivalent :"+binary);
		System.out.println("Octal equivalent :"+octal);
		System.out.println("Hexadecimal equivalent :"+hexadecimal);
	}

}
