package com.example.java;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

	@Test
	public void test() {
		int selection = Main.selectionMenu();
		boolean isClient = false; 
		if (selection == 1) {
			isClient = true;
		} else {
			isClient = false;
		}
		
		assertEquals(true, isClient);
	}

}
