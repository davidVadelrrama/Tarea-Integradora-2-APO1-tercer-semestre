package model;

public class Season {

    private int seasonNum;
    private int programmedEpisodes;
    private int releasedEpisodes;
    public Date releaseDate;

    public Season(int seasonNum, int programmedEpisodes, int releasedEpisodes, Date releaseDate) {
        this.seasonNum = seasonNum;
        this.programmedEpisodes = programmedEpisodes;
        this.releasedEpisodes = releasedEpisodes;
		this. releaseDate = releaseDate;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getSeasonNum() {
        return seasonNum;
    }

    public void setSeasonNum(int seasonNum) {
        this.seasonNum = seasonNum;
    }

    public int getProgrammedEpisodes() {
        return programmedEpisodes;
    }

    public void setProgrammedEpisodes(int programmedEpisodes) {
        this.programmedEpisodes = programmedEpisodes;
    }

    public int getReleasedEpisodes() {
        return releasedEpisodes;
    }

    public void setReleasedEpisodes(int releasedEpisodes) {
        this.releasedEpisodes = releasedEpisodes;
    }

    @Override
    public String toString() {
        return "Season" +
                "seasonNum=" + seasonNum +
                "\nprogrammedEpisodes=" + programmedEpisodes +
                "\nreleasedEpisodes=" + releasedEpisodes +
                "\nreleaseDate=" + releaseDate;
    }
}
