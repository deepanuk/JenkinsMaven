package com.deepan.learning.jenkins;

import static org.junit.Assert.*;
import org.testng.annotations.Test;

public class JenkinsCalFuncationTest {

	@Test
	public void testAdd() {
		JenkinsCalFuncation jc = new JenkinsCalFuncation();
		assertEquals(10, jc.addNumbers(5, 5));
	}

	@Test
	public void testSubtract() {
		JenkinsCalFuncation jc = new JenkinsCalFuncation();
		assertEquals(0, jc.subtractNumbers(5, 5));
	}

}
