package model;

public class Movie extends Product{
    private int pegi;
    private String productor;
    private Date premiereDate;
    Genre movieGenre;
	


    public Movie(String name, String sinopsis, String director, String trailer, int pegi, String productor, Date premiereDate, Genre movieGenre) {
        super(name, sinopsis, director, trailer);
        this.pegi = pegi;
        this.productor = productor;
        this.premiereDate = premiereDate;
        this.movieGenre = movieGenre;
    }

    public Genre getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(Genre movieGenre) {
        this.movieGenre = movieGenre;
    }

    public Date getPremiereDate() {
        return premiereDate;
    }

    public void setPremiereDate(Date premiereDate) {
        this.premiereDate = premiereDate;
    }

    public int getPegi() {
        return pegi;
    }

    public void setPegi(int pegi) {
        this.pegi = pegi;
    }

    public String getProductor() {
        return productor;
    }

    public void setProductor(String productor) {
        this.productor = productor;
    }

    @Override
    public String toString() {
        return "Movie" +
                "name='" + name + '\'' +
                ", pegi=" + pegi +
                ", productor='" + productor + '\'' +
                ", premiereDate=" + premiereDate +
                ", movieGenre=" + movieGenre +
                ", sinopsis='" + sinopsis + '\'' +
                ", director='" + director + '\'' +
                ", trailer='" + trailer + '\''
                ;
    }
}
