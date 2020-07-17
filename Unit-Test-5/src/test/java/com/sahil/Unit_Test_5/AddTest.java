package com.sahil.Unit_Test_5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AddTest {
	
    @BeforeEach
	void init()
	{
		Add obj;
	}
	@Test
	@DisplayName("Add method is calling")
	void testAdd() {
		int act=new Add().add(10, 20);
		int exp=30;
		assertEquals(exp, act,"It shoud add value");
		
	}

	@Test
	@Disabled
	void testDivide() {
		fail("Not yet implemented");
	}

	@Test
	@Disabled
	void testMultiply() {
		fail("Not yet implemented");
	}

}
