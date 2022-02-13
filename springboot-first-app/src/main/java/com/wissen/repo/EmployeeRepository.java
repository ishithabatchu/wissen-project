package com.wissen.repo;

import com.wissen.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public abstract class EmployeeRepository implements MongoRepository<Employee, Long> {

        public abstract List<Employee> findAll (String employeeId);
}