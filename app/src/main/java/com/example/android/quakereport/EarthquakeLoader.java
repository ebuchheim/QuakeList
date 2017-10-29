package com.example.android.quakereport;

import android.content.Context;
import android.os.AsyncTask;
import android.content.AsyncTaskLoader;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Emma Buchheim on 10/29/2017.
 */

public class EarthquakeLoader extends AsyncTaskLoader<List<Earthquake>> {

    private String mUrl;

    public EarthquakeLoader (Context context, String url) {
        super(context);
        mUrl = url;
    }


    @Override
    public List<Earthquake> loadInBackground() {
        ArrayList<Earthquake> earthquakes = QueryUtils.FetchEarthquakeData(mUrl);

        // Don't perform the request if there are no URLs, or the first URL is null.
        if (mUrl == null) {
            return null;
        }

        return earthquakes;
    }
}
