package com.wipro.classesandobjects;

class Calculator
{
	public static int powerInt(int num1,int num2)
	{
		return (int)Math.pow(num1,num2);
	}
	public static double powerDouble(double num1,double num2)
	{
		return Math.pow(num1,num2);
	}
}
public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intA=2,intB=10;
		double doubleA=5.123,doubleB=2.012;
		int powIntAns=Calculator.powerInt(intA,intB);
		double powDoubleAns=Calculator.powerDouble(doubleA,doubleB);
		System.out.println(intA+" ^ "+intB+" = "+powIntAns);
		System.out.println(doubleA+" ^ "+doubleB+" = "+powDoubleAns);
	}

}
