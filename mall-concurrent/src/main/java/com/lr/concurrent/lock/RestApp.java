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

        String str[] = new String[]{"5eee29c0ca6d0ea1cdea1e6d",
                "5f0afcb65a27cb1a4ebb0844",
                "5eee245cca6d0ea1cde9f81f",
                "5eee20e0ca6d0ea1cde9d914",
                "5eee2c06ca6d0ea1cdea2c70",
                "5f0c82b15a27cb1a4ebb0f38",
                "5f0d35989879e618723e58e1",
                "5eee2270ca6d0ea1cde9e6f5",
                "5f0d50145a27cb1a4ebb1202",
                "5f0d7d3e5a27cb1a4ebb13b9",
                "5f0dabba4769b31f98ccae0b",
                "5f0dcec19879e618723e5d2c",
                "5eee3944ca6d0ea1cdea8082",
                "5eee2503ca6d0ea1cde9fddc",
                "5eee2548ca6d0ea1cdea003e",
                "5eee22ffca6d0ea1cde9ebf5",
                "5eee323fca6d0ea1cdea52e8",
                "5f0fdc594769b31f98ccb739",
                "5f10261b9879e618723e6787",
                "5eee254fca6d0ea1cdea0081",
                "5f1047505a27cb1a4ebb20e7",
                "5f1052295a27cb1a4ebb2138",
                "5f1105a85a27cb1a4ebb22ec",
                "5f11f00a9879e618723e6edd",
                "5eee25c2ca6d0ea1cdea046d",
                "5eee1f97ca6d0ea1cde9cd8d",
                "5f14d1039879e618723e75cc",
                "5f1515a64769b31f98ccc8d2",
                "5f1547459879e618723e78a2",
                "5f155b604769b31f98cccb30",
                "5f155f9e9879e618723e7917",
                "5eee2151ca6d0ea1cde9dcfb",
                "5eee2221ca6d0ea1cde9e435",
                "5f16909c5a27cb1a4ebb35be",
                "5f16b2244769b31f98ccd073",
                "5eee22e9ca6d0ea1cde9eb2a",
                "5f170d4c4769b37c417a4493",
                "5f181eb75a27cb70d7afc70e",
                "5f1820574769b37c417a4860",
                "5f1826f65a27cb70d7afc728",
                "5eee253bca6d0ea1cde9ffc8",
                "5f1868444769b37c417a495c",
                "5f18dcf39879e66f51a635a9",
                "5f18e90b4769b37c417a49d8",
                "5f195b3b5a27cb70d7afcab5",
                "5f1966924769b37c417a4c4e",
                "5f198eb09879e66f51a638e1",
                "5eee253cca6d0ea1cde9ffd7"};
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
