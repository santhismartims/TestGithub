package com.rest.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.demo.model.Student;

@RestController
public class StudentController {
	@RequestMapping("/students")
	public List<Student> getAllStudents() {
		List<Student> students = new ArrayList<>();
		students.add(new Student("lakshamana", "C"));
		students.add(new Student("Rama", "A"));
		students.add(new Student("Seeta", "B"));
		return students;
	}
}
