package com.example.gridview;

import com.slidingmenu.lib.SlidingMenu;

import android.os.Bundle;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Point;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class ArtistView extends Activity {

	SlidingMenu menu_tray;
	ActionBar actionBar;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.artist_activity);
		
		/*ActionBar*/ actionBar = getActionBar();
		Display display = getWindowManager().getDefaultDisplay();
		Point point = new Point();
		
		actionBar.setDisplayHomeAsUpEnabled(true);
		display.getSize(point);
		int width = point.x;
		
		SlidingMenu menu_tray = new SlidingMenu(this);
		menu_tray.setMode(SlidingMenu.LEFT);
		menu_tray.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
		menu_tray.setBehindOffset(width / 2);
		menu_tray.setFadeDegree(0.35f);
		menu_tray.attachToActivity(this, SlidingMenu.SLIDING_CONTENT);
		menu_tray.setMenu(R.layout.menu_tray);
		
		int artistId = getIntent().getIntExtra("intPosition", 0);
		
		ImageView thumbnail = (ImageView) findViewById(R.id.thumbnail);
		thumbnail.setImageResource(mThumbIds[artistId]);
		
		
		
		
		GridView tourgridview = (GridView) findViewById(R.id.tour_gridview);
	    tourgridview.setAdapter(new TourImageAdapter(this));
	    
	    /*gridview.setOnItemClickListener(new OnItemClickListener() {
	        public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
	            Toast.makeText(ArtistView.this, "" + position, Toast.LENGTH_SHORT).show();
	            
	        }
	    });*/
	    
	    GridView eventgridview = (GridView) findViewById(R.id.event_gridview);
	    eventgridview.setAdapter(new EventImageAdapter(this));
	    
	    eventgridview.setOnItemClickListener(new OnItemClickListener() {
	        public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
	        	
	        	Intent intent = new Intent(getBaseContext(), EventView.class);
	            //intent.putExtra("intPosition", position);
	            startActivity(intent);
	        }
	    });
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.artist_view, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
			case android.R.id.home:
				finish();
				break;
		}
		
		return true;
	}
	
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

}
