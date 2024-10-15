package com.entities;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import lombok.Data;
@Data
@Entity
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int qid;
	private String qname;
	@ElementCollection
	@JoinColumn(name="qid")
	private List<String>answers;
	@ElementCollection
	@JoinColumn(name="qid")
	private List<String>as;
	@ElementCollection
	@JoinColumn(name="qid")
	private Set<String>examples;
	@ElementCollection
	@JoinColumn(name="qid")
	private Map<String,String>qa;

}
