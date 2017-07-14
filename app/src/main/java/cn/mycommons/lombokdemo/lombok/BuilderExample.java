package cn.mycommons.lombokdemo.lombok;


import java.util.Set;

import lombok.Builder;
import lombok.Data;
import lombok.Singular;

/**
 * BuilderExample <br/>
 * Created by xiaqiulei on 2017-07-12.
 */
@Builder
@Data
public class BuilderExample {

    private String name;

    private int age;

    @Singular
    private Set<String> occupations;
}
