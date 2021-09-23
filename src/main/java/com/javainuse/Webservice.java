package com.javainuse;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Webservice {
	@Id
	private int id;
	@Column(name = "empId")
	private String empId;
	@Column(name = "name")
	private String name;
	@Column(name = "salary")
	private long salary;
	
	
	public Webservice() {
		super();
		
	}
	public Webservice(int id, String empId, String name, long salary) {
		super();
		this.id = id;
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	

}
