package com.example.jh.genericdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

/**
 * https://www.jianshu.com/p/ddbe1db509da
 *
 * Java泛型使用示例整理
 *
 * 以及泛型的继承
 *
 *
 */
public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // test
        Demo<String> demo = new Demo<String>();
        demo.setFiled("www.bo56.com");
        Log.e(TAG, "demo.getFiled() = " + demo.getFiled());
        System.out.println(demo.getFiled());
    }
}
