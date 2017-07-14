package cn.mycommons.lombokdemo.lombok;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

/**
 * ConstructorExample <br/>
 * Created by xiaqiulei on 2017-07-12.
 */

@ToString
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class ConstructorExample<T> {

    private String args;

    @ToString
    @RequiredArgsConstructor(staticName = "of")
    public static class StaticMethodsExample {

        @NonNull
        private String field;
    }
}