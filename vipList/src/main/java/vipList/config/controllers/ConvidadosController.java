package vipList.config.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ConvidadosController {
	
	private static final String INDEX = "index";
	
	@RequestMapping("/")
	public String getIndexPage() {
		return INDEX;
	}
	
}