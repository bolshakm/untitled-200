package com.custom.phone.remover.controller;

import com.custom.phone.remover.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
public class AppController {
	@Autowired
	private AppService appService;

	@GetMapping("/index")
	public String getMainPage(HttpSession session, Model model){
		String param = (String)session.getAttribute("param");

		model.addAttribute("param", param);
		return "index";
	}

	@PostMapping("/action")
	public String action(@RequestParam String param, Model model, HttpSession session){
		appService.doGet();
		return "result";
	}

	@GetMapping("/die")
	public void die(){
		System.exit(1);
	}
}
