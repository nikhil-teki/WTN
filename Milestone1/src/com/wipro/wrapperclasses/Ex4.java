package com.wipro.wrapperclasses;

class Employee implements Cloneable
{
	private String name;
	private int empId;
	private String dept;
	private double salary;
	public Employee clone() throws CloneNotSupportedException
	{
		return (Employee)super.clone();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
public class Ex4 {

	public static void main(String[] args) throws CloneNotSupportedException{
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		emp.setName("Nikhil");
		emp.setEmpId(123456);
		emp.setDept("R&D");
		emp.setSalary(123456);
		System.out.println(emp);
		System.out.println(emp.getName()+" "+emp.getEmpId()+" "+emp.getDept()+" "+emp.getSalary());
		Employee empClone=emp.clone();
		System.out.println(empClone);
		System.out.println(empClone.getName()+" "+empClone.getEmpId()+" "+empClone.getDept()+" "+empClone.getSalary());
		emp.setName("Nikhil Teki");
		emp.setEmpId(1234567);
		emp.setDept("D&D");
		emp.setSalary(1234567);
		System.out.println(emp);
		System.out.println(emp.getName()+" "+emp.getEmpId()+" "+emp.getDept()+" "+emp.getSalary());
		System.out.println(empClone);
		System.out.println(empClone.getName()+" "+empClone.getEmpId()+" "+empClone.getDept()+" "+empClone.getSalary());
	}

}
