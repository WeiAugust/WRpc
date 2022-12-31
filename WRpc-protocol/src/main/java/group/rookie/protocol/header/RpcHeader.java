package group.rookie.protocol.header;

import lombok.Builder;

import java.io.Serializable;

/**
 * @ClassName RpcHeader
 * @Description TODO
 * @Author wzg
 * @Date 2022/12/31 12:16
 * @Version 1.0
 **/
@Builder
public class RpcHeader implements Serializable {

    private short magic;

    private byte msgType;

    private byte status;

    private long requestId;

    private String serializationType;

    private int msgLen;

    public short getMagic() {
        return magic;
    }

    public void setMagic(short magic) {
        this.magic = magic;
    }

    public byte getMsgType() {
        return msgType;
    }

    public void setMsgType(byte msgType) {
        this.msgType = msgType;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public long getRequestId() {
        return requestId;
    }

    public void setRequestId(long requestId) {
        this.requestId = requestId;
    }

    public String getSerializationType() {
        return serializationType;
    }

    public void setSerializationType(String serializationType) {
        this.serializationType = serializationType;
    }

    public int getMsgLen() {
        return msgLen;
    }

    public void setMsgLen(int msgLen) {
        this.msgLen = msgLen;
    }
}
