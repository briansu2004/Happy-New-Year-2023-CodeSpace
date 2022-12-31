package com.sutek.happynewyear2023codespace.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HappyNewYear2023Controller {
	@GetMapping(value="/")
	public String happyNewYear2023() {
		return "Happy New Year 2023!";
	}
}
