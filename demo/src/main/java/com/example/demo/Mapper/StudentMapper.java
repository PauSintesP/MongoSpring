package com.example.demo.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.springframework.stereotype.Component;

import com.example.demo.DTO.StudentDTO;
import com.example.demo.Model.Student;


@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
@Component
public interface StudentMapper {


    StudentDTO toStudentDTO(Student student);


    Student toStudent(StudentDTO dto);

}
