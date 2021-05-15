package com.example.studentapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController{
    StudentRepositary repositary=new InMemoryStudentRepositary();

    //restEndpoint
    //create a student
    @PostMapping("/student")
    public void createStudent(@RequestBody Student student){

        repositary.save(student);
    }

    //retrieve student
    @GetMapping("/student/{id}")

    public Student getStudent(@PathVariable String id){

        return repositary.get(id);
    }


}