package com.sc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
//����_���۳��ⵥ
public class XsSaleDeliveryList implements Serializable {
    private Long salesId;//���۵����
    
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date creatListDate;//�Ƶ�����

    private String invoiceNumber;//��Ʊ����

    private Long userId;//�û����

    private Long customerId;//�ͻ����

    private BigDecimal saleAmount;//���۽��

    private String saleDeliveryStatus;//���۳���״̬

    private String isRebate;//�Ƿ���

    private String orderStatus;//����״̬

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

    public XsSaleDeliveryList(Long salesId, Date creatListDate, String invoiceNumber, Long userId, Long customerId, BigDecimal saleAmount, String saleDeliveryStatus, String isRebate, String orderStatus, String noteInformation, Long companyId, Date lastModifyDate) {
        this.salesId = salesId;
        this.creatListDate = creatListDate;
        this.invoiceNumber = invoiceNumber;
        this.userId = userId;
        this.customerId = customerId;
        this.saleAmount = saleAmount;
        this.saleDeliveryStatus = saleDeliveryStatus;
        this.isRebate = isRebate;
        this.orderStatus = orderStatus;
        this.noteInformation = noteInformation;
        this.companyId = companyId;
        this.lastModifyDate = lastModifyDate;
    }

    public XsSaleDeliveryList() {
        super();
    }

    public Long getSalesId() {
        return salesId;
    }

    public void setSalesId(Long salesId) {
        this.salesId = salesId;
    }

    public Date getCreatListDate() {
        return creatListDate;
    }

    public void setCreatListDate(Date creatListDate) {
        this.creatListDate = creatListDate;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber == null ? null : invoiceNumber.trim();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public BigDecimal getSaleAmount() {
        return saleAmount;
    }

    public void setSaleAmount(BigDecimal saleAmount) {
        this.saleAmount = saleAmount;
    }

    public String getSaleDeliveryStatus() {
        return saleDeliveryStatus;
    }

    public void setSaleDeliveryStatus(String saleDeliveryStatus) {
        this.saleDeliveryStatus = saleDeliveryStatus == null ? null : saleDeliveryStatus.trim();
    }

    public String getIsRebate() {
        return isRebate;
    }

    public void setIsRebate(String isRebate) {
        this.isRebate = isRebate == null ? null : isRebate.trim();
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
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
		return "XsSaleDeliveryList [salesId=" + salesId + ", creatListDate=" + creatListDate + ", invoiceNumber="
				+ invoiceNumber + ", userId=" + userId + ", customerId=" + customerId + ", saleAmount=" + saleAmount
				+ ", saleDeliveryStatus=" + saleDeliveryStatus + ", isRebate=" + isRebate + ", orderStatus="
				+ orderStatus + ", noteInformation=" + noteInformation + ", companyId=" + companyId
				+ ", lastModifyDate=" + lastModifyDate + "]";
	}
    
}