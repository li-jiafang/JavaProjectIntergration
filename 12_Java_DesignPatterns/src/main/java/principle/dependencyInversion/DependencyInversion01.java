package principle.dependencyInversion;

/**
 * @author: ljf
 * @create: 2021/5/8 17:03
 * @description:
 **/
public class DependencyInversion01 {

    public static void main(String[] args) {
        Person1 person1 = new Person1();
        person1.receive(new Email1());
    }
}

interface IReceive{
    void send();
}

class Email1 implements  IReceive{
    @Override
    public void send(){
        System.out.println("Email info : hello world");
    }
}

class WeChat1 implements  IReceive{
    @Override
    public void send(){
        System.out.println("WeChat info : hello world");
    }
}

class Person1{

    public void receive(IReceive receive){
        receive.send();
    }

}


