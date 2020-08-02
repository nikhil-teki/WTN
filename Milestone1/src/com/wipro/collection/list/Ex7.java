package com.wipro.collection.list;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Vector;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> list=new Vector<>();
		Employee emp1=new Employee();
		emp1.empId=123456;
		emp1.empName="Azim Premji";
		emp1.email="azmprmji@wipro.in";
		emp1.gender="Male";
		emp1.salary=500000000;
		list.add(emp1);
		Employee emp2=new Employee();
		emp2.empId=123457;
		emp2.empName="Mrs.Premji";
		emp2.email="mrsprmji@wipro.in";
		emp2.gender="Female";
		emp2.salary=400000000;
		list.add(emp2);
		Employee emp3=new Employee();
		emp3.empId=123458;
		emp3.empName="CEO";
		emp3.email="wiproceo@wipro.in";
		emp3.gender="Male";
		emp3.salary=150000000;
		list.add(emp3);
		System.out.println("Printing using Iterator :");
		Iterator<Employee> itr=list.iterator();
		try
		{
			while(itr.hasNext())
			{
				Employee emp=itr.next();
				System.out.println(emp);
				emp.getEmployeeDetails();
			}
			System.out.println();
			System.out.println("Printing using Enumeration :");
			Enumeration<Employee> e=Collections.enumeration(list);
			while(e.hasMoreElements())
			{
				Employee emp=e.nextElement();
				System.out.println(emp);
				emp.getEmployeeDetails();
			}
		}
		catch(NoSuchElementException e)
		{
			e.printStackTrace();
			System.out.println(e);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e);
		}
	}

}
