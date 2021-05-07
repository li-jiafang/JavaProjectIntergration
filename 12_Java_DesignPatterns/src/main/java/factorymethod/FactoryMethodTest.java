package factorymethod;

import factorymethod.test01.Calculate;
import factorymethod.test01.Converter;

/**
 * @author: ljf
 * @create: 2021/5/7 9:57
 * @description:
 **/
public class FactoryMethodTest {

    public static void main(String[] args) {
        Converter converter = new Converter();
        Calculate jiafa = converter.converter(1);
        jiafa.calculate(1,2);

        Calculate jianfa = converter.converter(2);
        jianfa.calculate(1,2);






    }


}
