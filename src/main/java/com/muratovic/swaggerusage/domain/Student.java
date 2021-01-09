package com.muratovic.swaggerusage.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Long id;

    @Column(nullable = false)
    @NotNull(message = "Seat count can not be null!")
    private String name;

    @Column(nullable = false)
    @NotNull(message = "Seat count can not be null!")
    private String surname;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public Student() {

    }

}
