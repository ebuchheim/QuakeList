package com.example.android.quakereport;

import java.net.URL;

import static com.example.android.quakereport.R.id.date;

/**
 * Created by Emma Buchheim on 10/21/2017.
 */

public class Earthquake {

    private double mMagnitude;
    private String mLocation;
    private String mQuakeURLString;
    /** Time of the earthquake */
    private long mTimeInMilliseconds;

    public Earthquake (double magnitude, long timeInMilliseconds, String location, String quakeURLString) {
        mMagnitude = magnitude;
        mTimeInMilliseconds = timeInMilliseconds;
        mLocation = location;
        mQuakeURLString = quakeURLString;
    }

    public double getMagnitude() {
        return mMagnitude;
    }
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
    public String getLocation() {
        return mLocation;
    }
    public String getURLString() { return mQuakeURLString; }
}
