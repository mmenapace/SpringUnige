package com.example.demo.POJO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.WorkGroup;

@Repository
public interface WorkgroupRepository extends CrudRepository<WorkGroup, Long> {
	
	WorkGroup findByName(String name);

}
