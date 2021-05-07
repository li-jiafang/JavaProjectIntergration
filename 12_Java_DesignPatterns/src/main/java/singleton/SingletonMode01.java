package singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: ljf
 * @create: 2021-04-12 12:33
 * @description:
 * 创建方式:懒汉模式 线程不安全
 * 单例模式: 特点:不允许外部创建,也就是new SingletonMode01(); 因此这里的构造方法默认是私有的private
 *  这种方式的确满足了懒加载,但如果有多个访问者同时去获取对象实例,可以想象有多个人去抢厕所,就会造成多个同样的实例共存,从而没有达成单例的要求
 *
 **/
public class SingletonMode01 {

    private static SingletonMode01 singletonMode01;

    private SingletonMode01() {
    }

    public static SingletonMode01 getSingletonMode01(){
        if (singletonMode01 != null){
            return singletonMode01;
        }
        singletonMode01 = new SingletonMode01();
        return singletonMode01;
    }

}
