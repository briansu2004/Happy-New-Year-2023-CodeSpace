package com.sutek.happynewyear2023codespace.controller;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HappyNewYear2023ControllerTest {

	@BeforeEach
	void setUp() {
	}

	@Test
	void shouldSayHappyNewYear2023() {
		HappyNewYear2023Controller happy = new HappyNewYear2023Controller();
		Assertions.assertEquals("Happy New Year 2023!", happy.happyNewYear2023());
	}

	@AfterEach
	void tearDown() {
	}
}