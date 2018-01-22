package com.springBootApp.simpleApp.model;

import java.math.BigInteger;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="student")
public class Student {
	
	
	@Id
	String rollNo ;
	
	@NotBlank
	String name;
	
	@NotBlank
	@Size(max=100)
	int percentage;
	
	@NotBlank
	int attendence;

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPercentage() {
		return percentage;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}

	public int getAttendence() {
		return attendence;
	}

	public void setAttendence(int attendence) {
		this.attendence = attendence;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", percentage=" + percentage + ", attendence="
				+ attendence + "]";
	}
	
	

}
