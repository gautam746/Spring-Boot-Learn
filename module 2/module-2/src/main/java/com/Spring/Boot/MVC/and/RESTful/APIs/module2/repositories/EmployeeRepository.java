package com.Spring.Boot.MVC.and.RESTful.APIs.module2.repositories;

import com.Spring.Boot.MVC.and.RESTful.APIs.module2.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
}
