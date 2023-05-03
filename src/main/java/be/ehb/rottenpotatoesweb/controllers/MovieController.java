package be.ehb.rottenpotatoesweb.controllers;

import be.ehb.rottenpotatoesweb.model.Movie;
import be.ehb.rottenpotatoesweb.model.MovieCRUD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class MovieController {

    private MovieCRUD movieCRUD;

    @Autowired
    public MovieController(MovieCRUD movieCRUD) {
        this.movieCRUD = movieCRUD;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    @ResponseBody
    public String sayHello(){
        return "Hello world!";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/movies")
    @ResponseBody
    public ArrayList<Movie> getAllMovies(){
        return movieCRUD.getMovieList();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/movies")
    @ResponseBody
    public String addMovie(@RequestParam(name = "name") String name,
                           @RequestParam(name = "year") int year){
        Movie newMovie = new Movie();
        newMovie.setName(name);
        newMovie.setReleaseYear(year);

        movieCRUD.addMovie(newMovie);

        return "gelukt";
    }
}
