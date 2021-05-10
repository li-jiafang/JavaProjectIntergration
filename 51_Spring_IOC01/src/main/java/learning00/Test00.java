package learning00;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.stream.Stream;

/**
 * @author: ljf
 * @create: 2021/5/10 12:33
 * @description:
 *
 *
 *
 **/
public class Test00 {

    public static void main(String[] args) {

    }


    @Test
    public void test1(){
/*        UserController userController = new UserController();
        userController.run(); // 提示java.lang.NullPointerException,因为没有创建userService对象*/

        /**
         *
         */
        // 传统方式来获取userService对象,并完成方法调用
/*        UserController userController = new UserController();
        UserService userService = new UserService();
        userController.setUserService(userService);
        userController.run();*/


        /**
         * 通过反射获取属性,并创建对象,完成方法的调用
         */
        UserController userController = new UserController();
        Class aClass = userController.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        UserService userService = null;
        // 获取对应的属性
        Stream.of(declaredFields).forEach(field-> {
            Class<? extends Field> fieldClass = field.getClass();
            System.out.println(field.getName());
            String fieldName = field.getName();
            String setMethodName = "set"+fieldName.substring(0,1).toUpperCase()+fieldName.substring(1,fieldName.length());
            Method method = null;
            try {
                method = aClass.getDeclaredMethod(setMethodName, UserService.class);
                method.invoke(userController,field.getType().newInstance());
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }
            userController.run();

        });
    }


    @Test
    void test2() {

        UserController userController = new UserController();
        Class<? extends UserController> aClass = userController.getClass();

        Field[] fields = aClass.getDeclaredFields();
        Stream.of(fields).forEach(field -> {
            Autowired01 annotation = field.getAnnotation(Autowired01.class);
            if (annotation != null){
                field.setAccessible(true);
                try {
                    field.set(userController,field.getType().newInstance());
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                }
            }

        });
        System.out.println(userController.getUserService());
        userController.run();





    }
}
