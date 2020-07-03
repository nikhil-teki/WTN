package com.wipro.exceptionhandling;

public class MathOperation {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		try
		{
			int[] a=new int[5];
			int sum=0;
			for(int i=0;i<5;i++)
			{
				a[i]=Integer.parseInt(args[i]);
				sum+=a[i];
			}
			System.out.println("sum = "+sum);
			System.out.println("average = "+(double)sum/5);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
