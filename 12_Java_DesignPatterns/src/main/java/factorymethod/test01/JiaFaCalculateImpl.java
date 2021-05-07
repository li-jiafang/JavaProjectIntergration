package factorymethod.test01;

/**
 * @author: ljf
 * @create: 2021/5/7 11:13
 * @description:
 **/
public class JiaFaCalculateImpl implements Calculate {
    @Override
    public void calculate(int a,int b) {
        System.out.println("加法:"+ (a+b));
    }
}
