package com.education.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.education.demo.model.LoginModel;
import com.education.demo.repository.LoginRepository;

@Service
public class LoginService {
	@Autowired
	LoginRepository lorepo;
	//get
	public List<LoginModel>getAllinfo()
	{
		return lorepo.findAll();
	}
	//post
	public LoginModel saveyourdetails(@RequestBody LoginModel id)
	{
		return lorepo.save(id);
	}
	//put
	public LoginModel edityourdetails(@RequestBody LoginModel id)
	{
		return lorepo.save(id);
	}
	//delete
	public void deleteloginById(@PathVariable int id)
	{
		 lorepo.deleteById(id);
	}

}
