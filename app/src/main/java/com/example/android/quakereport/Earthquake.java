package com.example.android.quakereport;

import static com.example.android.quakereport.R.id.date;

/**
 * Created by Emma Buchheim on 10/21/2017.
 */

public class Earthquake {

    private double mMagnitude;
    private String mLocation;
    /** Time of the earthquake */
    private long mTimeInMilliseconds;

    public Earthquake (double magnitude, long timeInMilliseconds, String location) {
        mMagnitude = magnitude;
        mTimeInMilliseconds = timeInMilliseconds;
        mLocation = location;
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
}
