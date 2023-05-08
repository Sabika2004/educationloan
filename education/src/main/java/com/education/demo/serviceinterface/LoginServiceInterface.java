package com.education.demo.serviceinterface;

import java.util.List;

import com.education.demo.model.LoginModel;

public interface LoginServiceInterface {
         public List<LoginModel>getAllinfo();
         public LoginModel postyourdetails(LoginModel id);
         public LoginModel edityourdetails(LoginModel id);
         public void deleteloginById(LoginModel id);
         
         
}
