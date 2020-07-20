package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

//ϵͳ_��ɫ��
public class XtRoles implements Serializable {
    private Long roleId;	//��ɫ���

    private String roleName;   //��ɫ����

    private String roleDes;		//��ɫ����

    private Long upRoleId;		//�ϼ�������Ա

    private String operator;	//����Ա
    
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastModifyDate;  //����޸�ʱ��

    private static final long serialVersionUID = 1L;

    public XtRoles(Long roleId, String roleName, String roleDes, Long upRoleId, String operator, Date lastModifyDate) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.roleDes = roleDes;
        this.upRoleId = upRoleId;
        this.operator = operator;
        this.lastModifyDate = lastModifyDate;
    }

    public XtRoles() {
        super();
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getRoleDes() {
        return roleDes;
    }

    public void setRoleDes(String roleDes) {
        this.roleDes = roleDes == null ? null : roleDes.trim();
    }

    public Long getUpRoleId() {
        return upRoleId;
    }

    public void setUpRoleId(Long upRoleId) {
        this.upRoleId = upRoleId;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public Date getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(Date lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }
}