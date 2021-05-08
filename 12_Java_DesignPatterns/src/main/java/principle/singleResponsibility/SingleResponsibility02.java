package principle.singleResponsibility;

/**
 * @author: ljf
 * @create: 2021/5/8 15:18
 * @description:
 *
 * 单一职责原则
 * Transportation 执行run方法不能满足所有的执行
 *
 * 方法级别的单一职责
 **/
public class SingleResponsibility02 {

    public static void main(String[] args) {
        // 飞机  火车 汽车
        Transportation02 transportation = new Transportation02();
        transportation.plainRun("飞机");
        transportation.roadRun("汽车");
    }


}

/**
 * 交通工具 Transaction
 */
class Transportation02{
    public void roadRun(String name){
        System.out.println(name+"在路上运行");
    }
    public void plainRun(String name){
        System.out.println(name+"在天空上运行");
    }
}
