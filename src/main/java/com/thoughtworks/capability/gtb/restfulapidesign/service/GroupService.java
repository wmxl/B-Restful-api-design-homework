package com.thoughtworks.capability.gtb.restfulapidesign.service;

import com.thoughtworks.capability.gtb.restfulapidesign.db.DataProvider;
import com.thoughtworks.capability.gtb.restfulapidesign.exception.GroupNotExistException;
import com.thoughtworks.capability.gtb.restfulapidesign.exception.StudentNotExistException;
import com.thoughtworks.capability.gtb.restfulapidesign.model.Group;
import com.thoughtworks.capability.gtb.restfulapidesign.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;

@Service
public class GroupService {

    private final StudentService studentService;

    public GroupService(StudentService studentService) {
        this.studentService = studentService;
    }

    public ArrayList<Group> groupStudents(boolean regroup) {
        if(!regroup) return DataProvider.groups;
        ArrayList<Student> stuList = studentService.findAll();
        DataProvider.groups = groupByNum(stuList, 6);
        return DataProvider.groups;
    }

    private ArrayList<Group> groupByNum(ArrayList<Student> stuList, int num) {
        Collections.shuffle(stuList);
        ArrayList<Group> grpList = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            String grpName = (i+1) + " 组";
            grpList.add(new Group(i, grpName, new ArrayList<Student>()));
        }
        for (int i = 0; i < stuList.size(); i++) {
            grpList.get(i % num).getStuList().add(stuList.get(i));
        }
        return grpList;
    }

    public void updateGroupById(Integer id, String name) {
        if(id > DataProvider.groups.size()){
            throw new GroupNotExistException("group doesn't exist");
        }
        DataProvider.groups.get(id).setName(name);
    }
}
