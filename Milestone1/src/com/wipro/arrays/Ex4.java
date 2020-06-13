package com.wipro.arrays;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=args.length;
		int[] a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=Integer.parseInt(args[i]);
		for(int i=0;i<n;i++)
			System.out.print((char)a[i]+" ");
	}

}
