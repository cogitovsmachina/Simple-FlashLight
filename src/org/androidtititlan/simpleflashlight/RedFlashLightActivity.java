package org.androidtititlan.simpleflashlight;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RedFlashLightActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button toGreenActivity = (Button)findViewById(R.id.toGreenActivity);
        toGreenActivity.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(RedFlashLightActivity.this, GreenFlashLightActivity.class);
				startActivity(intent);
			}
		});
    }
}