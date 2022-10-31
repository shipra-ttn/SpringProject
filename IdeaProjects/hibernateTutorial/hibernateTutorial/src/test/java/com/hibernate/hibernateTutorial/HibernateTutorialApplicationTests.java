package com.hibernate.hibernateTutorial;

import com.hibernate.hibernateTutorial.entities.Employee;
import com.hibernate.hibernateTutorial.repos.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class HibernateTutorialApplicationTests {

	@Autowired
	EmployeeRepository repository;

	@Test
	void contextLoads() {
	}

	@Test
	@Transactional
	@Rollback(value = false)
	public void testCreate(){
		Employee employee=new Employee();
		employee.setName("shipra");
		employee.setAge(23);
		employee.setLocation("Mathura");

		repository.save(employee);

	}
	@Test
	public void testRead(){
		Employee employee= repository.findById(1).orElse(null);
		assertNotNull(employee);
		System.out.println(employee.getName()+" "+employee.getAge()+" "+employee.getLocation());
		assertEquals("shipra",employee.getName());
		//System.out.println(employee.getName()+" "+employee.getAge()+" "+employee.getLocation());
	}

	@Test
	@Transactional
	@Rollback(value = false)
	public void testUpdate(){
		Employee employee= repository.findById(1).get();
		employee.setName("shipra");
		repository.save(employee);
		System.out.println(employee.getLocation());
	}

	@Test
	public void testDelete(){
		repository.deleteById(101);
	}

	@Test
	public void testCount(){
		System.out.println("COUNT IS"+" "+repository.count());
	}

	@Test
	public void testFindByName(){
		List<Employee> emp= repository.findByName("shipra");
	emp.forEach(e->System.out.println(e.getAge()));
	}

	@Test
	public void testFindByNameLike(){
		List<Employee> employeeList=repository.findByNameLike("a%");
		employeeList.forEach(p-> System.out.println(p.getName()));
	}

	@Test
	public void testFindAgeBetween()
	{
		List<Employee> employeeList=repository.findByAgeBetween(28,32);
		employeeList.forEach(p-> System.out.println(p.getName()));
	}
}
