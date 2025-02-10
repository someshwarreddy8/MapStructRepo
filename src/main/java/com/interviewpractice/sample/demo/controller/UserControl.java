package com.interviewpractice.sample.demo.controller;

import com.interviewpractice.entity.Student;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/custom")
public class UserControl {

    @PostMapping("/v1/resource")
    public ResponseEntity<?> getData(@Valid @RequestBody Student student) {

        Student studentDto = Student.builder()
                .firstname(student.getFirstname())
                .id(student.getId())
                .lastname(student.getLastname())
                .build();

        return new ResponseEntity<>("success", HttpStatus.OK);
    }
}
