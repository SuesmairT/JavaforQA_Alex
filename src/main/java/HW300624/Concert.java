package HW300624;

import java.util.ArrayList;
import java.util.List;

public class Concert<T extends Artist> {
    private List<T> artists = new ArrayList<>();

    public void addArtist(T artist) {
        artists.add(artist);
    }

    public void startShow() {
        for (T artist : artists) {
            artist.perform();
        }
    }

    public static void main(String[] args) {
        Concert<Artist> concert = new Concert<>();

        concert.addArtist(new Singer());
        concert.addArtist(new Dancer());
        concert.addArtist(new Comedian());

        concert.startShow();
    }
}
