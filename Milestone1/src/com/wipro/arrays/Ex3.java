package com.wipro.arrays;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=Integer.parseInt(args[0]),key=Integer.parseInt(args[n+1]),index=0;
		int[] a=new int[n];
		boolean found=false;
		for(int i=0;i<n;i++)
			a[i]=Integer.parseInt(args[i+1]);
		for(int i=0;i<n;i++)
		{
			if(a[i]==key)
			{
				index=i;
				found=true;
				break;
			}
		}
		if(found)
			System.out.println(index);
		else
			System.out.println("-1");
	}

}
