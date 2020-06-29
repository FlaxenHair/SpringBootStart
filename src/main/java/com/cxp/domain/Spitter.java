package com.cxp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "spitters")
public class Spitter {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long spitter_id;
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	
	public Long getSpitter_id() {
		return spitter_id;
	}
	public void setSpitter_id(Long spitter_id) {
		this.spitter_id = spitter_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	@Override
	public String toString() {
		return "Spitter [spitter_id=" + spitter_id + ", username=" + username + ", password=" + password
				+ ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
}
