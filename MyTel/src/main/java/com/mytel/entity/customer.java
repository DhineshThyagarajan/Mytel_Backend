package com.mytel.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class customer {
	
	@Id
	@Column(name= "phone_no", nullable=false)
	Long phoneNo;
	@Column(nullable=false, length=50)
	String name;
	@Column(nullable=false)
	Integer age;
	@Column(nullable=false, length=50)
	String address;
	@Column(nullable=false, length=50)
	String password;
	@Column(nullable=false)
	char gender;
	
	@OneToOne(cascade=CascadeType.REFRESH)
	@JoinColumn(name="plan_id")
	Plan plan;

	@OneToMany(cascade=CascadeType.MERGE)
	@JoinColumn(name="phone_no")
	List<FamilyFriends> friends=new ArrayList<>();
	
	public List<FamilyFriends> getFriends() {
		return friends;
	}

	public void setFriends(List<FamilyFriends> friends) {
		this.friends = friends;
	}
	
}
