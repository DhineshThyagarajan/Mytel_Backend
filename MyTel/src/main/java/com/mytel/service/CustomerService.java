package com.mytel.service;

import com.mytel.repository.CallDetailsRepository;
import com.mytel.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.mytel.entity.CallDetails;
import com.mytel.entity.FamilyFriends;
import com.mytel.entity.customer;
import com.mytel.dto.CalldetailsDTO;
import com.mytel.dto.CustomerDTO;
import com.mytel.dto.FamilyFriendDTO;
import com.mytel.dto.LoginDTO;

import java.util.*;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository custrepo;
	
	@Autowired
	CallDetailsRepository custcallrepo;

	
	public void createcustomer(CustomerDTO custDTO)
	{
		customer cust = custDTO.createEntity();
		custrepo.save(cust);
	}
	public List<CalldetailsDTO> getCustomerCallDetails(@PathVariable long phoneNo) {

		List<CallDetails> callDetails = custcallrepo.findByCalledBy(phoneNo);
		List<CalldetailsDTO> callsDTO = new ArrayList<>();

		for (CallDetails call : callDetails) {
			callsDTO.add(CalldetailsDTO.valueOf(call));
		}

		return callsDTO;
	}
	
	public CustomerDTO getCustomerProfile(Long phoneNo)
	{
		CustomerDTO custDTO=null;
		Optional <customer> cust = custrepo.findById(phoneNo);
		if(cust.isPresent())
		{
			custDTO=CustomerDTO.valueOf(cust.get());
		}
		return custDTO;
	}

	public boolean login(LoginDTO loginDTO) {
		Boolean flag=false;
		Optional<customer> customer;
		customer=custrepo.findById(loginDTO.getPhoneNo());
		if(customer.isPresent() && customer.get() != null && customer.get().getPassword().equals(loginDTO.getPassword())) {
			flag= true;
		}
		return flag;
}
	public void saveFriend(Long phoneNo, FamilyFriendDTO friendDTO) {
		friendDTO.setPhoneNo(phoneNo);
		FamilyFriends friend = friendDTO.createFriend();
		List<FamilyFriends> friendList= new ArrayList<>();
		friendList.add(friend);
		customer c =custrepo.getById(phoneNo);
		c.getFriends().add(friend);
		c.setFriends(c.getFriends());
		custrepo.save(c);
	}
}
