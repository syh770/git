package com.sc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
//����_���������
public class XsSaleDetail implements Serializable {
    private Long salesDetailId;//���۵�������

    private Long salesId;//���۵����

    private Long goodsId;//��Ʒ���

    private Long goodsNumber;//��Ʒ����

    private BigDecimal goodsPrice;//��Ʒ�۸�

    private String noteInformation;//��ע˵��

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

    public XsSaleDetail(Long salesDetailId, Long salesId, Long goodsId, Long goodsNumber, BigDecimal goodsPrice, String noteInformation, Long companyId, Date lastModifyDate) {
        this.salesDetailId = salesDetailId;
        this.salesId = salesId;
        this.goodsId = goodsId;
        this.goodsNumber = goodsNumber;
        this.goodsPrice = goodsPrice;
        this.noteInformation = noteInformation;
        this.companyId = companyId;
        this.lastModifyDate = lastModifyDate;
    }

    public XsSaleDetail() {
        super();
    }

    public Long getSalesDetailId() {
        return salesDetailId;
    }

    public void setSalesDetailId(Long salesDetailId) {
        this.salesDetailId = salesDetailId;
    }

    public Long getSalesId() {
        return salesId;
    }

    public void setSalesId(Long salesId) {
        this.salesId = salesId;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public Long getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(Long goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
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
		return "XsSaleDetail [salesDetailId=" + salesDetailId + ", salesId=" + salesId + ", goodsId=" + goodsId
				+ ", goodsNumber=" + goodsNumber + ", goodsPrice=" + goodsPrice + ", noteInformation=" + noteInformation
				+ ", companyId=" + companyId + ", lastModifyDate=" + lastModifyDate + "]";
	}
    
}