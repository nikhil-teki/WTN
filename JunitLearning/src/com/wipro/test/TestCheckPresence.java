package com.wipro.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.wipro.task.DailyTasks;

public class TestCheckPresence {

	@Test
	public void testCheckPresence() {
		DailyTasks d=new DailyTasks();
		String str="Wipro Talent Next";
		String a="Talent";
		assertTrue(d.checkPresence(str, a));
	}
	@Test
	public void testCheckPresence1() {
		DailyTasks d=new DailyTasks();
		String str="Wipro Talent Next";
		String a="Future Skills";
		assertFalse(d.checkPresence(str, a));
	}
}
