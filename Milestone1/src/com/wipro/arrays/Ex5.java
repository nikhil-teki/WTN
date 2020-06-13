package com.wipro.arrays;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=args.length;
		int[] a=new int[n];
		int l1=0,l2=0,s1=0,s2=0;
		for(int i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(args[i]);
			if(i==0)
			{
				l1=l2=s1=s2=a[0];
			}
			else
			{
				if(l1<a[i])
				{
					l2=l1;
					l1=a[i];
				}
				else if(l2<a[i]&&a[i]!=l1)
					l2=a[i];
				if(s1>a[i])
				{
					s2=s1;
					s1=a[i];
				}
				else if(s2>a[i]&&a[i]!=s1)
					s2=a[i];
			}
		}
		System.out.println("largest 2 numbers : "+l1+" "+l2);
		System.out.println("smallst 2 numbers : "+s1+" "+s2);
	}

}
