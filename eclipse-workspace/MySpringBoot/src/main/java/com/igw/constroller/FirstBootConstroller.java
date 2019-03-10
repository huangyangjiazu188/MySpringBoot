package com.igw.constroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class FirstBootConstroller {
	
	
	
	
	@RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!开始";
    }
	
	
}
