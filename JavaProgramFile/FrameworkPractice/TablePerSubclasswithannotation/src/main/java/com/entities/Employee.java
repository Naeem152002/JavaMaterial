package com.entities;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

import lombok.Data;

@Data
@Entity
@PrimaryKeyJoinColumn(name="employeeId")
public class Employee extends Person {
private String job;
private String salary;
}
