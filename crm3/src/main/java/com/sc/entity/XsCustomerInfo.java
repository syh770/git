package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
//����_�ͻ���Ϣ��
public class XsCustomerInfo implements Serializable {
    private Long customerId;//�ͻ����

    private String customerName;//�ͻ�����

    private String customerAttr;//�ͻ�����

    private String website;//��վ

    private String stockCode;//��Ʊ����

    private String unitHigher;//�ϼ���λ

    private String owner;//������

    private Long numberEmployee;//Ա����

    private Long industryId;//��ҵ���

    private String customerType;//�ͻ�����

    private String customerState;//�ͻ�״̬

    private String customerSource;//�ͻ���Դ

    private Long headId;//�����˱��

    private String phoneFixed;//�̶��绰

    private String phoneMove;//�ƶ��绰

    private String customerFax;//�ͻ�����

    private String bank;//��������

    private String bankAccount;//�����˻�
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date nextContactDate;//�´���ϵʱ��

    private String email;//�����ʼ�

    private String sicCode;//SIC����

    private String payWay;//֧����ʽ

    private String isEffective;//�Ƿ���Ч

    private String addressDetail;//��ϸ��ַ

    private String noteInformation;//��ע��Ϣ

    private Long companyId;//��˾���
    
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lastModifyDate;//����޸�ʱ��

    //��չ���� ���ڲ�ѯ-start
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date datemin;
    
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date datemax;
    
    
    public Date getDatemin() {
		return datemin;
	}

	public void setDatemin(Date datemin) {
		this.datemin = datemin;
	}

	public Date getDatemax() {
		return datemax;
	}

	public void setDatemax(Date datemax) {
		this.datemax = datemax;
	}
	//��չ���� ���ڲ�ѯ-end
	 
	private static final long serialVersionUID = 1L;

    public XsCustomerInfo(Long customerId, String customerName, String customerAttr, String website, String stockCode, String unitHigher, String owner, Long numberEmployee, Long industryId, String customerType, String customerState, String customerSource, Long headId, String phoneFixed, String phoneMove, String customerFax, String bank, String bankAccount, Date nextContactDate, String email, String sicCode, String payWay, String isEffective, String addressDetail, String noteInformation, Long companyId, Date lastModifyDate) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAttr = customerAttr;
        this.website = website;
        this.stockCode = stockCode;
        this.unitHigher = unitHigher;
        this.owner = owner;
        this.numberEmployee = numberEmployee;
        this.industryId = industryId;
        this.customerType = customerType;
        this.customerState = customerState;
        this.customerSource = customerSource;
        this.headId = headId;
        this.phoneFixed = phoneFixed;
        this.phoneMove = phoneMove;
        this.customerFax = customerFax;
        this.bank = bank;
        this.bankAccount = bankAccount;
        this.nextContactDate = nextContactDate;
        this.email = email;
        this.sicCode = sicCode;
        this.payWay = payWay;
        this.isEffective = isEffective;
        this.addressDetail = addressDetail;
        this.noteInformation = noteInformation;
        this.companyId = companyId;
        this.lastModifyDate = lastModifyDate;
    }

    public XsCustomerInfo() {
        super();
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public String getCustomerAttr() {
        return customerAttr;
    }

    public void setCustomerAttr(String customerAttr) {
        this.customerAttr = customerAttr == null ? null : customerAttr.trim();
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website == null ? null : website.trim();
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode == null ? null : stockCode.trim();
    }

    public String getUnitHigher() {
        return unitHigher;
    }

    public void setUnitHigher(String unitHigher) {
        this.unitHigher = unitHigher == null ? null : unitHigher.trim();
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner == null ? null : owner.trim();
    }

    public Long getNumberEmployee() {
        return numberEmployee;
    }

    public void setNumberEmployee(Long numberEmployee) {
        this.numberEmployee = numberEmployee;
    }

    public Long getIndustryId() {
        return industryId;
    }

    public void setIndustryId(Long industryId) {
        this.industryId = industryId;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType == null ? null : customerType.trim();
    }

    public String getCustomerState() {
        return customerState;
    }

    public void setCustomerState(String customerState) {
        this.customerState = customerState == null ? null : customerState.trim();
    }

    public String getCustomerSource() {
        return customerSource;
    }

    public void setCustomerSource(String customerSource) {
        this.customerSource = customerSource == null ? null : customerSource.trim();
    }

    public Long getHeadId() {
        return headId;
    }

    public void setHeadId(Long headId) {
        this.headId = headId;
    }

    public String getPhoneFixed() {
        return phoneFixed;
    }

    public void setPhoneFixed(String phoneFixed) {
        this.phoneFixed = phoneFixed == null ? null : phoneFixed.trim();
    }

    public String getPhoneMove() {
        return phoneMove;
    }

    public void setPhoneMove(String phoneMove) {
        this.phoneMove = phoneMove == null ? null : phoneMove.trim();
    }

    public String getCustomerFax() {
        return customerFax;
    }

    public void setCustomerFax(String customerFax) {
        this.customerFax = customerFax == null ? null : customerFax.trim();
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank == null ? null : bank.trim();
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount == null ? null : bankAccount.trim();
    }

    public Date getNextContactDate() {
        return nextContactDate;
    }

    public void setNextContactDate(Date nextContactDate) {
        this.nextContactDate = nextContactDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getSicCode() {
        return sicCode;
    }

    public void setSicCode(String sicCode) {
        this.sicCode = sicCode == null ? null : sicCode.trim();
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay == null ? null : payWay.trim();
    }

    public String getIsEffective() {
        return isEffective;
    }

    public void setIsEffective(String isEffective) {
        this.isEffective = isEffective == null ? null : isEffective.trim();
    }

    public String getAddressDetail() {
        return addressDetail;
    }

    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail == null ? null : addressDetail.trim();
    }

    public String getNoteInformation() {
        return noteInformation;
    }

    public void setNoteInformation(String noteInformation) {
        this.noteInformation = noteInformation == null ? null : noteInformation.trim();
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
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
		return "XsCustomerInfo [customerId=" + customerId + ", customerName=" + customerName + ", customerAttr="
				+ customerAttr + ", website=" + website + ", stockCode=" + stockCode + ", unitHigher=" + unitHigher
				+ ", owner=" + owner + ", numberEmployee=" + numberEmployee + ", industryId=" + industryId
				+ ", customerType=" + customerType + ", customerState=" + customerState + ", customerSource="
				+ customerSource + ", headId=" + headId + ", phoneFixed=" + phoneFixed + ", phoneMove=" + phoneMove
				+ ", customerFax=" + customerFax + ", bank=" + bank + ", bankAccount=" + bankAccount
				+ ", nextContactDate=" + nextContactDate + ", email=" + email + ", sicCode=" + sicCode + ", payWay="
				+ payWay + ", isEffective=" + isEffective + ", addressDetail=" + addressDetail + ", noteInformation="
				+ noteInformation + ", companyId=" + companyId + ", lastModifyDate=" + lastModifyDate + "]";
	}
    
}