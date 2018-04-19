package com.example.demo.ServiceDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.WorkGroup;
import com.example.demo.POJO.Accountant;
import com.example.demo.POJO.Employee;
import com.example.demo.POJO.EmployeeRepository;
import com.example.demo.POJO.Welder;
import com.example.demo.POJO.WorkgroupRepository;

@Service
public class ServiceTest {
@Autowired
EmployeeRepository employeeRepository;

@Autowired
WorkgroupRepository workgroupRepository;

public void createNewGroup(String groupName) {
	WorkGroup primo = new WorkGroup(groupName, null);
	primo.setElist(employeeRepository.findByName("Franco"));
	
	workgroupRepository.save(primo);

}

/**
 * Verifica l'istanza dell'oggetto e assegna al relativo gruppo di lavoro
 */

public void assignToWorkgroup(Employee empin) {
	if (empin instanceof Welder) {
	workgroupRepository.findByName("Saldatori").getElist().add(empin);	
	}
	if (empin instanceof Accountant) {
	workgroupRepository.findByName("Amministrativi").getElist().add(empin);
	}
	
}
}
