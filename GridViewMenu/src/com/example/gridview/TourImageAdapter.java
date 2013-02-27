package com.example.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class TourImageAdapter extends BaseAdapter {
    private Context mContext;
    private LayoutInflater layoutInflater;

    public TourImageAdapter(Context c) {
        mContext = c;
        layoutInflater = (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public int getCount() {
        return mThumbIds.length;
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
    		convertView = layoutInflater.inflate(R.layout.tour_tile, parent, false);
        	
    		holder = new ViewHolder();
        	holder.rl = (RelativeLayout) convertView.findViewById(R.id.tour_grid);
        	holder.text = (TextView) convertView.findViewById(R.id.title);
    		holder.image = (ImageView) convertView.findViewById(R.id.tour_image);
    		//holder.text = (TextView) convertView.findViewById(R.id.event_count);
    		//holder.text = (TextView) convertView.findViewById(R.id.tour_date);
    		
    		convertView.setTag(holder);
    	}
    	else
    	{
    		holder = (ViewHolder) convertView.getTag();
    	}
    	
    	holder.image.setImageResource(mThumbIds[position]);
    	holder.text.setText(mArtistNames[position]);
    	
    	return convertView;
    }

    private String[] mArtistNames = {
            "Long.Live.A$AP"
    };
    
    // references to our images
    private Integer[] mThumbIds = {
            R.drawable.longliveasap
    };
    
    static class ViewHolder {
    	RelativeLayout rl;
    	ImageView image;
    	TextView text;
    }
}
