package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

//ϵͳ_�û�_��ɫ��
public class XtUserRole implements Serializable {
    private Long id; //���

    private Long userId; //�û����

    private Long roleId; //��ɫ���

    private Long operaterId; //�����˱��
    
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastModifyDate;  //����޸�ʱ��

    private static final long serialVersionUID = 1L;

    public XtUserRole(Long id, Long userId, Long roleId, Long operaterId, Date lastModifyDate) {
        this.id = id;
        this.userId = userId;
        this.roleId = roleId;
        this.operaterId = operaterId;
        this.lastModifyDate = lastModifyDate;
    }

    public XtUserRole() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getOperaterId() {
        return operaterId;
    }

    public void setOperaterId(Long operaterId) {
        this.operaterId = operaterId;
    }

    public Date getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(Date lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }
}