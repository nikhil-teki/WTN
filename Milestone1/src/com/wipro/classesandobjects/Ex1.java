package com.wipro.classesandobjects;

class Box
{
	private double width,height,depth;
	Box(double width,double height,double depth)
	{
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	public double findVolume()
	{
	    return width*height*depth;
	}
}
public class Ex1
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box=new Box(2.0,3.0,4.0);
		double volume=box.findVolume();
		System.out.println(volume);
	}
}