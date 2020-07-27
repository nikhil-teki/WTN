package com.wipro.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wipro.task.DailyTasks;

public class TestStringConcat {

	@Test
	public void testDoStringConcat() {
		DailyTasks d=new DailyTasks();
		String s1="Hello";
		String s2="World!!";
		String result=s1+" "+s2;
		assertEquals(result,d.doStringConcat(s1,s2));
	}

}
