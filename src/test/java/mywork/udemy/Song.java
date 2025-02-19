package mywork.udemy;

public class Song {

    public String title;

    @Override
    public String toString() {
        return "title:" +
                "duration" + title;
    }

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public double duration;
}
