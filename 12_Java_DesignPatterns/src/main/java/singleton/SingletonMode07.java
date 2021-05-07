package singleton;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @author: ljf
 * @create: 2021-04-12 12:33
 * @description: 创建方式: CAS AtomicReference 线程安全
 *
 *
 **/
public enum SingletonMode07 {

    TARGET;
    public void test(){
        System.out.println("hi~");
    }

}
