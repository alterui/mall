package com.lr.time;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Date;
import java.util.Locale;

/**
 * @author liurui
 * @date 2021/4/8 2:36 下午
 */
public class App {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        //转化为时间戳，毫秒数
        long l = instant.toEpochMilli();

        //转化为Date
        Date date = new Date(instant.toEpochMilli());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String time = formatter.format(now);
        System.out.println(time);

        LocalDateTime parse = LocalDateTime.parse("2021年04月08日 14:44:15", formatter);
        System.out.println(parse);

    }
}
