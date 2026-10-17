package encapsulation.assignment_problems;

import java.util.Arrays;

public class Playlist {
    private final String[] songs;
    private int count;

    public Playlist(int maxSize) {
        songs = new String[maxSize];
        count = 0;
    }

    public boolean addSong(String title) {
        if (count >= songs.length) return false;
        songs[count++] = title;
        return true;
    }

    public String[] getSongs() {
        return Arrays.copyOf(songs, count);
    }

    public int getSongCount() {
        return count;
    }

    public static void main(String[] args) {
        Playlist p = new Playlist(10);
        p.addSong("Song A");
        p.addSong("Song B");
        String[] copy = p.getSongs();
        copy[0] = "Hacked";
        System.out.println(Arrays.toString(p.getSongs()));   // [Song A, Song B]
        System.out.println("count = " + p.getSongCount());   // 2
    }
}
