/** 
 * Copyright ® 2016-2018 zeal  zhangleifor@163.com.
 * All right reserved. 
 */
package com.zeal.zealsay.admin.modules.article.controller;


import com.zeal.zealsay.common.entity.R;
import com.zeal.zealsay.common.paginate.PaginateDataResponse;
import com.zeal.zealsay.admin.modules.article.entity.Article;
import com.zeal.zealsay.admin.modules.article.service.ArticleService;
import com.zeal.zealsay.common.exception.ExceptionUtils;
import com.zeal.zealsay.common.exception.ZealException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

/**
 * articleRest服务接口
 *
 * @author zeal
 * @date 2018-03-25 20:18:41
 */
@RestController
@RequestMapping(value="article")
public class ArticleController {

    @Autowired
    ArticleService articleService;

    /**
     * 通过ID查找对象
     * @author zeal
     * @date 2018-03-25 20:18:41
     */
    @RequestMapping(value="/findById/{id}",method = RequestMethod.GET)
    public R findById(@PathVariable String id,HttpServletRequest request,
                                            HttpServletResponse response){
        try{
            return new R(articleService.findById(id));
        }
        catch(Exception er) {
            ExceptionUtils.LoadLog(er);
            throw new ZealException("系统异常");
        }
    }

    /**
     * 通过Class查找对象
     * @author zeal
     * @date 2018-03-25 20:18:41
     */
    @RequestMapping(value="/findByClass",method = RequestMethod.POST)
    public R findByClass(@RequestBody Article article,
                                            HttpServletRequest request,HttpServletResponse response){
        try{
            return new R(articleService.findByClass(article));
        }
        catch(Exception er) {
            ExceptionUtils.LoadLog(er);
            throw new ZealException("系统异常");
        }
    }

    /**
     * 通过Class分页查找对象
     * @author zeal
     * @date 2018-03-25 20:18:41
     */
    @RequestMapping(value="/findByClassWithPaginate",method = RequestMethod.POST)
    public PaginateDataResponse findByClassWithPaginate(@RequestParam Map<String,String> allRequestParam,
                                                        @RequestBody Article article,
                                                        HttpServletRequest request, HttpServletResponse response){

        try{
            if(allRequestParam.containsKey("size")){
                article.setSize(Integer.valueOf(allRequestParam.get("size")));
            }
            if(allRequestParam.containsKey("start")){
                article.setStart(Integer.valueOf(allRequestParam.get("start")));
            }
            if(allRequestParam.containsKey("order")){
                article.setOrder(String.valueOf(allRequestParam.get("order")));
            }
            if(allRequestParam.containsKey("sort")){
                article.setSort(String.valueOf(allRequestParam.get("sort")));
            }
            return  articleService.listPage(article);
        }
        catch(Exception er){
            ExceptionUtils.LoadLog(er);
            throw new ZealException("系统异常");
        }
    }

    /**
     * 通过url参数查找分页对象
     * @author zeal
     * @date 2018-03-25 20:18:41
     */
    @RequestMapping(value="/findByClassWithPaginate",method = RequestMethod.GET)
    public PaginateDataResponse findByClassWithPaginate(@RequestParam Map<String,String> allRequestParam,
                                                        HttpServletRequest request, HttpServletResponse response){

        try{
            Article article = new Article(allRequestParam);
            return  articleService.listPage(article);
        }
        catch(Exception er){
            ExceptionUtils.LoadLog(er);
            throw new ZealException("系统异常");
        }
    }

    /**
     * 新增记录
     * @author zeal
     * @date 2018-03-25 20:18:41
     */
    @RequestMapping(value="/insert",method = RequestMethod.POST)
    public R insert(@RequestBody Article article,HttpServletRequest request,
                       HttpServletResponse response){
        try{
              return  new R(articleService.insert(article));
        }
        catch(Exception er) {
            ExceptionUtils.LoadLog(er);
            throw new ZealException("系统异常");
        }
    }

    /**
     * 更新数据
     * @author zeal
     * @date 2018-03-25 20:18:41
     */
    @RequestMapping(value="/update",method = RequestMethod.POST)
    public R update(@RequestBody Article article,HttpServletRequest request,
                       HttpServletResponse response){
        try{
            return new R(articleService.update(article));
        }
        catch(Exception er) {
            ExceptionUtils.LoadLog(er);
            throw new ZealException("系统异常");
        }
    }

    /**
     * 通过Class删除信息
     * @author zeal
     * @date 2018-03-25 20:18:41
     */
    @RequestMapping(value="/delete",method = RequestMethod.POST)
    public R delete(@RequestBody Article article,HttpServletRequest request,
                       HttpServletResponse response){
        try{
             return new R(articleService.delete(article));
        }
        catch(Exception er) {
            ExceptionUtils.LoadLog(er);
            throw new ZealException("系统异常");
        }
    }

    /**
     * 通过ID删除信息
     * @author zeal
     * @date 2018-03-25 20:18:41
     */
    @RequestMapping(value="/deleteById/{id}",method = RequestMethod.POST)
    public R deleteById(@PathVariable String id,HttpServletRequest request,
                       HttpServletResponse response){
        try{
            return new R(articleService.deleteById(id));
        }
        catch(Exception er) {
            ExceptionUtils.LoadLog(er);
            throw new ZealException("系统异常");
        }
    }
}