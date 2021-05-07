package singleton;

/**
 * @author: ljf
 * @create: 2021-04-12 12:33
 * @description:
 * 创建方式: 使用类的内部类  线程安全
 *
 * 使用类的静态内部类实现的单例模式,既保证了线程安全也保证了懒加载,同时不会因为加锁的方式耗费性能
 * 非常推荐的一种单例生成方式
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
