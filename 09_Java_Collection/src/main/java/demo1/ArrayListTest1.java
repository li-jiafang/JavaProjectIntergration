package demo1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: ljf
 * @create: 2021-04-15 13:49
 * @description:
 **/
public class ArrayListTest1 {



    @Test
    public void test1(){
        List<String> list = new ArrayList<>();
        list.add("hello");

        list.add(2,"hhh");
        System.out.println(list);
    }
}
