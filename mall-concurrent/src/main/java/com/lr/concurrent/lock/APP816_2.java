package com.lr.concurrent.lock;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import lombok.Data;
import okhttp3.*;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author liurui
 * @date 2020/8/6 5:21 下午
 */

@Data
public class APP816_2 {
    static OkHttpClient client = new OkHttpClient().newBuilder()
            .build();
    public static void main(String[] args) throws Exception{

        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, "{\"size\":10000,\"sort\":[{\"@timestamp\":{\"order\":\"desc\",\"unmapped_type\":\"boolean\"}}],\"query\":{\"filtered\":{\"query\":{\"query_string\":{\"query\":\"\\\"send email ATSProcess notice start\\\" AND message:\\\"线上笔试\\\" AND application:\\\"provider-messaging\\\"\",\"analyze_wildcard\":true}},\"filter\":{\"bool\":{\"must\":[{\"range\":{\"@timestamp\":{\"gte\":1597572000000,\"lte\":1597593599999,\"format\":\"epoch_millis\"}}}],\"must_not\":[]}}}},\"highlight\":{\"pre_tags\":[\"@kibana-highlighted-field@\"],\"post_tags\":[\"@/kibana-highlighted-field@\"],\"fields\":{\"*\":{}},\"require_field_match\":false,\"fragment_size\":2147483647},\"aggs\":{\"2\":{\"date_histogram\":{\"field\":\"@timestamp\",\"interval\":\"5m\",\"time_zone\":\"Asia/Shanghai\",\"min_doc_count\":0,\"extended_bounds\":{\"min\":1597572000000,\"max\":1597593599999}}}},\"fields\":[\"*\",\"_source\"],\"script_fields\":{},\"fielddata_fields\":[\"@timestamp\"]}");
        Request request = new Request.Builder()
                .url("https://kibana.moseeker.com/elasticsearch/log_301_info_20200816/_search")
                .method("POST", body)
                .addHeader("Authorization", "Basic ZGFxaTplMzExNDgxNTJiYzQ4MGZlMGM4MjM1OGNjODg3NzgwYw==Authorization")
                .addHeader("kbn-version", "4.4.0")
                .addHeader("Content-Type", "application/json")
                .build();
        Response response = client.newCall(request).execute();

        String json = response.body().string();
        JSONObject jsonObject = JSONObject.parseObject(json);
        JSONArray jsonArray = jsonObject.getJSONObject("hits").getJSONArray("hits");
        List<Kit> kits = jsonArray.toJavaList(Kit.class);
        List<Kits> list = new ArrayList<>();
        kits.forEach(e->{
            list.add(e.get_source());
        });

        List<String> resultList = new CopyOnWriteArrayList<>();

        AtomicInteger time = new AtomicInteger();
        list.parallelStream().forEach(e -> {
            System.out.println(time.getAndIncrement());

            try {
                test(e, resultList);
            } catch (Exception exception) {
                exception.printStackTrace();
            }


        });

        resultList.forEach(e-> System.out.println(e));


    }

    public static void test(Kits kit,List<String> list) throws Exception{
        String id = kit.getCustomTraceId();
        System.out.println(id);
        //String str = "{\"size\":500,\"sort\":[{\"@timestamp\":{\"order\":\"desc\",\"unmapped_type\":\"boolean\"}}],\"query\":{\"filtered\":{\"query\":{\"query_string\":{\"query\":\"\\\"%s\\\" AND message:\\\"send message ATSProcess applier\\\"\",\"analyze_wildcard\":true}},\"filter\":{\"bool\":{\"must\":[{\"range\":{\"@timestamp\":{\"gte\":1596988800000,\"lte\":1597075199999,\"format\":\"epoch_millis\"}}}],\"must_not\":[]}}}},\"highlight\":{\"pre_tags\":[\"@kibana-highlighted-field@\"],\"post_tags\":[\"@/kibana-highlighted-field@\"],\"fields\":{\"*\":{}},\"require_field_match\":false,\"fragment_size\":2147483647},\"aggs\":{\"2\":{\"date_histogram\":{\"field\":\"@timestamp\",\"interval\":\"30m\",\"time_zone\":\"Asia/Shanghai\",\"min_doc_count\":0,\"extended_bounds\":{\"min\":1596988800000,\"max\":1597075199999}}}},\"fields\":[\"*\",\"_source\"],\"script_fields\":{},\"fielddata_fields\":[\"@timestamp\"]}";
        //String str = "{\\\"size\\\":500,\\\"sort\\\":[{\\\"@timestamp\\\":{\\\"order\\\":\\\"desc\\\",\\\"unmapped_type\\\":\\\"boolean\\\"}}],\\\"query\\\":{\\\"filtered\\\":{\\\"query\\\":{\\\"query_string\\\":{\\\"query\\\":\\\"\\\\\\\"%s\\\\\\\" AND message:\\\\\\\"send message ATSProcess applier\\\\\\\"\\\",\\\"analyze_wildcard\\\":true}},\\\"filter\\\":{\\\"bool\\\":{\\\"must\\\":[{\\\"range\\\":{\\\"@timestamp\\\":{\\\"gte\\\":1597507200000,\\\"lte\\\":1597593599999,\\\"format\\\":\\\"epoch_millis\\\"}}}],\\\"must_not\\\":[]}}}},\\\"highlight\\\":{\\\"pre_tags\\\":[\\\"@kibana-highlighted-field@\\\"],\\\"post_tags\\\":[\\\"@/kibana-highlighted-field@\\\"],\\\"fields\\\":{\\\"*\\\":{}},\\\"require_field_match\\\":false,\\\"fragment_size\\\":2147483647},\\\"aggs\\\":{\\\"2\\\":{\\\"date_histogram\\\":{\\\"field\\\":\\\"@timestamp\\\",\\\"interval\\\":\\\"30m\\\",\\\"time_zone\\\":\\\"Asia/Shanghai\\\",\\\"min_doc_count\\\":0,\\\"extended_bounds\\\":{\\\"min\\\":1597507200000,\\\"max\\\":1597593599999}}}},\\\"fields\\\":[\\\"*\\\",\\\"_source\\\"],\\\"script_fields\\\":{},\\\"fielddata_fields\\\":[\\\"@timestamp\\\"]}";
       /* String str = "{\"size\":500,\"sort\":[{\"@timestamp\":{\"order\":\"desc\",\"unmapped_type\":\"boolean\"}}],\"query\":{\"filtered\":{\"query\":{\"query_string\":{\"query\":\"\\\"323173b9-fbee-4e9b-a98d-aa9f793b448b\\\" AND message:\\\"ats process mandrill sendEmail  start...\\\"\",\"analyze_wildcard\":true}},\"filter\":{\"bool\":{\"must\":[{\"range\":{\"@timestamp\":{\"gte\":1597507200000,\"lte\":1597593599999,\"format\":\"epoch_millis\"}}}],\"must_not\":[]}}}},\"highlight\":{\"pre_tags\":[\"@kibana-highlighted-field@\"],\"post_tags\":[\"@/kibana-highlighted-field@\"],\"fields\":{\"*\":{}},\"require_field_match\":false,\"fragment_size\":2147483647},\"aggs\":{\"2\":{\"date_histogram\":{\"field\":\"@timestamp\",\"interval\":\"30m\",\"time_zone\":\"Asia/Shanghai\",\"min_doc_count\":0,\"extended_bounds\":{\"min\":1597507200000,\"max\":1597593599999}}}},\"fields\":[\"*\",\"_source\"],\"script_fields\":{},\"fielddata_fields\":[\"@timestamp\"]}"
        String str = "{\"size\":500,\"sort\":[{\"@timestamp\":{\"order\":\"desc\",\"unmapped_type\":\"boolean\"}}],\"query\":{\"filtered\":{\"query\":{\"query_string\":{\"query\":\"\\\"%s\\\" AND message:\\\"send message ATSProcess applier\\\"\",\"analyze_wildcard\":true}},\"filter\":{\"bool\":{\"must\":[{\"range\":{\"@timestamp\":{\"gte\":1597507200000,\"lte\":1597593599999,\"format\":\"epoch_millis\"}}}],\"must_not\":[]}}}},\"highlight\":{\"pre_tags\":[\"@kibana-highlighted-field@\"],\"post_tags\":[\"@/kibana-highlighted-field@\"],\"fields\":{\"*\":{}},\"require_field_match\":false,\"fragment_size\":2147483647},\"aggs\":{\"2\":{\"date_histogram\":{\"field\":\"@timestamp\",\"interval\":\"30m\",\"time_zone\":\"Asia/Shanghai\",\"min_doc_count\":0,\"extended_bounds\":{\"min\":1597507200000,\"max\":1597593599999}}}},\"fields\":[\"*\",\"_source\"],\"script_fields\":{},\"fielddata_fields\":[\"@timestamp\"]}";
       */
        //String str = "{\"size\":500,\"sort\":[{\"@timestamp\":{\"order\":\"desc\",\"unmapped_type\":\"boolean\"}}],\"query\":{\"filtered\":{\"query\":{\"query_string\":{\"query\":\"\\\"%s\\\" AND message:\\\"ats process mandrill sendEmail  start...\\\"\",\"analyze_wildcard\":true}},\"filter\":{\"bool\":{\"must\":[{\"range\":{\"@timestamp\":{\"gte\":1597507200000,\"lte\":1597593599999,\"format\":\"epoch_millis\"}}}],\"must_not\":[]}}}},\"highlight\":{\"pre_tags\":[\"@kibana-highlighted-field@\"],\"post_tags\":[\"@/kibana-highlighted-field@\"],\"fields\":{\"*\":{}},\"require_field_match\":false,\"fragment_size\":2147483647},\"aggs\":{\"2\":{\"date_histogram\":{\"field\":\"@timestamp\",\"interval\":\"30m\",\"time_zone\":\"Asia/Shanghai\",\"min_doc_count\":0,\"extended_bounds\":{\"min\":1597507200000,\"max\":1597593599999}}}},\"fields\":[\"*\",\"_source\"],\"script_fields\":{},\"fielddata_fields\":[\"@timestamp\"]}";
        String str =  "{\"size\":500,\"sort\":[{\"@timestamp\":{\"order\":\"desc\",\"unmapped_type\":\"boolean\"}}],\"query\":{\"filtered\":{\"query\":{\"query_string\":{\"query\":\"\\\"%s\\\" AND message:\\\"send message ATSProcess applier:\\\"\",\"analyze_wildcard\":true}},\"filter\":{\"bool\":{\"must\":[{\"range\":{\"@timestamp\":{\"gte\":1597507200000,\"lte\":1597593599999,\"format\":\"epoch_millis\"}}}],\"must_not\":[]}}}},\"highlight\":{\"pre_tags\":[\"@kibana-highlighted-field@\"],\"post_tags\":[\"@/kibana-highlighted-field@\"],\"fields\":{\"*\":{}},\"require_field_match\":false,\"fragment_size\":2147483647},\"aggs\":{\"2\":{\"date_histogram\":{\"field\":\"@timestamp\",\"interval\":\"30m\",\"time_zone\":\"Asia/Shanghai\",\"min_doc_count\":0,\"extended_bounds\":{\"min\":1597507200000,\"max\":1597593599999}}}},\"fields\":[\"*\",\"_source\"],\"script_fields\":{},\"fielddata_fields\":[\"@timestamp\"]}";
        MediaType mediaType = MediaType.parse("application/json");
        String format = String.format(str, id);
        System.out.println(format);
        RequestBody body = RequestBody.create(mediaType, format);
        Request request = new Request.Builder()
                .url("https://kibana.moseeker.com/elasticsearch/log_301_info_20200816/_search")
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
            list.add(kit.getMessage());
            System.out.println(kit.getMessage());
        }



    }
}
