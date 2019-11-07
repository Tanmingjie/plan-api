package com.olivert.planapi.dao.entity;

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
@Table(name = "clock_record")
public class ClockRecord implements java.io.Serializable {
    private static final long serialVersionUID = 7908339590306518333L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer oid;

    private Integer planId;

    private Date clockDatetime;

    private Date entryDatetime;

}
