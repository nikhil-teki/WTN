package com.wipro.collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeDB {
	ArrayList<Employee> list=new ArrayList<>();
	boolean addEmployee(Employee e)
	{
		return list.add(e);
	}
	boolean deleteEmployee(int empId)
	{
		Iterator<Employee> itr=list.iterator();
		Employee deletedEmp=null;
		while(itr.hasNext())
		{
			Employee emp=itr.next();
			if(emp.empId==empId)
			{
				deletedEmp=emp;
				break;
			}
		}
		return list.remove(deletedEmp);
	}
	String showPaySlip(int empId)
	{
		Iterator<Employee> itr=list.iterator();
		Employee requiredEmp=null;
		while(itr.hasNext())
		{
			Employee emp=itr.next();
			if(emp.empId==empId)
			{
				requiredEmp=emp;
				break;
			}
		}
		if(requiredEmp!=null)
		{
			return "EmpId : "+requiredEmp.empId+" EmpName : "+requiredEmp.empName+" Email : "+requiredEmp.email+" Gender : "+requiredEmp.gender+" Salary : "+requiredEmp.salary;
		}
		else
			return "404 : Employee Not Found";
	}
}
