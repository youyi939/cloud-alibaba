package cn.lnfvc.controller;

import cn.lnfvc.service.OrderService;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
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

    @GetMapping(value = "testA")
    @SentinelResource(value = "test",
            fallback = "fallback",
            blockHandler = "blockhandler"
    )
    public String testA(){
        return orderService.testA()+" ------- "+port;
    }
    public String fallback(){
        return "OrderService"+port+"异常，暂不可用";
    }
    public String blockhandler(BlockException exception){
        return "block";
    }

}
