package com.example.android.p4musicapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class RoxanaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of songs
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Carla's Dreams", "413"));
        songs.add(new Song("Carla's Dreams ft.Delia ", "Cum ne noi"));
        songs.add(new Song("Lidia Buble", "Camasa"));
        songs.add(new Song("Rita Ora", "Anywhere"));
        songs.add(new Song("Matthew Koma", "Kisses Back"));
        songs.add(new Song("Vanotek ft. Eneli ", "Back To Me"));
        songs.add(new Song("INNA", "Nirvana"));
        songs.add(new Song("Maître Gims ", "Mi Gna"));

        // Create an {@link SongAdapter}, whose data source is a list of {@link Song}s. The
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
                Intent playingNowIntent = new Intent(RoxanaActivity.this, PlayingNow.class);

                // Start the new activity
                startActivity(playingNowIntent);
            }
        });
    }
}
