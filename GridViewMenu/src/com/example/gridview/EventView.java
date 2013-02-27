package com.example.gridview;

import com.slidingmenu.lib.SlidingMenu;

import android.os.Bundle;
import android.app.ActionBar;
import android.app.Activity;
import android.graphics.Point;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;

public class EventView extends Activity {

	SlidingMenu menu_tray;
	ActionBar actionBar;

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.event_activity);
		
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

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.event_view, menu);
		return true;
	}

}
