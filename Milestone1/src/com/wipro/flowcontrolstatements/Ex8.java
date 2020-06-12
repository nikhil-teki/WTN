package com.wipro.flowcontrolstatements;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char colorcode=args[0].charAt(0);
		String color;
		switch(colorcode)
		{
		case 'R':color="Red";
		         break;
		case 'B':color="Blue";
                 break;
		case 'G':color="Green";
                 break;
		case 'O':color="Orange";
                 break;
		case 'Y':color="Yellow";
                 break;
		case 'W':color="White";
                 break;
        default:color="Invalid Code";
                 break;
		}
		System.out.println(color);
	}

}
