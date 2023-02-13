package com.mytel.dto;
import com.mytel.entity.FamilyFriends;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FamilyFriendDTO {
	
	Long PhoneNo;
	String Familyfriend;
	
	
	public FamilyFriendDTO(Long phoneNo, String familyfriend) {
		this();
		this.PhoneNo = phoneNo;
		this.Familyfriend = familyfriend;
	}
	
	public FamilyFriends createFriend()
	{
		FamilyFriends famfriend = new FamilyFriends();
		famfriend.setPhoneNo(this.getPhoneNo());
		famfriend.setFamilyfriend(this.getFamilyfriend());
		return famfriend;
	}
	
	@Override
	public String toString() {
		return "FamilyFriendDTO [PhoneNo=" + PhoneNo + ", Familyfriend=" + Familyfriend + "]";
	}

	public FamilyFriendDTO() {
		super();
	}

	

}
