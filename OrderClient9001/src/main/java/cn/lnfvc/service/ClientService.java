package cn.lnfvc.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @version 1.0
 * @author: KenChen
 * @date 2020/10/19 12:31 下午
 */
@FeignClient("cloud-service")
public interface ClientService {
    @GetMapping(value = "/serviceTestA")
    public String serviceTestB();
}
