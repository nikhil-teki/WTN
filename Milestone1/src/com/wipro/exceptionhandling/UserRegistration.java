package com.wipro.exceptionhandling;

import java.util.Scanner;

@SuppressWarnings("serial")
class InvalidCountryException extends Exception
{
	InvalidCountryException()
	{
		super("User Outside India cannot be registered");
	}
}
public class UserRegistration
{
	public void registerUser(String username,String userCountry) throws InvalidCountryException
	{
		if(userCountry.equalsIgnoreCase("India"))
			System.out.println("User registration done successfully");
		else
			throw new InvalidCountryException();
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		UserRegistration u1=new UserRegistration();
		String userName=scan.nextLine();
		String userCountry=scan.nextLine();
		try
		{
		    u1.registerUser(userName,userCountry);
		}
		catch (InvalidCountryException e)
		{
		    System.out.println(e);
		}
		finally
		{
			scan.close();
;		}
	}
}
