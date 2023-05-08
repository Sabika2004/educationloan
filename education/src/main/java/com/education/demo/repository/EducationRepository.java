package com.education.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.education.demo.model.EducationModel;

public interface EducationRepository extends JpaRepository<EducationModel,Integer>{

}
