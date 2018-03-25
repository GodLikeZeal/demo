package com.zeal.zealsay.common.web;



import com.zeal.zealsay.common.paginate.PaginateQueryProperty;

import java.io.Serializable;

/**
*@description 通用抽象实体类
*@author zeal
*@date 2018/3/25 15:11
*@version 1.0.0
*/
public abstract class AbstractCommonEntity<T> extends PaginateQueryProperty<T> implements Cloneable,Serializable {

    /**
     * 删除标记（0：正常；1：删除；2：审核；）
     */
    public static final String DEL_FLAG_NORMAL = "0";
    public static final String DEL_FLAG_DEL = "1";
    public static final String DEL_FLAG_AUDIT = "2";

    @Override
    public T clone() throws CloneNotSupportedException {
        T newBody =  (T) super.clone();
        return newBody;
    }
    protected String islike; //是否模糊搜索

    public String getIslike() {
        return islike;
    }

    public void setIslike(String islike) {
        this.islike = islike;
    }
}
