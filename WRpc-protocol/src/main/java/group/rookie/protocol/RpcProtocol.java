package group.rookie.protocol;

import group.rookie.protocol.header.RpcHeader;
import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName RpcProtocol
 * @Description TODO
 * @Author wzg
 * @Date 2022/12/31 12:15
 * @Version 1.0
 **/

@Data
public class RpcProtocol<T> implements Serializable {

    private RpcHeader header;

    private T body;
}
