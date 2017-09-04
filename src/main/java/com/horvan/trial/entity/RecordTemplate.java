package com.horvan.trial.entity;

import com.horvan.trial.Constant;

import javax.persistence.*;
import java.util.Date;

@Entity(name = Constant.TABLE_RECORD_TEMPLATE)
public class RecordTemplate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
//    模板编号
    private String tempNo;
//模板名称
    private String tempName;
    // 模板权限
    private int tempAuthority;
//创建时间
    private Date createTime;
//模板状态
    private int tempState;
//模板文件目录
    private String tempUrl;
//备注
    private String message;

    public RecordTemplate() {
    }

    public RecordTemplate(String tempNo, String tempName, int tempAuthority, Date createTime, int tempState, String tempUrl, String message) {
        this.tempNo = tempNo;
        this.tempName = tempName;
        this.tempAuthority = tempAuthority;
        this.createTime = createTime;
        this.tempState = tempState;
        this.tempUrl = tempUrl;
        this.message = message;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTempNo() {
        return tempNo;
    }

    public void setTempNo(String tempNo) {
        this.tempNo = tempNo;
    }

    public String getTempName() {
        return tempName;
    }

    public void setTempName(String tempName) {
        this.tempName = tempName;
    }

    public int getTempAuthority() {
        return tempAuthority;
    }

    public void setTempAuthority(int tempAuthority) {
        this.tempAuthority = tempAuthority;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getTempState() {
        return tempState;
    }

    public void setTempState(int tempState) {
        this.tempState = tempState;
    }

    public String getTempUrl() {
        return tempUrl;
    }

    public void setTempUrl(String tempUrl) {
        this.tempUrl = tempUrl;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
