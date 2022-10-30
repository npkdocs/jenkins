package com.spring.jenkins;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class JenkinsSpringbootApplicationTest {
	
	static Logger logger = LoggerFactory.getLogger(JenkinsSpringbootApplicationTest.class);

	@Test
	void testInit() {
		logger.info("--------- Execute Test case -----------------");
		assertEquals(true, true);
	}

	@Test
	void testMain() {
		logger.info("--------- Execute Test case -----------------");
		assertEquals(true, true);
	}
	
}
