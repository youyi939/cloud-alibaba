package cn.lnfvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @version 1.0
 * @author: KenChen
 * @date 2020/10/18 11:00 上午
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Service8001 {
    public static void main(String[] args) {
        SpringApplication.run(Service8001.class,args);
        StartTime startTime = new StartTime();
        startTime.getStartTime("Service8001");
    }
}
