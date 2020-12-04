package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.model.Student;
import com.student.service.StudentServiceImpl;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:4200")
public class StudentController {

	@Autowired
	private StudentServiceImpl service;

	@GetMapping("/student/all")
	public ResponseEntity<?> getStudentList() {
		List<Student> studnetList = service.getStudentList();
		return new ResponseEntity<Object>(studnetList, HttpStatus.OK);
	}
}
