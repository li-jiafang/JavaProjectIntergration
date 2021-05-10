package learning00;

import java.lang.annotation.*;

/**
 * @author: ljf
 * @create: 2021/5/10 16:05
 * @description:
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target(value = ElementType.FIELD)
@Inherited
@Documented
public @interface Autowired01 {
}
