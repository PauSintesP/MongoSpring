package com.example.demo.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.example.demo.DTO.StudentDTO;
import com.example.demo.Model.Student;


@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface StudentMapper {


    StudentDTO toStudentDTO(Student student);


    Student toStudent(StudentDTO dto);

}
