package group.rookie.protocol.enums;

/**
 * @ClassName RpcStatus
 * @Description TODO
 * @Author wzg
 * @Date 2022/12/31 12:11
 * @Version 1.0
 **/
public enum RpcStatus {

    SUCCESS(0),
    FAIL(1)
    ;

    private final int code;

    RpcStatus(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
