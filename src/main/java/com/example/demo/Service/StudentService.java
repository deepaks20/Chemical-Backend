package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.StudentEntity;
import com.example.demo.Repository.StudentRepo;
@Service
public class StudentService {
	@Autowired //extends another class
    StudentRepo stRepo; //reference variable
	
	public StudentEntity saveDetails(StudentEntity e) {
		return stRepo.save(e);
	}
	public List<StudentEntity> getDetails(){
		return stRepo.findAll();
	}
	public StudentEntity updateDetails(StudentEntity e1) {
		return stRepo.saveAndFlush(e1);
	}
	public void deleteDetails(int id)
	{
		stRepo.deleteById(id);
	}
}