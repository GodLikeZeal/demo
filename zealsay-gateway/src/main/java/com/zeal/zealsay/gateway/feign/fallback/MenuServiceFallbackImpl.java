package com.zeal.zealsay.gateway.feign.fallback;

import com.zeal.zealsay.common.vo.MenuVo;
import com.zeal.zealsay.gateway.feign.MenuService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author lengleng
 * @date 2017/10/31
 * why add @Service when i up version ?
 * https://github.com/spring-cloud/spring-cloud-netflix/issues/762
 */
@Service
public class MenuServiceFallbackImpl implements MenuService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Override
    public Set<MenuVo> findMenuByRole(String role) {
        logger.error("调用{}异常{}","findMenuByRole",role);
        return null;
    }
}
