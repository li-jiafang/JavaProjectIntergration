package com.ljf.lambda01;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * @author: ljf
 * @create: 2021-03-17 10:39
 * @description:
 **/
public class LambdaTest01 {


    @Test
    public void test1() throws IOException{

        String oneLine = processFile((BufferedReader r)->r.readLine());
        System.out.println(oneLine);
    }

    public static String processFile(){
        try(BufferedReader br = new BufferedReader(new FileReader("D://data.txt"))) {
            return br.readLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String processFile(BufferReaderProcessor processor){
        try(BufferedReader br = new BufferedReader(new FileReader("D://data.txt"))) {
            return processor.process(br);
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }



}
