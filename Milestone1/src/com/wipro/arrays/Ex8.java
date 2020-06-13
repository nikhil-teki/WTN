package com.wipro.arrays;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=args.length,sum=0,i6=n,i7=n;
		int[] a=new int[n];
		boolean f6=false,f7=false;
		for(int i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(args[i]);
			if((a[i]==6)&&(f6==false))
			{
				i6=i;
				f6=true;
			}
			if(a[i]==7)
			{
				i7=i;
				f7=true;
			}
			sum+=a[i];
		}
		if(f6&&f7)
		{
			for(int i=i6;i<=i7;i++)
				sum-=a[i];
		}
		System.out.println(sum);
	}

}
