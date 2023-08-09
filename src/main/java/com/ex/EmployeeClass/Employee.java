package com.ex.EmployeeClass;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.*;
@Entity
@Table(name="EmployeeData")
public class Employee {
	@Id
	@Column(name="Id")
	private long Id;
	@Column(name="Ename")
	private String Ename;
	@Column(name="Esal")
	private int Esal;
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public int getEsal() {
		return Esal;
	}
	public void setEsal(int esal) {
		Esal = esal;
	}
}

