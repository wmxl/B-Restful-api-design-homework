package com.thoughtworks.capability.gtb.restfulapidesign.model;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    int id;
    String name;
    Gender gender;

    public Student(String name, Gender gender, String note) {
        this.name = name;
        this.gender = gender;
        this.note = note;
    }

    String note;
}

