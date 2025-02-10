package com.interviewpractice.sample.demo.javanewfeatures.javanewfeatures.java8features.streamsprep;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsPractice {
    public static void main(String[] args) {

        List<Employee> allEmployees = EmployeeDataBase.getAllEmployees();

        //forEach
//        allEmployees.forEach(System.out::println);

        //filter
        List<Employee> developement = allEmployees.stream().filter(e -> e.getDept().equalsIgnoreCase("Development")
                && e.getProjectList().stream().anyMatch(p -> p.getProjectCode().equals("P006"))).collect(Collectors.toList());

        allEmployees.stream().filter(e -> e.getDept().equalsIgnoreCase("Development")
                && e.getProjectList().stream().anyMatch(p -> p.getProjectCode().equals("P006"))).collect(Collectors.toMap(Employee::getId, Employee::getName));
//        System.out.println(developement);

//        boolean b = allEmployees.stream().anyMatch(t -> t.getDept().equals("Develpment"));

        //map
        List<String> empNames = allEmployees.stream().map(e -> e.getDept()).distinct().toList();
//        System.out.println(empNames);

        //flatMap
        List<String> flatMapDemo = allEmployees.stream().flatMap(e -> e.getProjectList().stream())
                .map(p -> p.getProjectName())
                .distinct()
                .toList();

//        System.out.println(flatMapDemo);

        //sorted
//         allEmployees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(System.out::println);

        //min & max
        Optional<Employee> min = allEmployees.stream().min(Comparator.comparingDouble(Employee::getSalary));
        Optional<Employee> max = allEmployees.stream().max(Comparator.comparingDouble(Employee::getSalary));

        Map<String, List<Employee>> groupBy = allEmployees.stream().collect(Collectors.groupingBy(Employee::getGender));

        Map<String, List<String>> collect = allEmployees.stream().collect(Collectors.groupingBy(Employee::getGender,
                Collectors.mapping(Employee::getName, Collectors.toList())));

        System.out.println(collect);

    }
}
