package com.thoughtworks.capability.gtb.restfulapidesign.service;

import com.thoughtworks.capability.gtb.restfulapidesign.db.DataProvider;
import com.thoughtworks.capability.gtb.restfulapidesign.exception.StudentNotExistException;
import com.thoughtworks.capability.gtb.restfulapidesign.model.Gender;
import com.thoughtworks.capability.gtb.restfulapidesign.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class StudentService {
    public ArrayList<Student> findAll(Gender gender){
        ArrayList<Student> resList = new ArrayList<>();
        HashMap<Integer,Student> map = DataProvider.students;
        if(gender != null){
            System.out.println(gender);
            for (Student stu: map.values()) {
                if(stu.getGender() == gender){
                    resList.add(stu);
                }
            }
        }else {
            resList = new ArrayList<>(map.values());
        }
        return resList;
    }

    public ArrayList<Student> findAll(){
        return new ArrayList<>(DataProvider.students.values());
    }

    public void deleteStudentById(Integer id) {
        if(!DataProvider.students.containsKey(id)){
            throw new StudentNotExistException("The student you try to delete not exist");
        }
        DataProvider.students.remove(id);
    }

    public Student findStudentById(Integer id) {
        if(!DataProvider.students.containsKey(id)){
            throw new StudentNotExistException("The student you try to find not exist");
        }
        return DataProvider.students.get(id);
    }

    public void createStudent(Student stu) {
        stu.setId(DataProvider.idCount);
        DataProvider.students.put(DataProvider.idCount++, stu);
    }

    public void updateStudentById(Integer id, Student stu) {
        if(!DataProvider.students.containsKey(id)){
            throw new StudentNotExistException("The student you try to update not exist");
        }
        DataProvider.students.put(id, stu);
    }
}
