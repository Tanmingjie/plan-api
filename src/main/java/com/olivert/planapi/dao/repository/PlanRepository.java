package com.olivert.planapi.dao.repository;

import com.olivert.planapi.dao.entity.Plan;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Oliver Tan.
 * @create 11/06/19.
 */
public interface PlanRepository extends JpaRepository<Plan, Integer> {
}
