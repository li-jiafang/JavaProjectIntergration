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
        return new StudentA();
    }

    @Bean
    public StudentB getStudentB(){
        return new StudentB();
    }


    @Bean
    public StudentC getStudentC(){
        return new StudentC();
    }
}
