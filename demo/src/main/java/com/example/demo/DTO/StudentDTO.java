package com.example.demo.DTO;

public record StudentDTO(
     String id,
     String name,
     String lastname1,
     String gender,
     String email,
     int birth_year,
     String phone
) {
}