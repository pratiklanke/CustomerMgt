package com.code;

import java.time.LocalDate;

//customer id(int) ,first name, last name (string),email(string),password(string),registrationAmount(double),dob(LocalDate),plan(ServicePlan : enum)
//Must generate customer ids automatically : auto increment)
public class Customer {
	private int id
	private String name;
	private String lname;
	private String email;
	private String password;
	private double registrationAmount;
	private LocalDate date;
	private ServicePlan plan;
	private int idCounter;

	static {
		int idCounter = 1000;
	}

	public Customer(String name, String lname, String email, String password, double registrationAmount, LocalDate date,
			ServicePlan plan) {
		super();

		this.id = idCounter;
		this.name = name;
		this.lname = lname;
		this.email = email;
		this.password = password;
		this.registrationAmount = registrationAmount;
		this.date = date;
		this.plan = plan;
		idCounter++;
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

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getRegistrationAmount() {
		return registrationAmount;
	}

	public void setRegistrationAmount(double registrationAmount) {
		this.registrationAmount = registrationAmount;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public ServicePlan getPlan() {
		return plan;
	}

	public void setPlan(ServicePlan plan) {
		this.plan = plan;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", lname=" + lname + ", email=" + email + ", password="
				+ password + ", registrationAmount=" + registrationAmount + ", date=" + date + ", plan=" + plan + "]";
	}

}
