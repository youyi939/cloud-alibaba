package cn.lnfvc.fallback;

import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * @version 1.0
 * @author: KenChen
 * @date 2020/10/18 12:42 下午
 */
public class ServiceFallBack {
    public String allFallBack(){
        return "全局自定义fallback";
    }

    public String fallBackA(){
        return "自定义fallback";
    }

}
