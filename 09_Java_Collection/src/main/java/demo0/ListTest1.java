package demo0;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

/**
 * @author: ljf
 * @create: 2021-03-24 15:59
 * @description:
 **/
public class ListTest1 {


    public static void main(String[] args) {

        List<List<Integer>> listMap = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {

            list.add(i);
            if (i % 20 == 0){
                listMap.add(list);
                list = new ArrayList<>();
            }
        }

        System.out.println(listMap);

    }

    @Test
    public void test1(){
        List<Person> listOld = new ArrayList<>();
        List<Person> listNew = new ArrayList<>();

        Person person = new Person();
        person.setId(0L);
        person.setName("hh");
        listOld.add(person);

        person = new Person();
        person.setName("ll");
        listNew.add(person);

        System.out.println();
    }


    @Test
    void test2() {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

    }


    /**
     * 将list集合中的部分元素提取转换为map集合
     */
    @Test
    public void test3(){
        List<Person> listNew = new ArrayList<>();

        Person person = new Person();
        person.setId(0L);
        person.setName("hh");
        listNew.add(person);

        person = new Person();
        person.setId(1L);
        person.setName("ll");
        listNew.add(person);

        System.out.println(listNew);

        Map<Long, String> collect = listNew.stream().collect(Collectors.toMap(Person::getId, Person::getName));
        System.out.println(collect);


    }
}