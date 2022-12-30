package group.rookie.serialization.jdk;

import group.rookie.common.exception.SerializerException;
import group.rookie.serialization.api.Serialization;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Objects;

/**
 * @ClassName JdkSerialization
 * @Description TODO
 * @Author wzg
 * @Date 2022/12/30 22:21
 * @Version 1.0
 **/
public class JdkSerialization implements Serialization {
    @Override
    public <T> byte[] serialize(T obj) {
        if (Objects.isNull(obj)) {
            throw new SerializerException("serialize object is null");
        }
        try {
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            ObjectOutputStream out = new ObjectOutputStream(os);
            out.writeObject(obj);
            return os.toByteArray();
        } catch (Exception e) {
            throw new SerializerException(e.getMessage(), e);
        }
    }

    @Override
    public <T> T deserialize(byte[] data, Class<T> cls) {
        if (data == null) {
            throw new SerializerException("deserialize data is null");
        }
        try {
            ByteArrayInputStream is = new ByteArrayInputStream(data);
            ObjectInputStream in = new ObjectInputStream(is);
            return (T)in.readObject();
        } catch (Exception e) {
            throw new SerializerException(e.getMessage(), e);
        }
    }
}
