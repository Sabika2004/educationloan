package com.education.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.education.demo.model.LoginModel;
@Repository
public interface LoginRepository extends JpaRepository<LoginModel,Integer>{

}
