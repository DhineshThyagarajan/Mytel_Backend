package com.mytel.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mytel.dto.PlanDTO;
import com.mytel.entity.Plan;
import com.mytel.repository.PlanRepository;

@Service
public class PlanService {
	
	@Autowired
	PlanRepository planrepo;
	
	public List<PlanDTO> getAllplans()

	{   List <Plan> plans = planrepo.findAll();
		List <PlanDTO> plandtos = new ArrayList<>();
		 
		 for(Plan plan: plans)
		 {
			 PlanDTO plandto = PlanDTO.valueOf(plan);
			 plandtos.add(plandto);
			 
		 }
		 return plandtos;		
	}
}
