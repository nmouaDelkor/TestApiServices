package com.delkor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.delkor.service.TaskService;

/**
 * This Controller maps WEB VIEW calls.
 * 
 * Use the @Controller annotation to mark the class as a WEB VIEW Controller.
 * Autowire all of your Service classes here, and map them to the appropriate
 * page.
 * 
 * @author nmoua
 *
 */
@Controller
public class WebController {

	@Autowired
	private TaskService taskService;

	@GetMapping("/")
	public String home() {
		return "index";
//		return taskService.findAll();
	}

	@GetMapping("/error")
	public String errorPage() {
		return "error";
	}

}
