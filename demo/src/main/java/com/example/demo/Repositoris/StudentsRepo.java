package com.example.demo.Repositoris;

@Repository
@EnableReactiveMongoRepositories
public interface StudentsRepo extends ReactiveMongoRepository<nom_entitat, String> {

}
