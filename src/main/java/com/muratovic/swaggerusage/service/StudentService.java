package com.muratovic.swaggerusage.service;

import com.muratovic.swaggerusage.domain.Student;

import javax.persistence.EntityNotFoundException;

public interface StudentService {

    Student find(Long studentId) throws EntityNotFoundException;

    Student create(Student student);


}
