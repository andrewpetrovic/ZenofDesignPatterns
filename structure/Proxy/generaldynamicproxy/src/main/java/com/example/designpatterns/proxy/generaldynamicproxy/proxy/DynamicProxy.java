package com.example.designpatterns.proxy.generaldynamicproxy.proxy;

import com.example.designpatterns.proxy.generaldynamicproxy.advice.BeforeAdvice;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by andrea on 2015/8/30.
 */
public class DynamicProxy<T> {
    protected static <T> T newProxyInstance(ClassLoader loader,Class<?>[] interfaces,InvocationHandler h){
        //执行目标,返回结果
        return (T) Proxy.newProxyInstance(loader,interfaces,h);
    }
}
