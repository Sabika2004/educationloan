package com.education.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="UserModel")
public class EducationModel {
	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 private int id;
	 private String email;
	 private String password;
	 private String username;
	 private String mobilenumber;
	 private String userloan;
	
	 
	 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getUserloan() {
		return userloan;
	}
	public void setUserloan(String userloan) {
		this.userloan = userloan;
	}
	
	 

}
