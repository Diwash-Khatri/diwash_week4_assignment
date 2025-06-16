class Song {
    private String title;
    private String artist;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public void play() {
        System.out.println("Playing song: " + title + " by " + artist);
    }
}

class PopSong extends Song {
    public PopSong(String title, String artist) {
        super(title, artist);
    }

    @Override
    public void play() {
        System.out.println("Playing a pop hit: " + getTitle() + " by " + getArtist());
    }
}

class RockSong extends Song {
    public RockSong(String title, String artist) {
        super(title, artist);
    }

    @Override
    public void play() {
        System.out.println("Rocking out to: " + getTitle() + " by " + getArtist());
    }
}

class JazzSong extends Song {
    public JazzSong(String title, String artist) {
        super(title, artist);
    }

    @Override
    public void play() {
        System.out.println("Grooving with jazz tune: " + getTitle() + " by " + getArtist());
    }
}

public class MusicApp {
    public static void main(String[] args) {
        Song[] playlist = {
            new PopSong("aaa", "bbb"),
            new RockSong("ccc", "ddd"),
            new JazzSong("eee", "fff")
        };

        for (Song song : playlist) {
            song.play();
        }
    }
}
