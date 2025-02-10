package com.interviewpractice.sample.demo.javanewfeatures.javanewfeatures.java8features.streamsprep;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Project {
    private String projectCode;
    private String projectName;
    private String client;
    private String buLeadName;
}
