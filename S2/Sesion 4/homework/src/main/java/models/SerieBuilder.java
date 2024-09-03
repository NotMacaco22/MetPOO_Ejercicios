package models;


/*
*
* Crear una clase llamada Serie con las siguientes características:

Sus atributos son titulo, numero de temporadas, entregado, genero y creador.

Por defecto, el numero de temporadas es de 3 temporadas y entregado false. El resto de atributos serán valores por defecto según el tipo del atributo.

Los constructores que se implementaran serán:

Un constructor por defecto.
Un constructor con el titulo y creador. El resto por defecto.
Un constructor con todos los atributos, excepto de entregado.
Los métodos que se implementara serán:

Métodos get de todos los atributos, excepto de entregado.
Métodos set de todos los atributos, excepto de entregado.
Sobrescribe los métodos toString.
*
* */

public class SerieBuilder {
    private String title;
    private int totalSeasons ;
    private boolean isSumbitted;
    private String genre;
    private String director;

    public SerieBuilder() {
        this.title = null;
        this.totalSeasons = -1;
        this.isSumbitted = false;
        this.director = null;
        this.genre = null;
    }

    public SerieBuilder(String title, int totalSeasons, boolean isSumbitted, String genre, String director) {
        this.title = title;
        this.totalSeasons = totalSeasons;
        this.isSumbitted = isSumbitted;
        this.director = director;
        this.genre = genre;
    }

    public Serie build() {
        return new Serie(title, totalSeasons, isSumbitted, genre, director);
    }

    public SerieBuilder setTotalSeasons(int totalSeasons) {
        this.totalSeasons = totalSeasons;return this;
    }
    public SerieBuilder setTitle(String title) {
        this.title = title;return this;
    }
    public SerieBuilder setSumbitted(boolean sumbitted) {
        isSumbitted = sumbitted;
        return this;
    }
    public SerieBuilder setGenre(String genre) {
        this.genre = genre;
        return this;
    }

    public SerieBuilder setDirector(String director) {
        this.director = director;return this;
    }


}
