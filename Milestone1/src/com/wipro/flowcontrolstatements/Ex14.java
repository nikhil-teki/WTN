package com.wipro.flowcontrolstatements;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=Integer.parseInt(args[0]),sum=0;
		while(n!=0)
		{
			sum+=n%10;
			n/=10;
		}
		System.out.println(sum);
	}

}
