package com.example.designpatterns.proxy.generaldynamicproxy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.example.designpatterns.proxy.generaldynamicproxy.invocationHandler.GamePlayIH;
import com.example.designpatterns.proxy.generaldynamicproxy.player.GamePlayer;
import com.example.designpatterns.proxy.generaldynamicproxy.player.IGamePlayer;
import com.example.designpatterns.proxy.generaldynamicproxy.proxy.DynamicProxy;
import com.example.designpatterns.proxy.generaldynamicproxy.proxy.SubDynamicProxy;

import java.lang.reflect.InvocationHandler;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general_dyna_proxy);
        IGamePlayer player = new GamePlayer("张三");
        Log.i(TAG, "开始时间是: 2009-8-25 10:45");
        IGamePlayer proxy = SubDynamicProxy.newProxyInstance(player);
        proxy.login("zhangsan","password");
        proxy.killBoss();
        proxy.upgrade();
        Log.i(TAG, "结束时间是: 2009-8-26 03:40");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_general_dyna_proxy, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
