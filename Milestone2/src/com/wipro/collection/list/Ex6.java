package com.wipro.collection.list;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> months=new Vector<>();
		months.add("January");
		months.add("February");
		months.add("March");
		months.add("April");
		months.add("May");
		months.add("June");
		months.add("July");
		months.add("August");
		months.add("September");
		months.add("October");
		months.add("November");
		months.add("December");
		Iterator<String> itr=months.iterator();
		while(itr.hasNext())
		System.out.println(itr.next());
	}

}
