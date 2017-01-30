package org.bts.atry.lession4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Jeroen on 23/01/2017.
 */

public class MainActivity extends Activity implements View.OnClickListener {

    private static final String TAG = MainActivity.class.getSimpleName();

    private TextView mTvInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btnStartActivity = (Button) findViewById(R.id.btn_start_activity);
        final Button btnMainActivity2 = (Button) findViewById(R.id.btn_main_activity_2);
        final Button btnMainActivity3 = (Button) findViewById(R.id.btn_main_activity_3);
        btnStartActivity.setOnClickListener(this);
        btnMainActivity2.setOnClickListener(this);
        btnMainActivity3.setOnClickListener(this);

        this.mTvInfo = (TextView) findViewById(R.id.tv_info_main_activity);

    }

    @Override
    protected void onStart() {
        super.onStart();

        //Toast.makeText(this, "I'am Started", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onResume() {
        super.onResume();

        //Toast.makeText(this, "I'am Resumed", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onPause() {
        super.onPause();

        //Toast.makeText(this, "I'am Pauzed", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStop() {
        super.onStop();

        //Toast.makeText(this, "I'am Stoped", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        //Toast.makeText(this, "I'am Destroyed", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onRestart() {
        super.onRestart();

        //Toast.makeText(this, "I'am Restart", Toast.LENGTH_SHORT).show();

    }

    public void startSecondActivity(View v) {

        Intent activityIntent = new Intent(this, SecondActivity.class);
        //startActivity(activityIntent);

        startActivityForResult(activityIntent, 0);

    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_start_activity) {

            Log.e("OnclickClass", "Button1 Clicked");

        } else if(v.getId() == R.id.btn_main_activity_2) {
            Log.d("OnclickClass", "Button2 Clicked");
            startSecondActivity(v);


        } else if (v.getId() == R.id.btn_main_activity_3 ) {
            Log.w("OnclickClass", "Button3 Clicked");

        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        Log.w(MainActivity.TAG, "Get activity result ");

        if (requestCode == 0 && resultCode ==  Activity.RESULT_OK) {
            String returnData = data.getStringExtra("myData");
            Log.i(MainActivity.TAG, returnData);

            this.mTvInfo.setText(returnData);

        }

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("myTextViewValue", this.mTvInfo.getText().toString());

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        String line = savedInstanceState.getString("myTextViewValue");
        this.mTvInfo.setText(line);

    }
}
