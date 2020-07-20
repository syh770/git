package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
//�칫�������������
public class BgTaskDedail implements Serializable {
    private Long bhId; //���

    private Long taskId; //������

    private Long acceptUserId; //����������

    private String whetherFinish; //�Ƿ����

    private String state; //״��

    private Long companyId; //��˾���
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lastModifyDate; //����޸�ʱ��

    private static final long serialVersionUID = 1L;

    public BgTaskDedail(Long bhId, Long taskId, Long acceptUserId, String whetherFinish, String state, Long companyId, Date lastModifyDate) {
        this.bhId = bhId;
        this.taskId = taskId;
        this.acceptUserId = acceptUserId;
        this.whetherFinish = whetherFinish;
        this.state = state;
        this.companyId = companyId;
        this.lastModifyDate = lastModifyDate;
    }

    public BgTaskDedail() {
        super();
    }

    public Long getBhId() {
        return bhId;
    }

    public void setBhId(Long bhId) {
        this.bhId = bhId;
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public Long getAcceptUserId() {
        return acceptUserId;
    }

    public void setAcceptUserId(Long acceptUserId) {
        this.acceptUserId = acceptUserId;
    }

    public String getWhetherFinish() {
        return whetherFinish;
    }

    public void setWhetherFinish(String whetherFinish) {
        this.whetherFinish = whetherFinish == null ? null : whetherFinish.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
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
		return "BgTaskDedail [bhId=" + bhId + ", taskId=" + taskId + ", acceptUserId=" + acceptUserId
				+ ", whetherFinish=" + whetherFinish + ", state=" + state + ", companyId=" + companyId
				+ ", lastModifyDate=" + lastModifyDate + "]";
	}
    
}