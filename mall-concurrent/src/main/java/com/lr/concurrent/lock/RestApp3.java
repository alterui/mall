package com.lr.concurrent.lock;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.lr.concurrent.cv.CandidateProfileVO;
import com.lr.concurrent.cv.OverviewVO;
import okhttp3.*;

import java.io.IOException;
import java.util.List;

/**
 * @author liurui
 * @date 2020/8/13 5:40 下午
 */
public class RestApp3 {
       static OkHttpClient client = new OkHttpClient().newBuilder()
                .build();

    public static void main(String[] args) throws Exception{

        String str[] = new String[]{
                "650",
                "1266291",
                "650396",
                "1244228",
                "1347337",
                "501922",
                "879",
                "601320",
                "2084933",
                "2442587",
                "2052173"
        };
        int i = 0;
        for (String string : str) {
            System.out.println(++i);
            post(string);

        }

    }

    private static void post(String url) throws IOException {
        String str = "http://47.93.181.36:11017/v6/application/company/syncEs?companyId=" + url + "";
        Request request = new Request.Builder()
                .url(str)
                .method("GET", null)
                .build();
        Response response = client.newCall(request).execute();
       // System.out.println(response.body().string());


    }
}
