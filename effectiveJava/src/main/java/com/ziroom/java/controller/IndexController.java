package com.ziroom.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class IndexController {
	
	@RequestMapping("/index")
	public String index(){
		return "welcome to paul's home";
	}

}
