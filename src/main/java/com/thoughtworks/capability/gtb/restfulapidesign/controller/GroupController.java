package com.thoughtworks.capability.gtb.restfulapidesign.controller;

import com.thoughtworks.capability.gtb.restfulapidesign.model.Student;
import com.thoughtworks.capability.gtb.restfulapidesign.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/group")
public class GroupController {

    private final StudentService studentService;

    public GroupController(StudentService studentService) {
        this.studentService = studentService;
    }


    @PostMapping("")
    public ArrayList<ArrayList<Student>> getGroup(
            @RequestParam(required = false, name = "regroup") boolean regroup){

        ArrayList<Student> stuList = studentService.findAll();

        ArrayList<ArrayList<Student>> grpList = new ArrayList<>();
        grpList.add(stuList);


        grpList = groupStudents();
        return grpList;
    }
}
