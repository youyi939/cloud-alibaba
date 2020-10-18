package cn.lnfvc;

import java.util.Calendar;

/**
 * @Author: KenChen
 * @Description:
 * @Date: Create in  2020/9/4 12:33 下午
 */
public class StartTime {
    Calendar cal=Calendar.getInstance();
    private int y=cal.get(Calendar.YEAR);
    private int m=cal.get(Calendar.MONTH);
    private int d=cal.get(Calendar.DATE);
    private int h=cal.get(Calendar.HOUR_OF_DAY);
    private int mi=cal.get(Calendar.MINUTE);
    private int s=cal.get(Calendar.SECOND);

    public void getStartTime(String title){
        System.out.println( title+" 启动时间："+y+"年"+m+"月"+d+"日"+h+"时"+mi+"分"+s+"秒");
    }

}
