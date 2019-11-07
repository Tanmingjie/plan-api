package com.olivert.planapi.service;

import com.olivert.planapi.bo.PlanDetailInfo;
import com.olivert.planapi.bo.PlanHeadInfo;

import java.util.List;

/**
 * @author Oliver Tan.
 * @create 11/06/19.
 */
public interface PlanService {

    /**
     * get user's plan head information
     * @param userId userId
     * @return head Information
     */
    List<PlanHeadInfo> getPlanHeadInfoByUserId(Integer userId);

    /**
     * get user's plan Detail information
     * @param userId userId
     * @return head Information
     */
    List<PlanDetailInfo> getPlanDetailInfoByUserId(Integer userId);


}
