package com.example.demo.POJO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.workGroup;

@Repository
public interface WorkgroupRepository extends CrudRepository<workGroup, Long> {

}
