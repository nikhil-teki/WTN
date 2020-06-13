package com.wipro.arrays;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=args.length,k=0;
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(args[i]);
			if(a[i]==0)
				k=i;
		}
		for(int i=0;i<n-1;i++)
			for(int j=i+1;j<n;j++)
				if((a[i]!=0)&&(a[i]==a[j]))
					a[j]=0;
		for(int i=0;i<n;i++)
			if((a[i]!=0)||(i==k))
				System.out.print(a[i]+" ");
	}

}
