package com.bugong.domain;

import java.util.Date;

public class BComment {
    private Integer id;

    private Integer commentNo;

    private Integer comAeticleId;

    private Integer comUserId;

    private Integer userId;

    private Date createData;

    private Date updateData;

    private Integer status;

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

    public Integer getCommentNo() {
        return commentNo;
    }

    public void setCommentNo(Integer commentNo) {
        this.commentNo = commentNo;
    }

    public Integer getComAeticleId() {
        return comAeticleId;
    }

    public void setComAeticleId(Integer comAeticleId) {
        this.comAeticleId = comAeticleId;
    }

    public Integer getComUserId() {
        return comUserId;
    }

    public void setComUserId(Integer comUserId) {
        this.comUserId = comUserId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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