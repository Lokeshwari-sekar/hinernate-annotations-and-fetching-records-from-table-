package com.hibernateproject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EmployeesDetail")
public class Employees
{
	@Id
	@GeneratedValue
	@Column(name="empid")
	private int eid;
	@Column(name="empname",nullable=false,length=30)
	private String ename;
	@Column(name="empsalary",nullable=false)
	private float esalary;
	@Column(name="empmail",nullable=false,length=40)
	private String email;
	@Column(name="empdept",nullable=false,length=30)
	private String edept;
	@Column(name="empgen",nullable=false,length=15)
	private String egen;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	
	public void setEname(String ename) {
		this.ename = ename;
	}
	public float getEsalary() {
		return esalary;
	}
	public void setEsalary(float esalary) {
		this.esalary = esalary;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEdept() {
		return edept;
	}
	public void setEdept(String edept) {
		this.edept = edept;
	}
	public String getEgen() {
		return egen;
	}
	public void setEgen(String egen) {
		this.egen = egen;
	}
	@Override
	public String toString() {
		return "Employees [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + ", email=" + email + ", edept="
				+ edept + ", egen=" + egen + "]";
	}
	

}
