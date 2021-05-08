package principle.singleResponsibility;

/**
 * @author: ljf
 * @create: 2021/5/8 15:18
 * @description:
 *
 * 单一职责原则
 * Transportation 执行run方法不能满足所有的执行
 **/
public class SingleResponsibility00 {

    public static void main(String[] args) {
        // 飞机  火车 汽车
        Transportation00 transportation = new Transportation00();
        transportation.run("飞机");
        transportation.run("火车");
        transportation.run("汽车");
    }


}

/**
 * 交通工具 Transaction
 */
class Transportation00{
    public void run(String name){
        System.out.println(name+"在路上运行");
    }
}
