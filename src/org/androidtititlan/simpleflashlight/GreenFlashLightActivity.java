package org.androidtititlan.simpleflashlight;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GreenFlashLightActivity extends Activity {
	/**
	 * @see android.app.Activity#onCreate(Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.green);
		 Button toRedActivity = (Button)findViewById(R.id.toRedActivity);
	     toRedActivity.setOnClickListener(new View.OnClickListener() {
		 public void onClick(View v) {
    		finish();
				}
			});
	}
}
