package com.education.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.education.demo.model.EducationModel;
import com.education.demo.repository.EducationRepository;

@Service
public class EducationService {
	
	 @Autowired
      EducationRepository erep;
	 //post
	public EducationModel postDetails(EducationModel id) {
		return erep.save(id);
	}
    //getall
	public List<EducationModel>fetchAll()
	{
		return erep.findAll();
	}
	//getbyid
	public EducationModel getAlldetailsById(@PathVariable int id)
	{
		return erep.findById(id).orElse(null);
	}
	//deleteid
	public void deleteById(@PathVariable int id)
	{
		  erep.deleteById(id);
	}
}
