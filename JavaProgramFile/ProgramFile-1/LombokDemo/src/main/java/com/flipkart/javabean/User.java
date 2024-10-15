package com.flipkart.javabean;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString; 

@AllArgsConstructor//jitane data utane construcotor

@NoArgsConstructor//jitane jaroorart utane constructor

@Data//4 ka combination hain setter and getter
//equals and to string 
@Setter//setter
@Getter//getter
@EqualsAndHashCode
@ToString
@Builder//builder design pattren
public class User 
{
private String name,email,mobile,pass;
}
