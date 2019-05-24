package com.bugong.domain;

public class BRole {
    private Integer id;

    private Integer roleNo;

    private String roleName;

    private String roleDescription;

    private String rs1;

    private String rs2;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleNo() {
        return roleNo;
    }

    public void setRoleNo(Integer roleNo) {
        this.roleNo = roleNo;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getRoleDescription() {
        return roleDescription;
    }

    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription == null ? null : roleDescription.trim();
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
}