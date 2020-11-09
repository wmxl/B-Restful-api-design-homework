package com.thoughtworks.capability.gtb.restfulapidesign.service;


import com.thoughtworks.capability.gtb.restfulapidesign.db.DataProvider;
import com.thoughtworks.capability.gtb.restfulapidesign.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    public List<Student> findAll(){
        return DataProvider.students;
    }

    public void deleteStudentById(Integer id) {

        DataProvider.students.remove(id);
    }
}
