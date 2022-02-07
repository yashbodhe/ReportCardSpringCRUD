package com.example.demo.dao;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import com.example.demo.model.Student;
@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>{

}
