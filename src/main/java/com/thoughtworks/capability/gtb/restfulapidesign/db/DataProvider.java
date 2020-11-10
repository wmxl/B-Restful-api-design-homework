package com.thoughtworks.capability.gtb.restfulapidesign.db;

import com.thoughtworks.capability.gtb.restfulapidesign.model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataProvider {
    public static HashMap<Integer, Student> students = new HashMap();
    public static int idCount = 16;
    static {
        Student[] stu = new Student[15];
        stu[0] = new Student(1, "成吉思汗");
        stu[1] = new Student(2, "鲁班七号");
        stu[2] = new Student(3, "太乙真人");
        stu[3] = new Student(4, "钟无艳");
        stu[4] = new Student(5, "花木兰");
        stu[5] = new Student(6, "雅典娜");
        stu[6] = new Student(7, "芈月");
        stu[7] = new Student(8, "白起");
        stu[8] = new Student(9, "刘禅");
        stu[9] = new Student(10, "庄周");
        stu[10] = new Student(11, "马超");
        stu[11] = new Student(12, "刘备");
        stu[12] = new Student(13, "哪吒");
        stu[13] = new Student(14, "大乔");
        stu[14] = new Student(15, "蔡文姬");

        for (int i = 0; i < 15; i++) {
            students.put(i+1, stu[i]);
        }
    }
}
