package org.bts.atry.lession4;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = SecondActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button btnStartActivity = (Button) findViewById(R.id.btn_return_info_second_activity);

        btnStartActivity.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.btn_return_info_second_activity) {

            Log.e(SecondActivity.TAG,"Button second activity is being clicked");

            Intent returnIntent = new Intent();
            returnIntent.putExtra("myData","Hello World from second activity");

            setResult(Activity.RESULT_OK, returnIntent);

            finish();

        }

    }
}
