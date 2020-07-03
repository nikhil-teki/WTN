package com.wipro.exceptionhandling;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=0,ind=0;
		int a[]=null;
		try
		{
			System.out.println("Enter the number of elements in the array");
			n=Integer.parseInt(scan.nextLine());
			a=new int[n];
			System.out.println("Enter the elements in the array");
			for(int i=0;i<n;i++)
				a[i]=Integer.parseInt(scan.nextLine());
			System.out.println("Enter the index of the array element you want to access");
			ind=Integer.parseInt(scan.nextLine());
			System.out.println("The array element at index "+ind+" = "+a[ind]);
			System.out.println("The array element successfully accessed");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			scan.close();
		}
	}

}
