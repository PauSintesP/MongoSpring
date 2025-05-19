package com.example.demo.Serveis;

import org.springframework.stereotype.Service;

import com.example.demo.DTO.StudentDTO;
import com.example.demo.Mapper.StudentMapper;
import com.example.demo.Model.Student;
import com.example.demo.Repositoris.StudentsRepo;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    
    
   private final StudentsRepo studentsRepo;
   private final StudentMapper studentMapper;
  
   @Override
   public Mono<Student> save(StudentDTO studentDTO) {
       return Mono.just(studentMapper.toStudent(studentDTO))
               .flatMap(studentsRepo::save);
   }
  
   @Override
   public Mono<Student> findById(String id) {
       return studentsRepo.findById(id);
   }
  
   @Override
   public Flux<Student> findAll() {
       return studentsRepo.findAll();
   }
  
   @Override
   public Mono<Student> update(StudentDTO studentDTO) {
       return this.studentsRepo.findById(studentDTO.id())
               .map(existingStudent -> {
                   Student updatedStudent = studentMapper.toStudent(studentDTO);
                   return updatedStudent;
               })
               .flatMap(this.studentsRepo::save);
   }
  
   @Override
   public Mono<Void> delete(String id) {
       return studentsRepo.deleteById(id);
   }
  
   @Override
   public Flux<Student> findByNameRegex(String namePattern) {
       return studentsRepo.findByNameRegex(namePattern);
   }

    //falta fer els service Pau SIntes controla. :)
}