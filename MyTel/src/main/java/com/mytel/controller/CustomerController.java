package com.mytel.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

import com.mytel.dto.CalldetailsDTO;
import com.mytel.dto.CustomerDTO;
import com.mytel.dto.FamilyFriendDTO;
import com.mytel.service.CustomerService;
@RestController
public class CustomerController {
	
	@Autowired
	CustomerService custserv;
	
	@PostMapping(value = "/customers",  consumes = MediaType.APPLICATION_JSON_VALUE)
	public void createCustomer(@RequestBody CustomerDTO custDTO)
	{
		
		custserv.createcustomer(custDTO);
	}
	@GetMapping(value = "/customers/{phoneNo}", produces = MediaType.APPLICATION_JSON_VALUE)
	public CustomerDTO getCustomerProfile(@PathVariable Long phoneNo) {

		return custserv.getCustomerProfile(phoneNo);
	}
	
	@PostMapping(value = "/customers/{phoneNo}/friends", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void saveFriend(@PathVariable Long phoneNo, @RequestBody FamilyFriendDTO friendDTO) {
		custserv.saveFriend(phoneNo, friendDTO);
	}
	@GetMapping(value = "/customers/{phoneNo}/calldetails", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<CalldetailsDTO> getCustomerCallDetails(@PathVariable long phoneNo) {
		return custserv.getCustomerCallDetails(phoneNo);

}
}
