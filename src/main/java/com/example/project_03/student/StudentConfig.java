package com.example.project_03.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student john = new Student(
                    "John",
                    "john.svanda@gmail.com",
                    LocalDate.of(2000, Month.MARCH, 23)
            );

            Student alex = new Student(
                    "Alex",
                    "alex.svanda@gmail.com",
                    LocalDate.of(2004, Month.APRIL, 21)
            );

            studentRepository.saveAll(
                    List.of(john, alex)
            );
        };
    }
}
