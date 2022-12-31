package group.rookie.protocol.header;

import group.rookie.common.id.IdFactory;

import static group.rookie.common.constants.RpcConstants.MAGIC;
import static group.rookie.protocol.enums.RpcType.REQUEST;

/**
 * @ClassName RpcHeaderFactory
 * @Description TODO
 * @Author wzg
 * @Date 2022/12/31 12:17
 * @Version 1.0
 **/
public class RpcHeaderFactory {

    public static RpcHeader getRequestHeader(String serializationType) {
        return RpcHeader.builder()
                .requestId(IdFactory.getId())
                .magic(MAGIC)
                .msgType((byte) REQUEST.getType())
                .status((byte) 0x1)
                .serializationType(serializationType)
                .build();
    }
}
