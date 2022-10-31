package com.hibernate.hibernateTutorial.repos;

import com.hibernate.hibernateTutorial.entities.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
List<Employee> findByName(String name);
    List<Employee> findByNameLike(String name);
    List<Employee> findByAgeBetween(int a,int b);
}

