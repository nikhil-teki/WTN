package com.wipro.flowcontrolstatements;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c=args[0].charAt(0);
		if((c>='0')&&(c<='9'))
			System.out.println("Digit");
		else if(((c>='A')&&(c<='Z'))||((c>='a')&&(c<='z')))
			System.out.println("Alphabet");
		else
			System.out.println("Special Character");
	}

}
