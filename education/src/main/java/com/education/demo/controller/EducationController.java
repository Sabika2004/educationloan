package com.education.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.education.demo.model.EducationModel;
import com.education.demo.service.EducationService;

import io.swagger.v3.oas.annotations.tags.Tag;

@CrossOrigin("*")
@RestController
public class EducationController {
	
	
	@Autowired
     EducationService es;
	@Tag(name="Post",description="post login")
	@PostMapping("/postedu")
	public String postDetails(@RequestBody EducationModel id) {
		
		es.postDetails(id);
		return "saved";
	}
	@Tag(name="Get",description="get login")
	@GetMapping("/getedu")
	public List<EducationModel>fetchAll()
	{
		return es.fetchAll();
	}
	@Tag(name="Get",description="get login")
    @GetMapping("/getedu/{id}")
    public EducationModel saveAll(@PathVariable int id)
    {
    	return es.getAlldetailsById(id);
    }
	@Tag(name="Delete",description="delete login")
    @DeleteMapping("/deleteedu/{id}")
    public String delete(@PathVariable int id)
    {
      es.deleteById(id);
      return "deleted";
    }
}
