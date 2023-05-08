package com.education.demo.serviceinterface;

import java.util.List;

import com.education.demo.model.EducationModel;

public interface EducationServiceInterface {
	
	
	public EducationModel postdetails(EducationModel id);
	public List<EducationModel>fetchAll();
	public EducationModel saveAll(int id);
	public void deleteById(int id);

}
