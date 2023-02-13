package com.mytel.dto;
import com.mytel.entity.customer;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerDTO {
	
	long phoneNo;
	String name;
	int age;
	char gender;
	String password;
	String address;
	
	@Override
	public String toString() {
		return "CustomerDTO [phoneNo=" + phoneNo + ", name=" + name + ", age=" + age + ", gender=" + gender
				+ ", password=" + password + ", address=" + address + "]";
	}
	 // converts entity into DTO
	public static CustomerDTO valueOf(customer cust) {
		CustomerDTO custDTO = new CustomerDTO();
		custDTO.setAge(cust.getAge());
		custDTO.setGender(cust.getGender());
		custDTO.setName(cust.getName());
		custDTO.setPhoneNo(cust.getPhoneNo());
		custDTO.setAddress(cust.getAddress());		
		return custDTO;
	}
	
	// converts DTO to entity

	public customer createEntity()
	{
		customer cust = new customer();
		cust.setAddress(this.address);
		cust.setAge(this.age);
		cust.setGender(this.gender);
		cust.setName(this.name);
		cust.setPassword(this.password);
		return cust;
	}
	

}
