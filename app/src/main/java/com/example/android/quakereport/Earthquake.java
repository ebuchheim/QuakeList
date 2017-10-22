package com.example.android.quakereport;

/**
 * Created by Emma Buchheim on 10/21/2017.
 */

public class Earthquake {

    private double mMagnitude;
    private String mDate;
    private String mLocation;

    public Earthquake (double magnitude, String date, String location) {
        mMagnitude = magnitude;
        mDate = date;
        mLocation = location;
    }

    public double getMagnitude() {
        return mMagnitude;
    }
    public String getDate() {
        return mDate;
    }
    public String getLocation() {
        return mLocation;
    }
}
