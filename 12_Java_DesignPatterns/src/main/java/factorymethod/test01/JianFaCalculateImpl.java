package factorymethod.test01;

/**
 * @author: ljf
 * @create: 2021/5/7 11:13
 * @description:
 **/
public class JianFaCalculateImpl implements Calculate {
    @Override
    public void calculate(int a,int b) {
        System.out.println("减法:"+ (a-b));
    }
}
