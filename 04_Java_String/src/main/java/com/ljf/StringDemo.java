package com.ljf;

import cn.hutool.extra.pinyin.PinyinUtil;
import com.alibaba.fastjson.JSON;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.StringJoiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author: ljf
 * @create: 2021-02-22 11:13
 * @description:
 **/
public class StringDemo {


    public static void main(String[] args) {

        // hutool 获取拼音首字母
        //
        String result = PinyinUtil.getFirstLetter("李佳方","");
        System.out.println(result);

    }


    /**
     * 可以发现
     * String对象是不可变的
     * 每个对String对象值进行修改的方法,都是在创建一个新的String对象
     * 将String对象作为参数传递,都是对String对象复制的引用,原本的对象还停留在原地址没有改变
     */
    @Test
    public void objectNoChange() {
        String a = "hello文件";

        System.out.println(a);  // hello

        System.out.println(a.toUpperCase()); // HELLO

        System.out.println(a); // hello

        System.out.println("文件".contains(a));

    }


    /**
     * 字符串各种方法
     *
     */
    @Test
    public void strOperate() {
        String str = "汉字HELLO world :@$8特殊:";

        String toLowerCase = str.toLowerCase(); // 小写
        String toUpperCase = str.toUpperCase(); // 大写

        String substring = str.substring(2, 3); // 截取字符串,开始索引,结束索引

        boolean contains = str.contains("汉字");  // 确认是否包含字符

        char[] chars = str.toCharArray(); // 转换为字节数组

        int indexOf = str.indexOf("H");

        String replace1 = str.replace("H", "S").replace("O", "P");
        String replace2 = str.replace("H", "S").replace("S", "P");



        System.out.println(str);


    }

    /**
     * 等号 和 equals之间的区别, 他们比较的究竟是什么,待探究
     */
    @Test
    public void compareStr() {

        System.out.println("abc" == "abc");

        System.out.println("abc" == "abc".substring(0, 3));

        System.out.println(new String("c") == new String("c"));

        System.out.println(new String("c").equals(new String("c")));

    }


    /**
     * 正则匹配指定的字符串
     * <p>
     * 匹配两个字符串A与B中间的字符串包含A与B:  表达式: A.*?B
     * <p>
     * 匹配两个字符串A与B中间的字符串包含A但是不包含B： 表达式: A.*?(?=B)
     * <p>
     * 匹配两个字符串A与B中间的字符串且不包含A与B：表达式: (?<=A).*?(?=B)
     */
    @Test
    public void matchStrByRegular() {
        String s = "我的大哥企业122ahdfahh阿发";

        Pattern pattern = Pattern.compile(".*?的");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            String group = matcher.group();
            System.out.println(group);
        }

    }

    /**
     * 测试正则是否正确
     */
    @Test
    void matchStrByRegular2() {
        // 处理分号的正则表达式
        String s = "01;02";
        String regular = "((0[1-9])|(1[0-9])|99)(;(0[1-9])|(1[0-9])|99)*";

        System.out.println(s.matches(regular));

    }

    /**
     * 字符串拼接耗时情况
     * 执行一百次字符拼接耗时情况
     * String 耗时：1264088毫秒
     * StringBuilder 耗时17毫秒
     * StringBuffer 耗时20毫秒
     */
    @Test
    void strSplice() {
        long startTime1 = System.currentTimeMillis();
        String str1 = "";
        for (int i = 0; i < 1000000; i++) {
            str1 += i;
        }
        System.out.println("String 耗时：" + (System.currentTimeMillis() - startTime1) + "毫秒");

        long startTime2 = System.currentTimeMillis();
        StringBuilder str2 = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            str2.append(i);
        }
        System.out.println("StringBuilder 耗时" + (System.currentTimeMillis() - startTime2) + "毫秒");


        long startTime3 = System.currentTimeMillis();
        StringBuffer str3 = new StringBuffer();
        for (int i = 0; i < 1000000; i++) {
            str3.append(i);
        }
        System.out.println("StringBuffer 耗时" + (System.currentTimeMillis() - startTime3) + "毫秒");


    }


    @Test
    void name() {

        String s = "[]";
        if (s.matches("(\\[).*?(\\])")){
            System.out.println("'"+s+"'");
        }
    }


    /**
     * []
     * '[]'
     */
    @Test
    void test() {
        //String po = ":\\\"\\\",\\\"371da83a-9fdd-4d14-b03b-3906551dd58f@q-1\\\":\\\"\\\",\\\"57337cdb-65f1-4c39-933f-c94a9d8caf40\\\":\\\"1\\\",\\\"f77dd349-d811-42b9-881e-c8d8cb173745@q-1\\\":\\\"\\\",\\\"1d1813ca-a9aa-4379-8f12-b667a9627dfa@q-1\\\":\\\"\\\",\\\"7a2e805c-9030-4a6e-8908-dbc7e569cbf6@q-1\\\":\\\"\\\",\\\"523cac17-1fcf-4277-b63a-4b33053b01ee\\\":\\\"1\\\",\\\"fe14904d-9a56-497e-9c59-5a3b863bcc36@q-1\\\":\\\"\\\",\\\"f0ae6ae2-2179-453f-9054-e55bc98ba747@q-1\\\":\\\"\\\",\\\"b3f7cc12-8da8-4ac5-80b6-a37440248b04@q-1\\\":\\\"\\\",\\\"3a20cbf1-3344-48a8-8171-720722ee4266@q-1\\\":\\\"\\\",\\\"92ee46fa-ccfd-405e-80dd-646a7c55c866@q-1\\\":\\\"\\\",\\\"858d324f-b2a5-4e73-ace6-30a26cf42dee@q-1\\\":\\\"\\\",\\\"3d4ac467-440d-4b56-8d9e-e3942919efe4\\\":\\\"1\\\",\\\"b5677f21-ac55-4aee-8940-bf46a4a6cc11@q-1\\\":\\\"\\\",\\\"a82c518a-9550-458c-8430-bce5154e0824@q-1\\\":\\\"\\\",\\\"faf4fdf6-a8b1-4c1f-8f26-0a0a69362763@q-1\\\":\\\"\\\",\\\"af8333e4-41eb-4e88-b34e-af22732a401e@q-1\\\":\\\"\\\",\\\"150a426a-3d14-4c09-aeb3-8fa9506deaa3@q-1\\\":\\\"\\\",\\\"2dea997a-9514-43a1-83ed-bcc53a7bac90\\\":\\\"\\\"}\",\"role\":0,\"showPageSpace\":5}";
        //String po = "{\\\"435861eb-0f39-4a4a-8b5c-5605659cd6a7\\\":\\\"1\\\",\\\"a0298354-565b-403e-a68e-7ff468c1208d\\\":[1,2,3],\\\"46bdab30-64a5-4df1-8673-f60a2f611ee2\\\":\\\"\\\",\\\"ba13a655-6839-409e-8c33-72815e2e2b49\\\":\\\"\\\",\\\"10a5167f-6382-4b79-a822-e7e8df3ef816@qb-1\\\":\\\"\\\",\\\"314f44d3-a1ac-4392-a064-9ba9dbd52064\\\":\\\"\\\",\\\"c40d1834-5b56-4632-8f5b-22f654e76d54\\\":\\\"\\\",\\\"11550b38-60cd-46b1-a599-1be045c41f64\\\":\\\"\\\",\\\"10e28612-3d6b-432f-87db-d74ef26918eb@qb-1\\\":\\\"\\\",\\\"bd5bac9c-8e14-4b08-a26f-847ade3497d4\\\":\\\"\\\",\\\"783c5165-2098-4a5a-8e81-2fbf5f9a4d88\\\":\\\"\\\",\\\"e442174e-ae23-4218-8071-ca476e124b55\\\":\\\"\\\",\\\"477543d2-8b8e-4c00-8d74-7589b0d70220@qb-1\\\":\\\"\\\",\\\"173a324a-5d32-427f-994d-ae44856f69ca\\\":\\\"\\\",\\\"4ccbe739-0495-4841-8d9a-33c0c7118512\\\":\\\"\\\",\\\"64faf94b-dc0a-49b5-ac9f-8190b6a7ad63\\\":\\\"\\\",\\\"09399f40-b919-49f6-a24b-d5d10c5a9f8b@qb-1\\\":\\\"\\\",\\\"a29620c8-c217-4278-82e8-d112b5cf9483\\\":\\\"\\\",\\\"24872f20-5039-4996-8a23-0a7519cf8593@q-1\\\":\\\"\\\",\\\"4d9d931e-6a8b-457c-888a-9943370d0860@q-1\\\":\\\"\\\",\\\"17a654f3-bdab-41da-9b34-379546bbf996@q-1\\\":\\\"\\\",\\\"1eb302b4-d47a-443b-b170-8822a6293242@q-1\\\":\\\"\\\",\\\"04fcacf2-f77e-44dc-81e4-38b7f9736eff@q-1\\\":\\\"\\\",\\\"c4efa6ca-f929-4d14-86db-536a6bb1c654@q-1\\\":\\\"\\\",\\\"873f130c-2e40-4faa-96cd-e084ce5fa6d4@q-1\\\":\\\"\\\",\\\"6a3d23ac-2f8a-495d-8160-c28c687c9074@q-1\\\":\\\"\\\",\\\"b4d0adb4-1562-4c01-8f3e-bc90c0808981@q-1\\\":\\\"\\\",\\\"371da83a-9fdd-4d14-b03b-3906551dd58f@q-1\\\":\\\"\\\",\\\"57337cdb-65f1-4c39-933f-c94a9d8caf40\\\":\\\"1\\\",\\\"f77dd349-d811-42b9-881e-c8d8cb173745@q-1\\\":\\\"\\\",\\\"1d1813ca-a9aa-4379-8f12-b667a9627dfa@q-1\\\":\\\"\\\",\\\"7a2e805c-9030-4a6e-8908-dbc7e569cbf6@q-1\\\":\\\"\\\",\\\"523cac17-1fcf-4277-b63a-4b33053b01ee\\\":\\\"1\\\",\\\"fe14904d-9a56-497e-9c59-5a3b863bcc36@q-1\\\":\\\"\\\",\\\"f0ae6ae2-2179-453f-9054-e55bc98ba747@q-1\\\":\\\"\\\",\\\"b3f7cc12-8da8-4ac5-80b6-a37440248b04@q-1\\\":\\\"\\\",\\\"3a20cbf1-3344-48a8-8171-720722ee4266@q-1\\\":\\\"\\\",\\\"92ee46fa-ccfd-405e-80dd-646a7c55c866@q-1\\\":\\\"\\\",\\\"858d324f-b2a5-4e73-ace6-30a26cf42dee@q-1\\\":\\\"\\\",\\\"3d4ac467-440d-4b56-8d9e-e3942919efe4\\\":\\\"1\\\",\\\"b5677f21-ac55-4aee-8940-bf46a4a6cc11@q-1\\\":\\\"\\\",\\\"a82c518a-9550-458c-8430-bce5154e0824@q-1\\\":\\\"\\\",\\\"faf4fdf6-a8b1-4c1f-8f26-0a0a69362763@q-1\\\":\\\"\\\",\\\"af8333e4-41eb-4e88-b34e-af22732a401e@q-1\\\":\\\"\\\",\\\"150a426a-3d14-4c09-aeb3-8fa9506deaa3@q-1\\\":\\\"\\\",\\\"2dea997a-9514-43a1-83ed-bcc53a7bac90\\\":\\\"\\\"}";
        String po = "{\n" +
                "    \"435861eb-0f39-4a4a-8b5c-5605659cd6a7\": \"1\",\n" +
                "    \"a0298354-565b-403e-a68e-7ff468c1208d\": [],\n" +
                "    \"46bdab30-64a5-4df1-8673-f60a2f611ee2\": \"\",\n" +
                "    \"ba13a655-6839-409e-8c33-72815e2e2b49\": \"\",\n" +
                "    \"10a5167f-6382-4b79-a822-e7e8df3ef816@qb-1\": \"\",\n" +
                "    \"314f44d3-a1ac-4392-a064-9ba9dbd52064\": \"\",\n" +
                "    \"c40d1834-5b56-4632-8f5b-22f654e76d54\": \"\",\n" +
                "    \"11550b38-60cd-46b1-a599-1be045c41f64\": \"\",\n" +
                "    \"10e28612-3d6b-432f-87db-d74ef26918eb@qb-1\": \"\",\n" +
                "    \"bd5bac9c-8e14-4b08-a26f-847ade3497d4\": \"\",\n" +
                "    \"783c5165-2098-4a5a-8e81-2fbf5f9a4d88\": \"\",\n" +
                "    \"e442174e-ae23-4218-8071-ca476e124b55\": \"\",\n" +
                "    \"477543d2-8b8e-4c00-8d74-7589b0d70220@qb-1\": \"\",\n" +
                "    \"173a324a-5d32-427f-994d-ae44856f69ca\": \"\",\n" +
                "    \"4ccbe739-0495-4841-8d9a-33c0c7118512\": \"\",\n" +
                "    \"64faf94b-dc0a-49b5-ac9f-8190b6a7ad63\": \"\",\n" +
                "    \"09399f40-b919-49f6-a24b-d5d10c5a9f8b@qb-1\": \"\",\n" +
                "    \"a29620c8-c217-4278-82e8-d112b5cf9483\": \"\",\n" +
                "    \"24872f20-5039-4996-8a23-0a7519cf8593@q-1\": \"\",\n" +
                "    \"4d9d931e-6a8b-457c-888a-9943370d0860@q-1\": \"\",\n" +
                "    \"17a654f3-bdab-41da-9b34-379546bbf996@q-1\": \"\",\n" +
                "    \"1eb302b4-d47a-443b-b170-8822a6293242@q-1\": \"\",\n" +
                "    \"04fcacf2-f77e-44dc-81e4-38b7f9736eff@q-1\": \"\",\n" +
                "    \"c4efa6ca-f929-4d14-86db-536a6bb1c654@q-1\": \"\",\n" +
                "    \"873f130c-2e40-4faa-96cd-e084ce5fa6d4@q-1\": \"\",\n" +
                "    \"6a3d23ac-2f8a-495d-8160-c28c687c9074@q-1\": \"\",\n" +
                "    \"b4d0adb4-1562-4c01-8f3e-bc90c0808981@q-1\": \"\",\n" +
                "    \"371da83a-9fdd-4d14-b03b-3906551dd58f@q-1\": \"\",\n" +
                "    \"57337cdb-65f1-4c39-933f-c94a9d8caf40\": \"1\",\n" +
                "    \"f77dd349-d811-42b9-881e-c8d8cb173745@q-1\": \"\",\n" +
                "    \"1d1813ca-a9aa-4379-8f12-b667a9627dfa@q-1\": \"\",\n" +
                "    \"7a2e805c-9030-4a6e-8908-dbc7e569cbf6@q-1\": \"\",\n" +
                "    \"523cac17-1fcf-4277-b63a-4b33053b01ee\": \"1\",\n" +
                "    \"fe14904d-9a56-497e-9c59-5a3b863bcc36@q-1\": \"\",\n" +
                "    \"f0ae6ae2-2179-453f-9054-e55bc98ba747@q-1\": \"\",\n" +
                "    \"b3f7cc12-8da8-4ac5-80b6-a37440248b04@q-1\": \"\",\n" +
                "    \"3a20cbf1-3344-48a8-8171-720722ee4266@q-1\": \"\",\n" +
                "    \"92ee46fa-ccfd-405e-80dd-646a7c55c866@q-1\": \"\",\n" +
                "    \"858d324f-b2a5-4e73-ace6-30a26cf42dee@q-1\": \"\",\n" +
                "    \"3d4ac467-440d-4b56-8d9e-e3942919efe4\": \"1\",\n" +
                "    \"b5677f21-ac55-4aee-8940-bf46a4a6cc11@q-1\": \"\",\n" +
                "    \"a82c518a-9550-458c-8430-bce5154e0824@q-1\": \"\",\n" +
                "    \"faf4fdf6-a8b1-4c1f-8f26-0a0a69362763@q-1\": \"\",\n" +
                "    \"af8333e4-41eb-4e88-b34e-af22732a401e@q-1\": \"\",\n" +
                "    \"150a426a-3d14-4c09-aeb3-8fa9506deaa3@q-1\": \"\",\n" +
                "    \"2dea997a-9514-43a1-83ed-bcc53a7bac90\": \"\"\n" +
                "}";

        HashMap<String, Object> hashMap = JSON.parseObject(po, HashMap.class);

        // 遍历hashmap 获取相关值，修改集合
        hashMap.forEach((k, v) -> {
            if (v instanceof List) {
                StringJoiner joiner = new StringJoiner(",", "'[", "]'");
                ((List<?>) v).forEach(var -> {
                    //joiner.add("\"" + var + "\"");
                });
                hashMap.put(k, joiner);
            }
        });

        String content = JSON.toJSONString(hashMap);


        System.out.println(content);
        System.out.println(content.replace("\"'[","'[").replace("]'\"","]'"));

//        System.out.println(hashMap);
//
//        System.out.println("'[\"1\",\"2\",\"8\",\"13\",\"14\",\"3\",\"9\",\"21\",\"15\",\"16\",\"10\",\"4\",\"5\",\"11\",\"17\",\"6\",\"22\",\"18\",\"12\",\"7\"]'");
//        System.out.println("'[\"1\",\"2\",\"8\",\"13\",\"14\",\"3\",\"9\",\"21\",\"15\",\"16\",\"10\",\"4\",\"5\",\"11\",\"17\",\"6\",\"22\",\"18\",\"12\",\"7\"]'".replace("\"'[","'[").replace("]'\"","]'"));

    }
}
