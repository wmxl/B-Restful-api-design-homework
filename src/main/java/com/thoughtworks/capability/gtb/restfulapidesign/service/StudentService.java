package com.thoughtworks.capability.gtb.restfulapidesign.service;


import com.thoughtworks.capability.gtb.restfulapidesign.db.DataProvider;
import com.thoughtworks.capability.gtb.restfulapidesign.exception.StudentNotExistException;
import com.thoughtworks.capability.gtb.restfulapidesign.model.Student;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class StudentService {
    public HashMap<Integer, Student> findAll(){
        return DataProvider.students;
    }

    public void deleteStudentById(Integer id) {
        if(!DataProvider.students.containsKey(id)){
            throw new StudentNotExistException("The student you delete not exist");
        }
        DataProvider.students.remove(id);
    }
}
