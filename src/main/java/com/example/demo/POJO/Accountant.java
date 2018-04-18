package com.example.demo.POJO;

import javax.persistence.Entity;

@Entity
public class Accountant extends Employee{
	
	String office;
	
	public Accountant() {
		super();
	}

	public Accountant( String name, String surname, int age, String adress, String telnumber, String office) {
		super(name, surname, age, adress, telnumber);
		this.office = office;
	}
	
	
	
	

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}
	


}
