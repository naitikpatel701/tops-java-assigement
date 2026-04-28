package com.exmple.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.exmple.demo.model.User;
import com.exmple.demo.repo.RoleRepo;
import com.exmple.demo.repo.UserRepo;

@Controller

public class HomeController {

	 private final RoleRepo roleRepo;
		
		@Autowired
		UserRepo repo;
	
		@Autowired
		PasswordEncoder encoder;

 HomeController(RoleRepo roleRepo) {
     this.roleRepo = roleRepo;
 }
		
		@PostMapping("/adduser")
		public String adduser(@ModelAttribute("user") User user)
		{
			
			user.setPassword(encoder.encode(user.getPassword()));
			repo.save(user);
			return "redirect:reg";
		}
		
		@GetMapping("/admin")
		public String admin()
		{
			System.out.println("admin calling");
			return "admin calling";
		}
		
		@GetMapping("/user")
		public String user()
		{
			System.out.println("user calling");
			return "user calling";
		}

}
