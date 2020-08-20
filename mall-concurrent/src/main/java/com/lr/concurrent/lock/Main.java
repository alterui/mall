package com.lr.concurrent.lock;



import java.util.Calendar;
import java.util.Date;

/**
 * @author liurui
 * @date 2020/8/20 10:33 上午
 */
public class Main {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(System.currentTimeMillis());
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.add(Calendar.SECOND, -1);
        Date endDate = cal.getTime();
        String endTime = DateUtils.dateToShortTime(endDate);
        cal.add(Calendar.DATE, -1);
        cal.add(Calendar.SECOND, 1);
        Date startDate = cal.getTime();
        String startTime = DateUtils.dateToShortTime(startDate);
        System.out.println(startTime + "-" + endTime);

    }
}
