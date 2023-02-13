package com.mytel.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity
@Getter
@Setter
public class FamilyFriends {
	
	@Id
	int Id;
	@Column(name="phone_no")
	Long PhoneNo;
	@Column(name="friend_family")
	String familyfriend;
	


}
