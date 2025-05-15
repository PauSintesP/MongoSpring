package com.example.demo.Repositoris;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Student;

import reactor.core.publisher.Flux;

@Repository
@EnableReactiveMongoRepositories
public interface StudentsRepo extends ReactiveMongoRepository<Student, String> {
    Flux<Student> findByNameRegex(String regex);
//Falta fer tots elsm mètodes de la interfície StudentService
    //Flux<Student> findByNameRegex(String namePattern);
    //Mono<Student> save(StudentDTO studentDTO);
    //Mono<Student> findById(String id);
    //Flux<Student> findAll();
    //Mono<Student> update(StudentDTO studentDTO);
    //Mono<Void> delete(String id);
    //Flux<Student> findByNameRegex(String namePattern);




}