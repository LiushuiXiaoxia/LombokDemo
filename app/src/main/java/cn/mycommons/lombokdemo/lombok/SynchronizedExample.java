package cn.mycommons.lombokdemo.lombok;

import lombok.Synchronized;

/**
 * SynchronizedExample <br/>
 * Created by xiaqiulei on 2017-07-12.
 */
public class SynchronizedExample {

    private final Object readLock = new Object();

    @Synchronized
    public static void hello() {
        System.out.println("world");
    }

    @Synchronized
    public int answerToLife() {
        return 42;
    }

    @Synchronized("readLock")
    public void foo() {
        System.out.println("bar");
    }
}