package com.springboot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping; 

@Controller
public class MainController {

	@RequestMapping("/")
	public String home()
	{
		System.out.println("this is home page");
		return "home";
	}
}
