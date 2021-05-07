package singleton;

/**
 * @author: ljf
 * @create: 2021-04-12 12:33
 * @description:
 * 创建方式:懒汉模式 线程安全 通过在获取对象实例上增加锁synchronize
 * 此种模式是线程安全的,但是加上锁后,每次访问对象都因为锁的占用导致资源浪费,从而不是特殊情况,不建议使用
 *
 **/
public class SingletonMode02 {

    private static SingletonMode02 singletonMode02;

    private SingletonMode02() {
    }

    public static synchronized SingletonMode02 getSingletonMode01(){
        if (singletonMode02 != null){
            return singletonMode02;
        }
        singletonMode02 = new SingletonMode02();
        return singletonMode02;
    }


    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> System.out.println(getSingletonMode01())).start();
        }

        System.out.println(getSingletonMode01());
        System.out.println(getSingletonMode01());
    }

}
