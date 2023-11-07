package com.deeptech.hibernate.work2.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="E_empid")
	private int empid;
	@Column(name="E_empname")
	private String empname;
	@Column(name="E_desi")
	private String desigation;
	@Column(name="E_salary")
	private int salary;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getDesigation() {
		return desigation;
	}
	public void setDesigation(String desigation) {
		this.desigation = desigation;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	

}
