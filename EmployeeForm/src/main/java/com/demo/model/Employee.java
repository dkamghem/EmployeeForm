package com.demo.model;

public class Employee {
	private Integer Id;
	private String Name;
	private String Dept;
	private float Salary;
	
	public Employee() {
		super();
	}
	
	public Employee(Integer id, String name, String dept, Float salary) {
		super();
		Id = id;
		Name = name;
		Dept = dept;
		Salary = salary;
	}
	
	

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDept() {
		return Dept;
	}

	public void setDept(String dept) {
		Dept = dept;
	}

	public float getSalary() {
		return Salary;
	}

	public void setSalary(float salary) {
		Salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", Name=" + Name + ", Dept=" + Dept + ", Salary=" + Salary + "]";
	}

	
	
	
	
}
