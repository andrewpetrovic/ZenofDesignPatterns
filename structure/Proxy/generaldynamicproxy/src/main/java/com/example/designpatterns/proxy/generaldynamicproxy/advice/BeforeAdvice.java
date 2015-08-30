package com.example.designpatterns.proxy.generaldynamicproxy.advice;

import android.util.Log;

/**
 * Created by andrea on 2015/8/30.
 */
public class BeforeAdvice implements IAdvice {
    private static final String TAG = "BeforeAdvice";
    @Override
    public void exec() {
        Log.i(TAG, "执行前置通知!!");
    }
}
