package singleton;

/**
 * @author: ljf
 * @create: 2021-04-12 12:33
 * @description: 创建方式: 双重锁安全校验(线程安全)
 *  双重锁的方式是方法级锁的优化,减少了部分获取实例的耗时,这种方式也满足了懒加载
 *
 **/
public class SingletonMode05 {

    private static SingletonMode05 singletonMode05;

    private SingletonMode05() {
    }

    public static SingletonMode05 getSingletonMode05(){
        if (singletonMode05!=null){
            return singletonMode05;
        }
        synchronized (SingletonMode05.class){
            if (null == singletonMode05){
                singletonMode05 =  new SingletonMode05();
            }
        }
        return singletonMode05;
    }
}
