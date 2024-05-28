package com.Phu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HellloWord {

	@GetMapping("/index")
	public String index(Model model) {
		model.addAttribute("message", "biết ơn 1 ngày tốt lành!");
		return "index"; 
	}
}
