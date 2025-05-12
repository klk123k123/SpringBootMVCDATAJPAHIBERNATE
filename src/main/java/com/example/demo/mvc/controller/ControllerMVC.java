package com.example.demo.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.mvc.Entity.Customer;
import com.example.demo.mvc.repository.Customerrepo;

@Controller
public class ControllerMVC {
	@Autowired
	Customerrepo repo;
	@GetMapping(value="/")
	public String getMethod()
	{
		return "home.jsp";
	}
	@PostMapping("/addCustomer")
	//public String postThedetails(@RequestParam String firstName,@RequestParam String lastName,@RequestParam String email,Model model)
	//{
		public String postThedetails(@ModelAttribute("customer") Customer data,Model model)
		{
		/*
		 * model.addAttribute("firstName",firstName);
		 * 
		 * model.addAttribute("lastName",lastName); model.addAttribute("email",email);
		 */
		
		
		 repo.save(data);
		System.out.println("Successfully triggered !..");
		return "success.jsp";
	

/* @PostMapping("/addCustomer")
public String postThedetails(@ModelAttribute("customer") Customer data, Model model) {
repo.save(data);
return "success.jsp";*/
}
}

