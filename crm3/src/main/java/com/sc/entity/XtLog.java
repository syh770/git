package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

//ϵͳ��־
public class XtLog implements Serializable {
    private Long logId;	//��־���
    
    private Long userId;	//�û����

    private String visitIp;	//����IP

    private String permission;	//Ȩ��
    
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")	
    private Date visitTime;	//����ʱ��

    private Long companyId;	//��˾���

    private static final long serialVersionUID = 1L;

    public XtLog(Long logId, Long userId, String visitIp, String permission, Date visitTime, Long companyId) {
        this.logId = logId;
        this.userId = userId;
        this.visitIp = visitIp;
        this.permission = permission;
        this.visitTime = visitTime;
        this.companyId = companyId;
    }

    public XtLog() {
        super();
    }

    public Long getLogId() {
        return logId;
    }

    public void setLogId(Long logId) {
        this.logId = logId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getVisitIp() {
        return visitIp;
    }

    public void setVisitIp(String visitIp) {
        this.visitIp = visitIp == null ? null : visitIp.trim();
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission == null ? null : permission.trim();
    }

    public Date getVisitTime() {
        return visitTime;
    }

    public void setVisitTime(Date visitTime) {
        this.visitTime = visitTime;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }
}