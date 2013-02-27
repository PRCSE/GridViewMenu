package com.example.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;
    private LayoutInflater layoutInflater;

    public ImageAdapter(Context c) {
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
    		convertView = layoutInflater.inflate(R.layout.artist_venue_tile, parent, false);
        	
    		holder = new ViewHolder();
        	holder.rl = (RelativeLayout) convertView.findViewById(R.id.artist_venue_grid);
    		holder.image = (ImageView) convertView.findViewById(R.id.thumbnail);
    		holder.text = (TextView) convertView.findViewById(R.id.title);
    		
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
            "Action Bronson",   "A$AP Rocky",
            "Big Boi",    "Big Krit",
            "Bubba Sparxxx",   "Danny Brown",
            "Dr Dre",     "Drake",
            "Eminem",     "J Cole",
            "Janelle Monae",   "Justin Timberlake",
            "Kendrick Lamar",   "Madvillain",
            "Schoolboy Q",   "Slum Village",
            "The Game",    "Tribe Called Quest",
            "Wale",     "Zero 7",
            "Action Bronson",   "A$AP Rocky",
            "Big Boi",    "Big Krit",
            "Bubba Sparxxx",   "Danny Brown",
            "Dr Dre",     "Drake",
            "Eminem",     "J Cole",
            "Janelle Monae",   "Justin Timberlake",
            "Kendrick Lamar",   "Madvillain",
            "Schoolboy Q",   "Slum Village",
            "The Game",    "Tribe Called Quest",
            "Wale",     "Zero 7",
            "Action Bronson",   "A$AP Rocky",
            "Big Boi",    "Big Krit",
            "Bubba Sparxxx",   "Danny Brown",
            "Dr Dre",     "Drake",
            "Eminem",     "J Cole",
            "Janelle Monae",   "Justin Timberlake",
            "Kendrick Lamar",   "Madvillain",
            "Schoolboy Q",   "Slum Village",
            "The Game",    "Tribe Called Quest",
            "Wale",     "Zero 7",
            "Action Bronson",   "A$AP Rocky",
            "Big Boi",    "Big Krit",
            "Bubba Sparxxx",   "Danny Brown",
            "Dr Dre",     "Drake",
            "Eminem",     "J Cole",
            "Janelle Monae",   "Justin Timberlake",
            "Kendrick Lamar",   "Madvillain",
            "Schoolboy Q",   "Slum Village",
            "The Game",    "Tribe Called Quest",
            "Wale",     "Zero 7",
            "Action Bronson",   "A$AP Rocky",
            "Big Boi",    "Big Krit",
            "Bubba Sparxxx",   "Danny Brown",
            "Dr Dre",     "Drake",
            "Eminem",     "J Cole",
            "Janelle Monae",   "Justin Timberlake",
            "Kendrick Lamar",   "Madvillain",
            "Schoolboy Q",   "Slum Village",
            "The Game",    "Tribe Called Quest",
            "Wale",     "Zero 7",
            "Action Bronson",   "A$AP Rocky",
            "Big Boi",    "Big Krit",
            "Bubba Sparxxx",   "Danny Brown",
            "Dr Dre",     "Drake",
            "Eminem",     "J Cole",
            "Janelle Monae",   "Justin Timberlake",
            "Kendrick Lamar",   "Madvillain",
            "Schoolboy Q",   "Slum Village",
            "The Game",    "Tribe Called Quest",
            "Wale",     "Zero 7",
            "Action Bronson",   "A$AP Rocky",
            "Big Boi",    "Big Krit",
            "Bubba Sparxxx",   "Danny Brown",
            "Dr Dre",     "Drake",
            "Eminem",     "J Cole",
            "Janelle Monae",   "Justin Timberlake",
            "Kendrick Lamar",   "Madvillain",
            "Schoolboy Q",   "Slum Village",
            "The Game",    "Tribe Called Quest",
            "Wale",     "Zero 7",
            "Action Bronson",   "A$AP Rocky",
            "Big Boi",    "Big Krit",
            "Bubba Sparxxx",   "Danny Brown",
            "Dr Dre",     "Drake",
            "Eminem",     "J Cole",
            "Janelle Monae",   "Justin Timberlake",
            "Kendrick Lamar",   "Madvillain",
            "Schoolboy Q",   "Slum Village",
            "The Game",    "Tribe Called Quest",
            "Wale",     "Zero 7",
            "Action Bronson",   "A$AP Rocky",
            "Big Boi",    "Big Krit",
            "Bubba Sparxxx",   "Danny Brown",
            "Dr Dre",     "Drake",
            "Eminem",     "J Cole",
            "Janelle Monae",   "Justin Timberlake",
            "Kendrick Lamar",   "Madvillain",
            "Schoolboy Q",   "Slum Village",
            "The Game",    "Tribe Called Quest",
            "Wale",     "Zero 7",
            "Action Bronson",   "A$AP Rocky",
            "Big Boi",    "Big Krit",
            "Bubba Sparxxx",   "Danny Brown",
            "Dr Dre",     "Drake",
            "Eminem",     "J Cole",
            "Janelle Monae",   "Justin Timberlake",
            "Kendrick Lamar",   "Madvillain",
            "Schoolboy Q",   "Slum Village",
            "The Game",    "Tribe Called Quest",
            "Wale",     "Zero 7",
            "Action Bronson",   "A$AP Rocky",
            "Big Boi",    "Big Krit",
            "Bubba Sparxxx",   "Danny Brown",
            "Dr Dre",     "Drake",
            "Eminem",     "J Cole",
            "Janelle Monae",   "Justin Timberlake",
            "Kendrick Lamar",   "Madvillain",
            "Schoolboy Q",   "Slum Village",
            "The Game",    "Tribe Called Quest",
            "Wale",     "Zero 7",
            "Action Bronson",   "A$AP Rocky",
            "Big Boi",    "Big Krit",
            "Bubba Sparxxx",   "Danny Brown",
            "Dr Dre",     "Drake",
            "Eminem",     "J Cole",
            "Janelle Monae",   "Justin Timberlake",
            "Kendrick Lamar",   "Madvillain",
            "Schoolboy Q",   "Slum Village",
            "The Game",    "Tribe Called Quest",
            "Wale",     "Zero 7"
    };
    
    // references to our images
    private Integer[] mThumbIds = {
            R.drawable.action_bronson,   R.drawable.asap_rocky,
            R.drawable.big_boi,    R.drawable.big_krit,
            R.drawable.bubba_sparxxx,   R.drawable.danny_brown,
            R.drawable.dr_dre,     R.drawable.drake,
            R.drawable.eminem,     R.drawable.j_cole,
            R.drawable.janelle_monae,   R.drawable.justin_timberlake,
            R.drawable.kendrick_lamar,   R.drawable.madvillain,
            R.drawable.schoolboy_q,   R.drawable.slum_village,
            R.drawable.the_game,    R.drawable.tribe_called_quest,
            R.drawable.wale,     R.drawable.zero_7,
            R.drawable.action_bronson,   R.drawable.asap_rocky,
            R.drawable.big_boi,    R.drawable.big_krit,
            R.drawable.bubba_sparxxx,   R.drawable.danny_brown,
            R.drawable.dr_dre,     R.drawable.drake,
            R.drawable.eminem,     R.drawable.j_cole,
            R.drawable.janelle_monae,   R.drawable.justin_timberlake,
            R.drawable.kendrick_lamar,   R.drawable.madvillain,
            R.drawable.schoolboy_q,   R.drawable.slum_village,
            R.drawable.the_game,    R.drawable.tribe_called_quest,
            R.drawable.wale,     R.drawable.zero_7,
            R.drawable.action_bronson,   R.drawable.asap_rocky,
            R.drawable.big_boi,    R.drawable.big_krit,
            R.drawable.bubba_sparxxx,   R.drawable.danny_brown,
            R.drawable.dr_dre,     R.drawable.drake,
            R.drawable.eminem,     R.drawable.j_cole,
            R.drawable.janelle_monae,   R.drawable.justin_timberlake,
            R.drawable.kendrick_lamar,   R.drawable.madvillain,
            R.drawable.schoolboy_q,   R.drawable.slum_village,
            R.drawable.the_game,    R.drawable.tribe_called_quest,
            R.drawable.wale,     R.drawable.zero_7,
            R.drawable.action_bronson,   R.drawable.asap_rocky,
            R.drawable.big_boi,    R.drawable.big_krit,
            R.drawable.bubba_sparxxx,   R.drawable.danny_brown,
            R.drawable.dr_dre,     R.drawable.drake,
            R.drawable.eminem,     R.drawable.j_cole,
            R.drawable.janelle_monae,   R.drawable.justin_timberlake,
            R.drawable.kendrick_lamar,   R.drawable.madvillain,
            R.drawable.schoolboy_q,   R.drawable.slum_village,
            R.drawable.the_game,    R.drawable.tribe_called_quest,
            R.drawable.wale,     R.drawable.zero_7,
            R.drawable.action_bronson,   R.drawable.asap_rocky,
            R.drawable.big_boi,    R.drawable.big_krit,
            R.drawable.bubba_sparxxx,   R.drawable.danny_brown,
            R.drawable.dr_dre,     R.drawable.drake,
            R.drawable.eminem,     R.drawable.j_cole,
            R.drawable.janelle_monae,   R.drawable.justin_timberlake,
            R.drawable.kendrick_lamar,   R.drawable.madvillain,
            R.drawable.schoolboy_q,   R.drawable.slum_village,
            R.drawable.the_game,    R.drawable.tribe_called_quest,
            R.drawable.wale,     R.drawable.zero_7,
            R.drawable.action_bronson,   R.drawable.asap_rocky,
            R.drawable.big_boi,    R.drawable.big_krit,
            R.drawable.bubba_sparxxx,   R.drawable.danny_brown,
            R.drawable.dr_dre,     R.drawable.drake,
            R.drawable.eminem,     R.drawable.j_cole,
            R.drawable.janelle_monae,   R.drawable.justin_timberlake,
            R.drawable.kendrick_lamar,   R.drawable.madvillain,
            R.drawable.schoolboy_q,   R.drawable.slum_village,
            R.drawable.the_game,    R.drawable.tribe_called_quest,
            R.drawable.wale,     R.drawable.zero_7,
            R.drawable.action_bronson,   R.drawable.asap_rocky,
            R.drawable.big_boi,    R.drawable.big_krit,
            R.drawable.bubba_sparxxx,   R.drawable.danny_brown,
            R.drawable.dr_dre,     R.drawable.drake,
            R.drawable.eminem,     R.drawable.j_cole,
            R.drawable.janelle_monae,   R.drawable.justin_timberlake,
            R.drawable.kendrick_lamar,   R.drawable.madvillain,
            R.drawable.schoolboy_q,   R.drawable.slum_village,
            R.drawable.the_game,    R.drawable.tribe_called_quest,
            R.drawable.wale,     R.drawable.zero_7,
            R.drawable.action_bronson,   R.drawable.asap_rocky,
            R.drawable.big_boi,    R.drawable.big_krit,
            R.drawable.bubba_sparxxx,   R.drawable.danny_brown,
            R.drawable.dr_dre,     R.drawable.drake,
            R.drawable.eminem,     R.drawable.j_cole,
            R.drawable.janelle_monae,   R.drawable.justin_timberlake,
            R.drawable.kendrick_lamar,   R.drawable.madvillain,
            R.drawable.schoolboy_q,   R.drawable.slum_village,
            R.drawable.the_game,    R.drawable.tribe_called_quest,
            R.drawable.wale,     R.drawable.zero_7,
            R.drawable.action_bronson,   R.drawable.asap_rocky,
            R.drawable.big_boi,    R.drawable.big_krit,
            R.drawable.bubba_sparxxx,   R.drawable.danny_brown,
            R.drawable.dr_dre,     R.drawable.drake,
            R.drawable.eminem,     R.drawable.j_cole,
            R.drawable.janelle_monae,   R.drawable.justin_timberlake,
            R.drawable.kendrick_lamar,   R.drawable.madvillain,
            R.drawable.schoolboy_q,   R.drawable.slum_village,
            R.drawable.the_game,    R.drawable.tribe_called_quest,
            R.drawable.wale,     R.drawable.zero_7,
            R.drawable.action_bronson,   R.drawable.asap_rocky,
            R.drawable.big_boi,    R.drawable.big_krit,
            R.drawable.bubba_sparxxx,   R.drawable.danny_brown,
            R.drawable.dr_dre,     R.drawable.drake,
            R.drawable.eminem,     R.drawable.j_cole,
            R.drawable.janelle_monae,   R.drawable.justin_timberlake,
            R.drawable.kendrick_lamar,   R.drawable.madvillain,
            R.drawable.schoolboy_q,   R.drawable.slum_village,
            R.drawable.the_game,    R.drawable.tribe_called_quest,
            R.drawable.wale,     R.drawable.zero_7,
            R.drawable.action_bronson,   R.drawable.asap_rocky,
            R.drawable.big_boi,    R.drawable.big_krit,
            R.drawable.bubba_sparxxx,   R.drawable.danny_brown,
            R.drawable.dr_dre,     R.drawable.drake,
            R.drawable.eminem,     R.drawable.j_cole,
            R.drawable.janelle_monae,   R.drawable.justin_timberlake,
            R.drawable.kendrick_lamar,   R.drawable.madvillain,
            R.drawable.schoolboy_q,   R.drawable.slum_village,
            R.drawable.the_game,    R.drawable.tribe_called_quest,
            R.drawable.wale,     R.drawable.zero_7,
            R.drawable.action_bronson,   R.drawable.asap_rocky,
            R.drawable.big_boi,    R.drawable.big_krit,
            R.drawable.bubba_sparxxx,   R.drawable.danny_brown,
            R.drawable.dr_dre,     R.drawable.drake,
            R.drawable.eminem,     R.drawable.j_cole,
            R.drawable.janelle_monae,   R.drawable.justin_timberlake,
            R.drawable.kendrick_lamar,   R.drawable.madvillain,
            R.drawable.schoolboy_q,   R.drawable.slum_village,
            R.drawable.the_game,    R.drawable.tribe_called_quest,
            R.drawable.wale,     R.drawable.zero_7
    };
    
    static class ViewHolder {
    	RelativeLayout rl;
    	ImageView image;
    	TextView text;
    }
}
