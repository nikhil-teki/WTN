package com.wipro.arrays;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=0,max=0;
		int[][] a=new int[3][3];
		if(args.length==0)
			System.out.println("Please enter 9 integer numbers");
		else
		{
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					a[i][j]=Integer.parseInt(args[k]);
					k++;
					if((i==0)&&(j==0))
						max=a[0][0];
					else
					{
						if(max<a[i][j])
							max=a[i][j];
					}
				}
			}
			System.out.println("The biggest number in the given array is "+max);
		}
	}

}
