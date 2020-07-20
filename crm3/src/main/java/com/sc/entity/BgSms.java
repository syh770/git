package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
//�칫��������Ϣ��
public class BgSms implements Serializable {
    private Long bhId; //���

    private String title; //����

    private String content; //����

    private String sendPerson; //������

    private Long companyId; //��˾���
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lastModifyDate; //����޸�ʱ��

    private static final long serialVersionUID = 1L;

    public BgSms(Long bhId, String title, String content, String sendPerson, Long companyId, Date lastModifyDate) {
        this.bhId = bhId;
        this.title = title;
        this.content = content;
        this.sendPerson = sendPerson;
        this.companyId = companyId;
        this.lastModifyDate = lastModifyDate;
    }

    public BgSms() {
        super();
    }

    public Long getBhId() {
        return bhId;
    }

    public void setBhId(Long bhId) {
        this.bhId = bhId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getSendPerson() {
        return sendPerson;
    }

    public void setSendPerson(String sendPerson) {
        this.sendPerson = sendPerson == null ? null : sendPerson.trim();
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
		return "BgSms [bhId=" + bhId + ", title=" + title + ", content=" + content + ", sendPerson=" + sendPerson
				+ ", companyId=" + companyId + ", lastModifyDate=" + lastModifyDate + "]";
	}
    
}