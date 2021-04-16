package iterator;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author: ljf
 * @create: 2021-04-16 13:51
 * @description:
 **/
public class IteratorTest {


    /**
     * 迭代器实现
     */
    @Test
    public void test1(){
        List<String> a = new ArrayList<String>();
        a.add("1");
        a.add("2");
        a.add("3");

        Iterator<String> iterator = a.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }


    /**
     * 自定义迭代器实现
     */

    @Test
    void test2() {
        ReverseList<String> rlist = new ReverseList<>();
        rlist.add("Apple");
        rlist.add("Orange");
        rlist.add("Pear");
        for (String s : rlist) {
            System.out.println(s);
        }

    }
}
