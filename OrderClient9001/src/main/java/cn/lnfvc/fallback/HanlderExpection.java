package cn.lnfvc.fallback;

import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * @version 1.0
 * @author: KenChen
 * @date 2020/10/18 8:57 下午
 */
public class HanlderExpection {
    public static String AllHandlerExpection(BlockException exception){
        return "Client       全局HandlerExpection"+exception;
    }

    public static String HandlerExpectionA(BlockException exception){
        return "Client      自定义HandlerExpection";
    }
}
