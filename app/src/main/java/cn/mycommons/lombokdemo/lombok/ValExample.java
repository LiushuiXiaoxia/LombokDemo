package cn.mycommons.lombokdemo.lombok;

import java.util.ArrayList;
import java.util.HashMap;

import lombok.val;

/**
 * ValExample <br/>
 * Created by xiaqiulei on 2017-07-12.
 */
public class ValExample {

    public String example() {
        val example = new ArrayList<String>();
        example.add("Hello, World!");
        val foo = example.get(0);
        return foo.toLowerCase();
    }

    public void example2() {
        val map = new HashMap<Integer, String>();
        map.put(0, "zero");
        map.put(5, "five");
        for (val entry : map.entrySet()) {
            System.out.printf("%d: %s\n", entry.getKey(), entry.getValue());
        }
    }
}