package com.example.studentapi;

public interface StudentRepositary{
    void save(Student student);
    
    Student get(String id);

}