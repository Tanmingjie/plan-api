package com.olivert.planapi.bo;

import lombok.Data;

import java.util.Date;

/**
 * @author Oliver Tan.
 * @create 11/06/19.
 */
@Data
public class PlanDetailInfo {

    private Integer planId;

    private String planTitle;

    private String planContent;

    private Date startDatetime;

    private Date endDatetime;

    private String status;

    private Integer userId;
}
