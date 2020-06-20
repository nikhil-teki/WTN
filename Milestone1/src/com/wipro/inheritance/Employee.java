package com.wipro.inheritance;

public class Employee extends Person
{
	private double annualSalary;
	private int yearOfJoin;
	private String natInsuranceNo;
	Employee(String name,double annualSalary,int yearOfJoin,String natInsuranceNo)
	{
		super(name);
		this.annualSalary=annualSalary;
		this.yearOfJoin=yearOfJoin;
		this.natInsuranceNo=natInsuranceNo;
	}
	public double getAnnualSalary() {
		return annualSalary;
	}
	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}
	public int getYearOfJoin() {
		return yearOfJoin;
	}
	public void setYearOfJoin(int yearOfJoin) {
		this.yearOfJoin = yearOfJoin;
	}
	public String getNatInsuranceNo() {
		return natInsuranceNo;
	}
	public void setNatInsuranceNo(String natInsuranceNo) {
		this.natInsuranceNo = natInsuranceNo;
	}
}
