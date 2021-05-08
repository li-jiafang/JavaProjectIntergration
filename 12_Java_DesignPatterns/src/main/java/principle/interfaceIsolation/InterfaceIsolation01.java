package principle.interfaceIsolation;

/**
 * @author: ljf
 * @create: 2021/5/8 16:09
 * @description:
 *
 * 设计多个接口
 **/
public class InterfaceIsolation01 {

}

class A1{
    public void depend1(Interface1 interface1){
        interface1.opeartion1();
    }

    public void depend3(Interface2 interface2){
        interface2.opeartion3();
    }

    public void depend5(Interface2 interface2){
        interface2.opeartion5();
    }
}


interface Interface1{
    void opeartion1();
}

interface Interface2{
    void opeartion3();
    void opeartion5();
}

interface Interface3{
    void opeartion2();
    void opeartion4();
}

class B1 implements Interface1,Interface2{

    @Override
    public void opeartion1() {

    }

    @Override
    public void opeartion3() {

    }

    @Override
    public void opeartion5() {

    }
}

class D1 implements Interface1,Interface3{

    @Override
    public void opeartion1() {

    }


    @Override
    public void opeartion2() {

    }

    @Override
    public void opeartion4() {

    }
}