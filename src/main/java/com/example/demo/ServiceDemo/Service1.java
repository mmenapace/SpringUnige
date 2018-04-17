package com.example.demo.ServiceDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.workGroup;
import com.example.demo.POJO.EmployeeRepository;
import com.example.demo.POJO.WorkgroupRepository;

@Service
public class Service1 {
@Autowired
EmployeeRepository employeeRepository;

@Autowired
WorkgroupRepository workgroupRepository;

public void createNewGroup(String groupName) {
	workGroup primo = new workGroup(groupName, null);
	primo.setElist(employeeRepository.findByName("Franco"));
	
	workgroupRepository.save(primo);

}
}
