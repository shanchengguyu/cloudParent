package com.pectera.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author James
 * @date 2021/6/4
 * @decription
 */
@RestController
@RequestMapping("/consumer/healthCheck")
public class HealthCheck {
	@GetMapping
	public String check(){
		return "welcome to consumer";
	}
}
