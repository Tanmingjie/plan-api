package com.olivert.planapi.dao.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author Oliver Tan.
 * @create 11/06/19.
 */

@Entity
@Data
@Table(name = "plan")
public class Plan implements java.io.Serializable{

    private static final long serialVersionUID = -5235183750727600588L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("planId")
    private Integer oid;

    private String planTitle;

    private String planContent;

    private Date startDatetime;

    private Date endDatetime;

    private String status;

    private Date updateDatetime;

    private String updateReason;

    private Integer entryId;

    private Date entryDatetime;
}
