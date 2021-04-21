package config;

import bean.StudentA;
import bean.StudentB;
import bean.StudentC;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: ljf
 * @create: 2021/4/21 12:40
 * @description:
 **/

@Configuration
public class JavaBeanConfig {



    @Bean
    public StudentA getStudentA(){
        return new StudentA(new StudentB());
    }

    @Bean
    public StudentB getStudentB(){
        return new StudentB(new StudentC());
    }


    @Bean
    public StudentC getStudentC(){
        return new StudentC(new StudentA());
    }
}
