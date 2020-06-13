package com.wipro.arrays;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=args.length,j=0;
		int[] a=new int[n];
		int[] b=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(args[i]);
			if((a[i]%2)==0)
			{
				b[j]=a[i];
				j++;
			}
		}
		for(int i=0;i<n;i++)
		{
			if((a[i]%2)!=0)
			{
				b[j]=a[i];
				j++;
			}
		}
		for(int i=0;i<n;i++)
			System.out.print(b[i]+" ");
	}

}
