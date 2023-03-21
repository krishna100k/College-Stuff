package com.mit.main.controller;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mit.main.model.Student;
import com.mit.main.service.HomeService;

@Controller
public class HomeController {
	
	@Autowired
	HomeService hs;
	
	@RequestMapping(value = "/")
	public String preLogin() {
		System.out.println("Open Login Page");
		return "login";
	}
	
	@RequestMapping(value = "/registration")
	public String preRegister() {
		System.out.println("Open Registration Page");
		return "registration";
	}
	
	@RequestMapping(value = "/reg")
	public String regData(@ModelAttribute Student s) {
//		System.out.println(s.getSid());
//		System.out.println(s.getName());
//		System.out.println(s.getUsername());
//		System.out.println(s.getPassword());
		
		hs.saveData(s);
		return "login";
	}
	
	@RequestMapping(value = "/login")
	public String login(@ModelAttribute Student s, Model m) {
		Student stu = hs.logincheck(s.getUsername(), s.getPassword());
		if(stu!=null) {
			Iterable data = hs.displayAllData();
			m.addAttribute("data",data);
			return "success";
		}
		else {
			return "login";
		}
		
	}

}
