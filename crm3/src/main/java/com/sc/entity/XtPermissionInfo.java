package com.sc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

//ϵͳ_Ȩ����Ϣ��
public class XtPermissionInfo implements Serializable {
    private Long permissonId;	//Ȩ�ޱ��

    private String permissonName;	//Ȩ����

    private String permission;	//Ȩ��

    private BigDecimal permissionColumnsId;		//Ȩ�޷������

    private String remarks;	//��ע��Ϣ
    
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastModifyDate;	//����޸�ʱ��

    private static final long serialVersionUID = 1L;

    public XtPermissionInfo(Long permissonId, String permissonName, String permission, BigDecimal permissionColumnsId, String remarks, Date lastModifyDate) {
        this.permissonId = permissonId;
        this.permissonName = permissonName;
        this.permission = permission;
        this.permissionColumnsId = permissionColumnsId;
        this.remarks = remarks;
        this.lastModifyDate = lastModifyDate;
    }

    public XtPermissionInfo() {
        super();
    }

    public Long getPermissonId() {
        return permissonId;
    }

    public void setPermissonId(Long permissonId) {
        this.permissonId = permissonId;
    }

    public String getPermissonName() {
        return permissonName;
    }

    public void setPermissonName(String permissonName) {
        this.permissonName = permissonName == null ? null : permissonName.trim();
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission == null ? null : permission.trim();
    }

    public BigDecimal getPermissionColumnsId() {
        return permissionColumnsId;
    }

    public void setPermissionColumnsId(BigDecimal permissionColumnsId) {
        this.permissionColumnsId = permissionColumnsId;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Date getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(Date lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }
}