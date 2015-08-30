package com.example.designpatterns.proxy.virualproxy;

/**
 * 代理--游戏代练者
 */
public class GamePlayerProxy implements IGamePlayer {

    //需要的时候才初始化被代理对象,一面被代理过多导致初始化缓慢的问题

    private IGamePlayer gamePlayer = null;

    @Override
    public void login(String user, String password) {
        if (gamePlayer == null){
            this.gamePlayer = new GamePlayer("张三");
        }
        this.gamePlayer.login(user,password);
    }

    @Override
    public void killBoss() {
        if (gamePlayer == null){
            this.gamePlayer = new GamePlayer("张三");
        }
        this.gamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        if (gamePlayer == null){
            this.gamePlayer = new GamePlayer("张三");
        }
        this.gamePlayer.upgrade();
    }
}
