package com.wipro.arrays;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[3];
		int[] b=new int[3];
		int[] c=new int[2];
		for(int i=0;i<3;i++)
			a[i]=Integer.parseInt(args[i]);
		for(int i=0;i<3;i++)
			b[i]=Integer.parseInt(args[i+3]);
		c[0]=a[1];
		c[1]=b[1];
		System.out.println(c[0]+" "+c[1]);
	}

}
