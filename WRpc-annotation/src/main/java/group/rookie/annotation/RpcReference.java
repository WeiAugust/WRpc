package group.rookie.annotation;

import org.springframework.beans.factory.annotation.Autowired;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author wzg
 * @Title:
 * @Package
 * @Description:
 * @date 2022/12/3022:06
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Autowired
public @interface RpcReference {

    String version() default "1.0.0";

    String registryType() default "zookeeper";

    String registryAddress() default "127.0.0.1:2181";

    String loadBalanceType() default "zkConsistentHash";

    String serializationType() default "protobuf";

    int timeout() default 5000;

    boolean async() default false;

    boolean oneway() default false;

    String proxy() default "jdk";

    String group() default "";
}
