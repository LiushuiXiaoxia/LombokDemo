package cn.mycommons.lombokdemo.lombok;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

/**
 * DataExample <br/>
 * Created by xiaqiulei on 2017-07-12.
 */

@Data
public class DataExample {

    private final String name;

    @Setter(AccessLevel.PACKAGE)
    private int age;

    private double score;

    private String[] tags;
}