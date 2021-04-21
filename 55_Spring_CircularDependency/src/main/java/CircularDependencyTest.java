import bean.StudentA;
import bean.StudentB;
import config.JavaBeanConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import javax.annotation.Resource;

/**
 * @author: ljf
 * @create: 2021/4/21 12:23
 * @description:
 *
 * 循环依赖的解决方式
 **/
public class CircularDependencyTest {



    @Test
    public void test1(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaBeanConfig.class);
        StudentA studentA = applicationContext.getBean("getStudentA", StudentA.class);
        System.out.println(studentA.getStudentB());

    }



    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaBeanConfig.class);
        StudentA studentA = applicationContext.getBean("getStudentA", StudentA.class);
        System.out.println(studentA);
        applicationContext.getBean("getStudentB", StudentA.class);

//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
//        System.out.println(applicationContext);

    }
}
