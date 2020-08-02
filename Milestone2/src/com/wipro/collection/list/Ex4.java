package com.wipro.collection.list;

import java.util.ArrayList;

@SuppressWarnings("serial")
class NumberArrayList<E> extends ArrayList<E>
{
	public boolean add(E e)
	{
		if((e instanceof Byte)||(e instanceof Integer)||(e instanceof Float)||(e instanceof Double))
		{
			return super.add(e);
		}
		else
			return false;
	}
}
public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> list=new NumberArrayList<>();
		System.out.println("Added successfully: "+list.add(Byte.MAX_VALUE));
		System.out.println("Added successfully: "+list.add(100));
		System.out.println("Added successfully: "+list.add(3.1415f));
		System.out.println("Added successfully: "+list.add(3.141592653589793238462643383279));
		System.out.println("Added successfully: "+list.add("I am a String. May I come in please?"));
		System.out.println("The list : "+list);
	}

}
