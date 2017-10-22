package com.example.android.quakereport;

/**
 * Created by Emma Buchheim on 10/21/2017.
 */

public class Earthquake {

    private double mMagnitude;
    private int mDate;
    private String mLocation;

    public Earthquake (double magnitude, int date, String location) {
        mMagnitude = magnitude;
        mDate = date;
        mLocation = location;
    }

    public double getMagnitude() {
        return mMagnitude;
    }
    public int getDate() {
        return mDate;
    }
    public String getLocation() {
        return mLocation;
    }
}
