package com.thoughtworks.capability.gtb.restfulapidesign.db;

import com.thoughtworks.capability.gtb.restfulapidesign.model.Gender;
import com.thoughtworks.capability.gtb.restfulapidesign.model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataProvider {
    public static HashMap<Integer, Student> students = new HashMap();
    public static int idCount = 16;
    static {
        Student[] stu = new Student[151];
        stu[1] = new Student(1, "成吉思汗", Gender.MALE, "some notes");
        stu[2] = new Student(2, "鲁班七号", Gender.FEMALE, "some notes");
        stu[3] = new Student(3, "太乙真人", Gender.MALE, "some notes");
        stu[3] = new Student(4, "钟无艳", Gender.MALE, "some notes");
        stu[5] = new Student(5, "花木兰", Gender.MALE, "some notes");
        stu[6] = new Student(6, "雅典娜", Gender.MALE, "some notes");
        stu[7] = new Student(7, "芈月", Gender.MALE, "some notes");
        stu[8] = new Student(8, "白起", Gender.MALE, "some notes");
        stu[9] = new Student(9, "刘禅", Gender.MALE, "some notes");
        stu[10] = new Student(10, "庄周", Gender.MALE, "some notes");
        stu[11] = new Student(11, "马超", Gender.MALE, "some notes");
        stu[12] = new Student(12, "刘备", Gender.MALE, "some notes");
        stu[13] = new Student(13, "哪吒", Gender.MALE, "some notes");
        stu[14] = new Student(14, "大乔", Gender.MALE, "some notes");
        stu[15] = new Student(15, "蔡文姬", Gender.MALE, "some notes");

        for (int i = 1; i < idCount; i++) {
            students.put(i, stu[i]);
        }
    }
}
