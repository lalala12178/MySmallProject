package com.lalala.houtai.pojo;

public class Role {
    String roleName;
    String chiRole;

    public Role(String roleName, String chiRole) {
        this.roleName = roleName;
        this.chiRole = chiRole;
    }

    public Role() {
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleName='" + roleName + '\'' +
                ", chiRole='" + chiRole + '\'' +
                '}';
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getChiRole() {
        return chiRole;
    }

    public void setChiRole(String chiRole) {
        this.chiRole = chiRole;
    }
}
