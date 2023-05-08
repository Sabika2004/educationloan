package com.education.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.education.demo.model.LoginApplicationModel;

public interface LoginApplicationRepository extends JpaRepository<LoginApplicationModel,Integer>{

}
