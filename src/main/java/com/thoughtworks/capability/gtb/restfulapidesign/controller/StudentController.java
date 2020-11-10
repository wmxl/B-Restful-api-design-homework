package com.thoughtworks.capability.gtb.restfulapidesign.controller;

import com.thoughtworks.capability.gtb.restfulapidesign.service.StudentService;
import com.thoughtworks.capability.gtb.restfulapidesign.db.DataProvider;
import com.thoughtworks.capability.gtb.restfulapidesign.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("")
    public HashMap<Integer, Student> findAll(){
        HashMap<Integer, Student> list = studentService.findAll();
        return list;
    }

    @PostMapping("")
    public void addStudent(@RequestBody Student stu) {
        System.out.println(stu.getName());

        stu.setId(DataProvider.idCount);
        DataProvider.students.put(DataProvider.idCount++, stu);
    }
    @DeleteMapping("/{id}")
    public void deleteStudentById(@PathVariable("id") Integer id){
        studentService.deleteStudentById(id);
    }
}
