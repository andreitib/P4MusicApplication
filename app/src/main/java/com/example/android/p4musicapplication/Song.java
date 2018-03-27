package com.example.android.p4musicapplication;

public class Song {
    /** Author of the song / Artist Name */
    private String mAuthor;

    /** Title of the song / Song Name */
    private String mTitle;

    /**
     * Create a new Song object.
     *
     * @param author is the author / player of the song
     * @param title is the title of the song
     */
    public Song(String author, String title) {
        mAuthor = author;
        mTitle = title;
    }

    /**
     * Get the author / player of the song
     */
    public String getAuthor() {
        return mAuthor;
    }

    /**
     * Get the title of the song.
     */
    public String getTitle() {
        return mTitle;
    }
}