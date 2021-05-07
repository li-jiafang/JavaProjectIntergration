package singleton;

/**
 * @author: ljf
 * @create: 2021-04-12 12:33
 * @description:
 * 创建方式: 饿汉模式  线程安全
 * 这种模式并非是懒加载,而是提前初始化好对象,无论是否用到都会初始化
 *
 * 带来的问题:如果初始化对象过多,会导致内存占用过大
 *
 **/
public class SingletonMode03 {

    private static SingletonMode03 singletonMode = new SingletonMode03();

    private SingletonMode03() {
    }

    public static SingletonMode03 getsingletonMode(){
        return singletonMode;
    }

}
