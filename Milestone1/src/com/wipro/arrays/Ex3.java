package com.wipro.arrays;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=args.length,key=Integer.parseInt(args[n-1]),index=0;
		int[] a=new int[n-1];
		boolean found=false;
		for(int i=0;i<n-1;i++)
		{
			a[i]=Integer.parseInt(args[i]);
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
