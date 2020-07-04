package com.wipro.exceptionhandling;

import java.util.Scanner;

class NegativeNumberException extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NegativeNumberException()
	{
		super("NegativeNumberException");
	}
}
class ValueOutOfRangeException extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public ValueOutOfRangeException()
	{
		super("ValueOutOfRangeException");
	}
	public ValueOutOfRangeException(Exception e)
	{
		super(e);
	}
}
class Student
{
	String name;
	int[] marks=new int[3];
	void ExceptionCheck(int marks)throws NegativeNumberException,ValueOutOfRangeException
	{
		if(marks<0)
		{
			Exception ex=new NegativeNumberException();
		    throw new ValueOutOfRangeException(ex);
		}
		if(marks>100)
			throw new ValueOutOfRangeException();
	}
}

public class Ex3 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		Student student1=new Student();
		Student student2=new Student();
		int marks;
		try
		{
			int sum1=0;
			double avg1;
			student1.name=scan.nextLine();
			for(int i=0;i<3;i++)
			{
				marks=Integer.parseInt(scan.nextLine());
				student1.marks[i]=marks;
				student1.ExceptionCheck(marks);
				sum1+=marks;
			}
			avg1=sum1/3.0;
			System.out.println(student1.name+" average marks : "+avg1);
			int sum2=0;
			double avg2;
			student2.name=scan.nextLine();
			for(int i=0;i<3;i++)
			{
				marks=Integer.parseInt(scan.nextLine());
				student2.marks[i]=marks;
				student2.ExceptionCheck(marks);
				sum2+=marks;
			}
			avg2=sum2/3.0;
			System.out.println(student2.name+" average marks : "+avg2);
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
