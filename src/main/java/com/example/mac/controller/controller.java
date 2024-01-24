package com.example.mac.controller;

import com.example.mac.entity.Student;
import com.example.mac.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class controller {
    StudentService studentService ;
    @GetMapping("/all")
    public List<Student> students(){
        return  studentService.studentsAll();
    }

}
