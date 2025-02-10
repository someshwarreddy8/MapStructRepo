package com.interviewpractice.controller;

import com.interviewpractice.entity.Address;
import com.interviewpractice.entity.Student;
import com.interviewpractice.model.AddressDto;
import com.interviewpractice.sample.demo.javanewfeatures.javanewfeatures.java8features.streamsprep.Employee;
import com.interviewpractice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/employees/{id}")
    public List<Address> getEmployee(@PathVariable Long id) {
        return studentService.getEmployee();
    }

    @GetMapping("/address")
    public List<Address> getStudents() {
        return studentService.getEmployee();
    }

    @PostMapping("/save-student")
    public void saveAddress(@RequestBody Address address) {
        studentService.addAddress(address);
    }

    @GetMapping("/get-address")
    public List<AddressDto> getAddresses() {

        List<AddressDto> allAddress = studentService.getAllAddress();

        allAddress.forEach(address -> {
            System.out.println(address.getArea());
//            System.out.println(address.getStudent());
        });

        return allAddress;
    }
}
