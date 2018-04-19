package com.example.demo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.ManyToAny;

import com.example.demo.POJO.Advisor;
import com.example.demo.POJO.Employee;

@Entity
public class WorkGroup {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	String name;
	@ManyToMany
	List<Employee> elist;
	
	@OneToOne
	Advisor advisor;

	
	public WorkGroup() {
		super();
	}
	
	public WorkGroup( String name, List<Employee> elist) {
		super();
		this.name = name;
		this.elist = elist;
	}
	
	public WorkGroup(long id, String name, List<Employee> elist) {
		super();
		this.id = id;
		this.name = name;
		this.elist = elist;
	}
	
	
	
	public WorkGroup(long id, String name, List<Employee> elist, Advisor advisor) {
		super();
		this.id = id;
		this.name = name;
		this.elist = elist;
		this.advisor = advisor;
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

	public Advisor getAdvisor() {
		return advisor;
	}

	public void setAdvisor(Advisor advisor) {
		this.advisor = advisor;
	}
	
	
	

}
