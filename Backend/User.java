package com.entity;

import java.sql.Date;
import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name="Registration") 
public class User { 
	@Column(name="Id") 
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO) 
	private int id; 
	@Column(name="Name") 
	private String name; 
	@Column(name="Email") 
	private String email; 
	@Column(name="Password") 
	private String password; 
	@Column(name="DateOfBirth") 
	private Date dob; 
	@Column(name="PhoneNumber") 
	private long mobile; 
	@Column(name="Address") 
	private String address; 
	@Column(name="RegistrationDate",insertable = false, updatable = false) 
	private java.sql.Timestamp registerDate; 
	 //Constructors 
	public User() {  
	} 
	public User(String name, String email, String password, Date dob, long mobile, String address) { 
	  this.name = name; 
	  this.email = email; 
	  this.password = password; 
	  this.dob = dob; 
	  this.mobile = mobile; 
	  this.address = address; 
	 } 
	public User(int id, String name, String email, String password, Date dob, long mobile, String address,Timestamp registerDate) { 
	  this.id = id; 
	  this.name = name; 
	  this.email = email; 
	  this.password = password; 
	  this.dob = dob; 
	  this.mobile = mobile; 
	  this.address = address; 
	  this.registerDate = registerDate; 
	 } 
	 //Setters and Getters 
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
	 public Date getDob() { 
	  return dob; 
	 } 
	 public void setDob(Date dob) { 
	  this.dob = dob; 
	 } 
	 public long getMobile() { 
	  return mobile; 
	 } 
	 public void setMobile(long mobile) { 
	  this.mobile = mobile; 
	 } 
	 public String getAddress() { 
	  return address; 
	} 
	public void setAddress(String address) { 
	this.address = address; 
	} 
	public java.sql.Timestamp getRegisterDate() { 
	return registerDate; 
	} 
	public void setRegisterDate(java.sql.Timestamp registerDate) { 
	this.registerDate = registerDate; 
	} 
	// toString method 
	@Override 
	public String toString() { 
	return id + "  " + name + "  " + email + "  " + password + "  " + dob +"  "+mobile+"  "+registerDate;
	} 
} 

