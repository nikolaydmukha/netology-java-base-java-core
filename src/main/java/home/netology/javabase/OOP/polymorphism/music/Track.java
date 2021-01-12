package main.java.home.netology.javabase.OOP.polymorphism.music;

import java.util.Random;

public class Track {

    int SONG_LENGTH = 10;

    Instrument[] timeline;
    Instrument piano;
    Instrument guitar;
    Instrument drum;
    Instrument instrument;

    public Track(Instrument piano, Instrument guitar, Instrument drum, Instrument instrument) {
        this.piano = piano;
        this.guitar = guitar;
        this.drum = drum;
        this.instrument = instrument;
    }

    public void createTrack() {
        Instrument[] timeline = new Instrument[SONG_LENGTH];
        for (int i = 0; i < SONG_LENGTH; ++i) {
            Random rand = new Random();
            int upperbound = 15;
            int int_random = rand.nextInt(upperbound);

            if (int_random > 0 && int_random < 4) {
                timeline[i] = piano;
            } else if (int_random > 4 && int_random < 8) {
                timeline[i] = guitar;
            } else if (int_random > 8 && int_random < 12) {
                timeline[i] = drum;
            } else {
                timeline[i] = instrument;
            }
        }
        this.timeline = timeline;
    }

    public Instrument[] getTimeline() {
        return timeline;
    }
}
