package com.interviewpractice.model;

import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {
    private Long id;
    private String firstname;
    private String lastname;
    private Long rollNo;
    private MarksDto marks;
}
