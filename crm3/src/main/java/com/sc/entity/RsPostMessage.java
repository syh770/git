package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
//���¡���ְ����Ϣ��
public class RsPostMessage implements Serializable {
    private Long postId; //ְ����

    private String postName; //ְ������

    private Long dtmartmentId;//���ű��

    private String remarkExplain; //��ע˵��

    private Long compnayId; //��˾���

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastModifyDate; //����޸�ʱ��

    private static final long serialVersionUID = 1L;

    public RsPostMessage(Long postId, String postName, Long dtmartmentId, String remarkExplain, Long compnayId, Date lastModifyDate) {
        this.postId = postId;
        this.postName = postName;
        this.dtmartmentId = dtmartmentId;
        this.remarkExplain = remarkExplain;
        this.compnayId = compnayId;
        this.lastModifyDate = lastModifyDate;
    }

    public RsPostMessage() {
        super();
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName == null ? null : postName.trim();
    }

    public Long getDtmartmentId() {
        return dtmartmentId;
    }

    public void setDtmartmentId(Long dtmartmentId) {
        this.dtmartmentId = dtmartmentId;
    }

    public String getRemarkExplain() {
        return remarkExplain;
    }

    public void setRemarkExplain(String remarkExplain) {
        this.remarkExplain = remarkExplain == null ? null : remarkExplain.trim();
    }

    public Long getCompnayId() {
        return compnayId;
    }

    public void setCompnayId(Long compnayId) {
        this.compnayId = compnayId;
    }

    public Date getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(Date lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }

	@Override
	public String toString() {
		return "RsPostMessage [postId=" + postId + ", postName=" + postName + ", dtmartmentId=" + dtmartmentId
				+ ", remarkExplain=" + remarkExplain + ", compnayId=" + compnayId + ", lastModifyDate=" + lastModifyDate
				+ "]";
	}
    
    
    
    
    
}