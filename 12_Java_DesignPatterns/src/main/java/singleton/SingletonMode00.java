package singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: ljf
 * @create: 2021-04-12 12:33
 * @description:
 *
 * 单例模式:
 * 创建方式:静态类实现
 * 1.如果不需要实现任何状态,仅仅只是用于全局访问
 * 2.业务中最常见,
 *
 **/
public class SingletonMode00 {

    public static Map<String,String> map = new HashMap<>(); //
}
