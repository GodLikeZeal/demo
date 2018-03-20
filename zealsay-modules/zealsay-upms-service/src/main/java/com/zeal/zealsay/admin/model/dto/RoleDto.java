package com.zeal.zealsay.admin.model.dto;

import com.zeal.zealsay.admin.model.entity.SysRole;

/**
 * @author zeal
 * @date 2018/1/20
 * 角色Dto
 */
public class RoleDto extends SysRole {
    /**
     * 角色部门Id
     */
    private Integer roleDeptId;

    /**
     * 部门名称
     */
    private String deptName;

    public Integer getRoleDeptId() {
        return roleDeptId;
    }

    public void setRoleDeptId(Integer roleDeptId) {
        this.roleDeptId = roleDeptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
