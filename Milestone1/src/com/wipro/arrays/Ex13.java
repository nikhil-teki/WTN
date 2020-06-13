package com.wipro.arrays;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a=new int[2][2];
		int[][] b=new int[2][2];
		int k=0;
		if(args.length!=4)
			System.out.println("Please enter 4 integer numbers");
		else
		{
			System.out.println("The given array is :");
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
				{
					a[i][j]=Integer.parseInt(args[k]);
					b[j][i]=a[i][j];
					k++;
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
			for(int i=1;i>=0;i--)
				for(int j=1;j>=0;j--)
					b[2-i-1][2-j-1]=a[i][j];
			System.out.println("The reverse of the array is :");
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
					System.out.print(b[i][j]+" ");
				System.out.println();
			}
		}
	}

}
