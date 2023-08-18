package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Color {
	
	private String color="Green";
	@GetMapping("color")
	public String display()
	{
		return "My favorite color is "+color;
	}

}
