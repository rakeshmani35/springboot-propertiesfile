package com.javacode.api.controller;

import com.javacode.api.config.StudentConfig;
import com.javacode.api.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class StudentController {


    @Autowired
    private StudentConfig studentConfig;

    @GetMapping("/students")
    public List<Student> getStudents() {
        List<Student> students = studentConfig.getStudents();
        System.out.print(students);
        return students;
    }
}
