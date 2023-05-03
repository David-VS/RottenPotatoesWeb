package be.ehb.rottenpotatoesweb.model;

import org.springframework.stereotype.Component;

//POJO -> Plain Old Java Object
@Component
public class Movie {
    private String name;
    private int releaseYear;

    public Movie() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
}
