package group.rookie.protocol.request;

import group.rookie.protocol.base.RpcMessage;
import lombok.Data;

/**
 * @ClassName RpcRequest
 * @Description TODO
 * @Author wzg
 * @Date 2022/12/31 12:25
 * @Version 1.0
 **/

@Data
public class RpcRequest extends RpcMessage {

    private String className;

    private String methodName;

    private Class<?>[] parameterType;

    private Object[] parameters;

    private String version;

    private String group;
}
