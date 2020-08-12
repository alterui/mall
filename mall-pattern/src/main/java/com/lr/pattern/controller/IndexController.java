package com.lr.pattern.controller;

import com.lr.pattern.bean.Student;
import com.lr.pattern.service.IndexService;
import com.mysql.cj.util.StringUtils;
import com.sun.tools.javah.LLNI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * @author liurui
 * @date 2020/6/12 2:31 下午
 */
@RestController
public class IndexController {

    @Autowired
    IndexService indexService;


    @PostMapping("/get")
    public void get(@RequestBody Student student) {

        System.out.println(student);

    }

    public static void main(String[] args) {
        get();

    }

    static boolean get() {
        List list2 = null;


        List list1 = new ArrayList();
        return list1.size() == list2.size() &&list1 .containsAll(list2) && list2.containsAll(list1);


    }

    public static String filterEmoji1(String str) {

        if (str.trim().isEmpty()) {
            return str;
        }
        //String pattern="[\ud83c\udc00-\ud83c\udfff]|[\ud83d\udc00-\ud83d\udfff]|[\u2600-\u27ff]";
        String pattern = "[\ud83c\udc00-\ud83c\udfff]|[\ud83d\udc00-\ud83d\udfff]|[\u2600-\u27ff]|[\ud83d\ude1c]|[\ud83d\ude49]|[\ud83d\udea8]|[\ud83d\ude9c]|[\\ud83c\\udc00-\\ud83c\\udfff]|[\\ud83d\\udc00-\\ud83d\\udfff]|[\\u2600-\\u27ff]]";
        String reStr = "";
        Pattern emoji = Pattern.compile(pattern);
        Matcher emojiMatcher = emoji.matcher(str);
        str = emojiMatcher.replaceAll(reStr);
        return str;

    }

    public static String filterEmoji(String source) {

        if (!containsWord(source)) {
            return source;//如果不包含，直接返回
        }
        //到这里铁定包含
        StringBuilder buf = null;

        int len = source.length();

        for (int i = 0; i < len; i++) {
            char codePoint = source.charAt(i);
            //System.out.println("codePoint:"+codePoint);

            if (isNotEmojiCharacter(codePoint)) {
                if (buf == null) {
                    buf = new StringBuilder(source.length());
                }
                buf.append(codePoint);
            } else {
            }
        }

        if (buf == null) {
            return "";//如果没有可能到这步吧！
        } else {
            if (buf.length() == len) {//这里的意义在于尽可能少的toString，因为会重新生成字符串
                return source;
            } else {
                return buf.toString();
            }
        }

    }

    private static boolean isNotEmojiCharacter(char codePoint) {
        return (codePoint == 0x0) || (codePoint == 0x9) || (codePoint == 0xA)
                || (codePoint == 0xD) || ((codePoint >= 0x20) && (codePoint <= 0xD7FF))
                || ((codePoint >= 0xE000) && (codePoint <= 0xFFFD))
                || ((codePoint >= 0x10000) && (codePoint <= 0x10FFFF));
    }

    /**
     * 检测是否有emoji字符
     *
     * @param source
     * @return 一旦含有就抛出
     */
    public static boolean containsWord(String source) {
        if (StringUtils.isNullOrEmpty(source)) {
            return false;
        }

        int len = source.length();
        for (int i = 0; i < len; i++) {
            char codePoint = source.charAt(i);

            if (isNotEmojiCharacter(codePoint)) {
                return true;
            }
        }

        return false;
    }




}
