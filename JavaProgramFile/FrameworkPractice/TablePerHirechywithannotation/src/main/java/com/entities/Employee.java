package com.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
@DiscriminatorValue(value="employee")
public class Employee extends Person {
private String job;
private String salary;
}
