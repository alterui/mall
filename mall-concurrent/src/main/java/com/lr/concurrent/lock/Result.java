package com.lr.concurrent.lock;

import com.alibaba.fastjson.JSONObject;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liurui
 * @date 2020/8/13 3:35 下午
 */
public class Result {
    public static void main(String[] args) {
        String str = "send email ATSProcess notice start:{\"companyId\":1134362,\"processId\":902,\"hrId\":97275,\"appId\":4784900,\"phaseId\":20,\"messageId\":1049,\"isStart\":false,\"userName\":\"段雨辰\",\"userId\":10764183,\"uuid\":\"ad9ab350-86f8-4024-a154-07e67545cfed\",\"phaseName\":\"线上笔试\"}\n" +
                "send email ATSProcess notice start:{\"companyId\":1134362,\"processId\":902,\"hrId\":97275,\"appId\":4783365,\"phaseId\":20,\"messageId\":1049,\"isStart\":false,\"userName\":\"魏子程\",\"userId\":14397007,\"uuid\":\"d7649274-e36d-4b5a-822a-871c919e610a\",\"phaseName\":\"线上笔试\"}\n" +
                "send email ATSProcess notice start:{\"companyId\":1134362,\"processId\":902,\"hrId\":97275,\"appId\":4825068,\"phaseId\":20,\"messageId\":1049,\"isStart\":false,\"userName\":\"赵嘉昊\",\"userId\":4539797,\"uuid\":\"a4c0cf0e-ad06-4224-8239-6c19ba41cd77\",\"phaseName\":\"线上笔试\"}\n" +
                "send email ATSProcess notice start:{\"companyId\":1134362,\"processId\":902,\"hrId\":97275,\"appId\":4765328,\"phaseId\":20,\"messageId\":1049,\"isStart\":false,\"userName\":\"朱幸梓\",\"userId\":10394604,\"uuid\":\"da8a35a6-7958-4cd3-8273-03a890f24d6c\",\"phaseName\":\"线上笔试\"}\n" +
                "send email ATSProcess notice start:{\"companyId\":1134362,\"processId\":902,\"hrId\":97275,\"appId\":4824366,\"phaseId\":20,\"messageId\":1049,\"isStart\":false,\"userName\":\"郑映芳\",\"userId\":10575769,\"uuid\":\"eb3f96d7-ca38-452e-ae72-7df322fb2a13\",\"phaseName\":\"线上笔试\"}\n" +
                "send email ATSProcess notice start:{\"companyId\":1134362,\"processId\":902,\"hrId\":97275,\"appId\":4822779,\"phaseId\":20,\"messageId\":1049,\"isStart\":false,\"userName\":\"全媚\",\"userId\":8898600,\"uuid\":\"c23be985-2e92-4c94-9b4c-46ea114cb23a\",\"phaseName\":\"线上笔试\"}\n" +
                "send email ATSProcess notice start:{\"companyId\":1134362,\"processId\":902,\"hrId\":97275,\"appId\":4805875,\"phaseId\":20,\"messageId\":1049,\"isStart\":false,\"userName\":\"谭靖扬\",\"userId\":10328634,\"uuid\":\"dfaf774a-8c4f-4156-8ac5-77910804b7fb\",\"phaseName\":\"线上笔试\"}\n" +
                "send email ATSProcess notice start:{\"companyId\":1134362,\"processId\":902,\"hrId\":97275,\"appId\":4821571,\"phaseId\":20,\"messageId\":1049,\"isStart\":false,\"userName\":\"苏可帆\",\"userId\":5494303,\"uuid\":\"89a95b5a-0005-4623-9ce7-fbac1e1e70f4\",\"phaseName\":\"线上笔试\"}\n" +
                "send email ATSProcess notice start:{\"companyId\":1134362,\"processId\":902,\"hrId\":97275,\"appId\":4762221,\"phaseId\":20,\"messageId\":1049,\"isStart\":false,\"userName\":\"李鑫婕\",\"userId\":437352,\"uuid\":\"cdb3cb08-ade6-4c34-8c58-7daf87835370\",\"phaseName\":\"线上笔试\"}\n" +
                "send email ATSProcess notice start:{\"companyId\":1134362,\"processId\":902,\"hrId\":97275,\"appId\":4821420,\"phaseId\":20,\"messageId\":1049,\"isStart\":false,\"userName\":\"卢佳奕\",\"userId\":8370065,\"uuid\":\"456a17fb-3f29-4f1f-97cc-95fe6eced29c\",\"phaseName\":\"线上笔试\"}\n" +
                "send email ATSProcess notice start:{\"companyId\":1134362,\"processId\":902,\"hrId\":97275,\"appId\":4815235,\"phaseId\":20,\"messageId\":1049,\"isStart\":false,\"userName\":\"樊津茜\",\"userId\":164764,\"uuid\":\"92362041-f4cf-4fc8-9676-9ee48839b51f\",\"phaseName\":\"线上笔试\"}\n" +
                "send email ATSProcess notice start:{\"companyId\":1134362,\"processId\":902,\"hrId\":97275,\"appId\":4815138,\"phaseId\":20,\"messageId\":1049,\"isStart\":false,\"userName\":\"孙芷莹\",\"userId\":8322131,\"uuid\":\"b07decba-19f5-46da-a7b0-3defc18cc512\",\"phaseName\":\"线上笔试\"}\n" +
                "send email ATSProcess notice start:{\"companyId\":1134362,\"processId\":902,\"hrId\":97275,\"appId\":4777905,\"phaseId\":20,\"messageId\":1049,\"isStart\":false,\"userName\":\"胡雅洁\",\"userId\":15332981,\"uuid\":\"9b3f7ad3-d169-4fdf-adf6-0fc3e8c77b9d\",\"phaseName\":\"线上笔试\"}\n" +
                "send email ATSProcess notice start:{\"companyId\":1134362,\"processId\":902,\"hrId\":97275,\"appId\":4814529,\"phaseId\":20,\"messageId\":1049,\"isStart\":false,\"userName\":\"谢杭\",\"userId\":15731535,\"uuid\":\"290266bd-1fca-47d7-bcc7-cedb0068a2c6\",\"phaseName\":\"线上笔试\"}\n" +
                "send email ATSProcess notice start:{\"companyId\":1134362,\"processId\":902,\"hrId\":97275,\"appId\":4818120,\"phaseId\":20,\"messageId\":1049,\"isStart\":false,\"userName\":\"肖珺\",\"userId\":9873004,\"uuid\":\"ae8dcac4-4bdb-40fd-a361-90db050a4e5b\",\"phaseName\":\"线上笔试\"}\n" +
                "send email ATSProcess notice start:{\"companyId\":1134362,\"processId\":902,\"hrId\":97275,\"appId\":4759532,\"phaseId\":20,\"messageId\":1049,\"isStart\":false,\"userName\":\"徐艺晅\",\"userId\":10509817,\"uuid\":\"c9ec2cf7-35ba-4207-81dc-ec5dad99dfea\",\"phaseName\":\"线上笔试\"}\n" +
                "send email ATSProcess notice start:{\"companyId\":1134362,\"processId\":902,\"hrId\":97275,\"appId\":4776817,\"phaseId\":20,\"messageId\":1049,\"isStart\":false,\"userName\":\"丁含\",\"userId\":14840088,\"uuid\":\"46724127-afe8-4cfd-ab3b-bb547aedb16b\",\"phaseName\":\"线上笔试\"}\n" +
                "send email ATSProcess notice start:{\"companyId\":1134362,\"processId\":902,\"hrId\":97275,\"appId\":4812198,\"phaseId\":20,\"messageId\":1049,\"isStart\":false,\"userName\":\"韦顺美\",\"userId\":2178499,\"uuid\":\"b83654d7-07f5-4d40-ab10-b9358d216c20\",\"phaseName\":\"线上笔试\"}\n" +
                "send email ATSProcess notice start:{\"companyId\":1134362,\"processId\":902,\"hrId\":97275,\"appId\":4810755,\"phaseId\":20,\"messageId\":1049,\"isStart\":false,\"userName\":\"戴成章\",\"userId\":16465158,\"uuid\":\"e7298973-888b-42f8-97d7-682f36b45201\",\"phaseName\":\"线上笔试\"}\n" +
                "send email ATSProcess notice start:{\"companyId\":1134362,\"processId\":902,\"hrId\":97275,\"appId\":4757962,\"phaseId\":20,\"messageId\":1049,\"isStart\":false,\"userName\":\"黄倚婷\",\"userId\":6414767,\"uuid\":\"89685bf5-4901-4fbb-9e67-0211da2f187e\",\"phaseName\":\"线上笔试\"}\n" +
                "send email ATSProcess notice start:{\"companyId\":1134362,\"processId\":902,\"hrId\":97275,\"appId\":4772804,\"phaseId\":20,\"messageId\":1049,\"isStart\":false,\"userName\":\"李慧丽\",\"userId\":10545190,\"uuid\":\"91897319-2ced-4684-b4b0-4ce7ecc20a21\",\"phaseName\":\"线上笔试\"}\n" +
                "send email ATSProcess notice start:{\"companyId\":1134362,\"processId\":902,\"hrId\":97275,\"appId\":4832851,\"phaseId\":20,\"messageId\":1049,\"isStart\":false,\"userName\":\"李彪\",\"userId\":16827873,\"uuid\":\"78df5a61-a2f8-45ef-9396-c390319715b3\",\"phaseName\":\"线上笔试\"}\n" +
                "send email ATSProcess notice start:{\"companyId\":1134362,\"processId\":902,\"hrId\":97275,\"appId\":4832619,\"phaseId\":20,\"messageId\":1049,\"isStart\":false,\"userName\":\"王静\",\"userId\":16914928,\"uuid\":\"912f5b00-7f76-410a-af5f-7bbcdbba41ef\",\"phaseName\":\"线上笔试\"}\n" +
                "send email ATSProcess notice start:{\"companyId\":1134362,\"processId\":902,\"hrId\":97275,\"appId\":4772400,\"phaseId\":20,\"messageId\":1049,\"isStart\":false,\"userName\":\"潘孝聪\",\"userId\":9032505,\"uuid\":\"aee5becc-835d-496b-82be-70b4e0fa4c06\",\"phaseName\":\"线上笔试\"}\n" +
                "send email ATSProcess notice start:{\"companyId\":1134362,\"processId\":902,\"hrId\":97275,\"appId\":4789103,\"phaseId\":20,\"messageId\":1049,\"isStart\":false,\"userName\":\"周思蕾\",\"userId\":433278,\"uuid\":\"5c10953c-d0a8-4c92-9386-4245140556af\",\"phaseName\":\"线上笔试\"}\n" +
                "send email ATSProcess notice start:{\"companyId\":1134362,\"processId\":902,\"hrId\":97275,\"appId\":4832079,\"phaseId\":20,\"messageId\":1049,\"isStart\":false,\"userName\":\"李钟铄\",\"userId\":12556954,\"uuid\":\"bf2f1304-ce62-45d1-991f-e575c75b5662\",\"phaseName\":\"线上笔试\"}\n" +
                "send email ATSProcess notice start:{\"companyId\":1134362,\"processId\":902,\"hrId\":97275,\"appId\":4831760,\"phaseId\":20,\"messageId\":1049,\"isStart\":false,\"userName\":\"张行\",\"userId\":10761023,\"uuid\":\"8e37d6a1-8a4e-4188-ab88-a1238623e072\",\"phaseName\":\"线上笔试\"}\n" +
                "send email ATSProcess notice start:{\"companyId\":1134362,\"processId\":902,\"hrId\":97275,\"appId\":4787997,\"phaseId\":20,\"messageId\":1049,\"isStart\":false,\"userName\":\"龙又榕\",\"userId\":6505622,\"uuid\":\"ca1e9563-4a8a-40ca-a878-a176a24c1e7f\",\"phaseName\":\"线上笔试\"}\n" +
                "send email ATSProcess notice start:{\"companyId\":1134362,\"processId\":902,\"hrId\":97275,\"appId\":4830774,\"phaseId\":20,\"messageId\":1049,\"isStart\":false,\"userName\":\"黄雨菁\",\"userId\":3341922,\"uuid\":\"ca2aa48a-cf24-4ea3-acd6-72e8f2a3f7a4\",\"phaseName\":\"线上笔试\"}\n" +
                "send email ATSProcess notice start:{\"companyId\":1134362,\"processId\":902,\"hrId\":97275,\"appId\":4830621,\"phaseId\":20,\"messageId\":1049,\"isStart\":false,\"userName\":\"董长虹\",\"userId\":15695388,\"uuid\":\"e4cdcec8-cb8f-4341-83af-d4ed1e8ae7d0\",\"phaseName\":\"线上笔试\"}\n" +
                "send email ATSProcess notice start:{\"companyId\":1134362,\"processId\":902,\"hrId\":97275,\"appId\":4830603,\"phaseId\":20,\"messageId\":1049,\"isStart\":false,\"userName\":\"吴昊\",\"userId\":4623911,\"uuid\":\"a4a3dae7-520a-4a8e-8797-e0e2dabc7e8e\",\"phaseName\":\"线上笔试\"}\n" +
                "send email ATSProcess notice start:{\"companyId\":1134362,\"processId\":902,\"hrId\":97275,\"appId\":4786098,\"phaseId\":20,\"messageId\":1049,\"isStart\":false,\"userName\":\"吴洵燊\",\"userId\":10318887,\"uuid\":\"b8ef7abd-6607-48ba-b824-024f21f7d7fb\",\"phaseName\":\"线上笔试\"}\n" +
                "send email ATSProcess notice start:{\"companyId\":1134362,\"processId\":902,\"hrId\":97275,\"appId\":4769147,\"phaseId\":20,\"messageId\":1049,\"isStart\":false,\"userName\":\"何嘉旻\",\"userId\":5209152,\"uuid\":\"3419d98b-f7c2-45f2-9ab1-e7e166a10489\",\"phaseName\":\"线上笔试\"}\n" +
                "send email ATSProcess notice start:{\"companyId\":1134362,\"processId\":902,\"hrId\":97275,\"appId\":4785719,\"phaseId\":20,\"messageId\":1049,\"isStart\":false,\"userName\":\"董依静\",\"userId\":8815598,\"uuid\":\"809f3ae0-77e3-4a61-80fd-619cb06aba1c\",\"phaseName\":\"线上笔试\"}\n" +
                "send email ATSProcess notice start:{\"companyId\":1134362,\"processId\":902,\"hrId\":97275,\"appId\":4794716,\"phaseId\":20,\"messageId\":1049,\"isStart\":false,\"userName\":\"叶奇凯\",\"userId\":10087549,\"uuid\":\"64bb277a-0fb7-4373-8d38-17103f682cf8\",\"phaseName\":\"线上笔试\"}\n" +
                "send email ATSProcess notice start:{\"companyId\":1134362,\"processId\":902,\"hrId\":97275,\"appId\":4767859,\"phaseId\":20,\"messageId\":1049,\"isStart\":false,\"userName\":\"陈珊珊\",\"userId\":10444764,\"uuid\":\"20dfbe6a-973a-42e3-a668-6c09bceb4af6\",\"phaseName\":\"线上笔试\"}\n" +
                "send email ATSProcess notice start:{\"companyId\":1134362,\"processId\":902,\"hrId\":97275,\"appId\":4839445,\"phaseId\":20,\"messageId\":1049,\"isStart\":false,\"userName\":\"彭博桦\",\"userId\":10771826,\"uuid\":\"c31c4842-8fca-441a-b8a8-8cf64bbc7930\",\"phaseName\":\"线上笔试\"}\n" +
                "send email ATSProcess notice start:{\"companyId\":1134362,\"processId\":902,\"hrId\":97275,\"appId\":4775232,\"phaseId\":20,\"messageId\":1049,\"isStart\":false,\"userName\":\"黄曼婷\",\"userId\":12610939,\"uuid\":\"4cadbb91-4839-4a72-a736-72321290207d\",\"phaseName\":\"线上笔试\"}\n" +
                "send email ATSProcess notice start:{\"companyId\":1134362,\"processId\":902,\"hrId\":97275,\"appId\":4792861,\"phaseId\":20,\"messageId\":1049,\"isStart\":false,\"userName\":\"徐一凡\",\"userId\":16241758,\"uuid\":\"3dbe48ae-f612-4709-87cd-0bfe3f15c20e\",\"phaseName\":\"线上笔试\"}\n" +
                "send email ATSProcess notice start:{\"companyId\":1134362,\"processId\":902,\"hrId\":97275,\"appId\":4837328,\"phaseId\":20,\"messageId\":1049,\"isStart\":false,\"userName\":\"黄康\",\"userId\":7139983,\"uuid\":\"4a29a502-70fa-41b3-b4cb-c9236778b71e\",\"phaseName\":\"线上笔试\"}\n" +
                "send email ATSProcess notice start:{\"companyId\":1134362,\"processId\":902,\"hrId\":97275,\"appId\":4792507,\"phaseId\":20,\"messageId\":1049,\"isStart\":false,\"userName\":\"张文亮\",\"userId\":11036610,\"uuid\":\"8d9d6145-7fb1-4ac6-b529-94fe8199d708\",\"phaseName\":\"线上笔试\"}\n" +
                "send email ATSProcess notice start:{\"companyId\":1134362,\"processId\":902,\"hrId\":97275,\"appId\":4836573,\"phaseId\":20,\"messageId\":1049,\"isStart\":false,\"userName\":\"王彬\",\"userId\":664969,\"uuid\":\"86f11682-16db-470b-891b-cf4c8603be65\",\"phaseName\":\"线上笔试\"}\n" +
                "send email ATSProcess notice start:{\"companyId\":1134362,\"processId\":902,\"hrId\":97275,\"appId\":4804093,\"phaseId\":20,\"messageId\":1049,\"isStart\":false,\"userName\":\"吴家妍\",\"userId\":10339418,\"uuid\":\"640b6de3-0c6c-43e2-8cdc-1ee9ea13d1b8\",\"phaseName\":\"线上笔试\"}\n" +
                "send email ATSProcess notice start:{\"companyId\":1134362,\"processId\":902,\"hrId\":97275,\"appId\":4791860,\"phaseId\":20,\"messageId\":1049,\"isStart\":false,\"userName\":\"冯西\",\"userId\":3306284,\"uuid\":\"ac46dddf-7a0c-40ff-99d5-227e233078f7\",\"phaseName\":\"线上笔试\"}\n" +
                "send email ATSProcess notice start:{\"companyId\":1134362,\"processId\":902,\"hrId\":97275,\"appId\":4836081,\"phaseId\":20,\"messageId\":1049,\"isStart\":false,\"userName\":\"詹偲悦\",\"userId\":886119,\"uuid\":\"51a78903-50a7-40c2-a4f9-0079e535e10f\",\"phaseName\":\"线上笔试\"}\n" +
                "send email ATSProcess notice start:{\"companyId\":1134362,\"processId\":902,\"hrId\":97275,\"appId\":4791441,\"phaseId\":20,\"messageId\":1049,\"isStart\":false,\"userName\":\"李爽玥\",\"userId\":8842725,\"uuid\":\"a93a5c0e-5fec-41a0-8582-6f20e8431002\",\"phaseName\":\"线上笔试\"}\n" +
                "send email ATSProcess notice start:{\"companyId\":1134362,\"processId\":902,\"hrId\":97275,\"appId\":4801521,\"phaseId\":20,\"messageId\":1049,\"isStart\":false,\"userName\":\"韩蓁\",\"userId\":3074726,\"uuid\":\"91fb2a81-5312-4b6d-868e-539a7ad13580\",\"phaseName\":\"线上笔试\"}\n" +
                "send email ATSProcess notice start:{\"companyId\":1134362,\"processId\":902,\"hrId\":97275,\"appId\":4773373,\"phaseId\":20,\"messageId\":1049,\"isStart\":false,\"userName\":\"王成\",\"userId\":14734724,\"uuid\":\"b919e7b0-af59-4189-a0f2-e86b0601f85a\",\"phaseName\":\"线上笔试\"}";


        String[] split = str.split("send email ATSProcess notice start:");

        System.out.println(split.length);
        List list = new ArrayList<>();
        for (String string : split) {
            if (!StringUtils.isEmpty(string)) {
                JSONObject jsonObject = JSONObject.parseObject(string);
                Object appId = jsonObject.get("appId");
                list.add(appId.toString());

            }
        }

        System.out.println(list);
    }
}
