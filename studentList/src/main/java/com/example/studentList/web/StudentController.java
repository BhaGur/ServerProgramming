package com.example.studentList.web;

import java.util.ArrayList;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.studentList.domain.Student;

@Controller
public class StudentController {
	
	@RequestMapping("/hello")
	public String listStudents(Student student, Model model) {
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("Kate", "Call"));
		students.add(new Student("Dan", "Brown"));
		students.add(new Student("Mike", "Mars"));

		model.addAttribute("students", students);
		return "studentList";
	}
}
