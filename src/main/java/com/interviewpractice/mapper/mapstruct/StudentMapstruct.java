package com.interviewpractice.mapper.mapstruct;

import com.interviewpractice.entity.Student;
import com.interviewpractice.model.StudentDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface StudentMapstruct {
    List<StudentDto> studentListToStudentDtoList(List<Student> students);
}
