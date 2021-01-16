package home.netology.javabase.OOP.polymorphism.music;

public class Main {
    public static void main(String[] args) {
        Instrument guitar = new Guitar();
        Instrument piano = new Piano();
        Instrument drum = new Drum();
        Instrument instrument = new Instrument();

        Track track1 = new Track(piano, drum, piano, instrument);
        Track track2 = new Track(guitar, piano, drum, instrument);
        Track track3 = new Track(drum, guitar, instrument, drum);
        track1.createTrack();
        track2.createTrack();
        track3.createTrack();

        Song song1 = new Song();
        song1.addTrack(track1);
        song1.addTrack(track2);
        song1.addTrack(track3);
        song1.getTracks().get(0).getTimeline()[0].printNote();
        for (int i = 0; i < song1.getTracks().size(); i++){
            for (int j = 0; j < song1.getTracks().get(i).getTimeline().length; j++) {
                song1.getTracks().get(0).getTimeline()[j].printNote();
            }
            System.out.println();
        }
    }
}
