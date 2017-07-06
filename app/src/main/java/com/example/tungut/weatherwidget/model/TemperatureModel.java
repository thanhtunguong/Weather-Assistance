package com.example.tungut.weatherwidget.model;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

import java.io.Serializable;

/**
 * Created by TungUT on 6/26/2017.
 */

public class TemperatureModel extends RealmObject implements Serializable {

    @PrimaryKey
    private int id;
    private MaximumModel maximumModel;
    private MinimumModel minimumModel;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public MaximumModel getMaximumModel() {
        return maximumModel;
    }

    public void setMaximumModel(MaximumModel maximumModel) {
        this.maximumModel = maximumModel;
    }

    public MinimumModel getMinimumModel() {
        return minimumModel;
    }

    public void setMinimumModel(MinimumModel minimumModel) {
        this.minimumModel = minimumModel;
    }
}
