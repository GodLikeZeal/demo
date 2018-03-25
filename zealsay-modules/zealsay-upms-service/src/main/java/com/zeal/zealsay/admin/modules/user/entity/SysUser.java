package com.zeal.zealsay.admin.modules.user.entity;

import com.zeal.zealsay.common.web.AbstractCommonEntity;

import java.util.Date;

/**
*@description 用户实体对象
*@author zeal
*@date 2018/3/25 18:18
*@version 1.0.0
*/
public class SysUser extends AbstractCommonEntity<SysUser> {
    private static final long serialVersionUID = 1L;
    private String id;  //用户主键
    private String username;  //用户名称
    private String password;  //登录密码
    private String salt;  //盐
    private String phoneNumber;  //手机号码
    private String userEmail;  //用户邮箱
    private String userQQ;  //用户QQ号码
    private String userOpenId;  //用户登录openId
    private String userRole; //用户角色
    private String userStatu;  //用户状态
    private Date createDate;  //创建时间
    private Date updateDate;  //更新时间
    private String isDel;  //是否删除

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserQQ() {
        return userQQ;
    }

    public void setUserQQ(String userQQ) {
        this.userQQ = userQQ;
    }

    public String getUserOpenId() {
        return userOpenId;
    }

    public void setUserOpenId(String userOpenId) {
        this.userOpenId = userOpenId;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String getUserStatu() {
        return userStatu;
    }

    public void setUserStatu(String userStatu) {
        this.userStatu = userStatu;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getIsDel() {
        return isDel;
    }

    public void setIsDel(String isDel) {
        this.isDel = isDel;
    }

    @Override
    public String toString() {
        return "SysUser{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", salt='" + salt + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userQQ='" + userQQ + '\'' +
                ", userOpenId='" + userOpenId + '\'' +
                ", userRole='" + userRole + '\'' +
                ", userStatu='" + userStatu + '\'' +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                ", isDel='" + isDel + '\'' +
                '}';
    }
}
