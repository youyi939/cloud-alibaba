import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @version 1.0
 * @author: KenChen
 * @date 2020/10/18 2:37 下午
 */
public class test {
    public static void main(String[] args) {

        List<DataTime> dataTimeList = new ArrayList<>();
        List<Integer> yearList = new ArrayList<>();
        int year = 2000;
        initDate(yearList,dataTimeList,year);

        System.out.println(yearList);

        int km = 0;

        for (int i = 0; i < dataTimeList.size(); i++) {
            if (dataTimeList.get(i).getWeek()==1 && dataTimeList.get(i).getD()==1){
                System.out.println("周一+月初："+dataTimeList.get(i).toString()+"公里数："+km);
                km = km+2;
            }else if (dataTimeList.get(i).getWeek()==1 && dataTimeList.get(i).getD()!=1) {
                System.out.println("周一且不是月初：" + dataTimeList.get(i).toString()+"公里数："+km);
                km = km+2;
            }else if (dataTimeList.get(i).getD()==1 && dataTimeList.get(i).getWeek()!=1){
                System.out.println("月初不是周一：" + dataTimeList.get(i).toString()+"公里数："+km);
                km = km+2;
            }else {
                System.out.println("什么都不是："+dataTimeList.get(i).toString()+"公里数："+km);
                km++;
            }



        }

        System.out.println("这20年这小兔崽子的公里数："+km);
        System.out.println(dataTimeList.size());



    }



    public static int judgeYear(int year){
        //处理部分 + 输出部分
        if((year % 4== 0 && year% 100 != 0) || year % 400 == 0 ){
            return 0;                //闰年
        }
        else{
            return 1;               //平年
        }
    }

    public static int getWeek(String dates)
    {

        Calendar cal = Calendar.getInstance();
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        Date d=null;
        try {
            d=f.parse(dates);
        } catch (ParseException e) {

            e.printStackTrace();
        }
        cal.setTime(d);
        int w=cal.get(Calendar.DAY_OF_WEEK)-1;
        if(w==0) w=7;
        return w;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    static
    class DataTime{
        int y;
        int m;
        int d;
        int week;
    }

    public static void initDate(List<Integer> yearList, List<DataTime> dataTimeList,int year){
        for (int i = 0; i <21 ; i++) {
            yearList.add(year);
            year++;
        }
        for (int i = 0; i < yearList.size() ; i++) {
            if (judgeYear(yearList.get(i)) == 0){
                System.out.println(yearList.get(i)+"是闰年");
                int y = yearList.get(i);                //year
                int m = 1;
                for (int j = 0; j < 12 ; j++) {
                    switch (m){
                        case 1:
                            m = 1;
                            for (int k = 1; k < 32 ; k++) {
                                dataTimeList.add(new DataTime(y,m,k,getWeek(y+"-"+m+"-"+k)));
                            }
                            break;
                        case 2:
                            m = 2;
                            for (int k = 1; k < 30 ; k++) {
                                dataTimeList.add(new DataTime(y,m,k,getWeek(y+"-"+m+"-"+k)));
                            }
                            break;
                        case 3:
                            m = 3;
                            for (int k = 1; k < 32 ; k++) {
                                dataTimeList.add(new DataTime(y,m,k,getWeek(y+"-"+m+"-"+k)));
                            }
                            break;
                        case 4:
                            m = 4;
                            for (int k = 1; k < 31 ; k++) {
                                dataTimeList.add(new DataTime(y,m,k,getWeek(y+"-"+m+"-"+k)));
                            }
                            break;
                        case 5:
                            m = 5;
                            for (int k = 1; k < 32 ; k++) {
                                dataTimeList.add(new DataTime(y,m,k,getWeek(y+"-"+m+"-"+k)));
                            }
                            break;
                        case 6:
                            m = 6;
                            for (int k = 1; k < 31 ; k++) {
                                dataTimeList.add(new DataTime(y,m,k,getWeek(y+"-"+m+"-"+k)));
                            }
                            break;
                        case 7:
                            m = 7;
                            for (int k = 1; k < 32 ; k++) {
                                dataTimeList.add(new DataTime(y,m,k,getWeek(y+"-"+m+"-"+k)));
                            }
                            break;
                        case 8:
                            m = 8;
                            for (int k = 1; k < 32 ; k++) {
                                dataTimeList.add(new DataTime(y,m,k,getWeek(y+"-"+m+"-"+k)));
                            }
                            break;
                        case 9:
                            m = 9;
                            for (int k = 1; k < 31 ; k++) {
                                dataTimeList.add(new DataTime(y,m,k,getWeek(y+"-"+m+"-"+k)));
                            }
                            break;
                        case 10:
                            m = 10;
                            if (y==2020){
                                dataTimeList.add(new DataTime(y,m,1,getWeek(y+"-"+m+"-"+1)));
                                break;
                            }
                            for (int k = 1; k < 32 ; k++) {
                                dataTimeList.add(new DataTime(y,m,k,getWeek(y+"-"+m+"-"+k)));
                            }
                            break;
                        case 11:
                            m = 11;
                            if (y == 2020){
                                break;
                            }
                            for (int k = 1; k < 31 ; k++) {
                                dataTimeList.add(new DataTime(y,m,k,getWeek(y+"-"+m+"-"+k)));
                            }
                            break;
                        case 12:
                            m = 12;
                            if (y == 2020){
                                break;
                            }
                            for (int k = 1; k < 32 ; k++) {
                                dataTimeList.add(new DataTime(y,m,k,getWeek(y+"-"+m+"-"+k)));
                            }
                            break;

                    }
                    m++;


                }


            }
            if (judgeYear(yearList.get(i)) == 1){
                System.out.println(yearList.get(i)+"是ping年");
                int y = yearList.get(i);                //year
                int m = 1;
                for (int j = 0; j < 12 ; j++) {
                    switch (m){
                        case 1:
                            m = 1;
                            for (int k = 1; k < 32 ; k++) {
                                dataTimeList.add(new DataTime(y,m,k,getWeek(y+"-"+m+"-"+k)));
                            }
                            break;
                        case 2:
                            m = 2;
                            for (int k = 1; k < 29 ; k++) {
                                dataTimeList.add(new DataTime(y,m,k,getWeek(y+"-"+m+"-"+k)));
                            }
                            break;
                        case 3:
                            m = 3;
                            for (int k = 1; k < 32 ; k++) {
                                dataTimeList.add(new DataTime(y,m,k,getWeek(y+"-"+m+"-"+k)));
                            }
                            break;
                        case 4:
                            m = 4;
                            for (int k = 1; k < 31 ; k++) {
                                dataTimeList.add(new DataTime(y,m,k,getWeek(y+"-"+m+"-"+k)));
                            }
                            break;
                        case 5:
                            m = 5;
                            for (int k = 1; k < 32 ; k++) {
                                dataTimeList.add(new DataTime(y,m,k,getWeek(y+"-"+m+"-"+k)));
                            }
                            break;
                        case 6:
                            m = 6;
                            for (int k = 1; k < 31 ; k++) {
                                dataTimeList.add(new DataTime(y,m,k,getWeek(y+"-"+m+"-"+k)));
                            }
                            break;
                        case 7:
                            m = 7;
                            for (int k = 1; k < 32 ; k++) {
                                dataTimeList.add(new DataTime(y,m,k,getWeek(y+"-"+m+"-"+k)));
                            }
                            break;
                        case 8:
                            m = 8;
                            for (int k = 1; k < 32 ; k++) {
                                dataTimeList.add(new DataTime(y,m,k,getWeek(y+"-"+m+"-"+k)));
                            }
                            break;
                        case 9:
                            m = 9;
                            for (int k = 1; k < 31 ; k++) {
                                dataTimeList.add(new DataTime(y,m,k,getWeek(y+"-"+m+"-"+k)));
                            }
                            break;
                        case 10:
                            m = 10;
                            if (y==2020){
                                dataTimeList.add(new DataTime(y,m,1,getWeek(y+"-"+m+"-"+1)));
                                break;
                            }
                            for (int k = 1; k < 32 ; k++) {
                                dataTimeList.add(new DataTime(y,m,k,getWeek(y+"-"+m+"-"+k)));
                            }
                            break;
                        case 11:
                            m = 11;
                            if (y == 2020){
                                break;
                            }
                            for (int k = 1; k < 31 ; k++) {
                                dataTimeList.add(new DataTime(y,m,k,getWeek(y+"-"+m+"-"+k)));
                            }
                            break;
                        case 12:
                            m = 12;
                            if (y == 2020){
                                break;
                            }
                            for (int k = 1; k < 32 ; k++) {
                                dataTimeList.add(new DataTime(y,m,k,getWeek(y+"-"+m+"-"+k)));
                            }
                            break;

                    }
                    m++;


                }


            }


        }
    }
}
