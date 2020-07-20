package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
//�칫��������ָ���
public class BgExamineTarget implements Serializable {
    private Long targetId;  //ָ����

    private String examineTarget;  //����ָ��

    private String remarksExplain;  //��ע˵��

    private Long companyId;  //��˾���

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lastModifyDate; //����޸�ʱ��

    private static final long serialVersionUID = 1L;

    public BgExamineTarget(Long targetId, String examineTarget, String remarksExplain, Long companyId, Date lastModifyDate) {
        this.targetId = targetId;
        this.examineTarget = examineTarget;
        this.remarksExplain = remarksExplain;
        this.companyId = companyId;
        this.lastModifyDate = lastModifyDate;
    }

    public BgExamineTarget() {
        super();
    }

    public Long getTargetId() {
        return targetId;
    }

    public void setTargetId(Long targetId) {
        this.targetId = targetId;
    }

    public String getExamineTarget() {
        return examineTarget;
    }

    public void setExamineTarget(String examineTarget) {
        this.examineTarget = examineTarget == null ? null : examineTarget.trim();
    }

    public String getRemarksExplain() {
        return remarksExplain;
    }

    public void setRemarksExplain(String remarksExplain) {
        this.remarksExplain = remarksExplain == null ? null : remarksExplain.trim();
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
		return "BgExamineTarget [targetId=" + targetId + ", examineTarget=" + examineTarget + ", remarksExplain="
				+ remarksExplain + ", companyId=" + companyId + ", lastModifyDate=" + lastModifyDate + "]";
	}
    
}