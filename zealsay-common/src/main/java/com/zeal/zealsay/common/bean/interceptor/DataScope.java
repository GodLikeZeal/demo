package com.zeal.zealsay.common.bean.interceptor;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.HashMap;
import java.util.List;

/**
 * @author zeal
 * @date 2018/1/19
 * 数据权限、参考guns实现
 * 2018年02月12日  增强查询参数
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class DataScope extends HashMap {
    /**
     * 限制范围的字段名称
     */
    private String scopeName = "dept_id";

    /**
     * 具体的数据范围
     */
    private List<Integer> deptIds;

    /**
     * 是否只查询本部门
     */
    private Boolean isOnly = false;

    public String getScopeName() {
        return scopeName;
    }

    public void setScopeName(String scopeName) {
        this.scopeName = scopeName;
    }

    public List<Integer> getDeptIds() {
        return deptIds;
    }

    public void setDeptIds(List<Integer> deptIds) {
        this.deptIds = deptIds;
    }

    public Boolean getOnly() {
        return isOnly;
    }

    public void setOnly(Boolean only) {
        isOnly = only;
    }
}
