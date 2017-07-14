package cn.mycommons.lombokdemo.lombok;

import lombok.NonNull;

/**
 * NonNullExample <br/>
 * Created by xiaqiulei on 2017-07-12.
 */
public class NonNullExample {

    public static int length(@NonNull String string) {
        return string.length();
    }
}