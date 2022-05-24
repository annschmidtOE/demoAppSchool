package com.example.demoapp.student;

import java.time.LocalDate;

public class Student {
    private Long id;
    private String firstName;
    private String lastName;
    String email;
    private LocalDate dob;
    private Integer age;

    private Integer klasseTrin;

    public Student() {
    }

    public Student(String firstName, String lastName, String email, LocalDate dob, Integer age, Integer klasseTrin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dob = dob;
        this.age = age;
        this.klasseTrin = klasseTrin;
    }

    public Student(Long id, String firstName, String lastName, String email, LocalDate dob, Integer age, Integer klasseTrin) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dob = dob;
        this.age = age;
        this.klasseTrin = klasseTrin;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getKlasseTrin() {
        return klasseTrin;
    }

    public void setKlasseTrin(Integer klasseTrin) {
        this.klasseTrin = klasseTrin;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


}
