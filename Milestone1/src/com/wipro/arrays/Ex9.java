package com.wipro.arrays;

public class Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=args.length,count10=0,j=0;
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(args[i]);
			if(a[i]==10)
				count10++;
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]!=10)
			{
				a[j]=a[i];
				j++;
			}
		}
		for(int i=n-count10;i<n;i++)
			a[i]=0;
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}

}
