package cn.mycommons.lombokdemo.lombok;

import lombok.EqualsAndHashCode;

/**
 * EqualsAndHashCodeExample <br/>
 * Created by xiaqiulei on 2017-07-12.
 */
@EqualsAndHashCode
public class EqualsAndHashCodeExample {

    private int id;

    private String name;

    public EqualsAndHashCodeExample(int id, String name) {
        this.id = id;
        this.name = name;
    }
}