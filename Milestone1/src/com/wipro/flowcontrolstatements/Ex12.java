package com.wipro.flowcontrolstatements;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=Integer.parseInt(args[0]),i,flag=0;
		for(i=2;i<=num/2;i++)
			if(num%i==0)
			{
				flag=1;
				break;
			}
		if(flag==1)
			System.out.println("not prime");
		else
			System.out.println("prime");
	}

}
