package com.example.android.quakereport;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Locale;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.DecimalFormat;

import static com.example.android.quakereport.R.id.location;
import static com.example.android.quakereport.R.id.magnitude;

/**
 * Created by Emma Buchheim on 10/22/2017.
 */

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    public EarthquakeAdapter(Activity context, ArrayList<Earthquake> earthquakes) {
        super(context, 0, earthquakes);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Earthquake currentEarthquake = getItem(position);

        DecimalFormat decimalFormat = new DecimalFormat("0.0");
        String magToDisplay = decimalFormat.format(currentEarthquake.getMagnitude());

        TextView magnitudeTextView = (TextView) listItemView.findViewById(R.id.magnitude);
        magnitudeTextView.setText(magToDisplay);

        Date dateObject = new Date(currentEarthquake.getTimeInMilliseconds());

        SimpleDateFormat dateFormatter = new SimpleDateFormat("MMM DD, yyyy");
        String dateToDisplay = dateFormatter.format(dateObject);

        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
        String timeToDisplay = timeFormat.format(dateObject);

        TextView timeTextView = (TextView) listItemView.findViewById(R.id.time);
        timeTextView.setText(timeToDisplay);

        TextView dateTextView = (TextView) listItemView.findViewById(R.id.date);
        dateTextView.setText(dateToDisplay);



        String location = currentEarthquake.getLocation();

        String primaryLocation;
        String descriptorLocation;

        if (location.contains(" of ")) {
            int locationSeparator = location.indexOf(" of ") + 3;
            descriptorLocation = location.substring(0, locationSeparator);
            primaryLocation = location.substring(locationSeparator);
        } else {
            descriptorLocation = "Near the";
            primaryLocation = location;

        }

        TextView locationTextView = (TextView) listItemView.findViewById(R.id.location);
        locationTextView.setText(primaryLocation);

        TextView locationDescriptorTextView = (TextView) listItemView.findViewById(R.id.location_descriptor);
        locationDescriptorTextView.setText(descriptorLocation);

        return listItemView;

    }
}

