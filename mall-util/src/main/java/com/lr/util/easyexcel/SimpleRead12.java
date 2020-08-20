package com.lr.util.easyexcel;


import com.alibaba.excel.EasyExcel;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import okhttp3.*;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;


public class SimpleRead12 {
   static OkHttpClient client = new OkHttpClient().newBuilder().build();
    public static void main(String[] args) {
        String fileName = "/Users/liurui/Downloads/最新笔试名单-814.xls";
        EasyExcel.read(fileName,DemoData.class,new WriteWithoutHead()).sheet().doRead();

        List<DemoData> list = WriteWithoutHead.getList();

        System.out.println(list.size());

        List<DemoData> collect = list.stream().distinct().filter(e -> !StringUtils.isEmpty(e.getEmail())).collect(Collectors.toList());

        List<String> result = new CopyOnWriteArrayList<>();

        AtomicInteger time = new AtomicInteger(1);
        collect.parallelStream().forEach(e->{
            try {
                System.out.println(time.getAndIncrement());
                setPostToEs(e.getEmail(),result);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        });

        result.forEach(System.out::println);




    }

    private static void setPostToEs(String str,List list) throws IOException {
        MediaType mediaType = MediaType.parse("application/json");
        //String string = "{\"size\":500,\"sort\":[{\"@timestamp\":{\"order\":\"desc\",\"unmapped_type\":\"boolean\"}}],\"highlight\":{\"pre_tags\":[\"@kibana-highlighted-field@\"],\"post_tags\":[\"@/kibana-highlighted-field@\"],\"fields\":{\"*\":{}},\"require_field_match\":false,\"fragment_size\":2147483647},\"query\":{\"filtered\":{\"query\":{\"query_string\":{\"query\":\"\\\"sendMailList mergeVar\\\" AND logger:\\\"com.moseeker.util.MandrillMailListConsumer\\\"  AND message:\\\"感谢参加玛氏2021年校园招聘\\\" AND message:\\\"%s\\\"\",\"analyze_wildcard\":true}},\"filter\":{\"bool\":{\"must\":[{\"range\":{\"@timestamp\":{\"gte\":1597507200000,\"lte\":1597593599999,\"format\":\"epoch_millis\"}}}],\"must_not\":[]}}}},\"aggs\":{\"2\":{\"date_histogram\":{\"field\":\"@timestamp\",\"interval\":\"30m\",\"time_zone\":\"Asia/Shanghai\",\"min_doc_count\":0,\"extended_bounds\":{\"min\":1597507200000,\"max\":1597593599999}}}},\"fields\":[\"*\",\"_source\"],\"script_fields\":{},\"fielddata_fields\":[\"@timestamp\"]}";
        String string = "{\"size\":500,\"sort\":[{\"@timestamp\":{\"order\":\"desc\",\"unmapped_type\":\"boolean\"}}],\"query\":{\"filtered\":{\"query\":{\"query_string\":{\"query\":\"\\\"sendMailList mergeVar\\\" AND logger:\\\"com.moseeker.util.MandrillMailListConsumer\\\" AND message:\\\"%s\\\"\",\"analyze_wildcard\":true}},\"filter\":{\"bool\":{\"must\":[{\"range\":{\"@timestamp\":{\"gte\":1597161600000,\"lte\":1597247999999,\"format\":\"epoch_millis\"}}}],\"must_not\":[]}}}},\"highlight\":{\"pre_tags\":[\"@kibana-highlighted-field@\"],\"post_tags\":[\"@/kibana-highlighted-field@\"],\"fields\":{\"*\":{}},\"require_field_match\":false,\"fragment_size\":2147483647},\"aggs\":{\"2\":{\"date_histogram\":{\"field\":\"@timestamp\",\"interval\":\"30m\",\"time_zone\":\"Asia/Shanghai\",\"min_doc_count\":0,\"extended_bounds\":{\"min\":1597161600000,\"max\":1597247999999}}}},\"fields\":[\"*\",\"_source\"],\"script_fields\":{},\"fielddata_fields\":[\"@timestamp\"]}";
        String format = String.format(string, str);
        RequestBody body = RequestBody.create(mediaType,format );
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
            list.add(str);
            System.out.println(str);
        }
    }


}
