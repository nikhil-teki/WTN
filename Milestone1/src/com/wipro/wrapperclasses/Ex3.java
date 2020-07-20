package com.wipro.wrapperclasses;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		scan.close();
		int binNumber=Integer.parseInt(Integer.toBinaryString(number));
		String binNumString=String.format("%08d",binNumber);
		System.out.println(binNumString);
	}

}
