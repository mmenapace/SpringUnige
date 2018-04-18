package com.example.demo.POJO;

import javax.persistence.Entity;

@Entity
public class Welder extends Employee{
	
	int orelavoro;

	public Welder() {
		super();
	}
	
	public Welder( String name, String surname, int age, String adress, String telnumber, int orelavoro) {
		super(name, surname, age, adress, telnumber);
		this.orelavoro = orelavoro;
	}
	
	

	public int getOrelavoro() {
		return orelavoro;
	}

	public void setOrelavoro(int orelavoro) {
		this.orelavoro = orelavoro;
	}
	

	
	

}
