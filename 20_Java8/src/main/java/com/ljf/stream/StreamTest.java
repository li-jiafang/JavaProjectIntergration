package com.ljf.stream;

import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author: ljf
 * @create: 2021-03-17 10:10
 * @description:
 *
 * 业务逻辑遇到的各种问题
 *
 **/
public class StreamTest {


    /**
     * 将集合按照不同条件分组,然后根据分组结果判断取谁的答案
     *
     * 如果empNo包含20016取这条记录,如果不存在这条记录就取空
     *
     */
    @Test
    public void test1(){
        // 将empNo为null和不为空的集合分组
        List<User> userList = processList1();
        List<User> userList1 = userList.stream().filter(user -> "20016".equals(user.getEmpNo())).collect(Collectors.toList());
        List<User> userList2 = userList.stream().filter(user -> null == user.getEmpNo()).collect(Collectors.toList());
        System.out.println(userList1);
        System.out.println(userList2);
    }

    public List<User> processList1(){
        User user1 = new User(1,"hello1","20016");
        User user2 = new User(2,"hello2","20016");
        User user3 = new User(3,"hello3",null);

        List<User> userList = new ArrayList<>();

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        return userList;
    }


    /**
     * 业务
     * 存在两个list,
     * List<Map<String,Object>> list1 = new ArrayList<>();
     * List<String> list2 = new ArrayList<>();
     * list1按照list2取出Object的值,添加到一个新的元素
     *
     *
     *
     */
    @Test
    public void test2(){
        List<Map<String, Object>> list1 = processListMap();
        List<String> list2 = processList2();
        List<Map<String, Object>> list3 = new ArrayList<>();

        //list2.stream().forEach(list1.stream().filter());
        list2.stream().forEach(i -> {
            list1.stream().map(e -> e.get(i)!= null).collect(Collectors.toList());
        });


        List<Object> collect = list2.stream().map(v -> {
            List<Object> list = new ArrayList<>();

            list1.forEach(e -> {
                list.add(e.get(v));
            });

            return list.get(list.size() - 1);
        }).collect(Collectors.toList());


        //list1.stream().filter(list2)


        System.out.println(collect);
//        System.out.println(list2);

    }


    public List<Map<String,Object>> processListMap(){
        List<Map<String,Object>> list1 = new ArrayList<>();
        Map<String,Object> map = new HashMap<>();
        map.put("头部1","数据第一行1");
        map.put("头部2","数据第一行2");
        map.put("头部3","数据第一行3");
        map.put("头部4","数据第一行4");
        map.put("头部5","数据第一行5");
        map.put("头部6","数据第一行6");
        map.put("头部7","数据第一行7");
        list1.add(map);
        Map<String,Object> map2 = new HashMap<>();
        map2.put("头部1","数据第二行1");
        map2.put("头部2","数据第二行2");
        map2.put("头部3","数据第二行3");
        map2.put("头部4","数据第二行4");
        map2.put("头部5","数据第二行5");
        map2.put("头部6","数据第二行6");
        map2.put("头部7","数据第二行7");
        list1.add(map2);
        return list1;
    }






    public List<String> processList2(){
        List<String> list2 = new ArrayList<>();
        list2.add("头部1");
        list2.add("头部2");
        list2.add("头部3");
        list2.add("头部4");
        list2.add("头部5");
        list2.add("头部6");
        list2.add("头部7");
        return list2;
    }




}
