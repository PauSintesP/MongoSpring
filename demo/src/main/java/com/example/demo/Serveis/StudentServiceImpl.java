package com.example.demo.Serveis;

import org.springframework.stereotype.Service;

import com.example.demo.DTO.StudentDTO;
import com.example.demo.Model.Student;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {@Override
    public Mono<Student> save(StudentDTO studentDTO) {

        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public Mono<Student> findById(String id) {

        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public Flux<Student> findAll() {

        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public Mono<Student> update(StudentDTO studentDTO) {
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public Mono<Void> delete(String id) {
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public Flux<Student> findByNameRegex(String namePattern) {

        throw new UnsupportedOperationException("Unimplemented method 'findByNameRegex'");
    }
    
    //falta fer els service Pau SIntes controla. :)
}