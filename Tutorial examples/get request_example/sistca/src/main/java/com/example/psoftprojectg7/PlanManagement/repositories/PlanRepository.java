package com.example.psoftprojectg7.PlanManagement.repositories;

import com.example.psoftprojectg7.PlanManagement.model.Plan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PlanRepository extends CrudRepository<Plan, Long> {
    Plan findByPlanName(String planName);

}


