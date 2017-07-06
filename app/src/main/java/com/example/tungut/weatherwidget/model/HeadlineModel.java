package com.example.tungut.weatherwidget.model;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

import java.io.Serializable;

/**
 * Created by TungUT on 6/26/2017.
 */

public class HeadlineModel extends RealmObject implements Serializable {

    @PrimaryKey
    private int id;
    private String effectiveDate;
    private String effectiveEpochDate;
    private String everity;
    private String textContent;
    private String category;
    private String date;
}
