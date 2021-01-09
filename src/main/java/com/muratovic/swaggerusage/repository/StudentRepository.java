package com.muratovic.swaggerusage.repository;

import com.muratovic.swaggerusage.domain.Student;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository  extends CrudRepository<Student, Long>, JpaSpecificationExecutor<Student> {
}
