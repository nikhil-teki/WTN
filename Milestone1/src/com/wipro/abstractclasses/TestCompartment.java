package com.wipro.abstractclasses;

import java.util.Random;

abstract class Compartment
{
	public abstract String notice();
}
class FirstClass extends Compartment
{
	public String notice()
	{
		return "First Class Compartment";
	}
}
class Ladies extends Compartment
{
	public String notice()
	{
		return "Ladies Compartment : Ladies Only";
	}
}
class General extends Compartment
{
	public String notice()
	{
		return "General Compartment";
	}
}
class Luggage extends Compartment
{
	public String notice()
	{
		return "Luggage Compartment : Luggage only, No passengers allowed";
	}
}

public class TestCompartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compartment[] compartmentArray=new Compartment[10];
		Random randomNumGen=new Random();
		int randomNum=0;
		for(int i=0;i<10;i++)
		{
			randomNum=randomNumGen.nextInt(4);
			randomNum++;
			if(randomNum==1)
				compartmentArray[i]=new FirstClass();
			else if(randomNum==2)
				compartmentArray[i]=new Ladies();
			else if(randomNum==3)
				compartmentArray[i]=new General();
			else
				compartmentArray[i]=new Luggage();
			System.out.println(compartmentArray[i].notice());
		}
	}

}
