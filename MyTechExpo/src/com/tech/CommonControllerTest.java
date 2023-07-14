package com.tech;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CommonControllerTest {
	
	CommonController controller = new CommonController();
	
	@Test
	void test() {
		assertEquals(100, controller.sum(40, 50));
	}

}
