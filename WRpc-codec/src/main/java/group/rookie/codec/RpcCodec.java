package group.rookie.codec;

import group.rookie.serialization.api.Serialization;
import group.rookie.serialization.jdk.JdkSerialization;

import java.io.Serializable;

/**
 * @ClassName RpcCodec
 * @Description TODO
 * @Author wzg
 * @Date 2022/12/30 22:13
 * @Version 1.0
 **/
public interface RpcCodec {

    default Serialization getJdkSerialization() {
        return new JdkSerialization();
    }
}
