package com.cg.jen;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsPipelineDemoApplicationTests {

	@Test
	void contextLoads() {
		System.out.println("Hello Testing..");
		assertEquals(true,true);
	}

}
