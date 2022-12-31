package group.rookie.protocol.response;

import lombok.Data;

/**
 * @ClassName RpcResponse
 * @Description TODO
 * @Author wzg
 * @Date 2022/12/31 12:44
 * @Version 1.0
 **/

@Data
public class RpcResponse {

    private String error;

    private Object result;
}
