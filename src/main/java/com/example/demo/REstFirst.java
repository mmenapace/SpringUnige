package com.example.demo;

import java.util.List;
import java.util.Optional;

import javax.sql.rowset.serial.SerialArray;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.POJO.Employee;
import com.example.demo.POJO.EmployeeRepository;
import com.example.demo.POJO.WorkgroupRepository;
import com.example.demo.ServiceDemo.Service1;

@RestController
public class REstFirst {
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	WorkgroupRepository workgroupRepository;
	
	@Autowired
	Service1 service1;
	
	@RequestMapping("")
	String hello() {
		return "Hello World";
	}
	
	@RequestMapping(value = "/post/employee",method = RequestMethod.POST)
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee){
		employeeRepository.save(employee);
		return new ResponseEntity<Employee>(employee,HttpStatus.OK);
	}
	
	
	@RequestMapping("getbyId/{id}")
	Optional<Employee> getallEmployee(@PathVariable long id) {
		
		return employeeRepository.findById(id);	
	}
	
	@RequestMapping("addEmployee")
	void generateEmployee() {
		Employee emp = new Employee("Gino", "Franco", 29, "Via da li");
		employeeRepository.save(emp);
		
	}
	
	@RequestMapping("getallEmployee")
	List<Employee> getallEmployee() {
		
		return employeeRepository.findAll();
		
	}
	
	@RequestMapping("getbyname/{name}")
	List<Employee> getallEmployee(@PathVariable String name) {
		
		return employeeRepository.findByName(name);	
	}
	
	
	@RequestMapping("createWG/{name}")
	String CreateWG(@PathVariable String name) {
		service1.createNewGroup(name);
	
		return "Il workgroup " + name + " è stato creato";
		
	}
	
	@RequestMapping("getFranchi")
	Optional<workGroup> GetFranchi() {
		return workgroupRepository.findById(13l);
	}

}
