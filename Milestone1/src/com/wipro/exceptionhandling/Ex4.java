package com.wipro.exceptionhandling;
@SuppressWarnings("serial")
class AgeOutOfRangeException extends Exception
{
	AgeOutOfRangeException(int age)
	{
		super("age "+age+" is out of range");
	}
}
public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			String name=args[0];
			int age=Integer.parseInt(args[1]);
			if(!((age>=18)&&(age<60)))
				throw new AgeOutOfRangeException(age);
			System.out.println("Name : "+name);
			System.out.println("Age : "+age);
			System.out.println("All details are valid");
		}
		catch(AgeOutOfRangeException e)
		{
			System.out.println(e);
			System.out.println("Restricted age");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
