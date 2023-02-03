package com.aruhat.student1;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    Repository repository;
    public String addStudent(Student student){
        repository.save(student);

        return "Student added";
    }
    public String editStudent(Student student){

       Student student1 = repository.findById(student.getId()).get();
       student1.setAge(student.getAge());
       student1.setName(student.getName());
       student1.setGrade(student.getGrade());
       student1.setRollNO(student.getRollNO());

        repository.save(student1);

        return "Student edited";
    }

    public List<Student> getStudents(){
        return repository.findAll();
    }

}
