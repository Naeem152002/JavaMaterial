package com.bean;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
@PrimaryKeyJoinColumn(name = "studentId")
public class Student extends Person {
	private String course;
	private int fees;
}
