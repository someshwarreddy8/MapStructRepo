package com.interviewpractice.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamAPICheetSheet {
    public static void main(String[] args) {
        List<Employee> allEmployees = EmployeeDataBase.getAllEmployees();

//        allEmployees.forEach(System.out::println);

//        allEmployees.stream().forEach(System.out::println);

//        allEmployees.stream().filter(t -> t.getDept().equals("Development"))
//                .sorted(Comparator.comparing(Employee::getSalary).reversed())
//                .forEach(System.out::println);

        List<Integer> list = Arrays.asList(4, 3, 6, 9);
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
