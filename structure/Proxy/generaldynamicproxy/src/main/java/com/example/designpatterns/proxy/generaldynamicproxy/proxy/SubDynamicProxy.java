package com.example.designpatterns.proxy.generaldynamicproxy.proxy;

import com.example.designpatterns.proxy.generaldynamicproxy.advice.BeforeAdvice;
import com.example.designpatterns.proxy.generaldynamicproxy.invocationHandler.GamePlayIH;
import com.example.designpatterns.proxy.generaldynamicproxy.player.IGamePlayer;

import java.lang.reflect.InvocationHandler;

/**
 * Created by andrea on 2015/8/30.
 */
public class SubDynamicProxy extends DynamicProxy {
    public static <T> T newProxyInstance(IGamePlayer player){
        //寻找JoinPoint连接点
        if(true){
            (new BeforeAdvice()).exec();
        }
        //获得handler
        InvocationHandler handler = new GamePlayIH(player);
        return newProxyInstance(player.getClass().getClassLoader(),player.getClass().getInterfaces(),handler);
    }
}
