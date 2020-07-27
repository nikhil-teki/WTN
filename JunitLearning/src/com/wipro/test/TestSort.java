package com.wipro.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wipro.task.DailyTasks;

public class TestSort {

	@Test
	public void testSortValues() {
		DailyTasks d=new DailyTasks();
		int[] input= {5,3,23,54,324,5,0,4,4};
		int[] expected= {0,3,4,4,5,5,23,54,324};
		int[] result=d.sortValues(input);
		assertArrayEquals(expected,result);
	}

}
