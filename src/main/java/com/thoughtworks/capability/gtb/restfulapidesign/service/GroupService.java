package com.thoughtworks.capability.gtb.restfulapidesign.service;

import com.thoughtworks.capability.gtb.restfulapidesign.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;

@Service
public class GroupService {

    public ArrayList<ArrayList<Student>> groupStudents(ArrayList<Student> stuList) {
        Collections.shuffle(stuList);
        return groupByNum(stuList, 6);
    }

    private ArrayList<ArrayList<Student>> groupByNum(ArrayList<Student> stuList, int num) {
        ArrayList<ArrayList<Student>> grpList = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            grpList.add(new ArrayList<Student>());
        }
        for (int i = 0; i < stuList.size(); i++) {
            grpList.get(i % num).add(stuList.get(i));
        }
        return grpList;
    }
}
