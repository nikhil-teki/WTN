package com.wipro.flowcontrolstatements;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int len=args.length;
		if(len==0)
			System.out.println("No Values");
		else
		{
			for(int i=0;i<len;i++)
			{
				System.out.print(args[i]);
				if(i==len-1)
					break;
				System.out.print(",");
			}
		}
	}

}
