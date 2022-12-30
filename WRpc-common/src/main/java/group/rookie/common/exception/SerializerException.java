package group.rookie.common.exception;

/**
 * @ClassName SerializerException
 * @Description TODO
 * @Author wzg
 * @Date 2022/12/30 22:25
 * @Version 1.0
 **/
public class SerializerException extends RuntimeException {

    public SerializerException(final Throwable e) {
        super(e);
    }

    public SerializerException(final String message) {
        super(message);
    }

    public SerializerException(final String message, final Throwable e) {
        super(message, e);
    }
}
