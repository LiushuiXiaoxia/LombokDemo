package cn.mycommons.lombokdemo.lombok;

import lombok.Getter;

/**
 * GetterLazyExample <br/>
 * Created by xiaqiulei on 2017-07-12.
 */
public class GetterLazyExample {

    @Getter(lazy = true)
    private final double[] cached = expensive();

    private double[] expensive() {
        double[] result = new double[1000000];
        for (int i = 0; i < result.length; i++) {
            result[i] = Math.asin(i);
        }
        return result;
    }
}