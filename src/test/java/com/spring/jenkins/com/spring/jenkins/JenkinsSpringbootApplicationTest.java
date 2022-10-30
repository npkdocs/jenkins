/**
 * 
 */
package com.spring.jenkins.com.spring.jenkins;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author npk61
 *
 */
class JenkinsSpringbootApplicationTest {

	static Logger logger = LoggerFactory.getLogger(JenkinsSpringbootApplicationTest.class);
	
	@Test
	void test() {
		logger.info("--------- Execute Test case -----------------");
		assertEquals(true, true);
	}

}
