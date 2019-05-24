package com.bugong.domain;

import java.util.Date;

public class BUser {
    private Integer id;

    private Integer userNo;

    private String userName;

    private String userPwd;

    private String realName;

    private String email;

    private String userDescription;

    private String icon;

    private Integer roleId;

    private Date createData;

    private Date updateData;

    private String rs1;

    private String rs2;

    private String rs3;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserNo() {
        return userNo;
    }

    public void setUserNo(Integer userNo) {
        this.userNo = userNo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getUserDescription() {
        return userDescription;
    }

    public void setUserDescription(String userDescription) {
        this.userDescription = userDescription == null ? null : userDescription.trim();
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
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
}