package cn.lnfvc.fallback;

/**
 * @version 1.0
 * @author: KenChen
 * @date 2020/10/18 8:59 下午
 */
public class ClientFallBack {
    public static String allFallBack(){
        return "Client   全局自定义fallback";
    }

    public static String fallBackA(){
        return "Client    自定义fallback";
    }
}
