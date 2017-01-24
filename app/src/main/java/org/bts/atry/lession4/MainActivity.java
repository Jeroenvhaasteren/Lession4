package org.bts.atry.lession4;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Jeroen on 23/01/2017.
 */

public class MainActivity extends Activity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_main);

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
}
