package com.interviewpractice.sample.demo.javanewfeatures.javanewfeatures.java8features.streamsprep;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employee {
    private int id;
    private String name;
    private String dept;
    private List<Project> projectList;
    private double salary;
    private String gender;
}
