package com.entities;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;

import lombok.Data;
@Data
@Entity
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int qid;
	private String qname;
	@OneToMany(cascade = CascadeType.ALL)  
	@JoinColumn(name="qid")  
	//@OrderColumn(name="type")  
	private List<Answer>answers;
//	private Set<String>examples;
//	private Map<String,String>qa;
//	

}
