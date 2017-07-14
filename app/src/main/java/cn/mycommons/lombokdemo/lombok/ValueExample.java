package cn.mycommons.lombokdemo.lombok;


import lombok.experimental.NonFinal;
import lombok.experimental.Value;
import lombok.experimental.Wither;

/**
 * ValueExample <br/>
 * Created by xiaqiulei on 2017-07-12.
 */

@Value
public class ValueExample {

    String name;

    @Wither
    @NonFinal
    int age;

    double score;

    protected String[] tags;
}