package com.ljf.lambda00;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author: ljf
 * @create: 2021/4/29 15:18
 * @description:
 *
 * 执行获取两行数据,需要修改processFile方法内部 br.readLine()+br.readLine();
 *
 *
 **/
public class LambdaTest00 {

    @Test
    public void test1() throws IOException {
        String line = processFile();
        System.out.println(line);

    }

    public static String processFile(){
        try(BufferedReader br = new BufferedReader(new FileReader("D://data.txt"))) {
            return br.readLine()+br.readLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
