package com.project.Student.API.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "student_details")

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rollNo")
    private long id;
    @Column(name = "first_name",nullable = false)
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    private String classs;
    private String section;



}
