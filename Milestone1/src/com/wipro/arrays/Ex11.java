package com.wipro.arrays;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=args.length;
		int[] a=new int[n];
		boolean flag=false;
		for(int i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(args[i]);
			if(!((a[i]==1)||(a[i]==4)))
			{
				flag=true;
				break;
			}
		}
		System.out.println(!flag);
	}

}
