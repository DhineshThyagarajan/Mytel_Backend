package com.mytel.dto;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;
import com.mytel.entity.CallDetails;


@Getter
@Setter
public class CalldetailsDTO {
	
	Long calledBy;
	Long CalledTo;
	Date CalledOn;
	int  duration;
	
	public CalldetailsDTO()
	{
		super();
	}
	public CalldetailsDTO(Long CalledBy,Long CalledTo,Date Calledon,int duration)
	{
		this();
		this.calledBy=CalledBy;
		this.CalledOn=Calledon;
		this.CalledTo=CalledTo;
		this.duration=duration;
		
	}
	

	public static CalldetailsDTO valueOf(CallDetails calldetail)
	{
		CalldetailsDTO  calldetailDTO = new CalldetailsDTO();
		
		calldetailDTO.setCalledBy(calldetail.getCalledBy());
		calldetailDTO.setCalledTo(calldetail.getCalledto());
		calldetailDTO.setCalledOn(calldetail.getCalledon());
		calldetailDTO.setDuration(calldetail.getDuration());
		return calldetailDTO;
	}
	@Override
	public String toString() {
		return "CallDetailsDTO [CalledBy=" + calledBy + ", calledTo=" + CalledTo + ", calledOn=" + CalledOn
				+ ", duration=" + duration + "]";
	}
}
