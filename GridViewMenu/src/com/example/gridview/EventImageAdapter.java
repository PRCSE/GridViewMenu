package com.example.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class EventImageAdapter extends BaseAdapter {
    private Context mContext;
    private LayoutInflater layoutInflater;

    public EventImageAdapter(Context c) {
        mContext = c;
        layoutInflater = (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public int getCount() {
        return mArtist.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        
    	// https://www.youtube.com/watch?v=wDBM6wVEO70 (@10:40)
    	ViewHolder holder;
    	
    	if (convertView == null)
    	{
    		convertView = layoutInflater.inflate(R.layout.event_tile, parent, false);
        	
    		holder = new ViewHolder();
        	holder.ticket = (RelativeLayout) convertView.findViewById(R.id.ticket_grid);
        	holder.thumbnail = (RelativeLayout) convertView.findViewById(R.id.thumbnail);
        	holder.year = (TextView) convertView.findViewById(R.id.year);
        	holder.day = (TextView) convertView.findViewById(R.id.day);
        	holder.month = (TextView) convertView.findViewById(R.id.month);
        	holder.act = (RelativeLayout) convertView.findViewById(R.id.act);
        	holder.artist = (TextView) convertView.findViewById(R.id.artist);
        	holder.tour = (TextView) convertView.findViewById(R.id.tour);
        	holder.location = (RelativeLayout) convertView.findViewById(R.id.location);
        	holder.city = (TextView) convertView.findViewById(R.id.city);
        	holder.venue = (TextView) convertView.findViewById(R.id.venue);
        	
    		//holder.text = (TextView) convertView.findViewById(R.id.event_count);
    		//holder.text = (TextView) convertView.findViewById(R.id.tour_date);
    		convertView.setTag(holder);
    	}
    	else
    	{
    		holder = (ViewHolder) convertView.getTag();
    	}
    	
    	holder.year.setText(mYear[position]);
    	holder.day.setText(mDay[position]);
    	holder.month.setText(mMonth[position]);
    	holder.artist.setText(mArtist[position]);
    	holder.tour.setText(mTour[position]);
    	holder.city.setText(mCity[position]);
    	holder.venue.setText(mVenue[position]);
    	return convertView;
    }

    private String[] mYear = {
            "2013",	"2013",	"2013",	"2013",	"2013",
            "2013",	"2013",	"2013",	"2013"
    };
    private String[] mDay = {
            "15",	"16",	"17",	"18",	"19",
            "23",	"24",	"29",	"31"
    };
    private String[] mMonth = {
            "March",	"March",	"March",	"March",	"March",
            "March",	"March",	"March",	"March"
    };
    private String[] mArtist = {
            "A$AP Rocky",	"A$AP Rocky",	"A$AP Rocky",	"A$AP Rocky",	"A$AP Rocky",
            "A$AP Rocky",	"A$AP Rocky",	"A$AP Rocky",	"A$AP Rocky"
    };
    private String[] mTour = {
            "Long.Live.A$AP",	"Long.Live.A$AP",	"Long.Live.A$AP",	"Long.Live.A$AP",	"Long.Live.A$AP",
            "Long.Live.A$AP",	"Long.Live.A$AP",	"Long.Live.A$AP",	"Long.Live.A$AP"
    };private String[] mCity = {
            "Manchester",	"Manchester",	"Manchester",	"Manchester",	"Manchester",
            "Bristol",	"Bristol",	"London",	"London"
    };private String[] mVenue = {
            "HMV, The Ritz",	"HMV, The Ritz",	"HMV, The Ritz",	"HMV, The Ritz",	"HMV, The Ritz",
            "O2 Academy",	"O2 Academy",	"The Round House",	"The Round House"
    };
    
    
    static class ViewHolder {
    	RelativeLayout ticket;
    	RelativeLayout thumbnail;
    	TextView year;
    	TextView day;
    	TextView month;
    	RelativeLayout act;
    	TextView artist;
    	TextView tour;
    	RelativeLayout location;
    	TextView city;
    	TextView venue;
    }
}
