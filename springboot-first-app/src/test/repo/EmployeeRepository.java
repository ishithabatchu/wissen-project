package com.raj.mongodb.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.raj.mongodb.model.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Long>{

}
