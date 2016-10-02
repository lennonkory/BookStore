package com.kcomp.BookStore.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;


@Entity
@Table(name="User")
public class User implements Serializable{

	private static final long serialVersionUID = 121212L;

	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int id;
	 
	 @Size(min=3, max=50)
	 @Column(name = "first_name", nullable = false)
	 private String firstName;
	 
	 @Size(min=3, max=50)
	 @Column(name = "last_name", nullable = false)
	 private String lastName;

	public int getId() {
		return id;
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
	 
	 
	
}
