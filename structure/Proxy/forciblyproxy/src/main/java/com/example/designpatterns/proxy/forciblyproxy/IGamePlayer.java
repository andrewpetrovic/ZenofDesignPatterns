package com.example.designpatterns.proxy.forciblyproxy;

/**
 * 抽象主题角色
 */
public interface IGamePlayer {
    public void login(String user, String password);
    public void killBoss();
    public void upgrade();
    public IGamePlayer getProxy();
}
