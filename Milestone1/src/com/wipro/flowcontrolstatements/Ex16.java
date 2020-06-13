package com.wipro.flowcontrolstatements;

public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=Integer.parseInt(args[0]),rev=0,rem;;
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n/=10;
		}
		System.out.println(rev);
	}

}
