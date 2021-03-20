package com.ljf.learning1;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.http.HttpUtil;
import org.junit.jupiter.api.Test;

/**
 * @author: ljf
 * @create: 2021-03-20 21:42
 * @description: 多线程实现图片下载问题
 **/
public class TestThread0 implements Runnable {


    private String path = this.getClass().getResource("/").getPath();

    private String url;

    private String name;

    int i = 0;

    @Override
    public void run() {

        System.out.println(i++);
        download(url,path,name,Thread.currentThread().getName()+"开始执行");
    }


    /**
     * test方法无法执行线程功能
     */
    @Test
    public void test1(){
        TestThread0 testThread0 = new TestThread0("美女1","D://","https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=2565689134,788370536&fm=26&gp=0.jpg");
        TestThread0 testThread1 = new TestThread0("美女2","D://","http://benyouhuifile.it168.com/forum/201201/09/2044297kiuoh5ciboj085b.jpg");
        TestThread0 testThread2 = new TestThread0("美女3","D://","https://image.xcar.com.cn/attachments/a/day_140118/2014011817_5907248f2d126952d22eSD6TDWFxXkvz.jpg");

        new Thread(testThread0).start();
        new Thread(testThread1).start();
        new Thread(testThread2).start();

    }

    public static void main(String[] args) {
        // 创建线程,然后传入参数

        TestThread0 testThread0 = new TestThread0("美女1","D://","https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=2565689134,788370536&fm=26&gp=0.jpg");
        TestThread0 testThread1 = new TestThread0("美女2","D://","http://benyouhuifile.it168.com/forum/201201/09/2044297kiuoh5ciboj085b.jpg");
        TestThread0 testThread2 = new TestThread0("美女3","D://","https://image.xcar.com.cn/attachments/a/day_140118/2014011817_5907248f2d126952d22eSD6TDWFxXkvz.jpg");

        new Thread(testThread0).start();
        new Thread(testThread1).start();
        new Thread(testThread2).start();
    }


    public TestThread0( String name,String path, String url) {
        this.path = path;
        this.url = url;
        this.name = name;
    }

    private void download(String url,String path,String name,String threadName){
        //将文件下载后保存在E盘，返回结果为下载文件大小
        long size = HttpUtil.downloadFile(url, FileUtil.file(path));
        System.out.println(StrUtil.format("线程名: {},下载了图片,名称为: {},图片大小为: {}",threadName,name, size));

    }



}
