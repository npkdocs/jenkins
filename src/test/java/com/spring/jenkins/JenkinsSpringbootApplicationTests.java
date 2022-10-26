package com.spring.jenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsSpringbootApplicationTests {
	static Logger logger = LoggerFactory.getLogger(JenkinsSpringbootApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("--------- Execute Test case -----------------");
		assertEquals(true, true);
	}

}
