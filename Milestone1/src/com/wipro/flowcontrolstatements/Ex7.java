package com.wipro.flowcontrolstatements;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c=args[0].charAt(0);
		if((c>='A')&&(c<='Z'))
			System.out.println(c+"->"+(char)(c+32));
		else
			System.out.println(c+"->"+(char)(c-32));
	}

}
