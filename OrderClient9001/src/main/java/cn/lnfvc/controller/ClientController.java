package cn.lnfvc.controller;

import cn.lnfvc.fallback.ClientFallBack;
import cn.lnfvc.fallback.HanlderExpection;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @version 1.0
 * @author: KenChen
 * @date 2020/10/18 8:31 下午
 */
@RestController
public class ClientController {

    @Resource
    private RestTemplate restTemplate;

    @Value("${service-url.nacos-user-service}")
    private String serverUrl;

    @GetMapping("/serviceTestB")
    @SentinelResource(value = "serviceTestB",
            blockHandlerClass = HanlderExpection.class,
            blockHandler = "AllHandlerExpection",
            fallbackClass = ClientFallBack.class,
            fallback = "allFallBack"
    )
    public String serviceTestB(){
        return restTemplate.getForObject(serverUrl+"/serviceTestA",String.class);
    }

}
