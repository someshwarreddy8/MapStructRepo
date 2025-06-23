package com.interviewpractice.streams;

import java.util.List;

public class StreamAPICheetSheet {
    public static void main(String[] args) {
        List<Employee> allEmployees = EmployeeDataBase.getAllEmployees();

        allEmployees.forEach(System.out::println);
    }
}
