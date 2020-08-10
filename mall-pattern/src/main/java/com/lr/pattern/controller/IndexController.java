package com.lr.pattern.controller;

import com.lr.pattern.bean.Student;
import com.lr.pattern.service.IndexService;
import com.mysql.cj.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        String s = filterEmoji("❗\uD83D\uDE1C\uD83D\uDC8B \uD83D\uDC40 \uD83D\uDE2A \uD83D\uDE11 \uD83D\uDCA5 \uD83D\uDE4B \uD83D\uDE1E \uD83D\uDE29 \uD83D\uDE21 \uD83E\uDD2A \uD83D\uDC4A ☀ \uD83D\uDE25 \uD83E\uDD24 \uD83D\uDC49 \uD83D\uDC83 \uD83D\uDE33 ✋ \uD83D\uDE1A \uD83D\uDE1D \uD83D\uDE34 \uD83C\uDF1F \uD83D\uDE2C \uD83D\uDE43 \uD83C\uDF40 \uD83C\uDF37 \uD83D\uDE3B \uD83D\uDE13 ⭐ ✅ \uD83C\uDF08 \uD83D\uDE08 \uD83E\uDD18对的");
        System.out.println(s);
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
