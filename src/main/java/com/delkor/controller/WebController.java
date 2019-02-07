package com.delkor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.delkor.service.StudentService;

/**
 *
 */
@Controller
public class WebController {

	@Autowired
	private StudentService taskService;

	@GetMapping("/")
	public String home() {
		return "index";
	}


}
