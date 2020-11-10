package com.thoughtworks.capability.gtb.restfulapidesign.controller;

import com.thoughtworks.capability.gtb.restfulapidesign.db.DataProvider;
import com.thoughtworks.capability.gtb.restfulapidesign.model.Group;
import com.thoughtworks.capability.gtb.restfulapidesign.model.Student;
import com.thoughtworks.capability.gtb.restfulapidesign.service.GroupService;
import com.thoughtworks.capability.gtb.restfulapidesign.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/group")
public class GroupController {

    private final GroupService groupService;

    public GroupController( GroupService groupService) {
        this.groupService = groupService;
    }

    @PostMapping("")
    public ArrayList<Group> getGroup(@RequestParam(required = false, name = "regroup") boolean regroup){
        return groupService.groupStudents(regroup);
    }

    @PutMapping("{id}")
    public void updateStudent(@PathVariable("id") Integer id, @RequestParam(name = "name") String name){
        groupService.updateGroupById(id, name);
    }
}
