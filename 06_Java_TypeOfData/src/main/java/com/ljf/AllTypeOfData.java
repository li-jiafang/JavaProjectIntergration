package com.ljf;

import org.junit.jupiter.api.Test;

/**
 * Java是一种强类型语言,所有变量都需要声明类型
 *
 * Java提供了8中基本类型
 *
 * 4种整数类型 byte 1字节 short 2字节 int 4字节 long 8字节
 * 2种浮点数类型 float 4字节 double 8字节
 * char类型 char
 * boolean类型 boolean
 *
 *
 */
public class AllTypeOfData
{
    public static void main( String[] args )
    {

        // 基本数据类型
        // 整数类型
        int a = 2147483647; // 4字节

        short b = 32767;   // 2字节

        long c = 9223372036854775807L;  // 8字节

        byte d = 127; // 1字节

        // 浮点数类型
        // 单精度浮点数类型
        float e = 311111111111111111111111111111111111111F;

        // 双精度浮点数类型
        double f = 711111111111111111111111111111111111111D;


        //System.out.println(3/0); // 报错java.lang.ArithmeticException: / by zero

        System.out.println(a);

        // 结果为0
        System.out.println(1/10);
        System.out.println(1%3);

        System.out.println(2.0 - 1.1);

        System.out.println(0b1001);

        System.out.println(110);



        // char 字符

        System.out.println('\u03C0');

        System.out.println(00000);


        System.out.println("hello\r文件");  // 回车

        System.out.println("hello\n换行");



        // 布尔类型 boolean
        boolean isTrue = true;

        System.out.println(isTrue);
    }




    @Test
    public void calculate(){
        double x = 4;
        double y = Math.sqrt(x);
        System.out.println(y); // prints 2.0


        System.out.println(2.0/0); // 得到无穷大的结果


        double x1 = 5;
        System.out.println(x1);

    }


    @Test
    public void incrementOperation(){
        int i = 0;

        System.out.println(i++);
        System.out.println(i++);


    }


}
