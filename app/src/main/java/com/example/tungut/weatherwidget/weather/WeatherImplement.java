package com.example.tungut.weatherwidget.weather;

import android.content.Context;
import android.widget.Toast;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.StringRequestListener;
import com.example.tungut.weatherwidget.MainActivity;
import com.example.tungut.weatherwidget.global.Consts;

/**
 * Created by TungUT on 6/26/2017.
 */

public class WeatherImplement implements WeatherInterface {

    private Context context;
    private MainActivity activity;

    public WeatherImplement(MainActivity activity){
        this.activity = activity;
    }

    @Override
    public void getWeatherData() {
        getWeatherDataCallAPI();
    }

    private void getWeatherDataCallAPI() {
        String url = Consts.BASE_URL + Consts.API_LOCATION;
        AndroidNetworking.get(url)
                .addQueryParameter("q", "hanoi")
                .addQueryParameter("apikey", "hoArfRosT1215")
                .setPriority(Priority.MEDIUM)
                .build()
                .getAsString(new StringRequestListener() {
                    @Override
                    public void onResponse(String response) {
                        Toast.makeText(activity, "response: " + response, Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onError(ANError anError) {
                        Toast.makeText(activity, "error: " + anError, Toast.LENGTH_SHORT).show();
                    }
                });
    }
}
