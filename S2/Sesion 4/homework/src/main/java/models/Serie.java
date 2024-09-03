package models;

public class Serie {
    private String title;
    private int totalSeasons ;
    private boolean isSumbitted;
    private String genre;
    private String director;

    //Private Constructor - Only the builder has access >:)
    private Serie(Builder builder) {
        this.title = builder.title;
        this.totalSeasons = builder.totalSeasons;
        this.isSumbitted = builder.isSumbitted;
        this.genre = builder.genre;
        this.director = builder.director;
    }


    public String getTitle() {
        return title;
    }
    public int getTotalSeasons() {
        return totalSeasons;
    }
    public boolean isSumbitted() {
        return isSumbitted;
    }
    public String getGenre() {
        return genre;
    }
    public String getDirector() {
        return director;
    }

    public static class Builder{
        //Default values for each field
        private String title = "";
        private int totalSeasons = 3;
        private boolean isSumbitted = false;
        private String genre = "";
        private String director = "";


        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }
        public Builder setTotalSeasons(int totalSeasons) {
            this.totalSeasons = totalSeasons;
            return this;
        }
        public Builder setSumbitted(boolean sumbitted) {
            isSumbitted = sumbitted;
            return this;
        }
        public Builder setGenre(String genre) {
            this.genre = genre;
            return this;
        }
        public Builder setDirector(String director) {
            this.director = director;
            return this;
        }

        public Serie build(){
            return new Serie(this);
        }
    }

    @Override
    public String toString() {

        String showStatus;

        if (this.isSumbitted == true){
            showStatus = "Sumbitted";
        } else {showStatus = "NonSumbitted";}

        return "Serie Info. | Title: " + title + " | Number Of Seasons: " + totalSeasons + " | Sumbitted?: " + showStatus +" | Genre: " + genre + " | Director: " + director;
    }
}
