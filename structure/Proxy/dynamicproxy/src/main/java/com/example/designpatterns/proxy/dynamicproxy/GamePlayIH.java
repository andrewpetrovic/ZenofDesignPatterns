package com.example.designpatterns.proxy.dynamicproxy;

import android.util.Log;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by andrea on 2015/8/30.
 */
public class GamePlayIH implements InvocationHandler {

    private static final String TAG = "GamePlayIH";

    //被代理者
    Class cls = null;

    //被代理的实例
    Object obj = null;

    //我要代理谁
    public GamePlayIH(Object _obj){
        this.obj = _obj;
    }

    //调用被代理的方法
    @Override
    public Object invoke(Object object, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(this.obj,args);
        // 如果是登录方法,则发送消息
        if (method.getName().equalsIgnoreCase("login")){
            Log.i(TAG,"有人在用我的账号登录");
        }
        return result;
    }
}