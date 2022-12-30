package group.rookie.serialization.api;

/**
 * @ClassName Serialization
 * @Description TODO
 * @Author wzg
 * @Date 2022/12/30 22:19
 * @Version 1.0
 **/
public interface Serialization {

    <T> byte[] serialize(T obj);

    <T> T deserialize(byte[] data, Class<T> cls);
}
