package com.wipro.inheritance;
class Animal
{
	public void eat()
	{
		System.out.println("Animal is Eating");
	}
	public void sleep()
	{
		System.out.println("Animal is Sleeping");
	}
}
class Bird extends Animal
{
	public void eat()
	{
		System.out.println("Bird is Eating");
	}
	public void sleep()
	{
		System.out.println("Bird is Sleeping");
	}
	public void fly()
	{
		System.out.println("Bird is flying");
	}
}
public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal A=new Animal();
		Bird B=new Bird();
		A.eat();
		A.sleep();
		B.eat();
		B.sleep();
		B.fly();
	}

}
