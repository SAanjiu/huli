package com.gz.mbuy.smm.servlet;import org.springframework.stereotype.Controller;import org.springframework.web.bind.annotation.RequestMapping;import org.springframework.web.bind.annotation.RequestMethod;import javax.servlet.http.HttpServletRequest;@Controllerpublic class HelloController {		@RequestMapping(value = "/hello", method = RequestMethod.GET)	public String hello(HttpServletRequest request) {		request.setAttribute("name", "gouzi");		return "/hello.jsp";	}}