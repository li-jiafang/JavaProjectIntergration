import bean.StudentA;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: ljf
 * @create: 2021/4/21 12:23
 * @description:
 *
 * 循环依赖的解决方式
 **/
public class CircularDependencyTest {


    /**
     * 循环依赖
     * 通过构造器注入
     */
    @Test
    void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
        StudentA a = applicationContext.getBean("a", StudentA.class);
        System.out.println(a);

        // 提示异常 Caused by: org.springframework.beans.factory.BeanCurrentlyInCreationException
    }

    /**
     * set方式注入,单例模式(singleton)
     * 默认方式
     * 为什么没有报错?
     * 因为现将bean实例化对象后再设置属性
     */
    @Test
    void test2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean2.xml");
        StudentA a = applicationContext.getBean("a", StudentA.class);
        System.out.println(a);

    }


    /**
     * 为什么设置作用域scope为prototype后提示异常
     *  // 提示异常 Caused by: org.springframework.beans.factory.BeanCurrentlyInCreationException
     *  为什么原型模式就报错了呢 ？
     *
     * 对于“prototype”作用域Bean，Spring容器无法完成依赖注入，因为“prototype”作用域的Bean，Spring容器不进行缓存，因此无法提前暴露一个创建中的Bean。
     */
    @Test
    void test3() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean3.xml");
        StudentA a = applicationContext.getBean("a", StudentA.class);
        System.out.println(applicationContext);
    }
}
