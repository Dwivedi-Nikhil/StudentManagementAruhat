package com.aruhat.student1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")


public class Controller {

    @Autowired
    Service studentService;

    @PostMapping("add")
    public String addStudent(@RequestBody() Student student){

        return studentService.addStudent(student);
    }

    @PutMapping("edit")
    public String editStudent(@RequestBody() Student student){

        return studentService.editStudent(student);
    }

    @GetMapping("list")
    public List<Student> getStudent(){
        return studentService.getStudents();
    }
}
