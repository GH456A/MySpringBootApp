package com.jenkins.demo.MySprintBootApp;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MySprintBootAppApplicationTests {

	@Autowired
	MyAppController myAppController;
	
	@Test
	void contextLoads() {
		assertNotNull(myAppController);
	}

}
