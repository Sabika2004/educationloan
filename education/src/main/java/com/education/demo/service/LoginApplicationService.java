package com.education.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.education.demo.model.LoginApplicationModel;
import com.education.demo.repository.LoginApplicationRepository;

@Service
public class LoginApplicationService {
	
	@Autowired
	LoginApplicationRepository larep;
	//get
	public List<LoginApplicationModel>getAllDetails()
	{
		return larep.findAll();
	}
	//post
	public LoginApplicationModel saveapp(@RequestBody LoginApplicationModel id)
	{
		return larep.save(id);
	}
	//put
	public LoginApplicationModel updateapp(LoginApplicationModel id)
	{
		return larep.save(id);
	}
	//delete
	public void deleteById(@PathVariable int id)
	{
		larep.deleteById(id);
	}

}
