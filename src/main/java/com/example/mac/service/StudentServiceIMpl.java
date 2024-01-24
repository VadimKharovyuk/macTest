package com.example.mac.service;

import com.example.mac.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceIMpl  implements StudentService{
    @Override
    public List<Student> studentsAll() {
        return List.of(
                    Student.builder().name("vadim").lastname("Kharovyk").numberPhone(345922).salary(2300).build(),
                    Student.builder().name("Vova").lastname("Kharovyk").numberPhone(345922).salary(2300).build(),
                    Student.builder().name("Vova").lastname("Kharovyk").numberPhone(345922).salary(2300).build(),
                    Student.builder().name("Vova").lastname("Kharovyk").numberPhone(345922).salary(2300).build(),
                    Student.builder().name("Dima").lastname("Kharovyk").numberPhone(345922).salary(2300).build()
            ) ;
    }
}
