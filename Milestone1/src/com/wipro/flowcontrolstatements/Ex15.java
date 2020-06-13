package com.wipro.flowcontrolstatements;

public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length==0)
		System.out.println("Please enter an integer number");
		else
		{
		int n=Integer.parseInt(args[0]),i,j;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
				System.out.print("*  ");
			System.out.println();
		}
		}
	}

}
