package com.orderItems.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/save")
public class OrdderDetailsController {
	@RequestMapping(value = "/orderdetail",method = RequestMethod.GET)
	public String view() {
		return "hello";
	}
}
