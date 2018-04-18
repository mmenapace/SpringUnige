package com.example.demo.POJO;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(length = 100)
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	String name;
	String surname;
	int age;
	String adress;
	String telnumber;
	
	
	
	
	public Employee(String name, String surname, int age, String adress, String telnumber) {
		super();
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.adress = adress;
		this.telnumber = telnumber;
	}
	public Employee(long id, String name, String surname, int age, String adress, String telnumber) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.adress = adress;
		this.telnumber = telnumber;
	}
	public String getTelnumber() {
		return telnumber;
	}
	public void setTelnumber(String telnumber) {
		this.telnumber = telnumber;
	}
	public Employee() {
		super();
	}
	public Employee(String name, String surname, int age, String adress) {
		super();
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.adress = adress;
	}
	/// 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	

}
