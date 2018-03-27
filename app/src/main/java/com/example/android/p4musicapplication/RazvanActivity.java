package com.example.android.p4musicapplication;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;

public class RazvanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of songs
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Randi", "Ochii aia verzi"));
        songs.add(new Song("Alina Irimia", "Vorbe pe dos"));
        songs.add(new Song("Anitta & J Balvin", "Downtown"));
        songs.add(new Song("Shakira", "Trap"));
        songs.add(new Song("Becky G, Bad Bunny", "Mayores"));
        songs.add(new Song("Mau y Ricky, Karol G", "Mi Mala"));
        songs.add(new Song("GEØRGE ft. JO", "Nimeni nu-i perfect"));
        songs.add(new Song("Feli", "Timpul"));

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
                Intent playingNowIntent = new Intent(RazvanActivity.this, PlayingNow.class);

                // Start the new activity
                startActivity(playingNowIntent);
            }
        });


    }
}
