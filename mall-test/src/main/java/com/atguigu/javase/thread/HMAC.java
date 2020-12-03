package com.atguigu.javase.thread;



import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/**
 * @author liurui
 * @date 2020/10/14 2:47 下午
 */
public class HMAC {
    public static void main(String[] args) throws Exception {
        String s = hmacSha1Encrypt("037f023e18ff4e5d880c8edc70fc79f8", "24cdeecc4eb64d77a6672fed4a4354f2");
        System.out.println(s);
    }
    private static final String KEY_MAC = "HmacMD5";

    private static final String KEY_MAC_SHA1 = "HMACSHA1";

    private static final String CHARSET_UTF8 = "UTF-8";

    /*
        使用 HmacSha1 加密
     */
    public static String hmacSha1Encrypt(String encryptText, String encryptKey) throws Exception {
        byte[] text = encryptText.getBytes(CHARSET_UTF8);
        byte[] keyData = encryptKey.getBytes(CHARSET_UTF8);

        SecretKeySpec secretKey = new SecretKeySpec(keyData, KEY_MAC_SHA1);
        Mac mac = Mac.getInstance(secretKey.getAlgorithm());
        mac.init(secretKey);

        return byte2hex(mac.doFinal(text));
    }

    //二行制转字符串
    public static String byte2hex(byte[] b)
    {
        StringBuilder hs = new StringBuilder();
        String stmp;
        for (int n = 0; b!=null && n < b.length; n++) {
            stmp = Integer.toHexString(b[n] & 0XFF);
            if (stmp.length() == 1)
                hs.append('0');
            hs.append(stmp);
        }
        return hs.toString().toUpperCase();
    }


}
