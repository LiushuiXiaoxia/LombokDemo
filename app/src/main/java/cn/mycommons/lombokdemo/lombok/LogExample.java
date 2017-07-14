package cn.mycommons.lombokdemo.lombok;

import lombok.extern.java.Log;

/**
 * LogExample <br/>
 * Created by xiaqiulei on 2017-07-12.
 */
@Log
public class LogExample {

    public static void main(String... args) {
        log.info("Something's wrong here");
    }
}