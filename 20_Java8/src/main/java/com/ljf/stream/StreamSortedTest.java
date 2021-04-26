package com.ljf.stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: ljf
 * @create: 2021/4/26 16:09
 * @description:
 **/
public class StreamSortedTest {


    /**
     * list集合按照指定字段排序
     */
    @Test
    public void test1(){
        User user1 = new User(1,"hello1","20016");
        User user2 = new User(2,"hello2","20016");
        User user3 = new User(3,"hello3",null);

        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);

        System.out.println(userList);
        userList = userList.stream().sorted(Comparator.comparing(User::getId).reversed()).collect(Collectors.toList());
        System.out.println(userList);
    }
}
