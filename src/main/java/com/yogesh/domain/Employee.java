package com.yogesh.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="emp1")
public class Employee {
	
	@Id
	@SequenceGenerator(name="emp1" , sequenceName = "emp1_seq_id"  , allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "emp1")
	private Long id;
	
	private String firstName;
	private String lastName;
	private String email;

}
