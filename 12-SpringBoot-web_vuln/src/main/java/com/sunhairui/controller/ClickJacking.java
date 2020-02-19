package com.sunhairui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ClickJacking {
	
	@GetMapping("/clickjacking")
	public String clickjacking() {
		return "clickjacking.html";
	}
	
	@RequestMapping("/toLogin")
	@ResponseBody
	public String toLogin (String username,String password) {
		if ("admin".equals(username) && "admin".equals(password)) {
			return "Welcome, admin!";
		}
		return "your login is wrong";
	}
}
