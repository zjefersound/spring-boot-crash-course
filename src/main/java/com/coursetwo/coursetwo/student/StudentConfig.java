package com.coursetwo.coursetwo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.JUNE;
import static java.time.Month.MAY;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student jeff = new Student(
                    "Jeff",
                    "zjefersound@gmail.com",
                    LocalDate.of(2002, MAY,14)
            );
            Student alex = new Student(
                    "Alex",
                    "aldunphy@gmail.com",
                    LocalDate.of(2001, JUNE,26)
            );
            Student stephany = new Student(
                    "Stephany",
                    "stephanythompson@gmail.com",
                    LocalDate.of(1999, JUNE,2)
            );

            repository.saveAll(List.of(jeff, alex, stephany));
        };
    }
}
