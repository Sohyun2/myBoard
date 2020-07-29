package board.lsh.z.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import board.lsh.z.service.TestService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class MainController {
	
	@Autowired
	TestService service;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {		
		System.out.println("MainController.index()");
		
		service.test();
		
		return "index";
	}
	
}
