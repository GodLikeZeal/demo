package com.zeal.zealsay.admin.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.zeal.zealsay.admin.mapper.SysLogMapper;
import com.zeal.zealsay.admin.service.SysLogService;
import com.zeal.zealsay.common.constant.CommonConstant;
import com.zeal.zealsay.common.entity.SysLog;
import com.zeal.zealsay.common.util.Assert;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * <p>
 * 日志表 服务实现类
 * </p>
 *
 * @author zeal
 * @since 2017-11-20
 */
@Service
public class SysLogServiceImpl extends ServiceImpl<SysLogMapper, SysLog> implements SysLogService {

    @Override
    public Boolean updateByLogId(Long id) {
        Assert.isNull(id, "日志ID为空");

        SysLog sysLog = new SysLog();
        sysLog.setId(id);
        sysLog.setDelFlag(CommonConstant.STATUS_DEL);
        sysLog.setUpdateTime(new Date());
        return updateById(sysLog);
    }
}
