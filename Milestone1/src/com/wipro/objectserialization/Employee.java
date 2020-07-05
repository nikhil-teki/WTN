package com.wipro.objectserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class Employee implements Serializable{
	private String name;
	private Date dateOfBirth;
	private String department;
	private String designation;
	private double salary;
	Employee()
	{
		name="name";
		dateOfBirth=new Date();
		department="department";
		designation="designation";
		salary=Double.MAX_VALUE;
	}
	Employee(String name,Date dateOfBirth,String department,String designation,double salary)
	{
		this.name=name;
		this.dateOfBirth=dateOfBirth;
		this.department=department;
		this.designation=designation;
		this.salary=salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Nikhil";
		String department="R&D";
		String designation="Employee";
		double salary=500000;
		@SuppressWarnings("deprecation")
		Date dateOfBirth=new Date(2000,04,21);
		Employee employee=new Employee(name,dateOfBirth,department,designation,salary);
		String path="G:\\WTN-workspace\\WTN\\Milestone1\\src\\com\\wipro\\objectserialization\\";
		try
		{
			FileOutputStream fos=new FileOutputStream(path+"Data");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(employee);
			oos.close();
			FileInputStream fis=new FileInputStream(path+"Data");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Employee empobj=(Employee)ois.readObject();
			System.out.println(empobj);
			System.out.println(empobj.getName());
			System.out.println(empobj.getDateOfBirth());
			System.out.println(empobj.getDepartment());
			System.out.println(empobj.getDesignation());
			System.out.println(empobj.getSalary());
			ois.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
