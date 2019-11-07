package com.olivert.planapi.service.impl;

import com.olivert.planapi.bo.PlanDetailInfo;
import com.olivert.planapi.bo.PlanHeadInfo;
import com.olivert.planapi.dao.repository.PlanRepository;
import com.olivert.planapi.service.PlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Oliver Tan.
 * @create 11/07/19.
 */
@Service
public class PlanServiceImpl implements PlanService {

    @Autowired
    PlanRepository planRepository;

    @Override
    public List<PlanHeadInfo> getPlanHeadInfoByUserId(Integer userId) {
        return null;
    }

    @Override
    public List<PlanDetailInfo> getPlanDetailInfoByUserId(Integer userId) {
        return null;
    }
}
