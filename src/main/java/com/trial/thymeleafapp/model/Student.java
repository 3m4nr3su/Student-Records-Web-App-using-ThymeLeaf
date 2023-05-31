package com.trial.thymeleafapp.model;

import java.sql.Date;

import jakarta.persistence.Entity;


@Entity
public class Student {
	
	@jakarta.persistence.Id
	private Integer id;
	
	private String name;
	
	private String department;
	
	private String updated_by;

	private Date updated_on;
	
	public Student () {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getUpdated_by() {
		return updated_by;
	}

	public void setUpdated_by(String updated_by) {
		this.updated_by = updated_by;
	}

	public Date getUpdated_on() {
		return updated_on;
	}

	public void setUpdated_on(Date updated_on) {
		this.updated_on = updated_on;
	}

	@Override
	public String toString() {
		return "Student [Id=" + id + ", name=" + name + ", department=" + department + ", updated_by=" + updated_by
				+ ", updated_on=" + updated_on + "]";
	}

	

	


}
