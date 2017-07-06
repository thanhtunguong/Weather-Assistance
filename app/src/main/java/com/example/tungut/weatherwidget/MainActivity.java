package com.example.tungut.weatherwidget;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.tungut.weatherwidget.base.BaseActivity;
import com.example.tungut.weatherwidget.weather.WeatherImplement;

public class MainActivity extends BaseActivity {

    private MainActivity activity;
    private Context context;
    private WeatherImplement weatherImplement;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activity = this;
        context = context;

        weatherImplement = new WeatherImplement(activity);
        getWeatherData();
    }

    private void getWeatherData(){
        weatherImplement.getWeatherData();
    }
}
