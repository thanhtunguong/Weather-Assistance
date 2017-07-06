package com.example.tungut.weatherwidget.model;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

import java.io.Serializable;

/**
 * Created by TungUT on 6/26/2017.
 */

public class DailyForecastModel extends RealmObject implements Serializable {

    @PrimaryKey
    private int id;
    private String date;
    private String epochDate;
    private TemperatureModel temperatureModel;
    private DayModel dayModel;
    private NightModel nightModel;
    private String mobileLink;
    private String link;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEpochDate() {
        return epochDate;
    }

    public void setEpochDate(String epochDate) {
        this.epochDate = epochDate;
    }

    public TemperatureModel getTemperatureModel() {
        return temperatureModel;
    }

    public void setTemperatureModel(TemperatureModel temperatureModel) {
        this.temperatureModel = temperatureModel;
    }

    public DayModel getDayModel() {
        return dayModel;
    }

    public void setDayModel(DayModel dayModel) {
        this.dayModel = dayModel;
    }

    public NightModel getNightModel() {
        return nightModel;
    }

    public void setNightModel(NightModel nightModel) {
        this.nightModel = nightModel;
    }

    public String getMobileLink() {
        return mobileLink;
    }

    public void setMobileLink(String mobileLink) {
        this.mobileLink = mobileLink;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
