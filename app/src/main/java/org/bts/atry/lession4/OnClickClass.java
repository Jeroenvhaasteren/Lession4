package org.bts.atry.lession4;

import android.content.Intent;
import android.util.Log;
import android.view.View;

/**
 * Created by Jeroen on 30/01/2017.
 */

public class OnClickClass implements View.OnClickListener {

    @Override
    public void onClick(View whichView) {

        if (whichView.getId() == R.id.btn_start_activity) {

            Log.e("OnclclickClass", "Button1 Clicked");

        } else if(whichView.getId() == R.id.btn_main_activity_2) {
            Log.d("OnclclickClass", "Button2 Clicked");

        } else if (whichView.getId() == R.id.btn_main_activity_3 ) {
            Log.w("OnclclickClass", "Button3 Clicked");
        }
    }
}
