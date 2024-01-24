package com.example.mac.entity;

import lombok.*;


@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private  String name ;
    private String lastname;
    private int numberPhone;
    private int salary;

}
