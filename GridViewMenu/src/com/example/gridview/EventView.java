package com.example.gridview;

import com.slidingmenu.lib.SlidingMenu;

import android.R.color;
import android.os.Bundle;
import android.app.ActionBar;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.Point;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Button;
import android.widget.Toast;

public class EventView extends Activity implements OnClickListener, OnItemSelectedListener {

	SlidingMenu menu_tray;
	ActionBar actionBar;
	Button bookButton;
	
	boolean booked = false;
	int price = 14;
	int noOfTickets = 1;
	int typeOfTicket = 1;
	
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
		
		bookButton = (Button) findViewById(R.id.book_button);
		bookButton.setOnClickListener(this);
		
		
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

	@Override
	public void onClick(View v) {

		int id = v.getId();
		
		switch (id)
		{
		case R.id.book_button:
			String toggleColour = bookToggle();
			bookButton.setBackgroundColor(Color.parseColor(toggleColour));
			break;
			
		
		}
		
	}

	@Override
	public void onItemSelected(AdapterView<?> view, View subView, int position,
			long row) {

		int id = view.getId();
		
		switch (id)
		{
		case R.id.radioGroup1:
			switch (position)
			{
			case R.id.radio0:
				typeOfTicket = 0;
				calculateBooking();
				break;
			case R.id.radio1:
				typeOfTicket = 1;
				calculateBooking();
				break;
			case R.id.radio2:
				typeOfTicket = 2;
				calculateBooking();
				break;
			}
		
		}
		
	}

	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public String bookToggle()
	{
		
		if (booked == true)
		{
			booked = false;
			bookButton.setText("Book (£"+price+")");
			bookButton.setTextColor(Color.parseColor("#000000"));
			return "#D6D6D6";
		}
		else
		{
			booked =true;
			bookButton.setText("Booked (£"+price+")");
			bookButton.setTextColor(Color.parseColor("#ffffff"));
			return "#754595";
		}
		
		
		
	}
	
	public void calculateBooking(){
		int initialPrice = 12;
		int subTotal;

		switch(typeOfTicket){
			case 0:
			price = initialPrice;
			break;

			case 1:
			price = initialPrice;
			price += 5;
			break;

			case 2:
			price = initialPrice;
			price += 10;
			break;
		}

		subTotal = price;

		price = subTotal * noOfTickets;

		bookButton.setText("Book (£"+price+")");
	}

}
