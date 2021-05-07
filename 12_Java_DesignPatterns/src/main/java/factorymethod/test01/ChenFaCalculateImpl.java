package factorymethod.test01;

/**
 * @author: ljf
 * @create: 2021/5/7 11:13
 * @description:
 **/
public class ChenFaCalculateImpl implements Calculate {
    @Override
    public void calculate(int a,int b) {
        System.out.println("乘法:"+ (a*b));
    }
}
