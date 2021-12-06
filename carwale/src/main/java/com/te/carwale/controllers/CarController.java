package com.te.carwale.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CarController {

	@GetMapping("/home")
	public String home() {
		return "home";
}
}