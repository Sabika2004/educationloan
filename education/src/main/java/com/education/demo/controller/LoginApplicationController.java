package com.education.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.education.demo.model.LoginApplicationModel;
import com.education.demo.service.LoginApplicationService;

import io.swagger.v3.oas.annotations.tags.Tag;
@CrossOrigin("*")
@RestController
public class LoginApplicationController {
	@Autowired
	LoginApplicationService laser;
	@Tag(name="Get",description="get loginapp")
	@GetMapping("/getloginapp")
	public List<LoginApplicationModel>getAllDetails()
	{
		return laser.getAllDetails();
	}
	@Tag(name="Post",description="post loginapp")
	@PostMapping("/postloginapp")
	public String saveapp(@RequestBody LoginApplicationModel id)
	{
		laser.saveapp(id);
		return "saved";
	}
	@Tag(name="Put",description="put loginapp")
	@PutMapping("/putloginapp")
	public String updateapp(@RequestBody LoginApplicationModel id)
	{
		laser.updateapp(id);
		return "updated";
		
	}
	@Tag(name="Delete",description="delete loginapp")
	@DeleteMapping("/deleteloginapp/{id}")
	public String deleteapp(@PathVariable int id)
	{
		laser.deleteById(id);
		return "deleted";
	}

}
