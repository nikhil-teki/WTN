package com.wipro.collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex3 {
	public void printAll(ArrayList<String>list)
	{
		Iterator<String> itr=list.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<>();
		list.add("Wipro");
		list.add("Talent");
		list.add("Next");
		list.add("5.0");
		Ex3 ex3=new Ex3();
		ex3.printAll(list);
	}

}
