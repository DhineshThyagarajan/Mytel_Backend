package com.mytel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

import com.mytel.dto.PlanDTO;
import com.mytel.service.PlanService;

@RestController
public class PlanController {
	
	@Autowired
	PlanService  planserv;
	
	@GetMapping(name="/plan", produces = MediaType.APPLICATION_JSON_VALUE )
	public List<PlanDTO> getAllplans()
	{
		return planserv.getAllplans();
	}

}
