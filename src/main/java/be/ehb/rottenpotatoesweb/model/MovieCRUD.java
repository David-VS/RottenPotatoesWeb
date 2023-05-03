package be.ehb.rottenpotatoesweb.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class MovieCRUD {
    private ArrayList<Movie> movieList;

    public MovieCRUD() {
        this.movieList = new ArrayList<>();
    }

    public ArrayList<Movie> getMovieList() {
        return movieList;
    }

    public void setMovieList(ArrayList<Movie> movieList) {
        this.movieList = movieList;
    }

    public void addMovie(Movie movie){
        this.movieList.add(movie);
    }
}
