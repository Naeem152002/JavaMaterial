package com.entities;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

import lombok.Data;

@Data
@Entity
@PrimaryKeyJoinColumn(name="studentId")
public class Student extends Person {
	private String course;
	private String fess;

}
