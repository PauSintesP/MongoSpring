package com.example.demo.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class StudentDTO {
    private String name;
    private String lastname1;
    private String gender;
    private String email;
    private int birth_year;
    private String phone;
}
