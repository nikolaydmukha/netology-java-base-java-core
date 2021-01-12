package main.java.home.netology.javabase.OOP.polymorphism.music;

import java.util.ArrayList;

public class Song {
    private ArrayList<Track> song;

    public Song() {
        this.song = new ArrayList<>();
    }

    public void addTrack(Track track){
        song.add(track);
    }

    public ArrayList<Track> getTracks() {
        return song;
    }
}
