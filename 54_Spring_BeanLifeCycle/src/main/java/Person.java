import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author: ljf
 * @create: 2021-04-19 14:17
 * @description:
 **/
public class Person implements BeanFactoryAware, BeanNameAware, InitializingBean, DisposableBean, ApplicationContextAware {

    private String name;

    private String address;

    private Long phone;

    private BeanFactory beanFactory;

    private String beanName;

    private ApplicationContext applicationContext;


    public Person() {
        System.out.println("[构造器] 调用person无参构造器实例化!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("[注入属性] name");
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        System.out.println("[注入属性] address");
        this.address = address;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        System.out.println("[注入属性] phone");
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                '}';
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("[BeanFactoryAware接口]   setBeanFactory; beanFactory = " + beanFactory);
        this.beanFactory = beanFactory;
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("[BeanNameAware接口]  setBeanName; beanName=" + beanName);
        this.beanName = s;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("【InitializingBean接口】调用InitializingBean.afterPropertiesSet()");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("【DiposibleBean接口】调用DiposibleBean.destory()");
    }


    // 通过<bean>的init-method属性指定的初始化方法
    public void myInit() {
        System.out.println("【init-method】调用<bean>的init-method属性指定的初始化方法");
    }

    // 通过<bean>的destroy-method属性指定的初始化方法
    public void myDestory() {
        System.out.println("【destroy-method】调用<bean>的destroy-method属性指定的初始化方法");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("[setApplicationContext] 调用");
        this.applicationContext = applicationContext;
    }
}
