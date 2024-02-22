package com.example.SpringBootWithElastic.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
@Document(indexName = "employee")
public class Elastic {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    // Getters and setters
	public Elastic() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Elastic(String id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
	@Override
	public String toString() {
		return "Elastic [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
    
    
}
