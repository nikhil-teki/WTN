package com.wipro.arrays;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=args.length,sum=0;
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(args[i]);
			sum+=a[i];
		}
		double avg=((double)sum)/n;
		System.out.println("sum : "+sum+", average : "+avg);
	}

}
