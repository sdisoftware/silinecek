package com.example.sqlreporter;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ActWelcome extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ly_act_welcome);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.act_welcome, menu);
		return true;
	}

}
