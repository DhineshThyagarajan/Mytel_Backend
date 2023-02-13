package com.mytel.dto;

import lombok.Getter;
import lombok.Setter;
import com.mytel.entity.*;

@Getter
@Setter
public class PlanDTO {
	
	Integer planid;
	Integer localrate;
	Integer nationalrate;
	String planname;
	
	public static PlanDTO valueOf(Plan plan)
	{
		PlanDTO custplan= new PlanDTO();
		custplan.setPlanid(plan.getPlanid());
		custplan.setLocalrate(plan.getLocalrate());
		custplan.setNationalrate(plan.getNationalrate());
		custplan.setPlanname(plan.getPlanname());	
		return custplan;
		
	}
	
	@Override
	public String toString() {
		return "PlanDTO [planId=" + planid + ", planName=" + planname + ", nationalRate=" + nationalrate
				+ ", localRate=" + localrate + "]";

}
}
