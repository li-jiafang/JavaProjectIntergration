package com.ljf.stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: ljf
 * @create: 2021-03-17 10:10
 * @description:
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






}
