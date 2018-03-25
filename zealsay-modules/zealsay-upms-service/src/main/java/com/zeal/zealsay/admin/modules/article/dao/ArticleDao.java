/** 
 * Copyright ® 2016-2018 zeal  1332949188@qq.com.
 * All right reserved. 
 */
package com.zeal.zealsay.admin.modules.article.dao;

import com.zeal.zealsay.common.annotation.MyBatisDao;
import com.zeal.zealsay.admin.modules.article.entity.Article;
import com.zeal.zealsay.common.web.CommonDao;

/**
 * article数据访问接口
 * 
 * @author zeal
 * @date 2018-03-25 20:18:41
 */
@MyBatisDao
public interface ArticleDao extends CommonDao<Article> {

}