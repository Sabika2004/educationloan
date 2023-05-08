package com.education.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.education.demo.model.LoginModel;
import com.education.demo.service.LoginService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
public class LoginController {
	
	@Autowired
	LoginService loservice;
	@Tag(name="Get",description="get details")
	@GetMapping("/getyourlogin")
	public List<LoginModel>getAllinfo()
	{
		return loservice.getAllinfo();
	}
	@Tag(name="Post",description="post details")
	@PostMapping("/postyourlogin")
	public String saveyourdetails(@RequestBody LoginModel id)
	{
		loservice.saveyourdetails(id);
		return "saved";
	}
	@Tag(name="Put",description="put details")
	@PutMapping("/putyourlogin")
	public String edityourdetails(@RequestBody LoginModel id)
	{
		loservice.edityourdetails(id);
		return "edited";
	}
	@Tag(name="Delete",description="delete details")
	@DeleteMapping("/deleteyourlogin/{id}")
	public String deleteloginById(@PathVariable int id)
	{
		loservice.deleteloginById(id);
		return "deleted";
	}

}
