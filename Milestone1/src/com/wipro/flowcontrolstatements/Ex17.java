package com.wipro.flowcontrolstatements;

public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=Integer.parseInt(args[0]),temp,rem,rev=0;
		temp=n;
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n/=10;
		}
		if(rev==temp)
			System.out.println(temp+" is a palindrome");
		else
			System.out.println(temp+" is not a palindrome");
	}

}
