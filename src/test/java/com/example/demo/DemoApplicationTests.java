package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
class DemoApplicationTests {
	@BeforeEach
	void setUp()
	{
		log.info("run before each test case");
	}
	@AfterEach
	void tearDown()
	{
		log.info("tearing down method,run after each test case");
	}
	@BeforeAll
	static void setUpOnce()
	{
		log.info("run before all test case");
	}
	@AfterAll
	static void tearDownAll()
	{
		log.info("tearing down method,run all each test case");
	}
	@Test
	@DisplayName("Test")
	void Test1() {
		int a=number(5);
		Assertions.assertEquals(5,5);
		assertThat("Apple").matches("a");
		//log.info("test1 is run");
	}

	int number(int num){
		return num+num;
	}
}
