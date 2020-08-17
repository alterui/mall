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
        String str = "send email ATSProcess notice start:{\"companyId\":1134362,\"processId\":902,\"hrId\":97275,\"appId\":4769021,\"phaseId\":20,\"messageId\":1052,\"isStart\":false,\"userName\":\"张丹\",\"userId\":1594404,\"uuid\":\"edc3d51e-21e1-4139-b394-58ade55cd7a3\",\"phaseName\":\"线上笔试\"}";
        System.out.println("send email ATSProcess notice start:".length());

        String substring = str.substring(35);
        System.out.println(substring);


    }
}
