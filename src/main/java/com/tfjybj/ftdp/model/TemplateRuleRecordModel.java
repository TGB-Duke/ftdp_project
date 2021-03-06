package com.tfjybj.ftdp.model;

import lombok.Data;
import org.joda.time.DateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import java.io.Serializable;

/**
 * 实体类
 * @author Administrator
 *
 */

@Data
public class TemplateRuleRecordModel implements Serializable{

    @Id
    @Column(name = "id")
    private String  id;
    @Column(name = "templateId")
    private String  templateId;
    @Column(name = "templateContentId")
    private String  templateContentId;
    @Column(name = "grade")
    private String grade;
    @Column(name = "sex")
    private int sex;
    @Column(name = "startRange")
    private String startRange;
    @Column(name = "endRange")
    private String endRange;
    @Column(name = "originalScore")
    private String originalScore;
    @Column(name = "weight")
    private String weight;
    @Column(name = "level")
    private String level;
    @Column(name = "operator")
    private String operator;
//    @Column(name = "creatTime")
//    private Date creatTime;
    @Column(name = "isDelete")
    private int isDelete;
//    @Column(name = "modifyTime")
//    private Date modifyTime;
}
