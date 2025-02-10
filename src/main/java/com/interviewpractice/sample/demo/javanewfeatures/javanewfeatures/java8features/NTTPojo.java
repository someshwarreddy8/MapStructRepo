package com.interviewpractice.sample.demo.javanewfeatures.javanewfeatures.java8features;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class NTTPojo {
    private String name;
    private String dept;
    private int[] sal;
    private List<Integer> salary;
}
