package cn.mycommons.lombokdemo.lombok;

import java.io.UnsupportedEncodingException;

import lombok.SneakyThrows;

/**
 * SneakyThrowsExample <br/>
 * Created by xiaqiulei on 2017-07-12.
 */
public class SneakyThrowsExample implements Runnable {

    @SneakyThrows(UnsupportedEncodingException.class)
    public String utf8ToString(byte[] bytes) {
        return new String(bytes, "UTF-8");
    }

    @SneakyThrows
    public void run() {
        throw new Throwable();
    }
}
