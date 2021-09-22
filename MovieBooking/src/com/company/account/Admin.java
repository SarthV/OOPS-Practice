package com.company.account;

import com.company.CinemaHall;
import com.company.Movie;
import com.company.MovieComplex;

public class Admin {
    String name;
    public Admin(String name){
        this.name = name;
    }

    public Admin(){

    }

    public Movie createMovie(String name, String genre){
        return new Movie(name, genre);
    }

    public void addMovieToHall(MovieComplex complex, Movie movie, CinemaHall hall){
        complex.addMovieToHall(movie,hall);
    }

    public MovieComplex createMovieComplex(String name){
        MovieComplex complex = new MovieComplex(name);
        return complex;
    }

    public CinemaHall createCinemaHall(int id, int rows, int columns){
        CinemaHall hall = new CinemaHall(id,rows,columns);
        return hall;
    }

    public void addCinemaHall(CinemaHall hall, MovieComplex complex){
        complex.addCinemaHall(hall);
    }

    public Kiosk createKiosk(String kioskName){
        return new Kiosk(kioskName);
    }
}
