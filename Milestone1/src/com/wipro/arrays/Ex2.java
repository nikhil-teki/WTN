package com.wipro.arrays;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=args.length;
		int[] a=new int[n];
		int max=0,min=0;
		for(int i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(args[i]);
			if(i==0)
				max=min=a[0];
			else
			{
				if(max<a[i])
					max=a[i];
				if(min>a[i])
					min=a[i];
			}
		}
		System.out.println("maximum : "+max+", minimum : "+min);
	}

}
