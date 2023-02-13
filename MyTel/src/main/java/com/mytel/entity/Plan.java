package com.mytel.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Plan {
	
	@Id
	@Column(name="plan_id", nullable=false)
	Integer planid;
	@Column(name="local_rate",nullable=false)
	Integer localrate;
	@Column(name="national_rate",nullable=false)
	Integer nationalrate;
	@Column(name="plan_name",nullable=false, length=50)
	String planname;
	
}
