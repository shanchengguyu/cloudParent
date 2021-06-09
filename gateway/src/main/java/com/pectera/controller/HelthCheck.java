package com.pectera.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author James
 * @date 2021/6/7
 * @decription
 */
@RestController
@RequestMapping("/gateway/healthCheck")
public class HelthCheck {
	@GetMapping
	public String check(){
		return "welcome to gateway";
	}
}
