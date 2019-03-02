package com.vienmv.fptLibrary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	@GetMapping(value="/index")
	public String index() {
		return "user/index";
	}

}
