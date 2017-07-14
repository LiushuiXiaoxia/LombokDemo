package cn.mycommons.lombokdemo.lombok;

import lombok.ToString;

/**
 * ToStringExample <br/>
 * Created by xiaqiulei on 2017-07-12.
 */
@ToString(exclude = "id")
public class ToStringExample {

    private int id;

    private String name;

    private String passwd;

    public ToStringExample(int id, String name, String passwd) {
        this.id = id;
        this.name = name;
        this.passwd = passwd;
    }
}