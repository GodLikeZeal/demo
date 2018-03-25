package com.zeal.zealsay.admin.modules.user.dao;

import com.zeal.zealsay.admin.modules.user.entity.SysUser;
import com.zeal.zealsay.common.annotation.MyBatisDao;
import com.zeal.zealsay.common.web.CommonDao;

/**
*@description sys_user持久层接口
*@author zeal
*@date 2018/3/25 15:14
*@version 1.0.0
*/
@MyBatisDao
public interface SysUserDao extends CommonDao<SysUser> {
}
