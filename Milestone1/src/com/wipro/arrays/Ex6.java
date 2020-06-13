package com.wipro.arrays;

import java.util.*;
public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=args.length;
		int[] a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=Integer.parseInt(args[i]);
		Arrays.sort(a);
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}

}
