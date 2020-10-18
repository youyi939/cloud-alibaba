package cn.lnfvc.controller;

import cn.lnfvc.fallback.HandlerExpection;
import cn.lnfvc.fallback.ServiceFallBack;
import cn.lnfvc.service.OrderService;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @version 1.0
 * @author: KenChen
 * @date 2020/10/18 11:59 上午
 */
@RestController
public class ServiceController {


    @Resource
    public OrderService orderService;

    @Value("${server.port}")
    public String port;

    @GetMapping(value = "/serviceTestA")
    @SentinelResource(value = "serviceTestA",
            fallbackClass = ServiceFallBack.class,
            fallback = "allFallBack",
            blockHandler = "blockhandler",
            blockHandlerClass = HandlerExpection.class
    )
    public String serviceTestA(){
        return orderService.serviceTestA()+" ------- "+port;
    }


}
