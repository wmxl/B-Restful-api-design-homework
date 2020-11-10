package com.thoughtworks.capability.gtb.restfulapidesign.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Group {
    Integer id;
    String name;
    ArrayList<Student> stuList;

    public Group(String grpName, ArrayList<Student> stuList) {
        this.name = grpName;
        this.stuList = stuList;
    }
}
