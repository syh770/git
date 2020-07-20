package com.sc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
//���¡�����˾��Ϣ��
public class RsCompnayMessage implements Serializable {
    private Long compnayId;		//��˾���

    private String compnayName;	//��˾����

    private Long compnayCode;	//��˾����

    private String mailbox;	//����

    private String contacts; //��ϵ��

    private String compnayAddress; //��˾��ַ

    private BigDecimal fixedTelephone; //�̶��绰

    private BigDecimal mobilePhone; //�ƶ��绰

    private String fax; //����

    private BigDecimal bankOfDeposit; //��������

    private BigDecimal bankAccount; //�����˻�

    private String enabled; //�Ƿ���Ч

    private String remarks; //��ע��Ϣ
    
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastModifyDate; //����޸�ʱ��

    private static final long serialVersionUID = 1L;

    public RsCompnayMessage(Long compnayId, String compnayName, Long compnayCode, String mailbox, String contacts, String compnayAddress, BigDecimal fixedTelephone, BigDecimal mobilePhone, String fax, BigDecimal bankOfDeposit, BigDecimal bankAccount, String enabled, String remarks, Date lastModifyDate) {
        this.compnayId = compnayId;
        this.compnayName = compnayName;
        this.compnayCode = compnayCode;
        this.mailbox = mailbox;
        this.contacts = contacts;
        this.compnayAddress = compnayAddress;
        this.fixedTelephone = fixedTelephone;
        this.mobilePhone = mobilePhone;
        this.fax = fax;
        this.bankOfDeposit = bankOfDeposit;
        this.bankAccount = bankAccount;
        this.enabled = enabled;
        this.remarks = remarks;
        this.lastModifyDate = lastModifyDate;
    }

    public RsCompnayMessage() {
        super();
    }

    public Long getCompnayId() {
        return compnayId;
    }

    public void setCompnayId(Long compnayId) {
        this.compnayId = compnayId;
    }

    public String getCompnayName() {
        return compnayName;
    }

    public void setCompnayName(String compnayName) {
        this.compnayName = compnayName == null ? null : compnayName.trim();
    }

    public Long getCompnayCode() {
        return compnayCode;
    }

    public void setCompnayCode(Long compnayCode) {
        this.compnayCode = compnayCode;
    }

    public String getMailbox() {
        return mailbox;
    }

    public void setMailbox(String mailbox) {
        this.mailbox = mailbox == null ? null : mailbox.trim();
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts == null ? null : contacts.trim();
    }

    public String getCompnayAddress() {
        return compnayAddress;
    }

    public void setCompnayAddress(String compnayAddress) {
        this.compnayAddress = compnayAddress == null ? null : compnayAddress.trim();
    }

    public BigDecimal getFixedTelephone() {
        return fixedTelephone;
    }

    public void setFixedTelephone(BigDecimal fixedTelephone) {
        this.fixedTelephone = fixedTelephone;
    }

    public BigDecimal getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(BigDecimal mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    public BigDecimal getBankOfDeposit() {
        return bankOfDeposit;
    }

    public void setBankOfDeposit(BigDecimal bankOfDeposit) {
        this.bankOfDeposit = bankOfDeposit;
    }

    public BigDecimal getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BigDecimal bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled == null ? null : enabled.trim();
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

	@Override
	public String toString() {
		return "RsCompnayMessage [compnayId=" + compnayId + ", compnayName=" + compnayName + ", compnayCode="
				+ compnayCode + ", mailbox=" + mailbox + ", contacts=" + contacts + ", compnayAddress=" + compnayAddress
				+ ", fixedTelephone=" + fixedTelephone + ", mobilePhone=" + mobilePhone + ", fax=" + fax
				+ ", bankOfDeposit=" + bankOfDeposit + ", bankAccount=" + bankAccount + ", enabled=" + enabled
				+ ", remarks=" + remarks + ", lastModifyDate=" + lastModifyDate + "]";
	}
    
    
}

