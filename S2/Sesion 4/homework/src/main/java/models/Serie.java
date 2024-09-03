package models;

public class Serie {
    private String title;
    private int totalSeasons ;
    private boolean isSumbitted;
    private String genre;
    private String director;

    public Serie(String title, int totalSeasons, boolean isSumbitted, String genre, String director) {
        this.title = title;
        this.totalSeasons = totalSeasons;
        this.isSumbitted = isSumbitted;
        this.genre = genre;
        this.director = director;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTotalSeasons() {
        return totalSeasons;
    }

    public void setTotalSeasons(int totalSeasons) {
        this.totalSeasons = totalSeasons;
    }

    public boolean isSumbitted() {
        return isSumbitted;
    }

    public void setSumbitted(boolean sumbitted) {
        isSumbitted = sumbitted;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
