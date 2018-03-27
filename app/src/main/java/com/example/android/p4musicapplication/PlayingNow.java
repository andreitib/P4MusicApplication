package com.example.android.p4musicapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Toast;

public class PlayingNow extends AppCompatActivity {

    Button submitButton;
    SeekBar mySeekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_is_playing);

        // Using intent for launching main activity
        Button switchButton = (Button) findViewById(R.id.home_button);

        switchButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlayingNow.this, MainActivity.class);
                startActivity(intent);
            }

        });

        // Initiate views
        mySeekBar =(SeekBar)findViewById(R.id.mySeekBar);

        // Perform seek bar change listener event used for getting the progress value
        mySeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressValue = 0;

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressValue = progress;
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(PlayingNow.this, progressValue + "% of seek bar",
                        Toast.LENGTH_SHORT).show();
            }
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getApplicationContext(),"Seekbar is on!", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
