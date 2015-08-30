package com.example.designpatterns.proxy.extendsproxy;

import android.util.Log;

/**
 * 代理--游戏代练者
 */
public class GamePlayerProxy implements IGamePlayer,ICount {

    private static final String TAG = "GamePlayerProxy";

    private IGamePlayer gamePlayer = null;

    public GamePlayerProxy(IGamePlayer _gamePlayer){
        this.gamePlayer = _gamePlayer;
    }

    @Override
    public void login(String user, String password) {
        this.gamePlayer.login(user,password);
    }

    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
        this.count();
    }

    @Override
    public void count() {
        Log.i(TAG,"升级总费用是:150元");
    }
}
