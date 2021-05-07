package singleton;

import org.junit.jupiter.api.Test;

/**
 * @author: ljf
 * @create: 2021-04-12 12:33
 * @description: 创建方式: CAS AtomicReference 线程安全
 *
 *
 **/
public class SingletonMode07Test {

   @Test
    public void test(){
       SingletonMode07.TARGET.test();
   }

}
