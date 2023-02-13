package com.mytel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mytel.entity.CallDetails;

public interface CallDetailsRepository extends JpaRepository<CallDetails, Long> {

	List<CallDetails> findByCalledBy(long calledby);
}
