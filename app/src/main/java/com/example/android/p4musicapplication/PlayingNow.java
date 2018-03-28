package com.example.android.p4musicapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;

public class PlayingNow extends AppCompatActivity {

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
    }

}
