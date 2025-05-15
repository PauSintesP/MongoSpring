package com.example.demo.Controladors;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequestMapping(value = "/api/v1/student")
@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/save")
    public Mono<Student> save(@RequestBody Student student) {
        return studentRepository.save(student);
    }

    @GetMapping("/{id}")
    public Mono<Student> findById(@PathVariable String id) {
        return studentRepository.findById(id);
    }

    @GetMapping("/all")
    public Flux<Student> findAll() {
        return studentRepository.findAll();
    }

    @PutMapping("/update")
    public Mono<Student> update(@RequestBody Student student) {
        return studentRepository.save(student);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable String id) {
        return studentRepository.deleteById(id);
    }
}