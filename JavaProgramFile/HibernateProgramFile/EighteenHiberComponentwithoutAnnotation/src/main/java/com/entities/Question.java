package com.entities;

import lombok.Data;

@Data
public class Question {
private int id;
private String qname;
private Answer answer;
}
