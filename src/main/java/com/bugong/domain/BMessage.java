package com.bugong.domain;

import java.util.Date;

public class BMessage {
    private Integer id;

    private Integer messageNo;

    private Integer userId;

    private Integer messageObjectId;

    private Date createData;

    private Date updateData;

    private String rs1;

    private String rs2;

    private String rs3;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMessageNo() {
        return messageNo;
    }

    public void setMessageNo(Integer messageNo) {
        this.messageNo = messageNo;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getMessageObjectId() {
        return messageObjectId;
    }

    public void setMessageObjectId(Integer messageObjectId) {
        this.messageObjectId = messageObjectId;
    }

    public Date getCreateData() {
        return createData;
    }

    public void setCreateData(Date createData) {
        this.createData = createData;
    }

    public Date getUpdateData() {
        return updateData;
    }

    public void setUpdateData(Date updateData) {
        this.updateData = updateData;
    }

    public String getRs1() {
        return rs1;
    }

    public void setRs1(String rs1) {
        this.rs1 = rs1 == null ? null : rs1.trim();
    }

    public String getRs2() {
        return rs2;
    }

    public void setRs2(String rs2) {
        this.rs2 = rs2 == null ? null : rs2.trim();
    }

    public String getRs3() {
        return rs3;
    }

    public void setRs3(String rs3) {
        this.rs3 = rs3 == null ? null : rs3.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}