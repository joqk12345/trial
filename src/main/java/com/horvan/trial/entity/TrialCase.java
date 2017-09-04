package com.horvan.trial.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.horvan.trial.Constant;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

/**
 * 庭审案件表
 */
@Entity(name = Constant.TABLE_TRIAL_CASE)
public class TrialCase {
    public static final String TABLE_ID = "id";
    public static final String TABLE_TRIAL_NO = "trial_no";

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = TABLE_ID)
    private long id;
    //庭审编号
    @Column(name = TABLE_TRIAL_NO)
    private String trialNo;
    //笔录模板
    @Column(name = "template_id")
    private long templateId;
    //案号
    @Column(name = "case_no")
    private String caseNo;
    //案由
    @Column(name = "case_reason")
    private String caseReason;
    //时间
    @Column(name = "case_time")
    private Date caseTime;
    //地点
    @Column(name = "address")
    private String address;
    //审判长
    @Column(name = "chief_judge")
    private String chiefJudge;
    //主审法官
    @Column(name = "presiding_judges")
    private String presidingJudges;
    //书记员
    @Column(name = "clerk")
    private String clerk;
    //合议庭成员
    @Column(name = "collegiate_bench")
    private String collegiateBench;
    //案件信息
    @Column(name = "case_info")
    private String caseInfo;
    //庭审状态
    @Column(name = "trial_state")
    private int trialState;
    //庭审笔录（文件URL）
    @Column(name = "trial_record")
    private String trialRecord;
    //庭审音频（文件URL）
    @Column(name = "trial_audio")
    private String trialAudio;
    //案件类型
    @Column(name = "case_type")
    private int caseType;
    //备注
    @Column(name = "message")
    private String message;

    public TrialCase() {
    }

    public TrialCase(String trialNo, long templateId, String caseNo, String caseReason, String address, Date caseTime, int trialState) {
        this.trialNo = trialNo;
        this.templateId = templateId;
        this.caseNo = caseNo;
        this.caseReason = caseReason;
        this.address = address;
        this.caseTime = caseTime;
        this.trialState = trialState;
    }

    @Transient
    public String getTrialStateStr() {
        switch (this.getTrialState()) {
            case 0:
                return "开庭";
            case 1:
                return "休庭中";
            case 2:
                return "闭庭";
        }
        return "";
    }

    @Override
    public String toString() {
        return "TrialCase{" +
                "id=" + id +
                ", trialNo='" + trialNo + '\'' +
                ", templateId=" + templateId +
                ", caseNo='" + caseNo + '\'' +
                ", caseReason='" + caseReason + '\'' +
                ", caseTime=" + caseTime +
                ", address='" + address + '\'' +
                ", chiefJudge='" + chiefJudge + '\'' +
                ", presidingJudges='" + presidingJudges + '\'' +
                ", clerk='" + clerk + '\'' +
                ", collegiateBench='" + collegiateBench + '\'' +
                ", caseInfo='" + caseInfo + '\'' +
                ", trialState=" + trialState +
                ", trialRecord='" + trialRecord + '\'' +
                ", trialAudio='" + trialAudio + '\'' +
                ", caseType=" + caseType +
                ", message='" + message + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTrialNo() {
        return trialNo;
    }

    public void setTrialNo(String trialNo) {
        this.trialNo = trialNo;
    }

    public long getTemplateId() {
        return templateId;
    }

    public void setTemplateId(long templateId) {
        this.templateId = templateId;
    }

    public String getCaseNo() {
        return caseNo;
    }

    public void setCaseNo(String caseNo) {
        this.caseNo = caseNo;
    }

    public String getCaseReason() {
        return caseReason;
    }

    public void setCaseReason(String caseReason) {
        this.caseReason = caseReason;
    }

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public Date getCaseTime() {
        return caseTime;
    }

    public void setCaseTime(Date caseTime) {
        this.caseTime = caseTime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getChiefJudge() {
        return chiefJudge;
    }

    public void setChiefJudge(String chiefJudge) {
        this.chiefJudge = chiefJudge;
    }

    public String getPresidingJudges() {
        return presidingJudges;
    }

    public void setPresidingJudges(String presidingJudges) {
        this.presidingJudges = presidingJudges;
    }

    public String getClerk() {
        return clerk;
    }

    public void setClerk(String clerk) {
        this.clerk = clerk;
    }

    public String getCollegiateBench() {
        return collegiateBench;
    }

    public void setCollegiateBench(String collegiateBench) {
        this.collegiateBench = collegiateBench;
    }

    public String getCaseInfo() {
        return caseInfo;
    }

    public void setCaseInfo(String caseInfo) {
        this.caseInfo = caseInfo;
    }

    public int getTrialState() {
        return trialState;
    }

    public void setTrialState(int trialState) {
        this.trialState = trialState;
    }

    public String getTrialRecord() {
        return trialRecord;
    }

    public void setTrialRecord(String trialRecord) {
        this.trialRecord = trialRecord;
    }

    public String getTrialAudio() {
        return trialAudio;
    }

    public void setTrialAudio(String trialAudio) {
        this.trialAudio = trialAudio;
    }

    public int getCaseType() {
        return caseType;
    }

    public void setCaseType(int caseType) {
        this.caseType = caseType;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
