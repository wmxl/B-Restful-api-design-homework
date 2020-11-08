package com.thoughtworks.capability.gtb.restfulapidesign.controller;

import com.thoughtworks.capability.gtb.restfulapidesign.service.StudentService;
import com.thoughtworks.capability.gtb.restfulapidesign.db.DataProvider;
import com.thoughtworks.capability.gtb.restfulapidesign.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("")
    public List<Student> findAll(){
        List<Student> list = studentService.findAll();
        return list;
    }

    @PostMapping("")
    public void addStudent(@RequestBody Student stu) {
        System.out.println(stu.getName());
        int id = DataProvider.students.size();
        DataProvider.students.add(new Student(id+1, stu.getName()));
    }
}
