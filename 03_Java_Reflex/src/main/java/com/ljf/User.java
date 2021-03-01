package com.ljf;

/**
 * @author: ljf
 * @create: 2021-02-26 14:36
 * @description:
 **/
public class User extends UserFather{
    private String name;
    private int age;

    public String language;

    private void test(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
