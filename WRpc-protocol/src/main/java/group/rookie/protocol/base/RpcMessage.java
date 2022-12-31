package group.rookie.protocol.base;

import java.io.Serializable;

/**
 * @ClassName RpcMessage
 * @Description TODO
 * @Author wzg
 * @Date 2022/12/31 12:10
 * @Version 1.0
 **/
public class RpcMessage implements Serializable {

    private boolean oneway;

    private boolean async;

    public boolean isOneway() {
        return oneway;
    }

    public void setOneway(boolean oneway) {
        this.oneway = oneway;
    }

    public boolean isAsync() {
        return async;
    }

    public void setAsync(boolean async) {
        this.async = async;
    }
}
