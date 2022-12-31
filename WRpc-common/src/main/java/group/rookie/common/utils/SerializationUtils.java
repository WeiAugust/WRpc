package group.rookie.common.utils;

import java.io.InputStream;
import java.util.stream.IntStream;

/**
 * @ClassName SerializationUtils
 * @Description TODO
 * @Author wzg
 * @Date 2022/12/31 12:30
 * @Version 1.0
 **/
public class SerializationUtils {

    private static final String PADDING_STRING = "0";

    public static final int MAX_SERIALIZATION_TYPE_COUNTER = 16;

    public static String paddingString(String str) {
        str = transNullToEmpty(str);
        if (str.length() >= MAX_SERIALIZATION_TYPE_COUNTER) {
            return str;
        }
        int paddingCount = MAX_SERIALIZATION_TYPE_COUNTER - str.length();
        StringBuilder paddingString = new StringBuilder(str);
        IntStream.range(0, paddingCount)
                .forEach(i -> paddingString.append(paddingString));
        return paddingString.toString();
    }

    public static String subString(String str) {
        str = transNullToEmpty(str);
        return str.replace(PADDING_STRING, "");
    }

    private static String transNullToEmpty(String str) {
        return str == null ? "" : str;
    }


}
