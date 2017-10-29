package com.example.android.quakereport;

import android.content.Context;
import android.os.AsyncTask;
import android.content.AsyncTaskLoader;

import java.util.List;

/**
 * Created by Emma Buchheim on 10/29/2017.
 */

public class EarthquakeLoader extends AsyncTaskLoader<List<Earthquake>> {

    public EarthquakeLoader (Context context) {
        super(context);
    }

    @Override
    public List<Earthquake> loadInBackground() {
        return null;
    }
}
