package com.lr.concurrent.utils;


import okhttp3.*;


/**
 * @author liurui
 * @date 2020/8/25 9:54 上午
 */
public class Application {
    public static void main(String[] args) throws Exception{
        long l = System.currentTimeMillis();
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        String str = "{\n    \"app_id\":10137,\n    \"secret\":\"8b3f8e2ee943c9b6202b56dba4138e6a\",\n    \"user_name\":\"hyattintl\",\n    \"password\":\"HyattHub2020\",\n    \"time\":\"%s\"\n\n}";
        String format = String.format(str, l);
        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType,format );
        Request request = new Request.Builder()
                .url("https://external-interface.veryeast.cn/api/index/GetJobCategory")
                .method("POST", body)
                .addHeader("Content-Type", "application/json")
                .build();
        Response response = client.newCall(request).execute();
        String string = response.body().string();
        System.out.println(string);
    }
}
