package com.interviewpractice.streams;

import com.interviewpractice.sample.demo.javanewfeatures.javanewfeatures.java8features.streamsprep.Project;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
class Employee{

    private int id;
    private String name;
    private String dept;
    private List<Project> projects;
    private double salary;
    private String gender;

}
