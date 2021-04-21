import bean.StudentA;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;

/**
 * @author: ljf
 * @create: 2021/4/21 12:23
 * @description:
 *
 * 循环依赖的解决方式
 **/
public class CircularDependencyTest {

    @Resource
    private StudentA studentA;

    @Test
    public void test1(){
        System.out.println(studentA);
    }



    public static void main(String[] args) {


        System.out.println("");


//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
//        System.out.println(applicationContext);

    }
}
