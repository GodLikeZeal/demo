package com.zeal.zealsay.admin.controller;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.zeal.zealsay.admin.service.SysLogService;
import com.zeal.zealsay.common.constant.CommonConstant;
import com.zeal.zealsay.common.util.Query;
import com.zeal.zealsay.common.util.R;
import com.zeal.zealsay.common.web.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * <p>
 * 日志表 前端控制器
 * </p>
 *
 * @author lengleng
 * @since 2017-11-20
 */
@RestController
@RequestMapping("/log")
public class LogController extends BaseController {
    @Autowired
    private SysLogService sysLogService;

    /**
     * 分页查询日志信息
     *
     * @param params 分页对象
     * @return 分页对象
     */
    @RequestMapping("/logPage")
    public Page logPage(@RequestParam Map<String, Object> params) {
        params.put(CommonConstant.DEL_FLAG, CommonConstant.STATUS_NORMAL);
        return sysLogService.selectPage(new Query<>(params), new EntityWrapper<>());
    }

    /**
     * 根据ID
     *
     * @param id ID
     * @return success/false
     */
    @DeleteMapping("/{id}")
    public R<Boolean> delete(@PathVariable Long id) {
        return new R<>(sysLogService.updateByLogId(id));
    }
}
