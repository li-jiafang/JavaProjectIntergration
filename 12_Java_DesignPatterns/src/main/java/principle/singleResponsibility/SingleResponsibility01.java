package principle.singleResponsibility;

/**
 * @author: ljf
 * @create: 2021/5/8 15:18
 * @description:
 *
 * 单一职责原则
 *
 * 类级别单一职责
 **/
public class SingleResponsibility01 {

    public static void main(String[] args) {
        // 飞机  火车 汽车
        Train01 train01 = new Train01();
        train01.run("火车");

        Plain01 plain01 = new Plain01();
        plain01.run("飞机");
    }


}


class Train01{
    public void run(String name){
        System.out.println(name+"在铁轨上运行");
    }
}
class Plain01{
    public void run(String name){
        System.out.println(name+"在天空上运行");
    }
}
class Car01{
    public void run(String name){
        System.out.println(name+"在公路上运行");
    }
}


