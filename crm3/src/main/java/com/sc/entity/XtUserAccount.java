package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

//ϵͳ_�û�_�˻���
public class XtUserAccount implements Serializable {
    private Long userId;  //�û����

    private String userName;  //�û�����

    private String userPassword;  //�û�����
 
    private Long staffId;  //Ա�����

    private Long companyId; //��˾���

    private String accountState;  //�˻�״̬
    
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastModifyDate;  //����޸�ʱ��

    private static final long serialVersionUID = 1L;

    public XtUserAccount(Long userId, String userName, String userPassword, Long staffId, Long companyId, String accountState, Date lastModifyDate) {
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.staffId = staffId;
        this.companyId = companyId;
        this.accountState = accountState;
        this.lastModifyDate = lastModifyDate;
    }

    public XtUserAccount() {
        super();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public Long getStaffId() {
        return staffId;
    }

    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getAccountState() {
        return accountState;
    }

    public void setAccountState(String accountState) {
        this.accountState = accountState == null ? null : accountState.trim();
    }

    public Date getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(Date lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }

	@Override
	public String toString() {
		return "XtUserAccount [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword
				+ ", staffId=" + staffId + ", companyId=" + companyId + ", accountState=" + accountState
				+ ", lastModifyDate=" + lastModifyDate + "]";
	}
    
    
    
}