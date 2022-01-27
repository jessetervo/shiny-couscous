package com.example.helloworld.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloController {
	@RequestMapping("/index")
	public String index() {
		return "This is the main page";
	}

	@RequestMapping("/contact")
	public String contact() {
		return "This is the contact page";
	}

	@RequestMapping("/hello")
	public String hello(@RequestParam(required=false, name= "moon" ) String location, @RequestParam(required=false, name= "John") String name) {
		return "Welcome to the " + location + name;
	}
}
