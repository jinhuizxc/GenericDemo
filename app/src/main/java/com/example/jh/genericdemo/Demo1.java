package com.example.jh.genericdemo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jinhui on 2018/5/14.
 * email: 1004260403@qq.com
 */

public class Demo1 {

    public <T>List<T> newArrayList(){
        return new ArrayList<T>();
    }


}
