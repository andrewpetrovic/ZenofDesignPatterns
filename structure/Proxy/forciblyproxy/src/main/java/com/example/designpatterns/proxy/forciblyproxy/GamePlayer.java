package com.example.designpatterns.proxy.forciblyproxy;

import android.util.Log;

/**
 * 被代理角色 -- GamePlayer
 */
public class GamePlayer implements IGamePlayer {

    private static final String TAG = "GamePlayer";

    private String name = "";

    //我的代理是谁
    private IGamePlayer proxy = null;

    public GamePlayer(String _name){
        this.name = _name;
    }

    @Override
    public void login(String user, String password) {
        if (isProxy()){
            Log.i(TAG,"登录名为 " + user + " 的用户," + this.name + " 登录成功!");
        }else {
            Log.i(TAG,"请使用指定的代理访问!");
        }
    }

    @Override
    public void killBoss() {
        if (isProxy()){
            Log.i(TAG,this.name + " 打怪成功!");
        }else {
            Log.i(TAG,"请使用指定的代理访问!");
        }
    }

    @Override
    public void upgrade() {
        if (isProxy()){
            Log.i(TAG,this.name + " 又升了一级!");
        }else {
            Log.i(TAG,"请使用指定的代理访问!");
        }
    }

    //找到自己的代理
    @Override
    public IGamePlayer getProxy() {
        this.proxy = new GamePlayerProxy(this);
        return this.proxy;
    }

    private boolean isProxy(){
        if (this.proxy == null){
            return false;
        }else{
            return true;
        }
    }
}
