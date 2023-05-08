package com.education.demo.serviceinterface;

import java.util.List;

import com.education.demo.model.LoginApplicationModel;

public interface LoginApplicationServiceInterface {
	
	public List<LoginApplicationModel> getAllDetails();
	public LoginApplicationModel saveapp(LoginApplicationModel id);
	public LoginApplicationModel updateapp(LoginApplicationModel id);
	public void deleteById(int id);
	

}
