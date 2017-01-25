package org.bts.atry.lession4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Jeroen on 23/01/2017.
 */

public class MainActivity extends Activity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnStartActivity = (Button) findViewById(R.id.btn_start_activity);
        Button btnMainActivity2 = (Button) findViewById(R.id.btn_main_activity_2);
        Button btnMainActivity3 = (Button) findViewById(R.id.btn_main_activity_3);

        btnStartActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(MainActivity.TAG,"Button Clicked");
                startSecondActivity(v);
            }
        });

        btnMainActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(MainActivity.TAG,"Button 2 Clicked");
            }
        });

        btnMainActivity3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(MainActivity.TAG,"Button 3 Clicked");
            }
        });

        Toast.makeText(this, "I'am Created", Toast.LENGTH_SHORT).show();
        Log.d(MainActivity.TAG, "onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Toast.makeText(this, "I'am Started", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onResume() {
        super.onResume();

        Toast.makeText(this, "I'am Resumed", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onPause() {
        super.onPause();

        Toast.makeText(this, "I'am Pauzed", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStop() {
        super.onStop();

        Toast.makeText(this, "I'am Stoped", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Toast.makeText(this, "I'am Destroyed", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Toast.makeText(this, "I'am Restart", Toast.LENGTH_SHORT).show();

    }

    public void startSecondActivity(View v) {

        Intent activityIntent = new Intent(this, SecondActivity.class);
        startActivity(activityIntent);

    }


}
