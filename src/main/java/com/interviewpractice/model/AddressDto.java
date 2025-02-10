package com.interviewpractice.model;

import lombok.*;

import java.util.List;
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class AddressDto {
    private Long id;
    private String area;
    private String mobile;
    private List<StudentDto> student;

}
