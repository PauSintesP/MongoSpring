package com.example.demo.Serveis;

import com.example.demo.DTO.StudentDTO;
import com.example.demo.Model.Student;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface StudentService {
    Mono<Student> save(StudentDTO studentDTO);
    Mono<Student> findById(String id);
    Flux<Student> findAll();
    Mono<Student> update(StudentDTO studentDTO);
    Mono<Void> delete(String id);
    Flux<Student> findByNameRegex(String namePattern);
}