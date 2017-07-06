package com.example.tungut.weatherwidget.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.androidnetworking.AndroidNetworking;
import com.example.tungut.weatherwidget.global.Global;

import java.util.ArrayList;
import java.util.List;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;

/**
 * Created by TungUT on 6/26/2017.
 */

public class BaseActivity extends AppCompatActivity {

    private Realm realm;
    private RealmConfiguration realmConfiguration;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupRealm();

        realm = Realm.getInstance(realmConfiguration);
        initAndroidNetwordkingWithProtocol();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        realm.close();
    }

    private void setupRealm(){
        realmConfiguration = Global.returnRealmConfiguration(this);
    }

    public void initAndroidNetwordkingWithProtocol() {
        List<Protocol> protocolList = new ArrayList<>();
        protocolList.add(Protocol.HTTP_1_1);
        protocolList.add(Protocol.HTTP_2);
        protocolList.add(Protocol.SPDY_3);

        OkHttpClient okHttpClient = Global.getUnsafeOkHttpClient();

        AndroidNetworking.initialize(getApplicationContext(), okHttpClient);
    }
}
