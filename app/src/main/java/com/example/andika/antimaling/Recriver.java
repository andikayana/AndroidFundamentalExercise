package com.example.andika.antimaling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by andika on 24/11/17.
 */

public class Recriver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Alarm Mulai", Toast.LENGTH_SHORT).show();

    }
}
