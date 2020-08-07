package com.lr.concurrent.lock;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author liurui
 * @date 2020/8/6 5:17 下午
 */
public class Application {
    public static void main(String[] args) {
        String str = "[\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f280b854769b3196bf18855\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f280b864769b3196bf18857\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee21d5ce7772f134c79e1f\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f280b869879e606690d5337\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f280b869879e606690d5337\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f280b865a27cb0ce6d0062f\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f280b869879e606690d5337\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f280b869879e606690d5338\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f280b879879e606690d5339\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee2749ce7772f134c7ccb5\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f280b865a27cb0ce6d0062f\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f280ffa4769b3196bf1887a\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f280ffa4769b3196bf1887a\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f28108f9879e606690d536b\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f23c28a5a27cb530674adee\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee35f2ce7772f134c84fc8\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2814a14769b3196bf1889d\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f28151f5a27cb0ce6d00670\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2819fe4769b3196bf188b4\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f281bc79879e606690d53af\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f281e7b5a27cb0ce6d006a4\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f281ea55a27cb0ce6d006a8\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f281eb44769b3196bf188d3\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2822b14769b3196bf188e4\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f281eb44769b3196bf188d3\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2822d99879e606690d53d5\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f28310f4769b3196bf18917\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2835c64769b3196bf18947\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2835c65a27cb0ce6d0070b\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2835c65a27cb0ce6d0070d\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2835cc9879e606690d5439\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2835ce5a27cb0ce6d00719\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2835ce5a27cb0ce6d0071a\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee2d23ce7772f134c8008f\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee2d23ce7772f134c8008f\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2835ce5a27cb0ce6d00719\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee2f7ece7772f134c8157d\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee2e6ece7772f134c80bf9\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2843b39879e606690d545b\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee2d3fce7772f134c8017c\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f285fb59879e606690d5475\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f285fb64769b3196bf1898d\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee2bb8ce7772f134c7f3da\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee251ece7772f134c7ba43\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee2eafce7772f134c80e3a\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f28ab339879e606690d54b7\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f28ab485a27cb0ce6d007a5\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f28b2039879e606690d54c4\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f28b4189879e606690d54d6\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee1f80ce7772f134c78a96\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f28b4199879e606690d54d8\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f28b6e54769b3196bf189e1\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee2272ce7772f134c7a35b\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f28b91e5a27cb0ce6d007df\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f28bd969879e606690d54fd\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee2b4dce7772f134c7f025\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f28cba15a27cb0ce6d00813\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f28cbdd5a27cb0ce6d0081a\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f28cc255a27cb0ce6d0081f\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f28cc944769b3196bf18a29\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f28d5bc5a27cb0ce6d00853\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f26b9db5a27cb530674b3b5\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f28db5b4769b3196bf18a71\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f28dc944769b3196bf18a78\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f28de9f5a27cb0ce6d008b2\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee31d2ce7772f134c82a7e\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee2792ce7772f134c7cf13\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee2fbcce7772f134c81798\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f28dea05a27cb0ce6d008b4\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee31d2ce7772f134c82a7e\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f28dea15a27cb0ce6d008b6\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f28dea25a27cb0ce6d008b7\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f28dea25a27cb0ce6d008b8\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f28dea35a27cb0ce6d008b9\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f28dea35a27cb0ce6d008ba\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f28dea45a27cb0ce6d008bb\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f28dea55a27cb0ce6d008bc\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f28dea54769b3196bf18ac5\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f28dea59879e606690d55d1\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee373fce7772f134c85b79\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f28dea59879e606690d55d1\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f28e3bc4769b3196bf18ae6\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f28e3d05a27cb0ce6d008eb\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f28e79f5a27cb0ce6d008f6\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee33d5ce7772f134c83ca1\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f28e79f5a27cb0ce6d008f6\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f27a06b4769b35eae9529a1\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f28e9155a27cb0ce6d008ff\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f28e79f5a27cb0ce6d008f6\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f01b7ca9879e618723e21fb\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f28f2069879e606690d5630\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee3367ce7772f134c838ab\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee363fce7772f134c85281\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f28ff9c4769b3196bf18b5c\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f21a2a69879e66f51a64ee8\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2900575a27cb0ce6d0095d\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee3367ce7772f134c838ab\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2904759879e606690d5687\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee3736ce7772f134c85b2b\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2908af4769b3196bf18bba\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2908b05a27cb0ce6d009ad\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f18396d4769b37c417a48bd\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee2702ce7772f134c7ca70\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee2694ce7772f134c7c6e3\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee2ed5ce7772f134c80f98\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee2dcbce7772f134c80640\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2911b74769b3196bf18bf7\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2911e49879e606690d56e1\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f29126f9879e606690d56e8\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f291ab15a27cb0ce6d00a11\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f291b7d9879e606690d5710\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f291b825a27cb0ce6d00a14\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5ef804359879e65a53628426\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f291c6a9879e606690d571d\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f291fd54769b3196bf18c47\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2920314769b3196bf18c4e\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2920465a27cb0ce6d00a33\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2920939879e606690d5736\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2921805a27cb0ce6d00a40\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2924869879e606690d5753\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee229cce7772f134c7a4bd\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee229cce7772f134c7a4bd\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f292e724769b3196bf18ca1\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f292e8f9879e606690d578a\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f292e965a27cb0ce6d00a72\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee2d60ce7772f134c80294\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f292ecd5a27cb0ce6d00a7a\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f292ef35a27cb0ce6d00a7c\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2930329879e606690d579a\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2932e25a27cb0ce6d00aab\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2932e35a27cb0ce6d00aac\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2932e39879e606690d57c9\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2932e34769b3196bf18cdb\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f05463e5a27cb1a4ebaef3b\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f1a88244769b37c417a4f34\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2932e34769b3196bf18cdc\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5ef5e8869879e65a5362817b\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2932e39879e606690d57cb\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2932e49879e606690d57ce\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2932e45a27cb0ce6d00aae\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2932e44769b3196bf18cde\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f1e4dfe5a27cb70d7afd55a\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2932e59879e606690d57cf\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5ef5e8869879e65a5362817b\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2932e64769b3196bf18cdf\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2932e64769b3196bf18ce0\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2938084769b3196bf18cfa\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5ef9928a9879e618723e09b4\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2946054769b3196bf18d36\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f294a1a4769b3196bf18d46\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f294a405a27cb0ce6d00b1a\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f294a439879e606690d5839\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f294a575a27cb0ce6d00b1b\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2954109879e606690d5854\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2954305a27cb0ce6d00b38\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2955ca9879e606690d585c\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f295cf35a27cb0ce6d00b63\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f295cf39879e606690d5898\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee2d07ce7772f134c7ff9e\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee3014ce7772f134c81ab6\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2961cb5a27cb0ce6d00b75\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee284ace7772f134c7d503\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f29684b4769b3196bf18de6\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f296c5d5a27cb0ce6d00ba1\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f296c5d5a27cb0ce6d00ba1\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2970084769b3196bf18dfe\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f29744b9879e606690d590f\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2978be9879e606690d5923\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2980ac4769b3196bf18e4b\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2982724769b3196bf18e52\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f1831755a27cb70d7afc740\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f1831755a27cb70d7afc740\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f29874b9879e606690d5972\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f29874b4769b3196bf18e72\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f1039975a27cb1a4ebb20aa\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f29874b4769b3196bf18e71\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f29874b4769b3196bf18e74\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f29874d9879e606690d5973\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f29874d5a27cb0ce6d00c1a\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f29874d4769b3196bf18e76\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f298bae9879e606690d598a\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f298c0b5a27cb0ce6d00c41\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f298c579879e606690d5991\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2999b85a27cb0ce6d00c5a\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2999ed9879e606690d59a6\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f298c0b5a27cb0ce6d00c41\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f299a259879e606690d59a8\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f299a564769b3196bf18eb0\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f29a7e14769b3196bf18eb5\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f29a7e99879e606690d59b3\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee3629ce7772f134c851b5\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f29db5e4769b3196bf18edc\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f29874d4769b3196bf18e76\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f29db5e5a27cb0ce6d00c94\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f29874d4769b3196bf18e76\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f29874d4769b3196bf18e76\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee30c7ce7772f134c820f5\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f29e7699879e606690d59f1\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee36e8ce7772f134c85864\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f29fc915a27cb0ce6d00cb6\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f29fc939879e606690d5a02\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f29fcad9879e606690d5a05\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f1a4b869879e66f51a63a04\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a05a44769b3196bf18f07\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f1a4b869879e66f51a63a04\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee3499ce7772f134c84395\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee2f7dce7772f134c8156c\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a05a79879e606690d5a1b\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a07be5a27cb0ce6d00cd2\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a09bf9879e606690d5a2d\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee2706ce7772f134c7ca92\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a12089879e606690d5a4c\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a13665a27cb0ce6d00cfc\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a194d4769b3196bf18f4f\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a1d814769b3196bf18f60\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a1da25a27cb0ce6d00d20\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f07e9019879e618723e4604\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a2b8e9879e606690d5aab\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee316bce7772f134c826c2\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a2bea4769b3196bf18fa7\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f0eaacc5a27cb1a4ebb1906\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a300c5a27cb0ce6d00da3\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee352cce7772f134c848ce\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee3521ce7772f134c84874\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee2792ce7772f134c7cf13\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee3521ce7772f134c84874\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee3728ce7772f134c85ab0\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a300f4769b3196bf18fe6\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a300f5a27cb0ce6d00daa\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a300f9879e606690d5ae7\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee2006ce7772f134c78ed9\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a300f4769b3196bf18fe7\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a300f4769b3196bf18fe8\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f0ed5005a27cb1a4ebb1a25\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a300f5a27cb0ce6d00dac\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a39504769b3196bf1901a\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a395d4769b3196bf1901c\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a39f29879e606690d5b10\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a3a0a4769b3196bf19022\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee227ece7772f134c7a3c0\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a42ee4769b3196bf19032\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a430a5a27cb0ce6d00dfb\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee32bbce7772f134c832b6\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee221dce7772f134c7a087\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a51974769b3196bf1907b\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a580f5a27cb0ce6d00e5b\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a58435a27cb0ce6d00e5d\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a59405a27cb0ce6d00e5f\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a59699879e606690d5b86\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee31d2ce7772f134c82a7e\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a5a324769b3196bf190c6\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a5a329879e606690d5bae\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f05463e5a27cb1a4ebaef3b\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a5a339879e606690d5baf\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee2e50ce7772f134c80aed\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a5a335a27cb0ce6d00e8d\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f083d5d5a27cb1a4ebb0102\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a5a344769b3196bf190c9\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a5a354769b3196bf190ca\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f198fd75a27cb70d7afcbb8\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a5a355a27cb0ce6d00e8f\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee31d2ce7772f134c82a7e\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a5a364769b3196bf190cd\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee31d2ce7772f134c82a7e\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a5a375a27cb0ce6d00e91\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee2207ce7772f134c79fc4\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee31d2ce7772f134c82a7e\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a64045a27cb0ce6d00ed3\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a64045a27cb0ce6d00ed3\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a64d29879e606690d5c01\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a6ba79879e606690d5c26\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a71764769b3196bf1915b\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a71924769b3196bf1915d\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a719d9879e606690d5c41\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a71a35a27cb0ce6d00f19\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a71f45a27cb0ce6d00f24\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a72aa4769b3196bf19173\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a72b64769b3196bf19175\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a72fb9879e606690d5c53\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a7ba04769b3196bf19197\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee275cce7772f134c7cd53\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a7f684769b3196bf191a7\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a7f8c5a27cb0ce6d00f65\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a84475a27cb0ce6d00f99\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a84495a27cb0ce6d00f9b\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a84495a27cb0ce6d00f9c\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a84494769b3196bf191da\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a84495a27cb0ce6d00f9c\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a844b4769b3196bf191de\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a844c9879e606690d5ca9\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee2ed0ce7772f134c80f67\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f17bb049879e66f51a63212\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a844c9879e606690d5cab\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a844c9879e606690d5caa\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a844d9879e606690d5cac\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a844d9879e606690d5cad\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a844d5a27cb0ce6d00fa0\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee2c14ce7772f134c7f717\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a844d5a27cb0ce6d00fa1\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a89a05a27cb0ce6d00fc2\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a8e504769b3196bf19216\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a96e14769b3196bf1922f\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a975b9879e606690d5cef\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a9b914769b3196bf19249\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a9ba65a27cb0ce6d00ffe\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5ef98d8f5a27cb1a4ebac2a9\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2aa2fd4769b3196bf1925d\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2aa87d5a27cb0ce6d01021\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2aa9d39879e606690d5d35\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2aae725a27cb0ce6d01046\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2aae724769b3196bf19295\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2aae739879e606690d5d58\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a9ba65a27cb0ce6d00ffe\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2aae735a27cb0ce6d01047\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2aae739879e606690d5d5a\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2aae744769b3196bf19297\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2aae744769b3196bf19298\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee2ed0ce7772f134c80f67\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2aae769879e606690d5d5e\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2aae765a27cb0ce6d0104a\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2aae774769b3196bf1929f\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2aae789879e606690d5d60\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2ab2314769b3196bf192b5\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2ab3624769b3196bf192b8\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2ab3af4769b3196bf192bf\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2ab3b39879e606690d5d8c\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2ab3bc9879e606690d5d8e\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2ab3f19879e606690d5d90\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2ab3f75a27cb0ce6d01077\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2ab3fc5a27cb0ce6d01078\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2ab3fc5a27cb0ce6d01078\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee373fce7772f134c85b7c\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2ab55a4769b3196bf192d2\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2ab3f75a27cb0ce6d01077\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee3521ce7772f134c84874\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2ac1d35a27cb0ce6d01098\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2ac1e04769b3196bf192f8\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2ac1fd9879e606690d5dc5\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2ac2284769b3196bf192fd\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2acf434769b3196bf19331\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2acfba9879e606690d5df6\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2acff05a27cb0ce6d010cc\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee2e17ce7772f134c808f0\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2ad8bd5a27cb0ce6d01105\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2ad8bd4769b3196bf19376\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f02c8045a27cb1a4ebade09\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee2e38ce7772f134c80a12\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2ad8be9879e606690d5e30\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f240e325a27cb530674af20\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2ad8c45a27cb0ce6d0110d\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2ade335a27cb0ce6d01122\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2ade335a27cb0ce6d01122\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2ade335a27cb0ce6d01122\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2b02b05a27cb0ce6d01158\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2b2cdc5a27cb0ce6d0117b\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2b3f9f5a27cb0ce6d0118d\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2b4e734769b3196bf193e7\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5efb0e2d9879e618723e0ec9\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2b5be29879e606690d5ee7\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2b5c214769b3196bf1940a\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2b607a4769b3196bf19414\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2b607f5a27cb0ce6d011d7\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee2ce4ce7772f134c7fe60\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2999ed9879e606690d59a6\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2b6a9b5a27cb0ce6d011f1\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2b6afc4769b3196bf1943e\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2b6e8d5a27cb0ce6d01209\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2b6f184769b3196bf19459\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f0841f45a27cb1a4ebb012d\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2b70a64769b3196bf19461\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2b72079879e606690d5f41\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2b78045a27cb0ce6d0123d\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5ef1ee648865ddec3bdbabb9\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2b7ad45a27cb0ce6d0124d\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2b7cb15a27cb0ce6d01257\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2b7d335a27cb0ce6d0125e\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2b81839879e606690d5fcf\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2b81835a27cb0ce6d0129d\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2b81839879e606690d5fd0\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2b81844769b3196bf194e2\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2b81854769b3196bf194e3\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2b81839879e606690d5fcf\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2b81864769b3196bf194e4\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2b81874769b3196bf194e5\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee3208ce7772f134c82c6c\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2b81874769b3196bf194e6\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2b81875a27cb0ce6d012a2\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee25c9ce7772f134c7c002\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2b8ba89879e606690d5ffb\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee26c0ce7772f134c7c855\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2b94ce5a27cb0ce6d012f3\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2b996b9879e606690d6026\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f1eb0454769b37c417a58e4\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2ba2da9879e606690d604d\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2ba3305a27cb0ce6d01325\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2ba3425a27cb0ce6d0132a\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee3613ce7772f134c850ef\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee2e42ce7772f134c80a6a\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee2d10ce7772f134c7fff2\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2ba71e9879e606690d606d\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2ba75f9879e606690d6071\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f1868989879e66f51a63554\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2a844c9879e606690d5caa\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2bab974769b3196bf195bd\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2bab984769b3196bf195be\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee33ffce7772f134c83e18\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2bab994769b3196bf195bf\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f1e52779879e66f51a642d1\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2bab994769b3196bf195bf\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2bab9a9879e606690d609f\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2bab9b5a27cb0ce6d01370\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee307ece7772f134c81e57\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2bab9c5a27cb0ce6d01371\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2bab9d9879e606690d60a1\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2bab9d4769b3196bf195c4\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f22adee9879e66f51a651ff\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2bab9e9879e606690d60a4\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2bb5575a27cb0ce6d013bf\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2bb5c65a27cb0ce6d013c3\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2bb5ff5a27cb0ce6d013c6\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee2bb3ce7772f134c7f3ae\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5eee32a5ce7772f134c831f0\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2bc4084769b3196bf1964c\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"candidate_profile_id\": \"5f2bc51f5a27cb0ce6d01415\"\n" +
                "  }\n" +
                "]";

        List<APP> apps = JSONObject.parseArray(str, APP.class);
        List<String> list = new ArrayList<String>();
        apps.forEach(e->{
            list.add(e.getCandidate_profile_id());
        });
        System.out.println(Arrays.toString(list.toArray()));


    }
}
