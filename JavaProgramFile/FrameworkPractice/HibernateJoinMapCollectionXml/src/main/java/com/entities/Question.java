package com.entities;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.JoinColumn;

import lombok.Data;
@Data
public class Question {
	private int qid;
	private String qname;
	private List<String>answers;
	private List<String>as;
	private Set<String>examples;
	private Map<String,String>qa;
}
