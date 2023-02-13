package com.mytel.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.Id;

@Entity
@Getter
@Setter

public class CallDetails {
	
	@Id
	Long Id;
	@Column(nullable=false)
	Long calledBy;
	@Column(nullable=false)
	Long Calledto;
	@Column( nullable=false)
	Date Calledon;
	@Column(nullable=false)
	int Duration;
	
	
	

}
