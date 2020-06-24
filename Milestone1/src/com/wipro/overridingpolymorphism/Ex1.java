package com.wipro.overridingpolymorphism;

class Fruit
{
	String name;
	String taste;
	String size;
	Fruit(String name,String taste)
	{
		this.name=name;
		this.taste=taste;
	}
	public void eat()
	{
		System.out.println("Fruit : "+name+", taste : "+taste);
	}
}
class Apple extends Fruit
{
	Apple(String name,String taste)
	{
		super(name,taste);
	}
	public void eat()
	{
		System.out.println("Fruit : "+name+", taste : "+taste);
	}
}
class Orange extends Fruit
{
	Orange(String name,String taste)
	{
		super(name,taste);
	}
	public void eat()
	{
		System.out.println("Fruit : "+name+", taste : "+taste);
	}
}
public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit fruit=new Fruit("Fruit","sweet");
		Apple apple=new Apple("Apple","very sweet");
		Orange orange=new Orange("Orange","sweet and sour");
		fruit.eat();
		apple.eat();
		orange.eat();
	}

}
