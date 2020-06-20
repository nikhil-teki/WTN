package com.wipro.inheritance;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="ABCDMe";
		double annualSalary=35000.234;
		int yearOfJoin=2020;
		String natInsuranceNo="123456791234";
		String personName="PERSON";
		Person person=new Person(personName);
		System.out.println("Person Details:"+person.getName());
		personName="CHANGEDPERSON";
		person.setName(personName);
		System.out.println("Person Details:"+person.getName());
		Employee emp=new Employee(name,annualSalary,yearOfJoin,natInsuranceNo);
		System.out.println("Employee Details:"+emp.getName()+" "+emp.getAnnualSalary()+" "+emp.getYearOfJoin()+" "+emp.getNatInsuranceNo());
		annualSalary=37000.1234;
		yearOfJoin=2021;
		natInsuranceNo="123456543210";
		emp.setAnnualSalary(annualSalary);
		emp.setYearOfJoin(yearOfJoin);
		emp.setNatInsuranceNo(natInsuranceNo);
		System.out.println("Employee Details:"+emp.getName()+" "+emp.getAnnualSalary()+" "+emp.getYearOfJoin()+" "+emp.getNatInsuranceNo());
	}

}
