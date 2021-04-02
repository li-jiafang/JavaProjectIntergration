package com.ljf;

import org.junit.jupiter.api.Test;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author: ljf
 * @create: 2021-02-22 11:13
 * @description:
 **/
public class StringDemo {


    public static void main(String[] args) {

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
}
