package com.example.demo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.example.demo.POJO.Employee;

@Entity
public class workGroup {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	String name;
	@OneToMany
	List<Employee> elist;
	
	public workGroup() {
		super();
	}
	
	public workGroup( String name, List<Employee> elist) {
		super();
		this.name = name;
		this.elist = elist;
	}
	
	public workGroup(long id, String name, List<Employee> elist) {
		super();
		this.id = id;
		this.name = name;
		this.elist = elist;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Employee> getElist() {
		return elist;
	}
	public void setElist(List<Employee> elist) {
		this.elist = elist;
	}
	
	
	

}
