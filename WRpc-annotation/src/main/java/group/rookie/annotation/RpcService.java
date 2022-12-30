package group.rookie.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author ceshi
 * @Title:
 * @Package
 * @Description:
 * @date 2022/12/3021:57
 */

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Component
public @interface RpcService {

    Class<?> interfaceClass() default void.class;

    String interfaceClassName() default "";

    String version() default "1.0.0";

    String group() default "";
}
