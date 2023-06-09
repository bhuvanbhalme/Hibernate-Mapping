// StudentInformationController.java

package com.cglia.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cglia.student.entity.StudentInformation;
import com.cglia.student.service.StudentInformationService;

@RestController
public class StudentInformationController {

	@Autowired
	private StudentInformationService service;

	@PostMapping("/save/studentInformation/result")
	public String saveStudent(@RequestBody StudentInformation studentDTO) {
		StudentInformation newStd=service.saveStudentInformation(studentDTO);
		String message;
	    if (newStd != null) {
	        message = "Student information saved successfully.";
	    } else {
	        message = "Failed to save student information.";
	    }
	    return message;
	}


	@GetMapping("/getAllStudentInformation/mark")
	public List<StudentInformation> getAll() {
		return service.getAllStudentInformation();
	}
}
