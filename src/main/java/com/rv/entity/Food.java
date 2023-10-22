package com.rv.entity;

//import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

//import jakarta.persistence.Entity;


@Entity
public class Food {
	@Id
	private int id;
	private String name;
	
	
	public Food() {}
	
	@Override
	public String toString() {
		return "Food [id=" + id + ", name=" + name + "]";
	}

	public Food(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
