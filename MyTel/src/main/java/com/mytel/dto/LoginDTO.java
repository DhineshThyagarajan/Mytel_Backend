package com.mytel.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginDTO {

	Long phoneNo;
	String password;
	public LoginDTO() {
		super();
	}
	
	
	@Override
	public String toString() {
		return "LoginDTO [phoneNo=" + phoneNo + ", password=" + password + "]";
	}
	
	
	
}
