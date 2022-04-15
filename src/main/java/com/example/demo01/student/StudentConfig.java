package com.example.demo01.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return args -> {
            Student edgar = new Student(
                    "Edgar",
                    "edgar@gmail.com",
                    LocalDate.of(2002, Month.AUGUST, 25)
            );

            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2005, Month.FEBRUARY, 15)
            );

            repository.saveAll(
                    Arrays.asList(edgar, alex)
            );
        };
    }
}
