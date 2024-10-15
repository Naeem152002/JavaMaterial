package com.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
@DiscriminatorValue(value="student")
public class Student extends Person {
	private String course;
	private String fess;

}
