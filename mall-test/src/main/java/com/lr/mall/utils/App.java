package com.lr.mall.utils;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Base64;

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
        try {
            String str = downloadUrl("https://thirdwx.qlogo.cn/mmopen/vi_32/Q0j4TwGTfTLzH7smibLpPvcXa7e3U30QLyDfIjt9O3icKfSkY6ao9gJQsic7aficzRBevGMFHeXkWLgquvG9hZgMNw/132");
            System.out.println(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
