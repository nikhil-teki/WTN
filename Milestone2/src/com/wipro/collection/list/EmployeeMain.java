package com.wipro.collection.list;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDB DB=new EmployeeDB();
		Employee emp1=new Employee();
		emp1.empId=123456;
		emp1.empName="Azim Premji";
		emp1.email="azmprmji@wipro.in";
		emp1.gender="Male";
		emp1.salary=500000000;
		emp1.getEmployeeDetails();
		if(DB.addEmployee(emp1))
		    System.out.println("Added");
		else
			System.out.println("Couldn't add");
		System.out.println("Payslip : "+DB.showPaySlip(emp1.empId));
		Employee emp2=new Employee();
		emp2.empId=123457;
		emp2.empName="Mrs.Premji";
		emp2.email="mrsprmji@wipro.in";
		emp2.gender="Female";
		emp2.salary=400000000;
		emp2.getEmployeeDetails();
		if(DB.addEmployee(emp2))
		    System.out.println("Added");
		else
			System.out.println("Couldn't add");
		System.out.println("Payslip : "+DB.showPaySlip(emp2.empId));
		Employee emp3=new Employee();
		emp3.empId=123458;
		emp3.empName="CEO";
		emp3.email="wiproceo@wipro.in";
		emp3.gender="Male";
		emp3.salary=150000000;
		emp3.getEmployeeDetails();
		if(DB.addEmployee(emp3))
		    System.out.println("Added");
		else
			System.out.println("Couldn't add");
		System.out.println("Payslip : "+DB.showPaySlip(emp3.empId));
		System.out.println("Deleting "+emp3.empId);
		if(DB.deleteEmployee(emp3.empId))
			System.out.println("Deleted "+emp3.empId);
		else
			System.out.println(emp3.empId+" not found");
		System.out.println("Payslip : "+emp3.empId+" "+DB.showPaySlip(emp3.empId));
		System.out.println("Deleting "+emp3.empId);
		if(DB.deleteEmployee(emp3.empId))
			System.out.println("Deleted "+emp3.empId);
		else
			System.out.println(emp3.empId+" not found");
	}

}
