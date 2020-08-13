package com.lr.concurrent.lock;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import okhttp3.*;
import org.springframework.util.CollectionUtils;

import java.io.IOException;

/**
 * @author liurui
 * @date 2020/8/13 2:57 下午
 */
public class Application {
    public static void main(String[] args) throws IOException {
        String id = "e3ba1f89-aa1d-4af7-ba2b-02bb42385af2";
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("application/json");
        String str = "{\"size\":500,\"sort\":[{\"@timestamp\":{\"order\":\"desc\",\"unmapped_type\":\"boolean\"}}],\"query\":{\"filtered\":{\"query\":{\"query_string\":{\"analyze_wildcard\":true,\"query\":\"customTraceId:\\\"%s\\\" AND message:\\\"send message ATSProcess applier\\\"\"}},\"filter\":{\"bool\":{\"must\":[{\"range\":{\"@timestamp\":{\"gte\":1597161600000,\"lte\":1597247999999,\"format\":\"epoch_millis\"}}}],\"must_not\":[]}}}},\"highlight\":{\"pre_tags\":[\"@kibana-highlighted-field@\"],\"post_tags\":[\"@/kibana-highlighted-field@\"],\"fields\":{\"*\":{}},\"require_field_match\":false,\"fragment_size\":2147483647},\"aggs\":{\"2\":{\"date_histogram\":{\"field\":\"@timestamp\",\"interval\":\"30m\",\"time_zone\":\"Asia/Shanghai\",\"min_doc_count\":0,\"extended_bounds\":{\"min\":1597161600000,\"max\":1597247999999}}}},\"fields\":[\"*\",\"_source\"],\"script_fields\":{},\"fielddata_fields\":[\"@timestamp\"]}";
        String format = String.format(str, id);
        RequestBody body = RequestBody.create(mediaType, format);
        Request request = new Request.Builder()
                .url("https://kibana.moseeker.com/elasticsearch/log_301_info_20200812/_search")
                .method("POST", body)
                .addHeader("Authorization", "Basic ZGFxaTplMzExNDgxNTJiYzQ4MGZlMGM4MjM1OGNjODg3NzgwYw==Authorization")
                .addHeader("kbn-version", "4.4.0")
                .addHeader("Content-Type", "application/json")
                .build();
        Response response = client.newCall(request).execute();
        String json = response.body().string();
        JSONObject jsonObject = JSONObject.parseObject(json);
        JSONArray jsonArray = jsonObject.getJSONObject("hits").getJSONArray("hits");

        if (CollectionUtils.isEmpty(jsonArray)) {

            System.out.println("ddd");
        }



    }
}
