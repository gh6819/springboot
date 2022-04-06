package com.main.controller;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.main.service.MainService;

@Controller
public class MainController {
	
	@Autowired
	private MainService mainService;
	
	@RequestMapping("/")
	public String index() {
		mainService.getTest(new HashMap<String, Object>());
		return "index";
	}
	
	@RequestMapping("/hello.do")
	public String hello(HttpServletRequest request, HttpServletResponse response, Model model) {
		model.addAttribute("name", "YONGHO");
		return "/hello";
	}
}
