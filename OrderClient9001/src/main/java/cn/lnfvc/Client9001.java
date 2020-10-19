package cn.lnfvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @version 1.0
 * @author: KenChen
 * @date 2020/10/18 7:02 下午
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class Client9001 {
    public static void main(String[] args) {
        SpringApplication.run(Client9001.class,args);
        StartTime startTime = new StartTime();
        startTime.getStartTime("Client9001");
    }
}





