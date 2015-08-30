package com.example.designpatterns.proxy.generateproxy;

import android.util.Log;

/**
 * 被代理角色 -- GamePlayer
 */
public class GamePlayer implements IGamePlayer {

    private static final String TAG = "GamePlayer";

    private String name = "";

    //构造函数限制谁能创建对象,同时传进姓名
    //当然还可以有其他的限制
    public GamePlayer(IGamePlayer _gamePlayer, String _name)throws Exception{
        if (_gamePlayer == null){
            throw new Exception("不能创建真实角色");
        }else{
            this.name = _name;
        }
    }

    @Override
    public void login(String user, String password) {
        Log.i(TAG,"登录名为 " + user + " 的用户," + this.name + " 登录成功!");
    }

    @Override
    public void killBoss() {
        Log.i(TAG,this.name + " 打怪成功!");
    }

    @Override
    public void upgrade() {
        Log.i(TAG,this.name + " 又升了一级!");
    }
}
