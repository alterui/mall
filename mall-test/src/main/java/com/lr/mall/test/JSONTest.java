package com.lr.mall.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.List;

/**
 * @author liurui
 * @date 2020/7/17 2:08 下午
 */
public class JSONTest {
    public static void main(String[] args) {
        String json = "{\n" +
                "    \"cities\":[\n" +
                "        {\n" +
                "            \"cityCode\":310000,\n" +
                "            \"cityName\":\"上海\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"cityCode\":500000,\n" +
                "            \"cityName\":\"重庆\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"cityCode\":810000,\n" +
                "            \"cityName\":\"香港\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"cityCode\":530400,\n" +
                "            \"cityName\":\"玉溪\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"cityCode\":530500,\n" +
                "            \"cityName\":\"保山\"\n" +
                "        }\n" +
                "    ]\n" +
                "}";
        JSONObject jsonObject = JSONObject.parseObject(json);
        JSONArray cities = jsonObject.getJSONArray("cities");

        for (int i = 0; i < cities.size(); i++) {
            JSONObject jsonObject1 = cities.getJSONObject(i);
            String cityCode = jsonObject1.getString("cityCode");
            System.out.println(cityCode);
        }


    }
}
