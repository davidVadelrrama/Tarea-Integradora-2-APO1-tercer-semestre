package model;

public abstract class Product {
    protected String name;
    protected String sinopsis;
    protected String director;
    protected String trailer;


    public Product(String name, String sinopsis, String director, String trailer) {
        this.name = name;
        this.sinopsis = sinopsis;
        this.director = director;
        this.trailer = trailer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }


    @Override
    public String toString() {
        return "Product" +
                "name='" + name + '\'' +
                ", sinopsis='" + sinopsis + '\'' +
                ", director='" + director + '\'' +
                ", trailer='" + trailer + '\''
                ;
    }
}
