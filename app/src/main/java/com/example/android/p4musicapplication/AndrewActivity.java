package com.example.android.p4musicapplication;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;

public class AndrewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of songs
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Soha", "Mil Pasos"));
        songs.add(new Song("Jennifer Lopez ft Pitbull", "On the floor"));
        songs.add(new Song("Calvin harris & Disciples", "How deep is your love"));
        songs.add(new Song("Smiley & Feli", "vals"));
        songs.add(new Song("Lora", "Ramas bun"));
        songs.add(new Song("Inna", "Me gusta"));
        songs.add(new Song("Cafe Anatolia", "Tango to Evora"));

        // Create an {@link SongAdapter}, whose data source is a list of {@link Songs). The
        // adapter knows how to create list items for each item in the list.
        SongAdapter adapter = new SongAdapter(this, songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        //Set a click listener on that View
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                // Create a new intent to open the {@link NowIsPlayingActivity} -> "Now playing" screen
                Intent playingNowIntent = new Intent(AndrewActivity.this, PlayingNow.class);

                // Start the new activity
                startActivity(playingNowIntent);
            }
        });
    }
}