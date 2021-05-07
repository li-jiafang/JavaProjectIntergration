package factorymethod.test01;

/**
 * @author: ljf
 * @create: 2021/5/7 11:17
 * @description:
 **/
public class Converter {

    public Calculate converter(int type) {
        if (type == 1) {
            return new JiaFaCalculateImpl();
        } else if (type == 2) {
            return new JianFaCalculateImpl();
        } else if (type == 3) {
            return new ChenFaCalculateImpl();
        } else if (type == 4) {
            return new ChuFaCalculateImpl();
        }else {
            return null;
        }
    }
}
