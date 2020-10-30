package com.lr.mall.utils;

import com.alibaba.fastjson.JSONObject;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

/**
 * @author liurui
 * @date 2020/9/8 7:02 下午
 */
public class App {
    public static String downloadUrl(String urlString) throws Exception {
        // 构造URL
        URL url = new URL(urlString);
        // 打开连接
        URLConnection con = url.openConnection();
        // 输入流
        InputStream is = con.getInputStream();
        // 1K的数据缓冲
        byte[] bs = new byte[1024];
        // 读取到的数据长度
        int len;
        // 输出的文件流
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        // 开始读取
        while ((len = is.read(bs)) != -1) {
            os.write(bs, 0, len);
        }
        String ret = Base64.getEncoder().encodeToString(os.toByteArray());
        // 完毕，关闭所有链接
        os.close();
        is.close();
        return ret;
    }

    public static void main(String[] args) {
        String json = "{\"url\":\"{\\\"testee_invite_result_list\\\":[{\\\"sn\\\":\\\"1301630333135\\\",\\\"test_url\\\":\\\"https://watsons.ceping.com/Login/Elink?elink=48kTUHQQRm9fChSEapGpp5mO4x9dmRqCyA4x4vMFFbOikmRDrLFw0Q==&v=1 \\\"}]}\"}";

        JSONObject jsonObject = JSONObject.parseObject(json, JSONObject.class);
        Object testee_invite_result_list = jsonObject.get("testee_invite_result_list");
        System.out.println(testee_invite_result_list);


    }
}
