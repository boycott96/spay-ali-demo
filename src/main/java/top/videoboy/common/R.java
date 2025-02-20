package top.videoboy.common;

import lombok.Data;

@Data
public class R<T> {
    private Integer code;
    private String message;
    private T data;

    public static <T> R<T> success() {
        R<T> result = new R<>();
        result.setCode(200);
        result.setMessage("success");
        return result;
    }

    public static <T> R<T> success(T data) {
        R<T> result = new R<>();
        result.setCode(200);
        result.setMessage("success");
        result.setData(data);
        return result;
    }

    public static <T> R<T> error(String message) {
        R<T> result = new R<>();
        result.setCode(500);
        result.setMessage(message);
        return result;
    }
} 