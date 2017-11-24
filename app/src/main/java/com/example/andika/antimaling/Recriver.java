package com.example.andika.antimaling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.widget.Toast;

import java.io.IOException;

/**
 * Created by andika on 24/11/17.
 */

public class Recriver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Alarm Bunyi", Toast.LENGTH_SHORT).show();
        MediaPlayer mediaPlayer = new MediaPlayer();
        AssetFileDescriptor afd = null;
        try {
            afd = context.getAssets().openFd("siren.mp3");
            mediaPlayer.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
            afd.close();
            mediaPlayer.prepare();
            mediaPlayer.start();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
