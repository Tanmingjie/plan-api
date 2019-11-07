package com.olivert.planapi.web.api;

import com.olivert.planapi.bo.PlanDetailInfo;
import com.olivert.planapi.bo.PlanHeadInfo;
import com.olivert.planapi.service.PlanService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Oliver Tan.
 * @create 11/07/19.
 */
@Api
@RestController
@RequestMapping(value = "/api")
public class PlanInfoApi {

    @Autowired
    PlanService planService;

    @ApiOperation(value = "get user's plan head information")
    @GetMapping(value = "/plan/userId/{userId}/head/info", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<PlanHeadInfo> getPlanHeadInfoByUserId(@PathVariable("userId") Integer userId){
        return planService.getPlanHeadInfoByUserId(userId);
    }

    @ApiOperation(value = "get user's plan detail information")
    @GetMapping(value = "/plan/userId/{userId}/detail/info", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<PlanDetailInfo> getPlanDetailInfoByUserId(@PathVariable("userId") Integer userId){
        return planService.getPlanDetailInfoByUserId(userId);
    }

}
