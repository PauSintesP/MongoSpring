package com.example.demo.Controladors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Student;
import com.example.demo.Repositoris.StudentsRepo;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequestMapping(value = "/api/v1/student")
@RestController
public class StudentController {

    @Autowired
    private StudentsRepo studentsRepo;

    @PostMapping("/save")
    public Mono<Student> save(@RequestBody Student student) {
        return studentsRepo.save(student);
    }

    @GetMapping("/{id}")
    public Mono<Student> findById(@PathVariable String id) {
        return studentsRepo.findById(id);
    }

    @GetMapping("/all")
    public Flux<Student> findAll() {
        return studentsRepo.findAll();
    }

    @PutMapping("/update")
    public Mono<Student> update(@RequestBody Student student) {
        return studentsRepo.save(student);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable String id) {
        return studentsRepo.deleteById(id);
    }
}