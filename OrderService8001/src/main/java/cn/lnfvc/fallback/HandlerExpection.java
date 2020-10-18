package cn.lnfvc.fallback;
import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * @version 1.0
 * @author: KenChen
 * @date 2020/10/18 6:17 下午
 */
public class HandlerExpection {

    public String AllHandlerExpection(BlockException exception){
        return "全局HandlerExpection";
    }

    public String HandlerExpectionA(BlockException exception){
        return "自定义HandlerExpection";
    }

}
