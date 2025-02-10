package com.interviewpractice.mapper;

import com.interviewpractice.entity.Student;
import com.interviewpractice.mapper.mapstruct.StudentMapstruct;
import com.interviewpractice.model.StudentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentMapper {
    @Autowired
    private StudentMapstruct studentMapstruct;

    public List<StudentDto> studentListToStudentDtoList(List<Student> students){
        return studentMapstruct.studentListToStudentDtoList(students);
    }
}
