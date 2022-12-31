package com.sutek.happynewyear2023codespace.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HappyNewYear2023Controller {
	@GetMapping(value="/happynewyear2023")
	public String happyNewYear2023() {
		return "Happy New Year 2023!";
	}
}
