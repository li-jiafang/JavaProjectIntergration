package principle.richterReplacement;

/**
 * @author: ljf
 * @create: 2021/5/8 17:23
 * @description:
 *
 * 里氏替换原则: 在自类中尽量不要重写父类的方法
 * 在适当情况下,可通过聚合 组合 依赖的方式来完成
 *
 * 下面 鸵鸟的运行结果为Infinity,程序错误,为什么
 * 鸵鸟类重写了鸟类的 setFlySpeed(double speed) 方法，这违背了里氏替换原则。
 * 正确的做法是：取消几维鸟原来的继承关系，定义鸟和几维鸟的更一般的父类，
 * 如动物类，它们都有奔跑的能力。鸵鸟鸟的飞行速度虽然为 0，但奔跑速度不为 0，可以计算出其奔跑 300 千米所要花费的时间
 *
 * 通过增加更高维度的类,避免鸵鸟和燕子继承鸟类的高度耦合 http://c.biancheng.net/view/1324.html
 *
 **/
public class RichterReplacement00 {

    public static void main(String[] args) {
        Swallow swallow = new Swallow();
        swallow.setFlySpeed(100);
        System.out.println("燕子:"+swallow.getFlySpeed(300));
        Ostrich ostrich = new Ostrich();
        ostrich.setFlySpeed(100);
        System.out.println("脱鸟:"+ostrich.getFlySpeed(300));
    }
}


class Bird{
    double flySpeed;
    public void setFlySpeed(int flySpeed){
        this.flySpeed = flySpeed;
    }
    public double getFlySpeed(int distance){
        return distance/flySpeed;
    }
}

/**
 * Swallow 燕子
 */
class Swallow extends Bird{

}


/**
 * Ostrich 鸵鸟
 */
class Ostrich extends Bird{
    @Override
    public void setFlySpeed(int flySpeed){
        this.flySpeed = 0;
    }

}
