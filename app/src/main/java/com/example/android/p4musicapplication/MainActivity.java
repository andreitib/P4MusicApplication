package com.example.android.p4musicapplication;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the andrew playlist category
        TextView andrew = (TextView) findViewById(R.id.andrew);

        // Set a onClick listener on that View
        andrew.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link AndrewActivity}
                Intent andrewIntent = new Intent(MainActivity.this, AndrewActivity.class);

                // Start the new activity
                startActivity(andrewIntent);
            }
        });

        // Find the View that shows the roxana playlist category
        TextView roxana = (TextView) findViewById(R.id.roxana);

        // Set a onClick listener on that View
        roxana.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link RoxanaActivity}
                Intent roxanaIntent = new Intent(MainActivity.this, RoxanaActivity.class);

                // Start the new activity
                startActivity(roxanaIntent);
            }
        });

        // Find the View that shows the razvan playlist category
        TextView razvan = (TextView) findViewById(R.id.razvan);

        // Set a onClick listener on that View
        razvan.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link RazvanActivity}
                Intent razvanIntent = new Intent(MainActivity.this,RazvanActivity.class);

                // Start the new activity
                startActivity(razvanIntent);
            }
        });

        // Find the View that shows the cristina playlist category
        TextView Cristina = (TextView) findViewById(R.id.cristina);

        // Set a  onClick listener on that View
        Cristina.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link CristinaActivity}
                Intent cristinaIntent = new Intent(MainActivity.this, CristinaActivity.class);

                // Start the new activity
                startActivity(cristinaIntent);
            }
        });
    }
}
