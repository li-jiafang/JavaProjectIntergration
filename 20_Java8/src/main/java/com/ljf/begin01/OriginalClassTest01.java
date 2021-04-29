package com.ljf.begin01;

import com.ljf.begin00.Apple;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: ljf
 * @create: 2021/4/29 15:44
 * @description:
 *
 *  OriginalClassTest00演示了
 *  1. 从方法内部筛选单一条件获取结果
 *  2. 行为参数化,通过抽象化接口实现不同的接口完成筛选条件
 *
 *  OriginalClassTest01将近一步推进,将代码传递完成条件筛选  (Apple apple)-> "红色".equals(apple.getColor())
 *
 **/
public class OriginalClassTest01 {


    @Test
    public void test1(){
        List<Apple> list = processList();
        System.out.println(test(list,(Apple apple)-> "红色".equals(apple.getColor())));

    }

    public List<Apple> test(List<Apple> list,Filter filter){
        List<Apple> result = new ArrayList<>();
        for (Apple apple : list) {
            if (filter.filter(apple)){
                result.add(apple);
            }
        }
        return result;
    }



    private List<Apple> processList() {
        List<Apple> appleList = new ArrayList<>();
        Apple apple1 = new Apple(1, "富士山1", "红色", 20D);
        Apple apple2 = new Apple(2, "富士山2", "绿色", 10D);
        Apple apple3 = new Apple(3, "富士山3", "黄色", 25D);
        appleList.add(apple1);
        appleList.add(apple2);
        appleList.add(apple3);
        return appleList;
    }


}
