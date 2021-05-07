package singleton;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @author: ljf
 * @create: 2021-04-12 12:33
 * @description: 创建方式: CAS AtomicReference 线程安全
 *
 *
 **/
public class SingletonMode06 {

    private static final AtomicReference<SingletonMode06> singletonMode06Atom = new AtomicReference<>();

    private static SingletonMode06 singletonMode06;

    private SingletonMode06() {
    }

    public static final SingletonMode06 getSingletonMode06(){

        for ( ; ;){
            SingletonMode06 singletonMode06 = singletonMode06Atom.get();
            if (null != singletonMode06){
                return singletonMode06;
            }
            singletonMode06Atom.compareAndSet(null,new SingletonMode06());
            return singletonMode06Atom.get();

        }
    }

    public static void main(String[] args) {
        System.out.println(SingletonMode06.getSingletonMode06());
        System.out.println(SingletonMode06.getSingletonMode06());
    }
}
