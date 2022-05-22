package com.example.demoapp.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {


    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "Anna",
                        "annaschmidt@gmail.com",
                        LocalDate.of(1995, Month.NOVEMBER,22),
                        26)
        ); }
}
