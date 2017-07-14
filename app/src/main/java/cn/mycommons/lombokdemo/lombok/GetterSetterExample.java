package cn.mycommons.lombokdemo.lombok;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

/**
 * GetterSetterExample <br/>
 * Created by xiaqiulei on 2017-07-12.
 */
public class GetterSetterExample {

    @Getter
    @Setter
    private int age;

    @Setter(AccessLevel.PROTECTED)
    private String name;
}