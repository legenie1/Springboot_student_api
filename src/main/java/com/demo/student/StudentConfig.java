package com.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student sergeo = new Student(
                    "Moffo Sergeo",
                    "moffo@gmail.com",
                    LocalDate.of(2001, Month.JUNE, 26)
            );

            Student joel = new Student(
                    "Joel Lonla",
                    "lonla@gmail.com",
                    LocalDate.of(2011, Month.MAY, 26)
            );

            repository.saveAll(
                    List.of(sergeo,joel)
            );
        };
    }
}
