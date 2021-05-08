package principle.dependencyInversion;

/**
 * @author: ljf
 * @create: 2021/5/8 16:54
 * @description:
 *
 * 依赖倒转原则
 * 传统做法: 将对象作为参数传递
 * 简单,容易想到,弊端:我们每增加一个方法,对应的执行方法也要增加
 *
 *
 **/
public class DependencyInversion00 {

    public static void main(String[] args) {
        Email email = new Email();
        new Person().receive(email);

        WeChat weChat = new WeChat();
        new Person().receive(weChat);
    }
}

class Email{
    public void send(){
        System.out.println("Email info : hello world");
    }
}

class WeChat{
    public void send(){
        System.out.println("WeChat info : hello world");
    }
}

class Person{

    public void receive(Email email){
        email.send();
    }

    public void receive(WeChat weChat){
        weChat.send();
    }
}


