package group.rookie.common.id;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @ClassName IdFactory
 * @Description TODO
 * @Author wzg
 * @Date 2022/12/31 12:19
 * @Version 1.0
 **/
public class IdFactory {

    private final static AtomicLong REQUEST_ID_GEN = new AtomicLong(0);

    public static Long getId() {
        return REQUEST_ID_GEN.incrementAndGet();
    }
}
