package com.example.demoapp.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {

    }

    public List<Student> getStudents(){
        return studentRepository.findAll();
                 }
}
