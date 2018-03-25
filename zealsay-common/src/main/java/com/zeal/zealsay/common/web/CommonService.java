package com.zeal.zealsay.common.web;


import com.google.common.collect.Lists;
import com.zeal.zealsay.common.paginate.PaginateDataResponse;
import com.zeal.zealsay.common.paginate.PaginateQueryProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


/**
*@description 通用service方法
*@author zeal
*@date 2018/3/25 15:40
*@version 1.0.0
*/
@Transactional(readOnly = true )
public class CommonService <D extends CommonDao<T>, T extends PaginateQueryProperty<T>> {
    /**
     * 日志对象
     */
    protected Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    protected D dao;

    /**
     * 通过ID查找
     * @param id
     * @return
     */
    //Ehcache的spring缓存注解，在userCache中缓存id为id的对象
//    @Cacheable(value = "userCache",key="entity+findById+#id")
    public T findById(String id){
        T entity = dao.findById(id);
        return entity;
    }

    /**
     * 通过Class查找
     * @param entity
     * @return
     */
//    @Cacheable(value = "userCache",key = "#root.targetClass")
    public List<T> findByClass(T entity) {
        return dao.findByClass(entity);
    }

    /**
     * 新增记录
     * @param entity
     * @return
     */
//    @CacheEvict(value="userCache",key="0",beforeInvocation=true)
    @Transactional(propagation = Propagation.REQUIRED)
    public Integer insert(T entity){
        return dao.insert(entity);
    }

    /**
     * 更新记录
     * @param entity
     * @return
     */
//    @CachePut(value = "userCache",key = "#entity.id")
    @Transactional(propagation = Propagation.REQUIRED)
    public Integer update(T entity){
        return dao.update(entity);
    }


    /**
     * 通过class 伪删除记录
     * @param limitEntity
     * @return
     */
//    @CacheEvict(value = "userCache",key = "#root.targetClass")
    @Transactional(propagation = Propagation.REQUIRED)
    public Integer del(T limitEntity){
        return dao.del(limitEntity);
    }

    /**
     * 通过ID伪删除记录
     * @param id
     * @return
     */
//    @CacheEvict(value = "userCache",key = "#id")
    @Transactional(propagation = Propagation.REQUIRED)
    public Integer delById(String id){
        return dao.delById(id);
    }

    /**
     * 通过class 删除记录
     * @param limitEntity
     * @return
     */
//    @CacheEvict(value = "userCache",key = "#root.targetClass")
    @Transactional(propagation = Propagation.REQUIRED)
    public Integer delete(T limitEntity){
        return dao.delete(limitEntity);
    }

    /**
     * 通过ID删除记录
     * @param id
     * @return
     */
//    @CacheEvict(value = "userCache",key = "#id")
    @Transactional(propagation = Propagation.REQUIRED)
    public Integer deleteById(String id){
        return dao.deleteById(id);
    }


    /**
     * 分页查询
     * @param entity
     * @return
     */
//    @Cacheable(value = "userCache",key = "#root.targetClass")
    public PaginateDataResponse listPage(T entity){
        List<T> entityList = dao.findByClassPaginate(entity);
        PaginateDataResponse response = new PaginateDataResponse();
        response.setStart(entity.getStart());
        response.setSize(entity.getSize());
        response.setSort(entity.getSort());
        response.setOrder(entity.getOrder());
        response.setTotal(dao.findByClassPaginateCount(entity));
        response.setData(entityList);
        response.setRows(entityList);
        return response;
    }


}
