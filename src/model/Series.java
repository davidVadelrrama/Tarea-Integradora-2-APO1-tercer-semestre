package model;
import model.Season;

import java.util.Arrays;

public class Series extends Product{

    private String censoreMotive;
    private String mainCharacters;
    public Season[] seasons;
    private Censored isCensored;

    //Constructor
    public Series(String name, String sinopsis, String director, String trailer,String mainCharacters, String censoreMotive, Censored isCensored)  {
        super(name, sinopsis, director, trailer);
        this.censoreMotive = censoreMotive;
        this.mainCharacters = mainCharacters;
		seasons = new Season[6];
		this.isCensored = isCensored;
    
	}
    //Getters & Setters

    public Censored getIsCensored() {
        return isCensored;
    }

    public void setIsCensored(Censored isCensored) {
        this.isCensored = isCensored;
    }

    public Season[] getSeasons() {
        return seasons;
    }

    public void setSeasons(Season[] seasons) {
        this.seasons = seasons;
    }

    public String getCensoreMotive() {
        return censoreMotive;
    }

    public void setCensoreMotive(String censoreMotive) {
        this.censoreMotive = censoreMotive;
    }

    public String getMainCharacters() {
        return mainCharacters;
    }

    public void setMainCharacters(String mainCharacters) {
        this.mainCharacters = mainCharacters;
    }

    @Override
    public String toString() {
        return "Series" +
                "name='" + name + '\'' +
                ", sinopsis='" + sinopsis + '\'' +
                ", director='" + director + '\'' +
                ", trailer='" + trailer + '\'' +
                ", censoreMotive='" + censoreMotive + '\'' +
                ", mainCharacters=" + mainCharacters +
                ", isCensored=" + isCensored
                ;
    }
}
