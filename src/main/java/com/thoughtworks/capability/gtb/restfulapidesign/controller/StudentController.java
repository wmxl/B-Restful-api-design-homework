package com.thoughtworks.capability.gtb.restfulapidesign.controller;

import com.thoughtworks.capability.gtb.restfulapidesign.model.Gender;
import com.thoughtworks.capability.gtb.restfulapidesign.service.StudentService;
import com.thoughtworks.capability.gtb.restfulapidesign.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("")
    public ArrayList<Student> findAll(@RequestParam(required = false, name = "gender")  Gender gender){
        System.out.println(gender);
        System.out.println(studentService.findAll(gender));
        return studentService.findAll(gender);
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public void createStudent(@RequestBody Student stu) {
        studentService.createStudent(stu);
    }

    @PutMapping("{id}")
    public void updateStudent(@PathVariable("id") Integer id, @RequestBody Student stu){
        studentService.updateStudentById(id, stu);
    }

    @DeleteMapping("/{id}")
    public void deleteStudentById(@PathVariable("id") Integer id){
        studentService.deleteStudentById(id);
    }


    @GetMapping("/{id}")
    public Student findStudentById(@PathVariable("id") Integer id){
        return studentService.findStudentById(id);
    }
}
