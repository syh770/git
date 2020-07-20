package com.sc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

//����_�貹����Ʒ��
public class CgStockReplenishmentGoods implements Serializable {
    private Long id;//���

    private BigDecimal goosId;//��Ʒ���

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date deliveryTime;//����ʱ��

    private String state;//״̬

    private Long operaterId;//������Ա

    private String noteInformation;//��ע��Ϣ

    private BigDecimal companyId;//��˾���

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastModifyDate;//����޸�����

    private static final long serialVersionUID = 1L;

    public CgStockReplenishmentGoods(Long id, BigDecimal goosId, Date deliveryTime, String state, Long operaterId, String noteInformation, BigDecimal companyId, Date lastModifyDate) {
        this.id = id;
        this.goosId = goosId;
        this.deliveryTime = deliveryTime;
        this.state = state;
        this.operaterId = operaterId;
        this.noteInformation = noteInformation;
        this.companyId = companyId;
        this.lastModifyDate = lastModifyDate;
    }

    public CgStockReplenishmentGoods() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getGoosId() {
        return goosId;
    }

    public void setGoosId(BigDecimal goosId) {
        this.goosId = goosId;
    }

    public Date getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
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
		return "CgStockReplenishmentGoods [id=" + id + ", goosId=" + goosId + ", deliveryTime=" + deliveryTime
				+ ", state=" + state + ", operaterId=" + operaterId + ", noteInformation=" + noteInformation
				+ ", companyId=" + companyId + ", lastModifyDate=" + lastModifyDate + "]";
	}
    
}