package com.lr.concurrent.lock;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.lr.concurrent.cv.BasicVO;
import com.lr.concurrent.cv.CandidateProfileVO;
import com.lr.concurrent.cv.OverviewVO;
import okhttp3.*;
import org.springframework.util.CollectionUtils;

import java.io.IOException;
import java.util.List;

/**
 * @author liurui
 * @date 2020/8/13 5:40 下午
 */
public class RestApp {
       static OkHttpClient client = new OkHttpClient().newBuilder()
                .build();

    public static void main(String[] args) throws Exception{

        String str[] = new String[]{"5f029baf9879e618723e23f6",
                "5eee268aca6d0ea1cdea0a91",
                "5eee24b2ca6d0ea1cde9fb0d",
                "5f02fd0b9879e618723e278d",
                "5f02feb54769b31f98cc7981",
                "5f0323419879e618723e28a7",
                "5eee2480ca6d0ea1cde9f95c",
                "5eee387aca6d0ea1cdea7a95",
                "5f0344409879e618723e29e9",
                "5eee20e8ca6d0ea1cde9d956",
                "5eee2dc1ca6d0ea1cdea371e",
                "5f036bd84769b31f98cc7c8b",
                "5f03ec299879e618723e2c61",
                "5f0407879879e618723e2ddd",
                "5eee22e0ca6d0ea1cde9eada",
                "5f0422424769b31f98cc80ce",
                "5f0435054769b31f98cc818c",
                "5eee21a3ca6d0ea1cde9dfcd",
                "5eee2489ca6d0ea1cde9f9a9",
                "5eee20b7ca6d0ea1cde9d7a4",
                "5eee2366ca6d0ea1cde9ef92",
                "5eee3304ca6d0ea1cdea579d",
                "5f047e959879e618723e3315",
                "5eee236eca6d0ea1cde9efd7",
                "5f057fb09879e618723e38f4",
                "5f05ce7f5a27cb1a4ebaf463",
                "5f05da175a27cb1a4ebaf4ad",
                "5f06ad954769b31f98cc91be",
                "5eee2206ca6d0ea1cde9e340",
                "5f071bf84769b31f98cc954f",
                "5f0739339879e618723e43d4",
                "5f07d9df5a27cb1a4ebafdaa",
                "5f0823574769b31f98cc9950",
                "5f0850059879e618723e48ba"};
        for (String string : str) {
            post(string);

        }

    }

    private static void post(String url) throws IOException {
        MediaType mediaType = MediaType.parse("text/plain");
        RequestBody body = RequestBody.create(mediaType, "");
        Request request = new Request.Builder()
                .url("http://47.93.181.36:11056/v5/candidate/profiles/batch?ids=" + url + "")
                .method("POST", body)
                .build();
        Response response = client.newCall(request).execute();
        String json = response.body().string();
        JSONObject jsonObject = JSONObject.parseObject(json);
        JSONArray data = jsonObject.getJSONArray("data");
        List<CandidateProfileVO> candidateProfileVOS = data.toJavaList(CandidateProfileVO.class);
        OverviewVO overview = candidateProfileVOS.get(0).getOverview();
        System.out.println(overview.getName() + " " + overview.getMobile() + " " + overview.getEmail());


    }
}
