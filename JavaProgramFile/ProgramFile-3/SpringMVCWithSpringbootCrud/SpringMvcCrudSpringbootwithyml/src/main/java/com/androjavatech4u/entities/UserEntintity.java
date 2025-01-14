package com.androjavatech4u.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "emp786")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserEntintity 
{
@Id
@GeneratedValue(strategy = GenerationType.UUID)
private String id;
private String name,email,mobile,pass;

}
