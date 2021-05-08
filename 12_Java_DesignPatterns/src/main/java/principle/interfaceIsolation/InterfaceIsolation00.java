package principle.interfaceIsolation;

/**
 * @author: ljf
 * @create: 2021/5/8 15:38
 * @description:
 * 业务需求
 * 定义5个接口1 2 3 4 5
 * 有ABCD 四个类,
 * 其中
 * A依赖B实现1 3 5这三个接口
 * C依赖D实现1 2 4这三个接口
 * 传统做法如下
 *
 * 弊端:因为A C都只依赖BD实现部分接口,但是BD实现全部接口,
 **/
public class InterfaceIsolation00 {
    public static void main(String[] args) {
        A a = new A();
        Interface0 interface0 = new B();
        a.depend1(interface0);
        a.depend3(interface0);
        a.depend5(interface0);

    }
}

class A{
    public void depend1(Interface0 interface0){
        interface0.operation1();
    }
    public void depend3(Interface0 interface0){
        interface0.operation3();
    }
    public void depend5(Interface0 interface0){
        interface0.operation5();
    }
}

class C{
    public void depend1(Interface0 interface0){
        interface0.operation1();
    }
    public void depend2(Interface0 interface0){
        interface0.operation2();
    }
    public void depend4(Interface0 interface0){
        interface0.operation4();
    }
}


interface Interface0{
    void operation1();
    void operation2();
    void operation3();
    void operation4();
    void operation5();
}



class B implements Interface0{

    @Override
    public void operation1() {
        System.out.println("类B 实现 operation1");
    }

    @Override
    public void operation2() {
        System.out.println("类B 实现 operation2");
    }

    @Override
    public void operation3() {
        System.out.println("类B 实现 operation3");
    }

    @Override
    public void operation4() {
        System.out.println("类B 实现 operation4");
    }

    @Override
    public void operation5() {
        System.out.println("类B 实现 operation5");
    }
}


class D implements Interface0{

    @Override
    public void operation1() {
        System.out.println("类D 实现 operation1");
    }

    @Override
    public void operation2() {
        System.out.println("类D 实现 operation2");
    }

    @Override
    public void operation3() {
        System.out.println("类D 实现 operation3");
    }

    @Override
    public void operation4() {
        System.out.println("类D 实现 operation4");
    }

    @Override
    public void operation5() {
        System.out.println("类D 实现 operation5");
    }
}
