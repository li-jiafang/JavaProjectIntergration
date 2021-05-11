import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;
import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * @author: ljf
 * @create: 2021/4/29 10:19
 * @description:
 **/
public class DateTest {


    @Test
    public void test1() {

        System.out.println("s".hashCode());

        System.out.println("".hashCode());

        Map<String,String> map = new HashMap<>();

        map.put("","hello");
        map.put(null,"null");
        String null1 = map.put(null, "null1");
        System.out.println(null1);
        System.out.println(map);
    }


    @Test
    void test2() {
        Date date = new Date();
        DateTime dateTime = DateUtil.beginOfDay(date);
        System.out.println(dateTime);


    }

    @Test
    void test3() {
        List<String> list= new ArrayList<>();
        list.add("hello");
        list.add("hello");
        list.add("hello");
        list.add("hello");

        System.out.println();

    }
}
