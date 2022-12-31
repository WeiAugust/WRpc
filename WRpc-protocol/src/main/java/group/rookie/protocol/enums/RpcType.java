package group.rookie.protocol.enums;

/**
 * @author ceshi
 * @Title:
 * @Package
 * @Description:
 * @date 2022/12/3112:12
 */
public enum RpcType {

    REQUEST(1),

    RESPONSE(2),

    HEARTBEAT(3)
    ;

    private int type;

    RpcType(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public static RpcType findByType(int type) {
        for (RpcType rpcType : RpcType.values()) {
            if (rpcType.getType() == type) {
                return rpcType;
            }
        }
        return null;
    }
}
