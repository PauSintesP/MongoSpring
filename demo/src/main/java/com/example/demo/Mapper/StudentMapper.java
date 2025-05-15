package com.example.demo.Mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import com.example.demo.DTO.StudentDTO;
import com.example.demo.Model.Student;


@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface StudentMapper {


    StudentDTO toStudentDTO(Student student);


    Student toStudent(StudentDTO dto);

}
