package com.tourist.Entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tourist")
public class Tourist {
	
	@Id
	
	private long id;
	
	@Column(name="firstName")
	private String firstName;
	
	@Column(name="lastName")
	private String lastName;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="age")
	private int age;
	
	@Column(name="fromPlace")
	private String fromPlace;
	
	@Column(name="numberOfDaysVisits")
	private int numberOfDaysVisits;
	
	public Tourist()
	{
		
	}

	public Tourist(String firstName, String lastName, String gender, int age, String fromPlace,
			int numberOfDaysVisits) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
		this.fromPlace = fromPlace;
		this.numberOfDaysVisits = numberOfDaysVisits;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFromPlace() {
		return fromPlace;
	}

	public void setFromPlace(String fromPlace) {
		this.fromPlace = fromPlace;
	}

	public int getNumberOfDaysVisits() {
		return numberOfDaysVisits;
	}

	public void setNumberOfDaysVisits(int numberOfDaysVisits) {
		this.numberOfDaysVisits = numberOfDaysVisits;
	}

	public Tourist addAttribute(String string, List<Tourist> findByfirstNameOrderByFirstNameDesc) {
		return addAttribute(null, null);
		
	}
	
		

}
