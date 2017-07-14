package cn.mycommons.lombokdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import cn.mycommons.lombokdemo.lombok.BuilderExample;
import cn.mycommons.lombokdemo.lombok.ConstructorExample;
import cn.mycommons.lombokdemo.lombok.DataExample;
import cn.mycommons.lombokdemo.lombok.EqualsAndHashCodeExample;
import cn.mycommons.lombokdemo.lombok.GetterLazyExample;
import cn.mycommons.lombokdemo.lombok.GetterSetterExample;
import cn.mycommons.lombokdemo.lombok.LogExample;
import cn.mycommons.lombokdemo.lombok.NonNullExample;
import cn.mycommons.lombokdemo.lombok.SneakyThrowsExample;
import cn.mycommons.lombokdemo.lombok.ToStringExample;
import cn.mycommons.lombokdemo.lombok.ValExample;
import cn.mycommons.lombokdemo.lombok.ValueExample;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // test val
        new ValExample().example();
        new ValExample().example2();

        // test NonNull
        // Log.i(TAG, "onCreate: " + NonNullExample.length(null));
        Log.i(TAG, "onCreate: " + NonNullExample.length("abc"));

        // test setter getter
        GetterSetterExample getterSetterExample = new GetterSetterExample();
        getterSetterExample.setAge(123);
        Log.i(TAG, "onCreate: " + getterSetterExample);

        // test toString
        ToStringExample toStringExample = new ToStringExample(123, "admin", "admin");
        Log.i(TAG, "onCreate: " + toStringExample);

        // test EqualsAndHashCode
        EqualsAndHashCodeExample equalsAndHashCodeExample1 = new EqualsAndHashCodeExample(1, "admin");
        EqualsAndHashCodeExample equalsAndHashCodeExample2 = new EqualsAndHashCodeExample(1, "admin");
        Log.i(TAG, "onCreate: " + equalsAndHashCodeExample1.equals(equalsAndHashCodeExample2));

        // test Constructor
        Log.i(TAG, "onCreate: " + new ConstructorExample());
        Log.i(TAG, "onCreate: " + new ConstructorExample("abc"));
        Log.i(TAG, "onCreate: " + ConstructorExample.StaticMethodsExample.of("abc"));

        // test data
        DataExample dataExample = new DataExample("admin");
        dataExample.setScore(1000);
        dataExample.setTags(new String[]{"aa", "bb"});
        Log.i(TAG, "onCreate: " + dataExample);

        // test value
        ValueExample valueExample = new ValueExample("admin", 10, 100, new String[]{"aa", "bb"});
        Log.i(TAG, "onCreate: " + valueExample);
        Log.i(TAG, "onCreate: " + valueExample.withAge(20));

        // test builder
        BuilderExample builderExample = BuilderExample.builder()
                .name("admin")
                .age(10)
                .occupation("aaa")
                .occupation("bbb")
                .build();

        Log.i(TAG, "onCreate: " + builderExample);

        // test sneaky throws
        try {
            // new SneakyThrowsExample().run();
            // new SneakyThrowsExample().utf8ToString(null);
        } catch (Exception ignored) {

        }

        // test GetterLazy
        GetterLazyExample getterLazyExample = new GetterLazyExample();
        Log.i(TAG, "onCreate: =====");
        Log.i(TAG, "onCreate: " + getterLazyExample.getCached().length);
        Log.i(TAG, "onCreate: " + getterLazyExample.getCached().length);

        // test log
        LogExample.main("12");
    }
}