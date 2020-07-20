package com.sc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

//����_��Ӧ����Ϣ��
public class CgStockSupplierInformation implements Serializable {
    private Long supplierId;//��Ӧ�̱��

    private String supplierName;//��Ӧ������

    private String supplierAbbreviation;//��Ӧ�̼��

    private String liaisons;//��ϵ��

    private BigDecimal fixedPhone;//�̶��绰

    private BigDecimal mobilePhone;//�ƶ��绰

    private BigDecimal contactFax;//��ϵ����

    private String contactAddress;//��ϵ��ַ

    private BigDecimal contactPostcode;//��ϵ�ʱ�

    private String mailbox;//����

    private String bankOfDeposit;//��������

    private BigDecimal accountNumber;//�����˺�

    private String companyHomepage;//��˾��ҳ

    private String isnotEffective;//�Ƿ���Ч

    private Long operaterId;//������Ա

    private String noteInformation;//��ע��Ϣ

    private BigDecimal companyId;//��˾���
     
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") 
    private Date lastModifyDate;//����޸�ʱ��

    private static final long serialVersionUID = 1L;

    public CgStockSupplierInformation(Long supplierId, String supplierName, String supplierAbbreviation, String liaisons, BigDecimal fixedPhone, BigDecimal mobilePhone, BigDecimal contactFax, String contactAddress, BigDecimal contactPostcode, String mailbox, String bankOfDeposit, BigDecimal accountNumber, String companyHomepage, String isnotEffective, Long operaterId, String noteInformation, BigDecimal companyId, Date lastModifyDate) {
        this.supplierId = supplierId;
        this.supplierName = supplierName;
        this.supplierAbbreviation = supplierAbbreviation;
        this.liaisons = liaisons;
        this.fixedPhone = fixedPhone;
        this.mobilePhone = mobilePhone;
        this.contactFax = contactFax;
        this.contactAddress = contactAddress;
        this.contactPostcode = contactPostcode;
        this.mailbox = mailbox;
        this.bankOfDeposit = bankOfDeposit;
        this.accountNumber = accountNumber;
        this.companyHomepage = companyHomepage;
        this.isnotEffective = isnotEffective;
        this.operaterId = operaterId;
        this.noteInformation = noteInformation;
        this.companyId = companyId;
        this.lastModifyDate = lastModifyDate;
    }

    public CgStockSupplierInformation() {
        super();
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName == null ? null : supplierName.trim();
    }

    public String getSupplierAbbreviation() {
        return supplierAbbreviation;
    }

    public void setSupplierAbbreviation(String supplierAbbreviation) {
        this.supplierAbbreviation = supplierAbbreviation == null ? null : supplierAbbreviation.trim();
    }

    public String getLiaisons() {
        return liaisons;
    }

    public void setLiaisons(String liaisons) {
        this.liaisons = liaisons == null ? null : liaisons.trim();
    }

    public BigDecimal getFixedPhone() {
        return fixedPhone;
    }

    public void setFixedPhone(BigDecimal fixedPhone) {
        this.fixedPhone = fixedPhone;
    }

    public BigDecimal getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(BigDecimal mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public BigDecimal getContactFax() {
        return contactFax;
    }

    public void setContactFax(BigDecimal contactFax) {
        this.contactFax = contactFax;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress == null ? null : contactAddress.trim();
    }

    public BigDecimal getContactPostcode() {
        return contactPostcode;
    }

    public void setContactPostcode(BigDecimal contactPostcode) {
        this.contactPostcode = contactPostcode;
    }

    public String getMailbox() {
        return mailbox;
    }

    public void setMailbox(String mailbox) {
        this.mailbox = mailbox == null ? null : mailbox.trim();
    }

    public String getBankOfDeposit() {
        return bankOfDeposit;
    }

    public void setBankOfDeposit(String bankOfDeposit) {
        this.bankOfDeposit = bankOfDeposit == null ? null : bankOfDeposit.trim();
    }

    public BigDecimal getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(BigDecimal accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCompanyHomepage() {
        return companyHomepage;
    }

    public void setCompanyHomepage(String companyHomepage) {
        this.companyHomepage = companyHomepage == null ? null : companyHomepage.trim();
    }

    public String getIsnotEffective() {
        return isnotEffective;
    }

    public void setIsnotEffective(String isnotEffective) {
        this.isnotEffective = isnotEffective == null ? null : isnotEffective.trim();
    }

    public Long getOperaterId() {
        return operaterId;
    }

    public void setOperaterId(Long operaterId) {
        this.operaterId = operaterId;
    }

    public String getNoteInformation() {
        return noteInformation;
    }

    public void setNoteInformation(String noteInformation) {
        this.noteInformation = noteInformation == null ? null : noteInformation.trim();
    }

    public BigDecimal getCompanyId() {
        return companyId;
    }

    public void setCompanyId(BigDecimal companyId) {
        this.companyId = companyId;
    }

    public Date getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(Date lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }

	@Override
	public String toString() {
		return "CgStockSupplierInformation [supplierId=" + supplierId + ", supplierName=" + supplierName
				+ ", supplierAbbreviation=" + supplierAbbreviation + ", liaisons=" + liaisons + ", fixedPhone="
				+ fixedPhone + ", mobilePhone=" + mobilePhone + ", contactFax=" + contactFax + ", contactAddress="
				+ contactAddress + ", contactPostcode=" + contactPostcode + ", mailbox=" + mailbox + ", bankOfDeposit="
				+ bankOfDeposit + ", accountNumber=" + accountNumber + ", companyHomepage=" + companyHomepage
				+ ", isnotEffective=" + isnotEffective + ", operaterId=" + operaterId + ", noteInformation="
				+ noteInformation + ", companyId=" + companyId + ", lastModifyDate=" + lastModifyDate + "]";
	}
    
}