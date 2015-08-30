package com.example.designpatterns.proxy.extendsproxy;

import android.util.Log;

/**
 * 被代理角色 -- GamePlayer
 */
public class GamePlayer implements IGamePlayer {

    private static final String TAG = "GamePlayer";

    private String name = "";

    public GamePlayer(String _name){
        this.name = _name;
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
