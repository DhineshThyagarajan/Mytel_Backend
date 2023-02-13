package com.mytel.repository;
import com.mytel.entity.Plan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanRepository extends JpaRepository <Plan, Integer> {

}
