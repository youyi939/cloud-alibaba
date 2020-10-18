package cn.lnfvc.service.impl;

import cn.lnfvc.service.OrderService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @version 1.0
 * @author: KenChen
 * @date 2020/10/18 1:46 下午
 */
@Service
public class OrderServiceImpl implements OrderService {


    @Override
    public String serviceTestA() {
        return "TestA";
    }

}
