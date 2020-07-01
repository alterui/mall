package com.lr.mall.thread;

import com.lr.common.utils.R;
import com.lr.mall.test.bean.SmsSenderFormVO;
import org.checkerframework.checker.units.qual.K;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author liurui
 * @date 2020/6/29 5:55 下午
 */
public class Demo {

    public static void main(String[] args) throws ParseException {

        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String today = simpleDateFormat.format(date.getTime());
        today = today + " 00:00:00";
        Date parse = simpleDateFormat.parse(today);
        Timestamp now = new Timestamp(parse.getTime());
        System.out.println(now);



        /*2020-05-06 10:00:00*/

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse1 = sdf.parse("2020-05-06 10:00:00");
        Timestamp get = new Timestamp(parse1.getTime());


        boolean after = get.after(now);
        System.out.println(after);

    }

}
