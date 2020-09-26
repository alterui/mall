package com.lr.mall.utils;


import org.apache.commons.lang.StringUtils;

import java.io.File;
import java.util.regex.Pattern;

/**
 * @author liurui
 * @date 2020/9/1 10:49 上午
 */
public class Application {
    public static void main(String[] args) {
        pic2Data64("https://cdn-t.dqprism.com/https://thirdwx.qlogo.cn/mmopen/vi_32/Q0j4TwGTfTLzH7smibLpPvcXa7e3U30QLyDfIjt9O3icKfSkY6ao9gJQsic7aficzRBevGMFHeXkWLgquvG9hZgMNw/132");

    }

    public static String pic2Data64( String url) {
        try {
            if (url.startsWith("data:")  ) {
                return url;
            }
            if (url.startsWith("/mnt")) {
                return url;
            }
            if (url.startsWith("file://")) {
                url = StringUtils.substringAfter(url, "file://");
                return url;
            }
            if (!url.startsWith("http") && !url.startsWith("//")) {
                url =   url;
            }
            if (url.startsWith("//")) {
                url = "https:" + url;
            }

            return url;
        } catch (Exception e) {

        }
        return null;
    }
}
