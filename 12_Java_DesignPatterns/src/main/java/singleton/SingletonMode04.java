package singleton;

/**
 * @author: ljf
 * @create: 2021-04-12 12:33
 * @description:
 * 创建方式: 使用类的内部类  线程安全
 * 这种模式并非是懒加载,而是提前初始化好对象,无论是否用到都会初始化
 *
 * 带来的问题:如果初始化对象过多,会导致内存占用过大
 *
 **/
public class SingletonMode04 {

    private static class SingletonHolder{
        private static SingletonMode04 singletonMode04 = new SingletonMode04();
    }

    private SingletonMode04() {
    }

    public SingletonMode04 getInstance(){
        return SingletonHolder.singletonMode04;
    }

}
