package session15.challenges.equals_hashcode;

import java.util.Objects;

public class Song {

    private String title;
    private String artist;
    private int legth;

    public Song(String title, String artist, int legth) {
        this.title = title;
        this.artist = artist;
        this.legth = legth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return Objects.equals(title, song.title) && Objects.equals(artist, song.artist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, artist);
    }

    public static void main(String[] args) {
        Song song1 = new Song("All eyez on me", "2Pac", 307);
        Song song2 = new Song("All eyez on me", "2Pac", 307);

        System.out.println("song1 equals song2: " + song1.equals(song2));

        System.out.println("Hashcode of song1: " + song1.hashCode());
        System.out.println("Hashcode of song1: " + song2.hashCode());
    }
}