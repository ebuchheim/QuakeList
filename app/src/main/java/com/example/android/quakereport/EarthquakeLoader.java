package com.example.android.quakereport;

import android.content.Context;
import android.os.AsyncTask;
import android.content.AsyncTaskLoader;

/**
 * Created by Emma Buchheim on 10/29/2017.
 */

public class EarthquakeLoader extends AsyncTaskLoader {

    public EarthquakeLoader (Context context) {
        super(context);
    }

    @Override
    public Object loadInBackground() {
        return null;
    }
}
