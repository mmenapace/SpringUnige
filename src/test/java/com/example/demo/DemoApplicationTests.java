package com.example.demo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.POJO.EmployeeRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	@Autowired 
	EmployeeRepository employeeRepository;

	@Test
	public void contextLoads() {
		
	assertTrue(1==1);
	}
	
	@Test
	public void Ninstance() {
		
		assertTrue(employeeRepository.findAll().size() == 2);
	}
	

}
