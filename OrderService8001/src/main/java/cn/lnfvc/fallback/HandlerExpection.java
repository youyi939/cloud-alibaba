package cn.lnfvc.fallback;
import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * @version 1.0
 * @author: KenChen
 * @date 2020/10/18 6:17 下午
 */
public class HandlerExpection {

    public static String AllHandlerExpection(BlockException exception){
        return "全局HandlerExpection"+exception;
    }

    public static String HandlerExpectionA(BlockException exception){
        return "自定义HandlerExpection";
    }

    public static String blockhandler(BlockException exception){
        return "block !!!";
    }

}
