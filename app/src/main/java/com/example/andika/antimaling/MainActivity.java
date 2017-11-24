package com.example.andika.antimaling;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    Recriver recriver = new Recriver();
    ToggleButton toggleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleButton = findViewById(R.id.togle_btn);
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(isChecked) {
                    Toast.makeText(MainActivity.this, "Alarm Mulai", Toast.LENGTH_SHORT).show();
                    IntentFilter filter = new IntentFilter();
                    filter.addAction(Intent.ACTION_POWER_DISCONNECTED);
                    registerReceiver(recriver, filter);
                } else {
                    unregisterReceiver(recriver);
                }
            }
        });

    }


}
